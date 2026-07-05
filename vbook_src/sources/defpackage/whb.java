package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: whb  reason: default package */
/* loaded from: classes3.dex */
public final class whb {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public whb(String str, String str2, String str3, String str4, boolean z) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whb)) {
            return false;
        }
        whb whbVar = (whb) obj;
        if (c16.i(this.a, whbVar.a) && c16.i(this.b, whbVar.b) && c16.i(this.c, whbVar.c) && this.d == whbVar.d && c16.i(this.e, whbVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder y = nk2.y("TTSState(bookId=", this.a, ", title=", this.b, ", chapter=");
        rs8.y(y, this.c, ", isPlaying=", this.d, ", coverPath=");
        return s21.q(y, this.e, ")");
    }

    public /* synthetic */ whb() {
        this("", "", "", null, false);
    }
}
