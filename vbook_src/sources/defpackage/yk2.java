package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yk2  reason: default package */
/* loaded from: classes3.dex */
public final class yk2 extends pf9 {
    public final int b;
    public final String c;
    public final long d;
    public final long e;
    public final /* synthetic */ gk2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk2(gk2 gk2Var, String str, long j, long j2, kk2 kk2Var) {
        super(kk2Var);
        str.getClass();
        this.f = gk2Var;
        this.b = 1;
        this.c = str;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        ((mm) this.f.a).o(new String[]{"DbBook"}, pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        gk2 gk2Var = this.f;
        return ((mm) gk2Var.a).G(-1646852649, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = ? AND hidden = 0\nORDER BY\n    (category LIKE ('%' || ? || '%')) DESC,\n    lastRead DESC\nLIMIT ? OFFSET ?", xt4Var, 4, new qk2(4, gk2Var, this));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.f.a).V(new String[]{"DbBook"}, pl4Var);
    }

    public final String toString() {
        return "DbBook.sq:getInLocationPagedCategoryFirst";
    }
}
