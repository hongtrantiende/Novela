package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w43  reason: default package */
/* loaded from: classes3.dex */
public final class w43 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final bzc e;
    public final int f;
    public final List g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final long l;
    public final long m;
    public final List n;
    public final String o;

    public w43(int i, String str, int i2, int i3, bzc bzcVar, int i4, List list, int i5, boolean z, boolean z2, int i6, long j, long j2, List list2, String str2) {
        str.getClass();
        list2.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = bzcVar;
        this.f = i4;
        this.g = list;
        this.h = i5;
        this.i = z;
        this.j = z2;
        this.k = i6;
        this.l = j;
        this.m = j2;
        this.n = list2;
        this.o = str2;
    }

    public static w43 a(w43 w43Var, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8 = w43Var.a;
        String str = w43Var.b;
        int i9 = w43Var.c;
        int i10 = w43Var.d;
        bzc bzcVar = w43Var.e;
        if ((i4 & 32) != 0) {
            i5 = w43Var.f;
        } else {
            i5 = i;
        }
        List list = w43Var.g;
        if ((i4 & Token.CASE) != 0) {
            i6 = w43Var.h;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            z2 = w43Var.i;
        } else {
            z2 = z;
        }
        boolean z3 = w43Var.j;
        if ((i4 & 1024) != 0) {
            i7 = w43Var.k;
        } else {
            i7 = i3;
        }
        long j = w43Var.l;
        long j2 = w43Var.m;
        int i11 = i7;
        List list2 = w43Var.n;
        String str2 = w43Var.o;
        w43Var.getClass();
        str.getClass();
        list2.getClass();
        str2.getClass();
        return new w43(i8, str, i9, i10, bzcVar, i5, list, i6, z2, z3, i11, j, j2, list2, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w43) {
                w43 w43Var = (w43) obj;
                if (this.a != w43Var.a || !c16.i(this.b, w43Var.b) || this.c != w43Var.c || this.d != w43Var.d || !this.e.equals(w43Var.e) || this.f != w43Var.f || !this.g.equals(w43Var.g) || this.h != w43Var.h || this.i != w43Var.i || this.j != w43Var.j || this.k != w43Var.k || this.l != w43Var.l || this.m != w43Var.m || !c16.i(this.n, w43Var.n) || !c16.i(this.o, w43Var.o)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = hl5.a(this.d, hl5.a(this.c, eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
        return this.o.hashCode() + eub.l(hl5.c(hl5.c(hl5.a(this.k, eub.k(eub.k(hl5.a(this.h, eub.l(hl5.a(this.f, (this.e.hashCode() + a) * 31, 31), this.g, 31), 31), 31, this.i), 31, this.j), 31), this.l, 31), this.m, 31), this.n, 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("DetailTopic(id=", this.a, ", title=", this.b, ", category=");
        rs8.q(this.c, this.d, ", type=", ", user=", r);
        r.append(this.e);
        r.append(", status=");
        r.append(this.f);
        r.append(", tags=");
        r.append(this.g);
        r.append(", likes=");
        r.append(this.h);
        r.append(", liked=");
        rs8.z(r, this.i, ", pined=", this.j, ", comments=");
        r.append(this.k);
        r.append(", updatedAt=");
        r.append(this.l);
        rs8.x(r, ", createdAt=", this.m, ", blocks=");
        r.append(this.n);
        r.append(", content=");
        r.append(this.o);
        r.append(")");
        return r.toString();
    }
}
