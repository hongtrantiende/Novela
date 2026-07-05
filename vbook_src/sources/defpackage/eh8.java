package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh8  reason: default package */
/* loaded from: classes3.dex */
public final class eh8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public eh8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh8)) {
            return false;
        }
        eh8 eh8Var = (eh8) obj;
        if (Float.compare(this.a, eh8Var.a) == 0 && Float.compare(this.b, eh8Var.b) == 0 && Float.compare(this.c, eh8Var.c) == 0 && Float.compare(this.d, eh8Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("PDFRect(left=", this.a, ", top=", this.b, ", right=");
        x.append(this.c);
        x.append(", bottom=");
        x.append(this.d);
        x.append(")");
        return x.toString();
    }
}
