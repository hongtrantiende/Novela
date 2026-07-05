package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n40  reason: default package */
/* loaded from: classes.dex */
public final class n40 extends BroadcastReceiver {
    public final c04 a;
    public final ggb b;
    public final /* synthetic */ o40 c;

    public n40(o40 o40Var, ggb ggbVar, c04 c04Var) {
        this.c = o40Var;
        this.b = ggbVar;
        this.a = c04Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new x0(this, 5));
        }
    }
}
