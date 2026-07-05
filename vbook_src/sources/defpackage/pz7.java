package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pz7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pz7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ pz7(int i, vt4 vt4Var, boolean z) {
        this.a = i;
        this.b = z;
        this.c = vt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = 1.0f;
        vt4 vt4Var = this.c;
        boolean z = this.b;
        t15 t15Var = (t15) obj;
        switch (i) {
            case 0:
                if (!z) {
                    f = ((Number) vt4Var.invoke()).floatValue();
                }
                t15Var.q(f);
                return pvcVar;
            default:
                if (!z) {
                    f = ((Number) vt4Var.invoke()).floatValue();
                }
                t15Var.q(f);
                return pvcVar;
        }
    }
}
