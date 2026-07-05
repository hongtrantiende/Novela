package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd2  reason: default package */
/* loaded from: classes3.dex */
public final class dd2 {
    public final int a;
    public final long b;
    public final float c;

    public dd2() {
        long j = zl1.e;
        this.a = 2;
        this.b = j;
        this.c = 0.7f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd2) {
                dd2 dd2Var = (dd2) obj;
                if (this.a != dd2Var.a || !zl1.c(this.b, dd2Var.b) || !rg3.b(this.c, dd2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Float.hashCode(this.c) + hl5.c(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String i = zl1.i(this.b);
        return s21.q(s21.r("CropperStyleGuidelines(count=", this.a, ", color=", i, ", width="), rg3.c(this.c), ")");
    }
}
