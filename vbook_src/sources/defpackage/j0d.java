package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: j0d  reason: default package */
/* loaded from: classes3.dex */
public final class j0d {
    public static final i0d Companion = new Object();
    public final a0d a;
    public final String b;
    public final String c;

    public /* synthetic */ j0d(int i, a0d a0dVar, String str, String str2) {
        this.a = (i & 1) == 0 ? new a0d() : a0dVar;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0d)) {
            return false;
        }
        j0d j0dVar = (j0d) obj;
        if (c16.i(this.a, j0dVar.a) && c16.i(this.b, j0dVar.b) && c16.i(this.c, j0dVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserLoginDto(user=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        return s21.q(sb, this.c, ")");
    }
}
