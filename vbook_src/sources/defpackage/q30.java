package defpackage;

import android.os.HandlerThread;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q30 implements c9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q30(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.c9b
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new HandlerThread(r30.u(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(r30.u(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
