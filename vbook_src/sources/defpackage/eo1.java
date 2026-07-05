package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eo1  reason: default package */
/* loaded from: classes.dex */
public final class eo1 extends uq7 {
    public final vt4 C;
    public final yu7 b;
    public final boolean c;
    public final boolean d;
    public final vt4 e;
    public final vt4 f;

    public eo1(vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, yu7 yu7Var, boolean z, boolean z2) {
        this.b = yu7Var;
        this.c = z;
        this.d = z2;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.C = vt4Var3;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new io1(this.e, this.f, this.C, this.b, this.c, this.d);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(null, "indicationNodeFactory");
        c00Var.b(this.b, "interactionSource");
        c00Var.b(Boolean.valueOf(this.d), "enabled");
        c00Var.b(null, "onClickLabel");
        c00Var.b(null, "role");
        c00Var.b(this.e, "onClick");
        c00Var.b(this.C, "onDoubleClick");
        c00Var.b(this.f, "onLongClick");
        c00Var.b(null, "onLongClickLabel");
        c00Var.b(Boolean.TRUE, "hapticFeedbackEnabled");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        io1 io1Var = (io1) mq7Var;
        io1Var.i0 = true;
        if (io1Var.g0 == null) {
            z = true;
        } else {
            z = false;
        }
        vt4 vt4Var = this.f;
        if (vt4Var == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            io1Var.M1();
            ak0.t(io1Var);
            z3 = true;
        } else {
            z3 = false;
        }
        io1Var.g0 = vt4Var;
        if (io1Var.h0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        vt4 vt4Var2 = this.C;
        if (vt4Var2 == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 != z5) {
            z3 = true;
        }
        io1Var.h0 = vt4Var2;
        boolean z7 = io1Var.R;
        boolean z8 = this.d;
        if (z7 != z8) {
            z6 = true;
        } else {
            z6 = z3;
        }
        io1Var.Y1(this.b, null, this.c, z8, null, null, this.e);
        if (z6) {
            io1Var.Z1(false);
            io1Var.Z1(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eo1.class == obj.getClass()) {
            eo1 eo1Var = (eo1) obj;
            if (c16.i(this.b, eo1Var.b) && this.c == eo1Var.c && this.d == eo1Var.d && this.e == eo1Var.e && this.f == eo1Var.f && this.C == eo1Var.C) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        yu7 yu7Var = this.b;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.e.hashCode() + eub.k(eub.k(i * 961, 31, this.c), 29791, this.d)) * 961;
        vt4 vt4Var = this.f;
        if (vt4Var != null) {
            i2 = vt4Var.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        vt4 vt4Var2 = this.C;
        if (vt4Var2 != null) {
            i3 = vt4Var2.hashCode();
        }
        return Boolean.hashCode(true) + ((i4 + i3) * 31);
    }
}
