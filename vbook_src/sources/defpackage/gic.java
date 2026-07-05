package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gic  reason: default package */
/* loaded from: classes.dex */
public final class gic extends BroadcastReceiver {
    public hic a;
    public final /* synthetic */ hic b;

    public gic(hic hicVar, hic hicVar2) {
        this.b = hicVar;
        this.a = hicVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.b.c).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            hic hicVar = this.a;
            if (hicVar == null) {
                return;
            }
            if (!hicVar.d()) {
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            hic hicVar2 = this.a;
            ((fic) hicVar2.f).e.schedule(hicVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
