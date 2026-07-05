package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class en7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ sj8 c;
    public final /* synthetic */ int d;

    public /* synthetic */ en7(m82 m82Var, sj8 sj8Var, int i, int i2) {
        this.a = i2;
        this.b = m82Var;
        this.c = sj8Var;
        this.d = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        sj8 sj8Var = this.c;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new fn7(sj8Var, i2, null, 0), 3);
                return pvcVar;
            default:
                z87.v(m82Var, null, null, new fn7(sj8Var, i2, null, 1), 3);
                return pvcVar;
        }
    }
}
