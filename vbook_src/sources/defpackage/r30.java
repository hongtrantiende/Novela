package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r30  reason: default package */
/* loaded from: classes.dex */
public final class r30 implements d47 {
    public final MediaCodec a;
    public final v30 b;
    public final f47 c;
    public final kz6 d;
    public boolean e;
    public int f = 0;

    public r30(MediaCodec mediaCodec, HandlerThread handlerThread, f47 f47Var, kz6 kz6Var) {
        this.a = mediaCodec;
        this.b = new v30(handlerThread);
        this.c = f47Var;
        this.d = kz6Var;
    }

    public static void t(r30 r30Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        kz6 kz6Var;
        v30 v30Var = r30Var.b;
        MediaCodec mediaCodec = r30Var.a;
        HandlerThread handlerThread = v30Var.b;
        if (v30Var.c == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(v30Var, handler);
        v30Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        r30Var.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (kz6Var = r30Var.d) != null) {
            kz6Var.a(mediaCodec);
        }
        r30Var.f = 1;
    }

    public static String u(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.d47
    public final void a() {
        kz6 kz6Var;
        kz6 kz6Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                v30 v30Var = this.b;
                synchronized (v30Var.a) {
                    v30Var.m = true;
                    v30Var.b.quit();
                    v30Var.a();
                }
            }
            this.f = 2;
            if (!this.e) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30 && i < 33) {
                        this.a.stop();
                    }
                    if (i >= 35 && (kz6Var2 = this.d) != null) {
                        kz6Var2.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (kz6Var = this.d) != null) {
                        kz6Var.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.d47
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.d47
    public final void c(int i, nd2 nd2Var, long j, int i2) {
        this.c.c(i, nd2Var, j, i2);
    }

    @Override // defpackage.d47
    public final void d(int i, int i2, int i3, long j) {
        this.c.d(i, i2, i3, j);
    }

    @Override // defpackage.d47
    public final void e(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.d47
    public final void f(ex2 ex2Var) {
        v30 v30Var = this.b;
        b9 b9Var = new b9(3, this, ex2Var);
        synchronized (v30Var.a) {
            v30Var.b();
            b9Var.run();
        }
    }

    @Override // defpackage.d47
    public final void flush() {
        this.c.flush();
        this.a.flush();
        v30 v30Var = this.b;
        synchronized (v30Var.a) {
            v30Var.l++;
            Handler handler = v30Var.c;
            String str = a2d.a;
            handler.post(new x0(v30Var, 3));
        }
        this.a.start();
    }

    @Override // defpackage.d47
    public final MediaFormat g() {
        MediaFormat mediaFormat;
        v30 v30Var = this.b;
        synchronized (v30Var.a) {
            try {
                mediaFormat = v30Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.d47
    public final void h() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.d47
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:13:0x0022, B:17:0x0026, B:24:0x003e, B:23:0x0034, B:26:0x0040, B:27:0x0045), top: B:30:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:13:0x0022, B:17:0x0026, B:24:0x003e, B:23:0x0034, B:26:0x0040, B:27:0x0045), top: B:30:0x000a }] */
    @Override // defpackage.d47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r6 = this;
            f47 r0 = r6.c
            r0.i()
            v30 r6 = r6.b
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            r6.b()     // Catch: java.lang.Throwable -> L24
            long r1 = r6.l     // Catch: java.lang.Throwable -> L24
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 > 0) goto L1e
            boolean r1 = r6.m     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = r2
            goto L1f
        L1e:
            r1 = r3
        L1f:
            r4 = -1
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r6 = move-exception
            goto L46
        L26:
            wh1 r6 = r6.d     // Catch: java.lang.Throwable -> L24
            int r1 = r6.a     // Catch: java.lang.Throwable -> L24
            int r5 = r6.b     // Catch: java.lang.Throwable -> L24
            if (r1 != r5) goto L2f
            r2 = r3
        L2f:
            if (r2 == 0) goto L32
            goto L3e
        L32:
            if (r1 == r5) goto L40
            int[] r2 = r6.c     // Catch: java.lang.Throwable -> L24
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + r3
            int r2 = r6.d     // Catch: java.lang.Throwable -> L24
            r1 = r1 & r2
            r6.a = r1     // Catch: java.lang.Throwable -> L24
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r4
        L40:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L24
            r6.<init>()     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r30.j():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:13:0x0022, B:17:0x0027, B:21:0x0032, B:24:0x0036, B:26:0x0042, B:30:0x0069, B:29:0x005f, B:32:0x006b, B:33:0x0070), top: B:36:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:13:0x0022, B:17:0x0027, B:21:0x0032, B:24:0x0036, B:26:0x0042, B:30:0x0069, B:29:0x005f, B:32:0x006b, B:33:0x0070), top: B:36:0x000a }] */
    @Override // defpackage.d47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            f47 r0 = r9.c
            r0.i()
            v30 r9 = r9.b
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            r9.b()     // Catch: java.lang.Throwable -> L24
            long r2 = r9.l     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 > 0) goto L1e
            boolean r0 = r9.m     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            r4 = -1
            if (r0 == 0) goto L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r0 = move-exception
            r9 = r0
            goto L71
        L27:
            wh1 r0 = r9.e     // Catch: java.lang.Throwable -> L24
            int r5 = r0.a     // Catch: java.lang.Throwable -> L24
            int r6 = r0.b     // Catch: java.lang.Throwable -> L24
            if (r5 != r6) goto L30
            r2 = r3
        L30:
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L34:
            if (r5 == r6) goto L6b
            int[] r2 = r0.c     // Catch: java.lang.Throwable -> L24
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + r3
            int r3 = r0.d     // Catch: java.lang.Throwable -> L24
            r3 = r3 & r5
            r0.a = r3     // Catch: java.lang.Throwable -> L24
            if (r2 < 0) goto L5c
            android.media.MediaFormat r0 = r9.h     // Catch: java.lang.Throwable -> L24
            r0.getClass()     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r9 = r9.f     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = r9.remove()     // Catch: java.lang.Throwable -> L24
            android.media.MediaCodec$BufferInfo r9 = (android.media.MediaCodec.BufferInfo) r9     // Catch: java.lang.Throwable -> L24
            int r4 = r9.offset     // Catch: java.lang.Throwable -> L24
            int r5 = r9.size     // Catch: java.lang.Throwable -> L24
            long r6 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L24
            int r8 = r9.flags     // Catch: java.lang.Throwable -> L24
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L24
            goto L69
        L5c:
            r10 = -2
            if (r2 != r10) goto L69
            java.util.ArrayDeque r10 = r9.g     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L24
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L24
            r9.h = r10     // Catch: java.lang.Throwable -> L24
        L69:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r2
        L6b:
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L24
            r9.<init>()     // Catch: java.lang.Throwable -> L24
            throw r9     // Catch: java.lang.Throwable -> L24
        L71:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r30.k(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // defpackage.d47
    public final void l(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.d47
    public final ByteBuffer m(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.d47
    public final void n(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.d47
    public final boolean o(mce mceVar) {
        v30 v30Var = this.b;
        synchronized (v30Var.a) {
            v30Var.o = mceVar;
        }
        return true;
    }

    @Override // defpackage.d47
    public final ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.d47
    public final void q(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.d47
    public final void r(t47 t47Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new p30(this, t47Var, 0), handler);
    }

    @Override // defpackage.d47
    public final void s(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }
}
