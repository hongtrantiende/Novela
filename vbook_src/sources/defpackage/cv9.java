package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cv9  reason: default package */
/* loaded from: classes.dex */
public final class cv9 {
    public float a = nae.e;
    public boolean b = true;
    public nmd c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv9)) {
            return false;
        }
        cv9 cv9Var = (cv9) obj;
        if (Float.compare(this.a, cv9Var.a) == 0 && this.b == cv9Var.b && c16.i(this.c, cv9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(Float.hashCode(this.a) * 31, 31, this.b);
        nmd nmdVar = this.c;
        if (nmdVar == null) {
            hashCode = 0;
        } else {
            hashCode = nmdVar.hashCode();
        }
        return (k + hashCode) * 31;
    }

    public final String toString() {
        float f = this.a;
        boolean z = this.b;
        nmd nmdVar = this.c;
        return "RowColumnParentData(weight=" + f + ", fill=" + z + ", crossAxisAlignment=" + nmdVar + ", flowLayoutData=null)";
    }
}
