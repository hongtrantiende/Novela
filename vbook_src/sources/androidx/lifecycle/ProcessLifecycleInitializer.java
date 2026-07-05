package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements gv5 {
    @Override // defpackage.gv5
    public final List a() {
        return ks3.a;
    }

    @Override // defpackage.gv5
    public final Object b(Context context) {
        context.getClass();
        ij1 C = ij1.C(context);
        C.getClass();
        if (((HashSet) C.c).contains(ProcessLifecycleInitializer.class)) {
            if (!on6.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new nn6());
            }
            r69 r69Var = r69.E;
            r69Var.getClass();
            r69Var.e = new Handler();
            r69Var.f.d(jn6.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q69(r69Var));
            return r69Var;
        }
        vs.k("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
