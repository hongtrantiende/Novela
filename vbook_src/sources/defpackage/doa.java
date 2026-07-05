package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: doa  reason: default package */
/* loaded from: classes3.dex */
public final class doa {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public doa(String str, boolean z, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doa)) {
            return false;
        }
        doa doaVar = (doa) obj;
        if (c16.i(this.a, doaVar.a) && c16.i(this.b, doaVar.b) && c16.i(this.c, doaVar.c) && this.d == doaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SkipWordRule(id=", this.a, ", word=", this.b, ", replace=");
        y.append(this.c);
        y.append(", ignoreCase=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
