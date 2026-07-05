package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm  reason: default package */
/* loaded from: classes.dex */
public final class sm implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ vz0 b;

    public sm(vz0 vz0Var, rj9 rj9Var) {
        this.b = vz0Var;
        pj9 pj9Var = rj9Var.a;
        u4 u4Var = mo5.a;
        Object obj = pj9Var.b.n.a.get(mo5.d);
        this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.a;
        if (d != 1.0d) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            vz0 vz0Var = this.b;
            rj9 rj9Var = (rj9) ((WeakReference) vz0Var.b).get();
            if (rj9Var != null) {
                tj9 d2 = rj9Var.d();
                if (d2 != null) {
                    synchronized (d2.c) {
                        j = d2.a.a;
                    }
                    d2.d((long) (d * j));
                    return;
                }
                return;
            }
            vz0Var.b();
        }
    }

    public final void b(Context context) {
        long j;
        if (this.a != 1.0d) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            vz0 vz0Var = this.b;
            rj9 rj9Var = (rj9) ((WeakReference) vz0Var.b).get();
            if (rj9Var != null) {
                tj9 d = rj9Var.d();
                if (d != null) {
                    synchronized (d.c) {
                        j = d.a.a;
                    }
                    d.d(j);
                    return;
                }
                return;
            }
            vz0Var.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
