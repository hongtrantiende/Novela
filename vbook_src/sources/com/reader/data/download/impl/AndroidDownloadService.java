package com.reader.data.download.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class AndroidDownloadService extends Service {
    public static boolean C;
    public final ye6 a;
    public final ye6 b;
    public final m41 c;
    public final mfb d;
    public final Object e;
    public final HashMap f;

    public AndroidDownloadService() {
        qi qiVar = new qi(this, 0);
        sk6 sk6Var = sk6.a;
        this.a = ipe.x(sk6Var, qiVar);
        this.b = ipe.x(sk6Var, new qi(this, 1));
        b9b b = rse.b();
        sw2 sw2Var = ab3.a;
        this.c = k27.a(nq2.C(b, ru2.c));
        this.d = new mfb(new ve(this, 2));
        this.e = new Object();
        this.f = new HashMap();
    }

    public static final void a(AndroidDownloadService androidDownloadService, String str) {
        synchronized (androidDownloadService.e) {
            try {
                if (androidDownloadService.f.containsKey(str)) {
                    w26 w26Var = (w26) androidDownloadService.f.remove(str);
                    if (w26Var != null) {
                        w26Var.cancel(null);
                    }
                    if (androidDownloadService.f.isEmpty()) {
                        androidDownloadService.stopSelf();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final xf3 b() {
        return (xf3) this.a.getValue();
    }

    public final li c() {
        return (li) this.d.getValue();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C = true;
        c().getClass();
        z87.v(this.c, null, null, new oi(this, (m42) null, 0), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b().b();
        li c = c();
        c.a.stopForeground(1);
        c.b.b.cancel(null, 100001);
        k27.n(this.c, null);
        C = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            m41 m41Var = this.c;
            if (hashCode != -1962111802) {
                if (hashCode != -1528813959) {
                    if (hashCode == 1614604406 && str.equals("com.reader.action.download.START") && (stringExtra3 = intent.getStringExtra("book_id")) != null) {
                        z87.v(m41Var, null, null, new pi(this, stringExtra3, intent.getIntExtra("start", 0), intent.getIntExtra("size", 0), intent.getBooleanExtra("from_last_read", false), null), 3);
                        return 2;
                    }
                } else if (str.equals("com.reader.action.download.RESUME") && (stringExtra2 = intent.getStringExtra("book_id")) != null) {
                    z87.v(m41Var, null, null, new n0(this, stringExtra2, null, 6), 3);
                    return 2;
                }
            } else if (str.equals("com.reader.action.download.CANCEL") && (stringExtra = intent.getStringExtra("book_id")) != null) {
                z87.v(m41Var, null, null, new da(this, stringExtra, (m42) null), 3);
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
    }
}
