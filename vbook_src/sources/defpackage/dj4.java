package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dj4  reason: default package */
/* loaded from: classes3.dex */
public final class dj4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public dj4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof dj4)) {
            dj4 dj4Var = (dj4) obj;
            if (rg3.b(this.a, dj4Var.a) && rg3.b(this.b, dj4Var.b) && rg3.b(this.c, dj4Var.c)) {
                return rg3.b(this.d, dj4Var.d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
