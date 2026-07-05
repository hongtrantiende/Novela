package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Address;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {
    public final Protocol C;
    public final BufferedSocket D;
    public Http2Connection E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final ArrayList L;
    public long M;
    public final TaskRunner b;
    public final Route c;
    public final Socket d;
    public final Socket e;
    public final Handshake f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool realConnectionPool, Route route, Socket socket, Socket socket2, Handshake handshake, Protocol protocol, BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        bufferedSocketKt$asBufferedSocket$1.getClass();
        this.b = taskRunner;
        this.c = route;
        this.d = socket;
        this.e = socket2;
        this.f = handshake;
        this.C = protocol;
        this.D = bufferedSocketKt$asBufferedSocket$1;
        this.K = 1;
        this.L = new ArrayList();
        this.M = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, Route route, IOException iOException) {
        route.getClass();
        iOException.getClass();
        if (route.b.type() != Proxy.Type.DIRECT) {
            Address address = route.a;
            address.g.connectFailed(address.h.h(), route.b.address(), iOException);
        }
        RouteDatabase routeDatabase = okHttpClient.A;
        synchronized (routeDatabase) {
            routeDatabase.a.add(route);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void a(Http2Connection http2Connection, Settings settings) {
        int i;
        settings.getClass();
        synchronized (this) {
            if ((settings.a & 8) != 0) {
                i = settings.b[3];
            } else {
                i = Integer.MAX_VALUE;
            }
            this.K = i;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.e(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall realCall, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                if (iOException instanceof StreamResetException) {
                    if (((StreamResetException) iOException).a == ErrorCode.REFUSED_STREAM) {
                        int i = this.J + 1;
                        this.J = i;
                        if (i > 1) {
                            this.F = true;
                            this.H++;
                        }
                    } else if (((StreamResetException) iOException).a != ErrorCode.CANCEL || !realCall.N) {
                        this.F = true;
                        this.H++;
                    }
                } else {
                    if (this.E != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || (iOException instanceof ConnectionShutdownException)) {
                        this.F = true;
                        if (this.I == 0) {
                            if (iOException != null) {
                                d(realCall.a, this.c, iOException);
                            }
                            this.H++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.c(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (okhttp3.internal.tls.OkHostnameVerifier.b(r5, (java.security.cert.X509Certificate) r8) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(okhttp3.Address r9, java.util.List r10) {
        /*
            r8 = this;
            okhttp3.HttpUrl r0 = r9.h
            java.util.TimeZone r1 = okhttp3.internal._UtilJvmKt.a
            java.util.ArrayList r1 = r8.L
            int r1 = r1.size()
            int r2 = r8.K
            r3 = 0
            if (r1 >= r2) goto Ldd
            boolean r1 = r8.F
            if (r1 == 0) goto L15
            goto Ldd
        L15:
            okhttp3.Route r1 = r8.c
            okhttp3.Address r2 = r1.a
            okhttp3.Address r4 = r1.a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L23
            goto Ldd
        L23:
            java.lang.String r2 = r0.d
            java.lang.String r5 = r0.d
            okhttp3.HttpUrl r6 = r4.h
            java.lang.String r6 = r6.d
            boolean r2 = defpackage.c16.i(r2, r6)
            if (r2 == 0) goto L33
            goto Lcb
        L33:
            okhttp3.internal.http2.Http2Connection r2 = r8.E
            if (r2 != 0) goto L39
            goto Ldd
        L39:
            if (r10 == 0) goto Ldd
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L43
            goto Ldd
        L43:
            java.util.Iterator r10 = r10.iterator()
        L47:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r10.next()
            okhttp3.Route r2 = (okhttp3.Route) r2
            java.net.Proxy r6 = r2.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L47
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L47
            java.net.InetSocketAddress r6 = r1.c
            java.net.InetSocketAddress r2 = r2.c
            boolean r2 = defpackage.c16.i(r6, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r10 = r9.d
            okhttp3.internal.tls.OkHostnameVerifier r1 = okhttp3.internal.tls.OkHostnameVerifier.a
            if (r10 == r1) goto L76
            goto Ldd
        L76:
            java.util.TimeZone r10 = okhttp3.internal._UtilJvmKt.a
            okhttp3.HttpUrl r10 = r4.h
            int r0 = r0.e
            int r1 = r10.e
            if (r0 == r1) goto L81
            goto Ldd
        L81:
            java.lang.String r10 = r10.d
            boolean r10 = defpackage.c16.i(r5, r10)
            okhttp3.Handshake r0 = r8.f
            if (r10 == 0) goto L8c
            goto Lab
        L8c:
            boolean r8 = r8.G
            if (r8 != 0) goto Ldd
            if (r0 == 0) goto Ldd
            java.util.List r8 = r0.a()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Ldd
            java.lang.Object r8 = r8.get(r3)
            r8.getClass()
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = okhttp3.internal.tls.OkHostnameVerifier.b(r5, r8)
            if (r8 == 0) goto Ldd
        Lab:
            okhttp3.CertificatePinner r8 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            java.util.List r9 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            java.util.Set r8 = r8.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            if (r9 != 0) goto Lcd
        Lcb:
            r8 = 1
            return r8
        Lcd:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            okhttp3.CertificatePinner$Pin r8 = (okhttp3.CertificatePinner.Pin) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            java.lang.String r8 = "**."
            r9 = 0
            defpackage.r4b.Q(r9, r8, r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
            throw r9     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldd
        Ldd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.e(okhttp3.Address, java.util.List):boolean");
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f() {
        synchronized (this) {
            this.F = true;
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = _UtilJvmKt.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.E;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f) {
                    return false;
                }
                if (http2Connection.J < http2Connection.I) {
                    if (nanoTime >= http2Connection.K) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.M;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        bz0 c = this.D.c();
        socket.getClass();
        c.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z2 = !c.k();
            socket.setSoTimeout(soTimeout);
            return z2;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.c;
    }

    public final void i() {
        FlowControlListener flowControlListener;
        int i;
        int a;
        this.M = System.nanoTime();
        Protocol protocol = this.C;
        if (protocol != Protocol.HTTP_2 && protocol != Protocol.H2_PRIOR_KNOWLEDGE) {
            return;
        }
        this.e.setSoTimeout(0);
        ConnectionListener$Companion$NONE$1 connectionListener$Companion$NONE$1 = ConnectionListener.a;
        if (connectionListener$Companion$NONE$1 instanceof FlowControlListener) {
            flowControlListener = (FlowControlListener) connectionListener$Companion$NONE$1;
        } else {
            flowControlListener = null;
        }
        if (flowControlListener == null) {
            flowControlListener = FlowControlListener.None.a;
        }
        Http2Connection.Builder builder = new Http2Connection.Builder(this.b);
        BufferedSocket bufferedSocket = this.D;
        String str = this.c.a.h.d;
        bufferedSocket.getClass();
        str.getClass();
        builder.b = bufferedSocket;
        builder.c = _UtilJvmKt.b + ' ' + str;
        builder.d = this;
        builder.f = flowControlListener;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.E = http2Connection;
        Settings settings = Http2Connection.V;
        if ((settings.a & 8) != 0) {
            i = settings.b[3];
        } else {
            i = Integer.MAX_VALUE;
        }
        this.K = i;
        Http2Writer http2Writer = http2Connection.S;
        synchronized (http2Writer) {
            try {
                if (!http2Writer.d) {
                    Logger logger = Http2Writer.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.d(">> CONNECTION " + Http2.a.f(), new Object[0]));
                    }
                    http2Writer.a.S0(Http2.a);
                    http2Writer.a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Writer http2Writer2 = http2Connection.S;
        Settings settings2 = http2Connection.M;
        http2Writer2.getClass();
        settings2.getClass();
        synchronized (http2Writer2) {
            try {
                if (!http2Writer2.d) {
                    http2Writer2.C(0, Integer.bitCount(settings2.a) * 6, 4, 0);
                    for (int i2 = 0; i2 < 10; i2++) {
                        boolean z = true;
                        if (((1 << i2) & settings2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            http2Writer2.a.writeShort(i2);
                            http2Writer2.a.writeInt(settings2.b[i2]);
                        }
                    }
                    http2Writer2.a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (http2Connection.M.a() != 65535) {
            http2Connection.S.g0(0, a - 65535);
        }
        TaskQueue.c(http2Connection.C.d(), http2Connection.c, 0L, http2Connection.T, 6);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.c;
        sb.append(route.a.h.d);
        sb.append(':');
        sb.append(route.a.h.e);
        sb.append(", proxy=");
        sb.append(route.b);
        sb.append(" hostAddress=");
        sb.append(route.c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f;
        if (handshake != null) {
            obj = handshake.b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.C);
        sb.append('}');
        return sb.toString();
    }
}
