package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ew3  reason: default package */
/* loaded from: classes.dex */
public abstract class ew3 {
    public static final LinkedHashMap a = o17.r(new yk8("alpha", "\\alpha"), new yk8("beta", "\\beta"), new yk8("gamma", "\\gamma"), new yk8("delta", "\\delta"), new yk8("epsilon", "\\epsilon"), new yk8("theta", "\\theta"), new yk8("lambda", "\\lambda"), new yk8("mu", "\\mu"), new yk8("pi", "\\pi"), new yk8("sigma", "\\sigma"), new yk8("tau", "\\tau"), new yk8("phi", "\\phi"), new yk8("omega", "\\omega"), new yk8("sin", "\\sin"), new yk8("cos", "\\cos"), new yk8("tan", "\\tan"), new yk8("sec", "\\sec"), new yk8("csc", "\\csc"), new yk8("cot", "\\cot"), new yk8("log", "\\log"), new yk8("ln", "\\ln"), new yk8("lim", "\\lim"), new yk8("inf", "\\infty"), new yk8("sum", "\\sum"), new yk8("smallsum", "\\sum"), new yk8("prod", "\\prod"), new yk8("int", "\\int"), new yk8("oint", "\\oint"), new yk8("rightarrow", "\\rightarrow"), new yk8("leftarrow", "\\leftarrow"), new yk8("partial", "\\partial"), new yk8("nabla", "\\nabla"), new yk8("angle", "\\angle"), new yk8("triangle", "\\triangle"), new yk8("vec", "\\vec"), new yk8("bar", "\\overline"), new yk8("dot", "\\dot"), new yk8("hat", "\\hat"), new yk8("left", "\\left"), new yk8("right", "\\right"));
    public static final LinkedHashMap b = o17.r(new yk8("times", "\\times"), new yk8("divide", "\\div"), new yk8("div", "\\div"), new yk8("le", "\\leq"), new yk8("ge", "\\geq"), new yk8("geq", "\\geq"), new yk8("deg", "^\\circ"), new yk8("rarrow", "\\rightarrow"), new yk8("larrow", "\\leftarrow"), new yk8("lrarrow", "\\leftrightarrow"), new yk8("in", "\\in"), new yk8("notin", "\\notin"), new yk8("emptyset", "\\emptyset"), new yk8("subset", "\\subset"), new yk8("nsubset", "\\nsubseteq"), new yk8("cup", "\\cup"), new yk8("cap", "\\cap"), new yk8("smallinter", "\\cap"), new yk8("sim", "\\sim"), new yk8("circ", "\\circ"), new yk8("bot", "\\perp"), new yk8("dyad", "\\overleftrightarrow"), new yk8("arch", "\\overset{\\frown}"));
    public static final gm9 c = new gm9(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
    public static final gm9 d = new gm9("\\s+");
    public static final gm9 e = new gm9("`+");
    public static final gm9 f = new gm9("~+");
    public static final gm9 g = new gm9("(?i)\\bmatrix\\s*\\{([^{}]*)\\}");
    public static final gm9 h = new gm9("(?i)\\bcases\\s*\\{([^{}]*)\\}");
    public static final gm9 i = new gm9("(?i)(?<!\\\\)\\broot\\s+(\\{[^{}]*\\}|\\S+)\\s+of\\s+(\\{[^{}]*\\}|\\S+)");
    public static final gm9 j = new gm9("(?i)(?<!\\\\)\\bsqrt\\s*(\\{[^{}]*\\}|\\S+)");
    public static final gm9 k = new gm9("\\s*\\^\\s*");
    public static final gm9 l = new gm9("\\s*_\\s*");
    public static final gm9 m = new gm9("\\^(?!\\{)([^\\s{}_^]+)");
    public static final gm9 n = new gm9("_(?!\\{)([^\\s{}_^]+)");
    public static final gm9 o = new gm9("\\+-");
    public static final gm9 p = new gm9("-\\+");
    public static final gm9 q = new gm9("//");
    public static final gm9 r = new gm9("△");
    public static final gm9 s = new gm9("□");
    public static final gm9 t = new gm9("‧");
    public static final gm9 u = new gm9("!=");
    public static final gm9 v = new gm9("<=");
    public static final gm9 w = new gm9(">=");
    public static final gm9 x = new gm9("==");
    public static final gm9 y = new gm9("(?i)(?<!\\\\)\\b(?:rm|it)\\b\\s*");
    public static final gm9 z = new gm9("(?<![\\\\A-Za-z0-9])([A-Za-z][A-Za-z0-9]*)(?![A-Za-z0-9])");
    public static final gm9 A = new gm9("\\\\left\\s*\\{");
    public static final gm9 B = new gm9("\\\\right\\s*\\}");
    public static final gm9 C = new gm9("\\\\left\\s*([\\[\\]\\(\\)\\|])");
    public static final gm9 D = new gm9("\\\\right\\s*([\\[\\]\\(\\)\\|])");
    public static final gm9 E = new gm9("\\s*\\\\,\\s*");
    public static final gm9 F = new gm9("\\s+");
    public static final gm9 G = new gm9("\\{\\s+");
    public static final gm9 H = new gm9("\\s+\\}");
    public static final gm9 I = new gm9("\\s");
    public static final gm9 J = new gm9("[+\\-=<>]");
    public static final gm9 K = new gm9("[A-Za-z0-9_]");

    public static final String a(int i2, String str) {
        int i3;
        gm9 gm9Var;
        ph5 ph5Var;
        int b2;
        int b3;
        ph5 ph5Var2;
        int c2;
        int c3;
        Character ch;
        Character ch2;
        if (str.length() == 0 || i2 > 12) {
            return str;
        }
        int i4 = 4;
        String h2 = i.h(h.h(g.h(k4b.N0(f.i(e.i(d.i(str, " "), "\\,"), "\\,")).toString(), new dw3(4)), new dw3(5)), new tr0(i2, 4));
        int i5 = 0;
        int i6 = 0;
        while (i6 < 50) {
            int i7 = i5;
            int i8 = i7;
            int i9 = i8;
            while (true) {
                i3 = i4;
                if (i7 <= h2.length() - i4) {
                    char charAt = h2.charAt(i7);
                    if (charAt != '(') {
                        if (charAt != ')') {
                            if (charAt != '{') {
                                if (charAt == '}') {
                                    i9 = Math.max(i5, i9 - 1);
                                }
                            } else {
                                i9++;
                            }
                        } else {
                            i8 = Math.max(i5, i8 - 1);
                        }
                    } else {
                        i8++;
                    }
                    if (i9 == 0 && i8 == 0) {
                        int i10 = i3 + i7;
                        String lowerCase = h2.substring(i7, i10).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("over")) {
                            int i11 = i7 - 1;
                            if (i11 >= 0 && i11 < h2.length()) {
                                ch = Character.valueOf(h2.charAt(i11));
                            } else {
                                ch = null;
                            }
                            gm9 gm9Var2 = K;
                            if (ch == null || !gm9Var2.g(String.valueOf(ch.charValue()))) {
                                if (i10 >= 0 && i10 < h2.length()) {
                                    ch2 = Character.valueOf(h2.charAt(i10));
                                } else {
                                    ch2 = null;
                                }
                                if (ch2 == null || !gm9Var2.g(String.valueOf(ch2.charValue()))) {
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    i4 = i3;
                    i5 = 0;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 < 0) {
                break;
            }
            int i12 = i7 - 1;
            while (true) {
                gm9Var = I;
                if (i12 < 0 || !gm9Var.g(String.valueOf(h2.charAt(i12)))) {
                    break;
                }
                i12--;
            }
            gm9 gm9Var3 = J;
            if (i12 < 0) {
                ph5Var = null;
            } else if (h2.charAt(i12) == '}' && (b3 = b(h2, i12, '{', '}')) >= 0) {
                ph5Var = new ph5(b3, h2.substring(b3, i12 + 1));
            } else if (h2.charAt(i12) == ')' && (b2 = b(h2, i12, '(', ')')) >= 0) {
                ph5Var = new ph5(b2, h2.substring(b2, i12 + 1));
            } else {
                int i13 = i12;
                while (i13 >= 0 && !gm9Var.g(String.valueOf(h2.charAt(i13))) && !gm9Var3.g(String.valueOf(h2.charAt(i13)))) {
                    i13--;
                }
                int i14 = i13 + 1;
                ph5Var = new ph5(i14, h2.substring(i14, i12 + 1));
            }
            int i15 = i7 + 4;
            while (i15 < h2.length() && gm9Var.g(String.valueOf(h2.charAt(i15)))) {
                i15++;
            }
            if (i15 >= h2.length()) {
                ph5Var2 = null;
            } else if (h2.charAt(i15) == '{' && (c3 = c(h2, i15, '{', '}')) >= 0) {
                int i16 = c3 + 1;
                ph5Var2 = new ph5(i16, h2.substring(i15, i16));
            } else if (h2.charAt(i15) == '(' && (c2 = c(h2, i15, '(', ')')) >= 0) {
                int i17 = c2 + 1;
                ph5Var2 = new ph5(i17, h2.substring(i15, i17));
            } else {
                int i18 = i15;
                while (i18 < h2.length() && !gm9Var.g(String.valueOf(h2.charAt(i18))) && !gm9Var3.g(String.valueOf(h2.charAt(i18)))) {
                    i18++;
                }
                ph5Var2 = new ph5(i18, h2.substring(i15, i18));
            }
            if (ph5Var == null || ph5Var2 == null) {
                break;
            }
            int i19 = i2 + 1;
            String a2 = a(i19, d(ph5Var.a));
            String a3 = a(i19, d(ph5Var2.a));
            String substring = h2.substring(0, ph5Var.b);
            String substring2 = h2.substring(ph5Var2.b);
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append("\\frac{");
            sb.append(a2);
            sb.append("}{");
            sb.append(a3);
            h2 = s21.q(sb, "}", substring2);
            i6++;
            i4 = i3;
            i5 = 0;
        }
        return k4b.N0(H.i(G.i(F.i(E.i(D.h(C.h(B.i(A.i(z.h(y.i(x.i(w.i(v.i(u.i(t.i(s.i(r.i(q.i(p.i(o.i(n.h(m.h(l.i(k.i(j.h(h2, new tr0(i2, 5)), "^"), "_"), new u83(29)), new dw3(1)), "\\pm"), "\\mp"), "\\parallel"), "\\triangle "), "\\square "), "\\cdot "), "\\neq"), "\\leq"), "\\geq"), "\\equiv"), ""), new dw3(6)), "\\left\\{"), "\\right\\}"), new dw3(2)), new dw3(3)), "\\,"), " "), "{"), "}")).toString();
    }

    public static final int b(String str, int i2, char c2, char c3) {
        int i3 = 0;
        while (i2 >= 0) {
            if (str.charAt(i2) == c3) {
                i3++;
            } else if (str.charAt(i2) == c2 && i3 - 1 == 0) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static final int c(String str, int i2, char c2, char c3) {
        int i3 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == c2) {
                i3++;
            } else if (str.charAt(i2) == c3 && i3 - 1 == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final String d(String str) {
        String obj = k4b.N0(str).toString();
        if (r4b.Q(obj, "{", false) && r4b.I(obj, "}", false)) {
            return obj.substring(1, obj.length() - 1);
        }
        return obj;
    }
}
