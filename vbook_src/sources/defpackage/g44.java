package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g44  reason: default package */
/* loaded from: classes3.dex */
public final class g44 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ i44 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g44(i44 i44Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = i44Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        i44 i44Var = this.c;
        switch (i) {
            case 0:
                return new g44(i44Var, m42Var, 0);
            case 1:
                return new g44(i44Var, m42Var, 1);
            default:
                return new g44(i44Var, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((g44) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((g44) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((g44) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (((defpackage.sj4) r11).a(r0, r10) == r5) goto L28;
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
            r1 = 0
            i44 r2 = r10.c
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            n82 r5 = defpackage.n82.a
            pvc r6 = defpackage.pvc.a
            r7 = 1
            switch(r0) {
                case 0: goto L92;
                case 1: goto L31;
                default: goto L10;
            }
        L10:
            int r0 = r10.b
            if (r0 == 0) goto L1f
            if (r0 != r7) goto L1b
            defpackage.hre.r(r11)
        L19:
            r3 = r6
            goto L30
        L1b:
            defpackage.vs.k(r4)
            goto L30
        L1f:
            defpackage.hre.r(r11)
            n64 r11 = r2.d
            java.lang.String r0 = r2.c
            r10.b = r7
            c74 r11 = (defpackage.c74) r11
            r11.a(r0)
            if (r6 != r5) goto L19
            r3 = r5
        L30:
            return r3
        L31:
            int r0 = r10.b
            r8 = 2
            if (r0 == 0) goto L46
            if (r0 == r7) goto L42
            if (r0 != r8) goto L3e
            defpackage.hre.r(r11)
            goto L90
        L3e:
            defpackage.vs.k(r4)
            goto L91
        L42:
            defpackage.hre.r(r11)
            goto L7f
        L46:
            defpackage.hre.r(r11)
            n64 r11 = r2.d
            java.lang.String r0 = r2.c
            r10.b = r7
            c74 r11 = (defpackage.c74) r11
            ii2 r11 = r11.a
            lm2 r11 = r11.J
            r11.getClass()
            r0.getClass()
            yn2 r3 = defpackage.yn2.a
            dk2 r3 = new dk2
            hn2 r4 = new hn2
            r9 = 24
            r4.<init>(r9)
            r3.<init>(r11, r0, r4, r1)
            s02 r11 = defpackage.v9e.O(r3)
            sw2 r0 = defpackage.ab3.a
            ru2 r0 = defpackage.ru2.c
            sl4 r11 = defpackage.v9e.z(r11, r0)
            hs0 r0 = new hs0
            r1 = 5
            r0.<init>(r11, r1)
            if (r0 != r5) goto L7e
            goto L8e
        L7e:
            r11 = r0
        L7f:
            sj4 r11 = (defpackage.sj4) r11
            f44 r0 = new f44
            r0.<init>(r2, r7)
            r10.b = r8
            java.lang.Object r10 = r11.a(r0, r10)
            if (r10 != r5) goto L90
        L8e:
            r3 = r5
            goto L91
        L90:
            r3 = r6
        L91:
            return r3
        L92:
            int r0 = r10.b
            if (r0 == 0) goto La0
            if (r0 != r7) goto L9c
            defpackage.hre.r(r11)
            goto Lbc
        L9c:
            defpackage.vs.k(r4)
            goto Lbd
        La0:
            defpackage.hre.r(r11)
            n64 r11 = r2.d
            java.lang.String r0 = r2.c
            c74 r11 = (defpackage.c74) r11
            hg3 r11 = r11.e(r0)
            f44 r0 = new f44
            r0.<init>(r2, r1)
            r10.b = r7
            java.lang.Object r10 = r11.a(r0, r10)
            if (r10 != r5) goto Lbc
            r3 = r5
            goto Lbd
        Lbc:
            r3 = r6
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g44.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
