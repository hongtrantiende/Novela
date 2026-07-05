package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: da7  reason: default package */
/* loaded from: classes3.dex */
public final class da7 extends fa7 {
    public final long a;
    public final ps b;
    public final bzc c;
    public final fa7 d;
    public final long e;
    public final long f;

    public da7(long j, ps psVar, bzc bzcVar, fa7 fa7Var, long j2, long j3) {
        this.a = j;
        this.b = psVar;
        this.c = bzcVar;
        this.d = fa7Var;
        this.e = j2;
        this.f = j3;
    }

    @Override // defpackage.fa7
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fa7
    public final long b() {
        return this.a;
    }

    @Override // defpackage.fa7
    public final bzc c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof da7) {
                da7 da7Var = (da7) obj;
                if (this.a != da7Var.a || !this.b.equals(da7Var.b) || !this.c.equals(da7Var.c) || !c16.i(this.d, da7Var.d) || this.e != da7Var.e || this.f != da7Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.fa7
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + (Long.hashCode(this.a) * 31)) * 31)) * 31;
        fa7 fa7Var = this.d;
        if (fa7Var == null) {
            hashCode = 0;
        } else {
            hashCode = fa7Var.hashCode();
        }
        return Long.hashCode(this.f) + hl5.c((hashCode3 + hashCode) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append((Object) this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append(", quote=");
        sb.append(this.d);
        rs8.x(sb, ", updatedAt=", this.e, ", createdAt=");
        return hl5.q(sb, this.f, ")");
    }
}
