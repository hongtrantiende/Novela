package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u8d  reason: default package */
/* loaded from: classes.dex */
public final class u8d extends s8d implements Choreographer$VsyncCallback {
    public final Handler e;

    public u8d(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = a2d.p(null);
    }

    @Override // defpackage.s8d
    public final void a() {
        this.b.registerDisplayListener(this, a2d.p(null));
        this.a.postVsyncCallback(this);
    }

    @Override // defpackage.s8d
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        long j = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j = expectedPresentationTimeNanos;
            }
            this.d = j;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.postDelayed(new e09(this, 9), 500L);
    }
}
