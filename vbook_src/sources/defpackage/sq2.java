package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq2  reason: default package */
/* loaded from: classes3.dex */
public final class sq2 {
    public final rq2 a;
    public final jj b;

    public sq2(rq2 rq2Var, jj jjVar) {
        rq2Var.getClass();
        this.a = rq2Var;
        this.b = jjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq2) {
            sq2 sq2Var = (sq2) obj;
            if (c16.i(this.a, sq2Var.a) && this.b == sq2Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(params=" + this.a + ", bmp=" + this.b + ")";
    }
}
