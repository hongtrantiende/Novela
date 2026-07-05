package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i31  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class i31 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i31(ps psVar, oyb oybVar, nq7 nq7Var, xt4 xt4Var) {
        this.a = 24;
        this.c = psVar;
        this.e = oybVar;
        this.b = nq7Var;
        this.d = xt4Var;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        oue.e((d84) this.c, (c84) this.e, (nq7) this.b, (lu4) this.d, (rv4) obj, xoe.p(449));
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    private final Object b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        long b;
        long b2;
        long b3;
        boolean z3;
        long g;
        String[] strArr = (String[]) this.b;
        rj8 rj8Var = (rj8) this.c;
        xt4 xt4Var = (xt4) this.e;
        Integer[] numArr = (Integer[]) this.d;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        ?? r7 = 1;
        boolean z4 = false;
        int i = 2;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            int i2 = 0;
            while (i2 < i) {
                if (rj8Var.k() == i2) {
                    z2 = r7;
                } else {
                    z2 = z4;
                }
                su9 su9Var = uu9.a;
                kq7 kq7Var = kq7.a;
                nq7 k = tte.k(kq7Var, su9Var);
                if (z2) {
                    rv4Var.e0(1981622306);
                    b = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
                    rv4Var.q(z4);
                } else {
                    rv4Var.e0(1981746151);
                    b = zl1.b(nae.e, ((h27) rv4Var.j(j27.a)).a.p);
                    rv4Var.q(z4);
                }
                ba5 ba5Var = lre.g;
                nq7 z5 = zbe.z(nmd.v(k, b, ba5Var), 14.0f, 8.0f);
                boolean f = rv4Var.f(xt4Var) | rv4Var.d(i2);
                Object P = rv4Var.P();
                if (f || P == ax1.a) {
                    P = new tp0(xt4Var, i2, i);
                    rv4Var.o0(P);
                }
                nq7 t = q1d.t(r7, (vt4) P, rv4Var, z5, z4);
                gv9 a = ev9.a(lz.a, kh5.G, rv4Var, 48);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, t);
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
                String str = strArr[i2];
                oyb oybVar = r0f.A(rv4Var).j;
                dq4 dq4Var = dq4.f;
                if (z2) {
                    rv4Var.e0(1453729468);
                    b2 = r0f.y(rv4Var).a;
                    rv4Var.q(z4);
                } else {
                    rv4Var.e0(1453824390);
                    b2 = zl1.b(0.78f, r0f.y(rv4Var).q);
                    rv4Var.q(z4);
                }
                int i3 = i2;
                rv4 rv4Var2 = rv4Var;
                Integer[] numArr2 = numArr;
                rj8 rj8Var2 = rj8Var;
                xt4 xt4Var2 = xt4Var;
                String[] strArr2 = strArr;
                cvb.c(str, null, b2, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 1572864, 0, 131002);
                xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
                String valueOf = String.valueOf(numArr2[i3].intValue());
                if (z2) {
                    rv4Var2.e0(1454147100);
                    b3 = r0f.y(rv4Var2).a;
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(1454242022);
                    b3 = zl1.b(0.78f, r0f.y(rv4Var2).q);
                    rv4Var2.q(false);
                }
                long j = b3;
                oyb oybVar2 = r0f.A(rv4Var2).o;
                nq7 k2 = tte.k(kq7Var, su9Var);
                if (z2) {
                    rv4Var2.e0(1454601560);
                    g = zl1.b(0.14f, r0f.y(rv4Var2).a);
                    z3 = false;
                    rv4Var2.q(false);
                } else {
                    z3 = false;
                    rv4Var2.e0(1454731574);
                    g = rm1.g(r0f.y(rv4Var2), 8.0f);
                    rv4Var2.q(false);
                }
                cvb.c(valueOf, zbe.z(nmd.v(k2, g, ba5Var), 8.0f, 3.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var2, 0, 0, 131064);
                rv4Var = rv4Var2;
                rv4Var.q(true);
                i2 = i3 + 1;
                r7 = 1;
                z4 = z3;
                strArr = strArr2;
                rj8Var = rj8Var2;
                xt4Var = xt4Var2;
                i = 2;
                numArr = numArr2;
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        qwe.d((qn4) this.c, (nq7) this.b, (vt4) this.e, (xt4) this.d, (rv4) obj, xoe.p(1));
        return pvc.a;
    }

    private final Object f(Object obj, Object obj2) {
        nu4 nu4Var = (nu4) this.b;
        vl9 vl9Var = (vl9) this.c;
        vl9 vl9Var2 = (vl9) this.e;
        zl9 zl9Var = (zl9) this.d;
        r09 r09Var = (r09) obj;
        if (((Boolean) obj2).booleanValue()) {
            float p = w9e.p(r09Var);
            List list = r09Var.a;
            long n = w9e.n(r09Var);
            if (p != 1.0f || !y78.d(n, 0L)) {
                if (((Boolean) nu4Var.h(new y78(w9e.l(r09Var, true)), new y78(n), Float.valueOf(p), Long.valueOf(((z09) list.get(0)).b))).booleanValue()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        z09 z09Var = (z09) list.get(i);
                        if (ie2.A(z09Var)) {
                            z09Var.a();
                        }
                    }
                }
            }
            vl9Var.a = true;
        }
        List list2 = r09Var.a;
        if (list2.size() > 1) {
            vl9Var2.a = true;
        }
        zl9Var.a = list2.get(0);
        return true;
    }

    private final Object g(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        aze.b((uv0) this.c, (nq7) this.b, (vt4) this.e, (vt4) this.d, (rv4) obj, xoe.p(1));
        return pvc.a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        uaf.j((fa7) this.c, (nq7) this.b, (xt4) this.e, (xt4) this.d, (rv4) obj, xoe.p(1));
        return pvc.a;
    }

    private final Object n(Object obj, Object obj2) {
        boolean z;
        ps psVar = (ps) this.c;
        oyb oybVar = (oyb) this.e;
        nq7 nq7Var = (nq7) this.b;
        xt4 xt4Var = (xt4) this.d;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            hud.c(psVar, false, oyb.a(oybVar, 0L, 0L, null, null, null, 0L, null, 0, e4c.c, null, 16646143), 5, 0, 0, 0, nq7Var, null, xt4Var, null, rv4Var, 0, 1394);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object o(Object obj, Object obj2) {
        boolean z;
        mv mvVar = (mv) this.b;
        String str = (String) this.c;
        xt4 xt4Var = (xt4) this.e;
        xt4 xt4Var2 = (xt4) this.d;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            boolean f = rv4Var.f(xt4Var) | rv4Var.f(xt4Var2);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new xw1(xt4Var, xt4Var2, 2);
                rv4Var.o0(P);
            }
            c16.a(mvVar, str, (xt4) P, zbe.x(pna.f(kq7.a, 1.0f), mwe.f(13, rv4Var, false)), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object p(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        c16.a((mv) this.c, (String) this.e, (xt4) this.d, (nq7) this.b, (rv4) obj, xoe.p(1));
        return pvc.a;
    }

    private final Object q(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        k27.j((v8b) this.c, (nq7) this.b, (xt4) this.e, (xt4) this.d, (rv4) obj, xoe.p(49));
        return pvc.a;
    }

    private final Object r(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        dae.b((ar5) this.c, (String) this.e, (nq7) this.b, (vt4) this.d, (rv4) obj, xoe.p(1));
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v143 */
    /* JADX WARN: Type inference failed for: r37v3, types: [java.lang.Object, qid] */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        pb2 pb2Var;
        String str;
        ez ezVar;
        boolean contains;
        qra qraVar;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ez ezVar2;
        float f;
        float f2;
        ?? r2;
        int i2 = this.a;
        ez ezVar3 = lz.c;
        kq7 kq7Var = kq7.a;
        Object obj3 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.b;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                nq7 nq7Var = (nq7) obj6;
                cz7 cz7Var = (cz7) obj7;
                w91 w91Var = (w91) obj5;
                yya yyaVar = (yya) obj4;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, nq7Var);
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
                    if (((t91) yyaVar.getValue()).a) {
                        rv4Var.e0(-286938081);
                        String str2 = ((t91) yyaVar.getValue()).c;
                        nq7 y = zbe.y(pna.c, 24.0f);
                        boolean f3 = rv4Var.f(cz7Var);
                        Object P = rv4Var.P();
                        if (f3 || P == obj3) {
                            P = new n7(cz7Var, 6);
                            rv4Var.o0(P);
                        }
                        nae.b(48, (vt4) P, rv4Var, y, str2);
                        rv4Var.q(false);
                    } else if (((t91) yyaVar.getValue()).d) {
                        rv4Var.e0(-286537003);
                        String str3 = ((t91) yyaVar.getValue()).e;
                        nq7 y2 = zbe.y(pna.c, 24.0f);
                        Object P2 = rv4Var.P();
                        if (P2 == obj3) {
                            P2 = new cd1(15);
                            rv4Var.o0(P2);
                        }
                        nae.a(432, (vt4) P2, rv4Var, y2, str3);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-286235280);
                        jye.c(w91Var, cz7Var, pna.c, rv4Var, 384);
                        rv4Var.q(false);
                    }
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                nq7 nq7Var2 = (nq7) obj6;
                cz7 cz7Var2 = (cz7) obj7;
                op1 op1Var = (op1) obj5;
                yya yyaVar2 = (yya) obj4;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, nq7Var2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d2);
                    jce.F(qw1.e, rv4Var2, l2);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p2);
                    if (((mp1) yyaVar2.getValue()).a) {
                        rv4Var2.e0(-173252933);
                        String str4 = ((mp1) yyaVar2.getValue()).c;
                        nq7 y3 = zbe.y(pna.c, 24.0f);
                        boolean f4 = rv4Var2.f(cz7Var2);
                        Object P3 = rv4Var2.P();
                        if (f4 || P3 == obj3) {
                            P3 = new n7(cz7Var2, 13);
                            rv4Var2.o0(P3);
                        }
                        zbe.c(48, (vt4) P3, rv4Var2, y3, str4);
                        rv4Var2.q(false);
                    } else if (((mp1) yyaVar2.getValue()).d) {
                        rv4Var2.e0(-172843671);
                        String str5 = ((mp1) yyaVar2.getValue()).e;
                        nq7 y4 = zbe.y(pna.c, 24.0f);
                        Object P4 = rv4Var2.P();
                        if (P4 == obj3) {
                            i = 15;
                            P4 = new cd1(15);
                            rv4Var2.o0(P4);
                        } else {
                            i = 15;
                        }
                        vt4 vt4Var = (vt4) P4;
                        Object P5 = rv4Var2.P();
                        if (P5 == obj3) {
                            P5 = new cd1(i);
                            rv4Var2.o0(P5);
                        }
                        zbe.b(3504, vt4Var, (vt4) P5, rv4Var2, y4, str5);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(-172468912);
                        jye.c(op1Var, cz7Var2, pna.c, rv4Var2, 384);
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                cz7 cz7Var3 = (cz7) obj7;
                l93 l93Var = (l93) obj6;
                yya yyaVar3 = (yya) obj4;
                yya yyaVar4 = (yya) obj5;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    boolean z14 = ((y0d) yyaVar3.getValue()).i;
                    l54 l54Var = ((i93) yyaVar4.getValue()).b;
                    l54Var.getClass();
                    ze4 ze4Var = pna.c;
                    boolean f5 = rv4Var3.f(l93Var);
                    Object P6 = rv4Var3.P();
                    if (f5 || P6 == obj3) {
                        P6 = new cq2(l93Var, 9);
                        rv4Var3.o0(P6);
                    }
                    vqe.f(z14, l54Var, cz7Var3, ze4Var, (xt4) P6, rv4Var3, 3072);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                aw7 aw7Var = (aw7) obj6;
                aw7 aw7Var2 = (aw7) obj7;
                aw7 aw7Var3 = (aw7) obj5;
                tu1 tu1Var = (tu1) obj4;
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    ze4 ze4Var2 = pna.c;
                    if (((Boolean) aw7Var2.getValue()).booleanValue() && ((Boolean) aw7Var3.getValue()).booleanValue()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Object P7 = rv4Var4.P();
                    if (P7 == obj3) {
                        P7 = s21.g(rv4Var4);
                    }
                    yu7 yu7Var = (yu7) P7;
                    boolean f6 = rv4Var4.f(aw7Var);
                    Object P8 = rv4Var4.P();
                    if (f6 || P8 == obj3) {
                        P8 = new ea4(aw7Var, 1);
                        rv4Var4.o0(P8);
                    }
                    hc2.b(lbe.e(ze4Var2, yu7Var, null, z5, null, (vt4) P8, 24), null, jce.E(-1360994763, new z0a(tu1Var, 2), rv4Var4), rv4Var4, 3072, 6);
                    boolean f7 = rv4Var4.f(aw7Var2) | rv4Var4.f(aw7Var);
                    Object P9 = rv4Var4.P();
                    if (f7 || P9 == obj3) {
                        P9 = new he1(aw7Var2, aw7Var, 4);
                        rv4Var4.o0(P9);
                    }
                    sf0.a(false, (vt4) P9, rv4Var4, 0, 1);
                    boolean f8 = rv4Var4.f(aw7Var2) | rv4Var4.f(aw7Var);
                    Object P10 = rv4Var4.P();
                    if (f8 || P10 == obj3) {
                        P10 = new y74(3, aw7Var2, aw7Var);
                        rv4Var4.o0(P10);
                    }
                    cae.d(false, (xt4) P10, rv4Var4, 0, 1);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                String str6 = (String) obj6;
                String str7 = (String) obj7;
                xt4 xt4Var = (xt4) obj5;
                lu4 lu4Var = (lu4) obj4;
                rv4 rv4Var5 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z6)) {
                    boolean f9 = rv4Var5.f(str6);
                    Object P11 = rv4Var5.P();
                    if (f9 || P11 == obj3) {
                        P11 = new v85(str6, 9);
                        rv4Var5.o0(P11);
                    }
                    vt4 vt4Var2 = (vt4) P11;
                    sdd a = kv6.a(rv4Var5);
                    if (a != null) {
                        if (a instanceof y35) {
                            pb2Var = ((y35) a).f();
                        } else {
                            pb2Var = ob2.b;
                        }
                        pb2 pb2Var2 = pb2Var;
                        q0a a2 = o96.a(rv4Var5);
                        gi1 a3 = cm9.a(pq0.class);
                        qdd i3 = a.i();
                        if (str6 != null) {
                            str = eub.o(a3.f(), "-", str6);
                        } else {
                            str = null;
                        }
                        pq0 pq0Var = (pq0) ((fdd) voe.z(a3, i3, str, pb2Var2, a2, vt4Var2));
                        aw7 z15 = jsc.z(pq0Var.e, rv4Var5);
                        Object P12 = rv4Var5.P();
                        if (P12 == obj3) {
                            P12 = new qra();
                            rv4Var5.o0(P12);
                        }
                        qra qraVar2 = (qra) P12;
                        Object P13 = rv4Var5.P();
                        if (P13 == obj3) {
                            ezVar = ezVar3;
                            P13 = yae.z(new jub((String) null, 0L, 7));
                            rv4Var5.o0(P13);
                        } else {
                            ezVar = ezVar3;
                        }
                        aw7 aw7Var4 = (aw7) P13;
                        boolean f10 = rv4Var5.f(((oq0) z15.getValue()).a) | rv4Var5.f(qraVar2.d().c);
                        Object P14 = rv4Var5.P();
                        Object obj8 = P14;
                        if (f10 || P14 == obj3) {
                            List list = ((oq0) z15.getValue()).a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj9 : list) {
                                vl6 vl6Var = (vl6) obj9;
                                Boolean bool = (Boolean) qraVar2.get(vl6Var.a);
                                if (bool != null) {
                                    contains = bool.booleanValue();
                                } else {
                                    contains = vl6Var.g.contains(str6);
                                }
                                if (contains) {
                                    arrayList.add(obj9);
                                }
                            }
                            rv4Var5.o0(arrayList);
                            obj8 = arrayList;
                        }
                        List list2 = (List) obj8;
                        boolean f11 = rv4Var5.f(qraVar2.d().c);
                        Object P15 = rv4Var5.P();
                        if (f11 || P15 == obj3) {
                            P15 = Boolean.valueOf(!qraVar2.isEmpty());
                            rv4Var5.o0(P15);
                        }
                        boolean booleanValue = ((Boolean) P15).booleanValue();
                        ze4 ze4Var3 = pna.c;
                        nq7 x = mwe.x(ze4Var3, 15);
                        xn1 a4 = wn1.a(ezVar, kh5.I, rv4Var5, 0);
                        int hashCode3 = Long.hashCode(rv4Var5.T);
                        xt8 l3 = rv4Var5.l();
                        nq7 p3 = lye.p(rv4Var5, x);
                        rw1.k.getClass();
                        vt4 vt4Var3 = qw1.b;
                        rv4Var5.i0();
                        if (rv4Var5.S) {
                            rv4Var5.k(vt4Var3);
                        } else {
                            rv4Var5.r0();
                        }
                        np npVar = qw1.f;
                        jce.F(npVar, rv4Var5, a4);
                        np npVar2 = qw1.e;
                        jce.F(npVar2, rv4Var5, l3);
                        Integer valueOf = Integer.valueOf(hashCode3);
                        np npVar3 = qw1.g;
                        jce.F(npVar3, rv4Var5, valueOf);
                        kg kgVar = qw1.h;
                        jce.C(kgVar, rv4Var5);
                        np npVar4 = qw1.d;
                        jce.F(npVar4, rv4Var5, p3);
                        th8 th8Var = yfc.a;
                        vv.d(jce.E(-1214468451, new jd1(str7, 10), rv4Var5), null, jce.E(249882459, new id1(xt4Var, 9, (byte) 0), rv4Var5), null, nae.e, new Object(), yfc.d(zl1.h, 0L, rv4Var5, 62), null, null, rv4Var5, 390, 410);
                        jub jubVar = (jub) aw7Var4.getValue();
                        String A = yqe.A((y3b) b3b.P.getValue(), rv4Var5);
                        f99 f99Var = j27.a;
                        long g = rm1.g(((h27) rv4Var5.j(f99Var)).a, 6.0f);
                        nq7 z16 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 4.0f);
                        boolean f12 = rv4Var5.f(pq0Var);
                        Object P16 = rv4Var5.P();
                        if (f12 || P16 == obj3) {
                            P16 = new j34(26, pq0Var, aw7Var4);
                            rv4Var5.o0(P16);
                        }
                        xxe.m(jubVar, A, 0L, g, null, null, z16, null, (xt4) P16, null, rv4Var5, 1572864, 692);
                        if (((oq0) z15.getValue()).b) {
                            rv4Var5.e0(-1436741921);
                            rv4Var5.q(false);
                        } else if (((oq0) z15.getValue()).a.isEmpty()) {
                            rv4Var5.e0(-1436676759);
                            b37 d3 = fu0.d(kh5.e, false);
                            int hashCode4 = Long.hashCode(rv4Var5.T);
                            xt8 l4 = rv4Var5.l();
                            nq7 p4 = lye.p(rv4Var5, ze4Var3);
                            rv4Var5.i0();
                            if (rv4Var5.S) {
                                rv4Var5.k(vt4Var3);
                            } else {
                                rv4Var5.r0();
                            }
                            jce.F(npVar, rv4Var5, d3);
                            jce.F(npVar2, rv4Var5, l4);
                            s21.t(hashCode4, rv4Var5, npVar3, rv4Var5, kgVar);
                            jce.F(npVar4, rv4Var5, p4);
                            cvb.c(yqe.A((y3b) o2b.l0.getValue(), rv4Var5), null, ((h27) rv4Var5.j(f99Var)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var5.j(f99Var)).b.j, rv4Var5, 0, 0, 131066);
                            rv4Var5.q(true);
                            rv4Var5.q(false);
                        } else {
                            rv4Var5.e0(-1436039244);
                            qg6 a5 = tg6.a(0, 3, rv4Var5);
                            f25 f25Var = new f25(100.0f);
                            nq7 b = zn1.b(zbe.y(kq7Var, 12.0f), 1.0f);
                            hz hzVar = new hz(8.0f, true, new vs(2));
                            hz hzVar2 = new hz(8.0f, true, new vs(2));
                            boolean f13 = rv4Var5.f(z15) | rv4Var5.f(str6);
                            Object P17 = rv4Var5.P();
                            if (!f13 && P17 != obj3) {
                                qraVar = qraVar2;
                            } else {
                                qraVar = qraVar2;
                                P17 = new nq3(14, z15, qraVar, str6);
                                rv4Var5.o0(P17);
                            }
                            ade.e(f25Var, b, a5, null, hzVar2, hzVar, null, false, null, (xt4) P17, rv4Var5, 1769472, 0, 920);
                            boolean f14 = rv4Var5.f(pq0Var);
                            Object P18 = rv4Var5.P();
                            if (f14 || P18 == obj3) {
                                P18 = new v7(0, pq0Var, pq0.class, "loadMore", "loadMore()V", 0, 26);
                                rv4Var5.o0(P18);
                            }
                            ej6.b(a5, 10, (vt4) ((i76) P18), rv4Var5, 48, 0);
                            rte.e(!list2.isEmpty(), null, zt3.e(13), zt3.p(13), null, jce.E(-1651587206, new wd7(list2, booleanValue, lu4Var, xt4Var, qraVar), rv4Var5), rv4Var5, 1600518, 18);
                            rv4Var5.q(false);
                        }
                        rv4Var5.q(true);
                        return pvcVar;
                    }
                    vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                rv4Var5.X();
                return pvcVar;
            case 5:
                List list3 = (List) obj6;
                ho5 ho5Var = (ho5) obj7;
                xt4 xt4Var2 = (xt4) obj5;
                xt4 xt4Var3 = (xt4) obj4;
                rv4 rv4Var6 = (rv4) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z7)) {
                    o28.c(list3, ho5Var, mwe.g(8, rv4Var6), pna.c, xt4Var2, xt4Var3, rv4Var6, 3072);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                List list4 = (List) obj6;
                xt4 xt4Var4 = (xt4) obj7;
                xt4 xt4Var5 = (xt4) obj5;
                xt4 xt4Var6 = (xt4) obj4;
                rv4 rv4Var7 = (rv4) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z8)) {
                    xxe.n(list4, mwe.g(8, rv4Var7), pna.c, xt4Var4, xt4Var5, xt4Var6, rv4Var7, 384);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                nq7 nq7Var3 = (nq7) obj6;
                iaa iaaVar = (iaa) obj5;
                cz7 cz7Var4 = (cz7) obj7;
                yya yyaVar5 = (yya) obj4;
                rv4 rv4Var8 = (rv4) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var8.U(intValue8 & 1, z9)) {
                    nq7 v = nmd.v(nq7Var3, ((h27) rv4Var8.j(j27.a)).a.p, lre.g);
                    b37 d4 = fu0.d(kh5.a, false);
                    int hashCode5 = Long.hashCode(rv4Var8.T);
                    xt8 l5 = rv4Var8.l();
                    nq7 p5 = lye.p(rv4Var8, v);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var8.i0();
                    if (rv4Var8.S) {
                        rv4Var8.k(zx1Var3);
                    } else {
                        rv4Var8.r0();
                    }
                    jce.F(qw1.f, rv4Var8, d4);
                    jce.F(qw1.e, rv4Var8, l5);
                    jce.F(qw1.g, rv4Var8, Integer.valueOf(hashCode5));
                    jce.C(qw1.h, rv4Var8);
                    jce.F(qw1.d, rv4Var8, p5);
                    if (((fbd) yyaVar5.getValue()).b) {
                        rv4Var8.e0(1975960270);
                        String str8 = ((fbd) yyaVar5.getValue()).c;
                        boolean f15 = rv4Var8.f(iaaVar);
                        Object P19 = rv4Var8.P();
                        if (f15 || P19 == obj3) {
                            P19 = new yw7(0, iaaVar, iaa.class, "refreshCurrentEpisode", "refreshCurrentEpisode()V", 0, 24);
                            rv4Var8.o0(P19);
                        }
                        n4f.e(384, (vt4) ((i76) P19), rv4Var8, pna.c, str8);
                        rv4Var8.q(false);
                    } else {
                        rv4Var8.e0(1976248942);
                        pc2.g(iaaVar, cz7Var4, pna.c, rv4Var8, 384);
                        rv4Var8.q(false);
                    }
                    rv4Var8.q(true);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                nq7 nq7Var4 = (nq7) obj6;
                cz7 cz7Var5 = (cz7) obj7;
                erd erdVar = (erd) obj5;
                yya yyaVar6 = (yya) obj4;
                rv4 rv4Var9 = (rv4) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var9.U(intValue9 & 1, z10)) {
                    b37 d5 = fu0.d(kh5.a, false);
                    int hashCode6 = Long.hashCode(rv4Var9.T);
                    xt8 l6 = rv4Var9.l();
                    nq7 p6 = lye.p(rv4Var9, nq7Var4);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var9.i0();
                    if (rv4Var9.S) {
                        rv4Var9.k(zx1Var4);
                    } else {
                        rv4Var9.r0();
                    }
                    jce.F(qw1.f, rv4Var9, d5);
                    jce.F(qw1.e, rv4Var9, l6);
                    jce.F(qw1.g, rv4Var9, Integer.valueOf(hashCode6));
                    jce.C(qw1.h, rv4Var9);
                    jce.F(qw1.d, rv4Var9, p6);
                    if (((kqd) yyaVar6.getValue()).a) {
                        rv4Var9.e0(-1839245319);
                        String str9 = ((kqd) yyaVar6.getValue()).c;
                        nq7 y5 = zbe.y(pna.c, 24.0f);
                        boolean f16 = rv4Var9.f(cz7Var5);
                        Object P20 = rv4Var9.P();
                        if (f16 || P20 == obj3) {
                            P20 = new qhb(cz7Var5, 26);
                            rv4Var9.o0(P20);
                        }
                        nq2.r(48, (vt4) P20, rv4Var9, y5, str9);
                        rv4Var9.q(false);
                    } else if (((kqd) yyaVar6.getValue()).d) {
                        rv4Var9.e0(-1838844241);
                        String str10 = ((kqd) yyaVar6.getValue()).e;
                        nq7 y6 = zbe.y(pna.c, 24.0f);
                        Object P21 = rv4Var9.P();
                        if (P21 == obj3) {
                            P21 = new cd1(15);
                            rv4Var9.o0(P21);
                        }
                        nq2.q(432, (vt4) P21, rv4Var9, y6, str10);
                        rv4Var9.q(false);
                    } else {
                        rv4Var9.e0(-1838542518);
                        jye.c(erdVar, cz7Var5, pna.c, rv4Var9, 384);
                        rv4Var9.q(false);
                    }
                    rv4Var9.q(true);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                ((Integer) obj2).getClass();
                ha0.a((ja0) obj7, (h2a) obj5, (nq7) obj6, (xt4) obj4, (rv4) obj, xoe.p(385));
                return pvcVar;
            case 10:
                kj6 kj6Var = (kj6) obj6;
                ud0 ud0Var = (ud0) obj7;
                sk1 sk1Var = (sk1) obj5;
                aw7 aw7Var5 = (aw7) obj4;
                rv4 rv4Var10 = (rv4) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var10.U(intValue10 & 1, z11)) {
                    nq7 y7 = zbe.y(kq7Var, 2.0f);
                    boolean h = rv4Var10.h(ud0Var) | rv4Var10.f(sk1Var);
                    Object P22 = rv4Var10.P();
                    if (h || P22 == obj3) {
                        P22 = new r7(2, ud0Var, sk1Var, aw7Var5);
                        rv4Var10.o0(P22);
                    }
                    jce.d(y7, kj6Var, null, false, null, null, null, false, null, (xt4) P22, rv4Var10, 6, 508);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 11:
                nq7 nq7Var5 = (nq7) obj6;
                aw7 aw7Var6 = (aw7) obj7;
                tu1 tu1Var2 = (tu1) obj5;
                vi0 vi0Var = (vi0) obj4;
                rv4 rv4Var11 = (rv4) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rv4Var11.U(intValue11 & 1, z12)) {
                    Object P23 = rv4Var11.P();
                    if (P23 == obj3) {
                        P23 = new s7(aw7Var6, 5);
                        rv4Var11.o0(P23);
                    }
                    nq7 y8 = obe.y(nq7Var5, (xt4) P23);
                    b37 d6 = fu0.d(kh5.a, true);
                    int hashCode7 = Long.hashCode(rv4Var11.T);
                    xt8 l7 = rv4Var11.l();
                    nq7 p7 = lye.p(rv4Var11, y8);
                    rw1.k.getClass();
                    zx1 zx1Var5 = qw1.b;
                    rv4Var11.i0();
                    if (rv4Var11.S) {
                        rv4Var11.k(zx1Var5);
                    } else {
                        rv4Var11.r0();
                    }
                    jce.F(qw1.f, rv4Var11, d6);
                    jce.F(qw1.e, rv4Var11, l7);
                    jce.F(qw1.g, rv4Var11, Integer.valueOf(hashCode7));
                    jce.C(qw1.h, rv4Var11);
                    jce.F(qw1.d, rv4Var11, p7);
                    tu1Var2.invoke(rv4Var11, 0);
                    Object P24 = rv4Var11.P();
                    if (P24 == obj3) {
                        P24 = new en(aw7Var6, 6);
                        rv4Var11.o0(P24);
                    }
                    vi0Var.b((vt4) P24, rv4Var11, 6);
                    rv4Var11.q(true);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            case 12:
                ((Integer) obj2).getClass();
                v9e.d((tq0) obj7, (nq7) obj6, (vt4) obj5, (vt4) obj4, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 13:
                ((Integer) obj2).getClass();
                yf2.a((List) obj7, (List) obj5, (nq7) obj6, (xt4) obj4, (rv4) obj, xoe.p(385));
                return pvcVar;
            case 14:
                ((Integer) obj2).getClass();
                bbe.c((cz7) obj7, (rh8) obj5, (bkd) obj4, (nq7) obj6, (rv4) obj, xoe.p(3073));
                return pvcVar;
            case 15:
                ((Integer) obj2).getClass();
                i62.e((vt4) obj6, (List) obj7, (wc2) obj5, (xt4) obj4, (rv4) obj, xoe.p(7));
                return pvcVar;
            case 16:
                ((Integer) obj2).getClass();
                fre.e((n93) obj7, (nq7) obj6, (vt4) obj5, (lu4) obj4, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 17:
                lu4 lu4Var2 = (lu4) obj6;
                Boolean bool2 = (Boolean) obj7;
                tu1 tu1Var3 = (tu1) obj5;
                lu4 lu4Var3 = (lu4) obj4;
                rv4 rv4Var12 = (rv4) obj;
                int intValue12 = ((Integer) obj2).intValue();
                nk0 nk0Var = kh5.d;
                if ((intValue12 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (rv4Var12.U(intValue12 & 1, z13)) {
                    pu0 pu0Var = pu0.a;
                    if (lu4Var2 != null) {
                        rv4Var12.e0(-391603129);
                        nq7 a6 = pu0Var.a(kq7Var, nk0Var);
                        b37 d7 = fu0.d(kh5.a, false);
                        ezVar2 = ezVar3;
                        int hashCode8 = Long.hashCode(rv4Var12.T);
                        xt8 l8 = rv4Var12.l();
                        nq7 p8 = lye.p(rv4Var12, a6);
                        rw1.k.getClass();
                        zx1 zx1Var6 = qw1.b;
                        rv4Var12.i0();
                        if (rv4Var12.S) {
                            rv4Var12.k(zx1Var6);
                        } else {
                            rv4Var12.r0();
                        }
                        jce.F(qw1.f, rv4Var12, d7);
                        jce.F(qw1.e, rv4Var12, l8);
                        jce.F(qw1.g, rv4Var12, Integer.valueOf(hashCode8));
                        jce.C(qw1.h, rv4Var12);
                        jce.F(qw1.d, rv4Var12, p8);
                        lu4Var2.invoke(rv4Var12, 0);
                        rv4Var12.q(true);
                        rv4Var12.q(false);
                    } else {
                        ezVar2 = ezVar3;
                        rv4Var12.e0(-391476277);
                        rv4Var12.q(false);
                    }
                    nq7 f17 = pna.f(kq7Var, 1.0f);
                    if (lu4Var2 == null) {
                        f = 0.0f;
                    } else {
                        f = 34.0f;
                    }
                    if (bool2 == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = 24.0f;
                    }
                    nq7 a7 = pu0Var.a(zbe.C(f17, f, nae.e, f2, nae.e, 10), nk0Var);
                    xn1 a8 = wn1.a(ezVar2, kh5.I, rv4Var12, 0);
                    int hashCode9 = Long.hashCode(rv4Var12.T);
                    xt8 l9 = rv4Var12.l();
                    nq7 p9 = lye.p(rv4Var12, a7);
                    rw1.k.getClass();
                    zx1 zx1Var7 = qw1.b;
                    rv4Var12.i0();
                    if (rv4Var12.S) {
                        rv4Var12.k(zx1Var7);
                    } else {
                        rv4Var12.r0();
                    }
                    jce.F(qw1.f, rv4Var12, a8);
                    jce.F(qw1.e, rv4Var12, l9);
                    jce.F(qw1.g, rv4Var12, Integer.valueOf(hashCode9));
                    jce.C(qw1.h, rv4Var12);
                    jce.F(qw1.d, rv4Var12, p9);
                    tu1Var3.invoke(rv4Var12, 0);
                    if (lu4Var3 != null) {
                        s21.w(rv4Var12, -638513119, kq7Var, 2.0f, rv4Var12);
                        lu4Var3.invoke(rv4Var12, 0);
                        r2 = 0;
                        rv4Var12.q(false);
                    } else {
                        r2 = 0;
                        rv4Var12.e0(-638401643);
                        rv4Var12.q(false);
                    }
                    rv4Var12.q(true);
                    if (c16.i(bool2, Boolean.TRUE)) {
                        rv4Var12.e0(-390898065);
                        nk5.a(rp5.c((wk3) jk3.v.getValue(), rv4Var12, r2), null, pna.n(pu0Var.a(kq7Var, kh5.f), 18.0f), 0L, rv4Var12, 48, 8);
                        rv4Var12.q(r2);
                    } else {
                        rv4Var12.e0(-390672757);
                        rv4Var12.q(r2);
                    }
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
            case 18:
                return a(obj, obj2);
            case 19:
                return b(obj, obj2);
            case 20:
                return e(obj, obj2);
            case 21:
                return f(obj, obj2);
            case 22:
                return g(obj, obj2);
            case 23:
                return m(obj, obj2);
            case 24:
                return n(obj, obj2);
            case 25:
                return o(obj, obj2);
            case 26:
                return p(obj, obj2);
            case 27:
                return q(obj, obj2);
            case 28:
                return r(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                pae.a((List) obj7, (nq7) obj6, (xt4) obj5, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ i31(vt4 vt4Var, List list, wc2 wc2Var, xt4 xt4Var, int i) {
        this.a = 15;
        this.b = vt4Var;
        this.c = list;
        this.e = wc2Var;
        this.d = xt4Var;
    }

    public /* synthetic */ i31(nq7 nq7Var, iaa iaaVar, cz7 cz7Var, aw7 aw7Var) {
        this.a = 7;
        this.b = nq7Var;
        this.e = iaaVar;
        this.c = cz7Var;
        this.d = aw7Var;
    }

    public /* synthetic */ i31(cz7 cz7Var, l93 l93Var, yya yyaVar, yya yyaVar2) {
        this.a = 2;
        this.c = cz7Var;
        this.b = l93Var;
        this.d = yyaVar;
        this.e = yyaVar2;
    }

    public /* synthetic */ i31(Object obj, nq7 nq7Var, hu4 hu4Var, hu4 hu4Var2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = nq7Var;
        this.e = hu4Var;
        this.d = hu4Var2;
    }

    public /* synthetic */ i31(Object obj, Object obj2, nq7 nq7Var, hu4 hu4Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.b = nq7Var;
        this.d = hu4Var;
    }

    public /* synthetic */ i31(Object obj, Object obj2, Object obj3, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
        this.b = nq7Var;
    }

    public /* synthetic */ i31(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public /* synthetic */ i31(String str, String str2, xt4 xt4Var, lu4 lu4Var) {
        this.a = 4;
        this.b = str;
        this.c = str2;
        this.e = xt4Var;
        this.d = lu4Var;
    }
}
