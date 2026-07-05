package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s55  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s55 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t55 b;

    public /* synthetic */ s55(t55 t55Var, int i) {
        this.a = i;
        this.b = t55Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        t55 t55Var = this.b;
        switch (i) {
            case 0:
                ctc ctcVar = t55Var.R;
                if (ctcVar != null) {
                    ctcVar.getValue();
                    return pvcVar;
                }
                throw hl5.d("Font resolution state is not set.");
            default:
                ctc ctcVar2 = t55Var.R;
                if (ctcVar2 != null) {
                    ctcVar2.getValue();
                    return pvcVar;
                }
                throw hl5.d("Font resolution state is not set.");
        }
    }
}
