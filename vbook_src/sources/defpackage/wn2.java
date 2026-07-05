package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wn2  reason: default package */
/* loaded from: classes3.dex */
public final class wn2 extends pf9 {
    public final /* synthetic */ int b = 1;
    public final String c;
    public final String d;
    public final /* synthetic */ c3e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(gk2 gk2Var, String str, String str2, dp2 dp2Var) {
        super(dp2Var);
        str.getClass();
        str2.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        switch (i) {
            case 0:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbExtensionLocalStorage"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbQtWord"}, pl4Var);
                return;
            default:
                ((mm) ((gk2) c3eVar).a).o(new String[]{"DbTocLink"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        String str;
        int i = this.b;
        c3e c3eVar = this.e;
        switch (i) {
            case 0:
                return ((mm) ((lm2) c3eVar).a).G(489063635, "SELECT content FROM DbExtensionLocalStorage\nWHERE extensionId = ? AND key = ?\nLIMIT 1", xt4Var, 2, new al2(this, 29));
            case 1:
                return ((mm) ((gk2) c3eVar).a).G(1409449598, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE word = ? AND bookId = ?\nLIMIT 1", xt4Var, 2, new bo2(this, 20));
            default:
                mm mmVar = (mm) ((gk2) c3eVar).a;
                if (this.d == null) {
                    str = "IS";
                } else {
                    str = "=";
                }
                return mmVar.G(null, l4b.z("\n    |SELECT DbTocLink.id, DbTocLink.bookId, DbTocLink.title, DbTocLink.path, DbTocLink.parentId, DbTocLink.position, DbTocLink.createAt, DbTocLink.updateAt\n    |FROM DbTocLink\n    |WHERE bookId = ? AND path " + str + " ?\n    |LIMIT 1\n    "), xt4Var, 2, new bo2(this, 26));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbExtensionLocalStorage"}, pl4Var);
                return;
            case 1:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbQtWord"}, pl4Var);
                return;
            default:
                ((mm) ((gk2) c3eVar).a).V(new String[]{"DbTocLink"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbExtensionLocalStorage.sq:getByKeyAndExtensionId";
            case 1:
                return "DbQtWord.sq:getByName";
            default:
                return "DbTocLink.sq:getByPath";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(gk2 gk2Var, String str, String str2, up2 up2Var) {
        super(up2Var);
        str.getClass();
        this.e = gk2Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(lm2 lm2Var, String str, String str2, hn2 hn2Var) {
        super(hn2Var);
        str.getClass();
        this.e = lm2Var;
        this.c = str;
        this.d = str2;
    }
}
