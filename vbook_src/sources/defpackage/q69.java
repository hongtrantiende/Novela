package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q69  reason: default package */
/* loaded from: classes.dex */
public final class q69 extends cs3 {
    final /* synthetic */ r69 this$0;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* renamed from: q69$a */
    /* loaded from: classes.dex */
    public static final class a extends cs3 {
        final /* synthetic */ r69 this$0;

        public a(r69 r69Var) {
            this.this$0 = r69Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            r69 r69Var = this.this$0;
            int i = r69Var.a + 1;
            r69Var.a = i;
            if (i == 1 && r69Var.d) {
                r69Var.f.d(jn6.ON_START);
                r69Var.d = false;
            }
        }
    }

    public q69(r69 r69Var) {
        this.this$0 = r69Var;
    }

    @Override // defpackage.cs3, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = fp9.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((fp9) findFragmentByTag).a = this.this$0.D;
        }
    }

    @Override // defpackage.cs3, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        r69 r69Var = this.this$0;
        int i = r69Var.b - 1;
        r69Var.b = i;
        if (i == 0) {
            Handler handler = r69Var.e;
            handler.getClass();
            handler.postDelayed(r69Var.C, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ff.w(activity, new a(this.this$0));
    }

    @Override // defpackage.cs3, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        r69 r69Var = this.this$0;
        int i = r69Var.a - 1;
        r69Var.a = i;
        if (i == 0 && r69Var.c) {
            r69Var.f.d(jn6.ON_STOP);
            r69Var.d = true;
        }
    }
}
