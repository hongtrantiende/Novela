package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealRoutePlanner implements RoutePlanner {
    public final TaskRunner a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Address i;
    public final RouteDatabase j;
    public final RealCall k;
    public final boolean l;
    public RouteSelector.Selection m;
    public RouteSelector n;
    public Route o;
    public final rz p;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, RealCall realCall, Request request) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        routeDatabase.getClass();
        this.a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = address;
        this.j = routeDatabase;
        this.k = realCall;
        this.l = !c16.i(request.b, "GET");
        this.p = new rz();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (this.p.isEmpty() && this.o == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    route = null;
                    if (realConnection.H == 0 && realConnection.F && _UtilJvmKt.a(realConnection.c.a.h, this.i.h)) {
                        route = realConnection.c;
                    }
                }
                if (route != null) {
                    this.o = route;
                    return true;
                }
            }
            RouteSelector.Selection selection = this.m;
            if ((selection == null || selection.b >= selection.a.size()) && (routeSelector = this.n) != null) {
                return routeSelector.a();
            }
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final Address b() {
        return this.i;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean c(HttpUrl httpUrl) {
        httpUrl.getClass();
        HttpUrl httpUrl2 = this.i.h;
        if (httpUrl.e == httpUrl2.e && c16.i(httpUrl.d, httpUrl2.d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RoutePlanner.Plan d() {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealRoutePlanner.d():okhttp3.internal.connection.RoutePlanner$Plan");
    }

    public final ConnectPlan e(Route route, ArrayList arrayList) {
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        route.getClass();
        Address address = route.a;
        if (address.c == null) {
            if (address.j.contains(ConnectionSpec.h)) {
                String str = route.a.h.d;
                Platform platform = Platform.a;
                if (!Platform.a.i(str)) {
                    throw new UnknownServiceException(hl5.n("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (address.i.contains(protocol)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.b.type() == Proxy.Type.HTTP) {
            Address address2 = route.a;
            if (address2.c != null || address2.i.contains(protocol)) {
                Request.Builder builder = new Request.Builder();
                HttpUrl httpUrl = route.a.h;
                httpUrl.getClass();
                builder.a = httpUrl;
                builder.b("CONNECT", null);
                Address address3 = route.a;
                builder.a("Host", _UtilJvmKt.h(address3.h, true));
                builder.a("Proxy-Connection", "Keep-Alive");
                builder.a("User-Agent", "okhttp/5.4.0");
                Request request2 = new Request(builder);
                Response.Builder builder2 = new Response.Builder();
                builder2.a = request2;
                builder2.b = Protocol.HTTP_1_1;
                builder2.c = 407;
                builder2.d = "Preemptive Authenticate";
                builder2.l = -1L;
                builder2.m = -1L;
                Headers.Builder builder3 = builder2.f;
                builder3.getClass();
                _HeadersCommonKt.b("Proxy-Authenticate");
                _HeadersCommonKt.c("OkHttp-Preemptive", "Proxy-Authenticate");
                builder3.b("Proxy-Authenticate");
                _HeadersCommonKt.a(builder3, "Proxy-Authenticate", "OkHttp-Preemptive");
                Request a = address3.f.a(route, builder2.a());
                request = a == null ? request2 : a;
            }
        }
        return new ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, route, arrayList, 0, request, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r9 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.ReusePlan f(okhttp3.internal.connection.ConnectPlan r11, java.util.List r12) {
        /*
            r10 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r10.b
            boolean r1 = r10.l
            okhttp3.Address r2 = r10.i
            okhttp3.internal.connection.RealCall r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.a()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            okhttp3.internal.connection.RealConnection r7 = (okhttp3.internal.connection.RealConnection) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            okhttp3.internal.http2.Http2Connection r9 = r7.E     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r10 = move-exception
            goto L67
        L41:
            boolean r9 = r7.e(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.b(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.F = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.i()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            okhttp3.internal._UtilJvmKt.c(r8)
            goto L21
        L64:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L67:
            monitor-exit(r7)
            throw r10
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            okhttp3.Route r12 = r11.F
            r10.o = r12
            java.net.Socket r11 = r11.N
            if (r11 == 0) goto L7a
            okhttp3.internal._UtilJvmKt.c(r11)
        L7a:
            okhttp3.internal.connection.RealCall r11 = r10.k
            okhttp3.EventListener r11 = r11.e
            okhttp3.internal.connection.RealCall r10 = r10.k
            r11.j(r10, r7)
            okhttp3.internal.connection.ReusePlan r10 = new okhttp3.internal.connection.ReusePlan
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealRoutePlanner.f(okhttp3.internal.connection.ConnectPlan, java.util.List):okhttp3.internal.connection.ReusePlan");
    }
}
