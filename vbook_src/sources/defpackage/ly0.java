package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ly0  reason: default package */
/* loaded from: classes3.dex */
public final class ly0 implements psa, zma {
    public d5a a;
    public d5a b;
    public long c;

    public final void C(hh9 hh9Var, long j) {
        hh9Var.getClass();
        if (j >= 0) {
            long j2 = this.c;
            if (j2 >= j) {
                hh9Var.U0(this, j);
                return;
            } else {
                hh9Var.U0(this, j2);
                throw new EOFException(hl5.q(rs8.o(j, "Buffer exhausted before writing ", " bytes. Only "), this.c, " bytes were written."));
            }
        }
        p1a.k(nk2.t(j, "byteCount (", ") < 0"));
    }

    @Override // defpackage.zma
    public final long D0(ih9 ih9Var) {
        ih9Var.getClass();
        long j = 0;
        while (true) {
            long M = ih9Var.M(this, 8192L);
            if (M != -1) {
                j += M;
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.zma
    public final void E(short s) {
        d5a g0 = g0(2);
        byte[] bArr = g0.a;
        int i = g0.c;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        g0.c = i + 2;
        this.c += 2;
    }

    public final void G() {
        d5a d5aVar = this.a;
        d5aVar.getClass();
        d5a d5aVar2 = d5aVar.f;
        this.a = d5aVar2;
        if (d5aVar2 == null) {
            this.b = null;
        } else {
            d5aVar2.g = null;
        }
        d5aVar.f = null;
        o5a.a(d5aVar);
    }

    @Override // defpackage.ih9
    public final long M(ly0 ly0Var, long j) {
        ly0Var.getClass();
        if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            ly0Var.U0(this, j);
            return j;
        }
        p1a.k(nk2.t(j, "byteCount (", ") < 0"));
        return 0L;
    }

    @Override // defpackage.zma
    public final void P(byte b) {
        d5a g0 = g0(1);
        byte[] bArr = g0.a;
        int i = g0.c;
        g0.c = i + 1;
        bArr[i] = b;
        this.c++;
    }

    public final /* synthetic */ void Q() {
        d5a d5aVar = this.b;
        d5aVar.getClass();
        d5a d5aVar2 = d5aVar.g;
        this.b = d5aVar2;
        if (d5aVar2 == null) {
            this.a = null;
        } else {
            d5aVar2.f = null;
        }
        d5aVar.g = null;
        o5a.a(d5aVar);
    }

    public final void S(long j) {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    @Override // defpackage.hh9
    public final void U0(ly0 ly0Var, long j) {
        d5a d5aVar;
        d5a b;
        int i;
        if (ly0Var != this) {
            tc4.n(ly0Var.c, j);
            while (j > 0) {
                ly0Var.a.getClass();
                int i2 = 0;
                if (j < d5aVar.b()) {
                    d5a d5aVar2 = this.b;
                    if (d5aVar2 != null && d5aVar2.e) {
                        long j2 = d5aVar2.c + j;
                        am9 am9Var = d5aVar2.d;
                        if (am9Var != null && am9Var.a > 0) {
                            i = 0;
                        } else {
                            i = d5aVar2.b;
                        }
                        if (j2 - i <= 8192) {
                            d5a d5aVar3 = ly0Var.a;
                            d5aVar3.getClass();
                            d5aVar3.g(d5aVar2, (int) j);
                            ly0Var.c -= j;
                            this.c += j;
                            return;
                        }
                    }
                    d5a d5aVar4 = ly0Var.a;
                    d5aVar4.getClass();
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= d5aVar4.c - d5aVar4.b) {
                        if (i3 >= 1024) {
                            b = d5aVar4.f();
                        } else {
                            b = o5a.b();
                            byte[] bArr = d5aVar4.a;
                            byte[] bArr2 = b.a;
                            int i4 = d5aVar4.b;
                            b00.c0(bArr, 0, i4, bArr2, i4 + i3, 2);
                        }
                        b.c = b.b + i3;
                        d5aVar4.b += i3;
                        d5a d5aVar5 = d5aVar4.g;
                        if (d5aVar5 != null) {
                            d5aVar5.e(b);
                        } else {
                            b.f = d5aVar4;
                            d5aVar4.g = b;
                        }
                        ly0Var.a = b;
                    } else {
                        vs.m("byteCount out of range");
                        return;
                    }
                }
                d5a d5aVar6 = ly0Var.a;
                d5aVar6.getClass();
                long b2 = d5aVar6.b();
                d5a d = d5aVar6.d();
                ly0Var.a = d;
                if (d == null) {
                    ly0Var.b = null;
                }
                if (this.a == null) {
                    this.a = d5aVar6;
                    this.b = d5aVar6;
                } else {
                    d5a d5aVar7 = this.b;
                    d5aVar7.getClass();
                    d5aVar7.e(d5aVar6);
                    d5a d5aVar8 = d5aVar6.g;
                    if (d5aVar8 != null) {
                        if (d5aVar8.e) {
                            int i5 = d5aVar6.c - d5aVar6.b;
                            int i6 = 8192 - d5aVar8.c;
                            d5aVar8.getClass();
                            am9 am9Var2 = d5aVar8.d;
                            if (am9Var2 == null || am9Var2.a <= 0) {
                                d5a d5aVar9 = d5aVar6.g;
                                d5aVar9.getClass();
                                i2 = d5aVar9.b;
                            }
                            if (i5 <= i6 + i2) {
                                d5a d5aVar10 = d5aVar6.g;
                                d5aVar10.getClass();
                                d5aVar6.g(d5aVar10, i5);
                                if (d5aVar6.d() == null) {
                                    o5a.a(d5aVar6);
                                    d5aVar6 = d5aVar10;
                                } else {
                                    vs.k("Check failed.");
                                    return;
                                }
                            }
                        }
                        this.b = d5aVar6;
                        if (d5aVar6.g == null) {
                            this.a = d5aVar6;
                        }
                    } else {
                        vs.k("cannot compact");
                        return;
                    }
                }
                ly0Var.c -= b2;
                this.c += b2;
                j -= b2;
            }
            return;
        }
        vs.m("source == this");
    }

    public final long V(hh9 hh9Var) {
        hh9Var.getClass();
        long j = this.c;
        if (j > 0) {
            hh9Var.U0(this, j);
        }
        return j;
    }

    public final /* synthetic */ d5a g0(int i) {
        if (i >= 1 && i <= 8192) {
            d5a d5aVar = this.b;
            if (d5aVar == null) {
                d5a b = o5a.b();
                this.a = b;
                this.b = b;
                return b;
            } else if (d5aVar.c + i <= 8192 && d5aVar.e) {
                return d5aVar;
            } else {
                d5a b2 = o5a.b();
                d5aVar.e(b2);
                this.b = b2;
                return b2;
            }
        }
        p1a.k(hl5.l("unexpected capacity (", "), should be in range [1, 8192]", i));
        return null;
    }

    @Override // defpackage.psa
    public final boolean k() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zma
    public final void n(byte[] bArr, int i) {
        bArr.getClass();
        tc4.m(bArr.length, 0L, i);
        int i2 = 0;
        while (i2 < i) {
            d5a g0 = g0(1);
            int min = Math.min(i - i2, g0.a()) + i2;
            b00.U(g0.c, i2, min, bArr, g0.a);
            g0.c = (min - i2) + g0.c;
            i2 = min;
        }
        this.c += i;
    }

    public final byte o(long j) {
        long j2 = 0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j < this.c) {
            d5a d5aVar = this.a;
            if (i == 0) {
                d5aVar.getClass();
                return d5aVar.c(0);
            }
            d5aVar.getClass();
            long j3 = this.c;
            if (j3 - j < j) {
                d5a d5aVar2 = this.b;
                while (d5aVar2 != null && j3 > j) {
                    j3 -= d5aVar2.c - d5aVar2.b;
                    if (j3 <= j) {
                        break;
                    }
                    d5aVar2 = d5aVar2.g;
                }
                d5aVar2.getClass();
                return d5aVar2.c((int) (j - j3));
            }
            d5a d5aVar3 = this.a;
            while (d5aVar3 != null) {
                long j4 = (d5aVar3.c - d5aVar3.b) + j2;
                if (j4 > j) {
                    break;
                }
                d5aVar3 = d5aVar3.f;
                j2 = j4;
            }
            d5aVar3.getClass();
            return d5aVar3.c((int) (j - j2));
        }
        cy7.k(hl5.q(rs8.o(j, "position (", ") is not within the range [0..size("), this.c, "))"));
        return (byte) 0;
    }

    @Override // defpackage.psa
    public final wj9 peek() {
        return new wj9(new ft8(this));
    }

    public final int q(byte[] bArr, int i, int i2) {
        tc4.m(bArr.length, i, i2);
        d5a d5aVar = this.a;
        if (d5aVar == null) {
            return -1;
        }
        int min = Math.min(i2 - i, d5aVar.b());
        int i3 = (i + min) - i;
        byte[] bArr2 = d5aVar.a;
        int i4 = d5aVar.b;
        b00.U(i, i4, i4 + i3, bArr2, bArr);
        d5aVar.b += i3;
        this.c -= min;
        if (zxe.q(d5aVar)) {
            G();
        }
        return min;
    }

    @Override // defpackage.psa
    public final byte readByte() {
        d5a d5aVar = this.a;
        if (d5aVar != null) {
            int b = d5aVar.b();
            if (b == 0) {
                G();
                return readByte();
            }
            byte[] bArr = d5aVar.a;
            int i = d5aVar.b;
            d5aVar.b = i + 1;
            byte b2 = bArr[i];
            this.c--;
            if (b == 1) {
                G();
            }
            return b2;
        }
        S(1L);
        throw null;
    }

    public final short readShort() {
        d5a d5aVar = this.a;
        if (d5aVar != null) {
            int b = d5aVar.b();
            if (b < 2) {
                w(2L);
                if (b == 0) {
                    G();
                    return readShort();
                }
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = d5aVar.a;
            int i = d5aVar.b;
            short s = (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
            d5aVar.b = i + 2;
            this.c -= 2;
            if (b == 2) {
                G();
            }
            return s;
        }
        S(2L);
        throw null;
    }

    @Override // defpackage.psa
    public final boolean request(long j) {
        if (j >= 0) {
            if (this.c >= j) {
                return true;
            }
            return false;
        }
        p1a.k(nk2.t(j, "byteCount: ", " < 0"));
        return false;
    }

    public final void skip(long j) {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                d5a d5aVar = this.a;
                if (d5aVar != null) {
                    int min = (int) Math.min(j2, d5aVar.c - d5aVar.b);
                    long j3 = min;
                    this.c -= j3;
                    j2 -= j3;
                    int i = d5aVar.b + min;
                    d5aVar.b = i;
                    if (i == d5aVar.c) {
                        G();
                    }
                } else {
                    throw new EOFException(nk2.t(j, "Buffer exhausted before skipping ", " bytes."));
                }
            }
            return;
        }
        p1a.k(nk2.t(j, "byteCount (", ") < 0"));
    }

    public final String toString() {
        int i;
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int min = (int) Math.min(64L, j);
        int i2 = min * 2;
        if (this.c > 64) {
            i = 1;
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(i2 + i);
        int i3 = 0;
        for (d5a d5aVar = this.a; d5aVar != null; d5aVar = d5aVar.f) {
            int i4 = 0;
            while (i3 < min && i4 < d5aVar.b()) {
                int i5 = i4 + 1;
                byte c = d5aVar.c(i4);
                i3++;
                char[] cArr = tc4.l;
                sb.append(cArr[(c >> 4) & 15]);
                sb.append(cArr[c & 15]);
                i4 = i5;
            }
        }
        if (this.c > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb) + ')';
    }

    @Override // defpackage.psa
    public final void w(long j) {
        if (j >= 0) {
            if (this.c >= j) {
                return;
            }
            long j2 = this.c;
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + j2 + ", required: " + j + ')');
        }
        p1a.k(hl5.k(j, "byteCount: "));
    }

    @Override // defpackage.zma
    public final void writeInt(int i) {
        d5a g0 = g0(4);
        byte[] bArr = g0.a;
        int i2 = g0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        g0.c = i2 + 4;
        this.c += 4;
    }

    @Override // defpackage.zma
    public final void z0(psa psaVar, long j) {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                long M = psaVar.M(this, j2);
                if (M != -1) {
                    j2 -= M;
                } else {
                    throw new EOFException(hl5.q(rs8.o(j, "Source exhausted before reading ", " bytes. Only "), j - j2, " were read."));
                }
            }
            return;
        }
        p1a.k(nk2.t(j, "byteCount (", ") < 0"));
    }

    @Override // defpackage.zma
    public final void C0() {
    }

    @Override // defpackage.psa, defpackage.zma
    public final ly0 b() {
        return this;
    }

    @Override // java.lang.AutoCloseable, defpackage.hh9
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
