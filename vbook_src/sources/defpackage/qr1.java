package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qr1  reason: default package */
/* loaded from: classes3.dex */
public final class qr1 implements zq1 {
    public final ev a;
    public final dx b;

    static {
        r76[] r76VarArr = dx.W;
        int i = ev.f;
    }

    public qr1(ev evVar, dx dxVar) {
        this.a = evVar;
        this.b = dxVar;
    }

    public static String k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f) {
        e56 e56Var = new e56();
        z87.y(e56Var, "name", str);
        z87.y(e56Var, "name_trans", str2);
        z87.y(e56Var, "author", str3);
        z87.y(e56Var, "author_trans", str4);
        z87.y(e56Var, "cover", str5);
        z87.y(e56Var, "url", str6);
        z87.y(e56Var, "message", str8);
        z87.y(e56Var, "source", str7);
        z87.x(e56Var, "rate", Float.valueOf(f));
        return e56Var.a().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d8, code lost:
        if (r0 == r10) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f0  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2, types: [jj, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0123 -> B:19:0x0071). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r23, int r24, java.lang.String r25, java.lang.Long r26, java.util.List r27, defpackage.n42 r28) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.a(int, int, java.lang.String, java.lang.Long, java.util.List, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, float r13, defpackage.n42 r14) {
        /*
            r4 = this;
            boolean r0 = r14 instanceof defpackage.br1
            if (r0 == 0) goto L13
            r0 = r14
            br1 r0 = (defpackage.br1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            br1 r0 = new br1
            r0.<init>(r4, r14)
        L18:
            java.lang.Object r14 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r14)
            goto L4e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r14)
            java.lang.String r7 = k(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            ev r4 = r4.a
            fz4 r4 = r4.e
            boolean r8 = defpackage.k4b.j0(r6)
            if (r8 == 0) goto L3e
            goto L3f
        L3e:
            r5 = r6
        L3f:
            r0.c = r2
            r6 = r7
            r7 = 0
            r8 = 1
            r9 = r0
            java.lang.Object r14 = r4.o(r5, r6, r7, r8, r9)
            n82 r4 = defpackage.n82.a
            if (r14 != r4) goto L4e
            return r4
        L4e:
            or9 r14 = (defpackage.or9) r14
            java.lang.Object r4 = r14.b
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L61
            long r4 = r4.longValue()
            int r4 = (int) r4
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        L61:
            e60 r4 = new e60
            r5 = 21
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
        if (r1 == r9) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [jj, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0111 -> B:29:0x011c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r18, java.lang.String r19, int r20, defpackage.ks3 r21, defpackage.n42 r22) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.c(java.lang.String, java.lang.String, int, ks3, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r5, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dr1
            if (r0 == 0) goto L13
            r0 = r7
            dr1 r0 = (defpackage.dr1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dr1 r0 = new dr1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            ev r4 = r4.a
            fz4 r4 = r4.e
            r0.c = r2
            java.lang.Object r4 = r4.q(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3e
            return r5
        L3e:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.d(long, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.er1
            if (r0 == 0) goto L13
            r0 = r6
            er1 r0 = (defpackage.er1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            er1 r0 = new er1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            ev r4 = r4.a
            fz4 r4 = r4.e
            r0.c = r2
            java.lang.Object r4 = r4.r(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3e
            return r5
        L3e:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.e(int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r17, defpackage.n42 r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.f(int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gr1
            if (r0 == 0) goto L13
            r0 = r6
            gr1 r0 = (defpackage.gr1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gr1 r0 = new gr1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)
            goto L3e
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r6)
            ev r4 = r4.a
            fz4 r4 = r4.e
            r0.c = r3
            java.lang.Object r6 = r4.R(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            or9 r6 = (defpackage.or9) r6
            java.lang.Object r4 = r6.b
            vhc r4 = (defpackage.vhc) r4
            if (r4 == 0) goto L5b
            java.lang.String r5 = r4.b
            java.lang.String r6 = r4.c
            java.lang.String r0 = r4.i
            boolean r1 = defpackage.k4b.j0(r0)
            if (r1 != 0) goto L53
            r2 = r0
        L53:
            int r4 = r4.e
            ko3 r0 = new ko3
            r0.<init>(r5, r6, r2, r4)
            return r0
        L5b:
            e60 r4 = new e60
            r5 = 21
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.g(int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(int r9, int r10, int r11, boolean r12, defpackage.n42 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.hr1
            if (r0 == 0) goto L14
            r0 = r13
            hr1 r0 = (defpackage.hr1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            hr1 r0 = new hr1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.b
            int r0 = r6.d
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L2a
            int r10 = r6.a
            defpackage.hre.r(r13)
            goto L52
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r7
        L30:
            defpackage.hre.r(r13)
            ev r8 = r8.a
            fz4 r8 = r8.e
            if (r12 == 0) goto L3d
            java.lang.String r12 = "desc"
        L3b:
            r5 = r12
            goto L40
        L3d:
            java.lang.String r12 = "asc"
            goto L3b
        L40:
            r6.a = r10
            r6.d = r1
            r4 = 10
            r1 = r8
            r2 = r9
            r3 = r11
            java.lang.Object r13 = r1.O(r2, r3, r4, r5, r6)
            n82 r8 = defpackage.n82.a
            if (r13 != r8) goto L52
            return r8
        L52:
            or9 r13 = (defpackage.or9) r13
            java.lang.Object r8 = r13.b
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L7d
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.tl1.s(r8, r9)
            r7.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L69:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r8.next()
            r29 r9 = (defpackage.r29) r9
            e33 r9 = defpackage.xwe.r(r9, r10)
            r7.add(r9)
            goto L69
        L7d:
            if (r7 != 0) goto L82
            ks3 r8 = defpackage.ks3.a
            return r8
        L82:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.h(int, int, int, boolean, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[LOOP:0: B:18:0x007a->B:20:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r38, defpackage.n42 r39) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.i(int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r6, boolean r7, defpackage.n42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.jr1
            if (r0 == 0) goto L13
            r0 = r8
            jr1 r0 = (defpackage.jr1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jr1 r0 = new jr1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2a
            defpackage.hre.r(r8)
            return r2
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L31:
            defpackage.hre.r(r8)
            return r2
        L35:
            defpackage.hre.r(r8)
            ev r5 = r5.a
            fz4 r5 = r5.e
            n82 r8 = defpackage.n82.a
            if (r7 == 0) goto L49
            r0.c = r4
            java.lang.Object r5 = r5.f0(r6, r0)
            if (r5 != r8) goto L52
            goto L51
        L49:
            r0.c = r3
            java.lang.Object r5 = r5.u0(r6, r0)
            if (r5 != r8) goto L52
        L51:
            return r8
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.j(int, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r5, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.kr1
            if (r0 == 0) goto L13
            r0 = r7
            kr1 r0 = (defpackage.kr1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kr1 r0 = new kr1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            ev r4 = r4.a
            fz4 r4 = r4.e
            r0.c = r2
            java.lang.Object r7 = r4.d0(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            or9 r7 = (defpackage.or9) r7
            java.lang.Object r4 = r7.b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L4b
            boolean r4 = r4.booleanValue()
            goto L4c
        L4b:
            r4 = 0
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.l(long, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lr1
            if (r0 == 0) goto L13
            r0 = r6
            lr1 r0 = (defpackage.lr1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lr1 r0 = new lr1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            ev r4 = r4.a
            fz4 r4 = r4.e
            r0.c = r2
            java.lang.Object r6 = r4.e0(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            or9 r6 = (defpackage.or9) r6
            java.lang.Object r4 = r6.b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L4b
            boolean r4 = r4.booleanValue()
            goto L4c
        L4b:
            r4 = 0
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.m(int, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01bd, code lost:
        if (r0 != r10) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2, types: [jj, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:31:0x0124). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r25, int r27, java.lang.String r28, defpackage.ks3 r29, defpackage.n42 r30) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.n(long, int, java.lang.String, ks3, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r15, defpackage.jo3 r16, java.lang.String r17, float r18, defpackage.n42 r19) {
        /*
            r14 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof defpackage.nr1
            if (r2 == 0) goto L17
            r2 = r1
            nr1 r2 = (defpackage.nr1) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            nr1 r2 = new nr1
            r2.<init>(r14, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.c
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 != r4) goto L29
            defpackage.hre.r(r1)
            goto L60
        L29:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            r14 = 0
            return r14
        L30:
            defpackage.hre.r(r1)
            java.lang.String r5 = r0.a
            java.lang.String r6 = r0.b
            java.lang.String r7 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            java.lang.String r10 = r0.f
            java.lang.String r11 = r0.g
            r12 = r17
            r13 = r18
            java.lang.String r1 = k(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            ev r14 = r14.a
            fz4 r14 = r14.e
            boolean r3 = defpackage.k4b.j0(r6)
            if (r3 == 0) goto L55
            java.lang.String r6 = r0.a
        L55:
            r2.c = r4
            java.lang.Object r14 = r14.x0(r15, r6, r1, r2)
            n82 r0 = defpackage.n82.a
            if (r14 != r0) goto L60
            return r0
        L60:
            pvc r14 = defpackage.pvc.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.o(int, jo3, java.lang.String, float, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(int r5, java.lang.String r6, java.lang.String r7, defpackage.n42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.or1
            if (r0 == 0) goto L13
            r0 = r8
            or1 r0 = (defpackage.or1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            or1 r0 = new or1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r8)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r8)
            ev r4 = r4.a
            fz4 r4 = r4.e
            r0.c = r2
            java.lang.Object r4 = r4.x0(r5, r6, r7, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3e
            return r5
        L3e:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.p(int, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.f76 r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pr1
            if (r0 == 0) goto L13
            r0 = r9
            pr1 r0 = (defpackage.pr1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            pr1 r0 = new pr1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L68
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            java.lang.String r7 = r0.b
            fz4 r8 = r0.a
            defpackage.hre.r(r9)
            goto L55
        L39:
            defpackage.hre.r(r9)
            ev r7 = r7.a
            fz4 r7 = r7.e
            java.lang.String r9 = r8.getName()
            r0.a = r7
            r0.b = r9
            r0.e = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r5) goto L51
            goto L67
        L51:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L55:
            byte[] r9 = (byte[]) r9
            java.lang.String r9 = defpackage.kxe.m(r9)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r9 = r8.B0(r7, r9, r0)
            if (r9 != r5) goto L68
        L67:
            return r5
        L68:
            or9 r9 = (defpackage.or9) r9
            java.lang.Object r7 = r9.b
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L71
            return r7
        L71:
            e60 r7 = new e60
            r8 = 21
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr1.q(f76, n42):java.lang.Object");
    }
}
