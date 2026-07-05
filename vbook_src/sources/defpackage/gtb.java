package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gtb  reason: default package */
/* loaded from: classes.dex */
public final class gtb {
    public final ejf A;
    public boolean B;
    public final ivc a;
    public ol6 d;
    public vt4 g;
    public pj1 h;
    public m82 i;
    public sx8 j;
    public s35 k;
    public zm4 l;
    public final hm8 m;
    public final hm8 n;
    public long o;
    public fxb p;
    public long q;
    public final hm8 r;
    public final hm8 s;
    public int t;
    public jub u;
    public uma v;
    public fxb w;
    public final hm8 x;
    public final sfc y;
    public final etb z;
    public j88 b = v3d.a;
    public xt4 c = new vb6(9);
    public final hm8 e = yae.z(new jub((String) null, 0, 7));
    public ted f = hq7.T;

    /* JADX WARN: Type inference failed for: r6v16, types: [ejf, java.lang.Object] */
    public gtb(ivc ivcVar) {
        this.a = ivcVar;
        Boolean bool = Boolean.TRUE;
        this.m = yae.z(bool);
        this.n = yae.z(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = yae.z(null);
        this.s = yae.z(null);
        this.t = -1;
        this.u = new jub((String) null, 0L, 7);
        this.x = yae.z(Boolean.FALSE);
        this.y = new sfc();
        this.z = new etb(this);
        ?? obj = new Object();
        obj.c = this;
        obj.a = true;
        this.A = obj;
    }

    public static final yk8 a(gtb gtbVar) {
        String str;
        fxb fxbVar;
        ps m = gtbVar.m();
        if (m != null && (str = m.b) != null && (fxbVar = gtbVar.w) != null) {
            long j = fxbVar.a;
            return new yk8(str, new fxb(sze.a(gtbVar.b.w((int) (j >> 32)), gtbVar.b.w((int) (j & 4294967295L)))));
        }
        return null;
    }

    public static final void b(gtb gtbVar, fxb fxbVar) {
        ps m;
        String str;
        m82 m82Var;
        if (fxbVar != null) {
            long j = fxbVar.a;
            sx8 sx8Var = gtbVar.j;
            if (sx8Var != null && (m = gtbVar.m()) != null && (str = m.b) != null) {
                j88 j88Var = gtbVar.b;
                long a = sze.a(j88Var.w((int) (j >> 32)), j88Var.w((int) (j & 4294967295L)));
                if (str.length() > 0 && !fxb.d(a) && (m82Var = gtbVar.i) != null) {
                    z87.v(m82Var, null, null, new gg1(sx8Var, str, a, fxbVar, gtbVar, j88Var, null), 3);
                }
            }
        }
    }

    public static final long c(gtb gtbVar, jub jubVar, long j, boolean z, boolean z2, h6a h6aVar, boolean z3, t35 t35Var) {
        gvb d;
        int i;
        int i2;
        char c;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        s35 s35Var;
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null && (d = ol6Var.d()) != null) {
            j88 j88Var = gtbVar.b;
            long j2 = jubVar.b;
            ps psVar = jubVar.a;
            int i3 = fxb.c;
            long a = sze.a(j88Var.w((int) (j2 >> 32)), gtbVar.b.w((int) (j2 & 4294967295L)));
            boolean z8 = false;
            int b = d.b(false, j);
            if (!z2 && !z) {
                i = (int) (a >> 32);
            } else {
                i = b;
            }
            if (z2 && !z) {
                i2 = (int) (a & 4294967295L);
            } else {
                i2 = b;
            }
            uma umaVar = gtbVar.v;
            int i4 = -1;
            if (!z && umaVar != null) {
                c = ' ';
                int i5 = gtbVar.t;
                if (i5 != -1) {
                    i4 = i5;
                }
            } else {
                c = ' ';
            }
            uma v = nye.v(d.a, i, i2, i4, a, z, z2);
            if (v.m(umaVar)) {
                gtbVar.v = v;
                gtbVar.t = b;
                g6a a2 = h6aVar.a(v);
                long a3 = sze.a(gtbVar.b.d(a2.a.b), gtbVar.b.d(a2.b.b));
                if (!fxb.c(a3, j2)) {
                    if (fxb.h(a3) != fxb.h(j2) && fxb.c(sze.a((int) (4294967295L & a3), (int) (a3 >> c)), j2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (fxb.d(a3) && fxb.d(j2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 && psVar.b.length() > 0 && !z4 && !z5 && t35Var != null && (s35Var = gtbVar.k) != null) {
                        ((dx8) s35Var).a(t35Var.a);
                    }
                    gtbVar.c.invoke(e(psVar, a3));
                    gtbVar.w = new fxb(a3);
                    if (!z3) {
                        gtbVar.t(!fxb.d(a3));
                    }
                    ol6 ol6Var2 = gtbVar.d;
                    if (ol6Var2 != null) {
                        ol6Var2.q.setValue(Boolean.valueOf(z3));
                    }
                    ol6 ol6Var3 = gtbVar.d;
                    if (ol6Var3 != null) {
                        if (!fxb.d(a3) && p17.i(gtbVar, true)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        ol6Var3.m.setValue(Boolean.valueOf(z7));
                    }
                    ol6 ol6Var4 = gtbVar.d;
                    if (ol6Var4 != null) {
                        if (!fxb.d(a3) && p17.i(gtbVar, false)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        ol6Var4.n.setValue(Boolean.valueOf(z6));
                    }
                    ol6 ol6Var5 = gtbVar.d;
                    if (ol6Var5 != null) {
                        if (fxb.d(a3) && p17.i(gtbVar, true)) {
                            z8 = true;
                        }
                        ol6Var5.o.setValue(Boolean.valueOf(z8));
                    }
                    return a3;
                }
            }
            return j2;
        }
        return fxb.b;
    }

    public static jub e(ps psVar, long j) {
        return new jub(psVar, j, (fxb) null);
    }

    public final iya d(boolean z) {
        m82 m82Var = this.i;
        if (m82Var == null) {
            return null;
        }
        return z87.v(m82Var, null, p82.d, new gx(this, z, (m42) null, 9), 1);
    }

    public final void f() {
        m82 m82Var = this.i;
        if (m82Var != null) {
            z87.v(m82Var, null, p82.d, new atb(this, null, 1), 1);
        }
    }

    public final void g(y78 y78Var) {
        l35 l35Var;
        gvb gvbVar;
        int f;
        if (!fxb.d(n().b)) {
            ol6 ol6Var = this.d;
            if (ol6Var != null) {
                gvbVar = ol6Var.d();
            } else {
                gvbVar = null;
            }
            if (y78Var != null && gvbVar != null) {
                f = this.b.d(gvbVar.b(true, y78Var.a));
            } else {
                f = fxb.f(n().b);
            }
            jub a = jub.a(n(), null, sze.a(f, f), 5);
            this.c.invoke(a);
            this.w = new fxb(a.b);
        }
        if (y78Var != null && n().a.b.length() > 0) {
            l35Var = l35.c;
        } else {
            l35Var = l35.a;
        }
        q(l35Var);
        t(false);
    }

    public final void h(boolean z) {
        zm4 zm4Var;
        ol6 ol6Var = this.d;
        if (ol6Var != null && !ol6Var.b() && (zm4Var = this.l) != null) {
            zm4.a(zm4Var);
        }
        this.u = n();
        t(z);
        q(l35.b);
    }

    public final y78 i() {
        return (y78) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        gvb d;
        long j;
        ol6 ol6Var = this.d;
        if (ol6Var != null && (d = ol6Var.d()) != null) {
            fvb fvbVar = d.a;
            ps m = m();
            if (m != null) {
                if (c16.i(m.b, fvbVar.a.a.b)) {
                    jub n = n();
                    if (z) {
                        long j2 = n.b;
                        int i = fxb.c;
                        j = j2 >> 32;
                    } else {
                        long j3 = n.b;
                        int i2 = fxb.c;
                        j = j3 & 4294967295L;
                    }
                    return n4f.p(fvbVar, this.b.w((int) j), z, fxb.h(n().b));
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final ps m() {
        ol6 ol6Var = this.d;
        if (ol6Var != null) {
            return ol6Var.a.a;
        }
        return null;
    }

    public final jub n() {
        return (jub) this.e.getValue();
    }

    public final void o() {
        iya iyaVar;
        epb epbVar = this.y.a;
        if (epbVar != null && (iyaVar = epbVar.Q) != null) {
            iyaVar.cancel(null);
            epbVar.Q = null;
        }
    }

    public final void p() {
        m82 m82Var = this.i;
        if (m82Var != null) {
            z87.v(m82Var, null, p82.d, new atb(this, null, 2), 1);
        }
    }

    public final void q(l35 l35Var) {
        ol6 ol6Var = this.d;
        if (ol6Var != null) {
            if (ol6Var.a() == l35Var) {
                ol6Var = null;
            }
            if (ol6Var != null) {
                ol6Var.k.setValue(l35Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (((java.lang.Boolean) r3.q.getValue()).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r4 = this;
            zqa r0 = defpackage.pae.f()
            if (r0 == 0) goto Lb
            xt4 r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            zqa r2 = defpackage.pae.h(r0)
            boolean r3 = r4.k()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            ol6 r3 = r4.d     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L29
            hm8 r3 = r3.q     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L29
            goto L34
        L29:
            defpackage.pae.n(r0, r2, r1)
            sfc r4 = r4.y
            r4.a()
            return
        L32:
            r4 = move-exception
            goto L38
        L34:
            defpackage.pae.n(r0, r2, r1)
            return
        L38:
            defpackage.pae.n(r0, r2, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtb.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ftb
            if (r0 == 0) goto L13
            r0 = r5
            ftb r0 = (defpackage.ftb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ftb r0 = new ftb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            gtb r4 = r0.a
            defpackage.hre.r(r5)
            goto L58
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            pj1 r5 = r4.h
            if (r5 == 0) goto L62
            r0.a = r4
            r0.d = r2
            wf r5 = (defpackage.wf) r5
            kw5 r5 = r5.a
            android.content.ClipboardManager r5 = r5.p()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            if (r5 != 0) goto L49
            r5 = 0
            goto L4f
        L49:
            java.lang.String r0 = "text/*"
            boolean r5 = r5.hasMimeType(r0)
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L58
            return r0
        L58:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            hm8 r4 = r4.x
            r4.setValue(r5)
        L62:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtb.s(n42):java.lang.Object");
    }

    public final void t(boolean z) {
        ol6 ol6Var = this.d;
        if (ol6Var != null) {
            ol6Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
