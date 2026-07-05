package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: atd  reason: default package */
/* loaded from: classes3.dex */
public final class atd {
    public final pq2 a;
    public float b;
    public float c;
    public final hm8 d;
    public float e;
    public final h23 f;
    public final c5d g;
    public final hm8 h;
    public final lq i;
    public final lq j;
    public final hm8 k;
    public final hm8 l;
    public final hm8 m;
    public final hm8 n;
    public final h23 o;
    public w26 p;
    public final hm8 q;

    public atd(pq2 pq2Var, float f, float f2, float f3) {
        pq2Var.getClass();
        this.a = pq2Var;
        this.b = 1.0f;
        this.c = 4.0f;
        this.d = yae.z(null);
        this.e = 2.0f;
        this.f = yae.q(new hk7(this, 4));
        this.g = new c5d();
        this.h = yae.z(Float.valueOf(f));
        this.i = tc4.a(f2, 0.5f);
        this.j = tc4.a(f3, 0.5f);
        this.k = yae.z(new zy5(0L));
        this.l = yae.z(new dna(0L));
        this.m = yae.z(new py5(0L));
        this.n = yae.z(Float.valueOf((float) nae.e));
        this.o = yae.q(new hk7(this, 5));
        this.q = yae.z(Boolean.FALSE);
    }

