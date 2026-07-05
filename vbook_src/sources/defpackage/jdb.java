package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: jdb  reason: default package */
/* loaded from: classes3.dex */
public final class jdb {
    public static final idb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    public /* synthetic */ jdb(int i, long j, long j2, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdb)) {
            return false;
        }
        jdb jdbVar = (jdb) obj;
        if (c16.i(this.a, jdbVar.a) && c16.i(this.b, jdbVar.b) && c16.i(this.c, jdbVar.c) && c16.i(this.d, jdbVar.d) && this.e == jdbVar.e && this.f == jdbVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Long.hashCode(this.f) + hl5.c((i2 + i) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncQtDictionary(id=", this.a, ", name=", this.b, ", nameDictionary=");
        nk2.C(y, this.c, ", vpDictionary=", this.d, ", createAt=");
        y.append(this.e);
        return a82.n(y, ", updateAt=", this.f, ")");
    }

    public jdb(String str, String str2, String str3, String str4, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
    }
}
