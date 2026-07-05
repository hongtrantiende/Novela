package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nid  reason: default package */
/* loaded from: classes3.dex */
public final class nid {
    public final float a;
    public final float b;

    public nid(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nid) {
                nid nidVar = (nid) obj;
                if (!rg3.b(this.a, nidVar.a) || !rg3.b(this.b, nidVar.b)) {
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
        return hl5.o("WindowInfo(screenWidthDp=", rg3.c(this.a), ", screenHeightDp=", rg3.c(this.b), ")");
    }
}
