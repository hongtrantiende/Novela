package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c8d  reason: default package */
/* loaded from: classes3.dex */
public final class c8d {
    public final int a;
    public final String b;
    public final int c;
    public final double d;

    public c8d(int i, String str, int i2, double d) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = d;
    }

    public static c8d a(c8d c8dVar, int i, String str, int i2, double d, int i3) {
        if ((i3 & 1) != 0) {
            i = c8dVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            str = c8dVar.b;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i2 = c8dVar.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            d = c8dVar.d;
        }
        c8dVar.getClass();
        str2.getClass();
        return new c8d(i4, str2, i5, d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c8d) {
                c8d c8dVar = (c8d) obj;
                if (this.a != c8dVar.a || !this.b.equals(c8dVar.b) || this.c != c8dVar.c || Double.compare(this.d, c8dVar.d) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + hl5.a(this.c, eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("VideoEpisodeState(episodeIndex=", this.a, ", episodeName=", this.b, ", totalEpisode=");
        r.append(this.c);
        r.append(", lastReadPositionPercent=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
