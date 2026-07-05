package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah0  reason: default package */
/* loaded from: classes3.dex */
public class ah0 {
    public static final yg0 f;
    public static final byte[] g;
    public static final ah0 h;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final zg0 d;
    public final int e;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg0, ah0] */
    static {
        zg0 zg0Var = zg0.a;
        f = new ah0(false, false, -1, zg0Var);
        g = new byte[]{13, 10};
        h = new ah0(true, false, -1, zg0Var);
        new ah0(false, true, 76, zg0Var);
        new ah0(false, true, 64, zg0Var);
    }

    public ah0(boolean z, boolean z2, int i, zg0 zg0Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = zg0Var;
        if (z && z2) {
            vs.m("Failed requirement.");
            throw null;
        } else {
            this.e = i / 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(defpackage.ah0 r20, java.lang.CharSequence r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.a(ah0, java.lang.CharSequence, int, int):byte[]");
    }

    public static String b(ah0 ah0Var, byte[] bArr) {
        byte[] bArr2;
        int i;
        int i2;
        int length = bArr.length;
        ah0Var.getClass();
        zg0 zg0Var = ah0Var.d;
        ube.s(0, length, bArr.length);
        int c = ah0Var.c(length);
        byte[] bArr3 = new byte[c];
        ube.s(0, length, bArr.length);
        int c2 = ah0Var.c(length);
        if (c >= 0) {
            if (c2 >= 0 && c2 <= c) {
                if (ah0Var.a) {
                    bArr2 = dh0.c;
                } else {
                    bArr2 = dh0.a;
                }
                if (ah0Var.b) {
                    i = ah0Var.e;
                } else {
                    i = Integer.MAX_VALUE;
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2 = i3 + 2;
                    if (i2 >= length) {
                        break;
                    }
                    int min = Math.min((length - i3) / 3, i);
                    for (int i5 = 0; i5 < min; i5++) {
                        int i6 = i3 + 2;
                        i3 += 3;
                        int i7 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i6] & 255);
                        bArr3[i4] = bArr2[i7 >>> 18];
                        bArr3[i4 + 1] = bArr2[(i7 >>> 12) & 63];
                        int i8 = i4 + 3;
                        bArr3[i4 + 2] = bArr2[(i7 >>> 6) & 63];
                        i4 += 4;
                        bArr3[i8] = bArr2[i7 & 63];
                    }
                    if (min == i && i3 != length) {
                        int i9 = i4 + 1;
                        byte[] bArr4 = g;
                        bArr3[i4] = bArr4[0];
                        i4 += 2;
                        bArr3[i9] = bArr4[1];
                    }
                }
                int i10 = length - i3;
                zg0 zg0Var2 = zg0.c;
                zg0 zg0Var3 = zg0.a;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
                        bArr3[i4] = bArr2[i11 >>> 12];
                        int i12 = i4 + 2;
                        bArr3[i4 + 1] = bArr2[(i11 >>> 6) & 63];
                        int i13 = i4 + 3;
                        bArr3[i12] = bArr2[i11 & 63];
                        if (zg0Var == zg0Var3 || zg0Var == zg0Var2) {
                            bArr3[i13] = 61;
                        }
                        i3 = i2;
                    }
                } else {
                    int i14 = i3 + 1;
                    int i15 = (bArr[i3] & 255) << 4;
                    bArr3[i4] = bArr2[i15 >>> 6];
                    int i16 = i4 + 2;
                    bArr3[i4 + 1] = bArr2[i15 & 63];
                    if (zg0Var == zg0Var3 || zg0Var == zg0Var2) {
                        bArr3[i16] = 61;
                        bArr3[i4 + 3] = 61;
                    }
                    i3 = i14;
                }
                if (i3 == length) {
                    return new String(bArr3, ed1.c);
                }
                vs.k("Check failed.");
                return null;
            }
            cy7.k(rs8.k("The destination array does not have enough capacity, destination offset: 0, destination size: ", c, c2, ", capacity needed: "));
            return null;
        }
        cy7.k(a82.j(c, "destination offset: 0, destination size: "));
        return null;
    }

    public final int c(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int i5 = i2 * 4;
        if (i3 != 0) {
            zg0 zg0Var = zg0.a;
            zg0 zg0Var2 = this.d;
            if (zg0Var2 != zg0Var && zg0Var2 != zg0.c) {
                i4 = i3 + 1;
            }
            i5 += i4;
        }
        if (i5 >= 0) {
            if (this.b) {
                i5 = hl5.b(i5 - 1, this.c, 2, i5);
            }
            if (i5 >= 0) {
                return i5;
            }
            vs.m("Input is too big");
            return 0;
        }
        vs.m("Input is too big");
        return 0;
    }
}
