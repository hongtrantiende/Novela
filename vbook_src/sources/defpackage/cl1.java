package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl1  reason: default package */
/* loaded from: classes.dex */
public final class cl1 extends xb1 {
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final v2 d;
    public final byte[] e;
    public int f;

    public cl1(v2 v2Var) {
        super(2, (byte) 0);
        this.G = Integer.MAX_VALUE;
        Charset charset = vz5.a;
        this.d = v2Var;
        this.e = new byte[4096];
        this.f = 0;
        this.D = 0;
        this.F = 0;
    }

    @Override // defpackage.xb1
    public final int B() {
        if (c()) {
            this.E = 0;
            return 0;
        }
        int r0 = r0();
        this.E = r0;
        if ((r0 >>> 3) != 0) {
            return r0;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.xb1
    public final boolean F(int i) {
        int B;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            w0(4);
                            return true;
                        }
                        throw p16.b();
                    }
                    do {
                        B = B();
                        if (B == 0) {
                            break;
                        }
                    } while (F(B));
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                w0(r0());
                return true;
            }
            w0(8);
            return true;
        }
        int i4 = this.f - this.D;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.D;
                this.D = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw p16.c();
        }
        while (i3 < 10) {
            if (this.D == this.f) {
                v0(1);
            }
            int i6 = this.D;
            this.D = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw p16.c();
        return true;
    }

    @Override // defpackage.xb1
    public final void a(int i) {
        if (this.E == i) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.xb1
    public final int b() {
        return this.F + this.D;
    }

    @Override // defpackage.xb1
    public final boolean c() {
        if (this.D == this.f && !x0(1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xb1
    public final void h(int i) {
        this.G = i;
        u0();
    }

    @Override // defpackage.xb1
    public final int j(int i) {
        if (i >= 0) {
            int i2 = this.F + this.D + i;
            int i3 = this.G;
            if (i2 <= i3) {
                this.G = i2;
                u0();
                return i3;
            }
            throw p16.e();
        }
        throw p16.d();
    }

    @Override // defpackage.xb1
    public final boolean k() {
        if (s0() != 0) {
            return true;
        }
        return false;
    }

    public final byte[] m0(int i) {
        byte[] n0 = n0(i);
        if (n0 != null) {
            return n0;
        }
        int i2 = this.D;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.F += i3;
        this.D = 0;
        this.f = 0;
        ArrayList o0 = o0(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        int size = o0.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = o0.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.xb1
    public final double n() {
        return Double.longBitsToDouble(q0());
    }

    public final byte[] n0(int i) {
        if (i == 0) {
            return vz5.b;
        }
        if (i >= 0) {
            int i2 = this.F;
            int i3 = this.D;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = this.G;
                if (i4 <= i5) {
                    int i6 = this.f - i3;
                    int i7 = i - i6;
                    v2 v2Var = this.d;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > v2Var.available()) {
                                return null;
                            }
                        } catch (p16 e) {
                            e.a = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.e, this.D, bArr, 0, i6);
                    this.F += this.f;
                    this.D = 0;
                    this.f = 0;
                    while (i6 < i) {
                        try {
                            int read = v2Var.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.F += read;
                                i6 += read;
                            } else {
                                throw p16.e();
                            }
                        } catch (p16 e2) {
                            e2.a = true;
                            throw e2;
                        }
                    }
                    return bArr;
                }
                w0((i5 - i2) - i3);
                throw p16.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw p16.d();
    }

    public final ArrayList o0(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.d.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.F += read;
                    i2 += read;
                } else {
                    throw p16.e();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int p0() {
        int i = this.D;
        if (this.f - i < 4) {
            v0(4);
            i = this.D;
        }
        this.D = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long q0() {
        int i = this.D;
        if (this.f - i < 8) {
            v0(8);
            i = this.D;
        }
        this.D = i + 8;
        byte[] bArr = this.e;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.xb1
    public final float r() {
        return Float.intBitsToFloat(p0());
    }

    public final int r0() {
        int i;
        int i2 = this.D;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.D = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.D = i5;
                return i;
            }
        }
        return (int) t0();
    }

    public final long s0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.D;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.D = i3;
                return b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.D = i4;
                return j;
            }
        }
        return t0();
    }

    public final long t0() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.D == this.f) {
                v0(1);
            }
            int i2 = this.D;
            this.D = i2 + 1;
            byte b = this.e[i2];
            j |= (b & Byte.MAX_VALUE) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw p16.c();
    }

    public final void u0() {
        int i = this.f + this.C;
        this.f = i;
        int i2 = this.F + i;
        int i3 = this.G;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.C = i4;
            this.f = i - i4;
            return;
        }
        this.C = 0;
    }

    public final void v0(int i) {
        if (!x0(i)) {
            if (i > (Integer.MAX_VALUE - this.F) - this.D) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw p16.e();
        }
    }

    public final void w0(int i) {
        int i2 = this.f;
        int i3 = this.D;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.D = i3 + i;
            return;
        }
        v2 v2Var = this.d;
        if (i >= 0) {
            int i5 = this.F;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.G;
            if (i7 <= i8) {
                this.F = i6;
                this.f = 0;
                this.D = 0;
                while (i4 < i) {
                    long j = i - i4;
                    try {
                        try {
                            long skip = v2Var.skip(j);
                            int i9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i9 >= 0 && skip <= j) {
                                if (i9 == 0) {
                                    break;
                                }
                                i4 += (int) skip;
                            } else {
                                throw new IllegalStateException(v2.class + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (p16 e) {
                            e.a = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.F += i4;
                        u0();
                        throw th;
                    }
                }
                this.F += i4;
                u0();
                if (i4 < i) {
                    int i10 = this.f;
                    int i11 = i10 - this.D;
                    this.D = i10;
                    v0(1);
                    while (true) {
                        int i12 = i - i11;
                        int i13 = this.f;
                        if (i12 > i13) {
                            i11 += i13;
                            this.D = i13;
                            v0(1);
                        } else {
                            this.D = i12;
                            return;
                        }
                    }
                }
            } else {
                w0((i8 - i5) - i3);
                throw p16.e();
            }
        } else {
            throw p16.d();
        }
    }

    @Override // defpackage.xb1
    public final int x() {
        int r0 = r0();
        return (-(r0 & 1)) ^ (r0 >>> 1);
    }

    public final boolean x0(int i) {
        v2 v2Var = this.d;
        int i2 = this.D;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 > i4) {
            int i5 = this.F;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.G) {
                byte[] bArr = this.e;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.F += i2;
                    this.f -= i2;
                    this.D = 0;
                }
                int i6 = this.f;
                try {
                    int read = v2Var.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.F) - i6));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.f += read;
                            u0();
                            if (this.f >= i) {
                                return true;
                            }
                            return x0(i);
                        }
                    } else {
                        vs.h(read, v2Var.getClass());
                        return false;
                    }
                } catch (p16 e) {
                    e.a = true;
                    throw e;
                }
            }
            return false;
        }
        vs.k(hl5.l("refillBuffer() called when ", " bytes were already available in buffer", i));
        return false;
    }

    @Override // defpackage.xb1
    public final long y() {
        long s0 = s0();
        return (-(s0 & 1)) ^ (s0 >>> 1);
    }
}
