package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fl1  reason: default package */
/* loaded from: classes.dex */
public final class fl1 {
    public static final Logger f = Logger.getLogger(fl1.class.getName());
    public static final boolean g = gxc.e;
    public n07 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final OutputStream e;

    public fl1(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.b = new byte[max];
            this.c = max;
            if (outputStream != null) {
                this.e = outputStream;
                return;
            } else {
                xk5.k("out");
                throw null;
            }
        }
        vs.m("bufferSize must be >= 0");
        throw null;
    }

    public static int f(int i, c31 c31Var) {
        int h = h(i);
        int size = c31Var.size();
        return i(size) + size + h;
    }

    public static int g(String str) {
        int length;
        try {
            length = w1d.a(str);
        } catch (t1d unused) {
            length = str.getBytes(wz5.a).length;
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

    public final void A(String str) {
        try {
            int length = str.length() * 3;
            int i = i(length);
            int i2 = i + length;
            int i3 = this.c;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int l = w1d.a.l(str, bArr, 0, length);
                D(l);
                n(bArr, 0, l);
                return;
            }
            if (i2 > i3 - this.d) {
                k();
            }
            int i4 = i(str.length());
            int i5 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (i4 == i) {
                    int i6 = i5 + i4;
                    this.d = i6;
                    int l2 = w1d.a.l(str, bArr2, i6, i3 - i6);
                    this.d = i5;
                    d((l2 - i5) - i4);
                    this.d = l2;
                    return;
                }
                int a = w1d.a(str);
                d(a);
                this.d = w1d.a.l(str, bArr2, this.d, a);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ik1((IndexOutOfBoundsException) e);
            } catch (t1d e2) {
                this.d = i5;
                throw e2;
            }
        } catch (t1d e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(wz5.a);
            try {
                D(bytes.length);
                x(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new ik1(e4);
            }
        }
    }

    public final void B(int i, int i2) {
        D((i << 3) | i2);
    }

    public final void C(int i, int i2) {
        l(20);
        c(i, 0);
        d(i2);
    }

    public final void D(int i) {
        l(5);
        d(i);
    }

    public final void E(int i, long j) {
        l(20);
        c(i, 0);
        e(j);
    }

    public final void F(long j) {
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
                    gxc.j(bArr, i3, (byte) i);
                    return;
                }
                this.d = i3 + 1;
                gxc.j(bArr, i3, (byte) ((i | Token.CASE) & 255));
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
                    gxc.j(bArr, i2, (byte) j);
                    return;
                }
                this.d = i2 + 1;
                gxc.j(bArr, i2, (byte) ((((int) j) | Token.CASE) & 255));
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

    public final void m(byte b) {
        if (this.d == this.c) {
            k();
        }
        int i = this.d;
        this.d = i + 1;
        this.b[i] = b;
    }

    public final void n(byte[] bArr, int i, int i2) {
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

    public final void o(int i, boolean z) {
        l(11);
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b;
    }

    public final void p(int i, c31 c31Var) {
        B(i, 2);
        q(c31Var);
    }

    public final void q(c31 c31Var) {
        D(c31Var.size());
        x(c31Var.b, c31Var.e(), c31Var.size());
    }

    public final void r(int i, int i2) {
        l(14);
        c(i, 5);
        a(i2);
    }

    public final void s(int i) {
        l(4);
        a(i);
    }

    public final void t(int i, long j) {
        l(18);
        c(i, 1);
        b(j);
    }

    public final void u(long j) {
        l(8);
        b(j);
    }

    public final void v(int i, int i2) {
        l(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e(i2);
        }
    }

    public final void w(int i) {
        if (i >= 0) {
            D(i);
        } else {
            F(i);
        }
    }

    public final void x(byte[] bArr, int i, int i2) {
        n(bArr, i, i2);
    }

    public final void y(int i, x2 x2Var, j0a j0aVar) {
        B(i, 2);
        D(x2Var.a(j0aVar));
        j0aVar.i(x2Var, this.a);
    }

    public final void z(int i, String str) {
        B(i, 2);
        A(str);
    }
}