    public static Object a(atd atdVar, float f, long j, aab aabVar, int i) {
        if ((i & 2) != 0) {
            float g = atdVar.g();
            float h = atdVar.h();
            long floatToRawIntBits = Float.floatToRawIntBits(g);
            j = y78.k(f, y78.c(atdVar.f(), (Float.floatToRawIntBits(h) & 4294967295L) | (floatToRawIntBits << 32)));
        }
        Object p = k27.p(new vsd(atdVar, f, tte.v(nae.e, nae.e, 7, null), j, null), aabVar);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    public final long b(long j) {
        long j2 = sxd.j(eg0.A(j()));
        float g = g();
        float h = h();
        return y78.c(f(), y78.i(y78.j(j2, (Float.floatToRawIntBits(h) & 4294967295L) | (Float.floatToRawIntBits(g) << 32)), j));
    }

    public final Object c(aab aabVar) {
        float j;
        float e = e();
        if (e() < nae.e) {
            j = -((int) (j() & 4294967295L));
        } else {
            j = (int) (j() & 4294967295L);
        }
        return ote.l(e, j, tte.x(500, 0, null, 6), new ssd(this, 0), aabVar, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r10, defpackage.n42 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.wsd
            if (r0 == 0) goto L13
            r0 = r12
            wsd r0 = (defpackage.wsd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wsd r0 = new wsd
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r6 = 0
            r8 = 1
            if (r1 == 0) goto L2e
            if (r1 != r8) goto L27
            defpackage.hre.r(r12)
            r3 = r9
            goto L44
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.hre.r(r12)
            v42 r2 = new v42
            r7 = 2
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r6, r7)
            r0.c = r8
            java.lang.Object r9 = defpackage.k27.p(r2, r0)
            n82 r10 = defpackage.n82.a
            if (r9 != r10) goto L44
            return r10
        L44:
            hm8 r9 = r3.q
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.setValue(r10)
            r3.p = r6
            pvc r9 = defpackage.pvc.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atd.d(long, n42):java.lang.Object");
    }

    public final float e() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final float f() {
        return ((Number) this.h.getValue()).floatValue();
    }

    public final float g() {
        return ((Number) this.i.e()).floatValue();
    }

    public final float h() {
        return ((Number) this.j.e()).floatValue();
    }

    public final long i() {
        return ((dna) this.l.getValue()).a;
    }

    public final long j() {
        return ((zy5) this.k.getValue()).a;
    }

    public final boolean k() {
        float f;
        float f2 = f();
        float f3 = this.b;
        if (((ng8) this.d.getValue()) != null) {
            f = 1.0f;
        } else {
            f = nae.e;
        }
        if (f2 > Math.max(f3, f) && f() <= this.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r10.g(r0, r1) == r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r8, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ysd
            if (r0 == 0) goto L13
            r0 = r10
            ysd r0 = (defpackage.ysd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ysd r0 = new ysd
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r10)
            return r10
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L31:
            long r8 = r0.a
            defpackage.hre.r(r10)
            goto L60
        L37:
            defpackage.hre.r(r10)
            lq r10 = r7.i
            java.lang.Object r1 = r10.e()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r5 = 32
            long r5 = r8 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 + r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = r10.g(r0, r1)
            if (r10 != r4) goto L60
            goto L87
        L60:
            lq r7 = r7.j
            java.lang.Object r10 = r7.e()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r8
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r1)
            r0.a = r8
            r0.d = r2
            java.lang.Object r7 = r7.g(r0, r10)
            if (r7 != r4) goto L88
        L87:
            return r4
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atd.l(long, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r19, long r21, float r23, defpackage.n42 r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r23
            r4 = r24
            boolean r5 = r4 instanceof defpackage.zsd
            if (r5 == 0) goto L1b
            r5 = r4
            zsd r5 = (defpackage.zsd) r5
            int r6 = r5.C
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.C = r6
            goto L20
        L1b:
            zsd r5 = new zsd
            r5.<init>(r0, r4)
        L20:
            java.lang.Object r4 = r5.e
            int r6 = r5.C
            r7 = 2
            r8 = 1
            n82 r9 = defpackage.n82.a
            if (r6 == 0) goto L45
            if (r6 == r8) goto L39
            if (r6 != r7) goto L32
            defpackage.hre.r(r4)
            return r4
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L39:
            long r1 = r5.c
            float r3 = r5.d
            long r10 = r5.b
            long r12 = r5.a
            defpackage.hre.r(r4)
            goto L9d
        L45:
            defpackage.hre.r(r4)
            long r10 = defpackage.y78.i(r19, r21)
            long r10 = r0.b(r10)
            float r4 = r0.f()
            float r4 = r4 * r3
            r0.n(r4)
            float r4 = r0.f()
            long r10 = defpackage.y78.k(r4, r10)
            long r12 = r0.j()
            long r12 = defpackage.eg0.A(r12)
            long r12 = defpackage.sxd.j(r12)
            long r10 = defpackage.y78.i(r10, r12)
            long r10 = defpackage.y78.j(r10, r1)
            r4 = 32
            long r12 = r10 >> r4
            int r4 = (int) r12
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
            r5.a = r1
            r12 = r21
            r5.b = r12
            r5.d = r3
            r5.c = r10
            r5.C = r8
            lq r4 = r0.i
            java.lang.Object r4 = r4.g(r5, r6)
            if (r4 != r9) goto L97
            goto Lbf
        L97:
            r16 = r12
            r12 = r1
            r1 = r10
            r10 = r16
        L9d:
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r1
            int r4 = (int) r14
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
            r5.a = r12
            r5.b = r10
            r5.d = r3
            r5.c = r1
            r5.C = r7
            lq r0 = r0.j
            java.lang.Object r0 = r0.g(r5, r6)
            if (r0 != r9) goto Lc0
        Lbf:
            return r9
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atd.m(long, long, float, n42):java.lang.Object");
    }

    public final void n(float f) {
        this.h.setValue(Float.valueOf(dce.m(f, this.b, this.c)));
        o();
    }

    public final void o() {
        if (dna.a(i(), 0L)) {
            return;
        }
        float f = (f() * Float.intBitsToFloat((int) (i() >> 32))) - ((int) (j() >> 32));
        float f2 = (f() * Float.intBitsToFloat((int) (i() & 4294967295L))) - ((int) (j() & 4294967295L));
        this.m.setValue(new py5((k27.A(f2 / 2.0f) & 4294967295L) | (k27.A(f / 2.0f) << 32)));
        if (f < nae.e) {
            f = 0.0f;
        }
        float f3 = f / 2.0f;
        if (f2 < nae.e) {
            f2 = 0.0f;
        }
        float f4 = f2 / 2.0f;
        this.i.i(Float.valueOf(-f3), Float.valueOf(f3));
        this.j.i(Float.valueOf(-f4), Float.valueOf(f4));
    }

    public final String toString() {
        float j = sye.j(g());
        float j2 = sye.j(h());
        float j3 = sye.j(f());
        StringBuilder x = nk2.x("ZoomableState(translateX=", j, ", translateY=", j2, ", scale=");
        x.append(j3);
        x.append(")");
        return x.toString();
    }
}
