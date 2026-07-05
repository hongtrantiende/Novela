package defpackage;

import android.app.ActivityManager;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j0f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j0f implements c9b {
    public static final /* synthetic */ j0f b = new j0f(0);
    public static final /* synthetic */ j0f c = new j0f(1);
    public final /* synthetic */ int a;

    public /* synthetic */ j0f(int i) {
        this.a = i;
    }

    @Override // defpackage.c9b
    public final Object get() {
        switch (this.a) {
            case 0:
                Object obj = a0f.j;
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(zp9.b);
                if (newSingleThreadScheduledExecutor instanceof hr7) {
                    return (hr7) newSingleThreadScheduledExecutor;
                }
                return new hr7(newSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z = true;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return new Boolean(z);
        }
    }
}
