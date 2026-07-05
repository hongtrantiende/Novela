package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tz4  reason: default package */
/* loaded from: classes.dex */
public abstract class tz4 {
    public final Context a;
    public final String b;
    public final mu9 c;
    public final s6f d;
    public final xs e;
    public final jv f;
    public final Looper g;
    public final int h;
    public final qud i;
    public final kh5 j;
    public final yz4 k;

    public tz4(Context context, HiddenActivity hiddenActivity, s6f s6fVar, xs xsVar, sz4 sz4Var) {
        String str;
        am8.t(context, "Null context is not permitted.");
        am8.t(s6fVar, "Api must not be null.");
        am8.t(sz4Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        am8.t(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.b = str;
        this.c = i >= 31 ? new mu9(context.getAttributionSource()) : null;
        this.d = s6fVar;
        this.e = xsVar;
        this.g = sz4Var.b;
        jv jvVar = new jv(s6fVar, xsVar, str);
        this.f = jvVar;
        this.i = new qud(this);
        yz4 d = yz4.d(applicationContext);
        this.k = d;
        this.h = d.D.getAndIncrement();
        this.j = sz4Var.a;
        if (hiddenActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            sn6 fragment = mn6.getFragment((Activity) hiddenActivity);
            jud judVar = (jud) fragment.c(jud.class, "ConnectionlessLifecycleHelper");
            if (judVar == null) {
                Object obj = uz4.d;
                judVar = new jud(fragment, d);
            }
            judVar.e.add(jvVar);
            d.e(judVar);
        }
        ovd ovdVar = d.J;
        ovdVar.sendMessage(ovdVar.obtainMessage(7, this));
    }

    public final ij1 a() {
        ij1 ij1Var = new ij1(19, false);
        Set set = Collections.EMPTY_SET;
        if (((a00) ij1Var.b) == null) {
            ij1Var.b = new a00(0);
        }
        ((a00) ij1Var.b).addAll(set);
        Context context = this.a;
        ij1Var.d = context.getClass().getName();
        ij1Var.c = context.getPackageName();
        return ij1Var;
    }

    public final Task b(int i, uu5 uu5Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yz4 yz4Var = this.k;
        yz4Var.getClass();
        yz4Var.b(taskCompletionSource, uu5Var.b, this);
        vud vudVar = new vud(new hvd(i, uu5Var, taskCompletionSource, this.j), yz4Var.E.get(), this);
        ovd ovdVar = yz4Var.J;
        ovdVar.sendMessage(ovdVar.obtainMessage(4, vudVar));
        return taskCompletionSource.getTask();
    }
}
