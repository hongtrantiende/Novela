package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hm7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ hm7(xt4 xt4Var, float f) {
        this.a = 2;
        this.c = xt4Var;
        this.b = f;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.b;
        xt4 xt4Var = this.c;
        switch (i) {
            case 0:
                float f2 = (f * 16.0f) - 0.5f;
                if (10.0f <= f2 && f2 <= 50.0f) {
                    xt4Var.invoke(Float.valueOf(f2 / 16.0f));
                }
                return pvcVar;
            case 1:
                float f3 = (f * 16.0f) + 0.5f;
                if (10.0f <= f3 && f3 <= 50.0f) {
                    xt4Var.invoke(Float.valueOf(f3 / 16.0f));
                }
                return pvcVar;
            default:
                xt4Var.invoke(Float.valueOf(f));
                return pvcVar;
        }
    }

    public /* synthetic */ hm7(float f, int i, xt4 xt4Var) {
        this.a = i;
        this.b = f;
        this.c = xt4Var;
    }
}
