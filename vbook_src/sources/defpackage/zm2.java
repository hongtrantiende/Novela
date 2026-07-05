package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zm2  reason: default package */
/* loaded from: classes3.dex */
public final class zm2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(gk2 gk2Var, String str, ym2 ym2Var) {
        super(ym2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbContent"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).o(new String[]{"DbContent"}, pl4Var);
                return;
            case 2:
                ((mm) gk2Var.a).o(new String[]{"DbContent"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbContent"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-233788159, "SELECT COUNT(*)\nFROM DbContent\nWHERE bookId = ?", xt4Var, 1, new al2(this, 15));
            case 1:
                return ((mm) gk2Var.a).G(802733743, "SELECT 1\nFROM DbContent\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new al2(this, 16));
            case 2:
                return ((mm) gk2Var.a).G(1212366637, "SELECT id\nFROM DbContent\nWHERE bookId = ?", xt4Var, 1, new al2(this, 17));
            default:
                return ((mm) gk2Var.a).G(-280727282, "SELECT DbContent.id, DbContent.bookId, DbContent.position, DbContent.content, DbContent.createAt, DbContent.updateAt\nFROM DbContent\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new al2(this, 18));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbContent"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).V(new String[]{"DbContent"}, pl4Var);
                return;
            case 2:
                ((mm) gk2Var.a).V(new String[]{"DbContent"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbContent"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbContent.sq:countContents";
            case 1:
                return "DbContent.sq:exist";
            case 2:
                return "DbContent.sq:getContentIds";
            default:
                return "DbContent.sq:get";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(gk2 gk2Var, String str, fm2 fm2Var, char c) {
        super(fm2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(gk2 gk2Var, String str, fm2 fm2Var) {
        super(fm2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(gk2 gk2Var, String str, fm2 fm2Var, byte b) {
        super(fm2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
