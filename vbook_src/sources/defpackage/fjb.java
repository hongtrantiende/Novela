package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fjb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjb implements mu4 {
    public final /* synthetic */ wk3[] C;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ s35 e;
    public final /* synthetic */ wk3[] f;

    public /* synthetic */ fjb(List list, int i, xt4 xt4Var, s35 s35Var, wk3[] wk3VarArr, wk3[] wk3VarArr2, int i2) {
        this.a = i2;
        this.b = list;
        this.c = i;
        this.d = xt4Var;
        this.e = s35Var;
        this.f = wk3VarArr;
        this.C = wk3VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, qid] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        final boolean z3;
        boolean z4;
        int i;
        int i2 = this.a;
        int i3 = 2;
        lh9 lh9Var = ax1.a;
        final s35 s35Var = this.e;
        final xt4 xt4Var = this.d;
        int i4 = this.c;
        pvc pvcVar = pvc.a;
        final int i5 = 1;
        final int i6 = 0;
        switch (i2) {
            case 0:
                su0 su0Var = (su0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(su0Var)) {
                        i3 = 4;
                    }
                    intValue |= i3;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    k2a u = rte.u(rv4Var);
                    kq7 kq7Var = kq7.a;
                    nq7 C = rte.C(kq7Var, u, 14);
                    nk0 nk0Var = kh5.d;
                    pu0 pu0Var = pu0.a;
                    l08.a(pu0Var.a(C, nk0Var), zl1.h, rm1.b(((h27) rv4Var.j(j27.a)).a.p, rv4Var), new Object(), jce.E(1882372649, new fjb(this.b, this.c, this.d, this.e, this.f, this.C, 2), rv4Var), rv4Var, 196656);
                    if (rg3.a(su0Var.c(), 336.0f) >= 0) {
                        rv4Var.e0(-1304791907);
                        dxe.i(rp5.a((wk3) ok3.C.getValue(), rv4Var, 0), "", pu0Var.a(pna.n(zbe.y(kq7Var, 10.0f), 36.0f), kh5.b), rv4Var, 48, 248);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1304495919);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                hv9 hv9Var = (hv9) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                hv9Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(hv9Var)) {
                        i3 = 4;
                    }
                    intValue2 |= i3;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    List list = this.b;
                    int size = list.size();
                    final int i7 = 0;
                    while (i7 < size) {
                        String str = (String) list.get(i7);
                        if (i4 == i7) {
                            z3 = 1;
                        } else {
                            z3 = i6;
                        }
                        boolean f = rv4Var2.f(xt4Var) | rv4Var2.d(i7) | rv4Var2.h(s35Var);
                        Object P = rv4Var2.P();
                        if (f || P == lh9Var) {
                            P = new vt4() { // from class: ijb
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    int i8 = i6;
                                    pvc pvcVar2 = pvc.a;
                                    s35 s35Var2 = s35Var;
                                    int i9 = i7;
                                    xt4 xt4Var2 = xt4Var;
                                    switch (i8) {
                                        case 0:
                                            xt4Var2.invoke(Integer.valueOf(i9));
                                            ((dx8) s35Var2).a(0);
                                            return pvcVar2;
                                        default:
                                            xt4Var2.invoke(Integer.valueOf(i9));
                                            ((dx8) s35Var2).a(0);
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var2.o0(P);
                        }
                        final wk3[] wk3VarArr = this.f;
                        final wk3[] wk3VarArr2 = this.C;
                        final List list2 = list;
                        final int i8 = i7;
                        pt0.a(hv9Var, z3, (vt4) P, jce.E(-951551459, new lu4() { // from class: jjb
                            @Override // defpackage.lu4
                            public final Object invoke(Object obj4, Object obj5) {
                                int i9 = r6;
                                pvc pvcVar2 = pvc.a;
                                lh9 lh9Var2 = ax1.a;
                                boolean z5 = false;
                                boolean z6 = z3;
                                switch (i9) {
                                    case 0:
                                        rv4 rv4Var3 = (rv4) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        if ((intValue3 & 3) != 2) {
                                            z5 = true;
                                        }
                                        if (rv4Var3.U(intValue3 & 1, z5)) {
                                            Boolean valueOf = Boolean.valueOf(z6);
                                            Object P2 = rv4Var3.P();
                                            if (P2 == lh9Var2) {
                                                P2 = new dva(14);
                                                rv4Var3.o0(P2);
                                            }
                                            final wk3[] wk3VarArr3 = wk3VarArr;
                                            final int i10 = i8;
                                            final wk3[] wk3VarArr4 = wk3VarArr2;
                                            final List list3 = list2;
                                            b16.c(valueOf, null, (xt4) P2, null, null, null, jce.E(1176842016, new nu4() { // from class: hjb
                                                @Override // defpackage.nu4
                                                public final Object h(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                    boolean z7;
                                                    wk3 wk3Var;
                                                    boolean z8;
                                                    wk3 wk3Var2;
                                                    int i11 = r5;
                                                    pvc pvcVar3 = pvc.a;
                                                    kq7 kq7Var2 = kq7.a;
                                                    int i12 = 16;
                                                    List list4 = list3;
                                                    wk3[] wk3VarArr5 = wk3VarArr4;
                                                    int i13 = i10;
                                                    wk3[] wk3VarArr6 = wk3VarArr3;
                                                    switch (i11) {
                                                        case 0:
                                                            boolean booleanValue = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var4 = (rv4) obj8;
                                                            int intValue4 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue4 & 48) == 0) {
                                                                if (rv4Var4.g(booleanValue)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue4 |= i12;
                                                            }
                                                            if ((intValue4 & Token.TARGET) != 144) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (rv4Var4.U(intValue4 & 1, z7)) {
                                                                nq7 n = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue) {
                                                                    wk3Var = wk3VarArr6[i13];
                                                                } else {
                                                                    wk3Var = wk3VarArr5[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var, rv4Var4, 0), (String) list4.get(i13), n, 0L, rv4Var4, 384, 8);
                                                            } else {
                                                                rv4Var4.X();
                                                            }
                                                            return pvcVar3;
                                                        default:
                                                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var5 = (rv4) obj8;
                                                            int intValue5 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue5 & 48) == 0) {
                                                                if (rv4Var5.g(booleanValue2)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue5 |= i12;
                                                            }
                                                            if ((intValue5 & Token.TARGET) != 144) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (rv4Var5.U(intValue5 & 1, z8)) {
                                                                nq7 n2 = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue2) {
                                                                    wk3Var2 = wk3VarArr6[i13];
                                                                } else {
                                                                    wk3Var2 = wk3VarArr5[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var2, rv4Var5, 0), (String) list4.get(i13), n2, 0L, rv4Var5, 384, 8);
                                                            } else {
                                                                rv4Var5.X();
                                                            }
                                                            return pvcVar3;
                                                    }
                                                }
                                            }, rv4Var3), rv4Var3, 1573248, 58);
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar2;
                                    default:
                                        rv4 rv4Var4 = (rv4) obj4;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        if ((intValue4 & 3) != 2) {
                                            z5 = true;
                                        }
                                        if (rv4Var4.U(intValue4 & 1, z5)) {
                                            Boolean valueOf2 = Boolean.valueOf(z6);
                                            Object P3 = rv4Var4.P();
                                            if (P3 == lh9Var2) {
                                                P3 = new dva(15);
                                                rv4Var4.o0(P3);
                                            }
                                            final wk3[] wk3VarArr5 = wk3VarArr;
                                            final int i11 = i8;
                                            final wk3[] wk3VarArr6 = wk3VarArr2;
                                            final List list4 = list2;
                                            b16.c(valueOf2, null, (xt4) P3, null, null, null, jce.E(-573613668, new nu4() { // from class: hjb
                                                @Override // defpackage.nu4
                                                public final Object h(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                    boolean z7;
                                                    wk3 wk3Var;
                                                    boolean z8;
                                                    wk3 wk3Var2;
                                                    int i112 = r5;
                                                    pvc pvcVar3 = pvc.a;
                                                    kq7 kq7Var2 = kq7.a;
                                                    int i12 = 16;
                                                    List list42 = list4;
                                                    wk3[] wk3VarArr52 = wk3VarArr6;
                                                    int i13 = i11;
                                                    wk3[] wk3VarArr62 = wk3VarArr5;
                                                    switch (i112) {
                                                        case 0:
                                                            boolean booleanValue = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var42 = (rv4) obj8;
                                                            int intValue42 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue42 & 48) == 0) {
                                                                if (rv4Var42.g(booleanValue)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue42 |= i12;
                                                            }
                                                            if ((intValue42 & Token.TARGET) != 144) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (rv4Var42.U(intValue42 & 1, z7)) {
                                                                nq7 n = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue) {
                                                                    wk3Var = wk3VarArr62[i13];
                                                                } else {
                                                                    wk3Var = wk3VarArr52[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var, rv4Var42, 0), (String) list42.get(i13), n, 0L, rv4Var42, 384, 8);
                                                            } else {
                                                                rv4Var42.X();
                                                            }
                                                            return pvcVar3;
                                                        default:
                                                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var5 = (rv4) obj8;
                                                            int intValue5 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue5 & 48) == 0) {
                                                                if (rv4Var5.g(booleanValue2)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue5 |= i12;
                                                            }
                                                            if ((intValue5 & Token.TARGET) != 144) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (rv4Var5.U(intValue5 & 1, z8)) {
                                                                nq7 n2 = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue2) {
                                                                    wk3Var2 = wk3VarArr62[i13];
                                                                } else {
                                                                    wk3Var2 = wk3VarArr52[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var2, rv4Var5, 0), (String) list42.get(i13), n2, 0L, rv4Var5, 384, 8);
                                                            } else {
                                                                rv4Var5.X();
                                                            }
                                                            return pvcVar3;
                                                    }
                                                }
                                            }, rv4Var4), rv4Var4, 1573248, 58);
                                        } else {
                                            rv4Var4.X();
                                        }
                                        return pvcVar2;
                                }
                            }
                        }, rv4Var2), null, false, jce.E(-914556256, new tm5(list2, i8, 7), rv4Var2), rv4Var2, (intValue2 & 14) | 1575936);
                        i7 = i8 + 1;
                        list = list2;
                        i6 = 0;
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z4)) {
                    List list3 = this.b;
                    int size2 = list3.size();
                    final int i9 = 0;
                    while (i9 < size2) {
                        String str2 = (String) list3.get(i9);
                        if (i4 == i9) {
                            i = i5;
                        } else {
                            i = 0;
                        }
                        boolean f2 = rv4Var3.f(xt4Var) | rv4Var3.d(i9) | rv4Var3.h(s35Var);
                        Object P2 = rv4Var3.P();
                        if (f2 || P2 == lh9Var) {
                            P2 = new vt4() { // from class: ijb
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    int i82 = i5;
                                    pvc pvcVar2 = pvc.a;
                                    s35 s35Var2 = s35Var;
                                    int i92 = i9;
                                    xt4 xt4Var2 = xt4Var;
                                    switch (i82) {
                                        case 0:
                                            xt4Var2.invoke(Integer.valueOf(i92));
                                            ((dx8) s35Var2).a(0);
                                            return pvcVar2;
                                        default:
                                            xt4Var2.invoke(Integer.valueOf(i92));
                                            ((dx8) s35Var2).a(0);
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var3.o0(P2);
                        }
                        vt4 vt4Var = (vt4) P2;
                        un6 un6Var = (un6) rv4Var3.j(nu6.a);
                        boolean h = rv4Var3.h(un6Var) | rv4Var3.f(vt4Var);
                        int i10 = i5;
                        Object P3 = rv4Var3.P();
                        if (h || P3 == lh9Var) {
                            P3 = new u93(un6Var, vt4Var);
                            rv4Var3.o0(P3);
                        }
                        final boolean z5 = i;
                        final wk3[] wk3VarArr3 = this.f;
                        final wk3[] wk3VarArr4 = this.C;
                        final List list4 = list3;
                        final int i11 = i9;
                        rv4 rv4Var4 = rv4Var3;
                        l08.b(z5, (vt4) P3, jce.E(-1701673601, new lu4() { // from class: jjb
                            @Override // defpackage.lu4
                            public final Object invoke(Object obj4, Object obj5) {
                                int i92 = r6;
                                pvc pvcVar2 = pvc.a;
                                lh9 lh9Var2 = ax1.a;
                                boolean z52 = false;
                                boolean z6 = z5;
                                switch (i92) {
                                    case 0:
                                        rv4 rv4Var32 = (rv4) obj4;
                                        int intValue32 = ((Integer) obj5).intValue();
                                        if ((intValue32 & 3) != 2) {
                                            z52 = true;
                                        }
                                        if (rv4Var32.U(intValue32 & 1, z52)) {
                                            Boolean valueOf = Boolean.valueOf(z6);
                                            Object P22 = rv4Var32.P();
                                            if (P22 == lh9Var2) {
                                                P22 = new dva(14);
                                                rv4Var32.o0(P22);
                                            }
                                            final wk3[] wk3VarArr32 = wk3VarArr3;
                                            final int i102 = i11;
                                            final wk3[] wk3VarArr42 = wk3VarArr4;
                                            final List list32 = list4;
                                            b16.c(valueOf, null, (xt4) P22, null, null, null, jce.E(1176842016, new nu4() { // from class: hjb
                                                @Override // defpackage.nu4
                                                public final Object h(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                    boolean z7;
                                                    wk3 wk3Var;
                                                    boolean z8;
                                                    wk3 wk3Var2;
                                                    int i112 = r5;
                                                    pvc pvcVar3 = pvc.a;
                                                    kq7 kq7Var2 = kq7.a;
                                                    int i12 = 16;
                                                    List list42 = list32;
                                                    wk3[] wk3VarArr52 = wk3VarArr42;
                                                    int i13 = i102;
                                                    wk3[] wk3VarArr62 = wk3VarArr32;
                                                    switch (i112) {
                                                        case 0:
                                                            boolean booleanValue = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var42 = (rv4) obj8;
                                                            int intValue42 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue42 & 48) == 0) {
                                                                if (rv4Var42.g(booleanValue)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue42 |= i12;
                                                            }
                                                            if ((intValue42 & Token.TARGET) != 144) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (rv4Var42.U(intValue42 & 1, z7)) {
                                                                nq7 n = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue) {
                                                                    wk3Var = wk3VarArr62[i13];
                                                                } else {
                                                                    wk3Var = wk3VarArr52[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var, rv4Var42, 0), (String) list42.get(i13), n, 0L, rv4Var42, 384, 8);
                                                            } else {
                                                                rv4Var42.X();
                                                            }
                                                            return pvcVar3;
                                                        default:
                                                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var5 = (rv4) obj8;
                                                            int intValue5 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue5 & 48) == 0) {
                                                                if (rv4Var5.g(booleanValue2)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue5 |= i12;
                                                            }
                                                            if ((intValue5 & Token.TARGET) != 144) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (rv4Var5.U(intValue5 & 1, z8)) {
                                                                nq7 n2 = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue2) {
                                                                    wk3Var2 = wk3VarArr62[i13];
                                                                } else {
                                                                    wk3Var2 = wk3VarArr52[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var2, rv4Var5, 0), (String) list42.get(i13), n2, 0L, rv4Var5, 384, 8);
                                                            } else {
                                                                rv4Var5.X();
                                                            }
                                                            return pvcVar3;
                                                    }
                                                }
                                            }, rv4Var32), rv4Var32, 1573248, 58);
                                        } else {
                                            rv4Var32.X();
                                        }
                                        return pvcVar2;
                                    default:
                                        rv4 rv4Var42 = (rv4) obj4;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        if ((intValue4 & 3) != 2) {
                                            z52 = true;
                                        }
                                        if (rv4Var42.U(intValue4 & 1, z52)) {
                                            Boolean valueOf2 = Boolean.valueOf(z6);
                                            Object P32 = rv4Var42.P();
                                            if (P32 == lh9Var2) {
                                                P32 = new dva(15);
                                                rv4Var42.o0(P32);
                                            }
                                            final wk3[] wk3VarArr5 = wk3VarArr3;
                                            final int i112 = i11;
                                            final wk3[] wk3VarArr6 = wk3VarArr4;
                                            final List list42 = list4;
                                            b16.c(valueOf2, null, (xt4) P32, null, null, null, jce.E(-573613668, new nu4() { // from class: hjb
                                                @Override // defpackage.nu4
                                                public final Object h(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                    boolean z7;
                                                    wk3 wk3Var;
                                                    boolean z8;
                                                    wk3 wk3Var2;
                                                    int i1122 = r5;
                                                    pvc pvcVar3 = pvc.a;
                                                    kq7 kq7Var2 = kq7.a;
                                                    int i12 = 16;
                                                    List list422 = list42;
                                                    wk3[] wk3VarArr52 = wk3VarArr6;
                                                    int i13 = i112;
                                                    wk3[] wk3VarArr62 = wk3VarArr5;
                                                    switch (i1122) {
                                                        case 0:
                                                            boolean booleanValue = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var422 = (rv4) obj8;
                                                            int intValue42 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue42 & 48) == 0) {
                                                                if (rv4Var422.g(booleanValue)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue42 |= i12;
                                                            }
                                                            if ((intValue42 & Token.TARGET) != 144) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (rv4Var422.U(intValue42 & 1, z7)) {
                                                                nq7 n = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue) {
                                                                    wk3Var = wk3VarArr62[i13];
                                                                } else {
                                                                    wk3Var = wk3VarArr52[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var, rv4Var422, 0), (String) list422.get(i13), n, 0L, rv4Var422, 384, 8);
                                                            } else {
                                                                rv4Var422.X();
                                                            }
                                                            return pvcVar3;
                                                        default:
                                                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                                                            rv4 rv4Var5 = (rv4) obj8;
                                                            int intValue5 = ((Integer) obj9).intValue();
                                                            ((wq) obj6).getClass();
                                                            if ((intValue5 & 48) == 0) {
                                                                if (rv4Var5.g(booleanValue2)) {
                                                                    i12 = 32;
                                                                }
                                                                intValue5 |= i12;
                                                            }
                                                            if ((intValue5 & Token.TARGET) != 144) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (rv4Var5.U(intValue5 & 1, z8)) {
                                                                nq7 n2 = pna.n(kq7Var2, 24.0f);
                                                                if (booleanValue2) {
                                                                    wk3Var2 = wk3VarArr62[i13];
                                                                } else {
                                                                    wk3Var2 = wk3VarArr52[i13];
                                                                }
                                                                nk5.a(rp5.c(wk3Var2, rv4Var5, 0), (String) list422.get(i13), n2, 0L, rv4Var5, 384, 8);
                                                            } else {
                                                                rv4Var5.X();
                                                            }
                                                            return pvcVar3;
                                                    }
                                                }
                                            }, rv4Var42), rv4Var42, 1573248, 58);
                                        } else {
                                            rv4Var42.X();
                                        }
                                        return pvcVar2;
                                }
                            }
                        }, rv4Var3), null, false, false, null, rv4Var4, 384);
                        i9 = i11 + 1;
                        list3 = list4;
                        rv4Var3 = rv4Var4;
                        i5 = i10;
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
