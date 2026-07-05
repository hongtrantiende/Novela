package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o69  reason: default package */
/* loaded from: classes.dex */
public final class o69 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public o69(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o69) {
                o69 o69Var = (o69) obj;
                if (!this.a.equals(o69Var.a) || this.b != o69Var.b || this.c != o69Var.c || this.d != o69Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
