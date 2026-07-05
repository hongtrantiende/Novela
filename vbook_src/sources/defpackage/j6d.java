package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j6d  reason: default package */
/* loaded from: classes3.dex */
public final class j6d {
    public final String a;
    public final b6d b;
    public final String c;

    public j6d(b6d b6dVar, String str) {
        this.a = str;
        this.b = b6dVar;
        this.c = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:10)(2:19|20))(4:21|22|23|(1:25))|11|(1:13)(1:17)|14|15))|27|6|7|(0)(0)|11|(0)(0)|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.e6d
            if (r0 == 0) goto L13
            r0 = r5
            e6d r0 = (defpackage.e6d) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            e6d r0 = new e6d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r5)     // Catch: java.lang.Throwable -> L46
            goto L3e
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r5)
            b6d r5 = r4.b     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.c     // Catch: java.lang.Throwable -> L46
            r0.c = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r5.q(r4, r0)     // Catch: java.lang.Throwable -> L46
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            m6d r5 = (defpackage.m6d) r5     // Catch: java.lang.Throwable -> L46
            boolean r4 = r5.b     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L46
        L46:
            if (r2 == 0) goto L4d
            boolean r4 = r2.booleanValue()
            goto L4e
        L4d:
            r4 = 0
        L4e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6d.a(n42):java.lang.Object");
    }

    public final j6d b(String str) {
        String l;
        str.getClass();
        if (str.length() != 0) {
            String replace = str.replace('\\', '/');
            replace.getClass();
            String G0 = k4b.G0(replace, '/');
            if (G0.length() == 0 || k4b.W(G0, ':')) {
                l = zj0.l(str);
                return new j6d(this.b, l);
            }
        }
        l = zj0.l(this.c + '/' + str);
        return new j6d(this.b, l);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.f6d
            if (r0 == 0) goto L13
            r0 = r5
            f6d r0 = (defpackage.f6d) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            f6d r0 = new f6d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            b6d r5 = r4.b
            java.lang.String r4 = r4.c
            java.lang.Object r5 = r5.q(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            m6d r5 = (defpackage.m6d) r5
            boolean r4 = r5.c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6d.c(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[LOOP:0: B:18:0x004b->B:20:0x0051, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.g6d
            if (r0 == 0) goto L13
            r0 = r5
            g6d r0 = (defpackage.g6d) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            g6d r0 = new g6d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            java.lang.Object r5 = r4.e(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r5.next()
            j6d r0 = (defpackage.j6d) r0
            java.lang.String r0 = defpackage.zj0.f(r0)
            r4.add(r0)
            goto L4b
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6d.d(n42):java.io.Serializable");
    }

    public final Object e(n42 n42Var) {
        return this.b.m(this.c, n42Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j6d) {
                j6d j6dVar = (j6d) obj;
                if (!this.b.equals(j6dVar.b) || !this.c.equals(j6dVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Object f(l6d l6dVar, n42 n42Var) {
        return this.b.n(this.c, l6dVar, n42Var);
    }

    public final Object g(n42 n42Var) {
        return this.b.o(this.c, k6d.a, n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fuc r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.h6d
            if (r0 == 0) goto L13
            r0 = r6
            h6d r0 = (defpackage.h6d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h6d r0 = new h6d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            fuc r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = r4.g(r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            byte[] r6 = (byte[]) r6
            java.lang.String r4 = defpackage.xc1.b(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6d.h(fuc, n42):java.lang.Object");
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.i6d
            if (r0 == 0) goto L13
            r0 = r5
            i6d r0 = (defpackage.i6d) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            i6d r0 = new i6d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            b6d r5 = r4.b
            java.lang.String r4 = r4.c
            java.lang.Object r5 = r5.q(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            m6d r5 = (defpackage.m6d) r5
            long r4 = r5.d
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6d.i(n42):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('[');
        return s21.p(sb, this.c, ']');
    }
}
