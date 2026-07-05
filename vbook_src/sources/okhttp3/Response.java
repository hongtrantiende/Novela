package okhttp3;

import java.io.Closeable;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Response implements Closeable {
    public final ResponseBody C;
    public final wra D;
    public final Response E;
    public final Response F;
    public final Response G;
    public final long H;
    public final long I;
    public final Exchange J;
    public final TrailersSource K;
    public final boolean L;
    public final Request a;
    public final Protocol b;
    public final String c;
    public final int d;
    public final Handshake e;
    public final Headers f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class Builder {
        public Request a;
        public Protocol b;
        public String d;
        public Handshake e;
        public wra h;
        public Response i;
        public Response j;
        public Response k;
        public long l;
        public long m;
        public Exchange n;
        public int c = -1;
        public ResponseBody g = ResponseBody.a;
        public TrailersSource o = TrailersSource.a;
        public Headers.Builder f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.E == null) {
                    if (response.F == null) {
                        if (response.G != null) {
                            p1a.k(str.concat(".priorResponse != null"));
                            return;
                        }
                        return;
                    }
                    p1a.k(str.concat(".cacheResponse != null"));
                    return;
                }
                p1a.k(str.concat(".networkResponse != null"));
            }
        }

        public final Response a() {
            int i = this.c;
            if (i >= 0) {
                Request request = this.a;
                if (request != null) {
                    Protocol protocol = this.b;
                    if (protocol != null) {
                        String str = this.d;
                        if (str != null) {
                            return new Response(request, protocol, str, i, this.e, this.f.a(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                        }
                        vs.k("message == null");
                        return null;
                    }
                    vs.k("protocol == null");
                    return null;
                }
                vs.k("request == null");
                return null;
            }
            p1a.h(this.c, "code < 0: ");
            return null;
        }
    }

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, wra wraVar, Response response, Response response2, Response response3, long j, long j2, Exchange exchange, TrailersSource trailersSource) {
        request.getClass();
        protocol.getClass();
        str.getClass();
        responseBody.getClass();
        trailersSource.getClass();
        this.a = request;
        this.b = protocol;
        this.c = str;
        this.d = i;
        this.e = handshake;
        this.f = headers;
        this.C = responseBody;
        this.D = wraVar;
        this.E = response;
        this.F = response2;
        this.G = response3;
        this.H = j;
        this.I = j2;
        this.J = exchange;
        this.K = trailersSource;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.L = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.C.close();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Response$Builder, java.lang.Object] */
    public final Builder o() {
        ?? obj = new Object();
        obj.c = -1;
        obj.g = ResponseBody.a;
        obj.o = TrailersSource.a;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.d;
        obj.d = this.c;
        obj.e = this.e;
        obj.f = this.f.c();
        obj.g = this.C;
        obj.h = this.D;
        obj.i = this.E;
        obj.j = this.F;
        obj.k = this.G;
        obj.l = this.H;
        obj.m = this.I;
        obj.n = this.J;
        obj.o = this.K;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
