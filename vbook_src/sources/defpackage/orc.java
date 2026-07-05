package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: orc  reason: default package */
/* loaded from: classes3.dex */
public final class orc {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public orc(String str, String str2, String str3, String str4, boolean z) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public static orc a(orc orcVar, boolean z, String str, String str2, String str3, int i) {
        boolean z2 = z;
        String str4 = orcVar.a;
        if ((i & 2) != 0) {
            z2 = orcVar.b;
        }
        if ((i & 4) != 0) {
            str = orcVar.c;
        }
        if ((i & 8) != 0) {
            str2 = orcVar.d;
        }
        if ((i & 16) != 0) {
            str3 = orcVar.e;
        }
        orcVar.getClass();
        str4.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new orc(str4, str, str2, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orc)) {
            return false;
        }
        orc orcVar = (orc) obj;
        if (c16.i(this.a, orcVar.a) && this.b == orcVar.b && c16.i(this.c, orcVar.c) && c16.i(this.d, orcVar.d) && c16.i(this.e, orcVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxtRule(id=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", name=");
        nk2.C(sb, this.c, ", rule=", this.d, ", example=");
        return s21.q(sb, this.e, ")");
    }
}
