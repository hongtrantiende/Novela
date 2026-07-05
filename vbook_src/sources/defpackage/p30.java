package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t47 b;

    public /* synthetic */ p30(d47 d47Var, t47 t47Var, int i) {
        this.a = i;
        this.b = t47Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        t47 t47Var = this.b;
        switch (i) {
            case 0:
                Handler handler = t47Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    t47Var.a(j);
                    return;
                }
            default:
                Handler handler2 = t47Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    t47Var.a(j);
                    return;
                }
        }
    }
}
