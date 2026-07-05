package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u90  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u90 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ vt4 d;

    public /* synthetic */ u90(boolean z, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = vt4Var;
        this.d = vt4Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.d;
        vt4 vt4Var2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z) {
                    vt4Var2.invoke();
                } else {
                    vt4Var.invoke();
                }
                return pvcVar;
            case 1:
                if (z) {
                    vt4Var2.invoke();
                } else {
                    vt4Var.invoke();
                }
                return pvcVar;
            default:
                if (z) {
                    vt4Var2.invoke();
                } else {
                    vt4Var.invoke();
                }
                return pvcVar;
        }
    }
}
