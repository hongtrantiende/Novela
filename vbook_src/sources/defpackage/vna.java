package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vna  reason: default package */
/* loaded from: classes.dex */
public final class vna {
    public final int a;
    public final int b;

    public vna(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vna) {
                vna vnaVar = (vna) obj;
                if (this.a != vnaVar.a || this.b != vnaVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a82.C(this.b) + (a82.C(this.a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + hl5.A(this.a) + ", height=" + hl5.A(this.b) + ')';
    }
}
