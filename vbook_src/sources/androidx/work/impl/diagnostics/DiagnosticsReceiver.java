package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = r95.r("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        r95 n = r95.n();
        String str = a;
        n.c(str, "Requesting diagnostics");
        try {
            context.getClass();
            lmd b = lmd.b(context);
            List A = tl1.A((jc8) new f0(DiagnosticsWorker.class).a());
            if (!A.isEmpty()) {
                new amd(b, null, kz3.b, A, 0).a();
                return;
            }
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        } catch (IllegalStateException e) {
            r95.n().k(str, "WorkManager is not initialized", e);
        }
    }
}
