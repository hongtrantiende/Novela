package defpackage;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: thd  reason: default package */
/* loaded from: classes.dex */
public final class thd {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final km8 a = new km8();
    public final StringBuilder b = new StringBuilder();

    public static String a(km8 km8Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = km8Var.b;
        int i2 = km8Var.c;
        while (i < i2 && !z) {
            char c2 = (char) km8Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        km8Var.N(i - km8Var.b);
        return sb.toString();
    }

    public static String b(km8 km8Var, StringBuilder sb) {
        c(km8Var);
        if (km8Var.a() == 0) {
            return null;
        }
        String a = a(km8Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return "" + ((char) km8Var.z());
    }

    public static void c(km8 km8Var) {
        while (true) {
            for (boolean z = true; km8Var.a() > 0 && z; z = false) {
                int i = km8Var.b;
                byte[] bArr = km8Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = km8Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            km8Var.N(i2 - km8Var.b);
                        }
                    }
                } else {
                    km8Var.N(1);
                }
            }
            return;
        }
    }
}
