package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kmc  reason: default package */
/* loaded from: classes3.dex */
public final class kmc implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rmc b;

    public /* synthetic */ kmc(rmc rmcVar, int i) {
        this.a = i;
        this.b = rmcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (defpackage.rmc.j(r6, r0) == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, defpackage.m42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jmc
            if (r0 == 0) goto L13
            r0 = r8
            jmc r0 = (defpackage.jmc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            jmc r0 = new jmc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            rmc r6 = r6.b
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            rmc r7 = r0.b
            java.lang.String r0 = r0.a
            defpackage.hre.r(r8)
            goto L63
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L37:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L50
        L3d:
            defpackage.hre.r(r8)
            r6.o()
            r6.E = r7
            r0.a = r7
            r0.e = r4
            java.lang.Object r8 = defpackage.rmc.j(r6, r0)
            if (r8 != r5) goto L50
            goto L60
        L50:
            zmc r8 = r6.C
            if (r8 == 0) goto L67
            r0.a = r7
            r0.b = r6
            r0.e = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r5) goto L61
        L60:
            return r5
        L61:
            r0 = r7
            r7 = r6
        L63:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            goto L69
        L67:
            r0 = r7
            r7 = r6
        L69:
            if (r2 != 0) goto L6d
            ks3 r2 = defpackage.ks3.a
        L6d:
            r7.F = r2
            cza r6 = r6.J
            r6.m(r0)
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmc.a(java.lang.String, m42):java.lang.Object");
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        rmc rmcVar = this.b;
        switch (i) {
            case 0:
                return a((String) obj, m42Var);
            case 1:
                String str = (String) obj;
                if (rmcVar.Q) {
                    rmcVar.y();
                } else {
                    rmcVar.P = true;
                }
                return pvcVar;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cza czaVar = rmcVar.d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, amc.a((amc) value, false, booleanValue, false, false, null, null, null, null, 253)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
