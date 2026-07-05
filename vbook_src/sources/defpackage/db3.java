package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db3  reason: default package */
/* loaded from: classes.dex */
public final class db3 {
    public final cb3 a;

    static {
        new db3("", 0, 0);
    }

    public db3(String str, int i, int i2) {
        this.a = new cb3(str, i, i2);
    }

    public static db3 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder r = hl5.r(i8, i7, "M0,", " A", ",");
            rs8.q(i8, i, " 0 1,1 ", ",", r);
            rs8.q(i8, i7, " A", ",", r);
            sb = hl5.j(i8, i8, " 0 1,1 0,", " Z", r);
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                a82.t(min3, min3, " A ", ",", sb2);
                a82.t(i, min3, " 0 0,1 ", ",", sb2);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i2 - min4);
            if (min4 > 0) {
                a82.t(min4, min4, " A ", ",", sb2);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i2);
            }
            a82.t(min5, i2, " L ", ",", sb2);
            if (min5 > 0) {
                a82.t(min5, min5, " A ", ",", sb2);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                a82.t(min2, min2, " L 0,", " A ", sb2);
                a82.t(min2, min2, ",", " 0 0,1 ", sb2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new db3(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db3)) {
            return false;
        }
        return this.a.equals(((db3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
