package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iwe  reason: default package */
/* loaded from: classes3.dex */
public abstract class iwe {
    public static final tu1 a = new tu1(new dv1(28), false, 553818909);
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static boolean d;
    public static long e;
    public static ar5 f;
    public static LinkedHashMap g;

    public static final void a(int i, int i2, int i3, int i4, nk0 nk0Var, nq7 nq7Var, rv4 rv4Var, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        kq7 kq7Var;
        boolean z10;
        int i12 = i;
        int i13 = i3;
        rv4Var.g0(-1503238343);
        if (rv4Var.d(i12)) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        int i14 = i5 | i6;
        if (rv4Var.d(i2)) {
            i7 = 32;
        } else {
            i7 = 16;
        }
        int i15 = i14 | i7;
        if (rv4Var.d(i13)) {
            i8 = 256;
        } else {
            i8 = Token.CASE;
        }
        int i16 = i15 | i8;
        if (rv4Var.d(i4)) {
            i9 = 2048;
        } else {
            i9 = 1024;
        }
        int i17 = i16 | i9;
        if (rv4Var.f(nk0Var)) {
            i10 = 16384;
        } else {
            i10 = 8192;
        }
        int i18 = i17 | i10;
        if (rv4Var.f(nq7Var)) {
            i11 = 131072;
        } else {
            i11 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i11;
        if ((74899 & i19) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i19 & 1, z)) {
            nk0 nk0Var2 = kh5.a;
            b37 d2 = fu0.d(nk0Var2, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var2 = kq7.a;
            nq7 j = pna.j(pna.f(kq7Var2, 1.0f), 20.0f, nae.e, 2);
            pu0 pu0Var = pu0.a;
            nq7 a2 = pu0Var.a(j, nk0Var);
            b37 d3 = fu0.d(nk0Var2, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, a2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            int i20 = i19 & 14;
            if (i20 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i21 = i19 & Token.ASSIGN_MOD;
            if (i21 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z11 = z2 | z3;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z11 || P == lh9Var) {
                P = (i12 + 1) + "/" + i2;
                rv4Var.o0(P);
            }
            cvb.c((String) P, pu0Var.a(kq7Var2, kh5.d), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).n, rv4Var, 0, 0, 131064);
            rv4Var2 = rv4Var;
            int i22 = i19 & 896;
            if (i22 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i23 = i19 & 7168;
            if (i23 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z12 = z5 | z4;
            Object P2 = rv4Var2.P();
            String str = "";
            if (z12 || P2 == lh9Var) {
                if (i3 < 0 || i4 <= 0) {
                    P2 = "";
                } else {
                    P2 = (i3 + 1) + "/" + i4;
                }
                rv4Var2.o0(P2);
            }
            String str2 = (String) P2;
            if (i20 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i21 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z7 | z6;
            if (i22 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z13 | z8;
            if (i23 == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z14 | z9;
            Object P3 = rv4Var2.P();
            if (!z15 && P3 != lh9Var) {
                i13 = i3;
                str = P3;
                i12 = i;
            } else {
                if (i4 > 0) {
                    i12 = i;
                    i13 = i3;
                    str = rqe.h("%.1f", Float.valueOf(((int) (((((i13 + 1.0f) / i4) + i12) * 1000.0f) / i2)) / 10.0f));
                } else {
                    i12 = i;
                    i13 = i3;
                }
                rv4Var2.o0(str);
            }
            String str3 = str;
            nq7 a3 = pu0Var.a(kq7Var2, kh5.f);
            gv9 a4 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, a3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            if (str3.length() > 0) {
                rv4Var2.e0(-1496974586);
                z10 = false;
                kq7Var = kq7Var2;
                cvb.c(str2, null, r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).n, rv4Var, 0, 0, 131066);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                kq7Var = kq7Var2;
                z10 = false;
                rv4Var2.e0(-1496753959);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            if (str3.length() > 0) {
                rv4Var2.e0(-1496620349);
                rv4 rv4Var3 = rv4Var2;
                cvb.c(yqe.B((y3b) b3b.i.getValue(), new Object[]{str3}, rv4Var2), null, r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).n, rv4Var3, 0, 0, 131066);
                rv4Var2 = rv4Var3;
                rv4Var2.q(z10);
            } else {
                rv4Var2.e0(-1496366087);
                rv4Var2.q(z10);
            }
            hl5.v(rv4Var2, true, true, true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lm7(i12, i2, i13, i4, nk0Var, nq7Var, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
        if (r9 > 15) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
        if (r14 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
        defpackage.fb4.k("SNTP: Zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwe.b():long");
    }

    public static long c(long j, de6 de6Var) {
        int j2;
        int h;
        int k;
        int i;
        de6 de6Var2 = de6.a;
        if (de6Var == de6Var2) {
            j2 = x02.k(j);
        } else {
            j2 = x02.j(j);
        }
        if (de6Var == de6Var2) {
            h = x02.i(j);
        } else {
            h = x02.h(j);
        }
        if (de6Var == de6Var2) {
            k = x02.j(j);
        } else {
            k = x02.k(j);
        }
        if (de6Var == de6Var2) {
            i = x02.h(j);
        } else {
            i = x02.i(j);
        }
        return y02.a(j2, h, k, i);
    }

    public static void d(int i, int i2, int i3, float[] fArr) {
        float z;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            z = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                z = ((f3 - f4) / f5) % 6.0f;
            } else if (max == f3) {
                z = a82.z(f4, f2, f5, 2.0f);
            } else {
                z = a82.z(f2, f3, f5, 4.0f);
            }
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (z * 60.0f) % 360.0f;
        if (f7 < nae.e) {
            f7 += 360.0f;
        }
        fArr[0] = dce.m(f7, nae.e, 360.0f);
        fArr[1] = dce.m(abs, nae.e, 1.0f);
        fArr[2] = dce.m(f6, nae.e, 1.0f);
    }

    public static long e(int i, long j) {
        int i2;
        int i3 = x02.i(j);
        if ((i & 4) != 0) {
            i2 = x02.j(j);
        } else {
            i2 = 0;
        }
        return y02.a(0, i3, i2, x02.h(j));
    }

    public static final Map f() {
        if (g == null) {
            xw8.a.getClass();
            Map map = (Map) ww8.c.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                String upperCase = ((String) entry.getKey()).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                linkedHashMap.put(upperCase, entry.getValue());
            }
            g = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = g;
        linkedHashMap2.getClass();
        return linkedHashMap2;
    }

    public static int g(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            if (i == 512) {
                                return 9;
                            }
                            vs.m(a82.j(i, "type needs to be >= FIRST and <= LAST, type="));
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static final boolean h(q65 q65Var) {
        if (q65Var instanceof t4b) {
            t4b t4bVar = (t4b) q65Var;
            return c16.i(t4bVar.a.a, t4bVar.b.a);
        } else if (q65Var instanceof xm0) {
            xm0 xm0Var = (xm0) q65Var;
            return xm0Var.b.equals(xm0Var.c);
        } else {
            xk5.o();
            return false;
        }
    }

    public static final nq7 i(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new cm4(xt4Var));
    }

    public static long j(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & Token.CASE) == 128) {
            i2 = (i2 & Token.SWITCH) + Token.CASE;
        }
        if ((i3 & Token.CASE) == 128) {
            i3 = (i3 & Token.SWITCH) + Token.CASE;
        }
        if ((i4 & Token.CASE) == 128) {
            i4 = (i4 & Token.SWITCH) + Token.CASE;
        }
        if ((i5 & Token.CASE) == 128) {
            i5 = (i5 & Token.SWITCH) + Token.CASE;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long k(byte[] bArr, int i) {
        long j = j(bArr, i);
        long j2 = j(bArr, i + 4);
        if (j == 0 && j2 == 0) {
            return 0L;
        }
        return ((j2 * 1000) / 4294967296L) + ((j - 2208988800L) * 1000);
    }

    public static final ArrayList l(List list, String str, cm0 cm0Var) {
        cm0 cm0Var2;
        list.getClass();
        cm0Var.getClass();
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            xl0 xl0Var = (xl0) it.next();
            if (c16.i(xl0Var.a, str)) {
                dm0 dm0Var = xl0Var.c;
                if (dm0Var instanceof cm0) {
                    cm0Var2 = (cm0) dm0Var;
                } else {
                    cm0Var2 = null;
                }
                if (cm0Var2 != null) {
                    if (!cm0Var2.equals(cm0Var)) {
                        xl0Var = xl0.a(xl0Var, null, cm0Var, null, 11);
                    }
                    z = true;
                } else {
                    throw new IllegalStateException("History replay requires existing text block ".concat(pm0.a(str)).toString());
                }
            }
            arrayList.add(xl0Var);
        }
        if (z) {
            return arrayList;
        }
        p1a.k("History replay requires existing text block ".concat(pm0.a(str)));
        return null;
    }

    public static final yk8 m(q65 q65Var, List list, p65 p65Var) {
        cm0 cm0Var;
        lo3 lo3Var;
        no3 no3Var;
        q65Var.getClass();
        list.getClass();
        boolean z = q65Var instanceof t4b;
        p65 p65Var2 = p65.a;
        if (z) {
            t4b t4bVar = (t4b) q65Var;
            if (p65Var == p65Var2) {
                no3Var = t4bVar.a;
            } else {
                no3Var = t4bVar.b;
            }
            return new yk8(no3Var.a, no3Var.b);
        } else if (q65Var instanceof xm0) {
            xm0 xm0Var = (xm0) q65Var;
            if (p65Var == p65Var2) {
                cm0Var = xm0Var.b;
            } else {
                cm0Var = xm0Var.c;
            }
            if (p65Var == p65Var2) {
                lo3Var = ((xm0) q65Var).d;
            } else {
                lo3Var = ((xm0) q65Var).e;
            }
            return new yk8(l(list, ((xm0) q65Var).a, cm0Var), lo3Var);
        } else {
            xk5.o();
            return null;
        }
    }

    public static final ArrayList n(List list) {
        list.getClass();
        if (list instanceof ArrayList) {
            return (ArrayList) list;
        }
        return new ArrayList(list);
    }

    public static final long o(long j) {
        return y02.a(x02.k(j), x02.i(j), x02.j(j), x02.h(j));
    }

    public static Object p(f20 f20Var, int i, zz2 zz2Var) {
        Object f2 = f20Var.f(new byte[]{(byte) i}, 0, 1, zz2Var);
        if (f2 == n82.a) {
            return f2;
        }
        return pvc.a;
    }
}
