package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: di2  reason: default package */
/* loaded from: classes3.dex */
public final class di2 {
    public final ng2 a;

    public di2(ng2 ng2Var, int i) {
        switch (i) {
            case 1:
                ng2Var.getClass();
                this.a = ng2Var;
                return;
            default:
                this.a = ng2Var;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.n42 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ih2
            if (r0 == 0) goto L13
            r0 = r10
            ih2 r0 = (defpackage.ih2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ih2 r0 = new ih2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            n82 r3 = defpackage.n82.a
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3d
            if (r1 == r5) goto L37
            if (r1 != r4) goto L31
            java.util.Iterator r9 = r0.b
            java.util.Iterator r9 = (java.util.Iterator) r9
            di2 r1 = r0.a
            defpackage.hre.r(r10)
            goto L53
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r2
        L37:
            di2 r9 = r0.a
            defpackage.hre.r(r10)
            goto L4b
        L3d:
            defpackage.hre.r(r10)
            r0.a = r9
            r0.e = r5
            java.lang.Object r10 = r9.b(r0)
            if (r10 != r3) goto L4b
            goto L7c
        L4b:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = r9
            r9 = r10
        L53:
            boolean r10 = r9.hasNext()
            pvc r5 = defpackage.pvc.a
            if (r10 == 0) goto L7d
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            r0.a = r1
            r6 = r9
            java.util.Iterator r6 = (java.util.Iterator) r6
            r0.b = r6
            r0.e = r4
            ng2 r6 = r1.a
            db r7 = new db
            r8 = 12
            r7.<init>(r10, r2, r8)
            java.lang.Object r10 = defpackage.y9e.o(r6, r7, r0)
            if (r10 != r3) goto L7a
            r5 = r10
        L7a:
            if (r5 != r3) goto L53
        L7c:
            return r3
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di2.a(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[LOOP:0: B:18:0x005b->B:20:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ai2
            if (r0 == 0) goto L13
            r0 = r5
            ai2 r0 = (defpackage.ai2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ai2 r0 = new ai2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L40
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            ng2 r4 = r4.a
            sj4 r4 = r4.getData()
            r0.c = r2
            java.lang.Object r5 = defpackage.z1d.C(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L40
            return r4
        L40:
            pv7 r5 = (defpackage.pv7) r5
            java.util.Map r4 = r5.a()
            java.util.Set r4 = r4.keySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r4.next()
            e49 r0 = (defpackage.e49) r0
            java.lang.String r0 = r0.a
            r5.add(r0)
            goto L5b
        L6d:
            java.util.Set r4 = defpackage.sl1.H0(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di2.b(n42):java.lang.Object");
    }
}
