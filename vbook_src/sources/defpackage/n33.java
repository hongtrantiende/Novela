package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n33  reason: default package */
/* loaded from: classes3.dex */
public final class n33 implements g33 {
    public final ii2 a;
    public final re5 b;
    public final h1a c;
    public final pi9 d;
    public final m41 e;

    public n33(ii2 ii2Var, re5 re5Var, h1a h1aVar, pi9 pi9Var) {
        this.a = ii2Var;
        this.b = re5Var;
        this.c = h1aVar;
        this.d = pi9Var;
        sw2 sw2Var = ab3.a;
        this.e = k27.a(ru2.c);
    }

    public final un2 a(String str) {
        return (un2) this.a.I.k0(str).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[LOOP:0: B:20:0x0058->B:22:0x005e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r8, java.lang.String r9, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.i33
            if (r0 == 0) goto L13
            r0 = r10
            i33 r0 = (defpackage.i33) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            i33 r0 = new i33
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r10)
            goto L47
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.hre.r(r10)
            un2 r8 = r7.a(r8)
            if (r8 == 0) goto L7a
            pta r10 = new pta
            h1a r7 = r7.c
            r10.<init>(r8, r7)
            r0.c = r2
            java.io.Serializable r10 = r10.b(r9, r0)
            n82 r7 = defpackage.n82.a
            if (r10 != r7) goto L47
            return r7
        L47:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.tl1.s(r10, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L58:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L79
            java.lang.Object r9 = r8.next()
            rsa r9 = (defpackage.rsa) r9
            ob1 r0 = new ob1
            java.lang.String r1 = r9.a
            java.lang.String r2 = r9.b
            int r3 = r9.c
            java.lang.String r4 = r9.d
            boolean r5 = r9.e
            boolean r6 = r9.f
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.add(r0)
            goto L58
        L79:
            return r7
        L7a:
            t54 r7 = new t54
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n33.b(java.lang.String, java.lang.String, n42):java.io.Serializable");
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
            boolean r0 = r9 instanceof defpackage.j33
            if (r0 == 0) goto L13
            r0 = r9
            j33 r0 = (defpackage.j33) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            j33 r0 = new j33
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
            un2 r7 = r6.a(r7)
            if (r7 == 0) goto Lb8
            pta r9 = new pta
            h1a r6 = r6.c
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
            java.lang.Object r9 = r9.c(r8, r6, r7, r0)
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
            ssa r8 = (defpackage.ssa) r8
            rp1 r0 = new rp1
            java.lang.String r1 = r8.a
            java.lang.String r2 = r8.b
            java.lang.String r3 = r8.c
            java.lang.String r4 = r8.d
            ks3 r5 = defpackage.ks3.a
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L91
        Lb0:
            java.lang.String r6 = r9.b
            hq1 r8 = new hq1
            r8.<init>(r6, r7)
            return r8
        Lb8:
            t54 r6 = new t54
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n33.c(java.lang.String, java.lang.String[], n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[LOOP:0: B:45:0x00d7->B:47:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133 A[EDGE_INSN: B:85:0x0133->B:48:0x0133 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r32, java.lang.String r33, defpackage.n42 r34) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n33.d(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[LOOP:0: B:20:0x0058->B:22:0x005e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r5, java.lang.String r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.l33
            if (r0 == 0) goto L13
            r0 = r7
            l33 r0 = (defpackage.l33) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            l33 r0 = new l33
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L47
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            un2 r5 = r4.a(r5)
            if (r5 == 0) goto L6b
            pta r7 = new pta
            h1a r4 = r4.c
            r7.<init>(r5, r4)
            r0.c = r2
            java.lang.Object r7 = r7.k(r6, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L47
            return r4
        L47:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.tl1.s(r7, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            eua r6 = (defpackage.eua) r6
            java.lang.String r6 = r6.a
            r4.add(r6)
            goto L58
        L6a:
            return r4
        L6b:
            t54 r4 = new t54
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n33.e(java.lang.String, java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[LOOP:0: B:23:0x0091->B:25:0x0097, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r7, java.lang.String[] r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.m33
            if (r0 == 0) goto L13
            r0 = r9
            m33 r0 = (defpackage.m33) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            m33 r0 = new m33
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
            un2 r7 = r6.a(r7)
            if (r7 == 0) goto Lb8
            pta r9 = new pta
            h1a r6 = r6.c
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
            u8b r0 = new u8b
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L91
        Lb0:
            java.lang.String r6 = r9.b
            w8b r8 = new w8b
            r8.<init>(r6, r7)
            return r8
        Lb8:
            t54 r6 = new t54
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n33.f(java.lang.String, java.lang.String[], n42):java.lang.Object");
    }
}
