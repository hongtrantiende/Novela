package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t4b  reason: default package */
/* loaded from: classes3.dex */
public final class t4b implements q65 {
    public final no3 a;
    public final no3 b;

    public t4b(no3 no3Var, no3 no3Var2) {
        no3Var.getClass();
        this.a = no3Var;
        this.b = no3Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t4b) {
                t4b t4bVar = (t4b) obj;
                if (!c16.i(this.a, t4bVar.a) || !this.b.equals(t4bVar.b)) {
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
        return "StructuralEntry(before=" + this.a + ", after=" + this.b + ")";
    }
}
