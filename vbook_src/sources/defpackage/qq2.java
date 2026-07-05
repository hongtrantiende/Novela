package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qq2  reason: default package */
/* loaded from: classes3.dex */
public final class qq2 implements Comparable {
    public final int a;
    public final int b;

    public qq2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 >= 0) {
            return;
        }
        p1a.k(a82.j(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int[] iArr = nc2.f;
        int i2 = this.a;
        int i3 = this.b;
        if (i == i3) {
            return i2;
        }
        if (i > i3) {
            return i2 * iArr[i - i3];
        }
        return i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qq2 qq2Var = (qq2) obj;
        qq2Var.getClass();
        int max = Math.max(this.b, qq2Var.b);
        return c16.l(a(max), qq2Var.a(max));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qq2) {
            qq2 qq2Var = (qq2) obj;
            int max = Math.max(this.b, qq2Var.b);
            if (c16.l(a(max), qq2Var.a(max)) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = nc2.f[this.b];
        int i2 = this.a;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(k4b.t0(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
