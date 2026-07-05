package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d42  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d42 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;

    public /* synthetic */ d42(int i, vt4 vt4Var, boolean z) {
        this.a = i;
        this.b = z;
        this.c = vt4Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z) {
                    vt4Var.invoke();
                }
                return pvcVar;
            default:
                if (!z) {
                    vt4Var.invoke();
                }
                return pvcVar;
        }
    }
}
