package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm1  reason: default package */
/* loaded from: classes.dex */
public abstract class sm1 {
    public final String a;
    public final long b;
    public final int c;

    public sm1(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            vs.m("The id must be between -1 and 63");
            throw null;
        }
        vs.m("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            sm1 sm1Var = (sm1) obj;
            if (this.c == sm1Var.c && this.a.equals(sm1Var.a)) {
                return vve.d(this.b, sm1Var.b);
            }
            return false;
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, sm1 sm1Var);

    public int hashCode() {
        return hl5.c(this.a.hashCode() * 31, this.b, 31) + this.c;
    }

    public final String toString() {
        String str;
        long j = this.b;
        if (vve.d(j, 12884901888L)) {
            str = "Rgb";
        } else if (vve.d(j, 12884901889L)) {
            str = "Xyz";
        } else if (vve.d(j, 12884901890L)) {
            str = "Lab";
        } else if (vve.d(j, 17179869187L)) {
            str = "Cmyk";
        } else {
            str = "Unknown";
        }
        return this.a + " (id=" + this.c + ", model=" + str + ")";
    }
}
