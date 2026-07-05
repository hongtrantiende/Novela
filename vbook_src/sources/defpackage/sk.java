package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk  reason: default package */
/* loaded from: classes.dex */
public final class sk extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i29 b;
    public final /* synthetic */ aw7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk(i29 i29Var, aw7 aw7Var, int i) {
        super(2);
        this.a = i;
        this.b = i29Var;
        this.c = aw7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        i29 i29Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = kg.E;
                        rv4Var.o0(P);
                    }
                    nq7 c = y7a.c(kq7.a, false, (xt4) P);
                    boolean h = rv4Var.h(i29Var);
                    Object P2 = rv4Var.P();
                    if (h || P2 == lh9Var) {
                        P2 = new pk(i29Var, 1);
                        rv4Var.o0(P2);
                    }
                    nq7 l = pbe.l(c, (xt4) P2);
                    if (i29Var.getCanCalculatePosition()) {
                        f = 1.0f;
                    } else {
                        f = nae.e;
                    }
                    nq7 m = lpe.m(l, f);
                    ly1 ly1Var = tk.a;
                    lu4 lu4Var = (lu4) aw7Var.getValue();
                    Object P3 = rv4Var.P();
                    if (P3 == lh9Var) {
                        P3 = ci.c;
                        rv4Var.o0(P3);
                    }
                    b37 b37Var = (b37) P3;
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p = lye.p(rv4Var, m);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, b37Var);
                    jce.F(qw1.e, rv4Var, l2);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    lu4Var.invoke(rv4Var, 0);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    pye.a(tk.b.a(Boolean.TRUE), jce.E(1022273628, new sk(i29Var, aw7Var, 0), rv4Var2), rv4Var2, 56);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
