package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: id  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ id(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                dj3 dj3Var = (dj3) obj;
                dj3Var.getClass();
                dj3Var.a(ah3.a, -f2);
                dj3Var.a(ah3.b, nae.e);
                dj3Var.a(ah3.c, f);
                return pvcVar;
            case 1:
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                c00 c00Var = nx5Var.b;
                c00Var.b(new rg3(f2), "horizontal");
                c00Var.b(new rg3(f), "vertical");
                return pvcVar;
            default:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.x(t15Var.f() * f2);
                t15Var.q(dce.m(f, nae.e, 1.0f));
                return pvcVar;
        }
    }
}
