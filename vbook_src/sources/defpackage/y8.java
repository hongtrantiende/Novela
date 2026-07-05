package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y8  reason: default package */
/* loaded from: classes3.dex */
public final class y8 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ qv8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mu4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(mu4 mu4Var, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.e = mu4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        mu4 mu4Var = this.e;
        qv8 qv8Var = (qv8) obj;
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                y8 y8Var = new y8(mu4Var, m42Var, 0);
                y8Var.c = qv8Var;
                y8Var.d = obj2;
                return y8Var.invokeSuspend(pvcVar);
            default:
                y8 y8Var2 = new y8(mu4Var, m42Var, 1);
                y8Var2.c = qv8Var;
                y8Var2.d = obj2;
                return y8Var2.invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r11 == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r11 == r4) goto L36;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            pvc r1 = defpackage.pvc.a
            mu4 r2 = r10.e
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            n82 r4 = defpackage.n82.a
            r5 = 1
            r6 = 2
            r7 = 0
            switch(r0) {
                case 0: goto L4d;
                default: goto L10;
            }
        L10:
            qv8 r0 = r10.c
            java.lang.Object r8 = r10.d
            int r9 = r10.b
            if (r9 == 0) goto L29
            if (r9 == r5) goto L25
            if (r9 != r6) goto L20
            defpackage.hre.r(r11)
            goto L4c
        L20:
            defpackage.vs.k(r3)
            r1 = r7
            goto L4c
        L25:
            defpackage.hre.r(r11)
            goto L3b
        L29:
            defpackage.hre.r(r11)
            java.lang.Object r11 = r0.a
            r10.c = r0
            r10.d = r7
            r10.b = r5
            java.lang.Object r11 = r2.c(r11, r8, r10)
            if (r11 != r4) goto L3b
            goto L4b
        L3b:
            rf8 r11 = (defpackage.rf8) r11
            if (r11 == 0) goto L4c
            r10.c = r7
            r10.d = r7
            r10.b = r6
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r4) goto L4c
        L4b:
            r1 = r4
        L4c:
            return r1
        L4d:
            qv8 r0 = r10.c
            java.lang.Object r8 = r10.d
            int r9 = r10.b
            if (r9 == 0) goto L66
            if (r9 == r5) goto L62
            if (r9 != r6) goto L5d
            defpackage.hre.r(r11)
            goto L8f
        L5d:
            defpackage.vs.k(r3)
            r1 = r7
            goto L8f
        L62:
            defpackage.hre.r(r11)
            goto L7d
        L66:
            defpackage.hre.r(r11)
            boolean r11 = r8 instanceof defpackage.rf8
            if (r11 != 0) goto L6e
            goto L8f
        L6e:
            java.lang.Object r11 = r0.a
            r10.c = r0
            r10.d = r7
            r10.b = r5
            java.lang.Object r11 = r2.c(r11, r8, r10)
            if (r11 != r4) goto L7d
            goto L8e
        L7d:
            rf8 r11 = (defpackage.rf8) r11
            if (r11 != 0) goto L82
            goto L8f
        L82:
            r10.c = r7
            r10.d = r7
            r10.b = r6
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r4) goto L8f
        L8e:
            r1 = r4
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
