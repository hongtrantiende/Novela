package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tyd  reason: default package */
/* loaded from: classes.dex */
public class tyd implements Closeable {
    public long D;
    public int E;
    public int[] F;
    public String[] H;
    public int[] I;
    public final Reader a;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int C = 0;
    public int G = 1;

    static {
        new ryd();
    }

    public tyd(Reader reader) {
        int[] iArr = new int[32];
        this.F = iArr;
        iArr[0] = 6;
        this.H = new String[32];
        this.I = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.a = reader;
    }

    public final int C(boolean z) {
        int i = this.c;
        int i2 = this.d;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!q(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(n1()));
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char c = this.b[i];
            if (c == '\n') {
                this.e++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.c = i3;
                    if (i3 == i2) {
                        this.c = i;
                        boolean q = q(2);
                        this.c++;
                        if (!q) {
                            return 47;
                        }
                    }
                    G();
                    throw null;
                } else if (c != '#') {
                    this.c = i3;
                    return c;
                } else {
                    this.c = i3;
                    G();
                    throw null;
                }
            }
            i = i3;
        }
    }

    public final void G() {
        Q("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public String I0() {
        String str;
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 10) {
            str = o1();
        } else if (i == 8) {
            str = g1('\'');
        } else if (i == 9) {
            str = g1('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.D);
        } else if (i == 16) {
            str = new String(this.b, this.c, this.E);
            this.c += this.E;
        } else {
            throw S("a string");
        }
        this.C = 0;
        int[] iArr = this.I;
        int i2 = this.G - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean N0() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 5) {
            this.C = 0;
            int[] iArr = this.I;
            int i2 = this.G - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.C = 0;
            int[] iArr2 = this.I;
            int i3 = this.G - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw S("a boolean");
        }
    }

    public final void Q(String str) {
        String n1 = n1();
        throw new IOException(nk2.v(new StringBuilder(str.length() + n1.length() + 79), str, n1, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException S(String str) {
        String str2;
        int l1 = l1();
        String t = n4f.t(l1());
        String n1 = n1();
        int a = s21.a(str.length() + 18, n1.length(), t);
        if (l1 == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2);
        StringBuilder sb = new StringBuilder(concat.length() + a + 5);
        nk2.C(sb, "Expected ", str, " but was ", t);
        return new IllegalStateException(nk2.v(sb, n1, "\nSee ", concat));
    }

    public void V() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 3) {
            o(1);
            this.I[this.G - 1] = 0;
            this.C = 0;
            return;
        }
        throw S("BEGIN_ARRAY");
    }

    public void V0() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 7) {
            this.C = 0;
            int[] iArr = this.I;
            int i2 = this.G - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw S("null");
    }

    public final boolean b1(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case Token.SEMI /* 91 */:
                                    case Token.RB /* 93 */:
                                        return false;
                                    case Token.LB /* 92 */:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            G();
            throw null;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.C = 0;
        this.F[0] = 8;
        this.G = 1;
        this.a.close();
    }

    public void g0() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 4) {
            int i2 = this.G;
            this.G = i2 - 1;
            int[] iArr = this.I;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.C = 0;
            return;
        }
        throw S("END_ARRAY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
        Q("Malformed Unicode escape \\u".concat(new java.lang.String(r5, r11.c, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0114, code lost:
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
        if (r1 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0118, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0124, code lost:
        r1.append(r5, r3, r4);
        r11.c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g1(char r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyd.g1(char):java.lang.String");
    }

    public void j0() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 1) {
            o(3);
            this.C = 0;
            return;
        }
        throw S("BEGIN_OBJECT");
    }

    public String k1() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.G; i++) {
            int i2 = this.F[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.I[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.H[i];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    vs.j(nk2.s(i2, "Unknown scope value: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                    return null;
            }
        }
        return sb.toString();
    }

    public int l1() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public void m0() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 2) {
            int i2 = this.G;
            int i3 = i2 - 1;
            this.G = i3;
            this.H[i3] = null;
            int[] iArr = this.I;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.C = 0;
            return;
        }
        throw S("END_OBJECT");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0162, code lost:
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b2, code lost:
        if (b1(r13) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b6, code lost:
        if (r6 != 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b8, code lost:
        if (r10 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01be, code lost:
        if (r25 != Long.MIN_VALUE) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c0, code lost:
        if (r20 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c2, code lost:
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c4, code lost:
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c6, code lost:
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ca, code lost:
        if (r25 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cc, code lost:
        if (r7 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
        if (r7 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d3, code lost:
        r8 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d6, code lost:
        r8 = -r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d7, code lost:
        r27.D = r8;
        r27.c += r4;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e0, code lost:
        r27.C = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e3, code lost:
        if (r6 == 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01e6, code lost:
        if (r6 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01e9, code lost:
        if (r6 != 7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01eb, code lost:
        r27.E = r4;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0214 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyd.m1():int");
    }

    public final String n1() {
        int i = this.e + 1;
        int i2 = this.c - this.f;
        String k1 = k1();
        int length = String.valueOf(i).length();
        int i3 = i2 + 1;
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(i3).length() + 6 + k1.length());
        a82.t(i, i3, " at line ", " column ", sb);
        return s21.q(sb, " path ", k1);
    }

    public final void o(int i) {
        int i2 = this.G;
        if (i2 - 1 < 1280) {
            int[] iArr = this.F;
            if (i2 == iArr.length) {
                int i3 = i2 + i2;
                this.F = Arrays.copyOf(iArr, i3);
                this.I = Arrays.copyOf(this.I, i3);
                this.H = (String[]) Arrays.copyOf(this.H, i3);
            }
            int[] iArr2 = this.F;
            int i4 = this.G;
            this.G = i4 + 1;
            iArr2[i4] = i;
            return;
        }
        String n1 = n1();
        throw new IOException(s21.q(new StringBuilder(n1.length() + 26), "Nesting limit 1280 reached", n1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
        G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o1() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.c
            int r4 = r4 + r2
            int r5 = r7.d
            char[] r6 = r7.b
            if (r4 >= r5) goto L4d
            char r4 = r6[r4]
            r5 = 9
            if (r4 == r5) goto L5a
            r5 = 10
            if (r4 == r5) goto L5a
            r5 = 12
            if (r4 == r5) goto L5a
            r5 = 13
            if (r4 == r5) goto L5a
            r5 = 32
            if (r4 == r5) goto L5a
            r5 = 35
            if (r4 == r5) goto L49
            r5 = 44
            if (r4 == r5) goto L5a
            r5 = 47
            if (r4 == r5) goto L49
            r5 = 61
            if (r4 == r5) goto L49
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5a
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5a
            r5 = 58
            if (r4 == r5) goto L5a
            r5 = 59
            if (r4 == r5) goto L49
            switch(r4) {
                case 91: goto L5a;
                case 92: goto L49;
                case 93: goto L5a;
                default: goto L46;
            }
        L46:
            int r2 = r2 + 1
            goto L4
        L49:
            r7.G()
            throw r1
        L4d:
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 >= r4) goto L5c
            int r4 = r2 + 1
            boolean r4 = r7.q(r4)
            if (r4 == 0) goto L5a
            goto L4
        L5a:
            r0 = r2
            goto L7a
        L5c:
            if (r3 != 0) goto L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L69:
            int r4 = r7.c
            r3.append(r6, r4, r2)
            int r4 = r7.c
            int r4 = r4 + r2
            r7.c = r4
            r2 = 1
            boolean r2 = r7.q(r2)
            if (r2 != 0) goto L91
        L7a:
            int r1 = r7.c
            if (r3 != 0) goto L84
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6, r1, r0)
            goto L8b
        L84:
            r3.append(r6, r1, r0)
            java.lang.String r2 = r3.toString()
        L8b:
            int r1 = r7.c
            int r1 = r1 + r0
            r7.c = r1
            return r2
        L91:
            r2 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyd.o1():java.lang.String");
    }

    public boolean p0() {
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        int i2;
        int i3 = this.f;
        int i4 = this.c;
        this.f = i3 - i4;
        int i5 = this.d;
        char[] cArr = this.b;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.d = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i7 = this.d;
            int read = this.a.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.d + read;
            this.d = i2;
            if (this.e == 0 && this.f == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public String toString() {
        return getClass().getSimpleName().concat(n1());
    }

    public String y0() {
        String g1;
        int i = this.C;
        if (i == 0) {
            i = m1();
        }
        if (i == 14) {
            g1 = o1();
        } else if (i == 12) {
            g1 = g1('\'');
        } else if (i == 13) {
            g1 = g1('\"');
        } else {
            throw S("a name");
        }
        this.C = 0;
        this.H[this.G - 1] = g1;
        return g1;
    }
}
