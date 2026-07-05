package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jq7  reason: default package */
/* loaded from: classes.dex */
public final class jq7 extends FutureTask {
    public final /* synthetic */ c30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq7(c30 c30Var, iq7 iq7Var) {
        super(iq7Var);
        this.a = c30Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        c30 c30Var = this.a;
        AtomicBoolean atomicBoolean = c30Var.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                c30Var.a(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                c30Var.a(null);
            }
        } catch (ExecutionException e2) {
            cp8.p("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            cp8.p("An error occurred while executing doInBackground()", th);
        }
    }
}
