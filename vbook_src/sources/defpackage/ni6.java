package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ni6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ni6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi6 b;

    public /* synthetic */ ni6(oi6 oi6Var, int i) {
        this.a = i;
        this.b = oi6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        oi6 oi6Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(oi6Var.L.b());
            case 1:
                return Float.valueOf(oi6Var.L.e());
            default:
                return Float.valueOf(oi6Var.L.a() - oi6Var.L.d());
        }
    }
}
