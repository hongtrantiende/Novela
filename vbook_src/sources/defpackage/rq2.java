package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rq2  reason: default package */
/* loaded from: classes3.dex */
public final class rq2 {
    public final int a;
    public final uy5 b;

    public rq2(int i, uy5 uy5Var) {
        this.a = i;
        this.b = uy5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rq2) {
                rq2 rq2Var = (rq2) obj;
                if (this.a != rq2Var.a || !this.b.equals(rq2Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DecodeParams(sampleSize=" + this.a + ", subset=" + this.b + ")";
    }
}
