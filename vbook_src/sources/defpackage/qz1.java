package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qz1  reason: default package */
/* loaded from: classes3.dex */
public final class qz1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public qz1(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public static qz1 a(qz1 qz1Var, int i, int i2, int i3, int i4, boolean z, int i5) {
        if ((i5 & 1) != 0) {
            i = qz1Var.a;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = qz1Var.b;
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = qz1Var.c;
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = qz1Var.d;
        }
        int i9 = i4;
        if ((i5 & 16) != 0) {
            z = qz1Var.e;
        }
        qz1Var.getClass();
        return new qz1(z, i6, i7, i8, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        if (this.a == qz1Var.a && this.b == qz1Var.b && this.c == qz1Var.c && this.d == qz1Var.d && this.e == qz1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "ConnectionState(delay=", ", thread=", ", retry=");
        rs8.q(this.c, this.d, ", dns=", ", cronet=", r);
        return rs8.m(")", r, this.e);
    }
}
