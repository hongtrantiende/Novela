package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah6  reason: default package */
/* loaded from: classes.dex */
public final class ah6 {
    public final int a;
    public final int b;

    public ah6(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ov5.a("negative start index");
        }
        if (!(i2 >= i)) {
            ov5.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah6)) {
            return false;
        }
        ah6 ah6Var = (ah6) obj;
        if (this.a == ah6Var.a && this.b == ah6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "Interval(start=", ", end=", ")");
    }
}
