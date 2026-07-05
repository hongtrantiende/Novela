package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r5f  reason: default package */
/* loaded from: classes.dex */
public final class r5f implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public hvc c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ vdf f;

    public r5f(vdf vdfVar) {
        this.f = vdfVar;
        Handler handler = new Handler(Looper.getMainLooper(), new a4f(this, 0));
        Looper.getMainLooper();
        this.b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(e8f e8fVar) {
        boolean z;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.d.add(e8fVar);
                ((ScheduledExecutorService) this.f.d).execute(new ive(this, 1));
                return true;
            }
            this.d.add(e8fVar);
            return true;
        }
        this.d.add(e8fVar);
        if (this.a == 0) {
            z = true;
        } else {
            z = false;
        }
        am8.v(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            tz1 b = tz1.b();
            vdf vdfVar = this.f;
            if (!b.a((Context) vdfVar.c, intent, this, 1)) {
                b("Unable to bind to service");
            } else {
                ((ScheduledExecutorService) vdfVar.d).schedule(new ive(this, 0), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            c("Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.a = 4;
                tz1.b().c((Context) this.f.c, this);
                e60 e60Var = new e60(27, str, securityException);
                ArrayDeque arrayDeque = this.d;
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((e8f) it.next()).c(e60Var);
                }
                arrayDeque.clear();
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.e;
                    if (i2 < sparseArray.size()) {
                        ((e8f) sparseArray.valueAt(i2)).c(e60Var);
                        i2++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                tz1.b().c((Context) this.f.c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new bv4(23, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new ive(this, 2));
    }
}
