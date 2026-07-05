package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ ox0(List list, String str, xt4 xt4Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = xt4Var;
        this.e = aw7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [nq7] */
    /* JADX WARN: Type inference failed for: r16v5, types: [nq7] */
    /* JADX WARN: Type inference failed for: r1v2, types: [rv4] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        Object gs9Var;
        mv6 mv6Var;
        boolean z4;
        kq7 kq7Var;
        boolean z5;
        kq7 kq7Var2;
        int i;
        int i2;
        boolean z6;
        String str;
        boolean z7;
        int i3;
        int i4;
        int i5 = this.a;
        kq7 kq7Var3 = kq7.a;
        final aw7 aw7Var = this.e;
        final xt4 xt4Var = this.d;
        String str2 = this.c;
        List<String> list = this.b;
        Object obj4 = ax1.a;
        pvc pvcVar = pvc.a;
        boolean z8 = false;
        int i6 = 1;
        switch (i5) {
            case 0:
                ?? r1 = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (r1.U(intValue & 1, z)) {
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        final vmc vmcVar = (vmc) list.get(i7);
                        r1.e0(2140226844);
                        String str3 = vmcVar.b;
                        String str4 = vmcVar.a;
                        if (str3.length() == 0) {
                            str3 = str4;
                        }
                        if (str3.length() == 0) {
                            str3 = yqe.A((y3b) v1b.j0.getValue(), r1);
                        }
                        String str5 = str3;
                        r1.q(false);
                        Boolean valueOf = Boolean.valueOf(str4.equals(str2));
                        boolean f = r1.f(xt4Var) | r1.h(vmcVar);
                        Object P = r1.P();
                        if (f || P == obj4) {
                            P = new vt4() { // from class: sx0
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    int i8 = r4;
                                    pvc pvcVar2 = pvc.a;
                                    aw7 aw7Var2 = aw7Var;
                                    vmc vmcVar2 = vmcVar;
                                    xt4 xt4Var2 = xt4Var;
                                    switch (i8) {
                                        case 0:
                                            aw7Var2.setValue(Boolean.FALSE);
                                            xt4Var2.invoke(vmcVar2.a);
                                            return pvcVar2;
                                        case 1:
                                            aw7Var2.setValue(Boolean.FALSE);
                                            xt4Var2.invoke(vmcVar2.a);
                                            return pvcVar2;
                                        default:
                                            aw7Var2.setValue(Boolean.FALSE);
                                            xt4Var2.invoke(vmcVar2.a);
                                            return pvcVar2;
                                    }
                                }
                            };
                            r1.o0(P);
                        }
                        iue.g(str5, null, null, valueOf, null, (vt4) P, r1, 0, 22);
                    }
                } else {
                    r1.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue2 & 1, z2)) {
                    int size2 = list.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        tmc tmcVar = (tmc) list.get(i8);
                        String str6 = tmcVar.b;
                        tu1 E = jce.E(738608539, new qx0(tmcVar, 0), rv4Var);
                        Boolean valueOf2 = Boolean.valueOf(tmcVar.a.equals(str2));
                        boolean f2 = rv4Var.f(xt4Var) | rv4Var.h(tmcVar);
                        Object P2 = rv4Var.P();
                        if (f2 || P2 == obj4) {
                            P2 = new rx0(xt4Var, tmcVar, aw7Var, 0);
                            rv4Var.o0(P2);
                        }
                        iue.g(str6, null, E, valueOf2, null, (vt4) P2, rv4Var, 384, 18);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(intValue3 & 1, z3)) {
                    for (String str7 : list) {
                        boolean f3 = rv4Var2.f(str7);
                        Object P3 = rv4Var2.P();
                        if (f3 || P3 == obj4) {
                            str7.getClass();
                            String O = r4b.O(k4b.N0(str7).toString(), '_', '-');
                            O = (O.length() == 0 || O.equalsIgnoreCase("und")) ? null : null;
                            if (O == null) {
                                mv6Var = null;
                            } else {
                                try {
                                    gs9Var = new mv6(xve.c(O));
                                } catch (Throwable th) {
                                    gs9Var = new gs9(th);
                                }
                                if (gs9Var instanceof gs9) {
                                    gs9Var = null;
                                }
                                mv6Var = (mv6) gs9Var;
                            }
                            if (mv6Var != null) {
                                P3 = mv6Var.b();
                            } else {
                                P3 = str7;
                            }
                            rv4Var2.o0(P3);
                        }
                        String str8 = (String) P3;
                        Boolean valueOf3 = Boolean.valueOf(c16.i(str7, str2));
                        boolean f4 = rv4Var2.f(xt4Var) | rv4Var2.f(str7);
                        Object P4 = rv4Var2.P();
                        if (f4 || P4 == obj4) {
                            P4 = new be7(xt4Var, str7, aw7Var);
                            rv4Var2.o0(P4);
                        }
                        iue.g(str8, null, null, valueOf3, null, (vt4) P4, rv4Var2, 0, 22);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var3.U(intValue4 & 1, z4)) {
                    Object P5 = rv4Var3.P();
                    if (P5 == obj4) {
                        P5 = new zu0();
                        rv4Var3.o0(P5);
                    }
                    zu0 zu0Var = (zu0) P5;
                    rv4Var3.e0(1451046208);
                    int size3 = list.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        tmc tmcVar2 = (tmc) list.get(i9);
                        boolean equals = tmcVar2.a.equals(str2);
                        String str9 = tmcVar2.b;
                        if (equals) {
                            kq7Var = w9e.k(kq7Var3, zu0Var);
                        } else {
                            kq7Var = kq7Var3;
                        }
                        tu1 E2 = jce.E(1997908774, new qx0(tmcVar2, i6), rv4Var3);
                        Boolean valueOf4 = Boolean.valueOf(equals);
                        boolean f5 = rv4Var3.f(xt4Var) | rv4Var3.h(tmcVar2);
                        Object P6 = rv4Var3.P();
                        if (f5 || P6 == obj4) {
                            P6 = new rx0(xt4Var, tmcVar2, aw7Var, 1);
                            rv4Var3.o0(P6);
                        }
                        iue.g(str9, null, E2, valueOf4, kq7Var, (vt4) P6, rv4Var3, 384, 2);
                        i9++;
                        z8 = false;
                        i6 = 1;
                    }
                    rv4Var3.q(z8);
                    boolean h = rv4Var3.h(zu0Var);
                    Object P7 = rv4Var3.P();
                    if (h || P7 == obj4) {
                        P7 = new so7(zu0Var, null, 1);
                        rv4Var3.o0(P7);
                    }
                    yte.g((lu4) P7, rv4Var3, pvcVar);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 4:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var4.U(intValue5 & 1, z5)) {
                    final List list2 = this.b;
                    int size4 = list2.size();
                    final String str10 = this.c;
                    final xt4 xt4Var2 = this.d;
                    final aw7 aw7Var2 = this.e;
                    if (size4 > 10) {
                        rv4Var4.e0(-782955136);
                        Iterator it = list2.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                if (c16.i(str10, ((vmc) it.next()).a)) {
                                    i = i10;
                                } else {
                                    i10++;
                                }
                            } else {
                                i = -1;
                            }
                        }
                        Integer valueOf5 = Integer.valueOf(i);
                        if (i < 0) {
                            valueOf5 = null;
                        }
                        if (valueOf5 != null) {
                            i2 = valueOf5.intValue();
                        } else {
                            i2 = 0;
                        }
                        kj6 e = ej6.e(i2, null, rv4Var4, 0, 14);
                        nq7 h2 = pna.h(pna.s(kq7Var3, 200.0f), ((rg3) hxe.u(new rg3(gwe.f(rv4Var4).b), new rg3(400.0f))).a);
                        boolean h3 = rv4Var4.h(list2) | rv4Var4.f(str10) | rv4Var4.f(xt4Var2);
                        Object P8 = rv4Var4.P();
                        if (h3 || P8 == obj4) {
                            P8 = new xt4() { // from class: ip7
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj5) {
                                    int i11 = r5;
                                    pvc pvcVar2 = pvc.a;
                                    ri6 ri6Var = (ri6) obj5;
                                    switch (i11) {
                                        case 0:
                                            ri6Var.getClass();
                                            List list3 = list2;
                                            ri6Var.z(list3.size(), null, new pj7(8, list3), new tu1(new lp7(list3, str10, xt4Var2, aw7Var2, 0), true, 802480018));
                                            return pvcVar2;
                                        default:
                                            ri6Var.getClass();
                                            List list4 = list2;
                                            ri6Var.z(list4.size(), null, new zgb(9, list4), new tu1(new lp7(list4, str10, xt4Var2, aw7Var2, 1), true, 802480018));
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var4.o0(P8);
                        }
                        pc2.c(h2, e, null, null, null, null, false, null, 0L, 0L, nae.e, (xt4) P8, rv4Var4, 0, 0, 4092);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(-781864587);
                        Object P9 = rv4Var4.P();
                        if (P9 == obj4) {
                            P9 = new zu0();
                            rv4Var4.o0(P9);
                        }
                        zu0 zu0Var2 = (zu0) P9;
                        rv4Var4.e0(-717954789);
                        int size5 = list2.size();
                        for (int i11 = 0; i11 < size5; i11++) {
                            final vmc vmcVar2 = (vmc) list2.get(i11);
                            boolean equals2 = vmcVar2.a.equals(str10);
                            rv4Var4.e0(-717948827);
                            String str11 = vmcVar2.b;
                            if (str11.length() == 0) {
                                str11 = vmcVar2.a;
                            }
                            if (str11.length() == 0) {
                                str11 = yqe.A((y3b) v1b.j0.getValue(), rv4Var4);
                            }
                            String str12 = str11;
                            rv4Var4.q(false);
                            if (equals2) {
                                kq7Var2 = w9e.k(kq7Var3, zu0Var2);
                            } else {
                                kq7Var2 = kq7Var3;
                            }
                            Boolean valueOf6 = Boolean.valueOf(equals2);
                            boolean f6 = rv4Var4.f(xt4Var2) | rv4Var4.h(vmcVar2);
                            Object P10 = rv4Var4.P();
                            if (f6 || P10 == obj4) {
                                P10 = new vt4() { // from class: sx0
                                    @Override // defpackage.vt4
                                    public final Object invoke() {
                                        int i82 = r4;
                                        pvc pvcVar2 = pvc.a;
                                        aw7 aw7Var22 = aw7Var2;
                                        vmc vmcVar22 = vmcVar2;
                                        xt4 xt4Var22 = xt4Var2;
                                        switch (i82) {
                                            case 0:
                                                aw7Var22.setValue(Boolean.FALSE);
                                                xt4Var22.invoke(vmcVar22.a);
                                                return pvcVar2;
                                            case 1:
                                                aw7Var22.setValue(Boolean.FALSE);
                                                xt4Var22.invoke(vmcVar22.a);
                                                return pvcVar2;
                                            default:
                                                aw7Var22.setValue(Boolean.FALSE);
                                                xt4Var22.invoke(vmcVar22.a);
                                                return pvcVar2;
                                        }
                                    }
                                };
                                rv4Var4.o0(P10);
                            }
                            iue.g(str12, null, null, valueOf6, kq7Var2, (vt4) P10, rv4Var4, 0, 6);
                        }
                        rv4Var4.q(false);
                        boolean h4 = rv4Var4.h(zu0Var2);
                        Object P11 = rv4Var4.P();
                        if (h4 || P11 == obj4) {
                            P11 = new so7(zu0Var2, null, 2);
                            rv4Var4.o0(P11);
                        }
                        yte.g((lu4) P11, rv4Var4, pvcVar);
                        rv4Var4.q(false);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 5:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var5.U(1 & intValue6, z6)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        vyb vybVar = (vyb) it2.next();
                        String str13 = vybVar.a;
                        if (str13.equals("system")) {
                            rv4Var5.e0(964813936);
                            str = yqe.A((y3b) z1b.H.getValue(), rv4Var5);
                            rv4Var5.q(false);
                        } else if (str13.equals("ai")) {
                            rv4Var5.e0(964816556);
                            str = yqe.A((y3b) z1b.F.getValue(), rv4Var5);
                            rv4Var5.q(false);
                        } else {
                            rv4Var5.e0(964818856);
                            rv4Var5.q(false);
                            str = vybVar.b;
                        }
                        String str14 = str;
                        Boolean valueOf7 = Boolean.valueOf(vybVar.a.equals(str2));
                        boolean f7 = rv4Var5.f(xt4Var) | rv4Var5.h(vybVar);
                        Object P12 = rv4Var5.P();
                        if (f7 || P12 == obj4) {
                            P12 = new se0(27, xt4Var, vybVar, aw7Var);
                            rv4Var5.o0(P12);
                        }
                        iue.g(str14, null, null, valueOf7, null, (vt4) P12, rv4Var5, 0, 22);
                    }
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var6 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var6.U(1 & intValue7, z7)) {
                    final List list3 = this.b;
                    int size6 = list3.size();
                    final String str15 = this.c;
                    final xt4 xt4Var3 = this.d;
                    final aw7 aw7Var3 = this.e;
                    if (size6 > 10) {
                        rv4Var6.e0(-448750666);
                        Iterator it3 = list3.iterator();
                        int i12 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                if (c16.i(str15, ((vmc) it3.next()).a)) {
                                    i3 = i12;
                                } else {
                                    i12++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        Integer valueOf8 = Integer.valueOf(i3);
                        if (i3 < 0) {
                            valueOf8 = null;
                        }
                        if (valueOf8 != null) {
                            i4 = valueOf8.intValue();
                        } else {
                            i4 = 0;
                        }
                        kj6 e2 = ej6.e(i4, null, rv4Var6, 0, 14);
                        nq7 h5 = pna.h(pna.s(kq7Var3, 200.0f), ((rg3) hxe.u(new rg3(gwe.f(rv4Var6).b), new rg3(400.0f))).a);
                        boolean h6 = rv4Var6.h(list3) | rv4Var6.f(str15) | rv4Var6.f(xt4Var3);
                        Object P13 = rv4Var6.P();
                        if (h6 || P13 == obj4) {
                            P13 = new xt4() { // from class: ip7
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj5) {
                                    int i112 = r5;
                                    pvc pvcVar2 = pvc.a;
                                    ri6 ri6Var = (ri6) obj5;
                                    switch (i112) {
                                        case 0:
                                            ri6Var.getClass();
                                            List list32 = list3;
                                            ri6Var.z(list32.size(), null, new pj7(8, list32), new tu1(new lp7(list32, str15, xt4Var3, aw7Var3, 0), true, 802480018));
                                            return pvcVar2;
                                        default:
                                            ri6Var.getClass();
                                            List list4 = list3;
                                            ri6Var.z(list4.size(), null, new zgb(9, list4), new tu1(new lp7(list4, str15, xt4Var3, aw7Var3, 1), true, 802480018));
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var6.o0(P13);
                        }
                        pc2.c(h5, e2, null, null, null, null, false, null, 0L, 0L, nae.e, (xt4) P13, rv4Var6, 0, 0, 4092);
                        rv4Var6.q(false);
                    } else {
                        rv4Var6.e0(-447663217);
                        Object P14 = rv4Var6.P();
                        if (P14 == obj4) {
                            P14 = new zu0();
                            rv4Var6.o0(P14);
                        }
                        zu0 zu0Var3 = (zu0) P14;
                        rv4Var6.e0(-14437439);
                        int size7 = list3.size();
                        for (int i13 = 0; i13 < size7; i13++) {
                            final vmc vmcVar3 = (vmc) list3.get(i13);
                            boolean equals3 = vmcVar3.a.equals(str15);
                            rv4Var6.e0(-14431377);
                            String str16 = vmcVar3.b;
                            if (str16.length() == 0) {
                                str16 = vmcVar3.a;
                            }
                            if (str16.length() == 0) {
                                str16 = yqe.A((y3b) v1b.j0.getValue(), rv4Var6);
                            }
                            String str17 = str16;
                            rv4Var6.q(false);
                            nq7 m = r1d.m(kq7Var3, equals3, new pl7(zu0Var3, 18), rv4Var6, 6);
                            Boolean valueOf9 = Boolean.valueOf(equals3);
                            boolean f8 = rv4Var6.f(xt4Var3) | rv4Var6.h(vmcVar3);
                            Object P15 = rv4Var6.P();
                            if (f8 || P15 == obj4) {
                                P15 = new vt4() { // from class: sx0
                                    @Override // defpackage.vt4
                                    public final Object invoke() {
                                        int i82 = r4;
                                        pvc pvcVar2 = pvc.a;
                                        aw7 aw7Var22 = aw7Var3;
                                        vmc vmcVar22 = vmcVar3;
                                        xt4 xt4Var22 = xt4Var3;
                                        switch (i82) {
                                            case 0:
                                                aw7Var22.setValue(Boolean.FALSE);
                                                xt4Var22.invoke(vmcVar22.a);
                                                return pvcVar2;
                                            case 1:
                                                aw7Var22.setValue(Boolean.FALSE);
                                                xt4Var22.invoke(vmcVar22.a);
                                                return pvcVar2;
                                            default:
                                                aw7Var22.setValue(Boolean.FALSE);
                                                xt4Var22.invoke(vmcVar22.a);
                                                return pvcVar2;
                                        }
                                    }
                                };
                                rv4Var6.o0(P15);
                            }
                            iue.g(str17, null, null, valueOf9, m, (vt4) P15, rv4Var6, 0, 6);
                        }
                        rv4Var6.q(false);
                        boolean h7 = rv4Var6.h(zu0Var3);
                        Object P16 = rv4Var6.P();
                        if (h7 || P16 == obj4) {
                            P16 = new so7(zu0Var3, null, 5);
                            rv4Var6.o0(P16);
                        }
                        yte.g((lu4) P16, rv4Var6, pvcVar);
                        rv4Var6.q(false);
                    }
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
        }
    }
}
