package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fz7  reason: default package */
/* loaded from: classes.dex */
public final class fz7 extends aab implements lu4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7(float f, float f2, y4a y4aVar, wz9 wz9Var, m42 m42Var) {
        super(2, m42Var);
        this.c = f;
        this.d = f2;
        this.e = y4aVar;
        this.f = wz9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                return new fz7(this.c, this.d, (y4a) obj3, (wz9) obj2, m42Var);
            default:
                return new fz7((qi8) obj3, (sk8) obj2, this.c, this.d, m42Var);
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
                return ((fz7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fz7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r10.f0(r9, r10.b.getValue(), r16) == r7) goto L31;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.a
            pvc r6 = defpackage.pvc.a
            java.lang.Object r1 = r4.f
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            n82 r7 = defpackage.n82.a
            java.lang.Object r5 = r4.e
            r8 = 1
            switch(r0) {
                case 0: goto L59;
                default: goto L13;
            }
        L13:
            r10 = r5
            qi8 r10 = (defpackage.qi8) r10
            int r0 = r4.b
            if (r0 == 0) goto L25
            if (r0 != r8) goto L20
            defpackage.hre.r(r17)
            goto L58
        L20:
            defpackage.vs.k(r3)
            r6 = r2
            goto L58
        L25:
            defpackage.hre.r(r17)
            dm8 r0 = r10.a
            float r11 = r0.h()
            dm8 r0 = r10.b
            float r12 = r0.h()
            dm8 r0 = r10.c
            float r14 = r0.h()
            sk8 r1 = (defpackage.sk8) r1
            java.lang.Object r0 = r1.g
            r2 = r0
            gxa r2 = (defpackage.gxa) r2
            rk8 r3 = new rk8
            float r13 = r4.c
            float r15 = r4.d
            r9 = r3
            r9.<init>()
            r4.b = r8
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = 4
            java.lang.Object r0 = defpackage.ote.l(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L58
            r6 = r7
        L58:
            return r6
        L59:
            r10 = r5
            y4a r10 = (defpackage.y4a) r10
            int r0 = r4.b
            float r5 = r4.d
            float r9 = r4.c
            r11 = 2
            if (r0 == 0) goto L76
            if (r0 == r8) goto L72
            if (r0 != r11) goto L6d
            defpackage.hre.r(r17)
            goto Lc7
        L6d:
            defpackage.vs.k(r3)
            r6 = r2
            goto Lc7
        L72:
            defpackage.hre.r(r17)
            goto L8d
        L76:
            defpackage.hre.r(r17)
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L8d
        L7e:
            r4.b = r8
            hm8 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r10.f0(r9, r0, r4)
            if (r0 != r7) goto L8d
            goto Lc6
        L8d:
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto Lc7
            wz9 r1 = (defpackage.wz9) r1
            r4.b = r11
            tkc r12 = r10.e
            if (r12 != 0) goto L9b
        L99:
            r0 = r6
            goto Lc4
        L9b:
            hm8 r0 = r10.c
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.c16.i(r0, r1)
            if (r0 == 0) goto Lb4
            hm8 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.c16.i(r0, r1)
            if (r0 == 0) goto Lb4
            goto L99
        Lb4:
            pw7 r0 = r10.H
            s4a r9 = new s4a
            r13 = 0
            r14 = 1
            r11 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Object r0 = defpackage.pw7.a(r0, r9, r4)
            if (r0 != r7) goto L99
        Lc4:
            if (r0 != r7) goto Lc7
        Lc6:
            r6 = r7
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7(qi8 qi8Var, sk8 sk8Var, float f, float f2, m42 m42Var) {
        super(2, m42Var);
        this.e = qi8Var;
        this.f = sk8Var;
        this.c = f;
        this.d = f2;
    }
}
