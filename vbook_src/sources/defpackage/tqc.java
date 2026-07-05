package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tqc  reason: default package */
/* loaded from: classes3.dex */
public final class tqc {
    public static final long P;
    public static final /* synthetic */ int Q = 0;
    public iya A;
    public long B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public List G;
    public List H;
    public List I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public final k97 O;
    public final String a;
    public final io5 b;
    public final ixb c;
    public final wl6 d;
    public final a2c e;
    public final n64 f;
    public final klc g;
    public final nld h;
    public final npc i;
    public final fyb j;
    public final m41 k;
    public final Object l;
    public final vpc m;
    public final kg0 n;
    public kw5 o;
    public vl6 p;
    public dyb q;
    public List r;
    public LinkedHashMap s;
    public zmc t;
    public int u;
    public String v;
    public String w;
    public double x;
    public int y;
    public int z;

    static {
        hq7 hq7Var = wl3.b;
        P = jue.O(1, am3.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [vpc, java.lang.Object] */
    public tqc(String str, io5 io5Var, ixb ixbVar, wl6 wl6Var, a2c a2cVar, n64 n64Var, klc klcVar, nld nldVar, npc npcVar, fyb fybVar) {
        str.getClass();
        io5Var.getClass();
        ixbVar.getClass();
        wl6Var.getClass();
        a2cVar.getClass();
        n64Var.getClass();
        klcVar.getClass();
        nldVar.getClass();
        npcVar.getClass();
        fybVar.getClass();
        this.a = str;
        this.b = io5Var;
        this.c = ixbVar;
        this.d = wl6Var;
        this.e = a2cVar;
        this.f = n64Var;
        this.g = klcVar;
        this.h = nldVar;
        this.i = npcVar;
        this.j = fybVar;
        sw2 sw2Var = ab3.a;
        this.k = k27.a(ru2.c);
        this.l = new Object();
        this.m = new Object();
        this.n = new kg0();
        this.v = "";
        this.w = "";
        this.D = "";
        this.E = "";
        this.F = "";
        ks3 ks3Var = ks3.a;
        this.G = ks3Var;
        this.H = ks3Var;
        this.I = ks3Var;
        this.O = new k97(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r9 != r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r9 != r7) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.tqc r8, defpackage.n42 r9) {
        /*
            nld r0 = r8.h
            boolean r1 = r9 instanceof defpackage.eqc
            if (r1 == 0) goto L15
            r1 = r9
            eqc r1 = (defpackage.eqc) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            eqc r1 = new eqc
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.b
            int r2 = r1.d
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            n82 r7 = defpackage.n82.a
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L47
            if (r2 == r6) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L34
            tqc r8 = r1.a
            defpackage.hre.r(r9)
            goto L98
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L3b:
            tqc r2 = r1.a
            defpackage.hre.r(r9)
            goto L83
        L41:
            tqc r2 = r1.a
            defpackage.hre.r(r9)
            goto L6d
        L47:
            tqc r2 = r1.a
            defpackage.hre.r(r9)
            goto L60
        L4d:
            defpackage.hre.r(r9)
            a2c r9 = r8.e
            r1.a = r8
            r1.d = r5
            i2c r9 = (defpackage.i2c) r9
            hs0 r9 = r9.p()
            if (r9 != r7) goto L5f
            goto L97
        L5f:
            r2 = r8
        L60:
            sj4 r9 = (defpackage.sj4) r9
            r1.a = r2
            r1.d = r6
            java.lang.Object r9 = defpackage.z1d.C(r9, r1)
            if (r9 != r7) goto L6d
            goto L97
        L6d:
            java.util.List r9 = (java.util.List) r9
            r2.G = r9
            java.lang.String r9 = r8.a
            bad r9 = defpackage.nld.a(r0, r9)
            r1.a = r8
            r1.d = r4
            java.lang.Object r9 = defpackage.z1d.C(r9, r1)
            if (r9 != r7) goto L82
            goto L97
        L82:
            r2 = r8
        L83:
            java.util.List r9 = (java.util.List) r9
            r2.H = r9
            yld r0 = (defpackage.yld) r0
            bad r9 = r0.e()
            r1.a = r8
            r1.d = r3
            java.lang.Object r9 = defpackage.z1d.C(r9, r1)
            if (r9 != r7) goto L98
        L97:
            return r7
        L98:
            java.util.List r9 = (java.util.List) r9
            r8.I = r9
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.a(tqc, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0367, code lost:
        if (r13.equals(r10) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
        if (r0 == r10) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023f, code lost:
        if (r0 == r10) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.tqc r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.b(tqc, n42):java.lang.Object");
    }

    public final ps c(ps psVar) {
        if (this.I.isEmpty() && this.H.isEmpty()) {
            return psVar;
        }
        String str = psVar.b;
        str.getClass();
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            arrayList.add(new o29(str.charAt(i), i2));
            i++;
            i2++;
        }
        tb1 tb1Var = new tb1(arrayList);
        for (mnc mncVar : this.I) {
            tb1Var = tb1Var.d(mncVar.c, "", mncVar.d, false);
        }
        for (ox7 ox7Var : this.H) {
            tb1Var = tb1Var.d(ox7Var.c, ox7Var.d, false, ox7Var.e);
        }
        return new ps(tb1Var.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r8 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r8 != r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r8 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r8 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
        if (r8 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.n42 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.xpc
            if (r0 == 0) goto L13
            r0 = r12
            xpc r0 = (defpackage.xpc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xpc r0 = new xpc
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            a2c r7 = r11.e
            pvc r8 = defpackage.pvc.a
            vpc r9 = r11.m
            n82 r10 = defpackage.n82.a
            if (r1 == 0) goto L51
            if (r1 == r6) goto L4d
            if (r1 == r5) goto L49
            if (r1 == r4) goto L45
            if (r1 == r3) goto L41
            if (r1 != r2) goto L3a
            defpackage.hre.r(r12)
            goto Lad
        L3a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L41:
            defpackage.hre.r(r12)
            goto L9b
        L45:
            defpackage.hre.r(r12)
            goto L88
        L49:
            defpackage.hre.r(r12)
            goto L75
        L4d:
            defpackage.hre.r(r12)
            goto L62
        L51:
            defpackage.hre.r(r12)
            java.util.List r12 = r11.G
            r0.c = r6
            xyb r1 = r9.a
            if (r1 == 0) goto L5f
            r1.j(r12)
        L5f:
            if (r8 != r10) goto L62
            goto Lac
        L62:
            r12 = r7
            i2c r12 = (defpackage.i2c) r12
            java.util.List r12 = r12.n()
            r0.c = r5
            xyb r1 = r9.a
            if (r1 == 0) goto L72
            r1.e(r12)
        L72:
            if (r8 != r10) goto L75
            goto Lac
        L75:
            r12 = r7
            i2c r12 = (defpackage.i2c) r12
            int r12 = r12.i()
            r0.c = r4
            xyb r1 = r9.a
            if (r1 == 0) goto L85
            r1.n(r12)
        L85:
            if (r8 != r10) goto L88
            goto Lac
        L88:
            r12 = r7
            i2c r12 = (defpackage.i2c) r12
            int r12 = r12.h()
            r0.c = r3
            xyb r1 = r9.a
            if (r1 == 0) goto L98
            r1.b(r12)
        L98:
            if (r8 != r10) goto L9b
            goto Lac
        L9b:
            i2c r7 = (defpackage.i2c) r7
            boolean r12 = r7.t()
            r0.c = r2
            xyb r0 = r9.a
            if (r0 == 0) goto Laa
            r0.p(r12)
        Laa:
            if (r8 != r10) goto Lad
        Lac:
            return r10
        Lad:
            bp9 r12 = new bp9
            r0 = 7
            r12.<init>(r11, r0)
            xyb r11 = r9.a
            if (r11 == 0) goto Lba
            r11.v(r12)
        Lba:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.d(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.zpc
            if (r0 == 0) goto L14
            r0 = r9
            zpc r0 = (defpackage.zpc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zpc r0 = new zpc
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.a
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.hre.r(r9)
            goto L66
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.hre.r(r9)
            boolean r9 = r7.K
            if (r9 != 0) goto L36
            goto L49
        L36:
            java.lang.String r9 = r7.D
            java.lang.String r0 = "qt"
            boolean r9 = defpackage.c16.i(r9, r0)
            if (r9 != 0) goto L41
            goto L49
        L41:
            java.lang.String r9 = r7.D
            zmc r9 = r7.i(r9)
            if (r9 != 0) goto L4a
        L49:
            return r8
        L4a:
            java.lang.String r3 = r7.E
            java.lang.String r4 = r7.F
            java.lang.String r7 = "convertSimplified"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.Map r5 = java.util.Collections.singletonMap(r7, r0)
            r5.getClass()
            r6.c = r1
            r2 = r8
            r1 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            n82 r7 = defpackage.n82.a
            if (r9 != r7) goto L66
            return r7
        L66:
            wmc r9 = (defpackage.wmc) r9
            java.lang.String r7 = r9.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.e(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(14:23|24|(1:26)|27|(1:28)|30|31|(1:32)|34|35|(1:37)|38|(1:40)|41))(2:43|44))(3:50|51|(2:53|22)(1:54))|45|(1:47)(1:49)))|56|6|7|(0)(0)|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r10 != r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
        if (r5 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
        if (x(r0) == r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:18:0x003f, B:21:0x0045, B:28:0x005d, B:30:0x0067, B:24:0x004e), top: B:59:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.f(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(4:11|12|(1:14)|15)(2:17|18))(1:19))(1:27)|20|(1:24)))|30|6|7|(0)(0)|20|(2:22|24)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (x(r0) == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r3 != r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bqc
            if (r0 == 0) goto L13
            r0 = r8
            bqc r0 = (defpackage.bqc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bqc r0 = new bqc
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L59
            goto L59
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L33:
            defpackage.hre.r(r8)
            goto L43
        L37:
            defpackage.hre.r(r8)
            r0.c = r5
            java.lang.Object r8 = r7.x(r0)
            if (r8 != r6) goto L43
            goto L58
        L43:
            kg0 r8 = r7.n     // Catch: java.lang.Throwable -> L59
            r0.c = r4     // Catch: java.lang.Throwable -> L59
            af r8 = r8.a     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L56
            boolean r0 = r8.a()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L56
            android.media.MediaPlayer r8 = r8.a     // Catch: java.lang.Throwable -> L59
            r8.pause()     // Catch: java.lang.Throwable -> L59
        L56:
            if (r3 != r6) goto L59
        L58:
            return r6
        L59:
            r7.C = r5
            yj1 r8 = defpackage.by5.a
            zx5 r8 = r8.k()
            long r0 = r8.b()
            r7.M = r0
            iya r7 = r7.A
            if (r7 == 0) goto L6e
            r7.cancel(r2)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.g(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(6:18|19|20|(1:22)|13|14))(2:25|26))(3:30|31|(2:33|24))|27|(2:29|24)|20|(0)|13|14))|35|6|7|(0)(0)|27|(0)|20|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r7.k(r0) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:13:0x002a, B:18:0x0036, B:30:0x005d, B:32:0x0065, B:21:0x003c, B:27:0x0050, B:24:0x0043), top: B:38:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cqc
            if (r0 == 0) goto L13
            r0 = r8
            cqc r0 = (defpackage.cqc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqc r0 = new cqc
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L70
            goto L70
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L34:
            tqc r7 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L70
            goto L5d
        L3a:
            tqc r7 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L70
            goto L50
        L40:
            defpackage.hre.r(r8)
            vpc r8 = r7.m     // Catch: java.lang.Throwable -> L70
            r0.a = r7     // Catch: java.lang.Throwable -> L70
            r0.d = r5     // Catch: java.lang.Throwable -> L70
            java.lang.Object r8 = r8.f(r0)     // Catch: java.lang.Throwable -> L70
            if (r8 != r6) goto L50
            goto L6f
        L50:
            vpc r8 = r7.m     // Catch: java.lang.Throwable -> L70
            r0.a = r7     // Catch: java.lang.Throwable -> L70
            r0.d = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r8 = r8.e(r0)     // Catch: java.lang.Throwable -> L70
            if (r8 != r6) goto L5d
            goto L6f
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L70
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r8 != 0) goto L70
            r0.a = r2     // Catch: java.lang.Throwable -> L70
            r0.d = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r7 = r7.k(r0)     // Catch: java.lang.Throwable -> L70
            if (r7 != r6) goto L70
        L6f:
            return r6
        L70:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.h(n42):java.lang.Object");
    }

    public final zmc i(String str) {
        zmc zmcVar;
        synchronized (this.l) {
            zmcVar = this.t;
            if (zmcVar == null) {
                klc klcVar = this.g;
                String str2 = this.a;
                plc plcVar = (plc) klcVar;
                plcVar.getClass();
                str.getClass();
                str2.getClass();
                zmcVar = plcVar.c.d(str, str2);
                this.t = zmcVar;
            }
        }
        return zmcVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(2:71|(1:(1:(9:75|76|43|(1:48)|49|(1:51)|52|(2:54|(2:56|(1:58)))|(1:62)(2:60|61))(2:77|78))(8:79|80|81|37|(1:39)|40|(8:42|43|(2:45|48)|49|(0)|52|(0)|(0)(0))|23))(3:82|83|84))(2:9|(2:11|(1:13)(2:15|(3:17|18|(2:20|(2:22|23)(1:24))(2:65|66))(2:67|68)))(2:69|70))|25|(1:64)(1:29)|30|(1:32)(1:63)|33|(2:35|23)(6:36|37|(0)|40|(0)|23)))|89|6|7|(0)(0)|25|(1:27)|64|30|(0)(0)|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:63:0x0104, B:65:0x0108, B:56:0x00e7, B:59:0x00ec, B:42:0x0098, B:44:0x009c, B:48:0x00a7, B:50:0x00ab, B:52:0x00c6, B:51:0x00c4, B:36:0x007f, B:38:0x0083, B:69:0x0111, B:70:0x0116), top: B:91:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:63:0x0104, B:65:0x0108, B:56:0x00e7, B:59:0x00ec, B:42:0x0098, B:44:0x009c, B:48:0x00a7, B:50:0x00ab, B:52:0x00c6, B:51:0x00c4, B:36:0x007f, B:38:0x0083, B:69:0x0111, B:70:0x0116), top: B:91:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(int r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.j(int, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gqc
            if (r0 == 0) goto L13
            r0 = r5
            gqc r0 = (defpackage.gqc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gqc r0 = new gqc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r5)
            goto L57
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r5)
            java.util.List r5 = r4.r
            if (r5 == 0) goto L60
            int r5 = r5.size()
            int r1 = r4.u
            int r5 = r5 - r3
            if (r1 >= r5) goto L4c
            sw2 r5 = defpackage.ab3.a
            ru2 r5 = defpackage.ru2.c
            ypc r0 = new ypc
            r1 = 2
            r0.<init>(r4, r2, r1)
            m41 r4 = r4.k
            defpackage.z87.v(r4, r5, r2, r0, r1)
            goto L5d
        L4c:
            r0.c = r3
            java.lang.Object r5 = r4.x(r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L57
            return r0
        L57:
            npc r4 = r4.i
            r5 = 0
            r4.d(r5, r5)
        L5d:
            pvc r4 = defpackage.pvc.a
            return r4
        L60:
            java.lang.String r4 = "chapterList"
            defpackage.c16.w(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.k(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(1:(4:13|14|(1:16)|17)(2:19|20))(5:21|22|23|(1:25)|26))(5:29|30|31|(1:33)|34))(2:36|37))(4:41|42|(1:46)|(2:48|28)(1:49))|38|(2:40|28)|31|(0)|34))|52|6|7|(0)(0)|38|(0)|31|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (r0 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
        r3 = new defpackage.gs9(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
        if (x(r1) == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:17:0x003a, B:22:0x0044, B:39:0x0077, B:41:0x007c, B:42:0x009d, B:25:0x004a, B:36:0x006a, B:28:0x0051, B:30:0x005b, B:32:0x0061), top: B:57:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.l(n42):java.lang.Object");
    }

    public final void m() {
        List list = this.r;
        if (list != null) {
            if (!list.isEmpty() && this.u > 0) {
                sw2 sw2Var = ab3.a;
                z87.v(this.k, ru2.c, null, new ypc(this, null, 3), 2);
                return;
            }
            this.i.d(false, false);
            return;
        }
        c16.w("chapterList");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(15:5|6|7|8|(1:(1:(1:(1:(14:14|15|16|17|(1:19)|20|21|22|(2:24|(1:26))|27|(2:29|(1:31))|32|(3:34|(1:36)|37)|38)(2:41|42))(5:43|44|45|46|(1:48)(1:51)))(9:52|53|54|(2:56|(1:58))|27|(0)|32|(0)|38))(5:59|60|61|62|63))(3:65|(3:67|68|(1:70)(3:71|62|63))(4:72|73|(1:75)|(1:77)(3:78|46|(0)(0)))|50)|79|80|81|22|(0)|27|(0)|32|(0)|38))|85|6|7|8|(0)(0)|79|80|81|22|(0)|27|(0)|32|(0)|38) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r1.r(r2, r3, -1.0d, r6) != r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        r0 = new defpackage.gs9(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
        if (r1 != r11) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:16:0x0033, B:63:0x00cb, B:65:0x00cf, B:66:0x00e3, B:23:0x0045, B:57:0x00b8, B:59:0x00c2, B:51:0x00a4, B:53:0x00b1), top: B:86:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.n(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(5:17|18|19|(2:21|(1:23))|24))(2:25|26))(3:30|31|(2:33|23))|27|(2:29|23)|19|(0)|24))|35|6|7|(0)(0)|27|(0)|19|(0)|24) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:13:0x002c, B:18:0x0038, B:30:0x005f, B:32:0x0067, B:21:0x003e, B:27:0x0052, B:24:0x0045), top: B:37:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.jqc
            if (r0 == 0) goto L13
            r0 = r9
            jqc r0 = (defpackage.jqc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jqc r0 = new jqc
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 3
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L42
            if (r1 == r6) goto L3c
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L71
            return r3
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L36:
            tqc r8 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L71
            goto L5f
        L3c:
            tqc r8 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L71
            goto L52
        L42:
            defpackage.hre.r(r9)
            vpc r9 = r8.m     // Catch: java.lang.Throwable -> L71
            r0.a = r8     // Catch: java.lang.Throwable -> L71
            r0.d = r6     // Catch: java.lang.Throwable -> L71
            java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L71
            if (r9 != r7) goto L52
            goto L70
        L52:
            vpc r9 = r8.m     // Catch: java.lang.Throwable -> L71
            r0.a = r8     // Catch: java.lang.Throwable -> L71
            r0.d = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> L71
            if (r9 != r7) goto L5f
            goto L70
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r9 != 0) goto L71
            r0.a = r2     // Catch: java.lang.Throwable -> L71
            r0.d = r4     // Catch: java.lang.Throwable -> L71
            r8.m()     // Catch: java.lang.Throwable -> L71
            if (r3 != r7) goto L71
        L70:
            return r7
        L71:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.o(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(3:25|26|(2:28|22))|18|(1:20)(1:24)|(1:22)(1:23)))|30|6|7|(0)(0)|18|(0)(0)|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:12:0x0029, B:17:0x0037, B:23:0x004d, B:25:0x0059, B:20:0x003e), top: B:32:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(float r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.kqc
            if (r0 == 0) goto L13
            r0 = r9
            kqc r0 = (defpackage.kqc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kqc r0 = new kqc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L62
            return r3
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L33:
            float r8 = r0.a
            tqc r7 = r0.b
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L62
            goto L4d
        L3b:
            defpackage.hre.r(r9)
            vpc r9 = r7.m     // Catch: java.lang.Throwable -> L62
            r0.b = r7     // Catch: java.lang.Throwable -> L62
            r0.a = r8     // Catch: java.lang.Throwable -> L62
            r0.e = r5     // Catch: java.lang.Throwable -> L62
            java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L62
            if (r9 != r6) goto L4d
            goto L61
        L4d:
            vpc r7 = r7.m     // Catch: java.lang.Throwable -> L62
            r0.b = r2     // Catch: java.lang.Throwable -> L62
            r0.a = r8     // Catch: java.lang.Throwable -> L62
            r0.e = r4     // Catch: java.lang.Throwable -> L62
            xyb r7 = r7.a     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r7.r(r8, r0)     // Catch: java.lang.Throwable -> L62
            goto L5f
        L5e:
            r7 = r3
        L5f:
            if (r7 != r6) goto L62
        L61:
            return r6
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.p(float, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0235, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x024f, code lost:
        if (r1 != r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c9, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02df, code lost:
        if (r1 != r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f4, code lost:
        if (r5 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
        if (r8.h((defpackage.xyb) r1, r2) == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        if (r1 == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
        if (r1 != r11) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [tqc] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.n42 r18) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.q(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|9))|211|6|7|8|9|(2:(0)|(15:99|51|52|53|54|56|57|58|59|60|61|62|(0)(0)|(0)|41))) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x029d, code lost:
        if (r7 == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0382, code lost:
        if (g(r14) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        r20 = r6;
        r11 = null;
        r15 = true;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03e7, code lost:
        if (g(r14) != r8) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
        if (g(r14) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
        if (r5 == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0250, code lost:
        if (r5 == r8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f6 A[Catch: all -> 0x0321, TryCatch #1 {all -> 0x0321, blocks: (B:138:0x02f2, B:140:0x02f6, B:142:0x02fc, B:144:0x030d, B:146:0x031d, B:147:0x0320), top: B:205:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031d A[Catch: all -> 0x0321, TryCatch #1 {all -> 0x0321, blocks: (B:138:0x02f2, B:140:0x02f6, B:142:0x02fc, B:144:0x030d, B:146:0x031d, B:147:0x0320), top: B:205:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Throwable, java.lang.String, nb1] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Throwable, m42, p82, d82] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(int r26, int r27, double r28, defpackage.n42 r30) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.r(int, int, double, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|9))|114|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ba, code lost:
        if (r8.v(r11) == r5) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[Catch: all -> 0x0265, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0265, blocks: (B:13:0x0036, B:108:0x0246, B:110:0x0257, B:112:0x025d), top: B:120:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:16:0x0045, B:83:0x01d9, B:85:0x01e3, B:87:0x01ef, B:88:0x01f2, B:89:0x01f6, B:94:0x0213, B:21:0x0057, B:24:0x0066, B:73:0x01a3, B:75:0x01ab, B:27:0x0075, B:70:0x018e), top: B:120:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e3 A[Catch: all -> 0x004a, TryCatch #2 {all -> 0x004a, blocks: (B:16:0x0045, B:83:0x01d9, B:85:0x01e3, B:87:0x01ef, B:88:0x01f2, B:89:0x01f6, B:94:0x0213, B:21:0x0057, B:24:0x0066, B:73:0x01a3, B:75:0x01ab, B:27:0x0075, B:70:0x018e), top: B:120:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [npc] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r28, int r29, double r30, defpackage.n42 r32) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.s(int, int, double, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(1:(4:13|14|(1:16)|17)(2:19|20))(2:21|22))(5:25|26|27|(1:29)|30))(2:32|33))(3:40|41|(2:43|24)(1:44))|34|(1:36)(1:39)|(2:38|24)|27|(0)|30))|46|6|7|(0)(0)|34|(0)(0)|(0)|27|(0)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
        if (r0 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (x(r1) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:17:0x003a, B:20:0x0040, B:36:0x0070, B:38:0x0075, B:39:0x0096, B:23:0x0046, B:30:0x005d, B:32:0x0067, B:26:0x004f), top: B:50:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:17:0x003a, B:20:0x0040, B:36:0x0070, B:38:0x0075, B:39:0x0096, B:23:0x0046, B:30:0x005d, B:32:0x0067, B:26:0x004f), top: B:50:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.n42 r13) {
        /*
            r12 = this;
            pvc r0 = defpackage.pvc.a
            boolean r1 = r13 instanceof defpackage.qqc
            if (r1 == 0) goto L15
            r1 = r13
            qqc r1 = (defpackage.qqc) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            qqc r1 = new qqc
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.b
            n82 r2 = defpackage.n82.a
            int r3 = r1.d
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L4a
            if (r3 == r8) goto L44
            if (r3 == r6) goto L3e
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L34
            defpackage.hre.r(r13)
            goto Lb0
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r7
        L3a:
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> La5
            goto La5
        L3e:
            tqc r3 = r1.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> La5
            goto L70
        L44:
            tqc r3 = r1.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> La5
            goto L5d
        L4a:
            defpackage.hre.r(r13)
            r12.C = r8
            kg0 r13 = r12.n     // Catch: java.lang.Throwable -> La5
            r1.a = r12     // Catch: java.lang.Throwable -> La5
            r1.d = r8     // Catch: java.lang.Throwable -> La5
            java.lang.Object r13 = r13.e(r1)     // Catch: java.lang.Throwable -> La5
            if (r13 != r2) goto L5c
            goto Laf
        L5c:
            r3 = r12
        L5d:
            vpc r13 = r3.m     // Catch: java.lang.Throwable -> La5
            r1.a = r3     // Catch: java.lang.Throwable -> La5
            r1.d = r6     // Catch: java.lang.Throwable -> La5
            xyb r13 = r13.a     // Catch: java.lang.Throwable -> La5
            if (r13 == 0) goto L6c
            java.lang.Object r13 = r13.t(r1)     // Catch: java.lang.Throwable -> La5
            goto L6d
        L6c:
            r13 = r0
        L6d:
            if (r13 != r2) goto L70
            goto Laf
        L70:
            kw5 r13 = r3.o     // Catch: java.lang.Throwable -> La5
            r8 = 0
            if (r13 == 0) goto L96
            java.lang.Object r9 = r13.b     // Catch: java.lang.Throwable -> La5
            com.reader.data.reader.text.core.tts.AndroidTextToSpeechService r9 = (com.reader.data.reader.text.core.tts.AndroidTextToSpeechService) r9     // Catch: java.lang.Throwable -> La5
            npc r9 = com.reader.data.reader.text.core.tts.AndroidTextToSpeechService.a(r9)     // Catch: java.lang.Throwable -> La5
            r9.d(r8, r8)     // Catch: java.lang.Throwable -> La5
            com.reader.data.reader.text.core.tts.AndroidTextToSpeechService.S = r8     // Catch: java.lang.Throwable -> La5
            java.lang.Object r13 = r13.b     // Catch: java.lang.Throwable -> La5
            com.reader.data.reader.text.core.tts.AndroidTextToSpeechService r13 = (com.reader.data.reader.text.core.tts.AndroidTextToSpeechService) r13     // Catch: java.lang.Throwable -> La5
            m41 r9 = r13.L     // Catch: java.lang.Throwable -> La5
            sw2 r10 = defpackage.ab3.a     // Catch: java.lang.Throwable -> La5
            n35 r10 = defpackage.zz6.a     // Catch: java.lang.Throwable -> La5
            n35 r10 = r10.f     // Catch: java.lang.Throwable -> La5
            lo r11 = new lo     // Catch: java.lang.Throwable -> La5
            r11.<init>(r5, r7, r13)     // Catch: java.lang.Throwable -> La5
            defpackage.z87.v(r9, r10, r7, r11, r6)     // Catch: java.lang.Throwable -> La5
        L96:
            npc r13 = r3.i     // Catch: java.lang.Throwable -> La5
            r13.d(r8, r8)     // Catch: java.lang.Throwable -> La5
            r1.a = r7     // Catch: java.lang.Throwable -> La5
            r1.d = r5     // Catch: java.lang.Throwable -> La5
            r3.w(r1)     // Catch: java.lang.Throwable -> La5
            if (r0 != r2) goto La5
            goto Laf
        La5:
            r1.a = r7
            r1.d = r4
            java.lang.Object r13 = r12.x(r1)
            if (r13 != r2) goto Lb0
        Laf:
            return r2
        Lb0:
            iya r12 = r12.A
            if (r12 == 0) goto Lb7
            r12.cancel(r7)
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.t(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:20|21|22|23|24|(5:26|27|28|29|(2:32|(2:34|(4:36|11|12|(0)(0)))(1:37))(3:31|12|(0)(0)))|41) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r11 = r9;
        r12 = r10;
        r10 = r2;
        r9 = r8;
        r2 = r14;
        r8 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e0 -> B:53:0x010b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ff -> B:52:0x0104). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r17, boolean r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.u(java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r2 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
        if (r6.e(r0) == r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.m42 r7) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.v(m42):java.lang.Object");
    }

    public final void w(n42 n42Var) {
        int i = this.u;
        String str = this.v;
        ((pxb) this.c).a.c.J0(this.w, i, str, this.x, by5.a.k().b(), this.a);
    }

    public final Object x(n42 n42Var) {
        long j = this.N;
        if (j > 0) {
            long b = by5.a.k().b() - j;
            this.N = 0L;
            if (b > 0) {
                sw2 sw2Var = ab3.a;
                Object E = z87.E(ru2.c, new ir5(this, j, b, null, 4), n42Var);
                if (E == n82.a) {
                    return E;
                }
            }
        }
        return pvc.a;
    }
}
