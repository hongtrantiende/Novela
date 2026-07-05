package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j62  reason: default package */
/* loaded from: classes3.dex */
public final class j62 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final fa7 f;
    public final int g;
    public final int h;
    public final boolean i;
    public final bzc j;
    public final long k;
    public final long l;

    public j62(long j, String str, String str2, String str3, String str4, fa7 fa7Var, int i, int i2, boolean z, bzc bzcVar, long j2, long j3) {
        str.getClass();
        str4.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = fa7Var;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = bzcVar;
        this.k = j2;
        this.l = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j62)) {
            return false;
        }
        j62 j62Var = (j62) obj;
        if (this.a == j62Var.a && c16.i(this.b, j62Var.b) && c16.i(this.c, j62Var.c) && c16.i(this.d, j62Var.d) && c16.i(this.e, j62Var.e) && c16.i(this.f, j62Var.f) && this.g == j62Var.g && this.h == j62Var.h && this.i == j62Var.i && c16.i(this.j, j62Var.j) && this.k == j62Var.k && this.l == j62Var.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int j = eub.j(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int j2 = eub.j((i2 + hashCode2) * 31, 31, this.e);
        fa7 fa7Var = this.f;
        if (fa7Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fa7Var.hashCode();
        }
        int k = eub.k(hl5.a(this.h, hl5.a(this.g, (j2 + hashCode3) * 31, 31), 31), 31, this.i);
        bzc bzcVar = this.j;
        if (bzcVar != null) {
            i = bzcVar.hashCode();
        }
        return Long.hashCode(this.l) + hl5.c((k + i) * 31, this.k, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Conversation(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        nk2.C(sb, ", name=", this.c, ", image=", this.d);
        sb.append(", visibility=");
        sb.append(this.e);
        sb.append(", latestMessage=");
        sb.append(this.f);
        a82.t(this.g, this.h, ", unreadCount=", ", memberCount=", sb);
        sb.append(", isJoined=");
        sb.append(this.i);
        sb.append(", createdBy=");
        sb.append(this.j);
        rs8.x(sb, ", updatedAt=", this.k, ", createdAt=");
        return hl5.q(sb, this.l, ")");
    }
}
