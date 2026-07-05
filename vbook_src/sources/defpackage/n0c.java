package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n0c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0c implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm8 b;

    public /* synthetic */ n0c(dm8 dm8Var, int i) {
        this.a = i;
        this.b = dm8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        dm8 dm8Var = this.b;
        zy5 zy5Var = (zy5) obj;
        switch (i) {
            case 0:
                float f = (int) (zy5Var.a & 4294967295L);
                if (f < 1.0f) {
                    f = 1.0f;
                }
                dm8Var.i(f);
                return pvcVar;
            default:
                dm8Var.i((int) (zy5Var.a >> 32));
                return pvcVar;
        }
    }
}
