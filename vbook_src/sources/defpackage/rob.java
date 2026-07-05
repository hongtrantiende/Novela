package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rob  reason: default package */
/* loaded from: classes.dex */
public final class rob implements oob {
    public final long a;
    public final /* synthetic */ sob b;

    public rob(sob sobVar, long j) {
        this.b = sobVar;
        this.a = j;
    }

    @Override // defpackage.oob
    public final long E(sc6 sc6Var) {
        sc6 sc6Var2 = (sc6) this.b.N.getValue();
        if (sc6Var2 != null) {
            if (!sc6Var2.t()) {
                return 0L;
            }
            return sc6Var.f0(sc6Var2.L(this.a));
        }
        ov5.d("Tried to open context menu before the anchor was placed.");
        ls2.c();
        return 0L;
    }

    @Override // defpackage.oob
    public final rk9 J(sc6 sc6Var) {
        return npe.n(E(sc6Var), 0L);
    }

    @Override // defpackage.oob
    public final nob z0() {
        return mwe.j(this.b);
    }
}
