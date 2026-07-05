package okhttp3.dnsoverhttps;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class DnsOverHttps implements Dns {
    public static final MediaType d;
    public final OkHttpClient b;
    public final HttpUrl c;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        public OkHttpClient a;
        public HttpUrl b;
        public Dns c;
        public ArrayList d;

        public final DnsOverHttps a() {
            Dns dns;
            OkHttpClient okHttpClient = this.a;
            if (okHttpClient != null) {
                OkHttpClient.Builder b = okHttpClient.b();
                MediaType mediaType = DnsOverHttps.d;
                ArrayList arrayList = this.d;
                if (arrayList != null) {
                    HttpUrl httpUrl = this.b;
                    httpUrl.getClass();
                    dns = new BootstrapDns(httpUrl.d, arrayList);
                } else {
                    dns = Dns.a;
                }
                if (!dns.equals(b.l)) {
                    b.B = null;
                }
                b.l = dns;
                OkHttpClient okHttpClient2 = new OkHttpClient(b);
                HttpUrl httpUrl2 = this.b;
                if (httpUrl2 != null) {
                    return new DnsOverHttps(okHttpClient2, httpUrl2);
                }
                vs.k("url not set");
                return null;
            }
            xk5.k("client not set");
            return null;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        gm9 gm9Var = MediaType.b;
        d = MediaType.Companion.a("application/dns-message");
    }

    public DnsOverHttps(OkHttpClient okHttpClient, HttpUrl httpUrl) {
        httpUrl.getClass();
        this.b = okHttpClient;
        this.c = httpUrl;
    }

    public static ArrayList c(String str, Response response) {
        Protocol protocol;
        if (response.F == null && (protocol = response.b) != Protocol.HTTP_2 && protocol != Protocol.QUIC) {
            Platform platform = Platform.a;
            Platform platform2 = Platform.a;
            platform2.j(5, "Incorrect protocol: " + response.b, null);
        }
        try {
            if (response.L) {
                ResponseBody responseBody = response.C;
                if (responseBody.o() <= 65536) {
                    ArrayList a = DnsRecordCodec.a(responseBody.v().t0(), str);
                    response.close();
                    return a;
                }
                throw new IOException("response size exceeds limit (65536 bytes): " + responseBody.o() + " bytes");
            }
            throw new IOException("response: " + response.d + ' ' + response.c);
        } finally {
        }
    }

    @Override // okhttp3.Dns
    public final List a(final String str) {
        boolean z;
        str.getClass();
        if (PublicSuffixDatabase.d.a(str) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jq6 t = tl1.t();
            Request b = b(1, str);
            OkHttpClient okHttpClient = this.b;
            t.add(new RealCall(okHttpClient, b, false));
            t.add(new RealCall(okHttpClient, b(28, str), false));
            jq6 r = tl1.r(t);
            final ArrayList arrayList = new ArrayList(2);
            final ArrayList arrayList2 = new ArrayList(5);
            final CountDownLatch countDownLatch = new CountDownLatch(r.a());
            Object it = r.iterator();
            while (true) {
                y65 y65Var = (y65) it;
                if (!y65Var.hasNext()) {
                    break;
                }
                ((Call) y65Var.next()).G(new Callback(arrayList, countDownLatch, this, str, arrayList2) { // from class: okhttp3.dnsoverhttps.DnsOverHttps$executeRequests$1
                    public final /* synthetic */ ArrayList a;
                    public final /* synthetic */ CountDownLatch b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ ArrayList d;

                    {
                        this.c = str;
                        this.d = arrayList2;
                    }

                    @Override // okhttp3.Callback
                    public final void d(Call call, Response response) {
                        String str2 = this.c;
                        ArrayList arrayList3 = this.d;
                        ArrayList arrayList4 = this.a;
                        try {
                            ArrayList c = DnsOverHttps.c(str2, response);
                            synchronized (arrayList3) {
                                arrayList3.addAll(c);
                            }
                        } catch (Exception e) {
                            synchronized (arrayList4) {
                                arrayList4.add(e);
                            }
                        }
                        this.b.countDown();
                    }

                    @Override // okhttp3.Callback
                    public final void e(Call call, IOException iOException) {
                        ArrayList arrayList3 = this.a;
                        synchronized (arrayList3) {
                            arrayList3.add(iOException);
                        }
                        this.b.countDown();
                    }
                });
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                arrayList.add(e);
            }
            if (arrayList2.isEmpty()) {
                if (!arrayList.isEmpty()) {
                    Exception exc = (Exception) arrayList.get(0);
                    if (!(exc instanceof UnknownHostException)) {
                        UnknownHostException unknownHostException = new UnknownHostException(str);
                        unknownHostException.initCause(exc);
                        int size = arrayList.size();
                        for (int i = 1; i < size; i++) {
                            pye.e(unknownHostException, (Throwable) arrayList.get(i));
                        }
                        throw unknownHostException;
                    }
                    throw exc;
                }
                throw new UnknownHostException(str);
            }
            return arrayList2;
        }
        throw new UnknownHostException("private hosts not resolved");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [my0, java.lang.Object] */
    public final Request b(int i, String str) {
        List list;
        Request.Builder builder = new Request.Builder();
        builder.a("Accept", d.a);
        int i2 = DnsRecordCodec.a;
        str.getClass();
        ?? obj = new Object();
        obj.o1(0);
        obj.o1(256);
        obj.o1(1);
        obj.o1(0);
        obj.o1(0);
        obj.o1(0);
        ?? obj2 = new Object();
        List y0 = k4b.y0(str, new char[]{'.'}, 0, 6);
        if (!y0.isEmpty()) {
            ListIterator listIterator = y0.listIterator(y0.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = sl1.v0(y0, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = ks3.a;
        Iterator it = list.iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                String str3 = (String) it.next();
                long p = xpe.p(str3);
                if (p == str3.length()) {
                    obj2.k1((int) p);
                    obj2.q1(str3);
                } else {
                    p1a.k("non-ascii hostname: ".concat(str));
                    return null;
                }
            } else {
                obj2.k1(0);
                obj2.C(obj, 0L, obj2.b);
                obj.o1(i);
                obj.o1(1);
                String N = r4b.N(obj.B(obj.b).b(), false, "=", "");
                HttpUrl.Builder f = this.c.f();
                if (f.g == null) {
                    f.g = new ArrayList();
                }
                ArrayList arrayList = f.g;
                arrayList.getClass();
                arrayList.add(_UrlKt.a("dns", 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
                ArrayList arrayList2 = f.g;
                arrayList2.getClass();
                if (N != null) {
                    str2 = _UrlKt.a(N, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91);
                }
                arrayList2.add(str2);
                builder.a = f.a();
                return new Request(builder);
            }
        }
    }
}
