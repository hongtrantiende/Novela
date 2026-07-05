package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bma  reason: default package */
/* loaded from: classes3.dex */
public final class bma extends aa5 {
    public int A;
    public int z;

    public static final void t(bma bmaVar, float f, float f2) {
        int j;
        int i = 0;
        if (f <= ((int) (bmaVar.j() >> 32)) / 2) {
            j = 0;
        } else {
            j = (int) (bmaVar.j() >> 32);
        }
        bmaVar.z = j;
        if (f2 > ((int) (bmaVar.j() & 4294967295L)) / 2) {
            i = (int) (bmaVar.j() & 4294967295L);
        }
        bmaVar.A = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.bma r12, float r13, float r14, float r15, float r16, int r17, defpackage.n42 r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.ama
            if (r2 == 0) goto L17
            r2 = r1
            ama r2 = (defpackage.ama) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            ama r2 = new ama
            r2.<init>(r12, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L31
            if (r3 != r5) goto L2b
            defpackage.hre.r(r1)
            goto Lb9
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r4
        L31:
            defpackage.hre.r(r1)
            lq r1 = new lq
            int r3 = java.lang.Float.floatToRawIntBits(r13)
            long r6 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r14)
            long r8 = (long) r3
            r3 = 32
            long r6 = r6 << r3
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r6 = r6 | r8
            y78 r8 = new y78
            r8.<init>(r6)
            drc r6 = defpackage.fca.k
            r7 = 12
            r1.<init>(r8, r6, r4, r7)
            float r13 = r15 - r13
            float r13 = java.lang.Math.abs(r13)
            float r14 = r16 - r14
            float r14 = java.lang.Math.abs(r14)
            r4 = 0
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 != 0) goto L72
            float r13 = (float) r0
            float r13 = r13 * r14
            long r6 = r12.j()
            long r6 = r6 & r10
            int r14 = (int) r6
            float r14 = (float) r14
            float r13 = r13 / r14
            goto L7d
        L72:
            float r14 = (float) r0
            float r14 = r14 * r13
            long r6 = r12.j()
            long r6 = r6 >> r3
            int r13 = (int) r6
            float r13 = (float) r13
            float r13 = r14 / r13
        L7d:
            int r14 = java.lang.Float.floatToRawIntBits(r15)
            long r6 = (long) r14
            int r14 = java.lang.Float.floatToRawIntBits(r16)
            long r8 = (long) r14
            long r3 = r6 << r3
            long r6 = r8 & r10
            long r3 = r3 | r6
            y78 r14 = new y78
            r14.<init>(r3)
            int r13 = (int) r13
            rd2 r0 = defpackage.on3.b
            r3 = 2
            r4 = 0
            arc r13 = defpackage.tte.x(r13, r4, r0, r3)
            ux9 r0 = new ux9
            r3 = 13
            r0.<init>(r12, r3)
            r2.c = r5
            r12 = 0
            r3 = 4
            r15 = r14
            r14 = r13
            r13 = r15
            r15 = r12
            r16 = r0
            r12 = r1
            r17 = r2
            r18 = r3
            java.lang.Object r12 = defpackage.lq.c(r12, r13, r14, r15, r16, r17, r18)
            n82 r13 = defpackage.n82.a
            if (r12 != r13) goto Lb9
            return r13
        Lb9:
            pvc r12 = defpackage.pvc.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bma.u(bma, float, float, float, float, int, n42):java.lang.Object");
    }

    @Override // defpackage.aa5, defpackage.h2a
    public final void b(float f, float f2) {
        fi8 f3;
        if (this.v) {
            if (this.c < nae.e) {
                this.c = f;
            }
            if (this.d < nae.e) {
                this.d = f2;
            }
            float e = f - e();
            fi8 f4 = f();
            fi8 fi8Var = fi8.b;
            fi8 fi8Var2 = fi8.c;
            fi8 fi8Var3 = fi8.a;
            if (f4 == fi8Var3) {
                if (f > this.p) {
                    f3 = fi8Var2;
                } else {
                    f3 = fi8Var;
                }
            } else {
                f3 = f();
            }
            v(f, f2, f3);
            if (f() == fi8Var3) {
                if (f3 == fi8Var && !g()) {
                    this.v = false;
                    return;
                } else if (f3 == fi8Var2 && !h()) {
                    this.v = false;
                    return;
                } else {
                    f3.getClass();
                    this.k.setValue(f3);
                    this.n = f3;
                }
            }
            if (Math.abs(e) >= this.o) {
                if (e > nae.e) {
                    fi8Var = fi8Var2;
                }
                this.n = fi8Var;
            }
        }
    }

    @Override // defpackage.h2a
    public final void c() {
        this.v = false;
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            iyaVar = z87.v(m82Var, null, null, new rr0(this, (m42) null, 11), 3);
        }
        this.w = iyaVar;
    }

    @Override // defpackage.aa5, defpackage.h2a
    public final pvc l(boolean z, y78 y78Var) {
        bma bmaVar;
        boolean g = g();
        pvc pvcVar = pvc.a;
        if (!g) {
            return pvcVar;
        }
        q();
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            bmaVar = this;
            iyaVar = z87.v(m82Var, ab3.a, null, new zla(z, bmaVar, y78Var, null, 0), 2);
        } else {
            bmaVar = this;
        }
        bmaVar.x = iyaVar;
        return pvcVar;
    }

    @Override // defpackage.aa5, defpackage.h2a
    public final pvc m(boolean z, y78 y78Var) {
        bma bmaVar;
        boolean h = h();
        pvc pvcVar = pvc.a;
        if (!h) {
            return pvcVar;
        }
        q();
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            bmaVar = this;
            iyaVar = z87.v(m82Var, ab3.a, null, new zla(z, bmaVar, y78Var, null, 1), 2);
        } else {
            bmaVar = this;
        }
        bmaVar.x = iyaVar;
        return pvcVar;
    }

    @Override // defpackage.aa5, defpackage.h2a
    public final void p(float f, float f2) {
        bma bmaVar;
        int d = d();
        this.v = false;
        if (d < 0) {
            return;
        }
        q();
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            bmaVar = this;
            iyaVar = z87.v(m82Var, ab3.a, null, new z95(bmaVar, f, f2, null, 2), 2);
        } else {
            bmaVar = this;
        }
        bmaVar.x = iyaVar;
    }

    public final void v(float f, float f2, fi8 fi8Var) {
        if ((this.d > ((int) (j() & 4294967295L)) / 3 && this.d < (((int) (j() & 4294967295L)) * 2) / 3) || fi8Var == fi8.c) {
            f2 = (int) (j() & 4294967295L);
        }
        if (this.d > ((int) (j() & 4294967295L)) / 3 && this.d < ((int) (j() & 4294967295L)) / 2 && fi8Var == fi8.b) {
            f2 = 1.0f;
        }
        n(f);
        o(f2);
    }
}
