package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gkb  reason: default package */
/* loaded from: classes.dex */
public final class gkb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gkb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gkb) {
                gkb gkbVar = (gkb) obj;
                if (this.a != gkbVar.a || this.b != gkbVar.b || this.c != gkbVar.c || this.d != gkbVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", controlByte=", ")", hl5.r(this.a, this.b, "TagxTag(tag=", ", numValues=", ", bitmask="));
    }
}
