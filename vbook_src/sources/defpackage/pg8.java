package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pg8  reason: default package */
/* loaded from: classes.dex */
public final class pg8 {
    public final long a;
    public final th8 b;

    public pg8() {
        long d = sve.d(4284900966L);
        th8 h = zbe.h(3, nae.e);
        this.a = d;
        this.b = h;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (pg8.class.equals(cls)) {
                obj.getClass();
                pg8 pg8Var = (pg8) obj;
                if (!zl1.c(this.a, pg8Var.a) || !c16.i(this.b, pg8Var.b)) {
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
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String i = zl1.i(this.a);
        return "OverscrollConfiguration(glowColor=" + i + ", drawPadding=" + this.b + ")";
    }
}
