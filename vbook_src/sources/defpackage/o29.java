package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o29  reason: default package */
/* loaded from: classes.dex */
public final class o29 {
    public final char a;
    public final int b;

    public o29(char c, int i) {
        this.a = c;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o29)) {
            return false;
        }
        o29 o29Var = (o29) obj;
        if (this.a == o29Var.a && this.b == o29Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Character.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PositionChar(char=" + this.a + ", index=" + this.b + ")";
    }
}
