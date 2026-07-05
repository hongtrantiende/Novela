package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o51  reason: default package */
/* loaded from: classes3.dex */
public final class o51 extends xa1 {
    public final lu4 e;

    public o51(lu4 lu4Var, d82 d82Var, int i, py0 py0Var) {
        super(lu4Var, d82Var, i, py0Var);
        this.e = lu4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.xa1, defpackage.wa1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.y69 r5, defpackage.m42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.n51
            if (r0 == 0) goto L13
            r0 = r6
            n51 r0 = (defpackage.n51) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            n51 r0 = new n51
            n42 r6 = (defpackage.n42) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            y69 r5 = r0.a
            defpackage.hre.r(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L30:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = super.h(r5, r0)
            n82 r6 = defpackage.n82.a
            if (r4 != r6) goto L40
            return r6
        L40:
            xy0 r4 = r5.f
            boolean r4 = r4.G()
            if (r4 == 0) goto L4b
            pvc r4 = defpackage.pvc.a
            return r4
        L4b:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.vs.k(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o51.h(y69, m42):java.lang.Object");
    }

    @Override // defpackage.xa1, defpackage.wa1
    public final wa1 i(d82 d82Var, int i, py0 py0Var) {
        return new o51(this.e, d82Var, i, py0Var);
    }
}
