package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yp8  reason: default package */
/* loaded from: classes3.dex */
public final class yp8 {
    public final long a;
    public final xq8 b;

    public yp8(long j, xq8 xq8Var) {
        this.a = j;
        this.b = xq8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yp8) {
                yp8 yp8Var = (yp8) obj;
                if (!y78.d(this.a, yp8Var.a) || this.b != yp8Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String l = y78.l(this.a);
        return "PdfMenuAnchor(offset=" + l + ", alignment=" + this.b + ")";
    }
}
