package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lsd  reason: default package */
/* loaded from: classes.dex */
public final class lsd extends m03 implements wx1, oc6 {
    public btd M;
    public boolean N;
    public xt4 O;
    public xt4 P;
    public boolean Q;
    public boolean R;
    public y78 S;
    public boolean T;
    public y78 U;
    public long V;
    public final hab W;
    public final hab X;

    public lsd(btd btdVar, boolean z, xt4 xt4Var, xt4 xt4Var2) {
        btdVar.getClass();
        this.M = btdVar;
        this.N = z;
        this.O = xt4Var;
        this.P = xt4Var2;
        this.V = -9223372034707292160L;
        hab a = dab.a(new ksd(this, 1));
        H1(a);
        this.W = a;
        hab a2 = dab.a(new ksd(this, 0));
        H1(a2);
        this.X = a2;
    }

    @Override // defpackage.oc6, defpackage.i37
    public final void g(long j) {
        if (!zy5.b(this.V, j)) {
            this.M.i(j);
            if (!this.N) {
                this.M.k(j);
            }
            this.V = j;
        }
    }
}
