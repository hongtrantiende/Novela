package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hvd  reason: default package */
/* loaded from: classes.dex */
public final class hvd extends tud {
    public final uu5 b;
    public final TaskCompletionSource c;
    public final kh5 d;

    public hvd(int i, uu5 uu5Var, TaskCompletionSource taskCompletionSource, kh5 kh5Var) {
        super(i);
        this.c = taskCompletionSource;
        this.b = uu5Var;
        this.d = kh5Var;
        if (i == 2 && uu5Var.a) {
            vs.m("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.ivd
    public final void a(Status status) {
        this.d.getClass();
        this.c.trySetException(gue.p(status));
    }

    @Override // defpackage.ivd
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // defpackage.ivd
    public final void c(rwa rwaVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        TaskCompletionSource taskCompletionSource = this.c;
        ((Map) rwaVar.c).put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new hvc(rwaVar, taskCompletionSource));
    }

    @Override // defpackage.ivd
    public final void d(oud oudVar) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            uu5 uu5Var = this.b;
            ((gn9) ((uu5) uu5Var.d).c).accept(oudVar.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(ivd.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // defpackage.tud
    public final mb4[] f(oud oudVar) {
        return (mb4[]) this.b.c;
    }

    @Override // defpackage.tud
    public final boolean g(oud oudVar) {
        return this.b.a;
    }

    @Override // defpackage.tud
    public final int h(oud oudVar) {
        return this.b.b;
    }
}
