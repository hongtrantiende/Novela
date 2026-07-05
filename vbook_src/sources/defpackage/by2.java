package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: by2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class by2 implements iy2, lnc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ by2(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
        this.d = obj3;
    }

    @Override // defpackage.iy2
    public mm9 c(int i, ajc ajcVar, int[] iArr) {
        ly2 ly2Var = (ly2) this.b;
        gy2 gy2Var = (gy2) this.c;
        ly2Var.getClass();
        ay2 ay2Var = new ay2(ly2Var, gy2Var);
        int i2 = ((int[]) this.d)[i];
        ls5 i3 = qs5.i();
        for (int i4 = 0; i4 < ajcVar.a; i4++) {
            i3.b(new cy2(i, ajcVar, i4, gy2Var, iArr[i4], this.a, ay2Var, i2));
        }
        return i3.g();
    }

    @Override // defpackage.lnc
    public void e(Exception exc) {
        hp9 hp9Var = (hp9) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        ya0 ya0Var = (ya0) this.d;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ex2(23, hp9Var, countDownLatch)).start();
            ExecutorService executorService = b2d.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        j = nanoTime - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(ya0Var);
    }
}
