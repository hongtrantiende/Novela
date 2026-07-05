package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ji4  reason: default package */
/* loaded from: classes.dex */
public final class ji4 {
    public final String a;
    public final String b;
    public final String c;

    public ji4(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ji4) {
                ji4 ji4Var = (ji4) obj;
                if (!this.a.equals(ji4Var.a) || !c16.i(this.b, ji4Var.b) || !c16.i(this.c, ji4Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("FlatEpubReference(parent=", this.a, ", href=", this.b, ", text="), this.c, ")");
    }
}
