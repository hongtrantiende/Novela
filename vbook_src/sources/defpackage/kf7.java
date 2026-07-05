package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kf7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ do3 b;

    public /* synthetic */ kf7(do3 do3Var, int i) {
        this.a = i;
        this.b = do3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        do3 do3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                do3Var.a(false);
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                do3Var.getClass();
                do3Var.c.setValue(str);
                return pvcVar;
            default:
                String str2 = (String) obj;
                str2.getClass();
                do3Var.getClass();
                do3Var.d.setValue(str2);
                return pvcVar;
        }
    }
}
