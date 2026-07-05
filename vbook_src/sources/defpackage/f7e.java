package defpackage;

import java.io.ByteArrayOutputStream;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f7e  reason: default package */
/* loaded from: classes.dex */
public final class f7e extends e7e {
    public final byte[] c;
    public final int d;
    public int e;
    public final ByteArrayOutputStream f;

    public f7e(ByteArrayOutputStream byteArrayOutputStream, int i) {
        this.f = byteArrayOutputStream;
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.c = new byte[max];
            this.d = max;
            return;
        }
        vs.m("bufferSize must be >= 0");
        throw null;
    }

    public final void A(int i) {
        boolean z = e7e.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    b9e.e(bArr, i3, (byte) i);
                    return;
                }
                this.e = i3 + 1;
                b9e.e(bArr, i3, (byte) (i | Token.CASE));
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

    public final void B(int i) {
        if (this.d - this.e < i) {
            v();
        }
    }

    @Override // defpackage.e7e
    public final void a(byte b) {
        if (this.e == this.d) {
            v();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // defpackage.e7e
    public final void b(int i) {
        B(4);
        z(i);
    }

    @Override // defpackage.e7e
    public final void c(int i, int i2) {
        B(14);
        y(i, 5);
        z(i2);
    }

    @Override // defpackage.e7e
    public final void d(int i, long j) {
        B(18);
        y(i, 1);
        w(j);
    }

    @Override // defpackage.e7e
    public final void e(int i, String str) {
        p(i, 2);
        int length = str.length() * 3;
        int t = e7e.t(length);
        int i2 = t + length;
        int i3 = this.d;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int H = z87.H(str, bArr, 0, length);
            o(H);
            u(bArr, 0, H);
            return;
        }
        if (i2 > i3 - this.e) {
            v();
        }
        int t2 = e7e.t(str.length());
        int i4 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (t2 == t) {
                int i5 = i4 + t2;
                this.e = i5;
                int H2 = z87.H(str, bArr2, i5, i3 - i5);
                this.e = i4;
                A((H2 - i4) - t2);
                this.e = H2;
                return;
            }
            int G = z87.G(str);
            A(G);
            this.e = z87.H(str, bArr2, this.e, G);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ik1((IndexOutOfBoundsException) e);
        }
    }

    @Override // defpackage.e7e
    public final void f(int i, s6e s6eVar) {
        p(i, 2);
        o(s6eVar.b());
        s6eVar.j(this);
    }

    @Override // defpackage.e7e
    public final void g(int i, boolean z) {
        B(11);
        y(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.e;
        this.c[i2] = b;
        this.e = i2 + 1;
    }

    @Override // defpackage.e7e
    public final void h(long j) {
        B(8);
        w(j);
    }

    @Override // defpackage.e7e
    public final void i(byte[] bArr, int i, int i2) {
        u(bArr, i, i2);
    }

    @Override // defpackage.e7e
    public final void j(int i) {
        if (i >= 0) {
            o(i);
        } else {
            m(i);
        }
    }

    @Override // defpackage.e7e
    public final void k(int i, int i2) {
        B(20);
        y(i, 0);
        if (i2 >= 0) {
            A(i2);
        } else {
            x(i2);
        }
    }

    @Override // defpackage.e7e
    public final void l(int i, long j) {
        B(20);
        y(i, 0);
        x(j);
    }

    @Override // defpackage.e7e
    public final void m(long j) {
        B(10);
        x(j);
    }

    @Override // defpackage.e7e
    public final void o(int i) {
        B(5);
        A(i);
    }

    @Override // defpackage.e7e
    public final void p(int i, int i2) {
        o((i << 3) | i2);
    }

    @Override // defpackage.e7e
    public final void q(int i, int i2) {
        B(20);
        y(i, 0);
        A(i2);
    }

    public final void u(byte[] bArr, int i, int i2) {
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
        int i7 = i2 - i5;
        this.e = i4;
        v();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
            return;
        }
        this.f.write(bArr, i6, i7);
    }

    public final void v() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void w(long j) {
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

    public final void x(long j) {
        boolean z = e7e.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i2 = this.e;
                if (i == 0) {
                    this.e = i2 + 1;
                    b9e.e(bArr, i2, (byte) j);
                    return;
                }
                this.e = i2 + 1;
                b9e.e(bArr, i2, (byte) (((int) j) | Token.CASE));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i3 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i4 = this.e;
                if (i3 == 0) {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) j;
                    return;
                }
                this.e = i4 + 1;
                bArr[i4] = (byte) (((int) j) | Token.CASE);
                j >>>= 7;
            }
        }
    }

    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    public final void z(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = i >> 24;
        this.e = i2 + 4;
    }
}
