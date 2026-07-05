package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
public final class gd {
    public static final fd Companion = new Object();
    public final int a;
    public final float b;

    public /* synthetic */ gd(float f, int i, int i2) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = f;
            return;
        }
        w92.x(i, 3, ed.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        if (this.a == gdVar.a && Float.compare(this.b, gdVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Anchor(pageIndex=" + this.a + ", offsetFraction=" + this.b + ")";
    }

    public gd(int i, float f) {
        this.a = i;
        this.b = f;
    }
}
