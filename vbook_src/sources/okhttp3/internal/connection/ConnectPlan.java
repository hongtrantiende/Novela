package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    public final boolean C;
    public final RealCall D;
    public final RealRoutePlanner E;
    public final Route F;
    public final List G;
    public final int H;
    public final Request I;
    public final int J;
    public final boolean K;
    public volatile boolean L;
    public Socket M;
    public Socket N;
    public Handshake O;
    public Protocol P;
    public BufferedSocketKt$asBufferedSocket$1 Q;
    public RealConnection R;
    public final TaskRunner a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List list, int i5, Request request, int i6, boolean z2) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        this.a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.C = z;
        this.D = realCall;
        this.E = realRoutePlanner;
        this.F = route;
        this.G = list;
        this.H = i5;
        this.I = request;
        this.J = i6;
        this.K = z2;
    }

    public static ConnectPlan l(ConnectPlan connectPlan, int i, Request request, int i2, boolean z, int i3) {
        int i4;
        Request request2;
        int i5;
        boolean z2;
        if ((i3 & 1) != 0) {
            i4 = connectPlan.H;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            request2 = connectPlan.I;
        } else {
            request2 = request;
        }
        if ((i3 & 4) != 0) {
            i5 = connectPlan.J;
        } else {
            i5 = i2;
        }
        if ((i3 & 8) != 0) {
            z2 = connectPlan.K;
        } else {
            z2 = z;
        }
        return new ConnectPlan(connectPlan.a, connectPlan.b, connectPlan.c, connectPlan.d, connectPlan.e, connectPlan.f, connectPlan.C, connectPlan.D, connectPlan.E, connectPlan.F, connectPlan.G, i4, request2, i5, z2);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean a() {
        if (this.P != null) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan b() {
        return new ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        this.L = true;
        Socket socket = this.M;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection d() {
        RouteDatabase routeDatabase = this.D.a.A;
        Route route = this.F;
        synchronized (routeDatabase) {
            route.getClass();
            routeDatabase.a.remove(route);
        }
        RealConnection realConnection = this.R;
        realConnection.getClass();
        this.F.getClass();
        ReusePlan f = this.E.f(this, this.G);
        if (f != null) {
            return f.a;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.b;
            realConnectionPool.getClass();
            TimeZone timeZone = _UtilJvmKt.a;
            realConnectionPool.d.add(realConnection);
            realConnectionPool.b.d(realConnectionPool.c, 0L);
            this.D.b(realConnection);
        }
        this.D.e.j(this.D, realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult e() {
        Socket socket;
        Socket socket2;
        if (this.M == null) {
            this.D.P.add(this);
            boolean z = false;
            try {
                try {
                    EventListener eventListener = this.D.e;
                    RealCall realCall = this.D;
                    Route route = this.F;
                    eventListener.i(realCall, route.c, route.b);
                    this.b.getClass();
                    this.F.getClass();
                    i();
                    z = true;
                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                    this.D.P.remove(this);
                    return connectResult;
                } catch (IOException e) {
                    Route route2 = this.F;
                    Address address = route2.a;
                    if (route2.b.type() != Proxy.Type.DIRECT) {
                        Address address2 = this.F.a;
                        address2.g.connectFailed(address2.h.h(), this.F.b.address(), e);
                    }
                    EventListener eventListener2 = this.D.e;
                    RealCall realCall2 = this.D;
                    Route route3 = this.F;
                    eventListener2.h(realCall2, route3.c, route3.b, e);
                    this.b.getClass();
                    this.F.getClass();
                    RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e, 2);
                    this.D.P.remove(this);
                    if (!z && (socket2 = this.M) != null) {
                        _UtilJvmKt.c(socket2);
                    }
                    return connectResult2;
                }
            } catch (Throwable th) {
                this.D.P.remove(this);
                if (!z && (socket = this.M) != null) {
                    _UtilJvmKt.c(socket);
                }
                throw th;
            }
        }
        vs.k("TCP already connected");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult g() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.g():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.F;
    }

    public final void i() {
        int i;
        Socket createSocket;
        Proxy.Type type = this.F.b.type();
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.a[type.ordinal()];
        }
        if (i != 1 && i != 2) {
            createSocket = new Socket(this.F.b);
        } else {
            createSocket = this.F.a.b.createSocket();
            createSocket.getClass();
        }
        this.M = createSocket;
        if (!this.L) {
            createSocket.setSoTimeout(this.f);
            try {
                Platform platform = Platform.a;
                Platform.a.f(createSocket, this.F.c, this.e);
                try {
                    this.Q = new BufferedSocketKt$asBufferedSocket$1(new oaa(createSocket));
                    return;
                } catch (NullPointerException e) {
                    if (!c16.i(e.getMessage(), "throw with null exception")) {
                        return;
                    }
                    throw new IOException(e);
                }
            } catch (ConnectException e2) {
                ConnectException connectException = new ConnectException("Failed to connect to " + this.F.c);
                connectException.initCause(e2);
                throw connectException;
            }
        }
        fb4.k("canceled");
    }

    public final void j(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Protocol protocol;
        Address address = this.F.a;
        try {
            if (connectionSpec.b) {
                Platform platform = Platform.a;
                Platform.a.e(sSLSocket, address.h.d, address.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            Handshake a = Handshake.Companion.a(session);
            HostnameVerifier hostnameVerifier = address.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(address.h.d, session)) {
                List a2 = a.a();
                if (!a2.isEmpty()) {
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n            |Hostname ");
                    sb.append(address.h.d);
                    sb.append(" not verified:\n            |    certificate: ");
                    CertificatePinner certificatePinner = CertificatePinner.c;
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    e31 e31Var = e31.d;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb2.append(p40.p(encoded).d("SHA-256").a());
                    sb.append(sb2.toString());
                    sb.append("\n            |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n            |    subjectAltNames: ");
                    sb.append(sl1.n0(OkHostnameVerifier.a(x509Certificate, 7), OkHostnameVerifier.a(x509Certificate, 2)));
                    sb.append("\n            ");
                    throw new SSLPeerUnverifiedException(l4b.z(sb.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + address.h.d + " not verified (no certificates)");
            }
            CertificatePinner certificatePinner2 = address.e;
            certificatePinner2.getClass();
            this.O = new Handshake(a.a, a.b, a.c, new se0(7, certificatePinner2, a, address));
            address.h.d.getClass();
            Iterator it = certificatePinner2.a.iterator();
            String str = null;
            if (!it.hasNext()) {
                if (connectionSpec.b) {
                    Platform platform2 = Platform.a;
                    str = Platform.a.g(sSLSocket);
                }
                this.N = sSLSocket;
                this.Q = new BufferedSocketKt$asBufferedSocket$1(new oaa(sSLSocket));
                if (str != null) {
                    Protocol.b.getClass();
                    protocol = Protocol.Companion.a(str);
                } else {
                    protocol = Protocol.HTTP_1_1;
                }
                this.P = protocol;
                Platform platform3 = Platform.a;
                Platform.a.getClass();
                return;
            }
            ((CertificatePinner.Pin) it.next()).getClass();
            r4b.Q(null, "**.", false);
            throw null;
        } catch (Throwable th) {
            Platform platform4 = Platform.a;
            Platform.a.getClass();
            _UtilJvmKt.c(sSLSocket);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
        return new okhttp3.internal.connection.RoutePlanner.ConnectResult(r11, null, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r0 = r11.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
        okhttp3.internal._UtilJvmKt.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
        r1 = r11.H + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
        if (r1 >= 21) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
        r0 = r11.D.e;
        r3 = r11.D;
        r4 = r11.F;
        r0.g(r3, r4.c, r4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
        return new okhttp3.internal.connection.RoutePlanner.ConnectResult(r11, l(r11, r1, r2, 0, false, 12), null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
        r11 = new java.net.ProtocolException("Too many tunnel connections attempted: 21");
        r1 = r11.D.e;
        r2 = r11.D;
        r3 = r11.F;
        r1.h(r2, r3.c, r3.b, r11);
        r11.b.getClass();
        r11.F.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
        return new okhttp3.internal.connection.RoutePlanner.ConnectResult(r11, null, r11, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult k() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.k():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    public final ConnectPlan m(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        boolean z;
        list.getClass();
        int i = this.J;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(i2);
            connectionSpec.getClass();
            if (connectionSpec.a && (((strArr = connectionSpec.d) == null || _UtilCommonKt.f(strArr, sSLSocket.getEnabledProtocols(), zy7.b)) && ((strArr2 = connectionSpec.c) == null || _UtilCommonKt.f(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.c)))) {
                if (i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                return l(this, 0, null, i2, z, 3);
            }
        }
        return null;
    }

    public final ConnectPlan n(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.J != -1) {
            return this;
        }
        ConnectPlan m = m(list, sSLSocket);
        if (m != null) {
            return m;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.K);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall realCall, IOException iOException) {
    }
}
