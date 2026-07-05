package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t11  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class t11 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;

    public /* synthetic */ t11(i11 i11Var, int i) {
        this.a = i;
        this.b = i11Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        i11 i11Var = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null && !i11Var.i()) {
                    i11Var.a(th);
                }
                return pvcVar;
            default:
                if (th != null && !i11Var.d()) {
                    i11Var.a(th);
                }
                return pvcVar;
        }
    }
}
