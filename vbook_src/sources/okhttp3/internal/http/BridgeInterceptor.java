package okhttp3.internal.http;

import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class BridgeInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response o(RealInterceptorChain realInterceptorChain) {
        CookieJar cookieJar = realInterceptorChain.l;
        Request request = realInterceptorChain.e;
        Request.Builder a = request.a();
        HttpUrl httpUrl = request.a;
        Headers headers = request.c;
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            MediaType b = requestBody.b();
            if (b != null) {
                a.a("Content-Type", b.a);
            }
            long a2 = requestBody.a();
            if (a2 != -1) {
                a.a("Content-Length", String.valueOf(a2));
                a.c.b("Transfer-Encoding");
            } else {
                a.a("Transfer-Encoding", "chunked");
                a.c.b("Content-Length");
            }
        }
        boolean z = false;
        if (headers.a("Host") == null) {
            a.a("Host", _UtilJvmKt.h(httpUrl, false));
        }
        if (headers.a("Connection") == null) {
            a.a("Connection", "Keep-Alive");
        }
        if (headers.a("Accept-Encoding") == null && headers.a("Range") == null) {
            a.a("Accept-Encoding", "gzip");
            z = true;
        }
        cookieJar.b(httpUrl);
        if (headers.a("User-Agent") == null) {
            a.a("User-Agent", "okhttp/5.4.0");
        }
        Request request2 = new Request(a);
        Response b2 = realInterceptorChain.b(request2);
        Headers headers2 = b2.f;
        HttpHeaders.d(cookieJar, request2.a, headers2);
        Response.Builder o = b2.o();
        o.a = request2;
        if (z) {
            String a3 = headers2.a("Content-Encoding");
            String str = null;
            if (a3 == null) {
                a3 = null;
            }
            if ("gzip".equalsIgnoreCase(a3) && HttpHeaders.a(b2)) {
                v25 v25Var = new v25(b2.C.v());
                Headers.Builder c = headers2.c();
                c.b("Content-Encoding");
                c.b("Content-Length");
                o.f = c.a().c();
                String a4 = headers2.a("Content-Type");
                if (a4 != null) {
                    str = a4;
                }
                o.g = new RealResponseBody(str, -1L, new mj9(v25Var));
            }
        }
        return o.a();
    }
}
