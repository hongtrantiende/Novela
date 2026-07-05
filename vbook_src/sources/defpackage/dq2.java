package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dq2  reason: default package */
/* loaded from: classes3.dex */
public final class dq2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(gk2 gk2Var, String str, aq2 aq2Var) {
        super(aq2Var);
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
                ((mm) gk2Var.a).o(new String[]{"DbTrash"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).o(new String[]{"DbTrash"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        switch (i) {
            case 0:
                return ((mm) gk2Var.a).G(-1321977948, "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nWHERE bookId = ? AND type = 0\nORDER BY createAt ASC", xt4Var, 1, new cq2(this, 0));
            default:
                return ((mm) gk2Var.a).G(-989669999, "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nWHERE word = ?", xt4Var, 1, new cq2(this, 1));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        gk2 gk2Var = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) gk2Var.a).V(new String[]{"DbTrash"}, pl4Var);
                return;
            default:
                ((mm) gk2Var.a).V(new String[]{"DbTrash"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbTrash.sq:getBookTextWords";
            default:
                return "DbTrash.sq:getByName";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(gk2 gk2Var, String str, aq2 aq2Var, byte b) {
        super(aq2Var);
        str.getClass();
        this.d = gk2Var;
        this.c = str;
    }
}
