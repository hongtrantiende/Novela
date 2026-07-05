package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fl8  reason: default package */
/* loaded from: classes.dex */
public final class fl8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fl8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl8)) {
            return false;
        }
        fl8 fl8Var = (fl8) obj;
        if (this.a == fl8Var.a && this.b == fl8Var.b && this.c == fl8Var.c && this.d == fl8Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", encryption=", ")", hl5.r(this.a, this.b, "PalmDocHeader(compression=", ", numTextRecords=", ", recordSize="));
    }
}
