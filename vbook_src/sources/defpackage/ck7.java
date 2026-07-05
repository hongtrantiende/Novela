package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck7  reason: default package */
/* loaded from: classes3.dex */
public final class ck7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public ck7(nc9 nc9Var, eo3 eo3Var, int i) {
        this.a = 2;
        this.b = nc9Var;
        this.d = eo3Var;
        this.c = i;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        rv4 rv4Var;
        boolean z4;
        boolean z5;
        float f;
        dq4 dq4Var;
        int i4;
        boolean z6;
        int i5 = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        int i6 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        int i7 = 4;
        Object obj7 = ax1.a;
        switch (i5) {
            case 0:
                Object obj8 = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                xt4 xt4Var = (xt4) obj5;
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var2.f(obj8)) {
                        i7 = 2;
                    }
                    i = intValue2 | i7;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var2.d(intValue)) {
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
                if (rv4Var2.U(i & 1, z)) {
                    mq5 mq5Var = (mq5) ((List) obj6).get(intValue);
                    rv4Var2.e0(-1414758277);
                    rv4Var2.e0(-184183409);
                    String str = mq5Var.b;
                    int i8 = mq5Var.c;
                    if (str.length() == 0) {
                        str = a82.m(yqe.A((y3b) b3b.h.getValue(), rv4Var2), " ", i8 + 1);
                    }
                    String str2 = str;
                    rv4Var2.q(false);
                    if (i8 == i6) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f2 = rv4Var2.f(xt4Var) | rv4Var2.h(mq5Var);
                    Object P = rv4Var2.P();
                    if (f2 || P == obj7) {
                        P = new qi7(xt4Var, mq5Var, 1);
                        rv4Var2.o0(P);
                    }
                    jsc.h(str2, z2, null, (vt4) P, rv4Var2, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                xt4 xt4Var2 = (xt4) obj5;
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var3.f(xg6Var)) {
                        i7 = 2;
                    }
                    i3 = intValue4 | i7;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var3.d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i3 & 1, z3)) {
                    String str3 = (String) ((List) obj6).get(intValue3);
                    rv4Var3.e0(-1325648486);
                    if (str3.length() > 0) {
                        rv4Var3.e0(-1325629267);
                        if (i6 == intValue3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        nq7 h = pna.h(kq7Var, 36.0f);
                        su9 su9Var = uu9.a;
                        nq7 k = tte.k(h, su9Var);
                        boolean f3 = rv4Var3.f(xt4Var2);
                        if ((((i3 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var3.d(intValue3)) || (i3 & 48) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z7 = z5 | f3;
                        Object P2 = rv4Var3.P();
                        if (z7 || P2 == obj7) {
                            P2 = new tf7(xt4Var2, intValue3, 1);
                            rv4Var3.o0(P2);
                        }
                        nq7 f4 = lbe.f(15, (vt4) P2, k, null, false);
                        tza tzaVar = j27.a;
                        long j = ((h27) rv4Var3.j(tzaVar)).a.a;
                        float f5 = 0.1f;
                        if (z4) {
                            f = 0.6f;
                        } else {
                            f = 0.1f;
                        }
                        nq7 d = st0.d(f4, 1.0f, zl1.b(f, j), su9Var);
                        long j2 = ((h27) rv4Var3.j(tzaVar)).a.a;
                        if (z4) {
                            f5 = 0.3f;
                        }
                        nq7 A = zbe.A(nmd.v(d, zl1.b(f5, j2), lre.g), 12.0f, nae.e, 2);
                        b37 d2 = fu0.d(kh5.e, false);
                        int hashCode = Long.hashCode(rv4Var3.T);
                        xt8 l = rv4Var3.l();
                        nq7 p = lye.p(rv4Var3, A);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(zx1Var);
                        } else {
                            rv4Var3.r0();
                        }
                        jce.F(qw1.f, rv4Var3, d2);
                        jce.F(qw1.e, rv4Var3, l);
                        jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var3);
                        jce.F(qw1.d, rv4Var3, p);
                        oyb oybVar = ((h27) rv4Var3.j(tzaVar)).b.j;
                        if (z4) {
                            dq4Var = dq4.D;
                        } else {
                            dq4Var = dq4.e;
                        }
                        cvb.c(str3, null, ((h27) rv4Var3.j(tzaVar)).a.q, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var3, 0, 24576, 114618);
                        rv4Var = rv4Var3;
                        rv4Var.q(true);
                        rv4Var.q(false);
                    } else {
                        rv4Var = rv4Var3;
                        rv4Var.e0(-1324445315);
                        rv4Var.q(false);
                    }
                    rv4Var.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                do9 do9Var = (do9) obj;
                ((Boolean) obj2).getClass();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue5 = ((Number) obj4).intValue();
                do9Var.getClass();
                if ((intValue5 & 6) == 0) {
                    if (!rv4Var4.f(do9Var)) {
                        i7 = 2;
                    }
                    intValue5 |= i7;
                }
                if ((intValue5 & Token.DO) != 130) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var4.U(intValue5 & 1, z6)) {
                    nq7 f6 = pna.f(kq7Var, 1.0f);
                    nc9 nc9Var = (nc9) obj6;
                    eo3 eo3Var = (eo3) obj5;
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var4, 48);
                    int hashCode2 = Long.hashCode(rv4Var4.T);
                    xt8 l2 = rv4Var4.l();
                    nq7 p2 = lye.p(rv4Var4, f6);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var2);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, a);
                    jce.F(qw1.e, rv4Var4, l2);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p2);
                    String str4 = nc9Var.b;
                    t86 t86Var = new t86(0, 7, Token.INC);
                    v72 v72Var = ((h27) rv4Var4.j(j27.a)).c.b;
                    we6 we6Var = new we6(1.0f, true);
                    boolean f7 = rv4Var4.f(eo3Var) | rv4Var4.d(i6);
                    Object P3 = rv4Var4.P();
                    if (f7 || P3 == obj7) {
                        P3 = new rf7(eo3Var, i6);
                        rv4Var4.o0(P3);
                    }
                    uwe.h(str4, (xt4) P3, we6Var, false, false, null, jce.E(601308169, new sf7(i6), rv4Var4), null, null, null, false, null, t86Var, null, false, 0, 0, v72Var, null, rv4Var4, 1572864, 196608, 6258616);
                    if (eo3Var.c().size() > 1) {
                        rs8.s(rv4Var4, -1233514450, kq7Var, 4.0f, rv4Var4);
                        nk5.a(rp5.c((wk3) jk3.N.getValue(), rv4Var4, 0), null, zbe.y(kqe.i(do9Var, pna.n(kq7Var, 40.0f), null, 31), 8.0f), 0L, rv4Var4, 48, 8);
                        boolean f8 = rv4Var4.f(eo3Var) | rv4Var4.d(i6);
                        Object P4 = rv4Var4.P();
                        if (f8 || P4 == obj7) {
                            P4 = new tf7(eo3Var, i6, 0);
                            rv4Var4.o0(P4);
                        }
                        mwe.b((vt4) P4, pna.n(kq7Var, 40.0f), false, null, null, jye.c, rv4Var4, 1572912, 60);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(-1232433325);
                        rv4Var4.q(false);
                    }
                    rs8.u(rv4Var4, true, kq7Var, 8.0f, rv4Var4);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ck7(int i, int i2, xt4 xt4Var, List list) {
        this.a = i2;
        this.b = list;
        this.c = i;
        this.d = xt4Var;
    }
}
