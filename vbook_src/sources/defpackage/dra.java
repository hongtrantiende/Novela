package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dra  reason: default package */
/* loaded from: classes.dex */
public abstract class dra {
    public static final eja a = new eja(22);
    public static final yx9 b = new yx9(5, (byte) 0);
    public static final Object c = new Object();
    public static cra d;
    public static long e;
    public static final ui5 f;
    public static final kj g;
    public static List h;
    public static List i;
    public static final lz4 j;
    public static final z30 k;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.concurrent.atomic.AtomicInteger, z30] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ui5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kj] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [lz4, yv7, zqa] */
    static {
        cra craVar = cra.e;
        d = craVar;
        e = 2L;
        ?? obj = new Object();
        obj.c = new long[16];
        obj.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        obj.e = iArr;
        f = obj;
        ?? obj2 = new Object();
        obj2.b = new int[16];
        obj2.c = new qfd[16];
        g = obj2;
        ks3 ks3Var = ks3.a;
        h = ks3Var;
        i = ks3Var;
        long j2 = e;
        e = 1 + j2;
        ?? yv7Var = new yv7(j2, craVar, null, new tn4(4));
        d = d.e(yv7Var.b);
        j = yv7Var;
        k = new AtomicInteger(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, yv7 yv7Var, cra craVar) {
        long[] jArr;
        cra craVar2;
        long[] jArr2;
        cra craVar3;
        int i2;
        int i3;
        kza s;
        uv7 x = yv7Var.x();
        if (x != null) {
            long g2 = yv7Var.g();
            cra d2 = yv7Var.d().e(g2).d(yv7Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                iza izaVar = (iza) objArr[(i4 << 3) + i7];
                                kza a2 = izaVar.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                kza s2 = s(a2, j2, craVar);
                                if (s2 != null && (s = s(a2, g2, d2)) != null && !s2.equals(s)) {
                                    craVar3 = d2;
                                    kza s3 = s(a2, g2, yv7Var.d());
                                    if (s3 != null) {
                                        kza b2 = izaVar.b(s, s2, s3);
                                        if (b2 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s2, b2);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                } else {
                                    craVar3 = d2;
                                }
                            } else {
                                jArr2 = jArr3;
                                craVar3 = d2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            d2 = craVar3;
                        }
                        jArr = jArr3;
                        craVar2 = d2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        craVar2 = d2;
                    }
                    if (i4 != length) {
                        i4++;
                        jArr3 = jArr;
                        d2 = craVar2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void c(zqa zqaVar) {
        yv7 yv7Var;
        Object obj;
        long j2;
        Long valueOf;
        if (!d.c(zqaVar.g())) {
            long g2 = zqaVar.g();
            boolean z = zqaVar.c;
            if (zqaVar instanceof yv7) {
                yv7Var = (yv7) zqaVar;
            } else {
                yv7Var = null;
            }
            if (yv7Var != null) {
                obj = Boolean.valueOf(yv7Var.m);
            } else {
                obj = "read-only";
            }
            synchronized (c) {
                ui5 ui5Var = f;
                if (ui5Var.a > 0) {
                    j2 = ((long[]) ui5Var.c)[0];
                } else {
                    j2 = -1;
                }
                valueOf = Long.valueOf(j2);
            }
            throw new IllegalStateException(("Snapshot is not open: snapshotId=" + g2 + ", disposed=" + z + ", applied=" + obj + ", lowestPin=" + valueOf).toString());
        }
    }

    public static final cra d(cra craVar, long j2, long j3) {
        while (c16.m(j2, j3) < 0) {
            craVar = craVar.e(j2);
            j2++;
        }
        return craVar;
    }

    public static final Object e(xt4 xt4Var) {
        uv7 uv7Var;
        Object v;
        lz4 lz4Var = j;
        synchronized (c) {
            try {
                uv7Var = lz4Var.h;
                if (uv7Var != null) {
                    k.addAndGet(1);
                }
                v = v(lz4Var, xt4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (uv7Var != null) {
            try {
                List list = h;
                vz9 vz9Var = new vz9(uv7Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((lu4) list.get(i2)).invoke(vz9Var, lz4Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (uv7Var != null) {
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((iza) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v;
    }

    public static final void f() {
        kj kjVar = g;
        int i2 = kjVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            qfd qfdVar = ((qfd[]) kjVar.c)[i3];
            if (qfdVar != null) {
                obj = qfdVar.get();
            }
            if (obj != null && p((iza) obj)) {
                if (i4 != i3) {
                    ((qfd[]) kjVar.c)[i4] = qfdVar;
                    int[] iArr = (int[]) kjVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((qfd[]) kjVar.c)[i5] = null;
            ((int[]) kjVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            kjVar.a = i4;
        }
    }

    public static final zqa g(zqa zqaVar, xt4 xt4Var, boolean z) {
        yv7 yv7Var;
        boolean z2 = zqaVar instanceof yv7;
        if (!z2 && zqaVar != null) {
            return new dnc(zqaVar, xt4Var, false, z);
        }
        if (z2) {
            yv7Var = (yv7) zqaVar;
        } else {
            yv7Var = null;
        }
        return new cnc(yv7Var, xt4Var, null, false, z);
    }

    public static final kza h(kza kzaVar) {
        kza s;
        zqa j2 = j();
        kza s2 = s(kzaVar, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                zqa j3 = j();
                s = s(kzaVar, j3.g(), j3.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final kza i(kza kzaVar, zqa zqaVar) {
        kza s;
        kza s2 = s(kzaVar, zqaVar.g(), zqaVar.d());
        if (s2 == null) {
            synchronized (c) {
                s = s(kzaVar, zqaVar.g(), zqaVar.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final zqa j() {
        zqa zqaVar = (zqa) b.get();
        if (zqaVar == null) {
            return j;
        }
        return zqaVar;
    }

    public static final xt4 k(xt4 xt4Var, xt4 xt4Var2, boolean z) {
        if (!z) {
            xt4Var2 = null;
        }
        if (xt4Var != null && xt4Var2 != null && xt4Var != xt4Var2) {
            return new xw1(xt4Var, xt4Var2, 4);
        }
        if (xt4Var == null) {
            return xt4Var2;
        }
        return xt4Var;
    }

    public static final xt4 l(xt4 xt4Var, xt4 xt4Var2) {
        if (xt4Var != null && xt4Var2 != null && xt4Var != xt4Var2) {
            return new xw1(xt4Var, xt4Var2, 5);
        }
        if (xt4Var == null) {
            return xt4Var2;
        }
        return xt4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kza m(defpackage.kza r10, defpackage.iza r11) {
        /*
            kza r0 = r11.a()
            long r1 = defpackage.dra.e
            ui5 r3 = defpackage.dra.f
            int r4 = r3.a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.c16.m(r5, r1)
            if (r7 > 0) goto L48
            cra r7 = defpackage.cra.e
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.c16.m(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            kza r0 = r0.b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.a = r0
            return r3
        L55:
            kza r10 = r10.c(r0)
            kza r0 = r11.a()
            r10.b = r0
            r11.e(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dra.m(kza, iza):kza");
    }

    public static final void n(zqa zqaVar, iza izaVar) {
        zqaVar.t(zqaVar.h() + 1);
        xt4 i2 = zqaVar.i();
        if (i2 != null) {
            i2.invoke(izaVar);
        }
    }

    public static final kza o(kza kzaVar, jza jzaVar, zqa zqaVar, kza kzaVar2) {
        kza m;
        if (zqaVar.f()) {
            zqaVar.n(jzaVar);
        }
        long g2 = zqaVar.g();
        if (kzaVar2.a == g2) {
            return kzaVar2;
        }
        synchronized (c) {
            m = m(kzaVar, jzaVar);
        }
        m.a = g2;
        if (kzaVar2.a != 1) {
            zqaVar.n(jzaVar);
        }
        return m;
    }

    public static final boolean p(iza izaVar) {
        kza kzaVar;
        long j2 = e;
        ui5 ui5Var = f;
        if (ui5Var.a > 0) {
            j2 = ((long[]) ui5Var.c)[0];
        }
        kza kzaVar2 = null;
        kza kzaVar3 = null;
        int i2 = 0;
        for (kza a2 = izaVar.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (c16.m(j3, j2) < 0) {
                    if (kzaVar2 == null) {
                        i2++;
                        kzaVar2 = a2;
                    } else {
                        if (c16.m(a2.a, kzaVar2.a) < 0) {
                            kzaVar = kzaVar2;
                            kzaVar2 = a2;
                        } else {
                            kzaVar = a2;
                        }
                        if (kzaVar3 == null) {
                            kzaVar3 = izaVar.a();
                            kza kzaVar4 = kzaVar3;
                            while (true) {
                                if (kzaVar3 != null) {
                                    if (c16.m(kzaVar3.a, j2) >= 0) {
                                        break;
                                    }
                                    if (c16.m(kzaVar4.a, kzaVar3.a) < 0) {
                                        kzaVar4 = kzaVar3;
                                    }
                                    kzaVar3 = kzaVar3.b;
                                } else {
                                    kzaVar3 = kzaVar4;
                                    break;
                                }
                            }
                        }
                        kzaVar2.a = 0L;
                        kzaVar2.a(kzaVar3);
                        kzaVar2 = kzaVar;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(iza izaVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (p(izaVar)) {
            kj kjVar = g;
            int i2 = kjVar.a;
            int identityHashCode = System.identityHashCode(izaVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = kjVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) kjVar.b)[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            qfd qfdVar = ((qfd[]) kjVar.c)[i6];
                            if (qfdVar != null) {
                                obj = qfdVar.get();
                            } else {
                                obj = null;
                            }
                            if (izaVar != obj) {
                                for (int i8 = i6 - 1; -1 < i8 && ((int[]) kjVar.b)[i8] == identityHashCode; i8--) {
                                    qfd qfdVar2 = ((qfd[]) kjVar.c)[i8];
                                    if (qfdVar2 != null) {
                                        obj3 = qfdVar2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == izaVar) {
                                        i3 = i8;
                                        break;
                                    }
                                }
                                i6++;
                                int i9 = kjVar.a;
                                while (true) {
                                    if (i6 < i9) {
                                        if (((int[]) kjVar.b)[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        }
                                        qfd qfdVar3 = ((qfd[]) kjVar.c)[i6];
                                        if (qfdVar3 != null) {
                                            obj2 = qfdVar3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == izaVar) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        i3 = -(kjVar.a + 1);
                                        break;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            qfd[] qfdVarArr = (qfd[]) kjVar.c;
            int length = qfdVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                qfd[] qfdVarArr2 = new qfd[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(qfdVarArr, i10, qfdVarArr2, i12, i2 - i10);
                System.arraycopy((qfd[]) kjVar.c, 0, qfdVarArr2, 0, i10);
                b00.V(i12, i10, i2, (int[]) kjVar.b, iArr);
                b00.Z(0, i10, 6, (int[]) kjVar.b, iArr);
                kjVar.c = qfdVarArr2;
                kjVar.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(qfdVarArr, i10, qfdVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) kjVar.b;
                b00.V(i13, i10, i2, iArr2, iArr2);
            }
            ((qfd[]) kjVar.c)[i10] = new WeakReference(izaVar);
            ((int[]) kjVar.b)[i10] = identityHashCode;
            kjVar.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final kza s(kza kzaVar, long j2, cra craVar) {
        kza kzaVar2 = null;
        while (kzaVar != null) {
            long j3 = kzaVar.a;
            if (j3 != 0 && c16.m(j3, j2) <= 0 && !craVar.c(j3) && (kzaVar2 == null || c16.m(kzaVar2.a, kzaVar.a) < 0)) {
                kzaVar2 = kzaVar;
            }
            kzaVar = kzaVar.b;
        }
        if (kzaVar2 == null) {
            return null;
        }
        return kzaVar2;
    }

    public static final kza t(kza kzaVar, iza izaVar) {
        kza s;
        zqa j2 = j();
        xt4 e2 = j2.e();
        if (e2 != null) {
            e2.invoke(izaVar);
        }
        kza s2 = s(kzaVar, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                zqa j3 = j();
                kza a2 = izaVar.a();
                a2.getClass();
                s = s(a2, j3.g(), j3.d());
                if (s == null) {
                    r();
                    throw null;
                }
            }
            return s;
        }
        return s2;
    }

    public static final void u(int i2) {
        ui5 ui5Var = f;
        int i3 = ((int[]) ui5Var.e)[i2];
        ui5Var.i(i3, ui5Var.a - 1);
        ui5Var.a--;
        long[] jArr = (long[]) ui5Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (c16.m(jArr[i5], j2) <= 0) {
                break;
            }
            ui5Var.i(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) ui5Var.c;
        int i6 = ui5Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < ui5Var.a && c16.m(jArr2[i7], jArr2[i8]) < 0) {
                if (c16.m(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                ui5Var.i(i7, i3);
                i3 = i7;
            } else if (c16.m(jArr2[i8], jArr2[i3]) >= 0) {
                break;
            } else {
                ui5Var.i(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) ui5Var.e)[i2] = ui5Var.b;
        ui5Var.b = i2;
    }

    public static final Object v(lz4 lz4Var, xt4 xt4Var) {
        long j2 = lz4Var.b;
        Object invoke = xt4Var.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        cra b2 = d.b(j2);
        d = b2;
        lz4Var.b = j3;
        lz4Var.a = b2;
        lz4Var.g = 0;
        lz4Var.h = null;
        lz4Var.o();
        d = d.e(j3);
        return invoke;
    }

    public static final kza w(kza kzaVar, iza izaVar, zqa zqaVar) {
        kza s;
        kza s2;
        if (zqaVar.f()) {
            zqaVar.n(izaVar);
        }
        long g2 = zqaVar.g();
        kza s3 = s(kzaVar, g2, zqaVar.d());
        if (s3 == null) {
            synchronized (c) {
                zqa j2 = j();
                kza a2 = izaVar.a();
                a2.getClass();
                s2 = s(a2, j2.g(), j2.d());
                if (s2 == null) {
                    r();
                    throw null;
                }
            }
            s3 = s2;
        }
        if (s3.a == zqaVar.g()) {
            return s3;
        }
        synchronized (c) {
            s = s(izaVar.a(), g2, zqaVar.d());
            if (s != null) {
                if (s.a != g2) {
                    kza m = m(s, izaVar);
                    m.a(s);
                    m.a = zqaVar.g();
                    s = m;
                }
            } else {
                r();
                throw null;
            }
        }
        if (s3.a != 1) {
            zqaVar.n(izaVar);
        }
        return s;
    }
}
