package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o30  reason: default package */
/* loaded from: classes3.dex */
public final class o30 extends yh0 {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Type inference failed for: r6v11, types: [w20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(defpackage.o30 r6, java.lang.String r7, defpackage.l6d r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.h30
            if (r0 == 0) goto L13
            r0 = r9
            h30 r0 = (defpackage.h30) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            h30 r0 = new h30
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 3
            r4 = 2
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L48
            r6 = 1
            if (r1 == r6) goto L44
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            y00 r6 = r0.a
            w20 r6 = (defpackage.w20) r6
            defpackage.hre.r(r9)
            goto L8c
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L38:
            l6d r8 = r0.c
            java.lang.String r7 = r0.b
            y00 r6 = r0.a
            o30 r6 = (defpackage.o30) r6
            defpackage.hre.r(r9)
            goto L69
        L44:
            defpackage.hre.r(r9)
            return r9
        L48:
            defpackage.hre.r(r9)
            d82 r9 = r0.getContext()
            r9.getClass()
            jf8 r1 = defpackage.t39.a
            b82 r9 = r9.get(r1)
            if (r9 != 0) goto L9f
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r4
            java.lang.Object r9 = r6.s(r7, r8, r0)
            if (r9 != r5) goto L69
            goto L8a
        L69:
            java.nio.channels.AsynchronousFileChannel r9 = (java.nio.channels.AsynchronousFileChannel) r9
            k30 r1 = new k30
            r1.<init>(r9, r6, r7)
            boolean r7 = r8.e
            if (r7 == 0) goto L94
            r0.a = r1
            r0.b = r2
            r0.c = r2
            r0.f = r3
            r6.getClass()
            n30 r6 = new n30
            r6.<init>(r9, r2)
            java.lang.Object r9 = defpackage.qye.k(r6, r0)
            if (r9 != r5) goto L8b
        L8a:
            return r5
        L8b:
            r6 = r1
        L8c:
            java.lang.Number r9 = (java.lang.Number) r9
            long r7 = r9.longValue()
            r1 = r6
            goto L96
        L94:
            r7 = 0
        L96:
            r1.getClass()
            v20 r6 = new v20
            r6.<init>(r1, r7)
            return r6
        L9f:
            defpackage.vm1.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o30.r(o30, java.lang.String, l6d, n42):java.lang.Object");
    }

    @Override // defpackage.yh0, defpackage.b6d
    public final Object n(String str, l6d l6dVar, n42 n42Var) {
        return r(this, str, l6dVar, n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, defpackage.l6d r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.l30
            if (r0 == 0) goto L13
            r0 = r7
            l30 r0 = (defpackage.l30) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            l30 r0 = new l30
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.c
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L2c
            if (r7 != r2) goto L26
            defpackage.hre.r(r4)     // Catch: java.nio.file.NoSuchFileException -> L73
            goto L70
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r1
        L2c:
            defpackage.hre.r(r4)
            jq6 r4 = defpackage.tl1.t()     // Catch: java.nio.file.NoSuchFileException -> L73
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.READ     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
            boolean r7 = r6.b     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r7 == 0) goto L41
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.WRITE     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
        L41:
            boolean r7 = r6.c     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r7 == 0) goto L4a
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.CREATE     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
        L4a:
            l6d r7 = defpackage.l6d.CREATE_NEW     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r6 != r7) goto L53
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.CREATE_NEW     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
        L53:
            boolean r6 = r6.d     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r6 == 0) goto L5c
            java.nio.file.StandardOpenOption r6 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r6)     // Catch: java.nio.file.NoSuchFileException -> L73
        L5c:
            jq6 r4 = defpackage.tl1.r(r4)     // Catch: java.nio.file.NoSuchFileException -> L73
            m30 r6 = new m30     // Catch: java.nio.file.NoSuchFileException -> L73
            r6.<init>(r5, r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L73
            r0.c = r2     // Catch: java.nio.file.NoSuchFileException -> L73
            java.lang.Object r4 = defpackage.qye.k(r6, r0)     // Catch: java.nio.file.NoSuchFileException -> L73
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L70
            return r5
        L70:
            java.nio.channels.AsynchronousFileChannel r4 = (java.nio.channels.AsynchronousFileChannel) r4     // Catch: java.nio.file.NoSuchFileException -> L73
            return r4
        L73:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o30.s(java.lang.String, l6d, n42):java.lang.Object");
    }
}
