package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: fbb  reason: default package */
/* loaded from: classes3.dex */
public final class fbb {
    public static final ebb Companion = new Object();
    public final String a;
    public final String b;
    public final long c;

    public /* synthetic */ fbb(int i, long j, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbb)) {
            return false;
        }
        fbb fbbVar = (fbb) obj;
        if (c16.i(this.a, fbbVar.a) && c16.i(this.b, fbbVar.b) && this.c == fbbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hl5.q(nk2.y("SyncCategory(id=", this.a, ", name=", this.b, ", createAt="), this.c, ")");
    }

    public fbb(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
