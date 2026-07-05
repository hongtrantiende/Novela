package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d4b  reason: default package */
/* loaded from: classes.dex */
public abstract class d4b {
    public static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final gm9 b = new gm9("[\\x00-\\x1f]*");
    public static final s26 c = new s26((vt4) new n3b(21));

    public static void a(String str, StringBuilder sb, boolean z) {
        int i;
        boolean z2;
        sb.getClass();
        str.getClass();
        int length = str.length();
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < length; i2 += i) {
            int h = kqe.h(str, i2);
            if (h >= 65536) {
                i = 2;
            } else {
                i = 1;
            }
            if ((h >>> 16) < 17) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (h != 32 && h != 9 && h != 10 && h != 12 && h != 13 && h != 160) {
                    if (h != 8203 && h != 173) {
                        sb.appendCodePoint(h);
                        z4 = false;
                        z3 = true;
                    }
                } else if ((!z || z3) && !z4) {
                    sb.append(' ');
                    z4 = true;
                }
            } else {
                vs.m("Not a valid code point");
                return;
            }
        }
    }

    public static StringBuilder b() {
        return (StringBuilder) c.l();
    }

    public static boolean c(String str, String[] strArr) {
        int i;
        str.getClass();
        strArr.getClass();
        String[] strArr2 = strArr;
        int length = strArr2.length - 1;
        int i2 = 0;
        while (true) {
            if (i2 <= length) {
                i = (i2 + length) >>> 1;
                int j = hxe.j(strArr2[i], str);
                if (j < 0) {
                    i2 = i + 1;
                } else if (j <= 0) {
                    break;
                } else {
                    length = i - 1;
                }
            } else {
                i = -(i2 + 1);
                break;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static boolean d(char c2) {
        if (c16.l(c2, 97) < 0 || c16.l(c2, Token.FUNCTION) > 0) {
            if (c16.l(c2, 65) >= 0 && c16.l(c2, 90) <= 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean e(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!i(kqe.h(str, i))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean f(char c2) {
        if (c16.l(c2, 48) >= 0 && c16.l(c2, 57) <= 0) {
            return true;
        }
        return false;
    }

    public static boolean g(char c2) {
        if (!f(c2)) {
            if (c16.l(c2, 97) < 0 || c16.l(c2, 102) > 0) {
                if (c16.l(c2, 65) < 0 || c16.l(c2, 70) > 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean h(String str, String... strArr) {
        str.getClass();
        for (String str2 : strArr) {
            if (c16.i(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(int i) {
        if (i != 32 && i != 9 && i != 10 && i != 12 && i != 13) {
            return false;
        }
        return true;
    }

    public static String j(String str, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        it.getClass();
        if (!it.hasNext()) {
            return "";
        }
        String valueOf = String.valueOf(it.next());
        if (!it.hasNext()) {
            return valueOf;
        }
        StringBuilder b2 = b();
        b2.getClass();
        b2.append((Object) valueOf);
        while (it.hasNext()) {
            Object next = it.next();
            b2.append(str);
            b2.append(next);
        }
        String sb = b2.toString();
        m(b2);
        return sb;
    }

    public static String k(String str) {
        str.getClass();
        StringBuilder b2 = b();
        a(str, b2, false);
        String sb = b2.toString();
        m(b2);
        return sb;
    }

    public static String l(StringBuilder sb) {
        sb.getClass();
        String sb2 = sb.toString();
        m(sb);
        return sb2;
    }

    public static void m(StringBuilder sb) {
        sb.getClass();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length()).getClass();
            c.M(sb);
        }
    }
}
