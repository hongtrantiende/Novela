package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lgb  reason: default package */
/* loaded from: classes.dex */
public final class lgb {
    public static final String d = r95.r("SystemJobInfoConverter");
    public final ComponentName a;
    public final bl8 b;
    public final boolean c;

    public lgb(Context context, bl8 bl8Var, boolean z) {
        this.b = bl8Var;
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.c = z;
    }

    public final JobInfo a(ymd ymdVar, int i) {
        int i2;
        Object[] objArr;
        String str;
        int i3;
        w02 w02Var = ymdVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", ymdVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", ymdVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", ymdVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = w02Var.c;
        Set<v02> set = w02Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = w02Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest a = w02Var.a();
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i4 >= 28 && a != null) {
            extras.getClass();
            extras.setRequiredNetwork(a);
        } else {
            c28 c28Var = w02Var.a;
            if (i4 >= 30 && c28Var == c28.f) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int ordinal = c28Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4 || i4 < 26) {
                                    r95.n().c(d, "API version too low. Cannot convert network type value " + c28Var);
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!z2) {
            if (ymdVar.l == ng0.b) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            extras.setBackoffCriteria(ymdVar.m, i3);
        }
        long a2 = ymdVar.a();
        this.b.getClass();
        long max = Math.max(a2 - System.currentTimeMillis(), 0L);
        if (i4 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!ymdVar.q && this.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (v02 v02Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(v02Var.a, v02Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(w02Var.g);
            extras.setTriggerContentMaxDelay(w02Var.h);
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            extras.setRequiresBatteryNotLow(w02Var.e);
            extras.setRequiresStorageNotLow(w02Var.f);
        }
        if (ymdVar.k > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (max > 0) {
            z3 = true;
        }
        if (i5 >= 31 && ymdVar.q && objArr == null && !z3) {
            extras.setExpedited(true);
        }
        if (i5 >= 35 && (str = ymdVar.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
