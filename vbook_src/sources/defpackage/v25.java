package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v25  reason: default package */
/* loaded from: classes3.dex */
public final class v25 implements osa {
    public byte a;
    public final mj9 b;
    public final Inflater c;
    public final bv5 d;
    public final CRC32 e;

    public v25(bz0 bz0Var) {
        bz0Var.getClass();
        mj9 mj9Var = new mj9(bz0Var);
        this.b = mj9Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new bv5(mj9Var, inflater);
        this.e = new CRC32();
    }

    public static void o(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        String r0 = k4b.r0(8, bbe.x(i2));
        String r02 = k4b.r0(8, bbe.x(i));
        throw new IOException(str + ": actual 0x" + r0 + " != expected 0x" + r02);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void q(my0 my0Var, long j, long j2) {
        int i;
        e5a e5aVar = my0Var.a;
        e5aVar.getClass();
        while (true) {
            int i2 = e5aVar.c;
            int i3 = e5aVar.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            e5aVar = e5aVar.f;
            e5aVar.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(e5aVar.c - i, j2);
            this.e.update(e5aVar.a, (int) (e5aVar.b + j), min);
            j2 -= min;
            e5aVar = e5aVar.f;
            e5aVar.getClass();
            j = 0;
        }
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        boolean z;
        v25 v25Var = this;
        my0Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            byte b = v25Var.a;
            CRC32 crc32 = v25Var.e;
            mj9 mj9Var = v25Var.b;
            if (b == 0) {
                mj9Var.w(10L);
                my0 my0Var2 = mj9Var.b;
                byte S = my0Var2.S(3L);
                if (((S >> 1) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    v25Var.q(my0Var2, 0L, 10L);
                }
                o(8075, mj9Var.readShort(), "ID1ID2");
                mj9Var.skip(8L);
                if (((S >> 2) & 1) == 1) {
                    mj9Var.w(2L);
                    if (z) {
                        q(my0Var2, 0L, 2L);
                    }
                    long y0 = my0Var2.y0() & 65535;
                    mj9Var.w(y0);
                    if (z) {
                        q(my0Var2, 0L, y0);
                    }
                    mj9Var.skip(y0);
                }
                if (((S >> 3) & 1) == 1) {
                    long o = mj9Var.o((byte) 0, 0L, Long.MAX_VALUE);
                    if (o != -1) {
                        if (z) {
                            q(my0Var2, 0L, o + 1);
                        }
                        mj9Var.skip(o + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((S >> 4) & 1) == 1) {
                    long o2 = mj9Var.o((byte) 0, 0L, Long.MAX_VALUE);
                    if (o2 != -1) {
                        if (z) {
                            v25Var = this;
                            v25Var.q(my0Var2, 0L, o2 + 1);
                        } else {
                            v25Var = this;
                        }
                        mj9Var.skip(o2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    v25Var = this;
                }
                if (z) {
                    o(mj9Var.G(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                v25Var.a = (byte) 1;
            }
            if (v25Var.a == 1) {
                long j2 = my0Var.b;
                long read = v25Var.d.read(my0Var, j);
                if (read != -1) {
                    v25Var.q(my0Var, j2, read);
                    return read;
                }
                v25Var.a = (byte) 2;
            }
            if (v25Var.a == 2) {
                o(mj9Var.q(), (int) crc32.getValue(), "CRC");
                o(mj9Var.q(), (int) v25Var.c.getBytesWritten(), "ISIZE");
                v25Var.a = (byte) 3;
                if (!mj9Var.k()) {
                    fb4.k("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return this.b.a.timeout();
    }
}
