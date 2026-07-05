package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b2e  reason: default package */
/* loaded from: classes.dex */
public abstract class b2e {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        String str2;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            c(i, sb);
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
                        str2 = yz1.B(str3.getBytes(StandardCharsets.UTF_8));
                        break;
                    }
                }
                if (z) {
                    str3 = str3.replace("\\", "\\\\");
                }
                if (z2) {
                    str2 = str3.replace("'", "\\'");
                } else {
                    str2 = str3;
                }
                if (z3) {
                    str2 = str2.replace("\"", "\\\"");
                }
                sb.append(str2);
                sb.append('\"');
            } else if (obj instanceof szd) {
                sb.append(": \"");
                sb.append(yz1.B(((szd) obj).j()));
                sb.append('\"');
            } else if (obj instanceof o0e) {
                sb.append(" {");
                b((o0e) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i4 = i + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                a(sb, i4, "key", entry2.getKey());
                a(sb, i4, ES6Iterator.VALUE_PROPERTY, entry2.getValue());
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0180, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a0, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b6, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
        if (r13 != false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.o0e r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2e.b(o0e, java.lang.StringBuilder, int):void");
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
