package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e36  reason: default package */
/* loaded from: classes3.dex */
public final class e36 extends b36 {
    public final l36 D;
    public final f36 E;
    public final yg1 F;
    public final Object G;

    public e36(l36 l36Var, f36 f36Var, yg1 yg1Var, Object obj) {
        this.D = l36Var;
        this.E = f36Var;
        this.F = yg1Var;
        this.G = obj;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return false;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        yg1 yg1Var = this.F;
        yg1 U = l36.U(yg1Var);
        l36 l36Var = this.D;
        f36 f36Var = this.E;
        Object obj = this.G;
        if (U == null || !l36Var.l0(f36Var, U, obj)) {
            f36Var.a.d(new lq6(2), 2);
            yg1 U2 = l36.U(yg1Var);
            if (U2 != null && l36Var.l0(f36Var, U2, obj)) {
                return;
            }
            l36Var.l(l36Var.z(f36Var, obj));
        }
    }
}
