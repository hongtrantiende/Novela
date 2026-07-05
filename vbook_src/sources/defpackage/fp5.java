package defpackage;

import android.content.Context;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fp5  reason: default package */
/* loaded from: classes.dex */
public final class fp5 {
    public final Context a;
    public gp5 b;
    public Object c;
    public wkb d;
    public final Map e;
    public d82 f;
    public d82 g;
    public d82 h;
    public z41 i;
    public z41 j;
    public final xt4 k;
    public final xt4 l;
    public final xt4 m;
    public una n;
    public hz9 o;
    public z29 p;
    public Object q;

    public fp5(jp5 jp5Var, Context context) {
        this.a = context;
        this.b = jp5Var.t;
        this.c = jp5Var.b;
        this.d = jp5Var.c;
        this.e = jp5Var.d;
        hp5 hp5Var = jp5Var.s;
        this.f = hp5Var.a;
        this.g = hp5Var.b;
        this.h = hp5Var.c;
        this.i = hp5Var.d;
        this.j = hp5Var.e;
        this.k = hp5Var.f;
        this.l = hp5Var.g;
        this.m = hp5Var.h;
        this.n = hp5Var.i;
        this.o = hp5Var.j;
        this.p = hp5Var.k;
        this.q = jp5Var.r;
    }

    public final jp5 a() {
        Map map;
        w94 w94Var;
        Object obj = this.c;
        if (obj == null) {
            obj = n68.a;
        }
        Object obj2 = obj;
        wkb wkbVar = this.d;
        Boolean bool = Boolean.FALSE;
        Map map2 = this.e;
        if (c16.i(map2, bool)) {
            map2.getClass();
            map = que.x(jsc.s(map2));
        } else if (map2 instanceof Map) {
            map = map2;
        } else {
            cp8.i();
            return null;
        }
        Map map3 = map;
        map3.getClass();
        gp5 gp5Var = this.b;
        pe4 pe4Var = gp5Var.a;
        z41 z41Var = this.i;
        if (z41Var == null) {
            z41Var = gp5Var.e;
        }
        z41 z41Var2 = z41Var;
        z41 z41Var3 = this.j;
        if (z41Var3 == null) {
            z41Var3 = gp5Var.f;
        }
        z41 z41Var4 = z41Var3;
        z41 z41Var5 = gp5Var.g;
        d82 d82Var = this.f;
        if (d82Var == null) {
            d82Var = gp5Var.b;
        }
        d82 d82Var2 = d82Var;
        d82 d82Var3 = this.g;
        if (d82Var3 == null) {
            d82Var3 = gp5Var.c;
        }
        d82 d82Var4 = d82Var3;
        d82 d82Var5 = this.h;
        if (d82Var5 == null) {
            d82Var5 = gp5Var.d;
        }
        d82 d82Var6 = d82Var5;
        xt4 xt4Var = this.k;
        if (xt4Var == null) {
            xt4Var = gp5Var.h;
        }
        xt4 xt4Var2 = xt4Var;
        xt4 xt4Var3 = this.l;
        if (xt4Var3 == null) {
            xt4Var3 = gp5Var.i;
        }
        xt4 xt4Var4 = xt4Var3;
        xt4 xt4Var5 = this.m;
        if (xt4Var5 == null) {
            xt4Var5 = gp5Var.j;
        }
        xt4 xt4Var6 = xt4Var5;
        una unaVar = this.n;
        if (unaVar == null) {
            unaVar = gp5Var.k;
        }
        una unaVar2 = unaVar;
        hz9 hz9Var = this.o;
        if (hz9Var == null) {
            hz9Var = gp5Var.l;
        }
        hz9 hz9Var2 = hz9Var;
        z29 z29Var = this.p;
        if (z29Var == null) {
            z29Var = gp5Var.m;
        }
        z29 z29Var2 = z29Var;
        Object obj3 = this.q;
        if (obj3 instanceof v94) {
            w94Var = new w94(que.x(((v94) obj3).a));
        } else if (obj3 instanceof w94) {
            w94Var = (w94) obj3;
        } else {
            cp8.i();
            return null;
        }
        return new jp5(this.a, obj2, wkbVar, map3, pe4Var, d82Var2, d82Var4, d82Var6, z41Var2, z41Var4, z41Var5, xt4Var2, xt4Var4, xt4Var6, unaVar2, hz9Var2, z29Var2, w94Var, new hp5(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p), this.b);
    }

    public fp5(Context context) {
        this.a = context;
        this.b = gp5.o;
        this.c = null;
        this.d = null;
        this.e = ls3.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        dda ddaVar = dda.S;
        this.k = ddaVar;
        this.l = ddaVar;
        this.m = ddaVar;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = w94.b;
    }
}
