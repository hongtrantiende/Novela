package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u25  reason: default package */
/* loaded from: classes3.dex */
public final class u25 implements yma {
    public final lj9 a;
    public final Deflater b;
    public final b03 c;
    public boolean d;
    public final CRC32 e;

    public u25(az0 az0Var) {
        az0Var.getClass();
        lj9 lj9Var = new lj9(az0Var);
        this.a = lj9Var;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new b03(lj9Var, deflater, 0);
        this.e = new CRC32();
        my0 my0Var = lj9Var.b;
        my0Var.o1(8075);
        my0Var.k1(8);
        my0Var.k1(0);
        my0Var.m9writeInt(0);
        my0Var.k1(0);
        my0Var.k1(0);
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int value;
        boolean z;
        my0 my0Var;
        Deflater deflater = this.b;
        lj9 lj9Var = this.a;
        if (!this.d) {
            try {
                b03 b03Var = this.c;
                ((Deflater) b03Var.d).finish();
                b03Var.o(false);
                value = (int) this.e.getValue();
                z = lj9Var.c;
                my0Var = lj9Var.b;
            } catch (Throwable th) {
                th = th;
            }
            if (!z) {
                my0Var.n1(value);
                lj9Var.a0();
                int bytesRead = (int) deflater.getBytesRead();
                if (!lj9Var.c) {
                    my0Var.n1(bytesRead);
                    lj9Var.a0();
                    th = null;
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        lj9Var.close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.d = true;
                    if (th == null) {
                        return;
                    }
                    throw th;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalStateException("closed");
        }
    }

    @Override // defpackage.yma, java.io.Flushable
    public final void flush() {
        this.c.flush();
    }

    @Override // defpackage.yma
    public final dac timeout() {
        return this.a.a.timeout();
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return;
            }
            e5a e5aVar = my0Var.a;
            e5aVar.getClass();
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, e5aVar.c - e5aVar.b);
                this.e.update(e5aVar.a, e5aVar.b, min);
                j2 -= min;
                e5aVar = e5aVar.f;
                e5aVar.getClass();
            }
            this.c.write(my0Var, j);
            return;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
    }
}
