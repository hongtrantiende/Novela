package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o92  reason: default package */
/* loaded from: classes.dex */
public final class o92 {
    public final Context a;
    public final wf2 b;
    public final s26 c;
    public final long d;
    public s6f e;
    public s6f f;
    public i92 g;
    public final al5 h;
    public final oe4 i;
    public final yc j;
    public final yc k;
    public final f92 l;
    public final q92 m;
    public final n07 n;
    public final ij1 o;

    public o92(qf4 qf4Var, al5 al5Var, q92 q92Var, wf2 wf2Var, yc ycVar, yc ycVar2, oe4 oe4Var, f92 f92Var, n07 n07Var, ij1 ij1Var) {
        this.b = wf2Var;
        qf4Var.a();
        this.a = qf4Var.a;
        this.h = al5Var;
        this.m = q92Var;
        this.j = ycVar;
        this.k = ycVar2;
        this.i = oe4Var;
        this.l = f92Var;
        this.n = n07Var;
        this.o = ij1Var;
        this.d = System.currentTimeMillis();
        this.c = new s26(8);
    }

    public final void a(tc0 tc0Var) {
        ij1.n();
        ij1.n();
        this.e.n();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.b(new l92(this));
                this.g.g();
                if (tc0Var.b().b.a) {
                    if (!this.g.d(tc0Var)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.g.h(((TaskCompletionSource) ((AtomicReference) tc0Var.i).get()).getTask());
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(tc0 tc0Var) {
        Future<?> submit = ((wa2) this.o.b).a.submit(new j92(this, tc0Var, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        ij1.n();
        try {
            s6f s6fVar = this.e;
            oe4 oe4Var = (oe4) s6fVar.b;
            oe4Var.getClass();
            if (!new File((File) oe4Var.d, (String) s6fVar.a).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
