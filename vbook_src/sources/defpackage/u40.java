package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u40  reason: default package */
/* loaded from: classes.dex */
public final class u40 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                koc kocVar = (koc) obj;
                if (!isInitialStickyBroadcast()) {
                    kocVar.f(r40.b(context, intent, (l40) kocVar.k, (AudioDeviceInfo) kocVar.j, kocVar.e()));
                    return;
                }
                return;
            default:
                ((f28) obj).a.execute(new ex2(18, this, context));
                return;
        }
    }
}
