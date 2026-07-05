package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e51 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi8 b;
    public final /* synthetic */ zg4 c;

    public /* synthetic */ e51(yi8 yi8Var, zg4 zg4Var, int i) {
        this.a = i;
        this.b = yi8Var;
        this.c = zg4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        zg4 zg4Var = this.c;
        yi8 yi8Var = this.b;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                yi8Var.c(zg4Var, intValue, intValue2);
                return pvcVar;
            default:
                yi8Var.c(zg4Var, intValue, intValue2);
                return pvcVar;
        }
    }
}
