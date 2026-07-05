package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: eb8  reason: default package */
/* loaded from: classes3.dex */
public final class eb8 {
    public static final db8 Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public /* synthetic */ eb8(int i, String str, String str2, int i2, int i3, long j) {
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
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
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
        if (!(obj instanceof eb8)) {
            return false;
        }
        eb8 eb8Var = (eb8) obj;
        if (c16.i(this.a, eb8Var.a) && c16.i(this.b, eb8Var.b) && this.c == eb8Var.c && this.d == eb8Var.d && this.e == eb8Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("OldSyncQtVietPhrase(src=", this.a, ", dest=", this.b, ", type=");
        rs8.q(this.c, this.d, ", wordType=", ", timestamp=", y);
        return hl5.q(y, this.e, ")");
    }
}
