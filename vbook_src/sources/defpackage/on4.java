package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on4  reason: default package */
/* loaded from: classes3.dex */
public final class on4 {
    public final int a;
    public final int b;

    public on4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on4)) {
            return false;
        }
        on4 on4Var = (on4) obj;
        if (this.a == on4Var.a && this.b == on4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "ToItem(index=", ", scrollOffset=", ")");
    }
}
