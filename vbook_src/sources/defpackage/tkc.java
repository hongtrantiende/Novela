package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tkc  reason: default package */
/* loaded from: classes.dex */
public class tkc {
    public final c3e a;
    public final tkc b;
    public final String c;
    public final hm8 d;
    public final hm8 f;
    public final hm8 i;
    public final ora j;
    public final ora k;
    public final hm8 l;
    public final h23 m;
    public final hm8 e = yae.z(null);
    public final fm8 g = new fm8(0);
    public final fm8 h = new fm8(Long.MIN_VALUE);

    public tkc(c3e c3eVar, tkc tkcVar, String str) {
        this.a = c3eVar;
        this.b = tkcVar;
        this.c = str;
        this.d = yae.z(c3eVar.z());
        this.f = yae.z(new rkc(c3eVar.z(), c3eVar.z()));
        Boolean bool = Boolean.FALSE;
        this.i = yae.z(bool);
        this.j = new ora();
        this.k = new ora();
        this.l = yae.z(bool);
        this.m = yae.q(new gz7(this, 2));
        c3eVar.K(this);
    }

    public final void a(Object obj, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean h;
        int i4;
        rv4Var.g0(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(obj);
            } else {
                h = rv4Var.h(obj);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if (!g()) {
                rv4Var.e0(466062241);
                p(obj);
                int i5 = i2 & Token.ASSIGN_MOD;
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (z2 || P == lh9Var) {
                    P = yae.q(new gz7(this, 1));
                    rv4Var.o0(P);
                }
                if (((Boolean) ((yya) P).getValue()).booleanValue()) {
                    rv4Var.e0(466470356);
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var) {
                        P2 = yte.s(rv4Var);
                        rv4Var.o0(P2);
                    }
                    m82 m82Var = (m82) P2;
                    boolean h2 = rv4Var.h(m82Var);
                    if (i5 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z4 = z3 | h2;
                    Object P3 = rv4Var.P();
                    if (z4 || P3 == lh9Var) {
                        P3 = new t3c(5, m82Var, this);
                        rv4Var.o0(P3);
                    }
                    yte.c(m82Var, this, (xt4) P3, rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(467712929);
                    rv4Var.q(false);
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(467722849);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rhd(this, obj, i, 1);
        }
    }

    public final long b() {
        ora oraVar = this.j;
        int size = oraVar.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((skc) oraVar.get(i)).H.h());
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((tkc) oraVar2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        ora oraVar = this.j;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            skc skcVar = (skc) oraVar.get(i);
            skcVar.f = null;
            skcVar.e = null;
            skcVar.E = false;
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((tkc) oraVar2.get(i2)).c();
        }
    }

    public final boolean d() {
        ora oraVar = this.j;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            if (((skc) oraVar.get(i)).e != null) {
                return true;
            }
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((tkc) oraVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        tkc tkcVar = this.b;
        if (tkcVar != null) {
            return tkcVar.e();
        }
        return this.g.h();
    }

    public final qkc f() {
        return (qkc) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(boolean z, long j) {
        long j2;
        fm8 fm8Var = this.h;
        int i = (fm8Var.h() > Long.MIN_VALUE ? 1 : (fm8Var.h() == Long.MIN_VALUE ? 0 : -1));
        c3e c3eVar = this.a;
        if (i == 0) {
            fm8Var.i(j);
            ((hm8) c3eVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((hm8) c3eVar.a).getValue()).booleanValue()) {
            ((hm8) c3eVar.a).setValue(Boolean.TRUE);
        }
        this.i.setValue(Boolean.FALSE);
        ora oraVar = this.j;
        int size = oraVar.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            skc skcVar = (skc) oraVar.get(i2);
            hm8 hm8Var = skcVar.C;
            hm8 hm8Var2 = skcVar.C;
            if (!((Boolean) hm8Var.getValue()).booleanValue()) {
                if (z) {
                    j2 = skcVar.a().b();
                } else {
                    j2 = j;
                }
                skcVar.e(skcVar.a().f(j2));
                skcVar.G = skcVar.a().d(j2);
                if (skcVar.a().e(j2)) {
                    hm8Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) hm8Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tkc tkcVar = (tkc) oraVar2.get(i3);
            hm8 hm8Var3 = tkcVar.d;
            c3e c3eVar2 = tkcVar.a;
            if (!c16.i(hm8Var3.getValue(), c3eVar2.z())) {
                tkcVar.h(z, j);
            }
            if (!c16.i(tkcVar.d.getValue(), c3eVar2.z())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.i(Long.MIN_VALUE);
        c3e c3eVar = this.a;
        if (c3eVar instanceof fw7) {
            c3eVar.I(this.d.getValue());
        }
        n(0L);
        ((hm8) c3eVar.a).setValue(Boolean.FALSE);
        ora oraVar = this.k;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            ((tkc) oraVar.get(i)).i();
        }
    }

    public final void j(float f) {
        Object obj;
        ora oraVar = this.j;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            skc skcVar = (skc) oraVar.get(i);
            skcVar.getClass();
            int i2 = (f > (-4.0f) ? 1 : (f == (-4.0f) ? 0 : -1));
            if (i2 == 0 || f == -5.0f) {
                xkb xkbVar = skcVar.f;
                if (xkbVar != null) {
                    skcVar.a().h(xkbVar.c);
                    skcVar.e = null;
                    skcVar.f = null;
                }
                if (i2 == 0) {
                    obj = skcVar.a().d;
                } else {
                    obj = skcVar.a().c;
                }
                skcVar.a().h(obj);
                skcVar.a().i(obj);
                skcVar.e(obj);
                skcVar.H.i(skcVar.a().b());
            } else {
                skcVar.D.i(f);
            }
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((tkc) oraVar2.get(i3)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.h.i(Long.MIN_VALUE);
        c3e c3eVar = this.a;
        ((hm8) c3eVar.a).setValue(Boolean.FALSE);
        boolean g = g();
        hm8 hm8Var = this.d;
        if (!g || !c16.i(c3eVar.z(), obj) || !c16.i(hm8Var.getValue(), obj2)) {
            if (!c16.i(c3eVar.z(), obj) && (c3eVar instanceof fw7)) {
                c3eVar.I(obj);
            }
            hm8Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new rkc(obj, obj2));
        }
        ora oraVar = this.k;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            tkc tkcVar = (tkc) oraVar.get(i);
            tkcVar.getClass();
            if (tkcVar.g()) {
                tkcVar.k(tkcVar.a.z(), tkcVar.d.getValue());
            }
        }
        ora oraVar2 = this.j;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((skc) oraVar2.get(i2)).b(0L);
        }
    }

    public final void l(long j) {
        fm8 fm8Var = this.h;
        if (fm8Var.h() == Long.MIN_VALUE) {
            fm8Var.i(j);
        }
        n(j);
        this.i.setValue(Boolean.FALSE);
        ora oraVar = this.j;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            ((skc) oraVar.get(i)).b(j);
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            tkc tkcVar = (tkc) oraVar2.get(i2);
            if (!c16.i(tkcVar.d.getValue(), tkcVar.a.z())) {
                tkcVar.l(j);
            }
        }
    }

    public final void m(r4a r4aVar) {
        ora oraVar = this.j;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            skc skcVar = (skc) oraVar.get(i);
            hm8 hm8Var = skcVar.F;
            if (!c16.i(skcVar.a().c, skcVar.a().d)) {
                skcVar.f = skcVar.a();
                skcVar.e = r4aVar;
            }
            skcVar.d.setValue(new xkb(skcVar.J, skcVar.a, hm8Var.getValue(), hm8Var.getValue(), skcVar.G.c()));
            skcVar.H.i(skcVar.a().b());
            skcVar.E = true;
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((tkc) oraVar2.get(i2)).m(r4aVar);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.g.i(j);
        }
    }

    public final void o() {
        xkb xkbVar;
        ora oraVar = this.j;
        int size = oraVar.size();
        for (int i = 0; i < size; i++) {
            skc skcVar = (skc) oraVar.get(i);
            r4a r4aVar = skcVar.e;
            if (r4aVar != null && (xkbVar = skcVar.f) != null) {
                long B = k27.B(r4aVar.g * r4aVar.d);
                Object f = xkbVar.f(B);
                if (skcVar.E) {
                    skcVar.a().i(f);
                }
                skcVar.a().h(f);
                skcVar.H.i(skcVar.a().b());
                if (skcVar.D.h() == -2.0f || skcVar.E) {
                    skcVar.e(f);
                } else {
                    skcVar.b(skcVar.K.e());
                }
                if (B >= r4aVar.g) {
                    skcVar.e = null;
                    skcVar.f = null;
                } else {
                    r4aVar.c = false;
                }
            }
        }
        ora oraVar2 = this.k;
        int size2 = oraVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((tkc) oraVar2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        hm8 hm8Var = this.d;
        if (!c16.i(hm8Var.getValue(), obj)) {
            this.f.setValue(new rkc(hm8Var.getValue(), obj));
            c3e c3eVar = this.a;
            if (!c16.i(c3eVar.z(), hm8Var.getValue())) {
                c3eVar.I(hm8Var.getValue());
            }
            hm8Var.setValue(obj);
            if (this.h.h() == Long.MIN_VALUE) {
                this.i.setValue(Boolean.TRUE);
            }
            ora oraVar = this.j;
            int size = oraVar.size();
            for (int i = 0; i < size; i++) {
                ((skc) oraVar.get(i)).D.i(-2.0f);
            }
        }
    }

    public final String toString() {
        ora oraVar;
        String str = "Transition animation values: ";
        for (int i = 0; i < this.j.size(); i++) {
            str = str + ((skc) oraVar.get(i)) + ", ";
        }
        return str;
    }
}
