package defpackage;

import java.util.Collection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wk2  reason: default package */
/* loaded from: classes3.dex */
public final class wk2 extends pf9 {
    public final int b;
    public final Collection c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final /* synthetic */ gk2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk2(gk2 gk2Var, Collection collection, long j, long j2, long j3, long j4, kk2 kk2Var) {
        super(kk2Var);
        collection.getClass();
        this.h = gk2Var;
        this.b = 1;
        this.c = collection;
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
        Collection collection = this.c;
        int size = collection.size();
        gk2 gk2Var = this.h;
        String Y = gk2.Y(gk2Var, size);
        mm mmVar = (mm) gk2Var.a;
        return mmVar.G(null, l4b.z("\n          |SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\n          |FROM DbBook\n          |WHERE location = ? AND format IN " + Y + " AND hidden = 0\n          |ORDER BY\n          |    CASE WHEN ? = 0 THEN\n          |        CASE ?\n          |            WHEN 0 THEN lastRead\n          |            WHEN 1 THEN createAt\n          |            WHEN 2 THEN updateAt\n          |            WHEN 3 THEN lastReadChapterPercent\n          |            WHEN 4 THEN newUpdateCount\n          |            WHEN 5 THEN totalChapter\n          |            ELSE lastRead\n          |        END\n          |    END ASC,\n          |    CASE WHEN ? = 1 THEN\n          |        CASE ?\n          |            WHEN 0 THEN lastRead\n          |            WHEN 1 THEN createAt\n          |            WHEN 2 THEN updateAt\n          |            WHEN 3 THEN lastReadChapterPercent\n          |            WHEN 4 THEN newUpdateCount\n          |            WHEN 5 THEN totalChapter\n          |            ELSE lastRead\n          |        END\n          |    END DESC\n          |LIMIT ? OFFSET ?\n          "), xt4Var, collection.size() + 7, new qk2(2, gk2Var, this));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.h.a).V(new String[]{"DbBook"}, pl4Var);
    }

    public final String toString() {
        return "DbBook.sq:getInLocationByFormatsPaged";
    }
}
