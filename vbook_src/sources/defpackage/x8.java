package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x8  reason: default package */
/* loaded from: classes3.dex */
public final class x8 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ qv8 c;
    public /* synthetic */ oh5 d;
    public final /* synthetic */ lu4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(lu4 lu4Var, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.e = lu4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.e;
        qv8 qv8Var = (qv8) obj;
        oh5 oh5Var = (oh5) obj2;
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                x8 x8Var = new x8(lu4Var, m42Var, 0);
                x8Var.c = qv8Var;
                x8Var.d = oh5Var;
                return x8Var.invokeSuspend(pvcVar);
            default:
                x8 x8Var2 = new x8(lu4Var, m42Var, 1);
                x8Var2.c = qv8Var;
                x8Var2.d = oh5Var;
                return x8Var2.invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r11 == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
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
            lu4 r2 = r10.e
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            n82 r4 = defpackage.n82.a
            r5 = 1
            r6 = 2
            r7 = 0
            switch(r0) {
                case 0: goto L4b;
                default: goto L10;
            }
        L10:
            qv8 r0 = r10.c
            oh5 r8 = r10.d
            int r9 = r10.b
            if (r9 == 0) goto L29
            if (r9 == r5) goto L25
            if (r9 != r6) goto L20
            defpackage.hre.r(r11)
            goto L4a
        L20:
            defpackage.vs.k(r3)
            r1 = r7
            goto L4a
        L25:
            defpackage.hre.r(r11)
            goto L39
        L29:
            defpackage.hre.r(r11)
            r10.c = r0
            r10.d = r7
            r10.b = r5
            java.lang.Object r11 = r2.invoke(r8, r10)
            if (r11 != r4) goto L39
            goto L49
        L39:
            oh5 r11 = (defpackage.oh5) r11
            if (r11 == 0) goto L4a
            r10.c = r7
            r10.d = r7
            r10.b = r6
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r4) goto L4a
        L49:
            r1 = r4
        L4a:
            return r1
        L4b:
            qv8 r0 = r10.c
            oh5 r8 = r10.d
            int r9 = r10.b
            if (r9 == 0) goto L64
            if (r9 == r5) goto L60
            if (r9 != r6) goto L5b
            defpackage.hre.r(r11)
            goto L85
        L5b:
            defpackage.vs.k(r3)
            r1 = r7
            goto L85
        L60:
            defpackage.hre.r(r11)
            goto L74
        L64:
            defpackage.hre.r(r11)
            r10.c = r0
            r10.d = r7
            r10.b = r5
            java.lang.Object r11 = r2.invoke(r8, r10)
            if (r11 != r4) goto L74
            goto L84
        L74:
            oh5 r11 = (defpackage.oh5) r11
            if (r11 == 0) goto L85
            r10.c = r7
            r10.d = r7
            r10.b = r6
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r4) goto L85
        L84:
            r1 = r4
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
