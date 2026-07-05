package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: im0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class im0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zl0 b;
    public final /* synthetic */ zl9 c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ qo3 e;

    public /* synthetic */ im0(zl0 zl0Var, zl9 zl9Var, vt4 vt4Var, qo3 qo3Var, int i) {
        this.a = i;
        this.b = zl0Var;
        this.c = zl9Var;
        this.d = vt4Var;
        this.e = qo3Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        qo3 qo3Var = this.e;
        vt4 vt4Var = this.d;
        zl9 zl9Var = this.c;
        zl0 zl0Var = this.b;
        switch (i) {
            case 0:
                lm0.a(zl9Var, vt4Var, qo3Var, zl0Var, new km0(zl0Var, 1));
                return pvcVar;
            default:
                lm0.a(zl9Var, vt4Var, qo3Var, zl0Var, new km0(zl0Var, 0));
                return pvcVar;
        }
    }
}
