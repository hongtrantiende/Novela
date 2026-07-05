package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jz7  reason: default package */
/* loaded from: classes.dex */
public final class jz7 {
    public final Object a;
    public final Object b;
    public final Map c;
    public final tu1 d;

    public jz7(Object obj, Object obj2, Map map, tu1 tu1Var) {
        this.a = obj;
        this.b = obj2;
        this.c = map;
        this.d = tu1Var;
    }

    public final void a(int i, rv4 rv4Var) {
        int i2;
        boolean z;
        int i3;
        rv4Var.g0(295512821);
        if ((i & 6) == 0) {
            if (rv4Var.f(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            this.d.c(this.a, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new tm5(this, i, 5);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jz7.class == obj.getClass()) {
                jz7 jz7Var = (jz7) obj;
                if (c16.i(this.a, jz7Var.a) && c16.i(this.b, jz7Var.b) && c16.i(this.c, jz7Var.c) && this.d == jz7Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + hashCode;
    }

    public final String toString() {
        return "NavEntry(key=" + this.a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ")";
    }

    public jz7(jz7 jz7Var, tu1 tu1Var) {
        this(jz7Var.a, jz7Var.b, jz7Var.c, tu1Var);
    }
}
