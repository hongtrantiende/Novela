package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kjb  reason: default package */
/* loaded from: classes3.dex */
public final class kjb {
    public final float a;
    public final float b;

    public kjb(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kjb) {
                kjb kjbVar = (kjb) obj;
                if (!rg3.b(this.a, kjbVar.a) || !rg3.b(this.b, kjbVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        String c = rg3.c(f);
        float f2 = this.b;
        String c2 = rg3.c(f + f2);
        return s21.q(nk2.y("TabPosition(left=", c, ", right=", c2, ", width="), rg3.c(f2), ")");
    }
}
