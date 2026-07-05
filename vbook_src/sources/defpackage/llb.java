package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: llb  reason: default package */
/* loaded from: classes3.dex */
public final class llb {
    public final k74 a;
    public final t27 b;
    public final m41 c;
    public final mfb d;
    public final sw7 e;
    public iya f;

    public llb(k74 k74Var, bz1 bz1Var, cn6 cn6Var, t27 t27Var) {
        this.a = k74Var;
        this.b = t27Var;
        sw2 sw2Var = ab3.a;
        this.c = k27.a(ru2.c);
        this.d = new mfb(new ak9(this, 27));
        this.e = new sw7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r13.o(r1) == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0031, B:33:0x008d, B:35:0x0091, B:36:0x0094), top: B:41:0x0031 }] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r2v6, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r12, defpackage.n42 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "http://"
            boolean r1 = r13 instanceof defpackage.jlb
            if (r1 == 0) goto L15
            r1 = r13
            jlb r1 = (defpackage.jlb) r1
            int r2 = r1.C
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.C = r2
            goto L1a
        L15:
            jlb r1 = new jlb
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r1.e
            int r2 = r1.C
            r3 = 2
            r4 = 1
            r9 = 0
            n82 r5 = defpackage.n82.a
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3b
            int r12 = r1.a
            java.lang.String r2 = r1.d
            java.lang.String r3 = r1.c
            qw7 r1 = r1.b
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> L37
            r8 = r3
        L35:
            r7 = r12
            goto L8d
        L37:
            r0 = move-exception
            r11 = r0
            goto Lbd
        L3b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L42:
            int r12 = r1.a
            qw7 r2 = r1.b
            defpackage.hre.r(r13)
            r13 = r2
            goto L5d
        L4b:
            defpackage.hre.r(r13)
            sw7 r13 = r11.e
            r1.b = r13
            r1.a = r12
            r1.C = r4
            java.lang.Object r2 = r13.o(r1)
            if (r2 != r5) goto L5d
            goto L89
        L5d:
            java.lang.String r2 = defpackage.ri5.b()     // Catch: java.lang.Throwable -> L6a
            boolean r4 = defpackage.k4b.j0(r2)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L6e
            java.lang.String r2 = "127.0.0.1"
            goto L6e
        L6a:
            r0 = move-exception
            r11 = r0
            r1 = r13
            goto Lbd
        L6e:
            java.lang.String r4 = "0.0.0.0"
            mfb r6 = r11.d     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L6a
            e06 r6 = (defpackage.e06) r6     // Catch: java.lang.Throwable -> L6a
            r1.b = r13     // Catch: java.lang.Throwable -> L6a
            r1.c = r4     // Catch: java.lang.Throwable -> L6a
            r1.d = r2     // Catch: java.lang.Throwable -> L6a
            r1.a = r12     // Catch: java.lang.Throwable -> L6a
            r1.C = r3     // Catch: java.lang.Throwable -> L6a
            r6.d()     // Catch: java.lang.Throwable -> L6a
            pvc r1 = defpackage.pvc.a     // Catch: java.lang.Throwable -> L6a
            if (r1 != r5) goto L8a
        L89:
            return r5
        L8a:
            r1 = r13
            r8 = r4
            goto L35
        L8d:
            iya r12 = r11.f     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L94
            r12.cancel(r9)     // Catch: java.lang.Throwable -> L37
        L94:
            m41 r12 = r11.c     // Catch: java.lang.Throwable -> L37
            u r5 = new u     // Catch: java.lang.Throwable -> L37
            r10 = 8
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L37
            r11 = 3
            iya r11 = defpackage.z87.v(r12, r9, r9, r5, r11)     // Catch: java.lang.Throwable -> L37
            r6.f = r11     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r11.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = ":"
            r11.append(r12)     // Catch: java.lang.Throwable -> L37
            r11.append(r7)     // Catch: java.lang.Throwable -> L37
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L37
            r1.q(r9)
            return r11
        Lbd:
            r1.q(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llb.a(int, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r8.o(r0) == r6) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:27:0x0061, B:29:0x0065, B:30:0x0068), top: B:39:0x002b }] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v8, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v5, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.klb
            if (r0 == 0) goto L13
            r0 = r8
            klb r0 = (defpackage.klb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            klb r0 = new klb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            qw7 r0 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2f
            goto L61
        L2f:
            r7 = move-exception
            goto L70
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r5
        L37:
            qw7 r1 = r0.a
            defpackage.hre.r(r8)
            r8 = r1
            goto L4e
        L3e:
            defpackage.hre.r(r8)
            sw7 r8 = r7.e
            r0.a = r8
            r0.d = r4
            java.lang.Object r1 = r8.o(r0)
            if (r1 != r6) goto L4e
            goto L5f
        L4e:
            mfb r1 = r7.d     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L6e
            e06 r1 = (defpackage.e06) r1     // Catch: java.lang.Throwable -> L6e
            r0.a = r8     // Catch: java.lang.Throwable -> L6e
            r0.d = r3     // Catch: java.lang.Throwable -> L6e
            r1.d()     // Catch: java.lang.Throwable -> L6e
            if (r2 != r6) goto L60
        L5f:
            return r6
        L60:
            r0 = r8
        L61:
            iya r8 = r7.f     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L68
            r8.cancel(r5)     // Catch: java.lang.Throwable -> L2f
        L68:
            r7.f = r5     // Catch: java.lang.Throwable -> L2f
            r0.q(r5)
            return r2
        L6e:
            r7 = move-exception
            r0 = r8
        L70:
            r0.q(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llb.b(n42):java.lang.Object");
    }
}
