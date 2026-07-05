package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f98  reason: default package */
/* loaded from: classes3.dex */
public final class f98 extends WebSocketListener implements yy2 {
    public final bt1 C;
    public final iya D;
    public final WebSocket.Factory a;
    public final d82 b;
    public final bt1 c;
    public final bt1 d;
    public final xy0 e;
    public final xy0 f;

    public f98(OkHttpClient okHttpClient, OkHttpClient okHttpClient2, Request request, d82 d82Var, igd igdVar) {
        okHttpClient.getClass();
        okHttpClient2.getClass();
        request.getClass();
        d82Var.getClass();
        this.a = okHttpClient2;
        this.b = d82Var;
        this.c = jxe.c();
        this.d = jxe.c();
        agd agdVar = igdVar.c;
        va1 va1Var = agdVar.a;
        va1Var.getClass();
        if (va1Var.a == Integer.MAX_VALUE) {
            sa1 sa1Var = ta1.i;
            this.e = que.s(sa1Var, agdVar.a);
            this.f = que.s(sa1Var, agdVar.b);
            this.C = jxe.c();
            this.D = z87.v(this, null, null, new e98(this, request, null), 3);
            return;
        }
        vs.m("OkHttp does not support SUSPEND overflow strategy for incoming channel");
        throw null;
    }

    @Override // defpackage.egd
    public final ta1 C() {
        return this.e;
    }

    @Override // defpackage.yy2
    public final void I0(List list) {
        if (list.isEmpty()) {
            return;
        }
        vs.m("Extensions are not supported.");
    }

    @Override // defpackage.egd
    public final Object Q(fgd fgdVar) {
        return pvc.a;
    }

    @Override // defpackage.egd
    public final void V0(long j) {
        throw new bj1(9, "Max frame size switch is not supported in OkHttp engine.", null);
    }

    @Override // okhttp3.WebSocketListener
    public final void a(RealWebSocket realWebSocket, int i, String str) {
        Object valueOf;
        realWebSocket.getClass();
        str.getClass();
        short s = (short) i;
        this.C.P(new dk1(s, str));
        this.e.f(null);
        StringBuilder sb = new StringBuilder("WebSocket session closed with code ");
        ck1.b.getClass();
        ck1 ck1Var = (ck1) ck1.c.get(Short.valueOf(s));
        if (ck1Var == null || (valueOf = ck1Var.toString()) == null) {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        sb.append('.');
        CancellationException cancellationException = new CancellationException(sb.toString());
        this.f.p(cancellationException, false);
        this.D.t(cancellationException);
    }

    @Override // okhttp3.WebSocketListener
    public final void b(RealWebSocket realWebSocket, int i, String str) {
        short s = (short) i;
        this.C.P(new dk1(s, str));
        this.f.j(new ws4(new dk1(s, str)));
        this.e.f(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void c(RealWebSocket realWebSocket, Exception exc, Response response) {
        Integer num;
        realWebSocket.getClass();
        if (response != null) {
            num = Integer.valueOf(response.d);
        } else {
            num = null;
        }
        int i = ii5.E.a;
        xy0 xy0Var = this.f;
        xy0 xy0Var2 = this.e;
        bt1 bt1Var = this.d;
        if (num != null && num.intValue() == i) {
            bt1Var.P(response);
            xy0Var2.f(null);
            xy0Var.f(null);
            return;
        }
        bt1Var.o0(exc);
        this.C.o0(exc);
        xy0Var2.p(exc, false);
        xy0Var.p(exc, false);
    }

    @Override // okhttp3.WebSocketListener
    public final void d(RealWebSocket realWebSocket, e31 e31Var) {
        e31Var.getClass();
        this.e.j(new at4(et4.c, e31Var.s()));
    }

    @Override // okhttp3.WebSocketListener
    public final void e(RealWebSocket realWebSocket, String str) {
        byte[] bytes = str.getBytes(ed1.a);
        bytes.getClass();
        this.e.j(new at4(et4.b, bytes));
    }

    @Override // okhttp3.WebSocketListener
    public final void f(WebSocket webSocket, Response response) {
        this.d.P(response);
    }

    @Override // defpackage.egd
    public final long g1() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.egd
    public final u8a j0() {
        return this.f;
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.b;
    }
}
