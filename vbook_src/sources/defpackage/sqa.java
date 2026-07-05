package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sqa  reason: default package */
/* loaded from: classes.dex */
public final class sqa implements li4 {
    public final wqa a;
    public final pq2 b;
    public final xr c;
    public final l73 d = r2a.c;

    public sqa(wqa wqaVar, pq2 pq2Var, xr xrVar) {
        this.a = wqaVar;
        this.b = pq2Var;
        this.c = xrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.sqa r4, defpackage.i2a r5, float r6, float r7, defpackage.pqa r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.rqa
            if (r0 == 0) goto L14
            r0 = r9
            rqa r0 = (defpackage.rqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            rqa r0 = new rqa
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r0)
            goto L84
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r0)
            float r0 = java.lang.Math.abs(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L43
        L3b:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
        L43:
            r4 = 28
            es r4 = defpackage.yte.a(r6, r7, r4)
            return r4
        L4a:
            r9.c = r2
            pq2 r0 = r4.b
            float r1 = defpackage.obe.r(r0, r1, r7)
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L67
            uwd r4 = new uwd
            r1 = 15
            r4.<init>(r0, r1)
        L65:
            r0 = r6
            goto L70
        L67:
            l97 r0 = new l97
            xr r4 = r4.c
            r0.<init>(r4)
            r4 = r0
            goto L65
        L70:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.v(r5, r6, r7, r8, r9)
            n82 r4 = defpackage.n82.a
            if (r0 != r4) goto L84
            return r4
        L84:
            ur r0 = (defpackage.ur) r0
            es r4 = r0.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqa.b(sqa, i2a, float, float, pqa, n42):java.lang.Object");
    }

    @Override // defpackage.li4
    public Object a(i2a i2aVar, float f, m42 m42Var) {
        return d(i2aVar, f, nxe.d, (n42) m42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.i2a r10, float r11, defpackage.xt4 r12, defpackage.n42 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.oqa
            if (r0 == 0) goto L13
            r0 = r13
            oqa r0 = (defpackage.oqa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oqa r0 = new oqa
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            xt4 r12 = r0.a
            defpackage.hre.r(r13)
            goto L4b
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.hre.r(r13)
            vt2 r3 = new vt2
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.a = r6
            r0.d = r2
            l73 r9 = r4.d
            java.lang.Object r13 = defpackage.z87.E(r9, r3, r0)
            n82 r9 = defpackage.n82.a
            if (r13 != r9) goto L4a
            return r9
        L4a:
            r12 = r6
        L4b:
            ur r13 = (defpackage.ur) r13
            java.lang.Float r9 = new java.lang.Float
            r10 = 0
            r9.<init>(r10)
            r12.invoke(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqa.c(i2a, float, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.i2a r5, float r6, defpackage.xt4 r7, defpackage.n42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qqa
            if (r0 == 0) goto L13
            r0 = r8
            qqa r0 = (defpackage.qqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qqa r0 = new qqa
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r8)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r8)
            r0.c = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            n82 r4 = defpackage.n82.a
            if (r8 != r4) goto L3a
            return r4
        L3a:
            ur r8 = (defpackage.ur) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            es r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r4 = r5.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L54:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqa.d(i2a, float, xt4, n42):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sqa) {
            sqa sqaVar = (sqa) obj;
            if (c16.i(sqaVar.c, this.c) && c16.i(sqaVar.b, this.b) && c16.i(sqaVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.a.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }
}
