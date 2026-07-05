package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fv7  reason: default package */
/* loaded from: classes.dex */
public final class fv7 {
    public long[] a = tz9.a;
    public Object[] b = ipe.d;
    public float[] c = aj4.a;
    public int d;
    public int e;
    public int f;

    public fv7(int i) {
        if (i >= 0) {
            d(tz9.d(i));
        } else {
            vs.m("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int b(Object obj) {
        int i;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & Token.SWITCH;
        int i6 = this.d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i6;
                if (c16.i(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final float c(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return this.c[b];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, tz9.c(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = tz9.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.f = tz9.a(this.d) - this.e;
        this.b = new Object[i2];
        this.c = new float[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
        if (r37.f != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
        if (((r37.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
        if (r2 <= 8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
        if (java.lang.Long.compare((r37.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ca, code lost:
        r2 = r37.a;
        r3 = r37.d;
        r5 = r37.b;
        r6 = r37.c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
        if (r7 >= r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f7, code lost:
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = defpackage.b00.p0(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0116, code lost:
        if (r7 == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0118, code lost:
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0125, code lost:
        if (r9 != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0127, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012c, code lost:
        if (r9 == 254) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012f, code lost:
        r9 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0131, code lost:
        if (r9 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0133, code lost:
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0138, code lost:
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
        r9 = r9 * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = a(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0152, code lost:
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0154, code lost:
        r32 = r15;
        r2[r8] = ((r9 & org.mozilla.javascript.Token.SWITCH) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0179, code lost:
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018b, code lost:
        if (((r14 >> r12) & r27) != 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018d, code lost:
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & org.mozilla.javascript.Token.SWITCH) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = null;
        r34[r13] = r34[r7];
        r34[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b9, code lost:
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & org.mozilla.javascript.Token.SWITCH) << r12) | ((~(r27 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01da, code lost:
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f3, code lost:
        r18 = r14;
        r32 = r15;
        r37.f = defpackage.tz9.a(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0206, code lost:
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0211, code lost:
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0214, code lost:
        r2 = defpackage.tz9.b(r37.d);
        r3 = r37.a;
        r5 = r37.b;
        r6 = r37.c;
        r7 = r37.d;
        d(r2);
        r2 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r10 = r37.d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022f, code lost:
        if (r11 >= r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023e, code lost:
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0240, code lost:
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0242, code lost:
        if (r12 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0244, code lost:
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0249, code lost:
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x024b, code lost:
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r15 = r2;
        r1 = r13 & org.mozilla.javascript.Token.SWITCH;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0281, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0282, code lost:
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0288, code lost:
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028c, code lost:
        r37.e++;
        r1 = r37.f;
        r3 = r37.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a4, code lost:
        if (((r5 >> r7) & r27) != r19) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a6, code lost:
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a8, code lost:
        r37.f = r1 - r32;
        r1 = r37.d;
        r5 = (r5 & (~(r27 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.mr r38, float r39) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv7.e(mr, float):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fv7)) {
            return false;
        }
        fv7 fv7Var = (fv7) obj;
        if (fv7Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            float f = fArr[i4];
                            int b = fv7Var.b(obj2);
                            if (b < 0 || f != fv7Var.c[b]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        float f = fArr[i6];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += Float.hashCode(f) ^ i;
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
