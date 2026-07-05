package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {
    public g99 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new g99(this, 21);
        }
        g99 g99Var = this.c;
        g99Var.getClass();
        ppe ppeVar = lte.s(context, null, null, null).f;
        lte.m(ppeVar);
        if (intent == null) {
            ppeVar.E.e("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        ppeVar.J.f(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            ppeVar.J.e("Starting wakeful intent.");
            ((AppMeasurementReceiver) g99Var.b).getClass();
            SparseArray sparseArray = WakefulBroadcastReceiver.a;
            synchronized (sparseArray) {
                try {
                    int i = WakefulBroadcastReceiver.b;
                    int i2 = i + 1;
                    WakefulBroadcastReceiver.b = i2;
                    if (i2 <= 0) {
                        WakefulBroadcastReceiver.b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i);
                    ComponentName startService = context.startService(className);
                    if (startService == null) {
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i, newWakeLock);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            ppeVar.E.e("Install Referrer Broadcasts are deprecated");
        }
    }
}
