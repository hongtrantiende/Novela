package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ro3  reason: default package */
/* loaded from: classes3.dex */
public final class ro3 {
    public final xo3 a;
    public final int b;
    public final boolean c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final hm8 h;
    public final hm8 i;
    public final hm8 j;
    public final hm8 k;
    public final hm8 l;
    public final hm8 m;
    public final hm8 n;
    public final hm8 o;

    public ro3(xo3 xo3Var, int i) {
        xo3Var = (i & 1) != 0 ? yo3.a : xo3Var;
        xo3Var.getClass();
        this.a = xo3Var;
        this.b = 4;
        this.c = true;
        this.d = 14;
        this.e = "JetBrains Mono";
        this.f = true;
        this.g = true;
        this.h = yae.z(xo3Var);
        this.i = yae.z(4);
        this.j = yae.z(false);
        this.k = yae.z(true);
        this.l = yae.z(14);
        this.m = yae.z(true);
        this.n = yae.z(true);
        this.o = yae.z(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ro3) {
            ro3 ro3Var = (ro3) obj;
            if (c16.i(this.a, ro3Var.a) && this.b == ro3Var.b && this.c == ro3Var.c && this.d == ro3Var.d && c16.i(this.e, ro3Var.e) && this.f == ro3Var.f && this.g == ro3Var.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + eub.k(eub.k(eub.j(hl5.a(this.d, eub.k(eub.k(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, false), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditorSettings(theme=");
        sb.append(this.a);
        sb.append(", tabSize=");
        sb.append(this.b);
        sb.append(", useTabs=false, showLineNumbers=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", fontFamily=");
        rs8.y(sb, this.e, ", enableAutoIndent=", this.f, ", enableAutocomplete=");
        return rs8.m(", readOnly=false)", sb, this.g);
    }
}
