package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pma  reason: default package */
/* loaded from: classes.dex */
public final class pma implements dz5 {
    public final sw7 a = new sw7();
    public final uwd b = new uwd(5);
    public final s02 c = new s02(new qo(2, 4, null), 6);

    public pma(String str) {
    }

    @Override // defpackage.dz5
    public final Object a(n42 n42Var) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    @Override // defpackage.dz5
    public final Object b(fh2 fh2Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r8 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r8 != r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Type inference failed for: r6v0, types: [pma] */
    /* JADX WARN: Type inference failed for: r6v1, types: [qw7] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [qw7] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.dz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.xt4 r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nma
            if (r0 == 0) goto L13
            r0 = r8
            nma r0 = (defpackage.nma) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            nma r0 = new nma
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.a
            qw7 r6 = (defpackage.qw7) r6
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L37:
            sw7 r6 = r0.b
            java.lang.Object r7 = r0.a
            xt4 r7 = (defpackage.xt4) r7
            defpackage.hre.r(r8)
            goto L53
        L41:
            defpackage.hre.r(r8)
            r0.a = r7
            sw7 r6 = r6.a
            r0.b = r6
            r0.e = r3
            java.lang.Object r8 = r6.o(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.a = r6     // Catch: java.lang.Throwable -> L2f
            r0.b = r4     // Catch: java.lang.Throwable -> L2f
            r0.e = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.q(r4)
            return r8
        L64:
            r6.q(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.c(xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    @Override // defpackage.dz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.lu4 r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.oma
            if (r0 == 0) goto L13
            r0 = r7
            oma r0 = (defpackage.oma) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            oma r0 = new oma
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            boolean r5 = r0.b
            sw7 r6 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L2a
            goto L52
        L2a:
            r7 = move-exception
            goto L5d
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L32:
            defpackage.hre.r(r7)
            sw7 r5 = r5.a
            boolean r7 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L58
            r0.a = r5     // Catch: java.lang.Throwable -> L58
            r0.b = r7     // Catch: java.lang.Throwable -> L58
            r0.e = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L58
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L4e
            return r0
        L4e:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L52:
            if (r5 == 0) goto L57
            r6.q(r3)
        L57:
            return r7
        L58:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5d:
            if (r5 == 0) goto L62
            r6.q(r3)
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.d(lu4, n42):java.lang.Object");
    }

    @Override // defpackage.dz5
    public final sj4 e() {
        return this.c;
    }
}
