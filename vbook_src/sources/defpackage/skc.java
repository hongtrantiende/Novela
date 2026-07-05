package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: skc  reason: default package */
/* loaded from: classes.dex */
public final class skc implements yya {
    public final hm8 C;
    public final dm8 D;
    public boolean E;
    public final hm8 F;
    public js G;
    public final fm8 H;
    public boolean I;
    public final gxa J;
    public final /* synthetic */ tkc K;
    public final drc a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d;
    public r4a e;
    public xkb f;

    public skc(tkc tkcVar, Object obj, js jsVar, drc drcVar) {
        this.K = tkcVar;
        this.a = drcVar;
        hm8 z = yae.z(obj);
        this.b = z;
        Object obj2 = null;
        hm8 z2 = yae.z(tte.v(nae.e, nae.e, 7, null));
        this.c = z2;
        this.d = yae.z(new xkb((lf4) z2.getValue(), drcVar, obj, z.getValue(), jsVar));
        this.C = yae.z(Boolean.TRUE);
        this.D = new dm8(-1.0f);
        this.F = yae.z(obj);
        this.G = jsVar;
        this.H = new fm8(a().b());
        Float f = (Float) qed.b.get(drcVar);
        if (f != null) {
            float floatValue = f.floatValue();
            js jsVar2 = (js) drcVar.a.invoke(obj);
            int b = jsVar2.b();
            for (int i = 0; i < b; i++) {
                jsVar2.e(i, floatValue);
            }
            obj2 = this.a.b.invoke(jsVar2);
        }
        this.J = tte.v(nae.e, nae.e, 3, obj2);
    }

    public final xkb a() {
        return (xkb) this.d.getValue();
    }

    public final void b(long j) {
        if (this.D.h() == -1.0f) {
            this.I = true;
            if (c16.i(a().c, a().d)) {
                e(a().c);
                return;
            }
            e(a().f(j));
            this.G = a().d(j);
        }
    }

    public final void e(Object obj) {
        this.F.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        Object obj2;
        xr myaVar;
        xkb xkbVar = this.f;
        if (xkbVar != null) {
            obj2 = xkbVar.c;
        } else {
            obj2 = null;
        }
        hm8 hm8Var = this.b;
        boolean i = c16.i(obj2, hm8Var.getValue());
        fm8 fm8Var = this.H;
        hm8 hm8Var2 = this.d;
        lf4 lf4Var = this.J;
        if (i) {
            hm8Var2.setValue(new xkb(lf4Var, this.a, obj, obj, this.G.c()));
            this.E = true;
            fm8Var.i(a().b());
            return;
        }
        hm8 hm8Var3 = this.c;
        if (z && !this.I) {
            if (((lf4) hm8Var3.getValue()) instanceof gxa) {
                lf4Var = (lf4) hm8Var3.getValue();
            }
        } else {
            lf4Var = (lf4) hm8Var3.getValue();
        }
        tkc tkcVar = this.K;
        long e = tkcVar.e();
        hm8 hm8Var4 = tkcVar.i;
        if (e <= 0) {
            myaVar = lf4Var;
        } else {
            myaVar = new mya(lf4Var, tkcVar.e());
        }
        hm8Var2.setValue(new xkb(myaVar, this.a, obj, hm8Var.getValue(), this.G));
        fm8Var.i(a().b());
        this.E = false;
        hm8Var4.setValue(Boolean.TRUE);
        if (tkcVar.g()) {
            ora oraVar = tkcVar.j;
            int size = oraVar.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                skc skcVar = (skc) oraVar.get(i2);
                j = Math.max(j, skcVar.H.h());
                skcVar.b(0L);
            }
            hm8Var4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, lf4 lf4Var) {
        this.b.setValue(obj2);
        this.c.setValue(lf4Var);
        if (c16.i(a().d, obj) && c16.i(a().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return this.F.getValue();
    }

    public final void h(Object obj, lf4 lf4Var, Object obj2, js jsVar) {
        Object obj3;
        Object obj4;
        if (this.E) {
            xkb xkbVar = this.f;
            if (xkbVar != null) {
                obj4 = xkbVar.c;
            } else {
                obj4 = null;
            }
            if (c16.i(obj, obj4)) {
                return;
            }
        }
        hm8 hm8Var = this.b;
        boolean i = c16.i(hm8Var.getValue(), obj);
        dm8 dm8Var = this.D;
        if (i && dm8Var.h() == -1.0f && (obj2 == null || obj2.equals(a().d))) {
            return;
        }
        hm8Var.setValue(obj);
        this.c.setValue(lf4Var);
        if (obj2 == null) {
            if (dm8Var.h() == -3.0f) {
                obj3 = obj;
            } else {
                obj3 = this.F.getValue();
            }
        } else {
            obj3 = obj2;
        }
        if (obj2 != null) {
            e(obj3);
            if (jsVar != null) {
                this.G = jsVar;
            }
        }
        hm8 hm8Var2 = this.C;
        boolean z = true;
        f(obj3, !((Boolean) hm8Var2.getValue()).booleanValue());
        if (dm8Var.h() != -3.0f) {
            z = false;
        }
        hm8Var2.setValue(Boolean.valueOf(z));
        if (dm8Var.h() >= nae.e) {
            long b = a().b();
            e(a().f(dm8Var.h() * ((float) b)));
        } else if (dm8Var.h() == -3.0f) {
            e(obj);
        }
        this.E = false;
        dm8Var.i(-1.0f);
    }

    public final String toString() {
        Object value = this.F.getValue();
        Object value2 = this.b.getValue();
        return "current value: " + value + ", target: " + value2 + ", spec: " + ((lf4) this.c.getValue());
    }
}
