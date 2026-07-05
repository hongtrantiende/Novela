package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br5  reason: default package */
/* loaded from: classes.dex */
public final class br5 {
    public final ar5 a;
    public final int b;

    public br5(ar5 ar5Var, int i) {
        this.a = ar5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof br5) {
                br5 br5Var = (br5) obj;
                if (!this.a.equals(br5Var.a) || this.b != br5Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
