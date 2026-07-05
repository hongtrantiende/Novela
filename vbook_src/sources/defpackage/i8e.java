package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i8e  reason: default package */
/* loaded from: classes.dex */
public abstract class i8e {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        String str2;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            a(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                String str3 = (String) obj;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (int i3 = 0; i3 < str3.length(); i3++) {
                    char charAt2 = str3.charAt(i3);
                    if (charAt2 >= ' ' && charAt2 <= '~') {
                        if (charAt2 != '\"') {
                            if (charAt2 != '\'') {
                                if (charAt2 == '\\') {
                                    z = true;
                                }
                            } else {
                                z2 = true;
                            }
                        } else {
                            z3 = true;
                        }
                    } else {
                        str2 = k27.H(str3.getBytes(StandardCharsets.UTF_8));
                        break;
                    }
                }
                if (z) {
                    str3 = str3.replace("\\", "\\\\");
                }
                if (z2) {
                    str3 = str3.replace("'", "\\'");
                }
                if (z3) {
                    str2 = str3.replace("\"", "\\\"");
                } else {
                    str2 = str3;
                }
                sb.append(str2);
                sb.append('\"');
            } else if (obj instanceof s6e) {
                sb.append(": \"");
                sb.append(k27.H(((s6e) obj).m()));
                sb.append('\"');
            } else if (obj instanceof m7e) {
                sb.append(" {");
                c((m7e) obj, sb, i + 2);
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                b(sb, i4, "key", entry2.getKey());
                b(sb, i4, ES6Iterator.VALUE_PROPERTY, entry2.getValue());
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b9, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.m7e r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8e.c(m7e, java.lang.StringBuilder, int):void");
    }
}
