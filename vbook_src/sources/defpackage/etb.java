package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: etb  reason: default package */
/* loaded from: classes.dex */
public final class etb implements npb {
    public fxb b;
    public final /* synthetic */ gtb d;
    public boolean a = true;
    public h6a c = abf.H;

    public etb(gtb gtbVar) {
        this.d = gtbVar;
    }

    @Override // defpackage.npb
    public final void a(long j, h6a h6aVar) {
        long j2;
        gvb d;
        gvb d2;
        gtb gtbVar = this.d;
        hm8 hm8Var = gtbVar.r;
        if (gtbVar.k() && ((h35) hm8Var.getValue()) == null) {
            hm8Var.setValue(h35.c);
            gtbVar.t = -1;
            this.a = true;
            this.c = h6aVar;
            gtbVar.o();
            ol6 ol6Var = gtbVar.d;
            if (ol6Var != null && (d2 = ol6Var.d()) != null && d2.c(j)) {
                if (gtbVar.n().a.b.length() != 0) {
                    gtbVar.h(false);
                    long c = gtb.c(gtbVar, jub.a(gtbVar.n(), null, fxb.b, 5), j, true, false, this.c, true, new t35(0));
                    j2 = j;
                    gtbVar.p = new fxb(c);
                    this.b = new fxb(c);
                } else {
                    return;
                }
            } else {
                j2 = j;
                ol6 ol6Var2 = gtbVar.d;
                if (ol6Var2 != null && (d = ol6Var2.d()) != null) {
                    int d3 = gtbVar.b.d(d.b(true, j2));
                    jub e = gtb.e(gtbVar.n().a, sze.a(d3, d3));
                    gtbVar.h(false);
                    s35 s35Var = gtbVar.k;
                    if (s35Var != null) {
                        ((dx8) s35Var).a(0);
                    }
                    gtbVar.c.invoke(e);
                    gtbVar.w = new fxb(e.b);
                }
                this.a = false;
            }
            gtbVar.q(l35.a);
            gtbVar.o = j2;
            gtbVar.s.setValue(new y78(j2));
            gtbVar.q = 0L;
        }
    }

    @Override // defpackage.npb
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    @Override // defpackage.npb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            r9 = this;
            gtb r0 = r9.d
            boolean r1 = r0.k()
            if (r1 == 0) goto Leb
            jub r1 = r0.n()
            ps r1 = r1.a
            java.lang.String r1 = r1.b
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Leb
        L18:
            long r1 = r0.q
            long r10 = defpackage.y78.j(r1, r10)
            r0.q = r10
            ol6 r10 = r0.d
            r11 = 0
            if (r10 == 0) goto Le8
            gvb r10 = r10.d()
            if (r10 == 0) goto Le8
            long r1 = r0.o
            long r3 = r0.q
            long r1 = defpackage.y78.j(r1, r3)
            y78 r3 = new y78
            r3.<init>(r1)
            hm8 r1 = r0.s
            r1.setValue(r3)
            fxb r1 = r0.p
            r2 = 9
            if (r1 != 0) goto L96
            y78 r1 = r0.i()
            r1.getClass()
            long r3 = r1.a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L96
            j88 r1 = r0.b
            long r3 = r0.o
            r5 = 1
            int r3 = r10.b(r5, r3)
            int r1 = r1.d(r3)
            j88 r3 = r0.b
            y78 r4 = r0.i()
            r4.getClass()
            long r6 = r4.a
            int r10 = r10.b(r5, r6)
            int r10 = r3.d(r10)
            if (r1 != r10) goto L78
            h6a r10 = defpackage.abf.H
        L76:
            r6 = r10
            goto L7b
        L78:
            h6a r10 = defpackage.abf.J
            goto L76
        L7b:
            jub r1 = r0.n()
            y78 r10 = r0.i()
            r10.getClass()
            long r3 = r10.a
            t35 r8 = new t35
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = defpackage.gtb.c(r0, r1, r2, r4, r5, r6, r7, r8)
            goto Ld7
        L96:
            fxb r1 = r0.p
            if (r1 == 0) goto La1
            long r3 = r1.a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La7
        La1:
            long r3 = r0.o
            int r1 = r10.b(r11, r3)
        La7:
            y78 r3 = r0.i()
            r3.getClass()
            long r3 = r3.a
            int r10 = r10.b(r11, r3)
            fxb r3 = r0.p
            if (r3 != 0) goto Lbb
            if (r1 != r10) goto Lbb
            goto Leb
        Lbb:
            jub r1 = r0.n()
            y78 r10 = r0.i()
            r10.getClass()
            long r3 = r10.a
            h6a r6 = r9.c
            t35 r8 = new t35
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = defpackage.gtb.c(r0, r1, r2, r4, r5, r6, r7, r8)
        Ld7:
            fxb r10 = new fxb
            r10.<init>(r1)
            r9.b = r10
            fxb r10 = r0.p
            boolean r10 = defpackage.fxb.b(r10, r1)
            if (r10 != 0) goto Le8
            r9.a = r11
        Le8:
            r0.t(r11)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etb.e(long):void");
    }

    public final void f() {
        long j;
        l35 l35Var;
        boolean z;
        boolean z2;
        gtb gtbVar = this.d;
        gtbVar.r.setValue(null);
        gtbVar.s.setValue(null);
        this.c = abf.H;
        boolean z3 = true;
        gtbVar.t(true);
        fxb fxbVar = this.b;
        if (fxbVar != null) {
            j = fxbVar.a;
        } else {
            j = gtbVar.n().b;
        }
        boolean d = fxb.d(j);
        if (d) {
            l35Var = l35.c;
        } else {
            l35Var = l35.b;
        }
        gtbVar.q(l35Var);
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null) {
            if (!d && p17.i(gtbVar, true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ol6Var.m.setValue(Boolean.valueOf(z2));
        }
        ol6 ol6Var2 = gtbVar.d;
        if (ol6Var2 != null) {
            if (!d && p17.i(gtbVar, false)) {
                z = true;
            } else {
                z = false;
            }
            ol6Var2.n.setValue(Boolean.valueOf(z));
        }
        ol6 ol6Var3 = gtbVar.d;
        if (ol6Var3 != null) {
            if (!d || !p17.i(gtbVar, true)) {
                z3 = false;
            }
            ol6Var3.o.setValue(Boolean.valueOf(z3));
        }
        if (this.a) {
            gtb.b(gtbVar, gtbVar.p);
        }
        gtbVar.p = null;
    }

    @Override // defpackage.npb
    public final void onCancel() {
        f();
    }

    @Override // defpackage.npb
    public final void c() {
    }

    @Override // defpackage.npb
    public final void d() {
    }
}
