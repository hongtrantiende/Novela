package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u32  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u32 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u32(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        lh9 lh9Var;
        int i;
        eb ebVar = (eb) this.b;
        yya yyaVar = (yya) this.c;
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
        boolean z2 = true;
        if ((i2 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            za zaVar = (za) yyaVar.getValue();
            if (!zaVar.a && !zaVar.b) {
                z2 = false;
            }
            List<t9> list = ((za) yyaVar.getValue()).d;
            Map map = ((za) yyaVar.getValue()).f;
            l9 l9Var = ((za) yyaVar.getValue()).g;
            String str = ((za) yyaVar.getValue()).h;
            boolean f = rv4Var.f(((za) yyaVar.getValue()).e) | rv4Var.f(list);
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            ArrayList arrayList = P;
            if (f || P == lh9Var2) {
                ArrayList arrayList2 = new ArrayList(tl1.s(list, 10));
                for (t9 t9Var : list) {
                    arrayList2.add(t9Var.a);
                }
                Set H0 = sl1.H0(arrayList2);
                List list2 = ((za) yyaVar.getValue()).e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list2) {
                    if (!H0.contains(((fb) obj5).a)) {
                        arrayList3.add(obj5);
                    }
                }
                rv4Var.o0(arrayList3);
                arrayList = arrayList3;
            }
            List list3 = (List) arrayList;
            if (z2) {
                rv4Var.e0(1627442021);
                w92.i(l9Var, rh8Var, null, rv4Var, i2 & Token.ASSIGN_MOD);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1627610413);
                boolean f2 = rv4Var.f(ebVar);
                Object P2 = rv4Var.P();
                if (!f2 && P2 != lh9Var2) {
                    lh9Var = lh9Var2;
                } else {
                    lh9Var = lh9Var2;
                    m0 m0Var = new m0(1, ebVar, eb.class, "downloadModel", "downloadModel(Lcom/reader/data/reader/text/core/tts/engine/ai/model/AiTtsRemoteModel;)V", 0, 1);
                    rv4Var.o0(m0Var);
                    P2 = m0Var;
                }
                xt4 xt4Var = (xt4) ((i76) P2);
                boolean f3 = rv4Var.f(ebVar);
                Object P3 = rv4Var.P();
                if (f3 || P3 == lh9Var) {
                    m0 m0Var2 = new m0(1, ebVar, eb.class, "deleteModel", "deleteModel(Ljava/lang/String;)V", 0, 2);
                    rv4Var.o0(m0Var2);
                    P3 = m0Var2;
                }
                w92.h(list, list3, map, str, rh8Var, xt4Var, (xt4) ((i76) P3), null, rv4Var, (i2 << 9) & 57344);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        uo4 uo4Var = (uo4) this.b;
        yya yyaVar = (yya) this.c;
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
            bkd r = mwe.r(mwe.r(rh8Var, mwe.f(14, rv4Var, false)), zbe.j(nae.e, nae.e, nae.e, 72.0f, 7));
            List list = ((to4) yyaVar.getValue()).a;
            nq7 f = pna.f(kq7.a, 1.0f);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new tn4(1);
                rv4Var.o0(P);
            }
            xt4 xt4Var = (xt4) P;
            boolean f2 = rv4Var.f(uo4Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new po4(uo4Var, 1);
                rv4Var.o0(P2);
            }
            xt4 xt4Var2 = (xt4) P2;
            boolean f3 = rv4Var.f(uo4Var);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new po4(uo4Var, 2);
                rv4Var.o0(P3);
            }
            twe.b("-", list, r, f, xt4Var, xt4Var2, (xt4) P3, rv4Var, 27654);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x031f, code lost:
        if (r0 > 1.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0321, code lost:
        r4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0323, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x032e, code lost:
        if (r0 < 1.0f) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.e(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        f99 f99Var;
        float f;
        int i3;
        boolean z7;
        int i4;
        boolean z8;
        boolean z9;
        boolean z10;
        int i5;
        boolean z11;
        int i6;
        boolean z12;
        int i7;
        zqc zqcVar;
        int i8;
        int i9;
        boolean z13;
        int i10;
        int i11 = this.a;
        pu0 pu0Var = pu0.a;
        kq7 kq7Var = kq7.a;
        Object obj5 = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        boolean z14 = false;
        switch (i11) {
            case 0:
                final h42 h42Var = (h42) obj7;
                yya yyaVar = (yya) obj6;
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
                    boolean z15 = ((c42) yyaVar.getValue()).a;
                    boolean z16 = ((c42) yyaVar.getValue()).b;
                    List list = ((c42) yyaVar.getValue()).c;
                    ze4 ze4Var = pna.c;
                    boolean f2 = rv4Var.f(h42Var);
                    Object P = rv4Var.P();
                    if (f2 || P == obj5) {
                        P = new xt4() { // from class: v32
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj8) {
                                int i12 = r2;
                                pvc pvcVar2 = pvc.a;
                                h42 h42Var2 = h42Var;
                                switch (i12) {
                                    case 0:
                                        boolean booleanValue = ((Boolean) obj8).booleanValue();
                                        hk1 a = jdd.a(h42Var2);
                                        sw2 sw2Var = ab3.a;
                                        h42Var2.f(a, ru2.c, new f42(h42Var2, booleanValue, null, 1));
                                        return pvcVar2;
                                    case 1:
                                        boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                        hk1 a2 = jdd.a(h42Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        h42Var2.f(a2, ru2.c, new f42(h42Var2, booleanValue2, null, 0));
                                        return pvcVar2;
                                    default:
                                        List list2 = (List) obj8;
                                        list2.getClass();
                                        hk1 a3 = jdd.a(h42Var2);
                                        sw2 sw2Var3 = ab3.a;
                                        h42Var2.f(a3, ru2.c, new cv0(h42Var2, list2, null, 17));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P);
                    }
                    xt4 xt4Var = (xt4) P;
                    boolean f3 = rv4Var.f(h42Var);
                    Object P2 = rv4Var.P();
                    if (f3 || P2 == obj5) {
                        P2 = new xt4() { // from class: v32
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj8) {
                                int i12 = r2;
                                pvc pvcVar2 = pvc.a;
                                h42 h42Var2 = h42Var;
                                switch (i12) {
                                    case 0:
                                        boolean booleanValue = ((Boolean) obj8).booleanValue();
                                        hk1 a = jdd.a(h42Var2);
                                        sw2 sw2Var = ab3.a;
                                        h42Var2.f(a, ru2.c, new f42(h42Var2, booleanValue, null, 1));
                                        return pvcVar2;
                                    case 1:
                                        boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                        hk1 a2 = jdd.a(h42Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        h42Var2.f(a2, ru2.c, new f42(h42Var2, booleanValue2, null, 0));
                                        return pvcVar2;
                                    default:
                                        List list2 = (List) obj8;
                                        list2.getClass();
                                        hk1 a3 = jdd.a(h42Var2);
                                        sw2 sw2Var3 = ab3.a;
                                        h42Var2.f(a3, ru2.c, new cv0(h42Var2, list2, null, 17));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P2);
                    }
                    xt4 xt4Var2 = (xt4) P2;
                    boolean f4 = rv4Var.f(h42Var);
                    Object P3 = rv4Var.P();
                    if (f4 || P3 == obj5) {
                        P3 = new xt4() { // from class: v32
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj8) {
                                int i12 = r2;
                                pvc pvcVar2 = pvc.a;
                                h42 h42Var2 = h42Var;
                                switch (i12) {
                                    case 0:
                                        boolean booleanValue = ((Boolean) obj8).booleanValue();
                                        hk1 a = jdd.a(h42Var2);
                                        sw2 sw2Var = ab3.a;
                                        h42Var2.f(a, ru2.c, new f42(h42Var2, booleanValue, null, 1));
                                        return pvcVar2;
                                    case 1:
                                        boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                        hk1 a2 = jdd.a(h42Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        h42Var2.f(a2, ru2.c, new f42(h42Var2, booleanValue2, null, 0));
                                        return pvcVar2;
                                    default:
                                        List list2 = (List) obj8;
                                        list2.getClass();
                                        hk1 a3 = jdd.a(h42Var2);
                                        sw2 sw2Var3 = ab3.a;
                                        h42Var2.f(a3, ru2.c, new cv0(h42Var2, list2, null, 17));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P3);
                    }
                    lpe.c(z15, z16, list, rh8Var, ze4Var, xt4Var, xt4Var2, (xt4) P3, rv4Var, ((intValue << 6) & 7168) | 24576);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                xt4 xt4Var3 = (xt4) obj7;
                List list2 = (List) obj6;
                int intValue2 = ((Integer) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((yj6) obj).getClass();
                if ((intValue3 & 48) == 0) {
                    if (rv4Var2.d(intValue2)) {
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
                    nq7 y = zbe.y(pna.c, 4.0f);
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(tte.k(y, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), lre.g);
                    boolean f5 = rv4Var2.f(xt4Var3) | rv4Var2.h(list2);
                    if ((intValue3 & Token.ASSIGN_MOD) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z17 = z3 | f5;
                    Object P4 = rv4Var2.P();
                    if (!z17 && P4 != obj5) {
                        z4 = false;
                    } else {
                        z4 = false;
                        P4 = new c83(intValue2, 0, xt4Var3, list2);
                        rv4Var2.o0(P4);
                    }
                    nq7 z18 = zbe.z(q1d.b(v, z4, nae.e, (vt4) P4, 3), 12.0f, 10.0f);
                    b37 d = fu0.d(kh5.a, z4);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, z18);
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
                    cvb.c(((ww4) list2.get(intValue2)).a, pu0Var.a(pna.f(kq7Var, 1.0f), kh5.e), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.i, rv4Var2, 0, 0, 130044);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                pvc pvcVar2 = pvcVar;
                Object obj8 = (rq4) obj7;
                yya yyaVar2 = (yya) obj6;
                rh8 rh8Var2 = (rh8) obj2;
                rv4 rv4Var3 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                nk0 nk0Var = kh5.e;
                ((ou0) obj).getClass();
                rh8Var2.getClass();
                if ((intValue4 & 48) == 0) {
                    if (rv4Var3.f(rh8Var2)) {
                        i3 = 32;
                    } else {
                        i3 = 16;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & Token.TARGET) != 144) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var3.U(intValue4 & 1, z5)) {
                    Object[] objArr = new Object[0];
                    Object P5 = rv4Var3.P();
                    if (P5 == obj5) {
                        P5 = new k24(16);
                        rv4Var3.o0(P5);
                    }
                    aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P5, rv4Var3, 48);
                    Object P6 = rv4Var3.P();
                    if (P6 == obj5) {
                        P6 = s21.e(rv4Var3);
                    }
                    zm4 zm4Var = (zm4) P6;
                    nq7 y2 = zbe.y(rte.C(q1d.l(zbe.x(mwe.x(pna.c, 14), rh8Var2), rv4Var3, 0), rte.u(rv4Var3), 14), 24.0f);
                    xn1 a = wn1.a(lz.d, kh5.I, rv4Var3, 6);
                    int hashCode2 = Long.hashCode(rv4Var3.T);
                    xt8 l2 = rv4Var3.l();
                    nq7 p2 = lye.p(rv4Var3, y2);
                    rw1.k.getClass();
                    vt4 vt4Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(vt4Var);
                    } else {
                        rv4Var3.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var3, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var3, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var3, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var3);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var3, p2);
                    String str = (String) aw7Var.getValue();
                    t86 t86Var = new t86(0, 6, Token.INC);
                    f99 f99Var2 = j27.a;
                    v72 v72Var = ((h27) rv4Var3.j(f99Var2)).c.b;
                    nq7 f6 = pna.f(mwe.n(kq7Var, zm4Var), 1.0f);
                    boolean f7 = rv4Var3.f(aw7Var);
                    Object P7 = rv4Var3.P();
                    if (f7 || P7 == obj5) {
                        P7 = new qp4(aw7Var, 1);
                        rv4Var3.o0(P7);
                    }
                    uwe.h(str, (xt4) P7, f6, false, false, null, kue.a, null, kue.b, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var3, 102236160, 12779520, 6127288);
                    Object P8 = rv4Var3.P();
                    if (P8 == obj5) {
                        P8 = new l24(zm4Var, null, 1);
                        rv4Var3.o0(P8);
                    }
                    yte.g((lu4) P8, rv4Var3, pvcVar2);
                    if (((String) nk2.p(kq7Var, 24.0f, rv4Var3, aw7Var)).length() > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    nq7 k = tte.k(pna.n(kq7Var, 56.0f), uu9.a);
                    pvcVar2 = pvcVar2;
                    long j = ((h27) rv4Var3.j(f99Var2)).a.a;
                    if (z6) {
                        f99Var = f99Var2;
                        f = 1.0f;
                    } else {
                        f99Var = f99Var2;
                        f = 0.5f;
                    }
                    nq7 a0 = nmd.v(k, zl1.b(f, j), lre.g).a0(new l95(kh5.K));
                    boolean f8 = rv4Var3.f(obj8) | rv4Var3.f(aw7Var);
                    Object P9 = rv4Var3.P();
                    if (f8 || P9 == obj5) {
                        P9 = new u93(18, obj8, aw7Var);
                        rv4Var3.o0(P9);
                    }
                    nq7 f9 = lbe.f(14, (vt4) P9, a0, null, z6);
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, f9);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(vt4Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, d2);
                    jce.F(npVar2, rv4Var3, l3);
                    s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p3);
                    if (((pq4) yyaVar2.getValue()).a) {
                        rv4Var3.e0(-783638292);
                        ts6.a(nae.e, 0, 2, ((h27) rv4Var3.j(f99Var)).a.b, rv4Var3, pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var));
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(-783370607);
                        nk5.a(rp5.c((wk3) jk3.d.getValue(), rv4Var3, 0), yqe.A((y3b) x2b.N.getValue(), rv4Var3), tte.t(pu0Var.a(pna.n(kq7Var, 24.0f), nk0Var), 180.0f), ((h27) rv4Var3.j(f99Var)).a.b, rv4Var3, 0, 0);
                        rv4Var3.q(false);
                    }
                    rv4Var3.q(true);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar2;
            case 3:
                xb6 xb6Var = (xb6) obj7;
                yya yyaVar3 = (yya) obj6;
                rh8 rh8Var3 = (rh8) obj2;
                rv4 rv4Var4 = (rv4) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var3.getClass();
                if ((intValue5 & 48) == 0) {
                    if (rv4Var4.f(rh8Var3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    intValue5 |= i4;
                }
                if ((intValue5 & Token.TARGET) != 144) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var4.U(intValue5 & 1, z7)) {
                    wb6 wb6Var = (wb6) yyaVar3.getValue();
                    ze4 ze4Var2 = pna.c;
                    boolean f10 = rv4Var4.f(xb6Var);
                    Object P10 = rv4Var4.P();
                    if (f10 || P10 == obj5) {
                        P10 = new mz1(1, xb6Var, xb6.class, "changeLanguage", "changeLanguage(Ljava/lang/String;)V", 0, 28);
                        rv4Var4.o0(P10);
                    }
                    vye.a(rh8Var3, wb6Var, ze4Var2, (xt4) ((i76) P10), rv4Var4, 384 | ((intValue5 >> 3) & 14));
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                tvb tvbVar = (tvb) obj7;
                xt4 xt4Var4 = (xt4) obj6;
                int intValue6 = ((Integer) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((jj8) obj).getClass();
                if ((intValue7 & 48) == 0) {
                    if (rv4Var5.d(intValue6)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    intValue7 |= i5;
                }
                if ((intValue7 & Token.TARGET) != 144) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var5.U(intValue7 & 1, z8)) {
                    mvb mvbVar = (mvb) tvbVar.b.get(intValue6);
                    lhd w = sve.w(null, rv4Var5, 1);
                    nq7 v2 = nmd.v(tte.k(kq7Var, r0f.z(rv4Var5).c), r0f.y(rv4Var5).p, lre.g);
                    xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var5, 0);
                    int hashCode4 = Long.hashCode(rv4Var5.T);
                    xt8 l4 = rv4Var5.l();
                    nq7 p4 = lye.p(rv4Var5, v2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var2);
                    } else {
                        rv4Var5.r0();
                    }
                    np npVar5 = qw1.f;
                    jce.F(npVar5, rv4Var5, a2);
                    np npVar6 = qw1.e;
                    jce.F(npVar6, rv4Var5, l4);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    np npVar7 = qw1.g;
                    jce.F(npVar7, rv4Var5, valueOf2);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var5);
                    np npVar8 = qw1.d;
                    jce.F(npVar8, rv4Var5, p4);
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), nae.e, 6.0f, 1);
                    gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var5, 48);
                    int hashCode5 = Long.hashCode(rv4Var5.T);
                    xt8 l5 = rv4Var5.l();
                    nq7 p5 = lye.p(rv4Var5, A);
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var2);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(npVar5, rv4Var5, a3);
                    jce.F(npVar6, rv4Var5, l5);
                    s21.t(hashCode5, rv4Var5, npVar7, rv4Var5, kgVar2);
                    jce.F(npVar8, rv4Var5, p5);
                    xbe.i(rv4Var5, pna.s(kq7Var, 6.0f));
                    ar5 c = rp5.c((wk3) jk3.w.getValue(), rv4Var5, 0);
                    String A2 = yqe.A((y3b) f2b.q0.getValue(), rv4Var5);
                    long j2 = r0f.y(rv4Var5).q;
                    nq7 k2 = tte.k(pna.n(kq7Var, 40.0f), uu9.a);
                    boolean f11 = rv4Var5.f(xt4Var4);
                    Object P11 = rv4Var5.P();
                    if (f11 || P11 == obj5) {
                        P11 = new hg7(28, xt4Var4);
                        rv4Var5.o0(P11);
                    }
                    nk5.a(c, A2, zbe.y(lbe.f(15, (vt4) P11, k2, null, false), 8.0f), j2, rv4Var5, 0, 0);
                    cvb.c((String) w.e.getValue(), new we6(1.0f, true), r0f.y(rv4Var5).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, r0f.A(rv4Var5).i, rv4Var5, 0, 24960, 109560);
                    nq7 n = pna.n(kq7Var, 40.0f);
                    b37 d3 = fu0.d(kh5.a, false);
                    int hashCode6 = Long.hashCode(rv4Var5.T);
                    xt8 l6 = rv4Var5.l();
                    nq7 p6 = lye.p(rv4Var5, n);
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var2);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(npVar5, rv4Var5, d3);
                    jce.F(npVar6, rv4Var5, l6);
                    s21.t(hashCode6, rv4Var5, npVar7, rv4Var5, kgVar2);
                    jce.F(npVar8, rv4Var5, p6);
                    if (w.j()) {
                        rv4Var5.e0(-82744556);
                        ts6.a(2.0f, 48, 0, r0f.y(rv4Var5).q, rv4Var5, pna.n(pu0Var.a(kq7Var, kh5.e), 20.0f));
                        rv4Var5.q(false);
                    } else {
                        rv4Var5.e0(-82334209);
                        rv4Var5.q(false);
                    }
                    s21.x(rv4Var5, true, kq7Var, 6.0f, rv4Var5);
                    rv4Var5.q(true);
                    vqe.m(nae.e, 6, 6, 0L, rv4Var5, pna.f(kq7Var, 1.0f));
                    ze4 ze4Var3 = pna.c;
                    yy9 yy9Var = lhd.n;
                    xve.g(w, ze4Var3, null, rv4Var5, 56);
                    boolean h = rv4Var5.h(w) | rv4Var5.h(mvbVar) | rv4Var5.f(tvbVar);
                    Object P12 = rv4Var5.P();
                    if (h || P12 == obj5) {
                        P12 = new qq4(w, mvbVar, tvbVar, (m42) null, 23);
                        rv4Var5.o0(P12);
                    }
                    yte.g((lu4) P12, rv4Var5, mvbVar);
                    if (nm3.c(rv4Var5).d()) {
                        rv4Var5.e0(803501010);
                        z9 = !nm3.c(rv4Var5).e();
                        rv4Var5.q(false);
                    } else {
                        rv4Var5.e0(-861271229);
                        rv4Var5.q(false);
                        z9 = false;
                    }
                    Boolean valueOf3 = Boolean.valueOf(z9);
                    boolean h2 = rv4Var5.h(w) | rv4Var5.g(z9);
                    Object P13 = rv4Var5.P();
                    if (!h2 && P13 != obj5) {
                        z10 = true;
                    } else {
                        z10 = true;
                        P13 = new gx0(w, z9, null, 1);
                        rv4Var5.o0(P13);
                    }
                    yte.g((lu4) P13, rv4Var5, valueOf3);
                    rv4Var5.q(z10);
                    return pvcVar;
                }
                rv4Var5.X();
                return pvcVar;
            case 5:
                final n58 n58Var = (n58) obj7;
                yya yyaVar4 = (yya) obj6;
                rh8 rh8Var4 = (rh8) obj2;
                rv4 rv4Var6 = (rv4) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var4.getClass();
                if ((intValue8 & 48) == 0) {
                    if (rv4Var6.f(rh8Var4)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    intValue8 |= i6;
                }
                if ((intValue8 & Token.TARGET) != 144) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (rv4Var6.U(intValue8 & 1, z11)) {
                    p58 p58Var = (p58) yyaVar4.getValue();
                    nq7 u = mwe.u(pna.c, false, 14);
                    boolean f12 = rv4Var6.f(n58Var);
                    Object P14 = rv4Var6.P();
                    if (f12 || P14 == obj5) {
                        P14 = new xt4() { // from class: j58
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar3 = pvc.a;
                                n58 n58Var2 = n58Var;
                                switch (i12) {
                                    case 0:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 0));
                                        return pvcVar3;
                                    case 1:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 1));
                                        return pvcVar3;
                                    case 2:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 2));
                                        return pvcVar3;
                                    case 3:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 3));
                                        return pvcVar3;
                                    case 4:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 0));
                                        return pvcVar3;
                                    default:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 1));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var6.o0(P14);
                    }
                    xt4 xt4Var5 = (xt4) P14;
                    boolean f13 = rv4Var6.f(n58Var);
                    Object P15 = rv4Var6.P();
                    if (f13 || P15 == obj5) {
                        P15 = new xt4() { // from class: j58
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar3 = pvc.a;
                                n58 n58Var2 = n58Var;
                                switch (i12) {
                                    case 0:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 0));
                                        return pvcVar3;
                                    case 1:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 1));
                                        return pvcVar3;
                                    case 2:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 2));
                                        return pvcVar3;
                                    case 3:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 3));
                                        return pvcVar3;
                                    case 4:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 0));
                                        return pvcVar3;
                                    default:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 1));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var6.o0(P15);
                    }
                    xt4 xt4Var6 = (xt4) P15;
                    boolean f14 = rv4Var6.f(n58Var);
                    Object P16 = rv4Var6.P();
                    if (f14 || P16 == obj5) {
                        P16 = new xt4() { // from class: j58
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar3 = pvc.a;
                                n58 n58Var2 = n58Var;
                                switch (i12) {
                                    case 0:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 0));
                                        return pvcVar3;
                                    case 1:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 1));
                                        return pvcVar3;
                                    case 2:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 2));
                                        return pvcVar3;
                                    case 3:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 3));
                                        return pvcVar3;
                                    case 4:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 0));
                                        return pvcVar3;
                                    default:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 1));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var6.o0(P16);
                    }
                    xt4 xt4Var7 = (xt4) P16;
                    boolean f15 = rv4Var6.f(n58Var);
                    Object P17 = rv4Var6.P();
                    if (f15 || P17 == obj5) {
                        P17 = new xt4() { // from class: j58
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar3 = pvc.a;
                                n58 n58Var2 = n58Var;
                                switch (i12) {
                                    case 0:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 0));
                                        return pvcVar3;
                                    case 1:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 1));
                                        return pvcVar3;
                                    case 2:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 2));
                                        return pvcVar3;
                                    case 3:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 3));
                                        return pvcVar3;
                                    case 4:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 0));
                                        return pvcVar3;
                                    default:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 1));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var6.o0(P17);
                    }
                    xt4 xt4Var8 = (xt4) P17;
                    boolean f16 = rv4Var6.f(n58Var);
                    Object P18 = rv4Var6.P();
                    if (f16 || P18 == obj5) {
                        P18 = new xt4() { // from class: j58
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar3 = pvc.a;
                                n58 n58Var2 = n58Var;
                                switch (i12) {
                                    case 0:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 0));
                                        return pvcVar3;
                                    case 1:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 1));
                                        return pvcVar3;
                                    case 2:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 2));
                                        return pvcVar3;
                                    case 3:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 3));
                                        return pvcVar3;
                                    case 4:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 0));
                                        return pvcVar3;
                                    default:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 1));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var6.o0(P18);
                    }
                    xt4 xt4Var9 = (xt4) P18;
                    boolean f17 = rv4Var6.f(n58Var);
                    Object P19 = rv4Var6.P();
                    if (f17 || P19 == obj5) {
                        P19 = new xt4() { // from class: j58
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i12 = r2;
                                pvc pvcVar3 = pvc.a;
                                n58 n58Var2 = n58Var;
                                switch (i12) {
                                    case 0:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 0));
                                        return pvcVar3;
                                    case 1:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 1));
                                        return pvcVar3;
                                    case 2:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 2));
                                        return pvcVar3;
                                    case 3:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new l58(n58Var2, ((Boolean) obj9).booleanValue(), null, 3));
                                        return pvcVar3;
                                    case 4:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 0));
                                        return pvcVar3;
                                    default:
                                        fdd.g(n58Var2, jdd.a(n58Var2), new m58(n58Var2, ((Integer) obj9).intValue(), null, 1));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var6.o0(P19);
                    }
                    fbe.p(p58Var, rh8Var4, u, xt4Var5, xt4Var6, xt4Var7, xt4Var8, xt4Var9, (xt4) P19, rv4Var6, intValue8 & Token.ASSIGN_MOD);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 6:
                cta ctaVar = (cta) obj7;
                yya yyaVar5 = (yya) obj6;
                rh8 rh8Var5 = (rh8) obj2;
                rv4 rv4Var7 = (rv4) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var5.getClass();
                if ((intValue9 & 48) == 0) {
                    if (rv4Var7.f(rh8Var5)) {
                        i7 = 32;
                    } else {
                        i7 = 16;
                    }
                    intValue9 |= i7;
                }
                if ((intValue9 & Token.TARGET) != 144) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rv4Var7.U(intValue9 & 1, z12)) {
                    ysa ysaVar = (ysa) yyaVar5.getValue();
                    ze4 ze4Var4 = pna.c;
                    boolean f18 = rv4Var7.f(ctaVar);
                    Object P20 = rv4Var7.P();
                    if (f18 || P20 == obj5) {
                        P20 = new wsa(ctaVar, 0);
                        rv4Var7.o0(P20);
                    }
                    vt4 vt4Var2 = (vt4) P20;
                    boolean f19 = rv4Var7.f(ctaVar);
                    Object P21 = rv4Var7.P();
                    if (f19 || P21 == obj5) {
                        P21 = new wsa(ctaVar, 1);
                        rv4Var7.o0(P21);
                    }
                    hbe.O(ysaVar, ze4Var4, rh8Var5, vt4Var2, (vt4) P21, rv4Var7, ((intValue9 << 3) & 896) | 48);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 7:
                zqc zqcVar2 = (zqc) obj7;
                yya yyaVar6 = (yya) obj6;
                rh8 rh8Var6 = (rh8) obj2;
                rv4 rv4Var8 = (rv4) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var6.getClass();
                if ((intValue10 & 48) == 0) {
                    if (rv4Var8.f(rh8Var6)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    intValue10 |= i8;
                }
                int i12 = intValue10;
                if ((i12 & Token.TARGET) != 144) {
                    z14 = true;
                }
                if (rv4Var8.U(i12 & 1, z14)) {
                    wqc wqcVar = (wqc) yyaVar6.getValue();
                    ze4 ze4Var5 = pna.c;
                    boolean f20 = rv4Var8.f(zqcVar2);
                    Object P22 = rv4Var8.P();
                    if (!f20 && P22 != obj5) {
                        zqcVar = zqcVar2;
                    } else {
                        zqcVar = zqcVar2;
                        Object wobVar = new wob(1, zqcVar, zqc.class, "changeTurnByTouch", "changeTurnByTouch(I)V", 0, 25);
                        rv4Var8.o0(wobVar);
                        P22 = wobVar;
                    }
                    xt4 xt4Var10 = (xt4) ((i76) P22);
                    boolean f21 = rv4Var8.f(zqcVar);
                    Object P23 = rv4Var8.P();
                    if (f21 || P23 == obj5) {
                        Object wobVar2 = new wob(1, zqcVar, zqc.class, "changeTouchMode", "changeTouchMode(I)V", 0, 26);
                        rv4Var8.o0(wobVar2);
                        P23 = wobVar2;
                    }
                    xt4 xt4Var11 = (xt4) ((i76) P23);
                    boolean f22 = rv4Var8.f(zqcVar);
                    Object P24 = rv4Var8.P();
                    if (f22 || P24 == obj5) {
                        Object wobVar3 = new wob(1, zqcVar, zqc.class, "changeTurnByKeyboard", "changeTurnByKeyboard(Z)V", 0, 27);
                        rv4Var8.o0(wobVar3);
                        P24 = wobVar3;
                    }
                    xt4 xt4Var12 = (xt4) ((i76) P24);
                    boolean f23 = rv4Var8.f(zqcVar);
                    Object P25 = rv4Var8.P();
                    if (f23 || P25 == obj5) {
                        Object wobVar4 = new wob(1, zqcVar, zqc.class, "changeTurnByVolume", "changeTurnByVolume(Z)V", 0, 28);
                        rv4Var8.o0(wobVar4);
                        P25 = wobVar4;
                    }
                    xt4 xt4Var13 = (xt4) ((i76) P25);
                    boolean f24 = rv4Var8.f(zqcVar);
                    Object P26 = rv4Var8.P();
                    if (f24 || P26 == obj5) {
                        Object wobVar5 = new wob(1, zqcVar, zqc.class, "changeRevertTurnByVolume", "changeRevertTurnByVolume(Z)V", 0, 29);
                        rv4Var8.o0(wobVar5);
                        P26 = wobVar5;
                    }
                    xt4 xt4Var14 = (xt4) ((i76) P26);
                    boolean f25 = rv4Var8.f(zqcVar);
                    Object P27 = rv4Var8.P();
                    if (f25 || P27 == obj5) {
                        Object vqcVar = new vqc(1, zqcVar, zqc.class, "changeTurnPageAnim", "changeTurnPageAnim(Z)V", 0, 0);
                        rv4Var8.o0(vqcVar);
                        P27 = vqcVar;
                    }
                    xt4 xt4Var15 = (xt4) ((i76) P27);
                    boolean f26 = rv4Var8.f(zqcVar);
                    Object P28 = rv4Var8.P();
                    if (f26 || P28 == obj5) {
                        Object vqcVar2 = new vqc(1, zqcVar, zqc.class, "changeTurnPageSound", "changeTurnPageSound(Z)V", 0, 1);
                        rv4Var8.o0(vqcVar2);
                        P28 = vqcVar2;
                    }
                    q0f.i(wqcVar, rh8Var6, ze4Var5, xt4Var10, xt4Var11, xt4Var12, xt4Var13, xt4Var14, xt4Var15, (xt4) ((i76) P28), rv4Var8, 384 | (i12 & Token.ASSIGN_MOD));
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                szc szcVar = (szc) obj7;
                yya yyaVar7 = (yya) obj6;
                rh8 rh8Var7 = (rh8) obj2;
                rv4 rv4Var9 = (rv4) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var7.getClass();
                if ((intValue11 & 48) == 0) {
                    if (rv4Var9.f(rh8Var7)) {
                        i9 = 32;
                    } else {
                        i9 = 16;
                    }
                    intValue11 |= i9;
                }
                int i13 = intValue11;
                if ((i13 & Token.TARGET) != 144) {
                    z14 = true;
                }
                if (rv4Var9.U(i13 & 1, z14)) {
                    qzc qzcVar = (qzc) yyaVar7.getValue();
                    ze4 ze4Var6 = pna.c;
                    boolean f27 = rv4Var9.f(szcVar);
                    Object P29 = rv4Var9.P();
                    if (f27 || P29 == obj5) {
                        Object xe1Var = new xe1(2, szcVar, szc.class, "changePassword", "changePassword(Ljava/lang/String;Ljava/lang/String;)V", 0, 12);
                        rv4Var9.o0(xe1Var);
                        P29 = xe1Var;
                    }
                    i76 i76Var = (i76) P29;
                    boolean f28 = rv4Var9.f(szcVar);
                    Object P30 = rv4Var9.P();
                    if (f28 || P30 == obj5) {
                        Object vjaVar = new vja(0, szcVar, szc.class, "logout", "logout()V", 0, 19);
                        rv4Var9.o0(vjaVar);
                        P30 = vjaVar;
                    }
                    i76 i76Var2 = (i76) P30;
                    boolean f29 = rv4Var9.f(szcVar);
                    Object P31 = rv4Var9.P();
                    if (f29 || P31 == obj5) {
                        Object vqcVar3 = new vqc(1, szcVar, szc.class, "deleteAccount", "deleteAccount(Ljava/lang/String;)V", 0, 4);
                        rv4Var9.o0(vqcVar3);
                        P31 = vqcVar3;
                    }
                    i76 i76Var3 = (i76) P31;
                    boolean f30 = rv4Var9.f(szcVar);
                    Object P32 = rv4Var9.P();
                    if (f30 || P32 == obj5) {
                        P32 = new zd1(szcVar, 13);
                        rv4Var9.o0(P32);
                    }
                    uaf.q(qzcVar, rh8Var7, ze4Var6, (nu4) P32, (lu4) i76Var, (xt4) i76Var3, (vt4) i76Var2, rv4Var9, (i13 & Token.ASSIGN_MOD) | 384);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 9:
                return a(obj, obj2, obj3, obj4);
            case 10:
                m82 m82Var = (m82) obj7;
                a52 a52Var = (a52) obj6;
                y78 y78Var = (y78) obj;
                y78 y78Var2 = (y78) obj2;
                float floatValue = ((Float) obj3).floatValue();
                long longValue = ((Long) obj4).longValue();
                if (floatValue != 1.0f) {
                    z87.v(m82Var, null, null, new u42(a52Var, floatValue, y78Var, (m42) null), 3);
                }
                z87.v(m82Var, null, null, new v42(a52Var, y78Var2, longValue, (m42) null), 3);
                return Boolean.TRUE;
            case 11:
                final zq3 zq3Var = (zq3) obj7;
                yya yyaVar8 = (yya) obj6;
                rh8 rh8Var8 = (rh8) obj2;
                rv4 rv4Var10 = (rv4) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var8.getClass();
                if ((intValue12 & 48) == 0) {
                    if (rv4Var10.f(rh8Var8)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    intValue12 |= i10;
                }
                if ((intValue12 & Token.TARGET) != 144) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (rv4Var10.U(intValue12 & 1, z13)) {
                    List list3 = ((yq3) yyaVar8.getValue()).a;
                    bkd r = mwe.r(mwe.r(mwe.r(rh8Var8, mwe.f(14, rv4Var10, false)), new th8(12.0f, 12.0f, 12.0f, 12.0f)), zbe.j(nae.e, nae.e, nae.e, 64.0f, 7));
                    boolean f31 = rv4Var10.f(zq3Var);
                    Object P33 = rv4Var10.P();
                    if (f31 || P33 == obj5) {
                        P33 = new xt4() { // from class: nr3
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i14 = r2;
                                pvc pvcVar3 = pvc.a;
                                zq3 zq3Var2 = zq3Var;
                                switch (i14) {
                                    case 0:
                                        String str2 = (String) obj9;
                                        str2.getClass();
                                        hk1 a4 = jdd.a(zq3Var2);
                                        sw2 sw2Var = ab3.a;
                                        zq3Var2.f(a4, ru2.c, new d53((fdd) zq3Var2, (Object) str2, (m42) null, 6));
                                        return pvcVar3;
                                    default:
                                        List list4 = (List) obj9;
                                        list4.getClass();
                                        hk1 a5 = jdd.a(zq3Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        zq3Var2.f(a5, ru2.c, new d53((Object) zq3Var2, (Object) list4, (m42) null, 7));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var10.o0(P33);
                    }
                    xt4 xt4Var16 = (xt4) P33;
                    boolean f32 = rv4Var10.f(zq3Var);
                    Object P34 = rv4Var10.P();
                    if (f32 || P34 == obj5) {
                        P34 = new xt4() { // from class: nr3
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj9) {
                                int i14 = r2;
                                pvc pvcVar3 = pvc.a;
                                zq3 zq3Var2 = zq3Var;
                                switch (i14) {
                                    case 0:
                                        String str2 = (String) obj9;
                                        str2.getClass();
                                        hk1 a4 = jdd.a(zq3Var2);
                                        sw2 sw2Var = ab3.a;
                                        zq3Var2.f(a4, ru2.c, new d53((fdd) zq3Var2, (Object) str2, (m42) null, 6));
                                        return pvcVar3;
                                    default:
                                        List list4 = (List) obj9;
                                        list4.getClass();
                                        hk1 a5 = jdd.a(zq3Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        zq3Var2.f(a5, ru2.c, new d53((Object) zq3Var2, (Object) list4, (m42) null, 7));
                                        return pvcVar3;
                                }
                            }
                        };
                        rv4Var10.o0(P34);
                    }
                    hud.a(list3, r, null, xt4Var16, (xt4) P34, rv4Var10, 0);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 12:
                return b(obj, obj2, obj3, obj4);
            case 13:
                return e(obj, obj2, obj3, obj4);
            default:
                web webVar = (web) obj7;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                ((aw7) obj6).setValue(Boolean.FALSE);
                hk1 a4 = jdd.a(webVar);
                sw2 sw2Var = ab3.a;
                webVar.f(a4, ru2.c, new veb(webVar, booleanValue, booleanValue2, booleanValue3, booleanValue4, null));
                return pvcVar;
        }
    }
}
