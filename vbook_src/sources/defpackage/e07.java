package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e07  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class e07 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ iw2 c;

    public /* synthetic */ e07(m82 m82Var, iw2 iw2Var, int i) {
        this.a = i;
        this.b = m82Var;
        this.c = iw2Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        iw2 iw2Var = this.c;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new g07(iw2Var, null, 1), 3);
                return pvcVar;
            default:
                z87.v(m82Var, null, null, new g07(iw2Var, null, 0), 3);
                return pvcVar;
        }
    }
}
