package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i5b  reason: default package */
/* loaded from: classes.dex */
public final class i5b {
    public static final i5b b = new i5b(zl1.i);
    public final long a;

    public i5b(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i5b) {
                i5b i5bVar = (i5b) obj;
                if (Float.compare(nae.e, nae.e) != 0 || !zl1.c(this.a, i5bVar.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(nae.e, h5b.a.hashCode() * 31, 31);
        int i = zl1.j;
        return Long.hashCode(this.a) + d;
    }

    public final String toString() {
        String i = zl1.i(this.a);
        return "Border(type=" + h5b.a + ", width=0.0, color=" + i + ")";
    }
}
