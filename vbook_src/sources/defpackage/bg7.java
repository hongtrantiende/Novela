package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bg7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ io3 b;

    public /* synthetic */ bg7(io3 io3Var, int i) {
        this.a = i;
        this.b = io3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long b;
        boolean z2;
        boolean z3;
        int i;
        int i2 = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        final io3 io3Var = this.b;
        switch (i2) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ar5 c = rp5.c((wk3) ok3.K.getValue(), rv4Var, 0);
                    if (((Boolean) io3Var.e.getValue()).booleanValue()) {
                        rv4Var.e0(-1529340531);
                        b = ((h27) rv4Var.j(j27.a)).a.a;
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1529245640);
                        b = zl1.b(0.5f, ((h27) rv4Var.j(j27.a)).a.q);
                        rv4Var.q(false);
                    }
                    nq7 n = pna.n(kq7Var, 24.0f);
                    boolean f = rv4Var.f(io3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P);
                    }
                    nk5.a(c, null, lbe.f(15, (vt4) P, n, null, false), b, rv4Var, 48, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    boolean f2 = rv4Var2.f(io3Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, pye.a, rv4Var2, 805306368, 510);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    Object P3 = rv4Var3.P();
                    if (P3 == lh9Var) {
                        P3 = s21.e(rv4Var3);
                    }
                    zm4 zm4Var = (zm4) P3;
                    Object P4 = rv4Var3.P();
                    if (P4 == lh9Var) {
                        P4 = new sr3(zm4Var, null, 12);
                        rv4Var3.o0(P4);
                    }
                    yte.g((lu4) P4, rv4Var3, zm4Var);
                    nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var3), 14);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, C);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var3, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var3, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var3, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var3);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var3, p);
                    hm8 hm8Var = io3Var.b;
                    hm8 hm8Var2 = io3Var.d;
                    hm8 hm8Var3 = io3Var.f;
                    String str = (String) hm8Var.getValue();
                    boolean z4 = !((Boolean) hm8Var3.getValue()).booleanValue();
                    t86 t86Var = new t86(0, 7, Token.INC);
                    v72 v72Var = r0f.z(rv4Var3).b;
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    if (((Boolean) hm8Var3.getValue()).booleanValue()) {
                        A = mwe.n(A, zm4Var);
                    }
                    boolean f3 = rv4Var3.f(io3Var);
                    Object P5 = rv4Var3.P();
                    if (f3 || P5 == lh9Var) {
                        P5 = new ag7(io3Var, 2);
                        rv4Var3.o0(P5);
                    }
                    uwe.h(str, (xt4) P5, A, false, z4, null, pye.c, null, null, null, false, null, t86Var, null, false, 0, 0, v72Var, null, rv4Var3, 1572864, 196608, 6258600);
                    xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                    String a2 = io3Var.a();
                    t86 t86Var2 = new t86(0, 7, Token.INC);
                    v72 v72Var2 = r0f.z(rv4Var3).b;
                    nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    if (!((Boolean) hm8Var3.getValue()).booleanValue()) {
                        A2 = mwe.n(A2, zm4Var);
                    }
                    boolean f4 = rv4Var3.f(io3Var);
                    Object P6 = rv4Var3.P();
                    if (f4 || P6 == lh9Var) {
                        P6 = new ag7(io3Var, 1);
                        rv4Var3.o0(P6);
                    }
                    uwe.h(a2, (xt4) P6, A2, false, false, null, pye.d, null, null, jce.E(-2088785732, new bg7(io3Var, 0), rv4Var3), false, null, t86Var2, null, false, 0, 0, v72Var2, null, rv4Var3, 806879232, 196608, 6258104);
                    nq7 q = rte.q(zbe.z(pna.f(kq7Var, 1.0f), 8.0f, 8.0f), rte.u(rv4Var3), 14);
                    mk0 mk0Var = kh5.G;
                    dz dzVar = lz.a;
                    gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var3, 48);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l2 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, q);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a3);
                    jce.F(npVar2, rv4Var3, l2);
                    s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p2);
                    nq7 d = st0.d(tte.k(kq7Var, r0f.z(rv4Var3).b), 1.0f, rm1.g(r0f.y(rv4Var3), 4.0f), r0f.z(rv4Var3).b);
                    mk0 mk0Var2 = kh5.F;
                    gv9 a4 = ev9.a(dzVar, mk0Var2, rv4Var3, 0);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, d);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a4);
                    jce.F(npVar2, rv4Var3, l3);
                    s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p3);
                    String A3 = yqe.A((y3b) b3b.k.getValue(), rv4Var3);
                    boolean booleanValue = ((Boolean) hm8Var2.getValue()).booleanValue();
                    boolean f5 = rv4Var3.f(io3Var);
                    Object P7 = rv4Var3.P();
                    if (!f5 && P7 != lh9Var) {
                        i = 0;
                    } else {
                        i = 0;
                        P7 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P7);
                    }
                    l0e.o(A3, booleanValue, (vt4) P7, rv4Var3, i);
                    String A4 = yqe.A((y3b) s2b.q0.getValue(), rv4Var3);
                    boolean z5 = !((Boolean) hm8Var2.getValue()).booleanValue();
                    boolean f6 = rv4Var3.f(io3Var);
                    Object P8 = rv4Var3.P();
                    if (f6 || P8 == lh9Var) {
                        P8 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P8);
                    }
                    l0e.o(A4, z5, (vt4) P8, rv4Var3, 0);
                    s21.x(rv4Var3, true, kq7Var, 8.0f, rv4Var3);
                    nq7 d2 = st0.d(tte.k(kq7Var, r0f.z(rv4Var3).b), 1.0f, rm1.g(r0f.y(rv4Var3), 4.0f), r0f.z(rv4Var3).b);
                    gv9 a5 = ev9.a(dzVar, mk0Var2, rv4Var3, 0);
                    int hashCode4 = Long.hashCode(rv4Var3.T);
                    xt8 l4 = rv4Var3.l();
                    nq7 p4 = lye.p(rv4Var3, d2);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a5);
                    jce.F(npVar2, rv4Var3, l4);
                    s21.t(hashCode4, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p4);
                    boolean f7 = rv4Var3.f(io3Var);
                    Object P9 = rv4Var3.P();
                    if (f7 || P9 == lh9Var) {
                        P9 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P9);
                    }
                    l0e.a("aa", 0, (vt4) P9, rv4Var3, 54);
                    boolean f8 = rv4Var3.f(io3Var);
                    Object P10 = rv4Var3.P();
                    if (f8 || P10 == lh9Var) {
                        P10 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P10);
                    }
                    l0e.a("Aa", 1, (vt4) P10, rv4Var3, 54);
                    boolean f9 = rv4Var3.f(io3Var);
                    Object P11 = rv4Var3.P();
                    if (f9 || P11 == lh9Var) {
                        P11 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P11);
                    }
                    l0e.a("Aa", 2, (vt4) P11, rv4Var3, 54);
                    boolean f10 = rv4Var3.f(io3Var);
                    Object P12 = rv4Var3.P();
                    if (f10 || P12 == lh9Var) {
                        P12 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P12);
                    }
                    l0e.a("Aa", 0, (vt4) P12, rv4Var3, 54);
                    boolean f11 = rv4Var3.f(io3Var);
                    Object P13 = rv4Var3.P();
                    if (f11 || P13 == lh9Var) {
                        P13 = new vt4() { // from class: cg7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i3 = r2;
                                pvc pvcVar2 = pvc.a;
                                io3 io3Var2 = io3Var;
                                switch (i3) {
                                    case 0:
                                        io3Var2.d.setValue(Boolean.TRUE);
                                        return pvcVar2;
                                    case 1:
                                        io3Var2.d.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                    case 2:
                                        io3Var2.c(lh9.s(0, io3Var2.a()));
                                        return pvcVar2;
                                    case 3:
                                        io3Var2.c(lh9.s(1, io3Var2.a()));
                                        return pvcVar2;
                                    case 4:
                                        io3Var2.c(lh9.s(2, io3Var2.a()));
                                        return pvcVar2;
                                    case 5:
                                        io3Var2.c(lh9.s(-1, io3Var2.a()));
                                        return pvcVar2;
                                    case 6:
                                        io3Var2.c(lh9.s(Integer.MAX_VALUE, io3Var2.a()));
                                        return pvcVar2;
                                    case 7:
                                        io3Var2.e.setValue(Boolean.valueOf(!((Boolean) io3Var2.e.getValue()).booleanValue()));
                                        return pvcVar2;
                                    default:
                                        io3Var2.b();
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var3.o0(P13);
                    }
                    l0e.a("AA", 0, (vt4) P13, rv4Var3, 54);
                    hl5.v(rv4Var3, true, true, true);
                    xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                    return pvcVar;
                }
                rv4Var3.X();
                return pvcVar;
        }
    }
}
