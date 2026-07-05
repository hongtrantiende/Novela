package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: cdb  reason: default package */
/* loaded from: classes3.dex */
public final class cdb {
    public static final bdb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;

    public /* synthetic */ cdb(int i, String str, String str2, String str3, boolean z, long j) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdb)) {
            return false;
        }
        cdb cdbVar = (cdb) obj;
        if (c16.i(this.a, cdbVar.a) && c16.i(this.b, cdbVar.b) && c16.i(this.c, cdbVar.c) && this.d == cdbVar.d && this.e == cdbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + eub.k(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncName(id=", this.a, ", word=", this.b, ", replace=");
        rs8.y(y, this.c, ", ignoreCase=", this.d, ", createAt=");
        return hl5.q(y, this.e, ")");
    }

    public cdb(String str, String str2, String str3, boolean z, long j) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
    }
}
