package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ hd(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        ah3 ah3Var = ah3.b;
        pvc pvcVar = pvc.a;
        float f = this.b;
        switch (i) {
            case 0:
                dj3 dj3Var = (dj3) obj;
                dj3Var.getClass();
                dj3Var.a(ah3.a, f);
                dj3Var.a(ah3Var, nae.e);
                return pvcVar;
            case 1:
                dj3 dj3Var2 = (dj3) obj;
                dj3Var2.getClass();
                dj3Var2.a(ah3Var, nae.e);
                dj3Var2.a(ah3.c, -f);
                return pvcVar;
            case 2:
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                c00 c00Var = nx5Var.b;
                c00Var.b(new rg3(f), "x");
                c00Var.b(new rg3(nae.e), "y");
                return pvcVar;
            case 3:
                nx5 nx5Var2 = (nx5) obj;
                nx5Var2.getClass();
                nx5Var2.a = new rg3(f);
                return pvcVar;
            default:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.h(f);
                return pvcVar;
        }
    }
}
