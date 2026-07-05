package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t83  reason: default package */
/* loaded from: classes3.dex */
public final class t83 implements n83 {
    public final ii2 a;
    public final h1a b;

    public t83(ii2 ii2Var, h1a h1aVar) {
        this.a = ii2Var;
        this.b = h1aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[LOOP:0: B:23:0x0068->B:25:0x006e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, java.lang.String r9, defpackage.n42 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.o83
            if (r0 == 0) goto L13
            r0 = r10
            o83 r0 = (defpackage.o83) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            o83 r0 = new o83
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r10)
            goto L55
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L2c:
            defpackage.hre.r(r10)
            un2 r7 = r6.b(r7)
            if (r7 == 0) goto L8f
            pta r10 = new pta
            h1a r6 = r6.b
            r10.<init>(r7, r6)
            java.util.Map r6 = r7.p
            java.lang.String r7 = "search"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L4a
            java.lang.String r6 = ""
        L4a:
            r0.c = r2
            java.lang.Object r10 = r10.i(r6, r8, r9, r0)
            n82 r6 = defpackage.n82.a
            if (r10 != r6) goto L55
            return r6
        L55:
            fua r10 = (defpackage.fua) r10
            java.util.List r6 = r10.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.tl1.s(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r6.next()
            cua r8 = (defpackage.cua) r8
            java.lang.String r1 = r8.a
            java.lang.String r3 = r8.c
            java.lang.String r4 = r8.d
            java.lang.String r2 = r8.b
            java.lang.String r5 = r8.e
            go0 r0 = new go0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L68
        L87:
            java.lang.String r6 = r10.b
            nq0 r8 = new nq0
            r8.<init>(r6, r7)
            return r8
        L8f:
            t54 r6 = new t54
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.a(java.lang.String, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public final un2 b(String str) {
        return (un2) this.a.I.k0(str).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[LOOP:0: B:23:0x0091->B:25:0x0097, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, java.lang.String[] r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.p83
            if (r0 == 0) goto L13
            r0 = r9
            p83 r0 = (defpackage.p83) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p83 r0 = new p83
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r9)
            goto L7e
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L2c:
            defpackage.hre.r(r9)
            un2 r7 = r6.b(r7)
            if (r7 == 0) goto Lb8
            pta r9 = new pta
            h1a r6 = r6.b
            r9.<init>(r7, r6)
            s46 r6 = defpackage.v46.a
            r7 = 0
            r7 = r8[r7]
            k46 r6 = r6.c(r7)
            d56 r6 = defpackage.l46.g(r6)
            java.lang.Object r7 = defpackage.b00.q0(r2, r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L53
            java.lang.String r7 = ""
        L53:
            java.lang.String r8 = "script"
            java.lang.Object r8 = defpackage.o17.p(r8, r6)
            k46 r8 = (defpackage.k46) r8
            i56 r8 = defpackage.l46.h(r8)
            java.lang.String r8 = r8.a()
            java.lang.String r1 = "input"
            java.lang.Object r6 = defpackage.o17.p(r1, r6)
            k46 r6 = (defpackage.k46) r6
            i56 r6 = defpackage.l46.h(r6)
            java.lang.String r6 = r6.a()
            r0.c = r2
            java.lang.Object r9 = r9.i(r8, r6, r7, r0)
            n82 r6 = defpackage.n82.a
            if (r9 != r6) goto L7e
            return r6
        L7e:
            fua r9 = (defpackage.fua) r9
            java.util.List r6 = r9.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.tl1.s(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L91:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r6.next()
            cua r8 = (defpackage.cua) r8
            java.lang.String r1 = r8.a
            java.lang.String r3 = r8.c
            java.lang.String r4 = r8.d
            java.lang.String r2 = r8.b
            java.lang.String r5 = r8.e
            go0 r0 = new go0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L91
        Lb0:
            java.lang.String r6 = r9.b
            nq0 r8 = new nq0
            r8.<init>(r6, r7)
            return r8
        Lb8:
            t54 r6 = new t54
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.c(java.lang.String, java.lang.String[], n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[LOOP:0: B:20:0x0058->B:22:0x005e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.q83
            if (r0 == 0) goto L13
            r0 = r9
            q83 r0 = (defpackage.q83) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            q83 r0 = new q83
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r9)
            goto L47
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.hre.r(r9)
            un2 r8 = r7.b(r8)
            if (r8 == 0) goto L9a
            pta r9 = new pta
            h1a r7 = r7.b
            r9.<init>(r8, r7)
            r0.c = r2
            java.io.Serializable r9 = r9.h(r0)
            n82 r7 = defpackage.n82.a
            if (r9 != r7) goto L47
            return r7
        L47:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.tl1.s(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L58:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            rta r9 = (defpackage.rta) r9
            q81 r0 = new q81
            java.lang.String r1 = r9.a
            s46 r3 = defpackage.v46.a
            java.lang.String r4 = r9.c
            yk8 r5 = new yk8
            java.lang.String r6 = "script"
            r5.<init>(r6, r4)
            java.lang.String r9 = r9.b
            yk8 r4 = new yk8
            java.lang.String r6 = "input"
            r4.<init>(r6, r9)
            yk8[] r9 = new defpackage.yk8[]{r5, r4}
            java.util.Map r9 = defpackage.o17.s(r9)
            r3.getClass()
            b45 r4 = new b45
            c4b r5 = defpackage.c4b.a
            r4.<init>(r5, r5, r2)
            java.lang.String r9 = r3.b(r4, r9)
            r0.<init>(r1, r9)
            r7.add(r0)
            goto L58
        L99:
            return r7
        L9a:
            t54 r7 = new t54
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.d(java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r24, defpackage.n42 r25) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.e(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[LOOP:0: B:20:0x0058->B:22:0x005e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.s83
            if (r0 == 0) goto L13
            r0 = r9
            s83 r0 = (defpackage.s83) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            s83 r0 = new s83
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r9)
            goto L47
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.hre.r(r9)
            un2 r8 = r7.b(r8)
            if (r8 == 0) goto L9a
            pta r9 = new pta
            h1a r7 = r7.b
            r9.<init>(r8, r7)
            r0.c = r2
            java.io.Serializable r9 = r9.g(r0)
            n82 r7 = defpackage.n82.a
            if (r9 != r7) goto L47
            return r7
        L47:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.tl1.s(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L58:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            yta r9 = (defpackage.yta) r9
            ww4 r0 = new ww4
            java.lang.String r1 = r9.a
            s46 r3 = defpackage.v46.a
            java.lang.String r4 = r9.c
            yk8 r5 = new yk8
            java.lang.String r6 = "script"
            r5.<init>(r6, r4)
            java.lang.String r9 = r9.b
            yk8 r4 = new yk8
            java.lang.String r6 = "input"
            r4.<init>(r6, r9)
            yk8[] r9 = new defpackage.yk8[]{r5, r4}
            java.util.Map r9 = defpackage.o17.s(r9)
            r3.getClass()
            b45 r4 = new b45
            c4b r5 = defpackage.c4b.a
            r4.<init>(r5, r5, r2)
            java.lang.String r9 = r3.b(r4, r9)
            r0.<init>(r1, r9)
            r7.add(r0)
            goto L58
        L99:
            return r7
        L9a:
            t54 r7 = new t54
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.f(java.lang.String, n42):java.io.Serializable");
    }
}
