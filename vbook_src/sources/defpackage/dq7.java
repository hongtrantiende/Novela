package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dq7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ dq7(float f, int i, xt4 xt4Var) {
        this.a = i;
        this.b = f;
        this.c = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        xt4 xt4Var = this.c;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    kq7 kq7Var = kq7.a;
                    nq7 z4 = zbe.z(pna.s(kq7Var, 280.0f), 12.0f, 12.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, z4);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var, p);
                    gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, kq7Var);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a2);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p2);
                    String A = yqe.A((y3b) b2b.d.getValue(), rv4Var);
                    tza tzaVar = j27.a;
                    cvb.c(A, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, 0, 0, 131068);
                    float f = this.b;
                    cvb.c(yqe.B((y3b) b2b.i.getValue(), new Object[]{gq7.c(f)}, rv4Var), null, ((h27) rv4Var.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, 0, 0, 131066);
                    rv4Var.q(true);
                    xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
                    jk1 jk1Var = new jk1(0.25f, 3.0f);
                    kpa kpaVar = kpa.a;
                    gpa d = kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var.j(tzaVar)).a.a), rv4Var, 1015);
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    boolean f3 = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f3 || P == lh9Var) {
                        P = new im(22, xt4Var);
                        rv4Var.o0(P);
                    }
                    dae.d(f, (xt4) P, f2, false, null, d, null, 0, null, null, jk1Var, rv4Var, 384, 0, 984);
                    s9e.f(hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, 1.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(-2011554945, new dq7(f, 1, xt4Var), rv4Var), rv4Var, 1573302);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    for (Number number : gq7.a) {
                        float floatValue = number.floatValue();
                        if (Math.abs(floatValue - this.b) < 0.01f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean f4 = rv4Var2.f(xt4Var) | rv4Var2.c(floatValue);
                        Object P2 = rv4Var2.P();
                        if (f4 || P2 == lh9Var) {
                            P2 = new hm7(xt4Var, floatValue);
                            rv4Var2.o0(P2);
                        }
                        gq7.b(floatValue, z3, (vt4) P2, rv4Var2, 0);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
