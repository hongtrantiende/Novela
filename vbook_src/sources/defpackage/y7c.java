package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y7c  reason: default package */
/* loaded from: classes.dex */
public final class y7c extends aab implements mu4 {
    public zc6 C;
    public uy5 D;
    public sw7 E;
    public long F;
    public int G;
    public float H;
    public tj4 a;
    public int b;
    public /* synthetic */ tj4 c;
    public /* synthetic */ Object[] d;
    public final /* synthetic */ k8c e;
    public final /* synthetic */ cd6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7c(m42 m42Var, k8c k8cVar, cd6 cd6Var) {
        super(3, m42Var);
        this.e = k8cVar;
        this.f = cd6Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        y7c y7cVar = new y7c((m42) obj3, this.e, this.f);
        y7cVar.c = (tj4) obj;
        y7cVar.d = (Object[]) obj2;
        return y7cVar.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
        if (r1.b(r14, r20) == r12) goto L17;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            tj4 r1 = r0.c
            java.lang.Object[] r2 = r0.d
            int r3 = r0.b
            k8c r4 = r0.e
            r10 = 2
            r5 = 1
            r11 = 0
            n82 r12 = defpackage.n82.a
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L20
            if (r3 != r10) goto L1a
            defpackage.hre.r(r21)
            goto Lbb
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r11
        L20:
            float r1 = r0.H
            int r2 = r0.G
            long r5 = r0.F
            sw7 r3 = r0.E
            uy5 r7 = r0.D
            zc6 r8 = r0.C
            tj4 r9 = r0.a
            defpackage.hre.r(r21)
            r16 = r8
            r8 = r7
            r7 = r16
            r18 = r1
            r16 = r5
            r1 = r9
        L3b:
            r19 = r2
            goto L94
        L3e:
            defpackage.hre.r(r21)
            r3 = 0
            r3 = r2[r3]
            r3.getClass()
            zy5 r3 = (defpackage.zy5) r3
            long r6 = r3.a
            r3 = r2[r5]
            r3.getClass()
            r8 = r3
            zc6 r8 = (defpackage.zc6) r8
            r3 = r2[r10]
            uy5 r3 = (defpackage.uy5) r3
            r9 = 3
            r9 = r2[r9]
            r9.getClass()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r13 = 4
            r2 = r2[r13]
            r2.getClass()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            sw7 r13 = r4.j
            r0.c = r11
            r0.d = r11
            r0.a = r1
            r0.C = r8
            r0.D = r3
            r0.E = r13
            r0.F = r6
            r0.G = r2
            r0.H = r9
            r0.b = r5
            java.lang.Object r5 = r13.o(r0)
            if (r5 != r12) goto L8c
            goto Lba
        L8c:
            r16 = r6
            r7 = r8
            r18 = r9
            r8 = r3
            r3 = r13
            goto L3b
        L94:
            cd6 r9 = r0.f     // Catch: java.lang.Throwable -> Lbe
            r5 = r16
            java.util.List r15 = defpackage.k8c.a(r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> Lbe
            r16 = r5
            r3.q(r11)
            ii0 r14 = new ii0
            r14.<init>(r15, r16, r18, r19)
            r0.c = r11
            r0.d = r11
            r0.a = r11
            r0.C = r11
            r0.D = r11
            r0.E = r11
            r0.b = r10
            java.lang.Object r0 = r1.b(r14, r0)
            if (r0 != r12) goto Lbb
        Lba:
            return r12
        Lbb:
            pvc r0 = defpackage.pvc.a
            return r0
        Lbe:
            r0 = move-exception
            r3.q(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
