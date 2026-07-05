package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dxe  reason: default package */
/* loaded from: classes.dex */
public abstract class dxe {
    public static final tu1 a = new tu1(new iv1(9), false, 840965798);
    public static final tu1 b = new tu1(new iv1(10), false, -1284130199);
    public static final tu1 c = new tu1(new ev1(29), false, -1976898579);
    public static final tu1 d = new tu1(new jv1(0), false, 426552497);
    public static final tu1 e = new tu1(new jv1(1), false, 251430195);
    public static final tu1 f = new tu1(new jv1(2), false, 761412570);
    public static final tu1 g = new tu1(new jv1(3), false, -27395108);

    public static yk8 A(float f2, int i, int i2, long j, zi8 zi8Var, r13 r13Var) {
        yk8 yk8Var;
        int ordinal = zi8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (i > 0 && i2 > 0 && r13Var != null) {
                            float f3 = i;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f3;
                            float L0 = r13Var.L0(40.0f) / 50.0f;
                            if (intBitsToFloat < L0) {
                                intBitsToFloat = L0;
                            }
                            if (intBitsToFloat > 5.0f) {
                                intBitsToFloat = 5.0f;
                            }
                            yk8Var = new yk8(Float.valueOf(f3 * intBitsToFloat), Float.valueOf(i2 * intBitsToFloat));
                        } else {
                            return A(f2, i, i2, j, zi8.b, r13Var);
                        }
                    } else {
                        xk5.o();
                        return null;
                    }
                } else {
                    int i3 = (int) (j & 4294967295L);
                    yk8Var = new yk8(Float.valueOf(Float.intBitsToFloat(i3) / f2), Float.valueOf(Float.intBitsToFloat(i3)));
                }
            } else {
                int i4 = (int) (j >> 32);
                yk8Var = new yk8(Float.valueOf(Float.intBitsToFloat(i4)), Float.valueOf(Float.intBitsToFloat(i4) * f2));
            }
        } else {
            int i5 = (int) (j >> 32);
            float intBitsToFloat2 = Float.intBitsToFloat(i5) * f2;
            float intBitsToFloat3 = Float.intBitsToFloat(i5);
            int i6 = (int) (j & 4294967295L);
            if (intBitsToFloat2 > Float.intBitsToFloat(i6)) {
                float intBitsToFloat4 = Float.intBitsToFloat(i6) / intBitsToFloat2;
                intBitsToFloat2 *= intBitsToFloat4;
                intBitsToFloat3 *= intBitsToFloat4;
            }
            if (intBitsToFloat3 > Float.intBitsToFloat(i5)) {
                float intBitsToFloat5 = Float.intBitsToFloat(i5) / intBitsToFloat3;
                intBitsToFloat3 *= intBitsToFloat5;
                intBitsToFloat2 *= intBitsToFloat5;
            }
            yk8Var = new yk8(Float.valueOf(intBitsToFloat3), Float.valueOf(intBitsToFloat2));
        }
        float floatValue = ((Number) yk8Var.a).floatValue();
        float floatValue2 = ((Number) yk8Var.b).floatValue();
        float max = Math.max(floatValue, floatValue2);
        float min = Math.min(floatValue, floatValue2);
        if (max <= 32766.0f && min <= 32766.0f) {
            return new yk8(Float.valueOf(floatValue), Float.valueOf(floatValue2));
        }
        yk8[] yk8VarArr = {new yk8(Float.valueOf(262142.0f), Float.valueOf(8190.0f)), new yk8(Float.valueOf(65534.0f), Float.valueOf(32766.0f))};
        float f4 = nae.e;
        for (int i7 = 0; i7 < 2; i7++) {
            yk8 yk8Var2 = yk8VarArr[i7];
            float min2 = Math.min(((Number) yk8Var2.a).floatValue() / max, Math.min(((Number) yk8Var2.b).floatValue() / min, 1.0f));
            if (min2 > f4) {
                f4 = min2;
            }
        }
        return new yk8(Float.valueOf(floatValue * f4), Float.valueOf(floatValue2 * f4));
    }

    public static final void B(rm0 rm0Var, final boolean z, final xt4 xt4Var) {
        xt4Var.getClass();
        em0 em0Var = new em0("image", "Image", "Inline image", tl1.B("image", "photo", "picture"), null, n8.K, 48);
        ib6 ib6Var = new ib6(new tu1(new qu4() { // from class: wr1
            @Override // defpackage.qu4
            public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Number number) {
                int i;
                boolean z2;
                am0 am0Var;
                Object obj7;
                String str;
                int i2;
                Object obj8;
                Object obj9;
                Integer num;
                Object obj10;
                Integer num2;
                boolean z3;
                kq7 kq7Var;
                float f2;
                nq7 f3;
                boolean z4;
                nq7 nq7Var;
                u22 u22Var;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean h;
                int i3;
                int i4;
                int i5;
                ba5 ba5Var = lre.g;
                xl0 xl0Var = (xl0) obj;
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                nq7 nq7Var2 = (nq7) obj4;
                zl0 zl0Var = (zl0) obj5;
                rv4 rv4Var = (rv4) obj6;
                int intValue = ((Integer) number).intValue();
                xl0Var.getClass();
                nq7Var2.getClass();
                zl0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(xl0Var)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    i = i5 | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 3072) == 0) {
                    if (rv4Var.f(nq7Var2)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i |= i4;
                }
                if ((intValue & 24576) == 0) {
                    if ((intValue & 32768) == 0) {
                        h = rv4Var.f(zl0Var);
                    } else {
                        h = rv4Var.h(zl0Var);
                    }
                    if (h) {
                        i3 = 16384;
                    } else {
                        i3 = 8192;
                    }
                    i |= i3;
                }
                if ((74755 & i) != 74754) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(i & 1, z2)) {
                    dm0 dm0Var = xl0Var.c;
                    if (dm0Var instanceof am0) {
                        am0Var = (am0) dm0Var;
                    } else {
                        am0Var = null;
                    }
                    if (am0Var != null) {
                        obj7 = am0Var.b.get("url");
                    } else {
                        obj7 = null;
                    }
                    if (obj7 instanceof String) {
                        str = (String) obj7;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        if (am0Var != null) {
                            i2 = 32768;
                            obj8 = am0Var.b.get("file");
                        } else {
                            i2 = 32768;
                            obj8 = null;
                        }
                    } else {
                        i2 = 32768;
                        obj8 = str;
                    }
                    if (am0Var != null) {
                        obj9 = am0Var.b.get("width");
                    } else {
                        obj9 = null;
                    }
                    if (obj9 instanceof Integer) {
                        num = (Integer) obj9;
                    } else {
                        num = null;
                    }
                    num = (num == null || num.intValue() <= 0) ? null : null;
                    if (am0Var != null) {
                        obj10 = am0Var.b.get("height");
                    } else {
                        obj10 = null;
                    }
                    if (obj10 instanceof Integer) {
                        num2 = (Integer) obj10;
                    } else {
                        num2 = null;
                    }
                    num2 = (num2 == null || num2.intValue() <= 0) ? null : null;
                    if (obj8 != null) {
                        rv4Var.e0(809741476);
                        if (num != null && num2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        kq7 kq7Var2 = kq7.a;
                        if (z3) {
                            rv4Var.e0(810127364);
                            nq7 t = jsc.t(num.intValue() / num2.intValue(), pna.u(pna.f(kq7Var2, 1.0f), nae.e, num.intValue(), 1), false);
                            tza tzaVar = j27.a;
                            kq7Var = kq7Var2;
                            nq7 v = nmd.v(tte.k(t, ((h27) rv4Var.j(tzaVar)).c.b), zl1.b(0.06f, ((h27) rv4Var.j(tzaVar)).a.q), ba5Var);
                            rv4Var.q(false);
                            f3 = v;
                            f2 = 1.0f;
                        } else {
                            kq7Var = kq7Var2;
                            rv4Var.e0(810649404);
                            rv4Var.q(false);
                            f2 = 1.0f;
                            f3 = pna.f(kq7Var, 1.0f);
                        }
                        nq7 A = zbe.A(pna.f(nq7Var2, f2), nae.e, 4.0f, 1);
                        boolean z8 = z;
                        lh9 lh9Var = ax1.a;
                        if (!z8 && str != null) {
                            rv4Var.e0(810952243);
                            xt4 xt4Var2 = xt4Var;
                            boolean f4 = rv4Var.f(xt4Var2) | rv4Var.f(str);
                            Object P = rv4Var.P();
                            if (!f4 && P != lh9Var) {
                                z4 = false;
                            } else {
                                z4 = false;
                                P = new xr1(0, xt4Var2, str);
                                rv4Var.o0(P);
                            }
                            nq7Var = lbe.f(15, (vt4) P, kq7Var, null, z4);
                            rv4Var.q(z4);
                        } else {
                            z4 = false;
                            rv4Var.e0(811060371);
                            rv4Var.q(false);
                            nq7Var = kq7Var;
                        }
                        nq7 a0 = A.a0(nq7Var);
                        b37 d2 = fu0.d(kh5.a, z4);
                        int i6 = i;
                        int hashCode = Long.hashCode(rv4Var.T);
                        xt8 l = rv4Var.l();
                        nq7 p = lye.p(rv4Var, a0);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var.i0();
                        if (rv4Var.S) {
                            rv4Var.k(zx1Var);
                        } else {
                            rv4Var.r0();
                        }
                        jce.F(qw1.f, rv4Var, d2);
                        jce.F(qw1.e, rv4Var, l);
                        jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var);
                        jce.F(qw1.d, rv4Var, p);
                        io5 io5Var = (io5) rv4Var.j(do5.a);
                        if (z3) {
                            u22Var = r0f.d;
                        } else {
                            u22Var = r0f.D;
                        }
                        xve.b(obj8, io5Var, f3, u22Var, rv4Var, 1572912, 3888);
                        if (z8) {
                            rv4Var.e0(774362891);
                            ar5 c2 = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
                            tza tzaVar2 = j27.a;
                            long j = ((h27) rv4Var.j(tzaVar2)).a.q;
                            nq7 v2 = nmd.v(tte.k(pna.n(zbe.y(pu0.a.a(kq7Var, kh5.c), 8.0f), 28.0f), uu9.a), zl1.b(0.9f, ((h27) rv4Var.j(tzaVar2)).a.p), ba5Var);
                            if ((57344 & i6) != 16384 && ((i6 & i2) == 0 || !rv4Var.h(zl0Var))) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if ((i6 & 14) == 4) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            boolean z9 = z6 | z7;
                            Object P2 = rv4Var.P();
                            if (z9 || P2 == lh9Var) {
                                P2 = new t7(21, zl0Var, xl0Var);
                                rv4Var.o0(P2);
                            }
                            z5 = false;
                            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P2, v2, null, false), 5.0f), j, rv4Var, 48, 0);
                            rv4Var.q(false);
                        } else {
                            z5 = false;
                            rv4Var.e0(775075674);
                            rv4Var.q(false);
                        }
                        rv4Var.q(true);
                        rv4Var.q(z5);
                    } else {
                        rv4Var.e0(812592763);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvc.a;
            }
        }, true, -1290149817));
        rm0Var.a.put("image", em0Var);
        rm0Var.b.put("image", ib6Var);
    }

    public static final xl0 C(xl0 xl0Var, String str) {
        xl0Var.getClass();
        str.getClass();
        Map singletonMap = Collections.singletonMap("url", str);
        singletonMap.getClass();
        return xl0.a(xl0Var, null, new am0(singletonMap, "image"), null, 11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x03cd, code lost:
        if (r37 != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0418, code lost:
        if (r37 != false) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.CharSequence r41, final defpackage.lu4 r42, final defpackage.isb r43, final defpackage.mu4 r44, final defpackage.lu4 r45, final defpackage.lu4 r46, final defpackage.lu4 r47, final boolean r48, final boolean r49, final boolean r50, final defpackage.gz5 r51, final defpackage.rh8 r52, final defpackage.hrb r53, final defpackage.tu1 r54, defpackage.rv4 r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.a(java.lang.CharSequence, lu4, isb, mu4, lu4, lu4, lu4, boolean, boolean, boolean, gz5, rh8, hrb, tu1, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x060a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.yya r62, defpackage.hrb r63, boolean r64, boolean r65, boolean r66, boolean r67, defpackage.tkc r68, defpackage.oyb r69, defpackage.oyb r70, defpackage.mu4 r71, defpackage.rv4 r72, int r73) {
        /*
            Method dump skipped, instructions count: 1821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.b(yya, hrb, boolean, boolean, boolean, boolean, tkc, oyb, oyb, mu4, rv4, int):void");
    }

    public static final void c(long j, oyb oybVar, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        long j2;
        oyb oybVar2;
        lu4 lu4Var2;
        rv4 rv4Var2;
        int i4;
        rv4Var.g0(396611577);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(oybVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            rv4Var2 = rv4Var;
            cbe.f(j, oybVar, lu4Var, rv4Var2, i6 & 1022);
            j2 = j;
            oybVar2 = oybVar;
            lu4Var2 = lu4Var;
        } else {
            j2 = j;
            oybVar2 = oybVar;
            lu4Var2 = lu4Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new h99(j2, oybVar2, lu4Var2, i, 1);
        }
    }

    public static final void d(long j, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4Var.g0(590397809);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.h(lu4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            pye.a(r12.a.a(new zl1(j)), lu4Var, rv4Var, (i5 & Token.ASSIGN_MOD) | 8);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yrb(j, lu4Var, i);
        }
    }

    public static final void e(final n05 n05Var, final boolean z, final boolean z2, final boolean z3, final long j, final r24 r24Var, final dt5 dt5Var, final Long l, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, nq7 nq7Var, rv4 rv4Var, final int i, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j2;
        int i4;
        boolean z7;
        final kq7 kq7Var;
        String A;
        long j3;
        vt4 vt4Var5;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        boolean h2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean h3;
        int i15;
        rv4Var.g0(278794120);
        int i16 = 2;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rv4Var.f(n05Var);
            } else {
                h3 = rv4Var.h(n05Var);
            }
            if (h3) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            if (rv4Var.g(z4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            if (rv4Var.g(z5)) {
                i13 = 256;
            } else {
                i13 = Token.CASE;
            }
            i3 |= i13;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            z6 = z3;
            if (rv4Var.g(z6)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        } else {
            z6 = z3;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            if (rv4Var.e(j2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            if ((262144 & i) == 0) {
                h2 = rv4Var.f(r24Var);
            } else {
                h2 = rv4Var.h(r24Var);
            }
            if (h2) {
                i10 = 131072;
            } else {
                i10 = Parser.ARGC_LIMIT;
            }
            i3 |= i10;
        }
        if ((1572864 & i) == 0) {
            if ((2097152 & i) == 0) {
                h = rv4Var.f(dt5Var);
            } else {
                h = rv4Var.h(dt5Var);
            }
            if (h) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.f(l)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var.h(vt4Var)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        }
        int i17 = i3;
        if ((i2 & 6) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i16 = 4;
            }
            i4 = i2 | i16;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(vt4Var4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        int i18 = i4 | 384;
        boolean z8 = true;
        if ((i17 & 306783379) == 306783378 && (i18 & Token.EXPR_VOID) == 146) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (rv4Var.U(i17 & 1, z7)) {
            if (n05Var != null) {
                rv4Var.e0(-910607531);
                A = yqe.A((y3b) k3b.Y.getValue(), rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-910532883);
                A = yqe.A((y3b) k3b.Z.getValue(), rv4Var);
                rv4Var.q(false);
            }
            String str = A;
            if (n05Var != null) {
                rv4Var.e0(-910415455);
                j3 = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-910353021);
                j3 = ((h27) rv4Var.j(j27.a)).a.w;
                rv4Var.q(false);
            }
            long j4 = j3;
            if (n05Var == null) {
                z8 = false;
            }
            if (n05Var != null) {
                vt4Var5 = vt4Var2;
            } else {
                vt4Var5 = null;
            }
            int i19 = ((i17 << 6) & 7168) | 6 | ((i17 << 3) & 458752) | ((i17 >> 6) & 3670016) | (29360128 & (i18 << 15));
            int i20 = i17 << 18;
            int i21 = i19 | (234881024 & i20) | (i20 & 1879048192);
            int i22 = i17 >> 15;
            boolean z9 = z8;
            long j5 = j2;
            o("Google Drive", str, j4, z, z9, j5, vt4Var, z5, z6, r24Var, dt5Var, l, vt4Var5, jce.E(1310629244, new xsa(n05Var, vt4Var4, z4, vt4Var3, 6), rv4Var), rv4Var, i21, (i22 & 14) | 24576 | (i22 & Token.ASSIGN_MOD) | (i22 & 896), 0);
            kq7Var = kq7.a;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: leb
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    dxe.e(n05.this, z, z2, z3, j, r24Var, dt5Var, l, vt4Var, vt4Var2, vt4Var3, vt4Var4, kq7Var, (rv4) obj, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.nq7 r26, boolean r27, float r28, boolean r29, defpackage.rv4 r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.f(nq7, boolean, float, boolean, rv4, int, int):void");
    }

    public static final void g(ar5 ar5Var, nq7 nq7Var, wl0 wl0Var, rv4 rv4Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            nq7Var = kq7.a;
        }
        nq7 nq7Var2 = nq7Var;
        nk0 nk0Var = kh5.e;
        u22 u22Var = r0f.e;
        if ((i2 & 64) != 0) {
            wl0Var = null;
        }
        h(ase.z(ar5Var, rv4Var), null, nq7Var2, nk0Var, u22Var, 1.0f, wl0Var, rv4Var, (i & Token.ASSIGN_MOD) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.vk8 r17, final java.lang.String r18, final defpackage.nq7 r19, defpackage.dc r20, defpackage.w22 r21, float r22, defpackage.em1 r23, defpackage.rv4 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.h(vk8, java.lang.String, nq7, dc, w22, float, em1, rv4, int, int):void");
    }

    public static final void i(nl5 nl5Var, String str, nq7 nq7Var, rv4 rv4Var, int i, int i2) {
        u22 u22Var = r0f.d;
        nk0 nk0Var = kh5.e;
        if ((i2 & 16) != 0) {
            u22Var = r0f.e;
        }
        u22 u22Var2 = u22Var;
        boolean f2 = rv4Var.f(nl5Var);
        Object P = rv4Var.P();
        if (f2 || P == ax1.a) {
            P = aze.a(nl5Var, 1);
            rv4Var.o0(P);
        }
        h((sl0) P, str, nq7Var, nk0Var, u22Var2, 1.0f, null, rv4Var, (i & Token.ASSIGN_MOD) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
    }

    public static final void j(boolean z, xfd xfdVar, boolean z2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        aw7 aw7Var;
        byte b2;
        int i8;
        Boolean bool;
        xfd xfdVar2;
        zm4 zm4Var;
        aw7 aw7Var2;
        rv4Var.g0(-571155916);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(xfdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if ((74899 & i14) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i14 & 1, z3)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = new tab(15);
                rv4Var.o0(P);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new tab(16);
                rv4Var.o0(P2);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = new tab(17);
                rv4Var.o0(P3);
            }
            aw7 aw7Var5 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
            Object[] objArr4 = new Object[0];
            Object P4 = rv4Var.P();
            if (P4 == obj) {
                P4 = new tab(18);
                rv4Var.o0(P4);
            }
            Object obj2 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var, 48);
            Object[] objArr5 = new Object[0];
            Object P5 = rv4Var.P();
            if (P5 == obj) {
                P5 = new tab(19);
                rv4Var.o0(P5);
            }
            aw7 aw7Var6 = (aw7) zpe.k(objArr5, (vt4) P5, rv4Var, 48);
            Object P6 = rv4Var.P();
            if (P6 == obj) {
                P6 = s21.e(rv4Var);
            }
            zm4 zm4Var2 = (zm4) P6;
            if (!k4b.j0((String) aw7Var3.getValue()) && !k4b.j0((String) aw7Var4.getValue()) && !k4b.j0((String) aw7Var5.getValue())) {
                z4 = true;
            } else {
                z4 = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            int i15 = i14 & 14;
            if (i15 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f2 = z5 | rv4Var.f(aw7Var3);
            if ((i14 & Token.ASSIGN_MOD) != 32) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean f3 = f2 | z6 | rv4Var.f(aw7Var4) | rv4Var.f(aw7Var5) | rv4Var.f(obj2) | rv4Var.f(aw7Var6);
            Object P7 = rv4Var.P();
            if (f3 || P7 == obj) {
                aw7Var = obj2;
                b2 = 0;
                i8 = i15;
                bool = valueOf;
                Object oebVar = new oeb(z, xfdVar, zm4Var2, aw7Var3, aw7Var4, aw7Var5, aw7Var, aw7Var6, null);
                xfdVar2 = xfdVar;
                zm4Var = zm4Var2;
                aw7Var2 = aw7Var6;
                rv4Var.o0(oebVar);
                P7 = oebVar;
            } else {
                xfdVar2 = xfdVar;
                aw7Var = obj2;
                zm4Var = zm4Var2;
                aw7Var2 = aw7Var6;
                i8 = i15;
                b2 = 0;
                bool = valueOf;
            }
            yte.h(bool, xfdVar2, (lu4) P7, rv4Var);
            xb.d(z, xt4Var, jce.E(-94063992, new rd1(z4, z2, xt4Var3, aw7Var3, aw7Var4, aw7Var5, aw7Var, xt4Var2, xt4Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(-1268658485, new id1(xt4Var, 28, b2), rv4Var), rae.k, null, 0L, 0L, nae.e, false, false, jce.E(-967949088, new bn7(zm4Var, aw7Var3, aw7Var4, aw7Var5, aw7Var, aw7Var2, 14), rv4Var), rv4Var, i8 | 1769856 | ((i14 >> 6) & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fw0(z, xfdVar, z2, xt4Var, xt4Var2, xt4Var3, i);
        }
    }

    public static final void k(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        rv4Var.g0(2028127500);
        if (rv4Var.h(vt4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            String A = yqe.A((y3b) k3b.M.getValue(), rv4Var);
            long j = ((h27) rv4Var.j(j27.a)).a.w;
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new cd1(15);
                rv4Var.o0(P);
            }
            o("OneDrive", A, j, false, false, 0L, (vt4) P, false, false, null, null, null, null, jce.E(409892504, new oq3(8, vt4Var), rv4Var), rv4Var, 14380038, 24576, 16128);
            nq7Var2 = kq7.a;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new u81(vt4Var, nq7Var2, i, 9);
        }
    }

    public static final void l(final int i, final boolean z, final boolean z2, final float f2, rv4 rv4Var, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        rv4Var.g0(1467859701);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if ((i2 & 48) == 0) {
            if (rv4Var.g(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        boolean z5 = false;
        if ((i5 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i5 & 1, z3)) {
            tl tlVar = (tl) rv4Var.j(u0a.a);
            Integer valueOf = Integer.valueOf(i);
            Boolean valueOf2 = Boolean.valueOf(z);
            boolean h = rv4Var.h(tlVar);
            if ((i5 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | h;
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            }
            boolean z7 = z6 | z5;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z7 || P == obj) {
                P = new gx(tlVar, i, z, (m42) null);
                rv4Var.o0(P);
            }
            yte.h(valueOf, valueOf2, (lu4) P, rv4Var);
            boolean h2 = rv4Var.h(tlVar);
            Object P2 = rv4Var.P();
            if (h2 || P2 == obj) {
                P2 = new ux9(tlVar, 2);
                rv4Var.o0(P2);
            }
            yte.b(pvc.a, (xt4) P2, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: v0a
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    dxe.l(i, z, z2, f2, (rv4) obj2, xoe.p(i2 | 1));
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0436  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final defpackage.xeb r43, final defpackage.rh8 r44, final defpackage.nq7 r45, final defpackage.xt4 r46, final defpackage.vt4 r47, final defpackage.xt4 r48, final defpackage.vt4 r49, final defpackage.r24 r50, final java.lang.Long r51, final defpackage.dt5 r52, final defpackage.vt4 r53, final defpackage.vt4 r54, final defpackage.vt4 r55, final defpackage.vt4 r56, final defpackage.vt4 r57, defpackage.rv4 r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.m(xeb, rh8, nq7, xt4, vt4, xt4, vt4, r24, java.lang.Long, dt5, vt4, vt4, vt4, vt4, vt4, rv4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final java.lang.String r39, final java.lang.String r40, defpackage.nq7 r41, long r42, defpackage.dq4 r44, defpackage.rv4 r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.n(java.lang.String, java.lang.String, nq7, long, dq4, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final java.lang.String r64, final java.lang.String r65, final long r66, final boolean r68, final boolean r69, final long r70, final defpackage.vt4 r72, boolean r73, boolean r74, defpackage.r24 r75, defpackage.dt5 r76, java.lang.Long r77, defpackage.vt4 r78, final defpackage.tu1 r79, defpackage.rv4 r80, final int r81, final int r82, final int r83) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.o(java.lang.String, java.lang.String, long, boolean, boolean, long, vt4, boolean, boolean, r24, dt5, java.lang.Long, vt4, tu1, rv4, int, int, int):void");
    }

    public static final void p(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        Object obj;
        List list;
        aw7 aw7Var;
        Object name;
        Object name2;
        cz7Var.getClass();
        rv4Var.g0(384787926);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                Object obj2 = (web) ((fdd) voe.z(cm9.a(web.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(obj2.d, rv4Var);
                List m = cqe.m((q3b) nz.v.getValue(), rv4Var);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                Object obj3 = ax1.a;
                if (P == obj3) {
                    P = new tab(11);
                    rv4Var.o0(P);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj3) {
                    P2 = new tab(20);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                Object[] objArr3 = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj3) {
                    P3 = new tab(12);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var4 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
                Object[] objArr4 = new Object[0];
                Object P4 = rv4Var.P();
                if (P4 == obj3) {
                    P4 = new tab(13);
                    rv4Var.o0(P4);
                }
                aw7 aw7Var5 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var, 48);
                Object[] objArr5 = new Object[0];
                Object P5 = rv4Var.P();
                if (P5 == obj3) {
                    P5 = new tab(14);
                    rv4Var.o0(P5);
                }
                aw7 aw7Var6 = (aw7) zpe.k(objArr5, (vt4) P5, rv4Var, 48);
                Object P6 = rv4Var.P();
                if (P6 == obj3) {
                    P6 = yae.z(null);
                    rv4Var.o0(P6);
                }
                aw7 aw7Var7 = (aw7) P6;
                Object P7 = rv4Var.P();
                if (P7 == obj3) {
                    P7 = yte.s(rv4Var);
                    rv4Var.o0(P7);
                }
                m82 m82Var = (m82) P7;
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = obj2.e;
                boolean f2 = rv4Var.f(kbVar) | rv4Var.f(aw7Var2) | rv4Var.f(aw7Var3);
                Object P8 = rv4Var.P();
                if (f2 || P8 == obj3) {
                    P8 = new zp0(kbVar, aw7Var2, aw7Var3, null);
                    rv4Var.o0(P8);
                }
                jye.b(s02Var, null, (mu4) P8, rv4Var, 0);
                zu8 zu8Var = new zu8(null);
                boolean f3 = rv4Var.f(aw7Var3);
                Object P9 = rv4Var.P();
                if (f3 || P9 == obj3) {
                    P9 = new pr0(aw7Var7, aw7Var3, 29);
                    rv4Var.o0(P9);
                }
                fxe.h(yqe.A((y3b) k3b.o.getValue(), rv4Var), pna.c, false, jce.E(846433106, new ri9(cz7Var, 12), rv4Var), null, null, jce.E(-1272651423, new da3(obj2, aw7Var4, m, m82Var, kbVar, aw7Var5, aw7Var6, w92.v(zu8Var, (xt4) P9, rv4Var, 8), aw7Var2, z2), rv4Var), rv4Var, 1575984, 52);
                boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                xeb xebVar = (xeb) z2.getValue();
                boolean f4 = rv4Var.f(aw7Var2);
                Object P10 = rv4Var.P();
                if (f4 || P10 == obj3) {
                    P10 = new jia(aw7Var2, 14);
                    rv4Var.o0(P10);
                }
                xt4 xt4Var = (xt4) P10;
                boolean f5 = rv4Var.f(obj2);
                Object P11 = rv4Var.P();
                if (f5 || P11 == obj3) {
                    P11 = new j25(obj2, 2);
                    rv4Var.o0(P11);
                }
                v9e.k(booleanValue, xebVar, xt4Var, (ou4) P11, rv4Var, 0);
                boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
                boolean f6 = rv4Var.f((f76) aw7Var7.getValue());
                Object P12 = rv4Var.P();
                if (f6 || P12 == obj3) {
                    f76 f76Var = (f76) aw7Var7.getValue();
                    if (f76Var != null) {
                        obj = f76Var.getName();
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        P12 = "";
                    } else {
                        P12 = obj;
                    }
                    rv4Var.o0(P12);
                }
                String str = (String) P12;
                xeb xebVar2 = (xeb) z2.getValue();
                boolean f7 = rv4Var.f(aw7Var3);
                Object P13 = rv4Var.P();
                if (f7 || P13 == obj3) {
                    P13 = new jia(aw7Var3, 15);
                    rv4Var.o0(P13);
                }
                xt4 xt4Var2 = (xt4) P13;
                boolean f8 = rv4Var.f(obj2);
                Object P14 = rv4Var.P();
                if (f8 || P14 == obj3) {
                    P14 = new cn9(16, aw7Var7, obj2);
                    rv4Var.o0(P14);
                }
                gae.b(booleanValue2, str, xebVar2, xt4Var2, (xt4) P14, rv4Var, 0);
                boolean booleanValue3 = ((Boolean) aw7Var4.getValue()).booleanValue();
                xfd xfdVar = ((xeb) z2.getValue()).e;
                boolean z3 = ((xeb) z2.getValue()).j;
                boolean f9 = rv4Var.f(aw7Var4);
                Object P15 = rv4Var.P();
                if (f9 || P15 == obj3) {
                    P15 = new jia(aw7Var4, 20);
                    rv4Var.o0(P15);
                }
                xt4 xt4Var3 = (xt4) P15;
                boolean f10 = rv4Var.f(obj2);
                Object P16 = rv4Var.P();
                if (!f10 && P16 != obj3) {
                    list = m;
                    aw7Var = z2;
                } else {
                    list = m;
                    aw7Var = z2;
                    Object mp6Var = new mp6(1, obj2, web.class, "updateWebDavSyncInfo", "updateWebDavSyncInfo(Lcom/reader/data/sync/model/WebDavSyncInfo;)V", 0, 26);
                    obj2 = obj2;
                    rv4Var.o0(mp6Var);
                    P16 = mp6Var;
                }
                xt4 xt4Var4 = (xt4) ((i76) P16);
                boolean f11 = rv4Var.f(obj2);
                Object P17 = rv4Var.P();
                if (f11 || P17 == obj3) {
                    Object obj4 = obj2;
                    Object mp6Var2 = new mp6(1, obj4, web.class, "testWebDavConnection", "testWebDavConnection(Lcom/reader/data/sync/model/WebDavSyncInfo;)V", 0, 27);
                    obj2 = obj4;
                    rv4Var.o0(mp6Var2);
                    P17 = mp6Var2;
                }
                j(booleanValue3, xfdVar, z3, xt4Var3, xt4Var4, (xt4) ((i76) P17), rv4Var, 0);
                boolean booleanValue4 = ((Boolean) aw7Var5.getValue()).booleanValue();
                xeb xebVar3 = (xeb) aw7Var.getValue();
                int i4 = ((xeb) aw7Var.getValue()).c.a;
                if (i4 >= 0 && i4 < list.size()) {
                    name = list.get(i4);
                } else {
                    name = ((xeb) aw7Var.getValue()).c.name();
                }
                String str2 = (String) name;
                boolean f12 = rv4Var.f(aw7Var5);
                Object P18 = rv4Var.P();
                if (f12 || P18 == obj3) {
                    P18 = new jia(aw7Var5, 21);
                    rv4Var.o0(P18);
                }
                xt4 xt4Var5 = (xt4) P18;
                boolean f13 = rv4Var.f(aw7Var5) | rv4Var.f(obj2);
                Object P19 = rv4Var.P();
                if (f13 || P19 == obj3) {
                    P19 = new u32(14, obj2, aw7Var5);
                    rv4Var.o0(P19);
                }
                zbe.g(booleanValue4, xebVar3, str2, xt4Var5, (nu4) P19, rv4Var, 0);
                boolean booleanValue5 = ((Boolean) aw7Var6.getValue()).booleanValue();
                xeb xebVar4 = (xeb) aw7Var.getValue();
                int i5 = ((xeb) aw7Var.getValue()).c.a;
                if (i5 >= 0 && i5 < list.size()) {
                    name2 = list.get(i5);
                } else {
                    name2 = ((xeb) aw7Var.getValue()).c.name();
                }
                String str3 = (String) name2;
                boolean f14 = rv4Var.f(aw7Var6);
                Object P20 = rv4Var.P();
                if (f14 || P20 == obj3) {
                    P20 = new jia(aw7Var6, 22);
                    rv4Var.o0(P20);
                }
                xt4 xt4Var6 = (xt4) P20;
                boolean f15 = rv4Var.f(aw7Var6) | rv4Var.f(obj2) | rv4Var.f(aw7Var);
                Object P21 = rv4Var.P();
                if (f15 || P21 == obj3) {
                    P21 = new cs1(26, obj2, aw7Var6, aw7Var);
                    rv4Var.o0(P21);
                }
                zbe.f(booleanValue5, xebVar4, str3, xt4Var6, (nu4) P21, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 13);
        }
    }

    public static final void q(final xfd xfdVar, final boolean z, final boolean z2, final boolean z3, final long j, final r24 r24Var, final dt5 dt5Var, final Long l, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, nq7 nq7Var, rv4 rv4Var, final int i, final int i2) {
        int i3;
        boolean z4;
        vt4 vt4Var4;
        int i4;
        boolean z5;
        final kq7 kq7Var;
        String A;
        String str;
        long j2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        boolean h2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean h3;
        int i15;
        rv4Var.g0(-344173226);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rv4Var.f(xfdVar);
            } else {
                h3 = rv4Var.h(xfdVar);
            }
            if (h3) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            if (rv4Var.g(z4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z2)) {
                i13 = 256;
            } else {
                i13 = Token.CASE;
            }
            i3 |= i13;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.g(z3)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.e(j)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((196608 & i) == 0) {
            if ((262144 & i) == 0) {
                h2 = rv4Var.f(r24Var);
            } else {
                h2 = rv4Var.h(r24Var);
            }
            if (h2) {
                i10 = 131072;
            } else {
                i10 = Parser.ARGC_LIMIT;
            }
            i3 |= i10;
        }
        if ((1572864 & i) == 0) {
            if ((2097152 & i) == 0) {
                h = rv4Var.f(dt5Var);
            } else {
                h = rv4Var.h(dt5Var);
            }
            if (h) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.f(l)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((100663296 & i) == 0) {
            vt4Var4 = vt4Var;
            if (rv4Var.h(vt4Var4)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        } else {
            vt4Var4 = vt4Var;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        }
        if ((i2 & 6) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        int i16 = i4 | 48;
        int i17 = i3;
        boolean z6 = true;
        if ((i3 & 306783379) == 306783378 && (i16 & 19) == 18) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (rv4Var.U(i17 & 1, z5)) {
            if (xfdVar != null) {
                rv4Var.e0(-1177163897);
                A = yqe.A((y3b) k3b.Y.getValue(), rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1177089218);
                A = yqe.A((y3b) k3b.L.getValue(), rv4Var);
                rv4Var.q(false);
            }
            if (xfdVar != null) {
                rv4Var.e0(-1176970829);
                str = A;
                j2 = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                str = A;
                rv4Var.e0(-1176908395);
                j2 = ((h27) rv4Var.j(j27.a)).a.w;
                rv4Var.q(false);
            }
            if (xfdVar == null) {
                z6 = false;
            }
            int i18 = i17 << 18;
            int i19 = ((i17 << 6) & 7168) | 6 | ((i17 << 3) & 458752) | ((i17 >> 6) & 3670016) | (29360128 & (i16 << 18)) | (234881024 & i18) | (i18 & 1879048192);
            int i20 = i17 >> 15;
            o("WebDAV", str, j2, z4, z6, j, vt4Var4, z2, z3, r24Var, dt5Var, l, vt4Var2, jce.E(584082762, new em7(9, vt4Var3, xfdVar), rv4Var), rv4Var, i19, (i20 & 896) | 24576 | (i20 & 14) | (i20 & Token.ASSIGN_MOD) | ((i17 >> 18) & 7168), 0);
            kq7Var = kq7.a;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: keb
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    dxe.q(xfd.this, z, z2, z3, j, r24Var, dt5Var, l, vt4Var, vt4Var2, vt4Var3, kq7Var, (rv4) obj, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void r(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    p1a.g();
                    return;
                }
            }
            try {
                eub.u(autoCloseable);
            } catch (Throwable th2) {
                pye.e(th, th2);
            }
        }
    }

    public static final hmd s(ymd ymdVar) {
        ymdVar.getClass();
        return new hmd(ymdVar.a, ymdVar.t);
    }

    public static Set t() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final lk0 u(isb isbVar) {
        if (isbVar instanceof isb) {
            return isbVar.a;
        }
        cp8.s(isbVar, "Unknown position: ");
        return null;
    }

    public static final ty6 v(ty6 ty6Var) {
        od6 od6Var;
        od6 od6Var2 = ty6Var.O.O;
        while (true) {
            od6 v = od6Var2.v();
            od6 od6Var3 = null;
            if (v != null) {
                od6Var = v.E;
            } else {
                od6Var = null;
            }
            if (od6Var != null) {
                od6 v2 = od6Var2.v();
                if (v2 != null) {
                    od6Var3 = v2.E;
                }
                od6Var3.getClass();
                if (od6Var3.D) {
                    od6Var2 = od6Var2.v();
                    od6Var2.getClass();
                } else {
                    od6 v3 = od6Var2.v();
                    v3.getClass();
                    od6Var2 = v3.E;
                    od6Var2.getClass();
                }
            } else {
                ty6 C1 = ((i38) od6Var2.c0.e).C1();
                C1.getClass();
                return C1;
            }
        }
    }

    public static final xl0 w(f76 f76Var) {
        f76Var.getClass();
        String q2dVar = hre.q().toString();
        ql5 ql5Var = new ql5();
        Map singletonMap = Collections.singletonMap("file", f76Var);
        singletonMap.getClass();
        return new xl0(q2dVar, ql5Var, new am0(singletonMap, "image"));
    }

    public static final xl0 x(String str, Integer num, Integer num2) {
        str.getClass();
        String q2dVar = hre.q().toString();
        ql5 ql5Var = new ql5();
        r07 r07Var = new r07();
        r07Var.put("url", str);
        if (num != null && num.intValue() > 0) {
            r07Var.put("width", num);
        }
        if (num2 != null && num2.intValue() > 0) {
            r07Var.put("height", num2);
        }
        return new xl0(q2dVar, ql5Var, new am0(r07Var.b(), "image"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.f76 y(defpackage.xl0 r3) {
        /*
            r3.getClass()
            dm0 r3 = r3.c
            boolean r0 = r3 instanceof defpackage.am0
            r1 = 0
            if (r0 == 0) goto Ld
            am0 r3 = (defpackage.am0) r3
            goto Le
        Ld:
            r3 = r1
        Le:
            if (r3 == 0) goto L27
            java.util.Map r0 = r3.b
            java.lang.String r2 = "url"
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L1b
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r3 == 0) goto L27
            java.util.Map r3 = r3.b
            java.lang.String r0 = "file"
            java.lang.Object r3 = r3.get(r0)
            goto L28
        L27:
            r3 = r1
        L28:
            boolean r0 = r3 instanceof defpackage.f76
            if (r0 == 0) goto L2f
            f76 r3 = (defpackage.f76) r3
            return r3
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.y(xl0):f76");
    }

    public static final float z(rv4 rv4Var) {
        long j = ((h27) rv4Var.j(j27.a)).b.l.b.c;
        long j2 = osc.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((r13) rv4Var.j(dy1.h)).c0(j) / 2.0f;
    }
}
