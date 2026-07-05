package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: po2  reason: default package */
/* loaded from: classes3.dex */
public final class po2 extends pf9 {
    public final /* synthetic */ int b = 1;
    public final String c;
    public final /* synthetic */ lm2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(lm2 lm2Var, String str, ao2 ao2Var, byte b) {
        super(ao2Var);
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
                ((mm) lm2Var.a).o(new String[]{"DbName"}, pl4Var);
                return;
            case 1:
                ((mm) lm2Var.a).o(new String[]{"DbName"}, pl4Var);
                return;
            case 2:
                ((mm) lm2Var.a).o(new String[]{"DbName"}, pl4Var);
                return;
            case 3:
                ((mm) lm2Var.a).o(new String[]{"DbName"}, pl4Var);
                return;
            default:
                ((mm) lm2Var.a).o(new String[]{"DbName"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        lm2 lm2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) lm2Var.a).G(-1545694245, "SELECT id\nFROM DbName\nWHERE bookId = ?", xt4Var, 1, new bo2(this, 7));
            case 1:
                return ((mm) lm2Var.a).G(651040683, "SELECT word\nFROM DbName\nWHERE bookId = ?", xt4Var, 1, new bo2(this, 8));
            case 2:
                return ((mm) lm2Var.a).G(-265295242, "SELECT DbName.id, DbName.bookId, DbName.word, DbName.replace, DbName.ignoreCase, DbName.createAt\nFROM DbName\nWHERE bookId = ?\nORDER BY createAt ASC", xt4Var, 1, new bo2(this, 9));
            case 3:
                return ((mm) lm2Var.a).G(1345454914, "SELECT DbName.id, DbName.bookId, DbName.word, DbName.replace, DbName.ignoreCase, DbName.createAt\nFROM DbName\nWHERE bookId = ? OR bookId = 'general'\nORDER BY createAt ASC", xt4Var, 1, new bo2(this, 10));
            default:
                return ((mm) lm2Var.a).G(-495297344, "SELECT DbName.id, DbName.bookId, DbName.word, DbName.replace, DbName.ignoreCase, DbName.createAt\nFROM DbName\nWHERE word = ?", xt4Var, 1, new bo2(this, 11));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        lm2 lm2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) lm2Var.a).V(new String[]{"DbName"}, pl4Var);
                return;
            case 1:
                ((mm) lm2Var.a).V(new String[]{"DbName"}, pl4Var);
                return;
            case 2:
                ((mm) lm2Var.a).V(new String[]{"DbName"}, pl4Var);
                return;
            case 3:
                ((mm) lm2Var.a).V(new String[]{"DbName"}, pl4Var);
                return;
            default:
                ((mm) lm2Var.a).V(new String[]{"DbName"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbName.sq:getBookOnlyWordIds";
            case 1:
                return "DbName.sq:getBookOnlyWordNames";
            case 2:
                return "DbName.sq:getBookOnlyWords";
            case 3:
                return "DbName.sq:getBookWords";
            default:
                return "DbName.sq:getByName";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(lm2 lm2Var, String str, ao2 ao2Var) {
        super(ao2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(lm2 lm2Var, ao2 ao2Var) {
        super(ao2Var);
        this.d = lm2Var;
        this.c = "general";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(lm2 lm2Var, String str, ao2 ao2Var, char c) {
        super(ao2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(lm2 lm2Var, String str, ao2 ao2Var, int i) {
        super(ao2Var);
        str.getClass();
        this.d = lm2Var;
        this.c = str;
    }
}
