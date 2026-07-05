package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb5  reason: default package */
/* loaded from: classes3.dex */
public final class tb5 extends zo0 {
    public static final String q(tb5 tb5Var, String str, String str2, w14 w14Var) {
        StringBuilder sb = new StringBuilder("<!DOCTYPE html>\n<html><head><meta charset=\"utf-8\" /><title>");
        tb5Var.getClass();
        sb.append(t(str));
        sb.append("</title></head>\n<body>\n");
        if (w14Var.f && !k4b.j0(str)) {
            sb.append("<h1 align=\"center\">");
            sb.append(t(str));
            sb.append("</h1>\n");
        }
        if (!k4b.j0(str2)) {
            sb.append(str2);
            sb.append("\n");
        }
        sb.append("</body>\n</html>");
        return sb.toString();
    }

    public static final String r(tb5 tb5Var, so0 so0Var, w14 w14Var) {
        String str = w14Var.h;
        StringBuilder sb = new StringBuilder("<!DOCTYPE html>\n<html><head><meta charset=\"utf-8\" /><title>");
        String str2 = so0Var.f;
        sb.append(t(str2));
        sb.append("</title></head>\n<body>\n<h1 align=\"center\">");
        sb.append(t(str2));
        sb.append("</h1>\n");
        String str3 = so0Var.g;
        if (!k4b.j0(str3)) {
            sb.append("<p>");
            sb.append(t(str3));
            sb.append("</p>\n");
        }
        if (!k4b.j0(str)) {
            List p0 = k4b.p0(k4b.N0(str).toString());
            ArrayList arrayList = new ArrayList();
            for (Object obj : p0) {
                if (!k4b.j0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                sb.append("<p>");
                sb.append(t((String) obj2));
                sb.append("</p>\n");
            }
        }
        sb.append("</body>\n</html>");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.tb5 r9, defpackage.so0 r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb5.s(tb5, so0, n42):java.lang.Object");
    }

    public static String t(String str) {
        return r4b.N(r4b.N(r4b.N(r4b.N(r4b.N(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }
}
