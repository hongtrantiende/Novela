package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z1 */
/* loaded from: classes3.dex */
public abstract class z1 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public z1(a46 a46Var) {
        this.a = 0;
        this.d = a46Var;
        this.e = new vdf(a46Var);
        this.f = new StringBuilder();
    }

    public static /* synthetic */ void r(z1 z1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = z1Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        z1Var.q(str, str2, i);
        throw null;
    }

    public static boolean u(char c) {
        if (c != ',' && c != ':' && c != ']' && c != '}') {
            return true;
        }
        return false;
    }

    public String A(int i, int i2) {
        return t().subSequence(i, i2).toString();
    }

    public boolean B() {
        int z = z();
        CharSequence t = t();
        if (z < t.length() && z != -1 && t.charAt(z) == ',') {
            this.b++;
            return true;
        }
        return false;
    }

    public boolean D(boolean z) {
        int y = y(z());
        int length = t().length() - y;
        if (length >= 4 && y != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != t().charAt(y + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || pbe.f(t().charAt(y + 4)) != 0) {
                    if (z) {
                        this.b = y + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void E(char c) {
        int i;
        String str;
        int i2 = this.b;
        if (i2 > 0 && c == '\"') {
            try {
                this.b = i2 - 1;
                String m = m();
                this.b = i2;
                if (c16.i(m, "null")) {
                    q("Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", this.b - 1);
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i2;
                throw th;
            }
        }
        String u = pbe.u(pbe.f(c));
        int i3 = this.b;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            i = i3;
        }
        if (i3 != t().length() && i >= 0) {
            str = String.valueOf(t().charAt(i));
        } else {
            str = "EOF";
        }
        r(this, hl5.o("Expected ", u, ", but had '", str, "' instead"), i, null, 4);
        throw null;
    }

    public void a() {
        Map.Entry entry;
        this.c = (Map.Entry) this.f;
        Iterator it = (Iterator) this.e;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.f = entry;
    }

    public int b(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.b = i;
            o();
            if (this.b + 4 < charSequence.length()) {
                return b(charSequence, this.b);
            }
            r(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.f).append((char) (s(charSequence, i + 3) + (s(charSequence, i) << 12) + (s(charSequence, i + 1) << 8) + (s(charSequence, i + 2) << 4)));
        return i2;
    }

    public void c(int i, int i2) {
        ((StringBuilder) this.f).append(t(), i, i2);
    }

    public abstract boolean d();

    public void e(int i, String str) {
        if (t().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (t().charAt(i + i2) | ' ')) {
                    r(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.b = str.length() + i;
            return;
        }
        r(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String f();

    public abstract byte g();

    public byte h(byte b) {
        int i;
        String str;
        byte g = g();
        if (g != b) {
            String u = pbe.u(b);
            int i2 = this.b;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            if (i2 != t().length() && i >= 0) {
                str = String.valueOf(t().charAt(i));
            } else {
                str = "EOF";
            }
            r(this, hl5.o("Expected ", u, ", but had '", str, "' instead"), i, null, 4);
            throw null;
        }
        return g;
    }

    public boolean hasNext() {
        if (((Map.Entry) this.f) != null) {
            return true;
        }
        return false;
    }

    public abstract void i(char c);

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0137, code lost:
        if (r11 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0139, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x013b, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x013c, code lost:
        if (r1 == r11) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x013e, code lost:
        if (r21 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0142, code lost:
        if (r1 == (r11 - 1)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0148, code lost:
        if (r19 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x014a, code lost:
        if (r2 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0156, code lost:
        if (t().charAt(r11) != '\"') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0158, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x015b, code lost:
        r(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0162, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0163, code lost:
        r(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0169, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x016a, code lost:
        r22.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x016c, code lost:
        if (r20 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x016e, code lost:
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0171, code lost:
        if (r8 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0173, code lost:
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x017b, code lost:
        if (r8 != true) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x017d, code lost:
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0182, code lost:
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0187, code lost:
        if (r1 > 9.223372036854776E18d) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x018d, code lost:
        if (r1 < (-9.223372036854776E18d)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0195, code lost:
        if (java.lang.Math.floor(r1) != r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0197, code lost:
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x019a, code lost:
        r(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01b3, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01b4, code lost:
        r(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01ba, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01bb, code lost:
        defpackage.xk5.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01be, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01bf, code lost:
        if (r21 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c1, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01c6, code lost:
        if (r14 == Long.MIN_VALUE) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01c9, code lost:
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01ca, code lost:
        r(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01cf, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01d0, code lost:
        r(r22, "Expected numeric literal", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01d6, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1.j():long");
    }

    public String k() {
        String str = (String) this.c;
        if (str != null) {
            str.getClass();
            this.c = null;
            return str;
        }
        return f();
    }

    public String l(int i, int i2, CharSequence charSequence) {
        String sb;
        char c;
        StringBuilder sb2 = (StringBuilder) this.f;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                c(i, i2);
                int y = y(i2 + 1);
                if (y != -1) {
                    int i3 = y + 1;
                    char charAt2 = t().charAt(y);
                    if (charAt2 == 'u') {
                        i3 = b(t(), i3);
                    } else {
                        if (charAt2 < 'u') {
                            c = dc1.a[charAt2];
                        } else {
                            c = 0;
                        }
                        if (c != 0) {
                            sb2.append(c);
                        } else {
                            r(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                            throw null;
                        }
                    }
                    i = y(i3);
                    if (i == -1) {
                        r(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    c(i, i2);
                    i = y(i2);
                    if (i == -1) {
                        r(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (!z) {
            sb = A(i, i2);
        } else {
            c(i, i2);
            sb = sb2.toString();
            sb2.setLength(0);
        }
        this.b = i2 + 1;
        return sb;
    }

    public String m() {
        String str;
        StringBuilder sb = (StringBuilder) this.f;
        String str2 = (String) this.c;
        if (str2 != null) {
            str2.getClass();
            this.c = null;
            return str2;
        }
        int z = z();
        if (z < t().length() && z != -1) {
            byte f = pbe.f(t().charAt(z));
            if (f == 1) {
                return k();
            }
            if (f == 0) {
                boolean z2 = false;
                while (pbe.f(t().charAt(z)) == 0) {
                    z++;
                    if (z >= t().length()) {
                        c(this.b, z);
                        int y = y(z);
                        if (y == -1) {
                            this.b = z;
                            c(0, 0);
                            String sb2 = sb.toString();
                            sb.setLength(0);
                            return sb2;
                        }
                        z = y;
                        z2 = true;
                    }
                }
                int i = this.b;
                if (!z2) {
                    str = A(i, z);
                } else {
                    c(i, z);
                    String sb3 = sb.toString();
                    sb.setLength(0);
                    str = sb3;
                }
                this.b = z;
                return str;
            }
            r(this, "Expected beginning of the string, but got " + t().charAt(z), 0, null, 6);
            throw null;
        }
        r(this, "EOF", z, null, 4);
        throw null;
    }

    public String n() {
        String m = m();
        if (c16.i(m, "null") && t().charAt(this.b - 1) != '\"') {
            r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return m;
    }

    public void p() {
        if (g() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + t().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void q(String str, String str2, int i) {
        String str3;
        String f = ((vdf) this.e).f();
        CharSequence t = t();
        t.getClass();
        if (((a46) this.d).m) {
            str3 = am8.C(t, i).toString();
        } else {
            str3 = null;
        }
        throw new q46(am8.z(str, i, f, str2, str3));
    }

    public void remove() {
        qra qraVar = (qra) this.d;
        if (qraVar.d().d == this.b) {
            Map.Entry entry = (Map.Entry) this.c;
            if (entry != null) {
                qraVar.remove(entry.getKey());
                this.c = null;
                this.b = qraVar.d().d;
                return;
            }
            vm1.d();
            return;
        }
        vs.f();
    }

    public int s(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        r(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence t();

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) t());
                sb.append("', currentPosition=");
                return hl5.p(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public abstract String v(String str, boolean z);

    public byte w() {
        CharSequence t = t();
        int i = this.b;
        while (true) {
            int y = y(i);
            if (y != -1) {
                char charAt = t.charAt(y);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.b = y;
                    return pbe.f(charAt);
                }
                i = y + 1;
            } else {
                this.b = y;
                return (byte) 10;
            }
        }
    }

    public String x(boolean z) {
        String k;
        byte w = w();
        if (z) {
            if (w == 1 || w == 0) {
                k = m();
            } else {
                return null;
            }
        } else if (w != 1) {
            return null;
        } else {
            k = k();
        }
        this.c = k;
        return k;
    }

    public abstract int y(int i);

    public abstract int z();

    public z1(n07 n07Var, int i, n07 n07Var2, int[] iArr, String str) {
        this.a = 1;
        iArr.getClass();
        this.d = n07Var;
        this.b = i;
        this.e = n07Var2;
        this.f = iArr;
        this.c = str;
    }

    public z1(qra qraVar, Iterator it) {
        this.a = 2;
        this.d = qraVar;
        this.e = it;
        this.b = qraVar.d().d;
        a();
    }

    public void o() {
    }
}
