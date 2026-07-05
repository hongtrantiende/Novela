package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iac  reason: default package */
/* loaded from: classes.dex */
public final class iac {
    public final long a;
    public final long b;
    public final long c;
    public final p1a d;

    public iac() {
        hq7 hq7Var = wl3.b;
        am3 am3Var = am3.SECONDS;
        long O = jue.O(45, am3Var);
        long O2 = jue.O(5, am3Var);
        long O3 = jue.O(5, am3Var);
        p1a p1aVar = lh9.I;
        this.a = O;
        this.b = O2;
        this.c = O3;
        this.d = p1aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iac) {
                iac iacVar = (iac) obj;
                if (!wl3.d(this.a, iacVar.a) || !wl3.d(this.b, iacVar.b) || !wl3.d(this.c, iacVar.c) || !c16.i(this.d, iacVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        hq7 hq7Var = wl3.b;
        return this.d.hashCode() + hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) wl3.j(this.a)) + ", additionalTime=" + ((Object) wl3.j(this.b)) + ", idleTimeout=" + ((Object) wl3.j(this.c)) + ", timeSource=" + this.d + ')';
    }
}
