package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: it8  reason: default package */
/* loaded from: classes3.dex */
public final class it8 {
    public final f76 a;
    public final ht8 b;

    public it8(f76 f76Var, ht8 ht8Var) {
        f76Var.getClass();
        this.a = f76Var;
        this.b = ht8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof it8) {
                it8 it8Var = (it8) obj;
                if (!c16.i(this.a, it8Var.a) || this.b != it8Var.b) {
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
        return "PendingImport(file=" + this.a + ", kind=" + this.b + ")";
    }
}
