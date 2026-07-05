package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt9  reason: default package */
/* loaded from: classes.dex */
public final class tt9 {
    public final ote a;
    public final rse b;
    public final kte c;
    public final hse d;

    public tt9(ote oteVar, rse rseVar, kte kteVar, hse hseVar) {
        this.a = oteVar;
        this.b = rseVar;
        this.c = kteVar;
        this.d = hseVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tt9) {
                tt9 tt9Var = (tt9) obj;
                if (!this.a.equals(tt9Var.a) || !this.b.equals(tt9Var.b) || !this.c.equals(tt9Var.c) || !this.d.equals(tt9Var.d)) {
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
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
