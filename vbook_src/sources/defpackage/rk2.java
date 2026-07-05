package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rk2  reason: default package */
/* loaded from: classes3.dex */
public final class rk2 extends pf9 {
    public final int b;
    public final int c;
    public final /* synthetic */ gk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk2(gk2 gk2Var, int i, bk2 bk2Var) {
        super(bk2Var);
        this.d = gk2Var;
        this.b = 1;
        this.c = i;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        ((mm) this.d.a).o(new String[]{"DbBook"}, pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        gk2 gk2Var = this.d;
        return ((mm) gk2Var.a).G(157295524, "SELECT COUNT(*) FROM DbBook WHERE location = ? AND type = ? AND hidden = 0", xt4Var, 2, new qk2(0, gk2Var, this));
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        ((mm) this.d.a).V(new String[]{"DbBook"}, pl4Var);
    }

    public final String toString() {
        return "DbBook.sq:countInLocationByType";
    }
}
