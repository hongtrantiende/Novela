package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tya  reason: default package */
/* loaded from: classes3.dex */
public final class tya implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl9 b;
    public final /* synthetic */ tj4 c;

    public /* synthetic */ tya(vl9 vl9Var, tj4 tj4Var, int i) {
        this.a = i;
        this.b = vl9Var;
        this.c = tj4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r5, defpackage.m42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.sya
            if (r0 == 0) goto L13
            r0 = r6
            sya r0 = (defpackage.sya) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sya r0 = new sya
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.hre.r(r6)
            return r2
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            if (r5 <= 0) goto L4a
            vl9 r5 = r4.b
            boolean r6 = r5.a
            if (r6 != 0) goto L4a
            r5.a = r3
            r0.c = r3
            tj4 r4 = r4.c
            tha r5 = defpackage.tha.a
            java.lang.Object r4 = r4.b(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L4a
            return r5
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tya.a(int, m42):java.lang.Object");
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return a(((Number) obj).intValue(), m42Var);
            default:
                long j = ((zy5) obj).a;
                if (!zy5.b(j, 0L)) {
                    this.b.a = true;
                }
                return this.c.b(new zy5(j), m42Var);
        }
    }
}
