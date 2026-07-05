package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xk2  reason: default package */
/* loaded from: classes3.dex */
public final class xk2 extends pf9 {
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final /* synthetic */ gk2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk2(gk2 gk2Var, int i, long j, long j2, long j3, long j4, kk2 kk2Var) {
        super(kk2Var);
        this.h = gk2Var;
        this.b = 1;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        ((mm) this.h.a).o(new String[]{"DbBook"}, pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        gk2 gk2Var = this.h;
        return ((mm) gk2Var.a).G(1322218506, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = ? AND type = ? AND hidden = 0\nORDER BY\n    CASE WHEN ? = 0 THEN\n        CASE ?\n            WHEN 0 THEN lastRead\n            WHEN 1 THEN createAt\n            WHEN 2 THEN updateAt\n            WHEN 3 THEN lastReadChapterPercent\n            WHEN 4 THEN newUpdateCount\n            WHEN 5 THEN totalChapter\n            ELSE lastRead\n        END\n    END ASC,\n    CASE WHEN ? = 1 THEN\n        CASE ?\n            WHEN 0 THEN lastRead\n            WHEN 1 THEN createAt\n            WHEN 2 THEN updateAt\n            WHEN 3 THEN lastReadChapterPercent\n            WHEN 4 THEN newUpdateCount\n            WHEN 5 THEN totalChapter\n            ELSE lastRead\n        END\n    END DESC\nLIMIT ? OFFSET ?", xt4Var, 8, new qk2(3, gk2Var, this));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.h.a).V(new String[]{"DbBook"}, pl4Var);
    }

    public final String toString() {
        return "DbBook.sq:getInLocationByTypePaged";
    }
}
