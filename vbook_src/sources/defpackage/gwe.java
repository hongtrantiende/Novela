package defpackage;

import android.app.Activity;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gwe  reason: default package */
/* loaded from: classes3.dex */
public abstract class gwe {
    public static final tu1 a = new tu1(new ev1(14), false, 1247030327);
    public static final tu1 b = new tu1(new dv1(23), false, 886427319);
    public static final tu1 c = new tu1(new ev1(15), false, 265981600);
    public static final tu1 d = new tu1(new dv1(24), false, 1618841888);
    public static final tu1 e = new tu1(new ev1(16), false, -622055937);
    public static final tu1 f = new tu1(new dv1(25), false, 730804351);
    public static final tu1 g = new tu1(new ev1(17), false, -1510093474);
    public static final tu1 h = new tu1(new dv1(26), false, -157233186);
    public static final tu1 i = new tu1(new ev1(18), false, 1896836285);
    public static final tu1 j = new tu1(new dv1(27), false, -1045270723);
    public static final j9a k = new j9a(0);
    public static final pg2 l = new pg2(27);
    public static ar5 m;

    public static final void a(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        boolean z;
        vt4 vt4Var3;
        vt4 vt4Var4;
        rv4Var.g0(-2107235895);
        if (rv4Var.f(ar5Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i11 = i10 | i6;
        int i12 = i3 & 8;
        if (i12 != 0) {
            i8 = i11 | 3072;
            obj = vt4Var2;
        } else {
            obj = vt4Var2;
            if (rv4Var.h(obj)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i8 = i11 | i7;
        }
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            if (i12 != 0) {
                Object P = rv4Var.P();
                if (P == ax1.a) {
                    P = new cd1(15);
                    rv4Var.o0(P);
                }
                vt4Var4 = (vt4) P;
            } else {
                vt4Var4 = obj;
            }
            nk5.a(ar5Var, null, zbe.y(lbe.h(tte.k(pna.h(nq7Var, 44.0f), uu9.a), vt4Var4, vt4Var), 8.0f), ((h27) rv4Var.j(j27.a)).a.q, rv4Var, (i8 & 14) | 48, 0);
            vt4Var3 = vt4Var4;
        } else {
            rv4Var.X();
            vt4Var3 = obj;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(ar5Var, nq7Var, vt4Var, vt4Var3, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.nq7 r36, boolean r37, float r38, boolean r39, defpackage.rv4 r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.b(nq7, boolean, float, boolean, rv4, int, int):void");
    }

    public static final void c(final boolean z, final boolean z2, final boolean z3, final int i2, final String str, final int i3, final int i4, final int i5, final int i6, final boolean z4, final nq7 nq7Var, final xt4 xt4Var, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final vt4 vt4Var9, final vt4 vt4Var10, rv4 rv4Var, final int i7, final int i8, final int i9) {
        int i10;
        boolean z5;
        Object obj;
        int i11;
        int i12;
        boolean z6;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        vt4Var7.getClass();
        vt4Var8.getClass();
        vt4Var9.getClass();
        vt4Var10.getClass();
        rv4Var.g0(30497346);
        if ((i7 & 6) == 0) {
            i10 = (rv4Var.g(z) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= rv4Var.g(z2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            z5 = z3;
            i10 |= rv4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z3;
        }
        if ((i7 & 3072) == 0) {
            i10 |= rv4Var.d(i2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            obj = str;
            i10 |= rv4Var.f(obj) ? 16384 : 8192;
        } else {
            obj = str;
        }
        int i13 = i7 & 196608;
        int i14 = Parser.ARGC_LIMIT;
        if (i13 == 0) {
            i10 |= rv4Var.d(i3) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i10 |= rv4Var.d(i4) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i10 |= rv4Var.d(i5) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i10 |= rv4Var.d(i6) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i10 |= rv4Var.g(z4) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i11 = i8 | (rv4Var.f(nq7Var) ? 4 : 2);
        } else {
            i11 = i8;
        }
        if ((i8 & 48) == 0) {
            i11 |= rv4Var.h(xt4Var) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i11 |= rv4Var.h(vt4Var) ? 256 : Token.CASE;
        }
        if ((i8 & 3072) == 0) {
            i11 |= rv4Var.h(vt4Var2) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i11 |= rv4Var.h(xt4Var2) ? 16384 : 8192;
        }
        if ((i8 & 196608) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i14 = 131072;
            }
            i11 |= i14;
        }
        if ((i8 & 1572864) == 0) {
            i11 |= rv4Var.h(vt4Var4) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i11 |= rv4Var.h(vt4Var5) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i11 |= rv4Var.h(vt4Var6) ? 67108864 : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i11 |= rv4Var.h(vt4Var7) ? 536870912 : 268435456;
        }
        if ((i9 & 6) == 0) {
            i12 = i9 | (rv4Var.h(vt4Var8) ? 4 : 2);
        } else {
            i12 = i9;
        }
        if ((i9 & 48) == 0) {
            i12 |= rv4Var.h(vt4Var9) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i12 |= rv4Var.h(vt4Var10) ? 256 : Token.CASE;
        }
        int i15 = i12;
        if (rv4Var.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i15 & Token.EXPR_VOID) == 146) ? false : true)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
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
                rv4Var.e0(-1154864165);
                z6 = true;
                owe.p(z, z5, 0L, null, new l95(kh5.K), vt4Var10, rv4Var, (i10 & 14) | ((i10 >> 3) & Token.ASSIGN_MOD) | (458752 & (i15 << 9)));
                rv4Var.q(false);
            } else {
                z6 = true;
                rv4Var.e0(-1154634486);
                rv4Var.q(false);
            }
            nq7 f2 = pna.f(kq7.a, 1.0f);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new clb(8);
                rv4Var.o0(P);
            }
            eu3 a3 = g2.a(zt3.t((xt4) P));
            lz3 i16 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new clb(9);
                rv4Var.o0(P2);
            }
            final String str2 = obj;
            rte.e(z, f2, a3, i16.a(zt3.x((xt4) P2)), null, jce.E(1143408272, new mu4() { // from class: zmb
                /* JADX WARN: Code restructure failed: missing block: B:111:0x06ac, code lost:
                    if (r8 == r6) goto L108;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0665  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x066d  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x06aa  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x06af  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x06d2  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x06dc  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x0735  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0739  */
                /* JADX WARN: Type inference failed for: r14v19 */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v11 */
                @Override // defpackage.mu4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r76, java.lang.Object r77, java.lang.Object r78) {
                    /*
                        Method dump skipped, instructions count: 2028
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zmb.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, rv4Var), rv4Var, 1600902 | ((i10 << 3) & Token.ASSIGN_MOD), 16);
            rv4Var.q(z6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: anb
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p2 = xoe.p(i7 | 1);
                    int p3 = xoe.p(i8);
                    int p4 = xoe.p(i9);
                    gwe.c(z, z2, z3, i2, str, i3, i4, i5, i6, z4, nq7Var, xt4Var, vt4Var, vt4Var2, xt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, (rv4) obj2, p2, p3, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(uo3 uo3Var, no3 no3Var, ym0 ym0Var, wm0 wm0Var) {
        cm0 cm0Var;
        uo3Var.getClass();
        no3Var.getClass();
        ym0Var.getClass();
        wm0Var.getClass();
        so3 u = u(no3Var);
        List<xl0> list = no3Var.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xl0 xl0Var : list) {
            linkedHashSet.add(new pm0(xl0Var.a));
        }
        ym0Var.a(linkedHashSet);
        wm0Var.d(linkedHashSet);
        for (xl0 xl0Var2 : list) {
            dm0 dm0Var = xl0Var2.c;
            String str = xl0Var2.a;
            if (dm0Var instanceof cm0) {
                cm0Var = (cm0) dm0Var;
            } else {
                cm0Var = null;
            }
            if (cm0Var != null) {
                String str2 = cm0Var.a;
                List list2 = cm0Var.b;
                if (ym0Var.b(str) != null) {
                    if (!c16.i(ym0Var.e(str), str2)) {
                        ym0Var.h(str, str2, null);
                    }
                } else {
                    ym0.c(ym0Var, str, str2);
                }
                if (wm0Var.f(str) != null) {
                    if (!wm0Var.i(str).equals(list2)) {
                        wm0Var.l(str2.length(), str, list2);
                    }
                } else {
                    wm0Var.g(str2.length(), str, list2);
                }
            }
        }
        uo3Var.g(u, false);
        kwe.M(no3Var.b, uo3Var.e(), ym0Var, wm0Var);
    }

    public static ArrayList e(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final nid f(rv4 rv4Var) {
        nkd nkdVar;
        nid nidVar;
        rv4Var.e0(1744179571);
        Activity activity = (Activity) rv4Var.j(at6.a);
        if (activity == null) {
            nidVar = new nid(nae.e, nae.e);
        } else {
            rv4Var.j(gh.a);
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            lkd.a.getClass();
            mkd mkdVar = kkd.b;
            mkdVar.getClass();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                nkdVar = t13.b;
            } else if (i2 >= 30) {
                nkdVar = zt0.b;
            } else {
                nkdVar = lh9.J;
            }
            long Q = r13Var.Q(ipe.D(nkdVar.c(activity, mkdVar.b).a()).h());
            nidVar = new nid(ug3.b(Q), ug3.a(Q));
        }
        rv4Var.q(false);
        return nidVar;
    }

    public static final no3 g(uo3 uo3Var, ym0 ym0Var, wm0 wm0Var) {
        boolean z;
        String str;
        uo3Var.getClass();
        ym0Var.getClass();
        wm0Var.getClass();
        List<xl0> list = uo3Var.e().a;
        list.getClass();
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (xl0 xl0Var : list) {
            dm0 dm0Var = xl0Var.c;
            String str2 = xl0Var.a;
            if (dm0Var instanceof cm0) {
                boolean z2 = false;
                if (ym0Var.b(str2) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (wm0Var.f(str2) != null) {
                    z2 = true;
                }
                boolean b2 = xl0Var.b.b();
                List list2 = ks3.a;
                if (!z && !z2) {
                    if (!b2) {
                        cm0 cm0Var = (cm0) dm0Var;
                        if (!cm0Var.b.isEmpty()) {
                            xl0Var = xl0.a(xl0Var, null, cm0.a(cm0Var, list2), null, 11);
                        }
                    }
                } else {
                    if (z) {
                        str = ym0Var.e(str2);
                        if (str == null) {
                            str = ((cm0) dm0Var).a;
                        }
                    } else {
                        str = ((cm0) dm0Var).a;
                    }
                    if (b2) {
                        if (z2) {
                            list2 = wm0Var.i(str2);
                        } else {
                            list2 = ((cm0) dm0Var).b;
                        }
                    }
                    cm0 cm0Var2 = new cm0(str, list2);
                    if (!cm0Var2.equals(dm0Var)) {
                        xl0Var = xl0.a(xl0Var, null, cm0Var2, null, 11);
                    }
                }
            }
            arrayList.add(xl0Var);
        }
        no3 no3Var = new no3(kwe.B(uo3Var.e(), ym0Var, wm0Var), arrayList);
        t(no3Var);
        return no3Var;
    }

    public static final jj h(int i2, long j2, c33 c33Var) {
        double d2;
        double d3;
        int i3 = 0;
        jj d4 = twe.d(i2, i2, 0, 28);
        sf a2 = zbe.a(d4);
        ljc c2 = lre.c();
        c2.p(j2);
        c2.u(1);
        float f2 = i2;
        float f3 = f2 / 2.0f;
        float f4 = f2 / 2.2f;
        int ordinal = c33Var.ordinal();
        float f5 = 20.0f;
        float f6 = 0.017453292f;
        float f7 = 60.0f;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    c2.w(f2 / 20.0f);
                    int i4 = 0;
                    for (int i5 = 6; i4 < i5; i5 = 6) {
                        a2.s((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits((((float) Math.sin(d3)) * f4) + f3) & 4294967295L) | (Float.floatToRawIntBits((((float) Math.cos((i4 * 60.0f) * 0.017453292f)) * f4) + f3) << 32), c2);
                        i4++;
                    }
                    c2.x(0);
                    a2.n(f2 / 15.0f, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), c2);
                    return d4;
                }
                xk5.o();
                return null;
            }
            float f8 = f4 * 0.25f;
            int i6 = 0;
            for (int i7 = 6; i6 < i7; i7 = 6) {
                float f9 = i6 * f7 * f6;
                double d5 = f9;
                float f10 = f6;
                c2.w(f2 / 18.0f);
                int i8 = i6;
                a2 = a2;
                a2.s((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (Float.floatToRawIntBits((((float) Math.cos(d5)) * f4) + f3) << 32) | (Float.floatToRawIntBits((((float) Math.sin(d5)) * f4) + f3) & 4294967295L), c2);
                c2.w(f2 / 30.0f);
                float cos = (((float) Math.cos(d5)) * f4 * 0.5f) + f3;
                float sin = (((float) Math.sin(d5)) * f4 * 0.5f) + f3;
                double d6 = f9 - 1.0471976f;
                float f11 = f2;
                a2.s((Float.floatToRawIntBits(sin) & 4294967295L) | (Float.floatToRawIntBits(cos) << 32), (Float.floatToRawIntBits((((float) Math.sin(d6)) * f8) + sin) & 4294967295L) | (Float.floatToRawIntBits((((float) Math.cos(d6)) * f8) + cos) << 32), c2);
                double d7 = f9 + 1.0471976f;
                a2.s((Float.floatToRawIntBits(cos) << 32) | (Float.floatToRawIntBits(sin) & 4294967295L), (Float.floatToRawIntBits((((float) Math.sin(d7)) * f8) + sin) & 4294967295L) | (Float.floatToRawIntBits((((float) Math.cos(d7)) * f8) + cos) << 32), c2);
                i6 = i8 + 1;
                f6 = f10;
                f7 = f7;
                f2 = f11;
                d4 = d4;
                i3 = 0;
            }
            jj jjVar = d4;
            c2.x(i3);
            a2.n(f2 / 12.0f, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), c2);
            return jjVar;
        }
        float f12 = 0.4f * f4;
        int i9 = 0;
        while (i9 < 6) {
            float f13 = i9 * 60.0f * 0.017453292f;
            double d8 = f13;
            float cos2 = (((float) Math.cos(d8)) * f4) + f3;
            float sin2 = (((float) Math.sin(d8)) * f4) + f3;
            c2.w(f2 / 15.0f);
            float f14 = f5;
            float f15 = f3;
            a2.s((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(cos2) << 32) | (Float.floatToRawIntBits(sin2) & 4294967295L), c2);
            c2.w(f2 / 25.0f);
            int i10 = 1;
            while (i10 < 3) {
                float f16 = i10 / 3.0f;
                float cos3 = (((float) Math.cos(d8)) * f4 * f16) + f15;
                float sin3 = (((float) Math.sin(d8)) * f4 * f16) + f15;
                double d9 = f13 - 0.7853982f;
                float f17 = f12;
                a2.s((Float.floatToRawIntBits(cos3) << 32) | (Float.floatToRawIntBits(sin3) & 4294967295L), (Float.floatToRawIntBits((((float) Math.cos(d9)) * f12) + cos3) << 32) | (Float.floatToRawIntBits((((float) Math.sin(d9)) * f12) + sin3) & 4294967295L), c2);
                float sin4 = (((float) Math.sin(f13 + 0.7853982f)) * f17) + sin3;
                a2.s((Float.floatToRawIntBits(sin3) & 4294967295L) | (Float.floatToRawIntBits(cos3) << 32), (Float.floatToRawIntBits(sin4) & 4294967295L) | (Float.floatToRawIntBits((((float) Math.cos(d2)) * f17) + cos3) << 32), c2);
                i10++;
                f12 = f17;
                i9 = i9;
            }
            c2.x(0);
            a2.n(f2 / f14, (Float.floatToRawIntBits(cos2) << 32) | (Float.floatToRawIntBits(sin2) & 4294967295L), c2);
            c2.x(1);
            i9++;
            f5 = f14;
            f3 = f15;
            f12 = f12;
        }
        float f18 = f3;
        c2.x(0);
        float f19 = f2 / 8.0f;
        yj a3 = dk.a();
        for (int i11 = 0; i11 < 6; i11++) {
            double d10 = i11 * 60.0f * 0.017453292f;
            float cos4 = (((float) Math.cos(d10)) * f19) + f18;
            float sin5 = (((float) Math.sin(d10)) * f19) + f18;
            if (i11 == 0) {
                a3.i(cos4, sin5);
            } else {
                a3.h(cos4, sin5);
            }
        }
        a3.e();
        a2.b(a3, c2);
        return d4;
    }

    public static final qb3 i(sj4 sj4Var, xt4 xt4Var, lu4 lu4Var) {
        if (sj4Var instanceof qb3) {
            qb3 qb3Var = (qb3) sj4Var;
            if (qb3Var.b == xt4Var && qb3Var.c == lu4Var) {
                return qb3Var;
            }
        }
        return new qb3(sj4Var, xt4Var, lu4Var);
    }

    public static long j(byte b2, byte b3) {
        int i2;
        int i3;
        int i4 = b2 & 255;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = 2500 << i7;
        } else if (i6 >= 12) {
            i3 = 10000 << (i6 & 1);
        } else if (i7 == 3) {
            i3 = 60000;
        } else {
            i3 = 10000 << i7;
        }
        return i2 * i3;
    }

    public static final boolean k(pw6 pw6Var) {
        pw6Var.getClass();
        return pw6Var.e();
    }

    public static final void l(String str) {
        str.getClass();
        throw new IllegalArgumentException(hl5.n("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static int m(int i2) {
        float f2 = (((i2 >> 16) & 255) * 0.5f) + nae.e;
        float f3 = (((i2 >> 8) & 255) * 0.5f) + nae.e;
        return ((int) (((i2 & 255) * 0.5f) + nae.e)) | (((int) (((i2 >>> 24) * 0.5f) + 127.5f)) << 24) | (((int) f2) << 16) | (((int) f3) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable n(defpackage.t00 r5, int r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.z10
            if (r0 == 0) goto L13
            r0 = r7
            z10 r0 = (defpackage.z10) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            z10 r0 = new z10
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            byte[] r5 = r0.a
            defpackage.hre.r(r7)
            goto L44
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.hre.r(r7)
            byte[] r7 = new byte[r6]
            r0.a = r7
            r0.c = r2
            r1 = 0
            java.lang.Object r5 = r5.g(r7, r1, r6, r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L41
            return r6
        L41:
            r4 = r7
            r7 = r5
            r5 = r4
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            if (r6 > 0) goto L4f
            byte[] r5 = defpackage.axe.c
            return r5
        L4f:
            byte[] r5 = java.util.Arrays.copyOf(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.n(t00, int, n42):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.v20 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.a20
            if (r0 == 0) goto L13
            r0 = r6
            a20 r0 = (defpackage.a20) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            a20 r0 = new a20
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            int r5 = r0.a
            byte[] r0 = r0.b
            defpackage.hre.r(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L31:
            defpackage.hre.r(r6)
            r6 = 4
            byte[] r1 = new byte[r6]
            r0.b = r1
            r0.a = r6
            r0.d = r4
            java.lang.Object r5 = r5.g(r1, r3, r6, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r1
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L76
            r0.getClass()
            r5 = 3
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 2
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            r6 = r0[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r5 = r5 | r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L76:
            defpackage.vs.g(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.o(v20, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.v20 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.b20
            if (r0 == 0) goto L13
            r0 = r6
            b20 r0 = (defpackage.b20) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            b20 r0 = new b20
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            int r5 = r0.a
            byte[] r0 = r0.b
            defpackage.hre.r(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L31:
            defpackage.hre.r(r6)
            r6 = 4
            byte[] r1 = new byte[r6]
            r0.b = r1
            r0.a = r6
            r0.d = r4
            java.lang.Object r5 = r5.g(r1, r3, r6, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r1
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L76
            r0.getClass()
            r5 = r0[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            r6 = 2
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            r6 = 3
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r5 = r5 | r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L76:
            defpackage.vs.g(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.p(v20, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.v20 r4, int r5, defpackage.rqe r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.c20
            if (r0 == 0) goto L13
            r0 = r7
            c20 r0 = (defpackage.c20) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            c20 r0 = new c20
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rqe r6 = r0.a
            defpackage.hre.r(r7)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r7)
            r0.a = r6
            r0.c = r2
            java.io.Serializable r7 = defpackage.xpe.j(r4, r5, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            byte[] r7 = (byte[]) r7
            java.lang.String r4 = defpackage.xc1.b(r7, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.q(v20, int, rqe, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.v20 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.d20
            if (r0 == 0) goto L13
            r0 = r6
            d20 r0 = (defpackage.d20) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d20 r0 = new d20
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            int r5 = r0.a
            byte[] r0 = r0.b
            defpackage.hre.r(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L31:
            defpackage.hre.r(r6)
            r6 = 2
            byte[] r1 = new byte[r6]
            r0.b = r1
            r0.a = r6
            r0.d = r4
            java.lang.Object r5 = r5.g(r1, r3, r6, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r1
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L66
            r0.getClass()
            r5 = r0[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L66:
            defpackage.vs.g(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwe.r(v20, n42):java.lang.Object");
    }

    public static final Set s(lo3 lo3Var, List list) {
        lo3Var.getClass();
        list.getClass();
        if (lo3Var.a != null) {
            return rs3.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new pm0(((xl0) it.next()).a));
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : lo3Var.d) {
            if (linkedHashSet.contains(new pm0(((pm0) obj).a))) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static final void t(no3 no3Var) {
        hn0 hn0Var;
        no3Var.getClass();
        xl0 xl0Var = (xl0) sl1.k0(no3Var.a);
        if (xl0Var != null && (hn0Var = xl0Var.b) != null && hn0Var.d()) {
            return;
        }
        vs.m("History checkpoints must be normalized and end with a text-supporting block");
    }

    public static final so3 u(no3 no3Var) {
        no3Var.getClass();
        t(no3Var);
        int i2 = so3.f;
        List list = no3Var.a;
        so3 v = twe.v(list);
        lo3 lo3Var = no3Var.b;
        return so3.a(v, null, lo3Var.a, s(lo3Var, list), null, null, 25);
    }
}
