package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y03  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y03 implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ z03 b;

    public /* synthetic */ y03(z03 z03Var) {
        this.b = z03Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [m03, kt9, f03] */
    @Override // defpackage.vt4
    public final Object invoke() {
        rt9 rt9Var;
        nt9 nt9Var;
        pt9 pt9Var;
        lt9 lt9Var;
        int i = this.a;
        z03 z03Var = this.b;
        switch (i) {
            case 0:
                ft9 ft9Var = (ft9) nye.q(z03Var, jt9.b);
                kt9 kt9Var = z03Var.U;
                if (ft9Var == null) {
                    if (kt9Var != null) {
                        z03Var.I1(kt9Var);
                    }
                    z03Var.U = null;
                } else if (kt9Var == null) {
                    mu9 mu9Var = new mu9(z03Var);
                    y03 y03Var = new y03(z03Var, new n07(z03Var, 15), new fz4(z03Var));
                    gz5 gz5Var = z03Var.M;
                    boolean z = z03Var.N;
                    float f = z03Var.O;
                    arc arcVar = it9.a;
                    ?? m03Var = new m03();
                    m03Var.H1(new rl(gz5Var, z, f, mu9Var, y03Var));
                    z03Var.H1(m03Var);
                    z03Var.U = m03Var;
                }
                return pvc.a;
            default:
                tr7 tr7Var = ((h27) nye.q(z03Var, j27.a)).d;
                wt9 wt9Var = (wt9) nye.q(z03Var, jt9.a);
                ft9 ft9Var2 = (ft9) nye.q(z03Var, jt9.b);
                if (z03Var.Q) {
                    rt9Var = new Object();
                } else {
                    rt9Var = rt9.c;
                }
                if (z03Var.R) {
                    vt9 vt9Var = wt9Var.a;
                    nt9Var = new Object();
                } else {
                    nt9Var = nt9.j;
                }
                if (z03Var.S) {
                    pt9Var = new Object();
                } else {
                    pt9Var = pt9.i;
                }
                if (z03Var.T) {
                    lt9Var = new Object();
                } else {
                    lt9Var = lt9.e;
                }
                return new tt9(rt9Var, nt9Var, pt9Var, lt9Var);
        }
    }

    public /* synthetic */ y03(z03 z03Var, n07 n07Var, fz4 fz4Var) {
        this.b = z03Var;
    }
}
