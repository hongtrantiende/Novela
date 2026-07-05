package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x6e  reason: default package */
/* loaded from: classes.dex */
public final class x6e extends xb1 {
    public int C;
    public final int D;
    public int E;
    public int F;
    public final byte[] d;
    public int e;
    public int f;

    public x6e(byte[] bArr, int i, int i2) {
        super(6, (byte) 0);
        this.F = Integer.MAX_VALUE;
        this.d = bArr;
        this.e = i2 + i;
        this.C = i;
        this.D = i;
    }

    @Override // defpackage.xb1
    public final double I() {
        return Double.longBitsToDouble(o0());
    }

    @Override // defpackage.xb1
    public final float P() {
        return Float.intBitsToFloat(n0());
    }

    @Override // defpackage.xb1
    public final int Q(int i) {
        if (i >= 0) {
            int S = S() + i;
            if (S >= 0) {
                int i2 = this.F;
                if (S <= i2) {
                    this.F = S;
                    q0();
                    return i2;
                }
                throw w7e.g();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        throw w7e.e();
    }

    @Override // defpackage.xb1
    public final int S() {
        return this.C - this.D;
    }

    @Override // defpackage.xb1
    public final void T(int i) {
        if (this.E == i) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.xb1
    public final int U() {
        return s0();
    }

    @Override // defpackage.xb1
    public final void V(int i) {
        this.F = i;
        q0();
    }

    @Override // defpackage.xb1
    public final int W() {
        return n0();
    }

    @Override // defpackage.xb1
    public final int X() {
        return s0();
    }

    @Override // defpackage.xb1
    public final int Y() {
        return n0();
    }

    @Override // defpackage.xb1
    public final int Z() {
        int t0 = t0();
        return (-(t0 & 1)) ^ (t0 >>> 1);
    }

    @Override // defpackage.xb1
    public final int a0() {
        if (k0()) {
            this.E = 0;
            return 0;
        }
        int t0 = t0();
        this.E = t0;
        if ((t0 >>> 3) != 0) {
            return t0;
        }
        throw w7e.b();
    }

    @Override // defpackage.xb1
    public final int b0() {
        return t0();
    }

    @Override // defpackage.xb1
    public final long c0() {
        return o0();
    }

    @Override // defpackage.xb1
    public final long d0() {
        return p0();
    }

    @Override // defpackage.xb1
    public final long e0() {
        return o0();
    }

    @Override // defpackage.xb1
    public final long f0() {
        return xb1.K(p0());
    }

    @Override // defpackage.xb1
    public final long g0() {
        return p0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    @Override // defpackage.xb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.w6e h0() {
        /*
            r4 = this;
            int r0 = r4.t0()
            byte[] r1 = r4.d
            if (r0 <= 0) goto L19
            int r2 = r4.e
            int r3 = r4.C
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            w6e r1 = defpackage.s6e.i(r1, r3, r0)
            int r2 = r4.C
            int r2 = r2 + r0
            r4.C = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            w6e r4 = defpackage.s6e.b
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.e
            int r3 = r4.C
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.C = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L48
            if (r0 != 0) goto L43
            byte[] r4 = defpackage.n7e.a
        L35:
            w6e r0 = defpackage.s6e.b
            int r0 = r4.length
            if (r0 != 0) goto L3d
            w6e r4 = defpackage.s6e.b
            return r4
        L3d:
            w6e r0 = new w6e
            r0.<init>(r4)
            return r0
        L43:
            w7e r4 = defpackage.w7e.e()
            throw r4
        L48:
            w7e r4 = defpackage.w7e.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6e.h0():w6e");
    }

    @Override // defpackage.xb1
    public final String i0() {
        int t0 = t0();
        if (t0 > 0) {
            int i = this.e;
            int i2 = this.C;
            if (t0 <= i - i2) {
                String str = new String(this.d, i2, t0, StandardCharsets.UTF_8);
                this.C += t0;
                return str;
            }
        }
        if (t0 == 0) {
            return "";
        }
        if (t0 < 0) {
            throw w7e.e();
        }
        throw w7e.g();
    }

    @Override // defpackage.xb1
    public final String j0() {
        int t0 = t0();
        if (t0 > 0) {
            int i = this.e;
            int i2 = this.C;
            if (t0 <= i - i2) {
                String I = z87.I(this.d, i2, t0);
                this.C += t0;
                return I;
            }
        }
        if (t0 == 0) {
            return "";
        }
        if (t0 <= 0) {
            throw w7e.e();
        }
        throw w7e.g();
    }

    @Override // defpackage.xb1
    public final boolean k0() {
        if (this.C == this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xb1
    public final boolean l0() {
        if (p0() != 0) {
            return true;
        }
        return false;
    }

    public final int m0() {
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
        return (int) r0();
    }

    public final int n0() {
        int i = this.C;
        if (this.e - i >= 4) {
            this.C = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw w7e.g();
    }

    public final long o0() {
        int i = this.C;
        if (this.e - i >= 8) {
            this.C = i + 8;
            byte[] bArr = this.d;
            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
        }
        throw w7e.g();
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
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (bArr[i8] << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (bArr[i4] << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.C = i4;
                return j;
            }
        }
        return r0();
    }

    public final void q0() {
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

    public final long r0() {
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
                throw w7e.g();
            }
        }
        throw w7e.d();
    }

    public final int s0() {
        return m0();
    }

    public final int t0() {
        return m0();
    }
}
