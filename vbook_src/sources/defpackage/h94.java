package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h94  reason: default package */
/* loaded from: classes3.dex */
public final class h94 implements xyb {
    public final String a;
    public final ii2 b;
    public final h1a c;
    public final m41 d;
    public List e;
    public List f;
    public int g;
    public int h;
    public final af i;
    public bp9 j;
    public List k;
    public wyb l;
    public final mfb m;
    public float n;
    public float o;
    public int p;
    public int q;
    public boolean r;
    public final k97 s;
    public int t;
    public boolean u;
    public final mce v;
    public iya w;
    public String x;

    public h94(String str, ii2 ii2Var, h1a h1aVar) {
        str.getClass();
        this.a = str;
        this.b = ii2Var;
        this.c = h1aVar;
        sw2 sw2Var = ab3.a;
        this.d = k27.a(zz6.a.f);
        this.h = -1;
        this.i = new af();
        this.m = new mfb(new z84(this, 0));
        this.n = 1.0f;
        this.o = 1.0f;
        hq7 hq7Var = wl3.b;
        this.s = new k97(10);
        this.v = new mce(this);
        this.x = "";
    }

    public static final void A(h94 h94Var) {
        List list;
        if (h94Var.k != null) {
            if (h94Var.p < list.size() - 1) {
                h94Var.p++;
                h94Var.E();
                return;
            }
            bp9 bp9Var = h94Var.j;
            if (bp9Var != null) {
                bp9Var.n();
            }
        }
    }

    public static final Object z(h94 h94Var, String str, r9 r9Var) {
        byte[] bArr;
        k97 k97Var = h94Var.s;
        k97Var.getClass();
        Object h = k97Var.a.h(str);
        a94 a94Var = h;
        if (h == null) {
            a94 a94Var2 = new a94();
            h94Var.C(a94Var2, str);
            k97Var.a(str, a94Var2);
            a94Var = a94Var2;
        }
        a94 a94Var3 = a94Var;
        cza czaVar = a94Var3.a;
        if (a94Var3.b && ((bArr = (byte[]) czaVar.getValue()) == null || bArr.length == 0)) {
            h94Var.C(a94Var3, str);
        }
        return z1d.C(new mx(czaVar, 4), r9Var);
    }

    public final x1c B() {
        return (x1c) this.m.getValue();
    }

