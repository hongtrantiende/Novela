package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object] */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean m;
        boolean z;
        boolean z2;
        boolean z3;
        Set<Map.Entry> entrySet;
        String a;
        tm8 tm8Var;
        ?? r2;
        boolean z4;
        String str;
        int i = this.a;
        dz dzVar = lz.b;
        jv9 jv9Var = jv9.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        String str2 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i2 = 0;
        boolean z10 = false;
        boolean z11 = false;
        pvc pvcVar = pvc.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                rk9 E = ipe.E((RectF) obj);
                rk9 E2 = ipe.E((RectF) obj2);
                switch (((p1a) obj3).a) {
                    case 15:
                        m = E.m(E2);
                        break;
                    default:
                        m = E2.a(E.f());
                        break;
                }
                return Boolean.valueOf(m);
            case 1:
                rx9 rx9Var = (rx9) obj;
                Long l = (Long) obj2;
                if (!o7a.a((n7a) obj3, l.longValue())) {
                    return null;
                }
                return l;
            case 2:
                fy0 fy0Var = (fy0) obj3;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                fy0Var.l();
                hk1 a2 = jdd.a(fy0Var);
                sw2 sw2Var = ab3.a;
                fy0Var.f(a2, ru2.c, new zx0(fy0Var, str3, str4, null, 1));
                return pvcVar;
            case 3:
                zm9 zm9Var = (zm9) obj3;
                ((Integer) obj).getClass();
                if (obj2 instanceof ew1) {
                    ew1 ew1Var = (ew1) obj2;
                    uv7 uv7Var = (uv7) zm9Var.h;
                    if (uv7Var == null) {
                        uv7 uv7Var2 = uz9.a;
                        uv7Var = new uv7();
                        zm9Var.h = uv7Var;
                    }
                    uv7Var.k(ew1Var);
                    ((gw7) zm9Var.e).b(ew1Var);
                }
                if (obj2 instanceof wv4) {
                    zm9Var.f((wv4) obj2);
                }
                if (obj2 instanceof ek9) {
                    ((ek9) obj2).c();
                }
                return pvcVar;
            case 4:
                o45 o45Var = (o45) obj3;
                String str5 = (String) obj;
                List list = (List) obj2;
                str5.getClass();
                list.getClass();
                if (!str5.equalsIgnoreCase("Content-Encoding") && !str5.equalsIgnoreCase("Content-Length")) {
                    o45Var.d(str5, list);
                }
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                ch0.j((gtb) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 6:
                wz7 wz7Var = (wz7) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 c = y7a.c(pna.b(hc2.v(pna.f(kq7Var, 1.0f), wz7Var.e), nae.e, vz7.a, 1), false, new az9(23));
                    hz hzVar = new hz(vz7.b, true, new vs(2));
                    mk0 mk0Var = kh5.G;
                    tu1 tu1Var = wz7Var.f;
                    gv9 a3 = ev9.a(hzVar, mk0Var, rv4Var, 54);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p = lye.p(rv4Var, c);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a3);
                    jce.F(qw1.e, rv4Var, l2);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    tu1Var.c(jv9Var, rv4Var, 6);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 7:
                m08 m08Var = (m08) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    nq7 u = pna.u(hc2.v(pna.c(kq7Var, 1.0f), (qid) m08Var.e), pae.k, nae.e, 2);
                    float f = l08.a;
                    nq7 c2 = y7a.c(zbe.A(u, nae.e, 4.0f, 1), false, new az9(23));
                    Object P = rv4Var2.P();
                    if (P == lh9Var) {
                        P = new bq2(5);
                        rv4Var2.o0(P);
                    }
                    nq7 c3 = y7a.c(c2, false, (xt4) P);
                    xn1 a4 = wn1.a(new hz(4.0f, true, new vs(2)), kh5.J, rv4Var2, 54);
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l3 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, c3);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a4);
                    jce.F(qw1.e, rv4Var2, l3);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p2);
                    rv4Var2.e0(-548182273);
                    rv4Var2.q(false);
                    ((tu1) m08Var.f).c(zn1.a, rv4Var2, 6);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 8:
                qma qmaVar = (qma) obj3;
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z5)) {
                    mk0 mk0Var2 = kh5.G;
                    mu4 mu4Var = qmaVar.f;
                    gv9 a5 = ev9.a(dzVar, mk0Var2, rv4Var3, 54);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l4 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var3);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, a5);
                    jce.F(qw1.e, rv4Var3, l4);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p3);
                    mu4Var.c(jv9Var, rv4Var3, 6);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 9:
                rv4 rv4Var4 = (rv4) obj;
                ((Integer) obj2).getClass();
                rv4Var4.e0(666084174);
                String str6 = ((uob) obj3).b;
                rv4Var4.q(false);
                return str6;
            case 10:
                crc crcVar = (crc) obj3;
                rv4 rv4Var5 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z11 = true;
                }
                if (rv4Var5.U(intValue4 & 1, z11)) {
                    mk0 mk0Var3 = kh5.G;
                    mu4 mu4Var2 = crcVar.j;
                    gv9 a6 = ev9.a(dzVar, mk0Var3, rv4Var5, 54);
                    int hashCode4 = Long.hashCode(rv4Var5.T);
                    xt8 l5 = rv4Var5.l();
                    nq7 p4 = lye.p(rv4Var5, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var4 = qw1.b;
                    rv4Var5.i0();
                    if (rv4Var5.S) {
                        rv4Var5.k(zx1Var4);
                    } else {
                        rv4Var5.r0();
                    }
                    jce.F(qw1.f, rv4Var5, a6);
                    jce.F(qw1.e, rv4Var5, l5);
                    jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode4));
                    jce.C(qw1.h, rv4Var5);
                    jce.F(qw1.d, rv4Var5, p4);
                    mu4Var2.c(jv9Var, rv4Var5, 6);
                    rv4Var5.q(true);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 11:
                i53 i53Var = (i53) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                List list2 = (List) obj2;
                list2.getClass();
                hk1 a7 = jdd.a(i53Var);
                sw2 sw2Var2 = ab3.a;
                i53Var.f(a7, ru2.c, new ds(i53Var, booleanValue, list2, (m42) null));
                return pvcVar;
            case 12:
                ie3 ie3Var = (ie3) obj3;
                String str7 = (String) obj;
                String str8 = (String) obj2;
                str7.getClass();
                str8.getClass();
                hk1 a8 = jdd.a(ie3Var);
                sw2 sw2Var3 = ab3.a;
                ie3Var.f(a8, ru2.c, new uw2(ie3Var, str7, str8, null, 7));
                return pvcVar;
            case 13:
                int intValue5 = ((Integer) obj).intValue();
                r14 r14Var = (r14) obj2;
                r14Var.getClass();
                String str9 = ((t14) obj3).a;
                String str10 = r14Var.e;
                if (str10.length() == 0) {
                    str10 = r14Var.a;
                }
                return str9 + "-item-" + intValue5 + "-" + ((Object) str10);
            case 14:
                i44 i44Var = (i44) obj3;
                String str11 = (String) obj;
                String str12 = (String) obj2;
                str11.getClass();
                str12.getClass();
                hk1 a9 = jdd.a(i44Var);
                sw2 sw2Var4 = ab3.a;
                i44Var.f(a9, ru2.c, new h44(i44Var, str11, str12, null, 0));
                return pvcVar;
            case 15:
                rv4 rv4Var6 = (rv4) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z3)) {
                    l0e.a.c(obj3, rv4Var6, 0);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 16:
                uia uiaVar = (uia) obj3;
                rv4 rv4Var7 = (rv4) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z10 = true;
                }
                if (rv4Var7.U(intValue7 & 1, z10)) {
                    gv9 a10 = ev9.a(lz.a, kh5.G, rv4Var7, 48);
                    int hashCode5 = Long.hashCode(rv4Var7.T);
                    xt8 l6 = rv4Var7.l();
                    nq7 p5 = lye.p(rv4Var7, kq7Var);
                    rw1.k.getClass();
                    zx1 zx1Var5 = qw1.b;
                    rv4Var7.i0();
                    if (rv4Var7.S) {
                        rv4Var7.k(zx1Var5);
                    } else {
                        rv4Var7.r0();
                    }
                    jce.F(qw1.f, rv4Var7, a10);
                    jce.F(qw1.e, rv4Var7, l6);
                    jce.F(qw1.g, rv4Var7, Integer.valueOf(hashCode5));
                    jce.C(qw1.h, rv4Var7);
                    jce.F(qw1.d, rv4Var7, p5);
                    String str13 = uiaVar.b;
                    tza tzaVar = j27.a;
                    cvb.c(str13, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var7.j(tzaVar)).b.k, rv4Var7, 0, 24576, 114686);
                    xbe.i(rv4Var7, pna.s(kq7Var, 6.0f));
                    cvb.c(String.valueOf(uiaVar.c), zbe.z(nmd.v(tte.k(kq7Var, uu9.a), rm1.g(((h27) rv4Var7.j(tzaVar)).a, 10.0f), lre.g), 6.0f, 1.0f), ((h27) rv4Var7.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var7.j(tzaVar)).b.o, rv4Var7, 0, 24576, 114680);
                    rv4Var7.q(true);
                } else {
                    rv4Var7.X();
                }
                return pvcVar;
            case 17:
                xtc xtcVar = (xtc) obj;
                xtc xtcVar2 = (xtc) obj2;
                k46 k46Var = (k46) ((d56) obj3).get("queries");
                if (k46Var != null && (entrySet = l46.g(k46Var).a.entrySet()) != null) {
                    for (Map.Entry entry : entrySet) {
                        xyc xycVar = xtcVar.j;
                        String str14 = (String) entry.getKey();
                        i56 h = l46.h((k46) entry.getValue());
                        if (h instanceof a56) {
                            a = null;
                        } else {
                            a = h.a();
                        }
                        if (a == null) {
                            a = "";
                        }
                        xycVar.h(str14, a);
                    }
                }
                return pvcVar;
            case 18:
                vh5 vh5Var = (vh5) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                vh5Var.getClass();
                return Long.valueOf(Math.max(((Number) ((j35) obj3).invoke(vh5Var, num)).longValue(), 0L));
            case 19:
                ArrayList arrayList = (ArrayList) obj3;
                int intValue8 = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue8 >= 0 && intValue8 < arrayList.size()) {
                    tm8Var = (tm8) arrayList.get(intValue8);
                } else {
                    tm8Var = null;
                }
                if (tm8Var == null || (tm8Var.b != longValue && tm8Var.a != longValue)) {
                    int size = arrayList.size();
                    while (true) {
                        if (i2 < size) {
                            r2 = arrayList.get(i2);
                            i2++;
                            tm8 tm8Var2 = (tm8) r2;
                            if (tm8Var2.j || (tm8Var2.b != longValue && tm8Var2.a != longValue)) {
                            }
                        } else {
                            r2 = 0;
                        }
                    }
                    tm8Var = r2;
                }
                if (tm8Var == null) {
                    return null;
                }
                tm8Var.j = true;
                return tm8Var.f;
            case 20:
                ur5 ur5Var = (ur5) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                List list3 = (List) obj2;
                list3.getClass();
                ur5Var.getClass();
                hk1 a11 = jdd.a(ur5Var);
                sw2 sw2Var5 = ab3.a;
                ur5Var.f(a11, ru2.c, new pz2(ur5Var, list3, booleanValue2, (m42) null, 2));
                return pvcVar;
            case 21:
                ((Integer) obj2).getClass();
                ((av5) obj3).a(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 22:
                oz5 oz5Var = (oz5) obj3;
                z09 z09Var = (z09) obj;
                y78 y78Var = (y78) obj2;
                z09Var.getClass();
                z87.v(oz5Var.a, null, null, new c95(oz5Var, z09Var, (m42) null, 10), 3);
                return pvcVar;
            case 23:
                jz jzVar = (jz) obj3;
                r13 r13Var = (r13) obj;
                x02 x02Var = (x02) obj2;
                if (x02.h(x02Var.a) == Integer.MAX_VALUE) {
                    ov5.a("LazyHorizontalGrid's height should be bound by parent.");
                }
                int h2 = x02.h(x02Var.a);
                int[] B0 = sl1.B0(ade.m(h2, 3, r13Var.X0(jzVar.b())));
                int[] iArr = new int[B0.length];
                jzVar.k(r13Var, h2, B0, iArr);
                return new jg6(B0, iArr);
            case 24:
                lj4 lj4Var = (lj4) obj3;
                rv4 rv4Var8 = (rv4) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var8.U(intValue9 & 1, z4)) {
                    lj4Var.b.invoke(rv4Var8, 0);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 25:
                z09 z09Var2 = (z09) obj;
                ((npb) obj3).e(((y78) obj2).a);
                return pvcVar;
            case 26:
                d8 d8Var = (d8) obj3;
                rv4 rv4Var9 = (rv4) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z9 = true;
                }
                if (rv4Var9.U(intValue10 & 1, z9)) {
                    boolean f2 = rv4Var9.f(d8Var);
                    Object P2 = rv4Var9.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new u76(d8Var, 8);
                        rv4Var9.o0(P2);
                    }
                    nmd.j((vt4) P2, null, false, null, null, null, twe.a, rv4Var9, 805306368, 510);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
            case 27:
                l13 l13Var = (l13) obj3;
                rv4 rv4Var10 = (rv4) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z8 = true;
                }
                if (rv4Var10.U(intValue11 & 1, z8)) {
                    boolean f3 = rv4Var10.f(l13Var);
                    Object P3 = rv4Var10.P();
                    if (f3 || P3 == lh9Var) {
                        v7 v7Var = new v7(0, l13Var, l13.class, "hide", "hide()V", 0, 28);
                        rv4Var10.o0(v7Var);
                        P3 = v7Var;
                    }
                    nmd.j((vt4) ((i76) P3), null, false, null, null, null, p17.b, rv4Var10, 805306368, 510);
                } else {
                    rv4Var10.X();
                }
                return pvcVar;
            case 28:
                g13 g13Var = (g13) obj3;
                rv4 rv4Var11 = (rv4) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z7 = true;
                }
                if (rv4Var11.U(intValue12 & 1, z7)) {
                    boolean f4 = rv4Var11.f(g13Var);
                    Object P4 = rv4Var11.P();
                    if (f4 || P4 == lh9Var) {
                        v7 v7Var2 = new v7(0, g13Var, g13.class, "hide", "hide()V", 0, 29);
                        rv4Var11.o0(v7Var2);
                        P4 = v7Var2;
                    }
                    nmd.j((vt4) ((i76) P4), null, false, null, null, null, zxe.b, rv4Var11, 805306368, 510);
                } else {
                    rv4Var11.X();
                }
                return pvcVar;
            default:
                pc9 pc9Var = (pc9) obj3;
                rv4 rv4Var12 = (rv4) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z6 = true;
                }
                if (rv4Var12.U(intValue13 & 1, z6)) {
                    if (pc9Var != null) {
                        str2 = pc9Var.a;
                    }
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var12, 0, 0, 262142);
                } else {
                    rv4Var12.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ sj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ sj(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
