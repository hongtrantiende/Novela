package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: m62  reason: default package */
/* loaded from: classes3.dex */
public final class m62 {
    public static final l62 Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ia7 f;
    public final int g;
    public final int h;
    public final boolean i;
    public final vzc j;
    public final long k;
    public final long l;

    /* JADX WARN: Type inference failed for: r0v0, types: [l62, java.lang.Object] */
    static {
        uzc uzcVar = vzc.Companion;
    }

    public /* synthetic */ m62(int i, long j, String str, String str2, String str3, String str4, ia7 ia7Var, int i2, int i3, boolean z, vzc vzcVar, long j2, long j3) {
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
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ia7Var;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0;
        } else {
            this.h = i3;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = vzcVar;
        }
        if ((i & 1024) == 0) {
            this.k = 0L;
        } else {
            this.k = j2;
        }
        if ((i & 2048) == 0) {
            this.l = 0L;
        } else {
            this.l = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m62)) {
            return false;
        }
        m62 m62Var = (m62) obj;
        if (this.a == m62Var.a && c16.i(this.b, m62Var.b) && c16.i(this.c, m62Var.c) && c16.i(this.d, m62Var.d) && c16.i(this.e, m62Var.e) && c16.i(this.f, m62Var.f) && this.g == m62Var.g && this.h == m62Var.h && this.i == m62Var.i && c16.i(this.j, m62Var.j) && this.k == m62Var.k && this.l == m62Var.l) {
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
        ia7 ia7Var = this.f;
        if (ia7Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ia7Var.hashCode();
        }
        int k = eub.k(hl5.a(this.h, hl5.a(this.g, (j2 + hashCode3) * 31, 31), 31), 31, this.i);
        vzc vzcVar = this.j;
        if (vzcVar != null) {
            i = vzcVar.hashCode();
        }
        return Long.hashCode(this.l) + hl5.c((k + i) * 31, this.k, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationDto(id=");
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
