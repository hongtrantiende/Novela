package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jn2  reason: default package */
/* loaded from: classes3.dex */
public final class jn2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn2(gk2 gk2Var, String str, fn2 fn2Var, byte b) {
        super(fn2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbDownload"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).o(new String[]{"DbDownload"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbDownload"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-970197316, "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nWHERE bookId = ?", xt4Var, 1, new al2(this, 20));
            case 1:
                return ((mm) gk2Var.a).G(987388545, "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nWHERE id = ?\nLIMIT 1", xt4Var, 1, new al2(this, 21));
            default:
                return ((mm) gk2Var.a).G(1550152147, "SELECT status\nFROM DbDownload\nWHERE bookId = ?", xt4Var, 1, new al2(this, 22));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbDownload"}, pl4Var);
                return;
            case 1:
                ((mm) gk2Var.a).V(new String[]{"DbDownload"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbDownload"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbDownload.sq:getByBookId";
            case 1:
                return "DbDownload.sq:get";
            default:
                return "DbDownload.sq:getStatus";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn2(gk2 gk2Var, String str, fn2 fn2Var) {
        super(fn2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn2(gk2 gk2Var, String str, fn2 fn2Var, char c) {
        super(fn2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
