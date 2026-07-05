package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iz0  reason: default package */
/* loaded from: classes3.dex */
public final class iz0 implements u27 {
    public final x44 a;
    public final d56 b = n4f.k();

    public iz0(x44 x44Var) {
        this.a = x44Var;
    }

    @Override // defpackage.u27
    public final d56 a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // defpackage.u27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.d56 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hz0
            if (r0 == 0) goto L13
            r0 = r6
            hz0 r0 = (defpackage.hz0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hz0 r0 = new hz0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L40
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            java.lang.String r5 = r5.toString()
            r0.c = r2
            x44 r4 = r4.a
            java.io.Serializable r6 = r4.a(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L40
            return r4
        L40:
            byte[] r6 = (byte[]) r6
            java.lang.String r4 = defpackage.kxe.m(r6)
            d56 r4 = defpackage.qye.l(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz0.b(d56, n42):java.lang.Object");
    }

    @Override // defpackage.u27
    public final String getDescription() {
        return "Package an extension dev payload into a plugin zip, returned as base64.";
    }

    @Override // defpackage.u27
    public final String getName() {
        return "buildExtension";
    }
}
