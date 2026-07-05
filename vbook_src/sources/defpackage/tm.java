package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import com.reader.data.AndroidActionReceiver;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tm  reason: default package */
/* loaded from: classes3.dex */
public final class tm {
    public final Service a;
    public final z48 b;
    public boolean c;

    public tm(Service service) {
        this.a = service;
        this.b = new z48(service);
    }

    public final Notification a(String str) {
        Service service = this.a;
        o48 o48Var = new o48(service, "test_server_channel");
        o48Var.e = o48.c("Test Server");
        o48Var.f = o48.c(str);
        o48Var.w.icon = R.drawable.ic_cache;
        o48Var.d(2, true);
        gf gfVar = new gf(2, 8, null);
        Intent intent = new Intent(service, AndroidActionReceiver.class);
        intent.setAction("com.reader.action.test_server.STOP");
        PendingIntent broadcast = PendingIntent.getBroadcast(service, 100011, intent, 201326592);
        broadcast.getClass();
        o48Var.a(R.drawable.ic_close, (CharSequence) z87.C(gs3.a, gfVar), broadcast);
        Notification b = o48Var.b();
        b.getClass();
        return b;
    }

    public final void b() {
        if (!this.c) {
            int i = Build.VERSION.SDK_INT;
            Service service = this.a;
            if (i >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("test_server_channel", "Test Server", 2);
                NotificationManager notificationManager = (NotificationManager) service.getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            try {
                service.startForeground(100010, a("Starting"));
                this.c = true;
            } catch (Exception unused) {
            }
        }
    }
}
