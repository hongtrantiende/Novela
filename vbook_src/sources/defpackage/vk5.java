package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk5  reason: default package */
/* loaded from: classes.dex */
public final class vk5 extends jsc {
    public static final fb4 i = new fb4(29);
    public final tk5 h;

    public vk5(tk5 tk5Var) {
        this.h = tk5Var;
    }

    public static lv N(km8 km8Var, int i2, int i3) {
        int f0;
        String str;
        byte[] copyOfRange;
        int z = km8Var.z();
        Charset c0 = c0(z);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        km8Var.k(bArr, 0, i4);
        if (i3 == 2) {
            str = "image/" + kve.B(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            f0 = 2;
        } else {
            f0 = f0(bArr, 0);
            String B = kve.B(new String(bArr, 0, f0, StandardCharsets.ISO_8859_1));
            if (B.indexOf(47) == -1) {
                str = "image/".concat(B);
            } else {
                str = B;
            }
        }
        int i5 = bArr[f0 + 1] & 255;
        int i6 = f0 + 2;
        int e0 = e0(bArr, i6, z);
        String str2 = new String(bArr, i6, e0 - i6, c0);
        int b0 = b0(z) + e0;
        if (i4 <= b0) {
            copyOfRange = a2d.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, b0, i4);
        }
        return new lv(str, str2, i5, copyOfRange);
    }

