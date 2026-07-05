package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ccc  reason: default package */
/* loaded from: classes3.dex */
public final class ccc {
    public final String a;
    public final qcc b;
    public final int c;
    public final int d;

    public ccc(String str, qcc qccVar, int i, int i2) {
        this.a = str;
        this.b = qccVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ccc) {
                ccc cccVar = (ccc) obj;
                if (!this.a.equals(cccVar.a) || this.b != cccVar.b || this.c != cccVar.c || this.d != cccVar.d) {
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
        return Integer.hashCode(this.d) + hl5.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Token(text=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", start=");
        return hl5.j(this.c, this.d, ", end=", ")", sb);
    }
}
