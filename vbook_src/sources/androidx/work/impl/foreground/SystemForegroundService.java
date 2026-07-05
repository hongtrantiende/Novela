package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService {
    public static final String e = r95.r("SystemFgService");
    public boolean b;
    public egb c;
    public NotificationManager d;

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        egb egbVar = new egb(getApplicationContext());
        this.c = egbVar;
        if (egbVar.E != null) {
            r95.n().j(egb.F, "A callback already exists.");
        } else {
            egbVar.E = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        String str = e;
        if (z) {
            r95.n().p(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.e();
            a();
            this.b = false;
        }
        if (intent != null) {
            egb egbVar = this.c;
            egbVar.getClass();
            String str2 = egb.F;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                r95 n = r95.n();
                n.p(str2, "Started foreground service " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                omd omdVar = egbVar.b;
                omdVar.a.execute(new bv4(egbVar, false, stringExtra, 11));
                egbVar.d(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                egbVar.d(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                r95 n2 = r95.n();
                n2.p(str2, "Stopping foreground work for " + intent);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                    lmd lmdVar = egbVar.a;
                    UUID fromString = UUID.fromString(stringExtra2);
                    lmdVar.getClass();
                    fromString.getClass();
                    r0f r0fVar = lmdVar.b.m;
                    r9a r9aVar = lmdVar.d.a;
                    r9aVar.getClass();
                    kve.y(r0fVar, "CancelWorkById", r9aVar, new t7(15, lmdVar, fromString));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                r95.n().p(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = egbVar.E;
                if (systemForegroundService != null) {
                    systemForegroundService.b = true;
                    r95.n().c(str, "Shutting down.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf(i2);
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }

    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
