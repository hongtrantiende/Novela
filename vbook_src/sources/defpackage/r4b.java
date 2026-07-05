package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r4b  reason: default package */
/* loaded from: classes3.dex */
public abstract class r4b extends q4b {
    public static String D(char[] cArr, int i, int i2) {
        cArr.getClass();
        ube.s(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static String F(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, ed1.a);
    }

    public static String G(int i, byte[] bArr, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bArr.getClass();
        ube.s(i, i2, bArr.length);
        return new String(bArr, i, i2 - i, ed1.a);
    }

    public static byte[] H(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ed1.a);
        bytes.getClass();
        return bytes;
    }

    public static boolean I(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean J(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final void K(String str) {
        throw new NumberFormatException(eub.n('\'', "Invalid number format: '", str));
    }

    public static boolean L(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String M(int i, String str) {
        str.getClass();
        if (i >= 0) {
            if (i != 0) {
                int i2 = 1;
                if (i != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb = new StringBuilder(str.length() * i);
                            if (1 <= i) {
                                while (true) {
                                    sb.append((CharSequence) str);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            return sb.toString();
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            cArr[i3] = charAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        ls2.d(i, 46, "Count 'n' must be non-negative, but was ");
        return null;
    }

    public static String N(String str, boolean z, String str2, String str3) {
        rs8.w(str, str2, str3);
        int i = 0;
        int d0 = k4b.d0(str, str2, 0, z);
        if (d0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, d0);
                sb.append(str3);
                i = d0 + length;
                if (d0 >= str.length()) {
                    break;
                }
                d0 = k4b.d0(str, str2, d0 + i2, z);
            } while (d0 > 0);
            sb.append((CharSequence) str, i, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static String O(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static boolean P(int i, String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return L(i, 0, str2.length(), str, str2, z);
    }

    public static boolean Q(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        return L(0, 0, str2.length(), str, str2, z);
    }

    public static Integer R(int i, String str) {
        boolean z;
        int i2;
        int i3;
        str.getClass();
        nqe.u(i);
        int length = str.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str.charAt(0);
            int i5 = -2147483647;
            if (charAt < '0') {
                i2 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i5 = Integer.MIN_VALUE;
                            z = true;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
                i2 = 0;
            }
            int i6 = -59652323;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + digit) {
                        return null;
                    }
                    i4 = i3 - digit;
                    i2++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Integer.valueOf(i4);
            }
            return Integer.valueOf(-i4);
        }
        return null;
    }

    public static Integer S(String str) {
        str.getClass();
        return R(10, str);
    }

    public static Long T(int i, String str) {
        boolean z;
        str.getClass();
        nqe.u(i);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            long j = -9223372036854775807L;
            if (charAt < '0') {
                z = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j = Long.MIN_VALUE;
                            i2 = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                        i2 = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
            }
            long j2 = 0;
            long j3 = -256204778801521550L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    if (j2 < j3) {
                        if (j3 == -256204778801521550L) {
                            j3 = j / i;
                            if (j2 < j3) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j4 = j2 * i;
                    long j5 = digit;
                    if (j4 < j + j5) {
                        return null;
                    }
                    j2 = j4 - j5;
                    i2++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Long.valueOf(j2);
            }
            return Long.valueOf(-j2);
        }
        return null;
    }

    public static Long U(String str) {
        str.getClass();
        return T(10, str);
    }
}
