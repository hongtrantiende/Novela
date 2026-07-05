package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ym5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ym5 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an5 b;

    public /* synthetic */ ym5(an5 an5Var, int i) {
        this.a = i;
        this.b = an5Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        an5 an5Var = this.b;
        switch (i) {
            case 0:
                an5Var.a.setValue(null);
                return pvc.a;
            default:
                return (zc2) an5Var.a.getValue();
        }
    }
}
