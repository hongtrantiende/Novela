package okhttp3.internal.connection;

import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor a = new Object();

    @Override // okhttp3.Interceptor
    public final Response o(RealInterceptorChain realInterceptorChain) {
        ExchangeCodec http1ExchangeCodec;
        RealCall realCall = realInterceptorChain.a;
        synchronized (realCall) {
            if (realCall.M) {
                if (realCall.J || realCall.I || realCall.L || realCall.K) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        ExchangeFinder exchangeFinder = realCall.E;
        exchangeFinder.getClass();
        RealConnection a2 = exchangeFinder.a();
        OkHttpClient okHttpClient = realCall.a;
        a2.getClass();
        int i = realInterceptorChain.g;
        BufferedSocket bufferedSocket = a2.D;
        Http2Connection http2Connection = a2.E;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(okHttpClient, a2, realInterceptorChain, http2Connection);
        } else {
            a2.e.setSoTimeout(i);
            dac timeout = bufferedSocket.c().timeout();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.g(j, timeUnit);
            bufferedSocket.b().timeout().g(realInterceptorChain.h, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, a2, bufferedSocket);
        }
        Exchange exchange = new Exchange(realCall, exchangeFinder, http1ExchangeCodec);
        realCall.H = exchange;
        realCall.O = exchange;
        synchronized (realCall) {
            realCall.I = true;
            realCall.J = true;
        }
        if (!realCall.N) {
            return RealInterceptorChain.a(realInterceptorChain, 0, exchange, null, 2097149).b(realInterceptorChain.e);
        }
        fb4.k("Canceled");
        return null;
    }
}
