package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tn5  reason: default package */
/* loaded from: classes.dex */
public final class tn5 implements qb4 {
    public final ml5 a;
    public final boolean b;
    public final hg2 c;

    public tn5(ml5 ml5Var, boolean z, hg2 hg2Var) {
        this.a = ml5Var;
        this.b = z;
        this.c = hg2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tn5) {
                tn5 tn5Var = (tn5) obj;
                if (!this.a.equals(tn5Var.a) || this.b != tn5Var.b || this.c != tn5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
