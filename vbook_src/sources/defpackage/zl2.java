package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zl2  reason: default package */
/* loaded from: classes3.dex */
public final class zl2 extends pf9 {
    public final /* synthetic */ int b = 2;
    public final String c;
    public final int d;
    public final /* synthetic */ c3e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl2(gk2 gk2Var, String str, int i, ym2 ym2Var) {
        super(ym2Var);
        str.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        switch (i) {
            case 0:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbBookmark"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbContent"}, pl4Var);
                return;
            default:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbQtWord"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        switch (i) {
            case 0:
                gk2 gk2Var = (gk2) c3eVar;
                return ((mm) gk2Var.a).G(324995578, "SELECT DbBookmark.id, DbBookmark.bookId, DbBookmark.chapterIndex, DbBookmark.chapterName, DbBookmark.type, DbBookmark.content, DbBookmark.description, DbBookmark.color, DbBookmark.startPosition, DbBookmark.endPosition, DbBookmark.createAt\nFROM DbBookmark\nWHERE bookId = ? AND type = ?\nORDER BY createAt DESC", xt4Var, 2, new qk2(8, this, gk2Var));
            case 1:
                gk2 gk2Var2 = (gk2) c3eVar;
                return ((mm) gk2Var2.a).G(-884297845, "SELECT DbContent.id, DbContent.bookId, DbContent.position, DbContent.content, DbContent.createAt, DbContent.updateAt\nFROM DbContent\nWHERE bookId = ? AND position = ?\nLIMIT 1", xt4Var, 2, new qk2(11, this, gk2Var2));
            default:
                gk2 gk2Var3 = (gk2) c3eVar;
                return ((mm) gk2Var3.a).G(553689284, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE bookId = ? AND type = ?\nORDER BY createAt DESC", xt4Var, 2, new qk2(17, this, gk2Var3));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbBookmark"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbContent"}, pl4Var);
                return;
            default:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbQtWord"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBookmark.sq:getBookmarkByType";
            case 1:
                return "DbContent.sq:getContent";
            default:
                return "DbQtWord.sq:getBookWords";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl2(gk2 gk2Var, String str, int i, yl2 yl2Var) {
        super(yl2Var);
        str.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl2(gk2 gk2Var, String str, int i, dp2 dp2Var) {
        super(dp2Var);
        str.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = i;
    }
}
