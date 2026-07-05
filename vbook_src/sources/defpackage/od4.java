package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: od4  reason: default package */
/* loaded from: classes3.dex */
public final class od4 extends qd4 {
    public final Object a;
    public final int b;

    public od4(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od4)) {
            return false;
        }
        od4 od4Var = (od4) obj;
        if (c16.i(this.a, od4Var.a) && this.b == od4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Integer.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "Progress(processed=" + this.a + ", total=" + this.b + ")";
    }
}
