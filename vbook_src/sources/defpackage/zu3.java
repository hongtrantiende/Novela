package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zu3  reason: default package */
/* loaded from: classes3.dex */
public final class zu3 extends zo0 {
    public static final xu3 q(byte[] bArr) {
        yk8 w = w(bArr);
        return new xu3((String) w.a, (String) w.b, bArr);
    }

    public static final String r(zu3 zu3Var, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        String x = x(str);
        String x2 = x(str2);
        String x3 = x(str3);
        String x4 = x(str4);
        String x5 = x(str5);
        String i0 = sl1.i0(list, "\n", null, null, null, 62);
        String i02 = sl1.i0(list2, "\n", null, null, null, 62);
        StringBuilder y = nk2.y("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <package version=\"3.0\" unique-identifier=\"BookId\" xmlns=\"http://www.idpf.org/2007/opf\">\n          <metadata xmlns:dc=\"http://purl.org/dc/elements/1.1/\">\n            <dc:identifier id=\"BookId\">", x, "</dc:identifier>\n            <dc:title>", x2, "</dc:title>\n            <dc:creator>");
        nk2.C(y, x3, "</dc:creator>\n            <dc:language>", x4, "</dc:language>\n            <meta property=\"dcterms:modified\">");
        nk2.C(y, x5, "</meta>\n          </metadata>\n          <manifest>\n            <item id=\"toc\" href=\"toc.xhtml\" media-type=\"application/xhtml+xml\" properties=\"nav\"/>\n            ", i0, "\n          </manifest>\n          <spine>\n            ");
        y.append(i02);
        y.append("\n          </spine>\n        </package>\n        ");
        return y(l4b.y(y.toString()));
    }

    public static final String s(zu3 zu3Var, String str, String str2, List list) {
        String x = x(str);
        String i0 = sl1.i0(list, "\n", null, null, new u83(zu3Var), 30);
        StringBuilder y = nk2.y("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:epub=\"http://www.idpf.org/2007/ops\">\n          <head>\n            <title>", x, "</title>\n            <link rel=\"stylesheet\" type=\"text/css\" href=\"Styles/", str2, "\"/>\n          </head>\n          <body>\n            <nav epub:type=\"toc\">\n              <ol>\n                ");
        y.append(i0);
        y.append("\n              </ol>\n            </nav>\n          </body>\n        </html>\n        ");
        return y(l4b.y(y.toString()));
    }

    public static final /* synthetic */ String t(zu3 zu3Var, String str) {
        zu3Var.getClass();
        return x(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [my0, java.lang.Object] */
    public static final xu3 u(zu3 zu3Var, String str) {
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
            return new xu3((String) w.a, (String) w.b, bArr);
        }
        throw th;
    }

    public static final String v(zu3 zu3Var, String str, String str2, String str3) {
        zu3Var.getClass();
        StringBuilder y = nk2.y("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n        <head>\n          <title>", x(str), "</title>\n          <link rel=\"stylesheet\" type=\"text/css\" href=\"", str3, "\"/>\n        </head>\n        <body>");
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
