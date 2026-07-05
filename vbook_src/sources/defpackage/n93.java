package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n93  reason: default package */
/* loaded from: classes3.dex */
public final class n93 {
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final bzc f;
    public final int g;
    public final List h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final long m;
    public final long n;

    public n93(int i, String str, String str2, List list, String str3, bzc bzcVar, int i2, List list2, int i3, boolean z, boolean z2, int i4, long j, long j2) {
        str.getClass();
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = bzcVar;
        this.g = i2;
        this.h = list2;
        this.i = i3;
        this.j = z;
        this.k = z2;
        this.l = i4;
        this.m = j;
        this.n = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n93) {
                n93 n93Var = (n93) obj;
                if (this.a != n93Var.a || !c16.i(this.b, n93Var.b) || !this.c.equals(n93Var.c) || !this.d.equals(n93Var.d) || !c16.i(this.e, n93Var.e) || !this.f.equals(n93Var.f) || this.g != n93Var.g || !this.h.equals(n93Var.h) || this.i != n93Var.i || this.j != n93Var.j || this.k != n93Var.k || this.l != n93Var.l || this.m != n93Var.m || this.n != n93Var.n) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(eub.l(eub.j(eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e);
        return Long.hashCode(this.n) + hl5.c(hl5.a(this.l, eub.k(eub.k(hl5.a(this.i, eub.l(hl5.a(this.g, (this.f.hashCode() + j) * 31, 31), this.h, 31), 31), 31, this.j), 31, this.k), 31), this.m, 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("DiscussTopic(id=", this.a, ", title=", this.b, ", content=");
        r.append(this.c);
        r.append(", images=");
        r.append(this.d);
        r.append(", background=");
        r.append(this.e);
        r.append(", user=");
        r.append(this.f);
        r.append(", status=");
        r.append(this.g);
        r.append(", tags=");
        r.append(this.h);
        r.append(", likes=");
        eub.w(r, this.i, ", liked=", this.j, ", pined=");
        r.append(this.k);
        r.append(", comments=");
        r.append(this.l);
        r.append(", updatedAt=");
        r.append(this.m);
        return a82.n(r, ", createdAt=", this.n, ")");
    }
}
