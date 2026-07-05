package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s4b  reason: default package */
/* loaded from: classes.dex */
public final class s4b extends bk3 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final zj e;

    public s4b(float f, float f2, int i, int i2, zj zjVar, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        zjVar = (i3 & 16) != 0 ? null : zjVar;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = zjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4b)) {
            return false;
        }
        s4b s4bVar = (s4b) obj;
        if (this.a == s4bVar.a && this.b == s4bVar.b && this.c == s4bVar.c && this.d == s4bVar.d && c16.i(this.e, s4bVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int a = hl5.a(this.d, hl5.a(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        zj zjVar = this.e;
        if (zjVar != null) {
            i = zjVar.hashCode();
        } else {
            i = 0;
        }
        return a + i;
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder x = nk2.x("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        nk2.C(x, str, ", join=", str2, ", pathEffect=");
        x.append(this.e);
        x.append(")");
        return x.toString();
    }
}
