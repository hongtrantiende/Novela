package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pp0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ pp0(aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = ax1.a;
        final aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ar5 c = rp5.c((wk3) ok3.l0.getValue(), rv4Var, 0);
                    boolean f = rv4Var.f(aw7Var2);
                    Object P = rv4Var.P();
                    if (f || P == obj4) {
                        P = new en(aw7Var2, 8);
                        rv4Var.o0(P);
                    }
                    kwe.d(c, null, 0L, (vt4) P, rv4Var, 0, 6);
                    ar5 c2 = rp5.c((wk3) jk3.a.getValue(), rv4Var, 0);
                    boolean f2 = rv4Var.f(aw7Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj4) {
                        P2 = new en(aw7Var, 9);
                        rv4Var.o0(P2);
                    }
                    kwe.d(c2, null, 0L, (vt4) P2, rv4Var, 0, 6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    List list = ((y81) aw7Var2.getValue()).b;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        final r81 r81Var = (r81) list.get(i2);
                        String str = r81Var.b;
                        List list2 = (List) aw7Var.getValue();
                        if (list2 != null && list2.contains(r81Var.a)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean h = rv4Var2.h(r81Var);
                        Object P3 = rv4Var2.P();
                        if (h || P3 == obj4) {
                            P3 = new vt4() { // from class: qd7
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    ArrayList o0;
                                    ArrayList o02;
                                    int i3 = r3;
                                    pvc pvcVar2 = pvc.a;
                                    aw7 aw7Var3 = aw7Var;
                                    r81 r81Var2 = r81Var;
                                    switch (i3) {
                                        case 0:
                                            String str2 = r81Var2.a;
                                            List list3 = (List) aw7Var3.getValue();
                                            if (list3 != null && list3.contains(str2)) {
                                                List list4 = (List) aw7Var3.getValue();
                                                if (list4 != null) {
                                                    o0 = new ArrayList();
                                                    for (Object obj5 : list4) {
                                                        if (!c16.i((String) obj5, str2)) {
                                                            o0.add(obj5);
                                                        }
                                                    }
                                                } else {
                                                    o0 = null;
                                                }
                                            } else {
                                                Collection collection = (List) aw7Var3.getValue();
                                                if (collection == null) {
                                                    collection = ks3.a;
                                                }
                                                o0 = sl1.o0(collection, str2);
                                            }
                                            aw7Var3.setValue(o0);
                                            return pvcVar2;
                                        default:
                                            String str3 = r81Var2.a;
                                            if (((List) aw7Var3.getValue()).contains(str3)) {
                                                o02 = new ArrayList();
                                                for (Object obj6 : (List) aw7Var3.getValue()) {
                                                    if (!c16.i((String) obj6, str3)) {
                                                        o02.add(obj6);
                                                    }
                                                }
                                            } else {
                                                o02 = sl1.o0((List) aw7Var3.getValue(), str3);
                                            }
                                            aw7Var3.setValue(o02);
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var2.o0(P3);
                        }
                        ese.m(0, (vt4) P3, rv4Var2, null, null, null, str, z3);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z4)) {
                    List list3 = ((y81) aw7Var2.getValue()).b;
                    int size2 = list3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        final r81 r81Var2 = (r81) list3.get(i3);
                        String str2 = r81Var2.b;
                        boolean contains = ((List) aw7Var.getValue()).contains(r81Var2.a);
                        boolean h2 = rv4Var3.h(r81Var2);
                        Object P4 = rv4Var3.P();
                        if (h2 || P4 == obj4) {
                            P4 = new vt4() { // from class: qd7
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    ArrayList o0;
                                    ArrayList o02;
                                    int i32 = r3;
                                    pvc pvcVar2 = pvc.a;
                                    aw7 aw7Var3 = aw7Var;
                                    r81 r81Var22 = r81Var2;
                                    switch (i32) {
                                        case 0:
                                            String str22 = r81Var22.a;
                                            List list32 = (List) aw7Var3.getValue();
                                            if (list32 != null && list32.contains(str22)) {
                                                List list4 = (List) aw7Var3.getValue();
                                                if (list4 != null) {
                                                    o0 = new ArrayList();
                                                    for (Object obj5 : list4) {
                                                        if (!c16.i((String) obj5, str22)) {
                                                            o0.add(obj5);
                                                        }
                                                    }
                                                } else {
                                                    o0 = null;
                                                }
                                            } else {
                                                Collection collection = (List) aw7Var3.getValue();
                                                if (collection == null) {
                                                    collection = ks3.a;
                                                }
                                                o0 = sl1.o0(collection, str22);
                                            }
                                            aw7Var3.setValue(o0);
                                            return pvcVar2;
                                        default:
                                            String str3 = r81Var22.a;
                                            if (((List) aw7Var3.getValue()).contains(str3)) {
                                                o02 = new ArrayList();
                                                for (Object obj6 : (List) aw7Var3.getValue()) {
                                                    if (!c16.i((String) obj6, str3)) {
                                                        o02.add(obj6);
                                                    }
                                                }
                                            } else {
                                                o02 = sl1.o0((List) aw7Var3.getValue(), str3);
                                            }
                                            aw7Var3.setValue(o02);
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var3.o0(P4);
                        }
                        ese.m(0, (vt4) P4, rv4Var3, null, null, null, str2, contains);
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z5)) {
                    kq7 kq7Var = kq7.a;
                    nq7 p = pna.p(zbe.y(kq7Var, 2.0f), 100.0f, 60.0f);
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(st0.d(tte.k(p, ((h27) rv4Var4.j(tzaVar)).c.a), 1.0f, zl1.b(0.1f, ((h27) rv4Var4.j(tzaVar)).a.a), ((h27) rv4Var4.j(tzaVar)).c.a), zl1.b(0.1f, ((h27) rv4Var4.j(tzaVar)).a.a), lre.g);
                    boolean f3 = rv4Var4.f(aw7Var2);
                    Object P5 = rv4Var4.P();
                    if (f3 || P5 == obj4) {
                        P5 = new he1(aw7Var, aw7Var2, 16);
                        rv4Var4.o0(P5);
                    }
                    nq7 b = q1d.b(v, false, nae.e, (vt4) P5, 3);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var4.T);
                    xt8 l = rv4Var4.l();
                    nq7 p2 = lye.p(rv4Var4, b);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, d);
                    jce.F(qw1.e, rv4Var4, l);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p2);
                    cvb.c(yqe.A((y3b) v1b.f.getValue(), rv4Var4), pu0.a.a(kq7Var, kh5.e), ((h27) rv4Var4.j(tzaVar)).a.q, null, zr1.q(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var4, 24576, 0, 262120);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
