package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d61 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lmd b;

    public /* synthetic */ d61(lmd lmdVar, int i) {
        this.a = i;
        this.b = lmdVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lmd lmdVar = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = lmdVar.c;
                workDatabase.getClass();
                workDatabase.o(new bn(2, workDatabase, "book_update_work", lmdVar));
                g0a.b(lmdVar.b, workDatabase, lmdVar.e);
                return pvcVar;
            default:
                WorkDatabase workDatabase2 = lmdVar.c;
                Context context = lmdVar.a;
                String str = mgb.f;
                if (Build.VERSION.SDK_INT >= 34) {
                    c36.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList b = mgb.b(context, jobScheduler);
                if (b != null && !b.isEmpty()) {
                    int size = b.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = b.get(i2);
                        i2++;
                        mgb.a(jobScheduler, ((JobInfo) obj).getId());
                    }
                }
                ((Number) gae.l(workDatabase2.w().a, false, true, new x8d(17))).intValue();
                g0a.b(lmdVar.b, workDatabase2, lmdVar.e);
                return pvcVar;
        }
    }
}
