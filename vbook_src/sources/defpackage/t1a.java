package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t1a  reason: default package */
/* loaded from: classes.dex */
public final class t1a {
    public static final t1a d = new t1a();
    public final long a = sve.d(2995292296L);
    public final float b = 3.0f;
    public final float c = 6.0f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t1a) {
                t1a t1aVar = (t1a) obj;
                if (!zl1.c(this.a, t1aVar.a) || !rg3.b(this.b, t1aVar.b) || !rg3.b(this.c, t1aVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Float.hashCode(this.c) + nk2.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String i = zl1.i(this.a);
        String c = rg3.c(this.b);
        return s21.q(nk2.y("ScrollBarSpec(color=", i, ", size=", c, ", margin="), rg3.c(this.c), ")");
    }
}
