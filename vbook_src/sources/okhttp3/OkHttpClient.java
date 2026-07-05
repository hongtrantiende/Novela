package okhttp3;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    public static final List D = _UtilJvmKt.j(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List E = _UtilJvmKt.j(new ConnectionSpec[]{ConnectionSpec.g, ConnectionSpec.h});
    public final RouteDatabase A;
    public final TaskRunner B;
    public final ConnectionPool C;
    public final Dispatcher a;
    public final List b;
    public final List c;
    public final hfd d;
    public final boolean e;
    public final boolean f;
    public final Authenticator g;
    public final boolean h;
    public final boolean i;
    public final CookieJar j;
    public final Dns k;
    public final ProxySelector l;
    public final Authenticator m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final OkHostnameVerifier s;
    public final CertificatePinner t;
    public final CertificateChainCleaner u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        public long A;
        public RouteDatabase B;
        public TaskRunner C;
        public ConnectionPool b;
        public hfd e;
        public boolean f;
        public boolean g;
        public Authenticator h;
        public boolean i;
        public boolean j;
        public CookieJar k;
        public Dns l;
        public ProxySelector m;
        public Authenticator n;
        public SocketFactory o;
        public SSLSocketFactory p;
        public X509TrustManager q;
        public List r;
        public List s;
        public OkHostnameVerifier t;
        public CertificatePinner u;
        public CertificateChainCleaner v;
        public int w;
        public int x;
        public int y;
        public int z;
        public Dispatcher a = new Dispatcher();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        /* JADX WARN: Type inference failed for: r0v4, types: [hfd, java.lang.Object] */
        public Builder() {
            TimeZone timeZone = _UtilJvmKt.a;
            this.e = new Object();
            this.f = true;
            this.g = true;
            Authenticator authenticator = Authenticator.a;
            this.h = authenticator;
            this.i = true;
            this.j = true;
            this.k = CookieJar.a;
            this.l = Dns.a;
            this.n = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.o = socketFactory;
            this.r = OkHttpClient.E;
            this.s = OkHttpClient.D;
            this.t = OkHostnameVerifier.a;
            this.u = CertificatePinner.c;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.z = 60000;
            this.A = 1024L;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OkHttpClient(okhttp3.OkHttpClient.Builder r7) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [hfd, java.lang.Object] */
    @Override // okhttp3.WebSocket.Factory
    public final RealWebSocket a(Request request, WebSocketListener webSocketListener) {
        request.getClass();
        webSocketListener.getClass();
        final RealWebSocket realWebSocket = new RealWebSocket(this.B, request, webSocketListener, new Random(), 0L, this.z, this.y);
        if (request.c.a("Sec-WebSocket-Extensions") != null) {
            RealWebSocket.j(realWebSocket, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return realWebSocket;
        }
        Builder b = b();
        TimeZone timeZone = _UtilJvmKt.a;
        b.e = new Object();
        List list = RealWebSocket.T;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
            cy7.h(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return null;
        } else if (arrayList.contains(protocol) && arrayList.size() > 1) {
            cy7.h(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return null;
        } else if (!arrayList.contains(Protocol.HTTP_1_0)) {
            if (!arrayList.contains(null)) {
                arrayList.remove(Protocol.SPDY_3);
                if (!arrayList.equals(b.s)) {
                    b.B = null;
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                unmodifiableList.getClass();
                b.s = unmodifiableList;
                OkHttpClient okHttpClient = new OkHttpClient(b);
                Request.Builder a = request.a();
                a.a("Upgrade", "websocket");
                a.a("Connection", "Upgrade");
                a.a("Sec-WebSocket-Key", realWebSocket.C);
                a.a("Sec-WebSocket-Version", "13");
                a.a("Sec-WebSocket-Extensions", "permessage-deflate");
                final Request request2 = new Request(a);
                RealCall realCall = new RealCall(okHttpClient, request2, true);
                realWebSocket.D = realCall;
                realCall.G(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
                        if (r11 == null) goto L35;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
                        r9 = r5;
                        r16 = r10;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
                        if (r13 == null) goto L35;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // okhttp3.Callback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void d(okhttp3.Call r21, okhttp3.Response r22) {
                        /*
                            Method dump skipped, instructions count: 586
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket$connect$1.d(okhttp3.Call, okhttp3.Response):void");
                    }

                    @Override // okhttp3.Callback
                    public final void e(Call call, IOException iOException) {
                        RealWebSocket.j(RealWebSocket.this, iOException, null, 6);
                    }
                });
                return realWebSocket;
            }
            vs.m("protocols must not contain null");
            return null;
        } else {
            cy7.h(arrayList, "protocols must not contain http/1.0: ");
            return null;
        }
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.a = this.a;
        builder.b = this.C;
        xl1.P(builder.c, this.b);
        xl1.P(builder.d, this.c);
        builder.e = this.d;
        builder.f = this.e;
        builder.g = this.f;
        builder.h = this.g;
        builder.i = this.h;
        builder.j = this.i;
        builder.k = this.j;
        builder.l = this.k;
        builder.m = this.l;
        builder.n = this.m;
        builder.o = this.n;
        builder.p = this.o;
        builder.q = this.p;
        builder.r = this.q;
        builder.s = this.r;
        builder.t = this.s;
        builder.u = this.t;
        builder.v = this.u;
        builder.w = this.v;
        builder.x = this.w;
        builder.y = this.x;
        builder.z = this.y;
        builder.A = this.z;
        builder.B = this.A;
        builder.C = this.B;
        return builder;
    }
}
