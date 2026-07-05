package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s91  reason: default package */
/* loaded from: classes3.dex */
public final class s91 implements cq5 {
    public final String a;
    public final sw7 b;
    public j6d c;
    public boolean d;
    public final /* synthetic */ int e;
    public final String f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s91(String str, ii2 ii2Var, int i) {
        this(str, ii2Var, (byte) 0);
        this.e = i;
        str.getClass();
        switch (i) {
            case 1:
                this(str, ii2Var, (byte) 0);
                this.f = str;
                return;
            default:
                this.f = str;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r8 == r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o(defpackage.s91 r6, java.lang.String r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.uc4
            if (r0 == 0) goto L13
            r0 = r8
            uc4 r0 = (defpackage.uc4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            uc4 r0 = new uc4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L49
        L37:
            defpackage.hre.r(r8)
            boolean r8 = r6.d
            if (r8 != 0) goto L5b
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.q(r0)
            if (r8 != r5) goto L49
            goto L59
        L49:
            j6d r8 = (defpackage.j6d) r8
            j6d r6 = r8.b(r7)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r5) goto L5a
        L59:
            return r5
        L5a:
            return r6
        L5b:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s91.o(s91, java.lang.String, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d = true;
        this.c = null;
    }

    @Override // defpackage.cq5
    public final iq5 f() {
        switch (this.e) {
            case 0:
                return new iq5("CBZ", false, false, false);
            default:
                return new iq5("ZIP", false, false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r9.o(r0) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.vc4
            if (r0 == 0) goto L13
            r0 = r9
            vc4 r0 = (defpackage.vc4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vc4 r0 = new vc4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 2
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L35
            if (r1 != r3) goto L2f
            qw7 r0 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2d
            goto L7b
        L2d:
            r8 = move-exception
            goto L85
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L35:
            qw7 r1 = r0.a
            defpackage.hre.r(r9)
            r9 = r1
            goto L51
        L3c:
            defpackage.hre.r(r9)
            j6d r9 = r8.c
            if (r9 == 0) goto L44
            return r9
        L44:
            sw7 r9 = r8.b
            r0.a = r9
            r0.d = r2
            java.lang.Object r1 = r9.o(r0)
            if (r1 != r5) goto L51
            goto L77
        L51:
            m66 r1 = defpackage.pe4.a     // Catch: java.lang.Throwable -> L83
            hn8 r1 = defpackage.ie2.r(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r8.a     // Catch: java.lang.Throwable -> L83
            hn8 r1 = defpackage.hn8.f(r1, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "data"
            hn8 r1 = defpackage.hn8.f(r1, r6)     // Catch: java.lang.Throwable -> L83
            e31 r1 = r1.a     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.t()     // Catch: java.lang.Throwable -> L83
            j6d r1 = defpackage.d6d.b(r1)     // Catch: java.lang.Throwable -> L83
            r0.a = r9     // Catch: java.lang.Throwable -> L83
            r0.d = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = defpackage.jye.s(r1, r2, r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r0 != r5) goto L78
        L77:
            return r5
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            j6d r9 = (defpackage.j6d) r9     // Catch: java.lang.Throwable -> L2d
            r8.c = r9     // Catch: java.lang.Throwable -> L2d
            r0.q(r4)
            return r9
        L83:
            r8 = move-exception
            r0 = r9
        L85:
            r0.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s91.q(n42):java.lang.Object");
    }

    @Override // defpackage.cq5
    public final Object s(String str, Map map, n42 n42Var) {
        return o(this, str, n42Var);
    }

    @Override // defpackage.cq5
    public final Object t(int i, m42 m42Var, String str) {
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r15 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r15 != r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
        if (r15 == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r15 != r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    @Override // defpackage.cq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r12, java.lang.String r13, boolean r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s91.u(int, java.lang.String, boolean, n42):java.lang.Object");
    }

    @Override // defpackage.cq5
    public final Object x(boolean z, n42 n42Var) {
        return new Integer(0);
    }

    public s91(String str, ii2 ii2Var, byte b) {
        str.getClass();
        this.a = str;
        this.b = new sw7();
    }
}
