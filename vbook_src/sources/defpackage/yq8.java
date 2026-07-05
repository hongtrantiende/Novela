package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yq8  reason: default package */
/* loaded from: classes3.dex */
public final class yq8 {
    public final long a;
    public final long b;

    public yq8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yq8) {
                yq8 yq8Var = (yq8) obj;
                if (!y78.d(this.a, yq8Var.a) || !y78.d(this.b, yq8Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.o("PdfSelectionAnchors(topCenter=", y78.l(this.a), ", bottomCenter=", y78.l(this.b), ")");
    }
}
