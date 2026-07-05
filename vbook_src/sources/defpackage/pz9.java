package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pz9  reason: default package */
/* loaded from: classes.dex */
public final class pz9 {
    public final uy5 a;
    public final float b;

    public pz9(uy5 uy5Var, float f) {
        this.a = uy5Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz9)) {
            return false;
        }
        pz9 pz9Var = (pz9) obj;
        if (c16.i(this.a, pz9Var.a) && Float.compare(this.b, pz9Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        uy5 uy5Var = this.a;
        if (uy5Var == null) {
            hashCode = 0;
        } else {
            hashCode = uy5Var.hashCode();
        }
        return Float.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "ScaledFragmentInfo(rect=" + this.a + ", pageZoom=" + this.b + ")";
    }

    public /* synthetic */ pz9() {
        this(null, 1.0f);
    }
}
