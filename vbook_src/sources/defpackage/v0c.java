package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v0c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0c implements vt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v0c(boolean z, m82 m82Var, kb kbVar, aw7 aw7Var) {
        this.b = z;
        this.d = m82Var;
        this.e = kbVar;
        this.c = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        boolean z = this.b;
        switch (i) {
            case 0:
                xt4 xt4Var = (xt4) obj2;
                aw7 aw7Var2 = (aw7) obj;
                if (!z) {
                    xt4Var.invoke(Integer.valueOf((int) ((Number) aw7Var.getValue()).floatValue()));
                }
                aw7Var2.setValue(Boolean.FALSE);
                return pvcVar;
            default:
                m82 m82Var = (m82) obj2;
                kb kbVar = (kb) obj;
                if (z) {
                    z87.v(m82Var, null, null, new kl7(2, kbVar, null), 3);
                } else {
                    aw7Var.setValue(Boolean.TRUE);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ v0c(boolean z, xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2) {
        this.b = z;
        this.d = xt4Var;
        this.c = aw7Var;
        this.e = aw7Var2;
    }
}
