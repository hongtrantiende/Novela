package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g36  reason: default package */
/* loaded from: classes3.dex */
public final class g36 extends b36 {
    public final w5a D;
    public final /* synthetic */ l36 E;

    public g36(l36 l36Var, w5a w5aVar) {
        this.E = l36Var;
        this.D = w5aVar;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return false;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        l36 l36Var = this.E;
        Object I = l36Var.I();
        if (!(I instanceof ft1)) {
            I = m36.a(I);
        }
        this.D.j(l36Var, I);
    }
}
