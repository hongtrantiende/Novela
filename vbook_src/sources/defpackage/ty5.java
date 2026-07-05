package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty5  reason: default package */
/* loaded from: classes.dex */
public final class ty5 extends ry5 {
    public static final ty5 d = new ry5(1, 0, 1);

    @Override // defpackage.ry5
    public final boolean equals(Object obj) {
        if (obj instanceof ty5) {
            if (!isEmpty() || !((ty5) obj).isEmpty()) {
                ty5 ty5Var = (ty5) obj;
                if (this.a == ty5Var.a && this.b == ty5Var.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ry5
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ry5
    public final boolean isEmpty() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ry5
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
