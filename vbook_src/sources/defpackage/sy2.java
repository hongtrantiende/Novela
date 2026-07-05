package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sy2  reason: default package */
/* loaded from: classes.dex */
public final class sy2 {
    public static final sy2 a = new Object();

    public final void a(crc crcVar, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        kq7 kq7Var;
        nq7 nq7Var;
        boolean z4;
        boolean z5;
        crc crcVar2;
        boolean z6;
        cgc e;
        boolean z7;
        boolean z8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1640665680);
        if (rv4Var2.f(crcVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            float f = crcVar.k;
            xfc xfcVar = crcVar.n;
            ko6 ko6Var = crcVar.m;
            bgc bgcVar = crcVar.o;
            float f2 = crcVar.l;
            if (!Float.isNaN(f) && (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
                if (!Float.isNaN(f2) && (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) < 2139095040) {
                    if (rg3.a(f2, f) >= 0) {
                        int X0 = ((r13) rv4Var2.j(dy1.h)).X0(crcVar.d);
                        int i4 = i3 & 14;
                        if (i4 == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Object P = rv4Var2.P();
                        lh9 lh9Var = ax1.a;
                        if (z2 || P == lh9Var) {
                            P = new t42(crcVar, 5);
                            rv4Var2.o0(P);
                        }
                        vt4 vt4Var = (vt4) P;
                        if (i4 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean f3 = z3 | rv4Var2.f(vt4Var);
                        Object P2 = rv4Var2.P();
                        if (f3 || P2 == lh9Var) {
                            P2 = new w7(8, crcVar, vt4Var);
                            rv4Var2.o0(P2);
                        }
                        vt4 vt4Var2 = (vt4) P2;
                        tu1 E = jce.E(-1333673671, new sj(crcVar, 10), rv4Var2);
                        boolean f4 = rv4Var2.f(vt4Var);
                        Object P3 = rv4Var2.P();
                        if (f4 || P3 == lh9Var) {
                            P3 = new pp1(8, vt4Var);
                            rv4Var2.o0(P3);
                        }
                        vt4 vt4Var3 = (vt4) P3;
                        boolean f5 = rv4Var2.f(vt4Var);
                        Object P4 = rv4Var2.P();
                        if (f5 || P4 == lh9Var) {
                            P4 = new pp1(9, vt4Var);
                            rv4Var2.o0(P4);
                        }
                        vt4 vt4Var4 = (vt4) P4;
                        boolean f6 = rv4Var2.f(vt4Var);
                        Object P5 = rv4Var2.P();
                        if (f6 || P5 == lh9Var) {
                            P5 = yae.q(new pp1(10, vt4Var));
                            rv4Var2.o0(P5);
                        }
                        yya yyaVar = (yya) P5;
                        boolean z9 = !((Boolean) yyaVar.getValue()).booleanValue();
                        kq7 kq7Var2 = kq7.a;
                        if (bgcVar != null && !bgcVar.d()) {
                            rv4Var2.e0(-341139672);
                            if (i4 == 4) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Object P6 = rv4Var2.P();
                            if (z7 || P6 == lh9Var) {
                                P6 = new cq2(crcVar, 5);
                                rv4Var2.o0(P6);
                            }
                            qj3 b = nj3.b((xt4) P6, rv4Var2, 0);
                            if (i4 == 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            Object P7 = rv4Var2.P();
                            if (z8 || P7 == lh9Var) {
                                P7 = new zw2(crcVar, null, 1);
                                rv4Var2.o0(P7);
                            }
                            nq7Var = nj3.a(kq7Var2, b, ff8.a, false, null, false, null, (mu4) P7, false, 188);
                            kq7Var = kq7Var2;
                            rv4Var2.q(false);
                        } else {
                            kq7Var = kq7Var2;
                            rv4Var2.e0(-340524694);
                            rv4Var2.q(false);
                            nq7Var = kq7Var;
                        }
                        nq7 a0 = crcVar.a.a0(nq7Var);
                        boolean f7 = rv4Var2.f(vt4Var2);
                        Object P8 = rv4Var2.P();
                        if (f7 || P8 == lh9Var) {
                            P8 = new nv(7, vt4Var2);
                            rv4Var2.o0(P8);
                        }
                        nq7 r = ote.r(a0, (xt4) P8);
                        Object P9 = rv4Var2.P();
                        if (P9 == lh9Var) {
                            P9 = new bq2(12);
                            rv4Var2.o0(P9);
                        }
                        nq7 c = y7a.c(r, false, (xt4) P9);
                        Object P10 = rv4Var2.P();
                        if (P10 == lh9Var) {
                            P10 = yw2.c;
                            rv4Var2.o0(P10);
                        }
                        nq7 b2 = dab.b(c, pvc.a, (PointerInputEventHandler) P10);
                        b37 d = fu0.d(kh5.a, false);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, b2);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        np npVar = qw1.f;
                        jce.F(npVar, rv4Var2, d);
                        np npVar2 = qw1.e;
                        jce.F(npVar2, rv4Var2, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        np npVar3 = qw1.g;
                        jce.F(npVar3, rv4Var2, valueOf);
                        kg kgVar = qw1.h;
                        jce.C(kgVar, rv4Var2);
                        np npVar4 = qw1.d;
                        jce.F(npVar4, rv4Var2, p);
                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, kq7Var);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, a2);
                        jce.F(npVar2, rv4Var2, l2);
                        s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p2);
                        nq7 l3 = tte.l(hc2.v(kq7Var, ko6Var));
                        Object P11 = rv4Var2.P();
                        if (P11 == lh9Var) {
                            P11 = new Object();
                            rv4Var2.o0(P11);
                        }
                        yi4 yi4Var = (yi4) P11;
                        long j = xfcVar.c;
                        long j2 = xfcVar.d;
                        long j3 = xfcVar.e;
                        kq7 kq7Var3 = kq7Var;
                        long j4 = xfcVar.f;
                        tu1 tu1Var = crcVar.e;
                        oyb oybVar = crcVar.f;
                        oyb oybVar2 = crcVar.h;
                        boolean booleanValue = ((Boolean) yyaVar.getValue()).booleanValue();
                        tu1 tu1Var2 = crcVar.i;
                        float f8 = crcVar.k;
                        th8 th8Var = yfc.a;
                        vv.e(l3, yi4Var, j, j2, j4, j3, tu1Var, oybVar, oybVar2, vt4Var3, lz.e, 0, booleanValue, tu1Var2, E, f8, th8Var, rv4Var, 0, 102239280);
                        nq7 l4 = tte.l(hc2.v(kq7Var3, new ko6(ko6Var, owe.g)));
                        if (bgcVar != null && (e = bgcVar.e()) != null) {
                            z4 = false;
                            nq7 l5 = pbe.l(l4, new pv(e, 0));
                            if (l5 != null) {
                                l4 = l5;
                            }
                        } else {
                            z4 = false;
                        }
                        if (i4 == 4) {
                            z5 = true;
                        } else {
                            z5 = z4;
                        }
                        Object P12 = rv4Var.P();
                        if (!z5 && P12 != lh9Var) {
                            crcVar2 = crcVar;
                            z6 = true;
                        } else {
                            crcVar2 = crcVar;
                            z6 = true;
                            P12 = new xw2(crcVar2, 1);
                            rv4Var.o0(P12);
                        }
                        boolean z10 = z6;
                        vv.e(l4, (yi4) P12, xfcVar.c, xfcVar.d, xfcVar.f, xfcVar.e, crcVar2.b, crcVar2.c, crcVar2.g, vt4Var4, lz.d, X0, z9, xoe.b, xoe.c, f2 - f, th8Var, rv4Var, 0, 102432816);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(z10);
                        rv4Var2.q(z10);
                    } else {
                        vs.m("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                        return;
                    }
                } else {
                    vs.m("The expandedHeight is expected to be specified and finite");
                    return;
                }
            } else {
                vs.m("The collapsedHeight is expected to be specified and finite");
                return;
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ah7(this, crcVar, i, 25);
        }
    }
}
