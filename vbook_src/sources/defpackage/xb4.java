package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xb4  reason: default package */
/* loaded from: classes.dex */
public final class xb4 extends tz4 {
    public static final s6f l = new s6f("Fido.FIDO2_API", new hud(11), new tn3(16));
    public static final s6f m = new s6f("ClientNotification.API", new hud(2), new tn3(16));
    public static final s6f n = new s6f("ClientTelemetry.API", new hud(3), new tn3(16));
    public static final s6f o = new s6f("CloudMessaging.API", new hud(9), new tn3(16));
    public static int p = 1;

    public Task c(elb elbVar) {
        uu5 b = uu5.b();
        b.d = new mb4[]{c16.e};
        b.a = false;
        b.c = new g99(elbVar, 15);
        return b(2, b.a());
    }

    public synchronized int d() {
        int i;
        try {
            i = p;
            if (i == 1) {
                Context context = this.a;
                uz4 uz4Var = uz4.e;
                int c = uz4Var.c(context, 12451000);
                if (c == 0) {
                    i = 4;
                    p = 4;
                } else if (uz4Var.a(context, null, c) == null && zm3.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i = 3;
                    p = 3;
                } else {
                    i = 2;
                    p = 2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
