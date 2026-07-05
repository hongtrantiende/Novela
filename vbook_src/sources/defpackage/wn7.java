package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wn7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wn7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ exb b;
    public final /* synthetic */ nu4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ wn7(exb exbVar, nu4 nu4Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = exbVar;
        this.c = nu4Var;
        this.d = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z = false;
        lh9 lh9Var = ax1.a;
        xt4 xt4Var = this.d;
        exb exbVar = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    String str = exbVar.a;
                    int i2 = exbVar.d;
                    int i3 = exbVar.c;
                    boolean f = rv4Var.f(str) | rv4Var.d(i3) | rv4Var.d(i2);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = exbVar.a.substring(i3, i2 + 1);
                        rv4Var.o0(P);
                    }
                    String str2 = (String) P;
                    List list = exbVar.g;
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    nq7 C = rte.C(zbe.y(nmd.v(tte.k(f2, ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 12.0f), rte.u(rv4Var), 14);
                    boolean f3 = rv4Var.f(xt4Var);
                    Object P2 = rv4Var.P();
                    if (f3 || P2 == lh9Var) {
                        P2 = new in7(9, xt4Var);
                        rv4Var.o0(P2);
                    }
                    ade.k(str2, list, C, this.c, (vt4) P2, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    String str3 = exbVar.a;
                    int i4 = exbVar.d;
                    int i5 = exbVar.c;
                    boolean f4 = rv4Var2.f(str3) | rv4Var2.d(i5) | rv4Var2.d(i4);
                    Object P3 = rv4Var2.P();
                    if (f4 || P3 == lh9Var) {
                        P3 = exbVar.a.substring(i5, i4 + 1);
                        rv4Var2.o0(P3);
                    }
                    String str4 = (String) P3;
                    List list2 = exbVar.g;
                    nq7 f5 = pna.f(kq7Var, 1.0f);
                    tza tzaVar2 = j27.a;
                    nq7 C2 = rte.C(zbe.y(nmd.v(tte.k(f5, ((h27) rv4Var2.j(tzaVar2)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar2)).a, 1.0f), lre.g), 12.0f), rte.u(rv4Var2), 14);
                    boolean f6 = rv4Var2.f(xt4Var);
                    Object P4 = rv4Var2.P();
                    if (f6 || P4 == lh9Var) {
                        P4 = new in7(8, xt4Var);
                        rv4Var2.o0(P4);
                    }
                    ade.k(str4, list2, C2, this.c, (vt4) P4, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
