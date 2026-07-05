package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ qm7(List list, int i, xt4 xt4Var, aw7 aw7Var, int i2) {
        this.a = i2;
        this.b = list;
        this.c = i;
        this.d = xt4Var;
        this.e = aw7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [rv4] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.Throwable] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        nq7 nq7Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i = this.a;
        m42 m42Var = null;
        pvc pvcVar = pvc.a;
        Object obj4 = ax1.a;
        boolean z10 = true;
        aw7 aw7Var = this.e;
        xt4 xt4Var = this.d;
        int i2 = this.c;
        List<mbd> list = this.b;
        boolean z11 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    int i3 = 0;
                    for (Object obj5 : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            String str = (String) obj5;
                            if (i2 == i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z2);
                            boolean f = rv4Var.f(xt4Var) | rv4Var.d(i3);
                            Object P = rv4Var.P();
                            if (f || P == obj4) {
                                P = new sm7(xt4Var, i3, aw7Var, 0);
                                rv4Var.o0(P);
                            }
                            iue.g(str, null, null, valueOf, null, (vt4) P, rv4Var, 0, 22);
                            i3 = i4;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ?? r11 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (r11.U(intValue2 & 1, z3)) {
                    int size = list.size();
                    kq7 kq7Var = kq7.a;
                    if (size > 10) {
                        r11.e0(764622570);
                        kj6 e = ej6.e(i2, null, r11, 0, 14);
                        nq7 h = pna.h(pna.s(kq7Var, 250.0f), ((rg3) hxe.u(new rg3(gwe.f(r11).b), new rg3(400.0f))).a);
                        boolean h2 = r11.h(list) | r11.d(i2) | r11.f(xt4Var);
                        Object P2 = r11.P();
                        gt0 gt0Var = P2;
                        if (h2 || P2 == obj4) {
                            gt0 gt0Var2 = new gt0(list, i2, xt4Var, aw7Var);
                            r11.o0(gt0Var2);
                            gt0Var = gt0Var2;
                        }
                        pc2.c(h, e, null, null, null, null, false, null, 0L, 0L, nae.e, (xt4) gt0Var, r11, 0, 0, 4092);
                        r11.q(false);
                    } else {
                        r11.e0(765611036);
                        Object P3 = r11.P();
                        zu0 zu0Var = P3;
                        if (P3 == obj4) {
                            zu0 zu0Var2 = new zu0();
                            r11.o0(zu0Var2);
                            zu0Var = zu0Var2;
                        }
                        zu0 zu0Var3 = (zu0) zu0Var;
                        r11.e0(-113847016);
                        int i5 = 0;
                        for (Object obj6 : list) {
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                gh1 gh1Var = (gh1) obj6;
                                if (i2 == i5) {
                                    z4 = z10;
                                } else {
                                    z4 = z11;
                                }
                                boolean z12 = gh1Var.c;
                                boolean z13 = z10;
                                String str2 = gh1Var.a;
                                if (z12) {
                                    str2 = nk2.u(str2, " (Online)");
                                }
                                String str3 = gh1Var.b;
                                if (i2 == i5) {
                                    z5 = z13;
                                } else {
                                    z5 = z11;
                                }
                                if (z4) {
                                    nq7Var = w9e.k(kq7Var, zu0Var3);
                                } else {
                                    nq7Var = kq7Var;
                                }
                                Boolean valueOf2 = Boolean.valueOf(z5);
                                boolean f2 = r11.f(xt4Var) | r11.d(i5);
                                m42 m42Var2 = m42Var;
                                Object P4 = r11.P();
                                if (f2 || P4 == obj4) {
                                    P4 = new sm7(xt4Var, i5, aw7Var, 2);
                                    r11.o0(P4);
                                }
                                iue.g(str2, str3, null, valueOf2, nq7Var, (vt4) P4, r11, 0, 4);
                                kq7Var = kq7Var;
                                i5 = i6;
                                z10 = z13;
                                m42Var = m42Var2;
                                z11 = false;
                            } else {
                                ?? r22 = m42Var;
                                tl1.M();
                                throw r22;
                            }
                        }
                        m42 m42Var3 = m42Var;
                        boolean z14 = z11;
                        r11.q(z14);
                        boolean h3 = r11.h(zu0Var3);
                        Object P5 = r11.P();
                        so7 so7Var = P5;
                        if (h3 || P5 == obj4) {
                            so7 so7Var2 = new so7(zu0Var3, m42Var3, z14 ? 1 : 0);
                            r11.o0(so7Var2);
                            so7Var = so7Var2;
                        }
                        yte.g((lu4) so7Var, r11, pvcVar);
                        r11.q(z14);
                    }
                } else {
                    r11.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var2.U(intValue3 & 1, z6)) {
                    int i7 = 0;
                    for (Object obj7 : list) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            String str4 = (String) obj7;
                            if (i2 == i7) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z7);
                            boolean f3 = rv4Var2.f(xt4Var) | rv4Var2.d(i7);
                            Object P6 = rv4Var2.P();
                            if (f3 || P6 == obj4) {
                                P6 = new sm7(xt4Var, i7, aw7Var, 3);
                                rv4Var2.o0(P6);
                            }
                            rv4 rv4Var3 = rv4Var2;
                            iue.g(str4, null, null, valueOf3, null, (vt4) P6, rv4Var3, 0, 22);
                            rv4Var2 = rv4Var3;
                            i7 = i8;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z8)) {
                    for (mbd mbdVar : list) {
                        String str5 = mbdVar.a;
                        if (mbdVar.b == i2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Boolean valueOf4 = Boolean.valueOf(z9);
                        boolean f4 = rv4Var4.f(xt4Var) | rv4Var4.f(mbdVar);
                        Object P7 = rv4Var4.P();
                        if (f4 || P7 == obj4) {
                            P7 = new x8c(4, xt4Var, mbdVar, aw7Var);
                            rv4Var4.o0(P7);
                        }
                        iue.g(str5, null, null, valueOf4, null, (vt4) P7, rv4Var4, 0, 22);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
