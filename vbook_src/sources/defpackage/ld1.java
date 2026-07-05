package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ld1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld1 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ld1(xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var) {
        this.a = 13;
        this.d = aw7Var;
        this.b = xt4Var;
        this.c = xt4Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        c84 c84Var = (c84) this.c;
        i44 i44Var = (i44) this.b;
        yya yyaVar = (yya) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            d84 d84Var = ((d44) yyaVar.getValue()).e;
            nq7 f = pna.f(kq7.a, 1.0f);
            boolean f2 = rv4Var.f(i44Var);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                xe1 xe1Var = new xe1(2, i44Var, i44.class, "changeSetting", "changeSetting(Ljava/lang/String;Ljava/lang/String;)V", 0, 5);
                rv4Var.o0(xe1Var);
                P = xe1Var;
            }
            oue.e(d84Var, c84Var, f, (lu4) ((i76) P), rv4Var, 448);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        boolean z;
        aw7 aw7Var = (aw7) this.d;
        aw7 aw7Var2 = (aw7) this.c;
        String str = (String) this.b;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            int length = ((String) aw7Var2.getValue()).length();
            kq7 kq7Var = kq7.a;
            lh9 lh9Var = ax1.a;
            ez ezVar = lz.c;
            if (length > 0) {
                rv4Var.e0(-1474906301);
                nq7 f = pna.f(kq7Var, 1.0f);
                tza tzaVar = j27.a;
                nq7 v = nmd.v(tte.k(f, ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), lre.g);
                boolean f2 = rv4Var.f(aw7Var);
                Object P = rv4Var.P();
                if (f2 || P == lh9Var) {
                    P = new ea3(aw7Var, 22);
                    rv4Var.o0(P);
                }
                nq7 y = zbe.y(lbe.f(15, (vt4) P, v, null, false), 14.0f);
                xn1 a = wn1.a(ezVar, kh5.I, rv4Var, 0);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, y);
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
                cvb.c((String) aw7Var2.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 4, 0, null, ((h27) rv4Var.j(tzaVar)).b.j, rv4Var, 0, 24960, 110590);
                xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
                cvb.c(str, null, zl1.b(0.5f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 0, 24960, 110586);
                rv4Var.q(true);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1473947688);
                nq7 f3 = pna.f(kq7Var, 1.0f);
                xn1 a2 = wn1.a(ezVar, kh5.J, rv4Var, 48);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, f3);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a2);
                jce.F(qw1.e, rv4Var, l2);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p2);
                String A = yqe.A((y3b) s2b.U.getValue(), rv4Var);
                tza tzaVar2 = j27.a;
                cvb.c(A, null, zl1.b(0.8f, ((h27) rv4Var.j(tzaVar2)).a.q), null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar2)).b.j, rv4Var, 0, 0, 130042);
                xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
                ar5 c = rp5.c((wk3) jk3.a.getValue(), rv4Var, 0);
                String A2 = yqe.A((y3b) v1b.f.getValue(), rv4Var);
                boolean f4 = rv4Var.f(aw7Var);
                Object P2 = rv4Var.P();
                if (f4 || P2 == lh9Var) {
                    P2 = new ea3(aw7Var, 23);
                    rv4Var.o0(P2);
                }
                z1d.f(c, A2, false, null, null, null, null, null, (vt4) P2, rv4Var, 0, 252);
                rv4Var.q(true);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        c84 c84Var = (c84) this.c;
        d84 d84Var = (d84) this.b;
        final lu4 lu4Var = (lu4) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            xn1 a = wn1.a(new hz(10.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, kq7.a);
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
            rv4Var.e0(1690847391);
            ArrayList arrayList = c84Var.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final e84 e84Var = (e84) arrayList.get(i);
                final String str = (String) d84Var.a.get(e84Var.a);
                String str2 = e84Var.f;
                int hashCode2 = str2.hashCode();
                if (hashCode2 != -906021636) {
                    if (hashCode2 != -868304044) {
                        if (hashCode2 == 100358090 && str2.equals("input")) {
                            rv4Var.e0(1067749391);
                            oue.k(null, jce.E(-1378875594, new mu4() { // from class: b44
                                @Override // defpackage.mu4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    boolean z2;
                                    boolean z3;
                                    t86 t86Var;
                                    boolean z4;
                                    int i2 = r4;
                                    pvc pvcVar = pvc.a;
                                    lh9 lh9Var = ax1.a;
                                    kq7 kq7Var = kq7.a;
                                    final lu4 lu4Var2 = lu4Var;
                                    String str3 = str;
                                    final e84 e84Var2 = e84Var;
                                    int i3 = 0;
                                    boolean z5 = false;
                                    switch (i2) {
                                        case 0:
                                            rv4 rv4Var2 = (rv4) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            ((zn1) obj4).getClass();
                                            if ((intValue2 & 17) != 16) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (rv4Var2.U(intValue2 & 1, z2)) {
                                                String str4 = e84Var2.b;
                                                if (str4.length() == 0) {
                                                    str4 = e84Var2.a;
                                                }
                                                List list = e84Var2.e;
                                                if (str3 == null) {
                                                    str3 = e84Var2.d;
                                                }
                                                int indexOf = list.indexOf(str3);
                                                Integer valueOf = Integer.valueOf(indexOf);
                                                if (indexOf < 0) {
                                                    valueOf = null;
                                                }
                                                if (valueOf != null) {
                                                    i3 = valueOf.intValue();
                                                }
                                                int i4 = i3;
                                                nq7 z6 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                                boolean f = rv4Var2.f(lu4Var2) | rv4Var2.h(e84Var2);
                                                Object P = rv4Var2.P();
                                                if (f || P == lh9Var) {
                                                    P = new xt4() { // from class: c44
                                                        @Override // defpackage.xt4
                                                        public final Object invoke(Object obj7) {
                                                            int i5 = r3;
                                                            pvc pvcVar2 = pvc.a;
                                                            e84 e84Var3 = e84Var2;
                                                            lu4 lu4Var3 = lu4Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    String str5 = (String) obj7;
                                                                    str5.getClass();
                                                                    lu4Var3.invoke(e84Var3.a, str5);
                                                                    return pvcVar2;
                                                                case 1:
                                                                    lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                    return pvcVar2;
                                                                default:
                                                                    lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                    return pvcVar2;
                                                            }
                                                        }
                                                    };
                                                    rv4Var2.o0(P);
                                                }
                                                l0e.j(str4, list, i4, z6, (xt4) P, rv4Var2, 3072);
                                            } else {
                                                rv4Var2.X();
                                            }
                                            return pvcVar;
                                        case 1:
                                            rv4 rv4Var3 = (rv4) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            ((zn1) obj4).getClass();
                                            if ((intValue3 & 17) != 16) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (rv4Var3.U(intValue3 & 1, z3)) {
                                                String str5 = e84Var2.b;
                                                if (str5.length() == 0) {
                                                    str5 = e84Var2.a;
                                                }
                                                if (str3 == null) {
                                                    str3 = e84Var2.d;
                                                }
                                                String str6 = str3;
                                                if (e84Var2.g.equals("number")) {
                                                    t86Var = new t86(3, 0, Token.EXPORT);
                                                } else {
                                                    t86Var = t86.g;
                                                }
                                                t86 t86Var2 = t86Var;
                                                nq7 z7 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                                boolean f2 = rv4Var3.f(lu4Var2) | rv4Var3.h(e84Var2);
                                                Object P2 = rv4Var3.P();
                                                if (f2 || P2 == lh9Var) {
                                                    P2 = new xt4() { // from class: c44
                                                        @Override // defpackage.xt4
                                                        public final Object invoke(Object obj7) {
                                                            int i5 = r3;
                                                            pvc pvcVar2 = pvc.a;
                                                            e84 e84Var3 = e84Var2;
                                                            lu4 lu4Var3 = lu4Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    String str52 = (String) obj7;
                                                                    str52.getClass();
                                                                    lu4Var3.invoke(e84Var3.a, str52);
                                                                    return pvcVar2;
                                                                case 1:
                                                                    lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                    return pvcVar2;
                                                                default:
                                                                    lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                    return pvcVar2;
                                                            }
                                                        }
                                                    };
                                                    rv4Var3.o0(P2);
                                                }
                                                l0e.k(str5, str6, null, t86Var2, null, z7, (xt4) P2, rv4Var3, 196608);
                                            } else {
                                                rv4Var3.X();
                                            }
                                            return pvcVar;
                                        default:
                                            rv4 rv4Var4 = (rv4) obj5;
                                            int intValue4 = ((Integer) obj6).intValue();
                                            ((zn1) obj4).getClass();
                                            if ((intValue4 & 17) != 16) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (rv4Var4.U(intValue4 & 1, z4)) {
                                                String str7 = e84Var2.b;
                                                if (str7.length() == 0) {
                                                    str7 = e84Var2.a;
                                                }
                                                String str8 = str7;
                                                String str9 = e84Var2.c;
                                                if (str3 == null) {
                                                    str3 = e84Var2.d;
                                                }
                                                Boolean M0 = k4b.M0(str3);
                                                if (M0 != null) {
                                                    z5 = M0.booleanValue();
                                                }
                                                boolean z8 = z5;
                                                nq7 z9 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                                boolean f3 = rv4Var4.f(lu4Var2) | rv4Var4.h(e84Var2);
                                                Object P3 = rv4Var4.P();
                                                if (f3 || P3 == lh9Var) {
                                                    P3 = new xt4() { // from class: c44
                                                        @Override // defpackage.xt4
                                                        public final Object invoke(Object obj7) {
                                                            int i5 = r3;
                                                            pvc pvcVar2 = pvc.a;
                                                            e84 e84Var3 = e84Var2;
                                                            lu4 lu4Var3 = lu4Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    String str52 = (String) obj7;
                                                                    str52.getClass();
                                                                    lu4Var3.invoke(e84Var3.a, str52);
                                                                    return pvcVar2;
                                                                case 1:
                                                                    lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                    return pvcVar2;
                                                                default:
                                                                    lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                    return pvcVar2;
                                                            }
                                                        }
                                                    };
                                                    rv4Var4.o0(P3);
                                                }
                                                l0e.n(null, str8, str9, z9, false, z8, (xt4) P3, rv4Var4, 3072, 17);
                                            } else {
                                                rv4Var4.X();
                                            }
                                            return pvcVar;
                                    }
                                }
                            }, rv4Var), rv4Var, 48);
                            rv4Var.q(false);
                        }
                        rv4Var.e0(1069445401);
                        rv4Var.q(false);
                    } else {
                        if (str2.equals("toggle")) {
                            rv4Var.e0(1068696224);
                            oue.k(null, jce.E(-1386255915, new mu4() { // from class: b44
                                @Override // defpackage.mu4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    boolean z2;
                                    boolean z3;
                                    t86 t86Var;
                                    boolean z4;
                                    int i2 = r4;
                                    pvc pvcVar = pvc.a;
                                    lh9 lh9Var = ax1.a;
                                    kq7 kq7Var = kq7.a;
                                    final lu4 lu4Var2 = lu4Var;
                                    String str3 = str;
                                    final e84 e84Var2 = e84Var;
                                    int i3 = 0;
                                    boolean z5 = false;
                                    switch (i2) {
                                        case 0:
                                            rv4 rv4Var2 = (rv4) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            ((zn1) obj4).getClass();
                                            if ((intValue2 & 17) != 16) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (rv4Var2.U(intValue2 & 1, z2)) {
                                                String str4 = e84Var2.b;
                                                if (str4.length() == 0) {
                                                    str4 = e84Var2.a;
                                                }
                                                List list = e84Var2.e;
                                                if (str3 == null) {
                                                    str3 = e84Var2.d;
                                                }
                                                int indexOf = list.indexOf(str3);
                                                Integer valueOf = Integer.valueOf(indexOf);
                                                if (indexOf < 0) {
                                                    valueOf = null;
                                                }
                                                if (valueOf != null) {
                                                    i3 = valueOf.intValue();
                                                }
                                                int i4 = i3;
                                                nq7 z6 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                                boolean f = rv4Var2.f(lu4Var2) | rv4Var2.h(e84Var2);
                                                Object P = rv4Var2.P();
                                                if (f || P == lh9Var) {
                                                    P = new xt4() { // from class: c44
                                                        @Override // defpackage.xt4
                                                        public final Object invoke(Object obj7) {
                                                            int i5 = r3;
                                                            pvc pvcVar2 = pvc.a;
                                                            e84 e84Var3 = e84Var2;
                                                            lu4 lu4Var3 = lu4Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    String str52 = (String) obj7;
                                                                    str52.getClass();
                                                                    lu4Var3.invoke(e84Var3.a, str52);
                                                                    return pvcVar2;
                                                                case 1:
                                                                    lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                    return pvcVar2;
                                                                default:
                                                                    lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                    return pvcVar2;
                                                            }
                                                        }
                                                    };
                                                    rv4Var2.o0(P);
                                                }
                                                l0e.j(str4, list, i4, z6, (xt4) P, rv4Var2, 3072);
                                            } else {
                                                rv4Var2.X();
                                            }
                                            return pvcVar;
                                        case 1:
                                            rv4 rv4Var3 = (rv4) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            ((zn1) obj4).getClass();
                                            if ((intValue3 & 17) != 16) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (rv4Var3.U(intValue3 & 1, z3)) {
                                                String str5 = e84Var2.b;
                                                if (str5.length() == 0) {
                                                    str5 = e84Var2.a;
                                                }
                                                if (str3 == null) {
                                                    str3 = e84Var2.d;
                                                }
                                                String str6 = str3;
                                                if (e84Var2.g.equals("number")) {
                                                    t86Var = new t86(3, 0, Token.EXPORT);
                                                } else {
                                                    t86Var = t86.g;
                                                }
                                                t86 t86Var2 = t86Var;
                                                nq7 z7 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                                boolean f2 = rv4Var3.f(lu4Var2) | rv4Var3.h(e84Var2);
                                                Object P2 = rv4Var3.P();
                                                if (f2 || P2 == lh9Var) {
                                                    P2 = new xt4() { // from class: c44
                                                        @Override // defpackage.xt4
                                                        public final Object invoke(Object obj7) {
                                                            int i5 = r3;
                                                            pvc pvcVar2 = pvc.a;
                                                            e84 e84Var3 = e84Var2;
                                                            lu4 lu4Var3 = lu4Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    String str52 = (String) obj7;
                                                                    str52.getClass();
                                                                    lu4Var3.invoke(e84Var3.a, str52);
                                                                    return pvcVar2;
                                                                case 1:
                                                                    lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                    return pvcVar2;
                                                                default:
                                                                    lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                    return pvcVar2;
                                                            }
                                                        }
                                                    };
                                                    rv4Var3.o0(P2);
                                                }
                                                l0e.k(str5, str6, null, t86Var2, null, z7, (xt4) P2, rv4Var3, 196608);
                                            } else {
                                                rv4Var3.X();
                                            }
                                            return pvcVar;
                                        default:
                                            rv4 rv4Var4 = (rv4) obj5;
                                            int intValue4 = ((Integer) obj6).intValue();
                                            ((zn1) obj4).getClass();
                                            if ((intValue4 & 17) != 16) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (rv4Var4.U(intValue4 & 1, z4)) {
                                                String str7 = e84Var2.b;
                                                if (str7.length() == 0) {
                                                    str7 = e84Var2.a;
                                                }
                                                String str8 = str7;
                                                String str9 = e84Var2.c;
                                                if (str3 == null) {
                                                    str3 = e84Var2.d;
                                                }
                                                Boolean M0 = k4b.M0(str3);
                                                if (M0 != null) {
                                                    z5 = M0.booleanValue();
                                                }
                                                boolean z8 = z5;
                                                nq7 z9 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                                boolean f3 = rv4Var4.f(lu4Var2) | rv4Var4.h(e84Var2);
                                                Object P3 = rv4Var4.P();
                                                if (f3 || P3 == lh9Var) {
                                                    P3 = new xt4() { // from class: c44
                                                        @Override // defpackage.xt4
                                                        public final Object invoke(Object obj7) {
                                                            int i5 = r3;
                                                            pvc pvcVar2 = pvc.a;
                                                            e84 e84Var3 = e84Var2;
                                                            lu4 lu4Var3 = lu4Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    String str52 = (String) obj7;
                                                                    str52.getClass();
                                                                    lu4Var3.invoke(e84Var3.a, str52);
                                                                    return pvcVar2;
                                                                case 1:
                                                                    lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                    return pvcVar2;
                                                                default:
                                                                    lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                    return pvcVar2;
                                                            }
                                                        }
                                                    };
                                                    rv4Var4.o0(P3);
                                                }
                                                l0e.n(null, str8, str9, z9, false, z8, (xt4) P3, rv4Var4, 3072, 17);
                                            } else {
                                                rv4Var4.X();
                                            }
                                            return pvcVar;
                                    }
                                }
                            }, rv4Var), rv4Var, 48);
                            rv4Var.q(false);
                        }
                        rv4Var.e0(1069445401);
                        rv4Var.q(false);
                    }
                } else {
                    if (str2.equals("select")) {
                        rv4Var.e0(1066898999);
                        oue.k(null, jce.E(486283405, new mu4() { // from class: b44
                            @Override // defpackage.mu4
                            public final Object c(Object obj4, Object obj5, Object obj6) {
                                boolean z2;
                                boolean z3;
                                t86 t86Var;
                                boolean z4;
                                int i2 = r4;
                                pvc pvcVar = pvc.a;
                                lh9 lh9Var = ax1.a;
                                kq7 kq7Var = kq7.a;
                                final lu4 lu4Var2 = lu4Var;
                                String str3 = str;
                                final e84 e84Var2 = e84Var;
                                int i3 = 0;
                                boolean z5 = false;
                                switch (i2) {
                                    case 0:
                                        rv4 rv4Var2 = (rv4) obj5;
                                        int intValue2 = ((Integer) obj6).intValue();
                                        ((zn1) obj4).getClass();
                                        if ((intValue2 & 17) != 16) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (rv4Var2.U(intValue2 & 1, z2)) {
                                            String str4 = e84Var2.b;
                                            if (str4.length() == 0) {
                                                str4 = e84Var2.a;
                                            }
                                            List list = e84Var2.e;
                                            if (str3 == null) {
                                                str3 = e84Var2.d;
                                            }
                                            int indexOf = list.indexOf(str3);
                                            Integer valueOf = Integer.valueOf(indexOf);
                                            if (indexOf < 0) {
                                                valueOf = null;
                                            }
                                            if (valueOf != null) {
                                                i3 = valueOf.intValue();
                                            }
                                            int i4 = i3;
                                            nq7 z6 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                            boolean f = rv4Var2.f(lu4Var2) | rv4Var2.h(e84Var2);
                                            Object P = rv4Var2.P();
                                            if (f || P == lh9Var) {
                                                P = new xt4() { // from class: c44
                                                    @Override // defpackage.xt4
                                                    public final Object invoke(Object obj7) {
                                                        int i5 = r3;
                                                        pvc pvcVar2 = pvc.a;
                                                        e84 e84Var3 = e84Var2;
                                                        lu4 lu4Var3 = lu4Var2;
                                                        switch (i5) {
                                                            case 0:
                                                                String str52 = (String) obj7;
                                                                str52.getClass();
                                                                lu4Var3.invoke(e84Var3.a, str52);
                                                                return pvcVar2;
                                                            case 1:
                                                                lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                return pvcVar2;
                                                            default:
                                                                lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                return pvcVar2;
                                                        }
                                                    }
                                                };
                                                rv4Var2.o0(P);
                                            }
                                            l0e.j(str4, list, i4, z6, (xt4) P, rv4Var2, 3072);
                                        } else {
                                            rv4Var2.X();
                                        }
                                        return pvcVar;
                                    case 1:
                                        rv4 rv4Var3 = (rv4) obj5;
                                        int intValue3 = ((Integer) obj6).intValue();
                                        ((zn1) obj4).getClass();
                                        if ((intValue3 & 17) != 16) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (rv4Var3.U(intValue3 & 1, z3)) {
                                            String str5 = e84Var2.b;
                                            if (str5.length() == 0) {
                                                str5 = e84Var2.a;
                                            }
                                            if (str3 == null) {
                                                str3 = e84Var2.d;
                                            }
                                            String str6 = str3;
                                            if (e84Var2.g.equals("number")) {
                                                t86Var = new t86(3, 0, Token.EXPORT);
                                            } else {
                                                t86Var = t86.g;
                                            }
                                            t86 t86Var2 = t86Var;
                                            nq7 z7 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                            boolean f2 = rv4Var3.f(lu4Var2) | rv4Var3.h(e84Var2);
                                            Object P2 = rv4Var3.P();
                                            if (f2 || P2 == lh9Var) {
                                                P2 = new xt4() { // from class: c44
                                                    @Override // defpackage.xt4
                                                    public final Object invoke(Object obj7) {
                                                        int i5 = r3;
                                                        pvc pvcVar2 = pvc.a;
                                                        e84 e84Var3 = e84Var2;
                                                        lu4 lu4Var3 = lu4Var2;
                                                        switch (i5) {
                                                            case 0:
                                                                String str52 = (String) obj7;
                                                                str52.getClass();
                                                                lu4Var3.invoke(e84Var3.a, str52);
                                                                return pvcVar2;
                                                            case 1:
                                                                lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                return pvcVar2;
                                                            default:
                                                                lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                return pvcVar2;
                                                        }
                                                    }
                                                };
                                                rv4Var3.o0(P2);
                                            }
                                            l0e.k(str5, str6, null, t86Var2, null, z7, (xt4) P2, rv4Var3, 196608);
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                    default:
                                        rv4 rv4Var4 = (rv4) obj5;
                                        int intValue4 = ((Integer) obj6).intValue();
                                        ((zn1) obj4).getClass();
                                        if ((intValue4 & 17) != 16) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (rv4Var4.U(intValue4 & 1, z4)) {
                                            String str7 = e84Var2.b;
                                            if (str7.length() == 0) {
                                                str7 = e84Var2.a;
                                            }
                                            String str8 = str7;
                                            String str9 = e84Var2.c;
                                            if (str3 == null) {
                                                str3 = e84Var2.d;
                                            }
                                            Boolean M0 = k4b.M0(str3);
                                            if (M0 != null) {
                                                z5 = M0.booleanValue();
                                            }
                                            boolean z8 = z5;
                                            nq7 z9 = zbe.z(pna.f(kq7Var, 1.0f), 14.0f, 12.0f);
                                            boolean f3 = rv4Var4.f(lu4Var2) | rv4Var4.h(e84Var2);
                                            Object P3 = rv4Var4.P();
                                            if (f3 || P3 == lh9Var) {
                                                P3 = new xt4() { // from class: c44
                                                    @Override // defpackage.xt4
                                                    public final Object invoke(Object obj7) {
                                                        int i5 = r3;
                                                        pvc pvcVar2 = pvc.a;
                                                        e84 e84Var3 = e84Var2;
                                                        lu4 lu4Var3 = lu4Var2;
                                                        switch (i5) {
                                                            case 0:
                                                                String str52 = (String) obj7;
                                                                str52.getClass();
                                                                lu4Var3.invoke(e84Var3.a, str52);
                                                                return pvcVar2;
                                                            case 1:
                                                                lu4Var3.invoke(e84Var3.a, String.valueOf(((Boolean) obj7).booleanValue()));
                                                                return pvcVar2;
                                                            default:
                                                                lu4Var3.invoke(e84Var3.a, e84Var3.e.get(((Integer) obj7).intValue()));
                                                                return pvcVar2;
                                                        }
                                                    }
                                                };
                                                rv4Var4.o0(P3);
                                            }
                                            l0e.n(null, str8, str9, z9, false, z8, (xt4) P3, rv4Var4, 3072, 17);
                                        } else {
                                            rv4Var4.X();
                                        }
                                        return pvcVar;
                                }
                            }
                        }, rv4Var), rv4Var, 48);
                        rv4Var.q(false);
                    }
                    rv4Var.e0(1069445401);
                    rv4Var.q(false);
                }
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        ya9 ya9Var = (ya9) this.c;
        xn4 xn4Var = (xn4) this.b;
        rh8 rh8Var = (rh8) this.d;
        ou0 ou0Var = (ou0) obj;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ou0Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var.f(ou0Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            na9.a.b(ya9Var, xn4Var.c, zbe.C(ou0Var.a(kq7.a, kh5.b), nae.e, rh8Var.d() + 44.0f, nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var, 12582912);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z;
        pb2 pb2Var;
        lhd lhdVar = (lhd) this.c;
        xt4 xt4Var = (xt4) this.b;
        xt4 xt4Var2 = (xt4) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((qr) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            sdd a = kv6.a(rv4Var);
            if (a != null) {
                if (a instanceof y35) {
                    pb2Var = ((y35) a).f();
                } else {
                    pb2Var = ob2.b;
                }
                nx0 nx0Var = (nx0) ((fdd) voe.z(cm9.a(nx0.class), a.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(nx0Var.e, rv4Var);
                bsa bsaVar = (bsa) rv4Var.j(dy1.q);
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = s21.e(rv4Var);
                }
                zm4 zm4Var = (zm4) P;
                Object P2 = rv4Var.P();
                if (P2 == lh9Var) {
                    String f = lhdVar.f();
                    if (f == null) {
                        f = "";
                    }
                    P2 = yae.z(new jub(new ps(f), sze.a(0, f.length()), (fxb) null));
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) P2;
                String str = ((jub) aw7Var.getValue()).a.b;
                boolean f2 = rv4Var.f(nx0Var);
                Object P3 = rv4Var.P();
                if (f2 || P3 == lh9Var) {
                    P3 = new db(nx0Var, aw7Var, null, 24);
                    rv4Var.o0(P3);
                }
                yte.g((lu4) P3, rv4Var, str);
                boolean f3 = rv4Var.f(bsaVar);
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    P4 = new uw5(zm4Var, bsaVar, null, 0);
                    rv4Var.o0(P4);
                }
                yte.g((lu4) P4, rv4Var, zm4Var);
                hre.b(0L, null, jce.E(1064190439, new tw5(xt4Var, z2, xt4Var2, zm4Var, bsaVar, aw7Var), rv4Var), rv4Var, 384, 3);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        ya9 ya9Var = (ya9) this.c;
        xq6 xq6Var = (xq6) this.b;
        rh8 rh8Var = (rh8) this.d;
        ou0 ou0Var = (ou0) obj;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ou0Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var.f(ou0Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            na9.a.b(ya9Var, xq6Var.b, zbe.C(ou0Var.a(kq7.a, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var, 12582912);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        boolean z;
        List list = (List) this.c;
        th8 th8Var = (th8) this.d;
        xt4 xt4Var = (xt4) this.b;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            am8.e(0, xt4Var, rv4Var, zbe.x(pna.j(pna.f(kq7.a, 1.0f), nae.e, 600.0f, 1), th8Var), list);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        Boolean bool3 = (Boolean) obj3;
        bool3.getClass();
        ((aw7) this.d).setValue(bool);
        ((aw7) this.c).setValue(bool2);
        ((aw7) this.b).setValue(bool3);
        return pvc.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        List list = (List) this.c;
        vt4 vt4Var = (vt4) this.d;
        Object obj5 = (xt4) this.b;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((wl4) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            rv4Var.e0(1780528284);
            int size = list.size();
            int i = 0;
            while (true) {
                obj4 = ax1.a;
                if (i >= size) {
                    break;
                }
                r81 r81Var = (r81) list.get(i);
                String str = r81Var.b;
                boolean f = rv4Var.f(obj5) | rv4Var.h(r81Var);
                Object P = rv4Var.P();
                if (f || P == obj4) {
                    P = new mf6(29, obj5, r81Var);
                    rv4Var.o0(P);
                }
                ese.m(48, (vt4) P, rv4Var, null, null, null, str, false);
                i++;
            }
            rv4Var.q(false);
            tu1 tu1Var = eg0.d;
            boolean f2 = rv4Var.f(vt4Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj4) {
                P2 = new hi7(24, vt4Var);
                rv4Var.o0(P2);
            }
            ese.n(tu1Var, false, null, null, (vt4) P2, rv4Var, 54, 12);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        boolean z;
        jk1 jk1Var;
        pia piaVar = (pia) this.c;
        aw7 aw7Var = (aw7) this.d;
        xt4 xt4Var = (xt4) this.b;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            boolean d = rv4Var.d(piaVar.a);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (d || P == lh9Var) {
                int i = piaVar.a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                jk1Var = new jk1(80.0f, 200.0f);
                            } else {
                                jk1Var = new jk1(150.0f, 400.0f);
                            }
                        } else {
                            jk1Var = new jk1(180.0f, 400.0f);
                        }
                    } else {
                        jk1Var = new jk1(80.0f, 200.0f);
                    }
                } else {
                    jk1Var = new jk1(80.0f, 200.0f);
                }
                P = jk1Var;
                rv4Var.o0(P);
            }
            jk1 jk1Var2 = (jk1) P;
            float floatValue = ((Number) aw7Var.getValue()).floatValue();
            nq7 f = pna.f(kq7.a, 1.0f);
            boolean f2 = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new dk7(aw7Var, 10);
                rv4Var.o0(P2);
            }
            xt4 xt4Var2 = (xt4) P2;
            boolean f3 = rv4Var.f(xt4Var) | rv4Var.f(aw7Var);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new v90(10, xt4Var, aw7Var);
                rv4Var.o0(P3);
            }
            dae.d(floatValue, xt4Var2, f, false, (vt4) P3, null, null, 0, null, null, jk1Var2, rv4Var, 384, 0, 1000);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        boolean z;
        nnb nnbVar = (nnb) this.c;
        xt4 xt4Var = (xt4) this.b;
        vt4 vt4Var = (vt4) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            ctd.h(nnbVar.i, nnbVar.h, zbe.z(pna.f(kq7.a, 1.0f), 12.0f, 8.0f), xt4Var, vt4Var, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        boolean z;
        nnb nnbVar = (nnb) this.c;
        xt4 xt4Var = (xt4) this.b;
        xt4 xt4Var2 = (xt4) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            ctd.r(nnbVar.j, nnbVar.n, pna.f(kq7.a, 1.0f), xt4Var, xt4Var2, rv4Var, 384);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        boolean z;
        su0 su0Var = (su0) this.c;
        xt4 xt4Var = (xt4) this.b;
        vt4 vt4Var = (vt4) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            ape.m(zbe.C(mwe.u(pna.h(pna.f(kq7.a, 1.0f), su0Var.c() * 0.8f), false, 14), nae.e, nae.e, nae.e, 12.0f, 7), xt4Var, vt4Var, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        vo6 v;
        boolean z5;
        int i2;
        rk9 k;
        mw8 mw8Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i4 = this.a;
        ez ezVar = lz.c;
        kq7 kq7Var = kq7.a;
        lh9 lh9Var = ax1.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        boolean z16 = false;
        switch (i4) {
            case 0:
                cg1 cg1Var = (cg1) obj6;
                xt4 xt4Var = (xt4) obj5;
                aw7 aw7Var = (aw7) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    String A = yqe.A((y3b) k2b.F.getValue(), rv4Var);
                    tza tzaVar = j27.a;
                    cvb.c(A, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.i, rv4Var, 0, 0, 131070);
                    if (cg1Var.f.isEmpty()) {
                        rv4Var.e0(-1913282259);
                        cvb.c(yqe.A((y3b) o2b.l0.getValue(), rv4Var), null, ((h27) rv4Var.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131066);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1912994269);
                        ze4 ze4Var = pna.c;
                        hz hzVar = new hz(6.0f, true, new vs(2));
                        boolean f = rv4Var.f(cg1Var) | rv4Var.f(xt4Var);
                        Object P = rv4Var.P();
                        if (f || P == lh9Var) {
                            P = new r7(10, cg1Var, xt4Var, aw7Var);
                            rv4Var.o0(P);
                        }
                        jce.d(ze4Var, null, null, false, hzVar, null, null, false, null, (xt4) P, rv4Var, 24582, 494);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                tvb tvbVar = (tvb) obj6;
                xt4 xt4Var2 = (xt4) obj5;
                vt4 vt4Var = (vt4) obj4;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = yte.s(rv4Var2);
                        rv4Var2.o0(P2);
                    }
                    m82 m82Var = (m82) P2;
                    sj8 o = jxe.o(0, tvbVar.b.size(), rv4Var2, 0, 3);
                    nq7 y = zbe.y(pna.u(mwe.x(q1d.l(kq7Var, rv4Var2, 6), 15), nae.e, 600.0f, 1).a0(pna.c), 24.0f);
                    xn1 a = wn1.a(ezVar, kh5.I, rv4Var2, 0);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, y);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    kxe.c(o, s21.f(rv4Var2, p, qw1.d, 1.0f, true), null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(-300773917, new u32(4, tvbVar, xt4Var2), rv4Var2), rv4Var2, 100663296, 24576, 16124);
                    nq7 y2 = zbe.y(nmd.v(tte.k(hl5.f(kq7Var, 8.0f, rv4Var2, kq7Var, 1.0f), uu9.a), ((h27) rv4Var2.j(j27.a)).a.p, lre.g), 4.0f);
                    long j = zl1.h;
                    d3a.c(o.k(), y2, j, j, nae.e, jce.E(-2058891036, new dn7(o, 0), rv4Var2), yz1.d, jce.E(202333924, new rj7(tvbVar, vt4Var, o, m82Var, 2), rv4Var2), rv4Var2, 14380416, 0);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                t2c t2cVar = (t2c) obj6;
                nq7 nq7Var = (nq7) obj5;
                cz7 cz7Var = (cz7) obj4;
                lha lhaVar = (lha) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                lhaVar.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(lhaVar)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    e1c.h(t2cVar, lhaVar, nq7Var, rv4Var3, (intValue3 << 3) & Token.ASSIGN_MOD);
                    ze4 ze4Var2 = pna.c;
                    boolean f2 = rv4Var3.f(cz7Var);
                    Object P3 = rv4Var3.P();
                    if (f2 || P3 == lh9Var) {
                        P3 = new ynb(cz7Var, 1);
                        rv4Var3.o0(P3);
                    }
                    e1c.l(cz7Var, t2cVar, lhaVar, ze4Var2, (xt4) P3, rv4Var3, ((intValue3 << 6) & 896) | 3072);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                dx4 dx4Var = (dx4) obj6;
                lq lqVar = (lq) obj5;
                lq lqVar2 = (lq) obj4;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    if (((cf3) dx4Var.f.getValue()) == cf3.c) {
                        v = ox9.v(tl1.B(new zl1(zl1.h), new zl1(zl1.b(0.48f, zl1.b))), nae.e, 14);
                    } else {
                        v = ox9.v(tl1.B(new zl1(zl1.b(0.48f, zl1.b)), new zl1(zl1.h)), nae.e, 14);
                    }
                    ze4 ze4Var3 = pna.c;
                    nq7 u = nmd.u(ze4Var3, v);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode2 = Long.hashCode(rv4Var4.T);
                    xt8 l2 = rv4Var4.l();
                    nq7 p2 = lye.p(rv4Var4, u);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var2);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, d);
                    jce.F(qw1.e, rv4Var4, l2);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p2);
                    boolean f3 = rv4Var4.f(dx4Var) | rv4Var4.h(lqVar) | rv4Var4.h(lqVar2);
                    Object P4 = rv4Var4.P();
                    if (f3 || P4 == lh9Var) {
                        P4 = new r6a(27, dx4Var, lqVar, lqVar2);
                        rv4Var4.o0(P4);
                    }
                    bce.a(ze4Var3, (xt4) P4, rv4Var4, 6);
                    rv4Var4.q(true);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                ya9 ya9Var = (ya9) obj6;
                qr0 qr0Var = (qr0) obj5;
                rh8 rh8Var = (rh8) obj4;
                ou0 ou0Var = (ou0) obj;
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ou0Var.getClass();
                if ((intValue5 & 6) == 0) {
                    if (rv4Var5.f(ou0Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue5 |= i2;
                }
                if ((intValue5 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    na9.a.b(ya9Var, qr0Var.a, zbe.C(ou0Var.a(kq7Var, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var5, 12582912);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 5:
                xy0 xy0Var = (xy0) obj5;
                w5a w5aVar = (w5a) obj4;
                Throwable th = (Throwable) obj;
                d82 d82Var = (d82) obj3;
                if (obj6 != zy0.l) {
                    que.p(xy0Var.b, obj6, w5aVar.a);
                }
                return pvcVar;
            case 6:
                yj yjVar = (yj) obj;
                kwe a2 = ((wea) obj5).a(((rk9) ((y61) obj6).a.d.getValue()).k(npe.n(0L, ((dna) obj2).a)).h(), (tc6) obj3, (r13) obj4);
                if (a2 instanceof tf8) {
                    yj.c(yjVar, ((tf8) a2).c);
                } else if (a2 instanceof uf8) {
                    yj.d(yjVar, ((uf8) a2).c);
                } else if (a2 instanceof sf8) {
                    yj.b(yjVar, ((sf8) a2).c);
                } else {
                    xk5.o();
                    return null;
                }
                yjVar.p((Float.floatToRawIntBits(k.a) << 32) | (Float.floatToRawIntBits(k.b) & 4294967295L));
                return pvcVar;
            case 7:
                d92 d92Var = (d92) obj6;
                xt4 xt4Var3 = (xt4) obj5;
                e37 e37Var = (e37) obj;
                w27 w27Var = (w27) obj2;
                x02 x02Var = (x02) obj3;
                e37Var.getClass();
                w27Var.getClass();
                String str = "blockMeasure:" + ((String) obj4);
                try {
                    mw8Var = w27Var.M(x02Var.a);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    if (d92Var != d92.a) {
                        o28.v(xt4Var3, new g81(str, th2));
                        mw8Var = null;
                    } else {
                        throw th2;
                    }
                }
                ls3 ls3Var = ls3.a;
                if (mw8Var == null) {
                    return e37Var.q0(0, 0, ls3Var, new v71(1));
                }
                return e37Var.q0(mw8Var.a, mw8Var.b, ls3Var, new a1(mw8Var, 4));
            case 8:
                lb2 lb2Var = (lb2) obj6;
                yya yyaVar = (yya) obj5;
                aw7 aw7Var2 = (aw7) obj4;
                rv4 rv4Var6 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z6)) {
                    if (!k4b.j0(((kb2) yyaVar.getValue()).f) && !((kb2) yyaVar.getValue()).c) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean f4 = rv4Var6.f(lb2Var);
                    Object P5 = rv4Var6.P();
                    if (f4 || P5 == lh9Var) {
                        P5 = new hb2(lb2Var, aw7Var2, 1);
                        rv4Var6.o0(P5);
                    }
                    nmd.j((vt4) P5, null, z7, null, null, null, jqe.a, rv4Var6, 805306368, 506);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 9:
                aw7 aw7Var3 = (aw7) obj4;
                aw7 aw7Var4 = (aw7) obj6;
                yya yyaVar2 = (yya) obj5;
                rv4 rv4Var7 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (rv4Var7.U(intValue7 & 1, z8)) {
                    kwe.c(null, jce.E(-1489312393, new i64(2, aw7Var4, yyaVar2), rv4Var7), rv4Var7, 48);
                    ar5 c = rp5.c((wk3) ok3.l0.getValue(), rv4Var7, 0);
                    boolean f5 = rv4Var7.f(aw7Var3);
                    Object P6 = rv4Var7.P();
                    if (f5 || P6 == lh9Var) {
                        P6 = new ae1(aw7Var3, 26);
                        rv4Var7.o0(P6);
                    }
                    kwe.d(c, null, 0L, (vt4) P6, rv4Var7, 0, 6);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 10:
                ya9 ya9Var2 = (ya9) obj6;
                ka3 ka3Var = (ka3) obj5;
                rh8 rh8Var2 = (rh8) obj4;
                ou0 ou0Var2 = (ou0) obj;
                rv4 rv4Var8 = (rv4) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ou0Var2.getClass();
                if ((intValue8 & 6) == 0) {
                    if (rv4Var8.f(ou0Var2)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue8 |= i3;
                }
                if ((intValue8 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var8.U(intValue8 & 1, z9)) {
                    na9.a.b(ya9Var2, ka3Var.a, zbe.C(ou0Var2.a(kq7Var, kh5.b), nae.e, rh8Var2.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var8, 12582912);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 11:
                bic bicVar = (bic) obj6;
                uo3 uo3Var = (uo3) obj5;
                yya yyaVar3 = (yya) obj4;
                rv4 rv4Var9 = (rv4) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var9.U(intValue9 & 1, z10)) {
                    if (!k4b.j0(((aic) yyaVar3.getValue()).a) && !((aic) yyaVar3.getValue()).b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean f6 = rv4Var9.f(bicVar) | rv4Var9.f(uo3Var);
                    Object P7 = rv4Var9.P();
                    if (f6 || P7 == lh9Var) {
                        P7 = new u93(0, bicVar, uo3Var);
                        rv4Var9.o0(P7);
                    }
                    nmd.j((vt4) P7, null, z11, null, null, null, jce.E(413399341, new zp1(yyaVar3, 1), rv4Var9), rv4Var9, 805306368, 506);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 12:
                final aw7 aw7Var5 = (aw7) obj4;
                final ie3 ie3Var = (ie3) obj6;
                kd4 kd4Var = (kd4) obj5;
                rv4 rv4Var10 = (rv4) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rv4Var10.U(intValue10 & 1, z12)) {
                    b37 d2 = fu0.d(kh5.a, false);
                    int hashCode3 = Long.hashCode(rv4Var10.T);
                    xt8 l3 = rv4Var10.l();
                    nq7 p3 = lye.p(rv4Var10, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var10.i0();
                    if (rv4Var10.S) {
                        rv4Var10.k(zx1Var3);
                    } else {
                        rv4Var10.r0();
                    }
                    jce.F(qw1.f, rv4Var10, d2);
                    jce.F(qw1.e, rv4Var10, l3);
                    jce.F(qw1.g, rv4Var10, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var10);
                    jce.F(qw1.d, rv4Var10, p3);
                    ar5 c2 = rp5.c((wk3) ok3.M.getValue(), rv4Var10, 0);
                    boolean f7 = rv4Var10.f(aw7Var5);
                    Object P8 = rv4Var10.P();
                    if (f7 || P8 == lh9Var) {
                        P8 = new ea3(aw7Var5, 3);
                        rv4Var10.o0(P8);
                    }
                    kwe.d(c2, null, 0L, (vt4) P8, rv4Var10, 0, 6);
                    boolean booleanValue = ((Boolean) aw7Var5.getValue()).booleanValue();
                    boolean f8 = rv4Var10.f(aw7Var5);
                    Object P9 = rv4Var10.P();
                    if (f8 || P9 == lh9Var) {
                        P9 = new ea3(aw7Var5, 4);
                        rv4Var10.o0(P9);
                    }
                    vt4 vt4Var2 = (vt4) P9;
                    boolean f9 = rv4Var10.f(aw7Var5) | rv4Var10.f(ie3Var);
                    Object P10 = rv4Var10.P();
                    if (f9 || P10 == lh9Var) {
                        P10 = new vt4() { // from class: ee3
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var6 = aw7Var5;
                                ie3 ie3Var2 = ie3Var;
                                switch (i5) {
                                    case 0:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a3 = jdd.a(ie3Var2);
                                        sw2 sw2Var = ab3.a;
                                        ie3Var2.f(a3, ru2.c, new d53(ie3Var2, null, 3));
                                        return pvcVar2;
                                    default:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a4 = jdd.a(ie3Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        ie3Var2.f(a4, ru2.c, new he3(ie3Var2, null, 0));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var10.o0(P10);
                    }
                    vt4 vt4Var3 = (vt4) P10;
                    boolean f10 = rv4Var10.f(aw7Var5) | rv4Var10.f(kd4Var);
                    Object P11 = rv4Var10.P();
                    if (f10 || P11 == lh9Var) {
                        P11 = new fe3(kd4Var, aw7Var5, 0);
                        rv4Var10.o0(P11);
                    }
                    vt4 vt4Var4 = (vt4) P11;
                    boolean f11 = rv4Var10.f(aw7Var5) | rv4Var10.f(ie3Var);
                    Object P12 = rv4Var10.P();
                    if (f11 || P12 == lh9Var) {
                        P12 = new vt4() { // from class: ee3
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i5 = r3;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var6 = aw7Var5;
                                ie3 ie3Var2 = ie3Var;
                                switch (i5) {
                                    case 0:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a3 = jdd.a(ie3Var2);
                                        sw2 sw2Var = ab3.a;
                                        ie3Var2.f(a3, ru2.c, new d53(ie3Var2, null, 3));
                                        return pvcVar2;
                                    default:
                                        aw7Var6.setValue(Boolean.FALSE);
                                        hk1 a4 = jdd.a(ie3Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        ie3Var2.f(a4, ru2.c, new he3(ie3Var2, null, 0));
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var10.o0(P12);
                    }
                    ase.a(booleanValue, vt4Var2, vt4Var3, vt4Var4, (vt4) P12, rv4Var10, 0);
                    rv4Var10.q(true);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 13:
                aw7 aw7Var6 = (aw7) obj4;
                xt4 xt4Var4 = (xt4) obj5;
                xt4 xt4Var5 = (xt4) obj6;
                rv4 rv4Var11 = (rv4) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (rv4Var11.U(intValue11 & 1, z13)) {
                    nq7 z17 = zbe.z(zbe.x(pna.f(kq7Var, 1.0f), mwe.g(14, rv4Var11)), 24.0f, 8.0f);
                    xn1 a3 = wn1.a(ezVar, kh5.I, rv4Var11, 0);
                    int hashCode4 = Long.hashCode(rv4Var11.T);
                    xt8 l4 = rv4Var11.l();
                    nq7 p4 = lye.p(rv4Var11, z17);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var11.i0();
                    if (rv4Var11.S) {
                        rv4Var11.k(zx1Var4);
                    } else {
                        rv4Var11.r0();
                    }
                    jce.F(qw1.f, rv4Var11, a3);
                    jce.F(qw1.e, rv4Var11, l4);
                    jce.F(qw1.g, rv4Var11, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var11);
                    jce.F(qw1.d, rv4Var11, p4);
                    String A2 = yqe.A((y3b) s2b.j.getValue(), rv4Var11);
                    tza tzaVar2 = j27.a;
                    cvb.c(A2, zbe.A(kq7Var, nae.e, 8.0f, 1), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var11.j(tzaVar2)).b.h, rv4Var11, 48, 0, 131068);
                    String str2 = (String) aw7Var6.getValue();
                    nq7 f12 = pna.f(kq7Var, 1.0f);
                    v72 v72Var = ((h27) rv4Var11.j(tzaVar2)).c.d;
                    oyb oybVar = ((h27) rv4Var11.j(tzaVar2)).b.j;
                    boolean f13 = rv4Var11.f(aw7Var6);
                    Object P13 = rv4Var11.P();
                    if (f13 || P13 == lh9Var) {
                        P13 = new zn3(aw7Var6, 13);
                        rv4Var11.o0(P13);
                    }
                    uwe.h(str2, (xt4) P13, f12, false, false, oybVar, null, null, null, null, false, null, null, null, false, 10, 6, v72Var, null, rv4Var11, 384, 905969664, 5504984);
                    xbe.i(rv4Var11, pna.h(kq7Var, 16.0f));
                    ar5 c3 = rp5.c((wk3) jk3.L.getValue(), rv4Var11, 0);
                    String A3 = yqe.A((y3b) o2b.f.getValue(), rv4Var11);
                    nq7 A4 = zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2);
                    boolean f14 = rv4Var11.f(xt4Var4) | rv4Var11.f(aw7Var6) | rv4Var11.f(xt4Var5);
                    Object P14 = rv4Var11.P();
                    if (f14 || P14 == lh9Var) {
                        P14 = new j24(0, xt4Var4, xt4Var5, aw7Var6);
                        rv4Var11.o0(P14);
                    }
                    z1d.f(c3, A3, false, null, A4, null, null, null, (vt4) P14, rv4Var11, 24576, 236);
                    hl5.w(kq7Var, 8.0f, rv4Var11, true);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            case 14:
                i44 i44Var = (i44) obj6;
                q54 q54Var = (q54) obj5;
                fo3 fo3Var = (fo3) obj4;
                rv4 rv4Var12 = (rv4) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (rv4Var12.U(intValue12 & 1, z14)) {
                    nq7 f15 = pna.f(kq7Var, 1.0f);
                    boolean f16 = rv4Var12.f(i44Var);
                    Object P15 = rv4Var12.P();
                    if (f16 || P15 == lh9Var) {
                        P15 = new mz1(1, i44Var, i44.class, "deleteLocalStorage", "deleteLocalStorage(Ljava/lang/String;)V", 0, 19);
                        rv4Var12.o0(P15);
                    }
                    i76 i76Var = (i76) P15;
                    boolean f17 = rv4Var12.f(fo3Var);
                    Object P16 = rv4Var12.P();
                    if (f17 || P16 == lh9Var) {
                        P16 = new v34(fo3Var, 0);
                        rv4Var12.o0(P16);
                    }
                    vt4 vt4Var5 = (vt4) P16;
                    boolean f18 = rv4Var12.f(fo3Var);
                    Object P17 = rv4Var12.P();
                    if (f18 || P17 == lh9Var) {
                        P17 = new w34(fo3Var, 0);
                        rv4Var12.o0(P17);
                    }
                    oue.m(q54Var, f15, vt4Var5, (lu4) P17, (xt4) i76Var, rv4Var12, 56);
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
            case 15:
                p34 p34Var = (p34) obj6;
                i44 i44Var2 = (i44) obj5;
                yya yyaVar4 = (yya) obj4;
                rv4 rv4Var13 = (rv4) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z16 = true;
                }
                if (rv4Var13.U(intValue13 & 1, z16)) {
                    q34 q34Var = ((d44) yyaVar4.getValue()).c;
                    nq7 f19 = pna.f(kq7Var, 1.0f);
                    boolean f20 = rv4Var13.f(i44Var2);
                    Object P18 = rv4Var13.P();
                    if (f20 || P18 == lh9Var) {
                        P18 = new mz1(1, i44Var2, i44.class, "changeConnectionThread", "changeConnectionThread(I)V", 0, 20);
                        rv4Var13.o0(P18);
                    }
                    xt4 xt4Var6 = (xt4) ((i76) P18);
                    boolean f21 = rv4Var13.f(i44Var2);
                    Object P19 = rv4Var13.P();
                    if (f21 || P19 == lh9Var) {
                        P19 = new mz1(1, i44Var2, i44.class, "changeConnectionDelay", "changeConnectionDelay(I)V", 0, 21);
                        rv4Var13.o0(P19);
                    }
                    xt4 xt4Var7 = (xt4) ((i76) P19);
                    boolean f22 = rv4Var13.f(i44Var2);
                    Object P20 = rv4Var13.P();
                    if (f22 || P20 == lh9Var) {
                        P20 = new mz1(1, i44Var2, i44.class, "onChangeIgnore", "onChangeIgnore(Z)V", 0, 22);
                        rv4Var13.o0(P20);
                    }
                    oue.f(q34Var, p34Var, f19, xt4Var6, xt4Var7, (xt4) ((i76) P20), rv4Var13, 384);
                } else {
                    rv4Var13.X();
                }
                return pvcVar;
            case 16:
                return a(obj, obj2, obj3);
            case 17:
                return b(obj, obj2, obj3);
            case 18:
                return e(obj, obj2, obj3);
            case 19:
                return f(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return p(obj, obj2, obj3);
            case 25:
                return q(obj, obj2, obj3);
            case 26:
                return r(obj, obj2, obj3);
            case 27:
                return s(obj, obj2, obj3);
            case 28:
                return t(obj, obj2, obj3);
            default:
                p58 p58Var = (p58) obj6;
                xt4 xt4Var8 = (xt4) obj5;
                xt4 xt4Var9 = (xt4) obj4;
                rv4 rv4Var14 = (rv4) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rv4Var14.U(intValue14 & 1, z15)) {
                    nq7 f23 = pna.f(kq7Var, 1.0f);
                    xn1 a4 = wn1.a(ezVar, kh5.I, rv4Var14, 0);
                    int hashCode5 = Long.hashCode(rv4Var14.T);
                    xt8 l5 = rv4Var14.l();
                    nq7 p5 = lye.p(rv4Var14, f23);
                    rw1.k.getClass();
                    zx1 zx1Var5 = qw1.b;
                    rv4Var14.i0();
                    if (rv4Var14.S) {
                        rv4Var14.k(zx1Var5);
                    } else {
                        rv4Var14.r0();
                    }
                    jce.F(qw1.f, rv4Var14, a4);
                    jce.F(qw1.e, rv4Var14, l5);
                    jce.F(qw1.g, rv4Var14, Integer.valueOf(hashCode5));
                    jce.C(qw1.h, rv4Var14);
                    jce.F(qw1.d, rv4Var14, p5);
                    xbe.i(rv4Var14, pna.h(kq7Var, 4.0f));
                    tza tzaVar3 = j27.a;
                    nq7 k2 = tte.k(kq7Var, ((h27) rv4Var14.j(tzaVar3)).c.a);
                    long g = rm1.g(((h27) rv4Var14.j(tzaVar3)).a, 1.0f);
                    ba5 ba5Var = lre.g;
                    l0e.j(yqe.A((y3b) f3b.R.getValue(), rv4Var14), cqe.m((q3b) nz.l.getValue(), rv4Var14), p58Var.e, zbe.y(nmd.v(k2, g, ba5Var), 16.0f), xt4Var8, rv4Var14, 0);
                    xbe.i(rv4Var14, pna.h(kq7Var, 4.0f));
                    l0e.j(yqe.A((y3b) f3b.S.getValue(), rv4Var14), cqe.m((q3b) nz.m.getValue(), rv4Var14), p58Var.f, zbe.y(nmd.v(tte.k(kq7Var, ((h27) rv4Var14.j(tzaVar3)).c.a), rm1.g(((h27) rv4Var14.j(tzaVar3)).a, 1.0f), ba5Var), 16.0f), xt4Var9, rv4Var14, 0);
                    rv4Var14.q(true);
                } else {
                    rv4Var14.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ld1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ld1(Object obj, aw7 aw7Var, Object obj2, int i) {
        this.a = i;
        this.d = aw7Var;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ ld1(Object obj, Object obj2, xt4 xt4Var, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = xt4Var;
    }
}
