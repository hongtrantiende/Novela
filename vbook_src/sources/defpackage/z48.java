package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z48  reason: default package */
/* loaded from: classes.dex */
public final class z48 {
    public static String d;
    public static y48 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public z48(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            v48 v48Var = new v48(this.a.getPackageName(), i, notification);
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new y48(this.a.getApplicationContext());
                    }
                    g.b.obtainMessage(0, v48Var).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.cancel(null, i);
            return;
        }
        this.b.notify(null, i, notification);
    }
}
