package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wba  reason: default package */
/* loaded from: classes.dex */
public final class wba {
    public final fea a;
    public final fea b;

    public wba(fea feaVar, fea feaVar2) {
        feaVar.getClass();
        feaVar2.getClass();
        this.a = feaVar;
        this.b = feaVar2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r5.a.a(r0) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r5.b.a(r0) != r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.vba
            if (r0 == 0) goto L13
            r0 = r6
            vba r0 = (defpackage.vba) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vba r0 = new vba
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
            fea r6 = r5.a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.c = r2
            fea r5 = r5.b
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wba.b(n42):java.lang.Object");
    }
}
