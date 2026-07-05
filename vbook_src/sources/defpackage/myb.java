package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: myb  reason: default package */
/* loaded from: classes.dex */
public final class myb extends mq7 implements fd6, zj3, z7a {
    public String K;
    public oyb L;
    public do4 M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public HashMap R;
    public ol8 S;
    public kyb T;
    public lyb U;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r3 != null) goto L9;
     */
    @Override // defpackage.fd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H0(defpackage.ry6 r2, defpackage.w27 r3, int r4) {
        /*
            r1 = this;
            lyb r3 = r1.U
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            ol8 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            ol8 r3 = r1.H1()
        L14:
            r3.d(r2)
            tc6 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.H0(ry6, w27, int):int");
    }

    public final ol8 H1() {
        oyb oybVar = this.L;
        if (this.S == null) {
            this.S = new ol8(this.K, oybVar, this.M, this.N, this.O, this.P, this.Q);
        }
        ol8 ol8Var = this.S;
        ol8Var.getClass();
        return ol8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r3 != null) goto L9;
     */
    @Override // defpackage.fd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int P0(defpackage.ry6 r2, defpackage.w27 r3, int r4) {
        /*
            r1 = this;
            lyb r3 = r1.U
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            ol8 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            ol8 r3 = r1.H1()
        L14:
            r3.d(r2)
            tc6 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.P0(ry6, w27, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    @Override // defpackage.zj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(defpackage.qd6 r11) {
        /*
            r10 = this;
            boolean r0 = r10.J
            if (r0 != 0) goto L6
            goto L92
        L6:
            lyb r0 = r10.U
            if (r0 == 0) goto L16
            boolean r1 = r0.c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            ol8 r0 = r0.d
            if (r0 != 0) goto L1a
        L16:
            ol8 r0 = r10.H1()
        L1a:
            tj r1 = r0.j
            if (r1 == 0) goto L99
            n61 r11 = r11.a
            ij1 r11 = r11.b
            k61 r2 = r11.w()
            boolean r11 = r0.k
            if (r11 == 0) goto L43
            long r3 = r0.l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.i()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.o(r3, r4, r5, r6, r7)
        L43:
            oyb r10 = r10.L     // Catch: java.lang.Throwable -> L4f
            uva r0 = r10.a     // Catch: java.lang.Throwable -> L4f
            gpb r3 = r0.m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4d
            gpb r3 = defpackage.gpb.b     // Catch: java.lang.Throwable -> L4f
        L4d:
            r6 = r3
            goto L52
        L4f:
            r0 = move-exception
            r10 = r0
            goto L93
        L52:
            nea r3 = r0.n     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L58
            nea r3 = defpackage.nea.d     // Catch: java.lang.Throwable -> L4f
        L58:
            r5 = r3
            bk3 r0 = r0.p     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L5f
            ye4 r0 = defpackage.ye4.a     // Catch: java.lang.Throwable -> L4f
        L5f:
            r7 = r0
            hy0 r3 = r10.b()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L72
            uva r10 = r10.a     // Catch: java.lang.Throwable -> L4f
            mub r10 = r10.a     // Catch: java.lang.Throwable -> L4f
            float r4 = r10.z()     // Catch: java.lang.Throwable -> L4f
            r1.g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L8d
        L72:
            long r3 = defpackage.zl1.i     // Catch: java.lang.Throwable -> L4f
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L7b
            goto L8a
        L7b:
            long r3 = r10.c()     // Catch: java.lang.Throwable -> L4f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L88
            long r3 = r10.c()     // Catch: java.lang.Throwable -> L4f
            goto L8a
        L88:
            long r3 = defpackage.zl1.b     // Catch: java.lang.Throwable -> L4f
        L8a:
            r1.f(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L8d:
            if (r11 == 0) goto L92
            r2.q()
        L92:
            return
        L93:
            if (r11 == 0) goto L98
            r2.q()
        L98:
            throw r10
        L99:
            ol8 r11 = r10.S
            lyb r10 = r10.U
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ", textSubstitution="
            r0.append(r11)
            r0.append(r10)
            java.lang.String r10 = ")"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            defpackage.ov5.b(r10)
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.V0(qd6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r2 != null) goto L9;
     */
    @Override // defpackage.fd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a1(defpackage.ry6 r1, defpackage.w27 r2, int r3) {
        /*
            r0 = this;
            lyb r2 = r0.U
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            ol8 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            ol8 r2 = r0.H1()
        L14:
            r2.d(r1)
            tc6 r0 = r1.getLayoutDirection()
            nl8 r0 = r2.e(r0)
            float r0 = r0.h()
            int r0 = defpackage.qwe.l(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.a1(ry6, w27, int):int");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kyb] */
    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        kyb kybVar = this.T;
        kyb kybVar2 = kybVar;
        if (kybVar == null) {
            ?? r0 = new xt4(this) { // from class: kyb
                public final /* synthetic */ myb b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
                @Override // defpackage.xt4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r33) {
                    /*
                        Method dump skipped, instructions count: 310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.kyb.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.T = r0;
            kybVar2 = r0;
        }
        ps psVar = new ps(this.K);
        r76[] r76VarArr = j8a.a;
        l8aVar.a(h8a.C, tl1.A(psVar));
        lyb lybVar = this.U;
        if (lybVar != null) {
            boolean z = lybVar.c;
            k8a k8aVar = h8a.E;
            r76[] r76VarArr2 = j8a.a;
            r76 r76Var = r76VarArr2[17];
            l8aVar.a(k8aVar, Boolean.valueOf(z));
            ps psVar2 = new ps(lybVar.b);
            k8a k8aVar2 = h8a.D;
            r76 r76Var2 = r76VarArr2[16];
            l8aVar.a(k8aVar2, psVar2);
        }
        l8aVar.a(s7a.l, new g4(null, new xt4(this) { // from class: kyb
            public final /* synthetic */ myb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kyb.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        l8aVar.a(s7a.m, new g4(null, new xt4(this) { // from class: kyb
            public final /* synthetic */ myb b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kyb.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        l8aVar.a(s7a.n, new g4(null, new imb(this, 8)));
        j8a.a(l8aVar, kybVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != null) goto L11;
     */
    @Override // defpackage.fd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c37 n(defpackage.e37 r5, defpackage.w27 r6, long r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            lyb r0 = r4.U     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L15
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            ol8 r0 = r0.d     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L19
        L15:
            ol8 r0 = r4.H1()     // Catch: java.lang.Throwable -> L94
        L19:
            r0.d(r5)     // Catch: java.lang.Throwable -> L94
            tc6 r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L94
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L94
            nl8 r8 = r0.n     // Catch: java.lang.Throwable -> L94
            if (r8 == 0) goto L2b
            r8.b()     // Catch: java.lang.Throwable -> L94
        L2b:
            tj r8 = r0.j     // Catch: java.lang.Throwable -> L94
            r8.getClass()     // Catch: java.lang.Throwable -> L94
            dvb r8 = r8.d     // Catch: java.lang.Throwable -> L94
            long r0 = r0.l     // Catch: java.lang.Throwable -> L94
            if (r7 == 0) goto L6c
            defpackage.ube.x(r4)     // Catch: java.lang.Throwable -> L94
            java.util.HashMap r7 = r4.R     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L45
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L94
            r2 = 2
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L94
            r4.R = r7     // Catch: java.lang.Throwable -> L94
        L45:
            n95 r2 = defpackage.hc.a     // Catch: java.lang.Throwable -> L94
            r3 = 0
            float r3 = r8.d(r3)     // Catch: java.lang.Throwable -> L94
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L94
            r7.put(r2, r3)     // Catch: java.lang.Throwable -> L94
            n95 r2 = defpackage.hc.b     // Catch: java.lang.Throwable -> L94
            int r3 = r8.g     // Catch: java.lang.Throwable -> L94
            int r3 = r3 + (-1)
            float r8 = r8.d(r3)     // Catch: java.lang.Throwable -> L94
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L94
            r7.put(r2, r8)     // Catch: java.lang.Throwable -> L94
        L6c:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L94
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L94
            long r0 = defpackage.ak0.r(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L94
            mw8 r6 = r6.M(r0)     // Catch: java.lang.Throwable -> L94
            java.util.HashMap r4 = r4.R     // Catch: java.lang.Throwable -> L94
            r4.getClass()     // Catch: java.lang.Throwable -> L94
            a1 r0 = new a1     // Catch: java.lang.Throwable -> L94
            r1 = 19
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L94
            c37 r4 = r5.q0(r7, r8, r4, r0)     // Catch: java.lang.Throwable -> L94
            android.os.Trace.endSection()
            return r4
        L94:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.n(e37, w27, long):c37");
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r2 != null) goto L9;
     */
    @Override // defpackage.fd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(defpackage.ry6 r1, defpackage.w27 r2, int r3) {
        /*
            r0 = this;
            lyb r2 = r0.U
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            ol8 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            ol8 r2 = r0.H1()
        L14:
            r2.d(r1)
            tc6 r0 = r1.getLayoutDirection()
            nl8 r0 = r2.e(r0)
            float r0 = r0.l()
            int r0 = defpackage.qwe.l(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.z(ry6, w27, int):int");
    }
}
