package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vj9  reason: default package */
/* loaded from: classes.dex */
public final class vj9 implements una {
    public final cna a;

    public vj9(cna cnaVar) {
        this.a = cnaVar;
    }

    @Override // defpackage.una
    public final Object b(m42 m42Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof vj9) || !this.a.equals(((vj9) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.a + ")";
    }
}
