package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: byb  reason: default package */
/* loaded from: classes3.dex */
public final class byb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byb(qg6 qg6Var, aw7 aw7Var, String str, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 16;
        this.c = qg6Var;
        this.e = aw7Var;
        this.d = str;
        this.f = aw7Var2;
    }

    private final Object A(Object obj) {
        skd skdVar = (skd) this.f;
        un6 un6Var = (un6) this.e;
        kk9 kk9Var = (kk9) this.d;
        int i = this.b;
        try {
            if (i != 0) {
                if (i == 1) {
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                kr7 kr7Var = (kr7) ((zl9) this.c).a;
                if (kr7Var != null) {
                    kr7Var.b = k27.a(kk9Var.y);
                }
                this.b = 1;
                Object Q = kk9Var.Q(this);
                n82 n82Var = n82.a;
                if (Q == n82Var) {
                    return n82Var;
                }
            }
            un6Var.k().f(skdVar);
            return pvc.a;
        } catch (Throwable th) {
            un6Var.k().f(skdVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r14 == r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object B(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.d
            ymd r0 = (defpackage.ymd) r0
            java.lang.String r0 = r0.c
            java.lang.Object r1 = r13.c
            lr6 r1 = (defpackage.lr6) r1
            int r2 = r13.b
            r3 = 0
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L25
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            defpackage.hre.r(r14)
            return r14
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r3
        L21:
            defpackage.hre.r(r14)
            goto L35
        L25:
            defpackage.hre.r(r14)
            s51 r14 = r1.a()
            r13.b = r5
            java.lang.Object r14 = defpackage.ond.a(r14, r1, r13)
            if (r14 != r6) goto L35
            goto L81
        L35:
            r10 = r14
            jq4 r10 = (defpackage.jq4) r10
            if (r10 == 0) goto L83
            java.lang.String r14 = defpackage.fmd.a
            r95 r2 = defpackage.r95.n()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Updating notification for "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.c(r14, r0)
            java.lang.Object r14 = r13.e
            r8 = r14
            gmd r8 = (defpackage.gmd) r8
            java.lang.Object r14 = r13.f
            r11 = r14
            android.content.Context r11 = (android.content.Context) r11
            androidx.work.WorkerParameters r14 = r1.b
            java.util.UUID r9 = r14.a
            omd r14 = r8.a
            r9a r14 = r14.a
            xw0 r7 = new xw0
            r12 = 25
            r7.<init>(r8, r9, r10, r11, r12)
            r14.getClass()
            ua2 r0 = new ua2
            r1 = 3
            java.lang.String r2 = "setForegroundAsync"
            r0.<init>(r1, r14, r2, r7)
            s51 r14 = defpackage.jbe.S(r0)
            r13.b = r4
            java.lang.Object r13 = defpackage.sue.h(r14, r13)
            if (r13 != r6) goto L82
        L81:
            return r6
        L82:
            return r13
        L83:
            java.lang.String r13 = "Worker was marked important ("
            java.lang.String r14 = ") but did not provide ForegroundInfo"
            java.lang.String r13 = defpackage.hl5.n(r13, r0, r14)
            defpackage.vs.k(r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.B(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r4 == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (defpackage.z87.E((defpackage.d82) r4, r5, r24) == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:37:0x00da, B:39:0x00dd, B:41:0x00ed), top: B:52:0x00da }] */
    /* JADX WARN: Type inference failed for: r4v10, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r3 != r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fb, code lost:
        if (r9 != r11) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {all -> 0x002d, blocks: (B:9:0x0028, B:16:0x003a, B:56:0x00ee, B:52:0x00dc), top: B:77:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.p(java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj) {
        Object gs9Var;
        Object value;
        Collection values;
        List list = (List) this.f;
        String str = (String) this.e;
        g0d g0dVar = (g0d) this.d;
        m82 m82Var = (m82) this.c;
        int i = this.b;
        Object obj2 = pvc.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                i8 i8Var = g0dVar.c;
                this.c = null;
                this.b = 1;
                Object b = ((m8) i8Var).b(str, list, this);
                n82 n82Var = n82.a;
                if (b == n82Var) {
                    return n82Var;
                }
            }
            gs9Var = obj2;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            pvc pvcVar = (pvc) gs9Var;
            LinkedHashMap linkedHashMap = g0dVar.E;
            wzc wzcVar = (wzc) linkedHashMap.get(str);
            if (wzcVar != null) {
                linkedHashMap.put(str, wzc.a(wzcVar, false, list, Token.SWITCH));
            }
            cza czaVar = g0dVar.d;
            if (czaVar != null) {
                do {
                    value = czaVar.getValue();
                    values = linkedHashMap.values();
                    values.getClass();
                } while (!czaVar.l(value, f0d.a((f0d) value, sl1.C0(values))));
            }
        }
        return obj2;
    }

    private final Object r(Object obj) {
        aw7 aw7Var = (aw7) this.e;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            s02 G = yae.G(new clc(aw7Var, 17));
            db1 db1Var = new db1((ArrayList) this.c, (aw7) this.f, aw7Var, (aw7) this.d, 7);
            this.b = 1;
            Object a = G.a(db1Var, this);
            n82 n82Var = n82.a;
            if (a == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r8 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (defpackage.qg6.f((defpackage.qg6) r7.c, r8, r7) == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.b
            r1 = 0
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.hre.r(r8)
            goto L57
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r1
        L17:
            defpackage.hre.r(r8)
            goto L36
        L1b:
            defpackage.hre.r(r8)
            sw2 r8 = defpackage.ab3.a
            oi7 r0 = new oi7
            java.lang.Object r5 = r7.e
            aw7 r5 = (defpackage.aw7) r5
            java.lang.Object r6 = r7.d
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>(r5, r6, r1, r2)
            r7.b = r3
            java.lang.Object r8 = defpackage.z87.E(r8, r0, r7)
            if (r8 != r4) goto L36
            goto L56
        L36:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r0 = r7.f
            aw7 r0 = (defpackage.aw7) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0.setValue(r1)
            r0 = -1
            if (r8 == r0) goto L57
            java.lang.Object r0 = r7.c
            qg6 r0 = (defpackage.qg6) r0
            r7.b = r2
            java.lang.Object r7 = defpackage.qg6.f(r0, r8, r7)
            if (r7 != r4) goto L57
        L56:
            return r4
        L57:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (((defpackage.lq) r1).g(r14, r0) == r6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.b
            java.lang.Object r1 = r14.f
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r0 == 0) goto L1f
            if (r0 == r5) goto L1b
            if (r0 != r4) goto L15
            defpackage.hre.r(r15)
            return r3
        L15:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            return r2
        L1b:
            defpackage.hre.r(r15)
            goto L63
        L1f:
            defpackage.hre.r(r15)
            java.lang.Object r15 = r14.c
            dx4 r15 = (defpackage.dx4) r15
            hm8 r15 = r15.h
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L35
            goto L83
        L35:
            java.lang.Object r15 = r14.d
            ora r15 = (defpackage.ora) r15
            java.lang.Object r0 = r14.e
            fm8 r0 = (defpackage.fm8) r0
            long r7 = r0.h()
            r9 = 1
            long r9 = r9 + r7
            r0.i(r9)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r7)
            r15.add(r0)
            r15 = r1
            lq r15 = (defpackage.lq) r15
            java.lang.Float r0 = new java.lang.Float
            r7 = 1066863165(0x3f970a3d, float:1.18)
            r0.<init>(r7)
            r14.b = r5
            java.lang.Object r15 = r15.g(r14, r0)
            if (r15 != r6) goto L63
            goto L82
        L63:
            r7 = r1
            lq r7 = (defpackage.lq) r7
            java.lang.Float r8 = new java.lang.Float
            r15 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r15)
            r15 = 0
            r0 = 6
            r1 = 180(0xb4, float:2.52E-43)
            arc r9 = defpackage.tte.x(r1, r15, r2, r0)
            r14.b = r4
            r10 = 0
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = defpackage.lq.c(r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r6) goto L83
        L82:
            return r6
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r1.g(r11, r12) == r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r0.g(r11, r12) == r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (defpackage.ade.r(r0, r11) == r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f
            lq r0 = (defpackage.lq) r0
            java.lang.Object r1 = r11.e
            lq r1 = (defpackage.lq) r1
            java.lang.Object r2 = r11.d
            dx4 r2 = (defpackage.dx4) r2
            hm8 r2 = r2.k
            java.lang.Object r3 = r11.c
            m82 r3 = (defpackage.m82) r3
            int r4 = r11.b
            pvc r5 = defpackage.pvc.a
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            n82 r10 = defpackage.n82.a
            if (r4 == 0) goto L36
            if (r4 == r8) goto L32
            if (r4 == r7) goto L2e
            if (r4 != r6) goto L28
            defpackage.hre.r(r12)
            goto L93
        L28:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            return r9
        L2e:
            defpackage.hre.r(r12)
            goto L6a
        L32:
            defpackage.hre.r(r12)
            goto L57
        L36:
            defpackage.hre.r(r12)
            java.lang.Object r12 = r2.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L46
            return r5
        L46:
            java.lang.Float r12 = new java.lang.Float
            r4 = 0
            r12.<init>(r4)
            r11.c = r3
            r11.b = r8
            java.lang.Object r12 = r1.g(r11, r12)
            if (r12 != r10) goto L57
            goto L92
        L57:
            java.lang.Float r12 = new java.lang.Float
            r4 = 1049582633(0x3e8f5c29, float:0.28)
            r12.<init>(r4)
            r11.c = r3
            r11.b = r7
            java.lang.Object r12 = r0.g(r11, r12)
            if (r12 != r10) goto L6a
            goto L92
        L6a:
            ot0 r12 = new ot0
            r4 = 11
            r12.<init>(r1, r9, r4)
            defpackage.z87.v(r3, r9, r9, r12, r6)
            ot0 r12 = new ot0
            r1 = 12
            r12.<init>(r0, r9, r1)
            defpackage.z87.v(r3, r9, r9, r12, r6)
            hq7 r12 = defpackage.wl3.b
            r12 = 320(0x140, float:4.48E-43)
            am3 r0 = defpackage.am3.MILLISECONDS
            long r0 = defpackage.jue.O(r12, r0)
            r11.c = r9
            r11.b = r6
            java.lang.Object r11 = defpackage.ade.r(r0, r11)
            if (r11 != r10) goto L93
        L92:
            return r10
        L93:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r2.setValue(r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            this.b = 1;
            Object m = bm1.m((bm1) this.c, (String) this.d, (fad) this.e, (x5) ((zl9) this.f).a, this);
            n82 n82Var = n82.a;
            if (m == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (defpackage.ade.r(r5, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r8 == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:20:0x004e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            m82 r0 = (defpackage.m82) r0
            n82 r1 = defpackage.n82.a
            int r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.hre.r(r8)
            goto L4e
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r5
        L1b:
            defpackage.hre.r(r8)
            goto L3f
        L1f:
            defpackage.hre.r(r8)
        L22:
            if (r5 != 0) goto L69
            boolean r8 = defpackage.k27.v(r0)
            if (r8 == 0) goto L69
            hq7 r8 = defpackage.wl3.b
            r8 = 200(0xc8, float:2.8E-43)
            am3 r2 = defpackage.am3.MILLISECONDS
            long r5 = defpackage.jue.O(r8, r2)
            r7.c = r0
            r7.b = r4
            java.lang.Object r8 = defpackage.ade.r(r5, r7)
            if (r8 != r1) goto L3f
            goto L4d
        L3f:
            java.lang.Object r8 = r7.d
            pgd r8 = (defpackage.pgd) r8
            r7.c = r0
            r7.b = r3
            java.lang.Object r8 = defpackage.kad.d(r8, r7)
            if (r8 != r1) goto L4e
        L4d:
            return r1
        L4e:
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L59
            boolean r8 = defpackage.k4b.j0(r5)
            if (r8 == 0) goto L22
        L59:
            java.lang.Object r8 = r7.e
            java.lang.Object r2 = r7.f
            java.util.List r2 = (java.util.List) r2
            monitor-enter(r8)
            java.lang.String r5 = defpackage.kad.a(r2)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r8)
            goto L22
        L66:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        m82 m82Var = (m82) this.c;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            ArrayList arrayList = (ArrayList) this.d;
            ubd ubdVar = (ubd) this.e;
            xic xicVar = (xic) this.f;
            ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (i3 >= 0) {
                    arrayList2.add(z87.s(m82Var, null, new u(ubdVar, (mjc) obj2, xicVar, i3, (m42) null, 11), 3));
                    i2 = i4;
                    i3 = i5;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            this.c = null;
            this.b = 1;
            obj = nxe.n(arrayList2, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        return sl1.a0((Iterable) obj);
    }

    private final Object y(Object obj) {
        pgd pgdVar = (pgd) this.c;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            sw2 sw2Var = ab3.a;
            n35 n35Var = zz6.a.f;
            byb bybVar = new byb((String) this.d, pgdVar, (String) this.e, (String) this.f, null, 22);
            this.c = null;
            this.b = 1;
            Object E = z87.E(n35Var, bybVar, this);
            n82 n82Var = n82.a;
            if (E == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object z(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            pgd r0 = (defpackage.pgd) r0
            java.lang.Object r1 = r7.c
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r7.b
            r3 = 0
            r4 = 2
            pvc r5 = defpackage.pvc.a
            r6 = 1
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1f
            if (r2 != r4) goto L19
            defpackage.hre.r(r8)
            return r5
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r3
        L1f:
            defpackage.hre.r(r8)
            return r5
        L23:
            defpackage.hre.r(r8)
            n82 r8 = defpackage.n82.a
            if (r1 == 0) goto L38
            boolean r2 = defpackage.kad.f(r1)
            if (r2 != r6) goto L38
            r7.b = r6
            r0.b(r1)
            if (r5 != r8) goto L5f
            goto L5e
        L38:
            java.lang.Object r2 = r7.e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r7.f
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L53
            if (r1 == 0) goto L4d
            boolean r6 = defpackage.kad.f(r1)
            if (r6 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r3
        L4c:
            r3 = r1
        L4d:
            if (r3 != 0) goto L52
            java.lang.String r6 = "https://localhost/"
            goto L53
        L52:
            r6 = r3
        L53:
            r7.b = r4
            android.webkit.WebView r7 = r0.a
            java.lang.String r0 = "text/html"
            r7.loadData(r2, r0, r6)
            if (r5 != r8) goto L5f
        L5e:
            return r8
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.z(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new byb((cyb) this.c, (ymb) this.d, (aw7) this.e, (aw7) obj2, m42Var, 0);
            case 1:
                byb bybVar = new byb((c4c) this.d, (f76) this.e, (cs9) obj2, m42Var, 1);
                bybVar.c = obj;
                return bybVar;
            case 2:
                return new byb((y5c) obj2, m42Var, 2);
            case 3:
                return new byb((y5c) this.c, (pwb) this.d, (pwb) this.e, (m32) obj2, m42Var, 3);
            case 4:
                byb bybVar2 = new byb((z8c) this.e, (t7c) obj2, m42Var, 4);
                bybVar2.d = obj;
                return bybVar2;
            case 5:
                byb bybVar3 = new byb((z8c) this.e, (String) obj2, m42Var, 5);
                bybVar3.d = obj;
                return bybVar3;
            case 6:
                byb bybVar4 = new byb((dt8) this.e, (pp8) obj2, m42Var, 6);
                bybVar4.d = obj;
                return bybVar4;
            case 7:
                return new byb((jac) this.c, (p1a) this.d, (m82) this.e, (lu4) obj2, m42Var, 7);
            case 8:
                byb bybVar5 = new byb((gbc) this.d, (f76) this.e, (cs9) obj2, m42Var, 8);
                bybVar5.c = obj;
                return bybVar5;
            case 9:
                byb bybVar6 = new byb((rjc) obj2, m42Var, 9);
                bybVar6.e = obj;
                return bybVar6;
            case 10:
                byb bybVar7 = new byb((ylc) this.e, (String) obj2, m42Var, 10);
                bybVar7.d = obj;
                return bybVar7;
            case 11:
                byb bybVar8 = new byb((koc) this.d, (int[]) this.e, (String[]) obj2, m42Var, 11);
                bybVar8.c = obj;
                return bybVar8;
            case 12:
                return new byb((an5) this.d, (f76) obj2, (aw7) this.e, m42Var);
            case 13:
                byb bybVar9 = new byb((szc) this.e, (String) obj2, m42Var, 13);
                bybVar9.d = obj;
                return bybVar9;
            case 14:
                byb bybVar10 = new byb((g0d) this.d, (String) this.e, (List) obj2, m42Var, 14);
                bybVar10.c = obj;
                return bybVar10;
            case 15:
                return new byb((aw7) this.e, (ArrayList) this.c, (aw7) obj2, (aw7) this.d, m42Var);
            case 16:
                return new byb((qg6) this.c, (aw7) this.e, (String) this.d, (aw7) obj2, m42Var);
            case 17:
                return new byb((dx4) this.c, (ora) this.d, (fm8) this.e, (lq) obj2, m42Var, 17);
            case 18:
                byb bybVar11 = new byb((dx4) this.d, (lq) this.e, (lq) obj2, m42Var, 18);
                bybVar11.c = obj;
                return bybVar11;
            case 19:
                return new byb((bm1) this.c, (String) this.d, (fad) this.e, (zl9) obj2, m42Var, 19);
            case 20:
                byb bybVar12 = new byb((pgd) this.d, this.e, (List) obj2, m42Var, 20);
                bybVar12.c = obj;
                return bybVar12;
            case 21:
                byb bybVar13 = new byb((ArrayList) this.d, (ubd) this.e, (xic) obj2, m42Var, 21);
                bybVar13.c = obj;
                return bybVar13;
            case 22:
                return new byb((String) this.c, (pgd) this.d, (String) this.e, (String) obj2, m42Var, 22);
            case 23:
                byb bybVar14 = new byb((String) this.d, (String) this.e, (String) obj2, m42Var, 23);
                bybVar14.c = obj;
                return bybVar14;
            case 24:
                return new byb((zl9) this.c, (kk9) this.d, (un6) this.e, (skd) obj2, m42Var, 24);
            case 25:
                return new byb((lr6) this.c, (ymd) this.d, (gmd) this.e, (Context) obj2, m42Var, 25);
            default:
                byb bybVar15 = new byb((String) obj2, m42Var, 26);
                bybVar15.e = obj;
                return bybVar15;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                ((byb) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 12:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((byb) create((pgd) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((byb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((byb) create((j6d) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x04ac, code lost:
        if (r1 == r9) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0968, code lost:
        if (r12 == r9) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a8d, code lost:
        if (r2 == r9) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0baa, code lost:
        if (r0 == r9) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
        if (r2 == r9) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
        if (r0 == r9) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:?, code lost:
        return r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d6 A[LOOP:4: B:174:0x02d6->B:175:0x02f5, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0be2 A[LOOP:14: B:502:0x0be2->B:503:0x0bf8, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:593:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* JADX WARN: Type inference failed for: r0v76, types: [l8c] */
    /* JADX WARN: Type inference failed for: r10v9, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0, types: [xl9] */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v51, types: [l8c] */
    /* JADX WARN: Type inference failed for: r2v64, types: [xl9] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [t7c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x0365 -> B:191:0x032d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:388:0x0830 -> B:389:0x0835). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:391:0x0841 -> B:390:0x083c). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            Method dump skipped, instructions count: 3306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byb(an5 an5Var, f76 f76Var, aw7 aw7Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 12;
        this.d = an5Var;
        this.f = f76Var;
        this.e = aw7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byb(aw7 aw7Var, ArrayList arrayList, aw7 aw7Var2, aw7 aw7Var3, m42 m42Var) {
        super(2, m42Var);
        this.a = 15;
        this.e = aw7Var;
        this.c = arrayList;
        this.f = aw7Var2;
        this.d = aw7Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byb(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byb(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byb(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byb(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
