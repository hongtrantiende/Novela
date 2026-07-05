package defpackage;

import java.util.Locale;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d7e  reason: default package */
/* loaded from: classes.dex */
public final class d7e extends e7e {
    public final byte[] c;
    public final int d;
    public int e;

    public d7e(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.c = bArr;
            this.e = 0;
            this.d = i;
            return;
        }
        Locale locale = Locale.US;
        vs.m(rs8.k("Array range is invalid. Buffer.length=", bArr.length, i, ", offset=0, length="));
        throw null;
    }

    @Override // defpackage.e7e
    public final void a(byte b) {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new ik1(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.e7e
    public final void b(int i) {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = i >> 24;
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new ik1(i2, this.d, 4, e);
        }
    }

    @Override // defpackage.e7e
    public final void c(int i, int i2) {
        p(i, 5);
        b(i2);
    }

    @Override // defpackage.e7e
    public final void d(int i, long j) {
        p(i, 1);
        h(j);
    }

    @Override // defpackage.e7e
    public final void e(int i, String str) {
        p(i, 2);
        int i2 = this.e;
        try {
            int t = e7e.t(str.length() * 3);
            int t2 = e7e.t(str.length());
            byte[] bArr = this.c;
            if (t2 == t) {
                int i3 = i2 + t2;
                this.e = i3;
                int H = z87.H(str, bArr, i3, bArr.length - i3);
                this.e = i2;
                o((H - i2) - t2);
                this.e = H;
                return;
            }
            o(z87.G(str));
            int i4 = this.e;
            this.e = z87.H(str, bArr, i4, bArr.length - i4);
        } catch (IndexOutOfBoundsException e) {
            throw new ik1(e);
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
        p(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.e7e
    public final void h(long j) {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new ik1(i, this.d, 8, e);
        }
    }

    @Override // defpackage.e7e
    public final void i(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ik1(this.e, this.d, i2, e);
        }
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
        p(i, 0);
        j(i2);
    }

    @Override // defpackage.e7e
    public final void l(int i, long j) {
        p(i, 0);
        m(j);
    }

    @Override // defpackage.e7e
    public final void m(long j) {
        int i;
        int i2 = this.e;
        boolean z = e7e.b;
        byte[] bArr = this.c;
        if (z && u() >= 10) {
            while ((j & (-128)) != 0) {
                b9e.e(bArr, i2, (byte) (((int) j) | Token.CASE));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            b9e.e(bArr, i2, (byte) j);
        } else {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | Token.CASE);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new ik1(i, this.d, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        }
        this.e = i;
    }

    @Override // defpackage.e7e
    public final void o(int i) {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            }
            i2 = i3 + 1;
            try {
                bArr[i3] = (byte) (i | Token.CASE);
                i >>>= 7;
                i3 = i2;
            } catch (IndexOutOfBoundsException e) {
                throw new ik1(i2, this.d, 1, e);
            }
            throw new ik1(i2, this.d, 1, e);
        }
    }

    @Override // defpackage.e7e
    public final void p(int i, int i2) {
        o((i << 3) | i2);
    }

    @Override // defpackage.e7e
    public final void q(int i, int i2) {
        p(i, 0);
        o(i2);
    }

    public final int u() {
        return this.d - this.e;
    }
}
