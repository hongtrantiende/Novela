package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: va8  reason: default package */
/* loaded from: classes3.dex */
public final class va8 {
    public static final ua8 Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final float f;
    public final long g;

    public /* synthetic */ va8(int i, long j, String str, String str2, String str3, int i2, float f, long j2) {
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
        if (!(obj instanceof va8)) {
            return false;
        }
        va8 va8Var = (va8) obj;
        if (this.a == va8Var.a && c16.i(this.b, va8Var.b) && c16.i(this.c, va8Var.c) && c16.i(this.d, va8Var.d) && this.e == va8Var.e && Float.compare(this.f, va8Var.f) == 0 && this.g == va8Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + nk2.d(this.f, hl5.a(this.e, eub.j(eub.j(eub.j(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncNote(id=");
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
