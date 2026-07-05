package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc3  reason: default package */
/* loaded from: classes.dex */
public final class cc3 {
    public final String a;
    public final String b;

    public cc3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc3)) {
            return false;
        }
        cc3 cc3Var = (cc3) obj;
        if (c16.i(this.a, cc3Var.a) && c16.i(this.b, cc3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("DocSection(title=", this.a, ", html=", this.b, ")");
    }
}
