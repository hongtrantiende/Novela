package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq8  reason: default package */
/* loaded from: classes.dex */
public final class gq8 implements jq8 {
    public final int a;
    public final int b;

    public gq8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq8)) {
            return false;
        }
        gq8 gq8Var = (gq8) obj;
        if (this.a == gq8Var.a && this.b == gq8Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "Ref(num=", ", gen=", ")");
    }
}
