package defpackage;

import android.content.Context;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jp5  reason: default package */
/* loaded from: classes.dex */
public final class jp5 {
    public final Context a;
    public final Object b;
    public final wkb c;
    public final Map d;
    public final pe4 e;
    public final d82 f;
    public final d82 g;
    public final d82 h;
    public final z41 i;
    public final z41 j;
    public final z41 k;
    public final xt4 l;
    public final xt4 m;
    public final xt4 n;
    public final una o;
    public final hz9 p;
    public final z29 q;
    public final w94 r;
    public final hp5 s;
    public final gp5 t;

    public jp5(Context context, Object obj, wkb wkbVar, Map map, pe4 pe4Var, d82 d82Var, d82 d82Var2, d82 d82Var3, z41 z41Var, z41 z41Var2, z41 z41Var3, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, una unaVar, hz9 hz9Var, z29 z29Var, w94 w94Var, hp5 hp5Var, gp5 gp5Var) {
        this.a = context;
        this.b = obj;
        this.c = wkbVar;
        this.d = map;
        this.e = pe4Var;
        this.f = d82Var;
        this.g = d82Var2;
        this.h = d82Var3;
        this.i = z41Var;
        this.j = z41Var2;
        this.k = z41Var3;
        this.l = xt4Var;
        this.m = xt4Var2;
        this.n = xt4Var3;
        this.o = unaVar;
        this.p = hz9Var;
        this.q = z29Var;
        this.r = w94Var;
        this.s = hp5Var;
        this.t = gp5Var;
    }

    public static fp5 a(jp5 jp5Var) {
        Context context = jp5Var.a;
        jp5Var.getClass();
        return new fp5(jp5Var, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jp5) {
                jp5 jp5Var = (jp5) obj;
                if (!c16.i(this.a, jp5Var.a) || !this.b.equals(jp5Var.b) || !c16.i(this.c, jp5Var.c) || !this.d.equals(jp5Var.d) || !c16.i(this.e, jp5Var.e) || !c16.i(this.f, jp5Var.f) || !c16.i(this.g, jp5Var.g) || !c16.i(this.h, jp5Var.h) || this.i != jp5Var.i || this.j != jp5Var.j || this.k != jp5Var.k || !c16.i(this.l, jp5Var.l) || !c16.i(this.m, jp5Var.m) || !c16.i(this.n, jp5Var.n) || !c16.i(this.o, jp5Var.o) || this.p != jp5Var.p || this.q != jp5Var.q || !this.r.equals(jp5Var.r) || !this.s.equals(jp5Var.s) || !c16.i(this.t, jp5Var.t)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wkb wkbVar = this.c;
        if (wkbVar == null) {
            hashCode = 0;
        } else {
            hashCode = wkbVar.hashCode();
        }
        int a = rs8.a((hashCode2 + hashCode) * 29791, 961, this.d);
        int hashCode3 = this.f.hashCode();
        int hashCode4 = this.g.hashCode();
        int hashCode5 = this.h.hashCode();
        int hashCode6 = this.i.hashCode();
        int hashCode7 = this.j.hashCode();
        int hashCode8 = this.k.hashCode();
        int hashCode9 = this.l.hashCode();
        int hashCode10 = this.m.hashCode();
        int hashCode11 = this.n.hashCode();
        int hashCode12 = this.o.hashCode();
        int hashCode13 = this.p.hashCode();
        int a2 = rs8.a((this.q.hashCode() + ((hashCode13 + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((this.e.hashCode() + a) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.r.a);
        return this.t.hashCode() + ((this.s.hashCode() + a2) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.h + ", memoryCachePolicy=" + this.i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.l + ", errorFactory=" + this.m + ", fallbackFactory=" + this.n + ", sizeResolver=" + this.o + ", scale=" + this.p + ", precision=" + this.q + ", extras=" + this.r + ", defined=" + this.s + ", defaults=" + this.t + ")";
    }
}
