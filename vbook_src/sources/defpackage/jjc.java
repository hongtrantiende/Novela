package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jjc  reason: default package */
/* loaded from: classes.dex */
public class jjc {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public qs5 i;
    public qs5 j;
    public qs5 k;
    public qs5 l;
    public qs5 m;
    public int n;
    public int o;
    public qs5 p;
    public ijc q;
    public qs5 r;
    public boolean s;
    public qs5 t;
    public int u;
    public HashMap v;
    public HashSet w;

    public jjc() {
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        this.i = mm9Var;
        this.j = mm9Var;
        this.k = mm9Var;
        this.l = mm9Var;
        this.m = mm9Var;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = mm9Var;
        this.q = ijc.a;
        this.r = mm9Var;
        this.s = true;
        this.t = mm9Var;
        this.u = 0;
        this.v = new HashMap();
        this.w = new HashSet();
    }

    public kjc a() {
        return new kjc(this);
    }

    public jjc b(int i) {
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            if (((hjc) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(kjc kjcVar) {
        this.a = kjcVar.a;
        this.b = kjcVar.b;
        this.c = kjcVar.c;
        this.d = kjcVar.d;
        this.e = kjcVar.e;
        this.f = kjcVar.f;
        this.g = kjcVar.g;
        this.h = kjcVar.h;
        this.j = kjcVar.j;
        this.i = kjcVar.i;
        this.k = kjcVar.k;
        this.l = kjcVar.l;
        this.m = kjcVar.m;
        this.n = kjcVar.n;
        this.o = kjcVar.o;
        this.p = kjcVar.p;
        this.q = kjcVar.q;
        this.r = kjcVar.r;
        this.s = kjcVar.t;
        this.t = kjcVar.s;
        this.u = kjcVar.u;
        this.w = new HashSet(kjcVar.w);
        this.v = new HashMap(kjcVar.v);
    }

    public jjc d() {
        this.u = -3;
        return this;
    }

    public jjc e(hjc hjcVar) {
        ajc ajcVar = hjcVar.a;
        b(ajcVar.c);
        this.v.put(ajcVar, hjcVar);
        return this;
    }

    public jjc f(String str) {
        if (str == null) {
            return g(new String[0]);
        }
        return g(str);
    }

    public jjc g(String... strArr) {
        ls5 i = qs5.i();
        for (String str : strArr) {
            str.getClass();
            i.b(a2d.R(str));
        }
        this.r = i.g();
        this.s = false;
        return this;
    }

    public jjc h() {
        this.s = false;
        return this;
    }

    public jjc i(int i, boolean z) {
        HashSet hashSet = this.w;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
