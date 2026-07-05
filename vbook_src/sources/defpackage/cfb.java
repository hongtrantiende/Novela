package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cfb  reason: default package */
/* loaded from: classes.dex */
public final class cfb extends BroadcastReceiver {
    public dfb a;
    public Context b;

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        dfb dfbVar = this.a;
        if (dfbVar != null) {
            Context context = ((FirebaseMessaging) dfbVar.d).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dfb dfbVar = this.a;
        if (dfbVar == null || !dfbVar.a()) {
            return;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        dfb dfbVar2 = this.a;
        ((FirebaseMessaging) dfbVar2.d).getClass();
        FirebaseMessaging.b(0L, dfbVar2);
        Context context2 = this.b;
        if (context2 != null) {
            context2.unregisterReceiver(this);
        }
        this.a = null;
    }
}
