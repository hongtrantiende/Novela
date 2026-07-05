package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s4f  reason: default package */
/* loaded from: classes.dex */
public final class s4f extends f5f {
    public final AlarmManager d;
    public v3f e;
    public Integer f;

    public s4f(a6f a6fVar) {
        super(a6fVar);
        this.d = (AlarmManager) ((lte) this.a).a.getSystemService("alarm");
    }

    @Override // defpackage.f5f
    public final void a0() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = ((lte) this.a).a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zde.a));
        }
        d0();
    }

    public final hae b0() {
        if (this.e == null) {
            this.e = new v3f(this, this.b.H, 1);
        }
        return this.e;
    }

    public final void c0() {
        Y();
        lte lteVar = (lte) this.a;
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.J.e("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = lteVar.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zde.a));
        }
        b0().c();
        d0();
    }

    public final void d0() {
        JobScheduler jobScheduler = (JobScheduler) ((lte) this.a).a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(e0());
        }
    }

    public final int e0() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(((lte) this.a).a.getPackageName())).hashCode());
        }
        return this.f.intValue();
    }
}
