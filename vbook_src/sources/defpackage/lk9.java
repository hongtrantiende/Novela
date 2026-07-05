package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lk9  reason: default package */
/* loaded from: classes.dex */
public abstract class lk9 {
    public static final gm9 a = new gm9("\u0000+$");
    public static final gm9 b = new gm9("\u0000+");

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9 A[Catch: all -> 0x0218, TryCatch #0 {all -> 0x0218, blocks: (B:85:0x01ca, B:87:0x01d2, B:89:0x01d7, B:91:0x01dd, B:93:0x01e4, B:95:0x01eb, B:97:0x01f0, B:98:0x01f4, B:99:0x01f6, B:101:0x01f9, B:102:0x01fb, B:104:0x0202, B:105:0x0205, B:107:0x020a, B:109:0x0210), top: B:114:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0202 A[Catch: all -> 0x0218, TryCatch #0 {all -> 0x0218, blocks: (B:85:0x01ca, B:87:0x01d2, B:89:0x01d7, B:91:0x01dd, B:93:0x01e4, B:95:0x01eb, B:97:0x01f0, B:98:0x01f4, B:99:0x01f6, B:101:0x01f9, B:102:0x01fb, B:104:0x0202, B:105:0x0205, B:107:0x020a, B:109:0x0210), top: B:114:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020a A[Catch: all -> 0x0218, TryCatch #0 {all -> 0x0218, blocks: (B:85:0x01ca, B:87:0x01d2, B:89:0x01d7, B:91:0x01dd, B:93:0x01e4, B:95:0x01eb, B:97:0x01f0, B:98:0x01f4, B:99:0x01f6, B:101:0x01f9, B:102:0x01fb, B:104:0x0202, B:105:0x0205, B:107:0x020a, B:109:0x0210), top: B:114:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0218 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4 A[Catch: all -> 0x0218, TryCatch #0 {all -> 0x0218, blocks: (B:85:0x01ca, B:87:0x01d2, B:89:0x01d7, B:91:0x01dd, B:93:0x01e4, B:95:0x01eb, B:97:0x01f0, B:98:0x01f4, B:99:0x01f6, B:101:0x01f9, B:102:0x01fb, B:104:0x0202, B:105:0x0205, B:107:0x020a, B:109:0x0210), top: B:114:0x01ca }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yv a(java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk9.a(java.util.ArrayList):yv");
    }

    public static final ph5 b(byte[] bArr, int i) {
        int i2 = i + 2;
        if (i2 > bArr.length) {
            return new ph5("", bArr.length);
        }
        int o = vae.o(bArr, i);
        int i3 = o * 2;
        int i4 = i2 + i3;
        if (o != 0 && i4 <= bArr.length) {
            return new ph5(vae.h(bArr, i2, i3), i4);
        }
        return new ph5("", i2);
    }

    public static final ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > bArr.length || arrayList.size() >= 500000) {
                break;
            }
            long p = vae.p(bArr, i);
            int i3 = (int) (p & 1023);
            int i4 = (int) (1023 & (p >> 10));
            int i5 = (int) ((p >> 20) & 4095);
            if (i5 == 4095) {
                int i6 = i + 8;
                if (i6 > bArr.length) {
                    break;
                }
                i5 = (int) vae.p(bArr, i2);
                i2 = i6;
            }
            i = i2 + i5;
            if (i > bArr.length) {
                break;
            }
            arrayList.add(new cj5(b00.d0(bArr, i2, i), i3, i4));
        }
        return arrayList;
    }
}
