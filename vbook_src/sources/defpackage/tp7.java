package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tp7  reason: default package */
/* loaded from: classes3.dex */
public final class tp7 implements nu4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xt4 d;

    public tp7(List list, String str, float f, xt4 xt4Var) {
        this.a = list;
        this.b = str;
        this.c = f;
        this.d = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        int i2;
        int i3;
        xg6 xg6Var = (xg6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(xg6Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (rv4Var.d(intValue)) {
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
            c6c c6cVar = (c6c) this.a.get(intValue);
            rv4Var.e0(-886097280);
            boolean i4 = c16.i(c6cVar.a, this.b);
            kq7 kq7Var = kq7.a;
            nq7 a = xg6.a(xg6Var, kq7Var);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, a);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            nq7 n = pna.n(kq7Var, this.c);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            xt4 xt4Var = this.d;
            boolean f2 = rv4Var.f(xt4Var) | rv4Var.h(c6cVar);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (!f2 && P != lh9Var) {
                z2 = i4;
            } else {
                z2 = i4;
                P = new w7(23, xt4Var, c6cVar);
                rv4Var.o0(P);
            }
            nq7 f3 = lbe.f(15, (vt4) P, k, null, false);
            pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
            if (z2) {
                f = 6.0f;
            } else {
                f = 2.0f;
            }
            long g = rm1.g(pm1Var, f);
            ba5 ba5Var = lre.g;
            nq7 k2 = tte.k(zbe.y(nmd.v(f3, g, ba5Var), 6.0f), su9Var);
            boolean f4 = rv4Var.f(c6cVar);
            Object P2 = rv4Var.P();
            if (f4 || P2 == lh9Var) {
                P2 = new zl1(kve.v(c6cVar.b));
                rv4Var.o0(P2);
            }
            nq7 v = nmd.v(k2, ((zl1) P2).a, ba5Var);
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, v);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            if (z2) {
                rv4Var.e0(209001405);
                z3 = false;
                nk5.a(rp5.c((wk3) jk3.v.getValue(), rv4Var, 0), null, pu0.a.a(pna.n(kq7Var, 24.0f), kh5.e), zl1.e, rv4Var, 3120, 0);
                rv4Var.q(false);
            } else {
                z3 = false;
                rv4Var.e0(209464700);
                rv4Var.q(false);
            }
            hl5.v(rv4Var, true, true, z3);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
