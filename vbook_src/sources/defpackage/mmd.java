package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mmd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mmd extends xu4 implements pu4 {
    public static final mmd a = new xu4(6, nmd.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        xy1 xy1Var = (xy1) obj2;
        omd omdVar = (omd) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        ojc ojcVar = (ojc) obj5;
        v69 v69Var = (v69) obj6;
        context.getClass();
        xy1Var.getClass();
        omdVar.getClass();
        workDatabase.getClass();
        ojcVar.getClass();
        v69Var.getClass();
        String str = g0a.a;
        mgb mgbVar = new mgb(context, workDatabase, xy1Var);
        jh8.a(context, SystemJobService.class, true);
        r95.n().c(g0a.a, "Created SystemJobScheduler and enabled SystemJobService");
        return tl1.B(mgbVar, new a25(context, xy1Var, ojcVar, v69Var, new rwa(v69Var, omdVar), omdVar));
    }
}
