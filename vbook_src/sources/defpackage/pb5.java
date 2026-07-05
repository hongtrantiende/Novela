package defpackage;

import java.util.Map;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pb5  reason: default package */
/* loaded from: classes3.dex */
public abstract class pb5 {
    public static final Map a = o17.s(new yk8("amp", "&"), new yk8("lt", "<"), new yk8("gt", ">"), new yk8("quot", "\""), new yk8("apos", "'"), new yk8("nbsp", " "), new yk8("copy", "©"), new yk8("reg", "®"), new yk8("trade", "™"), new yk8("ndash", "–"), new yk8("mdash", "—"), new yk8("hellip", "…"), new yk8("lsquo", "‘"), new yk8("rsquo", "’"), new yk8("ldquo", "“"), new yk8("rdquo", "”"), new yk8("bull", "•"));

    public static String a(String str) {
        Integer num;
        int intValue;
        if (str.length() != 0) {
            if (str.charAt(0) != '#') {
                return (String) a.get(str);
            }
            if (str.length() > 2 && (str.charAt(1) == 'x' || str.charAt(1) == 'X')) {
                num = c(2, 16, str);
            } else if (str.length() > 1) {
                num = c(1, 10, str);
            } else {
                num = null;
            }
            if (num != null && (intValue = num.intValue()) > 0 && intValue <= 1114111 && (55296 > intValue || intValue >= 57344)) {
                if (intValue <= 65535) {
                    return String.valueOf((char) intValue);
                }
                int i = intValue - Parser.ARGC_LIMIT;
                StringBuilder sb = new StringBuilder();
                sb.append((char) ((i >> 10) + 55296));
                sb.append((char) ((i & 1023) + 56320));
                return sb.toString();
            }
        }
        return null;
    }

    public static int b(int i, String str) {
        for (int i2 = 0; i < str.length() && i2 <= 32; i2++) {
            char charAt = str.charAt(i);
            if (charAt == ';') {
                return i;
            }
            if (charAt != '&' && charAt != '<' && !nqe.y(charAt)) {
                i++;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static Integer c(int i, int i2, String str) {
        if (i < str.length()) {
            int length = str.length();
            int i3 = 0;
            while (i < length) {
                Integer v = nqe.v(str.charAt(i), i2);
                if (v != null) {
                    int intValue = v.intValue();
                    if (i3 <= (1114111 - intValue) / i2) {
                        i3 = (i3 * i2) + intValue;
                        i++;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return Integer.valueOf(i3);
        }
        return null;
    }
}
