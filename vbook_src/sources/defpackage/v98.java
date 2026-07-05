package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: v98  reason: default package */
/* loaded from: classes3.dex */
public final class v98 {
    public static final u98 Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final float f;
    public final long g;

    public /* synthetic */ v98(int i, long j, String str, String str2, String str3, int i2, float f, long j2) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = nae.e;
        } else {
            this.f = f;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v98)) {
            return false;
        }
        v98 v98Var = (v98) obj;
        if (this.a == v98Var.a && c16.i(this.b, v98Var.b) && c16.i(this.c, v98Var.c) && c16.i(this.d, v98Var.d) && this.e == v98Var.e && Float.compare(this.f, v98Var.f) == 0 && this.g == v98Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + nk2.d(this.f, hl5.a(this.e, eub.j(eub.j(eub.j(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncBookmark(id=");
        sb.append(this.a);
        sb.append(", bookId=");
        sb.append(this.b);
        nk2.C(sb, ", content=", this.c, ", title=", this.d);
        sb.append(", chapIndex=");
        sb.append(this.e);
        sb.append(", position=");
        sb.append(this.f);
        return a82.n(sb, ", timestamp=", this.g, ")");
    }
}
