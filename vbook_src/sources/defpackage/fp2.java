package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fp2  reason: default package */
/* loaded from: classes3.dex */
public final class fp2 extends pf9 {
    public final String b;
    public final int c;
    public final String d;
    public final /* synthetic */ gk2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp2(gk2 gk2Var, String str, int i, String str2, dp2 dp2Var) {
        super(dp2Var);
        str.getClass();
        str2.getClass();
        this.e = gk2Var;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        ((mm) this.e.a).o(new String[]{"DbQtWord"}, pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        gk2 gk2Var = this.e;
        return ((mm) gk2Var.a).G(-1434769069, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE word = ? AND type = ? AND bookId = ?\nLIMIT 1", xt4Var, 3, new qk2(18, this, gk2Var));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.e.a).V(new String[]{"DbQtWord"}, pl4Var);
    }

    public final String toString() {
        return "DbQtWord.sq:getByNameAndType";
    }
}
