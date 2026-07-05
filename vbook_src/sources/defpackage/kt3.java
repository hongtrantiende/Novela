package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kt3  reason: default package */
/* loaded from: classes.dex */
public final class kt3 {
    public final ml5 a;
    public final boolean b;
    public final hg2 c;
    public final String d;

    public kt3(ml5 ml5Var, boolean z, hg2 hg2Var, String str) {
        this.a = ml5Var;
        this.b = z;
        this.c = hg2Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt3)) {
            return false;
        }
        kt3 kt3Var = (kt3) obj;
        if (c16.i(this.a, kt3Var.a) && this.b == kt3Var.b && this.c == kt3Var.c && c16.i(this.d, kt3Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + eub.k(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
