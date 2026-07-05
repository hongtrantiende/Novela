package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ hu4 c;

    public /* synthetic */ mk7(long j, vt4 vt4Var, int i) {
        this.b = j;
        this.c = vt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.c;
        switch (i) {
            case 0:
                xt4 xt4Var = (xt4) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    obe.f(this.b, null, xt4Var, rv4Var, 0, 2);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                rgc.o(this.b, (vt4) hu4Var, (rv4) obj, xoe.p(49));
                return pvcVar;
        }
    }

    public /* synthetic */ mk7(long j, xt4 xt4Var) {
        this.b = j;
        this.c = xt4Var;
    }
}
