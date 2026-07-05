package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gy8  reason: default package */
/* loaded from: classes.dex */
public final class gy8 {
    public final zx8 a;
    public final ox8 b;

    public gy8(zx8 zx8Var, ox8 ox8Var) {
        this.a = zx8Var;
        this.b = ox8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy8)) {
            return false;
        }
        gy8 gy8Var = (gy8) obj;
        if (c16.i(this.b, gy8Var.b) && c16.i(this.a, gy8Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        zx8 zx8Var = this.a;
        if (zx8Var != null) {
            i = zx8Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ox8 ox8Var = this.b;
        if (ox8Var != null) {
            i2 = ox8Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
