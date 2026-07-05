package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l68  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class l68 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l68(th8 th8Var, rh8 rh8Var, qg6 qg6Var, k23 k23Var, v43 v43Var, xt4 xt4Var, lu4 lu4Var, xt4 xt4Var2, lu4 lu4Var2) {
        this.a = 2;
        this.F = th8Var;
        this.d = rh8Var;
        this.b = qg6Var;
        this.c = k23Var;
        this.e = v43Var;
        this.D = xt4Var;
        this.f = lu4Var;
        this.C = xt4Var2;
        this.E = lu4Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List list;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        eu3 a;
        lz3 a2;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = ax1.a;
        Object obj5 = this.D;
        Object obj6 = this.e;
        Object obj7 = this.E;
        Object obj8 = this.C;
        Object obj9 = this.d;
        Object obj10 = this.b;
        Object obj11 = this.f;
        Object obj12 = this.c;
        Object obj13 = this.F;
        int i4 = 2;
        switch (i3) {
            case 0:
                j68 j68Var = (j68) obj13;
                ix5 ix5Var = (ix5) obj10;
                cz7 cz7Var = (cz7) obj12;
                rh8 rh8Var = (rh8) obj9;
                aw7 aw7Var = (aw7) obj6;
                yya yyaVar = (yya) obj11;
                yya yyaVar2 = (yya) obj8;
                aw7 aw7Var2 = (aw7) obj5;
                yya yyaVar3 = (yya) obj7;
                su0 su0Var = (su0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(su0Var)) {
                        i4 = 4;
                    }
                    intValue |= i4;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nn a3 = vvb.a(rv4Var);
                    r13 r13Var = (r13) rv4Var.j(dy1.h);
                    WeakHashMap weakHashMap = yjd.w;
                    ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                    tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
                    Object[] objArr = {j68Var, ix5Var, r13Var, a3, new rg3(su0Var.d()), new rg3(su0Var.c())};
                    boolean f = rv4Var.f(ix5Var) | rv4Var.d(tc6Var.ordinal()) | rv4Var.f(o) | rv4Var.f(j68Var) | rv4Var.f(r13Var) | rv4Var.h(a3);
                    if ((intValue & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z10 = z2 | f;
                    Object P = rv4Var.P();
                    if (z10 || P == obj4) {
                        P = new pc3(ix5Var, tc6Var, o, j68Var, r13Var, a3, su0Var, null, 5);
                        rv4Var.o0(P);
                    }
                    yte.j(objArr, (lu4) P, rv4Var);
                    long j = ((e6c) aw7Var.getValue()).d;
                    String str = ((e6c) aw7Var.getValue()).e;
                    ze4 ze4Var = pna.c;
                    fca.c(384, j, rv4Var, ze4Var, str);
                    aw7 z11 = jsc.z(j68Var.x0, rv4Var);
                    if (!((a68) yyaVar.getValue()).a && (((a68) yyaVar.getValue()).c || !((kob) z11.getValue()).b.isEmpty())) {
                        if (((a68) yyaVar.getValue()).c) {
                            rv4Var.e0(2117452901);
                            String str2 = ((a68) yyaVar.getValue()).e;
                            Object P2 = rv4Var.P();
                            if (P2 == obj4) {
                                P2 = new cd1(15);
                                rv4Var.o0(P2);
                            }
                            vt4 vt4Var = (vt4) P2;
                            boolean f2 = rv4Var.f(cz7Var);
                            Object P3 = rv4Var.P();
                            if (f2 || P3 == obj4) {
                                P3 = new px6(cz7Var, 11);
                                rv4Var.o0(P3);
                            }
                            hbe.U(432, vt4Var, (vt4) P3, rv4Var, ze4Var, str2);
                            rv4Var.q(false);
                            return pvcVar;
                        }
                        rv4Var.e0(2117932068);
                        kwe.f(cz7Var, j68Var, (kub) yyaVar2.getValue(), (nnb) aw7Var2.getValue(), (e6c) aw7Var.getValue(), (j2c) yyaVar3.getValue(), rh8Var, ze4Var, rv4Var, 12582912);
                        rv4Var.q(false);
                        return pvcVar;
                    }
                    rv4Var.e0(2117024171);
                    String str3 = ((a68) yyaVar.getValue()).d;
                    nq7 y = zbe.y(ze4Var, 24.0f);
                    boolean f3 = rv4Var.f(cz7Var);
                    Object P4 = rv4Var.P();
                    if (f3 || P4 == obj4) {
                        P4 = new px6(cz7Var, 10);
                        rv4Var.o0(P4);
                    }
                    hbe.V(48, (vt4) P4, rv4Var, y, str3);
                    rv4Var.q(false);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
            case 1:
                csc cscVar = (csc) obj13;
                ix5 ix5Var2 = (ix5) obj10;
                cz7 cz7Var2 = (cz7) obj12;
                rh8 rh8Var2 = (rh8) obj9;
                aw7 aw7Var3 = (aw7) obj6;
                yya yyaVar4 = (yya) obj11;
                yya yyaVar5 = (yya) obj8;
                aw7 aw7Var4 = (aw7) obj5;
                yya yyaVar6 = (yya) obj7;
                su0 su0Var2 = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(su0Var2)) {
                        i4 = 4;
                    }
                    intValue2 |= i4;
                }
                int i5 = intValue2;
                if ((i5 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(i5 & 1, z3)) {
                    nn a4 = vvb.a(rv4Var2);
                    r13 r13Var2 = (r13) rv4Var2.j(dy1.h);
                    WeakHashMap weakHashMap2 = yjd.w;
                    ix5 o2 = w92.o(h88.n(rv4Var2).b, rv4Var2);
                    tc6 tc6Var2 = (tc6) rv4Var2.j(dy1.n);
                    Object[] objArr2 = {cscVar, ix5Var2, r13Var2, a4, new rg3(su0Var2.d()), new rg3(su0Var2.c())};
                    boolean d = rv4Var2.d(tc6Var2.ordinal()) | rv4Var2.f(ix5Var2) | rv4Var2.f(o2) | rv4Var2.f(cscVar) | rv4Var2.f(r13Var2) | rv4Var2.h(a4);
                    if ((i5 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z12 = z4 | d;
                    Object P5 = rv4Var2.P();
                    if (z12 || P5 == obj4) {
                        P5 = new pc3(ix5Var2, tc6Var2, o2, cscVar, r13Var2, a4, su0Var2, null, 6);
                        rv4Var2.o0(P5);
                    }
                    yte.j(objArr2, (lu4) P5, rv4Var2);
                    long j2 = ((e6c) aw7Var3.getValue()).d;
                    String str4 = ((e6c) aw7Var3.getValue()).e;
                    ze4 ze4Var2 = pna.c;
                    fca.c(384, j2, rv4Var2, ze4Var2, str4);
                    if (((xrc) yyaVar4.getValue()).a) {
                        rv4Var2.e0(-668773050);
                        String str5 = ((xrc) yyaVar4.getValue()).f;
                        nq7 y2 = zbe.y(ze4Var2, 24.0f);
                        boolean f4 = rv4Var2.f(cz7Var2);
                        Object P6 = rv4Var2.P();
                        if (f4 || P6 == obj4) {
                            P6 = new qhb(cz7Var2, 17);
                            rv4Var2.o0(P6);
                        }
                        n4f.i(48, (vt4) P6, rv4Var2, y2, str5);
                        rv4Var2.q(false);
                    } else if (((xrc) yyaVar4.getValue()).e) {
                        rv4Var2.e0(-668352752);
                        String str6 = ((xrc) yyaVar4.getValue()).l;
                        boolean f5 = rv4Var2.f(cz7Var2);
                        Object P7 = rv4Var2.P();
                        if (f5 || P7 == obj4) {
                            P7 = new qhb(cz7Var2, 18);
                            rv4Var2.o0(P7);
                        }
                        n4f.g(48, (vt4) P7, rv4Var2, ze4Var2, str6);
                        rv4Var2.q(false);
                    } else if (!((xrc) yyaVar4.getValue()).c) {
                        rv4Var2.e0(-667936081);
                        boolean f6 = rv4Var2.f(cscVar);
                        Object P8 = rv4Var2.P();
                        if (f6 || P8 == obj4) {
                            P8 = new rg0(cscVar, null, 26);
                            rv4Var2.o0(P8);
                        }
                        yte.g((lu4) P8, rv4Var2, pvcVar);
                        String str7 = ((xrc) yyaVar4.getValue()).f;
                        String str8 = ((xrc) yyaVar4.getValue()).g;
                        String str9 = ((xrc) yyaVar4.getValue()).h;
                        List list2 = ((xrc) yyaVar4.getValue()).k;
                        int i6 = ((xrc) yyaVar4.getValue()).j;
                        boolean z13 = ((xrc) yyaVar4.getValue()).d;
                        boolean z14 = ((xrc) yyaVar4.getValue()).b;
                        nq7 x = zbe.x(zbe.y(ze4Var2, 24.0f), mwe.g(15, rv4Var2));
                        boolean f7 = rv4Var2.f(cscVar);
                        Object P9 = rv4Var2.P();
                        if (f7 || P9 == obj4) {
                            list = list2;
                            i = i6;
                            z5 = z13;
                            Object vqcVar = new vqc(1, cscVar, csc.class, "checkChapters", "checkChapters(Ljava/util/Map;)V", 0, 2);
                            rv4Var2.o0(vqcVar);
                            P9 = vqcVar;
                        } else {
                            list = list2;
                            i = i6;
                            z5 = z13;
                        }
                        i76 i76Var = (i76) P9;
                        boolean f8 = rv4Var2.f(cscVar);
                        Object P10 = rv4Var2.P();
                        if (f8 || P10 == obj4) {
                            Object wu4Var = new wu4(5, 0, csc.class, cscVar, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;Ljava/util/List;)V");
                            rv4Var2.o0(wu4Var);
                            P10 = wu4Var;
                        }
                        xt4 xt4Var = (xt4) i76Var;
                        ou4 ou4Var = (ou4) ((i76) P10);
                        boolean f9 = rv4Var2.f(cz7Var2);
                        Object P11 = rv4Var2.P();
                        if (f9 || P11 == obj4) {
                            P11 = new qhb(cz7Var2, 19);
                            rv4Var2.o0(P11);
                        }
                        vt4 vt4Var2 = (vt4) P11;
                        boolean f10 = rv4Var2.f(cz7Var2);
                        Object P12 = rv4Var2.P();
                        if (f10 || P12 == obj4) {
                            P12 = new qhb(cz7Var2, 20);
                            rv4Var2.o0(P12);
                        }
                        n4f.h(str7, str8, str9, x, i, z5, z14, list, xt4Var, ou4Var, vt4Var2, (vt4) P12, rv4Var2, 0);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(-666675621);
                        kwe.f(cz7Var2, cscVar, (kub) yyaVar5.getValue(), (nnb) aw7Var4.getValue(), (e6c) aw7Var3.getValue(), (j2c) yyaVar6.getValue(), rh8Var2, ze4Var2, rv4Var2, 12582912);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                th8 th8Var = (th8) obj13;
                rh8 rh8Var3 = (rh8) obj9;
                qg6 qg6Var = (qg6) obj10;
                k23 k23Var = (k23) obj12;
                v43 v43Var = (v43) obj6;
                xt4 xt4Var2 = (xt4) obj5;
                lu4 lu4Var = (lu4) obj11;
                xt4 xt4Var3 = (xt4) obj8;
                lu4 lu4Var2 = (lu4) obj7;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z6)) {
                    f25 f25Var = new f25(160.0f);
                    nq7 f11 = pna.f(kq7.a, 1.0f);
                    bkd r = mwe.r(th8Var, mwe.f(10, rv4Var3, false));
                    bkd r2 = mwe.r(mwe.r(mwe.r(th8Var, mwe.f(8, rv4Var3, false)), zbe.j(nae.e, nae.e, 4.0f, nae.e, 11)), rh8Var3);
                    boolean h = rv4Var3.h(k23Var) | rv4Var3.f(v43Var) | rv4Var3.f(rh8Var3) | rv4Var3.f(xt4Var2) | rv4Var3.f(lu4Var) | rv4Var3.f(xt4Var3) | rv4Var3.f(lu4Var2);
                    Object P13 = rv4Var3.P();
                    if (h || P13 == obj4) {
                        P13 = new h43(k23Var, lu4Var, v43Var, xt4Var3, lu4Var2, rh8Var3, xt4Var2);
                        rv4Var3.o0(P13);
                    }
                    pc2.d(f25Var, f11, qg6Var, r, null, null, null, false, 0L, 0L, r2, nae.e, (xt4) P13, rv4Var3, 48, 0, 6128);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                final t2c t2cVar = (t2c) obj13;
                final cz7 cz7Var3 = (cz7) obj12;
                final yya yyaVar7 = (yya) obj11;
                final lha lhaVar = (lha) obj10;
                final xt4 xt4Var4 = (xt4) obj9;
                final yya yyaVar8 = (yya) obj8;
                final yya yyaVar9 = (yya) obj7;
                final yya yyaVar10 = (yya) obj6;
                final yya yyaVar11 = (yya) obj5;
                su0 su0Var3 = (su0) obj;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                su0Var3.getClass();
                long j3 = su0Var3.b;
                if ((intValue4 & 6) == 0) {
                    if (rv4Var4.f(su0Var3)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue4 |= i2;
                }
                if ((intValue4 & 19) != 18) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z7)) {
                    if (x02.i(j3) > (x02.h(j3) * 3) / 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Object P14 = rv4Var4.P();
                    if (P14 == obj4) {
                        P14 = yae.z(Boolean.FALSE);
                        rv4Var4.o0(P14);
                    }
                    final aw7 aw7Var5 = (aw7) P14;
                    Object P15 = rv4Var4.P();
                    if (P15 == obj4) {
                        P15 = yae.z(Boolean.FALSE);
                        rv4Var4.o0(P15);
                    }
                    final aw7 aw7Var6 = (aw7) P15;
                    Object P16 = rv4Var4.P();
                    if (P16 == obj4) {
                        P16 = yae.z(Boolean.FALSE);
                        rv4Var4.o0(P16);
                    }
                    final aw7 aw7Var7 = (aw7) P16;
                    Object P17 = rv4Var4.P();
                    if (P17 == obj4) {
                        P17 = yae.z(Boolean.FALSE);
                        rv4Var4.o0(P17);
                    }
                    final aw7 aw7Var8 = (aw7) P17;
                    Object P18 = rv4Var4.P();
                    if (P18 == obj4) {
                        P18 = yae.z(Boolean.FALSE);
                        rv4Var4.o0(P18);
                    }
                    final aw7 aw7Var9 = (aw7) P18;
                    if (((n1c) yyaVar7.getValue()).g && ((n1c) yyaVar7.getValue()).h) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (((n1c) yyaVar7.getValue()).h) {
                        rv4Var4.e0(-12376544);
                        rv4Var4.q(false);
                        a = zt3.g(tte.x(300, 0, null, 6), 2);
                    } else {
                        rv4Var4.e0(-12319783);
                        eu3 g = zt3.g(tte.x(300, 0, null, 6), 2);
                        arc x2 = tte.x(400, 0, null, 6);
                        Object P19 = rv4Var4.P();
                        if (P19 == obj4) {
                            P19 = new y4(7);
                            rv4Var4.o0(P19);
                        }
                        a = g.a(zt3.q(x2, new t41(2, (xt4) P19)));
                        rv4Var4.q(false);
                    }
                    if (((n1c) yyaVar7.getValue()).h) {
                        rv4Var4.e0(-12187041);
                        rv4Var4.q(false);
                        a2 = zt3.i(tte.x(300, 0, null, 6), 2);
                    } else {
                        rv4Var4.e0(-12129257);
                        lz3 i7 = zt3.i(tte.x(300, 0, null, 6), 2);
                        arc x3 = tte.x(400, 0, null, 6);
                        Object P20 = rv4Var4.P();
                        if (P20 == obj4) {
                            P20 = new y4(7);
                            rv4Var4.o0(P20);
                        }
                        a2 = i7.a(zt3.u(x3, new t41(4, (xt4) P20)));
                        rv4Var4.q(false);
                    }
                    final boolean z15 = z8;
                    rte.c(z9, null, a, a2, null, jce.E(678937800, new mu4() { // from class: f0c
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r15v7 */
                        /* JADX WARN: Type inference failed for: r6v19 */
                        @Override // defpackage.mu4
                        public final Object c(Object obj14, Object obj15, Object obj16) {
                            boolean z16;
                            boolean z17;
                            pvc pvcVar2;
                            qr qrVar;
                            int i8;
                            int i9;
                            rv4 rv4Var5;
                            lha lhaVar2;
                            vt4 vt4Var3;
                            boolean h2;
                            int i10;
                            qr qrVar2 = (qr) obj14;
                            rv4 rv4Var6 = (rv4) obj15;
                            int intValue5 = ((Integer) obj16).intValue();
                            qrVar2.getClass();
                            if ((intValue5 & 6) == 0) {
                                if ((intValue5 & 8) == 0) {
                                    h2 = rv4Var6.f(qrVar2);
                                } else {
                                    h2 = rv4Var6.h(qrVar2);
                                }
                                if (h2) {
                                    i10 = 4;
                                } else {
                                    i10 = 2;
                                }
                                intValue5 |= i10;
                            }
                            if ((intValue5 & 19) != 18) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean U = rv4Var6.U(intValue5 & 1, z16);
                            pvc pvcVar3 = pvc.a;
                            if (U) {
                                final t2c t2cVar2 = t2c.this;
                                boolean f12 = rv4Var6.f(t2cVar2);
                                Object P21 = rv4Var6.P();
                                Object obj17 = ax1.a;
                                if (f12 || P21 == obj17) {
                                    P21 = new i0c(t2cVar2, 3);
                                    rv4Var6.o0(P21);
                                }
                                sf0.a(false, (vt4) P21, rv4Var6, 0, 1);
                                Object P22 = rv4Var6.P();
                                if (P22 == obj17) {
                                    P22 = hl5.g(nae.e, rv4Var6);
                                }
                                dm8 dm8Var = (dm8) P22;
                                Object P23 = rv4Var6.P();
                                if (P23 == obj17) {
                                    P23 = hl5.g(1.0f, rv4Var6);
                                }
                                dm8 dm8Var2 = (dm8) P23;
                                final yya yyaVar12 = yyaVar7;
                                Boolean valueOf = Boolean.valueOf(((n1c) yyaVar12.getValue()).g);
                                Boolean valueOf2 = Boolean.valueOf(((n1c) yyaVar12.getValue()).h);
                                boolean f13 = rv4Var6.f(yyaVar12);
                                Object P24 = rv4Var6.P();
                                if (f13 || P24 == obj17) {
                                    P24 = new iz7(yyaVar12, dm8Var, null, 17);
                                    rv4Var6.o0(P24);
                                }
                                yte.h(valueOf, valueOf2, (lu4) P24, rv4Var6);
                                float m = dce.m(dm8Var.h() / dm8Var2.h(), nae.e, 1.0f);
                                float f14 = 1.0f - (0.2f * m);
                                float X0 = ((r13) rv4Var6.j(dy1.h)).X0(24.0f) * m;
                                ze4 ze4Var3 = pna.c;
                                Object P25 = rv4Var6.P();
                                if (P25 == obj17) {
                                    P25 = new n0c(dm8Var2, 0);
                                    rv4Var6.o0(P25);
                                }
                                nq7 h3 = q1d.h(rv4Var6, nmd.v(pbe.l(ze4Var3, (xt4) P25), zl1.b(0.6f * (1.0f - m), ((h27) rv4Var6.j(j27.a)).a.C), lre.g));
                                boolean f15 = rv4Var6.f(t2cVar2);
                                Object P26 = rv4Var6.P();
                                if (!f15 && P26 != obj17) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                    P26 = new d1c(0, t2cVar2, dm8Var, dm8Var2);
                                    rv4Var6.o0(P26);
                                }
                                nq7 b = dab.b(h3, pvcVar3, (PointerInputEventHandler) P26);
                                nk0 nk0Var = kh5.a;
                                b37 d2 = fu0.d(nk0Var, z17);
                                int i11 = intValue5;
                                int hashCode = Long.hashCode(rv4Var6.T);
                                xt8 l = rv4Var6.l();
                                nq7 p = lye.p(rv4Var6, b);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var6.i0();
                                if (rv4Var6.S) {
                                    rv4Var6.k(zx1Var);
                                } else {
                                    rv4Var6.r0();
                                }
                                np npVar = qw1.f;
                                jce.F(npVar, rv4Var6, d2);
                                np npVar2 = qw1.e;
                                jce.F(npVar2, rv4Var6, l);
                                Integer valueOf3 = Integer.valueOf(hashCode);
                                np npVar3 = qw1.g;
                                jce.F(npVar3, rv4Var6, valueOf3);
                                kg kgVar = qw1.h;
                                jce.C(kgVar, rv4Var6);
                                np npVar4 = qw1.d;
                                jce.F(npVar4, rv4Var6, p);
                                boolean c = rv4Var6.c(f14) | rv4Var6.c(X0);
                                Object P27 = rv4Var6.P();
                                if (c || P27 == obj17) {
                                    P27 = new qd0(f14, X0, dm8Var);
                                    rv4Var6.o0(P27);
                                }
                                nq7 k = axe.k(ze4Var3, (xt4) P27);
                                b37 d3 = fu0.d(nk0Var, false);
                                int hashCode2 = Long.hashCode(rv4Var6.T);
                                xt8 l2 = rv4Var6.l();
                                nq7 p2 = lye.p(rv4Var6, k);
                                rv4Var6.i0();
                                if (rv4Var6.S) {
                                    rv4Var6.k(zx1Var);
                                } else {
                                    rv4Var6.r0();
                                }
                                jce.F(npVar, rv4Var6, d3);
                                jce.F(npVar2, rv4Var6, l2);
                                s21.t(hashCode2, rv4Var6, npVar3, rv4Var6, kgVar);
                                jce.F(npVar4, rv4Var6, p2);
                                boolean z18 = z15;
                                lha lhaVar3 = lhaVar;
                                final xt4 xt4Var5 = xt4Var4;
                                yya yyaVar13 = yyaVar8;
                                yya yyaVar14 = yyaVar9;
                                yya yyaVar15 = yyaVar10;
                                aw7 aw7Var10 = aw7Var8;
                                final aw7 aw7Var11 = aw7Var5;
                                aw7 aw7Var12 = aw7Var6;
                                aw7 aw7Var13 = aw7Var9;
                                final aw7 aw7Var14 = aw7Var7;
                                if (z18) {
                                    rv4Var6.e0(179338262);
                                    n1c n1cVar = (n1c) yyaVar12.getValue();
                                    ozb ozbVar = (ozb) yyaVar13.getValue();
                                    f1c f1cVar = (f1c) yyaVar14.getValue();
                                    z1c z1cVar = (z1c) yyaVar15.getValue();
                                    k2c k2cVar = (k2c) yyaVar11.getValue();
                                    boolean f16 = rv4Var6.f(t2cVar2);
                                    Object P28 = rv4Var6.P();
                                    if (!f16 && P28 != obj17) {
                                        lhaVar2 = lhaVar3;
                                    } else {
                                        lhaVar2 = lhaVar3;
                                        P28 = new i0c(t2cVar2, 16);
                                        rv4Var6.o0(P28);
                                    }
                                    vt4 vt4Var4 = (vt4) P28;
                                    boolean f17 = rv4Var6.f(t2cVar2);
                                    Object P29 = rv4Var6.P();
                                    if (f17 || P29 == obj17) {
                                        P29 = new i0c(t2cVar2, 17);
                                        rv4Var6.o0(P29);
                                    }
                                    vt4 vt4Var5 = (vt4) P29;
                                    boolean f18 = rv4Var6.f(t2cVar2) | rv4Var6.f(xt4Var5) | rv4Var6.f(yyaVar12);
                                    Object P30 = rv4Var6.P();
                                    if (f18 || P30 == obj17) {
                                        P30 = new vt4() { // from class: o0c
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i12 = r4;
                                                pvc pvcVar4 = pvc.a;
                                                yya yyaVar16 = yyaVar12;
                                                xt4 xt4Var6 = xt4Var5;
                                                t2c t2cVar3 = t2cVar2;
                                                switch (i12) {
                                                    case 0:
                                                        t2cVar3.k();
                                                        xt4Var6.invoke(((n1c) yyaVar16.getValue()).a);
                                                        return pvcVar4;
                                                    default:
                                                        t2cVar3.k();
                                                        xt4Var6.invoke(((n1c) yyaVar16.getValue()).a);
                                                        return pvcVar4;
                                                }
                                            }
                                        };
                                        rv4Var6.o0(P30);
                                    }
                                    vt4 vt4Var6 = (vt4) P30;
                                    Object P31 = rv4Var6.P();
                                    if (P31 == obj17) {
                                        P31 = new p0c(aw7Var10, 3);
                                        rv4Var6.o0(P31);
                                    }
                                    vt4 vt4Var7 = (vt4) P31;
                                    boolean f19 = rv4Var6.f(t2cVar2);
                                    Object P32 = rv4Var6.P();
                                    if (f19 || P32 == obj17) {
                                        P32 = new vt4() { // from class: l0c
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i12 = r3;
                                                pvc pvcVar4 = pvc.a;
                                                aw7 aw7Var15 = aw7Var11;
                                                t2c t2cVar3 = t2cVar2;
                                                switch (i12) {
                                                    case 0:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 1:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 2:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    default:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                }
                                            }
                                        };
                                        rv4Var6.o0(P32);
                                    }
                                    vt4 vt4Var8 = (vt4) P32;
                                    Object P33 = rv4Var6.P();
                                    if (P33 == obj17) {
                                        P33 = new p0c(aw7Var12, 4);
                                        rv4Var6.o0(P33);
                                    }
                                    vt4 vt4Var9 = (vt4) P33;
                                    Object P34 = rv4Var6.P();
                                    if (P34 == obj17) {
                                        P34 = new p0c(aw7Var13, 5);
                                        rv4Var6.o0(P34);
                                    }
                                    vt4 vt4Var10 = (vt4) P34;
                                    boolean f20 = rv4Var6.f(t2cVar2);
                                    Object P35 = rv4Var6.P();
                                    if (f20 || P35 == obj17) {
                                        P35 = new vt4() { // from class: l0c
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i12 = r3;
                                                pvc pvcVar4 = pvc.a;
                                                aw7 aw7Var15 = aw7Var14;
                                                t2c t2cVar3 = t2cVar2;
                                                switch (i12) {
                                                    case 0:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 1:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 2:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    default:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                }
                                            }
                                        };
                                        rv4Var6.o0(P35);
                                    }
                                    vt4 vt4Var11 = (vt4) P35;
                                    boolean f21 = rv4Var6.f(t2cVar2);
                                    Object P36 = rv4Var6.P();
                                    if (f21 || P36 == obj17) {
                                        P36 = new i0c(t2cVar2, 4);
                                        rv4Var6.o0(P36);
                                    }
                                    vt4 vt4Var12 = (vt4) P36;
                                    boolean f22 = rv4Var6.f(t2cVar2);
                                    Object P37 = rv4Var6.P();
                                    if (f22 || P37 == obj17) {
                                        P37 = new i0c(t2cVar2, 5);
                                        rv4Var6.o0(P37);
                                    }
                                    vt4 vt4Var13 = (vt4) P37;
                                    boolean f23 = rv4Var6.f(t2cVar2);
                                    Object P38 = rv4Var6.P();
                                    if (f23 || P38 == obj17) {
                                        P38 = new i0c(t2cVar2, 6);
                                        rv4Var6.o0(P38);
                                    }
                                    vt4 vt4Var14 = (vt4) P38;
                                    boolean f24 = rv4Var6.f(t2cVar2);
                                    Object P39 = rv4Var6.P();
                                    if (!f24 && P39 != obj17) {
                                        vt4Var3 = vt4Var6;
                                    } else {
                                        vt4Var3 = vt4Var6;
                                        P39 = new i0c(t2cVar2, 7);
                                        rv4Var6.o0(P39);
                                    }
                                    vt4 vt4Var15 = (vt4) P39;
                                    boolean f25 = rv4Var6.f(t2cVar2);
                                    Object P40 = rv4Var6.P();
                                    if (f25 || P40 == obj17) {
                                        P40 = new i0c(t2cVar2, 8);
                                        rv4Var6.o0(P40);
                                    }
                                    vt4 vt4Var16 = (vt4) P40;
                                    boolean f26 = rv4Var6.f(t2cVar2);
                                    Object P41 = rv4Var6.P();
                                    if (f26 || P41 == obj17) {
                                        P41 = new c0c(t2cVar2, 4);
                                        rv4Var6.o0(P41);
                                    }
                                    xt4 xt4Var6 = (xt4) P41;
                                    boolean f27 = rv4Var6.f(t2cVar2);
                                    Object P42 = rv4Var6.P();
                                    if (f27 || P42 == obj17) {
                                        P42 = new m0c(t2cVar2, 0);
                                        rv4Var6.o0(P42);
                                    }
                                    pvcVar2 = pvcVar3;
                                    e1c.n(n1cVar, f1cVar, ozbVar, z1cVar, k2cVar, lhaVar2, qrVar2, ze4Var3, vt4Var4, vt4Var5, vt4Var3, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, vt4Var15, vt4Var16, xt4Var6, (lu4) P42, rv4Var6, (3670016 & (i11 << 18)) | 12582912);
                                    rv4Var5 = rv4Var6;
                                    rv4Var5.q(false);
                                } else {
                                    pvcVar2 = pvcVar3;
                                    rv4Var6.e0(182137345);
                                    n1c n1cVar2 = (n1c) yyaVar12.getValue();
                                    ozb ozbVar2 = (ozb) yyaVar13.getValue();
                                    f1c f1cVar2 = (f1c) yyaVar14.getValue();
                                    z1c z1cVar2 = (z1c) yyaVar15.getValue();
                                    boolean f28 = rv4Var6.f(t2cVar2);
                                    Object P43 = rv4Var6.P();
                                    if (!f28 && P43 != obj17) {
                                        qrVar = qrVar2;
                                    } else {
                                        qrVar = qrVar2;
                                        P43 = new i0c(t2cVar2, 9);
                                        rv4Var6.o0(P43);
                                    }
                                    vt4 vt4Var17 = (vt4) P43;
                                    boolean f29 = rv4Var6.f(t2cVar2);
                                    Object P44 = rv4Var6.P();
                                    if (f29 || P44 == obj17) {
                                        P44 = new i0c(t2cVar2, 10);
                                        rv4Var6.o0(P44);
                                    }
                                    vt4 vt4Var18 = (vt4) P44;
                                    boolean f30 = rv4Var6.f(t2cVar2) | rv4Var6.f(xt4Var5) | rv4Var6.f(yyaVar12);
                                    Object P45 = rv4Var6.P();
                                    if (!f30 && P45 != obj17) {
                                        i8 = 0;
                                    } else {
                                        i8 = 0;
                                        P45 = new vt4() { // from class: o0c
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i12 = r4;
                                                pvc pvcVar4 = pvc.a;
                                                yya yyaVar16 = yyaVar12;
                                                xt4 xt4Var62 = xt4Var5;
                                                t2c t2cVar3 = t2cVar2;
                                                switch (i12) {
                                                    case 0:
                                                        t2cVar3.k();
                                                        xt4Var62.invoke(((n1c) yyaVar16.getValue()).a);
                                                        return pvcVar4;
                                                    default:
                                                        t2cVar3.k();
                                                        xt4Var62.invoke(((n1c) yyaVar16.getValue()).a);
                                                        return pvcVar4;
                                                }
                                            }
                                        };
                                        rv4Var6.o0(P45);
                                    }
                                    vt4 vt4Var19 = (vt4) P45;
                                    Object P46 = rv4Var6.P();
                                    if (P46 == obj17) {
                                        P46 = new p0c(aw7Var10, i8);
                                        rv4Var6.o0(P46);
                                    }
                                    vt4 vt4Var20 = (vt4) P46;
                                    boolean f31 = rv4Var6.f(t2cVar2);
                                    Object P47 = rv4Var6.P();
                                    if (!f31 && P47 != obj17) {
                                        i9 = 1;
                                    } else {
                                        i9 = 1;
                                        P47 = new vt4() { // from class: l0c
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i12 = r3;
                                                pvc pvcVar4 = pvc.a;
                                                aw7 aw7Var15 = aw7Var11;
                                                t2c t2cVar3 = t2cVar2;
                                                switch (i12) {
                                                    case 0:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 1:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 2:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    default:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                }
                                            }
                                        };
                                        rv4Var6.o0(P47);
                                    }
                                    vt4 vt4Var21 = (vt4) P47;
                                    Object P48 = rv4Var6.P();
                                    if (P48 == obj17) {
                                        P48 = new p0c(aw7Var13, i9);
                                        rv4Var6.o0(P48);
                                    }
                                    vt4 vt4Var22 = (vt4) P48;
                                    Object P49 = rv4Var6.P();
                                    if (P49 == obj17) {
                                        P49 = new p0c(aw7Var12, 2);
                                        rv4Var6.o0(P49);
                                    }
                                    vt4 vt4Var23 = P49;
                                    boolean f32 = rv4Var6.f(t2cVar2);
                                    Object P50 = rv4Var6.P();
                                    if (f32 || P50 == obj17) {
                                        P50 = new vt4() { // from class: l0c
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i12 = r3;
                                                pvc pvcVar4 = pvc.a;
                                                aw7 aw7Var15 = aw7Var14;
                                                t2c t2cVar3 = t2cVar2;
                                                switch (i12) {
                                                    case 0:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 1:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    case 2:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                    default:
                                                        aw7Var15.setValue(Boolean.TRUE);
                                                        t2cVar3.p();
                                                        return pvcVar4;
                                                }
                                            }
                                        };
                                        rv4Var6.o0(P50);
                                    }
                                    vt4 vt4Var24 = (vt4) P50;
                                    boolean f33 = rv4Var6.f(t2cVar2);
                                    Object P51 = rv4Var6.P();
                                    if (f33 || P51 == obj17) {
                                        P51 = new i0c(t2cVar2, 11);
                                        rv4Var6.o0(P51);
                                    }
                                    vt4 vt4Var25 = (vt4) P51;
                                    boolean f34 = rv4Var6.f(t2cVar2);
                                    Object P52 = rv4Var6.P();
                                    if (f34 || P52 == obj17) {
                                        P52 = new i0c(t2cVar2, 12);
                                        rv4Var6.o0(P52);
                                    }
                                    vt4 vt4Var26 = P52;
                                    boolean f35 = rv4Var6.f(t2cVar2);
                                    Object P53 = rv4Var6.P();
                                    if (f35 || P53 == obj17) {
                                        P53 = new i0c(t2cVar2, 13);
                                        rv4Var6.o0(P53);
                                    }
                                    vt4 vt4Var27 = (vt4) P53;
                                    boolean f36 = rv4Var6.f(t2cVar2);
                                    Object P54 = rv4Var6.P();
                                    if (f36 || P54 == obj17) {
                                        P54 = new i0c(t2cVar2, 14);
                                        rv4Var6.o0(P54);
                                    }
                                    vt4 vt4Var28 = (vt4) P54;
                                    boolean f37 = rv4Var6.f(t2cVar2);
                                    Object P55 = rv4Var6.P();
                                    if (f37 || P55 == obj17) {
                                        P55 = new i0c(t2cVar2, 15);
                                        rv4Var6.o0(P55);
                                    }
                                    vt4 vt4Var29 = (vt4) P55;
                                    boolean f38 = rv4Var6.f(t2cVar2);
                                    Object P56 = rv4Var6.P();
                                    if (f38 || P56 == obj17) {
                                        P56 = new c0c(t2cVar2, 5);
                                        rv4Var6.o0(P56);
                                    }
                                    e1c.m(n1cVar2, f1cVar2, ozbVar2, z1cVar2, lhaVar3, qrVar, ze4Var3, vt4Var17, vt4Var18, vt4Var19, vt4Var20, vt4Var21, vt4Var22, vt4Var23, vt4Var24, vt4Var25, vt4Var26, vt4Var27, vt4Var28, vt4Var29, (xt4) P56, rv4Var6, 1572864 | (458752 & (i11 << 15)));
                                    rv4Var5 = rv4Var6;
                                    rv4Var5.q(false);
                                }
                                rv4Var5.q(true);
                                rv4Var5.q(true);
                                return pvcVar2;
                            }
                            rv4Var6.X();
                            return pvcVar3;
                        }
                    }, rv4Var4), rv4Var4, 196608, 18);
                    boolean booleanValue = ((Boolean) aw7Var5.getValue()).booleanValue();
                    float f12 = ((ozb) yyaVar8.getValue()).a;
                    float f13 = ((ozb) yyaVar8.getValue()).b;
                    Object P21 = rv4Var4.P();
                    if (P21 == obj4) {
                        P21 = new wmb(aw7Var5, 28);
                        rv4Var4.o0(P21);
                    }
                    xt4 xt4Var5 = (xt4) P21;
                    boolean f14 = rv4Var4.f(t2cVar);
                    Object P22 = rv4Var4.P();
                    if (f14 || P22 == obj4) {
                        P22 = new c0c(t2cVar, 1);
                        rv4Var4.o0(P22);
                    }
                    xt4 xt4Var6 = (xt4) P22;
                    boolean f15 = rv4Var4.f(t2cVar);
                    Object P23 = rv4Var4.P();
                    if (f15 || P23 == obj4) {
                        P23 = new c0c(t2cVar, 2);
                        rv4Var4.o0(P23);
                    }
                    dpe.c(booleanValue, z15, f12, f13, null, xt4Var5, xt4Var6, (xt4) P23, rv4Var4, 196608);
                    boolean booleanValue2 = ((Boolean) aw7Var6.getValue()).booleanValue();
                    long j4 = ((ozb) yyaVar8.getValue()).c;
                    boolean z16 = ((ozb) yyaVar8.getValue()).d;
                    Object P24 = rv4Var4.P();
                    if (P24 == obj4) {
                        P24 = new wmb(aw7Var6, 29);
                        rv4Var4.o0(P24);
                    }
                    xt4 xt4Var7 = (xt4) P24;
                    boolean f16 = rv4Var4.f(t2cVar);
                    Object P25 = rv4Var4.P();
                    if (f16 || P25 == obj4) {
                        P25 = new lu4() { // from class: e0c
                            @Override // defpackage.lu4
                            public final Object invoke(Object obj14, Object obj15) {
                                int i8 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var10 = aw7Var6;
                                switch (i8) {
                                    case 0:
                                        int intValue5 = ((Integer) obj14).intValue();
                                        ((Float) obj15).getClass();
                                        aw7Var10.setValue(Boolean.FALSE);
                                        t2c t2cVar2 = t2cVar;
                                        t2cVar2.getClass();
                                        hk1 a5 = jdd.a(t2cVar2);
                                        sw2 sw2Var = ab3.a;
                                        t2cVar2.f(a5, ru2.c, new m2c(t2cVar2, intValue5, (m42) null));
                                        return pvcVar2;
                                    default:
                                        long longValue = ((Long) obj14).longValue();
                                        boolean booleanValue3 = ((Boolean) obj15).booleanValue();
                                        t2c t2cVar3 = t2cVar;
                                        t2cVar3.getClass();
                                        hk1 a6 = jdd.a(t2cVar3);
                                        sw2 sw2Var2 = ab3.a;
                                        t2cVar3.f(a6, ru2.c, new s2c(t2cVar3, longValue, booleanValue3, null));
                                        aw7Var10.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var4.o0(P25);
                    }
                    fpe.h(booleanValue2, z15, j4, z16, xt4Var7, (lu4) P25, rv4Var4, 24576);
                    boolean booleanValue3 = ((Boolean) aw7Var9.getValue()).booleanValue();
                    boolean z17 = ((ozb) yyaVar8.getValue()).e;
                    float f17 = ((ozb) yyaVar8.getValue()).f;
                    List list3 = ((ozb) yyaVar8.getValue()).g;
                    Object P26 = rv4Var4.P();
                    if (P26 == obj4) {
                        P26 = new g0c(aw7Var9, 0);
                        rv4Var4.o0(P26);
                    }
                    xt4 xt4Var8 = (xt4) P26;
                    boolean f18 = rv4Var4.f(t2cVar);
                    Object P27 = rv4Var4.P();
                    if (f18 || P27 == obj4) {
                        P27 = new c0c(t2cVar, 3);
                        rv4Var4.o0(P27);
                    }
                    xt4 xt4Var9 = (xt4) P27;
                    boolean f19 = rv4Var4.f(t2cVar);
                    Object P28 = rv4Var4.P();
                    if (f19 || P28 == obj4) {
                        P28 = new c0c(t2cVar, 0);
                        rv4Var4.o0(P28);
                    }
                    xt4 xt4Var10 = (xt4) P28;
                    boolean f20 = rv4Var4.f(t2cVar) | rv4Var4.f(cz7Var3);
                    Object P29 = rv4Var4.P();
                    if (f20 || P29 == obj4) {
                        P29 = new vt4() { // from class: d0c
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i8 = r4;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var10 = aw7Var9;
                                cz7 cz7Var4 = cz7Var3;
                                t2c t2cVar2 = t2cVar;
                                switch (i8) {
                                    case 0:
                                        aw7Var10.setValue(Boolean.FALSE);
                                        t2cVar2.k();
                                        cz7Var4.getClass();
                                        cz7Var4.b(oda.INSTANCE);
                                        return pvcVar2;
                                    default:
                                        aw7Var10.setValue(Boolean.FALSE);
                                        t2cVar2.k();
                                        cz7Var4.getClass();
                                        cz7Var4.b(hca.INSTANCE);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var4.o0(P29);
                    }
                    xoe.a(booleanValue3, z15, z17, f17, list3, null, xt4Var8, xt4Var9, xt4Var10, (vt4) P29, rv4Var4, 1572864);
                    boolean booleanValue4 = ((Boolean) aw7Var7.getValue()).booleanValue();
                    Object P30 = rv4Var4.P();
                    if (P30 == obj4) {
                        P30 = new wmb(aw7Var7, 26);
                        rv4Var4.o0(P30);
                    }
                    xt4 xt4Var11 = (xt4) P30;
                    boolean f21 = rv4Var4.f(t2cVar) | rv4Var4.f(cz7Var3);
                    Object P31 = rv4Var4.P();
                    if (f21 || P31 == obj4) {
                        P31 = new r6a(17, t2cVar, cz7Var3, aw7Var7);
                        rv4Var4.o0(P31);
                    }
                    xt4 xt4Var12 = (xt4) P31;
                    boolean f22 = rv4Var4.f(t2cVar) | rv4Var4.f(cz7Var3);
                    Object P32 = rv4Var4.P();
                    if (f22 || P32 == obj4) {
                        P32 = new vt4() { // from class: d0c
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i8 = r4;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var10 = aw7Var7;
                                cz7 cz7Var4 = cz7Var3;
                                t2c t2cVar2 = t2cVar;
                                switch (i8) {
                                    case 0:
                                        aw7Var10.setValue(Boolean.FALSE);
                                        t2cVar2.k();
                                        cz7Var4.getClass();
                                        cz7Var4.b(oda.INSTANCE);
                                        return pvcVar2;
                                    default:
                                        aw7Var10.setValue(Boolean.FALSE);
                                        t2cVar2.k();
                                        cz7Var4.getClass();
                                        cz7Var4.b(hca.INSTANCE);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var4.o0(P32);
                    }
                    ape.e(booleanValue4, z15, null, xt4Var11, xt4Var12, (vt4) P32, rv4Var4, 3072);
                    boolean booleanValue5 = ((Boolean) aw7Var8.getValue()).booleanValue();
                    String str10 = ((k2c) yyaVar11.getValue()).a;
                    List list4 = ((k2c) yyaVar11.getValue()).b;
                    Object P33 = rv4Var4.P();
                    if (P33 == obj4) {
                        P33 = new wmb(aw7Var8, 27);
                        rv4Var4.o0(P33);
                    }
                    xt4 xt4Var13 = (xt4) P33;
                    boolean f23 = rv4Var4.f(t2cVar);
                    Object P34 = rv4Var4.P();
                    if (f23 || P34 == obj4) {
                        P34 = new lu4() { // from class: e0c
                            @Override // defpackage.lu4
                            public final Object invoke(Object obj14, Object obj15) {
                                int i8 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var10 = aw7Var8;
                                switch (i8) {
                                    case 0:
                                        int intValue5 = ((Integer) obj14).intValue();
                                        ((Float) obj15).getClass();
                                        aw7Var10.setValue(Boolean.FALSE);
                                        t2c t2cVar2 = t2cVar;
                                        t2cVar2.getClass();
                                        hk1 a5 = jdd.a(t2cVar2);
                                        sw2 sw2Var = ab3.a;
                                        t2cVar2.f(a5, ru2.c, new m2c(t2cVar2, intValue5, (m42) null));
                                        return pvcVar2;
                                    default:
                                        long longValue = ((Long) obj14).longValue();
                                        boolean booleanValue32 = ((Boolean) obj15).booleanValue();
                                        t2c t2cVar3 = t2cVar;
                                        t2cVar3.getClass();
                                        hk1 a6 = jdd.a(t2cVar3);
                                        sw2 sw2Var2 = ab3.a;
                                        t2cVar3.f(a6, ru2.c, new s2c(t2cVar3, longValue, booleanValue32, null));
                                        aw7Var10.setValue(Boolean.FALSE);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var4.o0(P34);
                    }
                    s9e.i(booleanValue5, z15, str10, list4, xt4Var13, (lu4) P34, rv4Var4, 24576);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ l68(t2c t2cVar, cz7 cz7Var, aw7 aw7Var, lha lhaVar, xt4 xt4Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5) {
        this.a = 3;
        this.F = t2cVar;
        this.c = cz7Var;
        this.f = aw7Var;
        this.b = lhaVar;
        this.d = xt4Var;
        this.C = aw7Var2;
        this.E = aw7Var3;
        this.e = aw7Var4;
        this.D = aw7Var5;
    }

    public /* synthetic */ l68(y5c y5cVar, ix5 ix5Var, cz7 cz7Var, rh8 rh8Var, aw7 aw7Var, yya yyaVar, yya yyaVar2, aw7 aw7Var2, yya yyaVar3, int i) {
        this.a = i;
        this.F = y5cVar;
        this.b = ix5Var;
        this.c = cz7Var;
        this.d = rh8Var;
        this.e = aw7Var;
        this.f = yyaVar;
        this.C = yyaVar2;
        this.D = aw7Var2;
        this.E = yyaVar3;
    }
}
