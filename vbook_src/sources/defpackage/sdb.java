package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: sdb  reason: default package */
/* loaded from: classes3.dex */
public final class sdb {
    public static final rdb Companion = new Object();
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ sdb(int i, String str, long j, long j2, long j3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdb)) {
            return false;
        }
        sdb sdbVar = (sdb) obj;
        if (c16.i(this.a, sdbVar.a) && this.b == sdbVar.b && this.c == sdbVar.c && this.d == sdbVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(hl5.c(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncReadHistory(id=");
        sb.append(this.a);
        sb.append(", readTime=");
        sb.append(this.b);
        rs8.x(sb, ", listenTime=", this.c, ", createAt=");
        return hl5.q(sb, this.d, ")");
    }

    public sdb(String str, long j, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
