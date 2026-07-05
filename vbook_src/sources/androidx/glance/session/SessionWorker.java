package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters C;
    public final gba D;
    public final iac E;
    public final f82 F;
    public final String G;

    public SessionWorker(Context context, WorkerParameters workerParameters, gba gbaVar, iac iacVar, f82 f82Var) {
        super(context, workerParameters);
        String str;
        this.C = workerParameters;
        this.D = gbaVar;
        this.E = iacVar;
        this.F = f82Var;
        tf2 tf2Var = this.b.b;
        gbaVar.getClass();
        Object obj = tf2Var.a.get("KEY");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            this.G = str;
        } else {
            vs.k("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.m42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.qba
            if (r0 == 0) goto L13
            r0 = r6
            qba r0 = (defpackage.qba) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            qba r0 = new qba
            n42 r6 = (defpackage.n42) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.hre.r(r6)
            goto L47
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            iac r6 = r5.E
            p1a r6 = r6.d
            z38 r1 = new z38
            r4 = 22
            r1.<init>(r5, r2, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.z87.F(r6, r1, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L47
            return r5
        L47:
            kr6 r6 = (defpackage.kr6) r6
            if (r6 != 0) goto L65
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r6 = "TIMEOUT_EXIT_REASON"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.put(r6, r0)
            tf2 r6 = new tf2
            r6.<init>(r5)
            defpackage.rae.l(r6)
            jr6 r5 = new jr6
            r5.<init>(r6)
            return r5
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.c(m42):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final f82 d() {
        return this.F;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, mba.a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SessionWorker(android.content.Context r7, androidx.work.WorkerParameters r8, defpackage.gba r9, defpackage.iac r10, defpackage.f82 r11, int r12, defpackage.ct2 r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            lba r9 = defpackage.mba.a
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L10
            iac r10 = new iac
            r10.<init>()
        L10:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L19
            sw2 r9 = defpackage.ab3.a
            n35 r11 = defpackage.zz6.a
        L19:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.<init>(android.content.Context, androidx.work.WorkerParameters, gba, iac, f82, int, ct2):void");
    }
}
