package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kse  reason: default package */
/* loaded from: classes.dex */
public final class kse implements Closeable {
    public final ByteArrayInputStream a;
    public ise b;
    public final byte[] c = new byte[8];
    public final k57 d = new k57(27);

    public kse(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long C() {
        g0((byte) -96);
        V();
        long S = S();
        int i = (S > 0L ? 1 : (S == 0L ? 0 : -1));
        if (i >= 0 && S <= 4611686018427387903L) {
            if (i > 0) {
                ((ArrayDeque) this.d.b).push(Long.valueOf(S + S));
            }
            return S;
        }
        xk5.q("the maximum supported map length is 4611686018427387903L");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r0 != (-2)) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ise G() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kse.G():ise");
    }

    public final boolean Q() {
        g0((byte) -32);
        if (this.b.b <= 24) {
            int S = (int) S();
            if (S == 20) {
                return false;
            }
            if (S == 21) {
                return true;
            }
            vs.k("expected FALSE or TRUE");
            return false;
        }
        vs.k("expected simple value");
        return false;
    }

    public final long S() {
        ise iseVar = this.b;
        byte b = iseVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        } else if (b == 24) {
            int read = this.a.read();
            if (read != -1) {
                this.b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.c;
            if (b == 25) {
                j0(bArr, 2);
                return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            } else if (b == 26) {
                j0(bArr, 4);
                return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            } else if (b == 27) {
                j0(bArr, 8);
                long j2 = bArr[0];
                long j3 = bArr[3];
                long j4 = bArr[4];
                long j5 = bArr[5];
                long j6 = bArr[6];
                return (bArr[7] & 255) | ((bArr[1] & 255) << 48) | ((j2 & 255) << 56) | ((bArr[2] & 255) << 40) | ((j3 & 255) << 32) | ((j4 & 255) << 24) | ((j5 & 255) << 16) | ((j6 & 255) << 8);
            } else {
                fb4.k(rs8.k("invalid additional information ", b, (iseVar.a >> 5) & 7, " for major type "));
                return 0L;
            }
        }
    }

    public final void V() {
        G();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        vs.k(a82.j(b, "expected definite length but found "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.L();
    }

    public final void g0(byte b) {
        G();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        vs.k(rs8.k("expected major type ", (b >> 5) & 7, (b2 >> 5) & 7, " but found "));
    }

    public final void j0(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.a.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.b = null;
    }

    public final byte[] m0() {
        V();
        long S = S();
        if (S >= 0 && S <= 2147483647L) {
            if (this.a.available() >= S) {
                int i = (int) S;
                byte[] bArr = new byte[i];
                j0(bArr, i);
                return bArr;
            }
            throw new EOFException();
        }
        xk5.q("the maximum supported byte/text string length is 2147483647 bytes");
        return null;
    }

    public final long o() {
        g0(Byte.MIN_VALUE);
        V();
        long S = S();
        int i = (S > 0L ? 1 : (S == 0L ? 0 : -1));
        if (i >= 0) {
            if (i > 0) {
                ((ArrayDeque) this.d.b).push(Long.valueOf(S));
            }
            return S;
        }
        xk5.q("the maximum supported array length is 9223372036854775807");
        return 0L;
    }

    public final long q() {
        boolean z;
        G();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else if (b == 32) {
            z = false;
        } else {
            vs.k(a82.j((b >> 5) & 7, "expected major type 0 or 1 but found "));
            return 0L;
        }
        long S = S();
        if (S >= 0) {
            if (z) {
                return S;
            }
            return ~S;
        }
        xk5.q("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }
}
