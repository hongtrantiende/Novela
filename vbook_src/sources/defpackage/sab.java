package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sab  reason: default package */
/* loaded from: classes3.dex */
public final class sab implements u10 {
    public final yeb a;

    public sab(yeb yebVar) {
        this.a = yebVar;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        boolean isTerminated;
        yeb yebVar = this.a;
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
                    }
                }
            } else {
                p1a.g();
                return null;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // defpackage.f10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.m42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rab
            if (r0 == 0) goto L13
            r0 = r5
            rab r0 = (defpackage.rab) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            rab r0 = new rab
            n42 r5 = (defpackage.n42) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L35
            r4 = 1
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r5)
            return r5
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L31:
            defpackage.hre.r(r5)
            goto L42
        L35:
            defpackage.hre.r(r5)
            yeb r4 = r4.a
            long r4 = r4.c
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r5 = r1
        L42:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L50
            long r4 = r5.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        L50:
            r0.c = r3
            defpackage.cp8.q()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sab.c(m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // defpackage.e10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qab
            if (r0 == 0) goto L13
            r0 = r5
            qab r0 = (defpackage.qab) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qab r0 = new qab
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L33
            r4 = 1
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.hre.r(r5)
            return r5
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2f:
            defpackage.hre.r(r5)
            goto L47
        L33:
            defpackage.hre.r(r5)
            yeb r4 = r4.a
            m97 r4 = r4.a
            java.lang.Object r4 = r4.c
            b50 r4 = (defpackage.b50) r4
            int r4 = r4.b
            long r4 = (long) r4
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r5 = r1
        L47:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L55
            long r4 = r5.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        L55:
            r0.c = r3
            defpackage.cp8.q()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sab.e(n42):java.lang.Object");
    }

    @Override // defpackage.t10
    public final Object g(byte[] bArr, int i, int i2, n42 n42Var) {
        return new Integer(this.a.read(bArr, i, i2));
    }

    @Override // defpackage.e10
    public final Object h(n42 n42Var) {
        return vve.h(this, n42Var);
    }
}
