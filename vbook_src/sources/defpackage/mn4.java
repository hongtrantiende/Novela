package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mn4  reason: default package */
/* loaded from: classes.dex */
public final class mn4 extends m03 implements z7a, hz4, wx1, r78, rnc {
    public static final kh5 S = new Object();
    public yu7 M;
    public final xt4 N;
    public jm4 O;
    public ai6 P;
    public i38 Q;
    public final hn4 R;

    public mn4(yu7 yu7Var, int i, xt4 xt4Var) {
        this.M = yu7Var;
        this.N = xt4Var;
        hn4 hn4Var = new hn4(i, new xe1(2, this, mn4.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 7), 10);
        H1(hn4Var);
        this.R = hn4Var;
    }

    @Override // defpackage.mq7
    public final void B1() {
        ai6 ai6Var = this.P;
        if (ai6Var != null) {
            ai6Var.b();
        }
        this.P = null;
    }

    public final void K1(yu7 yu7Var, ez5 ez5Var) {
        kb3 kb3Var;
        if (this.J) {
            w26 w26Var = (w26) ((m41) v1()).b.get(r0f.I);
            if (w26Var != null) {
                kb3Var = w26Var.invokeOnCompletion(new j34(2, yu7Var, ez5Var));
            } else {
                kb3Var = null;
            }
            z87.v(v1(), null, null, new uw2(yu7Var, ez5Var, kb3Var, null, 28), 3);
            return;
        }
        yu7Var.c(ez5Var);
    }

    public final void L1(yu7 yu7Var) {
        jm4 jm4Var;
        if (!c16.i(this.M, yu7Var)) {
            yu7 yu7Var2 = this.M;
            if (yu7Var2 != null && (jm4Var = this.O) != null) {
                yu7Var2.c(new km4(jm4Var));
            }
            this.O = null;
            this.M = yu7Var;
        }
    }

    @Override // defpackage.rnc
    public final Object M() {
        return S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zl9, java.lang.Object] */
    @Override // defpackage.r78
    public final void S0() {
        ?? obj = new Object();
        iue.R(this, new u93(15, obj, this));
        ai6 ai6Var = (ai6) obj.a;
        if (this.R.M1().b()) {
            ai6 ai6Var2 = this.P;
            if (ai6Var2 != null) {
                ai6Var2.b();
            }
            if (ai6Var != null) {
                ai6Var.a();
            } else {
                ai6Var = null;
            }
            this.P = ai6Var;
        }
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        boolean b = this.R.M1().b();
        r76[] r76VarArr = j8a.a;
        k8a k8aVar = h8a.l;
        r76 r76Var = j8a.a[4];
        l8aVar.a(k8aVar, Boolean.valueOf(b));
        l8aVar.a(s7a.w, new g4(null, new v7(0, this, mn4.class, "requestFocus", "requestFocus()Z", 0, 22)));
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        this.Q = i38Var;
        if (this.R.M1().b()) {
            boolean z = i38Var.E1().J;
            hq7 hq7Var = pn4.K;
            if (z) {
                i38 i38Var2 = this.Q;
                if (i38Var2 != null && i38Var2.E1().J && this.J) {
                    dae.l(this, hq7Var);
                }
            } else if (this.J) {
                dae.l(this, hq7Var);
            }
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    public /* synthetic */ mn4(yu7 yu7Var, qrb qrbVar, int i) {
        this(yu7Var, 1, (i & 4) != 0 ? null : qrbVar);
    }
}
