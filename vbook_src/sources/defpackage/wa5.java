package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wa5  reason: default package */
/* loaded from: classes3.dex */
public final class wa5 extends ote {
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public wa5(String str, String str2, String str3, int i) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wa5) {
                wa5 wa5Var = (wa5) obj;
                if (!this.c.equals(wa5Var.c) || !this.d.equals(wa5Var.d) || !this.e.equals(wa5Var.e) || this.f != wa5Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + eub.j(eub.j(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DroppedAttribute(tag=", this.c, ", attr=", this.d, ", reason=");
        y.append(this.e);
        y.append(", charOffset=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
