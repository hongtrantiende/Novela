package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mnc  reason: default package */
/* loaded from: classes3.dex */
public final class mnc {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public mnc(String str, boolean z, String str2, String str3) {
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
        if (!(obj instanceof mnc)) {
            return false;
        }
        mnc mncVar = (mnc) obj;
        if (c16.i(this.a, mncVar.a) && c16.i(this.b, mncVar.b) && c16.i(this.c, mncVar.c) && this.d == mncVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TrashWord(id=", this.a, ", bookId=", this.b, ", word=");
        y.append(this.c);
        y.append(", regex=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
