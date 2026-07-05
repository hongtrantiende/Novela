package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gp5  reason: default package */
/* loaded from: classes.dex */
public final class gp5 {
    public static final gp5 o;
    public final pe4 a;
    public final d82 b;
    public final d82 c;
    public final d82 d;
    public final z41 e;
    public final z41 f;
    public final z41 g;
    public final xt4 h;
    public final xt4 i;
    public final xt4 j;
    public final una k;
    public final hz9 l;
    public final z29 m;
    public final w94 n;

    static {
        dda ddaVar = dda.S;
        m66 m66Var = pe4.a;
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        vj9 vj9Var = una.p;
        z29 z29Var = z29.a;
        w94 w94Var = w94.b;
        gs3 gs3Var = gs3.a;
        z41 z41Var = z41.c;
        o = new gp5(m66Var, gs3Var, ru2Var, ru2Var, z41Var, z41Var, z41Var, ddaVar, ddaVar, ddaVar, vj9Var, hz9.b, z29Var, w94Var);
    }

    public gp5(pe4 pe4Var, d82 d82Var, d82 d82Var2, d82 d82Var3, z41 z41Var, z41 z41Var2, z41 z41Var3, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, una unaVar, hz9 hz9Var, z29 z29Var, w94 w94Var) {
        this.a = pe4Var;
        this.b = d82Var;
        this.c = d82Var2;
        this.d = d82Var3;
        this.e = z41Var;
        this.f = z41Var2;
        this.g = z41Var3;
        this.h = xt4Var;
        this.i = xt4Var2;
        this.j = xt4Var3;
        this.k = unaVar;
        this.l = hz9Var;
        this.m = z29Var;
        this.n = w94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp5)) {
            return false;
        }
        gp5 gp5Var = (gp5) obj;
        if (c16.i(this.a, gp5Var.a) && c16.i(this.b, gp5Var.b) && c16.i(this.c, gp5Var.c) && c16.i(this.d, gp5Var.d) && this.e == gp5Var.e && this.f == gp5Var.f && this.g == gp5Var.g && c16.i(this.h, gp5Var.h) && c16.i(this.i, gp5Var.i) && c16.i(this.j, gp5Var.j) && c16.i(this.k, gp5Var.k) && this.l == gp5Var.l && this.m == gp5Var.m && c16.i(this.n, gp5Var.n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = this.h.hashCode();
        int hashCode8 = this.i.hashCode();
        int hashCode9 = this.j.hashCode();
        int hashCode10 = this.k.hashCode();
        int hashCode11 = this.l.hashCode();
        int hashCode12 = this.m.hashCode();
        return this.n.a.hashCode() + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
