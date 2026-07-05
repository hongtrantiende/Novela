package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vp2  reason: default package */
/* loaded from: classes3.dex */
public final class vp2 extends pf9 {
    public final /* synthetic */ int b = 2;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(gk2 gk2Var, String str, up2 up2Var) {
        super(up2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbTocLink"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).o(new String[]{"DbTocLink"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbTocLink"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-2133066747, "SELECT DbTocLink.id, DbTocLink.bookId, DbTocLink.title, DbTocLink.path, DbTocLink.parentId, DbTocLink.position, DbTocLink.createAt, DbTocLink.updateAt\nFROM DbTocLink\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new bo2(this, 27));
            case 1:
                return ((mm) gk2Var.a).G(2133352411, "SELECT id\nFROM DbTocLink\nWHERE bookId = ?", xt4Var, 1, new bo2(this, 28));
            default:
                return ((mm) gk2Var.a).G(1803335286, "SELECT DbTocLink.id, DbTocLink.bookId, DbTocLink.title, DbTocLink.path, DbTocLink.parentId, DbTocLink.position, DbTocLink.createAt, DbTocLink.updateAt\nFROM DbTocLink\nWHERE bookId = ?\nORDER BY position", xt4Var, 1, new bo2(this, 29));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbTocLink"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).V(new String[]{"DbTocLink"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbTocLink"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbTocLink.sq:get";
            case 1:
                return "DbTocLink.sq:getTocLinkIds";
            default:
                return "DbTocLink.sq:getTocLinks";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(gk2 gk2Var, String str, up2 up2Var, byte b) {
        super(up2Var);
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(gk2 gk2Var, String str, yo2 yo2Var) {
        super(yo2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
