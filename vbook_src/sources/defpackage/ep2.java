package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ep2  reason: default package */
/* loaded from: classes3.dex */
public final class ep2 extends pf9 {
    public final /* synthetic */ int b = 2;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(gk2 gk2Var, String str, dp2 dp2Var) {
        super(dp2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                ((mm) gk2Var.a).o(new String[]{"DbQtWord"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).o(new String[]{"DbQtWord"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbQtWord"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(829261789, "SELECT id\nFROM DbQtWord\nWHERE bookId = ?", xt4Var, 1, new bo2(this, 17));
            case 1:
                return ((mm) gk2Var.a).G(-1938812115, "SELECT word\nFROM DbQtWord\nWHERE bookId = ?", xt4Var, 1, new bo2(this, 18));
            default:
                return ((mm) gk2Var.a).G(1435498232, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE bookId = ?\nORDER BY createAt ASC", xt4Var, 1, new bo2(this, 19));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbQtWord"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).V(new String[]{"DbQtWord"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbQtWord"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbQtWord.sq:getBookOnlyWordIds";
            case 1:
                return "DbQtWord.sq:getBookOnlyWordNames";
            default:
                return "DbQtWord.sq:getBookOnlyWords";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(gk2 gk2Var, String str, yo2 yo2Var) {
        super(yo2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(gk2 gk2Var, yo2 yo2Var) {
        super(yo2Var);
        this.d = gk2Var;
        this.c = "general";
    }
}
