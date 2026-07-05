package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rmc  reason: default package */
/* loaded from: classes3.dex */
public abstract class rmc extends fdd {
    public zmc C;
    public List F;
    public List G;
    public final cza H;
    public final cza I;
    public final cza J;
    public final cza K;
    public final cza L;
    public final cza M;
    public final cza N;
    public final cza O;
    public boolean P;
    public boolean Q;
    public final klc c;
    public final cza d = dza.a(new amc(false, false, false, true, "", null, null, null));
    public final sw7 e = new sw7();
    public final cza f = dza.a(null);
    public String D = "";
    public String E = "";

    public rmc(klc klcVar) {
        this.c = klcVar;
        ks3 ks3Var = ks3.a;
        this.F = ks3Var;
        this.G = ks3Var;
        this.H = dza.a(null);
        Boolean bool = Boolean.FALSE;
        this.I = dza.a(bool);
        this.J = dza.a(null);
        this.K = dza.a(null);
        this.L = dza.a(null);
        this.M = dza.a(null);
        this.N = dza.a(null);
        this.O = dza.a(bool);
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        f(a, ru2Var, new gmc(this, null, 2));
        f(jdd.a(this), ru2Var, new gmc(this, null, 3));
        f(jdd.a(this), ru2Var, new gmc(this, null, 0));
        f(jdd.a(this), ru2Var, new gmc(this, null, 1));
        f(jdd.a(this), ru2Var, new gmc(this, null, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.rmc r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.mmc
            if (r0 == 0) goto L13
            r0 = r5
            mmc r0 = (defpackage.mmc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mmc r0 = new mmc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rmc r4 = r0.a
            defpackage.hre.r(r5)
            goto L48
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            java.lang.String r5 = r4.E
            int r5 = r5.length()
            if (r5 <= 0) goto L4c
            java.lang.String r5 = r4.E
            r0.a = r4
            r0.d = r2
            java.lang.Object r5 = r4.t(r5, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L48
            return r0
        L48:
            zmc r5 = (defpackage.zmc) r5
            r4.C = r5
        L4c:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.j(rmc, n42):java.lang.Object");
    }

    public static yk8 w(Map map) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList();
            for (String str2 : k4b.z0((String) entry.getValue(), new String[]{"\n"})) {
                sb.append(str2);
                sb.append('\n');
                arrayList.add(Integer.valueOf(i));
                i++;
            }
            linkedHashMap.put(str, arrayList);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        return new yk8(sb.toString(), linkedHashMap);
    }

    public static LinkedHashMap x(Map map, String str) {
        List z0 = k4b.z0(str, new String[]{"\n"});
        LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            StringBuilder sb = new StringBuilder();
            for (Number number : (Iterable) entry.getValue()) {
                String str2 = (String) sl1.f0(number.intValue(), z0);
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('\n');
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1).getClass();
            }
            linkedHashMap.put(key, sb.toString());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.r07 r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.A(r07, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.String r11, boolean r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.B(java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.util.Map r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.C(java.util.Map, n42):java.lang.Object");
    }

    @Override // defpackage.gdd
    public void d() {
        o();
    }

    public void k() {
        this.Q = true;
        if (this.P) {
            this.P = false;
            y();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(11:11|12|(1:14)|15|(1:17)|18|(1:20)|21|(12:23|(1:114)|(1:28)(5:105|106|107|(1:109)|110)|(1:30)(1:104)|(1:32)|33|(4:36|(3:38|39|40)(1:42)|41|34)|43|44|(3:46|(5:48|(1:101)(6:50|(1:100)|(1:55)(5:91|92|93|(1:95)|96)|(1:57)(1:90)|58|(1:60))|61|(5:65|(1:85)|(1:70)(5:76|77|78|(1:80)|81)|(1:72)(1:75)|73)|86)|102)|103|86)(1:115)|87|88)(2:117|118))(1:119))(1:134)|120|(1:122)(7:123|(1:133)|(1:130)|21|(0)(0)|87|88)))|138|6|7|(0)(0)|120|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01be, code lost:
        if (r5.equals(r12) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r13 == r8) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r13 == r8) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        r12 = new defpackage.gs9(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.vt4 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.l(vt4, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0167, code lost:
        if (r1.equals(r13) != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.m(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r7 == r5) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.m42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dmc
            if (r0 == 0) goto L13
            r0 = r7
            dmc r0 = (defpackage.dmc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmc r0 = new dmc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            defpackage.hre.r(r7)
            return r2
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L33:
            defpackage.hre.r(r7)
            goto L4b
        L37:
            defpackage.hre.r(r7)
            klc r7 = r6.c
            plc r7 = (defpackage.plc) r7
            mx r7 = r7.c()
            r0.c = r4
            java.lang.Object r7 = defpackage.z1d.C(r7, r0)
            if (r7 != r5) goto L4b
            goto L5c
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L54
            goto L5d
        L54:
            r0.c = r3
            java.lang.Object r6 = r6.q(r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.n(m42):java.lang.Object");
    }

    public final void o() {
        if (this.E.length() > 0) {
            String str = this.E;
            String str2 = this.D;
            plc plcVar = (plc) this.c;
            plcVar.getClass();
            str.getClass();
            str2.getClass();
            plcVar.c.a(str, str2);
        }
        this.C = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r9, defpackage.n42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.emc
            if (r0 == 0) goto L14
            r0 = r10
            emc r0 = (defpackage.emc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            emc r0 = new emc
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.c
            int r0 = r6.e
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r7 = defpackage.n82.a
            if (r0 == 0) goto L49
            if (r0 == r3) goto L41
            if (r0 == r2) goto L3a
            if (r0 != r1) goto L34
            rmc r8 = r6.b
            zmc r8 = (defpackage.zmc) r8
            defpackage.hre.r(r10)
            return r10
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L3a:
            java.lang.String r9 = r6.a
            defpackage.hre.r(r10)
            r2 = r9
            goto L6b
        L41:
            rmc r9 = r6.b
            java.lang.String r0 = r6.a
            defpackage.hre.r(r10)
            goto L5b
        L49:
            defpackage.hre.r(r10)
            r6.a = r9
            r6.b = r8
            r6.e = r3
            java.lang.Object r10 = r8.q(r6)
            if (r10 != r7) goto L59
            goto La4
        L59:
            r0 = r9
            r9 = r8
        L5b:
            java.lang.String r10 = (java.lang.String) r10
            r6.a = r0
            r6.b = r4
            r6.e = r2
            java.lang.Object r10 = r9.t(r10, r6)
            if (r10 != r7) goto L6a
            goto La4
        L6a:
            r2 = r0
        L6b:
            zmc r10 = (defpackage.zmc) r10
            if (r10 != 0) goto L70
            return r4
        L70:
            cza r9 = r8.L
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = ""
            if (r9 != 0) goto L7e
            r3 = r0
            goto L7f
        L7e:
            r3 = r9
        L7f:
            cza r8 = r8.M
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L8a
            goto L8b
        L8a:
            r0 = r8
        L8b:
            java.lang.String r8 = "convertSimplified"
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.util.Map r5 = java.util.Collections.singletonMap(r8, r9)
            r5.getClass()
            r6.a = r4
            r6.b = r4
            r6.e = r1
            r1 = r10
            r4 = r0
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r7) goto La5
        La4:
            return r7
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.p(java.lang.String, n42):java.lang.Object");
    }

    public final Object q(m42 m42Var) {
        return z1d.C(new mx(this.J, 4), m42Var);
    }

    public final Object r(m42 m42Var) {
        if (!v()) {
            return "raw";
        }
        return q(m42Var);
    }

    public final cza s() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:17:0x0046, B:19:0x004a), top: B:27:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fmc
            if (r0 == 0) goto L13
            r0 = r6
            fmc r0 = (defpackage.fmc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fmc r0 = new fmc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            sw7 r5 = r0.b
            java.lang.String r0 = r0.a
            defpackage.hre.r(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L32:
            defpackage.hre.r(r6)
            r0.a = r5
            sw7 r6 = r4.e
            r0.b = r6
            r0.e = r2
            java.lang.Object r0 = r6.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L46
            return r1
        L46:
            zmc r0 = r4.C     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L64
            klc r0 = r4.c     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r4.D     // Catch: java.lang.Throwable -> L62
            plc r0 = (defpackage.plc) r0     // Catch: java.lang.Throwable -> L62
            r0.getClass()     // Catch: java.lang.Throwable -> L62
            r5.getClass()     // Catch: java.lang.Throwable -> L62
            r1.getClass()     // Catch: java.lang.Throwable -> L62
            bnc r0 = r0.c     // Catch: java.lang.Throwable -> L62
            zmc r0 = r0.d(r5, r1)     // Catch: java.lang.Throwable -> L62
            r4.C = r0     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r4 = move-exception
            goto L68
        L64:
            r6.q(r3)
            return r0
        L68:
            r6.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.t(java.lang.String, n42):java.lang.Object");
    }

    public final boolean u() {
        return c16.i(this.J.getValue(), "qt");
    }

    public final boolean v() {
        boolean z;
        boolean z2;
        CharSequence charSequence = (CharSequence) this.J.getValue();
        if (charSequence != null && charSequence.length() != 0) {
            Boolean bool = (Boolean) this.K.getValue();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (!z) {
                Boolean bool2 = (Boolean) this.f.getValue();
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.r07 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmc.z(r07, n42):java.lang.Object");
    }

    public void y() {
    }
}
