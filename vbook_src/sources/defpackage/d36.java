package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d36  reason: default package */
/* loaded from: classes3.dex */
public final class d36 extends f61 {
    public final l36 G;

    public d36(m42 m42Var, l36 l36Var) {
        super(1, m42Var);
        this.G = l36Var;
    }

    @Override // defpackage.f61
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.f61
    public final Throwable q(l36 l36Var) {
        Throwable d;
        Object I = this.G.I();
        if ((I instanceof f36) && (d = ((f36) I).d()) != null) {
            return d;
        }
        if (I instanceof ft1) {
            return ((ft1) I).a;
        }
        return l36Var.getCancellationException();
    }
}
