package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be9  reason: default package */
/* loaded from: classes3.dex */
public final class be9 implements sc9 {
    public final ii2 a;
    public final re5 b;
    public final rc9 c;
    public final rw d;
    public final q63 e;
    public final bnc f;
    public final se9 g;

    public be9(ii2 ii2Var, re5 re5Var, rc9 rc9Var, rw rwVar, q63 q63Var, bnc bncVar, se9 se9Var) {
        this.a = ii2Var;
        this.b = re5Var;
        this.c = rc9Var;
        this.d = rwVar;
        this.e = q63Var;
        this.f = bncVar;
        this.g = se9Var;
    }

    public static String U(Map map, String str) {
        m66 m66Var = pe4.a;
        hn8 s = ie2.s(m66Var);
        long b = by5.a.k().b();
        hn8 f = hn8.f(s, "export_" + str + "_" + b + ".txt");
        lj9 lj9Var = new lj9(m66Var.g1(f, false));
        try {
            for (Map.Entry entry : map.entrySet()) {
                lj9Var.i0((String) entry.getKey());
                lj9Var.i0("=");
                lj9Var.i0(r4b.O((String) entry.getValue(), (char) 166, '|'));
                lj9Var.i0("\n");
            }
            try {
                lj9Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                lj9Var.close();
            } catch (Throwable th3) {
                pye.e(th, th3);
            }
        }
        if (th == null) {
            return f.a.t();
        }
        throw th;
    }

    public final fb9 A() {
        rc9 rc9Var = this.c;
        eb9 d = rc9Var.d();
        if (d == null) {
            return null;
        }
        String str = d.a;
        m66 m66Var = pe4.a;
        if (!m66Var.j0(hn8.f(ie2.u(m66Var), str))) {
            rc9Var.n(null);
            return null;
        }
        return new fb9(str, d.b);
    }

    public final fb9 B() {
        rc9 rc9Var = this.c;
        eb9 g = rc9Var.g();
        if (g == null) {
            return null;
        }
        String str = g.a;
        m66 m66Var = pe4.a;
        if (!m66Var.j0(hn8.f(ie2.u(m66Var), str))) {
            rc9Var.o(null);
            return null;
        }
        return new fb9(str, g.b);
    }

    public final fb9 C() {
        rc9 rc9Var = this.c;
        eb9 h = rc9Var.h();
        if (h == null) {
            return null;
        }
        String str = h.a;
        m66 m66Var = pe4.a;
        if (!m66Var.j0(hn8.f(ie2.u(m66Var), str))) {
            rc9Var.p(null);
            return null;
        }
        return new fb9(str, h.b);
    }

    public final fb9 D() {
        rc9 rc9Var = this.c;
        eb9 j = rc9Var.j();
        if (j == null) {
            return null;
        }
        String str = j.a;
        m66 m66Var = pe4.a;
        if (!m66Var.j0(hn8.f(ie2.u(m66Var), str))) {
            rc9Var.q(null);
            return null;
        }
        return new fb9(str, j.b);
    }

    public final hs0 E(String str) {
        str.getClass();
        s02 O = v9e.O(this.a.Q.n0(1, str));
        sw2 sw2Var = ab3.a;
        return new hs0(v9e.z(O, ru2.c), 24);
    }

