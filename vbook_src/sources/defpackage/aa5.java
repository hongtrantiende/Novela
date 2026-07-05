package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aa5  reason: default package */
/* loaded from: classes3.dex */
public abstract class aa5 extends h2a {
    public boolean v;
    public iya w;
    public iya x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa5(kj6 kj6Var) {
        super(kj6Var);
        kj6Var.getClass();
        this.y = true;
    }

    public static arc r(float f, float f2, int i) {
        return tte.x((int) ((Math.abs(f2 - f) * 400.0f) / i), 0, null, 6);
    }

    @Override // defpackage.h2a
    public void b(float f, float f2) {
        fi8 fi8Var;
        if (this.v) {
            if (this.c < nae.e) {
                this.c = f;
            }
            if (this.d < nae.e) {
                this.d = f2;
            }
            float e = f - e();
            n(f);
            o(f2);
            fi8 f3 = f();
            fi8 fi8Var2 = fi8.a;
            fi8 fi8Var3 = fi8.b;
            fi8 fi8Var4 = fi8.c;
            if (f3 == fi8Var2) {
                if (f > this.p) {
                    fi8Var = fi8Var4;
                } else {
                    fi8Var = fi8Var3;
                }
                if (fi8Var == fi8Var3 && !g()) {
                    this.v = false;
                    return;
                } else if (fi8Var == fi8Var4 && !h()) {
                    this.v = false;
                    return;
                } else {
                    this.k.setValue(fi8Var);
                    this.n = fi8Var;
                }
            }
            if (Math.abs(e) >= this.o) {
                if (e > nae.e) {
                    fi8Var3 = fi8Var4;
                }
                this.n = fi8Var3;
            }
        }
    }

    @Override // defpackage.h2a
    public final boolean g() {
        if (d() < i().j().n - 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h2a
    public final boolean h() {
        if (d() > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h2a
    public final boolean k() {
        if (f() != fi8.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h2a
    public pvc l(boolean z, y78 y78Var) {
        boolean g = g();
        pvc pvcVar = pvc.a;
        if (!g) {
            return pvcVar;
        }
        q();
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            iyaVar = z87.v(m82Var, ab3.a, null, new w95(z, this, null, 0), 2);
        }
        this.x = iyaVar;
        return pvcVar;
    }

    @Override // defpackage.h2a
    public pvc m(boolean z, y78 y78Var) {
        boolean h = h();
        pvc pvcVar = pvc.a;
        if (!h) {
            return pvcVar;
        }
        q();
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            iyaVar = z87.v(m82Var, ab3.a, null, new w95(z, this, null, 1), 2);
        }
        this.x = iyaVar;
        return pvcVar;
    }

    @Override // defpackage.h2a
    public void p(float f, float f2) {
        aa5 aa5Var;
        int d = d();
        this.v = false;
        if (d < 0) {
            return;
        }
        q();
        m82 m82Var = this.b;
        iya iyaVar = null;
        if (m82Var != null) {
            sw2 sw2Var = ab3.a;
            aa5Var = this;
            iyaVar = z87.v(m82Var, ru2.c, null, new z95(aa5Var, f, f2, null, 0), 2);
        } else {
            aa5Var = this;
        }
        aa5Var.x = iyaVar;
    }

    public final void q() {
        iya iyaVar = this.x;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        iya iyaVar2 = this.w;
        if (iyaVar2 != null) {
            iyaVar2.cancel(null);
        }
        if (!this.y) {
            z87.C(gs3.a, new o54(this, (m42) null, 12));
        }
        this.y = true;
        hm8 hm8Var = this.k;
        fi8 fi8Var = fi8.a;
        hm8Var.setValue(fi8Var);
        this.n = fi8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r6, defpackage.m42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.x95
            if (r0 == 0) goto L13
            r0 = r7
            x95 r0 = (defpackage.x95) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            x95 r0 = new x95
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.hre.r(r7)
            return r3
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r7)
            if (r6 >= 0) goto L34
            goto L58
        L34:
            kj6 r7 = r5.i()
            fj6 r7 = r7.j()
            int r7 = r7.n
            int r7 = r7 - r4
            if (r6 <= r7) goto L42
            goto L58
        L42:
            sw2 r7 = defpackage.ab3.a
            n35 r7 = defpackage.zz6.a
            n35 r7 = r7.f
            y95 r1 = new y95
            r1.<init>(r5, r6, r2, r4)
            r0.c = r4
            java.lang.Object r5 = defpackage.z87.E(r7, r1, r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L58
            return r6
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa5.s(int, m42):java.lang.Object");
    }
}
