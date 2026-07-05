package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w61  reason: default package */
/* loaded from: classes3.dex */
public final class w61 {
    public final float a;
    public final float b;

    public w61(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof w61)) {
                w61 w61Var = (w61) obj;
                if (rg3.b(this.a, w61Var.a) && rg3.b(nae.e, nae.e) && rg3.b(nae.e, nae.e) && rg3.b(this.b, w61Var.b) && rg3.b(nae.e, nae.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(nae.e) + nk2.d(this.b, nk2.d(nae.e, nk2.d(nae.e, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
