package defpackage;

import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tx9  reason: default package */
/* loaded from: classes.dex */
public final class tx9 implements sx9 {
    public static final yy9 e = new yy9(new mx8(15), new wr9(5));
    public final Map a;
    public final tv7 b;
    public xx9 c;
    public final cl7 d;

    public tx9(Map map) {
        this.a = map;
        long[] jArr = tz9.a;
        this.b = new tv7();
        this.d = new cl7(this, 29);
    }

    @Override // defpackage.sx9
    public final void b(Object obj, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(533563200);
        if ((i & 6) == 0) {
            if (rv4Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(this)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.h0(obj);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                cl7 cl7Var = this.d;
                if (((Boolean) cl7Var.invoke(obj)).booleanValue()) {
                    tza tzaVar = ay9.a;
                    by9 by9Var = new by9(new zx9((Map) this.a.get(obj), cl7Var));
                    rv4Var.o0(by9Var);
                    P = by9Var;
                } else {
                    hfd.h(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
            }
            by9 by9Var2 = (by9) P;
            pye.b(new i99[]{ay9.a.a(by9Var2), wu6.a.a(by9Var2)}, tu1Var, rv4Var, (i2 & Token.ASSIGN_MOD) | 8);
            boolean h = rv4Var.h(this) | rv4Var.h(obj) | rv4Var.h(by9Var2);
            Object P2 = rv4Var.P();
            if (h || P2 == lh9Var) {
                P2 = new nq3(29, this, obj, by9Var2);
                rv4Var.o0(P2);
            }
            yte.b(pvc.a, (xt4) P2, rv4Var);
            if (rv4Var.y && rv4Var.G.i == rv4Var.z) {
                rv4Var.z = -1;
                rv4Var.y = false;
            }
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(this, obj, tu1Var, i, 24);
        }
    }

    @Override // defpackage.sx9
    public final void f(Object obj) {
        if (this.b.l(obj) == null) {
            this.a.remove(obj);
        }
    }
}
