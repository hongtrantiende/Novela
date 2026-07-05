package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yc5  reason: default package */
/* loaded from: classes3.dex */
public final class yc5 implements bd5 {
    public final String a;
    public final int b;
    public final int c;

    public yc5(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yc5) {
                yc5 yc5Var = (yc5) obj;
                if (!this.a.equals(yc5Var.a) || this.b != yc5Var.b || this.c != yc5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.s("CloseTag(name=", this.a, ", sourceStart=", this.b, ", sourceEndExclusive="));
    }
}
