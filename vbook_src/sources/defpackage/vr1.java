package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vr1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vr1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vr1(int i) {
        this.a = i;
    }

    public final kb5 a(mb5 mb5Var, xl0 xl0Var, dm0 dm0Var) {
        am0 am0Var;
        Object obj;
        String str;
        Object obj2;
        Integer num;
        Object obj3;
        String str2;
        int i;
        String str3 = "";
        Integer num2 = null;
        cm0 cm0Var = null;
        switch (this.a) {
            case 0:
                xl0Var.getClass();
                dm0Var.getClass();
                if (dm0Var instanceof am0) {
                    am0Var = (am0) dm0Var;
                } else {
                    am0Var = null;
                }
                if (am0Var != null) {
                    obj = am0Var.b.get("url");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    return jb5.a;
                }
                if (am0Var != null) {
                    obj2 = am0Var.b.get("width");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (am0Var != null) {
                    obj3 = am0Var.b.get("height");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof Integer) {
                    num2 = (Integer) obj3;
                }
                if (num != null && num2 != null) {
                    str3 = " width=\"" + num + "\" height=\"" + num2 + "\"";
                }
                return new ib5(hl5.o("<img src=\"", rse.f(str), "\"", str3, " />\n"));
            case 1:
                xl0Var.getClass();
                dm0Var.getClass();
                if (xl0Var.b.a() && (i = xl0Var.d.a) != 0) {
                    str2 = hl5.n("<p class=\"", a82.j(i, "cascade-indent-"), "\">");
                } else {
                    str2 = "<p>";
                }
                return new ib5(eub.o(str2, mb5Var.a(xl0Var), "</p>"));
            case 2:
                xl0Var.getClass();
                dm0Var.getClass();
                hn0 hn0Var = xl0Var.b;
                hn0Var.getClass();
                int i2 = ((cn0) hn0Var).a;
                return new ib5(rs8.g(i2, ">", s21.r("<h", i2, ">", mb5Var.a(xl0Var), "</h")));
            case 3:
                xl0Var.getClass();
                dm0Var.getClass();
                return new ib5(hl5.n("<blockquote>", mb5Var.a(xl0Var), "</blockquote>"));
            case 4:
                xl0Var.getClass();
                dm0Var.getClass();
                dm0 dm0Var2 = xl0Var.c;
                if (dm0Var2 instanceof cm0) {
                    cm0Var = (cm0) dm0Var2;
                }
                if (cm0Var != null) {
                    str3 = mb5.c(cm0Var.a);
                }
                return new ib5(hl5.n("<pre><code>", str3, "</code></pre>"));
            default:
                xl0Var.getClass();
                dm0Var.getClass();
                return new ib5("<hr>");
        }
    }
}
