package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mkc  reason: default package */
/* loaded from: classes.dex */
public final class mkc {
    public final dub a;
    public og0 b;
    public final lh9 c;
    public final dmb d;
    public final h23 e;
    public final h23 f;
    public final hm8 g;

    public mkc(dub dubVar, og0 og0Var, lh9 lh9Var, dmb dmbVar) {
        h23 h23Var;
        this.a = dubVar;
        this.b = og0Var;
        this.c = lh9Var;
        this.d = dmbVar;
        if (dmbVar != null) {
            h23Var = yae.q(new a0b(19, this, dmbVar));
        } else {
            h23Var = null;
        }
        this.e = h23Var;
        this.f = lh9Var != null ? yae.q(new a0b(20, this, lh9Var)) : null;
        eid eidVar = eid.a;
        this.g = yae.z(new r7a(eidVar, eidVar));
    }

    public static void k(mkc mkcVar, CharSequence charSequence, boolean z, int i) {
        boolean z2;
        wrb wrbVar;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 4) != 0) {
            wrbVar = wrb.a;
        } else {
            wrbVar = wrb.b;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        dub dubVar = mkcVar.a;
        og0 og0Var = mkcVar.b;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        if (z2) {
            frbVar.f(null);
        }
        long j = frbVar.f;
        frbVar.c(fxb.g(j), fxb.f(j), charSequence);
        int length = charSequence.length() + fxb.g(j);
        uwe.p(frbVar, length, length);
        mkcVar.o(frbVar);
        dub.a(dubVar, og0Var, z, wrbVar);
        dubVar.f(true);
    }

    public static void l(mkc mkcVar, String str, long j, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        dub dubVar = mkcVar.a;
        og0 og0Var = mkcVar.b;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        long h = mkcVar.h(j);
        frbVar.c(fxb.g(h), fxb.f(h), str);
        int length = str.length() + fxb.g(h);
        uwe.p(frbVar, length, length);
        mkcVar.o(frbVar);
        dub.a(dubVar, og0Var, z, wrb.a);
        dubVar.f(true);
    }

    public final void a() {
        og0 og0Var = this.b;
        dub dubVar = this.a;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        int f = fxb.f(frbVar.f);
        uwe.p(frbVar, f, f);
        dub.a(dubVar, og0Var, true, wrb.a);
        dubVar.f(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Type inference failed for: r6v4, types: [jkc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final defpackage.jn r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lkc
            if (r0 == 0) goto L13
            r0 = r6
            lkc r0 = (defpackage.lkc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lkc r0 = new lkc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            defpackage.hre.r(r6)
            goto L60
        L2b:
            defpackage.hre.r(r6)
            dmb r6 = r4.d
            if (r6 == 0) goto L38
            jkc r6 = new jkc
            r6.<init>()
            r5 = r6
        L38:
            r0.c = r2
            f61 r6 = new f61
            m42 r0 = defpackage.w92.t(r0)
            r6.<init>(r2, r0)
            r6.u()
            dub r0 = r4.a
            gw7 r0 = r0.g
            r0.b(r5)
            poa r0 = new poa
            r1 = 15
            r0.<init>(r1, r4, r5)
            r6.w(r0)
            java.lang.Object r4 = r6.s()
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L60
            return
        L60:
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkc.b(jn, n42):void");
    }

    public final void c() {
        og0 og0Var = this.b;
        dub dubVar = this.a;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        frbVar.c(fxb.g(frbVar.f), fxb.f(frbVar.f), "");
        int g = fxb.g(frbVar.f);
        uwe.p(frbVar, g, g);
        o(frbVar);
        dub.a(dubVar, og0Var, true, wrb.b);
        dubVar.f(true);
    }

    public final grb d() {
        kkc kkcVar;
        h23 h23Var = this.e;
        if (h23Var != null && (kkcVar = (kkc) h23Var.getValue()) != null) {
            return kkcVar.a;
        }
        return this.a.d();
    }

    public final r7a e() {
        return (r7a) this.g.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mkc) {
            mkc mkcVar = (mkc) obj;
            if (this.a == mkcVar.a && c16.i(this.c, mkcVar.c)) {
                return c16.i(this.d, mkcVar.d);
            }
        }
        return false;
    }

    public final grb f() {
        kkc kkcVar;
        h23 h23Var = this.f;
        if (h23Var != null && (kkcVar = (kkc) h23Var.getValue()) != null) {
            return kkcVar.a;
        }
        return d();
    }

    public final long g(int i) {
        bz5 bz5Var;
        long a;
        kkc kkcVar;
        kkc kkcVar2;
        bz5 bz5Var2 = null;
        h23 h23Var = this.e;
        if (h23Var != null && (kkcVar2 = (kkc) h23Var.getValue()) != null) {
            bz5Var = kkcVar2.b;
        } else {
            bz5Var = null;
        }
        h23 h23Var2 = this.f;
        if (h23Var2 != null && (kkcVar = (kkc) h23Var2.getValue()) != null) {
            bz5Var2 = kkcVar.b;
        }
        if (bz5Var2 != null) {
            a = bz5Var2.a(i, false);
        } else {
            a = sze.a(i, i);
        }
        if (bz5Var != null) {
            return iv8.d(a, bz5Var);
        }
        return a;
    }

    public final long h(long j) {
        bz5 bz5Var;
        kkc kkcVar;
        kkc kkcVar2;
        bz5 bz5Var2 = null;
        h23 h23Var = this.e;
        if (h23Var != null && (kkcVar2 = (kkc) h23Var.getValue()) != null) {
            bz5Var = kkcVar2.b;
        } else {
            bz5Var = null;
        }
        h23 h23Var2 = this.f;
        if (h23Var2 != null && (kkcVar = (kkc) h23Var2.getValue()) != null) {
            bz5Var2 = kkcVar.b;
        }
        if (bz5Var2 != null) {
            j = iv8.d(j, bz5Var2);
        }
        if (bz5Var != null) {
            return iv8.d(j, bz5Var);
        }
        return j;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        lh9 lh9Var = this.c;
        if (lh9Var != null) {
            i = lh9Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        dmb dmbVar = this.d;
        if (dmbVar != null) {
            i2 = dmbVar.hashCode();
        }
        return i3 + i2;
    }

    public final long i(long j) {
        bz5 bz5Var;
        bz5 bz5Var2;
        kkc kkcVar;
        kkc kkcVar2;
        h23 h23Var = this.e;
        if (h23Var != null && (kkcVar2 = (kkc) h23Var.getValue()) != null) {
            bz5Var = kkcVar2.b;
        } else {
            bz5Var = null;
        }
        h23 h23Var2 = this.f;
        if (h23Var2 != null && (kkcVar = (kkc) h23Var2.getValue()) != null) {
            bz5Var2 = kkcVar.b;
        } else {
            bz5Var2 = null;
        }
        if (bz5Var != null) {
            j = iv8.f(j, bz5Var, null);
        }
        if (bz5Var2 != null) {
            return iv8.f(j, bz5Var2, e());
        }
        return j;
    }

    public final void j(CharSequence charSequence) {
        og0 og0Var = this.b;
        dub dubVar = this.a;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        frbVar.c(0, frbVar.c.length(), "");
        frbVar.append(charSequence.toString());
        o(frbVar);
        dub.a(dubVar, og0Var, true, wrb.a);
        dubVar.f(true);
    }

    public final void m(long j) {
        n(h(j));
    }

    public final void n(long j) {
        og0 og0Var = this.b;
        dub dubVar = this.a;
        dubVar.b.a().k();
        frb frbVar = dubVar.b;
        int i = fxb.c;
        uwe.p(frbVar, (int) (j >> 32), (int) (j & 4294967295L));
        dub.a(dubVar, og0Var, true, wrb.a);
        dubVar.f(true);
    }

    public final void o(frb frbVar) {
        if (((gw7) frbVar.a().b).c > 0 && fxb.d(frbVar.f)) {
            eid eidVar = eid.a;
            this.g.setValue(new r7a(eidVar, eidVar));
        }
    }

    public final String toString() {
        grb d = d();
        grb f = f();
        return "TransformedTextFieldState(textFieldState=" + this.a + ", outputTransformation=" + this.d + ", outputTransformedText=" + this.e + ", codepointTransformation=" + this.c + ", codepointTransformedText=" + this.f + ", outputText=\"" + ((Object) d) + "\", visualText=\"" + ((Object) f) + "\")";
    }
}
