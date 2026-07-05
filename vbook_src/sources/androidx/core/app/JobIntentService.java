package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    public static final HashMap b = new HashMap();
    public a36 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a36 a36Var = this.a;
        if (a36Var != null) {
            return a36Var.a();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a = new a36(this);
            return;
        }
        this.a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = b;
        if (((z26) hashMap.get(componentName)) == null) {
            if (i < 26) {
                Object obj = new Object();
                getApplicationContext();
                PowerManager powerManager = (PowerManager) getSystemService("power");
                powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
                powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
                hashMap.put(componentName, obj);
                return;
            }
            vs.m("Can't be here without a job id");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
