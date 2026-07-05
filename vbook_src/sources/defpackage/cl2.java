package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl2  reason: default package */
/* loaded from: classes3.dex */
public final class cl2 extends pf9 {
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final /* synthetic */ gk2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl2(gk2 gk2Var, long j, long j2, long j3, long j4, kk2 kk2Var) {
        super(kk2Var);
        this.f = gk2Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        ((mm) this.f.a).o(new String[]{"DbBook"}, pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        return ((mm) this.f.a).G(-861670375, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE hidden = 0 AND (totalReadTime > 0 OR totalListenedTime > 0)\nORDER BY\n    CASE WHEN ? = 0 THEN\n        CASE ?\n            WHEN 0 THEN totalReadTime + totalListenedTime\n            WHEN 1 THEN totalReadTime\n            WHEN 2 THEN totalListenedTime\n            ELSE totalReadTime + totalListenedTime\n        END\n    END DESC,\n    CASE WHEN ? = 1 THEN\n        CASE ?\n            WHEN 0 THEN totalReadTime + totalListenedTime\n            WHEN 1 THEN totalReadTime\n            WHEN 2 THEN totalListenedTime\n            ELSE totalReadTime + totalListenedTime\n        END\n    END ASC\nLIMIT ? OFFSET ?", xt4Var, 6, new al2(this, 2));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.f.a).V(new String[]{"DbBook"}, pl4Var);
    }

    public final String toString() {
        return "DbBook.sq:getTopBooksByTime";
    }
}
