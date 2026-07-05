package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g92  reason: default package */
/* loaded from: classes.dex */
public final class g92 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ tc0 d;
    public final /* synthetic */ i92 e;

    public g92(i92 i92Var, long j, Throwable th, Thread thread, tc0 tc0Var) {
        this.e = i92Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = tc0Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.tasks.SuccessContinuation, java.lang.Object, mce] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        oe4 oe4Var;
        String str;
        long j = this.a;
        long j2 = j / 1000;
        i92 i92Var = this.e;
        String e = i92Var.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        i92Var.c.n();
        qu1 qu1Var = i92Var.m;
        qu1Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        qu1Var.y(this.b, this.c, "crash", new tx3(e, j2, ls3.a), true);
        try {
            oe4Var = i92Var.g;
            str = ".ae" + j;
            oe4Var.getClass();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        if (!new File((File) oe4Var.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        tc0 tc0Var = this.d;
        i92Var.b(false, tc0Var, false);
        i92Var.c(new n41().a, Boolean.FALSE);
        if (!i92Var.b.j()) {
            return Tasks.forResult(null);
        }
        ?? obj = new Object();
        obj.a = this;
        return ((TaskCompletionSource) ((AtomicReference) tc0Var.i).get()).getTask().onSuccessTask((wa2) i92Var.e.b, obj);
    }
}
