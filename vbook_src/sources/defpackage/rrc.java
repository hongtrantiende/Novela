package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: rrc  reason: default package */
/* loaded from: classes3.dex */
public final class rrc {
    public static final qrc Companion = new Object();
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ rrc(String str, String str2, boolean z, String str3, int i, String str4) {
        if (12 == (i & 12)) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = true;
            } else {
                this.b = z;
            }
            this.c = str2;
            this.d = str3;
            if ((i & 16) == 0) {
                this.e = "";
                return;
            } else {
                this.e = str4;
                return;
            }
        }
        w92.x(i, 12, prc.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrc)) {
            return false;
        }
        rrc rrcVar = (rrc) obj;
        if (c16.i(this.a, rrcVar.a) && this.b == rrcVar.b && c16.i(this.c, rrcVar.c) && c16.i(this.d, rrcVar.d) && c16.i(this.e, rrcVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxtRuleDto(id=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", name=");
        nk2.C(sb, this.c, ", rule=", this.d, ", example=");
        return s21.q(sb, this.e, ")");
    }

    public rrc(String str, String str2, String str3, String str4, boolean z) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
