package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hc2  reason: default package */
/* loaded from: classes.dex */
public abstract class hc2 {
    public static final tu1 a = new tu1(new nv1(4), false, 805579562);
    public static final tu1 b = new tu1(new mv1(10), false, 1562828806);
    public static final tu1 c = new tu1(new mv1(11), false, -869324497);
    public static final mn1 d = new Object();

    public static final void a(nq7 nq7Var, na5 na5Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        na5Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(-2059683852);
        if (rv4Var.f(na5Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        boolean z4 = true;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            int i6 = i5 & Token.ASSIGN_MOD;
            if (i6 != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = ox9.v(tl1.B(new zl1(hse.o(na5.a(na5Var, nae.e, nae.e, nae.e, 1.0f, 7))), new zl1(sve.b(16777215))), nae.e, 14);
                rv4Var.o0(P);
            }
            hy0 hy0Var = (hy0) P;
            nq7 a0 = nq7Var.a0(pna.c);
            if ((i5 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == obj) {
                P2 = new sc(0, xt4Var);
                rv4Var.o0(P2);
            }
            nq7 b2 = dab.b(a0, pvc.a, (PointerInputEventHandler) P2);
            boolean f = rv4Var.f(hy0Var);
            if (i6 != 32) {
                z4 = false;
            }
            boolean z5 = f | z4;
            Object P3 = rv4Var.P();
            if (z5 || P3 == obj) {
                P3 = new oc(hy0Var, na5Var, 0);
                rv4Var.o0(P3);
            }
            bce.a(b2, (xt4) P3, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pc(nq7Var, na5Var, xt4Var, i, 0);
        }
    }

    public static final void b(nq7 nq7Var, dc dcVar, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        rv4Var.g0(380139498);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(dcVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i8 = i3 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        boolean z2 = true;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            if (i7 != 0) {
                dcVar = kh5.a;
            }
            b37 d2 = fu0.d(dcVar, false);
            if ((i8 & 7168) != 2048) {
                z2 = false;
            }
            boolean f = rv4Var.f(d2) | z2;
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new ah7(9, d2, tu1Var);
                rv4Var.o0(P);
            }
            k6b.a(nq7Var, (lu4) P, rv4Var, i8 & 14, 0);
        } else {
            rv4Var.X();
        }
        dc dcVar2 = dcVar;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qu0(nq7Var, dcVar2, tu1Var, i, i2, 0);
        }
    }

    public static final void c(d8 d8Var, lu4 lu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        d8Var.getClass();
        lu4Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(1585154504);
        if (rv4Var.f(d8Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(lu4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z2 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            boolean booleanValue = ((Boolean) d8Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i7 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new de7(d8Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(1244173300, new sv4(12, lu4Var, d8Var), rv4Var), null, x, jce.E(568121873, new sj(d8Var, 26), rv4Var), twe.b, null, 0L, 0L, nae.e, false, false, jce.E(1527225500, new sv4(13, d8Var, xt4Var), rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(d8Var, lu4Var, xt4Var, i, 26);
        }
    }

    public static final rk9 d(jga jgaVar, cga cgaVar) {
        if (cgaVar != null) {
            List b2 = jgaVar.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (c16.i(((kga) b2.get(i)).H, cgaVar)) {
                    if (cgaVar.J) {
                        if (!cgaVar.L) {
                            return cgaVar.K;
                        }
                        return npe.n(sc6.o(cgaVar.I1(), voe.u(cgaVar), 6), eg0.A(voe.u(cgaVar).c));
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final void e(oaa oaaVar, long j, long j2, long j3, boolean z) {
        hm8 hm8Var = (hm8) oaaVar.c;
        hm8 hm8Var2 = (hm8) oaaVar.e;
        hm8 hm8Var3 = (hm8) oaaVar.b;
        hm8 hm8Var4 = (hm8) oaaVar.d;
        if (!y78.d(((y78) hm8Var4.getValue()).a, j3) || !dna.a(((dna) hm8Var3.getValue()).a, j) || z) {
            hm8Var3.setValue(new dna(j));
            hm8Var4.setValue(new y78(j3));
            if (z) {
                hm8Var.setValue(new y78(y78.i(y78.i(j2, j3), y78.i(((y78) hm8Var2.getValue()).a, ((y78) hm8Var.getValue()).a))));
            }
        }
        hm8Var2.setValue(new y78(y78.i(j2, j3)));
    }

    public static List f(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new j16(iArr, 0, iArr.length);
    }

    public static int g(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        wq9.q("Out of range: %s", j, z);
        return i;
    }

    public static final xy4 h(xy4 xy4Var, float f) {
        return xy4Var.d(new w72(new t63(f)));
    }

    public static final long i() {
        return Thread.currentThread().getId();
    }

    public static final void j(ak3 ak3Var) {
        int i;
        int i2;
        long j;
        long j2 = zl1.d;
        long j3 = zl1.e;
        ak3 ak3Var2 = ak3Var;
        float L0 = ak3Var2.L0(8.0f);
        int ceil = (int) Math.ceil(Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) / L0);
        int ceil2 = (int) Math.ceil(Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L)) / L0);
        int i3 = 0;
        while (i3 < ceil) {
            int i4 = 0;
            while (i4 < ceil2) {
                if ((i3 + i4) % 2 == 0) {
                    i = ceil;
                    i2 = ceil2;
                    j = j2;
                } else {
                    i = ceil;
                    i2 = ceil2;
                    j = j3;
                }
                ak3.R0(ak3Var2, j, (Float.floatToRawIntBits(i4 * L0) & 4294967295L) | (Float.floatToRawIntBits(i3 * L0) << 32), (Float.floatToRawIntBits(L0) & 4294967295L) | (Float.floatToRawIntBits(L0) << 32), nae.e, null, 0, 120);
                i4++;
                ak3Var2 = ak3Var;
                ceil = i;
                ceil2 = i2;
                j2 = j2;
                i3 = i3;
            }
            i3++;
            ak3Var2 = ak3Var;
            j2 = j2;
        }
    }

    public static int k(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static final rk9 l(oaa oaaVar) {
        return npe.n(y78.j(((y78) ((hm8) oaaVar.c).getValue()).a, ((y78) ((hm8) oaaVar.d).getValue()).a), ((dna) ((hm8) oaaVar.b).getValue()).a);
    }

    public static final int m(o9a o9aVar, o9a[] o9aVarArr) {
        boolean z;
        boolean z2;
        int i;
        o9aVarArr.getClass();
        int hashCode = (o9aVar.a().hashCode() * 31) + Arrays.hashCode(o9aVarArr);
        int f = o9aVar.f();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (f > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i4 = f - 1;
            int i5 = i2 * 31;
            String a2 = o9aVar.i(o9aVar.f() - f).a();
            if (a2 != null) {
                i3 = a2.hashCode();
            }
            i2 = i5 + i3;
            f = i4;
        }
        int f2 = o9aVar.f();
        int i6 = 1;
        while (true) {
            if (f2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i7 = f2 - 1;
                int i8 = i6 * 31;
                bze e = o9aVar.i(o9aVar.f() - f2).e();
                if (e != null) {
                    i = e.hashCode();
                } else {
                    i = 0;
                }
                i6 = i8 + i;
                f2 = i7;
            } else {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
        }
    }

    public static int n(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final String o(String str) {
        String obj;
        String S0;
        if (str == null || (obj = k4b.N0(str).toString()) == null || (S0 = k4b.S0(obj, '.')) == null || k4b.j0(S0)) {
            return null;
        }
        return S0;
    }

    public static final nq7 p(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new f12(xt4Var));
    }

    public static final d8 q(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = d8.i;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(15);
            rv4Var.o0(P);
        }
        return (d8) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
    }

    public static int r(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] s(Collection collection) {
        if (collection instanceof j16) {
            j16 j16Var = (j16) collection;
            return Arrays.copyOfRange(j16Var.a, j16Var.b, j16Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final String t(o9a o9aVar) {
        ty5 F = dce.F(0, o9aVar.f());
        return sl1.i0(F, ", ", o9aVar.a() + '(', ")", new cl7(o9aVar, 17), 24);
    }

    public static Integer u(String str) {
        byte b2;
        Long valueOf;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b2 = ny6.a[charAt];
                } else {
                    byte[] bArr = ny6.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b3 = ny6.a[charAt2];
                            } else {
                                byte[] bArr2 = ny6.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b3;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (i != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static final nq7 v(nq7 nq7Var, qid qidVar) {
        return nq7Var.a0(new gx5(qidVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w(java.lang.String r3, java.lang.Object[] r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            goto L26
        L4:
            int r1 = java.lang.Math.max(r0, r0)
            if (r3 != 0) goto L14
        La:
            if (r1 >= 0) goto L26
            r3 = r4[r1]
            if (r3 != 0) goto L11
            goto L1e
        L11:
            int r1 = r1 + 1
            goto La
        L14:
            if (r1 >= 0) goto L26
            r2 = r4[r1]
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L23
        L1e:
            r3 = -1
            if (r1 == r3) goto L26
            r3 = 1
            return r3
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc2.w(java.lang.String, java.lang.Object[]):boolean");
    }
}
