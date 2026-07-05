package defpackage;

import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v9d  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v9d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v9d(b60 b60Var, vq4 vq4Var, er2 er2Var) {
        this.a = 0;
        this.b = b60Var;
        this.c = vq4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        switch (this.a) {
            case 0:
                c04 c04Var = ((b60) this.b).b;
                String str = a2d.a;
                i04 i04Var = c04Var.a;
                i04Var.T = (vq4) this.c;
                ms2 ms2Var = i04Var.r;
                ms2Var.N(ms2Var.M(), 1017, new gs2(21));
                return;
            case 1:
                b60 b60Var = (b60) this.b;
                ar2 ar2Var = (ar2) this.c;
                synchronized (ar2Var) {
                }
                c04 c04Var2 = b60Var.b;
                String str2 = a2d.a;
                i04 i04Var2 = c04Var2.a;
                ms2 ms2Var2 = i04Var2.r;
                cd J = ms2Var2.J((e67) ms2Var2.d.e);
                ms2Var2.N(J, 1020, new q6(J, ar2Var, 10));
                i04Var2.T = null;
                return;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                rwa rwaVar = (rwa) ((j9b) this.b).c;
                rwaVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new v9d(3, rwaVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 3:
                rwa rwaVar2 = (rwa) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (rwaVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) rwaVar2.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            default:
                rnd rndVar = (rnd) this.b;
                xn6 xn6Var = (xn6) this.c;
                if (!rndVar.c) {
                    rndVar.d = xn6Var;
                    xn6Var.a(rndVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v9d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
