package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x20  reason: default package */
/* loaded from: classes3.dex */
public final class x20 implements f20 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        boolean isTerminated;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object a = ((l20) ((t00) obj).b).a(n42Var);
                if (a == n82.a) {
                    return a;
                }
                return pvcVar;
            default:
                yeb yebVar = (yeb) obj;
                if (!(yebVar instanceof AutoCloseable)) {
                    yebVar = null;
                }
                if (yebVar != null && !(yebVar instanceof AutoCloseable)) {
                    if (yebVar instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) yebVar;
                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                                return pvcVar;
                            }
                            return pvcVar;
                        }
                        return pvcVar;
                    }
                    p1a.g();
                    return null;
                }
                return pvcVar;
        }
    }

    @Override // defpackage.f20
    public final Object b(int i, m42 m42Var) {
        switch (this.a) {
            case 0:
                Object b = ((l20) ((t00) this.b).b).b(i, m42Var);
                if (b != n82.a) {
                    return pvc.a;
                }
                return b;
            default:
                return iwe.p(this, i, (zz2) m42Var);
        }
    }

    @Override // defpackage.f20
    public final Object f(byte[] bArr, int i, int i2, n42 n42Var) {
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                Object f = ((l20) ((t00) obj).b).f(bArr, i, i2, n42Var);
                if (f == n82.a) {
                    return f;
                }
                return pvcVar;
            default:
                ((yeb) obj).write(bArr, i, i2);
                return pvcVar;
        }
    }
}
