package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: mdb  reason: default package */
/* loaded from: classes3.dex */
public final class mdb {
    public static final ldb Companion = new Object();
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public /* synthetic */ mdb(int i, long j, long j2, String str, String str2) {
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
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdb)) {
            return false;
        }
        mdb mdbVar = (mdb) obj;
        if (c16.i(this.a, mdbVar.a) && c16.i(this.b, mdbVar.b) && this.c == mdbVar.c && this.d == mdbVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncQtNameSkip(id=", this.a, ", word=", this.b, ", createAt=");
        y.append(this.c);
        return a82.n(y, ", updateAt=", this.d, ")");
    }

    public mdb(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }
}
