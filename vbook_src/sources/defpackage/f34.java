package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f34  reason: default package */
/* loaded from: classes3.dex */
public final class f34 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final a84 n;
    public final c84 o;
    public final p34 p;
    public final Map q;
    public final Map r;
    public final Map s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final long w;
    public final long x;

    public f34(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, boolean z, String str9, boolean z2, a84 a84Var, c84 c84Var, p34 p34Var, Map map, Map map2, Map map3, boolean z3, boolean z4, boolean z5, long j, long j2) {
        s21.B(str, str2, str3, str4, str5);
        str6.getClass();
        str9.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = i2;
        this.k = z;
        this.l = str9;
        this.m = z2;
        this.n = a84Var;
        this.o = c84Var;
        this.p = p34Var;
        this.q = map;
        this.r = map2;
        this.s = map3;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        this.w = j;
        this.x = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f34) {
                f34 f34Var = (f34) obj;
                if (!c16.i(this.a, f34Var.a) || !c16.i(this.b, f34Var.b) || !c16.i(this.c, f34Var.c) || this.d != f34Var.d || !c16.i(this.e, f34Var.e) || !c16.i(this.f, f34Var.f) || !c16.i(this.g, f34Var.g) || !this.h.equals(f34Var.h) || !this.i.equals(f34Var.i) || this.j != f34Var.j || this.k != f34Var.k || !c16.i(this.l, f34Var.l) || this.m != f34Var.m || !this.n.equals(f34Var.n) || !this.o.equals(f34Var.o) || !this.p.equals(f34Var.p) || !c16.i(this.q, f34Var.q) || !c16.i(this.r, f34Var.r) || !c16.i(this.s, f34Var.s) || this.t != f34Var.t || this.u != f34Var.u || this.v != f34Var.v || this.w != f34Var.w || this.x != f34Var.x) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int k = eub.k(eub.j(eub.k(hl5.a(this.j, eub.j(eub.j(eub.j(eub.j(eub.j(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m);
        int hashCode = this.o.a.hashCode();
        return Long.hashCode(this.x) + hl5.c(eub.k(eub.k(eub.k(eub.k(rs8.a(rs8.a(rs8.a((this.p.hashCode() + ((hashCode + ((this.n.hashCode() + k) * 31)) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, true), 31, this.v), this.w, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Extension(id=", this.a, ", name=", this.b, ", author=");
        a82.u(this.d, this.c, ", version=", ", source=", y);
        nk2.C(y, this.e, ", icon=", this.f, ", description=");
        nk2.C(y, this.g, ", language=", this.h, ", country=");
        a82.u(this.j, this.i, ", type=", ", nsfw=", y);
        y.append(this.k);
        y.append(", path=");
        y.append(this.l);
        y.append(", encrypt=");
        y.append(this.m);
        y.append(", script=");
        y.append(this.n);
        y.append(", setting=");
        y.append(this.o);
        y.append(", connection=");
        y.append(this.p);
        y.append(", scriptData=");
        y.append(this.q);
        y.append(", translateData=");
        y.append(this.r);
        y.append(", settingData=");
        y.append(this.s);
        y.append(", isDevelopment=");
        y.append(this.t);
        y.append(", isDraft=");
        rs8.z(y, this.u, ", isInstalled=true, isPined=", this.v, ", createAt=");
        y.append(this.w);
        return a82.n(y, ", updateAt=", this.x, ")");
    }
}
