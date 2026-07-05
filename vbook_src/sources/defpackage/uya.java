package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uya  reason: default package */
/* loaded from: classes3.dex */
public final class uya extends aab implements mu4 {
    public int a;
    public /* synthetic */ tj4 b;
    public /* synthetic */ int c;
    public final /* synthetic */ vya d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uya(vya vyaVar, m42 m42Var) {
        super(3, m42Var);
        this.d = vyaVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        uya uyaVar = new uya(this.d, (m42) obj3);
        uyaVar.b = (tj4) obj;
        uyaVar.c = intValue;
        return uyaVar.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r4.b(defpackage.tha.a, r16) == r13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (defpackage.ade.q(r14, r16) == r13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r4.b(defpackage.tha.b, r16) == r13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (defpackage.ade.q(r2, r16) == r13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r4.b(defpackage.tha.c, r16) != r13) goto L15;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            vya r1 = r0.d
            long r2 = r1.b
            tj4 r4 = r0.b
            int r5 = r0.c
            int r6 = r0.a
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            n82 r13 = defpackage.n82.a
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r7
        L27:
            defpackage.hre.r(r17)
            goto L7c
        L2b:
            defpackage.hre.r(r17)
            goto L6f
        L2f:
            defpackage.hre.r(r17)
            goto L5a
        L33:
            defpackage.hre.r(r17)
            goto L8b
        L37:
            defpackage.hre.r(r17)
            if (r5 <= 0) goto L4b
            r0.b = r7
            r0.c = r5
            r0.a = r12
            tha r1 = defpackage.tha.a
            java.lang.Object r0 = r4.b(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.a
            r0.b = r4
            r0.c = r5
            r0.a = r11
            java.lang.Object r1 = defpackage.ade.q(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.b = r4
            r0.c = r5
            r0.a = r10
            tha r1 = defpackage.tha.b
            java.lang.Object r1 = r4.b(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.b = r4
            r0.c = r5
            r0.a = r9
            java.lang.Object r1 = defpackage.ade.q(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.b = r7
            r0.c = r5
            r0.a = r8
            tha r1 = defpackage.tha.c
            java.lang.Object r0 = r4.b(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uya.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
