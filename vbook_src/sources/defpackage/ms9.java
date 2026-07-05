package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms9  reason: default package */
/* loaded from: classes3.dex */
public final class ms9 extends b36 {
    public final d36 D;

    public ms9(d36 d36Var) {
        this.D = d36Var;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return false;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        Object I = p().I();
        boolean z = I instanceof ft1;
        d36 d36Var = this.D;
        if (z) {
            d36Var.resumeWith(hre.i(((ft1) I).a));
        } else {
            d36Var.resumeWith(m36.a(I));
        }
    }
}
