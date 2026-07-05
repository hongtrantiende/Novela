package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bk1  reason: default package */
/* loaded from: classes3.dex */
public final class bk1 implements f31 {
    public final i11 b;
    public final h21 c;

    public bk1(i11 i11Var, h21 h21Var) {
        this.b = i11Var;
        this.c = h21Var;
    }

    @Override // defpackage.f31
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.f31
    public final Throwable b() {
        return this.b.b();
    }

    @Override // defpackage.f31
    public final Object c(n42 n42Var) {
        return this.b.c(n42Var);
    }

    @Override // defpackage.f31
    public final boolean d() {
        return this.b.d();
    }

    @Override // defpackage.f31
    public final zma f() {
        return this.b.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r5.b.g(r0) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r5.c.invoke(r0) != r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // defpackage.f31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.m42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ak1
            if (r0 == 0) goto L13
            r0 = r6
            ak1 r0 = (defpackage.ak1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ak1 r0 = new ak1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L31:
            defpackage.hre.r(r6)
            goto L43
        L35:
            defpackage.hre.r(r6)
            r0.c = r3
            i11 r6 = r5.b
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.c = r2
            h21 r5 = r5.c
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk1.g(m42):java.lang.Object");
    }

    @Override // defpackage.f31
    public final boolean j() {
        return this.b.b;
    }
}
