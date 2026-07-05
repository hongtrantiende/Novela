package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bb5  reason: default package */
/* loaded from: classes3.dex */
public final class bb5 extends ote {
    public final String c;
    public final int d;

    public bb5(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bb5) {
                bb5 bb5Var = (bb5) obj;
                if (!this.c.equals(bb5Var.c) || this.d != bb5Var.d) {
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
        return s21.k("StrayClosingTag(tag=", this.d, this.c, ", charOffset=", ")");
    }
}
