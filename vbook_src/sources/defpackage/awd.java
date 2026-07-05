package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: awd  reason: default package */
/* loaded from: classes.dex */
public final class awd {
    public ks6 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile c30 g;
    public volatile c30 h;
    public final Semaphore i;
    public final Set j;

    public awd(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z = this.b;
            if (!z) {
                if (z) {
                    c();
                } else {
                    this.e = true;
                }
            }
            c30 c30Var = this.h;
            c30 c30Var2 = this.g;
            if (c30Var != null) {
                c30Var2.getClass();
                this.g = null;
                return;
            }
            c30Var2.getClass();
            c30 c30Var3 = this.g;
            c30Var3.c.set(true);
            if (c30Var3.a.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.g != null) {
            this.g.getClass();
            if (this.f == null) {
                this.f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            c30 c30Var = this.g;
            Executor executor = this.f;
            if (c30Var.b != 1) {
                int C = a82.C(c30Var.b);
                if (C != 1) {
                    if (C != 2) {
                        vs.k("We should never reach this state");
                        return;
                    } else {
                        vs.k("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        return;
                    }
                }
                vs.k("Cannot execute task: the task is already running.");
                return;
            }
            c30Var.b = 2;
            executor.execute(c30Var.a);
        }
    }

    public final void c() {
        a();
        this.g = new c30(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            try {
                this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((qud) it.next()).getClass();
        cp8.q();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
