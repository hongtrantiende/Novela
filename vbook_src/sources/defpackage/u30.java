package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u30  reason: default package */
/* loaded from: classes.dex */
public final class u30 implements f47 {
    public static final ArrayDeque C = new ArrayDeque();
    public static final Object D = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public s30 c;
    public final AtomicReference d;
    public final vy1 e;
    public boolean f;

    public u30(MediaCodec mediaCodec, HandlerThread handlerThread) {
        vy1 vy1Var = new vy1();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = vy1Var;
        this.d = new AtomicReference();
    }

    public static t30 a() {
        ArrayDeque arrayDeque = C;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new t30();
                }
                return (t30) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f47
    public final void b(Bundle bundle) {
        i();
        s30 s30Var = this.c;
        String str = a2d.a;
        s30Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.f47
    public final void c(int i, nd2 nd2Var, long j, int i2) {
        i();
        t30 a = a();
        a.a = i;
        a.b = 0;
        a.d = j;
        a.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = a.c;
        cryptoInfo.numSubSamples = nd2Var.f;
        int[] iArr = nd2Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = nd2Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = nd2Var.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = nd2Var.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = nd2Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(nd2Var.g, nd2Var.h));
        s30 s30Var = this.c;
        String str = a2d.a;
        s30Var.obtainMessage(2, a).sendToTarget();
    }

    @Override // defpackage.f47
    public final void d(int i, int i2, int i3, long j) {
        i();
        t30 a = a();
        a.a = i;
        a.b = i2;
        a.d = j;
        a.e = i3;
        s30 s30Var = this.c;
        String str = a2d.a;
        s30Var.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.f47
    public final void flush() {
        if (this.f) {
            try {
                s30 s30Var = this.c;
                s30Var.getClass();
                s30Var.removeCallbacksAndMessages(null);
                vy1 vy1Var = this.e;
                synchronized (vy1Var) {
                    vy1Var.b = false;
                }
                s30 s30Var2 = this.c;
                s30Var2.getClass();
                s30Var2.obtainMessage(3).sendToTarget();
                synchronized (vy1Var) {
                    while (!vy1Var.b) {
                        vy1Var.a.getClass();
                        vy1Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                p1a.n(e);
            }
        }
    }

    @Override // defpackage.f47
    public final void i() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override // defpackage.f47
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.f47
    public final void start() {
        if (!this.f) {
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            this.c = new s30(this, handlerThread.getLooper(), 0);
            this.f = true;
        }
    }
}
