package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m2a  reason: default package */
/* loaded from: classes.dex */
public final class m2a extends uq7 {
    public final yu7 C;
    public final hv0 D;
    public final boolean E;
    public final wi F;
    public final x2a b;
    public final ff8 c;
    public final boolean d;
    public final boolean e;
    public final li4 f;

    public m2a(wi wiVar, hv0 hv0Var, li4 li4Var, yu7 yu7Var, ff8 ff8Var, x2a x2aVar, boolean z, boolean z2, boolean z3) {
        this.b = x2aVar;
        this.c = ff8Var;
        this.d = z;
        this.e = z2;
        this.f = li4Var;
        this.C = yu7Var;
        this.D = hv0Var;
        this.E = z3;
        this.F = wiVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m03, mq7, n2a] */
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
        m03Var.T = this.E;
        m03Var.U = this.F;
        return m03Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "state");
        c00Var.b(this.c, "orientation");
        if (!this.E) {
            c00Var.b(this.F, "overscrollEffect");
        }
        c00Var.b(Boolean.valueOf(this.d), "enabled");
        c00Var.b(Boolean.valueOf(this.e), "reverseScrolling");
        c00Var.b(this.f, "flingBehavior");
        c00Var.b(this.C, "interactionSource");
        c00Var.b(this.D, "bringIntoViewSpec");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        yu7 yu7Var = this.C;
        ((n2a) mq7Var).M1(this.F, this.D, this.f, yu7Var, this.c, this.b, this.E, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m2a.class == obj.getClass()) {
                m2a m2aVar = (m2a) obj;
                if (c16.i(this.b, m2aVar.b) && this.c == m2aVar.c && this.d == m2aVar.d && this.e == m2aVar.e && c16.i(this.f, m2aVar.f) && c16.i(this.C, m2aVar.C) && c16.i(this.D, m2aVar.D) && this.E == m2aVar.E && c16.i(this.F, m2aVar.F)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int k = eub.k(eub.k((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        int i4 = 0;
        li4 li4Var = this.f;
        if (li4Var != null) {
            i = li4Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (k + i) * 31;
        yu7 yu7Var = this.C;
        if (yu7Var != null) {
            i2 = yu7Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        hv0 hv0Var = this.D;
        if (hv0Var != null) {
            i3 = hv0Var.hashCode();
        } else {
            i3 = 0;
        }
        int k2 = eub.k((i6 + i3) * 31, 31, this.E);
        wi wiVar = this.F;
        if (wiVar != null) {
            i4 = wiVar.hashCode();
        }
        return k2 + i4;
    }
}
