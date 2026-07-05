package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tmb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tmb implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ qe d;

    public /* synthetic */ tmb(m82 m82Var, vt4 vt4Var, qe qeVar, int i) {
        this.a = i;
        this.b = m82Var;
        this.c = vt4Var;
        this.d = qeVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        qe qeVar = this.d;
        vt4 vt4Var = this.c;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new vmb(qeVar, null, 0), 3);
                vt4Var.invoke();
                return pvcVar;
            case 1:
                z87.v(m82Var, null, null, new vmb(qeVar, null, 1), 3);
                vt4Var.invoke();
                return pvcVar;
            default:
                z87.v(m82Var, null, null, new vmb(qeVar, null, 2), 3);
                vt4Var.invoke();
                return pvcVar;
        }
    }
}
