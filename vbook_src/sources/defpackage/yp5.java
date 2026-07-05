package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yp5  reason: default package */
/* loaded from: classes3.dex */
public final class yp5 {
    public final int a;
    public final int b;

    public yp5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp5)) {
            return false;
        }
        yp5 yp5Var = (yp5) obj;
        if (this.a == yp5Var.a && this.b == yp5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "ImageSize(width=", ", height=", ")");
    }
}
