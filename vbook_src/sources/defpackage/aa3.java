package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aa3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa3 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ hu4 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ aa3(long j, vt4 vt4Var, boolean z, int i) {
        this.b = j;
        this.c = vt4Var;
        this.d = z;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fa3.g(xoe.p(385), this.b, (vt4) hu4Var, (rv4) obj, this.d);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                nmd.h(xoe.p(1), this.b, (vt4) hu4Var, (rv4) obj, this.d);
                return pvcVar;
            default:
                lu4 lu4Var = (lu4) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    fpe.m(this.b, this.d, null, lu4Var, rv4Var, 0, 4);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ aa3(long j, boolean z, vt4 vt4Var, int i) {
        this.b = j;
        this.d = z;
        this.c = vt4Var;
    }

    public /* synthetic */ aa3(long j, boolean z, lu4 lu4Var) {
        this.b = j;
        this.d = z;
        this.c = lu4Var;
    }
}
