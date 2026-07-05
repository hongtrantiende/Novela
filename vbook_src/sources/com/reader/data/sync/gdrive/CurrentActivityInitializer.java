package com.reader.data.sync.gdrive;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class CurrentActivityInitializer implements gv5 {
    @Override // defpackage.gv5
    public final List a() {
        return ks3.a;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // defpackage.gv5
    public final Object b(Context context) {
        Application application;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        if (application != null) {
            WeakReference weakReference = zd2.a;
            application.registerActivityLifecycleCallbacks(new Object());
        }
        return pvc.a;
    }
}
