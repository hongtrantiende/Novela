package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zvb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zvb implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ omb b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ zvb(omb ombVar, vt4 vt4Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = ombVar;
        this.c = vt4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        boolean z = false;
        aw7 aw7Var = this.d;
        vt4 vt4Var = this.c;
        omb ombVar = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    String str = ombVar.a;
                    String str2 = ombVar.h;
                    Object P = rv4Var.P();
                    if (P == lh9Var) {
                        P = new iia(aw7Var, 26);
                        rv4Var.o0(P);
                    }
                    vt4 vt4Var2 = (vt4) P;
                    boolean f = rv4Var.f(vt4Var);
                    Object P2 = rv4Var.P();
                    if (f || P2 == lh9Var) {
                        P2 = new kf3(vt4Var, aw7Var, 12);
                        rv4Var.o0(P2);
                    }
                    cae.p(str, str2, vt4Var2, (vt4) P2, rv4Var, 3456);
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
                    String str3 = ombVar.a;
                    String str4 = ombVar.h;
                    Object P3 = rv4Var2.P();
                    if (P3 == lh9Var) {
                        P3 = new iia(aw7Var, 27);
                        rv4Var2.o0(P3);
                    }
                    vt4 vt4Var3 = (vt4) P3;
                    boolean f2 = rv4Var2.f(vt4Var);
                    Object P4 = rv4Var2.P();
                    if (f2 || P4 == lh9Var) {
                        P4 = new kf3(vt4Var, aw7Var, 13);
                        rv4Var2.o0(P4);
                    }
                    cae.p(str3, str4, vt4Var3, (vt4) P4, rv4Var2, 3456);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
