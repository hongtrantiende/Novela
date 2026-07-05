package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p58  reason: default package */
/* loaded from: classes3.dex */
public final class p58 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public p58(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
    }

    public static p58 a(p58 p58Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = p58Var.a;
        }
        boolean z5 = z;
        if ((i3 & 2) != 0) {
            z2 = p58Var.b;
        }
        boolean z6 = z2;
        if ((i3 & 4) != 0) {
            z3 = p58Var.c;
        }
        boolean z7 = z3;
        if ((i3 & 8) != 0) {
            z4 = p58Var.d;
        }
        boolean z8 = z4;
        if ((i3 & 16) != 0) {
            i = p58Var.e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = p58Var.f;
        }
        p58Var.getClass();
        return new p58(z5, z6, z7, z8, i4, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p58)) {
            return false;
        }
        p58 p58Var = (p58) obj;
        if (this.a == p58Var.a && this.b == p58Var.b && this.c == p58Var.c && this.d == p58Var.d && this.e == p58Var.e && this.f == p58Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + hl5.a(this.e, eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("NotificationState(community=", this.a, ", updateApp=", this.b, ", updateExtension=");
        rs8.z(p, this.c, ", updateNewChap=", this.d, ", updateRule=");
        return hl5.j(this.e, this.f, ", updateTime=", ")", p);
    }
}
