package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ia7  reason: default package */
/* loaded from: classes3.dex */
public final class ia7 {
    public static final ha7 Companion = new Object();
    public final long a;
    public final String b;
    public final int c;
    public final vzc d;
    public final ia7 e;
    public final int f;
    public final long g;
    public final long h;

    public /* synthetic */ ia7(int i, long j, String str, int i2, vzc vzcVar, ia7 ia7Var, int i3, long j2, long j3) {
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
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = new vzc();
        } else {
            this.d = vzcVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ia7Var;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia7)) {
            return false;
        }
        ia7 ia7Var = (ia7) obj;
        if (this.a == ia7Var.a && c16.i(this.b, ia7Var.b) && this.c == ia7Var.c && c16.i(this.d, ia7Var.d) && c16.i(this.e, ia7Var.e) && this.f == ia7Var.f && this.g == ia7Var.g && this.h == ia7Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + hl5.a(this.c, eub.j(Long.hashCode(this.a) * 31, 31, this.b), 31)) * 31;
        ia7 ia7Var = this.e;
        if (ia7Var == null) {
            hashCode = 0;
        } else {
            hashCode = ia7Var.hashCode();
        }
        return Long.hashCode(this.h) + hl5.c(hl5.a(this.f, (hashCode2 + hashCode) * 31, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageDto(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", user=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        rs8.x(sb, ", updatedAt=", this.g, ", createdAt=");
        return hl5.q(sb, this.h, ")");
    }
}
