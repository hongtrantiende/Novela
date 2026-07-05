package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y5b  reason: default package */
/* loaded from: classes.dex */
public abstract class y5b {
    public static final int[] a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final x5b n;

    static {
        a = r0;
        int[] iArr = {iArr[0] | 1, iArr[1] | 1, iArr[2] | 1, iArr[3] | 1, iArr[4] | 8, iArr[5] | 8, iArr[6] | 8, iArr[7] | 8, 3 | iArr[8], iArr[9] | 8, iArr[10] | 8, iArr[11] | 8, iArr[12] | 8, iArr[13] | 8, iArr[14] | 8, iArr[15] | 8, iArr[16] | 8, iArr[17] | 8, iArr[18] | 8, iArr[19] | 8, iArr[20] | 8, iArr[21] | 4, iArr[22] | 4, iArr[23] | 4, iArr[24] | 4, iArr[25] | 4, iArr[26] | 4, iArr[27] | 4, iArr[28] | 4, iArr[29] | 4, iArr[30] | 4, iArr[31] | 4, iArr[32] | 4, 0, iArr[34] | 2, iArr[35] | 2, iArr[36] | 2, iArr[37] | 32, iArr[38] | 48, iArr[39] | 48, iArr[40] | 48, iArr[41] | 48, iArr[42] | 48, iArr[43] | 48, iArr[44] | 48, iArr[45] | 48, iArr[46] | 48, iArr[47] | 48, iArr[48] | 48, iArr[49] | 48, iArr[50] | 2, iArr[51] | 2, iArr[52] | 2, iArr[53] | 2, iArr[54] | 4, iArr[55] | 2, iArr[56] | 2, iArr[57] | 32, iArr[58] | 48, iArr[59] | 48, iArr[60] | 48};
        b = f(1);
        c = f(8);
        d = f(2);
        e = f(4);
        f = f(32);
        g = f(16);
        h = d(1);
        i = d(8);
        j = d(2);
        k = d(4);
        l = d(32);
        m = d(16);
        n = new x5b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0562, code lost:
        if (r7 < r28) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0585, code lost:
        if (r7 < r28) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0587, code lost:
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0589, code lost:
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0597, code lost:
        if (r7 < r25) goto L233;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.x5b r29, defpackage.x5b r30, defpackage.rwa r31, long r32, int r34, defpackage.x5b r35) {
        /*
            Method dump skipped, instructions count: 2747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5b.a(x5b, x5b, rwa, long, int, x5b):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r7 < 0.5f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r7 < 0.5f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hy0 b(defpackage.hy0 r1, long r2, defpackage.hy0 r4, long r5, float r7) {
        /*
            r0 = 0
            if (r1 != 0) goto L6
            if (r4 != 0) goto L6
            return r0
        L6:
            if (r1 != 0) goto Le
            esa r1 = new esa
            r1.<init>(r2)
            goto L15
        Le:
            if (r4 != 0) goto L15
            esa r4 = new esa
            r4.<init>(r5)
        L15:
            boolean r2 = r1.equals(r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L22
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L47
            goto L45
        L22:
            boolean r2 = r1 instanceof defpackage.m06
            if (r2 == 0) goto L2e
            r2 = r1
            m06 r2 = (defpackage.m06) r2
            java.lang.Object r2 = r2.b(r4, r7)
            goto L2f
        L2e:
            r2 = r0
        L2f:
            if (r2 != 0) goto L3f
            boolean r5 = r4 instanceof defpackage.m06
            if (r5 == 0) goto L3f
            r2 = r4
            m06 r2 = (defpackage.m06) r2
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r7
            java.lang.Object r2 = r2.b(r1, r5)
        L3f:
            if (r2 != 0) goto L48
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L47
        L45:
            r2 = r1
            goto L48
        L47:
            r2 = r4
        L48:
            boolean r3 = r2 instanceof defpackage.hy0
            if (r3 == 0) goto L4f
            r0 = r2
            hy0 r0 = (defpackage.hy0) r0
        L4f:
            if (r0 != 0) goto L5a
            double r2 = (double) r7
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L59
            return r1
        L59:
            return r4
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5b.b(hy0, long, hy0, long, float):hy0");
    }

    public static final Object c(Object obj, Object obj2, float f2) {
        lea[] leaVarArr;
        lea[] leaVarArr2;
        lea leaVar;
        lea leaVar2;
        lea leaVar3 = null;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            if (obj instanceof lea) {
                leaVar = (lea) obj;
            } else {
                leaVar = null;
            }
            if (obj2 instanceof lea) {
                leaVar2 = (lea) obj2;
            } else {
                leaVar2 = null;
            }
            if (leaVar == null && leaVar2 == null) {
                return null;
            }
            if (leaVar == null) {
                leaVar2.getClass();
                return ch0.r(new lea(leaVar2.a, zl1.h, leaVar2.b, leaVar2.c, leaVar2.g, leaVar2.d), leaVar2, f2);
            } else if (leaVar2 == null) {
                return ch0.r(leaVar, new lea(leaVar.a, zl1.h, leaVar.b, leaVar.c, leaVar.g, leaVar.d), f2);
            } else {
                return ch0.r(leaVar, leaVar2, f2);
            }
        }
        int i2 = 0;
        if (z) {
            leaVarArr = (lea[]) obj;
        } else {
            obj.getClass();
            leaVarArr = new lea[]{obj};
        }
        if (z2) {
            leaVarArr2 = (lea[]) obj2;
        } else {
            obj2.getClass();
            leaVarArr2 = new lea[]{obj2};
        }
        int max = Math.max(leaVarArr.length, leaVarArr2.length);
        lea[] leaVarArr3 = new lea[max];
        for (int i3 = 0; i3 < max; i3++) {
            leaVarArr3[i3] = null;
        }
        while (i2 < max) {
            lea leaVar4 = (lea) b00.q0(i2, leaVarArr);
            lea leaVar5 = (lea) b00.q0(i2, leaVarArr2);
            if (leaVar4 != null || leaVar5 != null) {
                if (leaVar4 == null) {
                    leaVar5.getClass();
                    leaVar3 = ch0.r(new lea(leaVar5.a, zl1.h, leaVar5.b, leaVar5.c, leaVar5.g, leaVar5.d), leaVar5, f2);
                } else {
                    if (leaVar5 == null) {
                        leaVar5 = new lea(leaVar4.a, zl1.h, leaVar4.b, leaVar4.c, leaVar4.g, leaVar4.d);
                    }
                    leaVar3 = ch0.r(leaVar4, leaVar5, f2);
                }
            }
            leaVarArr3[i2] = leaVar3;
            i2++;
            leaVar3 = null;
        }
        return leaVarArr3;
    }

    public static final int d(int i2) {
        int i3 = 0;
        for (int i4 = 50; i4 < 61; i4++) {
            if ((a[i4] & i2) != 0) {
                i3 |= 1 << (i4 - 50);
            }
        }
        return i3;
    }

    public static final int e(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if ((h & i2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i & i2) != 0) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i9 = i3 | i4;
        if ((j & i2) != 0) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        int i10 = i9 | i5;
        if ((k & i2) != 0) {
            i6 = 4;
        } else {
            i6 = 0;
        }
        int i11 = i10 | i6;
        if ((l & i2) != 0) {
            i7 = 32;
        } else {
            i7 = 0;
        }
        int i12 = i11 | i7;
        if ((i2 & m) != 0) {
            i8 = 16;
        }
        return i12 | i8;
    }

    public static final long f(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            if ((a[i3] & i2) != 0) {
                j2 |= 1 << ((byte) i3);
            }
        }
        return j2;
    }

    public static final int g(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if ((b & j2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((c & j2) != 0) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        int i8 = i2 | i3;
        if ((d & j2) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        int i9 = i8 | i4;
        if ((e & j2) != 0) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        int i10 = i9 | i5;
        if ((f & j2) != 0) {
            i6 = 32;
        } else {
            i6 = 0;
        }
        int i11 = i10 | i6;
        if ((j2 & g) != 0) {
            i7 = 16;
        }
        return i11 | i7;
    }

    public static final int h(int i2, long j2) {
        if ((257698037760L & j2) != 0) {
            if ((34359738368L & j2) != 0) {
                i2 |= 1;
            }
            if ((137438953472L & j2) != 0) {
                i2 |= Token.CASE;
            }
            if ((17179869184L & j2) != 0) {
                i2 |= 2;
            }
            if ((j2 & 68719476736L) != 0) {
                return i2 | 4;
            }
            return i2;
        }
        return i2;
    }

    public static final long i(int i2, long j2) {
        if ((i2 & Token.VAR) != 0) {
            if ((i2 & 1) != 0) {
                j2 |= 34359738368L;
            }
            if ((i2 & Token.CASE) != 0) {
                j2 |= 137438953472L;
            }
            if ((i2 & 2) != 0) {
                j2 |= 17179869184L;
            }
            if ((i2 & 4) != 0) {
                return j2 | 68719476736L;
            }
        }
        return j2;
    }
}
