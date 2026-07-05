package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n2a  reason: default package */
/* loaded from: classes.dex */
public final class n2a extends m03 implements wx1, r78 {
    public x2a M;
    public ff8 N;
    public boolean O;
    public boolean P;
    public li4 Q;
    public yu7 R;
    public hv0 S;
    public boolean T;
    public wi U;
    public w2a V;
    public f03 W;
    public xi X;
    public wi Y;
    public boolean Z;

    @Override // defpackage.f03
    public final void A0() {
        wi wiVar;
        boolean L1 = L1();
        if (this.Z != L1) {
            this.Z = L1;
            x2a x2aVar = this.M;
            ff8 ff8Var = this.N;
            boolean z = this.T;
            if (z) {
                wiVar = this.Y;
            } else {
                wiVar = this.U;
            }
            wi wiVar2 = wiVar;
            boolean z2 = this.O;
            boolean z3 = this.P;
            M1(wiVar2, this.S, this.Q, this.R, ff8Var, x2aVar, z, z2, z3);
        }
    }

    @Override // defpackage.mq7
    public final void A1() {
        f03 f03Var = this.W;
        if (f03Var != null) {
            I1(f03Var);
        }
    }

    public final void K1() {
        wi wiVar;
        f03 f03Var = this.W;
        if (f03Var == null) {
            if (this.T) {
                iue.R(this, new ak9(this, 10));
            }
            if (this.T) {
                wiVar = this.Y;
            } else {
                wiVar = this.U;
            }
            if (wiVar != null) {
                m03 m03Var = wiVar.i;
                if (!m03Var.a.J) {
                    H1(m03Var);
                    this.W = m03Var;
                }
            }
        } else if (!((mq7) f03Var).a.J) {
            H1(f03Var);
        }
    }

    public final boolean L1() {
        tc6 tc6Var;
        if (this.J) {
            tc6Var = voe.v(this).W;
        } else {
            tc6Var = tc6.a;
        }
        ff8 ff8Var = this.N;
        boolean z = this.P;
        boolean z2 = !z;
        if (tc6Var == tc6.b && ff8Var != ff8.a) {
            return z;
        }
        return z2;
    }

    public final void M1(wi wiVar, hv0 hv0Var, li4 li4Var, yu7 yu7Var, ff8 ff8Var, x2a x2aVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        wi wiVar2;
        this.M = x2aVar;
        this.N = ff8Var;
        boolean z5 = true;
        if (this.T != z) {
            this.T = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!c16.i(this.U, wiVar)) {
            this.U = wiVar;
        } else {
            z5 = false;
        }
        if (z4 || (z5 && !z)) {
            f03 f03Var = this.W;
            if (f03Var != null) {
                I1(f03Var);
            }
            this.W = null;
            K1();
        }
        this.O = z2;
        this.P = z3;
        this.Q = li4Var;
        this.R = yu7Var;
        this.S = hv0Var;
        boolean L1 = L1();
        this.Z = L1;
        w2a w2aVar = this.V;
        if (w2aVar != null) {
            if (this.T) {
                wiVar2 = this.Y;
            } else {
                wiVar2 = this.U;
            }
            w2aVar.c2(wiVar2, hv0Var, li4Var, yu7Var, ff8Var, x2aVar, z2, L1);
        }
    }

    @Override // defpackage.r78
    public final void S0() {
        wi wiVar;
        xi xiVar = (xi) nye.q(this, sg8.a);
        if (!c16.i(xiVar, this.X)) {
            this.X = xiVar;
            this.Y = null;
            f03 f03Var = this.W;
            if (f03Var != null) {
                I1(f03Var);
            }
            this.W = null;
            K1();
            w2a w2aVar = this.V;
            if (w2aVar != null) {
                x2a x2aVar = this.M;
                ff8 ff8Var = this.N;
                if (this.T) {
                    wiVar = this.Y;
                } else {
                    wiVar = this.U;
                }
                wi wiVar2 = wiVar;
                boolean z = this.O;
                boolean z2 = this.Z;
                w2aVar.c2(wiVar2, this.S, this.Q, this.R, ff8Var, x2aVar, z, z2);
            }
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        wi wiVar;
        this.Z = L1();
        K1();
        if (this.V == null) {
            x2a x2aVar = this.M;
            if (this.T) {
                wiVar = this.Y;
            } else {
                wiVar = this.U;
            }
            wi wiVar2 = wiVar;
            li4 li4Var = this.Q;
            ff8 ff8Var = this.N;
            boolean z = this.O;
            boolean z2 = this.Z;
            w2a w2aVar = new w2a(wiVar2, this.S, li4Var, this.R, ff8Var, x2aVar, z, z2);
            H1(w2aVar);
            this.V = w2aVar;
        }
    }
}
