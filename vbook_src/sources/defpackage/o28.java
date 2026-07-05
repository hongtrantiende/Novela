package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o28  reason: default package */
/* loaded from: classes3.dex */
public abstract class o28 {
    public static final qm1 a = qm1.J;
    public static final qm1 b;
    public static final qm1 c;
    public static final qm1 d;
    public static final qm1 e;
    public static final qm1 f;
    public static final tu1 g;
    public static final Object h;
    public static boolean i;
    public static int j;

    static {
        qm1 qm1Var = qm1.e;
        b = qm1Var;
        c = qm1.K;
        qm1 qm1Var2 = qm1.f;
        d = qm1Var2;
        e = qm1Var;
        f = qm1Var2;
        g = new tu1(new mv1(27), false, -1851057667);
        h = new Object();
    }

    public static final void a(nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(273555873);
        if (rv4Var2.f(nq7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) ok3.O.getValue(), rv4Var2, 0);
            tza tzaVar = j27.a;
            long b2 = zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q);
            kq7 kq7Var = kq7.a;
            nk5.a(c2, null, pna.n(kq7Var, 80.0f), b2, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            cvb.c(yqe.A((y3b) o2b.h0.getValue(), rv4Var2), null, zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var, i2, 17);
        }
    }

    public static final void b(String str, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        rv4Var.g0(-318555826);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            cvb.c(str, nq7Var, 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.h, rv4Var, i4 & Token.ELSE, 0, 130044);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, nq7Var, i2, 8);
        }
    }

    public static final void c(final List list, final ho5 ho5Var, final rh8 rh8Var, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        ek9 u;
        lu4 lu4Var;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4Var.g0(-2049983800);
        if (rv4Var.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(ho5Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(rh8Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i7;
        boolean z5 = true;
        if ((74899 & i12) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i12 & 1, z)) {
            if ((i12 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            Object obj2 = P;
            if (z2 || P == obj) {
                List u0 = sl1.u0(list, new pa5(14));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : u0) {
                    Integer valueOf = Integer.valueOf(((sl5) obj3).c);
                    Object obj4 = linkedHashMap.get(valueOf);
                    if (obj4 == null) {
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(valueOf, arrayList);
                        obj4 = arrayList;
                    }
                    ((List) obj4).add(obj3);
                }
                rv4Var.o0(linkedHashMap);
                obj2 = linkedHashMap;
            }
            Map map = (Map) obj2;
            if (map.isEmpty()) {
                rv4Var.e0(-926831125);
                a(nq7Var.a0(pna.c), rv4Var, 0);
                rv4Var.q(false);
                u = rv4Var.u();
                if (u != null) {
                    lu4Var = new lu4(list, ho5Var, rh8Var, nq7Var, xt4Var, xt4Var2, i2, 0) { // from class: bi7
                        public final /* synthetic */ xt4 C;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ List b;
                        public final /* synthetic */ ho5 c;
                        public final /* synthetic */ rh8 d;
                        public final /* synthetic */ nq7 e;
                        public final /* synthetic */ xt4 f;

                        {
                            this.a = r8;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj5, Object obj6) {
                            int i13 = this.a;
                            pvc pvcVar = pvc.a;
                            switch (i13) {
                                case 0:
                                    ((Integer) obj6).getClass();
                                    int p = xoe.p(3073);
                                    o28.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj5, p);
                                    return pvcVar;
                                default:
                                    ((Integer) obj6).getClass();
                                    int p2 = xoe.p(3073);
                                    o28.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj5, p2);
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                }
                return;
            }
            rv4Var.e0(-926755206);
            rv4Var.q(false);
            qg6 a2 = tg6.a(0, 3, rv4Var);
            f25 f25Var = new f25(96.0f);
            bkd r = mwe.r(new th8(16.0f, 16.0f, 16.0f, 16.0f), rh8Var);
            hz hzVar = new hz(12.0f, true, new vs(2));
            hz hzVar2 = new hz(12.0f, true, new vs(2));
            boolean h2 = rv4Var.h(map);
            if ((i12 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = h2 | z3;
            if ((57344 & i12) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((i12 & 458752) != 131072) {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object P2 = rv4Var.P();
            if (z8 || P2 == obj) {
                Object hqVar = new hq(map, ho5Var, xt4Var, xt4Var2, 18);
                rv4Var.o0(hqVar);
                P2 = hqVar;
            }
            ade.e(f25Var, nq7Var, a2, r, hzVar2, hzVar, null, false, null, (xt4) P2, rv4Var, 1769520, 0, 912);
        } else {
            rv4Var.X();
        }
        u = rv4Var.u();
        if (u != null) {
            lu4Var = new lu4(list, ho5Var, rh8Var, nq7Var, xt4Var, xt4Var2, i2, 1) { // from class: bi7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ ho5 c;
                public final /* synthetic */ rh8 d;
                public final /* synthetic */ nq7 e;
                public final /* synthetic */ xt4 f;

                {
                    this.a = r8;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj5, Object obj6) {
                    int i13 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i13) {
                        case 0:
                            ((Integer) obj6).getClass();
                            int p = xoe.p(3073);
                            o28.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj5, p);
                            return pvcVar;
                        default:
                            ((Integer) obj6).getClass();
                            int p2 = xoe.p(3073);
                            o28.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj5, p2);
                            return pvcVar;
                    }
                }
            };
            u.d = lu4Var;
        }
    }

    public static final void d(sl5 sl5Var, ho5 ho5Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        kq7 kq7Var;
        up5 up5Var;
        String str;
        kq7 kq7Var2;
        ba5 ba5Var;
        rv4 rv4Var2;
        int i7;
        hn8 hn8Var;
        vt4 vt4Var3 = vt4Var2;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(1160868944);
        if (rv4Var3.f(sl5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var3.f(ho5Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4 | 384;
        if (rv4Var3.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var3.h(vt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i11 & 1, z)) {
            String str2 = sl5Var.a;
            int i12 = sl5Var.g;
            String str3 = sl5Var.e;
            boolean f2 = rv4Var3.f(str2);
            Object P = rv4Var3.P();
            if (f2 || P == ax1.a) {
                P = ho5Var.f(new ip5(new xq5(sl5Var.c, str3, null, null), str3, s21.m("bookmark-", sl5Var.a)));
                rv4Var3.o0(P);
            }
            vp5 vp5Var = (vp5) jsc.x((sj4) P, tp5.a, rv4Var3, 48).getValue();
            if (vp5Var instanceof up5) {
                up5Var = (up5) vp5Var;
            } else {
                up5Var = null;
            }
            if (up5Var != null && (hn8Var = up5Var.a) != null) {
                str = hn8Var.a.t();
            } else {
                str = null;
            }
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var3, 48);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            kq7 kq7Var3 = kq7.a;
            nq7 p = lye.p(rv4Var3, kq7Var3);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var3, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var3, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var3);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var3, p);
            String str4 = str;
            nq7 k = tte.k(jsc.t(0.72f, pna.f(kq7Var3, 1.0f), false), r0f.z(rv4Var3).b);
            long g2 = rm1.g(r0f.y(rv4Var3), 2.0f);
            ba5 ba5Var2 = lre.g;
            nq7 f3 = lbe.f(15, vt4Var, nmd.v(k, g2, ba5Var2), null, false);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, f3);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar, rv4Var3, d2);
            jce.F(npVar2, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
            jce.F(npVar4, rv4Var3, p2);
            if (str4 != null) {
                rv4Var3.e0(1572612803);
                i7 = 1;
                kq7Var2 = kq7Var3;
                ba5Var = ba5Var2;
                do5.a(str4, r0f.d, false, null, null, null, pna.c, null, rv4Var, 12582960, 892);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                kq7Var2 = kq7Var3;
                ba5Var = ba5Var2;
                rv4Var3.e0(1572827974);
                ze4 ze4Var = pna.c;
                b37 d3 = fu0.d(kh5.e, false);
                int hashCode3 = Long.hashCode(rv4Var3.T);
                xt8 l3 = rv4Var3.l();
                nq7 p3 = lye.p(rv4Var3, ze4Var);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, d3);
                jce.F(npVar2, rv4Var3, l3);
                s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p3);
                cvb.c(String.valueOf(i12 + 1), null, zl1.b(0.5f, r0f.y(rv4Var3).q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).n, rv4Var, 0, 0, 131066);
                rv4Var2 = rv4Var;
                i7 = 1;
                rv4Var2.q(true);
                rv4Var2.q(false);
            }
            String valueOf2 = String.valueOf(i12 + i7);
            oyb oybVar = r0f.A(rv4Var2).o;
            long j2 = zl1.e;
            nk0 nk0Var = kh5.C;
            pu0 pu0Var = pu0.a;
            kq7 kq7Var4 = kq7Var2;
            nq7 k2 = tte.k(zbe.y(pu0Var.a(kq7Var4, nk0Var), 4.0f), r0f.z(rv4Var2).a);
            long j3 = zl1.b;
            cvb.c(valueOf2, zbe.z(nmd.v(k2, zl1.b(0.5f, j3), ba5Var), 6.0f, 2.0f), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 384, 0, 131064);
            rv4Var3 = rv4Var;
            vt4Var3 = vt4Var2;
            nk5.a(rp5.c((wk3) jk3.H.getValue(), rv4Var3, 0), null, zbe.y(lbe.f(15, vt4Var3, nmd.v(tte.k(pna.n(zbe.y(pu0Var.a(kq7Var4, kh5.c), 4.0f), 28.0f), uu9.a), zl1.b(0.5f, j3), ba5Var), null, false), 5.0f), j2, rv4Var3, 3120, 0);
            rv4Var3.q(true);
            rv4Var3.q(true);
            kq7Var = kq7Var4;
        } else {
            rv4Var3.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new wp0(sl5Var, ho5Var, kq7Var, vt4Var, vt4Var3, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final void e(rl5 rl5Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        vt4 vt4Var5;
        boolean z2;
        float f2;
        zx1 zx1Var;
        ba5 ba5Var;
        lh9 lh9Var;
        ?? r5;
        int i9;
        wk3 wk3Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        rl5 rl5Var2 = rl5Var;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var2 = lre.g;
        rv4Var2.g0(-144032930);
        if (rv4Var2.f(rl5Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var2.h(vt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var2.h(vt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var2.h(xt4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i15 & 1, z)) {
            nq7 C = zbe.C(nq7Var, 24.0f, nae.e, 24.0f, nae.e, 10);
            mk0 mk0Var = kh5.F;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, C);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            String str = rl5Var2.a;
            String str2 = rl5Var2.b;
            String str3 = rl5Var2.d;
            String str4 = rl5Var2.e;
            u22 u22Var = r0f.d;
            kq7 kq7Var = kq7.a;
            nq7 h2 = pna.h(pna.s(kq7Var, 50.0f), 75.0f);
            boolean z8 = rl5Var2.n;
            if ((i15 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (z2 || P == lh9Var2) {
                P = new hi7(0, vt4Var);
                rv4Var2.o0(P);
            }
            do5.c(str, str2, str3, str4, u22Var, tte.k(q1d.b(h2, z8, nae.e, (vt4) P, 2), r0f.z(rv4Var2).a), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            nq7 h3 = pna.h(kq7Var, 75.0f);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            nq7 a0 = h3.a0(new we6(f2, true));
            xn1 a3 = wn1.a(lz.e, kh5.I, rv4Var2, 6);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, a0);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            zx1 zx1Var3 = zx1Var;
            float f3 = 1.0f;
            int i16 = i15;
            cvb.c(rl5Var2.b, rs8.e(1.0f, pna.f(kq7Var, 1.0f), true), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).j, rv4Var, 0, 24960, 109560);
            nq7 f4 = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, kh5.G, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f4);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            rl5Var2 = rl5Var;
            String str5 = rl5Var2.c;
            long j2 = r0f.y(rv4Var).q;
            oyb oybVar = r0f.A(rv4Var).l;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            cvb.c(str5, lpe.m(new we6(f3, true), 0.8f), j2, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, oybVar, rv4Var, 0, 24960, 109560);
            rv4Var2 = rv4Var;
            if (rl5Var2.p) {
                rv4Var2.e0(863820273);
                ar5 c2 = rp5.c((wk3) ok3.d0.getValue(), rv4Var2, 0);
                nq7 k = tte.k(zbe.y(pna.n(kq7Var, 36.0f), 4.0f), uu9.a);
                if ((i16 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Object P2 = rv4Var2.P();
                if (z7 || P2 == lh9Var2) {
                    P2 = new hi7(2, vt4Var2);
                    rv4Var2.o0(P2);
                }
                nq7 y = zbe.y(nmd.v(lbe.f(15, (vt4) P2, k, null, false), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var2), 4.0f);
                r5 = 0;
                i16 = i16;
                ba5Var = ba5Var2;
                lh9Var = lh9Var2;
                nk5.a(c2, "", y, 0L, rv4Var2, 48, 8);
                rv4Var2.q(false);
            } else {
                ba5Var = ba5Var2;
                lh9Var = lh9Var2;
                r5 = 0;
                rv4Var2.e0(864315746);
                rv4Var2.q(false);
            }
            if (!rl5Var2.l) {
                rv4Var2.e0(864402732);
                ar5 c3 = rp5.c((wk3) ok3.c0.getValue(), rv4Var2, r5);
                nq7 k2 = tte.k(zbe.y(pna.n(kq7Var, 36.0f), 4.0f), uu9.a);
                if ((i16 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = r5;
                }
                Object P3 = rv4Var2.P();
                if (z6 || P3 == lh9Var) {
                    P3 = new hi7(3, vt4Var4);
                    rv4Var2.o0(P3);
                }
                nk5.a(c3, yqe.A((y3b) v1b.u.getValue(), rv4Var2), zbe.y(nmd.v(lbe.f(15, (vt4) P3, k2, null, r5), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var), 4.0f), 0L, rv4Var2, 0, 8);
                rv4Var2.q(r5);
                i9 = 4;
            } else {
                rv4Var2.e0(864963553);
                if (rl5Var2.k) {
                    rv4Var2.e0(865032466);
                    if (rl5Var2.m) {
                        wk3Var = (wk3) ok3.S.getValue();
                    } else {
                        wk3Var = (wk3) ok3.T.getValue();
                    }
                    ar5 c4 = rp5.c(wk3Var, rv4Var2, r5);
                    nq7 k3 = tte.k(zbe.y(pna.n(kq7Var, 36.0f), 4.0f), uu9.a);
                    if ((i16 & 3670016) == 1048576) {
                        z3 = true;
                    } else {
                        z3 = r5;
                    }
                    if ((i16 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = r5;
                    }
                    boolean z9 = z4 | z3;
                    Object P4 = rv4Var2.P();
                    if (z9 || P4 == lh9Var) {
                        P4 = new mf6(24, xt4Var, rl5Var2);
                        rv4Var2.o0(P4);
                    }
                    i9 = 4;
                    nk5.a(c4, yqe.A((y3b) s2b.g0.getValue(), rv4Var2), zbe.y(nmd.v(lbe.f(15, (vt4) P4, k3, null, r5), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var), 4.0f), 0L, rv4Var2, 0, 8);
                    rv4Var2.q(r5);
                } else {
                    i9 = 4;
                    rv4Var2.e0(865684706);
                    rv4Var2.q(r5);
                }
                rv4Var2.q(r5);
            }
            if (rl5Var2.o) {
                rv4Var2.e0(865790664);
                ar5 c5 = rp5.c((wk3) jk3.x.getValue(), rv4Var2, r5);
                nq7 k4 = tte.k(zbe.y(pna.n(kq7Var, 36.0f), 4.0f), uu9.a);
                if ((i16 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = r5;
                }
                Object P5 = rv4Var2.P();
                if (!z5 && P5 != lh9Var) {
                    vt4Var5 = vt4Var3;
                } else {
                    vt4Var5 = vt4Var3;
                    P5 = new hi7(i9, vt4Var5);
                    rv4Var2.o0(P5);
                }
                nk5.a(c5, yqe.A((y3b) o2b.V.getValue(), rv4Var2), zbe.y(nmd.v(lbe.f(15, (vt4) P5, k4, null, r5), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var), 4.0f), 0L, rv4Var2, 0, 8);
                rv4Var2.q(r5);
            } else {
                vt4Var5 = vt4Var3;
                rv4Var2.e0(866325538);
                rv4Var2.q(r5);
            }
            hl5.v(rv4Var2, true, true, true);
        } else {
            vt4Var5 = vt4Var3;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bx(rl5Var2, nq7Var, vt4Var, vt4Var2, vt4Var5, vt4Var4, xt4Var, i2, 6);
        }
    }

    public static final void f(String str, List list, Set set, rh8 rh8Var, nq7 nq7Var, lu4 lu4Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        rh8 rh8Var2;
        aw7 aw7Var;
        boolean z2;
        aw7 aw7Var2;
        lh9 lh9Var;
        int i9;
        int i10;
        int i11;
        List list2;
        aw7 aw7Var3;
        aw7 aw7Var4;
        aw7 aw7Var5;
        String str2;
        boolean z3;
        lu4 pi7Var;
        int i12;
        int i13;
        kj6 kj6Var;
        aw7 aw7Var6;
        aw7 aw7Var7;
        float f2;
        lh9 lh9Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z4;
        float f3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        aw7 aw7Var8;
        boolean z11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(18587238);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i20 = i2 | i3;
        if (rv4Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i21 = i20 | i4;
        if (rv4Var2.f(set)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i22 = i21 | i5;
        if (rv4Var2.f(rh8Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i23 = i22 | i6;
        if (rv4Var2.h(lu4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i24 = i23 | i7;
        if (rv4Var2.h(xt4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i25 = i24 | i8;
        if ((599187 & i25) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i25 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var3 = ax1.a;
            if (P == lh9Var3) {
                P = yte.s(rv4Var2);
                rv4Var2.o0(P);
            }
            m82 m82Var = (m82) P;
            kj6 a2 = mj6.a(0, rv4Var2, 0, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var3) {
                P2 = yae.z(-1);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var9 = (aw7) P2;
            Object[] objArr = new Object[0];
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var3) {
                P3 = new rh7(0);
                rv4Var2.o0(P3);
            }
            aw7 j2 = zpe.j(objArr, (vt4) P3, rv4Var2, 384);
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var3) {
                P4 = yae.z(Boolean.FALSE);
                rv4Var2.o0(P4);
            }
            aw7 aw7Var10 = (aw7) P4;
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var3) {
                P5 = yae.z(list);
                rv4Var2.o0(P5);
            }
            aw7 aw7Var11 = (aw7) P5;
            Object P6 = rv4Var2.P();
            if (P6 == lh9Var3) {
                P6 = yae.q(new ne1(a2, 7));
                rv4Var2.o0(P6);
            }
            yya yyaVar = (yya) P6;
            Object P7 = rv4Var2.P();
            if (P7 == lh9Var3) {
                P7 = yae.q(new ne1(a2, 8));
                rv4Var2.o0(P7);
            }
            yya yyaVar2 = (yya) P7;
            Object P8 = rv4Var2.P();
            if (P8 == lh9Var3) {
                aw7Var = aw7Var9;
                P8 = yae.q(new vh7(j2, aw7Var9, yyaVar2, yyaVar, 0));
                rv4Var2.o0(P8);
            } else {
                aw7Var = aw7Var9;
            }
            yya yyaVar3 = (yya) P8;
            Object P9 = rv4Var2.P();
            if (P9 == lh9Var3) {
                P9 = yae.q(new wh7(0, j2, yyaVar));
                rv4Var2.o0(P9);
            }
            yya yyaVar4 = (yya) P9;
            Object P10 = rv4Var2.P();
            if (P10 == lh9Var3) {
                P10 = yae.q(new xh7(j2, aw7Var11, yyaVar2, 0));
                rv4Var2.o0(P10);
            }
            yya yyaVar5 = (yya) P10;
            Object P11 = rv4Var2.P();
            if (P11 == lh9Var3) {
                P11 = yae.q(new he1(aw7Var11, aw7Var, 14));
                rv4Var2.o0(P11);
            }
            yya yyaVar6 = (yya) P11;
            Boolean bool = (Boolean) aw7Var10.getValue();
            bool.booleanValue();
            boolean f4 = rv4Var2.f(j2);
            if ((i25 & Token.ASSIGN_MOD) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z12 = f4 | z2;
            Object P12 = rv4Var2.P();
            if (!z12 && P12 != lh9Var3) {
                aw7Var2 = aw7Var;
                i9 = 256;
                i10 = 131072;
                i11 = 3;
                list2 = list;
                aw7Var3 = aw7Var11;
                aw7Var4 = aw7Var10;
                aw7Var5 = j2;
                lh9Var = lh9Var3;
            } else {
                aw7Var2 = aw7Var;
                lh9Var = lh9Var3;
                i9 = 256;
                i10 = 131072;
                i11 = 3;
                ni7 ni7Var = new ni7(j2, list, aw7Var10, aw7Var11, null, 0);
                list2 = list;
                aw7Var3 = aw7Var11;
                aw7Var4 = aw7Var10;
                aw7Var5 = j2;
                rv4Var2.o0(ni7Var);
                P12 = ni7Var;
            }
            yte.h(bool, list2, (lu4) P12, rv4Var2);
            Integer valueOf = Integer.valueOf(((List) aw7Var3.getValue()).size());
            mq5 mq5Var = (mq5) sl1.e0((List) aw7Var3.getValue());
            if (mq5Var != null) {
                str2 = mq5Var.a;
            } else {
                str2 = null;
            }
            Boolean bool2 = (Boolean) aw7Var4.getValue();
            bool2.getClass();
            Object[] objArr2 = {str, valueOf, str2, bool2};
            int i26 = i25 & 14;
            if (i26 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f5 = z3 | rv4Var2.f(a2);
            Object P13 = rv4Var2.P();
            if (!f5 && P13 != lh9Var) {
                i12 = i25;
                kj6Var = a2;
                i13 = 4;
                pi7Var = P13;
                aw7Var7 = aw7Var2;
                aw7Var6 = aw7Var3;
            } else {
                i12 = i25;
                i13 = 4;
                aw7 aw7Var12 = aw7Var2;
                pi7Var = new pi7(a2, aw7Var3, str, aw7Var12, null, 0);
                kj6Var = a2;
                aw7Var6 = aw7Var3;
                aw7Var7 = aw7Var12;
                rv4Var2.o0(pi7Var);
            }
            yte.j(objArr2, pi7Var, rv4Var2);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf2 = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf2);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            aw7 aw7Var13 = aw7Var6;
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 f6 = pna.f(kq7Var, 1.0f);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int i27 = i12;
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f6);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            if (((Boolean) aw7Var4.getValue()).booleanValue()) {
                f2 = 180.0f;
            } else {
                f2 = 0.0f;
            }
            yya b2 = nq.b(f2, null, null, rv4Var2, 0, 30);
            if (list.size() > 10) {
                rv4Var2.e0(-558745617);
                jub jubVar = (jub) aw7Var5.getValue();
                String B = yqe.B((y3b) b3b.L.getValue(), new Object[]{Integer.valueOf(list.size())}, rv4Var2);
                long g2 = rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f);
                tu1 E = jce.E(-1887367271, new yh7(0, aw7Var4, b2), rv4Var2);
                f3 = 1.0f;
                nq7 C = zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 24.0f, nae.e, 2), nae.e, nae.e, nae.e, 8.0f, 7);
                boolean f7 = rv4Var2.f(aw7Var5);
                Object P14 = rv4Var2.P();
                if (f7 || P14 == lh9Var) {
                    P14 = new ig7(aw7Var5, 9);
                    rv4Var2.o0(P14);
                }
                z4 = false;
                i14 = i9;
                lh9Var2 = lh9Var;
                i16 = i26;
                i17 = i10;
                i18 = i11;
                i15 = i13;
                z5 = true;
                i19 = 7;
                xxe.m(jubVar, B, 0L, g2, E, null, C, null, (xt4) P14, null, rv4Var2, 1597440, 676);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                lh9Var2 = lh9Var;
                i14 = i9;
                i15 = i13;
                i16 = i26;
                i17 = i10;
                i18 = i11;
                i19 = 7;
                z4 = false;
                f3 = 1.0f;
                z5 = true;
                rv4Var2.e0(-557714464);
                rv4Var2.q(false);
            }
            nq7 e2 = rs8.e(f3, pna.f(kq7Var, f3), z5);
            bkd r = mwe.r(rh8Var, zbe.j(nae.e, nae.e, 4.0f, 96.0f, i18));
            bkd r2 = mwe.r(rh8Var, zbe.j(nae.e, nae.e, nae.e, 96.0f, i19));
            boolean f8 = rv4Var2.f(aw7Var5);
            if (i16 == i15) {
                z6 = z5;
            } else {
                z6 = z4;
            }
            boolean z13 = z6 | f8;
            if ((i27 & 896) != i14) {
                z7 = z4;
            } else {
                z7 = z5;
            }
            boolean z14 = z13 | z7;
            if ((458752 & i27) == i17) {
                z8 = z5;
            } else {
                z8 = z4;
            }
            boolean z15 = z14 | z8;
            if ((3670016 & i27) == 1048576) {
                z9 = z5;
            } else {
                z9 = z4;
            }
            boolean z16 = z15 | z9;
            Object P15 = rv4Var2.P();
            if (!z16 && P15 != lh9Var2) {
                z10 = z4;
                aw7Var8 = aw7Var13;
            } else {
                z10 = z4;
                aw7Var8 = aw7Var13;
                ai7 ai7Var = new ai7(aw7Var5, aw7Var8, str, set, lu4Var, xt4Var, 0);
                rv4Var2.o0(ai7Var);
                P15 = ai7Var;
            }
            kj6 kj6Var2 = kj6Var;
            rv4 rv4Var3 = rv4Var2;
            pc2.c(e2, kj6Var2, r2, null, null, null, false, r, 0L, 0L, nae.e, (xt4) P15, rv4Var3, 0, 0, 3832);
            rv4Var2 = rv4Var3;
            rv4Var2.q(z5);
            boolean booleanValue = ((Boolean) yyaVar3.getValue()).booleanValue();
            nk0 nk0Var = kh5.C;
            pu0 pu0Var = pu0.a;
            aw7 aw7Var14 = aw7Var8;
            rh8Var2 = rh8Var;
            rte.c(booleanValue, zbe.C(zbe.x(pu0Var.a(kq7Var, nk0Var), rh8Var), 16.0f, nae.e, 72.0f, 8.0f, 2), zt3.g(null, i18).a(zt3.k(null, 0.96f, 0L, 5)), zt3.i(null, i18).a(zt3.m(0.96f, 0L, 5)), null, jce.E(-86248124, new th7(m82Var, kj6Var2, aw7Var7, aw7Var14, yyaVar6, 0), rv4Var2), rv4Var2, 200064, 16);
            if (!((Boolean) yyaVar4.getValue()).booleanValue() && !((Boolean) yyaVar5.getValue()).booleanValue()) {
                z11 = z10;
            } else {
                z11 = true;
            }
            rte.c(z11, zbe.C(zbe.x(pu0Var.a(kq7Var, kh5.E), rh8Var2), nae.e, nae.e, 16.0f, 8.0f, 3), zt3.g(null, i18).a(zt3.k(null, 0.96f, 0L, 5)), zt3.i(null, i18).a(zt3.m(0.96f, 0L, 5)), null, jce.E(-1532917957, new uh7(m82Var, kj6Var2, yyaVar4, aw7Var14, yyaVar5, 0), rv4Var2), rv4Var2, 200064, 16);
            rv4Var2.q(true);
        } else {
            rh8Var2 = rh8Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bx(str, list, set, rh8Var2, nq7Var, lu4Var, xt4Var, i2, 5);
        }
    }

    public static final void g(m82 m82Var, aw7 aw7Var, kj6 kj6Var, int i2) {
        if (i2 >= 0 && i2 < ((List) aw7Var.getValue()).size()) {
            z87.v(m82Var, null, null, new qm5(kj6Var, i2, (m42) null, 3), 3);
        }
    }

    public static final void h(int i2, int i3, nq7 nq7Var, rj8 rj8Var, tu1 tu1Var, tu1 tu1Var2, rv4 rv4Var, int i4) {
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        rv4Var.g0(-742408938);
        if (rv4Var.d(i2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i8 = i4 | i5;
        if (rv4Var.d(i3)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i9 = i8 | i6;
        if (rv4Var.f(rj8Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i10 = i9 | i7;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            rv4Var.Z();
            if ((i4 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 z3 = zbe.z(pna.f(kq7Var, 1.0f), 18.0f, 8.0f);
            boolean h2 = rv4Var.h(m82Var);
            if ((((i10 & 7168) ^ 3072) > 2048 && rv4Var.f(rj8Var)) || (i10 & 3072) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | h2;
            Object P2 = rv4Var.P();
            if (z4 || P2 == obj) {
                P2 = new bs1(7, m82Var, rj8Var);
                rv4Var.o0(P2);
            }
            int i11 = (i10 >> 9) & 14;
            int i12 = i10 << 3;
            o(rj8Var, i2, i3, z3, (xt4) P2, rv4Var, i11 | 3072 | (i12 & Token.ASSIGN_MOD) | (i12 & 896));
            kxe.c(rj8Var, rs8.e(1.0f, pna.f(kq7Var, 1.0f), true), null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(2141456717, new oh7(tu1Var, tu1Var2, 0), rv4Var), rv4Var, i11, 24576, 16380);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ph7(i2, i3, nq7Var, rj8Var, tu1Var, tu1Var2, i4, 0);
        }
    }

    public static final void i(m13 m13Var, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        m13Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(-418621675);
        if (rv4Var.f(m13Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(lu4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            boolean booleanValue = ((Boolean) m13Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new xe7(m13Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(1371494249, new af7(m13Var, lu4Var), rv4Var), null, x, jce.E(-1282713172, new ye7(m13Var, 1), rv4Var), xxe.b, null, 0L, 0L, nae.e, false, false, jce.E(1242077633, new ye7(m13Var, 2), rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new af7(m13Var, lu4Var, i2);
        }
    }

    public static final void j(int i2, tu1 tu1Var, tu1 tu1Var2, xt4 xt4Var, rv4 rv4Var, boolean z) {
        int i3;
        boolean z2;
        int i4;
        rv4Var.g0(2021338140);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i2 & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-2051708901);
                m(i5 & 8190, tu1Var, tu1Var2, xt4Var, rv4Var, z);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2051501542);
                l(i5 & 8190, tu1Var, tu1Var2, xt4Var, rv4Var, z);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nh7(z, xt4Var, tu1Var, tu1Var2, i2, 2);
        }
    }

    public static final void k(boolean z, rl5 rl5Var, String str, Set set, List list, List list2, ho5 ho5Var, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, lu4 lu4Var, xt4 xt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        char c3;
        int i13;
        int i14;
        boolean z2;
        rl5Var.getClass();
        str.getClass();
        set.getClass();
        list.getClass();
        list2.getClass();
        ho5Var.getClass();
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        lu4Var.getClass();
        xt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        rv4Var.g0(1442172204);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i2 | i3;
        if (rv4Var.f(rl5Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i16 = i15 | i4;
        if (rv4Var.f(str)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i17 = i16 | i5;
        if (rv4Var.f(set)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i18 = i17 | i6;
        char c4 = 8192;
        if (rv4Var.f(list)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i19 = i18 | i7;
        char c5 = 0;
        if (rv4Var.f(list2)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i20 = i19 | i8;
        char c6 = 0;
        if (rv4Var.f(ho5Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i21 = i20 | i9;
        if (rv4Var.h(xt4Var)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i22 = i21 | i10;
        if (rv4Var.h(vt4Var)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i23 = i22 | i11;
        if (rv4Var.h(vt4Var2)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i24 = i23 | i12;
        if (rv4Var.h(lu4Var)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var2)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i25 = c2 | c3;
        if (rv4Var.h(vt4Var3)) {
            i13 = 256;
        } else {
            i13 = Token.CASE;
        }
        int i26 = i25 | i13;
        if (rv4Var.h(vt4Var4)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i27 = i26 | i14;
        if (rv4Var.h(xt4Var3)) {
            c4 = 16384;
        }
        int i28 = i27 | c4;
        if (rv4Var.h(xt4Var4)) {
            c5 = 0;
        }
        int i29 = i28 | c5;
        if (rv4Var.h(xt4Var5)) {
            c6 = 0;
        }
        int i30 = i29 | c6;
        if ((i24 & 306783379) == 306783378 && (599187 & i30) == 599186) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i24 & 1, z2)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new k24(14);
                rv4Var.o0(P);
            }
            j((i24 & 14) | 3456 | ((i24 >> 18) & Token.ASSIGN_MOD), jce.E(-219783427, new bn7((Object) rl5Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, xt4Var5, 7), rv4Var), jce.E(1871746110, new sh7(list, list2, uj8.b(0, (vt4) P, rv4Var, 384, 3), str, set, lu4Var, xt4Var2, ho5Var, xt4Var3, xt4Var4), rv4Var), xt4Var, rv4Var, z);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zh7(z, rl5Var, str, set, list, list2, ho5Var, xt4Var, vt4Var, vt4Var2, lu4Var, xt4Var2, vt4Var3, vt4Var4, xt4Var3, xt4Var4, xt4Var5, i2);
        }
    }

    public static final void l(int i2, tu1 tu1Var, tu1 tu1Var2, xt4 xt4Var, rv4 rv4Var, boolean z) {
        int i3;
        xt4 xt4Var2;
        boolean z2;
        int i4;
        rv4Var.g0(-1216459736);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if ((i2 & 48) == 0) {
            xt4Var2 = xt4Var;
            if (rv4Var.h(xt4Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        } else {
            xt4Var2 = xt4Var;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            nmd.f(z, xt4Var2, null, false, 0L, 0L, nae.e, 0L, nae.e, jce.E(278289111, new mh7(tu1Var, tu1Var2, 0), rv4Var), rv4Var, (i5 & 14) | 805309440 | (i5 & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nh7(z, xt4Var, tu1Var, tu1Var2, i2, 0);
        }
    }

    public static final void m(int i2, tu1 tu1Var, tu1 tu1Var2, xt4 xt4Var, rv4 rv4Var, boolean z) {
        int i3;
        boolean z2;
        int i4;
        rv4Var.g0(794832128);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i2 & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            hc2.b(pna.c, null, jce.E(-1428746410, new qh7(z, xt4Var, tu1Var, tu1Var2, 0), rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nh7(z, xt4Var, tu1Var, tu1Var2, i2, 1);
        }
    }

    public static final void n(vt4 vt4Var, int i2, tu1 tu1Var, rv4 rv4Var, int i3) {
        int i4;
        n29 n29Var;
        vt4Var.getClass();
        rv4Var.g0(837179611);
        if (rv4Var.d(i2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        if (((i4 | i3) & Token.EXPR_VOID) == 146 && rv4Var.E()) {
            rv4Var.X();
        } else {
            rv4Var.e0(1849434622);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(new py5(0L));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            rv4Var.q(false);
            boolean booleanValue = ((Boolean) rv4Var.j(i62.a)).booleanValue();
            if (booleanValue) {
                n29Var = n29.a;
            } else {
                n29Var = n29.c;
            }
            rv4Var.e0(5004770);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new qo7(aw7Var, 13);
                rv4Var.o0(P2);
            }
            xt4 xt4Var = (xt4) P2;
            rv4Var.q(false);
            xt4Var.getClass();
            tk.a(new s26(14, n29Var, xt4Var), vt4Var, null, jce.E(1150445561, new g29(aw7Var, booleanValue, i2, tu1Var), rv4Var), rv4Var, 3120, 4);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(i2, i3, 22, vt4Var, tu1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a3, code lost:
        if (r6 == defpackage.ax1.a) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.rj8 r18, int r19, int r20, defpackage.nq7 r21, defpackage.xt4 r22, defpackage.rv4 r23, int r24) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o28.o(rj8, int, int, nq7, xt4, rv4, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x02f2, code lost:
        if (r9 == r8) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(defpackage.mq5 r49, boolean r50, boolean r51, defpackage.nq7 r52, defpackage.vt4 r53, defpackage.rv4 r54, int r55) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o28.p(mq5, boolean, boolean, nq7, vt4, rv4, int):void");
    }

    public static final void q(jbe jbeVar) {
        n1b n1bVar;
        jbeVar.getClass();
        if (jbeVar instanceof n1b) {
            n1bVar = (n1b) jbeVar;
        } else {
            n1bVar = null;
        }
        if (n1bVar != null) {
            return;
        }
        xk5.j(cm9.a(jbeVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final g46 r(yq2 yq2Var) {
        g46 g46Var;
        yq2Var.getClass();
        if (yq2Var instanceof g46) {
            g46Var = (g46) yq2Var;
        } else {
            g46Var = null;
        }
        if (g46Var != null) {
            return g46Var;
        }
        xk5.j(cm9.a(yq2Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static s6f s(km8 km8Var) {
        km8Var.N(1);
        int C = km8Var.C();
        long j2 = km8Var.b + C;
        int i2 = C / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long t = km8Var.t();
            if (t == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = t;
            jArr2[i3] = km8Var.t();
            km8Var.N(2);
            i3++;
        }
        km8Var.N((int) (j2 - km8Var.b));
        return new s6f(jArr, jArr2);
    }

    public static final m13 t(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = m13.e;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(20);
            rv4Var.o0(P);
        }
        return (m13) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
    }

    public static final yja u(dka dkaVar, rv4 rv4Var) {
        hka hkaVar = (hka) rv4Var.j(ika.b);
        hkaVar.getClass();
        f99 f99Var = dy1.h;
        float L0 = ((r13) rv4Var.j(f99Var)).L0(400.0f);
        boolean f2 = rv4Var.f(hkaVar);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (f2 || P == obj) {
            P = new fka(hkaVar.a, hkaVar.b, hkaVar.c, L0);
            rv4Var.o0(P);
        }
        fka fkaVar = (fka) P;
        boolean h2 = rv4Var.h(fkaVar);
        Object P2 = rv4Var.P();
        rk9 rk9Var = null;
        if (h2 || P2 == obj) {
            P2 = new ov9(fkaVar, (m42) null, 6);
            rv4Var.o0(P2);
        }
        yte.g((lu4) P2, rv4Var, fkaVar);
        rv4Var.e0(-1017294240);
        if (dkaVar.equals(aka.a)) {
            rv4Var.e0(1632783428);
            rv4Var.q(false);
            rk9Var = rk9.e;
        } else if (dkaVar.equals(bka.a)) {
            rv4Var.e0(-923285571);
            rv4Var.q(false);
        } else if (dkaVar.equals(cka.a)) {
            rv4Var.e0(-923232715);
            nid f3 = gwe.f(rv4Var);
            r13 r13Var = (r13) rv4Var.j(f99Var);
            boolean f4 = rv4Var.f(f3) | rv4Var.f(r13Var);
            Object P3 = rv4Var.P();
            if (f4 || P3 == obj) {
                P3 = new rk9(nae.e, nae.e, r13Var.L0(f3.a), r13Var.L0(f3.b));
                rv4Var.o0(P3);
            }
            rk9Var = (rk9) P3;
            rv4Var.q(false);
        } else {
            throw rs8.b(1632782137, rv4Var, false);
        }
        rv4Var.q(false);
        boolean f5 = rv4Var.f(hkaVar) | rv4Var.f(fkaVar);
        Object P4 = rv4Var.P();
        if (f5 || P4 == obj) {
            P4 = new yja(hkaVar, fkaVar, rk9Var);
            rv4Var.o0(P4);
        }
        yja yjaVar = (yja) P4;
        yjaVar.c.m(rk9Var);
        return yjaVar;
    }

    public static final void v(xt4 xt4Var, g81 g81Var) {
        String str = g81Var.a;
        if (xt4Var == null) {
            Throwable th = g81Var.b;
            Log.e("CascadeEditor", "Contained failure in " + str + ": " + th);
            return;
        }
        try {
            xt4Var.invoke(g81Var);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            Log.e("CascadeEditor", "Contained failure in " + str + "; internal-error reporter also failed: " + th2);
        }
    }

    public static final void w(CharSequence charSequence, char[] cArr, int i2, int i3, int i4) {
        if (charSequence instanceof grb) {
            w(((grb) charSequence).d, cArr, i2, i3, i4);
            return;
        }
        while (i3 < i4) {
            cArr[i2] = charSequence.charAt(i3);
            i3++;
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: CancellationException -> 0x025b, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x025b, blocks: (B:13:0x0033, B:96:0x025a, B:14:0x0038, B:77:0x01e1, B:42:0x00d7, B:49:0x011b, B:45:0x0101, B:90:0x0238), top: B:100:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121 A[Catch: all -> 0x0151, TryCatch #10 {all -> 0x0151, blocks: (B:50:0x011d, B:52:0x0121, B:58:0x0159, B:62:0x0167), top: B:113:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #10 {all -> 0x0151, blocks: (B:50:0x011d, B:52:0x0121, B:58:0x0159, B:62:0x0167), top: B:113:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191 A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b5, blocks: (B:32:0x00b0, B:67:0x0191, B:88:0x0230, B:89:0x0237), top: B:104:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0230 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #4 {all -> 0x00b5, blocks: (B:32:0x00b0, B:67:0x0191, B:88:0x0230, B:89:0x0237), top: B:104:0x00b0 }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [k0] */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r1v2, types: [lz0, m42, java.lang.Object, n42] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r4v14, types: [hi5] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v4, types: [lu4] */
    /* JADX WARN: Type inference failed for: r7v6, types: [lu4] */
    /* JADX WARN: Type inference failed for: r7v8, types: [lu4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.re5 r12, defpackage.k0 r13, defpackage.q4c r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o28.x(re5, k0, q4c, n42):java.lang.Object");
    }

    public static boolean y(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }
}
