package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc5  reason: default package */
/* loaded from: classes.dex */
public final class sc5 {
    public final String a;
    public final String b;

    public sc5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sc5) {
                sc5 sc5Var = (sc5) obj;
                if (!this.a.equals(sc5Var.a) || !this.b.equals(sc5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("HtmlTagPair(open=", this.a, ", close=", this.b, ")");
    }
}
