package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fna  reason: default package */
/* loaded from: classes.dex */
public final class fna {
    public final lq a;
    public long b;

    public fna(lq lqVar, long j) {
        this.a = lqVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fna) {
                fna fnaVar = (fna) obj;
                if (this.a == fnaVar.a && zy5.b(this.b, fnaVar.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String c = zy5.c(this.b);
        return "AnimData(anim=" + this.a + ", startSize=" + c + ")";
    }
}
