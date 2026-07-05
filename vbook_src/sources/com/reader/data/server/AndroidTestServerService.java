package com.reader.data.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class AndroidTestServerService extends Service {
    public static final cza d;
    public static final cza e;
    public final ye6 a = ipe.x(sk6.a, new vm(this, 0));
    public final mfb b = new mfb(new ve(this, 7));
    public final m41 c;

    static {
        cza a = dza.a(kaa.a);
        d = a;
        e = a;
    }

    public AndroidTestServerService() {
        b9b b = rse.b();
        sw2 sw2Var = ab3.a;
        this.c = k27.a(nq2.C(b, ru2.c));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((tm) this.b.getValue()).b();
        z87.v(this.c, null, null, new um(this, null, 0), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        cza czaVar = d;
        czaVar.getClass();
        czaVar.n(null, kaa.a);
        tm tmVar = (tm) this.b.getValue();
        tmVar.a.stopForeground(1);
        tmVar.b.b.cancel(null, 100010);
        z87.v(this.c, null, null, new um(this, null, 1), 3);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        Integer num;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == 872976650 && str.equals("com.reader.action.test_server.START")) {
            ((tm) this.b.getValue()).b();
            String stringExtra = intent.getStringExtra("extra_port");
            if (stringExtra != null) {
                num = r4b.R(10, stringExtra);
            } else {
                num = null;
            }
            if (num != null) {
                z87.v(this.c, null, null, new pf(this, num.intValue(), (m42) null, 1), 3);
                return 2;
            }
            return 2;
        }
        return 2;
    }
}
