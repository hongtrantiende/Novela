package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nha  reason: default package */
/* loaded from: classes.dex */
public final class nha extends fb6 implements nu4 {
    public final /* synthetic */ tu1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nha(tu1 tu1Var) {
        super(4);
        this.a = tu1Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        lha lhaVar = (lha) obj;
        nq7 nq7Var = (nq7) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            if (rv4Var.f(lhaVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.x(rv4Var, Integer.valueOf(hashCode), qw1.g);
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            this.a.c(lhaVar, rv4Var, Integer.valueOf(i & 14));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
