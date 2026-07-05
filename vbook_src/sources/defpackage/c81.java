package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c81  reason: default package */
/* loaded from: classes3.dex */
public final class c81 {
    public static final v71 t = new v71(3);
    public final String a;
    public final xt4 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final xt4 s;

    public c81(String str, xt4 xt4Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, xt4 xt4Var2) {
        this.a = str;
        this.b = xt4Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = str14;
        this.p = str15;
        this.q = str16;
        this.r = str17;
        this.s = xt4Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c81) {
                c81 c81Var = (c81) obj;
                if (!this.a.equals(c81Var.a) || !this.b.equals(c81Var.b) || !this.c.equals(c81Var.c) || !this.d.equals(c81Var.d) || !this.e.equals(c81Var.e) || !this.f.equals(c81Var.f) || !this.g.equals(c81Var.g) || !this.h.equals(c81Var.h) || !this.i.equals(c81Var.i) || !this.j.equals(c81Var.j) || !this.k.equals(c81Var.k) || !this.l.equals(c81Var.l) || !this.m.equals(c81Var.m) || !this.n.equals(c81Var.n) || !this.o.equals(c81Var.o) || !this.p.equals(c81Var.p) || !this.q.equals(c81Var.q) || !this.r.equals(c81Var.r) || !this.s.equals(c81Var.s)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.s.hashCode() + eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(eub.j((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CascadeEditorStrings(back=");
        sb.append(this.a);
        sb.append(", unsupportedBlock=");
        sb.append(this.b);
        sb.append(", bold=");
        nk2.C(sb, this.c, ", italic=", this.d, ", underline=");
        nk2.C(sb, this.e, ", strikethrough=", this.f, ", inlineCode=");
        nk2.C(sb, this.g, ", highlight=", this.h, ", slashCommand=");
        nk2.C(sb, this.i, ", hideKeyboard=", this.j, ", indentForward=");
        nk2.C(sb, this.k, ", indentBackward=", this.l, ", link=");
        nk2.C(sb, this.m, ", linkApply=", this.n, ", linkCancel=");
        nk2.C(sb, this.o, ", linkRemove=", this.p, ", linkTitle=");
        nk2.C(sb, this.q, ", linkUrl=", this.r, ", linkValidationError=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
