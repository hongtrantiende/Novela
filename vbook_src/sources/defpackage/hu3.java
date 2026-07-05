package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hu3  reason: default package */
/* loaded from: classes.dex */
public abstract class hu3 {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();
    public static final ArrayList c = new ArrayList((int) Token.ASSIGN_RSH);
    public static final rwa d = new rwa(new qk3(21));
    public static final rwa e = new rwa(new qk3(22));

    public static void a(bp3 bp3Var, gu3 gu3Var, int i) {
        int i2;
        String str;
        String str2;
        String D;
        int[] iArr = gu3Var.c;
        if (iArr != null) {
            int length = iArr.length - 1;
            int i3 = 0;
            while (true) {
                if (i3 <= length) {
                    i2 = (i3 + length) >>> 1;
                    int i4 = iArr[i2];
                    if (i4 < i) {
                        i3 = i2 + 1;
                    } else if (i4 <= i) {
                        break;
                    } else {
                        length = i2 - 1;
                    }
                } else {
                    i2 = -(i3 + 1);
                    break;
                }
            }
            if (i2 < 0) {
                str = "";
            } else {
                String[] strArr = gu3Var.d;
                if (strArr != null) {
                    if (i2 < strArr.length - 1) {
                        int[] iArr2 = gu3Var.c;
                        if (iArr2 != null) {
                            int i5 = i2 + 1;
                            if (iArr2[i5] == i) {
                                if (strArr != null) {
                                    str = strArr[i5];
                                    str.getClass();
                                } else {
                                    c16.w("nameVals");
                                    throw null;
                                }
                            }
                        } else {
                            c16.w("codeKeys");
                            throw null;
                        }
                    }
                    if (strArr != null) {
                        str = strArr[i2];
                        str.getClass();
                    } else {
                        c16.w("nameVals");
                        throw null;
                    }
                } else {
                    c16.w("nameVals");
                    throw null;
                }
            }
            if (!"".equals(str)) {
                bp3Var.b('&');
                bp3Var.c(str);
                bp3Var.b(';');
                return;
            }
            bp3Var.c("&#x");
            boolean z = z55.d.a;
            y55 y55Var = y55.f;
            String str3 = y55Var.a;
            String str4 = y55Var.b;
            int i6 = y55Var.d;
            x55 x55Var = x55.c;
            y55 y55Var2 = new y55(i6, str3, str4, true);
            new z55(z, x55Var, y55Var2);
            int[] iArr3 = w55.a;
            if (z) {
                str2 = "0123456789ABCDEF";
            } else {
                str2 = "0123456789abcdef";
            }
            if (y55Var2.e) {
                int i7 = 7;
                char[] cArr = {str2.charAt((i >> 28) & 15), str2.charAt((i >> 24) & 15), str2.charAt((i >> 20) & 15), str2.charAt((i >> 16) & 15), str2.charAt((i >> 12) & 15), str2.charAt((i >> 8) & 15), str2.charAt((i >> 4) & 15), str2.charAt(i & 15)};
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i) >> 2;
                if (numberOfLeadingZeros <= 7) {
                    i7 = numberOfLeadingZeros;
                }
                D = r4b.D(cArr, i7, 8);
            } else {
                long j = i;
                int i8 = i6 - 8;
                if (i8 < 0) {
                    i8 = 0;
                }
                int a2 = w55.a(str3.length() + i8 + 8 + str4.length());
                char[] cArr2 = new char[a2];
                int c2 = w55.c(str3, cArr2, 0);
                if (i8 > 0) {
                    int i9 = i8 + c2;
                    Arrays.fill(cArr2, c2, i9, str2.charAt(0));
                    c2 = i9;
                }
                int i10 = 32;
                boolean z2 = true;
                for (int i11 = 0; i11 < 8; i11++) {
                    i10 -= 4;
                    int i12 = (int) ((j >> i10) & 15);
                    if (z2 && i12 == 0 && (i10 >> 2) >= i6) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        cArr2[c2] = str2.charAt(i12);
                        c2++;
                    }
                }
                int c3 = w55.c(str4, cArr2, c2);
                if (c3 == a2) {
                    D = new String(cArr2);
                } else {
                    D = r4b.D(cArr2, 0, c3);
                }
            }
            bp3Var.c(D);
            bp3Var.b(';');
            return;
        }
        c16.w("codeKeys");
        throw null;
    }

    public static boolean b(fu3 fu3Var, char c2, CharsetEncoder charsetEncoder) {
        int ordinal = fu3Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return charsetEncoder.canEncode(c2);
            }
            if (c16.l(c2, 55296) >= 0 && c2 < 57344) {
                return false;
            }
        } else if (c2 > 128) {
            return false;
        }
        return true;
    }

    public static void c(bp3 bp3Var, String str, sc3 sc3Var, int i) {
        fu3 fu3Var;
        int i2;
        int i3;
        int i4;
        int i5;
        bp3Var.getClass();
        str.getClass();
        gu3 gu3Var = sc3Var.a;
        Charset charset = sc3Var.b;
        String name = charset.name();
        name.getClass();
        fu3.a.getClass();
        String upperCase = name.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int i6 = 0;
        if (upperCase.equals("US-ASCII")) {
            fu3Var = fu3.b;
        } else if (r4b.Q(name, "UTF-", false)) {
            fu3Var = fu3.c;
        } else {
            fu3Var = fu3.d;
        }
        rwa rwaVar = d;
        CharsetEncoder charsetEncoder = (CharsetEncoder) rwaVar.k();
        if (charsetEncoder == null || !c16.i(charsetEncoder.charset(), charset)) {
            charsetEncoder = charset.newEncoder();
            ThreadLocal threadLocal = (ThreadLocal) rwaVar.c;
            threadLocal.getClass();
            threadLocal.set(charsetEncoder);
        }
        charsetEncoder.getClass();
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        while (i7 < length) {
            int h = kqe.h(str, i7);
            if (h >= 65536) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            if ((h >>> 16) < 17) {
                i3 = 1;
            } else {
                i3 = i6;
            }
            if (i3 != 0) {
                int i10 = i6;
                if ((i & 4) != 0) {
                    if (d4b.i(h)) {
                        if (((i & 8) != 0 && !z) || i9 != 0) {
                            i7 += i2;
                        } else if ((i & 16) != 0) {
                            i7 += i2;
                            i8 = 1;
                        } else {
                            bp3Var.b(' ');
                            i7 += i2;
                            i9 = 1;
                        }
                        i6 = i10;
                    } else if (i8 != 0) {
                        bp3Var.b(' ');
                        z = true;
                        i8 = i10;
                        i9 = i8;
                    } else {
                        z = true;
                        i9 = i10;
                    }
                }
                gu3 gu3Var2 = gu3.xhtml;
                if (gu3Var2 != gu3Var || h == 9 || h == 10 || h == 13 || ((32 <= h && h < 55296) || ((57344 <= h && h < 65534) || (65536 <= h && h < 1114112)))) {
                    char c2 = (char) h;
                    if (h < 65536) {
                        if (c2 == '&') {
                            bp3Var.c("&amp;");
                        } else if (c2 == 160) {
                            if (gu3Var != gu3Var2) {
                                bp3Var.c("&nbsp;");
                            } else {
                                bp3Var.c("&#xa0;");
                            }
                        } else if (c2 == '<') {
                            bp3Var.c("&lt;");
                        } else if (c2 == '>') {
                            bp3Var.c("&gt;");
                        } else if (c2 == '\"') {
                            if ((i & 2) != 0) {
                                bp3Var.c("&quot;");
                            } else {
                                bp3Var.b(c2);
                            }
                        } else if (c2 == '\'') {
                            if ((i & 2) != 0 && (i & 1) != 0) {
                                if (gu3Var == gu3Var2) {
                                    bp3Var.c("&#x27;");
                                } else {
                                    bp3Var.c("&apos;");
                                }
                            } else {
                                bp3Var.b('\'');
                            }
                        } else if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                            if (c2 >= ' ' && b(fu3Var, c2, charsetEncoder)) {
                                bp3Var.b(c2);
                            } else {
                                a(bp3Var, gu3Var, h);
                            }
                        } else {
                            bp3Var.b(c2);
                        }
                    } else {
                        if (b(fu3Var, c2, charsetEncoder)) {
                            char[] cArr = (char[]) e.k();
                            cArr.getClass();
                            int i11 = h >>> 16;
                            if (i11 == 0) {
                                cArr[i10] = c2;
                                i5 = 1;
                            } else if (i11 < 17) {
                                cArr[1] = (char) ((h & 1023) + 56320);
                                cArr[i10] = (char) ((h >>> 10) + 55232);
                                i5 = 2;
                            } else {
                                nqe.u(16);
                                String num = Integer.toString(h, 16);
                                num.getClass();
                                String upperCase2 = num.toUpperCase(Locale.ROOT);
                                upperCase2.getClass();
                                vs.m("Not a valid Unicode code point: 0x".concat(upperCase2));
                                return;
                            }
                            i4 = i10;
                            bp3Var.b.append(cArr, i4, i5);
                        } else {
                            i4 = i10;
                            a(bp3Var, gu3Var, h);
                        }
                        i7 += i2;
                        i6 = i4;
                    }
                }
                i4 = i10;
                i7 += i2;
                i6 = i4;
            } else {
                vs.m("Not a valid code point");
                return;
            }
        }
    }
}
