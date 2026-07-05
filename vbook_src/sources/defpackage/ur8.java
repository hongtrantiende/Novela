package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ur8  reason: default package */
/* loaded from: classes3.dex */
public final class ur8 extends aab implements lu4 {
    public ch8 a;
    public float b;
    public float c;
    public int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ zg8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur8(int i, zg8 zg8Var, m42 m42Var) {
        super(2, m42Var);
        this.e = i;
        this.f = zg8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new ur8(this.e, this.f, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ur8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r15 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.d
            r1 = 0
            zg8 r2 = r14.f
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1d
            if (r0 != r3) goto L17
            float r0 = r14.c
            float r14 = r14.b
            defpackage.hre.r(r15)
            goto L5d
        L17:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            return r1
        L1d:
            ch8 r0 = r14.a
            defpackage.hre.r(r15)
            goto L38
        L23:
            defpackage.hre.r(r15)
            ch8 r0 = new ch8
            int r15 = r14.e
            r0.<init>(r15)
            r14.a = r0
            r14.d = r4
            java.lang.Object r15 = r2.E0(r0, r14)
            if (r15 != r5) goto L38
            goto L59
        L38:
            dh8 r15 = (defpackage.dh8) r15
            int r4 = r15.a
            float r4 = (float) r4
            int r15 = r15.b
            float r15 = (float) r15
            r6 = 0
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 <= 0) goto Lc1
            int r6 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r6 > 0) goto L4b
            goto Lc1
        L4b:
            r14.a = r1
            r14.b = r4
            r14.c = r15
            r14.d = r3
            java.lang.Object r14 = r2.u0(r0, r14)
            if (r14 != r5) goto L5a
        L59:
            return r5
        L5a:
            r0 = r15
            r15 = r14
            r14 = r4
        L5d:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = defpackage.tl1.s(r15, r2)
            r1.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L6e:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto Lc0
            java.lang.Object r3 = r15.next()
            fh8 r3 = (defpackage.fh8) r3
            int r4 = r3.a
            int r5 = r3.b
            java.util.List r3 = r3.c
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = defpackage.tl1.s(r3, r2)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L8d:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto Lb7
            java.lang.Object r7 = r3.next()
            gh8 r7 = (defpackage.gh8) r7
            or8 r8 = new or8
            java.lang.String r9 = r7.a
            pr8 r10 = new pr8
            eh8 r7 = r7.b
            float r11 = r7.a
            float r11 = r11 / r14
            float r12 = r7.b
            float r12 = r12 / r0
            float r13 = r7.c
            float r13 = r13 / r14
            float r7 = r7.d
            float r7 = r7 / r0
            r10.<init>(r11, r12, r13, r7)
            r8.<init>(r9, r10)
            r6.add(r8)
            goto L8d
        Lb7:
            nr8 r3 = new nr8
            r3.<init>(r6, r4, r5)
            r1.add(r3)
            goto L6e
        Lc0:
            return r1
        Lc1:
            ks3 r14 = defpackage.ks3.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
