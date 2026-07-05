package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gm2  reason: default package */
/* loaded from: classes3.dex */
public final class gm2 extends pf9 {
    public final /* synthetic */ int b = 1;
    public final String c;
    public final long d;
    public final /* synthetic */ c3e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm2(lm2 lm2Var, String str, long j, yo2 yo2Var) {
        super(yo2Var);
        str.getClass();
        this.e = lm2Var;
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        switch (i) {
            case 0:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbBrowserHistory"}, pl4Var);
                return;
            default:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbSearch"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        switch (i) {
            case 0:
                return ((mm) ((lm2) c3eVar).a).G(-820839486, "SELECT DbBrowserHistory.url, DbBrowserHistory.title, DbBrowserHistory.createAt FROM DbBrowserHistory\nWHERE title LIKE ('%' || ? || '%') OR url LIKE ('%' || ? || '%')\nORDER BY createAt DESC\nLIMIT ?", xt4Var, 3, new al2(this, 7));
            default:
                return ((mm) ((lm2) c3eVar).a).G(-1608154930, "SELECT DbSearch.key, DbSearch.createAt\nFROM DbSearch\nWHERE key LIKE ('%' || ? || '%')\nORDER BY createAt DESC\nLIMIT ?", xt4Var, 2, new bo2(this, 23));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.e;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbBrowserHistory"}, pl4Var);
                return;
            default:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbSearch"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBrowserHistory.sq:findHistory";
            default:
                return "DbSearch.sq:find";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm2(lm2 lm2Var, String str, fm2 fm2Var) {
        super(fm2Var);
        this.e = lm2Var;
        this.c = str;
        this.d = 10L;
    }
}
