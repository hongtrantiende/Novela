package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q72  reason: default package */
/* loaded from: classes.dex */
public final class q72 extends uq7 {
    public final boolean C;
    public final j88 D;
    public final gtb E;
    public final as5 F;
    public final zm4 G;
    public final ikc b;
    public final jub c;
    public final ol6 d;
    public final boolean e;
    public final boolean f;

    public q72(ikc ikcVar, jub jubVar, ol6 ol6Var, boolean z, boolean z2, boolean z3, j88 j88Var, gtb gtbVar, as5 as5Var, zm4 zm4Var) {
        this.b = ikcVar;
        this.c = jubVar;
        this.d = ol6Var;
        this.e = z;
        this.f = z2;
        this.C = z3;
        this.D = j88Var;
        this.E = gtbVar;
        this.F = as5Var;
        this.G = zm4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m03, mq7, t72] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? m03Var = new m03();
        m03Var.M = this.b;
        m03Var.N = this.c;
        m03Var.O = this.d;
        m03Var.P = this.e;
        m03Var.Q = this.f;
        m03Var.R = this.C;
        m03Var.S = this.D;
        gtb gtbVar = this.E;
        m03Var.T = gtbVar;
        m03Var.U = this.F;
        m03Var.V = this.G;
        gtbVar.g = new r72(m03Var, 4);
        return m03Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        t72 t72Var = (t72) mq7Var;
        boolean z2 = t72Var.Q;
        boolean z3 = true;
        if (z2 && !t72Var.P) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = t72Var.R;
        as5 as5Var = t72Var.U;
        gtb gtbVar = t72Var.T;
        boolean z5 = this.e;
        boolean z6 = this.f;
        if (!z6 || z5) {
            z3 = false;
        }
        t72Var.M = this.b;
        jub jubVar = this.c;
        t72Var.N = jubVar;
        t72Var.O = this.d;
        t72Var.P = z5;
        t72Var.Q = z6;
        t72Var.S = this.D;
        gtb gtbVar2 = this.E;
        t72Var.T = gtbVar2;
        as5 as5Var2 = this.F;
        t72Var.U = as5Var2;
        t72Var.V = this.G;
        if (z6 != z2 || z3 != z || !c16.i(as5Var2, as5Var) || this.C != z4 || !fxb.d(jubVar.b)) {
            ak0.t(t72Var);
        }
        if (gtbVar2 != gtbVar) {
            gtbVar2.g = new r72(t72Var, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q72) {
                q72 q72Var = (q72) obj;
                if (this.b.equals(q72Var.b) && c16.i(this.c, q72Var.c) && this.d == q72Var.d && this.e == q72Var.e && this.f == q72Var.f && this.C == q72Var.C && this.D.equals(q72Var.D) && this.E == q72Var.E && c16.i(this.F, q72Var.F) && c16.i(this.G, q72Var.G)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int k = eub.k(eub.k(eub.k((this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.C);
        int hashCode2 = this.E.hashCode();
        int hashCode3 = this.F.hashCode();
        return this.G.hashCode() + ((hashCode3 + ((hashCode2 + ((this.D.hashCode() + k) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", readOnly=");
        sb.append(this.e);
        sb.append(", enabled=");
        rs8.z(sb, this.f, ", isPassword=", this.C, ", offsetMapping=");
        sb.append(this.D);
        sb.append(", manager=");
        sb.append(this.E);
        sb.append(", imeOptions=");
        sb.append(this.F);
        sb.append(", focusRequester=");
        sb.append(this.G);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
