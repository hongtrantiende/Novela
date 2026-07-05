package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd1 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ hd1(boolean z, vt4 vt4Var) {
        this.a = 0;
        this.b = z;
        this.c = vt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        vt4 vt4Var = this.c;
        pvc pvcVar = pvc.a;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nmd.j(this.c, null, !z2, null, null, null, jce.E(-1905660513, new kd1(1, z2), rv4Var), rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                fa3.f(z2, vt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                owe.d(z2, vt4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ hd1(boolean z, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = vt4Var;
    }
}
