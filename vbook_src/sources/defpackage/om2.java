package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om2  reason: default package */
/* loaded from: classes3.dex */
public final class om2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ lm2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om2(lm2 lm2Var, String str, fm2 fm2Var, byte b) {
        super(fm2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        lm2 lm2Var = this.d;
        switch (i) {
            case 0:
                ((mm) lm2Var.a).o(new String[]{"DbCategory"}, pl4Var);
                return;
            default:
                ((mm) lm2Var.a).o(new String[]{"DbCategory"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        lm2 lm2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) lm2Var.a).G(562042029, "SELECT DbCategory.id, DbCategory.name, DbCategory.createAt\nFROM DbCategory\nWHERE name = ?\nLIMIT 1", xt4Var, 1, new al2(this, 10));
            default:
                return ((mm) lm2Var.a).G(-341666485, "SELECT DbCategory.id, DbCategory.name, DbCategory.createAt\nFROM DbCategory\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new al2(this, 11));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        lm2 lm2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) lm2Var.a).V(new String[]{"DbCategory"}, pl4Var);
                return;
            default:
                ((mm) lm2Var.a).V(new String[]{"DbCategory"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbCategory.sq:getByName";
            default:
                return "DbCategory.sq:get";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om2(lm2 lm2Var, String str, fm2 fm2Var) {
        super(fm2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }
}
