package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jo3  reason: default package */
/* loaded from: classes3.dex */
public final class jo3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final float i;

    public jo3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jo3) {
                jo3 jo3Var = (jo3) obj;
                if (!this.a.equals(jo3Var.a) || !this.b.equals(jo3Var.b) || !this.c.equals(jo3Var.c) || !this.d.equals(jo3Var.d) || !this.e.equals(jo3Var.e) || !this.f.equals(jo3Var.f) || !this.g.equals(jo3Var.g) || !this.h.equals(jo3Var.h) || Float.compare(this.i, jo3Var.i) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder y = nk2.y("EditableShareTopic(name=", this.a, ", nameTrans=", this.b, ", author=");
        nk2.C(y, this.c, ", authorTrans=", this.d, ", cover=");
        nk2.C(y, this.e, ", url=", this.f, ", source=");
        nk2.C(y, this.g, ", message=", this.h, ", rate=");
        y.append(this.i);
        y.append(")");
        return y.toString();
    }
}
