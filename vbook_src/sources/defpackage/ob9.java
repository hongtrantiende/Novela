package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ob9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob9 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ob9(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v21, types: [nq7] */
    /* JADX WARN: Type inference failed for: r2v51, types: [rv4] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        long j;
        int X0;
        int X02;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        kq7 kq7Var;
        int i = this.a;
        int i2 = 4;
        int i3 = 2;
        Object obj4 = ax1.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var2 = kq7.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        boolean z8 = true;
        switch (i) {
            case 0:
                zb9 zb9Var = (zb9) obj7;
                kd4 kd4Var = (kd4) obj6;
                aw7 aw7Var = (aw7) obj5;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (((wb9) aw7Var.getValue()).j) {
                        rv4Var.e0(304561779);
                        String valueOf = String.valueOf(((wb9) aw7Var.getValue()).i.size());
                        tza tzaVar = j27.a;
                        cvb.c(valueOf, null, ((h27) rv4Var.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, 0, 0, 131066);
                        z8 = (((wb9) aw7Var.getValue()).a.isEmpty() || ((wb9) aw7Var.getValue()).i.size() != ((wb9) aw7Var.getValue()).a.size()) ? false : false;
                        ar5 c = rp5.c((wk3) jk3.K.getValue(), rv4Var, 0);
                        if (z8) {
                            rv4Var.e0(305035862);
                            j = ((h27) rv4Var.j(tzaVar)).a.a;
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(305122228);
                            j = ((h27) rv4Var.j(tzaVar)).a.q;
                            rv4Var.q(false);
                        }
                        long j2 = j;
                        boolean g = rv4Var.g(z8) | rv4Var.f(zb9Var);
                        Object P = rv4Var.P();
                        if (g || P == obj4) {
                            P = new dj0(z8, zb9Var, 3);
                            rv4Var.o0(P);
                        }
                        kwe.d(c, null, j2, (vt4) P, rv4Var, 0, 2);
                        ar5 c2 = rp5.c((wk3) jk3.H.getValue(), rv4Var, 0);
                        boolean f = rv4Var.f(zb9Var);
                        Object P2 = rv4Var.P();
                        if (f || P2 == obj4) {
                            P2 = new pb9(zb9Var, 0);
                            rv4Var.o0(P2);
                        }
                        kwe.d(c2, null, 0L, (vt4) P2, rv4Var, 0, 6);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(305590080);
                        if (((wb9) aw7Var.getValue()).h && !((wb9) aw7Var.getValue()).g) {
                            rv4Var.e0(305635929);
                            ar5 c3 = rp5.c((wk3) jk3.J.getValue(), rv4Var, 0);
                            boolean f2 = rv4Var.f(zb9Var);
                            Object P3 = rv4Var.P();
                            if (f2 || P3 == obj4) {
                                P3 = new pb9(zb9Var, 1);
                                rv4Var.o0(P3);
                            }
                            kwe.d(c3, null, 0L, (vt4) P3, rv4Var, 0, 6);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(305833895);
                            rv4Var.q(false);
                        }
                        if (((wb9) aw7Var.getValue()).g) {
                            rv4Var.e0(305873358);
                            ts6.a(nae.e, 384, 3, 0L, rv4Var, pna.n(kq7Var2, 48.0f));
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(305958887);
                            rv4Var.q(false);
                        }
                        boolean z9 = !((wb9) aw7Var.getValue()).e;
                        boolean f3 = rv4Var.f(kd4Var);
                        Object P4 = rv4Var.P();
                        if (f3 || P4 == obj4) {
                            P4 = new fe1(kd4Var, 15);
                            rv4Var.o0(P4);
                        }
                        vt4 vt4Var = (vt4) P4;
                        boolean f4 = rv4Var.f(zb9Var);
                        Object P5 = rv4Var.P();
                        if (f4 || P5 == obj4) {
                            P5 = new pb9(zb9Var, 2);
                            rv4Var.o0(P5);
                        }
                        yqe.i(0, vt4Var, (vt4) P5, rv4Var, null, z9);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                List list = (List) obj7;
                xt4 xt4Var = (xt4) obj6;
                rj8 rj8Var = ((pj8) obj5).a;
                e37 e37Var = (e37) obj;
                w27 w27Var = (w27) obj2;
                x02 x02Var = (x02) obj3;
                e37Var.getClass();
                w27Var.getClass();
                boolean isEmpty = list.isEmpty();
                ls3 ls3Var = ls3.a;
                if (isEmpty) {
                    return e37Var.q0(x02.i(x02Var.a), 0, ls3Var, new az9(19));
                }
                int min = Math.min(list.size() - 1, ((Number) xt4Var.invoke(Integer.valueOf(rj8Var.k()))).intValue());
                kjb kjbVar = (kjb) list.get(min);
                kjb kjbVar2 = (kjb) sl1.f0(min - 1, list);
                kjb kjbVar3 = (kjb) sl1.f0(min + 1, list);
                float l = rj8Var.l();
                int i4 = (l > nae.e ? 1 : (l == nae.e ? 0 : -1));
                if (i4 > 0 && kjbVar3 != null) {
                    X0 = e37Var.X0(b23.o(kjbVar.b, kjbVar3.b, l));
                } else if (l < nae.e && kjbVar2 != null) {
                    X0 = e37Var.X0(b23.o(kjbVar.b, kjbVar2.b, -l));
                } else {
                    X0 = e37Var.X0(kjbVar.b);
                }
                if (i4 > 0 && kjbVar3 != null) {
                    X02 = e37Var.X0(b23.o(kjbVar.a, kjbVar3.a, l));
                } else if (l < nae.e && kjbVar2 != null) {
                    X02 = e37Var.X0(b23.o(kjbVar.a, kjbVar2.a, -l));
                } else {
                    X02 = e37Var.X0(kjbVar.a);
                }
                long j3 = x02Var.a;
                mw8 M = w27Var.M(y02.a(X0, X0, 0, x02.h(j3)));
                return e37Var.q0(x02.i(j3), Math.max(M.b, x02.j(j3)), ls3Var, new in2(M, X02, x02Var, 8));
            case 2:
                final aw7 aw7Var2 = (aw7) obj5;
                final kf9 kf9Var = (kf9) obj7;
                kd4 kd4Var2 = (kd4) obj6;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, kq7Var2);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l2);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    ar5 c4 = rp5.c((wk3) ok3.M.getValue(), rv4Var2, 0);
                    boolean f5 = rv4Var2.f(aw7Var2);
                    Object P6 = rv4Var2.P();
                    if (f5 || P6 == obj4) {
                        P6 = new iia(aw7Var2, 22);
                        rv4Var2.o0(P6);
                    }
                    kwe.d(c4, null, 0L, (vt4) P6, rv4Var2, 0, 6);
                    boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                    boolean f6 = rv4Var2.f(aw7Var2);
                    Object P7 = rv4Var2.P();
                    if (f6 || P7 == obj4) {
                        P7 = new iia(aw7Var2, 23);
                        rv4Var2.o0(P7);
                    }
                    vt4 vt4Var2 = (vt4) P7;
                    boolean f7 = rv4Var2.f(aw7Var2) | rv4Var2.f(kf9Var);
                    Object P8 = rv4Var2.P();
                    if (f7 || P8 == obj4) {
                        P8 = new vt4() { // from class: kpb
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var3 = aw7Var2;
                                kf9 kf9Var2 = kf9Var;
                                switch (i5) {
                                    case 0:
                                        aw7Var3.setValue(Boolean.FALSE);
                                        kf9Var2.getClass();
                                        hk1 a = jdd.a(kf9Var2);
                                        sw2 sw2Var = ab3.a;
                                        kf9Var2.f(a, ru2.c, new jk8(kf9Var2, null, 8));
                                        return pvcVar2;
                                    default:
                                        aw7Var3.setValue(Boolean.FALSE);
                                        kf9Var2.k();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P8);
                    }
                    vt4 vt4Var3 = (vt4) P8;
                    boolean f8 = rv4Var2.f(aw7Var2) | rv4Var2.f(kd4Var2);
                    Object P9 = rv4Var2.P();
                    if (f8 || P9 == obj4) {
                        P9 = new fe3(kd4Var2, aw7Var2, 4);
                        rv4Var2.o0(P9);
                    }
                    vt4 vt4Var4 = (vt4) P9;
                    boolean f9 = rv4Var2.f(aw7Var2) | rv4Var2.f(kf9Var);
                    Object P10 = rv4Var2.P();
                    if (f9 || P10 == obj4) {
                        P10 = new vt4() { // from class: kpb
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var3 = aw7Var2;
                                kf9 kf9Var2 = kf9Var;
                                switch (i5) {
                                    case 0:
                                        aw7Var3.setValue(Boolean.FALSE);
                                        kf9Var2.getClass();
                                        hk1 a = jdd.a(kf9Var2);
                                        sw2 sw2Var = ab3.a;
                                        kf9Var2.f(a, ru2.c, new jk8(kf9Var2, null, 8));
                                        return pvcVar2;
                                    default:
                                        aw7Var3.setValue(Boolean.FALSE);
                                        kf9Var2.k();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P10);
                    }
                    lye.i(booleanValue, vt4Var2, vt4Var3, vt4Var4, (vt4) P10, rv4Var2, 0);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 3:
                final aw7 aw7Var3 = (aw7) obj5;
                final cqb cqbVar = (cqb) obj7;
                kd4 kd4Var3 = (kd4) obj6;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, kq7Var2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var2);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d2);
                    jce.F(qw1.e, rv4Var3, l3);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p2);
                    ar5 c5 = rp5.c((wk3) ok3.M.getValue(), rv4Var3, 0);
                    boolean f10 = rv4Var3.f(aw7Var3);
                    Object P11 = rv4Var3.P();
                    if (f10 || P11 == obj4) {
                        P11 = new iia(aw7Var3, 24);
                        rv4Var3.o0(P11);
                    }
                    kwe.d(c5, null, 0L, (vt4) P11, rv4Var3, 0, 6);
                    boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
                    boolean f11 = rv4Var3.f(aw7Var3);
                    Object P12 = rv4Var3.P();
                    if (f11 || P12 == obj4) {
                        P12 = new iia(aw7Var3, 25);
                        rv4Var3.o0(P12);
                    }
                    vt4 vt4Var5 = (vt4) P12;
                    boolean f12 = rv4Var3.f(aw7Var3) | rv4Var3.f(cqbVar);
                    Object P13 = rv4Var3.P();
                    if (f12 || P13 == obj4) {
                        P13 = new vt4() { // from class: xpb
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var4 = aw7Var3;
                                cqb cqbVar2 = cqbVar;
                                switch (i5) {
                                    case 0:
                                        aw7Var4.setValue(Boolean.FALSE);
                                        hk1 a = jdd.a(cqbVar2);
                                        sw2 sw2Var = ab3.a;
                                        cqbVar2.f(a, ru2.c, new koa(cqbVar2, null, 17));
                                        return pvcVar2;
                                    default:
                                        aw7Var4.setValue(Boolean.FALSE);
                                        hk1 a2 = jdd.a(cqbVar2);
                                        sw2 sw2Var2 = ab3.a;
                                        cqbVar2.f(a2, ru2.c, new bqb(cqbVar2, null, 1));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P13);
                    }
                    vt4 vt4Var6 = (vt4) P13;
                    boolean f13 = rv4Var3.f(aw7Var3) | rv4Var3.f(kd4Var3);
                    Object P14 = rv4Var3.P();
                    if (f13 || P14 == obj4) {
                        P14 = new fe3(kd4Var3, aw7Var3, 5);
                        rv4Var3.o0(P14);
                    }
                    vt4 vt4Var7 = (vt4) P14;
                    boolean f14 = rv4Var3.f(aw7Var3) | rv4Var3.f(cqbVar);
                    Object P15 = rv4Var3.P();
                    if (f14 || P15 == obj4) {
                        P15 = new vt4() { // from class: xpb
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var4 = aw7Var3;
                                cqb cqbVar2 = cqbVar;
                                switch (i5) {
                                    case 0:
                                        aw7Var4.setValue(Boolean.FALSE);
                                        hk1 a = jdd.a(cqbVar2);
                                        sw2 sw2Var = ab3.a;
                                        cqbVar2.f(a, ru2.c, new koa(cqbVar2, null, 17));
                                        return pvcVar2;
                                    default:
                                        aw7Var4.setValue(Boolean.FALSE);
                                        hk1 a2 = jdd.a(cqbVar2);
                                        sw2 sw2Var2 = ab3.a;
                                        cqbVar2.f(a2, ru2.c, new bqb(cqbVar2, null, 1));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P15);
                    }
                    nye.a(booleanValue2, vt4Var5, vt4Var6, vt4Var7, (vt4) P15, rv4Var3, 0);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 4:
                final aw7 aw7Var4 = (aw7) obj5;
                final c4c c4cVar = (c4c) obj7;
                kd4 kd4Var4 = (kd4) obj6;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    b37 d3 = fu0.d(kh5.a, false);
                    int hashCode3 = Long.hashCode(rv4Var4.T);
                    xt8 l4 = rv4Var4.l();
                    nq7 p3 = lye.p(rv4Var4, kq7Var2);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var3);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, d3);
                    jce.F(qw1.e, rv4Var4, l4);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p3);
                    ar5 c6 = rp5.c((wk3) ok3.M.getValue(), rv4Var4, 0);
                    boolean f15 = rv4Var4.f(aw7Var4);
                    Object P16 = rv4Var4.P();
                    if (f15 || P16 == obj4) {
                        P16 = new p0c(aw7Var4, 7);
                        rv4Var4.o0(P16);
                    }
                    kwe.d(c6, null, 0L, (vt4) P16, rv4Var4, 0, 6);
                    boolean booleanValue3 = ((Boolean) aw7Var4.getValue()).booleanValue();
                    boolean f16 = rv4Var4.f(aw7Var4);
                    Object P17 = rv4Var4.P();
                    if (f16 || P17 == obj4) {
                        P17 = new p0c(aw7Var4, 8);
                        rv4Var4.o0(P17);
                    }
                    vt4 vt4Var8 = (vt4) P17;
                    boolean f17 = rv4Var4.f(aw7Var4) | rv4Var4.f(c4cVar);
                    Object P18 = rv4Var4.P();
                    if (f17 || P18 == obj4) {
                        P18 = new vt4() { // from class: s3c
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var5 = aw7Var4;
                                c4c c4cVar2 = c4cVar;
                                switch (i5) {
                                    case 0:
                                        aw7Var5.setValue(Boolean.FALSE);
                                        hk1 a = jdd.a(c4cVar2);
                                        sw2 sw2Var = ab3.a;
                                        c4cVar2.f(a, ru2.c, new koa(c4cVar2, null, 29));
                                        return pvcVar2;
                                    default:
                                        aw7Var5.setValue(Boolean.FALSE);
                                        hk1 a2 = jdd.a(c4cVar2);
                                        sw2 sw2Var2 = ab3.a;
                                        c4cVar2.f(a2, ru2.c, new b4c(c4cVar2, null, 1));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var4.o0(P18);
                    }
                    vt4 vt4Var9 = (vt4) P18;
                    boolean f18 = rv4Var4.f(aw7Var4) | rv4Var4.f(kd4Var4);
                    Object P19 = rv4Var4.P();
                    if (f18 || P19 == obj4) {
                        P19 = new fe3(kd4Var4, aw7Var4, 6);
                        rv4Var4.o0(P19);
                    }
                    vt4 vt4Var10 = (vt4) P19;
                    boolean f19 = rv4Var4.f(aw7Var4) | rv4Var4.f(c4cVar);
                    Object P20 = rv4Var4.P();
                    if (f19 || P20 == obj4) {
                        P20 = new vt4() { // from class: s3c
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var5 = aw7Var4;
                                c4c c4cVar2 = c4cVar;
                                switch (i5) {
                                    case 0:
                                        aw7Var5.setValue(Boolean.FALSE);
                                        hk1 a = jdd.a(c4cVar2);
                                        sw2 sw2Var = ab3.a;
                                        c4cVar2.f(a, ru2.c, new koa(c4cVar2, null, 29));
                                        return pvcVar2;
                                    default:
                                        aw7Var5.setValue(Boolean.FALSE);
                                        hk1 a2 = jdd.a(c4cVar2);
                                        sw2 sw2Var2 = ab3.a;
                                        c4cVar2.f(a2, ru2.c, new b4c(c4cVar2, null, 1));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var4.o0(P20);
                    }
                    ak0.a(booleanValue3, vt4Var8, vt4Var9, vt4Var10, (vt4) P20, rv4Var4, 0);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 5:
                final aw7 aw7Var5 = (aw7) obj5;
                final gbc gbcVar = (gbc) obj7;
                kd4 kd4Var5 = (kd4) obj6;
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    b37 d4 = fu0.d(kh5.a, false);
                    int hashCode4 = Long.hashCode(rv4Var5.T);
                    xt8 l5 = rv4Var5.l();
                    nq7 p4 = lye.p(rv4Var5, kq7Var2);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var4);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(qw1.f, rv4Var5, d4);
                    jce.F(qw1.e, rv4Var5, l5);
                    jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var5);
                    jce.F(qw1.d, rv4Var5, p4);
                    ar5 c7 = rp5.c((wk3) ok3.M.getValue(), rv4Var5, 0);
                    boolean f20 = rv4Var5.f(aw7Var5);
                    Object P21 = rv4Var5.P();
                    if (f20 || P21 == obj4) {
                        P21 = new p0c(aw7Var5, 11);
                        rv4Var5.o0(P21);
                    }
                    kwe.d(c7, null, 0L, (vt4) P21, rv4Var5, 0, 6);
                    boolean booleanValue4 = ((Boolean) aw7Var5.getValue()).booleanValue();
                    boolean f21 = rv4Var5.f(aw7Var5);
                    Object P22 = rv4Var5.P();
                    if (f21 || P22 == obj4) {
                        P22 = new p0c(aw7Var5, 12);
                        rv4Var5.o0(P22);
                    }
                    vt4 vt4Var11 = (vt4) P22;
                    boolean f22 = rv4Var5.f(aw7Var5) | rv4Var5.f(gbcVar);
                    Object P23 = rv4Var5.P();
                    if (f22 || P23 == obj4) {
                        P23 = new vt4() { // from class: dbc
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var6 = aw7Var5;
                                gbc gbcVar2 = gbcVar;
                                switch (i5) {
                                    case 0:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a = jdd.a(gbcVar2);
                                        sw2 sw2Var = ab3.a;
                                        gbcVar2.f(a, ru2.c, new q4c(gbcVar2, (m42) null, 9));
                                        return pvcVar2;
                                    default:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a2 = jdd.a(gbcVar2);
                                        sw2 sw2Var2 = ab3.a;
                                        gbcVar2.f(a2, ru2.c, new ov9(gbcVar2, (m42) null, 26));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var5.o0(P23);
                    }
                    vt4 vt4Var12 = (vt4) P23;
                    boolean f23 = rv4Var5.f(aw7Var5) | rv4Var5.f(kd4Var5);
                    Object P24 = rv4Var5.P();
                    if (f23 || P24 == obj4) {
                        P24 = new fe3(kd4Var5, aw7Var5, 7);
                        rv4Var5.o0(P24);
                    }
                    vt4 vt4Var13 = (vt4) P24;
                    boolean f24 = rv4Var5.f(aw7Var5) | rv4Var5.f(gbcVar);
                    Object P25 = rv4Var5.P();
                    if (f24 || P25 == obj4) {
                        P25 = new vt4() { // from class: dbc
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var6 = aw7Var5;
                                gbc gbcVar2 = gbcVar;
                                switch (i5) {
                                    case 0:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a = jdd.a(gbcVar2);
                                        sw2 sw2Var = ab3.a;
                                        gbcVar2.f(a, ru2.c, new q4c(gbcVar2, (m42) null, 9));
                                        return pvcVar2;
                                    default:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a2 = jdd.a(gbcVar2);
                                        sw2 sw2Var2 = ab3.a;
                                        gbcVar2.f(a2, ru2.c, new ov9(gbcVar2, (m42) null, 26));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var5.o0(P25);
                    }
                    tye.a(booleanValue4, vt4Var11, vt4Var12, vt4Var13, (vt4) P25, rv4Var5, 0);
                    rv4Var5.q(true);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 6:
                ya9 ya9Var = (ya9) obj7;
                rh8 rh8Var = (rh8) obj6;
                aw7 aw7Var6 = (aw7) obj5;
                ou0 ou0Var = (ou0) obj;
                rv4 rv4Var6 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ou0Var.getClass();
                if ((intValue6 & 6) == 0) {
                    if (!rv4Var6.f(ou0Var)) {
                        i2 = 2;
                    }
                    intValue6 |= i2;
                }
                if ((intValue6 & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z6)) {
                    na9.a.b(ya9Var, ((phc) aw7Var6.getValue()).a, zbe.C(ou0Var.a(kq7Var2, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var6, 12582912);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            default:
                qlc qlcVar = (qlc) obj7;
                xt4 xt4Var2 = (xt4) obj6;
                aw7 aw7Var7 = (aw7) obj5;
                ?? r2 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (r2.U(intValue7 & 1, z7)) {
                    Object P26 = r2.P();
                    if (P26 == obj4) {
                        P26 = new zu0();
                        r2.o0(P26);
                    }
                    zu0 zu0Var = (zu0) P26;
                    r2.e0(1402648528);
                    List list2 = qlcVar.i;
                    int size = list2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        tmc tmcVar = (tmc) list2.get(i5);
                        boolean equals = tmcVar.a.equals(qlcVar.b);
                        String str = tmcVar.b;
                        if (equals) {
                            kq7Var = w9e.k(kq7Var2, zu0Var);
                        } else {
                            kq7Var = kq7Var2;
                        }
                        tu1 E = jce.E(-2123627486, new qx0(tmcVar, i3), r2);
                        Boolean valueOf2 = Boolean.valueOf(equals);
                        boolean f25 = r2.f(xt4Var2) | r2.h(tmcVar);
                        Object P27 = r2.P();
                        if (f25 || P27 == obj4) {
                            P27 = new rx0(xt4Var2, tmcVar, aw7Var7, 2);
                            r2.o0(P27);
                        }
                        iue.g(str, null, E, valueOf2, kq7Var, (vt4) P27, r2, 384, 2);
                        i5++;
                        i3 = 2;
                    }
                    r2.q(false);
                    boolean h = r2.h(zu0Var);
                    Object P28 = r2.P();
                    if (h || P28 == obj4) {
                        P28 = new so7(zu0Var, null, 3);
                        r2.o0(P28);
                    }
                    yte.g((lu4) P28, r2, pvcVar);
                } else {
                    r2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ob9(aw7 aw7Var, fdd fddVar, kd4 kd4Var, int i) {
        this.a = i;
        this.d = aw7Var;
        this.b = fddVar;
        this.c = kd4Var;
    }
}
