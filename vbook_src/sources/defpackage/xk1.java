package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xk1  reason: default package */
/* loaded from: classes3.dex */
public abstract class xk1 {
    public static final Set a;
    public static final Set b;
    public static final ArrayList c;
    public static final ArrayList d;

    static {
        ArrayList n0 = sl1.n0(sl1.m0(new lc1('a', 'z'), new lc1('A', 'Z')), new lc1('0', '9'));
        ArrayList arrayList = new ArrayList(tl1.s(n0, 10));
        int size = n0.size();
        int i = 0;
        while (i < size) {
            Object obj = n0.get(i);
            i++;
            arrayList.add(Byte.valueOf((byte) ((Character) obj).charValue()));
        }
        a = sl1.H0(arrayList);
        b = sl1.H0(sl1.n0(sl1.m0(new lc1('a', 'z'), new lc1('A', 'Z')), new lc1('0', '9')));
        sl1.H0(sl1.n0(sl1.m0(new lc1('a', 'f'), new lc1('A', 'F')), new lc1('0', '9')));
        Set<Character> F0 = b00.F0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(tl1.s(F0, 10));
        for (Character ch : F0) {
            arrayList2.add(Byte.valueOf((byte) ch.charValue()));
        }
        c = arrayList2;
        b00.F0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        fca.v(b, b00.F0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List<Character> B = tl1.B('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(tl1.s(B, 10));
        for (Character ch2 : B) {
            arrayList3.add(Byte.valueOf((byte) ch2.charValue()));
        }
        d = arrayList3;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        return -1;
    }

    public static final String b(int i, int i2, String str, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%' && (!z || charAt != '+')) {
                i3++;
            } else {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char charAt2 = str.charAt(i3);
                    if (z && charAt2 == '+') {
                        sb.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 < i2) {
                                int i7 = i3 + 1;
                                int a2 = a(str.charAt(i7));
                                int a3 = a(str.charAt(i6));
                                if (a2 != -1 && a3 != -1) {
                                    bArr[i5] = (byte) ((a2 * 16) + a3);
                                    i3 += 3;
                                    i5++;
                                } else {
                                    throw new e60(23, "Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3, false);
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new e60(23, nk2.s(i3, " at ", sb2), false);
                            }
                        }
                        sb.append(r4b.G(0, bArr, i5, 4));
                    } else {
                        sb.append(charAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        return str.substring(i, i2);
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = ed1.a;
        str.getClass();
        charset.getClass();
        return b(0, length, str, false);
    }

    public static String d(int i, String str, int i2, int i3) {
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
        Charset charset = ed1.a;
        str.getClass();
        charset.getClass();
        return b(i, i2, str, z);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ly0, java.lang.Object] */
    public static final String e(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = ed1.a.newEncoder();
        newEncoder.getClass();
        int length = str.length();
        ?? obj = new Object();
        p17.c(newEncoder, obj, str, 0, length);
        f(obj, new nf0(sb, z, 2));
        return sb.toString();
    }

    public static final void f(ly0 ly0Var, xt4 xt4Var) {
        while (!ly0Var.k()) {
            while (!ly0Var.k()) {
                xt4Var.invoke(Byte.valueOf(ly0Var.readByte()));
            }
        }
    }

    public static final String g(byte b2) {
        int i;
        int i2;
        int i3 = (b2 & 255) >> 4;
        if (i3 >= 0 && i3 < 10) {
            i = i3 + 48;
        } else {
            i = ((char) (i3 + 65)) - '\n';
        }
        char c2 = (char) i;
        int i4 = b2 & 15;
        if (i4 >= 0 && i4 < 10) {
            i2 = i4 + 48;
        } else {
            i2 = ((char) (i4 + 65)) - '\n';
        }
        return new String(new char[]{'%', c2, (char) i2});
    }
}
