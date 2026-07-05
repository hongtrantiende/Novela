package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ev0  reason: default package */
/* loaded from: classes.dex */
public final class ev0 extends mq7 implements vu0, oc6 {
    public i22 K;
    public boolean L;

    public static final rk9 H1(ev0 ev0Var, i38 i38Var, hg hgVar) {
        rk9 rk9Var;
        if (ev0Var.J && ev0Var.L) {
            i38 u = voe.u(ev0Var);
            if (!i38Var.E1().J) {
                i38Var = null;
            }
            if (i38Var != null && (rk9Var = (rk9) hgVar.invoke()) != null) {
                return rk9Var.o(u.g0(i38Var, false).j());
            }
        }
        return null;
    }

    @Override // defpackage.oc6
    public final void L(sc6 sc6Var) {
        this.L = true;
    }

    @Override // defpackage.vu0
    public final Object l0(i38 i38Var, hg hgVar, n42 n42Var) {
        Object p = k27.p(new dv0(this, i38Var, hgVar, new se0(3, this, i38Var, hgVar), null, 0), n42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }
}
