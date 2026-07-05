package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: r29  reason: default package */
/* loaded from: classes3.dex */
public final class r29 {
    public static final q29 Companion = new Object();
    public final long a;
    public final int b;
    public final vzc c;
    public final String d;
    public final r29 e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final boolean j;
    public final int k;

    public /* synthetic */ r29(int i, long j, int i2, vzc vzcVar, String str, r29 r29Var, int i3, int i4, long j2, long j3, boolean z, int i5) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = new vzc();
        } else {
            this.c = vzcVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = r29Var;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i4;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j2;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j3;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r29)) {
            return false;
        }
        r29 r29Var = (r29) obj;
        if (this.a == r29Var.a && this.b == r29Var.b && c16.i(this.c, r29Var.c) && c16.i(this.d, r29Var.d) && c16.i(this.e, r29Var.e) && this.f == r29Var.f && this.g == r29Var.g && this.h == r29Var.h && this.i == r29Var.i && this.j == r29Var.j && this.k == r29Var.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j((this.c.hashCode() + hl5.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
        r29 r29Var = this.e;
        if (r29Var == null) {
            hashCode = 0;
        } else {
            hashCode = r29Var.hashCode();
        }
        return Integer.hashCode(this.k) + eub.k(hl5.c(hl5.c(hl5.a(this.g, hl5.a(this.f, (j + hashCode) * 31, 31), 31), this.h, 31), this.i, 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostDto(id=");
        sb.append(this.a);
        sb.append(", topicId=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append(", content=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", likeCount=");
        sb.append(this.g);
        sb.append(", updatedAt=");
        sb.append(this.h);
        rs8.x(sb, ", createdAt=", this.i, ", liked=");
        sb.append(this.j);
        sb.append(", likes=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
