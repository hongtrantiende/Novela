package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class LifecycleService extends Service implements un6 {
    public final yx9 a = new yx9(this);

    @Override // defpackage.un6
    public final xn6 k() {
        return (xn6) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        yx9 yx9Var = this.a;
        yx9Var.getClass();
        yx9Var.l(jn6.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        yx9 yx9Var = this.a;
        yx9Var.getClass();
        yx9Var.l(jn6.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        yx9 yx9Var = this.a;
        yx9Var.getClass();
        yx9Var.l(jn6.ON_STOP);
        yx9Var.l(jn6.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        yx9 yx9Var = this.a;
        yx9Var.getClass();
        yx9Var.l(jn6.ON_START);
        super.onStart(intent, i);
    }
}
