package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lba  reason: default package */
/* loaded from: classes.dex */
public final class lba implements gba {
    public final sw7 a = new sw7();
    public final kba b = new kba(this);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r9.o(r0) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lu4 r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.hba
            if (r0 == 0) goto L13
            r0 = r9
            hba r0 = (defpackage.hba) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            hba r0 = new hba
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.a
            qw7 r7 = (defpackage.qw7) r7
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L78
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L37:
            sw7 r7 = r0.c
            aab r8 = r0.b
            lu4 r8 = (defpackage.lu4) r8
            java.lang.Object r1 = r0.a
            lba r1 = (defpackage.lba) r1
            defpackage.hre.r(r9)
            r9 = r7
            r7 = r1
            goto L5e
        L47:
            defpackage.hre.r(r9)
            r0.a = r7
            r9 = r8
            aab r9 = (defpackage.aab) r9
            r0.b = r9
            sw7 r9 = r7.a
            r0.c = r9
            r0.f = r3
            java.lang.Object r1 = r9.o(r0)
            if (r1 != r5) goto L5e
            goto L6e
        L5e:
            kba r7 = r7.b     // Catch: java.lang.Throwable -> L76
            r0.a = r9     // Catch: java.lang.Throwable -> L76
            r0.b = r4     // Catch: java.lang.Throwable -> L76
            r0.c = r4     // Catch: java.lang.Throwable -> L76
            r0.f = r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L76
            if (r7 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r6 = r9
            r9 = r7
            r7 = r6
        L72:
            r7.q(r4)
            return r9
        L76:
            r8 = move-exception
            r7 = r9
        L78:
            r7.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lba.a(lu4, n42):java.lang.Object");
    }
}
