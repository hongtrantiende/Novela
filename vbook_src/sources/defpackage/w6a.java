package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w6a implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl9 b;

    public /* synthetic */ w6a(yl9 yl9Var, int i) {
        this.a = i;
        this.b = yl9Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        yl9 yl9Var = this.b;
        z09 z09Var = (z09) obj;
        switch (i) {
            case 0:
                z09Var.a();
                yl9Var.a = ((y78) obj2).a;
                return pvcVar;
            default:
                float floatValue = ((Float) obj2).floatValue();
                z09Var.a();
                yl9Var.a = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32);
                return pvcVar;
        }
    }
}
