package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h27  reason: default package */
/* loaded from: classes.dex */
public final class h27 {
    public final pm1 a;
    public final etc b;
    public final lfa c;
    public final tr7 d;

    public h27(pm1 pm1Var, etc etcVar, lfa lfaVar, tr7 tr7Var) {
        this.a = pm1Var;
        this.b = etcVar;
        this.c = lfaVar;
        this.d = tr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h27.class != obj.getClass()) {
            return false;
        }
        h27 h27Var = (h27) obj;
        if (c16.i(this.a, h27Var.a) && c16.i(this.b, h27Var.b) && c16.i(this.c, h27Var.c) && c16.i(this.d, h27Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }
}
