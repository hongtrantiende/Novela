package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pk2  reason: default package */
/* loaded from: classes3.dex */
public final class pk2 extends pf9 {
    public final /* synthetic */ int b;
    public final int c;
    public final /* synthetic */ c3e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk2(gk2 gk2Var, bk2 bk2Var) {
        super(bk2Var);
        this.b = 1;
        this.d = gk2Var;
        this.c = 1;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        switch (i) {
            case 0:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbBook"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbBook"}, pl4Var);
                return;
            case 2:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbBook"}, pl4Var);
                return;
            default:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbQtWord"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        switch (i) {
            case 0:
                gk2 gk2Var = (gk2) c3eVar;
                return ((mm) gk2Var.a).G(344107892, "SELECT COUNT(*)\nFROM DbBook\nWHERE type = ? AND location = 1", xt4Var, 1, new k0(29, gk2Var, this));
            case 1:
                gk2 gk2Var2 = (gk2) c3eVar;
                return ((mm) gk2Var2.a).G(1379591571, "SELECT COUNT(*) FROM DbBook WHERE location = ? AND hidden = 0", xt4Var, 1, new qk2(1, gk2Var2, this));
            case 2:
                gk2 gk2Var3 = (gk2) c3eVar;
                return ((mm) gk2Var3.a).G(-843056742, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = ? AND hidden = 0\nORDER BY lastRead DESC", xt4Var, 1, new qk2(6, gk2Var3, this));
            default:
                gk2 gk2Var4 = (gk2) c3eVar;
                return ((mm) gk2Var4.a).G(1961741469, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE bookId = 'general' AND type = ?\nORDER BY createAt DESC", xt4Var, 1, new qk2(19, gk2Var4, this));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbBook"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbBook"}, pl4Var);
                return;
            case 2:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbBook"}, pl4Var);
                return;
            default:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbQtWord"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:countByShelfType";
            case 1:
                return "DbBook.sq:countInLocation";
            case 2:
                return "DbBook.sq:getInLocation";
            default:
                return "DbQtWord.sq:getGeneralWords";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk2(c3e c3eVar, int i, xt4 xt4Var, int i2) {
        super(xt4Var);
        this.b = i2;
        this.d = c3eVar;
        this.c = i;
    }
}
