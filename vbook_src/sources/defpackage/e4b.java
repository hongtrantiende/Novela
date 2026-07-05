package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e4b  reason: default package */
/* loaded from: classes3.dex */
public abstract class e4b {
    public static final boolean[] a;
    public static final boolean[] b;

    static {
        boolean[] zArr = new boolean[256];
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            zArr[c] = true;
        }
        for (char c2 = 'a'; c2 < '{'; c2 = (char) (c2 + 1)) {
            zArr[c2] = true;
        }
        zArr[58] = true;
        zArr[95] = true;
        for (int i = 192; i < 215; i++) {
            zArr[i] = true;
        }
        for (int i2 = 216; i2 < 247; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 248; i3 < 256; i3++) {
            zArr[i3] = true;
        }
        a = zArr;
        boolean[] zArr2 = new boolean[256];
        for (char c3 = 'A'; c3 < '['; c3 = (char) (c3 + 1)) {
            zArr2[c3] = true;
        }
        for (char c4 = 'a'; c4 < '{'; c4 = (char) (c4 + 1)) {
            zArr2[c4] = true;
        }
        for (char c5 = '0'; c5 < ':'; c5 = (char) (c5 + 1)) {
            zArr2[c5] = true;
        }
        zArr2[58] = true;
        zArr2[95] = true;
        zArr2[45] = true;
        zArr2[46] = true;
        zArr2[183] = true;
        for (int i4 = 192; i4 < 215; i4++) {
            zArr2[i4] = true;
        }
        for (int i5 = 216; i5 < 256; i5++) {
            zArr2[i5] = true;
        }
        b = zArr2;
    }

    public static final boolean a(char c) {
        if (c < 256) {
            return b[c];
        }
        if ((256 > c || c >= 8192) && c != 8204 && c != 8205 && c != 8255 && c != 8256) {
            if (8304 > c || c >= 8592) {
                if (11264 > c || c >= 12272) {
                    if (12289 > c || c >= 57344) {
                        if (63744 > c || c >= 64976) {
                            if (65008 > c || c >= 65534) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean b(char c) {
        if (c < 256) {
            return a[c];
        }
        if (256 > c || c >= 768) {
            if ((880 > c || c >= 8192) && c != 8204 && c != 8205) {
                if (8304 > c || c >= 8592) {
                    if (11264 > c || c >= 12272) {
                        if (12289 > c || c >= 55296) {
                            if (63744 > c || c >= 64976) {
                                if (65008 > c || c >= 65534) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
