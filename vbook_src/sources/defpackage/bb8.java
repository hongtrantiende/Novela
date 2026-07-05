package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: bb8  reason: default package */
/* loaded from: classes3.dex */
public final class bb8 {
    public static final ab8 Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ bb8(int i, String str, String str2, int i2, long j) {
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
            this.d = 0L;
        } else {
            this.d = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb8)) {
            return false;
        }
        bb8 bb8Var = (bb8) obj;
        if (c16.i(this.a, bb8Var.a) && c16.i(this.b, bb8Var.b) && this.c == bb8Var.c && this.d == bb8Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("OldSyncQtName(src=", this.a, ", dest=", this.b, ", type=");
        y.append(this.c);
        y.append(", timestamp=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
