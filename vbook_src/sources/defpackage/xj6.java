package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xj6  reason: default package */
/* loaded from: classes.dex */
public final class xj6 implements th6 {
    public final nk6 a;
    public final wj6 b;
    public final kj c;

    public xj6(nk6 nk6Var, wj6 wj6Var, kj kjVar) {
        this.a = nk6Var;
        this.b = wj6Var;
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
    public final Object c(int i) {
        return this.b.q(i);
    }

    @Override // defpackage.th6
    public final void d(int i, Object obj, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4Var.g0(89098518);
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
            zpe.a(obj, i, this.a.s, jce.E(608834466, new tm5(this, i, 3), rv4Var), rv4Var, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & Token.ASSIGN_MOD));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(i, i2, 16, this, obj);
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
        if (!(obj instanceof xj6)) {
            return false;
        }
        return c16.i(this.b, ((xj6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
