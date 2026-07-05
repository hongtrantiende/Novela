package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uyd  reason: default package */
/* loaded from: classes.dex */
public class uyd implements Closeable, Flushable {
    public static final Pattern G = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] H = new String[Token.CASE];
    public final boolean C;
    public int D;
    public String E;
    public final boolean F;
    public final Writer a;
    public int[] b;
    public int c;
    public final cef d;
    public final String e;
    public final String f;

    static {
        for (int i = 0; i <= 31; i++) {
            H[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = H;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public uyd(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        boolean z = false;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i = this.c;
        this.c = i + 1;
        iArr2[i] = 6;
        this.D = 2;
        this.F = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        cef cefVar = cef.d;
        Objects.requireNonNull(cefVar);
        this.d = cefVar;
        this.f = ",";
        if (cefVar.c) {
            this.e = ": ";
            if (cefVar.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        if (this.d.a.isEmpty() && this.d.b.isEmpty()) {
            z = true;
        }
        this.C = z;
    }

    public final void C() {
        int N0 = N0();
        if (N0 != 1) {
            Writer writer = this.a;
            if (N0 != 2) {
                if (N0 != 4) {
                    if (N0 != 6) {
                        if (N0 == 7) {
                            if (this.D != 1) {
                                vs.k("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            vs.k("Nesting problem.");
                            return;
                        }
                    }
                    this.b[this.c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.e);
                this.b[this.c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f);
            q();
            return;
        }
        this.b[this.c - 1] = 2;
        q();
    }

    public void G() {
        V0();
        C();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i + i);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 1;
        this.a.write(91);
    }

    public final void I0(char c, int i, int i2) {
        int N0 = N0();
        if (N0 != i2 && N0 != i) {
            vs.k("Nesting problem.");
            return;
        }
        String str = this.E;
        if (str == null) {
            this.c--;
            if (N0 == i2) {
                q();
            }
            this.a.write(c);
            return;
        }
        vs.k("Dangling name: ".concat(str));
    }

    public final int N0() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        vs.k("JsonWriter is closed.");
        return 0;
    }

    public void Q() {
        I0(']', 1, 2);
    }

    public void S() {
        V0();
        C();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i + i);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 3;
        this.a.write(Token.EXPORT);
    }

    public void V() {
        I0('}', 3, 5);
    }

    public final void V0() {
        if (this.E != null) {
            int N0 = N0();
            if (N0 == 5) {
                this.a.write(this.f);
            } else if (N0 != 3) {
                vs.k("Nesting problem.");
                return;
            }
            q();
            this.b[this.c - 1] = 4;
            o(this.E);
            this.E = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.c;
        if (i <= 1 && (i != 1 || this.b[0] == 7)) {
            this.c = 0;
        } else {
            fb4.k("Incomplete document");
        }
    }

    public void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            vs.k("JsonWriter is closed.");
        }
    }

    public void g0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.E == null) {
            int N0 = N0();
            if (N0 != 3 && N0 != 5) {
                vs.k("Please begin an object before writing a name.");
                return;
            } else {
                this.E = str;
                return;
            }
        }
        vs.k("Already wrote a name, expecting a value.");
    }

    public void j0(String str) {
        if (str == null) {
            y0();
            return;
        }
        V0();
        C();
        o(str);
    }

    public void m0(boolean z) {
        String str;
        V0();
        C();
        if (true != z) {
            str = "false";
        } else {
            str = "true";
        }
        this.a.write(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r8) {
        /*
            r7 = this;
            java.io.Writer r7 = r7.a
            r0 = 34
            r7.write(r0)
            int r1 = r8.length()
            r2 = 0
            r3 = r2
        Ld:
            if (r2 >= r1) goto L39
            int r4 = r2 + 1
            char r5 = r8.charAt(r2)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L20
            java.lang.String[] r6 = defpackage.uyd.H
            r5 = r6[r5]
            if (r5 == 0) goto L37
            goto L2d
        L20:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L27
            java.lang.String r5 = "\\u2028"
            goto L2d
        L27:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L37
            java.lang.String r5 = "\\u2029"
        L2d:
            if (r3 >= r2) goto L33
            int r2 = r2 - r3
            r7.write(r8, r3, r2)
        L33:
            r7.write(r5)
            r3 = r4
        L37:
            r2 = r4
            goto Ld
        L39:
            if (r3 >= r1) goto L3f
            int r1 = r1 - r3
            r7.write(r8, r3, r1)
        L3f:
            r7.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyd.o(java.lang.String):void");
    }

    public void p0(Number number) {
        V0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !G.matcher(obj).matches()) {
                    String valueOf = String.valueOf(cls);
                    vs.m(nk2.w(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                    return;
                }
            } else if (this.D != 1) {
                vs.m("Numeric values must be finite, but was ".concat(obj));
                return;
            }
        }
        C();
        this.a.append((CharSequence) obj);
    }

    public final void q() {
        if (!this.C) {
            cef cefVar = this.d;
            String str = cefVar.a;
            Writer writer = this.a;
            writer.write(str);
            int i = this.c;
            for (int i2 = 1; i2 < i; i2++) {
                writer.write(cefVar.b);
            }
        }
    }

    public void y0() {
        if (this.E != null) {
            if (this.F) {
                V0();
            } else {
                this.E = null;
                return;
            }
        }
        C();
        this.a.write("null");
    }
}
