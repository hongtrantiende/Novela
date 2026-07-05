package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rj7(vt4 vt4Var, xt4 xt4Var, yf0 yf0Var, nq7 nq7Var, int i) {
        this.a = 9;
        this.b = vt4Var;
        this.c = xt4Var;
        this.d = yf0Var;
        this.e = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        y3b y3bVar;
        boolean z2;
        dq4 dq4Var;
        boolean z3;
        long j;
        boolean z4;
        int i;
        long j2;
        long b;
        boolean z5;
        boolean z6;
        boolean z7;
        long j3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2 = this.a;
        dz dzVar = lz.a;
        kq7 kq7Var = kq7.a;
        lh9 lh9Var = ax1.a;
        int i3 = 2;
        boolean z11 = false;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.d;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                jbe.h((List) obj5, (String) obj6, (lu4) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 1:
                List list = (List) obj5;
                rj8 rj8Var = (rj8) obj6;
                xt4 xt4Var = (xt4) obj4;
                List list2 = (List) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            int ordinal = ((ds8) next).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        y3bVar = (y3b) s2b.u0.getValue();
                                    } else {
                                        xk5.o();
                                        return null;
                                    }
                                } else {
                                    y3bVar = (y3b) b3b.h.getValue();
                                }
                            } else {
                                y3bVar = (y3b) o3b.K.getValue();
                            }
                            if (rj8Var.k() == i4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            nq7 z12 = zbe.z(kq7Var, 12.0f, 4.0f);
                            boolean f = rv4Var.f(xt4Var) | rv4Var.d(i4);
                            Object P = rv4Var.P();
                            if (f || P == lh9Var) {
                                P = new tp0(xt4Var, i4, 8);
                                rv4Var.o0(P);
                            }
                            rj8 rj8Var2 = rj8Var;
                            nq7 t = q1d.t(1, (vt4) P, rv4Var, z12, false);
                            gv9 a = ev9.a(dzVar, kh5.G, rv4Var, 48);
                            dz dzVar2 = dzVar;
                            Iterator it2 = it;
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
                            String A = yqe.A(y3bVar, rv4Var);
                            oyb oybVar = r0f.A(rv4Var).j;
                            if (z2) {
                                dq4Var = dq4.D;
                            } else {
                                dq4Var = dq4.e;
                            }
                            dq4 dq4Var2 = dq4Var;
                            if (z2) {
                                rv4Var.e0(2117022575);
                                j = r0f.y(rv4Var).a;
                                z3 = false;
                            } else {
                                z3 = false;
                                rv4Var.e0(2117023825);
                                j = r0f.y(rv4Var).q;
                            }
                            rv4Var.q(z3);
                            rv4 rv4Var2 = rv4Var;
                            cvb.c(A, null, j, null, 0L, null, dq4Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 0, 0, 131002);
                            xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
                            if (i4 >= 0 && i4 < list2.size()) {
                                i = list2.get(i4);
                                z4 = false;
                            } else {
                                z4 = false;
                                i = 0;
                            }
                            String valueOf = String.valueOf(((Number) i).intValue());
                            if (z2) {
                                rv4Var2.e0(2117032335);
                                j2 = r0f.y(rv4Var2).a;
                            } else {
                                rv4Var2.e0(2117033585);
                                j2 = r0f.y(rv4Var2).q;
                            }
                            rv4Var2.q(z4);
                            long j4 = j2;
                            oyb oybVar2 = r0f.A(rv4Var2).o;
                            nq7 k = tte.k(kq7Var, uu9.a);
                            if (z2) {
                                rv4Var2.e0(1203793182);
                                b = zl1.b(0.2f, r0f.y(rv4Var2).a);
                                rv4Var2.q(false);
                            } else {
                                rv4Var2.e0(1203922204);
                                b = zl1.b(0.1f, r0f.y(rv4Var2).q);
                                rv4Var2.q(false);
                            }
                            cvb.c(valueOf, zbe.z(nmd.v(k, b, lre.g), 8.0f, 3.0f), j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var2, 0, 0, 131064);
                            rv4Var2.q(true);
                            it = it2;
                            rv4Var = rv4Var2;
                            i4 = i5;
                            dzVar = dzVar2;
                            rj8Var = rj8Var2;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                tvb tvbVar = (tvb) obj5;
                vt4 vt4Var = (vt4) obj6;
                sj8 sj8Var = (sj8) obj3;
                m82 m82Var = (m82) obj4;
                rv4 rv4Var3 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var3.U(intValue2 & 1, z5)) {
                    rv4Var3.e0(1169375071);
                    List list3 = tvbVar.b;
                    int size = list3.size();
                    int i6 = 0;
                    while (i6 < size) {
                        mvb mvbVar = (mvb) list3.get(i6);
                        if (i6 == sj8Var.k()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        nq7 k2 = tte.k(pna.j(kq7Var, 40.0f, nae.e, i3), uu9.a);
                        xt9 xt9Var = new xt9(4);
                        boolean h = rv4Var3.h(m82Var) | rv4Var3.f(sj8Var) | rv4Var3.d(i6);
                        List list4 = list3;
                        Object P2 = rv4Var3.P();
                        if (h || P2 == lh9Var) {
                            P2 = new en7(m82Var, sj8Var, i6, 0);
                            rv4Var3.o0(P2);
                        }
                        nq7 A2 = zbe.A(vte.r(k2, z6, xt9Var, (vt4) P2), 16.0f, nae.e, 2);
                        gv9 a2 = ev9.a(dzVar, kh5.F, rv4Var3, 0);
                        boolean z13 = z6;
                        int hashCode2 = Long.hashCode(rv4Var3.T);
                        xt8 l2 = rv4Var3.l();
                        nq7 p2 = lye.p(rv4Var3, A2);
                        rw1.k.getClass();
                        int i7 = size;
                        zx1 zx1Var2 = qw1.b;
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(zx1Var2);
                        } else {
                            rv4Var3.r0();
                        }
                        jce.F(qw1.f, rv4Var3, a2);
                        jce.F(qw1.e, rv4Var3, l2);
                        jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode2));
                        jce.C(qw1.h, rv4Var3);
                        jce.F(qw1.d, rv4Var3, p2);
                        String str = mvbVar.b;
                        if (z13) {
                            rv4Var3.e0(670215963);
                            j3 = ((h27) rv4Var3.j(j27.a)).a.a;
                            z7 = false;
                        } else {
                            z7 = false;
                            rv4Var3.e0(670217213);
                            j3 = ((h27) rv4Var3.j(j27.a)).a.q;
                        }
                        rv4Var3.q(z7);
                        long j5 = j3;
                        cvb.c(str, new k5d(kh5.G), j5, null, zr1.q(16), null, dq4.f, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var3.j(j27.a)).b.i, rv4Var3, 1597440, 24576, 114600);
                        rv4Var3.q(true);
                        i6++;
                        list3 = list4;
                        size = i7;
                        i3 = 2;
                        z11 = false;
                    }
                    rv4Var3.q(z11);
                    nq7 A3 = zbe.A(tte.k(pna.h(kq7Var, 40.0f), uu9.a), 16.0f, nae.e, 2);
                    boolean f2 = rv4Var3.f(vt4Var);
                    Object P3 = rv4Var3.P();
                    if (f2 || P3 == lh9Var) {
                        P3 = new hi7(28, vt4Var);
                        rv4Var3.o0(P3);
                    }
                    nq7 f3 = lbe.f(15, (vt4) P3, A3, null, false);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, f3);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var3);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d);
                    jce.F(qw1.e, rv4Var3, l3);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p3);
                    nk5.a(rp5.c((wk3) jk3.P.getValue(), rv4Var3, 0), null, pu0.a.a(zbe.y(pna.h(kq7Var, 40.0f), 10.0f), kh5.e), ((h27) rv4Var3.j(j27.a)).a.q, rv4Var3, 48, 0);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                ct8.c((ss8) obj5, (dt8) obj6, (cz7) obj3, (nq7) obj4, (rv4) obj, xoe.p(3073));
                return pvcVar;
            case 4:
                zb9 zb9Var = (zb9) obj5;
                aw7 aw7Var = (aw7) obj6;
                cz7 cz7Var = (cz7) obj3;
                aw7 aw7Var2 = (aw7) obj4;
                rv4 rv4Var4 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var4.U(intValue3 & 1, z8)) {
                    if (((wb9) aw7Var.getValue()).j) {
                        rv4Var4.e0(1482184505);
                        ar5 c = rp5.c((wk3) jk3.w.getValue(), rv4Var4, 0);
                        boolean f4 = rv4Var4.f(zb9Var);
                        Object P4 = rv4Var4.P();
                        if (f4 || P4 == lh9Var) {
                            P4 = new pb9(zb9Var, 3);
                            rv4Var4.o0(P4);
                        }
                        kwe.d(c, null, 0L, (vt4) P4, rv4Var4, 0, 6);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(1482382192);
                        boolean f5 = rv4Var4.f(aw7Var) | rv4Var4.f(zb9Var) | rv4Var4.f(cz7Var);
                        Object P5 = rv4Var4.P();
                        if (f5 || P5 == lh9Var) {
                            P5 = new rb9(zb9Var, cz7Var, aw7Var, aw7Var2, 0);
                            rv4Var4.o0(P5);
                        }
                        kwe.a(0, (vt4) P5, rv4Var4, null);
                        rv4Var4.q(false);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                gue.g((ida) obj5, (String) obj6, (nq7) obj3, (vt4) obj4, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 6:
                ((Integer) obj2).getClass();
                oue.a((List) obj5, (nq7) obj6, (xt4) obj4, (xt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 7:
                ((Integer) obj2).getClass();
                tl1.d((cia) obj5, (nq7) obj6, (xt4) obj4, (xt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 8:
                ((Integer) obj2).getClass();
                owe.b((vl6) obj5, (qq0) obj6, (wza) obj3, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 9:
                ((Integer) obj2).getClass();
                tte.f((vt4) obj5, (xt4) obj4, (yf0) obj6, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 10:
                ((Integer) obj2).getClass();
                xxe.c((pmb) obj5, (nq7) obj6, (vt4) obj3, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 11:
                aw7 aw7Var3 = (aw7) obj5;
                isb isbVar = (isb) obj6;
                rh8 rh8Var = (rh8) obj3;
                tu1 tu1Var = (tu1) obj4;
                rv4 rv4Var5 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var5.U(intValue4 & 1, z9)) {
                    nq7 t2 = ote.t(bze.o(kq7Var, "Container"), new nq3(24, new r89(aw7Var3, aw7.class, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;", 0), rh8Var, dxe.u(isbVar)));
                    b37 d2 = fu0.d(kh5.a, true);
                    int hashCode4 = Long.hashCode(rv4Var5.T);
                    xt8 l4 = rv4Var5.l();
                    nq7 p4 = lye.p(rv4Var5, t2);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var4);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(qw1.f, rv4Var5, d2);
                    jce.F(qw1.e, rv4Var5, l4);
                    jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var5);
                    jce.F(qw1.d, rv4Var5, p4);
                    tu1Var.invoke(rv4Var5, 0);
                    rv4Var5.q(true);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 12:
                ((Integer) obj2).getClass();
                sye.f((pub) obj5, (nq7) obj6, (vt4) obj3, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 13:
                ((Integer) obj2).getClass();
                zj0.a((m32) obj5, (nq7) obj6, (vt4) obj3, (vt4) obj4, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 14:
                shc shcVar = (shc) obj6;
                w43 w43Var = (w43) obj3;
                List list5 = (List) obj5;
                aw7 aw7Var4 = (aw7) obj4;
                rv4 rv4Var6 = (rv4) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z11 = true;
                }
                if (rv4Var6.U(intValue5 & 1, z11)) {
                    boolean z14 = ((phc) aw7Var4.getValue()).f;
                    boolean f6 = rv4Var6.f(shcVar);
                    Object P6 = rv4Var6.P();
                    if (f6 || P6 == lh9Var) {
                        wob wobVar = new wob(1, shcVar, shc.class, "changeSort", "changeSort(Z)V", 0, 20);
                        rv4Var6.o0(wobVar);
                        P6 = wobVar;
                    }
                    rgc.p(w43Var, list5, z14, zbe.C(kq7.a, nae.e, nae.e, nae.e, 14.0f, 7), (xt4) ((i76) P6), rv4Var6, 3080);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 15:
                w43 w43Var2 = (w43) obj5;
                cz7 cz7Var2 = (cz7) obj6;
                shc shcVar2 = (shc) obj3;
                p59 p59Var = (p59) obj4;
                rv4 rv4Var7 = (rv4) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var7.U(intValue6 & 1, z10)) {
                    List list6 = w43Var2.n;
                    boolean f7 = rv4Var7.f(cz7Var2);
                    Object P7 = rv4Var7.P();
                    if (f7 || P7 == lh9Var) {
                        P7 = new ynb(cz7Var2, 2);
                        rv4Var7.o0(P7);
                    }
                    xt4 xt4Var2 = (xt4) P7;
                    boolean f8 = rv4Var7.f(shcVar2);
                    Object P8 = rv4Var7.P();
                    if (f8 || P8 == lh9Var) {
                        P8 = new wob(1, shcVar2, shc.class, "handleLink", "handleLink(Ljava/lang/String;)V", 0, 19);
                        rv4Var7.o0(P8);
                    }
                    xt4 xt4Var3 = (xt4) ((i76) P8);
                    boolean f9 = rv4Var7.f(p59Var);
                    Object P9 = rv4Var7.P();
                    if (f9 || P9 == lh9Var) {
                        P9 = new r93(p59Var, 3, (byte) 0);
                        rv4Var7.o0(P9);
                    }
                    jsc.d(list6, false, null, xt4Var2, xt4Var3, (lu4) P9, rv4Var7, 0, 6);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                eg0.m((String) obj6, (ArrayList) obj5, (xt4) obj4, (nq7) obj3, (rv4) obj, xoe.p(3073));
                return pvcVar;
        }
    }

    public /* synthetic */ rj7(shc shcVar, w43 w43Var, List list, aw7 aw7Var) {
        this.a = 14;
        this.d = shcVar;
        this.e = w43Var;
        this.b = list;
        this.c = aw7Var;
    }

    public /* synthetic */ rj7(Object obj, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = nq7Var;
        this.c = xt4Var;
        this.e = xt4Var2;
    }

    public /* synthetic */ rj7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    public /* synthetic */ rj7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    public /* synthetic */ rj7(String str, ArrayList arrayList, xt4 xt4Var, nq7 nq7Var, int i) {
        this.a = 16;
        this.d = str;
        this.b = arrayList;
        this.c = xt4Var;
        this.e = nq7Var;
    }

    public /* synthetic */ rj7(List list, rj8 rj8Var, xt4 xt4Var, List list2) {
        this.a = 1;
        this.b = list;
        this.d = rj8Var;
        this.c = xt4Var;
        this.e = list2;
    }
}
