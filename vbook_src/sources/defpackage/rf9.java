package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rf9  reason: default package */
/* loaded from: classes.dex */
public final class rf9 implements AutoCloseable {
    public final lcc a;
    public final String b;
    public boolean c;
    public static final char[] d = {'>', '+', '~'};
    public static final char[] e = {',', ')'};
    public static final String[] f = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final gm9 C = new gm9("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 0);
    public static final gm9 D = new gm9("([+-])?(\\d+)");

    public rf9(String str) {
        int i;
        boolean z;
        if (str.length() != 0) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (c16.l(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str.subSequence(i2, length + 1).toString();
            this.b = obj;
            this.a = new lcc(obj);
            return;
        }
        cy7.i("String must not be empty");
        throw null;
    }

    public final ex3 C(boolean z) {
        String str;
        if (z) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        String q = q();
        if (k4b.W(q, '\\')) {
            StringBuilder b = d4b.b();
            int length = q.length();
            char c = 0;
            for (int i = 0; i < length; i++) {
                char charAt = q.charAt(i);
                if (charAt == '\\') {
                    if (c == '\\') {
                        b.append(charAt);
                        c = 0;
                    }
                } else {
                    b.append(charAt);
                }
                c = charAt;
            }
            q = d4b.l(b);
        }
        String concat = str.concat("(text) query must not be empty");
        if (q.length() != 0) {
            if (this.c) {
                return new k38(q);
            }
            if (z) {
                return new ww3(q, 4);
            }
            return new ww3(q, 5);
        }
        cy7.i(concat);
        return null;
    }

    public final ex3 G(boolean z) {
        String str;
        if (z) {
            str = ":containsWholeOwnText";
        } else {
            str = ":containsWholeText";
        }
        String q = q();
        if (k4b.W(q, '\\')) {
            StringBuilder b = d4b.b();
            int length = q.length();
            char c = 0;
            for (int i = 0; i < length; i++) {
                char charAt = q.charAt(i);
                if (charAt == '\\') {
                    if (c == '\\') {
                        b.append(charAt);
                        c = 0;
                    }
                } else {
                    b.append(charAt);
                }
                c = charAt;
            }
            q = d4b.l(b);
        }
        String concat = str.concat("(text) query must not be empty");
        if (q.length() != 0) {
            if (z) {
                return new ww3(6, q, false);
            }
            return new ww3(7, q, false);
        }
        cy7.i(concat);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[LOOP:1: B:68:0x0132->B:70:0x0138, LOOP_END] */
    /* JADX WARN: Type inference failed for: r15v32, types: [ex3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ex3 I0() {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf9.I0():ex3");
    }

    public final cx3 Q(boolean z, boolean z2) {
        yk8 yk8Var;
        yk8 yk8Var2;
        int i;
        int i2;
        String r = tte.r(q());
        if (r4b.J(r, "odd", true)) {
            yk8Var2 = new yk8(2, 1);
        } else if (r4b.J(r, "even", true)) {
            yk8Var2 = new yk8(2, 0);
        } else {
            b27 f2 = C.f(r);
            if (f2 != null) {
                String str = (String) ((z17) f2.a()).get(2);
                String str2 = (String) ((z17) f2.a()).get(4);
                if (((String) ((z17) f2.a()).get(3)).length() > 0) {
                    CharSequence charSequence = (CharSequence) ((z17) f2.a()).get(1);
                    Pattern compile = Pattern.compile("^\\+");
                    compile.getClass();
                    charSequence.getClass();
                    String replaceFirst = compile.matcher(charSequence).replaceFirst("");
                    replaceFirst.getClass();
                    i = Integer.parseInt(replaceFirst);
                } else if (c16.i(str, "-")) {
                    i = -1;
                } else {
                    i = 1;
                }
                if (str2.length() > 0) {
                    Pattern compile2 = Pattern.compile("^\\+");
                    compile2.getClass();
                    String replaceFirst2 = compile2.matcher(str2).replaceFirst("");
                    replaceFirst2.getClass();
                    i2 = Integer.parseInt(replaceFirst2);
                } else {
                    i2 = 0;
                }
                yk8Var = new yk8(Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                b27 f3 = D.f(r);
                if (f3 != null) {
                    String c = f3.c();
                    Pattern compile3 = Pattern.compile("^\\+");
                    compile3.getClass();
                    String replaceFirst3 = compile3.matcher(c).replaceFirst("");
                    replaceFirst3.getClass();
                    yk8Var = new yk8(0, Integer.valueOf(Integer.parseInt(replaceFirst3)));
                } else {
                    throw new bj1(hl5.n("Could not parse nth-index '", r, "': unexpected format"), 5);
                }
            }
            yk8Var2 = yk8Var;
        }
        int intValue = ((Number) yk8Var2.a).intValue();
        int intValue2 = ((Number) yk8Var2.b).intValue();
        if (z2 && z) {
            return new cx3(intValue, intValue2, 2);
        }
        if (z2) {
            return new cx3(intValue, intValue2, 3);
        }
        if (z) {
            return new cx3(intValue, intValue2, 1);
        }
        return new cx3(intValue, intValue2, 0);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [ex3, yw3, java.lang.Object] */
    public final ex3 S(lcc lccVar) {
        String[] strArr = (String[]) Arrays.copyOf(f, 6);
        vc1 vc1Var = (vc1) lccVar.b;
        StringBuilder b = d4b.b();
        loop0: while (!vc1Var.g0()) {
            for (String str : strArr) {
                if (vc1Var.V0(str)) {
                    break loop0;
                }
            }
            b.append(vc1Var.C());
        }
        String r = tte.r(d4b.l(b));
        if (r != null && r.length() != 0) {
            if (!r.equals("abs:")) {
                lccVar.G();
                if (vc1Var.g0()) {
                    if (r4b.Q(r, "^", false)) {
                        return new ww3(r.substring(1), 1);
                    }
                    if (r.equals("*")) {
                        return new ww3("", 1);
                    }
                    return new ww3(0, r, false);
                } else if (lccVar.Q('=')) {
                    return new xw3(r, vc1Var.S(), 0);
                } else {
                    if (vc1Var.p0("!=")) {
                        return new xw3(r, vc1Var.S(), 3);
                    }
                    if (vc1Var.p0("^=")) {
                        return new xw3(r, vc1Var.S(), 4);
                    }
                    if (vc1Var.p0("$=")) {
                        return new xw3(r, vc1Var.S(), 2);
                    }
                    if (vc1Var.p0("*=")) {
                        return new xw3(r, vc1Var.S(), 1);
                    }
                    if (vc1Var.p0("~=")) {
                        gm9 gm9Var = new gm9(vc1Var.S());
                        ?? obj = new Object();
                        obj.a = gm9Var;
                        obj.b = tte.r(r);
                        return obj;
                    }
                    throw new bj1(hl5.o("Could not parse attribute query '", this.b, "': unexpected token at '", vc1Var.S(), "'"), 5);
                }
            }
            cy7.i("Absolute attribute key must have a name");
            return null;
        }
        cy7.i("String must not be empty");
        return null;
    }

    public final ex3 V(boolean z) {
        String str;
        if (z) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        String q = q();
        String concat = str.concat("(regex) query must not be empty");
        if (q.length() != 0) {
            gm9 gm9Var = new gm9(q);
            if (this.c) {
                return new k38(gm9Var);
            }
            if (z) {
                return new dx3(gm9Var, 1);
            }
            return new dx3(gm9Var, 0);
        }
        cy7.i(concat);
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final ex3 g0(boolean z) {
        String str;
        if (z) {
            str = ":matchesWholeOwnText";
        } else {
            str = ":matchesWholeText";
        }
        String q = q();
        String concat = str.concat("(regex) query must not be empty");
        if (q.length() != 0) {
            gm9 gm9Var = new gm9(q);
            if (z) {
                return new dx3(gm9Var, 2);
            }
            return new dx3(gm9Var, 3);
        }
        cy7.i(concat);
        return null;
    }

    public final ex3 j0() {
        ex3 p0 = p0();
        lcc lccVar = this.a;
        lccVar.G();
        if (((vc1) lccVar.b).g0()) {
            return p0;
        }
        throw new bj1(hl5.o("Could not parse query '", this.b, "': unexpected token at '", ((vc1) lccVar.b).S(), "'"), 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ex3 m0() {
        /*
            r10 = this;
            lcc r0 = r10.a
            r0.G()
            char[] r1 = defpackage.rf9.d
            r2 = 3
            char[] r3 = java.util.Arrays.copyOf(r1, r2)
            java.lang.Object r4 = r0.b
            vc1 r4 = (defpackage.vc1) r4
            int r5 = r3.length
            char[] r3 = java.util.Arrays.copyOf(r3, r5)
            boolean r3 = r4.I0(r3)
            if (r3 == 0) goto L23
            vw3 r3 = new vw3
            r5 = 8
            r3.<init>(r5)
            goto L27
        L23:
            ex3 r3 = r10.y0()
        L27:
            boolean r5 = r0.G()
            r6 = 0
            r7 = 32
            if (r5 == 0) goto L32
            r5 = r7
            goto L33
        L32:
            r5 = r6
        L33:
            char[] r8 = java.util.Arrays.copyOf(r1, r2)
            int r9 = r8.length
            char[] r8 = java.util.Arrays.copyOf(r8, r9)
            boolean r8 = r4.I0(r8)
            if (r8 == 0) goto L47
            char r5 = r4.C()
            goto L5b
        L47:
            char[] r8 = defpackage.rf9.e
            r9 = 2
            char[] r8 = java.util.Arrays.copyOf(r8, r9)
            int r9 = r8.length
            char[] r8 = java.util.Arrays.copyOf(r8, r9)
            boolean r8 = r4.I0(r8)
            if (r8 == 0) goto L5b
            goto Ld3
        L5b:
            if (r5 == 0) goto Ld3
            ex3 r8 = r10.y0()
            if (r5 == r7) goto Lc8
            r6 = 43
            if (r5 == r6) goto Lbd
            r6 = 62
            if (r5 == r6) goto L93
            r6 = 126(0x7e, float:1.77E-43)
            if (r5 != r6) goto L79
            y4b r5 = new y4b
            r5.<init>(r3)
            ex3 r3 = defpackage.xbe.j(r5, r8)
            goto L27
        L79:
            bj1 r10 = new bj1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown combinator '"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 5
            r10.<init>(r0, r1)
            throw r10
        L93:
            boolean r5 = r3 instanceof defpackage.w4b
            if (r5 == 0) goto L9b
            r5 = r3
            w4b r5 = (defpackage.w4b) r5
            goto L9c
        L9b:
            r5 = 0
        L9c:
            if (r5 != 0) goto La3
            w4b r5 = new w4b
            r5.<init>(r3)
        La3:
            java.util.ArrayList r3 = r5.d
            r3.add(r8)
            int r3 = r5.e
            int r6 = r8.a()
            int r6 = r6 + r3
            r5.e = r6
            boolean r3 = r5.b
            boolean r6 = r8.f()
            r3 = r3 | r6
            r5.b = r3
            r3 = r5
            goto L27
        Lbd:
            x4b r5 = new x4b
            r5.<init>(r3)
            ex3 r3 = defpackage.xbe.j(r5, r8)
            goto L27
        Lc8:
            u4b r5 = new u4b
            r5.<init>(r3, r6)
            ex3 r3 = defpackage.xbe.j(r5, r8)
            goto L27
        Ld3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf9.m0():ex3");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o() {
        /*
            r7 = this;
            java.lang.String r7 = r7.q()
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        Ld:
            if (r3 > r0) goto L32
            if (r4 != 0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r0
        L14:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = defpackage.c16.l(r5, r6)
            if (r5 > 0) goto L22
            r5 = r1
            goto L23
        L22:
            r5 = r2
        L23:
            if (r4 != 0) goto L2c
            if (r5 != 0) goto L29
            r4 = r1
            goto Ld
        L29:
            int r3 = r3 + 1
            goto Ld
        L2c:
            if (r5 != 0) goto L2f
            goto L32
        L2f:
            int r0 = r0 + (-1)
            goto Ld
        L32:
            int r0 = r0 + r1
            java.lang.CharSequence r7 = r7.subSequence(r3, r0)
            java.lang.String r7 = r7.toString()
            java.lang.String[] r0 = defpackage.d4b.a
            if (r7 == 0) goto L57
            int r0 = r7.length()
            if (r0 != 0) goto L46
            goto L57
        L46:
            int r0 = r7.length()
            r3 = r2
        L4b:
            if (r3 >= r0) goto L5c
            char r4 = r7.charAt(r3)
            boolean r4 = defpackage.d4b.f(r4)
            if (r4 != 0) goto L59
        L57:
            r1 = r2
            goto L5c
        L59:
            int r3 = r3 + 1
            goto L4b
        L5c:
            if (r1 == 0) goto L63
            int r7 = java.lang.Integer.parseInt(r7)
            return r7
        L63:
            java.lang.String r7 = "Index must be numeric"
            defpackage.cy7.i(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf9.o():int");
    }

    public final ex3 p0() {
        ex3 m0 = m0();
        while (this.a.Q(',')) {
            ex3 m02 = m0();
            if (m0 instanceof qo1) {
                qo1 qo1Var = (qo1) m0;
                qo1Var.a.add(m02);
                qo1Var.g();
            } else {
                m0 = new qo1(m0, m02);
            }
        }
        return m0;
    }

    public final String q() {
        return this.a.q('(', ')');
    }

    public final String toString() {
        return this.b;
    }

    public final ex3 y0() {
        ex3 ww3Var;
        lcc lccVar = this.a;
        lccVar.G();
        vc1 vc1Var = (vc1) lccVar.b;
        ex3 ex3Var = null;
        if (!Character.isLetterOrDigit(vc1Var.V()) && !vc1Var.V0("*|")) {
            if (lccVar.Q('*')) {
                ex3Var = new vw3(0);
            }
        } else {
            char[] copyOf = Arrays.copyOf(lcc.d, 4);
            StringBuilder b = d4b.b();
            while (!vc1Var.g0()) {
                char V = vc1Var.V();
                if (V == '\\') {
                    lccVar.o();
                    if (vc1Var.g0()) {
                        break;
                    }
                    b.append(vc1Var.C());
                } else {
                    char[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
                    if (!Character.isLetterOrDigit(vc1Var.V()) && !vc1Var.I0(Arrays.copyOf(copyOf2, copyOf2.length))) {
                        break;
                    }
                    b.append(V);
                    lccVar.o();
                }
            }
            String r = tte.r(d4b.l(b));
            if (r != null && r.length() != 0) {
                if (r4b.Q(r, "*|", false)) {
                    String substring = r.substring(2);
                    ww3Var = new qo1(new ww3(substring, 9), new ww3(10, ":".concat(substring), false));
                } else if (r4b.I(r, "|*", false)) {
                    ww3Var = new ww3(11, r.substring(0, r.length() - 2).concat(":"), false);
                } else {
                    if (k4b.V(r, "|", false)) {
                        r = r4b.N(r, false, "|", ":");
                    }
                    ww3Var = new ww3(r, 9);
                }
                ex3Var = ww3Var;
            } else {
                cy7.i("String must not be empty");
                return null;
            }
        }
        while (true) {
            ex3 I0 = I0();
            if (I0 == null) {
                break;
            }
            ex3Var = xbe.j(ex3Var, I0);
        }
        if (ex3Var != null) {
            return ex3Var;
        }
        throw new bj1(hl5.o("Could not parse query '", this.b, "': unexpected token at '", vc1Var.S(), "'"), 5);
    }
}
