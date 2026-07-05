package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dea  reason: default package */
/* loaded from: classes.dex */
public final class dea {
    public final t9c a;
    public final ng2 b;
    public final AtomicReference c;

    public dea(d82 d82Var, t9c t9cVar, ng2 ng2Var) {
        d82Var.getClass();
        t9cVar.getClass();
        ng2Var.getClass();
        this.a = t9cVar;
        this.b = ng2Var;
        this.c = new AtomicReference();
        z87.v(k27.a(d82Var), null, null, new bea(this, null, 0), 3);
    }

    public final saa a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object C = z87.C(gs3.a, new bea(this, null, 1));
            while (!atomicReference.compareAndSet(null, C) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (saa) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l != null && num != null) {
            this.a.getClass();
            if (t9c.a().c - l.longValue() < num.intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.saa r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cea
            if (r0 == 0) goto L13
            r0 = r6
            cea r0 = (defpackage.cea) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cea r0 = new cea
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)     // Catch: java.io.IOException -> L43
            goto L57
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r6)
            ng2 r4 = r4.b     // Catch: java.io.IOException -> L43
            rg0 r6 = new rg0     // Catch: java.io.IOException -> L43
            r1 = 21
            r6.<init>(r5, r2, r1)     // Catch: java.io.IOException -> L43
            r0.c = r3     // Catch: java.io.IOException -> L43
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: java.io.IOException -> L43
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L57
            return r5
        L43:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to update config values: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FirebaseSessions"
            android.util.Log.w(r5, r4)
        L57:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dea.c(saa, n42):java.lang.Object");
    }
}
