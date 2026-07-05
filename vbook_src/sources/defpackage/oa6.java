package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import javax.xml.namespace.QName;
import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oa6  reason: default package */
/* loaded from: classes3.dex */
public final class oa6 implements zod {
    public boolean C;
    public int D;
    public String H;
    public Boolean I;
    public int J;
    public int K;
    public char[] L;
    public char[] M;
    public final ku3 N;
    public final yx7 O;
    public final mu9 P;
    public String Q;
    public String R;
    public char[] S;
    public int T;
    public boolean U;
    public String V;
    public ma6 W;
    public String[] X;
    public final Reader a;
    public int c;
    public int d;
    public EventType e;
    public String f;
    public int b = 1;
    public String[] E = new String[16];
    public final mce F = new mce(this);
    public String G = null;

    public oa6(Reader reader) {
        this.a = reader;
        char[] cArr = new char[4096];
        this.L = cArr;
        int f = hq7.f(reader, cArr);
        if (f >= 0) {
            if (f < 4096) {
                this.M = new char[0];
                this.K = f;
            } else {
                char[] cArr2 = new char[4096];
                this.M = cArr2;
                int f2 = hq7.f(reader, cArr2);
                this.K = (f2 < 0 ? 0 : f2) + 4096;
            }
            if (this.L[0] == 65279) {
                this.J = 1;
                this.d = 1;
                this.c = 1;
            }
            this.N = new ku3();
            this.O = new yx7();
            this.P = new mu9(this);
            this.S = new char[512];
            this.W = ma6.a;
            this.X = new String[48];
            return;
        }
        vs.m("Trying to parse an empty file (that is not valid XML)");
        throw null;
    }

    public final void A1(char c) {
        int read = read();
        if (read == c) {
            return;
        }
        o("expected: '" + c + "' actual: '" + ((char) read) + '\'');
        throw null;
    }

