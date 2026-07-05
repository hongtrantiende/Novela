package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dpa  reason: default package */
/* loaded from: classes.dex */
public final class dpa {
    public final xt4 a;
    public final lf4 b;

    public dpa(lf4 lf4Var, xt4 xt4Var) {
        this.a = xt4Var;
        this.b = lf4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dpa) {
                dpa dpaVar = (dpa) obj;
                if (!c16.i(this.a, dpaVar.a) || !this.b.equals(dpaVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
