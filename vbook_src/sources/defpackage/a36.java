package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;
import androidx.core.app.JobIntentService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a36  reason: default package */
/* loaded from: classes.dex */
public final class a36 extends JobServiceEngine {
    public final JobIntentService a;
    public final Object b;

    public a36(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.b = new Object();
        this.a = jobIntentService;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.a.getClass();
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.a.getClass();
        throw null;
    }
}
