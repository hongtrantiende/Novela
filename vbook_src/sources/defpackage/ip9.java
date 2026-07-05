package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ip9  reason: default package */
/* loaded from: classes3.dex */
public final class ip9 {
    public final int a;
    public final String b;
    public final bzc c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final long h;
    public final long i;

    public ip9(int i, String str, bzc bzcVar, int i2, int i3, boolean z, int i4, long j, long j2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = bzcVar;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = i4;
        this.h = j;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ip9) {
                ip9 ip9Var = (ip9) obj;
                if (this.a != ip9Var.a || !c16.i(this.b, ip9Var.b) || !this.c.equals(ip9Var.c) || this.d != ip9Var.d || this.e != ip9Var.e || this.f != ip9Var.f || this.g != ip9Var.g || this.h != ip9Var.h || this.i != ip9Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
        return Long.hashCode(this.i) + hl5.c(hl5.a(this.g, eub.k(hl5.a(this.e, hl5.a(this.d, (this.c.hashCode() + j) * 31, 31), 31), 31, this.f), 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("ReportTopic(id=", this.a, ", title=", this.b, ", user=");
        r.append(this.c);
        r.append(", status=");
        r.append(this.d);
        r.append(", type=");
        eub.w(r, this.e, ", pined=", this.f, ", comments=");
        r.append(this.g);
        r.append(", updatedAt=");
        r.append(this.h);
        return a82.n(r, ", createdAt=", this.i, ")");
    }
}