    public final hs0 F(String str) {
        str.getClass();
        s02 O = v9e.O(this.a.Q.n0(0, str));
        sw2 sw2Var = ab3.a;
        return new hs0(v9e.z(O, ru2.c), 25);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(1:9)(2:36|37))(2:38|(4:40|(2:43|41)|44|45)(2:46|(1:48)))|10|11|12|13|(3:15|(2:18|16)|19)|(2:21|22)(1:24)))|49|6|(0)(0)|10|11|12|13|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        r7 = r7.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (defpackage.jy.a() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
        r8 = defpackage.kw6.b;
        r0 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
        if (r8.a.a.compareTo(r0) <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        r8.a(r0, "Log", r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable G(defpackage.n42 r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.G(n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r11 != r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(defpackage.f76 r9, defpackage.cs9 r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qd9
            if (r0 == 0) goto L13
            r0 = r11
            qd9 r0 = (defpackage.qd9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qd9 r0 = new qd9
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            rc9 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            fb9 r8 = r0.a
            defpackage.hre.r(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L38:
            defpackage.hre.r(r11)
            goto L61
        L3c:
            defpackage.hre.r(r11)
            goto L54
        L40:
            defpackage.hre.r(r11)
            eb9 r11 = r2.a()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.Q(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "LuatNhan.dic"
            fb9 r11 = defpackage.q63.e(r11, r9)
            if (r11 != r7) goto L61
            goto L80
        L61:
            fb9 r11 = (defpackage.fb9) r11
            eb9 r9 = new eb9
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.m(r9)
            se9 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            q63 r8 = r8.e
            java.lang.Object r8 = r8.q(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.H(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r11 != r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(defpackage.f76 r9, defpackage.cs9 r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.rd9
            if (r0 == 0) goto L13
            r0 = r11
            rd9 r0 = (defpackage.rd9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rd9 r0 = new rd9
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            rc9 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            fb9 r8 = r0.a
            defpackage.hre.r(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L38:
            defpackage.hre.r(r11)
            goto L61
        L3c:
            defpackage.hre.r(r11)
            goto L54
        L40:
            defpackage.hre.r(r11)
            eb9 r11 = r2.d()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.R(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "NE.dic"
            fb9 r11 = defpackage.q63.f(r11, r9)
            if (r11 != r7) goto L61
            goto L80
        L61:
            fb9 r11 = (defpackage.fb9) r11
            eb9 r9 = new eb9
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.n(r9)
            se9 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            q63 r8 = r8.e
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.I(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r13 == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (r6 == r9) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(defpackage.f76 r11, defpackage.cs9 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.J(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r11 != r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(defpackage.f76 r9, defpackage.cs9 r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.td9
            if (r0 == 0) goto L13
            r0 = r11
            td9 r0 = (defpackage.td9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            td9 r0 = new td9
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            rc9 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            fb9 r8 = r0.a
            defpackage.hre.r(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L38:
            defpackage.hre.r(r11)
            goto L61
        L3c:
            defpackage.hre.r(r11)
            goto L54
        L40:
            defpackage.hre.r(r11)
            eb9 r11 = r2.g()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.Q(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "HV.dic"
            fb9 r11 = defpackage.q63.e(r11, r9)
            if (r11 != r7) goto L61
            goto L80
        L61:
            fb9 r11 = (defpackage.fb9) r11
            eb9 r9 = new eb9
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.o(r9)
            se9 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            q63 r8 = r8.e
            java.lang.Object r8 = r8.s(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.K(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r11 != r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.f76 r9, defpackage.cs9 r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ud9
            if (r0 == 0) goto L13
            r0 = r11
            ud9 r0 = (defpackage.ud9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ud9 r0 = new ud9
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            rc9 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            fb9 r8 = r0.a
            defpackage.hre.r(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L38:
            defpackage.hre.r(r11)
            goto L61
        L3c:
            defpackage.hre.r(r11)
            goto L54
        L40:
            defpackage.hre.r(r11)
            eb9 r11 = r2.h()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.R(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "Pronouns.dic"
            fb9 r11 = defpackage.q63.f(r11, r9)
            if (r11 != r7) goto L61
            goto L80
        L61:
            fb9 r11 = (defpackage.fb9) r11
            eb9 r9 = new eb9
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.p(r9)
            se9 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            q63 r8 = r8.e
            java.lang.Object r8 = r8.t(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.L(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r11 != r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.f76 r9, defpackage.cs9 r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.vd9
            if (r0 == 0) goto L13
            r0 = r11
            vd9 r0 = (defpackage.vd9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vd9 r0 = new vd9
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            rc9 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            fb9 r8 = r0.a
            defpackage.hre.r(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L38:
            defpackage.hre.r(r11)
            goto L61
        L3c:
            defpackage.hre.r(r11)
            goto L54
        L40:
            defpackage.hre.r(r11)
            eb9 r11 = r2.j()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.R(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "VP.dic"
            fb9 r11 = defpackage.q63.f(r11, r9)
            if (r11 != r7) goto L61
            goto L80
        L61:
            fb9 r11 = (defpackage.fb9) r11
            eb9 r9 = new eb9
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.q(r9)
            se9 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            q63 r8 = r8.e
            java.lang.Object r8 = r8.u(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.M(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r13 == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
        if (r7 == r9) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(defpackage.f76 r11, defpackage.cs9 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.N(f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r15 == r9) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r12, defpackage.f76 r13, defpackage.cs9 r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.O(java.lang.String, f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r15 == r9) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.String r12, defpackage.f76 r13, defpackage.cs9 r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.P(java.lang.String, f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.String r7, defpackage.f76 r8, defpackage.cs9 r9, defpackage.n42 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.zd9
            if (r0 == 0) goto L13
            r0 = r10
            zd9 r0 = (defpackage.zd9) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            zd9 r0 = new zd9
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 2
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r3) goto L31
            java.util.Map r6 = r0.c
            java.util.Map r6 = (java.util.Map) r6
            cs9 r7 = r0.b
            defpackage.hre.r(r10)
            goto L7a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L37:
            cs9 r9 = r0.b
            java.lang.String r7 = r0.a
            defpackage.hre.r(r10)
            goto L51
        L3f:
            defpackage.hre.r(r10)
            r0.a = r7
            r0.b = r9
            r0.f = r2
            q63 r6 = r6.e
            java.lang.Object r10 = r6.i(r8, r0)
            if (r10 != r5) goto L51
            goto L78
        L51:
            r6 = r10
            java.util.Map r6 = (java.util.Map) r6
            cs9 r8 = defpackage.cs9.a
            if (r9 != r8) goto L59
            return r6
        L59:
            if (r7 == 0) goto L66
            m66 r8 = defpackage.pe4.a
            hn8 r8 = defpackage.ie2.u(r8)
            hn8 r7 = defpackage.hn8.f(r8, r7)
            goto L67
        L66:
            r7 = r4
        L67:
            r0.a = r4
            r0.b = r9
            r8 = r6
            java.util.Map r8 = (java.util.Map) r8
            r0.c = r8
            r0.f = r3
            java.lang.Object r10 = defpackage.q63.j(r7)
            if (r10 != r5) goto L79
        L78:
            return r5
        L79:
            r7 = r9
        L7a:
            java.util.Map r10 = (java.util.Map) r10
            int r7 = r7.ordinal()
            if (r7 == 0) goto L93
            if (r7 == r2) goto L8f
            if (r7 != r3) goto L8b
            java.util.LinkedHashMap r6 = defpackage.o17.u(r6, r10)
            return r6
        L8b:
            defpackage.xk5.o()
            return r4
        L8f:
            java.util.LinkedHashMap r6 = defpackage.o17.u(r10, r6)
        L93:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.Q(java.lang.String, f76, cs9, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(java.lang.String r7, defpackage.f76 r8, defpackage.cs9 r9, defpackage.n42 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ae9
            if (r0 == 0) goto L13
            r0 = r10
            ae9 r0 = (defpackage.ae9) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ae9 r0 = new ae9
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 2
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r3) goto L31
            java.util.Map r6 = r0.c
            java.util.Map r6 = (java.util.Map) r6
            cs9 r7 = r0.b
            defpackage.hre.r(r10)
            goto L7a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L37:
            cs9 r9 = r0.b
            java.lang.String r7 = r0.a
            defpackage.hre.r(r10)
            goto L51
        L3f:
            defpackage.hre.r(r10)
            r0.a = r7
            r0.b = r9
            r0.f = r2
            q63 r6 = r6.e
            java.io.Serializable r10 = r6.n(r8, r0)
            if (r10 != r5) goto L51
            goto L78
        L51:
            r6 = r10
            java.util.Map r6 = (java.util.Map) r6
            cs9 r8 = defpackage.cs9.a
            if (r9 != r8) goto L59
            return r6
        L59:
            if (r7 == 0) goto L66
            m66 r8 = defpackage.pe4.a
            hn8 r8 = defpackage.ie2.u(r8)
            hn8 r7 = defpackage.hn8.f(r8, r7)
            goto L67
        L66:
            r7 = r4
        L67:
            r0.a = r4
            r0.b = r9
            r8 = r6
            java.util.Map r8 = (java.util.Map) r8
            r0.c = r8
            r0.f = r3
            java.lang.Object r10 = defpackage.q63.m(r7)
            if (r10 != r5) goto L79
        L78:
            return r5
        L79:
            r7 = r9
        L7a:
            java.util.Map r10 = (java.util.Map) r10
            int r7 = r7.ordinal()
            if (r7 == 0) goto L93
            if (r7 == r2) goto L8f
            if (r7 != r3) goto L8b
            java.util.LinkedHashMap r6 = defpackage.o17.u(r6, r10)
            return r6
        L8b:
            defpackage.xk5.o()
            return r4
        L8f:
            java.util.LinkedHashMap r6 = defpackage.o17.u(r10, r6)
        L93:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.R(java.lang.String, f76, cs9, n42):java.lang.Object");
    }

    public final void S() {
        this.g.a();
        ArrayList b = this.f.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.d.a();
            rc9 rc9Var = ze9Var.c;
            ze9Var.e = rc9Var.b();
            ze9Var.f = rc9Var.k();
            ze9Var.g = rc9Var.f();
            ze9Var.h = rc9Var.e();
            ze9Var.i = rc9Var.c();
            ze9Var.j = rc9Var.i();
            ze9Var.k = rc9Var.l();
        }
    }

    public final void T(List list) {
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc9 gc9Var = (gc9) it.next();
            arrayList.add(new jc9(gc9Var.a, gc9Var.b, gc9Var.c));
        }
        this.c.p.e(rc9.q[15], arrayList);
    }

    public final void c(String str, String str2, int i) {
        String B;
        long b;
        a63 a63Var;
        gk2 gk2Var = this.a.Q;
        cp2 cp2Var = (cp2) gk2Var.o0(str, "general", 1).e();
        ArrayList b2 = this.f.b();
        int size = b2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = b2.get(i2);
            i2++;
            ze9 ze9Var = (ze9) obj;
            if (i == 0) {
                ze9Var.A(str, str2);
            } else {
                ze9Var.getClass();
                ze9Var.d.a();
                aw4 aw4Var = ze9Var.m;
                if (aw4Var != null && (a63Var = aw4Var.h) != null) {
                    String str3 = (String) a63Var.a(str, "");
                }
            }
        }
        if (cp2Var == null || (B = cp2Var.a) == null) {
            B = ube.B();
        }
        if (cp2Var != null) {
            b = cp2Var.g;
        } else {
            b = by5.a.k().b();
        }
        gk2Var.E0(new cp2(B, "general", str, str2, 1, i, b, by5.a.k().b()));
    }

    public final void d(Map map) {
        gk2 gk2Var = this.a.Q;
        List c = gk2Var.n0(1, "general").c();
        int k = p17.k(tl1.s(c, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Object obj : c) {
            linkedHashMap.put(((cp2) obj).c, obj);
        }
        l0e.z(gk2Var, new uc9(map, linkedHashMap, this, 0));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList b = this.f.b();
            int size = b.size();
            int i = 0;
            while (i < size) {
                Object obj2 = b.get(i);
                i++;
                ((ze9) obj2).A(str, str2);
            }
        }
    }

    public final void e(String str, String str2, int i) {
        String B;
        long b;
        a63 a63Var;
        gk2 gk2Var = this.a.Q;
        int i2 = 0;
        cp2 cp2Var = (cp2) gk2Var.o0(str, "general", 0).e();
        ArrayList b2 = this.f.b();
        int size = b2.size();
        while (i2 < size) {
            Object obj = b2.get(i2);
            i2++;
            ze9 ze9Var = (ze9) obj;
            if (i == 0) {
                ze9Var.B(str, str2);
            } else {
                ze9Var.getClass();
                ze9Var.d.a();
                aw4 aw4Var = ze9Var.m;
                if (aw4Var != null && (a63Var = aw4Var.g) != null) {
                    String str3 = (String) a63Var.a(str, "");
                }
            }
        }
        if (cp2Var == null || (B = cp2Var.a) == null) {
            B = ube.B();
        }
        if (cp2Var != null) {
            b = cp2Var.g;
        } else {
            b = by5.a.k().b();
        }
        gk2Var.E0(new cp2(B, "general", str, str2, 0, i, b, by5.a.k().b()));
    }

    public final void f(Map map) {
        gk2 gk2Var = this.a.Q;
        List c = gk2Var.n0(0, "general").c();
        int k = p17.k(tl1.s(c, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Object obj : c) {
            linkedHashMap.put(((cp2) obj).c, obj);
        }
        l0e.z(gk2Var, new uc9(map, linkedHashMap, this, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList b = this.f.b();
            int size = b.size();
            int i = 0;
            while (i < size) {
                Object obj2 = b.get(i);
                i++;
                ((ze9) obj2).B(str, str2);
            }
        }
    }

    public final void g(String str, String str2, String str3) {
        String B;
        long b;
        gk2 gk2Var = this.a.Q;
        cp2 cp2Var = (cp2) gk2Var.o0(str2, str, 1).e();
        ArrayList b2 = this.f.b();
        int size = b2.size();
        int i = 0;
        while (i < size) {
            Object obj = b2.get(i);
            i++;
            ((ze9) obj).C(str, str2, str3);
        }
        if (cp2Var == null || (B = cp2Var.a) == null) {
            B = ube.B();
        }
        if (cp2Var != null) {
            b = cp2Var.g;
        } else {
            b = by5.a.k().b();
        }
        gk2Var.E0(new cp2(B, str, str2, str3, 1, 0, b, by5.a.k().b()));
    }

    public final void h(Map map, String str) {
        gk2 gk2Var = this.a.Q;
        List c = gk2Var.n0(1, str).c();
        int k = p17.k(tl1.s(c, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Object obj : c) {
            linkedHashMap.put(((cp2) obj).c, obj);
        }
        l0e.z(gk2Var, new tc9(map, linkedHashMap, this, str, 0));
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            ArrayList b = this.f.b();
            int size = b.size();
            int i = 0;
            while (i < size) {
                Object obj2 = b.get(i);
                i++;
                ((ze9) obj2).C(str, str2, str3);
            }
        }
    }

    public final void i(String str, String str2, String str3) {
        String B;
        long b;
        gk2 gk2Var = this.a.Q;
        int i = 0;
        cp2 cp2Var = (cp2) gk2Var.o0(str2, str, 0).e();
        ArrayList b2 = this.f.b();
        int size = b2.size();
        while (i < size) {
            Object obj = b2.get(i);
            i++;
            ((ze9) obj).D(str, str2, str3);
        }
        if (cp2Var == null || (B = cp2Var.a) == null) {
            B = ube.B();
        }
        if (cp2Var != null) {
            b = cp2Var.g;
        } else {
            b = by5.a.k().b();
        }
        gk2Var.E0(new cp2(B, str, str2, str3, 0, 0, b, by5.a.k().b()));
    }

    public final void j(Map map, String str) {
        gk2 gk2Var = this.a.Q;
        List c = gk2Var.n0(0, str).c();
        int k = p17.k(tl1.s(c, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Object obj : c) {
            linkedHashMap.put(((cp2) obj).c, obj);
        }
        l0e.z(gk2Var, new tc9(map, linkedHashMap, this, str, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            ArrayList b = this.f.b();
            int size = b.size();
            int i = 0;
            while (i < size) {
                Object obj2 = b.get(i);
                i++;
                ((ze9) obj2).D(str, str2, str3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.vc9
            if (r0 == 0) goto L13
            r0 = r7
            vc9 r0 = (defpackage.vc9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vc9 r0 = new vc9
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            rc9 r2 = r6.c
            r3 = 1
            r4 = 0
            pvc r5 = defpackage.pvc.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            eb9 r6 = r0.a
            defpackage.hre.r(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            defpackage.hre.r(r7)
            eb9 r7 = r2.a()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            se9 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            q63 r6 = r6.e
            aw4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.i = r4
        L4d:
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            m66 r7 = defpackage.pe4.a
            hn8 r0 = defpackage.ie2.u(r7)
            java.lang.String r6 = r6.a
            hn8 r6 = defpackage.hn8.f(r0, r6)
            r0 = 0
            r7.V(r6, r0)
            r2.m(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.k(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wc9
            if (r0 == 0) goto L13
            r0 = r7
            wc9 r0 = (defpackage.wc9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wc9 r0 = new wc9
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            rc9 r2 = r6.c
            r3 = 1
            r4 = 0
            pvc r5 = defpackage.pvc.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            eb9 r6 = r0.a
            defpackage.hre.r(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            defpackage.hre.r(r7)
            eb9 r7 = r2.d()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            se9 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            q63 r6 = r6.e
            aw4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.b = r4
        L4d:
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            m66 r7 = defpackage.pe4.a
            hn8 r0 = defpackage.ie2.u(r7)
            java.lang.String r6 = r6.a
            hn8 r6 = defpackage.hn8.f(r0, r6)
            r0 = 0
            r7.V(r6, r0)
            r2.n(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.l(n42):java.lang.Object");
    }

    public final void m() {
        this.a.Q.h0(1, "general");
        ArrayList b = this.f.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.d.a();
            aw4 aw4Var = ze9Var.m;
            if (aw4Var != null) {
                a63 a63Var = aw4Var.e;
                if (a63Var != null) {
                    a63Var.clear();
                }
                a63 a63Var2 = aw4Var.h;
                if (a63Var2 != null) {
                    a63Var2.clear();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.xc9
            if (r0 == 0) goto L13
            r0 = r7
            xc9 r0 = (defpackage.xc9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xc9 r0 = new xc9
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            rc9 r2 = r6.c
            r3 = 1
            r4 = 0
            pvc r5 = defpackage.pvc.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            eb9 r6 = r0.a
            defpackage.hre.r(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            defpackage.hre.r(r7)
            eb9 r7 = r2.g()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            se9 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            q63 r6 = r6.e
            aw4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.d = r4
        L4d:
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            m66 r7 = defpackage.pe4.a
            hn8 r0 = defpackage.ie2.u(r7)
            java.lang.String r6 = r6.a
            hn8 r6 = defpackage.hn8.f(r0, r6)
            r0 = 0
            r7.V(r6, r0)
            r2.o(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.n(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.yc9
            if (r0 == 0) goto L13
            r0 = r7
            yc9 r0 = (defpackage.yc9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yc9 r0 = new yc9
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            rc9 r2 = r6.c
            r3 = 1
            r4 = 0
            pvc r5 = defpackage.pvc.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            eb9 r6 = r0.a
            defpackage.hre.r(r7)
            goto L4e
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            defpackage.hre.r(r7)
            eb9 r7 = r2.h()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            r0.a = r7
            r0.d = r3
            q63 r6 = r6.e
            aw4 r6 = r6.e
            if (r6 == 0) goto L48
            r6.c = r4
        L48:
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L4d
            return r6
        L4d:
            r6 = r7
        L4e:
            m66 r7 = defpackage.pe4.a
            hn8 r0 = defpackage.ie2.u(r7)
            java.lang.String r6 = r6.a
            hn8 r6 = defpackage.hn8.f(r0, r6)
            r0 = 0
            r7.V(r6, r0)
            r2.p(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.o(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.zc9
            if (r0 == 0) goto L13
            r0 = r7
            zc9 r0 = (defpackage.zc9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zc9 r0 = new zc9
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            rc9 r2 = r6.c
            r3 = 1
            r4 = 0
            pvc r5 = defpackage.pvc.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            eb9 r6 = r0.a
            defpackage.hre.r(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            defpackage.hre.r(r7)
            eb9 r7 = r2.j()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            se9 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            q63 r6 = r6.e
            aw4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.a = r4
        L4d:
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            m66 r7 = defpackage.pe4.a
            hn8 r0 = defpackage.ie2.u(r7)
            java.lang.String r6 = r6.a
            hn8 r6 = defpackage.hn8.f(r0, r6)
            r0 = 0
            r7.V(r6, r0)
            r2.q(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.p(n42):java.lang.Object");
    }

    public final void q() {
        int i = 0;
        this.a.Q.h0(0, "general");
        ArrayList b = this.f.b();
        int size = b.size();
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.d.a();
            aw4 aw4Var = ze9Var.m;
            if (aw4Var != null) {
                a63 a63Var = aw4Var.f;
                if (a63Var != null) {
                    a63Var.clear();
                }
                a63 a63Var2 = aw4Var.g;
                if (a63Var2 != null) {
                    a63Var2.clear();
                }
            }
        }
    }

    public final void r(String str, String str2) {
        i69 i69Var;
        gk2 gk2Var = this.a.Q;
        gk2Var.getClass();
        str2.getClass();
        str.getClass();
        ip2 ip2Var = ip2.a;
        cp2 cp2Var = (cp2) new wn2(gk2Var, str2, str, new dp2(gk2Var, 4)).e();
        if (cp2Var != null && cp2Var.e == 1) {
            gk2Var.a0(cp2Var.a);
        }
        ArrayList b = this.f.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.getClass();
            ze9Var.d.a();
            if (c16.i(ze9Var.a, str) && (i69Var = ze9Var.n) != null) {
                i69Var.b.c(str2);
            }
        }
    }

    public final void s(String str) {
        i69 i69Var;
        this.a.Q.h0(1, str);
        ArrayList b = this.f.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.getClass();
            ze9Var.d.a();
            if (c16.i(ze9Var.a, str) && (i69Var = ze9Var.n) != null) {
                i69Var.b.clear();
            }
        }
    }

    public final void t(String str, String str2) {
        i69 i69Var;
        gk2 gk2Var = this.a.Q;
        gk2Var.getClass();
        str2.getClass();
        str.getClass();
        ip2 ip2Var = ip2.a;
        cp2 cp2Var = (cp2) new wn2(gk2Var, str2, str, new dp2(gk2Var, 4)).e();
        if (cp2Var != null && cp2Var.e == 0) {
            gk2Var.a0(cp2Var.a);
        }
        ArrayList b = this.f.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.getClass();
            ze9Var.d.a();
            if (c16.i(ze9Var.a, str) && (i69Var = ze9Var.n) != null) {
                i69Var.a.c(str2);
            }
        }
    }

    public final void u(String str) {
        i69 i69Var;
        int i = 0;
        this.a.Q.h0(0, str);
        ArrayList b = this.f.b();
        int size = b.size();
        while (i < size) {
            Object obj = b.get(i);
            i++;
            ze9 ze9Var = (ze9) obj;
            ze9Var.getClass();
            ze9Var.d.a();
            if (c16.i(ze9Var.a, str) && (i69Var = ze9Var.n) != null) {
                i69Var.a.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
        if (r13.B(r7, r8, r0) != r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0169, code lost:
        if (r13 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0197, code lost:
        if (r13 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c6, code lost:
        if (r13 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f4, code lost:
        if (r13 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0223, code lost:
        if (r13 == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x016d -> B:38:0x0138). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x019b -> B:38:0x0138). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01c6 -> B:63:0x01c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01f7 -> B:38:0x0138). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0226 -> B:38:0x0138). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.f58 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.v(f58, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
        if (r12.B(r2, r1, r0) != r6) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.n42 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cd9
            if (r0 == 0) goto L13
            r0 = r12
            cd9 r0 = (defpackage.cd9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cd9 r0 = new cd9
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 1
            pvc r3 = defpackage.pvc.a
            r4 = 0
            r5 = 2
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L36
            if (r1 != r5) goto L30
            hn8 r11 = r0.b
            defpackage.hre.r(r12)
            goto Ld8
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            return r4
        L36:
            hn8 r11 = r0.b
            hn8 r1 = r0.a
            defpackage.hre.r(r12)
            goto Lbd
        L3f:
            defpackage.hre.r(r12)
            m66 r12 = defpackage.pe4.a
            hn8 r1 = defpackage.ie2.u(r12)
            java.lang.String r7 = "analyzer"
            hn8 r1 = defpackage.hn8.f(r1, r7)
            boolean r7 = r12.j0(r1)
            if (r7 != 0) goto L57
            r12.Q(r1)
        L57:
            java.util.List r12 = r12.m0(r1)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L64
            return r3
        L64:
            java.lang.String r12 = "analyzer.zip"
            hn8 r12 = defpackage.hn8.f(r1, r12)
            rw r7 = r11.d
            u68 r8 = r7.g
            r76[] r9 = defpackage.rw.u
            r10 = 5
            r9 = r9[r10]
            java.lang.Object r7 = r8.c(r9, r7)
            java.lang.String r7 = (java.lang.String) r7
            gh5 r8 = new gh5
            r8.<init>()
            h40 r9 = defpackage.hh5.a
            r7.getClass()
            xtc r9 = r8.a
            defpackage.ytc.b(r9, r7)
            li5 r7 = new li5
            r7.<init>()
            r9 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r7.d(r9)
            r7.b(r9)
            r7.c(r9)
            ki5 r9 = defpackage.ki5.a
            r8.c(r9, r7)
            pg5 r7 = defpackage.pg5.b
            re5 r11 = r11.b
            hi5 r11 = defpackage.rs8.c(r8, r7, r8, r11)
            da r7 = new da
            r7.<init>(r12, r4)
            r0.a = r1
            r0.b = r12
            r0.e = r2
            java.lang.Object r11 = r11.b(r7, r0)
            if (r11 != r6) goto Lbc
            goto Ld7
        Lbc:
            r11 = r12
        Lbd:
            r0f r12 = defpackage.r0f.P
            e31 r2 = r11.a
            java.lang.String r2 = r2.t()
            e31 r1 = r1.a
            java.lang.String r1 = r1.t()
            r0.a = r4
            r0.b = r11
            r0.e = r5
            java.lang.Object r12 = r12.B(r2, r1, r0)
            if (r12 != r6) goto Ld8
        Ld7:
            return r6
        Ld8:
            m66 r12 = defpackage.pe4.a
            r12.S(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.w(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r5 == r4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r6, java.lang.String r7, defpackage.n42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dd9
            if (r0 == 0) goto L13
            r0 = r8
            dd9 r0 = (defpackage.dd9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dd9 r0 = new dd9
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.b
            int r8 = r0.d
            r1 = 1
            r2 = 2
            r3 = 0
            n82 r4 = defpackage.n82.a
            if (r8 == 0) goto L37
            if (r8 == r1) goto L31
            if (r8 != r2) goto L2b
            defpackage.hre.r(r5)
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L31:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r5)
            goto L58
        L37:
            defpackage.hre.r(r5)
            if (r6 == 0) goto L6d
            int r5 = r6.length()
            if (r5 != 0) goto L43
            goto L6d
        L43:
            m66 r5 = defpackage.pe4.a
            hn8 r5 = defpackage.ie2.u(r5)
            hn8 r5 = defpackage.hn8.f(r5, r6)
            r0.a = r7
            r0.d = r1
            java.lang.Object r5 = defpackage.q63.j(r5)
            if (r5 != r4) goto L58
            goto L6b
        L58:
            java.util.Map r5 = (java.util.Map) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L61
            goto L6d
        L61:
            r0.a = r3
            r0.d = r2
            java.lang.String r5 = U(r5, r7)
            if (r5 != r4) goto L6c
        L6b:
            return r4
        L6c:
            return r5
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.x(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r5 == r4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r6, java.lang.String r7, defpackage.n42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ed9
            if (r0 == 0) goto L13
            r0 = r8
            ed9 r0 = (defpackage.ed9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ed9 r0 = new ed9
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.b
            int r8 = r0.d
            r1 = 1
            r2 = 2
            r3 = 0
            n82 r4 = defpackage.n82.a
            if (r8 == 0) goto L37
            if (r8 == r1) goto L31
            if (r8 != r2) goto L2b
            defpackage.hre.r(r5)
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L31:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r5)
            goto L58
        L37:
            defpackage.hre.r(r5)
            if (r6 == 0) goto L6d
            int r5 = r6.length()
            if (r5 != 0) goto L43
            goto L6d
        L43:
            m66 r5 = defpackage.pe4.a
            hn8 r5 = defpackage.ie2.u(r5)
            hn8 r5 = defpackage.hn8.f(r5, r6)
            r0.a = r7
            r0.d = r1
            java.lang.Object r5 = defpackage.q63.m(r5)
            if (r5 != r4) goto L58
            goto L6b
        L58:
            java.util.Map r5 = (java.util.Map) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L61
            goto L6d
        L61:
            r0.a = r3
            r0.d = r2
            java.lang.String r5 = U(r5, r7)
            if (r5 != r4) goto L6c
        L6b:
            return r4
        L6c:
            return r5
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be9.y(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public final fb9 z() {
        rc9 rc9Var = this.c;
        eb9 a = rc9Var.a();
        if (a == null) {
            return null;
        }
        String str = a.a;
        m66 m66Var = pe4.a;
        if (!m66Var.j0(hn8.f(ie2.u(m66Var), str))) {
            rc9Var.m(null);
            return null;
        }
        return new fb9(str, a.b);
    }
}
