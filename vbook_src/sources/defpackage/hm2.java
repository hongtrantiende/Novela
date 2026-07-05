package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hm2  reason: default package */
/* loaded from: classes3.dex */
public final class hm2 extends pf9 {
    public final /* synthetic */ int b = 0;
    public final long c;
    public final /* synthetic */ c3e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(lm2 lm2Var, fm2 fm2Var) {
        super(fm2Var);
        this.d = lm2Var;
        this.c = 10L;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        switch (i) {
            case 0:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbBrowserHistory"}, pl4Var);
                return;
            default:
                ((mm) ((lm2) c3eVar).a).o(new String[]{"DbEmoji"}, pl4Var);
                return;
        }
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        switch (i) {
            case 0:
                return ((mm) ((lm2) c3eVar).a).G(-2137425833, "SELECT DbBrowserHistory.url, DbBrowserHistory.title, DbBrowserHistory.createAt FROM DbBrowserHistory\nORDER BY createAt DESC\nLIMIT ?", xt4Var, 1, new al2(this, 8));
            default:
                return ((mm) ((lm2) c3eVar).a).G(803881866, "SELECT DbEmoji.id, DbEmoji.category, DbEmoji.url, DbEmoji.lastUse\nFROM DbEmoji\nWHERE lastUse > 0\nORDER BY lastUse DESC\nLIMIT ?", xt4Var, 1, new al2(this, 26));
        }
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        int i = this.b;
        c3e c3eVar = this.d;
        pl4Var.getClass();
        switch (i) {
            case 0:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbBrowserHistory"}, pl4Var);
                return;
            default:
                ((mm) ((lm2) c3eVar).a).V(new String[]{"DbEmoji"}, pl4Var);
                return;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBrowserHistory.sq:getHistory";
            default:
                return "DbEmoji.sq:getRecentEmoji";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(lm2 lm2Var, hn2 hn2Var) {
        super(hn2Var);
        this.d = lm2Var;
        this.c = 30L;
    }
}
