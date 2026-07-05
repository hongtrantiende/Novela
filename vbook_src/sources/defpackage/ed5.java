package defpackage;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ed5  reason: default package */
/* loaded from: classes.dex */
public final class ed5 extends unc {
    public de5 l;
    public de5 m;
    public boolean n;
    public cp3 o;
    public tq4 p;
    public cp3 q;
    public ArrayList s;
    public ArrayList t;
    public xbc u;
    public boolean v;
    public boolean w;
    public boolean x;
    public static final String[] z = {"applet", "caption", "html", "marquee", "object", "table", "td", "template", "th"};
    public static final String[] A = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] B = {"desc", "foreignobject", "title"};
    public static final String[] C = {"ol", "ul"};
    public static final String[] D = {"button"};
    public static final String[] E = {"html", "table"};
    public static final String[] F = {"optgroup", "option"};
    public static final String[] G = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] H = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] I = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
    public static final String[] J = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] K = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] L = {"desc", "foreignObject", "title"};
    public static final String[] M = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    public final ArrayList r = new ArrayList();
    public final String[] y = {""};

    public final void A(cp3 cp3Var) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = size - 1;
        int i2 = size - 13;
        int i3 = 0;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > i) {
            return;
        }
        while (true) {
            cp3 cp3Var2 = (cp3) arrayList.get(i);
            if (cp3Var2 != null) {
                if (c16.i(cp3Var.e.b, cp3Var2.e.b) && cp3Var.e().equals(cp3Var2.e())) {
                    i3++;
                }
                if (i3 == 3) {
                    arrayList.remove(i);
                    return;
                } else if (i != i2) {
                    i--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void B() {
        cp3 cp3Var;
        do {
            ArrayList arrayList = this.r;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                if (size > 0) {
                    cp3Var = (cp3) arrayList.remove(size - 1);
                    continue;
                } else {
                    cp3Var = null;
                    continue;
                }
            } else {
                return;
            }
        } while (cp3Var != null);
    }

    public final void C(String... strArr) {
        String str;
        wjb wjbVar;
        ArrayList arrayList = this.e;
        arrayList.getClass();
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ArrayList arrayList2 = this.e;
                arrayList2.getClass();
                cp3 cp3Var = (cp3) arrayList2.get(size);
                if (cp3Var != null && (wjbVar = cp3Var.e) != null) {
                    str = wjbVar.c;
                } else {
                    str = null;
                }
                if ("http://www.w3.org/1999/xhtml".equals(str)) {
                    String[] strArr2 = d4b.a;
                    if (d4b.h(cp3Var.e.b, (String[]) Arrays.copyOf(strArr, strArr.length)) || cp3Var.r("html")) {
                        return;
                    }
                }
                r();
            } else {
                return;
            }
        }
    }

    public final void D() {
        C("table", "template");
    }

    public final void E() {
        C("tr", "template");
    }

    public final cp3 F(ybc ybcVar, String str, boolean z2) {
        qm8 m;
        ybcVar.getClass();
        str.getClass();
        j40 j40Var = ybcVar.g;
        if (j40Var != null && j40Var.size() != 0) {
            if (!z2) {
                m().a(j40Var);
            }
            if (j40Var.f(m()) > 0) {
                String str2 = ybcVar.e;
                h("Dropped duplicate attribute(s) in tag [" + str2 + "]");
            }
        }
        String V = ybcVar.d.V();
        String str3 = ybcVar.e;
        str3.getClass();
        if (z2) {
            m = qm8.d;
        } else {
            m = m();
        }
        wjb y = y(V, str3, str, m);
        if (c16.i(y.b, "form")) {
            return new tq4(y, j40Var);
        }
        return new cp3(y, null, j40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(defpackage.cp3 r7) {
        /*
            r6 = this;
            r6.g()
            tq4 r0 = r6.p
            if (r0 == 0) goto L30
            wjb r0 = r7.e
            java.lang.String r0 = r0.c
            java.lang.String r1 = "http://www.w3.org/1999/xhtml"
            boolean r0 = defpackage.c16.i(r0, r1)
            if (r0 == 0) goto L30
            java.lang.String[] r0 = defpackage.d4b.a
            wjb r0 = r7.e
            java.lang.String r0 = r0.b
            java.lang.String[] r1 = defpackage.ed5.M
            boolean r0 = defpackage.d4b.c(r0, r1)
            if (r0 == 0) goto L30
            tq4 r0 = r6.p
            r0.getClass()
            hp3 r0 = r0.G
            r0.getClass()
            java.util.ArrayList r0 = r0.a
            r0.add(r7)
        L30:
            t6f r0 = r6.k()
            java.lang.Object r0 = r0.d
            iv7 r0 = (defpackage.iv7) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L69
            java.lang.String r0 = "xmlns"
            boolean r1 = r7.n(r0)
            if (r1 == 0) goto L69
            java.lang.String r1 = r7.c(r0)
            wjb r2 = r7.e
            java.lang.String r2 = r2.c
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L69
            java.lang.String r0 = r7.c(r0)
            wjb r1 = r7.e
            java.lang.String r1 = r1.a
            java.lang.String r2 = "] on tag ["
            java.lang.String r3 = "]"
            java.lang.String r4 = "Invalid xmlns attribute ["
            java.lang.String r0 = defpackage.hl5.o(r4, r0, r2, r1, r3)
            r6.h(r0)
        L69:
            boolean r0 = r6.w
            if (r0 == 0) goto Ld0
            java.lang.String[] r0 = defpackage.d4b.a
            cp3 r0 = r6.a()
            wjb r0 = r0.e
            java.lang.String r0 = r0.b
            java.lang.String[] r1 = defpackage.xxe.C
            boolean r0 = defpackage.d4b.c(r0, r1)
            if (r0 == 0) goto Ld0
            java.lang.String r0 = "table"
            cp3 r0 = r6.K(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L9f
            cp3 r3 = r0.a
            r4 = 0
            if (r3 == 0) goto L90
            r5 = r3
            goto L91
        L90:
            r5 = r4
        L91:
            if (r5 == 0) goto L99
            if (r3 == 0) goto L96
            goto L97
        L96:
            r3 = r4
        L97:
            r4 = r1
            goto Lab
        L99:
            cp3 r3 = r6.z(r0)
        L9d:
            r4 = r2
            goto Lab
        L9f:
            java.util.ArrayList r3 = r6.e
            r3.getClass()
            java.lang.Object r3 = r3.get(r2)
            cp3 r3 = (defpackage.cp3) r3
            goto L9d
        Lab:
            if (r4 == 0) goto Lc9
            r0.getClass()
            cp3 r3 = r7.a
            cp3 r4 = r0.a
            if (r3 != r4) goto Lb9
            r7.D()
        Lb9:
            cp3 r3 = r0.a
            if (r3 == 0) goto Ld7
            int r0 = r0.G()
            y28[] r1 = new defpackage.y28[r1]
            r1[r2] = r7
            r3.b(r0, r1)
            goto Ld7
        Lc9:
            r3.getClass()
            r3.H(r7)
            goto Ld7
        Ld0:
            cp3 r0 = r6.a()
            r0.H(r7)
        Ld7:
            r6.v(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.G(cp3):void");
    }

    public final void H(de5 de5Var) {
        if (((iv7) k().d).b()) {
            iv7 iv7Var = (iv7) k().d;
            vc1 l = l();
            String g = cm9.a(i().getClass()).g();
            if (g == null) {
                g = "Token";
            }
            dcc i = i();
            nm8 nm8Var = new nm8(l, "Unexpected " + g + " token [" + i + "] when in state [" + de5Var + "]");
            iv7Var.getClass();
            ((ArrayList) iv7Var.b).add(nm8Var);
        }
    }

    public final void I(String str) {
        while (true) {
            String[] strArr = d4b.a;
            if (d4b.c(a().e.b, G) && !b(str)) {
                r();
            } else {
                return;
            }
        }
    }

    public final void J(boolean z2) {
        String[] strArr;
        if (z2) {
            strArr = H;
        } else {
            strArr = G;
        }
        while ("http://www.w3.org/1999/xhtml".equals(a().e.c)) {
            String[] strArr2 = d4b.a;
            if (d4b.c(a().e.b, strArr)) {
                r();
            } else {
                return;
            }
        }
    }

    public final cp3 K(String str) {
        int i;
        ArrayList arrayList = this.e;
        arrayList.getClass();
        int size = arrayList.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        if (i > i2) {
            return null;
        }
        while (true) {
            ArrayList arrayList2 = this.e;
            arrayList2.getClass();
            cp3 cp3Var = (cp3) arrayList2.get(i2);
            if (cp3Var != null && c16.i(cp3Var.e.b, str) && c16.i(cp3Var.e.c, "http://www.w3.org/1999/xhtml")) {
                return cp3Var;
            }
            if (i2 != i) {
                i2--;
            } else {
                return null;
            }
        }
    }

    public final boolean L(String str) {
        ArrayList arrayList = this.e;
        arrayList.getClass();
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ArrayList arrayList2 = this.e;
            arrayList2.getClass();
            cp3 cp3Var = (cp3) arrayList2.get(size);
            if (cp3Var != null) {
                String str2 = cp3Var.e.b;
                if (c16.i(str2, str)) {
                    return true;
                }
                String[] strArr = d4b.a;
                if (!d4b.c(str2, F)) {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean M(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.y;
        strArr3[0] = str;
        return N(strArr3, strArr, strArr2);
    }

    public final boolean N(String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = this.e;
        arrayList.getClass();
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ArrayList arrayList2 = this.e;
            arrayList2.getClass();
            Object obj = arrayList2.get(size);
            obj.getClass();
            wjb wjbVar = ((cp3) obj).e;
            String str = wjbVar.b;
            String str2 = wjbVar.c;
            if (c16.i(str2, "http://www.w3.org/1999/xhtml")) {
                if (d4b.c(str, strArr)) {
                    return true;
                }
                if (!d4b.c(str, strArr2)) {
                    if (strArr3 != null && d4b.c(str, strArr3)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (Arrays.equals(strArr2, z)) {
                if (c16.i(str2, "http://www.w3.org/1998/Math/MathML")) {
                    String[] strArr4 = d4b.a;
                    if (d4b.c(str, A)) {
                        return false;
                    }
                }
                if (c16.i(str2, "http://www.w3.org/2000/svg")) {
                    String[] strArr5 = d4b.a;
                    if (d4b.c(str, B)) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void O(tbc tbcVar, boolean z2) {
        String N;
        tbcVar.getClass();
        s26 s26Var = tbcVar.d;
        String V = s26Var.V();
        if (k4b.f0(V, (char) 0, 0, 6) != -1) {
            if (z2) {
                N = V.replace((char) 0, (char) 65533);
                N.getClass();
            } else {
                N = r4b.N(V, false, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
            }
            s26Var.O();
            s26Var.b = N;
        }
        P(tbcVar, a());
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, al6] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, al6] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, al6] */
    public final void P(tbc tbcVar, cp3 cp3Var) {
        y28 y28Var;
        tbcVar.getClass();
        String V = tbcVar.d.V();
        if (tbcVar instanceof sbc) {
            ?? obj = new Object();
            obj.d = V;
            y28Var = obj;
        } else if (cp3Var.e.b(256)) {
            ?? obj2 = new Object();
            obj2.d = V;
            y28Var = obj2;
        } else {
            ?? obj3 = new Object();
            obj3.d = V;
            y28Var = obj3;
        }
        cp3Var.H(y28Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, al6, y28] */
    public final void Q(ubc ubcVar) {
        ubcVar.getClass();
        String V = ubcVar.d.V();
        ?? obj = new Object();
        obj.d = V;
        a().H(obj);
    }

    public final cp3 R(ybc ybcVar) {
        ybcVar.getClass();
        cp3 F2 = F(ybcVar, "http://www.w3.org/1999/xhtml", false);
        G(F2);
        if (ybcVar.f) {
            wjb wjbVar = F2.e;
            wjbVar.d |= 32;
            if (!wjbVar.c()) {
                if ((wjbVar.d & 1) != 0 && wjbVar.d()) {
                    rcc rccVar = this.c;
                    rccVar.getClass();
                    rccVar.p(ifc.d);
                    rcc rccVar2 = this.c;
                    rccVar2.getClass();
                    xbc xbcVar = this.u;
                    xbcVar.getClass();
                    xbcVar.f();
                    xbcVar.T(F2.e.a);
                    rccVar2.h(xbcVar);
                } else {
                    rcc rccVar3 = this.c;
                    rccVar3.getClass();
                    String n = hl5.n("Tag [", wjbVar.b, "] cannot be self-closing; not a void tag");
                    iv7 iv7Var = rccVar3.b;
                    if (iv7Var.b()) {
                        ((ArrayList) iv7Var.b).add(new nm8(rccVar3.a, n));
                    }
                }
            }
        }
        if (F2.e.c()) {
            r();
        }
        return F2;
    }

    public final cp3 S(ybc ybcVar) {
        ybcVar.getClass();
        cp3 F2 = F(ybcVar, "http://www.w3.org/1999/xhtml", false);
        G(F2);
        r();
        return F2;
    }

    public final void T(ybc ybcVar, String str) {
        ybcVar.getClass();
        str.getClass();
        cp3 F2 = F(ybcVar, str, true);
        G(F2);
        if (ybcVar.f) {
            F2.e.d |= 32;
            r();
        }
    }

    public final void U(ybc ybcVar, boolean z2, boolean z3) {
        ybcVar.getClass();
        tq4 tq4Var = (tq4) F(ybcVar, "http://www.w3.org/1999/xhtml", false);
        if (z3) {
            if (!X("template")) {
                this.p = tq4Var;
            }
        } else {
            this.p = tq4Var;
        }
        G(tq4Var);
        if (!z2) {
            r();
        }
    }

    public final boolean V(cp3 cp3Var) {
        List list;
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                cp3 cp3Var2 = (cp3) obj;
                if (cp3Var2 != null) {
                    arrayList2.add(cp3Var2);
                }
            }
            list = sl1.C0(arrayList2);
        } else {
            list = ks3.a;
        }
        return hq7.d(list, cp3Var);
    }

    public final boolean W(cp3 cp3Var) {
        ArrayList arrayList = this.e;
        arrayList.getClass();
        return hq7.d(arrayList, cp3Var);
    }

    public final boolean X(String str) {
        if (K(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean Y(String[] strArr) {
        ArrayList arrayList = this.e;
        arrayList.getClass();
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ArrayList arrayList2 = this.e;
            arrayList2.getClass();
            Object obj = arrayList2.get(size);
            obj.getClass();
            if (!d4b.c(((cp3) obj).e.b, strArr)) {
                return true;
            }
        }
        return false;
    }

    public final void Z(String str) {
        ArrayList arrayList = this.e;
        arrayList.getClass();
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                cp3 r = r();
                if (r != null && c16.i(r.e.b, str) && c16.i(r.e.c, "http://www.w3.org/1999/xhtml")) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.s;
        if (arrayList2 != null && !arrayList2.isEmpty() && (arrayList = this.s) != null) {
            de5 de5Var = (de5) a82.h(1, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0() {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.e
            r0.getClass()
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto Lf
            goto L86
        Lf:
            java.util.ArrayList r0 = r11.r
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L20
            java.lang.Object r1 = defpackage.nk2.n(r3, r0)
            cp3 r1 = (defpackage.cp3) r1
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L86
            boolean r4 = r11.W(r1)
            if (r4 == 0) goto L2a
            goto L86
        L2a:
            r4 = 0
            if (r0 == 0) goto L32
            int r5 = r0.size()
            goto L33
        L32:
            r5 = r4
        L33:
            int r6 = r5 + (-12)
            if (r6 >= 0) goto L38
            r6 = r4
        L38:
            int r5 = r5 - r3
            r7 = r5
        L3a:
            if (r7 != r6) goto L3d
            goto L52
        L3d:
            if (r0 == 0) goto L48
            int r7 = r7 + (-1)
            java.lang.Object r1 = r0.get(r7)
            cp3 r1 = (defpackage.cp3) r1
            goto L49
        L48:
            r1 = r2
        L49:
            if (r1 == 0) goto L51
            boolean r8 = r11.W(r1)
            if (r8 == 0) goto L3a
        L51:
            r3 = r4
        L52:
            if (r3 != 0) goto L5c
            int r7 = r7 + 1
            java.lang.Object r1 = r0.get(r7)
            cp3 r1 = (defpackage.cp3) r1
        L5c:
            cp3 r3 = new cp3
            r1.getClass()
            java.lang.String r6 = r1.u()
            wjb r8 = r1.e
            java.lang.String r8 = r8.b
            java.lang.String r9 = "http://www.w3.org/1999/xhtml"
            qm8 r10 = r11.m()
            wjb r6 = r11.y(r6, r8, r9, r10)
            j40 r8 = r1.e()
            j40 r8 = r8.clone()
            r3.<init>(r6, r2, r8)
            r11.G(r3)
            r0.set(r7, r3)
            if (r7 != r5) goto L51
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.b0():void");
    }

    public final void c0(cp3 cp3Var) {
        ArrayList arrayList = this.r;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            if (((cp3) arrayList.get(size)) == cp3Var) {
                arrayList.remove(size);
                return;
            } else if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void d0(cp3 cp3Var) {
        cp3Var.getClass();
        ArrayList arrayList = this.e;
        arrayList.getClass();
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ArrayList arrayList2 = this.e;
                arrayList2.getClass();
                Object obj = arrayList2.get(size);
                obj.getClass();
                if (((cp3) obj) == cp3Var) {
                    ArrayList arrayList3 = this.e;
                    arrayList3.getClass();
                    arrayList3.remove(size);
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.unc
    public final qm8 e() {
        return qm8.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
        r10.l = defpackage.de5.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
        if (r8.equals("th") == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
        if (r8.equals("td") == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
        if (r6 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0100, code lost:
        r10.l = defpackage.de5.L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e0() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.e0():boolean");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [xbc, zbc] */
    @Override // defpackage.unc
    public final void n(StringReader stringReader, String str, t6f t6fVar) {
        super.n(stringReader, str, t6fVar);
        this.l = de5.b;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new zbc(acc.c, this);
        this.v = true;
        this.w = false;
        this.x = false;
    }

    @Override // defpackage.unc
    public final unc o() {
        return new ed5();
    }

    @Override // defpackage.unc
    public final void p(cp3 cp3Var) {
        int i;
        if (cp3Var == this.o) {
            this.o = null;
        }
        if (cp3Var == this.p) {
            this.p = null;
        }
        c0(cp3Var);
        if (cp3Var.r("template")) {
            B();
            ArrayList arrayList = this.s;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                a0();
            }
            e0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if ("malignmark".equals(r4.e) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r0 == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (defpackage.c16.i(r3, "application/xhtml+xml") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
        if (defpackage.d4b.h(r1.e.a, (java.lang.String[]) java.util.Arrays.copyOf(defpackage.ed5.L, 3)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
        if (r0 != r6) goto L35;
     */
    @Override // defpackage.unc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(defpackage.dcc r10) {
        /*
            r9 = this;
            r10.getClass()
            java.lang.Object r0 = r10.c
            acc r0 = (defpackage.acc) r0
            java.util.ArrayList r1 = r9.e
            r1.getClass()
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L15
            goto Le1
        L15:
            cp3 r1 = r9.a()
            wjb r3 = r1.e
            java.lang.String r3 = r3.c
            java.lang.String r4 = "http://www.w3.org/1999/xhtml"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L27
            goto Le1
        L27:
            wjb r4 = r1.e
            java.lang.String r4 = r4.c
            java.lang.String r5 = "http://www.w3.org/1998/Math/MathML"
            boolean r4 = r5.equals(r4)
            acc r6 = defpackage.acc.e
            if (r4 == 0) goto L66
            java.lang.String[] r4 = defpackage.d4b.a
            wjb r4 = r1.e
            java.lang.String r4 = r4.b
            java.lang.String[] r7 = defpackage.ed5.K
            boolean r4 = defpackage.d4b.c(r4, r7)
            if (r4 == 0) goto L66
            boolean r4 = r10.e()
            if (r4 == 0) goto L62
            r4 = r10
            ybc r4 = (defpackage.ybc) r4
            java.lang.String r7 = r4.e
            java.lang.String r8 = "mglyph"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L62
            java.lang.String r7 = "malignmark"
            java.lang.String r4 = r4.e
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L62
            goto Le1
        L62:
            if (r0 != r6) goto L66
            goto Le1
        L66:
            boolean r3 = r5.equals(r3)
            java.lang.String r4 = "annotation-xml"
            if (r3 == 0) goto L88
            boolean r3 = r1.r(r4)
            if (r3 == 0) goto L88
            boolean r3 = r10.e()
            if (r3 == 0) goto L88
            r3 = r10
            ybc r3 = (defpackage.ybc) r3
            java.lang.String r3 = r3.e
            java.lang.String r7 = "svg"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L88
            goto Le1
        L88:
            wjb r3 = r1.e
            java.lang.String r3 = r3.c
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto Lb3
            boolean r3 = r1.r(r4)
            if (r3 == 0) goto Lb3
            java.lang.String r3 = "encoding"
            java.lang.String r3 = r1.c(r3)
            java.lang.String r3 = defpackage.tte.r(r3)
            java.lang.String r4 = "text/html"
            boolean r4 = defpackage.c16.i(r3, r4)
            if (r4 != 0) goto Ld4
            java.lang.String r4 = "application/xhtml+xml"
            boolean r3 = defpackage.c16.i(r3, r4)
            if (r3 == 0) goto Lb3
            goto Ld4
        Lb3:
            wjb r3 = r1.e
            java.lang.String r3 = r3.c
            java.lang.String r4 = "http://www.w3.org/2000/svg"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Ldd
            java.lang.String[] r3 = defpackage.d4b.a
            wjb r1 = r1.e
            java.lang.String r1 = r1.a
            java.lang.String[] r3 = defpackage.ed5.L
            r4 = 3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            boolean r1 = defpackage.d4b.h(r1, r3)
            if (r1 == 0) goto Ldd
        Ld4:
            boolean r1 = r10.e()
            if (r1 != 0) goto Le1
            if (r0 != r6) goto Ldd
            goto Le1
        Ldd:
            boolean r2 = r10.c()
        Le1:
            if (r2 == 0) goto Le6
            de5 r0 = r9.l
            goto Le8
        Le6:
            md5 r0 = defpackage.de5.U
        Le8:
            r0.getClass()
            boolean r9 = r0.a(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.s(dcc):boolean");
    }

    public final String toString() {
        dcc i = i();
        de5 de5Var = this.l;
        cp3 a = a();
        return "TreeBuilder{currentToken=" + i + ", state=" + de5Var + ", currentElement=" + a + "}";
    }

    public final cp3 z(cp3 cp3Var) {
        ArrayList arrayList = this.e;
        arrayList.getClass();
        if (hq7.d(arrayList, cp3Var)) {
            ArrayList arrayList2 = this.e;
            arrayList2.getClass();
            for (int size = arrayList2.size() - 1; size > 0; size--) {
                ArrayList arrayList3 = this.e;
                arrayList3.getClass();
                if (((cp3) arrayList3.get(size)) == cp3Var) {
                    ArrayList arrayList4 = this.e;
                    arrayList4.getClass();
                    return (cp3) arrayList4.get(size - 1);
                }
            }
            return null;
        }
        return null;
    }
}
