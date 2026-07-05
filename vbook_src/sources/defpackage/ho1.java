package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ho1  reason: default package */
/* loaded from: classes.dex */
public final class ho1 extends aab implements lu4 {
    public long a;
    public long b;
    public int c;
    public final /* synthetic */ io1 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho1(io1 io1Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.d = io1Var;
        this.e = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new ho1(this.d, this.e, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ho1) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (defpackage.ade.q(40, r11) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (defpackage.ade.q(r5 - r7, r11) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        return r4;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.c
            r1 = 2
            io1 r2 = r11.d
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L19
            if (r0 != r1) goto L12
            defpackage.hre.r(r12)
            goto L5a
        L12:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L19:
            long r5 = r11.b
            long r7 = r11.a
            defpackage.hre.r(r12)
            goto L42
        L21:
            defpackage.hre.r(r12)
            tza r12 = defpackage.dy1.t
            java.lang.Object r12 = defpackage.nye.q(r2, r12)
            ucd r12 = (defpackage.ucd) r12
            r12.getClass()
            long r5 = r12.a()
            r7 = 40
            r11.a = r7
            r11.b = r5
            r11.c = r3
            java.lang.Object r12 = defpackage.ade.q(r7, r11)
            if (r12 != r4) goto L42
            goto L59
        L42:
            cv7 r12 = r2.k0
            long r9 = r11.e
            java.lang.Object r12 = r12.e(r9)
            fo1 r12 = (defpackage.fo1) r12
            if (r12 == 0) goto L50
            r12.b = r3
        L50:
            long r5 = r5 - r7
            r11.c = r1
            java.lang.Object r11 = defpackage.ade.q(r5, r11)
            if (r11 != r4) goto L5a
        L59:
            return r4
        L5a:
            vt4 r11 = r2.S
            r11.invoke()
            pvc r11 = defpackage.pvc.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
