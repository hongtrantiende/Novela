package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements e3f {
    public l97 a;

    @Override // defpackage.e3f
    public final void a(Intent intent) {
        SparseArray sparseArray = WakefulBroadcastReceiver.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = WakefulBroadcastReceiver.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                    return;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e3f
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final l97 c() {
        if (this.a == null) {
            this.a = new l97(this);
        }
        return this.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l97 c = c();
        c.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new mve(a6f.C((Service) c.a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) c().a).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) c().a).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final l97 c = c();
        if (intent == null) {
            c.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) c.a;
        final ppe ppeVar = lte.s(service, null, null, null).f;
        lte.m(ppeVar);
        String action = intent.getAction();
        ppeVar.J.g(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Runnable runnable = new Runnable() { // from class: j3f
                @Override // java.lang.Runnable
                public final void run() {
                    Service service2 = (Service) l97.this.a;
                    e3f e3fVar = (e3f) service2;
                    int i3 = i2;
                    if (e3fVar.zza(i3)) {
                        ppeVar.J.f(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                        ppe ppeVar2 = lte.s(service2, null, null, null).f;
                        lte.m(ppeVar2);
                        ppeVar2.J.e("Completed wakeful intent.");
                        e3fVar.a(intent);
                    }
                }
            };
            a6f C = a6f.C(service);
            C.f().g0(new w1f(c, C, runnable));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.e3f
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
