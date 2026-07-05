package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rc4  reason: default package */
/* loaded from: classes3.dex */
public final class rc4 implements yma {
    public final x56 a;
    public long b;
    public boolean c;

    public rc4(x56 x56Var) {
        x56Var.getClass();
        this.a = x56Var;
        this.b = 0L;
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x56 x56Var = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = x56Var.d;
        reentrantLock.lock();
        try {
            int i = x56Var.c - 1;
            x56Var.c = i;
            if (i == 0) {
                if (x56Var.b) {
                    synchronized (x56Var) {
                        x56Var.e.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.yma, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            x56 x56Var = this.a;
            synchronized (x56Var) {
                x56Var.e.getFD().sync();
            }
            return;
        }
        vs.k("closed");
    }

    @Override // defpackage.yma
    public final dac timeout() {
        return dac.d;
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        if (!this.c) {
            x56 x56Var = this.a;
            long j2 = this.b;
            x56Var.getClass();
            bbe.n(my0Var.b, 0L, j);
            long j3 = j2 + j;
            while (j2 < j3) {
                e5a e5aVar = my0Var.a;
                e5aVar.getClass();
                int min = (int) Math.min(j3 - j2, e5aVar.c - e5aVar.b);
                byte[] bArr = e5aVar.a;
                int i = e5aVar.b;
                synchronized (x56Var) {
                    bArr.getClass();
                    x56Var.e.seek(j2);
                    x56Var.e.write(bArr, i, min);
                }
                int i2 = e5aVar.b + min;
                e5aVar.b = i2;
                long j4 = min;
                j2 += j4;
                my0Var.b -= j4;
                if (i2 == e5aVar.c) {
                    my0Var.a = e5aVar.a();
                    n5a.a(e5aVar);
                }
            }
            this.b += j;
            return;
        }
        vs.k("closed");
    }
}
