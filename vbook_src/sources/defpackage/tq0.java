package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tq0  reason: default package */
/* loaded from: classes3.dex */
public final class tq0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final bzc h;
    public final int i;
    public final List j;
    public final float k;
    public final int l;
    public final boolean m;
    public final int n;
    public final long o;
    public final long p;

    public tq0(int i, String str, String str2, String str3, String str4, String str5, String str6, bzc bzcVar, int i2, List list, float f, int i3, boolean z, int i4, long j, long j2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bzcVar;
        this.i = i2;
        this.j = list;
        this.k = f;
        this.l = i3;
        this.m = z;
        this.n = i4;
        this.o = j;
        this.p = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tq0) {
                tq0 tq0Var = (tq0) obj;
                if (this.a != tq0Var.a || !this.b.equals(tq0Var.b) || !this.c.equals(tq0Var.c) || !this.d.equals(tq0Var.d) || !this.e.equals(tq0Var.e) || !this.f.equals(tq0Var.f) || !this.g.equals(tq0Var.g) || !this.h.equals(tq0Var.h) || this.i != tq0Var.i || !this.j.equals(tq0Var.j) || Float.compare(this.k, tq0Var.k) != 0 || this.l != tq0Var.l || this.m != tq0Var.m || this.n != tq0Var.n || this.o != tq0Var.o || this.p != tq0Var.p) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        return Long.hashCode(this.p) + hl5.c(hl5.a(this.n, eub.k(hl5.a(this.l, nk2.d(this.k, eub.l(hl5.a(this.i, (this.h.hashCode() + j) * 31, 31), this.j, 31), 31), 31), 31, this.m), 31), this.o, 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("BookTopic(id=", this.a, ", name=", this.b, ", author=");
        nk2.C(r, this.c, ", cover=", this.d, ", extension=");
        nk2.C(r, this.e, ", path=", this.f, ", content=");
        r.append(this.g);
        r.append(", user=");
        r.append(this.h);
        r.append(", status=");
        r.append(this.i);
        r.append(", tags=");
        r.append(this.j);
        r.append(", rate=");
        r.append(this.k);
        r.append(", likes=");
        r.append(this.l);
        r.append(", liked=");
        r.append(this.m);
        r.append(", comments=");
        r.append(this.n);
        r.append(", updatedAt=");
        r.append(this.o);
        return a82.n(r, ", createdAt=", this.p, ")");
    }
}
