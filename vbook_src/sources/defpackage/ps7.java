package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ps7  reason: default package */
/* loaded from: classes.dex */
public final class ps7 {
    public final int a;
    public final int b;
    public final float c;

    public ps7(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static ps7 a(int i) {
        int i2;
        int i3 = (i >> 13) & 7;
        if (i3 == 0) {
            return null;
        }
        int i4 = (i >> 10) & 7;
        int i5 = i & 511;
        if ((i & 512) != 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return new ps7((i5 * i2) / 10.0f, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ps7)) {
            return false;
        }
        ps7 ps7Var = (ps7) obj;
        if (this.a != ps7Var.a || this.b != ps7Var.b || Float.compare(this.c, ps7Var.c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