    public final void B1(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int read = read();
            if (charAt != read) {
                o("Found unexpected character '" + read + "' while parsing '" + str + '\'');
                throw null;
            }
        }
    }

    public final int C1() {
        char c;
        int i = this.J;
        if (i >= 4096) {
            H1();
            i -= 4096;
        }
        int i2 = i + 1;
        char[] cArr = this.L;
        char c2 = cArr[i];
        if (c2 != 0) {
            if (c2 != '\n') {
                if (c2 != '\r') {
                    b1();
                    this.J = i2;
                    return c2;
                }
                cArr[this.J] = '\n';
                if (i2 < this.K) {
                    int i3 = i - 4095;
                    if (i3 < 0) {
                        c = cArr[i2];
                    } else {
                        c = this.M[i3];
                    }
                    if (c == '\n') {
                        int i4 = i - 4095;
                        if (i4 < 0) {
                            cArr[i2] = 0;
                        } else {
                            this.M[i4] = 0;
                        }
                        this.J = i + 2;
                        g1(2);
                        return 10;
                    }
                }
                this.J = i2;
                g1(1);
                return 10;
            }
            this.J = i2;
            g1(1);
            return 10;
        }
        this.J = i2;
        return C1();
    }

    public final char D1() {
        int i;
        int i2 = this.J;
        if (i2 < this.K) {
            int i3 = i2 + 1;
            if (i3 >= 4096) {
                int C1 = C1();
                v1(C1);
                return (char) C1;
            }
            int i4 = this.T;
            if (i4 >= this.S.length) {
                V0(i4);
            }
            char[] cArr = this.L;
            char c = cArr[i2];
            if (c != '\n') {
                if (c != '\r') {
                    b1();
                    this.J = i3;
                    i = i4 + 1;
                    this.S[i4] = c;
                    this.T = i;
                    return c;
                }
                if (i3 < this.K && cArr[i3] == '\n') {
                    g1(2);
                    i3 = 2 + i2;
                } else {
                    g1(1);
                }
                this.J = i3;
                i = i4 + 1;
                this.S[i4] = '\n';
            } else {
                this.J = i3;
                g1(1);
                i = i4 + 1;
                this.S[i4] = '\n';
            }
            c = '\n';
            this.T = i;
            return c;
        }
        o("Unexpected EOF");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
        r11.J = r7;
        r11.Q = r9;
        r11.R = q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            r11 = this;
            int r0 = r11.J
            int r1 = r11.K
            r2 = 0
            java.lang.String r3 = "Unexpected EOF"
            r4 = 0
            r5 = 4096(0x1000, float:5.74E-42)
            if (r5 >= r1) goto L1b
            if (r0 != r5) goto L19
            r11.H1()
            int r0 = r11.K
            int r1 = java.lang.Math.min(r5, r0)
            r0 = r4
            goto L1d
        L19:
            r1 = r5
            goto L1d
        L1b:
            if (r0 >= r1) goto L89
        L1d:
            char[] r6 = r11.L
            char r7 = r6[r0]
            r8 = 58
            if (r7 == r8) goto L77
            boolean r9 = defpackage.e4b.b(r7)
            if (r9 == 0) goto L77
            int r7 = r0 + 1
            r9 = r2
        L2e:
            if (r7 != r1) goto L4f
            r11.x1(r6, r0, r7)
            int r0 = r11.K
            if (r1 >= r0) goto L4b
            r11.J = r7
            r11.H1()
            int r0 = r11.K
            int r0 = java.lang.Math.min(r5, r0)
            if (r0 == 0) goto L6c
            char[] r1 = r11.L
            r6 = r1
            r7 = r4
            r1 = r0
            r0 = r7
            goto L4f
        L4b:
            r11.o(r3)
            throw r2
        L4f:
            char r10 = r6[r7]
            if (r10 != r8) goto L60
            r11.x1(r6, r0, r7)
            int r7 = r7 + 1
            java.lang.String r9 = r11.q()
            r11.T = r4
            r0 = r7
            goto L2e
        L60:
            boolean r10 = defpackage.e4b.a(r10)
            if (r10 == 0) goto L69
            int r7 = r7 + 1
            goto L2e
        L69:
            r11.x1(r6, r0, r7)
        L6c:
            r11.J = r7
            r11.Q = r9
            java.lang.String r0 = r11.q()
            r11.R = r0
            return
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name expected, found: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r11.o(r0)
            throw r2
        L89:
            r11.o(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa6.E1():void");
    }

    public final String F1() {
        int i = this.J;
        int i2 = this.K;
        if (4096 < i2) {
            if (i == 4096) {
                H1();
                i2 = Math.min(4096, this.K);
                i = 0;
            } else {
                i2 = 4096;
            }
        } else if (i >= i2) {
            o("Unexpected EOF");
            throw null;
        }
        char[] cArr = this.L;
        if (e4b.b(cArr[i])) {
            int i3 = i + 1;
            while (true) {
                if (i3 == i2) {
                    x1(cArr, i, i3);
                    if (i2 < this.K) {
                        this.J = i3;
                        H1();
                        int min = Math.min(4096, this.K);
                        if (min == 0) {
                            break;
                        }
                        cArr = this.L;
                        i3 = 0;
                        i2 = min;
                        i = 0;
                    } else {
                        o("Unexpected EOF");
                        throw null;
                    }
                }
                if (e4b.a(cArr[i3])) {
                    i3++;
                } else {
                    x1(cArr, i, i3);
                    break;
                }
            }
            this.J = i3;
            return q();
        }
        o("name expected, found: " + ((Object) cArr) + "[left]");
        throw null;
    }

    public final EventType G() {
        int i;
        EventType eventType = this.e;
        if (eventType == null) {
            i = -1;
        } else {
            i = na6.a[eventType.ordinal()];
        }
        if (i != -1) {
            return eventType;
        }
        vs.k("Not yet started");
        return null;
    }

    public final void G1() {
        while (true) {
            int p1 = p1();
            if (p1 != -1 && xxe.v((char) p1)) {
                read();
            } else {
                return;
            }
        }
    }

    public final void H1() {
        char[] cArr = this.L;
        this.L = this.M;
        this.M = cArr;
        this.J -= 4096;
        int i = this.K - 4096;
        if (i >= 4096) {
            int f = hq7.f(this.a, cArr);
            if (f >= 0) {
                i += f;
            }
            this.K = i;
            return;
        }
        this.K = i;
    }

    public final String I0() {
        if (G().isTextElement()) {
            return q();
        }
        EventType G = G();
        throw new IOException("The element is not text, it is: " + G);
    }

    public final String N0(int i) {
        if (i < this.D) {
            return this.E[(i * 4) + 3];
        }
        xk5.r();
        return null;
    }

    public final yod Q() {
        int i = this.d;
        return new yod((i - this.c) + 1, this.b, i);
    }

    public final String S() {
        int i;
        EventType eventType = this.e;
        if (eventType == null) {
            i = -1;
        } else {
            i = na6.a[eventType.ordinal()];
        }
        if (i == 1) {
            String str = this.f;
            if (str != null) {
                return str;
            }
            throw new IOException("Missing entity name");
        } else if (i != 2 && i != 3) {
            xk5.j(this.e, "Local name not accessible outside of element tags: ");
            return null;
        } else {
            int i2 = this.O.c;
            int i3 = i2 - 1;
            Object obj = this.P.a;
            if (i3 < i2) {
                String str2 = this.X[(i3 * 3) + 2];
                if (str2 != null) {
                    return str2;
                }
                throw new IOException("Missing local name");
            }
            xk5.r();
            return null;
        }
    }

    public final String V(int i) {
        if (i < this.D) {
            return this.E[(i * 4) + 2];
        }
        xk5.r();
        return null;
    }

    public final void V0(int i) {
        this.S = Arrays.copyOf(this.S, Math.max(this.S.length * 2, (i * 5) / 4));
    }

    public final void b1() {
        this.d++;
    }

    public final String g0(int i) {
        if (i < this.D) {
            return this.E[i * 4];
        }
        xk5.r();
        return null;
    }

    public final void g1(int i) {
        int i2 = this.d + i;
        this.d = i2;
        this.c = i2;
        this.b++;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e != EventType.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    public final String j0() {
        int i;
        EventType eventType = this.e;
        if (eventType == null) {
            i = -1;
        } else {
            i = na6.a[eventType.ordinal()];
        }
        if (i != 2 && i != 3) {
            vs.k("Local name not accessible outside of element tags");
            return null;
        }
        int i2 = this.O.c;
        int i3 = i2 - 1;
        Object obj = this.P.a;
        if (i3 < i2) {
            String str = this.X[i3 * 3];
            if (str != null) {
                return str;
            }
            throw new IOException("Missing namespace");
        }
        xk5.r();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x031d, code lost:
        if (r1.charValue() == ((char) r7)) goto L160;
     */
    @Override // java.util.Iterator
    /* renamed from: k1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nl.adaptivity.xmlutil.EventType next() {
        /*
            Method dump skipped, instructions count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa6.next():nl.adaptivity.xmlutil.EventType");
    }

    public final void l1() {
        read();
        read();
        read();
        A1('-');
        this.T = 0;
        while (true) {
            if (D1() == '-' && p1() == 45) {
                break;
            }
        }
        if (q1(1) == 62) {
            this.T--;
            read();
            read();
            return;
        }
        o("illegal comment delimiter: --->");
        throw null;
    }

    public final String m0() {
        int i;
        EventType eventType = this.e;
        if (eventType == null) {
            i = -1;
        } else {
            i = na6.a[eventType.ordinal()];
        }
        if (i != 2 && i != 3) {
            vs.k("Local name not accessible outside of element tags");
            return null;
        }
        Object obj = this.P.a;
        String p0 = p0(this.O.c - 1);
        if (p0 == null) {
            return "";
        }
        return p0;
    }

    public final void m1() {
        read();
        read();
        this.T = 0;
        while (true) {
            if (D1() == '?' && p1() == 62) {
                this.T--;
                read();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0212, code lost:
        r1 = r23.O;
        r3 = r1.c + r12;
        r1.c = r3;
        r4 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021c, code lost:
        if (r3 < r4.length) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021e, code lost:
        r1.b = java.util.Arrays.copyOf(r4, r4.length * 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0229, code lost:
        r3 = r1.b;
        r4 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022d, code lost:
        if (r4 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022f, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
        r7 = r3[r4 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
        r3[r4] = r7;
        r4 = r4 * 3;
        r3 = (defpackage.oa6) r23.P.a;
        r7 = r3.X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0242, code lost:
        if (r7.length < r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0245, code lost:
        r3.X = (java.lang.String[]) java.util.Arrays.copyOf(r7, r4 + 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x024f, code lost:
        r3 = false;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0251, code lost:
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0255, code lost:
        if (r4 >= r23.D) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0257, code lost:
        r7 = r4 + 1;
        r9 = V(r4);
        r9.getClass();
        r10 = y0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x026a, code lost:
        if (defpackage.c16.i(r10, "xmlns") == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026c, code lost:
        r1.a(r9, N0(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027b, code lost:
        if (defpackage.c16.i(N0(r4), "") != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027d, code lost:
        r23.E[(r4 * 4) + 2] = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028a, code lost:
        o("illegal empty namespace");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028f, code lost:
        throw r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0290, code lost:
        if (r10 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
        if (r9.equals("xmlns") == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0298, code lost:
        r1.a("", N0(r4));
        r23.E[(r4 * 4) + 2] = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a9, code lost:
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ab, code lost:
        r4 = r7;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b0, code lost:
        if (r3 == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b2, code lost:
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b6, code lost:
        if (r3 >= r23.D) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b8, code lost:
        r7 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02be, code lost:
        if (V(r3) == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c0, code lost:
        r10 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02c2, code lost:
        if (r3 != r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c5, code lost:
        r11 = r2.E;
        r13 = r3 * 4;
        defpackage.b00.W((r4 * 4) + 1, r13 + 1, r13 + 4, r11, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d6, code lost:
        r3 = y0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02de, code lost:
        if (defpackage.c16.i(r3, "") != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e0, code lost:
        if (r3 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e2, code lost:
        r9 = r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e6, code lost:
        if (r9 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e8, code lost:
        r23.E[r4 * 4] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ef, code lost:
        r2 = r23.X;
        r1 = (r1.c - 1) * 3;
        r2[r1 + 2] = r6;
        r2[r1 + 1] = r5;
        r2[r1] = "<not yet set>";
        o("Undefined Prefix: " + r3 + " in " + r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x031e, code lost:
        throw r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031f, code lost:
        r23.E[r4 * 4] = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0325, code lost:
        r3 = r7;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0328, code lost:
        o("illegal attribute name: " + defpackage.hq7.a(r3, r9) + " at " + r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0345, code lost:
        throw r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0346, code lost:
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0349, code lost:
        if (r3 == r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034b, code lost:
        java.util.Arrays.fill(r2.E, r4 * 4, r2.D * 4, r16);
        r2.D = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035b, code lost:
        java.util.Arrays.fill(r2.E, 0, r2.D * 4, r16);
        r2.D = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0369, code lost:
        if (r5 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x036b, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x036d, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x036e, code lost:
        r2 = r1.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0372, code lost:
        if (r2 != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0374, code lost:
        if (r5 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0377, code lost:
        o("undefined prefix: ".concat(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0382, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0383, code lost:
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0384, code lost:
        r0 = r23.X;
        r1 = (r1.c - 1) * 3;
        r0[r1 + 1] = r5;
        r0[r1 + 2] = r6;
        r0[r1] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0398, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(boolean r24) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa6.n1(boolean):void");
    }

    public final void o(String str) {
        if (str.length() >= 100) {
            str = str.substring(0, 100).concat("\n");
        }
        throw new IOException(Q() + " - " + str);
    }

    public final void o1(EventType eventType) {
        switch (na6.a[eventType.ordinal()]) {
            case 1:
                o("Entity reference outside document body");
                throw null;
            case 2:
                o("Unexpected start tag after document body");
                throw null;
            case 3:
                o("Unexpected end tag outside of body");
                throw null;
            case 4:
                o("Unexpected START_DOCUMENT in state " + this.W);
                throw null;
            case 5:
            case 6:
            case 7:
                xk5.q("Comments/WS are always allowed - they may start the document tough");
                return;
            case 8:
                z1();
                if (this.U) {
                    this.e = EventType.IGNORABLE_WHITESPACE;
                    return;
                }
                o("Non-whitespace text where not expected: '" + I0() + '\'');
                throw null;
            case 9:
                o("CData sections are not supported outside of the document body");
                throw null;
            case 10:
                o("Document declarations are not supported outside the preamble");
                throw null;
            case 11:
                o("End of document before end of document element");
                throw null;
            case 12:
                o("Processing instruction inside document body");
                throw null;
            default:
                xk5.o();
                return;
        }
    }

    public final String p0(int i) {
        if (i < this.O.c) {
            return this.X[(i * 3) + 1];
        }
        xk5.r();
        return null;
    }

    public final int p1() {
        int i = this.J;
        if (i >= this.K) {
            return -1;
        }
        if (i >= 4096) {
            return r1(0);
        }
        char c = this.L[i];
        if (c == '\r') {
            return 10;
        }
        return c;
    }

    public final String q() {
        return r4b.D(this.S, 0, this.T);
    }

    public final int q1(int i) {
        int i2 = this.J;
        if ((i << 3) + i2 >= 4096) {
            return r1(i);
        }
        while (i2 < this.K) {
            char[] cArr = this.L;
            char c = cArr[i2];
            if (c == '\r') {
                c = '\n';
                cArr[i2] = '\n';
                int i3 = i2 + 1;
                if (cArr[i3] == '\r') {
                    cArr[i2] = 0;
                    i2 = i3;
                }
            } else {
                i2++;
            }
            int i4 = i - 1;
            if (i == 0) {
                return c;
            }
            i = i4;
        }
        return -1;
    }

    public final int r1(int i) {
        char c;
        char c2;
        int i2 = this.J;
        while (true) {
            int i3 = this.K;
            if (i2 < i3) {
                int i4 = i2 - 4096;
                if (i4 < 0) {
                    c = this.L[i2];
                } else {
                    c = this.M[i4];
                }
                if (c == '\r') {
                    int i5 = i2 + 1;
                    if (i5 < i3) {
                        int i6 = i2 - 4095;
                        if (i6 < 0) {
                            c2 = this.L[i5];
                        } else {
                            c2 = this.M[i6];
                        }
                        if (c2 == '\n') {
                            i2 += 2;
                            c = '\n';
                        }
                    }
                    i2 = i5;
                    c = '\n';
                } else {
                    i2++;
                }
                int i7 = i - 1;
                if (i == 0) {
                    return c;
                }
                i = i7;
            } else {
                return -1;
            }
        }
    }

    public final int read() {
        int i = this.J;
        int i2 = this.K;
        if (i >= i2) {
            return -1;
        }
        int i3 = i + 2;
        if (i3 >= 4096) {
            return C1();
        }
        int i4 = i + 1;
        char[] cArr = this.L;
        char c = cArr[i];
        if (c != '\n') {
            if (c != '\r') {
                b1();
                this.J = i4;
                return c;
            } else if (i4 < i2 && cArr[i4] == '\n') {
                this.J = i3;
                g1(2);
                return 10;
            } else {
                this.J = i4;
                g1(1);
                return 10;
            }
        }
        this.J = i4;
        g1(1);
        return 10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final EventType s1() {
        int p1 = p1();
        if (p1 != -1) {
            if (p1 != 38) {
                if (p1 != 60) {
                    return EventType.TEXT;
                }
                int q1 = q1(1);
                if (q1 != 33) {
                    if (q1 != 47) {
                        if (q1 != 63) {
                            return EventType.START_ELEMENT;
                        }
                        if (q1(2) == 120 && q1(3) == 109 && q1(4) == 108) {
                            int q12 = q1(5);
                            boolean[] zArr = e4b.a;
                            if (q12 == 247 || q12 == 894 || (q12 != 58 && ((65 > q12 || q12 >= 91) && q12 != 95 && q12 != 45 && q12 != 46 && ((97 > q12 || q12 >= 123) && ((48 > q12 || q12 >= 58) && q12 != 183 && ((192 > q12 || q12 >= 215) && ((216 > q12 || q12 >= 8192) && q12 != 8204 && q12 != 8205 && q12 != 8255 && q12 != 8256 && ((8304 > q12 || q12 >= 8592) && ((11264 > q12 || q12 >= 12272) && ((12289 > q12 || q12 >= 55296) && ((63744 > q12 || q12 >= 64976) && ((65008 > q12 || q12 >= 65534) && (65536 > q12 || q12 >= 983040))))))))))))) {
                                return EventType.START_DOCUMENT;
                            }
                        }
                        return EventType.PROCESSING_INSTRUCTION;
                    }
                    return EventType.END_ELEMENT;
                }
                int q13 = q1(2);
                if (q13 != 45) {
                    if (q13 != 91) {
                        return EventType.DOCDECL;
                    }
                    return EventType.CDSECT;
                }
                return EventType.COMMENT;
            }
            return EventType.ENTITY_REF;
        }
        return EventType.END_DOCUMENT;
    }

    public final void t1(String str) {
        int length = str.length() + this.T;
        if (length > this.S.length) {
            V0(length);
        }
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            char[] cArr = this.S;
            int i2 = this.T;
            this.T = i2 + 1;
            cArr[i2] = charAt;
        }
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("KtXmlReader [");
        EventType eventType = this.e;
        if (eventType == null) {
            sb = "<!--Parsing not started yet-->";
        } else {
            StringBuilder sb3 = new StringBuilder(eventType.name());
            sb3.append(' ');
            if (eventType != EventType.START_ELEMENT && eventType != EventType.END_ELEMENT) {
                if (eventType != EventType.IGNORABLE_WHITESPACE) {
                    if (eventType != EventType.TEXT) {
                        sb3.append(I0());
                    } else if (this.U) {
                        sb3.append("(whitespace)");
                    } else {
                        String I0 = I0();
                        if (I0.length() > 16) {
                            I0 = I0.substring(0, 16).concat("...");
                        }
                        sb3.append(I0);
                    }
                }
            } else {
                if (this.C) {
                    sb3.append("(empty) ");
                }
                sb3.append('<');
                if (eventType == EventType.END_ELEMENT) {
                    sb3.append('/');
                }
                Object obj = this.P.a;
                if (p0(this.O.c - 1) != null) {
                    sb3.append("{" + j0() + '}' + m0() + ':');
                }
                sb3.append(new QName(j0(), S(), m0()));
                int i = this.D;
                for (int i2 = 0; i2 < i; i2++) {
                    sb3.append(' ');
                    if (g0(i2) != null) {
                        sb3.append('{');
                        sb3.append(g0(i2));
                        sb3.append('}');
                        sb3.append(y0(i2));
                        sb3.append(':');
                    }
                    sb3.append(V(i2) + "='" + N0(i2) + '\'');
                }
                sb3.append('>');
            }
            if (this.d >= 0) {
                sb3.append("@" + this.b + ':' + ((this.d - this.c) + 1) + " [" + this.d + "] in ");
            }
            sb3.append(this.a.toString());
            sb = sb3.toString();
        }
        return s21.p(sb2, sb, ']');
    }

    public final void u1(char c) {
        int i = this.T;
        if (i >= this.S.length) {
            V0(i);
        }
        char[] cArr = this.S;
        int i2 = this.T;
        this.T = i2 + 1;
        cArr[i2] = c;
    }

    public final void v1(int i) {
        if (i >= 0) {
            u1((char) i);
        } else {
            o("Unexpected EOF");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
        o("Unexpected content in numeric entity reference: " + ((char) r7) + " (in " + ((java.lang.Object) r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa6.w1():void");
    }

    public final void x1(char[] cArr, int i, int i2) {
        int i3 = this.T;
        int i4 = (i2 - i) + i3;
        if (i4 >= this.S.length) {
            V0(i4);
        }
        b00.X(cArr, this.S, i3, i, i2);
        this.T = i4;
    }

    public final String y0(int i) {
        if (i < this.D) {
            return this.E[(i * 4) + 1];
        }
        xk5.r();
        return null;
    }

    public final void y1() {
        int i = this.K;
        int min = Math.min(i, 4096);
        int i2 = this.J;
        int i3 = -1;
        boolean z = true;
        while (i2 < i && z) {
            int i4 = i3;
            int i5 = i2;
            while (i2 < min) {
                char[] cArr = this.L;
                char c = cArr[i2];
                if (c != '<') {
                    if (c == '\r') {
                        x1(cArr, i5, i2);
                        i5 = i2 + 1;
                        if (i5 != i && (i5 != 4096 ? this.L[i5] == '\n' : this.M[0] == '\n')) {
                            g1(2);
                            i5 = i2 + 2;
                        } else {
                            g1(1);
                        }
                        u1('\n');
                        i4 = -1;
                        i2 = i5;
                    } else {
                        if (c == '\n') {
                            g1(1);
                        } else if (c != '&') {
                            b1();
                        }
                        i2++;
                    }
                }
                i4 = i2;
                z = false;
                break;
            }
            if (i2 == min) {
                i4 = i2;
            }
            if (i4 > 0) {
                x1(this.L, i5, i4);
                i3 = -1;
            } else {
                i3 = i4;
            }
            if (i2 >= 4096) {
                this.J = i2;
                H1();
                int i6 = this.J;
                int i7 = this.K;
                i2 = i6;
                i = i7;
                min = Math.min(i7, 4096);
            }
        }
        this.U = false;
        this.J = i2;
    }

    public final void z1() {
        char c;
        char c2;
        int i = this.K;
        int min = Math.min(i, 4096);
        int i2 = this.J;
        if (i2 < min && (c2 = this.L[i2]) != '\t' && c2 != '\n' && c2 != '\r' && c2 != ' ') {
            y1();
            return;
        }
        boolean z = true;
        int i3 = -1;
        while (i2 < i && z) {
            int i4 = i3;
            int i5 = i2;
            while (true) {
                c = 0;
                if (i2 >= min) {
                    break;
                }
                char[] cArr = this.L;
                char c3 = cArr[i2];
                if (c3 == '\r') {
                    if (i4 > i5 + 1) {
                        x1(cArr, i5, i4);
                    }
                    i5 = i2 + 1;
                    if (i5 != i) {
                        if (i5 == 4096) {
                            c = this.M[0];
                        } else {
                            c = this.L[i5];
                        }
                    }
                    if (c != '\n') {
                        u1('\n');
                        g1(1);
                    } else {
                        this.d++;
                    }
                    i2 = i5;
                    i4 = -1;
                } else {
                    if (c3 == '\n') {
                        g1(1);
                    } else if (c3 != ' ' && c3 != '\t') {
                        if (c3 == '<') {
                            i4 = i2;
                            z = false;
                        } else {
                            i4 = i2;
                            c = 1;
                        }
                    } else {
                        b1();
                    }
                    i2++;
                }
            }
            if (i2 == min) {
                i4 = i2;
            }
            if (i4 > i5) {
                x1(this.L, i5, i4);
                i3 = -1;
            } else {
                i3 = i4;
            }
            if (i2 == 4096) {
                this.J = i2;
                H1();
                int i6 = this.J;
                int i7 = this.K;
                i2 = i6;
                i = i7;
                min = Math.min(i7, 4096);
                continue;
            }
            if (c != 0) {
                this.J = i2;
                y1();
                return;
            }
        }
        this.U = true;
        this.J = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
