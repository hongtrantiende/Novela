package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.fp9;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dp9  reason: default package */
/* loaded from: classes.dex */
public abstract class dp9 {
    public static void a(Activity activity, jn6 jn6Var) {
        jn6Var.getClass();
        if (activity instanceof un6) {
            xn6 k = ((un6) activity).k();
            if (k instanceof xn6) {
                k.d(jn6Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            fp9.a.Companion.getClass();
            ep9.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new fp9(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
