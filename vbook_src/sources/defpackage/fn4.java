package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fn4  reason: default package */
/* loaded from: classes.dex */
public final class fn4 extends m03 implements r78, wx1 {
    public final hn4 M;
    public ai6 N;

    public fn4() {
        hn4 hn4Var = new hn4(0, new xe1(2, this, fn4.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 6), 9);
        H1(hn4Var);
        this.M = hn4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zl9, java.lang.Object] */
    @Override // defpackage.r78
    public final void S0() {
        ?? obj = new Object();
        iue.R(this, new hg(15, obj, this));
        ai6 ai6Var = (ai6) obj.a;
        if (this.M.M1().b()) {
            ai6 ai6Var2 = this.N;
            if (ai6Var2 != null) {
                ai6Var2.b();
            }
            if (ai6Var != null) {
                ai6Var.a();
            } else {
                ai6Var = null;
            }
            this.N = ai6Var;
        }
    }
}
