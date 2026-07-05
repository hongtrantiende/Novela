package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gw3  reason: default package */
/* loaded from: classes.dex */
public abstract class gw3 {
    public static final gm9 a = new gm9("^[^:]+:");
    public static final HashSet b = fca.m("sin", "cos", "tan", "cot", "sec", "csc", "sinh", "cosh", "tanh", "coth", "arcsin", "arccos", "arctan", "log", "ln", "lg", "exp", "det", "dim", "gcd", "inf", "sup", "lim", "max", "min", "Pr", "arg");
    public static final HashMap c = o17.q(new yk8("̂", "\\hat"), new yk8("̃", "\\tilde"), new yk8("̄", "\\bar"), new yk8("̇", "\\dot"), new yk8("̈", "\\ddot"), new yk8("́", "\\acute"), new yk8("̀", "\\grave"), new yk8("̆", "\\breve"), new yk8("̌", "\\check"), new yk8("⃗", "\\vec"), new yk8("→", "\\vec"));
    public static final HashMap d = o17.q(new yk8("∑", "\\sum"), new yk8("∏", "\\prod"), new yk8("∐", "\\coprod"), new yk8("∫", "\\int"), new yk8("∬", "\\iint"), new yk8("∭", "\\iiint"), new yk8("∮", "\\oint"), new yk8("∯", "\\oiint"), new yk8("∰", "\\oiiint"), new yk8("⋃", "\\bigcup"), new yk8("⋂", "\\bigcap"), new yk8("⨁", "\\bigoplus"), new yk8("⨂", "\\bigotimes"), new yk8("⨀", "\\bigodot"));
    public static final gm9 e = new gm9("\\s+");

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
        if (r8.equals("oMathPara") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0339, code lost:
        if (r8.equals("sup") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0341, code lost:
        if (r8.equals("sub") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0388, code lost:
        if (defpackage.c16.i(r1, "true") == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03c2, code lost:
        if (r8.equals("rPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03cc, code lost:
        if (r8.equals("num") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03d6, code lost:
        if (r8.equals("mPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03e0, code lost:
        if (r8.equals("lim") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03ea, code lost:
        if (r8.equals("fPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03f4, code lost:
        if (r8.equals("den") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03fc, code lost:
        if (r8.equals("deg") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0406, code lost:
        if (r8.equals("dPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0580, code lost:
        if (r8.equals("e") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0584, code lost:
        r0 = a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0628, code lost:
        if (r8.equals("sSupPr") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0635, code lost:
        if (r8.equals("sSubPr") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0640, code lost:
        if (r8.equals("naryPr") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ef, code lost:
        if (r8.equals("sSubSupPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06e0, code lost:
        if (r8.equals("funcPr") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06ec, code lost:
        if (r8.equals("ctrlPr") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06f4, code lost:
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
        if (r8.equals("borderBox") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011b, code lost:
        if (r8.equals("radPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
        if (r8.equals("phant") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
        if (r8.equals("oMath") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
        r0 = a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
        if (r8.equals("eqArr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
        r0 = a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
        if (r8.equals("fName") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (r8.equals("barPr") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
        if (r8.equals("accPr") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(defpackage.n66 r29) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw3.a(n66):java.lang.String");
    }

    public static final n66 b(n66 n66Var, String str) {
        return (n66) sl1.f0(0, d(n66Var, str));
    }

    public static final String c(String str) {
        String obj = k4b.N0(str).toString();
        if (obj.length() == 0) {
            return "{}";
        }
        if (r4b.Q(obj, "{", false) && r4b.I(obj, "}", false)) {
            return obj;
        }
        return hl5.n("{", obj, "}");
    }

    public static final ArrayList d(n66 n66Var, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList b2 = n66Var.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            n66 n66Var2 = (n66) b2.get(i);
            if (n66Var2.a.getNodeType() == 1 && c16.i(e(n66Var2), str)) {
                arrayList.add(n66Var2);
            }
        }
        return arrayList;
    }

    public static final String e(n66 n66Var) {
        String d2 = n66Var.d();
        if (d2 != null && d2.length() != 0) {
            return d2;
        }
        String e2 = n66Var.e();
        if (e2 == null) {
            e2 = "";
        }
        return a.i(e2, "");
    }

    public static final String f(n66 n66Var) {
        String a2 = n66Var.a("m:val");
        if (a2 == null) {
            return n66Var.a("val");
        }
        return a2;
    }

    public static final String g(String str, boolean z) {
        HashMap q = o17.q(new yk8("(", "("), new yk8("[", "["), new yk8("{", "\\{"), new yk8("⟨", "\\langle"), new yk8("|", "|"), new yk8("‖", "\\|"), new yk8("⌊", "\\lfloor"), new yk8("⌈", "\\lceil"), new yk8("", "."));
        HashMap q2 = o17.q(new yk8(")", ")"), new yk8("]", "]"), new yk8("}", "\\}"), new yk8("⟩", "\\rangle"), new yk8("|", "|"), new yk8("‖", "\\|"), new yk8("⌋", "\\rfloor"), new yk8("⌉", "\\rceil"), new yk8("", "."));
        if (!z) {
            q = q2;
        }
        String str2 = (String) q.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}
