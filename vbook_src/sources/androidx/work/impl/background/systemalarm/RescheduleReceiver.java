package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = r95.r("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r95 n = r95.n();
        String str = a;
        n.c(str, "Received intent " + intent);
        try {
            lmd b = lmd.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (lmd.m) {
                BroadcastReceiver.PendingResult pendingResult = b.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                b.i = goAsync;
                if (b.h) {
                    goAsync.finish();
                    b.i = null;
                }
            }
        } catch (IllegalStateException e) {
            r95.n().k(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
