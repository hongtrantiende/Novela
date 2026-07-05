package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: xbb  reason: default package */
/* loaded from: classes3.dex */
public final class xbb {
    public static final wbb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public /* synthetic */ xbb(int i, long j, String str, String str2, String str3) {
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
            this.d = 0L;
        } else {
            this.d = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbb)) {
            return false;
        }
        xbb xbbVar = (xbb) obj;
        if (c16.i(this.a, xbbVar.a) && c16.i(this.b, xbbVar.b) && c16.i(this.c, xbbVar.c) && this.d == xbbVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncEmoji(id=", this.a, ", category=", this.b, ", url=");
        y.append(this.c);
        y.append(", lastUse=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }

    public xbb(long j, String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }
}
