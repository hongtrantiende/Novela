package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj4  reason: default package */
/* loaded from: classes.dex */
public final class gj4 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final lq e;
    public ez5 f;
    public ez5 g;

    public gj4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new lq(new rg3(f), fca.h, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, pvc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ez5 r6, defpackage.n42 r7) {
        /*
            r5 = this;
            lq r0 = r5.e
            boolean r1 = r7 instanceof defpackage.ej4
            if (r1 == 0) goto L15
            r1 = r7
            ej4 r1 = (defpackage.ej4) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            ej4 r1 = new ej4
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.b
            int r2 = r1.d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ez5 r6 = r1.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r7 = move-exception
            goto L72
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L32:
            defpackage.hre.r(r7)
            boolean r7 = r6 instanceof defpackage.l59
            if (r7 == 0) goto L3c
            float r7 = r5.b
            goto L4c
        L3c:
            boolean r7 = r6 instanceof defpackage.ga5
            if (r7 == 0) goto L43
            float r7 = r5.c
            goto L4c
        L43:
            boolean r7 = r6 instanceof defpackage.jm4
            if (r7 == 0) goto L4a
            float r7 = r5.d
            goto L4c
        L4a:
            float r7 = r5.a
        L4c:
            r5.g = r6
            hm8 r2 = r0.e     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L29
            rg3 r2 = (defpackage.rg3) r2     // Catch: java.lang.Throwable -> L29
            float r2 = r2.a     // Catch: java.lang.Throwable -> L29
            boolean r2 = defpackage.rg3.b(r2, r7)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L6d
            ez5 r2 = r5.f     // Catch: java.lang.Throwable -> L29
            r1.a = r6     // Catch: java.lang.Throwable -> L29
            r1.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = defpackage.ip3.a(r0, r7, r2, r6, r1)     // Catch: java.lang.Throwable -> L29
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L6d
            return r0
        L6d:
            r5.f = r6
            pvc r5 = defpackage.pvc.a
            return r5
        L72:
            r5.f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj4.a(ez5, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fj4
            if (r0 == 0) goto L13
            r0 = r5
            fj4 r0 = (defpackage.fj4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fj4 r0 = new fj4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r5)     // Catch: java.lang.Throwable -> L25
            goto L6c
        L25:
            r5 = move-exception
            goto L71
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            ez5 r5 = r4.g
            boolean r1 = r5 instanceof defpackage.l59
            if (r1 == 0) goto L3a
            float r5 = r4.b
            goto L4a
        L3a:
            boolean r1 = r5 instanceof defpackage.ga5
            if (r1 == 0) goto L41
            float r5 = r4.c
            goto L4a
        L41:
            boolean r5 = r5 instanceof defpackage.jm4
            if (r5 == 0) goto L48
            float r5 = r4.d
            goto L4a
        L48:
            float r5 = r4.a
        L4a:
            lq r1 = r4.e
            hm8 r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            rg3 r3 = (defpackage.rg3) r3
            float r3 = r3.a
            boolean r3 = defpackage.rg3.b(r3, r5)
            if (r3 != 0) goto L76
            rg3 r3 = new rg3     // Catch: java.lang.Throwable -> L25
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            r0.c = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r1.g(r0, r3)     // Catch: java.lang.Throwable -> L25
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L6c
            return r0
        L6c:
            ez5 r5 = r4.g
            r4.f = r5
            goto L76
        L71:
            ez5 r0 = r4.g
            r4.f = r0
            throw r5
        L76:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj4.b(n42):java.lang.Object");
    }
}
