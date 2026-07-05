package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jy6  reason: default package */
/* loaded from: classes3.dex */
public final class jy6 extends hy6 {
    @Override // defpackage.hy6
    public final boolean equals(Object obj) {
        if (obj instanceof jy6) {
            if (!isEmpty() || !((jy6) obj).isEmpty()) {
                jy6 jy6Var = (jy6) obj;
                if (this.a == jy6Var.a && this.b == jy6Var.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.hy6
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.hy6
    public final boolean isEmpty() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hy6
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
