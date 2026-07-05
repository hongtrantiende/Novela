package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gk7(int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = 18;
        this.d = aw7Var;
        this.b = i;
        this.c = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        pvc pvcVar;
        pb2 pb2Var;
        rv4 rv4Var;
        kg kgVar;
        np npVar;
        int i;
        boolean z5;
        int i2 = this.a;
        xw1 xw1Var = null;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        boolean z6 = false;
        int i3 = this.b;
        pvc pvcVar2 = pvc.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                List list = (List) obj4;
                aw7 aw7Var = (aw7) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                u22 u22Var = r0f.e;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue & 1, z)) {
                    ze4 ze4Var = pna.c;
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, ze4Var);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, d);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    qw6 L = kwe.L(6, 4, rv4Var2);
                    btd n = tye.n(L, rv4Var2, 0);
                    o7b x = qre.x(n, rv4Var2);
                    boolean f = rv4Var2.f(L) | rv4Var2.f(n) | rv4Var2.f(x) | rv4Var2.f(null);
                    Object P = rv4Var2.P();
                    if (f || P == lh9Var) {
                        P = new nl1(L, n, x);
                        rv4Var2.o0(P);
                    }
                    nl1 nl1Var = (nl1) P;
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = yae.z(i10.a);
                        rv4Var2.o0(P2);
                    }
                    aw7 aw7Var2 = (aw7) P2;
                    btd btdVar = nl1Var.a;
                    boolean f2 = rv4Var2.f(nl1Var);
                    Object P3 = rv4Var2.P();
                    if (f2 || P3 == lh9Var) {
                        P3 = new rg0(nl1Var, null, 14);
                        rv4Var2.o0(P3);
                    }
                    yte.g((lu4) P3, rv4Var2, btdVar);
                    String str = (String) list.get(i3);
                    io5 io5Var = (io5) rv4Var2.j(do5.a);
                    Object P4 = rv4Var2.P();
                    if (P4 == lh9Var) {
                        P4 = new dk7(aw7Var, 0);
                        rv4Var2.o0(P4);
                    }
                    nq7 k = axe.k(ze4Var, (xt4) P4);
                    Object P5 = rv4Var2.P();
                    if (P5 == lh9Var) {
                        P5 = new dk7(aw7Var2, 1);
                        rv4Var2.o0(P5);
                    }
                    xt4 xt4Var = (xt4) P5;
                    Object P6 = rv4Var2.P();
                    if (P6 == lh9Var) {
                        P6 = new dk7(aw7Var2, 2);
                        rv4Var2.o0(P6);
                    }
                    xt4 xt4Var2 = (xt4) P6;
                    io5Var.getClass();
                    nk0 nk0Var = kh5.e;
                    t1a t1aVar = t1a.d;
                    r10 r10Var = new r10(str, (g10) rv4Var2.j(ct6.a), io5Var);
                    if (xt4Var != null || xt4Var2 != null) {
                        xw1Var = new xw1(xt4Var, xt4Var2, 0);
                    }
                    iue.d(r10Var, k, n10.R, xw1Var, nk0Var, u22Var, nl1Var, t1aVar, rv4Var2, 1573296, 0);
                    Object P7 = rv4Var2.P();
                    if (P7 == lh9Var) {
                        P7 = yae.q(new nd7(aw7Var2, 17));
                        rv4Var2.o0(P7);
                    }
                    if (((Boolean) ((yya) P7).getValue()).booleanValue()) {
                        rv4Var2.e0(1241941129);
                        ts6.a(3.0f, 54, 0, zl1.e, rv4Var2, pna.n(pu0.a.a(kq7Var, nk0Var), 32.0f));
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(1242328412);
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar2;
            case 1:
                ((Integer) obj2).getClass();
                w92.c((l9) obj4, (nq7) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 2:
                ((Integer) obj2).intValue();
                ss.a((ps) obj3, (List) obj4, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 3:
                ((Integer) obj2).getClass();
                hma.q((bzc) obj4, (nq7) obj3, i3, (rv4) obj, xoe.p(393));
                return pvcVar2;
            case 4:
                ((Integer) obj2).getClass();
                ((tu1) obj4).b(obj3, (rv4) obj, xoe.p(i3) | 1);
                return pvcVar2;
            case 5:
                ((Integer) obj2).intValue();
                pye.a((i99) obj4, (lu4) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 6:
                ((Integer) obj2).getClass();
                pye.b((i99[]) obj4, (lu4) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 7:
                ((Integer) obj2).getClass();
                ((x42) obj4).d(i3, obj3, (rv4) obj, xoe.p(1));
                return pvcVar2;
            case 8:
                String str2 = (String) obj4;
                aw7 aw7Var3 = (aw7) obj3;
                rv4 rv4Var3 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(intValue2 & 1, z2)) {
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    tye.b(str2, f3, ((h27) rv4Var3.j(tzaVar)).b.j, ((h27) rv4Var3.j(tzaVar)).a.q, ((Boolean) aw7Var3.getValue()).booleanValue(), this.b, jce.E(1093258977, new sp0(aw7Var3, 2), rv4Var3), null, rv4Var3, 1572912, Token.CASE);
                } else {
                    rv4Var3.X();
                }
                return pvcVar2;
            case 9:
                ((Integer) obj2).getClass();
                iue.B((t14) obj4, kq7Var, (xt4) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 10:
                ((Integer) obj2).intValue();
                xm5.a((ou0) obj4, (zc2) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 11:
                ((Integer) obj2).getClass();
                do5.f((io5) obj4, (tu1) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 12:
                ((Integer) obj2).getClass();
                ((wf6) obj4).d(i3, obj3, (rv4) obj, xoe.p(1));
                return pvcVar2;
            case 13:
                th6 th6Var = (th6) obj4;
                rv4 rv4Var4 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var4.U(intValue3 & 1, z3)) {
                    th6Var.d(i3, obj3, rv4Var4, 0);
                } else {
                    rv4Var4.X();
                }
                return pvcVar2;
            case 14:
                ((Integer) obj2).getClass();
                ((si6) obj4).d(i3, obj3, (rv4) obj, xoe.p(1));
                return pvcVar2;
            case 15:
                ((Integer) obj2).getClass();
                ej6.d((nk6) obj4, (vt4) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 16:
                ((Integer) obj2).getClass();
                ((xj6) obj4).d(i3, obj3, (rv4) obj, xoe.p(1));
                return pvcVar2;
            case 17:
                aw7 aw7Var4 = (aw7) obj3;
                aw7 aw7Var5 = (aw7) obj4;
                rv4 rv4Var5 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var5.U(intValue4 & 1, z4)) {
                    sdd a = kv6.a(rv4Var5);
                    if (a != null) {
                        if (a instanceof y35) {
                            pb2Var = ((y35) a).f();
                        } else {
                            pb2Var = ob2.b;
                        }
                        aw7 z7 = jsc.z(((z81) ((fdd) voe.z(cm9.a(z81.class), a.i(), null, pb2Var, o96.a(rv4Var5), null))).d, rv4Var5);
                        nq7 g = c16.g(rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var5), 14), null, 3);
                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var5, 0);
                        int hashCode2 = Long.hashCode(rv4Var5.T);
                        xt8 l2 = rv4Var5.l();
                        nq7 p2 = lye.p(rv4Var5, g);
                        rw1.k.getClass();
                        zx1 zx1Var2 = qw1.b;
                        rv4Var5.i0();
                        if (rv4Var5.S) {
                            rv4Var5.k(zx1Var2);
                        } else {
                            rv4Var5.r0();
                        }
                        np npVar2 = qw1.f;
                        jce.F(npVar2, rv4Var5, a2);
                        np npVar3 = qw1.e;
                        jce.F(npVar3, rv4Var5, l2);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        np npVar4 = qw1.g;
                        jce.F(npVar4, rv4Var5, valueOf);
                        kg kgVar2 = qw1.h;
                        jce.C(kgVar2, rv4Var5);
                        np npVar5 = qw1.d;
                        jce.F(npVar5, rv4Var5, p2);
                        if (!((y81) z7.getValue()).a) {
                            rv4Var5.e0(-1043320012);
                            if (!((y81) z7.getValue()).b.isEmpty()) {
                                rv4Var5.e0(-1043257981);
                                pvcVar = pvcVar2;
                                nq7 z8 = zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 8.0f);
                                hz hzVar = new hz(8.0f, true, new vs(2));
                                hz hzVar2 = new hz(8.0f, true, new vs(2));
                                tu1 E = jce.E(1700962578, new pp0(z7, aw7Var4, 2), rv4Var5);
                                npVar = npVar4;
                                kgVar = kgVar2;
                                i = 3;
                                s9e.f(z8, hzVar, hzVar2, null, 0, 0, E, rv4Var5, 1573302);
                                rv4Var = rv4Var5;
                                z5 = false;
                                rv4Var.q(false);
                            } else {
                                rv4Var = rv4Var5;
                                pvcVar = pvcVar2;
                                kgVar = kgVar2;
                                npVar = npVar4;
                                i = 3;
                                z5 = false;
                                rv4Var.e0(-1042133611);
                                rv4Var.q(false);
                            }
                            rv4Var.q(z5);
                        } else {
                            rv4Var = rv4Var5;
                            pvcVar = pvcVar2;
                            kgVar = kgVar2;
                            npVar = npVar4;
                            i = 3;
                            z5 = false;
                            rv4Var.e0(-1042119723);
                            rv4Var.q(false);
                        }
                        nq7 f4 = hl5.f(kq7Var, 12.0f, rv4Var, kq7Var, 1.0f);
                        Object P8 = rv4Var.P();
                        if (P8 == lh9Var) {
                            P8 = new nd7(aw7Var5, i);
                            rv4Var.o0(P8);
                        }
                        nq7 t = q1d.t(1, (vt4) P8, rv4Var, f4, z5);
                        gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var, 48);
                        int hashCode3 = Long.hashCode(rv4Var.T);
                        xt8 l3 = rv4Var.l();
                        nq7 p3 = lye.p(rv4Var, t);
                        rv4Var.i0();
                        if (rv4Var.S) {
                            rv4Var.k(zx1Var2);
                        } else {
                            rv4Var.r0();
                        }
                        jce.F(npVar2, rv4Var, a3);
                        jce.F(npVar3, rv4Var, l3);
                        s21.t(hashCode3, rv4Var, npVar, rv4Var, kgVar);
                        jce.F(npVar5, rv4Var, p3);
                        boolean booleanValue = ((Boolean) aw7Var5.getValue()).booleanValue();
                        Object P9 = rv4Var.P();
                        if (P9 == lh9Var) {
                            P9 = new d07(aw7Var5, 9);
                            rv4Var.o0(P9);
                        }
                        ase.b(booleanValue, (xt4) P9, null, false, null, rv4Var, 48);
                        cvb.c(yqe.A(yz1.j(i3), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.j, rv4Var, 0, 0, 131070);
                        xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var, 12.0f));
                    } else {
                        vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                } else {
                    pvcVar = pvcVar2;
                    rv4Var5.X();
                }
                return pvcVar;
            case 18:
                aw7 aw7Var6 = (aw7) obj3;
                xt4 xt4Var3 = (xt4) obj4;
                rv4 rv4Var6 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z6 = true;
                }
                if (rv4Var6.U(intValue5 & 1, z6)) {
                    boolean f5 = rv4Var6.f(aw7Var6) | rv4Var6.d(i3) | rv4Var6.f(xt4Var3);
                    Object P10 = rv4Var6.P();
                    if (f5 || P10 == lh9Var) {
                        P10 = new sm7(i3, xt4Var3, aw7Var6);
                        rv4Var6.o0(P10);
                    }
                    nmd.j((vt4) P10, null, false, null, null, null, zr1.b, rv4Var6, 805306368, 510);
                } else {
                    rv4Var6.X();
                }
                return pvcVar2;
            case 19:
                ((Integer) obj2).getClass();
                p1d.b((String) obj4, (String) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 20:
                ((Integer) obj2).intValue();
                p1d.a((String) obj3, (List) obj4, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 21:
                ((Integer) obj2).getClass();
                ((gj8) obj4).d(i3, obj3, (rv4) obj, xoe.p(1));
                return pvcVar2;
            case 22:
                ((Integer) obj2).getClass();
                o28.n((vt4) obj4, i3, (tu1) obj3, (rv4) obj, xoe.p(391));
                return pvcVar2;
            case 23:
                ((Integer) obj2).intValue();
                cae.e((kj6) obj3, (List) obj4, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 24:
                ((Integer) obj2).intValue();
                ese.b((cz7) obj4, (at5) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 25:
                ((Integer) obj2).getClass();
                fbe.d((rp1) obj4, (nq7) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 26:
                ((Integer) obj2).getClass();
                xoe.d((uxa) obj4, (nq7) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            case 27:
                ((Integer) obj2).getClass();
                dpe.h((zxa) obj4, (nq7) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
            default:
                ((Integer) obj2).intValue();
                owe.c((d0b) obj4, (wza) obj3, (rv4) obj, xoe.p(i3 | 1));
                return pvcVar2;
        }
    }

    public /* synthetic */ gk7(int i, int i2, Object obj, Object obj2, boolean z) {
        this.a = i2;
        this.d = obj;
        this.c = obj2;
        this.b = i;
    }

    public /* synthetic */ gk7(int i, int i2, int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ gk7(t14 t14Var, xt4 xt4Var, int i) {
        this.a = 9;
        this.c = t14Var;
        this.d = xt4Var;
        this.b = i;
    }

    public /* synthetic */ gk7(bzc bzcVar, nq7 nq7Var, int i, int i2) {
        this.a = 3;
        this.c = bzcVar;
        this.d = nq7Var;
        this.b = i;
    }

    public /* synthetic */ gk7(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ gk7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
