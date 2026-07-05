package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mgb  reason: default package */
/* loaded from: classes.dex */
public final class mgb implements d0a {
    public static final String f = r95.r("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final lgb c;
    public final WorkDatabase d;
    public final xy1 e;

    public mgb(Context context, WorkDatabase workDatabase, xy1 xy1Var) {
        JobScheduler a = c36.a(context);
        lgb lgbVar = new lgb(context, xy1Var.d, xy1Var.l);
        this.a = context;
        this.b = a;
        this.c = lgbVar;
        this.d = workDatabase;
        this.e = xy1Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            r95.n().k(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = c36.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            r95.n().k(c36.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static hmd f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new hmd(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.d0a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.d0a
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList b = b(context, jobScheduler);
        if (b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = b.size();
            int i = 0;
            while (i < size) {
                Object obj = b.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                hmd f2 = f(jobInfo);
                if (f2 != null && str.equals(f2.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                a(jobScheduler, ((Integer) obj2).intValue());
            }
            igb t = this.d.t();
            t.getClass();
            str.getClass();
            gae.l(t.a, false, true, new a23(str, 14));
        }
    }

    @Override // defpackage.d0a
    public final void e(ymd... ymdVarArr) {
        int intValue;
        xy1 xy1Var = this.e;
        WorkDatabase workDatabase = this.d;
        final n07 n07Var = new n07(workDatabase);
        for (ymd ymdVar : ymdVarArr) {
            workDatabase.b();
            try {
                bnd w = workDatabase.w();
                String str = ymdVar.a;
                ymd e = w.e(str);
                String str2 = f;
                if (e == null) {
                    r95.n().s(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (e.b != jmd.a) {
                    r95.n().s(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    hmd s = dxe.s(ymdVar);
                    int i = s.b;
                    String str3 = s.a;
                    igb t = workDatabase.t();
                    t.getClass();
                    str3.getClass();
                    hgb hgbVar = (hgb) gae.l(t.a, true, false, new bl(str3, i, 4));
                    if (hgbVar != null) {
                        intValue = hgbVar.c;
                    } else {
                        xy1Var.getClass();
                        final int i2 = xy1Var.i;
                        Object n = ((WorkDatabase) n07Var.b).n(new Callable() { // from class: zk5
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i3;
                                int i4;
                                WorkDatabase workDatabase2 = (WorkDatabase) n07.this.b;
                                Long a = workDatabase2.s().a("next_job_scheduler_id");
                                int i5 = 0;
                                if (a != null) {
                                    i3 = (int) a.longValue();
                                } else {
                                    i3 = 0;
                                }
                                if (i3 == Integer.MAX_VALUE) {
                                    i4 = 0;
                                } else {
                                    i4 = i3 + 1;
                                }
                                w39 s2 = workDatabase2.s();
                                gae.l(s2.a, false, true, new fl7(24, s2, new v39("next_job_scheduler_id", Long.valueOf(i4))));
                                if (i3 >= 0 && i3 <= i2) {
                                    i5 = i3;
                                } else {
                                    w39 s3 = workDatabase2.s();
                                    gae.l(s3.a, false, true, new fl7(24, s3, new v39("next_job_scheduler_id", 1L)));
                                }
                                return Integer.valueOf(i5);
                            }
                        });
                        n.getClass();
                        intValue = ((Number) n).intValue();
                    }
                    if (hgbVar == null) {
                        hgb hgbVar2 = new hgb(str3, i, intValue);
                        igb t2 = workDatabase.t();
                        t2.getClass();
                        gae.l(t2.a, false, true, new cn9(17, t2, hgbVar2));
                    }
                    g(ymdVar, intValue);
                    workDatabase.p();
                }
            } finally {
                workDatabase.l();
            }
        }
    }

    public final void g(ymd ymdVar, int i) {
        int i2;
        ArrayList b;
        List<JobInfo> list;
        int i3;
        String str;
        JobInfo a = this.c.a(ymdVar, i);
        r95 n = r95.n();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str2 = ymdVar.a;
        sb.append(str2);
        sb.append("Job ID ");
        sb.append(i);
        String sb2 = sb.toString();
        String str3 = f;
        n.c(str3, sb2);
        int i4 = 0;
        try {
            if (this.b.schedule(a) == 0) {
                r95.n().s(str3, "Unable to schedule work ID " + str2);
                if (ymdVar.q && ymdVar.r == mf8.a) {
                    ymdVar.q = false;
                    r95.n().c(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(ymdVar, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = c36.a;
            Context context = this.a;
            context.getClass();
            WorkDatabase workDatabase = this.d;
            workDatabase.getClass();
            xy1 xy1Var = this.e;
            xy1Var.getClass();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                i2 = 150;
            } else {
                i2 = 100;
            }
            int size = ((List) gae.l(workDatabase.w().a, true, false, new x8d(11))).size();
            String str5 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i5 >= 34) {
                JobScheduler a2 = c36.a(context);
                String str6 = null;
                try {
                    list = a2.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable th) {
                    r95.n().k(c36.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList b2 = b(context, a2);
                    if (b2 != null) {
                        i3 = list.size() - b2.size();
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        str = null;
                    } else {
                        str = i3 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList b3 = b(context, (JobScheduler) systemService);
                    if (b3 != null) {
                        i4 = b3.size();
                    }
                    if (i4 != 0) {
                        str6 = i4 + " from WorkManager in the default namespace";
                    }
                    str5 = sl1.i0(b00.l0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str6}), ",\n", null, null, null, 62);
                }
            } else {
                if (b(context, c36.a(context)) != null) {
                    str5 = b.size() + " jobs from WorkManager";
                }
            }
            StringBuilder r = s21.r("JobScheduler ", i2, " job limit exceeded.\nIn JobScheduler there are ", str5, ".\nThere are ");
            r.append(size);
            r.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String p = hl5.p(r, xy1Var.k, '.');
            r95.n().j(str3, p);
            throw new IllegalStateException(p, e);
        } catch (Throwable th2) {
            r95.n().k(str3, "Unable to schedule " + ymdVar, th2);
        }
    }
}
