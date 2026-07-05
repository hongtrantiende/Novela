package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c36  reason: default package */
/* loaded from: classes.dex */
public abstract class c36 {
    public static final String a = r95.r("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT >= 34) {
            return k4.h(jobScheduler);
        }
        return jobScheduler;
    }
}
