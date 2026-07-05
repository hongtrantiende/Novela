package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cs1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs1 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cs1(aw7 aw7Var, t58 t58Var, cz7 cz7Var) {
        this.a = 8;
        this.c = aw7Var;
        this.d = t58Var;
        this.b = cz7Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        final m71 m71Var = (m71) this.b;
        j71 j71Var = (j71) this.c;
        tu1 tu1Var = (tu1) this.d;
        jj8 jj8Var = (jj8) obj;
        Integer num = (Integer) obj2;
        final int intValue = num.intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = new x61();
            rv4Var.o0(P);
        }
        final x61 x61Var = (x61) P;
        Object P2 = rv4Var.P();
        if (P2 == lh9Var) {
            P2 = new y61(x61Var);
            rv4Var.o0(P2);
        }
        y61 y61Var = (y61) P2;
        Object P3 = rv4Var.P();
        if (P3 == lh9Var) {
            P3 = new f71(x61Var);
            rv4Var.o0(P3);
        }
        final f71 f71Var = (f71) P3;
        boolean f = rv4Var.f(j71Var);
        Object P4 = rv4Var.P();
        if (f || P4 == lh9Var) {
            P4 = new ve(j71Var, 20);
            rv4Var.o0(P4);
        }
        final vt4 vt4Var = (vt4) P4;
        nq7 f2 = sze.f(kq7.a, new mu4() { // from class: c71
            @Override // defpackage.mu4
            public final Object c(Object obj5, Object obj6, Object obj7) {
                boolean z;
                final boolean z2;
                long a;
                final m71 m71Var2 = m71Var;
                l71 l71Var = m71Var2.a;
                e37 e37Var = (e37) obj5;
                w27 w27Var = (w27) obj6;
                x02 x02Var = (x02) obj7;
                final s0b s0bVar = (s0b) vt4.this.invoke();
                boolean z3 = s0bVar.l;
                ls3 ls3Var = ls3.a;
                if (!z3) {
                    return e37Var.q0(0, 0, ls3Var, new oi5(8));
                }
                final boolean z4 = true;
                if (l71Var.m().e == ff8.a) {
                    z = true;
                } else {
                    z = true;
                    z4 = false;
                }
                if (e37Var.getLayoutDirection() == tc6.b) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                float a2 = s0bVar.a();
                if (z4) {
                    a = x02.a(x02.k(x02Var.a), x02.i(x02Var.a), k27.A(a2), k27.A(a2));
                } else {
                    long j = x02Var.a;
                    a = x02.a(k27.A(a2), k27.A(a2), x02.j(j), x02.h(j));
                }
                final mw8 M = w27Var.M(a);
                int k = l71Var.k();
                final int i = intValue;
                float f3 = 1.0f;
                if (i != k) {
                    if (i == 0) {
                        f3 = nae.e;
                    } else {
                        f3 = 1.0f / i;
                    }
                }
                final float f4 = f3;
                int i2 = M.a;
                int i3 = M.b;
                final x61 x61Var2 = x61Var;
                final wea weaVar = f71Var;
                return e37Var.q0(i2, i3, ls3Var, new xt4() { // from class: d71
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj8) {
                        ((lw8) obj8).J(mw8.this, 0, 0, f4, new e71(m71Var2, s0bVar, i, z4, x61Var2, weaVar, z2));
                        return pvc.a;
                    }
                });
            }
        });
        b37 d = fu0.d(kh5.a, false);
        int hashCode = Long.hashCode(rv4Var.T);
        xt8 l = rv4Var.l();
        nq7 p = lye.p(rv4Var, f2);
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
        tu1Var.h(y61Var, num, rv4Var, Integer.valueOf(intValue2 & Token.ASSIGN_MOD));
        rv4Var.q(true);
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        final ?? r15;
        int i;
        final zb9 zb9Var = (zb9) this.b;
        eo3 eo3Var = (eo3) this.c;
        aw7 aw7Var = (aw7) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if (((wb9) aw7Var.getValue()).e) {
                rv4Var.e0(2001435396);
                nq7 x = zbe.x(pna.c, rh8Var);
                b37 d = fu0.d(kh5.e, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, x);
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
                ts6.a(nae.e, 384, 3, 0L, rv4Var, pna.n(kq7.a, 48.0f));
                rv4Var.q(true);
                rv4Var.q(false);
            } else {
                rv4Var.e0(2001649792);
                wb9 wb9Var = (wb9) aw7Var.getValue();
                ze4 ze4Var = pna.c;
                boolean f = rv4Var.f(zb9Var);
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (!f && P != lh9Var) {
                    r15 = 0;
                } else {
                    r15 = 0;
                    mp6 mp6Var = new mp6(1, zb9Var, zb9.class, "setQuery", "setQuery(Ljava/lang/String;)V", 0, 10);
                    rv4Var.o0(mp6Var);
                    P = mp6Var;
                }
                xt4 xt4Var = (xt4) ((i76) P);
                boolean f2 = rv4Var.f(zb9Var);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    mp6 mp6Var2 = new mp6(1, zb9Var, zb9.class, "setMode", "setMode(Lcom/reader/data/translate/engine/qt/model/QtSearchMode;)V", 0, 11);
                    rv4Var.o0(mp6Var2);
                    P2 = mp6Var2;
                }
                xt4 xt4Var2 = (xt4) ((i76) P2);
                boolean f3 = rv4Var.f(eo3Var);
                Object P3 = rv4Var.P();
                if (f3 || P3 == lh9Var) {
                    P3 = new nf7(eo3Var, 2);
                    rv4Var.o0(P3);
                }
                xt4 xt4Var3 = (xt4) P3;
                boolean f4 = rv4Var.f(zb9Var);
                Object P4 = rv4Var.P();
                if (f4 || P4 == lh9Var) {
                    P4 = new xt4() { // from class: qb9
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj5) {
                            Object value;
                            wb9 wb9Var2;
                            Object value2;
                            wb9 wb9Var3;
                            LinkedHashSet w;
                            int i3 = r15;
                            pvc pvcVar = pvc.a;
                            zb9 zb9Var2 = zb9Var;
                            switch (i3) {
                                case 0:
                                    ac9 ac9Var = (ac9) obj5;
                                    ac9Var.getClass();
                                    String str = ac9Var.a;
                                    str.getClass();
                                    List list = zb9Var2.C;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj6 : list) {
                                        if (!c16.i(((ac9) obj6).a, str)) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                    zb9Var2.C = arrayList;
                                    cza czaVar = zb9Var2.e;
                                    if (czaVar != null) {
                                        do {
                                            value = czaVar.getValue();
                                            wb9Var2 = (wb9) value;
                                        } while (!czaVar.l(value, wb9.a(wb9Var2, null, null, null, zb9Var2.C.size(), false, false, false, true, fca.s(wb9Var2.i, str), false, 631)));
                                        zb9Var2.k();
                                        return pvcVar;
                                    }
                                    zb9Var2.k();
                                    return pvcVar;
                                default:
                                    ac9 ac9Var2 = (ac9) obj5;
                                    ac9Var2.getClass();
                                    String str2 = ac9Var2.a;
                                    str2.getClass();
                                    cza czaVar2 = zb9Var2.e;
                                    if (czaVar2 != null) {
                                        do {
                                            value2 = czaVar2.getValue();
                                            wb9Var3 = (wb9) value2;
                                            boolean contains = wb9Var3.i.contains(str2);
                                            Set set = wb9Var3.i;
                                            if (contains) {
                                                w = fca.s(set, str2);
                                            } else {
                                                w = fca.w(set, str2);
                                            }
                                        } while (!czaVar2.l(value2, wb9.a(wb9Var3, null, null, null, 0, false, false, false, false, w, true, 255)));
                                        return pvcVar;
                                    }
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P4);
                }
                xt4 xt4Var4 = (xt4) P4;
                boolean f5 = rv4Var.f(zb9Var);
                Object P5 = rv4Var.P();
                if (f5 || P5 == lh9Var) {
                    P5 = new xt4() { // from class: qb9
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj5) {
                            Object value;
                            wb9 wb9Var2;
                            Object value2;
                            wb9 wb9Var3;
                            LinkedHashSet w;
                            int i3 = r15;
                            pvc pvcVar = pvc.a;
                            zb9 zb9Var2 = zb9Var;
                            switch (i3) {
                                case 0:
                                    ac9 ac9Var = (ac9) obj5;
                                    ac9Var.getClass();
                                    String str = ac9Var.a;
                                    str.getClass();
                                    List list = zb9Var2.C;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj6 : list) {
                                        if (!c16.i(((ac9) obj6).a, str)) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                    zb9Var2.C = arrayList;
                                    cza czaVar = zb9Var2.e;
                                    if (czaVar != null) {
                                        do {
                                            value = czaVar.getValue();
                                            wb9Var2 = (wb9) value;
                                        } while (!czaVar.l(value, wb9.a(wb9Var2, null, null, null, zb9Var2.C.size(), false, false, false, true, fca.s(wb9Var2.i, str), false, 631)));
                                        zb9Var2.k();
                                        return pvcVar;
                                    }
                                    zb9Var2.k();
                                    return pvcVar;
                                default:
                                    ac9 ac9Var2 = (ac9) obj5;
                                    ac9Var2.getClass();
                                    String str2 = ac9Var2.a;
                                    str2.getClass();
                                    cza czaVar2 = zb9Var2.e;
                                    if (czaVar2 != null) {
                                        do {
                                            value2 = czaVar2.getValue();
                                            wb9Var3 = (wb9) value2;
                                            boolean contains = wb9Var3.i.contains(str2);
                                            Set set = wb9Var3.i;
                                            if (contains) {
                                                w = fca.s(set, str2);
                                            } else {
                                                w = fca.w(set, str2);
                                            }
                                        } while (!czaVar2.l(value2, wb9.a(wb9Var3, null, null, null, 0, false, false, false, false, w, true, 255)));
                                        return pvcVar;
                                    }
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P5);
                }
                yqe.a(wb9Var, rh8Var, ze4Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, (xt4) P5, rv4Var, (i2 & Token.ASSIGN_MOD) | 384);
                rv4Var.q(r15);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        do3 do3Var = (do3) this.b;
        mc9 mc9Var = (mc9) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            if (((kc9) yyaVar.getValue()).a) {
                rv4Var.e0(567849902);
                rv4Var.q(false);
            } else {
                boolean isEmpty = ((kc9) yyaVar.getValue()).b.isEmpty();
                lh9 lh9Var = ax1.a;
                if (isEmpty) {
                    rv4Var.e0(567917668);
                    nq7 x = zbe.x(pna.c, rh8Var);
                    boolean f = rv4Var.f(do3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new ez6(do3Var, 4);
                        rv4Var.o0(P);
                    }
                    hu7.e(0, (vt4) P, rv4Var, x);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(568212478);
                    List list = ((kc9) yyaVar.getValue()).b;
                    ze4 ze4Var = pna.c;
                    boolean f2 = rv4Var.f(do3Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new fz6(do3Var, 2);
                        rv4Var.o0(P2);
                    }
                    mu4 mu4Var = (mu4) P2;
                    boolean f3 = rv4Var.f(mc9Var);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new cl7(mc9Var, 21);
                        rv4Var.o0(P3);
                    }
                    hu7.d(list, rh8Var, ze4Var, mu4Var, (xt4) P3, rv4Var, (intValue & Token.ASSIGN_MOD) | 384);
                    rv4Var.q(false);
                }
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        vt4 vt4Var;
        int i;
        final zi9 zi9Var = (zi9) this.c;
        cz7 cz7Var = (cz7) this.b;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            yi9 yi9Var = (yi9) yyaVar.getValue();
            nq7 u = mwe.u(pna.c, false, 6);
            boolean f = rv4Var.f(zi9Var);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = new xt4() { // from class: si9
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        Object value6;
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        zi9 zi9Var2 = zi9Var;
                        switch (i2) {
                            case 0:
                                Boolean bool = (Boolean) obj5;
                                boolean booleanValue = bool.booleanValue();
                                cza czaVar = zi9Var2.d;
                                if (czaVar != null) {
                                    do {
                                        value = czaVar.getValue();
                                        ((qi9) zi9Var2.c).a.c.e(xh9.s[1], bool);
                                    } while (!czaVar.l(value, yi9.a((yi9) value, booleanValue, false, false, false, 0, 0L, 62)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 1:
                                Long l = (Long) obj5;
                                long longValue = l.longValue();
                                cza czaVar2 = zi9Var2.d;
                                if (czaVar2 != null) {
                                    do {
                                        value2 = czaVar2.getValue();
                                        ((qi9) zi9Var2.c).a.q.e(xh9.s[15], l);
                                    } while (!czaVar2.l(value2, yi9.a((yi9) value2, false, false, false, false, 0, longValue, 31)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 2:
                                int intValue2 = ((Integer) obj5).intValue();
                                if (intValue2 < 0) {
                                    intValue2 = 0;
                                }
                                int i3 = intValue2;
                                cza czaVar3 = zi9Var2.d;
                                if (czaVar3 != null) {
                                    do {
                                        value3 = czaVar3.getValue();
                                        ((qi9) zi9Var2.c).a.p.e(xh9.s[14], Integer.valueOf(i3));
                                    } while (!czaVar3.l(value3, yi9.a((yi9) value3, false, false, false, false, i3, 0L, 47)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 3:
                                Boolean bool2 = (Boolean) obj5;
                                boolean booleanValue2 = bool2.booleanValue();
                                cza czaVar4 = zi9Var2.d;
                                if (czaVar4 != null) {
                                    do {
                                        value4 = czaVar4.getValue();
                                        ((qi9) zi9Var2.c).a.d.e(xh9.s[2], bool2);
                                    } while (!czaVar4.l(value4, yi9.a((yi9) value4, false, booleanValue2, false, false, 0, 0L, 61)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 4:
                                Boolean bool3 = (Boolean) obj5;
                                boolean booleanValue3 = bool3.booleanValue();
                                cza czaVar5 = zi9Var2.d;
                                if (czaVar5 != null) {
                                    do {
                                        value5 = czaVar5.getValue();
                                        ((qi9) zi9Var2.c).a.h.e(xh9.s[6], bool3);
                                    } while (!czaVar5.l(value5, yi9.a((yi9) value5, false, false, booleanValue3, false, 0, 0L, 59)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            default:
                                Boolean bool4 = (Boolean) obj5;
                                boolean booleanValue4 = bool4.booleanValue();
                                cza czaVar6 = zi9Var2.d;
                                if (czaVar6 != null) {
                                    do {
                                        value6 = czaVar6.getValue();
                                        ((qi9) zi9Var2.c).a.e.e(xh9.s[3], bool4);
                                    } while (!czaVar6.l(value6, yi9.a((yi9) value6, false, false, false, booleanValue4, 0, 0L, 55)));
                                    return pvcVar;
                                }
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P);
            }
            xt4 xt4Var = (xt4) P;
            boolean f2 = rv4Var.f(zi9Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new xt4() { // from class: si9
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        Object value6;
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        zi9 zi9Var2 = zi9Var;
                        switch (i2) {
                            case 0:
                                Boolean bool = (Boolean) obj5;
                                boolean booleanValue = bool.booleanValue();
                                cza czaVar = zi9Var2.d;
                                if (czaVar != null) {
                                    do {
                                        value = czaVar.getValue();
                                        ((qi9) zi9Var2.c).a.c.e(xh9.s[1], bool);
                                    } while (!czaVar.l(value, yi9.a((yi9) value, booleanValue, false, false, false, 0, 0L, 62)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 1:
                                Long l = (Long) obj5;
                                long longValue = l.longValue();
                                cza czaVar2 = zi9Var2.d;
                                if (czaVar2 != null) {
                                    do {
                                        value2 = czaVar2.getValue();
                                        ((qi9) zi9Var2.c).a.q.e(xh9.s[15], l);
                                    } while (!czaVar2.l(value2, yi9.a((yi9) value2, false, false, false, false, 0, longValue, 31)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 2:
                                int intValue2 = ((Integer) obj5).intValue();
                                if (intValue2 < 0) {
                                    intValue2 = 0;
                                }
                                int i3 = intValue2;
                                cza czaVar3 = zi9Var2.d;
                                if (czaVar3 != null) {
                                    do {
                                        value3 = czaVar3.getValue();
                                        ((qi9) zi9Var2.c).a.p.e(xh9.s[14], Integer.valueOf(i3));
                                    } while (!czaVar3.l(value3, yi9.a((yi9) value3, false, false, false, false, i3, 0L, 47)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 3:
                                Boolean bool2 = (Boolean) obj5;
                                boolean booleanValue2 = bool2.booleanValue();
                                cza czaVar4 = zi9Var2.d;
                                if (czaVar4 != null) {
                                    do {
                                        value4 = czaVar4.getValue();
                                        ((qi9) zi9Var2.c).a.d.e(xh9.s[2], bool2);
                                    } while (!czaVar4.l(value4, yi9.a((yi9) value4, false, booleanValue2, false, false, 0, 0L, 61)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 4:
                                Boolean bool3 = (Boolean) obj5;
                                boolean booleanValue3 = bool3.booleanValue();
                                cza czaVar5 = zi9Var2.d;
                                if (czaVar5 != null) {
                                    do {
                                        value5 = czaVar5.getValue();
                                        ((qi9) zi9Var2.c).a.h.e(xh9.s[6], bool3);
                                    } while (!czaVar5.l(value5, yi9.a((yi9) value5, false, false, booleanValue3, false, 0, 0L, 59)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            default:
                                Boolean bool4 = (Boolean) obj5;
                                boolean booleanValue4 = bool4.booleanValue();
                                cza czaVar6 = zi9Var2.d;
                                if (czaVar6 != null) {
                                    do {
                                        value6 = czaVar6.getValue();
                                        ((qi9) zi9Var2.c).a.e.e(xh9.s[3], bool4);
                                    } while (!czaVar6.l(value6, yi9.a((yi9) value6, false, false, false, booleanValue4, 0, 0L, 55)));
                                    return pvcVar;
                                }
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P2);
            }
            xt4 xt4Var2 = (xt4) P2;
            boolean f3 = rv4Var.f(zi9Var);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new xt4() { // from class: si9
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        Object value6;
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        zi9 zi9Var2 = zi9Var;
                        switch (i2) {
                            case 0:
                                Boolean bool = (Boolean) obj5;
                                boolean booleanValue = bool.booleanValue();
                                cza czaVar = zi9Var2.d;
                                if (czaVar != null) {
                                    do {
                                        value = czaVar.getValue();
                                        ((qi9) zi9Var2.c).a.c.e(xh9.s[1], bool);
                                    } while (!czaVar.l(value, yi9.a((yi9) value, booleanValue, false, false, false, 0, 0L, 62)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 1:
                                Long l = (Long) obj5;
                                long longValue = l.longValue();
                                cza czaVar2 = zi9Var2.d;
                                if (czaVar2 != null) {
                                    do {
                                        value2 = czaVar2.getValue();
                                        ((qi9) zi9Var2.c).a.q.e(xh9.s[15], l);
                                    } while (!czaVar2.l(value2, yi9.a((yi9) value2, false, false, false, false, 0, longValue, 31)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 2:
                                int intValue2 = ((Integer) obj5).intValue();
                                if (intValue2 < 0) {
                                    intValue2 = 0;
                                }
                                int i3 = intValue2;
                                cza czaVar3 = zi9Var2.d;
                                if (czaVar3 != null) {
                                    do {
                                        value3 = czaVar3.getValue();
                                        ((qi9) zi9Var2.c).a.p.e(xh9.s[14], Integer.valueOf(i3));
                                    } while (!czaVar3.l(value3, yi9.a((yi9) value3, false, false, false, false, i3, 0L, 47)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 3:
                                Boolean bool2 = (Boolean) obj5;
                                boolean booleanValue2 = bool2.booleanValue();
                                cza czaVar4 = zi9Var2.d;
                                if (czaVar4 != null) {
                                    do {
                                        value4 = czaVar4.getValue();
                                        ((qi9) zi9Var2.c).a.d.e(xh9.s[2], bool2);
                                    } while (!czaVar4.l(value4, yi9.a((yi9) value4, false, booleanValue2, false, false, 0, 0L, 61)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 4:
                                Boolean bool3 = (Boolean) obj5;
                                boolean booleanValue3 = bool3.booleanValue();
                                cza czaVar5 = zi9Var2.d;
                                if (czaVar5 != null) {
                                    do {
                                        value5 = czaVar5.getValue();
                                        ((qi9) zi9Var2.c).a.h.e(xh9.s[6], bool3);
                                    } while (!czaVar5.l(value5, yi9.a((yi9) value5, false, false, booleanValue3, false, 0, 0L, 59)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            default:
                                Boolean bool4 = (Boolean) obj5;
                                boolean booleanValue4 = bool4.booleanValue();
                                cza czaVar6 = zi9Var2.d;
                                if (czaVar6 != null) {
                                    do {
                                        value6 = czaVar6.getValue();
                                        ((qi9) zi9Var2.c).a.e.e(xh9.s[3], bool4);
                                    } while (!czaVar6.l(value6, yi9.a((yi9) value6, false, false, false, booleanValue4, 0, 0L, 55)));
                                    return pvcVar;
                                }
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P3);
            }
            xt4 xt4Var3 = (xt4) P3;
            boolean f4 = rv4Var.f(zi9Var);
            Object P4 = rv4Var.P();
            if (f4 || P4 == lh9Var) {
                P4 = new xt4() { // from class: si9
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        Object value6;
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        zi9 zi9Var2 = zi9Var;
                        switch (i2) {
                            case 0:
                                Boolean bool = (Boolean) obj5;
                                boolean booleanValue = bool.booleanValue();
                                cza czaVar = zi9Var2.d;
                                if (czaVar != null) {
                                    do {
                                        value = czaVar.getValue();
                                        ((qi9) zi9Var2.c).a.c.e(xh9.s[1], bool);
                                    } while (!czaVar.l(value, yi9.a((yi9) value, booleanValue, false, false, false, 0, 0L, 62)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 1:
                                Long l = (Long) obj5;
                                long longValue = l.longValue();
                                cza czaVar2 = zi9Var2.d;
                                if (czaVar2 != null) {
                                    do {
                                        value2 = czaVar2.getValue();
                                        ((qi9) zi9Var2.c).a.q.e(xh9.s[15], l);
                                    } while (!czaVar2.l(value2, yi9.a((yi9) value2, false, false, false, false, 0, longValue, 31)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 2:
                                int intValue2 = ((Integer) obj5).intValue();
                                if (intValue2 < 0) {
                                    intValue2 = 0;
                                }
                                int i3 = intValue2;
                                cza czaVar3 = zi9Var2.d;
                                if (czaVar3 != null) {
                                    do {
                                        value3 = czaVar3.getValue();
                                        ((qi9) zi9Var2.c).a.p.e(xh9.s[14], Integer.valueOf(i3));
                                    } while (!czaVar3.l(value3, yi9.a((yi9) value3, false, false, false, false, i3, 0L, 47)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 3:
                                Boolean bool2 = (Boolean) obj5;
                                boolean booleanValue2 = bool2.booleanValue();
                                cza czaVar4 = zi9Var2.d;
                                if (czaVar4 != null) {
                                    do {
                                        value4 = czaVar4.getValue();
                                        ((qi9) zi9Var2.c).a.d.e(xh9.s[2], bool2);
                                    } while (!czaVar4.l(value4, yi9.a((yi9) value4, false, booleanValue2, false, false, 0, 0L, 61)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 4:
                                Boolean bool3 = (Boolean) obj5;
                                boolean booleanValue3 = bool3.booleanValue();
                                cza czaVar5 = zi9Var2.d;
                                if (czaVar5 != null) {
                                    do {
                                        value5 = czaVar5.getValue();
                                        ((qi9) zi9Var2.c).a.h.e(xh9.s[6], bool3);
                                    } while (!czaVar5.l(value5, yi9.a((yi9) value5, false, false, booleanValue3, false, 0, 0L, 59)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            default:
                                Boolean bool4 = (Boolean) obj5;
                                boolean booleanValue4 = bool4.booleanValue();
                                cza czaVar6 = zi9Var2.d;
                                if (czaVar6 != null) {
                                    do {
                                        value6 = czaVar6.getValue();
                                        ((qi9) zi9Var2.c).a.e.e(xh9.s[3], bool4);
                                    } while (!czaVar6.l(value6, yi9.a((yi9) value6, false, false, false, booleanValue4, 0, 0L, 55)));
                                    return pvcVar;
                                }
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P4);
            }
            xt4 xt4Var4 = (xt4) P4;
            boolean f5 = rv4Var.f(cz7Var);
            Object P5 = rv4Var.P();
            if (f5 || P5 == lh9Var) {
                P5 = new px6(cz7Var, 28);
                rv4Var.o0(P5);
            }
            vt4 vt4Var2 = (vt4) P5;
            boolean f6 = rv4Var.f(cz7Var);
            Object P6 = rv4Var.P();
            if (f6 || P6 == lh9Var) {
                P6 = new px6(cz7Var, 29);
                rv4Var.o0(P6);
            }
            vt4 vt4Var3 = (vt4) P6;
            boolean f7 = rv4Var.f(zi9Var);
            Object P7 = rv4Var.P();
            if (f7 || P7 == lh9Var) {
                P7 = new xt4() { // from class: si9
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        Object value6;
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        zi9 zi9Var2 = zi9Var;
                        switch (i2) {
                            case 0:
                                Boolean bool = (Boolean) obj5;
                                boolean booleanValue = bool.booleanValue();
                                cza czaVar = zi9Var2.d;
                                if (czaVar != null) {
                                    do {
                                        value = czaVar.getValue();
                                        ((qi9) zi9Var2.c).a.c.e(xh9.s[1], bool);
                                    } while (!czaVar.l(value, yi9.a((yi9) value, booleanValue, false, false, false, 0, 0L, 62)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 1:
                                Long l = (Long) obj5;
                                long longValue = l.longValue();
                                cza czaVar2 = zi9Var2.d;
                                if (czaVar2 != null) {
                                    do {
                                        value2 = czaVar2.getValue();
                                        ((qi9) zi9Var2.c).a.q.e(xh9.s[15], l);
                                    } while (!czaVar2.l(value2, yi9.a((yi9) value2, false, false, false, false, 0, longValue, 31)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 2:
                                int intValue2 = ((Integer) obj5).intValue();
                                if (intValue2 < 0) {
                                    intValue2 = 0;
                                }
                                int i3 = intValue2;
                                cza czaVar3 = zi9Var2.d;
                                if (czaVar3 != null) {
                                    do {
                                        value3 = czaVar3.getValue();
                                        ((qi9) zi9Var2.c).a.p.e(xh9.s[14], Integer.valueOf(i3));
                                    } while (!czaVar3.l(value3, yi9.a((yi9) value3, false, false, false, false, i3, 0L, 47)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 3:
                                Boolean bool2 = (Boolean) obj5;
                                boolean booleanValue2 = bool2.booleanValue();
                                cza czaVar4 = zi9Var2.d;
                                if (czaVar4 != null) {
                                    do {
                                        value4 = czaVar4.getValue();
                                        ((qi9) zi9Var2.c).a.d.e(xh9.s[2], bool2);
                                    } while (!czaVar4.l(value4, yi9.a((yi9) value4, false, booleanValue2, false, false, 0, 0L, 61)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 4:
                                Boolean bool3 = (Boolean) obj5;
                                boolean booleanValue3 = bool3.booleanValue();
                                cza czaVar5 = zi9Var2.d;
                                if (czaVar5 != null) {
                                    do {
                                        value5 = czaVar5.getValue();
                                        ((qi9) zi9Var2.c).a.h.e(xh9.s[6], bool3);
                                    } while (!czaVar5.l(value5, yi9.a((yi9) value5, false, false, booleanValue3, false, 0, 0L, 59)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            default:
                                Boolean bool4 = (Boolean) obj5;
                                boolean booleanValue4 = bool4.booleanValue();
                                cza czaVar6 = zi9Var2.d;
                                if (czaVar6 != null) {
                                    do {
                                        value6 = czaVar6.getValue();
                                        ((qi9) zi9Var2.c).a.e.e(xh9.s[3], bool4);
                                    } while (!czaVar6.l(value6, yi9.a((yi9) value6, false, false, false, booleanValue4, 0, 0L, 55)));
                                    return pvcVar;
                                }
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P7);
            }
            xt4 xt4Var5 = (xt4) P7;
            boolean f8 = rv4Var.f(zi9Var);
            Object P8 = rv4Var.P();
            if (f8 || P8 == lh9Var) {
                P8 = new xt4() { // from class: si9
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        Object value6;
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        zi9 zi9Var2 = zi9Var;
                        switch (i2) {
                            case 0:
                                Boolean bool = (Boolean) obj5;
                                boolean booleanValue = bool.booleanValue();
                                cza czaVar = zi9Var2.d;
                                if (czaVar != null) {
                                    do {
                                        value = czaVar.getValue();
                                        ((qi9) zi9Var2.c).a.c.e(xh9.s[1], bool);
                                    } while (!czaVar.l(value, yi9.a((yi9) value, booleanValue, false, false, false, 0, 0L, 62)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 1:
                                Long l = (Long) obj5;
                                long longValue = l.longValue();
                                cza czaVar2 = zi9Var2.d;
                                if (czaVar2 != null) {
                                    do {
                                        value2 = czaVar2.getValue();
                                        ((qi9) zi9Var2.c).a.q.e(xh9.s[15], l);
                                    } while (!czaVar2.l(value2, yi9.a((yi9) value2, false, false, false, false, 0, longValue, 31)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 2:
                                int intValue2 = ((Integer) obj5).intValue();
                                if (intValue2 < 0) {
                                    intValue2 = 0;
                                }
                                int i3 = intValue2;
                                cza czaVar3 = zi9Var2.d;
                                if (czaVar3 != null) {
                                    do {
                                        value3 = czaVar3.getValue();
                                        ((qi9) zi9Var2.c).a.p.e(xh9.s[14], Integer.valueOf(i3));
                                    } while (!czaVar3.l(value3, yi9.a((yi9) value3, false, false, false, false, i3, 0L, 47)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 3:
                                Boolean bool2 = (Boolean) obj5;
                                boolean booleanValue2 = bool2.booleanValue();
                                cza czaVar4 = zi9Var2.d;
                                if (czaVar4 != null) {
                                    do {
                                        value4 = czaVar4.getValue();
                                        ((qi9) zi9Var2.c).a.d.e(xh9.s[2], bool2);
                                    } while (!czaVar4.l(value4, yi9.a((yi9) value4, false, booleanValue2, false, false, 0, 0L, 61)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            case 4:
                                Boolean bool3 = (Boolean) obj5;
                                boolean booleanValue3 = bool3.booleanValue();
                                cza czaVar5 = zi9Var2.d;
                                if (czaVar5 != null) {
                                    do {
                                        value5 = czaVar5.getValue();
                                        ((qi9) zi9Var2.c).a.h.e(xh9.s[6], bool3);
                                    } while (!czaVar5.l(value5, yi9.a((yi9) value5, false, false, booleanValue3, false, 0, 0L, 59)));
                                    return pvcVar;
                                }
                                return pvcVar;
                            default:
                                Boolean bool4 = (Boolean) obj5;
                                boolean booleanValue4 = bool4.booleanValue();
                                cza czaVar6 = zi9Var2.d;
                                if (czaVar6 != null) {
                                    do {
                                        value6 = czaVar6.getValue();
                                        ((qi9) zi9Var2.c).a.e.e(xh9.s[3], bool4);
                                    } while (!czaVar6.l(value6, yi9.a((yi9) value6, false, false, false, booleanValue4, 0, 0L, 55)));
                                    return pvcVar;
                                }
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P8);
            }
            xt4 xt4Var6 = (xt4) P8;
            boolean f9 = rv4Var.f(cz7Var);
            Object P9 = rv4Var.P();
            if (f9 || P9 == lh9Var) {
                P9 = new ti9(cz7Var, 0);
                rv4Var.o0(P9);
            }
            vt4 vt4Var4 = (vt4) P9;
            boolean f10 = rv4Var.f(cz7Var);
            Object P10 = rv4Var.P();
            if (!f10 && P10 != lh9Var) {
                vt4Var = vt4Var4;
            } else {
                vt4Var = vt4Var4;
                P10 = new ti9(cz7Var, 1);
                rv4Var.o0(P10);
            }
            vt4 vt4Var5 = (vt4) P10;
            boolean f11 = rv4Var.f(cz7Var);
            Object P11 = rv4Var.P();
            if (f11 || P11 == lh9Var) {
                P11 = new ti9(cz7Var, 3);
                rv4Var.o0(P11);
            }
            vt4 vt4Var6 = (vt4) P11;
            boolean f12 = rv4Var.f(cz7Var);
            Object P12 = rv4Var.P();
            if (f12 || P12 == lh9Var) {
                P12 = new ti9(cz7Var, 4);
                rv4Var.o0(P12);
            }
            vt4 vt4Var7 = (vt4) P12;
            boolean f13 = rv4Var.f(cz7Var);
            Object P13 = rv4Var.P();
            if (f13 || P13 == lh9Var) {
                P13 = new ti9(cz7Var, 5);
                rv4Var.o0(P13);
            }
            xi9.b(yi9Var, rh8Var, u, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var2, vt4Var3, xt4Var5, xt4Var6, vt4Var, vt4Var5, vt4Var6, vt4Var7, (vt4) P13, rv4Var, intValue & Token.ASSIGN_MOD);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        lh9 lh9Var;
        nq7 nq7Var;
        int i;
        zfa zfaVar = (zfa) this.b;
        aw7 aw7Var = (aw7) this.c;
        aw7 aw7Var2 = (aw7) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            nq7 A = zbe.A(zbe.x(pna.c, rh8Var), 16.0f, nae.e, 2);
            xn1 a = wn1.a(new hz(16.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            jo3 jo3Var = ((xfa) nk2.p(kq7Var, nae.e, rv4Var, aw7Var)).g;
            vl6 vl6Var = ((xfa) aw7Var.getValue()).f;
            lh9 lh9Var2 = ax1.a;
            if (jo3Var != null) {
                rv4Var.e0(-676103162);
                jue.l(jo3Var, null, rv4Var, 0);
                rv4Var.q(false);
            } else if (vl6Var != null) {
                rv4Var.e0(-676100697);
                Object P = rv4Var.P();
                if (P == lh9Var2) {
                    P = new ao7(aw7Var2, 25);
                    rv4Var.o0(P);
                }
                jue.A(vl6Var, (vt4) P, null, rv4Var, 48);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-676095818);
                Object P2 = rv4Var.P();
                if (P2 == lh9Var2) {
                    P2 = new ao7(aw7Var2, 26);
                    rv4Var.o0(P2);
                }
                jue.z(6, (vt4) P2, rv4Var, null);
                rv4Var.q(false);
            }
            float f = ((xfa) aw7Var.getValue()).i;
            boolean f2 = rv4Var.f(zfaVar);
            Object P3 = rv4Var.P();
            if (!f2 && P3 != lh9Var2) {
                lh9Var = lh9Var2;
                nq7Var = null;
            } else {
                lh9Var = lh9Var2;
                nq7Var = null;
                mp6 mp6Var = new mp6(1, zfaVar, zfa.class, "updateRate", "updateRate(F)V", 0, 21);
                rv4Var.o0(mp6Var);
                P3 = mp6Var;
            }
            jue.x(f, (xt4) ((i76) P3), nq7Var, rv4Var, 0);
            String str = ((xfa) aw7Var.getValue()).h;
            boolean f3 = rv4Var.f(zfaVar);
            Object P4 = rv4Var.P();
            if (f3 || P4 == lh9Var) {
                P4 = new mp6(1, zfaVar, zfa.class, "updateMessage", "updateMessage(Ljava/lang/String;)V", 0, 22);
                rv4Var.o0(P4);
            }
            uwe.h(str, (xt4) ((i76) P4), pna.j(pna.f(kq7Var, 1.0f), 140.0f, nae.e, 2), false, false, null, null, w9e.a, null, null, false, null, null, null, false, 0, 0, ((h27) rv4Var.j(j27.a)).c.c, null, rv4Var, 12583296, 0, 6291320);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4, types: [ted] */
    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        aw7 aw7Var;
        int i;
        xt4 xt4Var;
        lh9 lh9Var;
        boolean z2;
        boolean z3;
        aw7 aw7Var2;
        aw7 aw7Var3;
        hq hqVar;
        p1a p1aVar;
        boolean z4;
        float f;
        int i2;
        fla flaVar = (fla) this.b;
        ae0 ae0Var = (ae0) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        nk0 nk0Var = kh5.e;
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            intValue |= i2;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = new mia(15);
                rv4Var.o0(P);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = new mia(16);
                rv4Var.o0(P2);
            }
            aw7 aw7Var5 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == lh9Var2) {
                P3 = new mia(13);
                rv4Var.o0(P3);
            }
            aw7 aw7Var6 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
            Object[] objArr4 = new Object[0];
            Object P4 = rv4Var.P();
            if (P4 == lh9Var2) {
                P4 = new mia(14);
                rv4Var.o0(P4);
            }
            aw7 aw7Var7 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var, 48);
            Object P5 = rv4Var.P();
            if (P5 == lh9Var2) {
                P5 = s21.e(rv4Var);
            }
            zm4 zm4Var = (zm4) P5;
            Object P6 = rv4Var.P();
            if (P6 == lh9Var2) {
                P6 = s21.e(rv4Var);
            }
            zm4 zm4Var2 = (zm4) P6;
            nq7 y = zbe.y(rte.C(q1d.l(zbe.x(mwe.x(pna.c, 14), rh8Var), rv4Var, 0), rte.u(rv4Var), 14), 24.0f);
            xn1 a = wn1.a(lz.d, kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            String str = (String) aw7Var4.getValue();
            t86 t86Var = new t86(0, 6, Token.INC);
            Object P7 = rv4Var.P();
            if (P7 == lh9Var2) {
                P7 = new ox6(zm4Var, 2);
                rv4Var.o0(P7);
            }
            q86 q86Var = new q86((xt4) P7, null, 59);
            v72 v72Var = r0f.z(rv4Var).b;
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            boolean f3 = rv4Var.f(aw7Var4);
            Object P8 = rv4Var.P();
            if (f3 || P8 == lh9Var2) {
                P8 = new jia(aw7Var4, 7);
                rv4Var.o0(P8);
            }
            uwe.h(str, (xt4) P8, f2, false, false, null, dae.c, null, dae.d, null, false, null, t86Var, q86Var, true, 0, 0, v72Var, null, rv4Var, 102236544, 12779520, 6061752);
            String str2 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var5);
            t86 t86Var2 = new t86(0, 6, Token.INC);
            Object P9 = rv4Var.P();
            if (P9 == lh9Var2) {
                P9 = new ox6(zm4Var2, 3);
                rv4Var.o0(P9);
            }
            q86 q86Var2 = new q86((xt4) P9, null, 59);
            v72 v72Var2 = r0f.z(rv4Var).b;
            nq7 f4 = pna.f(kq7Var, 1.0f);
            Object P10 = rv4Var.P();
            if (P10 == lh9Var2) {
                P10 = new eja(16);
                rv4Var.o0(P10);
            }
            nq7 n = mwe.n(y7a.c(f4, false, (xt4) P10), zm4Var);
            boolean f5 = rv4Var.f(aw7Var5);
            Object P11 = rv4Var.P();
            if (f5 || P11 == lh9Var2) {
                P11 = new jia(aw7Var5, 8);
                rv4Var.o0(P11);
            }
            uwe.h(str2, (xt4) P11, n, false, false, null, dae.e, null, dae.f, null, false, null, t86Var2, q86Var2, true, 0, 0, v72Var2, null, rv4Var, 102236160, 12779520, 6061752);
            String str3 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var6);
            t86 t86Var3 = new t86(7, 7, Token.HOOK);
            boolean f6 = rv4Var.f(flaVar) | rv4Var.f(aw7Var4) | rv4Var.f(aw7Var5) | rv4Var.f(aw7Var6);
            Object P12 = rv4Var.P();
            if (!f6 && P12 != lh9Var2) {
                lh9Var = lh9Var2;
                aw7Var2 = aw7Var5;
                aw7Var3 = aw7Var6;
                aw7Var = aw7Var4;
                hqVar = P12;
                i = 59;
                xt4Var = null;
                z2 = true;
                z3 = false;
            } else {
                aw7Var = aw7Var4;
                i = 59;
                xt4Var = null;
                lh9Var = lh9Var2;
                z2 = true;
                z3 = false;
                hq hqVar2 = new hq(flaVar, aw7Var, aw7Var5, aw7Var6, 26);
                aw7Var2 = aw7Var5;
                aw7Var3 = aw7Var6;
                rv4Var.o0(hqVar2);
                hqVar = hqVar2;
            }
            q86 q86Var3 = new q86((xt4) hqVar, xt4Var, i);
            if (((Boolean) aw7Var7.getValue()).booleanValue()) {
                p1aVar = hq7.T;
            } else {
                p1aVar = new Object();
            }
            ?? r16 = p1aVar;
            v72 v72Var3 = r0f.z(rv4Var).b;
            nq7 f7 = pna.f(kq7Var, 1.0f);
            Object P13 = rv4Var.P();
            if (P13 == lh9Var) {
                P13 = new eja(17);
                rv4Var.o0(P13);
            }
            nq7 n2 = mwe.n(y7a.c(f7, z3, (xt4) P13), zm4Var2);
            boolean f8 = rv4Var.f(aw7Var3);
            Object P14 = rv4Var.P();
            if (f8 || P14 == lh9Var) {
                P14 = new jia(aw7Var3, 9);
                rv4Var.o0(P14);
            }
            aw7 aw7Var8 = aw7Var3;
            lh9 lh9Var3 = lh9Var;
            aw7 aw7Var9 = aw7Var2;
            uwe.h(str3, (xt4) P14, n2, false, false, null, dae.g, null, dae.h, jce.E(-1087064515, new sp0(aw7Var7, 17), rv4Var), false, r16, t86Var3, q86Var3, true, 0, 0, v72Var3, null, rv4Var, 907542528, 12779520, 6044856);
            rv4 rv4Var2 = rv4Var;
            if (((String) nk2.p(kq7Var, 24.0f, rv4Var2, aw7Var)).length() > 0 && ((String) aw7Var9.getValue()).length() > 0 && ((String) aw7Var8.getValue()).length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            nq7 k = tte.k(pna.n(kq7Var, 56.0f), uu9.a);
            long j = r0f.y(rv4Var2).a;
            if (z4) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            nq7 a0 = nmd.v(k, zl1.b(f, j), lre.g).a0(new l95(kh5.K));
            boolean h = rv4Var2.h(ae0Var) | rv4Var2.f(flaVar) | rv4Var2.f(aw7Var) | rv4Var2.f(aw7Var9) | rv4Var2.f(aw7Var8);
            Object P15 = rv4Var2.P();
            if (h || P15 == lh9Var3) {
                w24 w24Var = new w24(ae0Var, flaVar, aw7Var, aw7Var9, aw7Var8, 3);
                rv4Var2.o0(w24Var);
                P15 = w24Var;
            }
            nq7 f9 = lbe.f(14, (vt4) P15, a0, null, z4);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f9);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            boolean z5 = ((ela) yyaVar.getValue()).a;
            pu0 pu0Var = pu0.a;
            if (z5) {
                rv4Var2.e0(-1904229940);
                eg0.f(pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var), r0f.y(rv4Var2).b, null, rv4Var2, 0, 4);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1903941578);
                nk5.a(rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.A.getValue(), rv4Var2), tte.t(pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var), 180.0f), r0f.y(rv4Var2).b, rv4Var2, 0, 0);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        f0b f0bVar = (f0b) this.c;
        cz7 cz7Var = (cz7) this.b;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            c0b c0bVar = (c0b) yyaVar.getValue();
            boolean f = rv4Var.f(f0bVar);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                mp6 mp6Var = new mp6(1, f0bVar, f0b.class, "changeBookSortMode", "changeBookSortMode(Lcom/reader/app/ui/screen/setting/statistic/model/BookSortMode;)V", 0, 25);
                rv4Var.o0(mp6Var);
                P = mp6Var;
            }
            xt4 xt4Var = (xt4) ((i76) P);
            boolean f2 = rv4Var.f(f0bVar);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                vja vjaVar = new vja(0, f0bVar, f0b.class, "loadMoreRecentBooks", "loadMoreRecentBooks()V", 0, 1);
                rv4Var.o0(vjaVar);
                P2 = vjaVar;
            }
            vt4 vt4Var = (vt4) ((i76) P2);
            boolean f3 = rv4Var.f(f0bVar);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                vja vjaVar2 = new vja(0, f0bVar, f0b.class, "loadMoreLibraryBooks", "loadMoreLibraryBooks()V", 0, 2);
                rv4Var.o0(vjaVar2);
                P3 = vjaVar2;
            }
            vt4 vt4Var2 = (vt4) ((i76) P3);
            boolean f4 = rv4Var.f(f0bVar);
            Object P4 = rv4Var.P();
            if (f4 || P4 == lh9Var) {
                vja vjaVar3 = new vja(0, f0bVar, f0b.class, "toggleRecentSortOrder", "toggleRecentSortOrder()V", 0, 3);
                rv4Var.o0(vjaVar3);
                P4 = vjaVar3;
            }
            vt4 vt4Var3 = (vt4) ((i76) P4);
            boolean f5 = rv4Var.f(f0bVar);
            Object P5 = rv4Var.P();
            if (f5 || P5 == lh9Var) {
                vja vjaVar4 = new vja(0, f0bVar, f0b.class, "toggleLibrarySortOrder", "toggleLibrarySortOrder()V", 0, 4);
                rv4Var.o0(vjaVar4);
                P5 = vjaVar4;
            }
            vt4 vt4Var4 = (vt4) ((i76) P5);
            boolean f6 = rv4Var.f(cz7Var);
            Object P6 = rv4Var.P();
            if (f6 || P6 == lh9Var) {
                P6 = new ar0(cz7Var, 28);
                rv4Var.o0(P6);
            }
            owe.n(rh8Var, c0bVar, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, (xt4) P6, pna.c, rv4Var, ((i2 >> 3) & 14) | 100663296);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        kd4 kd4Var = (kd4) this.b;
        vhb vhbVar = (vhb) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            boolean isEmpty = ((rhb) yyaVar.getValue()).i.isEmpty();
            lh9 lh9Var = ax1.a;
            if (isEmpty) {
                rv4Var.e0(1432419939);
                nq7 x = zbe.x(pna.c, rh8Var);
                boolean f = rv4Var.f(kd4Var);
                Object P = rv4Var.P();
                if (f || P == lh9Var) {
                    P = new fe1(kd4Var, 18);
                    rv4Var.o0(P);
                }
                hxe.c(0, (vt4) P, rv4Var, x);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1432684741);
                rhb rhbVar = (rhb) yyaVar.getValue();
                bkd r = mwe.r(mwe.r(rh8Var, mwe.f(14, rv4Var, false)), zbe.j(nae.e, nae.e, nae.e, 64.0f, 7));
                ze4 ze4Var = pna.c;
                boolean f2 = rv4Var.f(vhbVar);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new ygb(vhbVar, 1);
                    rv4Var.o0(P2);
                }
                xt4 xt4Var = (xt4) P2;
                boolean f3 = rv4Var.f(vhbVar);
                Object P3 = rv4Var.P();
                if (f3 || P3 == lh9Var) {
                    P3 = new ygb(vhbVar, 2);
                    rv4Var.o0(P3);
                }
                hxe.b(rhbVar, r, ze4Var, xt4Var, (xt4) P3, rv4Var, 384);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        go3 go3Var = (go3) this.b;
        vhb vhbVar = (vhb) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            boolean isEmpty = ((rhb) yyaVar.getValue()).j.isEmpty();
            lh9 lh9Var = ax1.a;
            if (isEmpty) {
                rv4Var.e0(-124551218);
                nq7 x = zbe.x(pna.c, rh8Var);
                boolean f = rv4Var.f(go3Var);
                Object P = rv4Var.P();
                if (f || P == lh9Var) {
                    P = new bhb(go3Var, 1);
                    rv4Var.o0(P);
                }
                jxe.h(0, (vt4) P, rv4Var, x);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-124272528);
                List list = ((rhb) yyaVar.getValue()).j;
                ze4 ze4Var = pna.c;
                boolean f2 = rv4Var.f(vhbVar);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new ygb(vhbVar, 4);
                    rv4Var.o0(P2);
                }
                xt4 xt4Var = (xt4) P2;
                boolean f3 = rv4Var.f(go3Var);
                Object P3 = rv4Var.P();
                if (f3 || P3 == lh9Var) {
                    P3 = new dhb(go3Var, 1);
                    rv4Var.o0(P3);
                }
                jxe.g(list, rh8Var, ze4Var, xt4Var, (xt4) P3, rv4Var, (intValue & Token.ASSIGN_MOD) | 384);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        lh9 lh9Var;
        int i;
        vhb vhbVar = (vhb) this.c;
        cz7 cz7Var = (cz7) this.b;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rhb rhbVar = (rhb) yyaVar.getValue();
            nq7 u = mwe.u(pna.c, false, 6);
            boolean f = rv4Var.f(vhbVar);
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (!f && P != lh9Var2) {
                lh9Var = lh9Var2;
            } else {
                lh9Var = lh9Var2;
                mp6 mp6Var = new mp6(1, vhbVar, vhb.class, "changeTtsEngine", "changeTtsEngine(Ljava/lang/String;)V", 0, 28);
                rv4Var.o0(mp6Var);
                P = mp6Var;
            }
            xt4 xt4Var = (xt4) ((i76) P);
            boolean f2 = rv4Var.f(cz7Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new qhb(cz7Var, 0);
                rv4Var.o0(P2);
            }
            vt4 vt4Var = (vt4) P2;
            boolean f3 = rv4Var.f(cz7Var);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new ar0(cz7Var, 29);
                rv4Var.o0(P3);
            }
            xt4 xt4Var2 = (xt4) P3;
            boolean f4 = rv4Var.f(vhbVar);
            Object P4 = rv4Var.P();
            if (f4 || P4 == lh9Var) {
                P4 = new ygb(vhbVar, 5);
                rv4Var.o0(P4);
            }
            xt4 xt4Var3 = (xt4) P4;
            boolean f5 = rv4Var.f(vhbVar);
            Object P5 = rv4Var.P();
            if (f5 || P5 == lh9Var) {
                P5 = new ygb(vhbVar, 6);
                rv4Var.o0(P5);
            }
            xt4 xt4Var4 = (xt4) P5;
            boolean f6 = rv4Var.f(vhbVar);
            Object P6 = rv4Var.P();
            if (f6 || P6 == lh9Var) {
                P6 = new ygb(vhbVar, 7);
                rv4Var.o0(P6);
            }
            xt4 xt4Var5 = (xt4) P6;
            boolean f7 = rv4Var.f(vhbVar);
            Object P7 = rv4Var.P();
            if (f7 || P7 == lh9Var) {
                P7 = new ygb(vhbVar, 8);
                rv4Var.o0(P7);
            }
            xt4 xt4Var6 = (xt4) P7;
            boolean f8 = rv4Var.f(vhbVar);
            Object P8 = rv4Var.P();
            if (f8 || P8 == lh9Var) {
                P8 = new ygb(vhbVar, 9);
                rv4Var.o0(P8);
            }
            xt4 xt4Var7 = (xt4) P8;
            boolean f9 = rv4Var.f(cz7Var);
            Object P9 = rv4Var.P();
            if (f9 || P9 == lh9Var) {
                P9 = new ti9(cz7Var, 26);
                rv4Var.o0(P9);
            }
            vt4 vt4Var2 = (vt4) P9;
            boolean f10 = rv4Var.f(cz7Var);
            Object P10 = rv4Var.P();
            if (f10 || P10 == lh9Var) {
                P10 = new ti9(cz7Var, 27);
                rv4Var.o0(P10);
            }
            vt4 vt4Var3 = (vt4) P10;
            boolean f11 = rv4Var.f(cz7Var);
            Object P11 = rv4Var.P();
            if (f11 || P11 == lh9Var) {
                P11 = new ti9(cz7Var, 28);
                rv4Var.o0(P11);
            }
            kxe.g(rhbVar, rh8Var, u, xt4Var, vt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var2, vt4Var3, (vt4) P11, rv4Var, i2 & Token.ASSIGN_MOD);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        eo3 eo3Var = (eo3) this.b;
        kf9 kf9Var = (kf9) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            if (!((gf9) yyaVar.getValue()).a) {
                rv4Var.e0(339484184);
                boolean isEmpty = ((gf9) yyaVar.getValue()).b.isEmpty();
                lh9 lh9Var = ax1.a;
                if (isEmpty) {
                    rv4Var.e0(339515122);
                    nq7 x = zbe.x(pna.c, rh8Var);
                    boolean f = rv4Var.f(eo3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new of7(eo3Var, 4);
                        rv4Var.o0(P);
                    }
                    lye.h(0, (vt4) P, rv4Var, x);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(339786589);
                    List list = ((gf9) yyaVar.getValue()).b;
                    ze4 ze4Var = pna.c;
                    boolean f2 = rv4Var.f(eo3Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new nf7(eo3Var, 3);
                        rv4Var.o0(P2);
                    }
                    xt4 xt4Var = (xt4) P2;
                    boolean f3 = rv4Var.f(kf9Var);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new ux9(kf9Var, 26);
                        rv4Var.o0(P3);
                    }
                    lye.g(list, rh8Var, ze4Var, xt4Var, (xt4) P3, rv4Var, (intValue & Token.ASSIGN_MOD) | 384);
                    rv4Var.q(false);
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(340222232);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        final cqb cqbVar = (cqb) this.b;
        io3 io3Var = (io3) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            ((zpb) yyaVar.getValue()).getClass();
            rv4Var.e0(-239890675);
            boolean z2 = ((zpb) yyaVar.getValue()).a;
            List list = ((zpb) yyaVar.getValue()).b;
            ze4 ze4Var = pna.c;
            boolean f = rv4Var.f(cqbVar);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = new xt4() { // from class: wpb
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        cqb cqbVar2 = cqbVar;
                        switch (i2) {
                            case 0:
                                ox7 ox7Var = (ox7) obj5;
                                ox7Var.getClass();
                                String str = ox7Var.a;
                                str.getClass();
                                hk1 a = jdd.a(cqbVar2);
                                sw2 sw2Var = ab3.a;
                                cqbVar2.f(a, ru2.c, new koa(cqbVar2, str, null, 16));
                                return pvcVar;
                            default:
                                Boolean bool = (Boolean) obj5;
                                bool.getClass();
                                cza czaVar = cqbVar2.C;
                                czaVar.getClass();
                                czaVar.n(null, bool);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P);
            }
            xt4 xt4Var = (xt4) P;
            boolean f2 = rv4Var.f(io3Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new ag7(io3Var, 3);
                rv4Var.o0(P2);
            }
            xt4 xt4Var2 = (xt4) P2;
            boolean f3 = rv4Var.f(cqbVar);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new xt4() { // from class: wpb
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        int i2 = r2;
                        pvc pvcVar = pvc.a;
                        cqb cqbVar2 = cqbVar;
                        switch (i2) {
                            case 0:
                                ox7 ox7Var = (ox7) obj5;
                                ox7Var.getClass();
                                String str = ox7Var.a;
                                str.getClass();
                                hk1 a = jdd.a(cqbVar2);
                                sw2 sw2Var = ab3.a;
                                cqbVar2.f(a, ru2.c, new koa(cqbVar2, str, null, 16));
                                return pvcVar;
                            default:
                                Boolean bool = (Boolean) obj5;
                                bool.getClass();
                                cza czaVar = cqbVar2.C;
                                czaVar.getClass();
                                czaVar.n(null, bool);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P3);
            }
            nye.c(z2, list, rh8Var, ze4Var, xt4Var, xt4Var2, (xt4) P3, rv4Var, ((intValue << 3) & 896) | 3072);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        cz7 cz7Var = (cz7) this.b;
        String str = (String) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            swb swbVar = (swb) yyaVar.getValue();
            ze4 ze4Var = pna.c;
            boolean f = rv4Var.f(cz7Var) | rv4Var.f(str);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = new v33(cz7Var, str, 1);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            boolean f2 = rv4Var.f(cz7Var) | rv4Var.f(str);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new v33(cz7Var, str, 2);
                rv4Var.o0(P2);
            }
            vt4 vt4Var2 = (vt4) P2;
            boolean f3 = rv4Var.f(cz7Var);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new qhb(cz7Var, 5);
                rv4Var.o0(P3);
            }
            vt4 vt4Var3 = (vt4) P3;
            boolean f4 = rv4Var.f(cz7Var);
            Object P4 = rv4Var.P();
            if (f4 || P4 == lh9Var) {
                P4 = new qhb(cz7Var, 6);
                rv4Var.o0(P4);
            }
            qye.d(swbVar, rh8Var, ze4Var, vt4Var, vt4Var2, vt4Var3, (vt4) P4, rv4Var, 384 | (intValue & Token.ASSIGN_MOD));
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        m13 m13Var = (m13) this.b;
        c4c c4cVar = (c4c) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            if (!((a4c) yyaVar.getValue()).a) {
                rv4Var.e0(-1626284864);
                boolean isEmpty = ((a4c) yyaVar.getValue()).b.isEmpty();
                lh9 lh9Var = ax1.a;
                if (isEmpty) {
                    rv4Var.e0(-1626251291);
                    nq7 x = zbe.x(pna.c, rh8Var);
                    boolean f = rv4Var.f(m13Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new ze7(m13Var, 3);
                        rv4Var.o0(P);
                    }
                    ak0.g(0, (vt4) P, rv4Var, x);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1625949258);
                    List list = ((a4c) yyaVar.getValue()).b;
                    ze4 ze4Var = pna.c;
                    boolean f2 = rv4Var.f(c4cVar);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new zub(c4cVar, 2);
                        rv4Var.o0(P2);
                    }
                    xt4 xt4Var = (xt4) P2;
                    boolean f3 = rv4Var.f(m13Var);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new xe7(m13Var, 1);
                        rv4Var.o0(P3);
                    }
                    ak0.f(list, rh8Var, ze4Var, xt4Var, (xt4) P3, rv4Var, (intValue & Token.ASSIGN_MOD) | 384);
                    rv4Var.q(false);
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1625373836);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        lh9 lh9Var;
        int i;
        w6c w6cVar = (w6c) this.c;
        cz7 cz7Var = (cz7) this.b;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        int i2 = intValue;
        if ((i2 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            ze4 ze4Var = pna.c;
            p6c p6cVar = (p6c) yyaVar.getValue();
            boolean f = rv4Var.f(w6cVar);
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (f || P == lh9Var2) {
                wob wobVar = new wob(1, w6cVar, w6c.class, "changeDarkMode", "changeDarkMode(I)V", 0, 2);
                rv4Var.o0(wobVar);
                P = wobVar;
            }
            i76 i76Var = (i76) P;
            boolean f2 = rv4Var.f(w6cVar);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var2) {
                wob wobVar2 = new wob(1, w6cVar, w6c.class, "changeDynamicColor", "changeDynamicColor(Z)V", 0, 9);
                rv4Var.o0(wobVar2);
                P2 = wobVar2;
            }
            i76 i76Var2 = (i76) P2;
            boolean f3 = rv4Var.f(w6cVar);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var2) {
                wob wobVar3 = new wob(1, w6cVar, w6c.class, "changeAmoledMode", "changeAmoledMode(Z)V", 0, 10);
                rv4Var.o0(wobVar3);
                P3 = wobVar3;
            }
            i76 i76Var3 = (i76) P3;
            boolean f4 = rv4Var.f(w6cVar);
            Object P4 = rv4Var.P();
            if (f4 || P4 == lh9Var2) {
                wob wobVar4 = new wob(1, w6cVar, w6c.class, "changeEInkMode", "changeEInkMode(Z)V", 0, 11);
                rv4Var.o0(wobVar4);
                P4 = wobVar4;
            }
            i76 i76Var4 = (i76) P4;
            boolean f5 = rv4Var.f(w6cVar);
            Object P5 = rv4Var.P();
            if (f5 || P5 == lh9Var2) {
                wob wobVar5 = new wob(1, w6cVar, w6c.class, "changeUseLiquidGlass", "changeUseLiquidGlass(Z)V", 0, 12);
                rv4Var.o0(wobVar5);
                P5 = wobVar5;
            }
            i76 i76Var5 = (i76) P5;
            boolean f6 = rv4Var.f(w6cVar);
            Object P6 = rv4Var.P();
            if (f6 || P6 == lh9Var2) {
                wob wobVar6 = new wob(1, w6cVar, w6c.class, "changeSwipeBack", "changeSwipeBack(I)V", 0, 13);
                rv4Var.o0(wobVar6);
                P6 = wobVar6;
            }
            i76 i76Var6 = (i76) P6;
            boolean f7 = rv4Var.f(cz7Var);
            Object P7 = rv4Var.P();
            if (!f7 && P7 != lh9Var2) {
                lh9Var = lh9Var2;
            } else {
                lh9Var = lh9Var2;
                vja vjaVar = new vja(0, cz7Var, oc2.class, "navigateToSettingFont", "navigateToSettingFont(Lcom/core/navigation/NavBackStack;)V", 1, 12);
                rv4Var.o0(vjaVar);
                P7 = vjaVar;
            }
            i76 i76Var7 = (i76) P7;
            boolean f8 = rv4Var.f(w6cVar);
            Object P8 = rv4Var.P();
            if (f8 || P8 == lh9Var) {
                wob wobVar7 = new wob(1, w6cVar, w6c.class, "changeColorScheme", "changeColorScheme(Lcom/reader/data/setting/model/ThemeColor;)V", 0, 14);
                rv4Var.o0(wobVar7);
                P8 = wobVar7;
            }
            i76 i76Var8 = (i76) P8;
            boolean f9 = rv4Var.f(w6cVar);
            Object P9 = rv4Var.P();
            if (f9 || P9 == lh9Var) {
                wob wobVar8 = new wob(1, w6cVar, w6c.class, "changeThemeColorStyle", "changeThemeColorStyle(I)V", 0, 15);
                rv4Var.o0(wobVar8);
                P9 = wobVar8;
            }
            i76 i76Var9 = (i76) P9;
            boolean f10 = rv4Var.f(w6cVar);
            Object P10 = rv4Var.P();
            if (f10 || P10 == lh9Var) {
                wob wobVar9 = new wob(1, w6cVar, w6c.class, "changeContractLevel", "changeContractLevel(F)V", 0, 3);
                rv4Var.o0(wobVar9);
                P10 = wobVar9;
            }
            i76 i76Var10 = (i76) P10;
            boolean f11 = rv4Var.f(w6cVar);
            Object P11 = rv4Var.P();
            if (f11 || P11 == lh9Var) {
                wob wobVar10 = new wob(1, w6cVar, w6c.class, "addThemeColor", "addThemeColor(Ljava/lang/String;)V", 0, 4);
                rv4Var.o0(wobVar10);
                P11 = wobVar10;
            }
            i76 i76Var11 = (i76) P11;
            boolean f12 = rv4Var.f(w6cVar);
            Object P12 = rv4Var.P();
            if (f12 || P12 == lh9Var) {
                wob wobVar11 = new wob(1, w6cVar, w6c.class, "editThemeColor", "editThemeColor(Ljava/lang/String;)V", 0, 5);
                rv4Var.o0(wobVar11);
                P12 = wobVar11;
            }
            i76 i76Var12 = (i76) P12;
            boolean f13 = rv4Var.f(w6cVar);
            Object P13 = rv4Var.P();
            if (f13 || P13 == lh9Var) {
                wob wobVar12 = new wob(1, w6cVar, w6c.class, "deleteThemeColor", "deleteThemeColor(Ljava/lang/String;)V", 0, 6);
                rv4Var.o0(wobVar12);
                P13 = wobVar12;
            }
            i76 i76Var13 = (i76) P13;
            boolean f14 = rv4Var.f(w6cVar);
            Object P14 = rv4Var.P();
            if (f14 || P14 == lh9Var) {
                wob wobVar13 = new wob(1, w6cVar, w6c.class, "changeThemeBackgroundImage", "changeThemeBackgroundImage(Lcom/core/io/KFile;)V", 0, 7);
                rv4Var.o0(wobVar13);
                P14 = wobVar13;
            }
            i76 i76Var14 = (i76) P14;
            boolean f15 = rv4Var.f(w6cVar);
            Object P15 = rv4Var.P();
            if (f15 || P15 == lh9Var) {
                wob wobVar14 = new wob(1, w6cVar, w6c.class, "changeThemeBackgroundImageAlpha", "changeThemeBackgroundImageAlpha(F)V", 0, 8);
                rv4Var.o0(wobVar14);
                P15 = wobVar14;
            }
            sye.g(p6cVar, ze4Var, rh8Var, (xt4) i76Var, (xt4) i76Var2, (xt4) i76Var3, (xt4) i76Var4, (xt4) i76Var5, (xt4) i76Var6, (vt4) i76Var7, (xt4) i76Var8, (xt4) i76Var9, (xt4) i76Var10, (xt4) i76Var11, (xt4) i76Var12, (xt4) i76Var13, (xt4) i76Var14, (xt4) ((i76) P15), rv4Var, ((i2 << 3) & 896) | 48);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        ho3 ho3Var = (ho3) this.b;
        gbc gbcVar = (gbc) this.c;
        yya yyaVar = (yya) this.d;
        rh8 rh8Var = (rh8) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ou0) obj).getClass();
        rh8Var.getClass();
        if ((intValue & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue |= i;
        }
        if ((intValue & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            if (((fbc) yyaVar.getValue()).a) {
                rv4Var.e0(1935913861);
                rv4Var.q(false);
            } else {
                boolean isEmpty = ((fbc) yyaVar.getValue()).b.isEmpty();
                lh9 lh9Var = ax1.a;
                if (isEmpty) {
                    rv4Var.e0(1935972699);
                    nq7 x = zbe.x(pna.c, rh8Var);
                    boolean f = rv4Var.f(ho3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new zf7(ho3Var, 1);
                        rv4Var.o0(P);
                    }
                    tye.g(0, (vt4) P, rv4Var, x);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(1936267323);
                    List list = ((fbc) yyaVar.getValue()).b;
                    ze4 ze4Var = pna.c;
                    boolean f2 = rv4Var.f(ho3Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new zd1(ho3Var, 11);
                        rv4Var.o0(P2);
                    }
                    nu4 nu4Var = (nu4) P2;
                    boolean f3 = rv4Var.f(gbcVar);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new zub(gbcVar, 4);
                        rv4Var.o0(P3);
                    }
                    tye.f(list, rh8Var, ze4Var, nu4Var, (xt4) P3, rv4Var, (intValue & Token.ASSIGN_MOD) | 384);
                    rv4Var.q(false);
                }
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [rv4] */
    /* JADX WARN: Type inference failed for: r29v1, types: [ted] */
    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        boolean z2;
        pz1 pz1Var;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        int i5;
        boolean z7;
        int i6;
        boolean z8;
        q86 q86Var;
        p1a p1aVar;
        v72 v72Var;
        boolean z9;
        float f;
        sx6 sx6Var;
        float f2;
        float f3;
        int i7;
        int i8;
        boolean z10;
        int i9;
        int i10;
        int i11 = this.a;
        Object obj5 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        boolean z11 = true;
        boolean z12 = false;
        switch (i11) {
            case 0:
                cz7 cz7Var = (cz7) obj8;
                rh8 rh8Var = (rh8) obj7;
                bkd bkdVar = (bkd) obj6;
                int intValue = ((Integer) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((jj8) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue2 & 1, z)) {
                    if (intValue != 0) {
                        if (intValue != 1) {
                            rv4Var.e0(2043041479);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(2042764401);
                            fre.a(cz7Var, rh8Var, bkdVar, null, false, pna.c, rv4Var, 196608, 24);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(2042472660);
                        v9e.b(cz7Var, rh8Var, bkdVar, null, false, pna.c, rv4Var, 196608, 24);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                pz1 pz1Var2 = (pz1) obj7;
                cz7 cz7Var2 = (cz7) obj8;
                yya yyaVar = (yya) obj6;
                rh8 rh8Var2 = (rh8) obj2;
                rv4 rv4Var2 = (rv4) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var2.getClass();
                if ((intValue3 & 48) == 0) {
                    if (rv4Var2.f(rh8Var2)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & Token.TARGET) != 144) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue3 & 1, z2)) {
                    qz1 qz1Var = (qz1) yyaVar.getValue();
                    ze4 ze4Var = pna.c;
                    boolean f4 = rv4Var2.f(pz1Var2);
                    Object P = rv4Var2.P();
                    if (!f4 && P != obj5) {
                        pz1Var = pz1Var2;
                    } else {
                        pz1Var = pz1Var2;
                        m0 m0Var = new m0(1, pz1Var, pz1.class, "updateConnectionThread", "updateConnectionThread(I)V", 0, 29);
                        rv4Var2.o0(m0Var);
                        P = m0Var;
                    }
                    xt4 xt4Var = (xt4) ((i76) P);
                    boolean f5 = rv4Var2.f(pz1Var);
                    Object P2 = rv4Var2.P();
                    if (f5 || P2 == obj5) {
                        mz1 mz1Var = new mz1(1, pz1Var, pz1.class, "updateConnectionDelay", "updateConnectionDelay(I)V", 0, 0);
                        rv4Var2.o0(mz1Var);
                        P2 = mz1Var;
                    }
                    xt4 xt4Var2 = (xt4) ((i76) P2);
                    boolean f6 = rv4Var2.f(pz1Var);
                    Object P3 = rv4Var2.P();
                    if (f6 || P3 == obj5) {
                        mz1 mz1Var2 = new mz1(1, pz1Var, pz1.class, "updateConnectionRetry", "updateConnectionRetry(I)V", 0, 1);
                        rv4Var2.o0(mz1Var2);
                        P3 = mz1Var2;
                    }
                    xt4 xt4Var3 = (xt4) ((i76) P3);
                    boolean f7 = rv4Var2.f(pz1Var);
                    Object P4 = rv4Var2.P();
                    if (f7 || P4 == obj5) {
                        mz1 mz1Var3 = new mz1(1, pz1Var, pz1.class, "updateConnectionDns", "updateConnectionDns(I)V", 0, 2);
                        rv4Var2.o0(mz1Var3);
                        P4 = mz1Var3;
                    }
                    xt4 xt4Var4 = (xt4) ((i76) P4);
                    boolean f8 = rv4Var2.f(pz1Var);
                    Object P5 = rv4Var2.P();
                    if (f8 || P5 == obj5) {
                        mz1 mz1Var4 = new mz1(1, pz1Var, pz1.class, "updateConnectionCronet", "updateConnectionCronet(Z)V", 0, 3);
                        rv4Var2.o0(mz1Var4);
                        P5 = mz1Var4;
                    }
                    xt4 xt4Var5 = (xt4) ((i76) P5);
                    boolean f9 = rv4Var2.f(cz7Var2);
                    Object P6 = rv4Var2.P();
                    if (f9 || P6 == obj5) {
                        P6 = new n7(cz7Var2, 18);
                        rv4Var2.o0(P6);
                    }
                    fpe.b(qz1Var, rh8Var2, ze4Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, (vt4) P6, rv4Var2, 384 | (intValue3 & Token.ASSIGN_MOD));
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                co3 co3Var = (co3) obj8;
                ie3 ie3Var = (ie3) obj7;
                yya yyaVar2 = (yya) obj6;
                rh8 rh8Var3 = (rh8) obj2;
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var3.getClass();
                if ((intValue4 & 48) == 0) {
                    if (rv4Var3.f(rh8Var3)) {
                        i3 = 32;
                    } else {
                        i3 = 16;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & Token.TARGET) != 144) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue4 & 1, z3)) {
                    if (((ge3) yyaVar2.getValue()).a) {
                        rv4Var3.e0(-1216421492);
                        rv4Var3.q(false);
                    } else if (((ge3) yyaVar2.getValue()).b.isEmpty()) {
                        rv4Var3.e0(-1216356764);
                        nq7 x = zbe.x(pna.c, rh8Var3);
                        boolean f10 = rv4Var3.f(co3Var);
                        Object P7 = rv4Var3.P();
                        if (f10 || P7 == obj5) {
                            P7 = new de3(co3Var, 1);
                            rv4Var3.o0(P7);
                        }
                        ase.e(0, (vt4) P7, rv4Var3, x);
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(-1216064217);
                        List list = ((ge3) yyaVar2.getValue()).b;
                        ze4 ze4Var2 = pna.c;
                        boolean f11 = rv4Var3.f(co3Var);
                        Object P8 = rv4Var3.P();
                        if (f11 || P8 == obj5) {
                            P8 = new be3(co3Var, 0);
                            rv4Var3.o0(P8);
                        }
                        lu4 lu4Var = (lu4) P8;
                        boolean f12 = rv4Var3.f(ie3Var);
                        Object P9 = rv4Var3.P();
                        if (!f12 && P9 != obj5) {
                            z4 = false;
                        } else {
                            z4 = false;
                            P9 = new ce3(ie3Var, 0);
                            rv4Var3.o0(P9);
                        }
                        ase.d(list, rh8Var3, ze4Var2, lu4Var, (xt4) P9, rv4Var3, (intValue4 & Token.ASSIGN_MOD) | 384);
                        rv4Var3.q(z4);
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                String str = (String) obj8;
                bo3 bo3Var = (bo3) obj7;
                aw7 aw7Var = (aw7) obj6;
                rh8 rh8Var4 = (rh8) obj2;
                rv4 rv4Var4 = (rv4) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var4.getClass();
                if ((intValue5 & 48) == 0) {
                    if (rv4Var4.f(rh8Var4)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    intValue5 |= i4;
                }
                if ((intValue5 & Token.TARGET) != 144) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var4.U(intValue5 & 1, z5)) {
                    if (!((ao3) aw7Var.getValue()).a) {
                        rv4Var4.e0(114010242);
                        String str2 = ((ao3) aw7Var.getValue()).b;
                        String str3 = ((ao3) aw7Var.getValue()).c;
                        String str4 = ((ao3) aw7Var.getValue()).d;
                        nq7 x2 = mwe.x(zbe.x(pna.c, rh8Var4), 14);
                        boolean f13 = rv4Var4.f(bo3Var);
                        Object P10 = rv4Var4.P();
                        if (f13 || P10 == obj5) {
                            P10 = new qc3(4, bo3Var, bo3.class, "editBook", "editBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 1);
                            rv4Var4.o0(P10);
                        }
                        vte.a(str, str2, str3, str4, x2, (nu4) ((i76) P10), rv4Var4, 0);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(114441731);
                        rv4Var4.q(false);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                aw7 aw7Var2 = (aw7) obj8;
                m64 m64Var = (m64) obj7;
                yya yyaVar3 = (yya) obj6;
                rh8 rh8Var5 = (rh8) obj2;
                rv4 rv4Var5 = (rv4) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var5.getClass();
                if ((intValue6 & 48) == 0) {
                    if (rv4Var5.f(rh8Var5)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    intValue6 |= i5;
                }
                if ((intValue6 & Token.TARGET) != 144) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var5.U(intValue6 & 1, z6)) {
                    l64 l64Var = (l64) yyaVar3.getValue();
                    bkd r = mwe.r(rh8Var5, mwe.f(14, rv4Var5, false));
                    ze4 ze4Var3 = pna.c;
                    boolean f14 = rv4Var5.f(aw7Var2);
                    Object P11 = rv4Var5.P();
                    if (f14 || P11 == obj5) {
                        P11 = new ea3(aw7Var2, 25);
                        rv4Var5.o0(P11);
                    }
                    vt4 vt4Var = (vt4) P11;
                    boolean f15 = rv4Var5.f(m64Var);
                    Object P12 = rv4Var5.P();
                    if (f15 || P12 == obj5) {
                        P12 = new j64(m64Var, 1);
                        rv4Var5.o0(P12);
                    }
                    que.a(l64Var, r, ze4Var3, vt4Var, (xt4) P12, rv4Var5, 392);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                final vp4 vp4Var = (vp4) obj7;
                cz7 cz7Var3 = (cz7) obj8;
                yya yyaVar4 = (yya) obj6;
                rh8 rh8Var6 = (rh8) obj2;
                rv4 rv4Var6 = (rv4) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var6.getClass();
                if ((intValue7 & 48) == 0) {
                    if (rv4Var6.f(rh8Var6)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    intValue7 |= i6;
                }
                if ((intValue7 & Token.TARGET) != 144) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var6.U(intValue7 & 1, z7)) {
                    sp4 sp4Var = (sp4) yyaVar4.getValue();
                    ze4 ze4Var4 = pna.c;
                    boolean f16 = rv4Var6.f(vp4Var);
                    Object P13 = rv4Var6.P();
                    if (f16 || P13 == obj5) {
                        P13 = new xt4() { // from class: rp4
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar2 = pvc.a;
                                vp4 vp4Var2 = vp4Var;
                                switch (i12) {
                                    case 0:
                                        String str5 = (String) obj9;
                                        str5.getClass();
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new db(vp4Var2, str5, null, 18));
                                        return pvcVar2;
                                    case 1:
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new up4(vp4Var2, ((Float) obj9).floatValue(), null, 1));
                                        return pvcVar2;
                                    default:
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new up4(vp4Var2, ((Float) obj9).floatValue(), null, 0));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var6.o0(P13);
                    }
                    xt4 xt4Var6 = (xt4) P13;
                    boolean f17 = rv4Var6.f(vp4Var);
                    Object P14 = rv4Var6.P();
                    if (f17 || P14 == obj5) {
                        P14 = new xt4() { // from class: rp4
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar2 = pvc.a;
                                vp4 vp4Var2 = vp4Var;
                                switch (i12) {
                                    case 0:
                                        String str5 = (String) obj9;
                                        str5.getClass();
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new db(vp4Var2, str5, null, 18));
                                        return pvcVar2;
                                    case 1:
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new up4(vp4Var2, ((Float) obj9).floatValue(), null, 1));
                                        return pvcVar2;
                                    default:
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new up4(vp4Var2, ((Float) obj9).floatValue(), null, 0));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var6.o0(P14);
                    }
                    xt4 xt4Var7 = (xt4) P14;
                    boolean f18 = rv4Var6.f(vp4Var);
                    Object P15 = rv4Var6.P();
                    if (f18 || P15 == obj5) {
                        P15 = new xt4() { // from class: rp4
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar2 = pvc.a;
                                vp4 vp4Var2 = vp4Var;
                                switch (i12) {
                                    case 0:
                                        String str5 = (String) obj9;
                                        str5.getClass();
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new db(vp4Var2, str5, null, 18));
                                        return pvcVar2;
                                    case 1:
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new up4(vp4Var2, ((Float) obj9).floatValue(), null, 1));
                                        return pvcVar2;
                                    default:
                                        fdd.g(vp4Var2, jdd.a(vp4Var2), new up4(vp4Var2, ((Float) obj9).floatValue(), null, 0));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var6.o0(P15);
                    }
                    xt4 xt4Var8 = (xt4) P15;
                    boolean f19 = rv4Var6.f(cz7Var3);
                    Object P16 = rv4Var6.P();
                    if (f19 || P16 == obj5) {
                        P16 = new oc3(cz7Var3, 19);
                        rv4Var6.o0(P16);
                    }
                    uwe.b(sp4Var, ze4Var4, rh8Var6, xt4Var6, xt4Var7, xt4Var8, (vt4) P16, rv4Var6, ((intValue7 << 3) & 896) | 48);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                sx6 sx6Var2 = (sx6) obj7;
                cz7 cz7Var4 = (cz7) obj8;
                yya yyaVar5 = (yya) obj6;
                rh8 rh8Var7 = (rh8) obj2;
                ?? r13 = (rv4) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                nk0 nk0Var = kh5.e;
                ((ou0) obj).getClass();
                rh8Var7.getClass();
                if ((intValue8 & 48) == 0) {
                    if (r13.f(rh8Var7)) {
                        i7 = 32;
                    } else {
                        i7 = 16;
                    }
                    intValue8 |= i7;
                }
                int i12 = intValue8;
                if ((i12 & Token.TARGET) != 144) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (r13.U(i12 & 1, z8)) {
                    Object[] objArr = new Object[0];
                    Object P17 = r13.P();
                    if (P17 == obj5) {
                        P17 = new gt6(28);
                        r13.o0(P17);
                    }
                    aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P17, r13, 48);
                    Object[] objArr2 = new Object[0];
                    Object P18 = r13.P();
                    if (P18 == obj5) {
                        P18 = new gt6(29);
                        r13.o0(P18);
                    }
                    aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P18, r13, 48);
                    Object[] objArr3 = new Object[0];
                    Object P19 = r13.P();
                    if (P19 == obj5) {
                        P19 = new qx6(0);
                        r13.o0(P19);
                    }
                    aw7 aw7Var5 = (aw7) zpe.k(objArr3, (vt4) P19, r13, 48);
                    Object P20 = r13.P();
                    if (P20 == obj5) {
                        P20 = s21.e(r13);
                    }
                    zm4 zm4Var = (zm4) P20;
                    ae0 ae0Var = (ae0) r13.j(dy1.d);
                    nq7 y = zbe.y(rte.C(q1d.l(zbe.x(mwe.x(pna.c, 14), rh8Var7), r13, 0), rte.u(r13), 14), 24.0f);
                    xn1 a = wn1.a(lz.d, kh5.I, r13, 6);
                    int hashCode = Long.hashCode(r13.T);
                    xt8 l = r13.l();
                    nq7 p = lye.p(r13, y);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    r13.i0();
                    if (r13.S) {
                        r13.k(zx1Var);
                    } else {
                        r13.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, r13, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, r13, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, r13, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, r13);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, r13, p);
                    String str5 = (String) aw7Var3.getValue();
                    t86 t86Var = new t86(6, 6, Token.HOOK);
                    Object P21 = r13.P();
                    if (P21 == obj5) {
                        P21 = new ox6(zm4Var, 0);
                        r13.o0(P21);
                    }
                    q86 q86Var2 = new q86((xt4) P21, null, 59);
                    v72 v72Var2 = r0f.z(r13).b;
                    kq7 kq7Var = kq7.a;
                    nq7 f20 = pna.f(kq7Var, 1.0f);
                    Object P22 = r13.P();
                    if (P22 == obj5) {
                        q86Var = q86Var2;
                        P22 = new ww6(1);
                        r13.o0(P22);
                    } else {
                        q86Var = q86Var2;
                    }
                    nq7 c = y7a.c(f20, false, (xt4) P22);
                    boolean f21 = r13.f(aw7Var3);
                    Object P23 = r13.P();
                    if (f21 || P23 == obj5) {
                        P23 = new qp4(aw7Var3, 27);
                        r13.o0(P23);
                    }
                    uwe.h(str5, (xt4) P23, c, false, false, null, vve.a, null, vve.b, null, false, null, t86Var, q86Var, true, 0, 0, v72Var2, null, r13, 102236160, 12779520, 6061752);
                    String str6 = (String) nk2.p(kq7Var, 12.0f, r13, aw7Var4);
                    t86 t86Var2 = new t86(7, 7, Token.HOOK);
                    boolean f22 = r13.f(sx6Var2) | r13.f(aw7Var3) | r13.f(aw7Var4);
                    Object P24 = r13.P();
                    if (f22 || P24 == obj5) {
                        P24 = new nq3((Object) sx6Var2, aw7Var3, (Object) aw7Var4, 11);
                        r13.o0(P24);
                    }
                    q86 q86Var3 = new q86((xt4) P24, null, 59);
                    if (((Boolean) aw7Var5.getValue()).booleanValue()) {
                        p1aVar = hq7.T;
                    } else {
                        p1aVar = new Object();
                    }
                    ?? r29 = p1aVar;
                    v72 v72Var3 = r0f.z(r13).b;
                    nq7 f23 = pna.f(kq7Var, 1.0f);
                    Object P25 = r13.P();
                    if (P25 == obj5) {
                        v72Var = v72Var3;
                        P25 = new ww6(2);
                        r13.o0(P25);
                    } else {
                        v72Var = v72Var3;
                    }
                    nq7 n = mwe.n(y7a.c(f23, false, (xt4) P25), zm4Var);
                    boolean f24 = r13.f(aw7Var4);
                    Object P26 = r13.P();
                    if (f24 || P26 == obj5) {
                        P26 = new qp4(aw7Var4, 28);
                        r13.o0(P26);
                    }
                    uwe.h(str6, (xt4) P26, n, false, false, null, vve.c, null, vve.d, jce.E(546009228, new sp0(aw7Var5, 6), r13), false, r29, t86Var2, q86Var3, true, 0, 0, v72Var, null, r13, 907542528, 12779520, 6044856);
                    xbe.i(r13, pna.h(kq7Var, 8.0f));
                    String A = yqe.A((y3b) s2b.o0.getValue(), r13);
                    oyb oybVar = r0f.A(r13).k;
                    long j = r0f.y(r13).a;
                    lk0 lk0Var = kh5.K;
                    l95 l95Var = new l95(lk0Var);
                    boolean f25 = r13.f(cz7Var4);
                    Object P27 = r13.P();
                    if (f25 || P27 == obj5) {
                        P27 = new px6(cz7Var4, 1);
                        r13.o0(P27);
                    }
                    cvb.c(A, lbe.f(15, (vt4) P27, l95Var, null, false), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, r13, 0, 0, 131064);
                    if (((String) nk2.p(kq7Var, 24.0f, r13, aw7Var3)).length() > 0 && ((String) aw7Var4.getValue()).length() > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    nq7 k = tte.k(pna.n(kq7Var, 56.0f), uu9.a);
                    long j2 = r0f.y(r13).a;
                    if (z9) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    nq7 a0 = nmd.v(k, zl1.b(f, j2), lre.g).a0(new l95(lk0Var));
                    boolean h = r13.h(ae0Var) | r13.f(sx6Var2) | r13.f(aw7Var3) | r13.f(aw7Var4);
                    Object P28 = r13.P();
                    if (!h && P28 != obj5) {
                        sx6Var = sx6Var2;
                    } else {
                        sx6Var = sx6Var2;
                        xw0 xw0Var = new xw0((Object) ae0Var, (Object) sx6Var, aw7Var3, (yya) aw7Var4, 10);
                        r13.o0(xw0Var);
                        P28 = xw0Var;
                    }
                    nq7 f26 = lbe.f(14, (vt4) P28, a0, null, z9);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(r13.T);
                    xt8 l2 = r13.l();
                    nq7 p2 = lye.p(r13, f26);
                    r13.i0();
                    if (r13.S) {
                        r13.k(zx1Var);
                    } else {
                        r13.r0();
                    }
                    jce.F(npVar, r13, d);
                    jce.F(npVar2, r13, l2);
                    s21.t(hashCode2, r13, npVar3, r13, kgVar);
                    jce.F(npVar4, r13, p2);
                    boolean z13 = ((rx6) yyaVar5.getValue()).a;
                    pu0 pu0Var = pu0.a;
                    if (z13) {
                        r13.e0(1772838172);
                        eg0.f(pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var), r0f.y(r13).b, null, r13, 0, 4);
                        r13.q(false);
                    } else {
                        r13.e0(1773126441);
                        nk5.a(rp5.c((wk3) jk3.d.getValue(), r13, 0), yqe.A((y3b) x2b.N.getValue(), r13), tte.t(pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var), 180.0f), r0f.y(r13).b, r13, 0, 0);
                        r13.q(false);
                    }
                    r13.q(true);
                    if (sx6Var.f) {
                        s21.w(r13, 1237723920, kq7Var, 24.0f, r13);
                        gv9 a2 = ev9.a(lz.a, kh5.G, r13, 48);
                        int hashCode3 = Long.hashCode(r13.T);
                        xt8 l3 = r13.l();
                        nq7 p3 = lye.p(r13, kq7Var);
                        r13.i0();
                        if (r13.S) {
                            r13.k(zx1Var);
                        } else {
                            r13.r0();
                        }
                        jce.F(npVar, r13, a2);
                        jce.F(npVar2, r13, l3);
                        s21.t(hashCode3, r13, npVar3, r13, kgVar);
                        jce.F(npVar4, r13, p3);
                        if (1.0f <= 0.0d) {
                            jv5.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f2 = Float.MAX_VALUE;
                        } else {
                            f2 = 1.0f;
                        }
                        vqe.m(nae.e, 0, 6, 0L, r13, new we6(f2, true));
                        cvb.c(yqe.A((y3b) x2b.P.getValue(), r13), zbe.A(kq7Var, 12.0f, nae.e, 2), r0f.y(r13).s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(r13).l, r13, 48, 0, 131064);
                        if (1.0f <= 0.0d) {
                            jv5.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f3 = Float.MAX_VALUE;
                        } else {
                            f3 = 1.0f;
                        }
                        vqe.m(nae.e, 0, 6, 0L, r13, new we6(f3, true));
                        rs8.u(r13, true, kq7Var, 24.0f, r13);
                        boolean z14 = !((rx6) yyaVar5.getValue()).b;
                        v72 v72Var4 = r0f.z(r13).b;
                        nq7 h2 = pna.h(pna.f(kq7Var, 1.0f), 52.0f);
                        boolean f27 = r13.f(sx6Var);
                        Object P29 = r13.P();
                        if (f27 || P29 == obj5) {
                            P29 = new u76(sx6Var, 5);
                            r13.o0(P29);
                        }
                        nmd.g((vt4) P29, h2, z14, v72Var4, null, null, null, jce.E(1534829291, new zp1(yyaVar5, 5), r13), r13, 805306416);
                        r13.q(false);
                    } else {
                        r13.e0(1239249988);
                        r13.q(false);
                    }
                    r13.q(true);
                    return pvcVar;
                }
                r13.X();
                return pvcVar;
            case 7:
                do3 do3Var = (do3) obj8;
                iz6 iz6Var = (iz6) obj7;
                yya yyaVar6 = (yya) obj6;
                rh8 rh8Var8 = (rh8) obj2;
                rv4 rv4Var7 = (rv4) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var8.getClass();
                if ((intValue9 & 48) == 0) {
                    if (rv4Var7.f(rh8Var8)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    intValue9 |= i8;
                }
                if ((intValue9 & Token.TARGET) == 144) {
                    z11 = false;
                }
                if (rv4Var7.U(intValue9 & 1, z11)) {
                    if (((hz6) yyaVar6.getValue()).a) {
                        rv4Var7.e0(-658578299);
                        rv4Var7.q(false);
                    } else if (((hz6) yyaVar6.getValue()).b.isEmpty()) {
                        rv4Var7.e0(-658521507);
                        nq7 x3 = zbe.x(pna.c, rh8Var8);
                        boolean f28 = rv4Var7.f(do3Var);
                        Object P30 = rv4Var7.P();
                        if (f28 || P30 == obj5) {
                            P30 = new ez6(do3Var, 0);
                            rv4Var7.o0(P30);
                        }
                        yz1.b(0, (vt4) P30, rv4Var7, x3);
                        rv4Var7.q(false);
                    } else {
                        rv4Var7.e0(-658229301);
                        List list2 = ((hz6) yyaVar6.getValue()).b;
                        ze4 ze4Var5 = pna.c;
                        boolean f29 = rv4Var7.f(do3Var);
                        Object P31 = rv4Var7.P();
                        if (f29 || P31 == obj5) {
                            P31 = new fz6(do3Var, 0);
                            rv4Var7.o0(P31);
                        }
                        mu4 mu4Var = (mu4) P31;
                        boolean f30 = rv4Var7.f(iz6Var);
                        Object P32 = rv4Var7.P();
                        if (f30 || P32 == obj5) {
                            P32 = new fo4(iz6Var, 24);
                            rv4Var7.o0(P32);
                        }
                        yz1.a(list2, rh8Var8, ze4Var5, mu4Var, (xt4) P32, rv4Var7, (intValue9 & Token.ASSIGN_MOD) | 384);
                        rv4Var7.q(false);
                    }
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 8:
                yya yyaVar7 = (yya) obj7;
                t58 t58Var = (t58) obj6;
                cz7 cz7Var5 = (cz7) obj8;
                rh8 rh8Var9 = (rh8) obj2;
                rv4 rv4Var8 = (rv4) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var9.getClass();
                if ((intValue10 & 48) == 0) {
                    if (rv4Var8.f(rh8Var9)) {
                        i9 = 32;
                    } else {
                        i9 = 16;
                    }
                    intValue10 |= i9;
                }
                if ((intValue10 & Token.TARGET) != 144) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var8.U(intValue10 & 1, z10)) {
                    if (((q58) yyaVar7.getValue()).a) {
                        rv4Var8.e0(-1447256382);
                        cbe.d(zbe.z(zbe.x(pna.c, rh8Var9), 12.0f, 12.0f), rv4Var8, 0);
                        rv4Var8.q(false);
                    } else if (((q58) yyaVar7.getValue()).b.isEmpty()) {
                        rv4Var8.e0(-1446986248);
                        jxe.d(owe.D(rv4Var8), yqe.A((y3b) o2b.y0.getValue(), rv4Var8), null, zbe.x(pna.c, rh8Var9), null, null, rv4Var8, 0, 52);
                        rv4Var8.q(false);
                    } else {
                        rv4Var8.e0(-1446629934);
                        hz hzVar = new hz(8.0f, true, new vs(2));
                        bkd r2 = mwe.r(rh8Var9, zbe.h(2, 12.0f));
                        ze4 ze4Var6 = pna.c;
                        boolean f31 = rv4Var8.f(yyaVar7) | rv4Var8.f(t58Var) | rv4Var8.f(cz7Var5);
                        Object P33 = rv4Var8.P();
                        if (f31 || P33 == obj5) {
                            P33 = new nq3(21, yyaVar7, t58Var, cz7Var5);
                            rv4Var8.o0(P33);
                        }
                        jce.d(ze4Var6, null, r2, false, hzVar, null, null, false, null, (xt4) P33, rv4Var8, 24582, 490);
                        rv4Var8.q(false);
                    }
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 9:
                return b(obj, obj2, obj3, obj4);
            case 10:
                return e(obj, obj2, obj3, obj4);
            case 11:
                return f(obj, obj2, obj3, obj4);
            case 12:
                return g(obj, obj2, obj3, obj4);
            case 13:
                return m(obj, obj2, obj3, obj4);
            case 14:
                return n(obj, obj2, obj3, obj4);
            case 15:
                return o(obj, obj2, obj3, obj4);
            case 16:
                return p(obj, obj2, obj3, obj4);
            case 17:
                return q(obj, obj2, obj3, obj4);
            case 18:
                return r(obj, obj2, obj3, obj4);
            case 19:
                return s(obj, obj2, obj3, obj4);
            case 20:
                return t(obj, obj2, obj3, obj4);
            case 21:
                return u(obj, obj2, obj3, obj4);
            case 22:
                return v(obj, obj2, obj3, obj4);
            case 23:
                return w(obj, obj2, obj3, obj4);
            case 24:
                String str7 = (String) obj8;
                List list3 = (List) obj7;
                xt4 xt4Var9 = (xt4) obj6;
                int intValue11 = ((Integer) obj2).intValue();
                rv4 rv4Var9 = (rv4) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                ((jj8) obj).getClass();
                if ((intValue12 & 48) == 0) {
                    if (rv4Var9.d(intValue11)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    intValue12 |= i10;
                }
                if ((intValue12 & Token.TARGET) != 144) {
                    z12 = true;
                }
                if (rv4Var9.U(intValue12 & 1, z12)) {
                    eg0.m(str7, ((pad) list3.get(intValue11)).b, xt4Var9, pna.c, rv4Var9, 3072);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 25:
                return a(obj, obj2, obj3, obj4);
            default:
                web webVar = (web) obj8;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                ((aw7) obj7).setValue(Boolean.FALSE);
                cs9 cs9Var = ((xeb) ((aw7) obj6).getValue()).n;
                cs9Var.getClass();
                hk1 a3 = jdd.a(webVar);
                sw2 sw2Var = ab3.a;
                webVar.f(a3, ru2.c, new ueb(webVar, booleanValue, booleanValue2, booleanValue3, booleanValue4, cs9Var, null));
                return pvcVar;
        }
    }

    public /* synthetic */ cs1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ cs1(fdd fddVar, cz7 cz7Var, aw7 aw7Var, int i) {
        this.a = i;
        this.c = fddVar;
        this.b = cz7Var;
        this.d = aw7Var;
    }
}
