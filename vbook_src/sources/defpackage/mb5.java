package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mb5  reason: default package */
/* loaded from: classes.dex */
public final class mb5 {
    public final oc5 a;
    public final ArrayList b;

    static {
        oc5 oc5Var = oc5.g;
    }

    public mb5(oc5 oc5Var, ArrayList arrayList) {
        oc5Var.getClass();
        this.a = oc5Var;
        this.b = arrayList;
    }

    public static String b(String str, boolean z) {
        if (!z && k4b.W(str, '\n')) {
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) == '\n') {
                    sb.append(c(str.substring(i, i2)));
                    sb.append("<br>");
                    i = i2 + 1;
                }
            }
            sb.append(c(str.substring(i)));
            return sb.toString();
        }
        return c(str);
    }

    public static String c(String str) {
        str.getClass();
        if (str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '&' || charAt == '<' || charAt == '>') {
                    StringBuilder sb = new StringBuilder(str.length() + 8);
                    int length2 = str.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 != '&') {
                            if (charAt2 != '<') {
                                if (charAt2 != '>') {
                                    sb.append(charAt2);
                                } else {
                                    sb.append("&gt;");
                                }
                            } else {
                                sb.append("&lt;");
                            }
                        } else {
                            sb.append("&amp;");
                        }
                    }
                    return sb.toString();
                }
            }
            return str;
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:45|(5:59|60|61|50|(1:55)(1:54))(1:47)|48|49|50|(1:52)|55) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
        r15.add(defpackage.rte.m(defpackage.rte.x(r14), r0));
        r0 = new defpackage.sc5("", "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(defpackage.xl0 r18) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb5.a(xl0):java.lang.String");
    }
}
