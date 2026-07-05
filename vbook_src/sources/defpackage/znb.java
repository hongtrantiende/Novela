package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: znb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class znb implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ h2a c;
    public final /* synthetic */ nnb d;

    public /* synthetic */ znb(m82 m82Var, h2a h2aVar, nnb nnbVar, int i) {
        this.a = i;
        this.b = m82Var;
        this.c = h2aVar;
        this.d = nnbVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        h2a h2aVar = this.c;
        nnb nnbVar = this.d;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new iob(h2aVar, nnbVar, (m42) null, 3), 3);
                return pvcVar;
            case 1:
                z87.v(m82Var, null, null, new iob(h2aVar, nnbVar, (m42) null, 0), 3);
                return pvcVar;
            case 2:
                z87.v(m82Var, null, null, new iob(nnbVar, h2aVar, (m42) null, 1), 3);
                return pvcVar;
            default:
                z87.v(m82Var, null, null, new iob(nnbVar, h2aVar, (m42) null, 2), 3);
                return pvcVar;
        }
    }

    public /* synthetic */ znb(m82 m82Var, nnb nnbVar, h2a h2aVar, int i) {
        this.a = i;
        this.b = m82Var;
        this.d = nnbVar;
        this.c = h2aVar;
    }
}
