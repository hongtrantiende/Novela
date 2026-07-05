package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k74  reason: default package */
/* loaded from: classes3.dex */
public final class k74 {
    public final x44 a;

    public k74(x44 x44Var) {
        this.a = x44Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(1:(1:(8:10|11|12|13|14|(1:16)(1:20)|17|18)(2:24|25))(1:26))(1:36)|27|28|29|(6:32|13|14|(0)(0)|17|18)|31))|38|6|(0)(0)|27|28|29|(0)|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r8 == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
        r5 = r7;
        r7 = r6;
        r6 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.k74 r6, defpackage.a06 r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.f74
            if (r0 == 0) goto L13
            r0 = r8
            f74 r0 = (defpackage.f74) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            f74 r0 = new f74
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            a06 r6 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L2c:
            r7 = move-exception
            goto L66
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L35:
            a06 r7 = r0.a
            defpackage.hre.r(r8)
            goto L4b
        L3b:
            defpackage.hre.r(r8)
            uwd r8 = r7.a
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.b
            byte[] r8 = (byte[]) r8
            if (r8 != r4) goto L4b
            goto L5d
        L4b:
            byte[] r8 = (byte[]) r8
            java.lang.String r8 = defpackage.r4b.F(r8)
            x44 r6 = r6.a     // Catch: java.lang.Throwable -> L62
            r0.a = r7     // Catch: java.lang.Throwable -> L62
            r0.d = r2     // Catch: java.lang.Throwable -> L62
            java.io.Serializable r8 = r6.a(r8, r0)     // Catch: java.lang.Throwable -> L62
            if (r8 != r4) goto L5e
        L5d:
            return r4
        L5e:
            r6 = r7
        L5f:
            byte[] r8 = (byte[]) r8     // Catch: java.lang.Throwable -> L2c
            goto L6b
        L62:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L66:
            gs9 r8 = new gs9
            r8.<init>(r7)
        L6b:
            java.lang.Throwable r7 = defpackage.hs9.a(r8)
            java.lang.String r0 = "code"
            if (r7 != 0) goto La0
            byte[] r8 = (byte[]) r8
            java.lang.Integer r7 = new java.lang.Integer
            r1 = 200(0xc8, float:2.8E-43)
            r7.<init>(r1)
            yk8 r1 = new yk8
            r1.<init>(r0, r7)
            java.lang.String r7 = defpackage.kxe.m(r8)
            yk8 r8 = new yk8
            java.lang.String r0 = "data"
            r8.<init>(r0, r7)
            yk8[] r7 = new defpackage.yk8[]{r1, r8}
            java.util.Map r7 = defpackage.o17.s(r7)
            k46 r7 = defpackage.v46.b(r7)
            java.lang.String r7 = r7.toString()
            defpackage.sue.K(r6, r7)
            goto Lca
        La0:
            java.lang.Integer r8 = new java.lang.Integer
            r1 = 403(0x193, float:5.65E-43)
            r8.<init>(r1)
            yk8 r1 = new yk8
            r1.<init>(r0, r8)
            java.lang.String r7 = r7.toString()
            yk8 r8 = new yk8
            java.lang.String r0 = "message"
            r8.<init>(r0, r7)
            yk8[] r7 = new defpackage.yk8[]{r1, r8}
            java.util.Map r7 = defpackage.o17.s(r7)
            k46 r7 = defpackage.v46.b(r7)
            java.lang.String r7 = r7.toString()
            defpackage.sue.K(r6, r7)
        Lca:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k74.a(k74, a06, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(4:25|26|27|(1:29))|12|13|14|(3:16|(1:18)|19)|20))|32|6|7|(0)(0)|12|13|14|(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r6 = new defpackage.gs9(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.k74 r4, defpackage.a06 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.g74
            if (r0 == 0) goto L13
            r0 = r6
            g74 r0 = (defpackage.g74) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            g74 r0 = new g74
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            int r6 = r0.d
            pvc r1 = defpackage.pvc.a
            r2 = 1
            if (r6 == 0) goto L32
            if (r6 != r2) goto L2b
            a06 r5 = r0.a
            defpackage.hre.r(r4)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r4 = move-exception
            goto L51
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r4)
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r2     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "composeResources/com.reader.resources/files/extension_docs.md"
            tza r6 = defpackage.fr9.a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = defpackage.ns2.b(r4)     // Catch: java.lang.Throwable -> L29
            n82 r6 = defpackage.n82.a
            if (r4 != r6) goto L46
            return r6
        L46:
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = defpackage.r4b.F(r4)     // Catch: java.lang.Throwable -> L29
            defpackage.sue.K(r5, r4)     // Catch: java.lang.Throwable -> L29
            r6 = r1
            goto L56
        L51:
            gs9 r6 = new gs9
            r6.<init>(r4)
        L56:
            java.lang.Throwable r4 = defpackage.hs9.a(r6)
            if (r4 == 0) goto L8c
            java.lang.Integer r6 = new java.lang.Integer
            r0 = 404(0x194, float:5.66E-43)
            r6.<init>(r0)
            yk8 r0 = new yk8
            java.lang.String r2 = "code"
            r0.<init>(r2, r6)
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L72
            java.lang.String r4 = "Extension docs not found"
        L72:
            yk8 r6 = new yk8
            java.lang.String r2 = "message"
            r6.<init>(r2, r4)
            yk8[] r4 = new defpackage.yk8[]{r0, r6}
            java.util.Map r4 = defpackage.o17.s(r4)
            k46 r4 = defpackage.v46.b(r4)
            java.lang.String r4 = r4.toString()
            defpackage.sue.K(r5, r4)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k74.b(k74, a06, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(1:(1:(7:10|11|12|13|14|(1:16)(1:19)|17)(2:23|24))(1:25))(1:35)|26|27|28|(5:31|13|14|(0)(0)|17)|30))|37|6|(0)(0)|26|27|28|(0)|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r9 == r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        r6 = r8;
        r8 = r7;
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.k74 r7, defpackage.a06 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.h74
            if (r0 == 0) goto L13
            r0 = r9
            h74 r0 = (defpackage.h74) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h74 r0 = new h74
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L30
            a06 r7 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2e
            goto L61
        L2e:
            r8 = move-exception
            goto L67
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L37:
            a06 r8 = r0.a
            defpackage.hre.r(r9)
            goto L4d
        L3d:
            defpackage.hre.r(r9)
            uwd r9 = r8.a
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r9.b
            byte[] r9 = (byte[]) r9
            if (r9 != r5) goto L4d
            goto L5f
        L4d:
            byte[] r9 = (byte[]) r9
            java.lang.String r9 = defpackage.r4b.F(r9)
            x44 r7 = r7.a     // Catch: java.lang.Throwable -> L63
            r0.a = r8     // Catch: java.lang.Throwable -> L63
            r0.d = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r7.b(r9, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r5) goto L60
        L5f:
            return r5
        L60:
            r7 = r8
        L61:
            r9 = r2
            goto L6c
        L63:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L67:
            gs9 r9 = new gs9
            r9.<init>(r8)
        L6c:
            java.lang.Throwable r8 = defpackage.hs9.a(r9)
            java.lang.String r0 = "code"
            if (r8 != 0) goto L90
            pvc r9 = (defpackage.pvc) r9
            java.lang.Integer r8 = new java.lang.Integer
            r9 = 200(0xc8, float:2.8E-43)
            r8.<init>(r9)
            java.util.Map r8 = java.util.Collections.singletonMap(r0, r8)
            r8.getClass()
            k46 r8 = defpackage.v46.b(r8)
            java.lang.String r8 = r8.toString()
            defpackage.sue.K(r7, r8)
            goto Lba
        L90:
            java.lang.Integer r9 = new java.lang.Integer
            r1 = 403(0x193, float:5.65E-43)
            r9.<init>(r1)
            yk8 r1 = new yk8
            r1.<init>(r0, r9)
            java.lang.String r8 = r8.toString()
            yk8 r9 = new yk8
            java.lang.String r0 = "message"
            r9.<init>(r0, r8)
            yk8[] r8 = new defpackage.yk8[]{r1, r9}
            java.util.Map r8 = defpackage.o17.s(r8)
            k46 r8 = defpackage.v46.b(r8)
            java.lang.String r8 = r8.toString()
            defpackage.sue.K(r7, r8)
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k74.c(k74, a06, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(1:(1:(8:10|11|12|13|14|(3:16|(6:18|19|20|21|(1:23)|24)(2:32|(1:34)(2:35|36))|25)(1:37)|26|27)(2:41|42))(1:43))(1:53)|44|45|46|(6:49|13|14|(0)(0)|26|27)|48))|55|6|(0)(0)|44|45|46|(0)|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r9 == r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
        r6 = r8;
        r8 = r7;
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.k74 r7, defpackage.a06 r8, defpackage.n42 r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k74.d(k74, a06, n42):java.lang.Object");
    }
}
