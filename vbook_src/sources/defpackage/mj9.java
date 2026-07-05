package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mj9  reason: default package */
/* loaded from: classes3.dex */
public final class mj9 implements bz0 {
    public final osa a;
    public final my0 b;
    public boolean c;

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    public mj9(osa osaVar) {
        osaVar.getClass();
        this.a = osaVar;
        this.b = new Object();
    }

    @Override // defpackage.bz0
    public final e31 B(long j) {
        w(j);
        return this.b.B(j);
    }

    public final long C() {
        w(8L);
        long readLong = this.b.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // defpackage.bz0
    public final String F0() {
        return c0(Long.MAX_VALUE);
    }

    public final short G() {
        w(2L);
        return this.b.y0();
    }

    @Override // defpackage.bz0
    public final byte[] K() {
        osa osaVar = this.a;
        my0 my0Var = this.b;
        my0Var.J(osaVar);
        return my0Var.p0(my0Var.b);
    }

    @Override // defpackage.bz0
    public final boolean P0(long j, e31 e31Var) {
        long a;
        boolean z;
        boolean z2;
        long j2;
        e31Var.getClass();
        int e = e31Var.e();
        if (!this.c) {
            if (e < 0 || j < 0 || e > e31Var.e()) {
                return false;
            }
            if (e == 0) {
                return true;
            }
            long j3 = 1;
            long j4 = j + 1;
            long j5 = e;
            bbe.n(e31Var.e(), 0L, j5);
            if (!this.c) {
                long j6 = j;
                loop0: while (true) {
                    my0 my0Var = this.b;
                    a = b.a(my0Var, e31Var, j6, j4, e);
                    if (a != -1) {
                        z = false;
                        z2 = true;
                        break;
                    }
                    long j7 = my0Var.b;
                    z = false;
                    z2 = true;
                    long j8 = (j7 - j5) + j3;
                    if (j8 >= j4) {
                        break;
                    }
                    if (j7 < j4) {
                        j2 = j4;
                    } else {
                        int max = (int) Math.max(j3, (j7 - j4) + j3);
                        int min = ((int) Math.min(j5, (my0Var.b - j6) + j3)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j2 = j4;
                            if (!my0Var.j0(min, my0Var.b - min, e31Var)) {
                                if (min == max) {
                                    break loop0;
                                }
                                min--;
                                j4 = j2;
                            } else {
                                break;
                            }
                        }
                    }
                    if (this.a.read(my0Var, 8192L) == -1) {
                        break;
                    }
                    j6 = Math.max(j6, j8);
                    j4 = j2;
                    j3 = 1;
                }
                a = -1;
                if (a != -1) {
                    return z2;
                }
                return z;
            }
            vs.k("closed");
            return false;
        }
        vs.k("closed");
        return false;
    }

    public final String Q(long j) {
        w(j);
        return this.b.I0(j, ed1.a);
    }

    public final String S() {
        long o = o((byte) 10, 0L, Long.MAX_VALUE);
        int i = (o > (-1L) ? 1 : (o == (-1L) ? 0 : -1));
        my0 my0Var = this.b;
        if (i == 0) {
            long j = my0Var.b;
            if (j != 0) {
                return Q(j);
            }
            return null;
        }
        return b.c(my0Var, o);
    }

    @Override // defpackage.bz0
    public final my0 b() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [my0, java.lang.Object] */
    @Override // defpackage.bz0
    public final String c0(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long o = o((byte) 10, 0L, j2);
            int i = (o > (-1L) ? 1 : (o == (-1L) ? 0 : -1));
            my0 my0Var = this.b;
            if (i != 0) {
                return b.c(my0Var, o);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && my0Var.S(j2 - 1) == 13 && request(j2 + 1) && my0Var.S(j2) == 10) {
                return b.c(my0Var, j2);
            }
            ?? obj = new Object();
            my0Var.C(obj, 0L, Math.min(32L, my0Var.b));
            throw new EOFException("\\n not found: limit=" + Math.min(my0Var.b, j) + " content=" + obj.B(obj.b).f() + (char) 8230);
        }
        p1a.k(hl5.k(j, "limit < 0: "));
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
            this.b.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        defpackage.nqe.u(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.bz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f1() {
        /*
            r6 = this;
            r0 = 1
            r6.w(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.request(r2)
            my0 r3 = r6.b
            if (r2 == 0) goto L4c
            long r4 = (long) r0
            byte r2 = r3.S(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4c
        L34:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.nqe.u(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L4c:
            long r0 = r3.f1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj9.f1():long");
    }

    @Override // defpackage.bz0
    public final InputStream i1() {
        return new ln0(this, 3);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.bz0
    public final boolean k() {
        if (!this.c) {
            my0 my0Var = this.b;
            if (!my0Var.k() || this.a.read(my0Var, 8192L) != -1) {
                return false;
            }
            return true;
        }
        vs.k("closed");
        return false;
    }

    public final long o(byte b, long j, long j2) {
        if (!this.c) {
            if (0 <= j2) {
                long j3 = 0;
                while (j3 < j2) {
                    my0 my0Var = this.b;
                    byte b2 = b;
                    long j4 = j2;
                    long V = my0Var.V(b2, j3, j4);
                    if (V != -1) {
                        return V;
                    }
                    long j5 = my0Var.b;
                    if (j5 >= j4 || this.a.read(my0Var, 8192L) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j5);
                    b = b2;
                    j2 = j4;
                }
                return -1L;
            }
            p1a.k(hl5.k(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        vs.k("closed");
        return 0L;
    }

    public final int q() {
        w(4L);
        return bbe.v(this.b.readInt());
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.c) {
                my0 my0Var2 = this.b;
                if (my0Var2.b == 0) {
                    if (i == 0) {
                        return 0L;
                    }
                    if (this.a.read(my0Var2, 8192L) == -1) {
                        return -1L;
                    }
                }
                return my0Var2.read(my0Var, Math.min(j, my0Var2.b));
            }
            vs.k("closed");
            return 0L;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.bz0
    public final byte readByte() {
        w(1L);
        return this.b.readByte();
    }

    @Override // defpackage.bz0
    public final void readFully(byte[] bArr) {
        my0 my0Var = this.b;
        bArr.getClass();
        try {
            w(bArr.length);
            my0Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = my0Var.b;
                if (j > 0) {
                    int read = my0Var.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        cp8.i();
                        return;
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.bz0
    public final int readInt() {
        w(4L);
        return this.b.readInt();
    }

    @Override // defpackage.bz0
    public final long readLong() {
        w(8L);
        return this.b.readLong();
    }

    @Override // defpackage.bz0
    public final short readShort() {
        w(2L);
        return this.b.readShort();
    }

    @Override // defpackage.bz0
    public final boolean request(long j) {
        my0 my0Var;
        if (j >= 0) {
            if (!this.c) {
                do {
                    my0Var = this.b;
                    if (my0Var.b >= j) {
                        return true;
                    }
                } while (this.a.read(my0Var, 8192L) != -1);
                return false;
            }
            vs.k("closed");
            return false;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return false;
    }

    @Override // defpackage.bz0
    public final void skip(long j) {
        if (!this.c) {
            while (j > 0) {
                my0 my0Var = this.b;
                if (my0Var.b == 0 && this.a.read(my0Var, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, my0Var.b);
                my0Var.skip(min);
                j -= min;
            }
            return;
        }
        vs.k("closed");
    }

    @Override // defpackage.bz0
    public final e31 t0() {
        osa osaVar = this.a;
        my0 my0Var = this.b;
        my0Var.J(osaVar);
        return my0Var.B(my0Var.b);
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.bz0
    public final void w(long j) {
        if (request(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.bz0
    public final void w0(my0 my0Var, long j) {
        my0 my0Var2 = this.b;
        try {
            w(j);
            my0Var2.w0(my0Var, j);
        } catch (EOFException e) {
            my0Var.J(my0Var2);
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        my0 my0Var = this.b;
        if (my0Var.b == 0 && this.a.read(my0Var, 8192L) == -1) {
            return -1;
        }
        return my0Var.read(byteBuffer);
    }

    @Override // defpackage.bz0
    public final int read(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        long j = length;
        bbe.n(bArr.length, 0L, j);
        my0 my0Var = this.b;
        if (my0Var.b == 0) {
            if (length == 0) {
                return 0;
            }
            if (this.a.read(my0Var, 8192L) == -1) {
                return -1;
            }
        }
        return my0Var.read(bArr, 0, (int) Math.min(j, my0Var.b));
    }
}
