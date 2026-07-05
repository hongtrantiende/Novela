package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements e3f {
    public l97 a;

    @Override // defpackage.e3f
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final l97 c() {
        if (this.a == null) {
            this.a = new l97(this);
        }
        return this.a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        l97 c = c();
        Service service = (Service) c.a;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            am8.s(string);
            a6f C = a6f.C(service);
            ppe c2 = C.c();
            jf8 jf8Var = C.H.c;
            c2.J.f(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            C.f().g0(new w1f(c, C, new gp9(13, c, c2, jobParameters2, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            am8.s(string);
            qke c3 = qke.c(service, null);
            w1f w1fVar = new w1f(c, false, jobParameters2, 5);
            c3.getClass();
            c3.a(new fhe(c3, w1fVar, 2));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.e3f
    public final void a(Intent intent) {
    }
}
