package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qg6  reason: default package */
/* loaded from: classes.dex */
public final class qg6 implements x2a {
    public static final yy9 w = oue.G(new j35(8), new vb6(2));
    public final bv2 a;
    public boolean b;
    public eg6 c;
    public final hg6 d;
    public final hm8 e;
    public final yu7 f;
    public float g;
    public final ww2 h;
    public final boolean i;
    public od6 j;
    public final ng6 k;
    public final pe0 l;
    public final qh6 m;
    public final mce n;
    public final ei6 o;
    public final uwd p;
    public final bi6 q;
    public final aw7 r;
    public final aw7 s;
    public final hm8 t;
    public final hm8 u;
    public final s26 v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bv2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, pe0] */
    public qg6(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.e = new gw7(new di6[16], 0);
        obj.c = -1;
        this.a = obj;
        this.d = new hg6(i, i2, 0);
        this.e = new hm8(tg6.a, r0f.J);
        this.f = new yu7();
        this.h = new ww2(new fo4(this, 14));
        this.i = true;
        this.k = new ng6(this, 0);
        this.l = new Object();
        this.m = new qh6();
        this.n = new mce(26);
        this.o = new ei6(new al(this, i, 3));
        this.p = new uwd(this, 26);
        this.q = new bi6();
        this.r = gue.l();
        this.s = gue.l();
        Boolean bool = Boolean.FALSE;
        this.t = yae.z(bool);
        this.u = yae.z(bool);
        this.v = new s26(2);
    }

    public static Object f(qg6 qg6Var, int i, aab aabVar) {
        qg6Var.getClass();
        Object e = qg6Var.e(jw7.a, new pf(qg6Var, i, (m42) null, 8), aabVar);
        if (e == n82.a) {
            return e;
        }
        return pvc.a;
    }

    @Override // defpackage.x2a
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.x2a
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final float d(float f) {
        return this.h.d(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.l.e(r0) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.h.e(r7, r8, r0) != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // defpackage.x2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.jw7 r7, defpackage.lu4 r8, defpackage.m42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.og6
            if (r0 == 0) goto L13
            r0 = r9
            og6 r0 = (defpackage.og6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            og6 r0 = new og6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            aab r7 = r0.b
            r8 = r7
            lu4 r8 = (defpackage.lu4) r8
            jw7 r7 = r0.a
            defpackage.hre.r(r9)
            goto L5b
        L3c:
            defpackage.hre.r(r9)
            hm8 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            eg6 r1 = defpackage.tg6.a
            if (r9 != r1) goto L5b
            r0.a = r7
            r9 = r8
            aab r9 = (defpackage.aab) r9
            r0.b = r9
            r0.e = r4
            pe0 r9 = r6.l
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            ww2 r6 = r6.h
            java.lang.Object r6 = r6.e(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg6.e(jw7, lu4, m42):java.lang.Object");
    }

    public final void g(eg6 eg6Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        fg6 fg6Var;
        boolean z4;
        int i3;
        fg6 fg6Var2;
        fg6 fg6Var3;
        List list = eg6Var.m;
        int i4 = eg6Var.p;
        gg6 gg6Var = eg6Var.a;
        int i5 = eg6Var.b;
        this.o.e = list.size();
        Object obj = null;
        xt4 xt4Var = null;
        obj = null;
        hg6 hg6Var = this.d;
        s26 s26Var = this.v;
        if (!z && this.b) {
            this.c = eg6Var;
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            }
            zqa h = pae.h(f);
            try {
                if (s26Var.B() && i5 == hg6Var.c.h() && gg6Var != null && (fg6Var3 = (fg6) b00.n0(gg6Var.b)) != null && fg6Var3.a == hg6Var.b.h()) {
                    s26Var.R();
                }
                return;
            } finally {
                pae.n(f, h, xt4Var);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= eg6Var.d;
        this.e.setValue(eg6Var);
        boolean z5 = false;
        if (gg6Var != null) {
            i = gg6Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i5 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.u.setValue(Boolean.valueOf(z3));
        this.t.setValue(Boolean.valueOf(eg6Var.c));
        if (z2) {
            hg6Var.getClass();
            if (i5 < nae.e) {
                ov5.c("scrollOffset should be non-negative");
            }
            hg6Var.c.i(i5);
        } else {
            hg6Var.getClass();
            if (gg6Var != null && (fg6Var2 = (fg6) b00.n0(gg6Var.b)) != null) {
                obj = fg6Var2.b;
            }
            hg6Var.e = obj;
            if (hg6Var.d || i4 > 0) {
                hg6Var.d = true;
                if (i5 < nae.e) {
                    ov5.c("scrollOffset should be non-negative (" + i5 + ")");
                }
                if (gg6Var != null && (fg6Var = (fg6) b00.n0(gg6Var.b)) != null) {
                    i2 = fg6Var.a;
                } else {
                    i2 = 0;
                }
                hg6Var.a(i2, i5);
            }
            if (this.i) {
                bv2 bv2Var = this.a;
                gw7 gw7Var = (gw7) bv2Var.e;
                int i6 = bv2Var.a;
                boolean z6 = bv2Var.b;
                if (i6 != -1 && !list.isEmpty() && i6 != bv2.b(eg6Var, z6)) {
                    bv2Var.a = -1;
                    Object[] objArr = gw7Var.a;
                    int i7 = gw7Var.c;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((di6) objArr[i8]).cancel();
                    }
                    gw7Var.g();
                }
                int i9 = bv2Var.c;
                if (i9 != -1 && bv2Var.d != nae.e && i9 != i4 && !list.isEmpty()) {
                    if (bv2Var.d < nae.e) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int b = bv2.b(eg6Var, z4);
                    if (bv2Var.d < nae.e) {
                        z5 = true;
                    }
                    if (z5) {
                        i3 = ((fg6) sl1.j0(list)).a + 1;
                    } else {
                        i3 = ((fg6) sl1.c0(list)).a - 1;
                    }
                    if (i3 >= 0 && i3 < i4 && b != bv2Var.a && b >= 0) {
                        bv2Var.a = b;
                        gw7Var.g();
                        gw7Var.d(gw7Var.c, this.p.z(b));
                    }
                }
                bv2Var.c = i4;
            }
        }
        if (z) {
            s26Var.U(eg6Var.f, eg6Var.i, eg6Var.h);
        }
    }

    public final int h() {
        return this.d.b.h();
    }

    public final int i() {
        return this.d.c.h();
    }

    public final eg6 j() {
        return (eg6) this.e.getValue();
    }

    public final void k(float f, eg6 eg6Var) {
        boolean z;
        int i;
        long j;
        if (this.i) {
            bv2 bv2Var = this.a;
            gw7 gw7Var = (gw7) bv2Var.e;
            List list = eg6Var.m;
            List list2 = eg6Var.m;
            ff8 ff8Var = eg6Var.q;
            if (!list.isEmpty()) {
                int i2 = 0;
                if (f < nae.e) {
                    z = true;
                } else {
                    z = false;
                }
                int b = bv2.b(eg6Var, z);
                if (z) {
                    i = ((fg6) sl1.j0(list2)).a + 1;
                } else {
                    i = ((fg6) sl1.c0(list2)).a - 1;
                }
                if (i >= 0 && i < eg6Var.p) {
                    if (b != bv2Var.a && b >= 0) {
                        if (bv2Var.b != z) {
                            Object[] objArr = gw7Var.a;
                            int i3 = gw7Var.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((di6) objArr[i4]).cancel();
                            }
                        }
                        bv2Var.b = z;
                        bv2Var.a = b;
                        gw7Var.g();
                        gw7Var.d(gw7Var.c, this.p.z(b));
                    }
                    if (z) {
                        fg6 fg6Var = (fg6) sl1.j0(list2);
                        if (ff8Var == ff8.a) {
                            j = fg6Var.w & 4294967295L;
                        } else {
                            j = fg6Var.w >> 32;
                        }
                        int i5 = (int) j;
                        if (((ape.r(fg6Var, ff8Var) + i5) + eg6Var.s) - eg6Var.o < (-f)) {
                            Object[] objArr2 = gw7Var.a;
                            int i6 = gw7Var.c;
                            while (i2 < i6) {
                                ((di6) objArr2[i2]).a();
                                i2++;
                            }
                        }
                    } else if (eg6Var.n - ape.r((fg6) sl1.c0(list2), ff8Var) < f) {
                        Object[] objArr3 = gw7Var.a;
                        int i7 = gw7Var.c;
                        while (i2 < i7) {
                            ((di6) objArr3[i2]).a();
                            i2++;
                        }
                    }
                }
            }
            bv2Var.d = f;
        }
    }

    public final Object l(int i, int i2, m42 m42Var) {
        Object e = e(jw7.a, new pg6(this, i, i2, null), m42Var);
        if (e == n82.a) {
            return e;
        }
        return pvc.a;
    }

    public final void m(int i, int i2, boolean z) {
        hg6 hg6Var = this.d;
        if (hg6Var.b.h() != i || hg6Var.c.h() != i2) {
            qh6 qh6Var = this.m;
            qh6Var.e();
            qh6Var.b = null;
            qh6Var.c = -1;
        }
        hg6Var.a(i, i2);
        hg6Var.e = null;
        if (z) {
            od6 od6Var = this.j;
            if (od6Var != null) {
                od6Var.l();
                return;
            }
            return;
        }
        gue.u(this.s);
    }
}
