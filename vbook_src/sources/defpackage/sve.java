package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sve  reason: default package */
/* loaded from: classes.dex */
public abstract class sve {
    public static final tu1 a = new tu1(new xu1(15), false, 1046545200);
    public static final tu1 b = new tu1(new xu1(16), false, -3324839);
    public static final tu1 c = new tu1(new xu1(17), false, 1977837240);
    public static final tu1 d = new tu1(new xu1(18), false, -335967977);
    public static final tu1 e = new tu1(new dv1(17), false, -1003952218);
    public static final tu1 f = new tu1(new dv1(18), false, 681947717);
    public static final tu1 g = new tu1(new dv1(19), false, -934249730);
    public static final tu1 h = new tu1(new dv1(20), false, 751650205);
    public static final qm1 i = qm1.F;
    public static final float j = 6.0f;
    public static final float k = 6.0f;
    public static final float l = 8.0f;
    public static final float m = 6.0f;
    public static final Object n = new Object();

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r21, float r22, float r23, float r24, defpackage.sm1 r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sve.a(float, float, float, float, sm1):long");
    }

    public static final long b(int i2) {
        long j2 = i2 << 32;
        int i3 = zl1.j;
        return j2;
    }

    public static final long c(int i2, int i3, int i4, int i5) {
        return b(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = zl1.j;
        return j3;
    }

    public static final void f(final boolean z, final boolean z2, final boolean z3, final int i2, final int i3, final int i4, final int i5, final int i6, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final xt4 xt4Var, rv4 rv4Var, final int i7, final int i8) {
        int i9;
        boolean z4;
        int i10;
        int i11;
        boolean z5;
        rv4 rv4Var2;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        rv4Var.g0(-149638748);
        if ((i7 & 6) == 0) {
            if (rv4Var.g(z)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i9 = i24 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (rv4Var.g(z2)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i9 |= i23;
        }
        if ((i7 & 384) == 0) {
            z4 = z3;
            if (rv4Var.g(z4)) {
                i22 = 256;
            } else {
                i22 = Token.CASE;
            }
            i9 |= i22;
        } else {
            z4 = z3;
        }
        int i25 = 2048;
        if ((i7 & 3072) == 0) {
            if (rv4Var.d(i2)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i9 |= i21;
        }
        int i26 = 8192;
        if ((i7 & 24576) == 0) {
            i10 = i3;
            if (rv4Var.d(i10)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i9 |= i20;
        } else {
            i10 = i3;
        }
        if ((i7 & 196608) == 0) {
            if (rv4Var.d(i4)) {
                i19 = 131072;
            } else {
                i19 = Parser.ARGC_LIMIT;
            }
            i9 |= i19;
        }
        if ((i7 & 1572864) == 0) {
            if (rv4Var.d(i5)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i9 |= i18;
        }
        if ((i7 & 12582912) == 0) {
            if (rv4Var.d(i6)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i9 |= i17;
        }
        if ((i7 & 100663296) == 0) {
            if (rv4Var.f(nq7Var)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i9 |= i16;
        }
        if ((i7 & 805306368) == 0) {
            if (rv4Var.h(vt4Var)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i9 |= i15;
        }
        if ((i8 & 6) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i8 | i14;
        } else {
            i11 = i8;
        }
        if ((i8 & 48) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i8 & 384) == 0) {
            if (rv4Var.h(vt4Var4)) {
                i12 = 256;
            } else {
                i12 = Token.CASE;
            }
            i11 |= i12;
        }
        if ((i8 & 3072) == 0) {
            if (!rv4Var.h(vt4Var5)) {
                i25 = 1024;
            }
            i11 |= i25;
        }
        if ((i8 & 24576) == 0) {
            if (rv4Var.h(xt4Var)) {
                i26 = 16384;
            }
            i11 |= i26;
        }
        int i27 = i11;
        if ((i9 & 306783379) == 306783378 && (i27 & 9363) == 9362) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (rv4Var.U(i9 & 1, z5)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            int i28 = i9;
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (!z2) {
                rv4Var.e0(449117113);
                z6 = true;
                owe.p(z, z4, 0L, null, new l95(kh5.K), vt4Var3, rv4Var, (i28 & 14) | ((i28 >> 3) & Token.ASSIGN_MOD) | ((i27 << 12) & 458752));
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                z6 = true;
                rv4Var2.e0(449346792);
                rv4Var2.q(false);
            }
            nq7 f2 = pna.f(kq7.a, 1.0f);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new clb(5);
                rv4Var2.o0(P);
            }
            eu3 a3 = g2.a(zt3.t((xt4) P));
            lz3 i29 = zt3.i(null, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new clb(6);
                rv4Var2.o0(P2);
            }
            final int i30 = i10;
            rte.e(z, f2, a3, i29.a(zt3.x((xt4) P2)), null, jce.E(-167081614, new mu4() { // from class: rlb
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v27 */
                /* JADX WARN: Type inference failed for: r2v29 */
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z7;
                    float f3;
                    float f4;
                    int i31;
                    float f5;
                    float f6;
                    boolean z8;
                    rv4 rv4Var3;
                    float f7;
                    float f8;
                    rv4 rv4Var4 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((qr) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (rv4Var4.U(intValue & 1, z7)) {
                        kq7 kq7Var = kq7.a;
                        nq7 f9 = pna.f(kq7Var, 1.0f);
                        xn1 a4 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                        int hashCode2 = Long.hashCode(rv4Var4.T);
                        xt8 l3 = rv4Var4.l();
                        nq7 p2 = lye.p(rv4Var4, f9);
                        rw1.k.getClass();
                        zx1 zx1Var2 = qw1.b;
                        rv4Var4.i0();
                        if (rv4Var4.S) {
                            rv4Var4.k(zx1Var2);
                        } else {
                            rv4Var4.r0();
                        }
                        np npVar = qw1.f;
                        jce.F(npVar, rv4Var4, a4);
                        np npVar2 = qw1.e;
                        jce.F(npVar2, rv4Var4, l3);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        np npVar3 = qw1.g;
                        jce.F(npVar3, rv4Var4, valueOf);
                        kg kgVar = qw1.h;
                        jce.C(kgVar, rv4Var4);
                        np npVar4 = qw1.d;
                        jce.F(npVar4, rv4Var4, p2);
                        nq7 f10 = pna.f(kq7Var, 1.0f);
                        tza tzaVar = j27.a;
                        vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var4.j(tzaVar)).a, 6.0f), rv4Var4, f10);
                        nq7 z9 = zbe.z(mwe.u(nmd.v(q1d.h(rv4Var4, pna.f(kq7Var, 1.0f)), zl1.b(0.95f, rm1.g(((h27) rv4Var4.j(tzaVar)).a, 4.0f)), lre.g), false, 14), 12.0f, 6.0f);
                        gv9 a5 = ev9.a(lz.a, kh5.G, rv4Var4, 48);
                        int hashCode3 = Long.hashCode(rv4Var4.T);
                        xt8 l4 = rv4Var4.l();
                        nq7 p3 = lye.p(rv4Var4, z9);
                        rv4Var4.i0();
                        if (rv4Var4.S) {
                            rv4Var4.k(zx1Var2);
                        } else {
                            rv4Var4.r0();
                        }
                        jce.F(npVar, rv4Var4, a5);
                        jce.F(npVar2, rv4Var4, l4);
                        s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
                        jce.F(npVar4, rv4Var4, p3);
                        mfb mfbVar = jk3.d;
                        eh.a(rp5.c((wk3) mfbVar.getValue(), rv4Var4, 0), null, vt4.this, null, rv4Var4, 0, 10);
                        xbe.i(rv4Var4, pna.s(kq7Var, 12.0f));
                        eh.a(rp5.c((wk3) ok3.m0.getValue(), rv4Var4, 0), null, vt4Var2, null, rv4Var4, 0, 10);
                        xbe.i(rv4Var4, pna.s(kq7Var, 12.0f));
                        int i32 = i30;
                        boolean d2 = rv4Var4.d(i32);
                        int i33 = i4;
                        boolean d3 = d2 | rv4Var4.d(i33);
                        int i34 = i5;
                        boolean d4 = d3 | rv4Var4.d(i34);
                        int i35 = i6;
                        boolean d5 = d4 | rv4Var4.d(i35);
                        Object P3 = rv4Var4.P();
                        Object obj4 = ax1.a;
                        if (d5 || P3 == obj4) {
                            float f11 = i32;
                            if (i35 > 0) {
                                f3 = (i34 + 1.0f) / i35;
                            } else {
                                f3 = 0.0f;
                            }
                            P3 = rqe.h("%.1f", Float.valueOf(((f11 + f3) * 100.0f) / i33));
                            rv4Var4.o0(P3);
                        }
                        cvb.c(yqe.B((y3b) b3b.i.getValue(), new Object[]{(String) P3}, rv4Var4), zbe.A(kq7Var, nae.e, 6.0f, 1), ((h27) rv4Var4.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(tzaVar)).b.k, rv4Var4, 48, 0, 131064);
                        xbe.i(rv4Var4, pna.s(kq7Var, 12.0f));
                        Object P4 = rv4Var4.P();
                        if (P4 == obj4) {
                            P4 = yae.z(Boolean.FALSE);
                            rv4Var4.o0(P4);
                        }
                        aw7 aw7Var = P4;
                        Object P5 = rv4Var4.P();
                        if (P5 == obj4) {
                            f4 = nae.e;
                            P5 = hl5.g(nae.e, rv4Var4);
                        } else {
                            f4 = nae.e;
                        }
                        dm8 dm8Var = P5;
                        if (((Boolean) aw7Var.getValue()).booleanValue()) {
                            f6 = dm8Var.h();
                            i31 = i32;
                            f5 = 1.0f;
                        } else {
                            i31 = i32;
                            f5 = 1.0f;
                            f6 = i31 + 1.0f;
                        }
                        float f12 = f6;
                        float f13 = f4;
                        jk1 jk1Var = new jk1(f5, i33);
                        kpa kpaVar = kpa.a;
                        gpa d6 = kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var4.j(tzaVar)).a.a), rv4Var4, 1015);
                        we6 we6Var = new we6(f5, true);
                        Object P6 = rv4Var4.P();
                        if (P6 == obj4) {
                            P6 = new wo8(aw7Var, dm8Var, 2);
                            rv4Var4.o0(P6);
                        }
                        xt4 xt4Var2 = (xt4) P6;
                        boolean d7 = rv4Var4.d(i31);
                        xt4 xt4Var3 = xt4Var;
                        boolean f14 = d7 | rv4Var4.f(xt4Var3);
                        Object P7 = rv4Var4.P();
                        if (f14 || P7 == obj4) {
                            P7 = new vo8(i31, xt4Var3, aw7Var, dm8Var);
                            rv4Var4.o0(P7);
                        }
                        dae.d(f12, xt4Var2, we6Var, false, (vt4) P7, d6, null, 0, null, null, jk1Var, rv4Var4, 48, 0, 968);
                        xbe.i(rv4Var4, pna.s(kq7Var, 12.0f));
                        int i36 = i2;
                        if (i36 != 0) {
                            z8 = true;
                            if (i36 != 1) {
                                f8 = -45.0f;
                            } else {
                                f8 = -135.0f;
                            }
                            rv4Var3 = rv4Var4;
                            f7 = f8;
                        } else {
                            z8 = true;
                            rv4Var3 = rv4Var4;
                            f7 = f13;
                        }
                        rv4 rv4Var5 = rv4Var3;
                        eh.a(rp5.c((wk3) ok3.k0.getValue(), rv4Var5, 0), tte.t(kq7Var, ((Number) nq.b(f7, null, null, rv4Var5, 0, 30).getValue()).floatValue()), vt4Var, null, rv4Var5, 0, 8);
                        xbe.i(rv4Var5, pna.s(kq7Var, 12.0f));
                        eh.a(rp5.c((wk3) mfbVar.getValue(), rv4Var5, 0), tte.t(kq7Var, 180.0f), vt4Var4, null, rv4Var5, 48, 8);
                        rv4Var5.q(z8);
                        rv4Var5.q(z8);
                    } else {
                        rv4Var4.X();
                    }
                    return pvc.a;
                }
            }, rv4Var2), rv4Var2, 1600902 | ((i28 << 3) & Token.ASSIGN_MOD), 16);
            rv4Var2.q(z6);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: slb
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(i7 | 1);
                    int p3 = xoe.p(i8);
                    sve.f(z, z2, z3, i2, i3, i4, i5, i6, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, xt4Var, (rv4) obj, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long g(float r17, float r18, float r19, float r20, defpackage.sm1 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sve.g(float, float, float, float, sm1):long");
    }

    public static final void h(int i2, int i3) {
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        cy7.k(hl5.i(i2, i3, "index (", ") is out of bound of [0, ", ")"));
    }

    public static final boolean i(fza fzaVar, int i2, d3 d3Var, boolean z) {
        boolean z2;
        synchronized (n) {
            try {
                int i3 = fzaVar.d;
                if (i3 == i2) {
                    fzaVar.c = d3Var;
                    z2 = true;
                    if (z) {
                        fzaVar.e++;
                    }
                    fzaVar.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static r0f j(List list, xt4 xt4Var, lu4 lu4Var) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) xt4Var.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) xt4Var.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        if (next != null) {
            ((Number) xt4Var.invoke(next)).intValue();
            if (!list.isEmpty()) {
                for (Object obj : list) {
                    if (((Number) xt4Var.invoke(obj)).intValue() == 0) {
                        vs.m("There should be no empty entries");
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            k(arrayList, list, 0, xt4Var, lu4Var);
            arrayList.trimToSize();
            new d00((char) 0, ks3.a, arrayList);
            return new r0f(16);
        }
        p1a.l("Unable to build char tree from an empty list");
        return null;
    }

    public static void k(ArrayList arrayList, List list, int i2, xt4 xt4Var, lu4 lu4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) lu4Var.invoke(obj, Integer.valueOf(i2));
            ch.getClass();
            Object obj2 = linkedHashMap.get(ch);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(ch, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) xt4Var.invoke(obj3)).intValue() > i3) {
                    arrayList3.add(obj3);
                }
            }
            k(arrayList2, arrayList3, i3, xt4Var, lu4Var);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (((Number) xt4Var.invoke(obj4)).intValue() == i3) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(new d00(charValue, arrayList4, arrayList2));
        }
    }

    public static final long l(long j2, long j3) {
        float f2;
        float f3;
        long a2 = zl1.a(j2, zl1.f(j3));
        float d2 = zl1.d(j3);
        float d3 = zl1.d(a2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = zl1.h(a2);
        float h3 = zl1.h(j3);
        float f6 = nae.e;
        int i2 = (f5 > nae.e ? 1 : (f5 == nae.e ? 0 : -1));
        if (i2 == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = zl1.g(a2);
        float g3 = zl1.g(j3);
        if (i2 == 0) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = zl1.e(a2);
        float e3 = zl1.e(j3);
        if (i2 != 0) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return g(f2, f3, f6, f5, zl1.f(j3));
    }

    public static Object m(mj5 mj5Var, za2 za2Var, f20 f20Var, r95 r95Var, rqd rqdVar) {
        n07 n07Var = new n07(new hl0(za2Var), 14);
        f20Var.getClass();
        Object a2 = mj5Var.a(n07Var, new uwd(f20Var, 16), r95Var.b / 10.0f, rqdVar);
        if (a2 == n82.a) {
            return a2;
        }
        return pvc.a;
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return qn3.b(edgeEffect);
        }
        return nae.e;
    }

    public static final fza o(ora oraVar) {
        fza fzaVar = oraVar.a;
        fzaVar.getClass();
        return (fza) dra.t(fzaVar, oraVar);
    }

    public static final int p(ora oraVar) {
        fza fzaVar = oraVar.a;
        fzaVar.getClass();
        return ((fza) dra.h(fzaVar)).e;
    }

    public static final long q(float f2, long j2, long j3) {
        p98 p98Var = wm1.x;
        long a2 = zl1.a(j2, p98Var);
        long a3 = zl1.a(j3, p98Var);
        float d2 = zl1.d(a2);
        float h2 = zl1.h(a2);
        float g2 = zl1.g(a2);
        float e2 = zl1.e(a2);
        float d3 = zl1.d(a3);
        float h3 = zl1.h(a3);
        float g3 = zl1.g(a3);
        float e3 = zl1.e(a3);
        if (f2 < nae.e) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return zl1.a(g(b23.o(h2, h3, f2), b23.o(g2, g3, f2), b23.o(e2, e3, f2), b23.o(d2, d3, f2), p98Var), zl1.f(j3));
    }

    public static final nt6 r(nt6 nt6Var, ri2 ri2Var) {
        int i2 = ri2Var.b;
        if (i2 != Integer.MIN_VALUE && ((int) (ri2Var.f() % 12)) != Integer.MIN_VALUE) {
            return rt6.b(nt6Var, new ri2(-((int) (ri2Var.f() / 12)), -((int) (ri2Var.f() % 12)), -i2));
        }
        qj2.Companion.getClass();
        nj2 nj2Var = qj2.c;
        nj2Var.getClass();
        nt6 a2 = rt6.a(nt6Var, -((int) (ri2Var.f() / 12)), nj2Var);
        nj2 nj2Var2 = qj2.b;
        nj2Var2.getClass();
        nt6 a3 = rt6.a(a2, -((int) (ri2Var.f() % 12)), nj2Var2);
        lj2 lj2Var = qj2.a;
        lj2Var.getClass();
        return rt6.a(a3, -i2, lj2Var);
    }

    public static final boolean s(ora oraVar, xt4 xt4Var) {
        int i2;
        d3 d3Var;
        Object invoke;
        zqa j2;
        boolean i3;
        do {
            synchronized (n) {
                fza fzaVar = oraVar.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i2 = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            ku8 e2 = d3Var.e();
            invoke = xt4Var.invoke(e2);
            d3 c2 = e2.c();
            if (c16.i(c2, d3Var)) {
                break;
            }
            fza fzaVar3 = oraVar.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j2 = dra.j();
                i3 = i((fza) dra.w(fzaVar3, oraVar, j2), i2, c2, true);
            }
            dra.n(j2, oraVar);
        } while (!i3);
        return ((Boolean) invoke).booleanValue();
    }

    public static float t(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return qn3.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final void u(eqa eqaVar, ny nyVar, int i2) {
        while (true) {
            int i3 = eqaVar.v;
            if (i2 <= i3 || i2 >= eqaVar.u) {
                if (i3 == 0 && i2 == 0) {
                    return;
                }
                eqaVar.O();
                if (eqaVar.y(eqaVar.v)) {
                    nyVar.n();
                }
                eqaVar.j();
            } else {
                return;
            }
        }
    }

    public static final tx9 v(rv4 rv4Var) {
        rv4Var.e0(1967007413);
        Object[] objArr = new Object[0];
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new zt9(6);
            rv4Var.o0(P);
        }
        tx9 tx9Var = (tx9) zpe.m(objArr, tx9.e, (vt4) P, rv4Var, 384);
        tx9Var.c = (xx9) rv4Var.j(ay9.a);
        rv4Var.q(false);
        return tx9Var;
    }

    public static final lhd w(kw5 kw5Var, rv4 rv4Var, int i2) {
        if ((i2 & 1) != 0) {
            kw5Var = null;
        }
        Object[] objArr = new Object[0];
        yy9 yy9Var = lhd.n;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new u6d(9);
            rv4Var.o0(P);
        }
        lhd lhdVar = (lhd) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
        lhdVar.k = kw5Var;
        return lhdVar;
    }

    public static final int x(long j2) {
        float[] fArr = wm1.a;
        return (int) (zl1.a(j2, wm1.e) >>> 32);
    }

    public static Object y(mj5 mj5Var, t10 t10Var, f20 f20Var, aab aabVar) {
        n07 n07Var = new n07(new hl0(t10Var), 14);
        f20Var.getClass();
        Object d2 = mj5Var.d(n07Var, new uwd(f20Var, 16), aabVar);
        if (d2 == n82.a) {
            return d2;
        }
        return pvc.a;
    }
}
