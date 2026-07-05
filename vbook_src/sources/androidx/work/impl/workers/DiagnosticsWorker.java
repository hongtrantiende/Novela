package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final jr6 c() {
        lmd b = lmd.b(this.a);
        WorkDatabase workDatabase = b.c;
        workDatabase.getClass();
        bnd w = workDatabase.w();
        qmd u = workDatabase.u();
        dnd x = workDatabase.x();
        igb t = workDatabase.t();
        b.b.d.getClass();
        List list = (List) gae.l(w.a, true, false, new th(System.currentTimeMillis() - 86400000, 27));
        fu9 fu9Var = w.a;
        List list2 = (List) gae.l(fu9Var, true, false, new x8d(12));
        List list3 = (List) gae.l(fu9Var, true, false, new x8d(16));
        if (!list.isEmpty()) {
            r95 n = r95.n();
            String str = r53.a;
            n.p(str, "Recently completed work:\n\n");
            r95.n().p(str, r53.a(u, x, t, list));
        }
        if (!list2.isEmpty()) {
            r95 n2 = r95.n();
            String str2 = r53.a;
            n2.p(str2, "Running work:\n\n");
            r95.n().p(str2, r53.a(u, x, t, list2));
        }
        if (!list3.isEmpty()) {
            r95 n3 = r95.n();
            String str3 = r53.a;
            n3.p(str3, "Enqueued work:\n\n");
            r95.n().p(str3, r53.a(u, x, t, list3));
        }
        return new jr6(tf2.b);
    }
}
