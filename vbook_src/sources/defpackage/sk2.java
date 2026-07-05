package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk2  reason: default package */
/* loaded from: classes3.dex */
public final class sk2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final long d;
    public final /* synthetic */ gk2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk2(gk2 gk2Var, String str, long j, kk2 kk2Var, byte b) {
        super(kk2Var);
        str.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.e;
        switch (i) {
            case 0:
                ((mm) gk2Var.a).o(new String[]{"DbBook"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbBook"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.e;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(944957647, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE hidden = 0\n    AND (name LIKE ('%' || ? || '%')\n        OR author LIKE ('%' || ? || '%'))\nORDER BY lastRead DESC\nLIMIT ?", xt4Var, 3, new u0(this, 22));
            default:
                return ((mm) gk2Var.a).G(747890163, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE category LIKE ('%' || ? || '%')\nORDER BY lastRead DESC\nLIMIT ?", xt4Var, 2, new u0(this, 24));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.e;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbBook"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbBook"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:find";
            default:
                return "DbBook.sq:getByCategoryPreview";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk2(gk2 gk2Var, String str, long j, kk2 kk2Var) {
        super(kk2Var);
        str.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = j;
    }
}
