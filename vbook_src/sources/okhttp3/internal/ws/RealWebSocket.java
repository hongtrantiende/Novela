package okhttp3.internal.ws;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.WebSocketReader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final List T = tl1.A(Protocol.HTTP_1_1);
    public final String C;
    public RealCall D;
    public Task E;
    public WebSocketReader F;
    public WebSocketWriter G;
    public final TaskQueue H;
    public String I;
    public BufferedSocketKt$asBufferedSocket$1 J;
    public final ArrayDeque K;
    public final ArrayDeque L;
    public long M;
    public boolean N;
    public int O;
    public String P;
    public boolean Q;
    public int R;
    public boolean S;
    public final WebSocketListener a;
    public final Random b;
    public final long c;
    public WebSocketExtensions d;
    public final long e;
    public final long f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Close {
        public final int a;
        public final e31 b;
        public final long c;

        public Close(int i, long j, e31 e31Var) {
            this.a = i;
            this.b = e31Var;
            this.c = j;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Message {
        public final int a;
        public final e31 b;

        public Message(int i, e31 e31Var) {
            this.a = i;
            this.b = e31Var;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(s21.q(new StringBuilder(), RealWebSocket.this.I, " writer"), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                if (realWebSocket.n()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                RealWebSocket.j(realWebSocket, e, null, 2);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        webSocketListener.getClass();
        this.a = webSocketListener;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.f = j3;
        this.H = taskRunner.d();
        this.K = new ArrayDeque();
        this.L = new ArrayDeque();
        this.O = -1;
        String str = request.b;
        if ("GET".equals(str)) {
            e31 e31Var = e31.d;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.C = p40.p(bArr).a();
            return;
        }
        p1a.k(s21.m("Request must be GET: ", str));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [zl9, java.lang.Object] */
    public static void j(RealWebSocket realWebSocket, Exception exc, Response response, int i) {
        boolean z;
        WebSocketWriter webSocketWriter;
        WebSocketWriter webSocketWriter2;
        if ((i & 2) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        realWebSocket.getClass();
        ?? obj = new Object();
        synchronized (realWebSocket) {
            try {
                if (realWebSocket.Q) {
                    return;
                }
                realWebSocket.Q = true;
                BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = realWebSocket.J;
                WebSocketWriter webSocketWriter3 = realWebSocket.G;
                obj.a = webSocketWriter3;
                realWebSocket.G = null;
                if (!z && webSocketWriter3 != null) {
                    TaskQueue.c(realWebSocket.H, realWebSocket.I + " writer close", 0L, new ak9(obj, 2), 2);
                }
                realWebSocket.H.f();
                try {
                    realWebSocket.a.c(realWebSocket, exc, response);
                    if (bufferedSocketKt$asBufferedSocket$1 != null) {
                        bufferedSocketKt$asBufferedSocket$1.cancel();
                    }
                    if (z && (webSocketWriter2 = (WebSocketWriter) obj.a) != null) {
                        _UtilCommonKt.b(webSocketWriter2);
                    }
                } catch (Throwable th) {
                    if (bufferedSocketKt$asBufferedSocket$1 != null) {
                        bufferedSocketKt$asBufferedSocket$1.cancel();
                    }
                    if (z && (webSocketWriter = (WebSocketWriter) obj.a) != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean a(e31 e31Var) {
        return m(2, e31Var);
    }

    @Override // okhttp3.WebSocket
    public final boolean b(String str) {
        e31 e31Var = e31.d;
        return m(1, p40.o(str));
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void c(e31 e31Var) {
        e31Var.getClass();
        this.a.d(this, e31Var);
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        RealCall realCall = this.D;
        realCall.getClass();
        realCall.d();
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void d(e31 e31Var) {
        try {
            e31Var.getClass();
            if (!this.Q && (!this.N || !this.L.isEmpty())) {
                this.K.add(e31Var);
                l();
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void e(String str) {
        this.a.e(this, str);
    }

    @Override // okhttp3.WebSocket
    public final boolean f(int i, String str) {
        e31 e31Var;
        long j = this.f;
        synchronized (this) {
            try {
                String a = WebSocketProtocol.a(i);
                if (a == null) {
                    if (str != null) {
                        e31 e31Var2 = e31.d;
                        e31Var = p40.o(str);
                        if (e31Var.a.length > 123) {
                            throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                        }
                    } else {
                        e31Var = null;
                    }
                    if (!this.Q && !this.N) {
                        this.N = true;
                        this.L.add(new Close(i, j, e31Var));
                        l();
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(a.toString());
            } finally {
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void g(e31 e31Var) {
        e31Var.getClass();
        this.S = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void h(int i, String str) {
        if (i != -1) {
            synchronized (this) {
                if (this.O == -1) {
                    this.O = i;
                    this.P = str;
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            this.a.b(this, i, str);
            return;
        }
        vs.m("Failed requirement.");
    }

    public final wra i(Response response) {
        Headers headers = response.f;
        int i = response.d;
        if (i == 101) {
            String a = headers.a("Connection");
            String str = null;
            if (a == null) {
                a = null;
            }
            if ("Upgrade".equalsIgnoreCase(a)) {
                String a2 = headers.a("Upgrade");
                if (a2 == null) {
                    a2 = null;
                }
                if ("websocket".equalsIgnoreCase(a2)) {
                    String a3 = headers.a("Sec-WebSocket-Accept");
                    if (a3 != null) {
                        str = a3;
                    }
                    e31 e31Var = e31.d;
                    String a4 = p40.o(this.C + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d("SHA-1").a();
                    if (c16.i(a4, str)) {
                        wra wraVar = response.D;
                        if (wraVar != null) {
                            return wraVar;
                        }
                        throw new ProtocolException("Web Socket socket missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a4 + "' but was '" + str + '\'');
                }
                throw new ProtocolException(eub.n('\'', "Expected 'Upgrade' header value 'websocket' but was '", a2));
            }
            throw new ProtocolException(eub.n('\'', "Expected 'Connection' header value 'Upgrade' but was '", a));
        }
        StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
        sb.append(i);
        sb.append(' ');
        throw new ProtocolException(s21.p(sb, response.c, '\''));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r12.O != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r12 = this;
            monitor-enter(r12)
            int r0 = r12.O     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r12.P     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.ws.WebSocketReader r2 = r12.F     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            r12.F = r3     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r12.N     // Catch: java.lang.Throwable -> L3e
            r5 = 1
            if (r4 == 0) goto L45
            java.util.ArrayDeque r4 = r12.L     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L45
            okhttp3.internal.ws.WebSocketWriter r4 = r12.G     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L40
            r12.G = r3     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.concurrent.TaskQueue r6 = r12.H     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r12.I     // Catch: java.lang.Throwable -> L3e
            r3.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = " writer close"
            r3.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            ak9 r10 = new ak9     // Catch: java.lang.Throwable -> L3e
            r10.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3e
            r11 = 2
            r8 = 0
            okhttp3.internal.concurrent.TaskQueue.c(r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r0 = move-exception
            goto L65
        L40:
            okhttp3.internal.concurrent.TaskQueue r3 = r12.H     // Catch: java.lang.Throwable -> L3e
            r3.f()     // Catch: java.lang.Throwable -> L3e
        L45:
            boolean r3 = r12.Q     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L53
            okhttp3.internal.ws.WebSocketWriter r3 = r12.G     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L53
            int r3 = r12.O     // Catch: java.lang.Throwable -> L3e
            r4 = -1
            if (r3 == r4) goto L53
            goto L54
        L53:
            r5 = 0
        L54:
            monitor-exit(r12)
            if (r5 == 0) goto L5f
            okhttp3.WebSocketListener r3 = r12.a
            r1.getClass()
            r3.a(r12, r0, r1)
        L5f:
            if (r2 == 0) goto L64
            okhttp3.internal._UtilCommonKt.b(r2)
        L64:
            return
        L65:
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.k():void");
    }

    public final void l() {
        TimeZone timeZone = _UtilJvmKt.a;
        Task task = this.E;
        if (task != null) {
            this.H.d(task, 0L);
        }
    }

    public final synchronized boolean m(int i, e31 e31Var) {
        if (!this.Q && !this.N) {
            long j = this.M;
            byte[] bArr = e31Var.a;
            if (bArr.length + j > 16777216) {
                f(1001, null);
                return false;
            }
            this.M = j + bArr.length;
            this.L.add(new Message(i, e31Var));
            l();
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [my0, java.lang.Object] */
    public final boolean n() {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        String a;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.Q) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.G;
                Object poll = this.K.poll();
                Object obj = null;
                if (poll == null) {
                    Object poll2 = this.L.poll();
                    if (poll2 instanceof Close) {
                        i = this.O;
                        str = this.P;
                        if (i != -1) {
                            webSocketWriter = this.G;
                            this.G = null;
                            if (webSocketWriter != null && this.F == null) {
                                z = true;
                            }
                            this.H.f();
                        } else {
                            long j = ((Close) poll2).c;
                            TaskQueue.c(this.H, this.I + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new ak9(this, 0), 4);
                            webSocketWriter = null;
                        }
                    } else if (poll2 == null) {
                        return false;
                    } else {
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    obj = poll2;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                try {
                    if (poll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.o(10, (e31) poll);
                    } else if (obj instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.q(((Message) obj).a, ((Message) obj).b);
                        synchronized (this) {
                            this.M -= ((Message) obj).b.a.length;
                        }
                    } else if (obj instanceof Close) {
                        webSocketWriter2.getClass();
                        int i2 = ((Close) obj).a;
                        e31 e31Var = ((Close) obj).b;
                        e31 e31Var2 = e31.d;
                        if (i2 != 0 || e31Var != null) {
                            if (i2 != 0 && (a = WebSocketProtocol.a(i2)) != null) {
                                throw new IllegalArgumentException(a.toString());
                            }
                            ?? obj2 = new Object();
                            obj2.o1(i2);
                            if (e31Var != null) {
                                obj2.g1(e31Var);
                            }
                            e31Var2 = obj2.B(obj2.b);
                        }
                        webSocketWriter2.o(8, e31Var2);
                        webSocketWriter2.D = true;
                        if (z) {
                            WebSocketListener webSocketListener = this.a;
                            str.getClass();
                            webSocketListener.a(this, i, str);
                        }
                    } else {
                        throw new AssertionError();
                    }
                    return true;
                } finally {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
