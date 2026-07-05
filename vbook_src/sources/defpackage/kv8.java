package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kv8  reason: default package */
/* loaded from: classes3.dex */
public final class kv8 extends aab implements lu4 {
    public int C;
    public final /* synthetic */ xy0 D;
    public final /* synthetic */ u8a E;
    public u8a a;
    public ta1 b;
    public qy0 c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv8(xy0 xy0Var, u8a u8aVar, m42 m42Var) {
        super(2, m42Var);
        this.D = xy0Var;
        this.E = u8aVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new kv8(this.D, this.E, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((kv8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r9.e(r13, r10) == r4) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #2 {mk1 -> 0x00a7, blocks: (B:28:0x009d, B:17:0x0040, B:7:0x0019, B:19:0x004c, B:23:0x006a, B:25:0x0072, B:14:0x0039, B:18:0x0044), top: B:37:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: mk1 -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {mk1 -> 0x00a7, blocks: (B:28:0x009d, B:17:0x0040, B:7:0x0019, B:19:0x004c, B:23:0x006a, B:25:0x0072, B:14:0x0039, B:18:0x0044), top: B:37:0x0007 }] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ta1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ta1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009a -> B:8:0x001c). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.C
            r1 = 2
            r2 = 1
            r3 = 0
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L2d
            if (r0 != r1) goto L27
            int r0 = r13.f
            int r5 = r13.e
            int r6 = r13.d
            qy0 r7 = r13.c
            ta1 r8 = r13.b
            u8a r9 = r13.a
            defpackage.hre.r(r14)     // Catch: java.lang.Throwable -> L24
        L1c:
            r14 = r7
            r7 = r0
            r0 = r14
            r14 = r6
            r6 = r5
            r5 = r14
            r14 = r9
            goto L4c
        L24:
            r13 = move-exception
            goto La1
        L27:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r3
        L2d:
            int r0 = r13.f
            int r5 = r13.e
            int r6 = r13.d
            qy0 r7 = r13.c
            ta1 r8 = r13.b
            u8a r9 = r13.a
            defpackage.hre.r(r14)     // Catch: java.lang.Throwable -> L24
            goto L6a
        L3d:
            defpackage.hre.r(r14)
            xy0 r8 = r13.D     // Catch: defpackage.mk1 -> La7
            u8a r14 = r13.E     // Catch: defpackage.mk1 -> La7
            qy0 r0 = new qy0     // Catch: java.lang.Throwable -> L24
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L24
            r5 = 0
            r6 = r5
            r7 = r6
        L4c:
            r13.a = r14     // Catch: java.lang.Throwable -> L24
            r13.b = r8     // Catch: java.lang.Throwable -> L24
            r13.c = r0     // Catch: java.lang.Throwable -> L24
            r13.d = r5     // Catch: java.lang.Throwable -> L24
            r13.e = r6     // Catch: java.lang.Throwable -> L24
            r13.f = r7     // Catch: java.lang.Throwable -> L24
            r13.C = r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = r0.a(r13)     // Catch: java.lang.Throwable -> L24
            if (r9 != r4) goto L61
            goto L9c
        L61:
            r12 = r9
            r9 = r14
            r14 = r12
            r12 = r7
            r7 = r0
            r0 = r12
            r12 = r6
            r6 = r5
            r5 = r12
        L6a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L24
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r14 == 0) goto L9d
            java.lang.Object r14 = r7.c()     // Catch: java.lang.Throwable -> L24
            xs4 r14 = (defpackage.xs4) r14     // Catch: java.lang.Throwable -> L24
            pw6 r10 = defpackage.ez2.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r11 = "Received ping message, sending pong message"
            r10.i(r11)     // Catch: java.lang.Throwable -> L24
            ys4 r10 = new ys4     // Catch: java.lang.Throwable -> L24
            byte[] r14 = r14.b     // Catch: java.lang.Throwable -> L24
            x38 r11 = defpackage.x38.a     // Catch: java.lang.Throwable -> L24
            r10.<init>(r14, r11)     // Catch: java.lang.Throwable -> L24
            r13.a = r9     // Catch: java.lang.Throwable -> L24
            r13.b = r8     // Catch: java.lang.Throwable -> L24
            r13.c = r7     // Catch: java.lang.Throwable -> L24
            r13.d = r6     // Catch: java.lang.Throwable -> L24
            r13.e = r5     // Catch: java.lang.Throwable -> L24
            r13.f = r0     // Catch: java.lang.Throwable -> L24
            r13.C = r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r14 = r9.e(r13, r10)     // Catch: java.lang.Throwable -> L24
            if (r14 != r4) goto L1c
        L9c:
            return r4
        L9d:
            r8.cancel(r3)     // Catch: defpackage.mk1 -> La7
            goto La7
        La1:
            throw r13     // Catch: java.lang.Throwable -> La2
        La2:
            r14 = move-exception
            defpackage.zpe.e(r8, r13)     // Catch: defpackage.mk1 -> La7
            throw r14     // Catch: defpackage.mk1 -> La7
        La7:
            pvc r13 = defpackage.pvc.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
