package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vc1  reason: default package */
/* loaded from: classes.dex */
public final class vc1 implements AutoCloseable {
    public static final s26 J = new s26((vt4) new mf0(24));
    public static final s26 K = new s26((vt4) new mf0(25));
    public int C;
    public int D;
    public boolean E;
    public ArrayList F;
    public int G;
    public String H;
    public int I;
    public String[] a;
    public StringReader b;
    public char[] c;
    public int d;
    public int e;
    public int f;

    public vc1(StringReader stringReader) {
        this.D = -1;
        this.G = 1;
        this.b = stringReader;
        this.c = (char[]) K.l();
        this.a = (String[]) J.l();
        q();
    }

    public final char C() {
        char c;
        q();
        if (this.d >= this.e) {
            c = 65535;
        } else {
            char[] cArr = this.c;
            cArr.getClass();
            c = cArr[this.d];
        }
        this.d++;
        return c;
    }

    public final String G(int i, xt4 xt4Var) {
        q();
        int i2 = this.d;
        int i3 = this.e;
        char[] cArr = this.c;
        int i4 = i2;
        while (i4 < i3 && (i == -1 || i4 - i2 < i)) {
            cArr.getClass();
            if (!((Boolean) xt4Var.invoke(Character.valueOf(cArr[i4]))).booleanValue()) {
                break;
            }
            i4++;
        }
        this.d = i4;
        if (i4 > i2) {
            return cne.g(this.c, this.a, i2, i4 - i2);
        }
        return "";
    }

    public final boolean I0(char... cArr) {
        if (!g0()) {
            q();
            char[] cArr2 = this.c;
            cArr2.getClass();
            char c = cArr2[this.d];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean N0() {
        if (g0()) {
            return false;
        }
        String[] strArr = d4b.a;
        char[] cArr = this.c;
        cArr.getClass();
        return d4b.d(cArr[this.d]);
    }

    public final String Q(char c) {
        int i;
        q();
        int i2 = this.d;
        int i3 = this.e;
        while (true) {
            if (i2 < i3) {
                char[] cArr = this.c;
                cArr.getClass();
                if (c == cArr[i2]) {
                    i = i2 - this.d;
                    break;
                }
                i2++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            String g = cne.g(this.c, this.a, this.d, i);
            this.d += i;
            return g;
        }
        return S();
    }

    public final String S() {
        q();
        char[] cArr = this.c;
        String[] strArr = this.a;
        int i = this.d;
        String g = cne.g(cArr, strArr, i, this.e - i);
        this.d = this.e;
        return g;
    }

    public final char V() {
        q();
        if (this.d >= this.e) {
            return (char) 65535;
        }
        char[] cArr = this.c;
        cArr.getClass();
        return cArr[this.d];
    }

    public final boolean V0(String str) {
        str.getClass();
        q();
        int length = str.length();
        if (length > this.e - this.d) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char[] cArr = this.c;
            cArr.getClass();
            char c = cArr[this.d + i];
            if (charAt != c && Character.toUpperCase(charAt) != Character.toUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public final int b1(String str) {
        char[] cArr;
        q();
        char charAt = str.charAt(0);
        int i = this.d;
        while (i < this.e) {
            char[] cArr2 = this.c;
            cArr2.getClass();
            int i2 = 1;
            if (charAt != cArr2[i]) {
                do {
                    i++;
                    if (i >= this.e) {
                        break;
                    }
                    cArr = this.c;
                    cArr.getClass();
                } while (charAt != cArr[i]);
            }
            int i3 = i + 1;
            int length = (str.length() + i3) - 1;
            int i4 = this.e;
            if (i < i4 && length <= i4) {
                int i5 = i3;
                while (i5 < length) {
                    char charAt2 = str.charAt(i2);
                    char[] cArr3 = this.c;
                    cArr3.getClass();
                    if (charAt2 != cArr3[i5]) {
                        break;
                    }
                    i5++;
                    i2++;
                }
                if (i5 == length) {
                    return i - this.d;
                }
            }
            i = i3;
        }
        return -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        s26 s26Var = J;
        s26 s26Var2 = K;
        try {
            StringReader stringReader = this.b;
            if (stringReader != null) {
                stringReader.close();
            }
            this.b = null;
            char[] cArr = this.c;
            if (cArr != null) {
                Arrays.fill(cArr, 0, cArr.length, (char) 0);
            }
            char[] cArr2 = this.c;
            if (cArr2 != null) {
                s26Var2.M(cArr2);
            }
            this.c = null;
            String[] strArr = this.a;
            if (strArr != null) {
                s26Var.M(strArr);
            }
            this.a = null;
        } catch (IOException unused) {
            this.b = null;
            char[] cArr3 = this.c;
            if (cArr3 != null) {
                Arrays.fill(cArr3, 0, cArr3.length, (char) 0);
            }
            char[] cArr4 = this.c;
            if (cArr4 != null) {
                s26Var2.M(cArr4);
            }
            this.c = null;
            String[] strArr2 = this.a;
            if (strArr2 != null) {
                s26Var.M(strArr2);
            }
            this.a = null;
        } catch (Throwable th) {
            this.b = null;
            char[] cArr5 = this.c;
            if (cArr5 != null) {
                Arrays.fill(cArr5, 0, cArr5.length, (char) 0);
            }
            char[] cArr6 = this.c;
            if (cArr6 != null) {
                s26Var2.M(cArr6);
            }
            this.c = null;
            String[] strArr3 = this.a;
            if (strArr3 != null) {
                s26Var.M(strArr3);
            }
            this.a = null;
            throw th;
        }
    }

    public final boolean g0() {
        q();
        if (this.d >= this.e) {
            return true;
        }
        return false;
    }

    public final int g1() {
        return this.C + this.d;
    }

    public final int j0(int i) {
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            arrayList.getClass();
            int o = tl1.o(arrayList, Integer.valueOf(i));
            if (o < -1) {
                return Math.abs(o) - 2;
            }
            return o;
        }
        return 0;
    }

    public final void k1() {
        int i = this.D;
        if (i != -1) {
            this.d = i;
            this.D = -1;
            return;
        }
        throw new e60(24, new IOException("Mark invalid"));
    }

    public final void l1() {
        int i = this.d;
        if (i >= 1) {
            this.d = i - 1;
            return;
        }
        throw new e60(24, new IOException("WTF: No buffer left to unconsume."));
    }

    public final boolean m0(String str) {
        str.getClass();
        q();
        q();
        int length = str.length();
        if (length <= this.e - this.d) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[] cArr = this.c;
                cArr.getClass();
                if (charAt == cArr[this.d + i]) {
                }
            }
            this.d = str.length() + this.d;
            return true;
        }
        return false;
    }

    public final void o() {
        this.d++;
    }

    public final boolean p0(String str) {
        if (V0(str)) {
            this.d = str.length() + this.d;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r8.E = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc1.q():void");
    }

    public final String toString() {
        if (this.e - this.d < 0) {
            return "";
        }
        char[] cArr = this.c;
        cArr.getClass();
        int i = this.d;
        return r4b.D(cArr, i, (this.e - i) + i);
    }

    public final boolean y0(char c) {
        if (!g0()) {
            char[] cArr = this.c;
            cArr.getClass();
            if (cArr[this.d] == c) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vc1(String str) {
        this(new StringReader(str));
        str.getClass();
    }
}
