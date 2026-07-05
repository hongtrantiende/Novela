package defpackage;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz6  reason: default package */
/* loaded from: classes.dex */
public final class uz6 {
    public final mfb a = new mfb(new qx6(this));

    public final Object a(String str, n42 n42Var) {
        boolean z;
        Task task;
        boolean z2 = true;
        f61 f61Var = new f61(1, w92.t(n42Var));
        f61Var.u();
        qb6 qb6Var = (qb6) ((ob6) this.a.getValue());
        qb6Var.getClass();
        am8.t(str, "Text can not be null");
        dne dneVar = (dne) qb6Var.e.get();
        if (dneVar != null) {
            z = true;
        } else {
            z = false;
        }
        am8.u("LanguageIdentification has been closed", z);
        boolean z3 = dneVar.c.get();
        Executor executor = qb6Var.d;
        lge lgeVar = new lge(qb6Var, dneVar, str, !z3);
        CancellationToken token = qb6Var.f.getToken();
        if (dneVar.b.get() <= 0) {
            z2 = false;
        }
        am8.v(z2);
        if (token.isCancellationRequested()) {
            task = Tasks.forCanceled();
        } else {
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
            dneVar.a.j(new dve(dneVar, token, cancellationTokenSource, lgeVar, taskCompletionSource, 3), new r9a(executor, token, cancellationTokenSource, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        task.addOnSuccessListener(new fz4(new tz6(f61Var, 0))).addOnFailureListener(new n07(f61Var, 24));
        return f61Var.s();
    }
}
