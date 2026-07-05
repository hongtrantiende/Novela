package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: egb  reason: default package */
/* loaded from: classes.dex */
public final class egb implements vb8, qy3 {
    public static final String F = r95.r("SystemFgDispatcher");
    public final HashMap C;
    public final hy D;
    public SystemForegroundService E;
    public final lmd a;
    public final omd b;
    public final Object c = new Object();
    public hmd d;
    public final LinkedHashMap e;
    public final HashMap f;

    public egb(Context context) {
        lmd b = lmd.b(context);
        this.a = b;
        this.b = b.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.C = new HashMap();
        this.f = new HashMap();
        this.D = new hy(b.j);
        b.f.a(this);
    }

    public static Intent c(Context context, hmd hmdVar, jq4 jq4Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", hmdVar.a);
        intent.putExtra("KEY_GENERATION", hmdVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", jq4Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jq4Var.b);
        intent.putExtra("KEY_NOTIFICATION", jq4Var.c);
        return intent;
    }

    @Override // defpackage.vb8
    public final void a(ymd ymdVar, d12 d12Var) {
        if (d12Var instanceof c12) {
            String str = ymdVar.a;
            r95 n = r95.n();
            n.c(F, "Constraints unmet for WorkSpec " + str);
            hmd s = dxe.s(ymdVar);
            int i = ((c12) d12Var).a;
            lmd lmdVar = this.a;
            omd omdVar = lmdVar.d;
            omdVar.a.execute(new n0b(lmdVar.f, new qya(s), true, i));
        }
    }

    @Override // defpackage.qy3
    public final void b(hmd hmdVar, boolean z) {
        w26 w26Var;
        Map.Entry entry;
        synchronized (this.c) {
            try {
                if (((ymd) this.f.remove(hmdVar)) != null) {
                    w26Var = (w26) this.C.remove(hmdVar);
                } else {
                    w26Var = null;
                }
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jq4 jq4Var = (jq4) this.e.remove(hmdVar);
        if (hmdVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.d = (hmd) entry.getKey();
                if (this.E != null) {
                    jq4 jq4Var2 = (jq4) entry.getValue();
                    SystemForegroundService systemForegroundService = this.E;
                    int i = jq4Var2.a;
                    int i2 = jq4Var2.b;
                    Notification notification = jq4Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        ff.C(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        ff.B(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.E.d.cancel(jq4Var2.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.E;
        if (jq4Var != null && systemForegroundService2 != null) {
            r95.n().c(F, "Removing Notification (id: " + jq4Var.a + ", workSpecId: " + hmdVar + ", notificationType: " + jq4Var.b);
            systemForegroundService2.d.cancel(jq4Var.a);
        }
    }

    public final void d(Intent intent) {
        if (this.E != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            hmd hmdVar = new hmd(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            r95 n = r95.n();
            StringBuilder r = s21.r("Notifying with (id:", intExtra, ", workSpecId: ", stringExtra, ", notificationType :");
            r.append(intExtra2);
            r.append(")");
            n.c(F, r.toString());
            if (notification != null) {
                jq4 jq4Var = new jq4(intExtra, notification, intExtra2);
                LinkedHashMap linkedHashMap = this.e;
                linkedHashMap.put(hmdVar, jq4Var);
                jq4 jq4Var2 = (jq4) linkedHashMap.get(this.d);
                if (jq4Var2 == null) {
                    this.d = hmdVar;
                } else {
                    this.E.d.notify(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            i |= ((jq4) entry.getValue()).b;
                        }
                        jq4Var = new jq4(jq4Var2.a, jq4Var2.c, i);
                    } else {
                        jq4Var = jq4Var2;
                    }
                }
                SystemForegroundService systemForegroundService = this.E;
                int i2 = jq4Var.a;
                int i3 = jq4Var.b;
                Notification notification2 = jq4Var.c;
                systemForegroundService.getClass();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    ff.C(systemForegroundService, i2, notification2, i3);
                    return;
                } else if (i4 >= 29) {
                    ff.B(systemForegroundService, i2, notification2, i3);
                    return;
                } else {
                    systemForegroundService.startForeground(i2, notification2);
                    return;
                }
            }
            vs.m("Notification passed in the intent was null.");
            return;
        }
        vs.k("handleNotify was called on the destroyed dispatcher");
    }

    public final void e() {
        this.E = null;
        synchronized (this.c) {
            try {
                for (w26 w26Var : this.C.values()) {
                    w26Var.cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v69 v69Var = this.a.f;
        synchronized (v69Var.k) {
            v69Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        r95 n = r95.n();
        n.p(F, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.e.entrySet()) {
            if (((jq4) entry.getValue()).b == i2) {
                lmd lmdVar = this.a;
                omd omdVar = lmdVar.d;
                omdVar.a.execute(new n0b(lmdVar.f, new qya((hmd) entry.getKey()), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.E;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            r95.n().c(SystemForegroundService.e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
