package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v9b  reason: default package */
/* loaded from: classes.dex */
public abstract class v9b {
    public static final ly1 a = new ly1(new n3b(24));

    public static final void a(nq7 nq7Var, wea weaVar, long j, long j2, float f, float f2, vs0 vs0Var, final tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            nq7Var = kq7.a;
        }
        if ((i2 & 2) != 0) {
            weaVar = lre.g;
        }
        if ((i2 & 4) != 0) {
            j = ((h27) rv4Var.j(j27.a)).a.p;
        }
        if ((i2 & 8) != 0) {
            j2 = rm1.b(j, rv4Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            vs0Var = null;
        }
        ly1 ly1Var = a;
        final float f3 = f + ((rg3) rv4Var.j(ly1Var)).a;
        i99[] i99VarArr = {r12.a.a(new zl1(j2)), ly1Var.a(new rg3(f3))};
        final long j3 = j;
        final wea weaVar2 = weaVar;
        final vs0 vs0Var2 = vs0Var;
        final float f4 = f2;
        final nq7 nq7Var2 = nq7Var;
        pye.b(i99VarArr, jce.E(421772006, new lu4() { // from class: t9b
            @Override // defpackage.lu4
            public final Object invoke(Object obj, Object obj2) {
                boolean z;
                rv4 rv4Var2 = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                boolean U = rv4Var2.U(intValue & 1, z);
                pvc pvcVar = pvc.a;
                if (U) {
                    nq7 c = v9b.c(nq7.this, weaVar2, v9b.d(j3, f3, rv4Var2), vs0Var2, ((r13) rv4Var2.j(dy1.h)).L0(f4));
                    Object P = rv4Var2.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = new dva(9);
                        rv4Var2.o0(P);
                    }
                    nq7 c2 = y7a.c(c, false, (xt4) P);
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = yw2.e;
                        rv4Var2.o0(P2);
                    }
                    nq7 b = dab.b(c2, pvcVar, (PointerInputEventHandler) P2);
                    b37 d = fu0.d(kh5.a, true);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, b);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    tu1Var.invoke(rv4Var2, 0);
                    rv4Var2.q(true);
                    return pvcVar;
                }
                rv4Var2.X();
                return pvcVar;
            }
        }, rv4Var), rv4Var, 56);
    }

    public static final void b(final vt4 vt4Var, final nq7 nq7Var, boolean z, final wea weaVar, final long j, long j2, float f, final float f2, vs0 vs0Var, yu7 yu7Var, final tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        final boolean z2;
        float f3;
        final vs0 vs0Var2;
        final yu7 yu7Var2;
        if ((i2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 64) != 0) {
            f3 = nae.e;
        } else {
            f3 = f;
        }
        if ((i2 & 256) != 0) {
            vs0Var2 = null;
        } else {
            vs0Var2 = vs0Var;
        }
        if (yu7Var == null) {
            rv4Var.e0(-1701074900);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = s21.g(rv4Var);
            }
            rv4Var.q(false);
            yu7Var2 = (yu7) P;
        } else {
            rv4Var.e0(2023335947);
            rv4Var.q(false);
            yu7Var2 = yu7Var;
        }
        ly1 ly1Var = a;
        final float f4 = ((rg3) rv4Var.j(ly1Var)).a + f3;
        pye.b(new i99[]{r12.a.a(new zl1(j2)), ly1Var.a(new rg3(f4))}, jce.E(849208527, new lu4() { // from class: u9b
            @Override // defpackage.lu4
            public final Object invoke(Object obj, Object obj2) {
                boolean z3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(intValue & 1, z3)) {
                    n95 n95Var = jz5.a;
                    nq7 a0 = nq7.this.a0(pc7.b);
                    ly1 ly1Var2 = jt9.a;
                    vt9 vt9Var = ((wt9) rv4Var2.j(ly1Var2)).a;
                    nq7 a02 = a0.a0(kq7.a);
                    long d = v9b.d(j, f4, rv4Var2);
                    float L0 = ((r13) rv4Var2.j(dy1.h)).L0(f2);
                    wea weaVar2 = weaVar;
                    nq7 c = v9b.c(a02, weaVar2, d, vs0Var2, L0);
                    vt9 vt9Var2 = ((wt9) rv4Var2.j(ly1Var2)).a;
                    nq7 a03 = lbe.e(c, yu7Var2, jt9.a(nae.e, 0L, weaVar2, 215), z2, null, vt4Var, 24).a0(new ch1(new bo7(29)));
                    b37 d2 = fu0.d(kh5.a, true);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, a03);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d2);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    tu1Var.invoke(rv4Var2, 0);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvc.a;
            }
        }, rv4Var), rv4Var, 56);
    }

    public static final nq7 c(nq7 nq7Var, wea weaVar, long j, vs0 vs0Var, float f) {
        nq7 nq7Var2;
        int i = (f > nae.e ? 1 : (f == nae.e ? 0 : -1));
        nq7 nq7Var3 = kq7.a;
        if (i > 0) {
            nq7Var2 = axe.l(nq7Var3, nae.e, nae.e, nae.e, f, nae.e, weaVar, false, null, 1042399);
        } else {
            nq7Var2 = nq7Var3;
        }
        nq7 a0 = nq7Var.a0(nq7Var2);
        if (vs0Var != null) {
            nq7Var3 = new us0(vs0Var.a, vs0Var.b, weaVar);
        }
        return tte.k(nmd.v(a0.a0(nq7Var3), j, weaVar), weaVar);
    }

    public static final long d(long j, float f, rv4 rv4Var) {
        pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
        boolean booleanValue = ((Boolean) rv4Var.j(rm1.a)).booleanValue();
        if (zl1.c(j, pm1Var.p) && booleanValue) {
            return rm1.g(pm1Var, f);
        }
        return j;
    }
}
