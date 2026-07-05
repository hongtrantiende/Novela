package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce  reason: default package */
/* loaded from: classes.dex */
public final class ce extends ti3 {
    public qe f0;
    public li4 g0;
    public r13 h0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Type inference failed for: r13v3, types: [wl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c2(defpackage.ce r11, float r12, defpackage.n42 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.zd
            if (r0 == 0) goto L13
            r0 = r13
            zd r0 = (defpackage.zd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zd r0 = new zd
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L35
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2a
            wl9 r11 = r0.a
            defpackage.hre.r(r13)
            goto L72
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L31:
            defpackage.hre.r(r13)
            return r13
        L35:
            defpackage.hre.r(r13)
            qe r13 = r11.f0
            r13.getClass()
            wl9 r13 = new wl9
            r13.<init>()
            r13.a = r12
            qe r1 = r11.f0
            be r4 = new be
            r9 = 0
            r4.<init>(r11, r13, r12, r9)
            r0.a = r13
            r0.d = r3
            ow7 r7 = r1.b
            ge r8 = new ge
            r8.<init>(r1, r4, r9, r2)
            r7.getClass()
            xr0 r5 = new xr0
            r10 = 13
            jw7 r6 = defpackage.jw7.a
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r11 = defpackage.k27.p(r5, r0)
            n82 r12 = defpackage.n82.a
            if (r11 != r12) goto L6c
            goto L6e
        L6c:
            pvc r11 = defpackage.pvc.a
        L6e:
            if (r11 != r12) goto L71
            return r12
        L71:
            r11 = r13
        L72:
            float r11 = r11.a
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.c2(ce, float, n42):java.lang.Object");
    }

    @Override // defpackage.ti3
    public final Object O1(si3 si3Var, si3 si3Var2) {
        qe qeVar = this.f0;
        wa waVar = new wa(si3Var, this, (m42) null);
        ow7 ow7Var = qeVar.b;
        ge geVar = new ge(qeVar, waVar, null, 1);
        ow7Var.getClass();
        Object p = k27.p(new xr0(jw7.a, ow7Var, geVar, (m42) null, 13), si3Var2);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (p != n82Var) {
            p = pvcVar;
        }
        if (p == n82Var) {
            return p;
        }
        return pvcVar;
    }

    @Override // defpackage.ti3
    public final void U1(th3 th3Var) {
        if (!this.J) {
            return;
        }
        z87.v(v1(), null, null, new l0(this, th3Var, null, 6), 3);
    }

    @Override // defpackage.ti3
    public final boolean Z1() {
        if (this.f0.h.getValue() != null) {
            return true;
        }
        return false;
    }

    public final boolean d2() {
        if (voe.v(this).W == tc6.b && this.M == ff8.b) {
            return true;
        }
        return false;
    }

    public final void e2() {
        arc arcVar = md.a;
        y4 y4Var = md.b;
        r13 r13Var = voe.v(this).V;
        this.h0 = r13Var;
        this.g0 = new sqa(new ij1(7, this.f0, y4Var, new od(r13Var, 0)), yd.b, arcVar);
    }

    @Override // defpackage.f03
    public final void p() {
        n0();
        if (this.J) {
            r13 r13Var = voe.v(this).V;
            r13 r13Var2 = this.h0;
            if (r13Var2 == null || !r13Var2.equals(r13Var)) {
                this.h0 = r13Var;
                e2();
            }
        }
    }

    @Override // defpackage.mq7
    public final void z1() {
        e2();
    }

    @Override // defpackage.ti3
    public final void T1(long j) {
    }
}
