package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: je3  reason: default package */
/* loaded from: classes3.dex */
public final class je3 {
    public final int a;
    public final int b;
    public final double c;

    public je3(int i, int i2) {
        int f;
        this.a = i;
        this.b = i2;
        int i3 = eze.i(i2, 9, 7) + 1980;
        int i4 = eze.i(i2, 5, 4);
        int i5 = 0;
        int i6 = eze.i(i2, 0, 5);
        int i7 = eze.i(i, 11, 5);
        int i8 = eze.i(i, 5, 6);
        int i9 = eze.i(i, 0, 5) * 2;
        int i10 = (i9 / 60) + i8;
        int f2 = st0.f(i9, 0, 59);
        int i11 = (i10 / 60) + i7;
        int f3 = st0.f(i10, 0, 59);
        int i12 = (i11 / 24) + i6;
        int f4 = st0.f(i11, 0, 23);
        while (true) {
            int a = u72.a(i4, u72.b(i3));
            int i13 = ((i12 - 1) / a) + i4;
            i12 = st0.f(i12, 1, a);
            i3 += (i13 - 1) / 12;
            f = st0.f(i13, 1, 12);
            if (st0.f(i12, 1, u72.a(f, u72.b(i3))) == i12) {
                break;
            }
            i4 = f;
        }
        int i14 = i3 - 1;
        int i15 = i14 * 365;
        if (i3 < 1) {
            for (int i16 = 1; i16 >= i3; i16--) {
                if (u72.b(i16)) {
                    i5--;
                }
            }
        } else {
            i5 = ((i14 / 4) - (i14 / 100)) + (i14 / 400);
        }
        this.c = (f2 * 1000.0d) + (f3 * 60000.0d) + (f4 * 3600000.0d) + ((((((i15 + i5) + ((int[][]) u72.a.getValue())[u72.b(i3) ? 1 : 0][(f - 1) % 12]) + i12) - 1) * 8.64E7d) - 6.21355968E13d) + 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je3)) {
            return false;
        }
        je3 je3Var = (je3) obj;
        if (this.a == je3Var.a && this.b == je3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DosFileDateTime(dosTime=");
        sb.append(this.a);
        sb.append(", dosDate=");
        return hl5.p(sb, this.b, ')');
    }
}
