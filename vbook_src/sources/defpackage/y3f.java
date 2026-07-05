package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y3f  reason: default package */
/* loaded from: classes.dex */
public final class y3f implements ServiceConnection {
    public final /* synthetic */ w6f C;
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final j2f e;
    public ComponentName f;

    public y3f(w6f w6fVar, j2f j2fVar) {
        this.C = w6fVar;
        this.e = j2fVar;
    }

    public final jz1 a(String str, Executor executor) {
        try {
            Intent a = j4e.a(this.C.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(ide.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                w6f w6fVar = this.C;
                tz1 tz1Var = w6fVar.d;
                Context context = w6fVar.b;
                j2f j2fVar = this.e;
                boolean d = tz1Var.d(context, str, a, this, 4225, executor);
                this.c = d;
                if (d) {
                    w6fVar.c.sendMessageDelayed(w6fVar.c.obtainMessage(1, j2fVar), w6fVar.f);
                    jz1 jz1Var = jz1.f;
                    StrictMode.setVmPolicy(vmPolicy);
                    return jz1Var;
                }
                this.b = 2;
                try {
                    w6fVar.d.c(w6fVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                jz1 jz1Var2 = new jz1(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return jz1Var2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (t1e e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        w6f w6fVar = this.C;
        synchronized (w6fVar.a) {
            try {
                w6fVar.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        w6f w6fVar = this.C;
        synchronized (w6fVar.a) {
            try {
                w6fVar.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                for (ServiceConnection serviceConnection : this.a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