    public final void C(a94 a94Var, String str) {
        sw2 sw2Var = ab3.a;
        z87.v(this.d, ru2.c, null, new l(a94Var, this, str, (m42) null, 20), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable D(java.lang.String r10, defpackage.syb r11, defpackage.n42 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.c94
            if (r0 == 0) goto L13
            r0 = r12
            c94 r0 = (defpackage.c94) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            c94 r0 = new c94
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r12)
            goto L55
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.hre.r(r12)
            int r12 = r9.h
            if (r12 >= 0) goto L37
            int r11 = r11.c
        L35:
            r6 = r11
            goto L3e
        L37:
            int r11 = r11.c
            int r11 = defpackage.dce.n(r12, r2, r11)
            goto L35
        L3e:
            int r4 = r9.g
            r0.c = r2
            sw2 r11 = defpackage.ab3.a
            mo r3 = new mo
            r8 = 0
            r7 = 0
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r12 = defpackage.z87.E(r11, r3, r0)
            n82 r10 = defpackage.n82.a
            if (r12 != r10) goto L55
            return r10
        L55:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = defpackage.tl1.s(r12, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L66:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L9b
            java.lang.Object r12 = r11.next()
            uyb r12 = (defpackage.uyb) r12
            java.lang.String r0 = r12.a
            java.util.List r1 = r9.e
            if (r1 == 0) goto L93
            java.util.Iterator r1 = r1.iterator()
        L7c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            doa r2 = (defpackage.doa) r2
            java.lang.String r3 = r2.b
            java.lang.String r4 = r2.c
            boolean r2 = r2.d
            java.lang.String r0 = defpackage.r4b.N(r0, r2, r3, r4)
            goto L7c
        L93:
            uyb r12 = defpackage.uyb.a(r12, r0)
            r10.add(r12)
            goto L66
        L9b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r10.size()
            r12 = 0
        La5:
            if (r12 >= r11) goto Lbc
            java.lang.Object r0 = r10.get(r12)
            int r12 = r12 + 1
            r1 = r0
            uyb r1 = (defpackage.uyb) r1
            java.lang.String r1 = r1.a
            int r1 = r1.length()
            if (r1 <= 0) goto La5
            r9.add(r0)
            goto La5
        Lbc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.D(java.lang.String, syb, n42):java.io.Serializable");
    }

    public final void E() {
        iya iyaVar = this.w;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        sw2 sw2Var = ab3.a;
        this.w = z87.v(this.d, ru2.c, null, new r9(this, null, 12), 2);
    }

    @Override // defpackage.xyb
    public final pvc a(ryb rybVar) {
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final void b(int i) {
        this.h = i;
    }

    @Override // defpackage.xyb
    public final Object c(m42 m42Var) {
        return B().c((n42) m42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r9 == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.m42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.e94
            if (r0 == 0) goto L13
            r0 = r9
            e94 r0 = (defpackage.e94) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            e94 r0 = new e94
            n42 r9 = (defpackage.n42) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            syb r8 = r0.b
            defpackage.hre.r(r9)
            goto L66
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L35:
            java.lang.String r8 = r0.a
            defpackage.hre.r(r9)
            goto L54
        L3b:
            defpackage.hre.r(r9)
            int r9 = r8.length()
            if (r9 != 0) goto L45
            goto La0
        L45:
            x1c r9 = r7.B()
            r0.a = r8
            r0.e = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r5) goto L54
            goto L62
        L54:
            syb r9 = (defpackage.syb) r9
            r0.a = r2
            r0.b = r9
            r0.e = r3
            java.io.Serializable r8 = r7.D(r8, r9, r0)
            if (r8 != r5) goto L63
        L62:
            return r5
        L63:
            r6 = r9
            r9 = r8
            r8 = r6
        L66:
            java.util.List r9 = (java.util.List) r9
            int r8 = r8.a
            int r8 = r8 + r4
            if (r8 >= r4) goto L6e
            goto L6f
        L6e:
            r4 = r8
        L6f:
            java.util.List r8 = defpackage.sl1.v0(r9, r4)
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La0
            java.lang.Object r9 = r8.next()
            uyb r9 = (defpackage.uyb) r9
            java.lang.String r0 = r9.a
            k97 r1 = r7.s
            r1.getClass()
            j97 r2 = r1.a
            java.lang.Object r2 = r2.h(r0)
            if (r2 != 0) goto L77
            a94 r2 = new a94
            r2.<init>()
            java.lang.String r9 = r9.a
            r7.C(r2, r9)
            r1.a(r0, r2)
            goto L77
        La0:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.d(java.lang.String, m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void e(List list) {
        this.f = list;
    }

    @Override // defpackage.xyb
    public final Object f(m42 m42Var) {
        if (this.k == null) {
            return Boolean.FALSE;
        }
        int i = this.p;
        if (i <= 0) {
            return Boolean.FALSE;
        }
        this.p = i - 1;
        E();
        return Boolean.TRUE;
    }

    @Override // defpackage.xyb
    public final Object g(float f, n42 n42Var) {
        this.o = f;
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object h(tyb tybVar, m42 m42Var) {
        return B().e(tybVar.a, (n42) m42Var);
    }

    @Override // defpackage.xyb
    public final Object i(float f, n42 n42Var) {
        this.n = f;
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final void j(List list) {
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.xyb
    public final Object k(n42 n42Var) {
        return B().b(n42Var);
    }

    @Override // defpackage.xyb
    public final Boolean l(rpc rpcVar) {
        return Boolean.valueOf(this.i.a());
    }

    @Override // defpackage.xyb
    public final Object m(m42 m42Var) {
        return ks3.a;
    }

    @Override // defpackage.xyb
    public final void n(int i) {
        this.g = i;
    }

    @Override // defpackage.xyb
    public final Object o(m42 m42Var) {
        List list;
        if (this.k == null) {
            return Boolean.FALSE;
        }
        if (this.p > list.size() - 1) {
            return Boolean.FALSE;
        }
        this.p++;
        E();
        return Boolean.TRUE;
    }

    @Override // defpackage.xyb
    public final Object q(m42 m42Var) {
        boolean z = this.u;
        pvc pvcVar = pvc.a;
        if (z) {
            E();
            return pvcVar;
        }
        this.i.d();
        return pvcVar;
    }

    @Override // defpackage.xyb
    public final Object r(float f, kqc kqcVar) {
        List list = this.k;
        pvc pvcVar = pvc.a;
        if (list != null) {
            this.p = (int) (f * list.size());
            E();
        }
        return pvcVar;
    }

    @Override // defpackage.xyb
    public final Object s(tyb tybVar, n42 n42Var) {
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.g94
            if (r0 == 0) goto L13
            r0 = r6
            g94 r0 = (defpackage.g94) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            g94 r0 = new g94
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.hre.r(r6)
            goto L3d
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            r0.c = r4
            af r6 = r5.i
            r6.e()
            n82 r6 = defpackage.n82.a
            if (r3 != r6) goto L3d
            return r6
        L3d:
            iya r5 = r5.w
            if (r5 == 0) goto L44
            r5.cancel(r2)
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.t(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r11 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r7, int r8, long r9, defpackage.n42 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.f94
            if (r0 == 0) goto L13
            r0 = r11
            f94 r0 = (defpackage.f94) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            f94 r0 = new f94
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.C
            r2 = 2
            r3 = 0
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L35
            if (r1 != r2) goto L2f
            int r7 = r0.c
            h94 r8 = r0.b
            defpackage.hre.r(r11)
            goto L72
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L35:
            long r9 = r0.d
            int r8 = r0.c
            java.lang.String r7 = r0.a
            defpackage.hre.r(r11)
            goto L55
        L3f:
            defpackage.hre.r(r11)
            x1c r11 = r6.B()
            r0.a = r7
            r0.c = r8
            r0.d = r9
            r0.C = r4
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r5) goto L55
            goto L6f
        L55:
            syb r11 = (defpackage.syb) r11
            int r1 = r11.a
            r6.q = r1
            boolean r1 = r11.b
            r6.r = r1
            r0.a = r3
            r0.b = r6
            r0.c = r8
            r0.d = r9
            r0.C = r2
            java.io.Serializable r11 = r6.D(r7, r11, r0)
            if (r11 != r5) goto L70
        L6f:
            return r5
        L70:
            r7 = r8
            r8 = r6
        L72:
            java.util.List r11 = (java.util.List) r11
            r8.k = r11
            java.util.List r8 = r6.k
            r9 = 0
            if (r8 == 0) goto Lab
            java.util.Iterator r8 = r8.iterator()
            r10 = r9
        L80:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L98
            java.lang.Object r11 = r8.next()
            uyb r11 = (defpackage.uyb) r11
            int r0 = r11.b
            if (r0 > r7) goto L95
            int r11 = r11.c
            if (r11 < r7) goto L95
            goto L99
        L95:
            int r10 = r10 + 1
            goto L80
        L98:
            r10 = -1
        L99:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            int r8 = r7.intValue()
            if (r8 < 0) goto La5
            r3 = r7
        La5:
            if (r3 == 0) goto Lab
            int r9 = r3.intValue()
        Lab:
            r6.p = r9
            r6.E()
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.u(java.lang.String, int, long, n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void v(bp9 bp9Var) {
        this.j = bp9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.b94
            if (r0 == 0) goto L13
            r0 = r6
            b94 r0 = (defpackage.b94) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            b94 r0 = new b94
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.hre.r(r6)
            goto L3f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            r0.c = r4
            af r6 = r5.i
            android.media.MediaPlayer r6 = r6.a
            r6.release()
            n82 r6 = defpackage.n82.a
            if (r3 != r6) goto L3f
            return r6
        L3f:
            x1c r6 = r5.B()
            r6.getClass()
            iya r6 = r5.w
            if (r6 == 0) goto L4d
            r6.cancel(r2)
        L4d:
            m41 r5 = r5.d
            defpackage.k27.n(r5, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.w(n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object x(wyb wybVar, n42 n42Var) {
        if (!c16.i(this.l, wybVar)) {
            this.l = wybVar;
            this.s.b();
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r10 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r4 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r4 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.n42 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.d94
            if (r0 == 0) goto L13
            r0 = r10
            d94 r0 = (defpackage.d94) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            d94 r0 = new d94
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            pvc r4 = defpackage.pvc.a
            af r5 = r9.i
            r6 = 0
            r7 = 1
            n82 r8 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r7) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            defpackage.hre.r(r10)
            goto L74
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r6
        L38:
            defpackage.hre.r(r10)
            goto L68
        L3c:
            defpackage.hre.r(r10)
            goto L50
        L40:
            defpackage.hre.r(r10)
            r0.c = r7
            boolean r10 = r5.a()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            if (r10 != r8) goto L50
            goto L73
        L50:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6c
            r0.c = r3
            boolean r10 = r5.a()
            if (r10 == 0) goto L65
            android.media.MediaPlayer r10 = r5.a
            r10.pause()
        L65:
            if (r4 != r8) goto L68
            goto L73
        L68:
            r10 = 0
            r9.u = r10
            goto L7a
        L6c:
            r0.c = r2
            r5.e()
            if (r4 != r8) goto L74
        L73:
            return r8
        L74:
            r5.c = r6
            r5.b = r6
            r9.u = r7
        L7a:
            iya r9 = r9.w
            if (r9 == 0) goto L81
            r9.cancel(r6)
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.y(n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void p(boolean z) {
    }
}
