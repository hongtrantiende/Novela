package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa5  reason: default package */
/* loaded from: classes3.dex */
public final class xa5 extends ote {
    public final String c;
    public final int d;

    public xa5(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xa5) {
                xa5 xa5Var = (xa5) obj;
                if (!this.c.equals(xa5Var.c) || this.d != xa5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("DroppedContent(reason=", this.d, this.c, ", charOffset=", ")");
    }
}
