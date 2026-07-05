package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y5a  reason: default package */
/* loaded from: classes.dex */
public final class y5a extends uq7 {
    public final xt9 C;
    public final vt4 D;
    public final boolean b;
    public final yu7 c;
    public final iu5 d;
    public final boolean e;
    public final boolean f;

    public y5a(boolean z, yu7 yu7Var, iu5 iu5Var, boolean z2, boolean z3, xt9 xt9Var, vt4 vt4Var) {
        this.b = z;
        this.c = yu7Var;
        this.d = iu5Var;
        this.e = z2;
        this.f = z3;
        this.C = xt9Var;
        this.D = vt4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, t0, b6a] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? t0Var = new t0(this.c, this.d, this.e, this.f, null, this.C, this.D);
        t0Var.i0 = this.b;
        return t0Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(Boolean.valueOf(this.b), "selected");
        c00Var.b(this.c, "interactionSource");
        c00Var.b(this.d, "indicationNodeFactory");
        c00Var.b(Boolean.valueOf(this.f), "enabled");
        c00Var.b(this.C, "role");
        c00Var.b(this.D, "onClick");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        b6a b6aVar = (b6a) mq7Var;
        boolean z = b6aVar.i0;
        boolean z2 = this.b;
        if (z != z2) {
            b6aVar.i0 = z2;
            ak0.t(b6aVar);
        }
        b6aVar.Y1(this.c, this.d, this.e, this.f, null, this.C, this.D);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y5a.class == obj.getClass()) {
                y5a y5aVar = (y5a) obj;
                if (this.b != y5aVar.b || !c16.i(this.c, y5aVar.c) || !c16.i(this.d, y5aVar.d) || this.e != y5aVar.e || this.f != y5aVar.f || !this.C.equals(y5aVar.C) || this.D != y5aVar.D) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Boolean.hashCode(this.b) * 31;
        int i2 = 0;
        yu7 yu7Var = this.c;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        iu5 iu5Var = this.d;
        if (iu5Var != null) {
            i2 = iu5Var.hashCode();
        }
        return this.D.hashCode() + hl5.a(this.C.a, eub.k(eub.k((i3 + i2) * 31, 31, this.e), 31, this.f), 31);
    }
}
