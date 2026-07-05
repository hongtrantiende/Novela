package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: el1  reason: default package */
/* loaded from: classes.dex */
public final class el1 {
    public static final Logger f = Logger.getLogger(el1.class.getName());
    public static final boolean g = exc.e;
    public fz4 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final kj9 e;

    public el1(kj9 kj9Var, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.b = new byte[max];
            this.c = max;
            this.e = kj9Var;
            return;
        }
        vs.m("bufferSize must be >= 0");
        throw null;
    }

    public static int f(int i, a31 a31Var) {
        int h = h(i);
        int size = a31Var.size();
        return i(size) + size + h;
    }

    public static int g(String str) {
        int length;
        try {
            length = u1d.a(str);
        } catch (s1d unused) {
            length = str.getBytes(uz5.a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(int i) {
        l(5);
        d(i);
    }

    public final void B(int i, long j) {
        l(20);
        c(i, 0);
        e(j);
    }

    public final void C(long j) {
        l(10);
        e(j);
    }

    public final void a(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        byte[] bArr = this.b;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.d = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.d = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void b(long j) {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte[] bArr = this.b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.d = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void c(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void d(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    exc.j(bArr, i3, (byte) i);
                    return;
                }
                this.d = i3 + 1;
                exc.j(bArr, i3, (byte) ((i | Token.CASE) & 255));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                }
                this.d = i5 + 1;
                bArr[i5] = (byte) ((i | Token.CASE) & 255);
                i >>>= 7;
            }
        }
    }

    public final void e(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i2 = this.d;
                if (i == 0) {
                    this.d = i2 + 1;
                    exc.j(bArr, i2, (byte) j);
                    return;
                }
                this.d = i2 + 1;
                exc.j(bArr, i2, (byte) ((((int) j) | Token.CASE) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i3 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i4 = this.d;
                if (i3 == 0) {
                    this.d = i4 + 1;
                    bArr[i4] = (byte) j;
                    return;
                }
                this.d = i4 + 1;
                bArr[i4] = (byte) ((((int) j) | Token.CASE) & 255);
                j >>>= 7;
            }
        }
    }

    public final void k() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void l(int i) {
        if (this.c - this.d < i) {
            k();
        }
    }

    public final void m(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        k();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
            return;
        }
        this.e.write(bArr, i6, i7);
    }

    public final void n(int i, boolean z) {
        l(11);
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b;
    }

    public final void o(int i, a31 a31Var) {
        y(i, 2);
        A(a31Var.size());
        v(a31Var.b, a31Var.d(), a31Var.size());
    }

    public final void p(int i, int i2) {
        l(14);
        c(i, 5);
        a(i2);
    }

    public final void q(int i) {
        l(4);
        a(i);
    }

    public final void r(int i, long j) {
        l(18);
        c(i, 1);
        b(j);
    }

    public final void s(long j) {
        l(8);
        b(j);
    }

    public final void t(int i, int i2) {
        l(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e(i2);
        }
    }

    public final void u(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }

    public final void v(byte[] bArr, int i, int i2) {
        m(bArr, i, i2);
    }

    public final void w(int i, w2 w2Var, h0a h0aVar) {
        y(i, 2);
        A(w2Var.a(h0aVar));
        h0aVar.g(w2Var, this.a);
    }

    public final void x(int i, String str) {
        y(i, 2);
        try {
            int length = str.length() * 3;
            int i2 = i(length);
            int i3 = i2 + length;
            int i4 = this.c;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int m = u1d.a.m(str, bArr, 0, length);
                A(m);
                m(bArr, 0, m);
                return;
            }
            if (i3 > i4 - this.d) {
                k();
            }
            int i5 = i(str.length());
            int i6 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (i5 == i2) {
                    int i7 = i6 + i5;
                    this.d = i7;
                    int m2 = u1d.a.m(str, bArr2, i7, i4 - i7);
                    this.d = i6;
                    d((m2 - i6) - i5);
                    this.d = m2;
                    return;
                }
                int a = u1d.a(str);
                d(a);
                this.d = u1d.a.m(str, bArr2, this.d, a);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ik1((IndexOutOfBoundsException) e);
            } catch (s1d e2) {
                this.d = i6;
                throw e2;
            }
        } catch (s1d e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(uz5.a);
            try {
                A(bytes.length);
                v(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new ik1(e4);
            }
        }
    }

    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    public final void z(int i, int i2) {
        l(20);
        c(i, 0);
        d(i2);
    }
}
