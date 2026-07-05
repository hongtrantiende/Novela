package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dx3  reason: default package */
/* loaded from: classes.dex */
public final class dx3 extends ex3 {
    public final /* synthetic */ int a;
    public final gm9 b;

    public /* synthetic */ dx3(gm9 gm9Var, int i) {
        this.a = i;
        this.b = gm9Var;
    }

    @Override // defpackage.ex3
    public final int a() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        int i = this.a;
        gm9 gm9Var = this.b;
        cp3Var.getClass();
        cp3Var2.getClass();
        switch (i) {
            case 0:
                return gm9Var.a(cp3Var2.Z());
            case 1:
                return gm9Var.a(cp3Var2.V());
            case 2:
                return gm9Var.a(g9a.d0(new ki4(3, sl1.V(cp3Var2.h()), new u83(21)), ""));
            default:
                return gm9Var.a(g9a.d0(new ki4(3, g9a.b0(new n38(cp3Var2, cm9.a(y28.class))), new u83(21)), ""));
        }
    }

    public final String toString() {
        int i = this.a;
        gm9 gm9Var = this.b;
        switch (i) {
            case 0:
                return hl5.n(":matches(", gm9Var.d(), ")");
            case 1:
                return hl5.n(":matchesOwn(", gm9Var.d(), ")");
            case 2:
                return hl5.n(":matchesWholeOwnText(", gm9Var.d(), ")");
            default:
                return hl5.n(":matchesWholeText(", gm9Var.d(), ")");
        }
    }
}
