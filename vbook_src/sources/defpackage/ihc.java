package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ihc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ihc implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g13 b;
    public final /* synthetic */ e33 c;

    public /* synthetic */ ihc(g13 g13Var, e33 e33Var, int i) {
        this.a = i;
        this.b = g13Var;
        this.c = e33Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        e33 e33Var = this.c;
        g13 g13Var = this.b;
        switch (i) {
            case 0:
                g13Var.b.setValue(Long.valueOf(e33Var.a));
                g13Var.a.setValue(Boolean.TRUE);
                return pvcVar;
            default:
                g13Var.b.setValue(Long.valueOf(e33Var.a));
                g13Var.a.setValue(Boolean.TRUE);
                return pvcVar;
        }
    }
}
