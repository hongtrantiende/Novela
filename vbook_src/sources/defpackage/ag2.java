package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ag2  reason: default package */
/* loaded from: classes.dex */
public final class ag2 {
    public final zf2 a;
    public final zf2 b;
    public final double c;

    public ag2(zf2 zf2Var, zf2 zf2Var2, double d) {
        this.a = zf2Var;
        this.b = zf2Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ag2) {
                ag2 ag2Var = (ag2) obj;
                if (this.a != ag2Var.a || this.b != ag2Var.b || Double.compare(this.c, ag2Var.c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Double.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
