package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements qy3 {
    public static final String e = r95.r("SystemJobService");
    public lmd a;
    public final HashMap b = new HashMap();
    public final r18 c = new r18(2);
    public rwa d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        vs.k(hl5.n("Cannot invoke ", str, " on a background thread"));
    }

    public static hmd c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new hmd(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.qy3
    public final void b(hmd hmdVar, boolean z) {
        a("onExecuted");
        r95 n = r95.n();
        n.c(e, hmdVar.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(hmdVar);
        this.c.b(hmdVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            lmd b = lmd.b(getApplicationContext());
            this.a = b;
            v69 v69Var = b.f;
            this.d = new rwa(v69Var, b.d);
            v69Var.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                r95.n().s(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        lmd lmdVar = this.a;
        if (lmdVar != null) {
            v69 v69Var = lmdVar.f;
            synchronized (v69Var.k) {
                v69Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        lmd lmdVar = this.a;
        String str = e;
        if (lmdVar == null) {
            r95.n().c(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        hmd c = c(jobParameters);
        if (c == null) {
            r95.n().j(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.b;
        if (hashMap.containsKey(c)) {
            r95 n = r95.n();
            n.c(str, "Job is already being executed by SystemJobService: " + c);
            return false;
        }
        r95 n2 = r95.n();
        n2.c(str, "onStartJob for " + c);
        hashMap.put(c, jobParameters);
        gq4 gq4Var = new gq4();
        if (jobParameters.getTriggeredContentUris() != null) {
            gq4Var.b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            gq4Var.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ru.q(jobParameters);
        }
        this.d.t(this.c.e(c), gq4Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        a("onStopJob");
        if (this.a == null) {
            r95.n().c(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        hmd c = c(jobParameters);
        if (c == null) {
            r95.n().j(e, "WorkSpec id not found!");
            return false;
        }
        r95 n = r95.n();
        String str = e;
        n.c(str, "onStopJob for " + c);
        this.b.remove(c);
        qya b = this.c.b(c);
        if (b != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = ih.n(jobParameters);
            } else {
                i = -512;
            }
            rwa rwaVar = this.d;
            rwaVar.getClass();
            rwaVar.u(b, i);
        }
        v69 v69Var = this.a.f;
        String str2 = c.a;
        synchronized (v69Var.k) {
            contains = v69Var.i.contains(str2);
        }
        return !contains;
    }
}
