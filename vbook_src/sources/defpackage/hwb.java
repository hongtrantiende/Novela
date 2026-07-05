package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hwb  reason: default package */
/* loaded from: classes3.dex */
public final class hwb {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public hwb(float f, int i, int i2, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hwb) {
                hwb hwbVar = (hwb) obj;
                if (this.a != hwbVar.a || this.b != hwbVar.b || this.c != hwbVar.c || Float.compare(this.d, hwbVar.d) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Line(isParagraphSpace=" + this.a + ", lineIndex=" + this.b + ", paragraphIndex=" + this.c + ", lineHeight=" + this.d + ")";
    }
}
