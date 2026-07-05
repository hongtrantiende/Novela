package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m61  reason: default package */
/* loaded from: classes.dex */
public final class m61 {
    public r13 a;
    public tc6 b;
    public k61 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m61) {
                m61 m61Var = (m61) obj;
                if (!c16.i(this.a, m61Var.a) || this.b != m61Var.b || !c16.i(this.c, m61Var.c) || !dna.a(this.d, m61Var.d)) {
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
        return Long.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        r13 r13Var = this.a;
        tc6 tc6Var = this.b;
        k61 k61Var = this.c;
        String f = dna.f(this.d);
        return "DrawParams(density=" + r13Var + ", layoutDirection=" + tc6Var + ", canvas=" + k61Var + ", size=" + f + ")";
    }
}
