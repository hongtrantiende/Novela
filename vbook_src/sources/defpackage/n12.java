package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n12  reason: default package */
/* loaded from: classes.dex */
public final class n12 {
    public final int a;
    public final long b;
    public final o12 c;
    public final k57 d;

    public n12(int i, long j, o12 o12Var, k57 k57Var) {
        this.a = i;
        this.b = j;
        this.c = o12Var;
        this.d = k57Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n12) {
                n12 n12Var = (n12) obj;
                if (this.a != n12Var.a || this.b != n12Var.b || this.c != n12Var.c || !c16.i(this.d, n12Var.d)) {
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
        int hashCode2 = (this.c.hashCode() + hl5.c(Integer.hashCode(this.a) * 31, this.b, 31)) * 31;
        k57 k57Var = this.d;
        if (k57Var == null) {
            hashCode = 0;
        } else {
            hashCode = k57Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
