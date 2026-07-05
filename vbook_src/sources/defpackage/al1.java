package defpackage;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: al1  reason: default package */
/* loaded from: classes.dex */
public final class al1 extends xb1 {
    public int C;
    public final int D;
    public int E;
    public int F;
    public final byte[] d;
    public int e;
    public int f;

    public al1(byte[] bArr, int i, int i2, boolean z) {
        super(3, (byte) 0);
        this.F = Integer.MAX_VALUE;
        this.d = bArr;
        this.e = i2 + i;
        this.C = i;
        this.D = i;
    }

    @Override // defpackage.xb1
    public final String A() {
        int o0 = o0();
        if (o0 > 0) {
            int i = this.e;
            int i2 = this.C;
            if (o0 <= i - i2) {
                String j = w1d.a.j(this.d, i2, o0);
                this.C += o0;
                return j;
            }
        }
        if (o0 == 0) {
            return "";
        }
        if (o0 <= 0) {
            throw q16.d();
        }
        throw q16.e();
    }

    @Override // defpackage.xb1
    public final int B() {
        if (c()) {
            this.E = 0;
            return 0;
        }
        int o0 = o0();
        this.E = o0;
        if ((o0 >>> 3) != 0) {
            return o0;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.xb1
    public final int C() {
        return o0();
    }

    @Override // defpackage.xb1
    public final long D() {
        return p0();
    }

    @Override // defpackage.xb1
    public final boolean F(int i) {
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
                            s0(4);
                            return true;
                        }
                        throw q16.b();
                    }
                    G();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                s0(o0());
                return true;
            }
            s0(8);
            return true;
        }
        int i4 = this.e - this.C;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.C;
                this.C = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw q16.c();
        }
        while (i3 < 10) {
            int i6 = this.C;
            if (i6 != this.e) {
                this.C = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            } else {
                throw q16.e();
            }
        }
        throw q16.c();
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
        return this.C - this.D;
    }

    @Override // defpackage.xb1
    public final boolean c() {
        if (this.C == this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xb1
    public final void h(int i) {
        this.F = i;
        r0();
    }

    @Override // defpackage.xb1
    public final int j(int i) {
        if (i >= 0) {
            int b = b() + i;
            if (b >= 0) {
                int i2 = this.F;
                if (b <= i2) {
                    this.F = b;
                    r0();
                    return i2;
                }
                throw q16.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw q16.d();
    }

    @Override // defpackage.xb1
    public final boolean k() {
        if (p0() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xb1
    public final c31 m() {
        byte[] bArr;
        int o0 = o0();
        byte[] bArr2 = this.d;
        if (o0 > 0) {
            int i = this.e;
            int i2 = this.C;
            if (o0 <= i - i2) {
                c31 c = c31.c(bArr2, i2, o0);
                this.C += o0;
                return c;
            }
        }
        if (o0 == 0) {
            return c31.c;
        }
        if (o0 > 0) {
            int i3 = this.e;
            int i4 = this.C;
            if (o0 <= i3 - i4) {
                int i5 = o0 + i4;
                this.C = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                c31 c31Var = c31.c;
                return new c31(bArr);
            }
        }
        if (o0 <= 0) {
            if (o0 == 0) {
                bArr = wz5.b;
                c31 c31Var2 = c31.c;
                return new c31(bArr);
            }
            throw q16.d();
        }
        throw q16.e();
    }

    public final int m0() {
        int i = this.C;
        if (this.e - i >= 4) {
            this.C = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw q16.e();
    }

    @Override // defpackage.xb1
    public final double n() {
        return Double.longBitsToDouble(n0());
    }

    public final long n0() {
        int i = this.C;
        if (this.e - i >= 8) {
            this.C = i + 8;
            byte[] bArr = this.d;
            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
        }
        throw q16.e();
    }

    @Override // defpackage.xb1
    public final int o() {
        return o0();
    }

    public final int o0() {
        int i;
        int i2 = this.C;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.C = i4;
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
                this.C = i5;
                return i;
            }
        }
        return (int) q0();
    }

    @Override // defpackage.xb1
    public final int p() {
        return m0();
    }

    public final long p0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.C;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.C = i3;
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
                this.C = i4;
                return j;
            }
        }
        return q0();
    }

    @Override // defpackage.xb1
    public final long q() {
        return n0();
    }

    public final long q0() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.C;
            if (i2 != this.e) {
                this.C = i2 + 1;
                byte b = this.d[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw q16.e();
            }
        }
        throw q16.c();
    }

    @Override // defpackage.xb1
    public final float r() {
        return Float.intBitsToFloat(m0());
    }

    public final void r0() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.D;
        int i3 = this.F;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f = i4;
            this.e = i - i4;
            return;
        }
        this.f = 0;
    }

    @Override // defpackage.xb1
    public final int s() {
        return o0();
    }

    public final void s0(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.C;
            if (i <= i2 - i3) {
                this.C = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw q16.d();
        }
        throw q16.e();
    }

    @Override // defpackage.xb1
    public final long t() {
        return p0();
    }

    @Override // defpackage.xb1
    public final int v() {
        return m0();
    }

    @Override // defpackage.xb1
    public final long w() {
        return n0();
    }

    @Override // defpackage.xb1
    public final int x() {
        int o0 = o0();
        return (-(o0 & 1)) ^ (o0 >>> 1);
    }

    @Override // defpackage.xb1
    public final long y() {
        long p0 = p0();
        return (-(p0 & 1)) ^ (p0 >>> 1);
    }

    @Override // defpackage.xb1
    public final String z() {
        int o0 = o0();
        if (o0 > 0) {
            int i = this.e;
            int i2 = this.C;
            if (o0 <= i - i2) {
                String str = new String(this.d, i2, o0, wz5.a);
                this.C += o0;
                return str;
            }
        }
        if (o0 == 0) {
            return "";
        }
        if (o0 < 0) {
            throw q16.d();
        }
        throw q16.e();
    }
}
