package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ag7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ io3 b;

    public /* synthetic */ ag7(io3 io3Var, int i) {
        this.a = i;
        this.b = io3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        io3 io3Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                io3Var.b();
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                io3Var.getClass();
                io3Var.c(str);
                return pvcVar;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                io3Var.getClass();
                io3Var.b.setValue(str2);
                return pvcVar;
            default:
                ox7 ox7Var = (ox7) obj;
                ox7Var.getClass();
                io3Var.d(ox7Var.c, ox7Var.d, ox7Var.e, !c16.i(ox7Var.b, "general"));
                return pvcVar;
        }
    }
}
