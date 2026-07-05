package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: fdb  reason: default package */
/* loaded from: classes3.dex */
public final class fdb {
    public static final edb Companion = new Object();
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final long e;

    public /* synthetic */ fdb(int i, String str, int i2, String str2, boolean z, long j) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
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
        if (!(obj instanceof fdb)) {
            return false;
        }
        fdb fdbVar = (fdb) obj;
        if (c16.i(this.a, fdbVar.a) && this.b == fdbVar.b && c16.i(this.c, fdbVar.c) && this.d == fdbVar.d && this.e == fdbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + eub.k(eub.j(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder s = s21.s("SyncNotification(id=", this.a, ", type=", this.b, ", content=");
        rs8.y(s, this.c, ", read=", this.d, ", createAt=");
        return hl5.q(s, this.e, ")");
    }

    public fdb(int i, long j, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = j;
    }
}
