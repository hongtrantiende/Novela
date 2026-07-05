package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ba7  reason: default package */
/* loaded from: classes3.dex */
public final class ba7 extends fa7 {
    public final long a;
    public final String b;
    public final int c;
    public final int d;
    public final bzc e;
    public final fa7 f;
    public final long g;
    public final long h;

    public ba7(long j, String str, int i, int i2, bzc bzcVar, fa7 fa7Var, long j2, long j3) {
        str.getClass();
        bzcVar.getClass();
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = bzcVar;
        this.f = fa7Var;
        this.g = j2;
        this.h = j3;
    }

    @Override // defpackage.fa7
    public final long a() {
        return this.h;
    }

    @Override // defpackage.fa7
    public final long b() {
        return this.a;
    }

    @Override // defpackage.fa7
    public final bzc c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba7)) {
            return false;
        }
        ba7 ba7Var = (ba7) obj;
        if (this.a == ba7Var.a && c16.i(this.b, ba7Var.b) && this.c == ba7Var.c && this.d == ba7Var.d && c16.i(this.e, ba7Var.e) && c16.i(this.f, ba7Var.f) && this.g == ba7Var.g && this.h == ba7Var.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fa7
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.e.hashCode() + hl5.a(this.d, hl5.a(this.c, eub.j(Long.hashCode(this.a) * 31, 31, this.b), 31), 31)) * 31;
        fa7 fa7Var = this.f;
        if (fa7Var == null) {
            hashCode = 0;
        } else {
            hashCode = fa7Var.hashCode();
        }
        return Long.hashCode(this.h) + hl5.c((hashCode2 + hashCode) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        a82.t(this.c, this.d, ", width=", ", height=", sb);
        sb.append(", user=");
        sb.append(this.e);
        sb.append(", quote=");
        sb.append(this.f);
        rs8.x(sb, ", updatedAt=", this.g, ", createdAt=");
        return hl5.q(sb, this.h, ")");
    }
}
