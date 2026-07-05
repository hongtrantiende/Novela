package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gn7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn7 implements mu4 {
    public final /* synthetic */ lu4 C;
    public final /* synthetic */ mu4 D;
    public final /* synthetic */ vt4 E;
    public final /* synthetic */ lu4 F;
    public final /* synthetic */ vt4 G;
    public final /* synthetic */ int a;
    public final /* synthetic */ exb b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ lu4 d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ mu4 f;

    public /* synthetic */ gn7(exb exbVar, xt4 xt4Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, lu4 lu4Var3, mu4 mu4Var2, vt4 vt4Var, lu4 lu4Var4, vt4 vt4Var2, int i) {
        this.a = i;
        this.b = exbVar;
        this.c = xt4Var;
        this.d = lu4Var;
        this.e = lu4Var2;
        this.f = mu4Var;
        this.C = lu4Var3;
        this.D = mu4Var2;
        this.E = vt4Var;
        this.F = lu4Var4;
        this.G = vt4Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        xt4 xt4Var = this.c;
        boolean z2 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 f = pna.f(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    nq7 C = rte.C(nmd.v(tte.k(f, ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), rte.u(rv4Var), 14);
                    boolean f2 = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f2 || P == lh9Var) {
                        P = new in7(0, xt4Var);
                        rv4Var.o0(P);
                    }
                    jce.j(this.b, C, (vt4) P, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    tza tzaVar2 = j27.a;
                    nq7 C2 = rte.C(nmd.v(tte.k(f3, ((h27) rv4Var2.j(tzaVar2)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar2)).a, 1.0f), lre.g), rte.u(rv4Var2), 14);
                    boolean f4 = rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (f4 || P2 == lh9Var) {
                        P2 = new in7(1, xt4Var);
                        rv4Var2.o0(P2);
                    }
                    jce.j(this.b, C2, (vt4) P2, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
