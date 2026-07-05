package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http2.Http2Stream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final List g = _UtilJvmKt.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = _UtilJvmKt.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final RealConnection a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        http2Connection.getClass();
        this.a = realConnection;
        this.b = realInterceptorChain;
        this.c = http2Connection;
        List list = okHttpClient.r;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        http2Stream.E.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        boolean z;
        int i;
        Http2Stream http2Stream;
        request.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = false;
        if (request.d != null) {
            z = true;
        } else {
            z = false;
        }
        Headers headers = request.c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f, request.b));
        e31 e31Var = Header.g;
        HttpUrl httpUrl = request.a;
        arrayList.add(new Header(e31Var, RequestLine.a(httpUrl)));
        String a = headers.a("Host");
        if (a != null) {
            arrayList.add(new Header(Header.i, a));
        }
        arrayList.add(new Header(Header.h, httpUrl.a));
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b = headers.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && headers.d(i2).equals("trailers"))) {
                arrayList.add(new Header(lowerCase, headers.d(i2)));
            }
        }
        Http2Connection http2Connection = this.c;
        http2Connection.getClass();
        boolean z3 = !z;
        synchronized (http2Connection.S) {
            synchronized (http2Connection) {
                if (http2Connection.e > 1073741823) {
                    http2Connection.G(ErrorCode.REFUSED_STREAM);
                }
                if (!http2Connection.f) {
                    i = http2Connection.e;
                    http2Connection.e = i + 2;
                    http2Stream = new Http2Stream(i, http2Connection, z3, false, null);
                    z2 = (!z || http2Connection.P >= http2Connection.Q || http2Stream.d >= http2Stream.e) ? true : true;
                    if (http2Stream.j()) {
                        http2Connection.b.put(Integer.valueOf(i), http2Stream);
                    }
                } else {
                    throw new IOException();
                }
            }
            http2Connection.S.Q(z3, i, arrayList);
        }
        if (z2) {
            http2Connection.S.flush();
        }
        this.d = http2Stream;
        boolean z4 = this.f;
        Http2Stream http2Stream2 = this.d;
        if (!z4) {
            http2Stream2.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            http2Stream2.F.g(this.b.g, timeUnit);
            Http2Stream http2Stream3 = this.d;
            http2Stream3.getClass();
            http2Stream3.G.g(this.b.h, timeUnit);
            return;
        }
        http2Stream2.getClass();
        http2Stream2.g(ErrorCode.CANCEL);
        fb4.k("Canceled");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean c() {
        boolean z;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            synchronized (http2Stream) {
                Http2Stream.FramingSource framingSource = http2Stream.D;
                if (framingSource.b) {
                    if (framingSource.d.k()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f = true;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            http2Stream.g(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final osa d(Response response) {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r4 == false) goto L18;
     */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response.Builder e(boolean r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.e(boolean):okhttp3.Response$Builder");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() {
        this.c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final wra g() {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long h(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        return _UtilJvmKt.e(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier i() {
        return this.a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final yma j(Request request, long j) {
        request.getClass();
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.E;
    }
}
