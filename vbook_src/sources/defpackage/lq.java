package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq  reason: default package */
/* loaded from: classes.dex */
public final class lq {
    public final drc a;
    public final Object b;
    public final es c;
    public final hm8 d;
    public final hm8 e;
    public Float f;
    public Float g;
    public final pw7 h;
    public final gxa i;
    public final js j;
    public final js k;
    public js l;
    public js m;

    public lq(Object obj, drc drcVar, Object obj2) {
        js jsVar;
        js jsVar2;
        this.a = drcVar;
        this.b = obj2;
        es esVar = new es(drcVar, obj, null, 60);
        this.c = esVar;
        this.d = yae.z(Boolean.FALSE);
        this.e = yae.z(obj);
        this.h = new pw7();
        this.i = new gxa(obj2, 3);
        js jsVar3 = esVar.c;
        boolean z = jsVar3 instanceof fs;
        if (z) {
            jsVar = tc4.e;
        } else if (jsVar3 instanceof gs) {
            jsVar = tc4.f;
        } else if (jsVar3 instanceof hs) {
            jsVar = tc4.g;
        } else {
            jsVar = tc4.h;
        }
        this.j = jsVar;
        if (z) {
            jsVar2 = tc4.a;
        } else if (jsVar3 instanceof gs) {
            jsVar2 = tc4.b;
        } else if (jsVar3 instanceof hs) {
            jsVar2 = tc4.c;
        } else {
            jsVar2 = tc4.d;
        }
        this.k = jsVar2;
        this.l = jsVar;
        this.m = jsVar2;
    }

    public static final void a(lq lqVar) {
        es esVar = lqVar.c;
        esVar.c.d();
        esVar.d = Long.MIN_VALUE;
        lqVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(lq lqVar, Object obj, xr xrVar, Float f, xt4 xt4Var, m42 m42Var, int i) {
        if ((i & 2) != 0) {
            xrVar = lqVar.i;
        }
        xr xrVar2 = xrVar;
        Float f2 = f;
        if ((i & 4) != 0) {
            f2 = lqVar.a.b.invoke(lqVar.c.c);
        }
        if ((i & 8) != 0) {
            xt4Var = null;
        }
        Object e = lqVar.e();
        drc drcVar = lqVar.a;
        return pw7.a(lqVar.h, new iq(lqVar, f2, new xkb(xrVar2, drcVar, e, obj, (js) drcVar.a.invoke(f2)), lqVar.c.d, xt4Var, null), m42Var);
    }

    public final Object b(Object obj, pq2 pq2Var, xt4 xt4Var, aab aabVar) {
        Object e = e();
        drc drcVar = this.a;
        return pw7.a(this.h, new iq(this, obj, new oq2(pq2Var, drcVar, e, (js) drcVar.a.invoke(obj)), this.c.d, xt4Var, null), aabVar);
    }

    public final Object d(Object obj) {
        if (!c16.i(this.l, this.j) || !c16.i(this.m, this.k)) {
            drc drcVar = this.a;
            js jsVar = (js) drcVar.a.invoke(obj);
            int b = jsVar.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (jsVar.a(i) < this.l.a(i) || jsVar.a(i) > this.m.a(i)) {
                    jsVar.e(i, dce.m(jsVar.a(i), this.l.a(i), this.m.a(i)));
                    z = true;
                }
            }
            if (z) {
                return drcVar.b.invoke(jsVar);
            }
        }
        return obj;
    }

    public final Object e() {
        return this.c.b.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object g(m42 m42Var, Object obj) {
        Object a = pw7.a(this.h, new jq(this, obj, null, 0), m42Var);
        if (a == n82.a) {
            return a;
        }
        return pvc.a;
    }

    public final Object h(n42 n42Var) {
        Object a = pw7.a(this.h, new kq(this, null, 0), n42Var);
        if (a == n82.a) {
            return a;
        }
        return pvc.a;
    }

    public final void i(Float f, Float f2) {
        drc drcVar = this.a;
        js jsVar = (js) drcVar.a.invoke(f);
        if (jsVar == null) {
            jsVar = this.j;
        }
        js jsVar2 = (js) drcVar.a.invoke(f2);
        if (jsVar2 == null) {
            jsVar2 = this.k;
        }
        int b = jsVar.b();
        for (int i = 0; i < b; i++) {
            if (jsVar.a(i) > jsVar2.a(i)) {
                g39.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + jsVar + " is greater than upper bound " + jsVar2 + " on index " + i);
            }
        }
        this.l = jsVar;
        this.m = jsVar2;
        this.g = f2;
        this.f = f;
        if (!f()) {
            Object d = d(e());
            if (!c16.i(d, e())) {
                this.c.b.setValue(d);
            }
        }
    }

    public /* synthetic */ lq(Object obj, drc drcVar, Object obj2, int i) {
        this(obj, drcVar, (i & 4) != 0 ? null : obj2);
    }
}
