package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hp9  reason: default package */
/* loaded from: classes.dex */
public final class hp9 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final jnc h;
    public final s26 i;
    public int j;
    public long k;

    public hp9(jnc jncVar, zda zdaVar, s26 s26Var) {
        double d = zdaVar.d;
        double d2 = zdaVar.e;
        this.a = d;
        this.b = d2;
        this.c = zdaVar.f * 1000;
        this.h = jncVar;
        this.i = s26Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        int max;
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        if (size == this.e) {
            max = Math.min(100, i + currentTimeMillis);
        } else {
            max = Math.max(0, i - currentTimeMillis);
        }
        if (this.j != max) {
            this.j = max;
            this.k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(ya0 ya0Var, TaskCompletionSource taskCompletionSource) {
        boolean z;
        String str = "Sending report through Google DataTransport: " + ya0Var.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.h.a(new ic0(ya0Var.a, c69.c, null), new by2(z, this, taskCompletionSource, ya0Var));
    }
}
