package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tq2  reason: default package */
/* loaded from: classes.dex */
public final class tq2 {
    public final ml5 a;
    public final boolean b;

    public tq2(ml5 ml5Var, boolean z) {
        this.a = ml5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tq2) {
                tq2 tq2Var = (tq2) obj;
                if (!this.a.equals(tq2Var.a) || this.b != tq2Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}
