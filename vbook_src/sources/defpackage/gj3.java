package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj3  reason: default package */
/* loaded from: classes.dex */
public final class gj3 extends uq7 {
    public static final u83 F = new u83(11);
    public final mu4 C;
    public final mu4 D;
    public final boolean E;
    public final qj3 b;
    public final ff8 c;
    public final boolean d;
    public final yu7 e;
    public final boolean f;

    public gj3(qj3 qj3Var, ff8 ff8Var, boolean z, yu7 yu7Var, boolean z2, mu4 mu4Var, mu4 mu4Var2, boolean z3) {
        this.b = qj3Var;
        this.c = ff8Var;
        this.d = z;
        this.e = yu7Var;
        this.f = z2;
        this.C = mu4Var;
        this.D = mu4Var2;
        this.E = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, pj3, ti3] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? ti3Var = new ti3(F, this.d, this.e, this.c);
        ti3Var.f0 = this.b;
        ti3Var.g0 = this.f;
        ti3Var.h0 = this.C;
        ti3Var.i0 = this.D;
        ti3Var.j0 = this.E;
        return ti3Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.c, "orientation");
        c00Var.b(Boolean.valueOf(this.d), "enabled");
        c00Var.b(Boolean.valueOf(this.E), "reverseDirection");
        c00Var.b(this.e, "interactionSource");
        c00Var.b(Boolean.valueOf(this.f), "startDragImmediately");
        c00Var.b(this.C, "onDragStarted");
        c00Var.b(this.D, "onDragStopped");
        c00Var.b(this.b, "state");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        boolean z2;
        pj3 pj3Var = (pj3) mq7Var;
        qj3 qj3Var = pj3Var.f0;
        qj3 qj3Var2 = this.b;
        if (!c16.i(qj3Var, qj3Var2)) {
            pj3Var.f0 = qj3Var2;
            z = true;
        } else {
            z = false;
        }
        boolean z3 = pj3Var.j0;
        boolean z4 = this.E;
        if (z3 != z4) {
            pj3Var.j0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        pj3Var.h0 = this.C;
        pj3Var.i0 = this.D;
        pj3Var.g0 = this.f;
        pj3Var.b2(F, this.d, this.e, this.c, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj3.class != obj.getClass()) {
            return false;
        }
        gj3 gj3Var = (gj3) obj;
        if (c16.i(this.b, gj3Var.b) && this.c == gj3Var.c && this.d == gj3Var.d && c16.i(this.e, gj3Var.e) && this.f == gj3Var.f && c16.i(this.C, gj3Var.C) && c16.i(this.D, gj3Var.D) && this.E == gj3Var.E) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int k = eub.k((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        yu7 yu7Var = this.e;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        int k2 = eub.k((k + i) * 31, 31, this.f);
        int hashCode = this.D.hashCode();
        return Boolean.hashCode(this.E) + ((hashCode + ((this.C.hashCode() + k2) * 31)) * 31);
    }
}
