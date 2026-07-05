package androidx.work;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements gv5 {
    public static final String a = r95.r("WrkMgrInitializer");

    @Override // defpackage.gv5
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        r1 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (defpackage.lmd.l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        defpackage.lmd.l = defpackage.nmd.y(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        defpackage.lmd.k = defpackage.lmd.l;
     */
    @Override // defpackage.gv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r4) {
        /*
            r3 = this;
            r95 r3 = defpackage.r95.n()
            java.lang.String r0 = androidx.work.WorkManagerInitializer.a
            java.lang.String r1 = "Initializing WorkManager with default configuration."
            r3.c(r0, r1)
            cne r3 = new cne
            r0 = 19
            r3.<init>(r0)
            xy1 r0 = new xy1
            r0.<init>(r3)
            r4.getClass()
            java.lang.Object r3 = defpackage.lmd.m
            monitor-enter(r3)
            lmd r1 = defpackage.lmd.k     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            lmd r2 = defpackage.lmd.l     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L26
            goto L30
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            goto L4a
        L30:
            if (r1 != 0) goto L44
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2e
            lmd r2 = defpackage.lmd.l     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L40
            lmd r0 = defpackage.nmd.y(r1, r0)     // Catch: java.lang.Throwable -> L2e
            defpackage.lmd.l = r0     // Catch: java.lang.Throwable -> L2e
        L40:
            lmd r0 = defpackage.lmd.l     // Catch: java.lang.Throwable -> L2e
            defpackage.lmd.k = r0     // Catch: java.lang.Throwable -> L2e
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            lmd r3 = defpackage.lmd.b(r4)
            return r3
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkManagerInitializer.b(android.content.Context):java.lang.Object");
    }
}
