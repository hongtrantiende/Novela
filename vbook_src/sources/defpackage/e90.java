package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e90  reason: default package */
/* loaded from: classes3.dex */
public final class e90 {
    public final int a;
    public final int b;
    public final String c;

    public e90(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e90) {
                e90 e90Var = (e90) obj;
                if (this.a != e90Var.a || this.b != e90Var.b || !this.c.equals(e90Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return s21.q(hl5.r(this.a, this.b, "DetectedLink(start=", ", end=", ", url="), this.c, ")");
    }
}
