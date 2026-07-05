package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: grd  reason: default package */
/* loaded from: classes.dex */
public final class grd {
    public static final grd c = new grd(7);
    public final int a;
    public final mn3 b;

    static {
        new grd(6);
    }

    public grd(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 300;
        } else {
            i2 = 0;
        }
        rd2 rd2Var = on3.a;
        rd2Var.getClass();
        this.a = i2;
        this.b = rd2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof grd) {
                grd grdVar = (grd) obj;
                if (this.a != grdVar.a || !c16.i(this.b, grdVar.b) || Float.compare(nae.e, nae.e) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Float.hashCode(nae.e) + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ZoomAnimationSpec(durationMillis=" + this.a + ", easing=" + this.b + ", initialVelocity=0.0)";
    }
}
