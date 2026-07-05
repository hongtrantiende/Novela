package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pf0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hu4 c;
    public final /* synthetic */ int d;

    public /* synthetic */ pf0(int i, xt4 xt4Var, boolean z) {
        this.a = 3;
        this.d = i;
        this.b = z;
        this.c = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        boolean z2 = this.b;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.c;
        int i2 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xxe.a(z2, (vt4) hu4Var, (rv4) obj, xoe.p(1 | i2));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                zxe.e(z2, (vt4) hu4Var, (rv4) obj, xoe.p(1 | i2));
                return pvcVar;
            case 2:
                ((Integer) obj2).intValue();
                owe.k(z2, (vt4) hu4Var, (rv4) obj, xoe.p(1 | i2));
                return pvcVar;
            default:
                xt4 xt4Var = (xt4) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    kq7 kq7Var = kq7.a;
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    xn1 a = wn1.a(new hz(12.0f, true, new vs(2)), kh5.I, rv4Var, 6);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, A);
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
                    boolean d = rv4Var.d(i2);
                    Object P = rv4Var.P();
                    if (d || P == ax1.a) {
                        P = tn3.r(i2);
                        rv4Var.o0(P);
                    }
                    String B = yqe.B((y3b) z1b.v0.getValue(), new Object[]{(String) P}, rv4Var);
                    tza tzaVar = j27.a;
                    cvb.c(B, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131070);
                    nq7 f = pna.f(kq7Var, 1.0f);
                    gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, f);
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
                    ase.b(this.b, xt4Var, null, false, null, rv4Var, 0);
                    cvb.c(yqe.A((y3b) z1b.x0.getValue(), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131070);
                    rv4Var.q(true);
                    rv4Var.q(true);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
        }
    }

    public /* synthetic */ pf0(boolean z, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = vt4Var;
        this.d = i;
    }
}
