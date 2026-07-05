package okhttp3.internal.url;

import okhttp3.internal._UtilCommonKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class _UrlKt {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [my0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [my0, java.lang.Object] */
    public static String a(String str, int i, int i2, String str2, int i3) {
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = str.length();
        } else {
            i5 = i2;
        }
        if ((i3 & 8) != 0) {
            z = false;
        } else {
            z = true;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i3 & 32) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i3 & 64) == 0) {
            z4 = true;
        }
        str.getClass();
        int i6 = i4;
        while (i6 < i5) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 32;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !k4b.W(str2, (char) codePointAt) && ((codePointAt != 37 || (z && (!z2 || b(i6, i5, str)))) && (codePointAt != 43 || !z3)))) {
                i6 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.p1(i4, i6, str);
                ?? r2 = 0;
                while (i6 < i5) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        String str3 = "+";
                        if (codePointAt2 == i7 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.q1("+");
                        } else if (codePointAt2 == 43 && z3) {
                            if (!z) {
                                str3 = "%2B";
                            }
                            obj.q1(str3);
                        } else {
                            if (codePointAt2 >= i7 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z4) && !k4b.W(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z && (!z2 || b(i6, i5, str))))) {
                                    obj.r1(codePointAt2);
                                }
                            }
                            if (r2 == 0) {
                                r2 = new Object();
                            }
                            r2.r1(codePointAt2);
                            while (!r2.k()) {
                                byte readByte = r2.readByte();
                                obj.k1(37);
                                char[] cArr = a;
                                obj.k1(cArr[((readByte & 255) >> 4) & 15]);
                                obj.k1(cArr[readByte & 15]);
                            }
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 32;
                    r2 = r2;
                }
                return obj.N0();
            }
        }
        return str.substring(i4, i5);
    }

    public static final boolean b(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.l(str.charAt(i + 1)) != -1 && _UtilCommonKt.l(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [my0, java.lang.Object] */
    public static String c(int i, String str, int i2, int i3) {
        int i4;
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) == 0) {
            z = true;
        }
        str.getClass();
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i5++;
            } else {
                ?? obj = new Object();
                obj.p1(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i2) {
                        int l = _UtilCommonKt.l(str.charAt(i5 + 1));
                        int l2 = _UtilCommonKt.l(str.charAt(i4));
                        if (l != -1 && l2 != -1) {
                            obj.k1((l << 4) + l2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        obj.r1(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            obj.k1(32);
                            i5++;
                        }
                        obj.r1(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return obj.N0();
            }
        }
        return str.substring(i, i2);
    }
}
