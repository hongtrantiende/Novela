package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj8  reason: default package */
/* loaded from: classes.dex */
public final class gj8 implements th6 {
    public final rj8 a;
    public final npe b;
    public final kj c;

    public gj8(rj8 rj8Var, fj8 fj8Var, kj kjVar) {
        this.a = rj8Var;
        this.b = fj8Var;
        this.c = kjVar;
    }

    @Override // defpackage.th6
    public final int a() {
        return this.b.r().a;
    }

    @Override // defpackage.th6
    public final Object b(int i) {
        Object p = this.c.p(i);
        if (p == null) {
            return this.b.s(i);
        }
        return p;
    }

    @Override // defpackage.th6
    public final void d(int i, Object obj, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4Var.g0(-1201380429);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (rv4Var.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.f(this)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            zpe.a(obj, i, this.a.z, jce.E(1142237095, new tm5(this, i, 6), rv4Var), rv4Var, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & Token.ASSIGN_MOD));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(i, i2, 21, this, obj);
        }
    }

    @Override // defpackage.th6
    public final int e(Object obj) {
        return this.c.o(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj8)) {
            return false;
        }
        return c16.i(this.b, ((gj8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
