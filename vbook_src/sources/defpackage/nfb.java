package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nfb  reason: default package */
/* loaded from: classes.dex */
public final class nfb implements d47 {
    public final MediaCodec a;
    public final kz6 b;

    public nfb(MediaCodec mediaCodec, kz6 kz6Var) {
        this.a = mediaCodec;
        this.b = kz6Var;
        if (Build.VERSION.SDK_INT >= 35 && kz6Var != null) {
            kz6Var.a(mediaCodec);
        }
    }

    @Override // defpackage.d47
    public final void a() {
        kz6 kz6Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && kz6Var != null) {
                kz6Var.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && kz6Var != null) {
                kz6Var.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.d47
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.d47
    public final void c(int i, nd2 nd2Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, nd2Var.i, j, i2);
    }

    @Override // defpackage.d47
    public final void d(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.d47
    public final void e(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.d47
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.d47
    public final MediaFormat g() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.d47
    public final void h() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.d47
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.d47
    public final int j() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.d47
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
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
    public final ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.d47
    public final void q(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.d47
    public final void r(t47 t47Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new p30(this, t47Var, 1), handler);
    }

    @Override // defpackage.d47
    public final void s(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }
}
