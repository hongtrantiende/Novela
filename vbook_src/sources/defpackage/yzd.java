package defpackage;

import java.io.OutputStream;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yzd  reason: default package */
/* loaded from: classes.dex */
public final class yzd extends g0e {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    public yzd(OutputStream outputStream, int i) {
        if (outputStream != null) {
            this.f = outputStream;
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.c = bArr;
                this.d = bArr.length;
                return;
            }
            vs.m("bufferSize must be >= 0");
            throw null;
        }
        xk5.k("out");
        throw null;
    }

    public final void A(int i) {
        if (this.d - this.e < i) {
            B();
        }
    }

    public final void B() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void C(int i) {
        boolean z = g0e.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    e3e.k(bArr, i3, (byte) i);
                    return;
                }
                this.e = i3 + 1;
                e3e.k(bArr, i3, (byte) (i | Token.CASE));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                }
                this.e = i5 + 1;
                bArr[i5] = (byte) (i | Token.CASE);
                i >>>= 7;
            }
        }
    }

    @Override // defpackage.g0e
    public final void c(byte[] bArr, int i, int i2) {
        z(bArr, i, i2);
    }

    @Override // defpackage.g0e
    public final void d(int i, int i2) {
        r((i << 3) | i2);
    }

    @Override // defpackage.g0e
    public final void e(int i, int i2) {
        A(20);
        C(i << 3);
        if (i2 >= 0) {
            C(i2);
        } else {
            w(i2);
        }
    }

    @Override // defpackage.g0e
    public final void f(int i, int i2) {
        A(20);
        C(i << 3);
        C(i2);
    }

    @Override // defpackage.g0e
    public final void g(int i, int i2) {
        A(14);
        C((i << 3) | 5);
        x(i2);
    }

    @Override // defpackage.g0e
    public final void h(int i, long j) {
        A(20);
        C(i << 3);
        w(j);
    }

    @Override // defpackage.g0e
    public final void i(int i, long j) {
        A(18);
        C((i << 3) | 1);
        y(j);
    }

    @Override // defpackage.g0e
    public final void j(int i, boolean z) {
        A(11);
        C(i << 3);
        int i2 = this.e;
        this.c[i2] = z ? (byte) 1 : (byte) 0;
        this.e = i2 + 1;
    }

    @Override // defpackage.g0e
    public final void k(int i, String str) {
        r((i << 3) | 2);
        v(str);
    }

    @Override // defpackage.g0e
    public final void l(int i, szd szdVar) {
        r((i << 3) | 2);
        m(szdVar);
    }

    @Override // defpackage.g0e
    public final void m(szd szdVar) {
        r(szdVar.b());
        szdVar.e(this);
    }

    @Override // defpackage.g0e
    public final void n(byte[] bArr, int i) {
        r(i);
        z(bArr, 0, i);
    }

    @Override // defpackage.g0e
    public final void o(hzd hzdVar) {
        o0e o0eVar = (o0e) hzdVar;
        r(o0eVar.m());
        o0eVar.f(this);
    }

    @Override // defpackage.g0e
    public final void p(byte b) {
        if (this.e == this.d) {
            B();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // defpackage.g0e
    public final void q(int i) {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // defpackage.g0e
    public final void r(int i) {
        A(5);
        C(i);
    }

    @Override // defpackage.g0e
    public final void s(int i) {
        A(4);
        x(i);
    }

    @Override // defpackage.g0e
    public final void t(long j) {
        A(10);
        w(j);
    }

    @Override // defpackage.g0e
    public final void u(long j) {
        A(8);
        y(j);
    }

    @Override // defpackage.g0e
    public final void v(String str) {
        int length = str.length() * 3;
        int a = g0e.a(length);
        int i = a + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int c = h3e.c(str, bArr, 0, length);
            r(c);
            z(bArr, 0, c);
            return;
        }
        if (i > i2 - this.e) {
            B();
        }
        int a2 = g0e.a(str.length());
        int i3 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (a2 == a) {
                int i4 = i3 + a2;
                this.e = i4;
                int c2 = h3e.c(str, bArr2, i4, i2 - i4);
                this.e = i3;
                C((c2 - i3) - a2);
                this.e = c2;
                return;
            }
            int b = h3e.b(str);
            C(b);
            this.e = h3e.c(str, bArr2, this.e, b);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ik1((IndexOutOfBoundsException) e);
        }
    }

    public final void w(long j) {
        boolean z = g0e.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i2 = (int) j;
                int i3 = this.e;
                if (i == 0) {
                    this.e = i3 + 1;
                    e3e.k(bArr, i3, (byte) i2);
                    return;
                }
                this.e = i3 + 1;
                e3e.k(bArr, i3, (byte) (i2 | Token.CASE));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i5 = (int) j;
                int i6 = this.e;
                if (i4 == 0) {
                    this.e = i6 + 1;
                    bArr[i6] = (byte) i5;
                    return;
                }
                this.e = i6 + 1;
                bArr[i6] = (byte) (i5 | Token.CASE);
                j >>>= 7;
            }
        }
    }

    public final void x(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void y(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void z(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.e = i4;
        B();
        int i7 = i2 - i5;
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
            return;
        }
        this.f.write(bArr, i6, i7);
    }
}
