package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x56  reason: default package */
/* loaded from: classes3.dex */
public final class x56 implements Closeable {
    public final boolean a;
    public boolean b;
    public int c;
    public final ReentrantLock d = new ReentrantLock();
    public final RandomAccessFile e;

    public x56(boolean z, RandomAccessFile randomAccessFile) {
        this.a = z;
        this.e = randomAccessFile;
    }

    public static rc4 C(x56 x56Var) {
        if (x56Var.a) {
            ReentrantLock reentrantLock = x56Var.d;
            reentrantLock.lock();
            try {
                if (!x56Var.b) {
                    x56Var.c++;
                    reentrantLock.unlock();
                    return new rc4(x56Var);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        vs.k("file handle is read-only");
        return null;
    }

    public final sc4 G(long j) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (!this.b) {
                this.c++;
                reentrantLock.unlock();
                return new sc4(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            synchronized (this) {
                this.e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.a) {
            ReentrantLock reentrantLock = this.d;
            reentrantLock.lock();
            try {
                if (!this.b) {
                    synchronized (this) {
                        this.e.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        }
        vs.k("file handle is read-only");
    }

    public final synchronized int o(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.e.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.e.read(bArr, i, i2 - i3);
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
            } else {
                i3 += read;
            }
        }
        return i3;
    }

    public final int q(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (!this.b) {
                reentrantLock.unlock();
                return o(j, bArr, i, i2);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (!this.b) {
                synchronized (this) {
                    length = this.e.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }
}
