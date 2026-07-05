package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v73  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v73 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ v73(int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = i;
        this.b = xt4Var;
        this.c = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                l54 l54Var = (l54) obj;
                l54Var.getClass();
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(l54Var.a);
                return pvcVar;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                xt4Var.invoke(num);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 2:
                String str = (String) obj;
                str.getClass();
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(str);
                return pvcVar;
            case 3:
                jub jubVar = (jub) obj;
                jubVar.getClass();
                aw7Var.setValue(jubVar);
                xt4Var.invoke(jubVar.a.b);
                return pvcVar;
            default:
                Long l = (Long) obj;
                l.getClass();
                aw7Var.setValue(Boolean.FALSE);
                xt4Var.invoke(l);
                return pvcVar;
        }
    }
}