    public static qb1 O(km8 km8Var, int i2, int i3, boolean z, int i4, tk5 tk5Var) {
        long j;
        int i5 = km8Var.b;
        int f0 = f0(km8Var.a, i5);
        String str = new String(km8Var.a, i5, f0 - i5, StandardCharsets.ISO_8859_1);
        km8Var.M(f0 + 1);
        int m = km8Var.m();
        int m2 = km8Var.m();
        long B = km8Var.B();
        if (B == 4294967295L) {
            B = -1;
        }
        long B2 = km8Var.B();
        if (B2 == 4294967295L) {
            j = -1;
        } else {
            j = B2;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (km8Var.b < i6) {
            wk5 R = R(i3, km8Var, z, i4, tk5Var);
            if (R != null) {
                arrayList.add(R);
            }
        }
        return new qb1(str, m, m2, B, j, (wk5[]) arrayList.toArray(new wk5[0]));
    }

    public static sb1 P(km8 km8Var, int i2, int i3, boolean z, int i4, tk5 tk5Var) {
        boolean z2;
        boolean z3;
        int i5 = km8Var.b;
        int f0 = f0(km8Var.a, i5);
        String str = new String(km8Var.a, i5, f0 - i5, StandardCharsets.ISO_8859_1);
        km8Var.M(f0 + 1);
        int z4 = km8Var.z();
        if ((z4 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z4 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int z5 = km8Var.z();
        String[] strArr = new String[z5];
        for (int i6 = 0; i6 < z5; i6++) {
            int i7 = km8Var.b;
            int f02 = f0(km8Var.a, i7);
            strArr[i6] = new String(km8Var.a, i7, f02 - i7, StandardCharsets.ISO_8859_1);
            km8Var.M(f02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (km8Var.b < i8) {
            wk5 R = R(i3, km8Var, z, i4, tk5Var);
            if (R != null) {
                arrayList.add(R);
            }
        }
        return new sb1(str, z2, z3, strArr, (wk5[]) arrayList.toArray(new wk5[0]));
    }

    public static gq1 Q(int i2, km8 km8Var) {
        if (i2 < 4) {
            return null;
        }
        int z = km8Var.z();
        Charset c0 = c0(z);
        byte[] bArr = new byte[3];
        km8Var.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        km8Var.k(bArr2, 0, i3);
        int e0 = e0(bArr2, 0, z);
        String str2 = new String(bArr2, 0, e0, c0);
        int b0 = b0(z) + e0;
        return new gq1(str, str2, V(bArr2, b0, e0(bArr2, b0, z), c0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b2, code lost:
        if (r5 == 67) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [km8] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wk5 R(int r19, defpackage.km8 r20, boolean r21, int r22, defpackage.tk5 r23) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk5.R(int, km8, boolean, int, tk5):wk5");
    }

    public static zw4 S(int i2, km8 km8Var) {
        byte[] copyOfRange;
        int z = km8Var.z();
        Charset c0 = c0(z);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        km8Var.k(bArr, 0, i3);
        int f0 = f0(bArr, 0);
        String p = lc7.p(new String(bArr, 0, f0, StandardCharsets.ISO_8859_1));
        int i4 = f0 + 1;
        int e0 = e0(bArr, i4, z);
        String V = V(bArr, i4, e0, c0);
        int b0 = b0(z) + e0;
        int e02 = e0(bArr, b0, z);
        String V2 = V(bArr, b0, e02, c0);
        int b02 = b0(z) + e02;
        if (i3 <= b02) {
            copyOfRange = a2d.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, b02, i3);
        }
        return new zw4(p, V, V2, copyOfRange);
    }

    public static xc7 T(int i2, km8 km8Var) {
        int G = km8Var.G();
        int C = km8Var.C();
        int C2 = km8Var.C();
        int z = km8Var.z();
        int z2 = km8Var.z();
        ea1 ea1Var = new ea1();
        ea1Var.k(km8Var);
        int i3 = ((i2 - 10) * 8) / (z + z2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int g = ea1Var.g(z);
            int g2 = ea1Var.g(z2);
            iArr[i4] = g;
            iArr2[i4] = g2;
        }
        return new xc7(G, C, C2, iArr, iArr2);
    }

    public static g69 U(int i2, km8 km8Var) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i2];
        km8Var.k(bArr, 0, i2);
        int f0 = f0(bArr, 0);
        String str = new String(bArr, 0, f0, StandardCharsets.ISO_8859_1);
        int i3 = f0 + 1;
        if (i2 <= i3) {
            copyOfRange = a2d.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i3, i2);
        }
        return new g69(str, copyOfRange);
    }

    public static String V(byte[] bArr, int i2, int i3, Charset charset) {
        if (i3 > i2 && i3 <= bArr.length) {
            return new String(bArr, i2, i3 - i2, charset);
        }
        return "";
    }

    public static sub W(int i2, km8 km8Var, String str) {
        if (i2 < 1) {
            return null;
        }
        int z = km8Var.z();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        km8Var.k(bArr, 0, i3);
        return new sub(str, null, X(bArr, z, 0));
    }

    public static mm9 X(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return qs5.r("");
        }
        ls5 i4 = qs5.i();
        int e0 = e0(bArr, i3, i2);
        while (i3 < e0) {
            i4.b(new String(bArr, i3, e0 - i3, c0(i2)));
            i3 = b0(i2) + e0;
            e0 = e0(bArr, i3, i2);
        }
        mm9 g = i4.g();
        if (g.isEmpty()) {
            return qs5.r("");
        }
        return g;
    }

    public static sub Y(int i2, km8 km8Var) {
        if (i2 < 1) {
            return null;
        }
        int z = km8Var.z();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        km8Var.k(bArr, 0, i3);
        int e0 = e0(bArr, 0, z);
        return new sub("TXXX", new String(bArr, 0, e0, c0(z)), X(bArr, z, b0(z) + e0));
    }

    public static zyc Z(int i2, km8 km8Var, String str) {
        byte[] bArr = new byte[i2];
        km8Var.k(bArr, 0, i2);
        return new zyc(str, null, new String(bArr, 0, f0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static zyc a0(int i2, km8 km8Var) {
        if (i2 < 1) {
            return null;
        }
        int z = km8Var.z();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        km8Var.k(bArr, 0, i3);
        int e0 = e0(bArr, 0, z);
        String str = new String(bArr, 0, e0, c0(z));
        int b0 = b0(z) + e0;
        return new zyc("WXXX", str, V(bArr, b0, f0(bArr, b0), StandardCharsets.ISO_8859_1));
    }

    public static int b0(int i2) {
        if (i2 != 0 && i2 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset c0(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String d0(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int e0(byte[] bArr, int i2, int i3) {
        int f0 = f0(bArr, i2);
        if (i3 != 0 && i3 != 3) {
            while (f0 < bArr.length - 1) {
                if ((f0 - i2) % 2 == 0 && bArr[f0 + 1] == 0) {
                    return f0;
                }
                f0 = f0(bArr, f0 + 1);
            }
            return bArr.length;
        }
        return f0;
    }

    public static int f0(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int g0(int i2, km8 km8Var) {
        byte[] bArr = km8Var.a;
        int i3 = km8Var.b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 < i3 + i2) {
                if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                    System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                    i2--;
                }
                i4 = i5;
            } else {
                return i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
        if ((r10 & org.mozilla.javascript.Token.CASE) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h0(defpackage.km8 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.m()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.B()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.G()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.C()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.C()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.M(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.M(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.M(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.M(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.N(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.M(r2)
            return r4
        Lb0:
            r1.M(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk5.h0(km8, int, int, boolean):boolean");
    }

    @Override // defpackage.jsc
    public final tb7 B(vb7 vb7Var, ByteBuffer byteBuffer) {
        return M(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tb7 M(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk5.M(byte[], int):tb7");
    }
}
