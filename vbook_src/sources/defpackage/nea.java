package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nea  reason: default package */
/* loaded from: classes.dex */
public final class nea {
    public static final nea d = new nea(nae.e, sve.d(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public nea(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nea) {
                nea neaVar = (nea) obj;
                if (zl1.c(this.a, neaVar.a) && y78.d(this.b, neaVar.b) && this.c == neaVar.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Float.hashCode(this.c) + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Shadow(color=", zl1.i(this.a), ", offset=", y78.l(this.b), ", blurRadius=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
