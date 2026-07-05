package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw7  reason: default package */
/* loaded from: classes3.dex */
public final class vw7 {
    public final String a;
    public final int b;

    public vw7(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw7)) {
            return false;
        }
        vw7 vw7Var = (vw7) obj;
        if (c16.i(this.a, vw7Var.a) && this.b == vw7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("Seg(word=", this.b, this.a, ", type=", ")");
    }
}
