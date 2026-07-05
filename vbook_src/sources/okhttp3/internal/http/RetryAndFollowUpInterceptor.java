package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http2.ConnectionShutdownException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static Request a(Response response, Exchange exchange, RealInterceptorChain realInterceptorChain) {
        Route route;
        HttpUrl.Builder builder;
        HttpUrl httpUrl;
        RequestBody requestBody;
        Response response2;
        RequestBody requestBody2 = null;
        if (exchange != null) {
            route = exchange.c().c;
        } else {
            route = null;
        }
        int i = response.d;
        Request request = response.a;
        String str = request.b;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 421) {
                    if (i != 503) {
                        if (i != 407) {
                            if (i != 408) {
                                switch (i) {
                                }
                            } else if (realInterceptorChain.q && (((requestBody = request.d) == null || !requestBody.d()) && (((response2 = response.G) == null || response2.d != 408) && c(response, 0) <= 0))) {
                                return response.a;
                            }
                        } else {
                            route.getClass();
                            if (route.b.type() == Proxy.Type.HTTP) {
                                return realInterceptorChain.o.a(route, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response response3 = response.G;
                        if ((response3 == null || response3.d != 503) && c(response, Integer.MAX_VALUE) == 0) {
                            return response.a;
                        }
                    }
                } else {
                    RequestBody requestBody3 = request.d;
                    if ((requestBody3 == null || !requestBody3.d()) && exchange != null && !c16.i(exchange.b.b().b().h.d, exchange.c.i().h().a.h.d)) {
                        RealConnection c = exchange.c();
                        synchronized (c) {
                            c.G = true;
                        }
                        return response.a;
                    }
                }
                return null;
            }
            return realInterceptorChain.i.a(route, response);
        }
        if (realInterceptorChain.a.a.h) {
            String a = response.f.a("Location");
            if (a == null) {
                a = null;
            }
            Request request2 = response.a;
            if (a != null) {
                HttpUrl httpUrl2 = request2.a;
                httpUrl2.getClass();
                try {
                    builder = new HttpUrl.Builder();
                    builder.b(httpUrl2, a);
                } catch (IllegalArgumentException unused) {
                    builder = null;
                }
                if (builder != null) {
                    httpUrl = builder.a();
                } else {
                    httpUrl = null;
                }
                if (httpUrl != null && (c16.i(httpUrl.a, request2.a.a) || realInterceptorChain.a.a.i)) {
                    Request.Builder a2 = request2.a();
                    if (HttpMethod.a(str)) {
                        int i2 = response.d;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            z = true;
                        }
                        if (!str.equals("PROPFIND") && i2 != 308 && i2 != 307) {
                            a2.b("GET", null);
                        } else {
                            if (z) {
                                requestBody2 = request2.d;
                            }
                            a2.b(str, requestBody2);
                        }
                        if (!z) {
                            a2.c.b("Transfer-Encoding");
                            a2.c.b("Content-Length");
                            a2.c.b("Content-Type");
                        }
                    }
                    if (!_UtilJvmKt.a(request2.a, httpUrl)) {
                        a2.c.b("Authorization");
                    }
                    a2.a = httpUrl;
                    return new Request(a2);
                }
            }
        }
        return null;
    }

    public static boolean b(IOException iOException, RealCall realCall, RealInterceptorChain realInterceptorChain, Request request) {
        RealConnection realConnection;
        RequestBody requestBody;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (realInterceptorChain.q) {
            if ((z || (((requestBody = request.d) == null || !requestBody.d()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException)) {
                if (iOException instanceof InterruptedIOException) {
                    if (!(iOException instanceof SocketTimeoutException) || !z) {
                        return false;
                    }
                } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                    return false;
                }
                Exchange exchange = realCall.O;
                if (exchange != null && exchange.e) {
                    ExchangeFinder exchangeFinder = realCall.E;
                    exchangeFinder.getClass();
                    RoutePlanner b = exchangeFinder.b();
                    Exchange exchange2 = realCall.O;
                    if (exchange2 != null) {
                        realConnection = exchange2.c();
                    } else {
                        realConnection = null;
                    }
                    if (b.a(realConnection)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static int c(Response response, int i) {
        String a = response.f.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (compile.matcher(a).matches()) {
            Integer valueOf = Integer.valueOf(a);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
        if (r2 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
        if (r2.d == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
        if (r13.G != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
        r13.G = r15;
        r13.f.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
        r13.e.p(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
        r13.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01aa, code lost:
        throw new java.lang.IllegalStateException("Check failed.");
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response o(okhttp3.internal.http.RealInterceptorChain r34) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.o(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
