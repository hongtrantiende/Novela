package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v88  reason: default package */
/* loaded from: classes.dex */
public final class v88 implements osa {
    public ByteBuffer a = ByteBuffer.allocateDirect(32768);
    public volatile boolean b = false;
    public final /* synthetic */ w88 c;

    public v88(w88 w88Var) {
        this.c = w88Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.b) {
            this.b = true;
            if (!this.c.b.get()) {
                this.c.i.cancel();
            }
        }
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        boolean z;
        boolean z2;
        int write;
        boolean z3;
        boolean z4;
        u88 u88Var;
        if (!this.c.c.get()) {
            boolean z5 = false;
            if (my0Var != null) {
                z = true;
            } else {
                z = false;
            }
            wq9.r("sink == null", z);
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            wq9.q("byteCount < 0: %s", j, z2);
            wq9.C("closed", !this.b);
            if (this.c.b.get()) {
                return -1L;
            }
            if (i == 0) {
                return 0L;
            }
            if (this.a.position() == 0) {
                if (this.a.position() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                wq9.C("Buffer position is not 0", z3);
                if (this.a.limit() == this.a.capacity()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                wq9.C("Buffer limit is not capacity", z4);
                this.c.i.read(this.a);
                try {
                    w88 w88Var = this.c;
                    u88Var = (u88) w88Var.d.poll(w88Var.f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    u88Var = null;
                }
                if (u88Var != null) {
                    int C = a82.C(u88Var.a);
                    if (C != 0) {
                        if (C != 1) {
                            if (C != 2) {
                                if (C != 3) {
                                    vs.j("The switch block above is exhaustive!");
                                    return 0L;
                                }
                                this.a = null;
                                fb4.k("The request was canceled!");
                                return 0L;
                            }
                            this.c.b.set(true);
                            this.a = null;
                            throw new IOException(u88Var.b);
                        }
                        this.c.b.set(true);
                        this.a = null;
                        return -1L;
                    }
                    this.a.flip();
                    wq9.C("Buffer should have remaining bytes after flip", this.a.hasRemaining());
                } else {
                    this.c.i.cancel();
                    throw new IOException();
                }
            }
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() <= j) {
                write = my0Var.write(byteBuffer);
            } else {
                int limit = byteBuffer.limit();
                try {
                    byteBuffer.limit(byteBuffer.position() + ((int) j));
                    write = my0Var.write(byteBuffer);
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            if (write > 0) {
                z5 = true;
            }
            wq9.C("Bytes written should be positive", z5);
            if (!this.a.hasRemaining()) {
                this.a.clear();
            }
            return write;
        }
        fb4.k("The request was canceled!");
        return 0L;
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return dac.d;
    }
}
