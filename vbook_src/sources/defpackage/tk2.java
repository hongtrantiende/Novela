package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tk2  reason: default package */
/* loaded from: classes3.dex */
public final class tk2 extends pf9 {
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final /* synthetic */ gk2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk2(gk2 gk2Var, String str, long j, long j2, long j3, long j4, kk2 kk2Var) {
        super(kk2Var);
        str.getClass();
        this.g = gk2Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        ((mm) this.g.a).o(new String[]{"DbBook"}, pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        return ((mm) this.g.a).G(-1568440160, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE category LIKE ('%' || ? || '%') AND hidden = 0\nORDER BY\n    CASE WHEN ? = 0 THEN\n        CASE ?\n            WHEN 0 THEN lastRead\n            WHEN 1 THEN createAt\n            WHEN 2 THEN updateAt\n            WHEN 3 THEN lastReadChapterPercent\n            WHEN 4 THEN newUpdateCount\n            WHEN 5 THEN totalChapter\n            ELSE lastRead\n        END\n    END ASC,\n    CASE WHEN ? = 1 THEN\n        CASE ?\n            WHEN 0 THEN lastRead\n            WHEN 1 THEN createAt\n            WHEN 2 THEN updateAt\n            WHEN 3 THEN lastReadChapterPercent\n            WHEN 4 THEN newUpdateCount\n            WHEN 5 THEN totalChapter\n            ELSE lastRead\n        END\n    END DESC\nLIMIT ? OFFSET ?", xt4Var, 7, new u0(this, 23));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.g.a).V(new String[]{"DbBook"}, pl4Var);
    }

    public final String toString() {
        return "DbBook.sq:getByCategoryPaged";
    }
}
