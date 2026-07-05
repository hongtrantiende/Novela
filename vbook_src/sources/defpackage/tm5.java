package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tm5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tm5 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tm5(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.a;
        kq7 kq7Var = kq7.a;
        boolean z6 = false;
        pvc pvcVar = pvc.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                xm5.b((zc2) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 1:
                wf6 wf6Var = (wf6) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    q06 l = wf6Var.b.h.l(i2);
                    ((tf6) l.c).d.h(yf6.a, Integer.valueOf(i2 - l.a), rv4Var, 6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                si6 si6Var = (si6) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    q06 l2 = si6Var.b.g.l(i2);
                    ((qi6) l2.c).c.h(si6Var.c, Integer.valueOf(i2 - l2.a), rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 3:
                xj6 xj6Var = (xj6) obj3;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    q06 l3 = xj6Var.b.g.l(i2);
                    ((vj6) l3.c).d.h(yj6.a, Integer.valueOf(i2 - l3.a), rv4Var3, 6);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 4:
                aw7 aw7Var = (aw7) obj3;
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    Object P = rv4Var4.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = s21.e(rv4Var4);
                    }
                    zm4 zm4Var = (zm4) P;
                    Object P2 = rv4Var4.P();
                    if (P2 == lh9Var) {
                        P2 = new sr3(zm4Var, null, 13);
                        rv4Var4.o0(P2);
                    }
                    yte.g((lu4) P2, rv4Var4, zm4Var);
                    nq7 f = pna.f(kq7Var, 1.0f);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var4.T);
                    xt8 l4 = rv4Var4.l();
                    nq7 p = lye.p(rv4Var4, f);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var);
                    } else {
                        rv4Var4.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var4, d);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var4, l4);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var4, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var4);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var4, p);
                    jub jubVar = (jub) aw7Var.getValue();
                    t86 t86Var = new t86(3, 7, Token.HOOK);
                    v72 v72Var = ((h27) rv4Var4.j(j27.a)).c.b;
                    nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                    boolean f2 = rv4Var4.f(aw7Var);
                    Object P3 = rv4Var4.P();
                    if (f2 || P3 == lh9Var) {
                        P3 = new dk7(aw7Var, 20);
                        rv4Var4.o0(P3);
                    }
                    uwe.g(jubVar, (xt4) P3, n, false, null, zr1.d, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var4, 1572864, 12779520, 6127544);
                    nq7 C = zbe.C(pu0.a.a(kq7Var, kh5.d), nae.e, 8.0f, nae.e, nae.e, 13);
                    gv9 a = ev9.a(lz.a, kh5.F, rv4Var4, 0);
                    int hashCode2 = Long.hashCode(rv4Var4.T);
                    xt8 l5 = rv4Var4.l();
                    nq7 p2 = lye.p(rv4Var4, C);
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(npVar, rv4Var4, a);
                    jce.F(npVar2, rv4Var4, l5);
                    s21.t(hashCode2, rv4Var4, npVar3, rv4Var4, kgVar);
                    jce.F(npVar4, rv4Var4, p2);
                    xbe.i(rv4Var4, pna.s(kq7Var, 24.0f));
                    cvb.c(((jub) aw7Var.getValue()).a.b, null, zl1.h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var4, 384, 0, 262138);
                    xbe.i(rv4Var4, pna.s(kq7Var, 4.0f));
                    cvb.c("/" + i2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var4, 0, 0, 262142);
                    xbe.i(rv4Var4, hl5.e(rv4Var4, true, true, kq7Var, 12.0f));
                    return pvcVar;
                }
                rv4Var4.X();
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                ((jz7) obj3).a(xoe.p(i2 | 1), (rv4) obj);
                return pvcVar;
            case 6:
                gj8 gj8Var = (gj8) obj3;
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    q06 l6 = gj8Var.b.r().l(i2);
                    ((dj8) l6.c).b.h(jj8.a, Integer.valueOf(i2 - l6.a), rv4Var5, 0);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            default:
                List list = (List) obj3;
                rv4 rv4Var6 = (rv4) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                }
                if (rv4Var6.U(intValue6 & 1, z6)) {
                    cvb.c((String) list.get(i2), l0e.u(kq7Var), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rv4Var6, 48, 24576, 245756);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
        }
    }
}
