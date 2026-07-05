package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u2a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u2a implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2a b;

    public /* synthetic */ u2a(w2a w2aVar, int i) {
        this.a = i;
        this.b = w2aVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        w2a w2aVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(w2aVar.J);
            default:
                hn4 hn4Var = w2aVar.l0;
                if (!hn4Var.a.J) {
                    return null;
                }
                dn4 M1 = hn4Var.M1();
                if (!M1.a()) {
                    return null;
                }
                if (M1.b()) {
                    return hn4Var.K1(null);
                }
                hn4 f = ((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).f();
                if (f == null) {
                    return null;
                }
                return f.K1(voe.u(hn4Var));
        }
    }
}
