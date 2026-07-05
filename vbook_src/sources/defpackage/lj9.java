package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lj9  reason: default package */
/* loaded from: classes3.dex */
public final class lj9 implements az0 {
    public final yma a;
    public final my0 b;
    public boolean c;

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    public lj9(yma ymaVar) {
        ymaVar.getClass();
        this.a = ymaVar;
        this.b = new Object();
    }

    @Override // defpackage.az0
    public final long J(osa osaVar) {
        osaVar.getClass();
        long j = 0;
        while (true) {
            long read = osaVar.read(this.b, 8192L);
            if (read != -1) {
                j += read;
                a0();
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.az0
    public final az0 S0(e31 e31Var) {
        e31Var.getClass();
        if (!this.c) {
            this.b.g1(e31Var);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.az0
    public final az0 a0() {
        if (!this.c) {
            my0 my0Var = this.b;
            long q = my0Var.q();
            if (q > 0) {
                this.a.write(my0Var, q);
            }
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.az0
    public final my0 b() {
        return this.b;
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yma ymaVar = this.a;
        if (!this.c) {
            try {
                my0 my0Var = this.b;
                long j = my0Var.b;
                if (j > 0) {
                    ymaVar.write(my0Var, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ymaVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.az0, defpackage.yma, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            my0 my0Var = this.b;
            long j = my0Var.b;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            yma ymaVar = this.a;
            if (i > 0) {
                ymaVar.write(my0Var, j);
            }
            ymaVar.flush();
            return;
        }
        vs.k("closed");
    }

    @Override // defpackage.az0
    public final az0 i0(String str) {
        str.getClass();
        if (!this.c) {
            this.b.q1(str);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.az0
    public final az0 n(byte[] bArr, int i) {
        bArr.getClass();
        if (!this.c) {
            this.b.write(bArr, 0, i);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    public final az0 o(long j) {
        if (!this.c) {
            this.b.l1(j);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.az0
    public final az0 q0(long j) {
        if (!this.c) {
            this.b.m1(j);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.yma
    public final dac timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.az0
    public final az0 write(byte[] bArr) {
        bArr.getClass();
        if (!this.c) {
            this.b.write(bArr, 0, bArr.length);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.az0
    public final az0 writeByte(int i) {
        if (!this.c) {
            this.b.k1(i);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.az0
    public final az0 writeInt(int i) {
        if (!this.c) {
            this.b.m9writeInt(i);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.az0
    public final az0 writeShort(int i) {
        if (!this.c) {
            this.b.o1(i);
            a0();
            return this;
        }
        vs.k("closed");
        return null;
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        my0Var.getClass();
        if (!this.c) {
            this.b.write(my0Var, j);
            a0();
            return;
        }
        vs.k("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            a0();
            return write;
        }
        vs.k("closed");
        return 0;
    }
}
