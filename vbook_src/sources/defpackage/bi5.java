package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bi5  reason: default package */
/* loaded from: classes3.dex */
public final class bi5 extends aab implements mu4 {
    public int a;
    public int b;
    public /* synthetic */ qv8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ci5 e;
    public final /* synthetic */ re5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi5(ci5 ci5Var, re5 re5Var, m42 m42Var) {
        super(3, m42Var);
        this.e = ci5Var;
        this.f = re5Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        bi5 bi5Var = new bi5(this.e, this.f, (m42) obj3);
        bi5Var.c = (qv8) obj;
        bi5Var.d = obj2;
        return bi5Var.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r11 != r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (r0.d(r10, (defpackage.te5) r11) == r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[LOOP:0: B:22:0x007b->B:24:0x0081, LOOP_END] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            qv8 r0 = r10.c
            java.lang.Object r1 = r10.d
            int r2 = r10.b
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L16
            defpackage.hre.r(r11)
            goto Lae
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r5
        L1c:
            int r1 = r10.a
            defpackage.hre.r(r11)
            goto L9d
        L23:
            defpackage.hre.r(r11)
            boolean r11 = r1 instanceof defpackage.rf8
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r0.a
            r2 = r11
            gh5 r2 = (defpackage.gh5) r2
            r2.getClass()
            r2.d = r1
            r2.b(r5)
            gh5 r11 = (defpackage.gh5) r11
            uy1 r1 = r11.f
            h40 r2 = defpackage.mh5.a
            java.lang.Object r1 = r1.e(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 20
            ci5 r7 = r10.e
            if (r1 == 0) goto L66
            int r8 = r1.intValue()
            r7.getClass()
            if (r8 < r2) goto L66
            int r2 = r1.intValue()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r8) goto L61
            int r1 = r1.intValue()
            int r1 = r1 + r4
            goto L6a
        L61:
            int r1 = r1.intValue()
            goto L6a
        L66:
            r7.getClass()
            r1 = r2
        L6a:
            zh5 r2 = new zh5
            re5 r8 = r10.f
            r2.<init>(r1, r8)
            java.util.ArrayList r7 = r7.a
            java.util.List r7 = defpackage.sl1.p0(r7)
            java.util.Iterator r7 = r7.iterator()
        L7b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8e
            java.lang.Object r8 = r7.next()
            mu4 r8 = (defpackage.mu4) r8
            ai5 r9 = new ai5
            r9.<init>(r8, r2)
            r2 = r9
            goto L7b
        L8e:
            r10.c = r0
            r10.d = r5
            r10.a = r1
            r10.b = r4
            java.lang.Object r11 = r2.a(r11, r10)
            if (r11 != r6) goto L9d
            goto Lad
        L9d:
            te5 r11 = (defpackage.te5) r11
            r10.c = r5
            r10.d = r5
            r10.a = r1
            r10.b = r3
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r6) goto Lae
        Lad:
            return r6
        Lae:
            pvc r10 = defpackage.pvc.a
            return r10
        Lb1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "\n|Fail to prepare request body for sending. \n|The body type is: "
            r10.<init>(r11)
            java.lang.Class r11 = r1.getClass()
            gi1 r11 = defpackage.cm9.a(r11)
            r10.append(r11)
            java.lang.String r11 = ", with Content-Type: "
            r10.append(r11)
            java.lang.Object r11 = r0.a
            gh5 r11 = (defpackage.gh5) r11
            e32 r11 = defpackage.oue.A(r11)
            r10.append(r11)
            java.lang.String r11 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = defpackage.l4b.z(r10)
            defpackage.cy7.a(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
