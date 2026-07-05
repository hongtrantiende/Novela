package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dae  reason: default package */
/* loaded from: classes.dex */
public abstract class dae {
    public static final afa a = afa.c;
    public static final float b = 1.0f;
    public static final tu1 c = new tu1(new ov1(20), false, -685929624);
    public static final tu1 d = new tu1(new ov1(21), false, 938290214);
    public static final tu1 e = new tu1(new ov1(22), false, 1072671199);
    public static final tu1 f = new tu1(new ov1(23), false, -1420160227);
    public static final tu1 g = new tu1(new ov1(24), false, 504698976);
    public static final tu1 h = new tu1(new ov1(25), false, -1988132450);
    public static final byte[] i = {0, 0, 0, 1};
    public static final float[] j = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object k = new Object();
    public static int[] l = new int[10];
    public static final byte[][] m = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nx7 A(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.A(byte[], int, int):nx7");
    }

    public static void B(lm8 lm8Var) {
        int f2 = lm8Var.f() + 1;
        lm8Var.j(8);
        for (int i2 = 0; i2 < f2; i2++) {
            lm8Var.f();
            lm8Var.f();
            lm8Var.i();
        }
        lm8Var.j(20);
    }

    public static byte[] C(q21 q21Var) {
        int i2;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max((int) Token.CASE, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min2) {
                int read = q21Var.read(bArr, i4, min2 - i4);
                if (read == -1) {
                    return h(arrayDeque, i3);
                }
                i4 += read;
                i3 += read;
            }
            long j2 = min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            long j3 = j2 * i2;
            if (j3 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j3 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j3;
            }
        }
        if (q21Var.read() == -1) {
            return h(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static String D(int i2) {
        if (i2 == 1) {
            return "KeyUp";
        }
        if (i2 == 2) {
            return "KeyDown";
        }
        if (i2 == 0) {
            return "Unknown";
        }
        return "Invalid";
    }

    public static final void E(f03 f03Var, Object obj, xt4 xt4Var) {
        kn knVar;
        if (!((mq7) f03Var).a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var = ((mq7) f03Var).a.e;
        od6 v = voe.v(f03Var);
        while (v != null) {
            if ((((mq7) v.c0.C).d & 262144) != 0) {
                while (mq7Var != null) {
                    if ((mq7Var.c & 262144) != 0) {
                        mq7 mq7Var2 = mq7Var;
                        gw7 gw7Var = null;
                        while (mq7Var2 != null) {
                            boolean z = true;
                            if (mq7Var2 instanceof rnc) {
                                rnc rncVar = (rnc) mq7Var2;
                                if (obj.equals(rncVar.M())) {
                                    z = ((Boolean) xt4Var.invoke(rncVar)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((mq7Var2.c & 262144) != 0 && (mq7Var2 instanceof m03)) {
                                int i2 = 0;
                                for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                    if ((mq7Var3.c & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            mq7Var2 = mq7Var3;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var2 != null) {
                                                gw7Var.b(mq7Var2);
                                                mq7Var2 = null;
                                            }
                                            gw7Var.b(mq7Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            mq7Var2 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var = mq7Var.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var = (hkb) knVar.f;
            } else {
                mq7Var = null;
            }
        }
    }

    public static final void F(rnc rncVar, xt4 xt4Var) {
        kn knVar;
        mq7 mq7Var = (mq7) rncVar;
        if (!mq7Var.a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var2 = mq7Var.a.e;
        od6 v = voe.v(rncVar);
        while (v != null) {
            if ((((mq7) v.c0.C).d & 262144) != 0) {
                while (mq7Var2 != null) {
                    if ((mq7Var2.c & 262144) != 0) {
                        mq7 mq7Var3 = mq7Var2;
                        gw7 gw7Var = null;
                        while (mq7Var3 != null) {
                            boolean z = true;
                            if (mq7Var3 instanceof rnc) {
                                rnc rncVar2 = (rnc) mq7Var3;
                                if (c16.i(rncVar.M(), rncVar2.M()) && rncVar.getClass() == rncVar2.getClass()) {
                                    z = ((Boolean) xt4Var.invoke(rncVar2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((mq7Var3.c & 262144) != 0 && (mq7Var3 instanceof m03)) {
                                int i2 = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var2 = mq7Var2.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var2 = (hkb) knVar.f;
            } else {
                mq7Var2 = null;
            }
        }
    }

    public static final void G(mq7 mq7Var, String str, xt4 xt4Var) {
        qnc qncVar;
        if (!mq7Var.a.J) {
            lv5.c("visitSubtreeIf called on an unattached node");
        }
        gw7 gw7Var = new gw7(new mq7[16], 0);
        mq7 mq7Var2 = mq7Var.a;
        mq7 mq7Var3 = mq7Var2.f;
        if (mq7Var3 == null) {
            voe.g(gw7Var, mq7Var2);
        } else {
            gw7Var.b(mq7Var3);
        }
        while (true) {
            int i2 = gw7Var.c;
            if (i2 != 0) {
                mq7 mq7Var4 = (mq7) gw7Var.k(i2 - 1);
                if ((mq7Var4.d & 262144) != 0) {
                    for (mq7 mq7Var5 = mq7Var4; mq7Var5 != null && mq7Var5.J; mq7Var5 = mq7Var5.f) {
                        if ((mq7Var5.c & 262144) != 0) {
                            mq7 mq7Var6 = mq7Var5;
                            gw7 gw7Var2 = null;
                            while (mq7Var6 != null) {
                                if (mq7Var6 instanceof rnc) {
                                    rnc rncVar = (rnc) mq7Var6;
                                    if (str.equals(rncVar.M())) {
                                        qncVar = (qnc) xt4Var.invoke(rncVar);
                                    } else {
                                        qncVar = qnc.a;
                                    }
                                    if (qncVar != qnc.c) {
                                        if (qncVar == qnc.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((mq7Var6.c & 262144) != 0 && (mq7Var6 instanceof m03)) {
                                    int i3 = 0;
                                    for (mq7 mq7Var7 = ((m03) mq7Var6).L; mq7Var7 != null; mq7Var7 = mq7Var7.f) {
                                        if ((mq7Var7.c & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                mq7Var6 = mq7Var7;
                                            } else {
                                                if (gw7Var2 == null) {
                                                    gw7Var2 = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var6 != null) {
                                                    gw7Var2.b(mq7Var6);
                                                    mq7Var6 = null;
                                                }
                                                gw7Var2.b(mq7Var7);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                mq7Var6 = voe.h(gw7Var2);
                            }
                            continue;
                        }
                    }
                }
                voe.g(gw7Var, mq7Var4);
            } else {
                return;
            }
        }
    }

    public static final void H(rnc rncVar, xt4 xt4Var) {
        qnc qncVar;
        mq7 mq7Var = (mq7) rncVar;
        if (!mq7Var.a.J) {
            lv5.c("visitSubtreeIf called on an unattached node");
        }
        gw7 gw7Var = new gw7(new mq7[16], 0);
        mq7 mq7Var2 = mq7Var.a;
        mq7 mq7Var3 = mq7Var2.f;
        if (mq7Var3 == null) {
            voe.g(gw7Var, mq7Var2);
        } else {
            gw7Var.b(mq7Var3);
        }
        while (true) {
            int i2 = gw7Var.c;
            if (i2 != 0) {
                mq7 mq7Var4 = (mq7) gw7Var.k(i2 - 1);
                if ((mq7Var4.d & 262144) != 0) {
                    for (mq7 mq7Var5 = mq7Var4; mq7Var5 != null && mq7Var5.J; mq7Var5 = mq7Var5.f) {
                        if ((mq7Var5.c & 262144) != 0) {
                            mq7 mq7Var6 = mq7Var5;
                            gw7 gw7Var2 = null;
                            while (mq7Var6 != null) {
                                if (mq7Var6 instanceof rnc) {
                                    rnc rncVar2 = (rnc) mq7Var6;
                                    if (c16.i(rncVar.M(), rncVar2.M()) && rncVar.getClass() == rncVar2.getClass()) {
                                        qncVar = (qnc) xt4Var.invoke(rncVar2);
                                    } else {
                                        qncVar = qnc.a;
                                    }
                                    if (qncVar != qnc.c) {
                                        if (qncVar == qnc.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((mq7Var6.c & 262144) != 0 && (mq7Var6 instanceof m03)) {
                                    int i3 = 0;
                                    for (mq7 mq7Var7 = ((m03) mq7Var6).L; mq7Var7 != null; mq7Var7 = mq7Var7.f) {
                                        if ((mq7Var7.c & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                mq7Var6 = mq7Var7;
                                            } else {
                                                if (gw7Var2 == null) {
                                                    gw7Var2 = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var6 != null) {
                                                    gw7Var2.b(mq7Var6);
                                                    mq7Var6 = null;
                                                }
                                                gw7Var2.b(mq7Var7);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                mq7Var6 = voe.h(gw7Var2);
                            }
                            continue;
                        }
                    }
                }
                voe.g(gw7Var, mq7Var4);
            } else {
                return;
            }
        }
    }

    public static int I(byte[] bArr, int i2) {
        int i3;
        synchronized (k) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 < i2 - 2) {
                        try {
                            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                                break;
                            }
                            i4++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i4 = i2;
                        break;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = l;
                    if (iArr.length <= i5) {
                        l = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    l[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = l[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static void J(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = (int) jArr[i4];
            int i6 = (((int) jArr2[i4]) ^ i5) & i3;
            jArr[i4] = i5 ^ i6;
            jArr2[i4] = ((int) jArr2[i4]) ^ i6;
        }
    }

    public static boolean K(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = efe.b;
            }
        } else if (collection instanceof pee) {
            obj = ((pee) collection).E;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static final void a(final float f2, final jk1 jk1Var, boolean z, final tu1 tu1Var, float f3, float f4, final long j2, final nq7 nq7Var, final vt4 vt4Var, final xt4 xt4Var, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        final boolean z3;
        final float f5;
        final float f6;
        final float f7;
        final boolean z4;
        final float f8;
        xt4Var.getClass();
        rv4Var.g0(1697730154);
        char c2 = 4;
        if (rv4Var.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(jk1Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4 | 1794432;
        if (rv4Var.e(j2)) {
            i5 = 8388608;
        } else {
            i5 = 4194304;
        }
        int i10 = i9 | i5;
        if (rv4Var.f(nq7Var)) {
            i6 = 67108864;
        } else {
            i6 = 33554432;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(vt4Var)) {
            i7 = 536870912;
        } else {
            i7 = 268435456;
        }
        int i12 = i11 | i7;
        if (!rv4Var.h(xt4Var)) {
            c2 = 2;
        }
        if ((306783379 & i12) == 306783378 && (c2 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                z4 = z;
                f8 = f3;
                f7 = f4;
            } else {
                f7 = 2.0f;
                z4 = true;
                f8 = 40.0f;
            }
            rv4Var.r();
            hc2.b(nq7Var, null, jce.E(-1080067116, new mu4() { // from class: rpa
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z5;
                    int i13;
                    su0 su0Var = (su0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        intValue |= i13;
                    }
                    if ((intValue & 19) != 18) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z5)) {
                        Object P = rv4Var2.P();
                        if (P == ax1.a) {
                            P = s21.g(rv4Var2);
                        }
                        yu7 yu7Var = (yu7) P;
                        kpa kpaVar = kpa.a;
                        long j3 = zl1.h;
                        gpa d2 = kpa.d(0L, j3, j3, rv4Var2, 1013);
                        kq7 kq7Var = kq7.a;
                        nq7 f9 = pna.f(kq7Var, 1.0f);
                        final float f10 = f8;
                        tu1 E = jce.E(-1953323496, new mu4() { // from class: npa
                            @Override // defpackage.mu4
                            public final Object c(Object obj4, Object obj5, Object obj6) {
                                boolean z6;
                                rv4 rv4Var3 = (rv4) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((wpa) obj4).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (rv4Var3.U(intValue2 & 1, z6)) {
                                    fu0.a(pna.n(kq7.a, f10), rv4Var3, 0);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2);
                        float f11 = f2;
                        xt4 xt4Var2 = xt4Var;
                        boolean z6 = z4;
                        vt4 vt4Var2 = vt4Var;
                        jk1 jk1Var2 = jk1Var;
                        dae.d(f11, xt4Var2, f9, z6, vt4Var2, d2, yu7Var, 0, E, null, jk1Var2, rv4Var2, 102236544, 0, 512);
                        float f12 = jk1Var2.a;
                        float d3 = (((f11 - f12) * (su0Var.d() - f10)) / (jk1Var2.b - f12)) + f10;
                        nq7 h2 = pna.h(kq7Var, f10);
                        nk0 nk0Var = kh5.d;
                        pu0 pu0Var = pu0.a;
                        nq7 s = pna.s(pu0Var.a(h2, nk0Var), d3);
                        su9 su9Var = uu9.a;
                        nq7 k2 = tte.k(s, su9Var);
                        long j4 = j2;
                        long b2 = zl1.b(0.5f, j4);
                        ba5 ba5Var = lre.g;
                        fu0.a(nmd.v(k2, b2, ba5Var), rv4Var2, 0);
                        nq7 k3 = tte.k(lbe.q(pu0Var.a(pna.n(kq7Var, f10), nk0Var), d3 - f10), su9Var);
                        b37 d4 = fu0.d(kh5.e, false);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, k3);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(qw1.f, rv4Var2, d4);
                        jce.F(qw1.e, rv4Var2, l2);
                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var2);
                        jce.F(qw1.d, rv4Var2, p);
                        tu1Var.invoke(rv4Var2, 0);
                        rv4Var2.q(true);
                        fu0.a(nmd.v(tte.k(pna.s(pu0Var.a(pna.h(kq7Var, f7), kh5.f), su0Var.d() - d3), su9Var), zl1.b(0.2f, j4), ba5Var), rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i12 >> 24) & 14) | 3072, 6);
            z3 = z4;
            f5 = f8;
            f6 = f7;
        } else {
            rv4Var.X();
            z3 = z;
            f5 = f3;
            f6 = f4;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(f2, jk1Var, z3, tu1Var, f5, f6, j2, nq7Var, vt4Var, xt4Var, i2) { // from class: mpa
                public final /* synthetic */ long C;
                public final /* synthetic */ nq7 D;
                public final /* synthetic */ vt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ float a;
                public final /* synthetic */ jk1 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ tu1 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(3073);
                    dae.a(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(ar5 ar5Var, String str, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        kq7 kq7Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1364140700);
        if (rv4Var2.f(ar5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4 | 384;
        if (rv4Var2.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            tza tzaVar = j27.a;
            v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
            kq7 kq7Var2 = kq7.a;
            nq7 z2 = zbe.z(pna.u(lbe.f(15, vt4Var, tte.k(kq7Var2, v72Var), null, false), 64.0f, nae.e, 2), 8.0f, 8.0f);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            nk5.a(ar5Var, null, pna.n(kq7Var2, 24.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, (i8 & 14) | 432, 0);
            fu0.a(pna.p(kq7Var2, nae.e, 4.0f), rv4Var2, 6);
            cvb.c(str, null, ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var, (i8 >> 3) & 14, 24576, 113658);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(ar5Var, str, kq7Var, vt4Var, i2, 28);
        }
    }

    public static final void c(final boolean z, final y78 y78Var, final boolean z2, nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        rv4Var.g0(933038603);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var.f(y78Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (rv4Var.g(z2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(vt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        if (rv4Var.h(vt4Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        if ((599187 & i14) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i14 & 1, z3)) {
            WeakHashMap weakHashMap = yjd.w;
            final rp rpVar = h88.n(rv4Var).b;
            final tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yae.z(null);
                rv4Var.o0(P);
            }
            final aw7 aw7Var = (aw7) P;
            if (y78Var != null) {
                aw7Var.setValue(y78Var);
            }
            hc2.b(nq7Var, null, jce.E(-1153155743, new mu4() { // from class: hh7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    r13 r13Var;
                    r13 r13Var2;
                    r13 r13Var3;
                    r13 r13Var4;
                    boolean z5;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((su0) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z4)) {
                        tza tzaVar = dy1.h;
                        float L0 = ((r13) rv4Var2.j(tzaVar)).L0(12.0f);
                        float L02 = ((r13) rv4Var2.j(tzaVar)).L0(16.0f);
                        qid qidVar = rpVar;
                        tc6 tc6Var2 = tc6Var;
                        float d2 = L02 + qidVar.d(r13Var, tc6Var2);
                        float L03 = ((r13) rv4Var2.j(tzaVar)).L0(16.0f) + qidVar.b(r13Var2, tc6Var2);
                        float L04 = ((r13) rv4Var2.j(tzaVar)).L0(16.0f) + qidVar.a(r13Var3);
                        float L05 = ((r13) rv4Var2.j(tzaVar)).L0(16.0f) + qidVar.c(r13Var4);
                        if (z && y78Var != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        eu3 g2 = zt3.g(null, 3);
                        long j2 = ckc.b;
                        eu3 a2 = g2.a(zt3.k(null, 0.9f, j2, 1));
                        lz3 a3 = zt3.i(null, 3).a(zt3.m(0.9f, j2, 1));
                        boolean c2 = rv4Var2.c(L03) | rv4Var2.c(d2) | rv4Var2.c(L05) | rv4Var2.c(L04) | rv4Var2.c(L0);
                        Object P2 = rv4Var2.P();
                        if (c2 || P2 == ax1.a) {
                            jh7 jh7Var = new jh7(L03, d2, L05, L04, L0, aw7Var, 0);
                            rv4Var2.o0(jh7Var);
                            P2 = jh7Var;
                        }
                        rte.c(z5, sze.f(kq7.a, (mu4) P2), a2, a3, null, jce.E(-66427335, new mf3(vt4Var, z2, vt4Var2, vt4Var3), rv4Var2), rv4Var2, 196608, 16);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ih7(z, y78Var, z2, nq7Var, vt4Var, vt4Var2, vt4Var3, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final float r22, final defpackage.xt4 r23, defpackage.nq7 r24, boolean r25, defpackage.vt4 r26, defpackage.gpa r27, defpackage.yu7 r28, int r29, defpackage.mu4 r30, defpackage.mu4 r31, final defpackage.jk1 r32, defpackage.rv4 r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.d(float, xt4, nq7, boolean, vt4, gpa, yu7, int, mu4, mu4, jk1, rv4, int, int, int):void");
    }

    public static final void e(yu7 yu7Var, nq7 nq7Var, gpa gpaVar, boolean z, long j2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        long j3;
        long a2;
        long j4;
        long j5;
        float f2;
        rv4Var.g0(-124153292);
        if (rv4Var.f(yu7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3 | 48;
        if (rv4Var.f(gpaVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if (rv4Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5 | 24576;
        boolean z3 = false;
        if ((i8 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                a2 = j2;
            } else {
                a2 = ote.a(4.0f, 16.0f);
                nq7Var = kq7.a;
            }
            rv4Var.r();
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new ora();
                rv4Var.o0(P);
            }
            ora oraVar = (ora) P;
            if ((i8 & 14) == 4) {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new koa(yu7Var, oraVar, null, 1);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, yu7Var);
            if (!oraVar.isEmpty()) {
                float b2 = ug3.b(a2) / 2.0f;
                if (true & true) {
                    b2 = ug3.b(a2);
                }
                if (true & true) {
                    f2 = ug3.a(a2);
                } else {
                    f2 = nae.e;
                }
                j4 = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
            } else {
                j4 = a2;
            }
            nq7 g2 = p17.g(pna.o(j4, nq7Var), yu7Var);
            if (z) {
                j5 = gpaVar.a;
            } else {
                j5 = gpaVar.f;
            }
            xbe.i(rv4Var, nmd.v(g2, j5, uu9.a));
            j3 = a2;
        } else {
            rv4Var.X();
            j3 = j2;
        }
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wl(yu7Var, nq7Var2, gpaVar, z, j3, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final float r34, final float r35, final float r36, final int r37, defpackage.nq7 r38, final defpackage.xt4 r39, defpackage.vt4 r40, defpackage.rv4 r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.f(float, float, float, int, nq7, xt4, vt4, rv4, int, int):void");
    }

    public static void g(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static byte[] h(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static void i(ArrayList arrayList) {
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            pt1 pt1Var = (pt1) obj;
            pe2 pe2Var = new pe2(pt1Var);
            for (mf9 mf9Var : pt1Var.b) {
                if (pt1Var.e == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qe2 qe2Var = new qe2(mf9Var, !z2);
                if (!hashMap.containsKey(qe2Var)) {
                    hashMap.put(qe2Var, new HashSet());
                }
                Set set = (Set) hashMap.get(qe2Var);
                if (!set.isEmpty() && z2) {
                    hfd.p(mf9Var, ".", "Multiple components provide ");
                    return;
                }
                set.add(pe2Var);
            }
        }
        for (Set<pe2> set2 : hashMap.values()) {
            for (pe2 pe2Var2 : set2) {
                for (x13 x13Var : pe2Var2.a.c) {
                    if (x13Var.c == 0) {
                        mf9 mf9Var2 = x13Var.a;
                        if (x13Var.b == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Set<pe2> set3 = (Set) hashMap.get(new qe2(mf9Var2, z));
                        if (set3 != null) {
                            for (pe2 pe2Var3 : set3) {
                                pe2Var2.b.add(pe2Var3);
                                pe2Var3.c.add(pe2Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pe2 pe2Var4 = (pe2) it.next();
            if (pe2Var4.c.isEmpty()) {
                hashSet2.add(pe2Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            pe2 pe2Var5 = (pe2) hashSet2.iterator().next();
            hashSet2.remove(pe2Var5);
            i2++;
            Iterator it2 = pe2Var5.b.iterator();
            while (it2.hasNext()) {
                pe2 pe2Var6 = (pe2) it2.next();
                pe2Var6.c.remove(pe2Var5);
                if (pe2Var6.c.isEmpty()) {
                    hashSet2.add(pe2Var6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            pe2 pe2Var7 = (pe2) it3.next();
            if (!pe2Var7.c.isEmpty() && !pe2Var7.b.isEmpty()) {
                arrayList2.add(pe2Var7.a);
            }
        }
        throw new gt1("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 2);
    }

    public static final hn4 j(hn4 hn4Var) {
        hn4 f2 = ((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).f();
        if (f2 != null && f2.J) {
            return f2;
        }
        return null;
    }

    public static int k(byte[] bArr, int i2, int i3, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4 = i3 - i2;
        boolean z4 = false;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            g(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            g(zArr);
            return i2 - 2;
        } else if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            g(zArr);
            return i2 - 1;
        } else {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b2 = bArr[i6];
                if ((b2 & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                        g(zArr);
                        return i7;
                    }
                    i6 -= 2;
                }
                i6 += 3;
            }
            if (i4 <= 2 ? !(i4 != 2 ? !zArr[1] || bArr[i5] != 1 : !zArr[2] || bArr[i3 - 2] != 0 || bArr[i5] != 1) : !(bArr[i3 - 3] != 0 || bArr[i3 - 2] != 0 || bArr[i5] != 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[0] = z2;
            if (i4 <= 1 ? !(!zArr[2] || bArr[i5] != 0) : !(bArr[i3 - 2] != 0 || bArr[i5] != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[1] = z3;
            if (bArr[i5] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i3;
        }
    }

    public static final rnc l(mq7 mq7Var, Object obj) {
        kn knVar;
        if (!mq7Var.a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var2 = mq7Var.a.e;
        od6 v = voe.v(mq7Var);
        while (v != null) {
            if ((((mq7) v.c0.C).d & 262144) != 0) {
                while (mq7Var2 != null) {
                    if ((mq7Var2.c & 262144) != 0) {
                        mq7 mq7Var3 = mq7Var2;
                        gw7 gw7Var = null;
                        while (mq7Var3 != null) {
                            if (mq7Var3 instanceof rnc) {
                                rnc rncVar = (rnc) mq7Var3;
                                if (obj.equals(rncVar.M())) {
                                    return rncVar;
                                }
                            }
                            if ((mq7Var3.c & 262144) != 0 && (mq7Var3 instanceof m03)) {
                                int i2 = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var2 = mq7Var2.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var2 = (hkb) knVar.f;
            } else {
                mq7Var2 = null;
            }
        }
        return null;
    }

    public static final rk9 m(hn4 hn4Var) {
        i38 i38Var;
        if (hn4Var.J && (i38Var = hn4Var.D) != null) {
            sc6 t = obe.t(i38Var);
            if (!t.t()) {
                t = null;
            }
            if (t != null) {
                return hn4Var.K1(t);
            }
        }
        return rk9.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0027, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hn4 n(defpackage.hn4 r9) {
        /*
            mq7 r0 = r9.a
            boolean r0 = r0.J
            r1 = 0
            if (r0 != 0) goto L9
            goto Lab
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.lv5.c(r0)
        L10:
            gw7 r0 = new gw7
            r2 = 16
            mq7[] r3 = new defpackage.mq7[r2]
            r4 = 0
            r0.<init>(r3, r4)
            mq7 r9 = r9.a
            mq7 r3 = r9.f
            if (r3 != 0) goto L24
            defpackage.voe.g(r0, r9)
            goto L27
        L24:
            r0.b(r3)
        L27:
            int r9 = r0.c
            if (r9 == 0) goto Lab
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.k(r9)
            mq7 r9 = (defpackage.mq7) r9
            int r3 = r9.d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            defpackage.voe.g(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La8
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof defpackage.hn4
            r6 = 1
            if (r5 == 0) goto L6d
            hn4 r9 = (defpackage.hn4) r9
            mq7 r5 = r9.a
            boolean r5 = r5.J
            if (r5 == 0) goto La3
            dn4 r5 = r9.M1()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L6c
            if (r5 == r6) goto L6c
            r6 = 2
            if (r5 == r6) goto L6c
            r9 = 3
            if (r5 != r9) goto L68
            goto La3
        L68:
            defpackage.xk5.o()
            return r1
        L6c:
            return r9
        L6d:
            int r5 = r9.c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La3
            boolean r5 = r9 instanceof defpackage.m03
            if (r5 == 0) goto La3
            r5 = r9
            m03 r5 = (defpackage.m03) r5
            mq7 r5 = r5.L
            r7 = r4
        L7d:
            if (r5 == 0) goto La0
            int r8 = r5.c
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9d
            int r7 = r7 + 1
            if (r7 != r6) goto L8b
            r9 = r5
            goto L9d
        L8b:
            if (r3 != 0) goto L94
            gw7 r3 = new gw7
            mq7[] r8 = new defpackage.mq7[r2]
            r3.<init>(r8, r4)
        L94:
            if (r9 == 0) goto L9a
            r3.b(r9)
            r9 = r1
        L9a:
            r3.b(r5)
        L9d:
            mq7 r5 = r5.f
            goto L7d
        La0:
            if (r7 != r6) goto La3
            goto L46
        La3:
            mq7 r9 = defpackage.voe.h(r3)
            goto L46
        La8:
            mq7 r9 = r9.f
            goto L3d
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.n(hn4):hn4");
    }

    public static String o(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                ls5 i3 = qs5.i();
                int i4 = 0;
                while (i4 < bArr.length) {
                    int k2 = k(bArr, i4, bArr.length, zArr);
                    if (k2 != bArr.length) {
                        i3.b(Integer.valueOf(k2));
                    }
                    i4 = k2 + 3;
                }
                mm9 g2 = i3.g();
                for (int i5 = 0; i5 < g2.d; i5++) {
                    if (((Integer) g2.get(i5)).intValue() + 3 < length) {
                        lm8 lm8Var = new lm8(bArr, ((Integer) g2.get(i5)).intValue() + 3, length);
                        c4 v = v(lm8Var);
                        if (v.a == 33 && v.b == 0) {
                            lm8Var.j(4);
                            int e2 = lm8Var.e(3);
                            lm8Var.i();
                            hx7 w = w(lm8Var, true, e2, null);
                            return vk1.a(w.a, w.b, w.c, w.d, w.e, w.f);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static String p(vq4 vq4Var) {
        String str = vq4Var.o;
        String str2 = vq4Var.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (!str2.startsWith("dva1") && !str2.startsWith("dvav")) {
                if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return vq4Var.o;
    }

    public static void q(Object[] objArr, int i2, int i3) {
        int i4 = i2 * 2;
        int i5 = i4 + 1;
        if (i5 < i3) {
            int i6 = i4 + 2;
            if (i6 < i3) {
                if (((am1) objArr[i6]).b() - ((am1) objArr[i5]).b() >= 0) {
                    i5 = i6;
                }
            }
            if (((am1) objArr[i2]).b() - ((am1) objArr[i5]).b() < 0) {
                Object obj = objArr[i2];
                objArr[i2] = objArr[i5];
                objArr[i5] = obj;
                q(objArr, i5, i3);
            }
        }
    }

    public static void r(int i2, Object[] objArr) {
        int i3;
        if (i2 % 2 == 0) {
            i3 = (i2 / 2) - 1;
        } else {
            i3 = i2 / 2;
        }
        if (i3 >= 0) {
            if (((am1) objArr[i2]).b() - ((am1) objArr[i3]).b() > 0) {
                Object obj = objArr[i2];
                objArr[i2] = objArr[i3];
                objArr[i3] = obj;
                r(i3, objArr);
            }
        }
    }

    public static boolean s(byte[] bArr, int i2, vq4 vq4Var) {
        int i3;
        if (Objects.equals(vq4Var.o, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(vq4Var.o, "video/hevc")) {
            c4 v = v(new lm8(bArr, 4, i2 + 4));
            int i4 = v.a;
            if (i4 != 35) {
                if (i4 <= 14 && i4 % 2 == 0 && v.c == vq4Var.F - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean t(hn4 hn4Var) {
        od6 od6Var;
        i38 i38Var;
        od6 od6Var2;
        i38 i38Var2 = hn4Var.D;
        if (i38Var2 != null && (od6Var = i38Var2.O) != null && od6Var.K() && (i38Var = hn4Var.D) != null && (od6Var2 = i38Var.O) != null && od6Var2.J()) {
            return true;
        }
        return false;
    }

    public static int u(vq4 vq4Var) {
        String p = p(vq4Var);
        if (Objects.equals(p, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(p, "video/hevc") && !Objects.equals(p, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static c4 v(lm8 lm8Var) {
        lm8Var.i();
        return new c4(lm8Var.e(6), lm8Var.e(6), lm8Var.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hx7 w(defpackage.lm8 r19, boolean r20, int r21, defpackage.hx7 r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.e(r5)
            boolean r8 = r0.d()
            r9 = 5
            int r9 = r0.e(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.d()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.e(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.e(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.d()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.d()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.j(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.j(r6)
        L7b:
            hx7 r12 = new hx7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.w(lm8, boolean, int, hx7):hx7");
    }

    public static r95 x(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4;
        int max;
        int max2;
        int i5 = i2 + 2;
        while (true) {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0 || i3 <= i5) {
                break;
            }
        }
        if (b2 != 0 && i3 > i5) {
            lm8 lm8Var = new lm8(bArr, i5, i3 + 1);
            while (lm8Var.b(16)) {
                int e2 = lm8Var.e(8);
                int i6 = 0;
                while (e2 == 255) {
                    i6 += 255;
                    e2 = lm8Var.e(8);
                }
                int i7 = i6 + e2;
                int e3 = lm8Var.e(8);
                int i8 = 0;
                while (e3 == 255) {
                    i8 += 255;
                    e3 = lm8Var.e(8);
                }
                int i9 = i8 + e3;
                if (i9 != 0 && lm8Var.b(i9)) {
                    if (i7 == 176) {
                        int f2 = lm8Var.f();
                        boolean d2 = lm8Var.d();
                        if (d2) {
                            i4 = lm8Var.f();
                        } else {
                            i4 = 0;
                        }
                        int f3 = lm8Var.f();
                        int i10 = -1;
                        for (int i11 = 0; i11 <= f3; i11++) {
                            i10 = lm8Var.f();
                            lm8Var.f();
                            int e4 = lm8Var.e(6);
                            if (e4 != 63) {
                                if (e4 == 0) {
                                    max = Math.max(0, f2 - 30);
                                } else {
                                    max = Math.max(0, (e4 + f2) - 31);
                                }
                                lm8Var.e(max);
                                if (d2) {
                                    int e5 = lm8Var.e(6);
                                    if (e5 != 63) {
                                        if (e5 == 0) {
                                            max2 = Math.max(0, i4 - 30);
                                        } else {
                                            max2 = Math.max(0, (e5 + i4) - 31);
                                        }
                                        lm8Var.e(max2);
                                    } else {
                                        return null;
                                    }
                                }
                                if (lm8Var.d()) {
                                    lm8Var.j(10);
                                }
                            } else {
                                return null;
                            }
                        }
                        return new r95(i10, 3);
                    }
                    lm8Var.j(i9 * 8);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kx7 y(byte[] r32, int r33, int r34, defpackage.oaa r35) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.y(byte[], int, int, oaa):kx7");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oaa z(byte[] r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.z(byte[], int, int):oaa");
    }
}
