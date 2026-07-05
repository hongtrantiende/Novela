package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sb7  reason: default package */
/* loaded from: classes.dex */
public final class sb7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;

    public sb7(String str, String str2, String str3, String str4, String str5, float f) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sb7) {
                sb7 sb7Var = (sb7) obj;
                if (!this.a.equals(sb7Var.a) || !this.b.equals(sb7Var.b) || !this.c.equals(sb7Var.c) || !this.d.equals(sb7Var.d) || !c16.i(this.e, sb7Var.e) || Float.compare(this.f, sb7Var.f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Metadata(title=", this.a, ", creator=", this.b, ", identifier=");
        nk2.C(y, this.c, ", language=", this.d, ", cover=");
        y.append(this.e);
        y.append(", version=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
