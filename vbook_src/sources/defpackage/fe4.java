package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fe4  reason: default package */
/* loaded from: classes3.dex */
public final class fe4 extends ge4 {
    public final hn8 a;
    public final long b;
    public final ve4 c;
    public final String d;

    public fe4(hn8 hn8Var, long j, ve4 ve4Var, String str) {
        this.a = hn8Var;
        this.b = j;
        this.c = ve4Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fe4) {
                fe4 fe4Var = (fe4) obj;
                if (!this.a.equals(fe4Var.a) || this.b != fe4Var.b || this.c != fe4Var.c || !c16.i(this.d, fe4Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = hl5.c(this.a.a.hashCode() * 31, this.b, 31);
        int i = 0;
        ve4 ve4Var = this.c;
        if (ve4Var == null) {
            hashCode = 0;
        } else {
            hashCode = ve4Var.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Success(path=" + this.a + ", length=" + this.b + ", fileType=" + this.c + ", mimeType=" + this.d + ")";
    }
}
