package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: op8  reason: default package */
/* loaded from: classes.dex */
public final class op8 {
    public static final mp8 c = new mp8(0);
    public final zg8 a;
    public final int b;

    public op8(int i, zg8 zg8Var) {
        this.a = zg8Var;
        this.b = i;
    }

    public final void a() {
        boolean isTerminated;
        zg8 zg8Var = this.a;
        if (zg8Var instanceof AutoCloseable) {
            zg8Var.close();
        } else if (zg8Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) zg8Var;
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
        } else if (zg8Var instanceof TypedArray) {
            ((TypedArray) zg8Var).recycle();
        } else if (zg8Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) zg8Var).release();
        } else if (zg8Var instanceof MediaDrm) {
            ((MediaDrm) zg8Var).release();
        } else {
            p1a.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[LOOP:0: B:18:0x0054->B:20:0x005a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.np8
            if (r0 == 0) goto L13
            r0 = r8
            np8 r0 = (defpackage.np8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            np8 r0 = new np8
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r8)
            goto L43
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.hre.r(r8)
            r8 = 0
            int r1 = r7.b
            ty5 r8 = defpackage.dce.F(r8, r1)
            r0.c = r2
            zg8 r7 = r7.a
            java.io.Serializable r8 = r7.W0(r8, r0)
            n82 r7 = defpackage.n82.a
            if (r8 != r7) goto L43
            return r7
        L43:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r8, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L54:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r8.next()
            dh8 r0 = (defpackage.dh8) r0
            int r1 = r0.a
            int r0 = r0.b
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r1 | r3
            zy5 r2 = new zy5
            r2.<init>(r0)
            r7.add(r2)
            goto L54
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op8.b(n42):java.io.Serializable");
    }
}
