package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mrb  reason: default package */
/* loaded from: classes.dex */
public final class mrb extends uq7 {
    public final boolean C;
    public final t86 D;
    public final pg0 E;
    public final boolean F;
    public final yu7 G;
    public final xv7 H;
    public final mkc b;
    public final hvb c;
    public final ytb d;
    public final og0 e;
    public final boolean f;

    public mrb(mkc mkcVar, hvb hvbVar, ytb ytbVar, og0 og0Var, boolean z, boolean z2, t86 t86Var, pg0 pg0Var, boolean z3, yu7 yu7Var, xv7 xv7Var) {
        this.b = mkcVar;
        this.c = hvbVar;
        this.d = ytbVar;
        this.e = og0Var;
        this.f = z;
        this.C = z2;
        this.D = t86Var;
        this.E = pg0Var;
        this.F = z3;
        this.G = yu7Var;
        this.H = xv7Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new trb(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        boolean z2;
        iya iyaVar;
        trb trbVar = (trb) mq7Var;
        hab habVar = trbVar.X;
        mn4 mn4Var = trbVar.W;
        boolean z3 = trbVar.P;
        if (z3 && !trbVar.Q) {
            z = true;
        } else {
            z = false;
        }
        mkc mkcVar = trbVar.M;
        t86 t86Var = trbVar.R;
        ytb ytbVar = trbVar.O;
        yu7 yu7Var = trbVar.U;
        xv7 xv7Var = trbVar.V;
        boolean z4 = this.f;
        boolean z5 = this.C;
        if (z4 && !z5) {
            z2 = true;
        } else {
            z2 = false;
        }
        mkc mkcVar2 = this.b;
        trbVar.M = mkcVar2;
        trbVar.N = this.c;
        ytb ytbVar2 = this.d;
        trbVar.O = ytbVar2;
        trbVar.P = z4;
        trbVar.Q = z5;
        t86 t86Var2 = this.D;
        trbVar.R = t86Var2;
        trbVar.S = this.E;
        trbVar.T = this.F;
        yu7 yu7Var2 = this.G;
        trbVar.U = yu7Var2;
        xv7 xv7Var2 = this.H;
        trbVar.V = xv7Var2;
        if (z2 != z || !c16.i(mkcVar2, mkcVar) || !t86Var2.equals(t86Var) || !c16.i(xv7Var2, xv7Var)) {
            if (z2 && (trbVar.M1() || trbVar.e0 != null)) {
                trbVar.P1(false);
            } else if (!z2) {
                trbVar.K1();
            }
        }
        if (z4 != z3 || z2 != z || t86Var2.a() != t86Var.a()) {
            ak0.t(trbVar);
        }
        if (ytbVar2 != ytbVar) {
            habVar.J1();
            if (trbVar.J) {
                ytbVar2.n = trbVar.f0;
                if (trbVar.M1() && (iyaVar = trbVar.b0) != null) {
                    iyaVar.cancel(null);
                    trbVar.b0 = z87.v(trbVar.v1(), null, null, new qq1(ytbVar2, null, 1), 3);
                }
            }
            ytbVar2.m = new prb(trbVar, 2);
        }
        if (!c16.i(yu7Var2, yu7Var)) {
            habVar.J1();
            if (mn4Var.J) {
                mn4Var.L1(yu7Var2);
            }
        }
        if (z4 != z3) {
            if (z4) {
                trbVar.H1(mn4Var);
                mn4Var.L1(yu7Var2);
                return;
            }
            trbVar.I1(mn4Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mrb) {
                mrb mrbVar = (mrb) obj;
                if (c16.i(this.b, mrbVar.b) && c16.i(this.c, mrbVar.c) && this.d == mrbVar.d && c16.i(this.e, mrbVar.e) && this.f == mrbVar.f && this.C == mrbVar.C && this.D.equals(mrbVar.D) && c16.i(this.E, mrbVar.E) && this.F == mrbVar.F && c16.i(this.G, mrbVar.G) && c16.i(this.H, mrbVar.H)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        og0 og0Var = this.e;
        if (og0Var == null) {
            hashCode = 0;
        } else {
            hashCode = og0Var.hashCode();
        }
        int hashCode4 = (this.D.hashCode() + eub.k(eub.k((hashCode3 + hashCode) * 31, 31, this.f), 31, this.C)) * 31;
        pg0 pg0Var = this.E;
        if (pg0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = pg0Var.hashCode();
        }
        int k = eub.k((this.G.hashCode() + eub.k((hashCode4 + hashCode2) * 31, 31, this.F)) * 31, 31, false);
        xv7 xv7Var = this.H;
        if (xv7Var != null) {
            i = xv7Var.hashCode();
        }
        return k + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldDecoratorModifier(textFieldState=");
        sb.append(this.b);
        sb.append(", textLayoutState=");
        sb.append(this.c);
        sb.append(", textFieldSelectionState=");
        sb.append(this.d);
        sb.append(", filter=");
        sb.append(this.e);
        sb.append(", enabled=");
        rs8.z(sb, this.f, ", readOnly=", this.C, ", keyboardOptions=");
        sb.append(this.D);
        sb.append(", keyboardActionHandler=");
        sb.append(this.E);
        sb.append(", singleLine=");
        sb.append(this.F);
        sb.append(", interactionSource=");
        sb.append(this.G);
        sb.append(", isPassword=false, stylusHandwritingTrigger=");
        sb.append(this.H);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
