package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l0f  reason: default package */
/* loaded from: classes.dex */
public final class l0f extends fne {
    public JobScheduler c;

    @Override // defpackage.fne
    public final boolean a0() {
        return true;
    }

    public final void b0(long j) {
        String str;
        lte lteVar = (lte) this.a;
        Y();
        W();
        JobScheduler jobScheduler = this.c;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(lteVar.a.getPackageName())).hashCode()) != null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.J.e("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int c0 = c0();
        if (c0 == 2) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.J.f(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
            JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(lteVar.a.getPackageName())).hashCode(), new ComponentName(lteVar.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
            JobScheduler jobScheduler2 = this.c;
            am8.s(jobScheduler2);
            int schedule = jobScheduler2.schedule(build);
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            s56 s56Var = ppeVar3.J;
            if (schedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            s56Var.f(str, "[sgtm] Scion upload job scheduled with result");
            return;
        }
        ppe ppeVar4 = lteVar.f;
        lte.m(ppeVar4);
        ppeVar4.J.f(eub.A(c0), "[sgtm] Not eligible for Scion upload");
    }

    public final int c0() {
        boolean booleanValue;
        lte lteVar = (lte) this.a;
        Y();
        W();
        if (this.c != null) {
            Boolean k0 = lteVar.d.k0("google_analytics_sgtm_upload_enabled");
            if (k0 == null) {
                booleanValue = false;
            } else {
                booleanValue = k0.booleanValue();
            }
            if (booleanValue) {
                if (lteVar.r().F >= 119000) {
                    if (!l6f.s0(lteVar.a)) {
                        return 3;
                    }
                    if (!lteVar.p().e0()) {
                        return 5;
                    }
                    return 2;
                }
                return 6;
            }
            return 8;
        }
        return 7;
    }
}
