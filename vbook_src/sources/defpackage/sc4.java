package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc4  reason: default package */
/* loaded from: classes3.dex */
public final class sc4 implements osa {
    public final x56 a;
    public long b;
    public boolean c;

    public sc4(x56 x56Var, long j) {
        this.a = x56Var;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        long j2;
        long j3;
        int i;
        my0Var.getClass();
        if (!this.c) {
            long j4 = this.b;
            if (j >= 0) {
                long j5 = j + j4;
                long j6 = j4;
                while (true) {
                    if (j6 < j5) {
                        e5a b1 = my0Var.b1(1);
                        j2 = -1;
                        int o = this.a.o(j6, b1.a, b1.c, (int) Math.min(j5 - j6, 8192 - i));
                        if (o == -1) {
                            if (b1.b == b1.c) {
                                my0Var.a = b1.a();
                                n5a.a(b1);
                            }
                            if (j4 == j6) {
                                j3 = -1;
                            }
                        } else {
                            b1.c += o;
                            long j7 = o;
                            j6 += j7;
                            my0Var.b += j7;
                        }
                    } else {
                        j2 = -1;
                        break;
                    }
                }
                j3 = j6 - j4;
                if (j3 != j2) {
                    this.b += j3;
                }
                return j3;
            }
            p1a.k(hl5.k(j, "byteCount < 0: "));
            return 0L;
        }
        vs.k("closed");
        return 0L;
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return dac.d;
    }
}
