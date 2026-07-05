package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a01  reason: default package */
/* loaded from: classes.dex */
public final class a01 {
    public final float a;

    public a01(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof a01)) {
                a01 a01Var = (a01) obj;
                if (rg3.b(nae.e, nae.e) && rg3.b(nae.e, nae.e) && rg3.b(nae.e, nae.e) && rg3.b(this.a, a01Var.a) && rg3.b(nae.e, nae.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(nae.e) + nk2.d(this.a, nk2.d(nae.e, nk2.d(nae.e, Float.hashCode(nae.e) * 31, 31), 31), 31);
    }
}
