package com.reader.data.updates.impl.bookupdate;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class AndroidBookUpdateWorker extends CoroutineWorker implements p96 {
    public static final cza G;
    public static final cza H;
    public final ye6 C;
    public final ye6 D;
    public final ye6 E;
    public final mfb F;

    static {
        cza a = dza.a(Boolean.FALSE);
        G = a;
        H = a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBookUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        qf qfVar = new qf(this, 0);
        sk6 sk6Var = sk6.a;
        this.C = ipe.x(sk6Var, qfVar);
        this.D = ipe.x(sk6Var, new qf(this, 1));
        this.E = ipe.x(sk6Var, new qf(this, 2));
        this.F = new mfb(new ve(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.m42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lf
            if (r0 == 0) goto L13
            r0 = r5
            lf r0 = (defpackage.lf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            lf r0 = new lf
            n42 r5 = (defpackage.n42) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2e:
            defpackage.hre.r(r5)
            l0 r5 = new l0
            r1 = 9
            r5.<init>(r4, r2, r1)
            r0.c = r3
            java.lang.Object r5 = defpackage.k27.p(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L43
            return r4
        L43:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker.c(m42):java.lang.Object");
    }
}
