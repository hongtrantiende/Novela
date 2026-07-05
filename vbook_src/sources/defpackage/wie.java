package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wie  reason: default package */
/* loaded from: classes.dex */
public final class wie implements ServiceConnection {
    public final int a;
    public final /* synthetic */ rh0 b;

    public wie(rh0 rh0Var, int i) {
        this.b = rh0Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gxd gxdVar;
        int i;
        int i2;
        rh0 rh0Var = this.b;
        if (iBinder == null) {
            synchronized (rh0Var.g) {
                i = rh0Var.n;
            }
            if (i == 3) {
                rh0Var.v = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            lae laeVar = rh0Var.f;
            laeVar.sendMessage(laeVar.obtainMessage(i2, rh0Var.x.get(), 16));
            return;
        }
        synchronized (rh0Var.h) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof gxd)) {
                    gxdVar = (gxd) queryLocalInterface;
                } else {
                    gxdVar = new gxd(iBinder);
                }
                rh0Var.i = gxdVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        rh0 rh0Var2 = this.b;
        int i3 = this.a;
        rh0Var2.getClass();
        ene eneVar = new ene(rh0Var2, 0, null);
        lae laeVar2 = rh0Var2.f;
        laeVar2.sendMessage(laeVar2.obtainMessage(7, i3, -1, eneVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        rh0 rh0Var = this.b;
        synchronized (rh0Var.h) {
            rh0Var.i = null;
        }
        rh0 rh0Var2 = this.b;
        int i = this.a;
        lae laeVar = rh0Var2.f;
        laeVar.sendMessage(laeVar.obtainMessage(6, i, 1));
    }
}
