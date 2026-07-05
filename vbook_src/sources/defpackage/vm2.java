package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vm2  reason: default package */
/* loaded from: classes3.dex */
public final class vm2 extends pf9 {
    public final /* synthetic */ int b = 1;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm2(gk2 gk2Var, String str, al2 al2Var) {
        super(al2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbChapter"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbChapter"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-112864891, "SELECT id\nFROM DbChapter\nWHERE bookId = ?", xt4Var, 1, new al2(this, 13));
            default:
                return ((mm) gk2Var.a).G(-1363244384, "SELECT DbChapter.id, DbChapter.bookId, DbChapter.pathId, DbChapter.position, DbChapter.path, DbChapter.count, DbChapter.downloaded, DbChapter.pay, DbChapter.lock, DbChapter.lastRead, DbChapter.createAt, DbChapter.updateAt\nFROM DbChapter\nWHERE bookId = ?\nORDER BY position ASC", xt4Var, 1, new al2(this, 14));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbChapter"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbChapter"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbChapter.sq:getChapterIds";
            default:
                return "DbChapter.sq:getChapters";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm2(gk2 gk2Var, String str, fm2 fm2Var) {
        super(fm2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
