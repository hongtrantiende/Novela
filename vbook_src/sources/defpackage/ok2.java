package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ok2  reason: default package */
/* loaded from: classes3.dex */
public final class ok2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(gk2 gk2Var, String str, kk2 kk2Var) {
        super(kk2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbBook"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).o(new String[]{"DbBook"}, pl4Var);
                return;
            case 2:
                ((mm) gk2Var.a).o(new String[]{"DbBook"}, pl4Var);
                return;
            case 3:
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
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-1797476338, "SELECT COUNT(*)\nFROM DbBook\nWHERE category LIKE ('%' || ? || '%')", xt4Var, 1, new u0(this, 21));
            case 1:
                return ((mm) gk2Var.a).G(274842645, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE category LIKE ('%' || ? || '%')", xt4Var, 1, new u0(this, 25));
            case 2:
                return ((mm) gk2Var.a).G(931125495, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE pathId = ?\nLIMIT 1", xt4Var, 1, new u0(this, 28));
            case 3:
                return ((mm) gk2Var.a).G(-523705984, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new al2(this, 0));
            default:
                return ((mm) gk2Var.a).G(-410001490, "SELECT translate\nFROM DbBook\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new al2(this, 3));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbBook"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).V(new String[]{"DbBook"}, pl4Var);
                return;
            case 2:
                ((mm) gk2Var.a).V(new String[]{"DbBook"}, pl4Var);
                return;
            case 3:
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
                return "DbBook.sq:countByCategory";
            case 1:
                return "DbBook.sq:getByCategory";
            case 2:
                return "DbBook.sq:getByPathId";
            case 3:
                return "DbBook.sq:get";
            default:
                return "DbBook.sq:getTranslate";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(gk2 gk2Var, String str, bk2 bk2Var) {
        super(bk2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(gk2 gk2Var, String str, kk2 kk2Var, char c) {
        super(kk2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(gk2 gk2Var, String str, kk2 kk2Var, byte b) {
        super(kk2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(gk2 gk2Var, String str, kk2 kk2Var, int i) {
        super(kk2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
