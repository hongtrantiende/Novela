package okhttp3.internal.http;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.tls.CertificateChainCleaner;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    public final RealCall a;
    public final ArrayList b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public final Authenticator i;
    public final CertificatePinner j;
    public final ConnectionPool k;
    public final CookieJar l;
    public final Dns m;
    public final HostnameVerifier n;
    public final Authenticator o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final CertificateChainCleaner u;
    public int v;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner) {
        request.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = realCall;
        this.b = arrayList;
        this.c = i;
        this.d = exchange;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = authenticator;
        this.j = certificatePinner;
        this.k = connectionPool;
        this.l = cookieJar;
        this.m = dns;
        this.n = hostnameVerifier;
        this.o = authenticator2;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = certificateChainCleaner;
    }

    public static RealInterceptorChain a(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        int i3;
        Exchange exchange2;
        Request request2;
        if ((i2 & 1) != 0) {
            i3 = realInterceptorChain.c;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            exchange2 = realInterceptorChain.d;
        } else {
            exchange2 = exchange;
        }
        if ((i2 & 4) != 0) {
            request2 = realInterceptorChain.e;
        } else {
            request2 = request;
        }
        int i4 = realInterceptorChain.f;
        int i5 = realInterceptorChain.g;
        int i6 = realInterceptorChain.h;
        Authenticator authenticator = realInterceptorChain.i;
        CertificatePinner certificatePinner = realInterceptorChain.j;
        ConnectionPool connectionPool = realInterceptorChain.k;
        CookieJar cookieJar = realInterceptorChain.l;
        Dns dns = realInterceptorChain.m;
        HostnameVerifier hostnameVerifier = realInterceptorChain.n;
        Authenticator authenticator2 = realInterceptorChain.o;
        ProxySelector proxySelector = realInterceptorChain.p;
        boolean z = realInterceptorChain.q;
        SocketFactory socketFactory = realInterceptorChain.r;
        SSLSocketFactory sSLSocketFactory = realInterceptorChain.s;
        X509TrustManager x509TrustManager = realInterceptorChain.t;
        CertificateChainCleaner certificateChainCleaner = realInterceptorChain.u;
        request2.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new RealInterceptorChain(realInterceptorChain.a, realInterceptorChain.b, i3, exchange2, request2, i4, i5, i6, authenticator, certificatePinner, connectionPool, cookieJar, dns, hostnameVerifier, authenticator2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, certificateChainCleaner);
    }

    public final Response b(Request request) {
        request.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i < size) {
            this.v++;
            Exchange exchange = this.d;
            if (exchange != null) {
                if (exchange.b.b().c(request.a)) {
                    if (this.v != 1) {
                        vm1.e(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                        return null;
                    }
                } else {
                    vm1.e(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                    return null;
                }
            }
            int i2 = i + 1;
            RealInterceptorChain a = a(this, i2, null, request, 2097146);
            Interceptor interceptor = (Interceptor) arrayList.get(i);
            Response o = interceptor.o(a);
            if (o != null) {
                if (exchange != null && i2 < arrayList.size() && a.v != 1) {
                    vm1.e(interceptor, " must call proceed() exactly once", "network interceptor ");
                    return null;
                }
                return o;
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        vs.k("Check failed.");
        return null;
    }
}
