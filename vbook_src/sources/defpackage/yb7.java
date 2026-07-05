package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yb7  reason: default package */
/* loaded from: classes.dex */
public final class yb7 extends ei0 implements Handler.Callback {
    public final p40 O;
    public final c04 P;
    public final Handler Q;
    public final vb7 R;
    public jsc S;
    public boolean T;
    public boolean U;
    public long V;
    public tb7 W;
    public long X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [cr2, vb7] */
    public yb7(c04 c04Var, Looper looper) {
        super(5);
        Handler handler;
        p40 p40Var = p40.D;
        this.P = c04Var;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.Q = handler;
        this.O = p40Var;
        this.R = new cr2(1);
        this.X = -9223372036854775807L;
    }

    @Override // defpackage.ei0
    public final int D(vq4 vq4Var) {
        int i;
        if (this.O.s(vq4Var)) {
            if (vq4Var.P == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return ei0.f(i, 0, 0, 0);
        }
        return ei0.f(0, 0, 0, 0);
    }

    public final void G(tb7 tb7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            rb7[] rb7VarArr = tb7Var.a;
            if (i < rb7VarArr.length) {
                vq4 a = rb7VarArr[i].a();
                if (a != null) {
                    p40 p40Var = this.O;
                    if (p40Var.s(a)) {
                        jsc k = p40Var.k(a);
                        byte[] c = rb7VarArr[i].c();
                        c.getClass();
                        vb7 vb7Var = this.R;
                        vb7Var.n();
                        vb7Var.p(c.length);
                        vb7Var.e.put(c);
                        vb7Var.q();
                        tb7 A = k.A(vb7Var);
                        if (A != null) {
                            G(A, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(rb7VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long H(long j) {
        boolean z;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        if (this.X != -9223372036854775807L) {
            z2 = true;
        }
        wq9.D(z2);
        return j - this.X;
    }

    public final void I(tb7 tb7Var) {
        c04 c04Var = this.P;
        i04 i04Var = c04Var.a;
        j57 j57Var = i04Var.p0;
        rr6 rr6Var = i04Var.m;
        i57 a = j57Var.a();
        int i = 0;
        while (true) {
            rb7[] rb7VarArr = tb7Var.a;
            if (i >= rb7VarArr.length) {
                break;
            }
            rb7VarArr[i].b(a);
            i++;
        }
        i04Var.p0 = new j57(a);
        j57 a2 = i04Var.a();
        if (!a2.equals(i04Var.S)) {
            i04Var.S = a2;
            rr6Var.c(14, new q6(c04Var, 17));
        }
        rr6Var.c(28, new q6(tb7Var, 18));
        rr6Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            I((tb7) message.obj);
            return true;
        }
        vm1.d();
        return false;
    }

    @Override // defpackage.ei0
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // defpackage.ei0
    public final boolean m() {
        return this.U;
    }

    @Override // defpackage.ei0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.ei0
    public final void p() {
        this.W = null;
        this.S = null;
        this.X = -9223372036854775807L;
    }

    @Override // defpackage.ei0
    public final void r(long j, boolean z, boolean z2) {
        this.W = null;
        this.T = false;
        this.U = false;
    }

    @Override // defpackage.ei0
    public final void w(vq4[] vq4VarArr, long j, long j2, e67 e67Var) {
        this.S = this.O.k(vq4VarArr[0]);
        tb7 tb7Var = this.W;
        if (tb7Var != null) {
            long j3 = tb7Var.b;
            long j4 = (this.X + j3) - j2;
            if (j3 != j4) {
                tb7Var = new tb7(j4, tb7Var.a);
            }
            this.W = tb7Var;
        }
        this.X = j2;
    }

    @Override // defpackage.ei0
    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.T && this.W == null) {
                vb7 vb7Var = this.R;
                vb7Var.n();
                s6f s6fVar = this.c;
                s6fVar.k();
                int y = y(s6fVar, vb7Var, 0);
                if (y == -4) {
                    if (vb7Var.h(4)) {
                        this.T = true;
                    } else if (vb7Var.C >= this.H) {
                        vb7Var.F = this.V;
                        vb7Var.q();
                        jsc jscVar = this.S;
                        String str = a2d.a;
                        tb7 A = jscVar.A(vb7Var);
                        if (A != null) {
                            ArrayList arrayList = new ArrayList(A.a.length);
                            G(A, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.W = new tb7(H(vb7Var.C), (rb7[]) arrayList.toArray(new rb7[0]));
                            }
                        }
                    }
                } else if (y == -5) {
                    vq4 vq4Var = (vq4) s6fVar.b;
                    vq4Var.getClass();
                    this.V = vq4Var.t;
                }
            }
            tb7 tb7Var = this.W;
            if (tb7Var != null && tb7Var.b <= H(j)) {
                tb7 tb7Var2 = this.W;
                Handler handler = this.Q;
                if (handler != null) {
                    handler.obtainMessage(1, tb7Var2).sendToTarget();
                } else {
                    I(tb7Var2);
                }
                this.W = null;
                z = true;
            } else {
                z = false;
            }
            if (this.T && this.W == null) {
                this.U = true;
            }
        }
    }
}
