package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: cbb  reason: default package */
/* loaded from: classes3.dex */
public final class cbb {
    public static final bbb Companion = new Object();
    public final String a;
    public final String b;
    public final long c;

    public /* synthetic */ cbb(int i, long j, String str, String str2) {
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
        if (!(obj instanceof cbb)) {
            return false;
        }
        cbb cbbVar = (cbb) obj;
        if (c16.i(this.a, cbbVar.a) && c16.i(this.b, cbbVar.b) && this.c == cbbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hl5.q(nk2.y("SyncBrowserHistory(url=", this.a, ", title=", this.b, ", createAt="), this.c, ")");
    }

    public cbb(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
