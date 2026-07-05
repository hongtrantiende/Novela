package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf6  reason: default package */
/* loaded from: classes.dex */
public final class wf6 implements th6 {
    public final qg6 a;
    public final vf6 b;
    public final kj c;

    public wf6(qg6 qg6Var, vf6 vf6Var, kj kjVar) {
        this.a = qg6Var;
        this.b = vf6Var;
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
        int i6;
        Object obj2;
        rv4 rv4Var2;
        rv4Var.g0(1493551140);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (rv4Var.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(this)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            obj2 = obj;
            rv4Var2 = rv4Var;
            zpe.a(obj2, i, this.a.q, jce.E(726189336, new tm5(this, i, 1), rv4Var), rv4Var2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & Token.ASSIGN_MOD));
            i6 = i;
        } else {
            i6 = i;
            obj2 = obj;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gk7(i6, i2, 12, this, obj2);
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
        if (!(obj instanceof wf6)) {
            return false;
        }
        return c16.i(this.b, ((wf6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
