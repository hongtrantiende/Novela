package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wu3  reason: default package */
/* loaded from: classes3.dex */
public final class wu3 extends zo0 {
    public static final tu3 q(byte[] bArr) {
        yk8 w = w(bArr);
        return new tu3((String) w.a, (String) w.b, bArr);
    }

    public static final String r(wu3 wu3Var, String str, String str2, String str3, String str4, boolean z, List list, List list2) {
        String str5;
        String x = x(str);
        String x2 = x(str2);
        String x3 = x(str3);
        String x4 = x(str4);
        if (z) {
            str5 = "<meta name=\"cover\" content=\"cover-image\"/>";
        } else {
            str5 = "";
        }
        String i0 = sl1.i0(list, "\n", null, null, null, 62);
        String i02 = sl1.i0(list2, "\n", null, null, null, 62);
        StringBuilder y = nk2.y("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <package version=\"2.0\" unique-identifier=\"BookId\" xmlns=\"http://www.idpf.org/2007/opf\">\n          <metadata xmlns:dc=\"http://purl.org/dc/elements/1.1/\">\n            <dc:identifier id=\"BookId\">", x, "</dc:identifier>\n            <dc:title>", x2, "</dc:title>\n            <dc:creator>");
        nk2.C(y, x3, "</dc:creator>\n            <dc:language>", x4, "</dc:language>\n            ");
        nk2.C(y, str5, "\n          </metadata>\n          <manifest>\n            <item id=\"ncx\" href=\"toc.ncx\" media-type=\"application/x-dtbncx+xml\"/>\n            ", i0, "\n          </manifest>\n          <spine toc=\"ncx\">\n            ");
        y.append(i02);
        y.append("\n          </spine>\n        </package>\n        ");
        return y(l4b.y(y.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [my0, java.lang.Object] */
    public static final tu3 s(wu3 wu3Var, String str) {
        Throwable th;
        m66 m66Var = pe4.a;
        hn8 f = hn8.f(hn8.f(ie2.r(m66Var), str), "cover");
        byte[] bArr = null;
        if (!m66Var.j0(f)) {
            return null;
        }
        qw5 J = tl1.J(f.toFile());
        ?? obj = new Object();
        try {
            obj.J(J);
            byte[] p0 = obj.p0(obj.b);
            try {
                J.close();
                obj.o();
            } catch (Throwable th2) {
                bArr = th2;
            }
            th = bArr;
            bArr = p0;
        } catch (Throwable th3) {
            try {
                J.close();
                obj.o();
                th = th3;
            } catch (Throwable th4) {
                pye.e(th3, th4);
                th = th3;
            }
        }
        if (th == null) {
            yk8 w = w(bArr);
            return new tu3((String) w.a, (String) w.b, bArr);
        }
        throw th;
    }

    public static final String t(wu3 wu3Var, int i, String str, String str2, String str3) {
        wu3Var.getClass();
        String x = x(str2);
        StringBuilder s = s21.s("\n        <navPoint id=\"", str, "\" playOrder=\"", i, "\">\n          <navLabel><text>");
        s.append(x);
        s.append("</text></navLabel>\n          <content src=\"");
        s.append(str3);
        s.append("\"/>\n        </navPoint>\n    ");
        return l4b.y(s.toString());
    }

    public static final String u(wu3 wu3Var, String str, String str2, List list) {
        String x = x(str);
        String x2 = x(str2);
        String i0 = sl1.i0(list, "\n", null, null, null, 62);
        StringBuilder y = nk2.y("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <ncx xmlns=\"http://www.daisy.org/z3986/2005/ncx/\" version=\"2005-1\">\n          <head>\n            <meta name=\"dtb:uid\" content=\"", x, "\"/>\n          </head>\n          <docTitle>\n            <text>", x2, "</text>\n          </docTitle>\n          <navMap>\n            ");
        y.append(i0);
        y.append("\n          </navMap>\n        </ncx>\n        ");
        return y(l4b.y(y.toString()));
    }

    public static final String v(wu3 wu3Var, String str, String str2, String str3) {
        wu3Var.getClass();
        StringBuilder y = nk2.y("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <!DOCTYPE html>\n        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n        <head>\n          <title>", x(str), "</title>\n          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n          <link rel=\"stylesheet\" type=\"text/css\" href=\"", str3, "\"/>\n        </head>\n        <body>");
        y.append(str2);
        y.append("</body>\n        </html>\n    ");
        return l4b.y(y.toString());
    }

    public static yk8 w(byte[] bArr) {
        if (bArr.length >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) {
            return new yk8("jpg", "image/jpeg");
        }
        if (bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
            return new yk8("png", "image/png");
        }
        if (bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
            return new yk8("gif", "image/gif");
        }
        if (bArr.length >= 12 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) {
            return new yk8("webp", "image/webp");
        }
        return new yk8("jpg", "image/jpeg");
    }

    public static String x(String str) {
        return r4b.N(r4b.N(r4b.N(r4b.N(r4b.N(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }

    public static String y(String str) {
        t6f t6fVar = new t6f(new cpd());
        t6fVar.b = Integer.MAX_VALUE;
        uc3 f = t6fVar.f(str, "");
        sc3 sc3Var = f.J;
        sc3Var.g = rc3.b;
        gu3 gu3Var = gu3.xhtml;
        gu3Var.getClass();
        sc3Var.a = gu3Var;
        sc3Var.c = true;
        sc3Var.e = 2;
        return f.R();
    }
}
