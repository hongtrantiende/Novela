package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.C = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(androidx.work.impl.workers.ConstraintTrackingWorker r4, defpackage.lr6 r5, defpackage.hy r6, defpackage.ymd r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.p02
            if (r0 == 0) goto L13
            r0 = r8
            p02 r0 = (defpackage.p02) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p02 r0 = new p02
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.a
            int r8 = r0.c
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L2c
            if (r8 != r2) goto L26
            defpackage.hre.r(r4)
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r1
        L2c:
            defpackage.hre.r(r4)
            da r4 = new da
            r4.<init>(r5, r6, r7, r1)
            r0.c = r2
            java.lang.Object r4 = defpackage.k27.p(r4, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3f
            return r5
        L3f:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.e(androidx.work.impl.workers.ConstraintTrackingWorker, lr6, hy, ymd, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.work.impl.workers.ConstraintTrackingWorker r20, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.f(androidx.work.impl.workers.ConstraintTrackingWorker, n42):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(m42 m42Var) {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return z87.E(zj0.e(executorService), new oi(this, (m42) null, 15), m42Var);
    }
}
