package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so6  reason: default package */
/* loaded from: classes.dex */
public final class so6 {
    public static final so6 d = new so6(po6.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public so6(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so6)) {
            return false;
        }
        so6 so6Var = (so6) obj;
        float f = so6Var.a;
        float f2 = po6.b;
        if (Float.compare(this.a, f) == 0 && this.b == so6Var.b && this.c == so6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = po6.b;
        return Integer.hashCode(this.c) + hl5.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String b = po6.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i != 0) {
            str = "Invalid";
        } else {
            str = "LineHeightStyle.Trim.None";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return s21.q(nk2.y("LineHeightStyle(alignment=", b, ", trim=", str, ",mode="), str2, ")");
    }
}
