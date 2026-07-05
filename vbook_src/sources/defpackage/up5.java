package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: up5  reason: default package */
/* loaded from: classes3.dex */
public final class up5 extends vp5 {
    public final hn8 a;
    public final long b;
    public final wq5 c;
    public final int d;
    public final int e;

    public up5(hn8 hn8Var, long j, wq5 wq5Var, int i, int i2) {
        hn8Var.getClass();
        this.a = hn8Var;
        this.b = j;
        this.c = wq5Var;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up5)) {
            return false;
        }
        up5 up5Var = (up5) obj;
        if (c16.i(this.a, up5Var.a) && this.b == up5Var.b && this.c == up5Var.c && this.d == up5Var.d && this.e == up5Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = hl5.c(this.a.a.hashCode() * 31, this.b, 31);
        wq5 wq5Var = this.c;
        if (wq5Var == null) {
            hashCode = 0;
        } else {
            hashCode = wq5Var.hashCode();
        }
        return Integer.hashCode(this.e) + hl5.a(this.d, (c + hashCode) * 31, 31);
    }

    public final String toString() {
        return "Success(path=" + this.a + ", length=" + this.b + ", imageType=" + this.c + ", width=" + this.d + ", height=" + this.e + ")";
    }
}
