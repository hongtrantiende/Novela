package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e00  reason: default package */
/* loaded from: classes.dex */
public final class e00 {
    public final int a;
    public final int b;

    public e00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e00) {
                e00 e00Var = (e00) obj;
                if (this.a != e00Var.a || this.b != e00Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "AspectRatio(x=", ", y=", ")");
    }
}
