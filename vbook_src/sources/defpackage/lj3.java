package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lj3  reason: default package */
/* loaded from: classes3.dex */
public final class lj3 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ m82 d;
    public final /* synthetic */ aw7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj3(vt4 vt4Var, aw7 aw7Var, m82 m82Var, aw7 aw7Var2, int i) {
        super(0);
        this.a = i;
        this.b = vt4Var;
        this.c = aw7Var;
        this.d = m82Var;
        this.e = aw7Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.b;
        m82 m82Var = this.d;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.e;
        switch (i) {
            case 0:
                yi3 yi3Var = (yi3) aw7Var.getValue();
                if (yi3Var != null) {
                    z87.v(m82Var, null, null, new jj3(yi3Var, null, 2), 3);
                }
                if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                    vt4Var.invoke();
                }
                aw7Var2.setValue(Boolean.FALSE);
                return pvcVar;
            default:
                yi3 yi3Var2 = (yi3) aw7Var.getValue();
                if (yi3Var2 != null) {
                    z87.v(m82Var, null, null, new jj3(yi3Var2, null, 3), 3);
                }
                if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                    vt4Var.invoke();
                }
                aw7Var2.setValue(Boolean.FALSE);
                return pvcVar;
        }
    }
}
