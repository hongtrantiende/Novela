package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tzd  reason: default package */
/* loaded from: classes.dex */
public final class tzd extends dcc {
    public final byte[] d;
    public int f;
    public int h;
    public int i = Integer.MAX_VALUE;
    public int e = 0;
    public int g = 0;

    public /* synthetic */ tzd(byte[] bArr) {
        this.d = bArr;
    }

    @Override // defpackage.dcc
    public final int A() {
        return P();
    }

    @Override // defpackage.dcc
    public final boolean B() {
        if (N() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dcc
    public final String C() {
        int S = S();
        if (S > 0) {
            int i = this.e;
            int i2 = this.g;
            if (S <= i - i2) {
                String str = new String(this.d, i2, S, StandardCharsets.UTF_8);
                this.g += S;
                return str;
            }
        }
        if (S == 0) {
            return "";
        }
        if (S < 0) {
            hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.dcc
    public final String D() {
        int S = S();
        if (S > 0) {
            int i = this.e;
            int i2 = this.g;
            if (S <= i - i2) {
                String d = h3e.d(this.d, i2, S);
                this.g += S;
                return d;
            }
        }
        if (S == 0) {
            return "";
        }
        if (S <= 0) {
            hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.dcc
    public final rzd E() {
        int S = S();
        if (S > 0) {
            int i = this.e;
            int i2 = this.g;
            if (S <= i - i2) {
                rzd i3 = szd.i(this.d, i2, S);
                this.g += S;
                return i3;
            }
        }
        if (S == 0) {
            return szd.b;
        }
        byte[] R = R(S);
        rzd rzdVar = szd.b;
        if (R.length == 0) {
            return szd.b;
        }
        return new rzd(R);
    }

    @Override // defpackage.dcc
    public final byte[] F() {
        return R(S());
    }

    @Override // defpackage.dcc
    public final int G() {
        return S();
    }

    @Override // defpackage.dcc
    public final int H() {
        return S();
    }

    @Override // defpackage.dcc
    public final int I() {
        return P();
    }

    @Override // defpackage.dcc
    public final long J() {
        return Q();
    }

    @Override // defpackage.dcc
    public final int K() {
        return dcc.p(S());
    }

    @Override // defpackage.dcc
    public final long L() {
        return dcc.q(N());
    }

    @Override // defpackage.dcc
    public final int M() {
        return S();
    }

    @Override // defpackage.dcc
    public final long N() {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            i6 = i + 5;
                            long j4 = i9 ^ (bArr[i8] << 28);
                            if (j4 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j5 = j4 ^ (bArr[i6] << 35);
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j4 = j5 ^ (bArr[i10] << 42);
                                    if (j4 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j5 = j4 ^ (bArr[i6] << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j4 = j5 ^ (bArr[i10] << 56);
                                            if (j4 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j6 = j4 ^ (bArr[i6] << 63);
                                                if (j6 >= 0) {
                                                    j = j6 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j5 ^ j3;
                                i4 = i10;
                            }
                            j = j4 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.g = i4;
                return j;
            }
        }
        return O();
    }

    public final long O() {
        byte b;
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 != this.e) {
                this.g = i2 + 1;
                j |= (b & Byte.MAX_VALUE) << i;
                if ((this.d[i2] & 128) == 0) {
                    return j;
                }
            } else {
                hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
        }
        hfd.s("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int P() {
        int i = this.g;
        if (this.e - i >= 4) {
            this.g = i + 4;
            byte[] bArr = this.d;
            int i2 = (bArr[i + 1] & 255) << 8;
            return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public final long Q() {
        byte[] bArr;
        int i = this.g;
        if (this.e - i >= 8) {
            this.g = i + 8;
            return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (this.d[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0L;
    }

    public final byte[] R(int i) {
        if (i > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.g = i4;
                return Arrays.copyOfRange(this.d, i3, i4);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                return d1e.a;
            }
            hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    public final int S() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
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
                this.g = i5;
                return i;
            }
        }
        return (int) O();
    }

    @Override // defpackage.dcc
    public final int g(int i) {
        if (i >= 0) {
            int i2 = i + this.g;
            if (i2 >= 0) {
                int i3 = this.i;
                if (i2 <= i3) {
                    this.i = i2;
                    int i4 = this.e + this.f;
                    this.e = i4;
                    if (i4 > i2) {
                        int i5 = i4 - i2;
                        this.f = i5;
                        this.e = i4 - i5;
                        return i3;
                    }
                    this.f = 0;
                    return i3;
                }
                hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            hfd.s("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    @Override // defpackage.dcc
    public final void h(int i) {
        this.i = i;
        int i2 = this.e + this.f;
        this.e = i2;
        if (i2 > i) {
            int i3 = i2 - i;
            this.f = i3;
            this.e = i2 - i3;
            return;
        }
        this.f = 0;
    }

    @Override // defpackage.dcc
    public final int i() {
        int i = this.i;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.g;
    }

    @Override // defpackage.dcc
    public final boolean j() {
        if (this.g == this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dcc
    public final int k() {
        return this.g;
    }

    @Override // defpackage.dcc
    public final int l(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 >= 0 && (i | i2) >= 0) {
            if (i2 == 0) {
                return 0;
            }
            int min = Math.min(i2, this.e - this.g);
            if (min == 0) {
                return -1;
            }
            System.arraycopy(this.d, this.g, bArr, i, min);
            this.g += min;
            return min;
        }
        xk5.r();
        return 0;
    }

    @Override // defpackage.dcc
    public final void m(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.dcc
    public final int r() {
        if (j()) {
            this.h = 0;
            return 0;
        }
        int S = S();
        this.h = S;
        if ((S >>> 3) != 0) {
            return S;
        }
        hfd.s("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.dcc
    public final void s(int i) {
        if (this.h == i) {
            return;
        }
        hfd.s("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.dcc
    public final boolean t(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                m(4);
                                return true;
                            }
                            hfd.c();
                            return false;
                        }
                        if (this.b == 0) {
                            s(0);
                        }
                        return false;
                    }
                    o();
                    s(((i >>> 3) << 3) | 4);
                    return true;
                }
                m(S());
                return true;
            }
            m(8);
            return true;
        }
        int i3 = this.e - this.g;
        byte[] bArr = this.d;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            hfd.s("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.g;
            if (i7 != this.e) {
                this.g = i7 + 1;
                if (bArr[i7] < 0) {
                }
            } else {
                hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
        }
        hfd.s("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.dcc
    public final double u() {
        return Double.longBitsToDouble(Q());
    }

    @Override // defpackage.dcc
    public final float v() {
        return Float.intBitsToFloat(P());
    }

    @Override // defpackage.dcc
    public final long w() {
        return N();
    }

    @Override // defpackage.dcc
    public final long x() {
        return N();
    }

    @Override // defpackage.dcc
    public final int y() {
        return S();
    }

    @Override // defpackage.dcc
    public final long z() {
        return Q();
    }
}
