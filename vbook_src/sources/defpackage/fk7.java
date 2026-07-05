package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk7 implements nu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fk7(xn4 xn4Var, rh8 rh8Var, bkd bkdVar, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var) {
        this.b = xn4Var;
        this.c = rh8Var;
        this.d = bkdVar;
        this.e = xt4Var;
        this.f = xt4Var2;
        this.C = vt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        float f;
        lu4 qq4Var;
        lh9 lh9Var;
        p59 p59Var;
        rv4 rv4Var;
        m42 m42Var;
        int i;
        boolean z2;
        boolean z3;
        List list;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        int i3 = 16;
        Object obj5 = this.C;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        boolean z4 = false;
        switch (i2) {
            case 0:
                aw7 aw7Var = (aw7) obj10;
                p59 p59Var2 = (p59) obj8;
                rj8 rj8Var = (rj8) obj7;
                aw7 aw7Var2 = (aw7) obj9;
                m82 m82Var = (m82) obj6;
                List list2 = (List) obj5;
                int intValue = ((Integer) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((jj8) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var2.d(intValue)) {
                        i3 = 32;
                    }
                    intValue2 |= i3;
                }
                int i4 = intValue2;
                if ((i4 & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(i4 & 1, z)) {
                    Object obj11 = new Object();
                    if (true & true) {
                        f = 4.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (true & true) {
                        obj11 = null;
                    }
                    pq2 a = axa.a(rv4Var2);
                    boolean f2 = rv4Var2.f(a);
                    Object P = rv4Var2.P();
                    lh9 lh9Var2 = ax1.a;
                    if (f2 || P == lh9Var2) {
                        a.getClass();
                        P = oue.G(new tsa(26, (byte) 0), new zub(a, 18));
                        rv4Var2.o0(P);
                    }
                    xy9 xy9Var = (xy9) P;
                    Object[] objArr = {a};
                    boolean h = rv4Var2.h(a) | rv4Var2.c(1.0f) | rv4Var2.c(nae.e) | rv4Var2.c(nae.e);
                    Object P2 = rv4Var2.P();
                    if (h || P2 == lh9Var2) {
                        P2 = new imb(a, 23);
                        rv4Var2.o0(P2);
                    }
                    atd atdVar = (atd) zpe.m(objArr, xy9Var, (vt4) P2, rv4Var2, 0);
                    if (atdVar.b != 1.0f) {
                        atdVar.b = 1.0f;
                        atdVar.n(atdVar.f());
                    }
                    if (atdVar.c != f) {
                        atdVar.c = f;
                        atdVar.n(atdVar.f());
                    }
                    atdVar.e = 2.0f;
                    atdVar.d.setValue(obj11);
                    Boolean bool = (Boolean) aw7Var.getValue();
                    bool.getClass();
                    boolean f3 = rv4Var2.f(aw7Var) | rv4Var2.f(atdVar) | rv4Var2.f(p59Var2);
                    Object P3 = rv4Var2.P();
                    if (!f3 && P3 != lh9Var2) {
                        i = intValue;
                        qq4Var = P3;
                        lh9Var = lh9Var2;
                        p59Var = p59Var2;
                        m42Var = null;
                        rv4Var = rv4Var2;
                    } else {
                        lh9Var = lh9Var2;
                        p59Var = p59Var2;
                        rv4Var = rv4Var2;
                        m42Var = null;
                        i = intValue;
                        qq4Var = new qq4(atdVar, p59Var, aw7Var, (m42) null, 22);
                        rv4Var.o0(qq4Var);
                    }
                    yte.g(qq4Var, rv4Var, bool);
                    if (i == rj8Var.k()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        rv4Var.e0(155935016);
                        Boolean valueOf = Boolean.valueOf(z2);
                        boolean f4 = rv4Var.f(atdVar);
                        Object P4 = rv4Var.P();
                        if (!f4 && P4 != lh9Var) {
                            z3 = false;
                        } else {
                            z3 = false;
                            P4 = new ik7(atdVar, aw7Var2, m42Var, 0);
                            rv4Var.o0(P4);
                        }
                        yte.g((lu4) P4, rv4Var, valueOf);
                        rv4Var.q(z3);
                    } else {
                        z3 = false;
                        rv4Var.e0(156280976);
                        rv4Var.q(false);
                    }
                    ze4 ze4Var = pna.c;
                    nq7 h2 = q1d.h(rv4Var, ze4Var);
                    b37 d = fu0.d(kh5.a, z3);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, h2);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    long j = zl1.b;
                    long b = zl1.b(((Number) aw7Var2.getValue()).floatValue(), j);
                    ba5 ba5Var = lre.g;
                    fu0.a(nmd.v(ze4Var, b, ba5Var), rv4Var, 0);
                    Object P5 = rv4Var.P();
                    if (P5 == lh9Var) {
                        P5 = new si7(14);
                        rv4Var.o0(P5);
                    }
                    kq7 kq7Var = kq7.a;
                    nq7 k = axe.k(kq7Var, (xt4) P5);
                    boolean f5 = rv4Var.f(p59Var);
                    Object P6 = rv4Var.P();
                    if (f5 || P6 == lh9Var) {
                        P6 = new ek7(p59Var, 1);
                        rv4Var.o0(P6);
                    }
                    qye.f(k, atdVar, false, true, (vt4) P6, jce.E(-1799875796, new gk7(list2, i, aw7Var2, 0), rv4Var), rv4Var, 1597446);
                    ar5 c = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
                    nq7 k2 = tte.k(pna.n(zbe.y(lpe.m(nc2.o(kq7Var), nae.e), 24.0f), 32.0f), uu9.a);
                    boolean h3 = rv4Var.h(m82Var) | rv4Var.f(atdVar) | rv4Var.f(p59Var);
                    Object P7 = rv4Var.P();
                    if (h3 || P7 == lh9Var) {
                        P7 = new se0(20, m82Var, atdVar, p59Var);
                        rv4Var.o0(P7);
                    }
                    nk5.a(c, null, zbe.y(nmd.v(lbe.f(15, (vt4) P7, k2, null, false), zl1.b(0.8f, j), ba5Var), 6.0f), zl1.e, rv4Var, 3120, 0);
                    rv4Var.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                xn4 xn4Var = (xn4) obj10;
                rh8 rh8Var = (rh8) obj9;
                bkd bkdVar = (bkd) obj8;
                xt4 xt4Var = (xt4) obj7;
                xt4 xt4Var2 = (xt4) obj6;
                vt4 vt4Var = (vt4) obj5;
                int intValue3 = ((Integer) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((jj8) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    if (rv4Var3.d(intValue3)) {
                        i3 = 32;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & Token.TARGET) != 144) {
                    z4 = true;
                }
                if (rv4Var3.U(intValue4 & 1, z4)) {
                    if (intValue3 == 0) {
                        list = xn4Var.d;
                    } else {
                        list = xn4Var.e;
                    }
                    qwe.e(list, mwe.r(rh8Var, zbe.j(nae.e, 44.0f, nae.e, nae.e, 13)), mwe.r(bkdVar, zbe.j(nae.e, 44.0f, nae.e, nae.e, 13)), null, xt4Var, xt4Var2, vt4Var, rv4Var3, 0);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ fk7(aw7 aw7Var, p59 p59Var, sj8 sj8Var, aw7 aw7Var2, m82 m82Var, List list) {
        this.b = aw7Var;
        this.d = p59Var;
        this.e = sj8Var;
        this.c = aw7Var2;
        this.f = m82Var;
        this.C = list;
    }
}
