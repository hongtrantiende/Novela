package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b1c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1c implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    public /* synthetic */ b1c(m82 m82Var, int i, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.b = m82Var;
        this.c = i;
        this.d = aw7Var;
        this.e = aw7Var2;
        this.f = aw7Var3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                tza tzaVar = e1c.a;
                Boolean bool = Boolean.FALSE;
                aw7 aw7Var = this.d;
                aw7Var.setValue(bool);
                z87.v(m82Var, null, null, new q08(true, this.c, this.e, this.f, aw7Var, null), 3);
                return pvcVar;
            default:
                tza tzaVar2 = e1c.a;
                z87.v(m82Var, null, null, new q08(true, this.c, this.d, this.e, this.f, null), 3);
                return pvcVar;
        }
    }

    public /* synthetic */ b1c(aw7 aw7Var, m82 m82Var, int i, aw7 aw7Var2, aw7 aw7Var3) {
        this.d = aw7Var;
        this.b = m82Var;
        this.c = i;
        this.e = aw7Var2;
        this.f = aw7Var3;
    }
}
