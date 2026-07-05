package defpackage;

import java.nio.channels.AsynchronousSocketChannel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g66  reason: default package */
/* loaded from: classes3.dex */
public final class g66 implements t10, f20 {
    public AsynchronousSocketChannel a;
    public final sw7 b = new sw7();
    public final sw7 c = new sw7();

    public g66(AsynchronousSocketChannel asynchronousSocketChannel) {
        this.a = asynchronousSocketChannel;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        sw2 sw2Var = ab3.a;
        z87.v(k27.a(ru2.c), null, null, new c66(this, null), 3);
        return pvc.a;
    }

    @Override // defpackage.f20
    public final Object b(int i, m42 m42Var) {
        Object p = iwe.p(this, i, (zz2) m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:25:0x0070, B:27:0x0076, B:30:0x0085), top: B:37:0x0031 }] */
    /* JADX WARN: Type inference failed for: r6v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v11, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [qw7, java.lang.Object] */
    @Override // defpackage.f20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(byte[] r7, int r8, int r9, defpackage.n42 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.e66
            if (r0 == 0) goto L13
            r0 = r10
            e66 r0 = (defpackage.e66) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            e66 r0 = new e66
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.D
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L51
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            java.lang.Object r6 = r0.c
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.b
            qw7 r7 = (defpackage.qw7) r7
            g66 r8 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L35
            goto L70
        L35:
            r6 = move-exception
            goto L8d
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L3d:
            int r9 = r0.e
            int r8 = r0.d
            java.lang.Object r6 = r0.c
            qw7 r6 = (defpackage.qw7) r6
            java.lang.Object r7 = r0.b
            byte[] r7 = (byte[]) r7
            g66 r1 = r0.a
            defpackage.hre.r(r10)
            r10 = r6
            r6 = r1
            goto L69
        L51:
            defpackage.hre.r(r10)
            r0.a = r6
            r0.b = r7
            sw7 r10 = r6.c
            r0.c = r10
            r0.d = r8
            r0.e = r9
            r0.D = r3
            java.lang.Object r1 = r10.o(r0)
            if (r1 != r5) goto L69
            goto L84
        L69:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7, r8, r9)     // Catch: java.lang.Throwable -> L8b
            r8 = r6
            r6 = r7
            r7 = r10
        L70:
            boolean r9 = r6.hasRemaining()     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L85
            r0.a = r8     // Catch: java.lang.Throwable -> L35
            r0.b = r7     // Catch: java.lang.Throwable -> L35
            r0.c = r6     // Catch: java.lang.Throwable -> L35
            r0.D = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r8.i(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r9 != r5) goto L70
        L84:
            return r5
        L85:
            pvc r6 = defpackage.pvc.a     // Catch: java.lang.Throwable -> L35
            r7.q(r4)
            return r6
        L8b:
            r6 = move-exception
            r7 = r10
        L8d:
            r7.q(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g66.f(byte[], int, int, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r11.o(r0) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Type inference failed for: r7v12, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [qw7] */
    @Override // defpackage.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(final byte[] r8, final int r9, final int r10, defpackage.n42 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.d66
            if (r0 == 0) goto L13
            r0 = r11
            d66 r0 = (defpackage.d66) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d66 r0 = new d66
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f
            int r1 = r0.D
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.a
            qw7 r7 = (defpackage.qw7) r7
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L37:
            int r10 = r0.e
            int r9 = r0.d
            sw7 r7 = r0.c
            byte[] r8 = r0.b
            java.lang.Object r1 = r0.a
            g66 r1 = (defpackage.g66) r1
            defpackage.hre.r(r11)
            r11 = r7
            r7 = r1
            goto L61
        L49:
            defpackage.hre.r(r11)
            r0.a = r7
            r0.b = r8
            sw7 r11 = r7.b
            r0.c = r11
            r0.d = r9
            r0.e = r10
            r0.D = r3
            java.lang.Object r1 = r11.o(r0)
            if (r1 != r5) goto L61
            goto L74
        L61:
            a66 r1 = new a66     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            r0.a = r11     // Catch: java.lang.Throwable -> L87
            r0.b = r4     // Catch: java.lang.Throwable -> L87
            r0.c = r4     // Catch: java.lang.Throwable -> L87
            r0.D = r2     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = defpackage.ctd.y(r1, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r5) goto L75
        L74:
            return r5
        L75:
            r6 = r11
            r11 = r7
            r7 = r6
        L78:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L2f
            int r8 = r11.intValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            r7.q(r4)
            return r9
        L87:
            r8 = move-exception
            r7 = r11
        L89:
            r7.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g66.g(byte[], int, int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(final java.nio.ByteBuffer r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.f66
            if (r0 == 0) goto L13
            r0 = r6
            f66 r0 = (defpackage.f66) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            f66 r0 = new f66
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)     // Catch: java.lang.Throwable -> L5a
            goto L49
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            a40 r6 = defpackage.n20.a
            r6.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.a40.b
            r1.incrementAndGet(r6)
            b66 r6 = new b66     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            r0.c = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = defpackage.ctd.y(r6, r0)     // Catch: java.lang.Throwable -> L5a
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L49
            return r4
        L49:
            r4 = r6
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L5a
            r4.intValue()     // Catch: java.lang.Throwable -> L5a
            a40 r4 = defpackage.n20.b     // Catch: java.lang.Throwable -> L5a
            r4.getClass()     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.a40.b     // Catch: java.lang.Throwable -> L5a
            r5.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L5a
            return r6
        L5a:
            r4 = move-exception
            a40 r5 = defpackage.n20.c
            r5.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.a40.b
            r6.incrementAndGet(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g66.i(java.nio.ByteBuffer, n42):java.lang.Object");
    }
}
