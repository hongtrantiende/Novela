package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: am2  reason: default package */
/* loaded from: classes3.dex */
public final class am2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am2(gk2 gk2Var, String str, yl2 yl2Var) {
        super(yl2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbBookmark"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbBookmark"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-127429233, "SELECT id\nFROM DbBookmark\nWHERE bookId = ?", xt4Var, 1, new al2(this, 4));
            default:
                return ((mm) gk2Var.a).G(-826947286, "SELECT DbBookmark.id, DbBookmark.bookId, DbBookmark.chapterIndex, DbBookmark.chapterName, DbBookmark.type, DbBookmark.content, DbBookmark.description, DbBookmark.color, DbBookmark.startPosition, DbBookmark.endPosition, DbBookmark.createAt\nFROM DbBookmark\nWHERE bookId = ?\nORDER BY createAt DESC", xt4Var, 1, new al2(this, 5));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbBookmark"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbBookmark"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBookmark.sq:getBookmarkIds";
            default:
                return "DbBookmark.sq:getBookmarks";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am2(gk2 gk2Var, String str, bk2 bk2Var) {
        super(bk2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
