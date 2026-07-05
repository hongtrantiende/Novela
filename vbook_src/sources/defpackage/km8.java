package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: km8  reason: default package */
/* loaded from: classes.dex */
public final class km8 {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final ts5 f = ts5.i(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public km8(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return hc2.k((byte) 0, dce.j(((i & 7) << 2) | ((i2 & 48) >> 4)), dce.j(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), dce.j(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static int d(Charset charset) {
        wq9.u(f.contains(charset), "Unsupported charset: %s", charset);
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            return 2;
        }
        return 1;
    }

    public static boolean e(byte b) {
        if ((b & 192) == 128) {
            return true;
        }
        return false;
    }

    public final int A() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return i3;
    }

    public final long B() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public final int C() {
        f(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return (bArr[i3] & 255) | i4 | ((bArr[i] & 255) << 16);
    }

    public final int D() {
        int m = m();
        if (m >= 0) {
            return m;
        }
        vs.k(a82.j(m, "Top bit not zero: "));
        return 0;
    }

    public final int E() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b != this.c) {
                long z = z();
                j |= (127 & z) << (i * 7);
                if ((z & 128) == 0) {
                    break;
                }
            } else {
                vs.k("Attempting to read a byte over the limit.");
                return 0;
            }
        }
        return hc2.g(j);
    }

    public final long F() {
        long t = t();
        if (t >= 0) {
            return t;
        }
        vs.k(hl5.k(t, "Top bit not zero: "));
        return 0L;
    }

    public final int G() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long H() {
        int i;
        byte b;
        int i2;
        f(1);
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= i2 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i != 0) {
            f(i);
            for (int i4 = 1; i4 < i; i4++) {
                if ((this.a[this.b + i4] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException(hl5.k(j, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.b += i;
            return j;
        }
        throw new NumberFormatException(hl5.k(j, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset I() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.a;
            int i2 = this.b;
            byte b = bArr2[i2];
            if (b == -2 && bArr2[i2 + 1] == -1) {
                this.b = i2 + 2;
                return StandardCharsets.UTF_16BE;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void J(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        K(bArr, i);
    }

    public final void K(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void L(int i) {
        boolean z;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.c = i;
    }

    public final void M(int i) {
        boolean z;
        if (i >= 0 && i <= this.c) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.b = i;
    }

    public final void N(int i) {
        M(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(int i) {
        if (g.get() && a() < i) {
            cp8.k(a(), hl5.s("bytesNeeded= ", ", bytesLeft=", i));
        }
    }

    public final char g(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        f(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    public final int h(Charset charset) {
        ByteOrder byteOrder;
        int i;
        int i2;
        wq9.u(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() >= d(charset)) {
            int i3 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b = this.a[this.b];
                if ((b & 128) == 0) {
                    i = b & 255;
                    return (i << 8) | i3;
                }
                return 0;
            }
            if (charset.equals(StandardCharsets.UTF_8)) {
                byte b2 = this.a[this.b];
                if ((b2 & 128) == 0) {
                    i2 = 1;
                } else if ((b2 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) {
                    i2 = 2;
                } else if ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) {
                    i2 = 3;
                } else if ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                byte[] bArr = this.a;
                                int i4 = this.b;
                                i = b(bArr[i4], bArr[i4 + 1], bArr[i4 + 2], bArr[i4 + 3]);
                            }
                            return 0;
                        }
                        byte[] bArr2 = this.a;
                        int i5 = this.b;
                        i = b(0, bArr2[i5] & 15, bArr2[i5 + 1], bArr2[i5 + 2]);
                    } else {
                        byte[] bArr3 = this.a;
                        int i6 = this.b;
                        i = b(0, 0, bArr3[i6], bArr3[i6 + 1]);
                    }
                } else {
                    i = this.a[this.b] & 255;
                }
                i3 = i2;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char g2 = g(0, byteOrder);
                if (Character.isHighSurrogate(g2) && a() >= 4) {
                    i = Character.toCodePoint(g2, g(2, byteOrder));
                    i3 = 4;
                } else {
                    i = g2;
                    i3 = 2;
                }
            }
            return (i << 8) | i3;
        }
        xk5.h(this.b, this.c);
        return 0;
    }

    public final int i() {
        if (a() >= 4) {
            int m = m();
            this.b -= 4;
            return m;
        }
        xk5.h(this.b, this.c);
        return 0;
    }

    public final int j() {
        f(1);
        return this.a[this.b] & 255;
    }

    public final void k(byte[] bArr, int i, int i2) {
        f(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char l(Charset charset, char[] cArr) {
        int h;
        boolean z;
        if (a() >= d(charset) && (h = h(charset)) != 0) {
            long j = h >>> 8;
            boolean z2 = true;
            if ((j >> 32) == 0) {
                z = true;
            } else {
                z = false;
            }
            wq9.q("out of range: %s", j, z);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                if (c != j2) {
                    z2 = false;
                }
                wq9.q("Out of range: %s", j2, z2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = hc2.g(h & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return (bArr[i5] & 255) | i4 | ((bArr[i3] & 255) << 8);
    }

    public final String n(Charset charset) {
        int i;
        wq9.u(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            I();
        }
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                cp8.s(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a2d.O(this.a[i2])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.a;
                    if (bArr[i2] == 0 && a2d.O(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0 && a2d.O(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String x = x(i2 - this.b, charset);
        if (this.b != this.c && l(charset, d) == '\r') {
            l(charset, e);
        }
        return x;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return ((bArr[i5] & 255) << 24) | i4 | ((bArr[i3] & 255) << 16);
    }

    public final long p() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return ((bArr[i8] & 255) << 56) | j2 | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48);
    }

    public final long q() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public final int r() {
        int o = o();
        if (o >= 0) {
            return o;
        }
        vs.k(a82.j(o, "Top bit not zero: "));
        return 0;
    }

    public final int s() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long t() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return (bArr[i8] & 255) | j2 | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public final String u() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = a2d.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final String v(int i) {
        int i2;
        f(i);
        if (i == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        byte[] bArr = this.a;
        String str = a2d.a;
        String str2 = new String(bArr, i3, i2, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final short w() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final String x(int i, Charset charset) {
        f(i);
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int y() {
        return z() | (z() << 21) | (z() << 14) | (z() << 7);
    }

    public final int z() {
        f(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public km8() {
        this.a = a2d.b;
    }

    public km8(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public km8(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
