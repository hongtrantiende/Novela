package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uw2  reason: default package */
/* loaded from: classes3.dex */
public final class uw2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw2(ww2 ww2Var, jw7 jw7Var, lu4 lu4Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.c = ww2Var;
        this.e = jw7Var;
        this.d = lu4Var;
    }

    public static final void o(AtomicBoolean atomicBoolean, zl9 zl9Var) {
        h6 h6Var;
        if (atomicBoolean.compareAndSet(false, true) && (h6Var = (h6) zl9Var.a) != null) {
            try {
                h6Var.b();
            } catch (Throwable unused) {
            }
        }
    }

    private final Object p(Object obj) {
        Object gs9Var;
        v84 v84Var = (v84) this.c;
        s02 s02Var = v84Var.C;
        m82 m82Var = (m82) this.e;
        int i = this.b;
        pvc pvcVar = pvc.a;
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
                f76 f76Var = (f76) this.d;
                n64 n64Var = v84Var.c;
                this.e = null;
                this.b = 1;
                Object h = ((c74) n64Var).h(f76Var, this);
                n82 n82Var = n82.a;
                if (h == n82Var) {
                    return n82Var;
                }
            }
            gs9Var = pvcVar;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            pvc pvcVar2 = (pvc) gs9Var;
            v84Var.h(s02Var, z44.a);
        }
        if (hs9.a(gs9Var) != null) {
            v84Var.h(s02Var, y44.a);
        }
        return pvcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (defpackage.v84.k((defpackage.v84) r9.c, r9) == r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (((defpackage.c74) r10).b(r1, r9) == r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
        if (defpackage.ade.r(r6, r9) == r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            pvc r0 = defpackage.pvc.a
            java.lang.Object r1 = r9.e
            m82 r1 = (defpackage.m82) r1
            n82 r2 = defpackage.n82.a
            int r3 = r9.b
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L32
            if (r3 == r7) goto L2e
            if (r3 == r6) goto L28
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1d
            defpackage.hre.r(r10)
            return r0
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r8
        L23:
            defpackage.hre.r(r10)
            goto Lbf
        L28:
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L2c:
            r10 = move-exception
            goto L6f
        L2e:
            defpackage.hre.r(r10)
            goto L54
        L32:
            defpackage.hre.r(r10)
            java.lang.Object r10 = r9.c
            v84 r10 = (defpackage.v84) r10
            java.util.HashSet r10 = r10.F
            java.lang.Object r3 = r9.d
            l54 r3 = (defpackage.l54) r3
            java.lang.String r3 = r3.a
            r10.add(r3)
            java.lang.Object r10 = r9.c
            v84 r10 = (defpackage.v84) r10
            r9.e = r1
            r9.b = r7
            java.lang.Object r10 = defpackage.v84.k(r10, r9)
            if (r10 != r2) goto L54
            goto Lcd
        L54:
            java.lang.Object r10 = r9.c
            v84 r10 = (defpackage.v84) r10
            java.lang.Object r1 = r9.d
            l54 r1 = (defpackage.l54) r1
            n64 r10 = r10.c     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.m     // Catch: java.lang.Throwable -> L2c
            r9.e = r8     // Catch: java.lang.Throwable -> L2c
            r9.b = r6     // Catch: java.lang.Throwable -> L2c
            c74 r10 = (defpackage.c74) r10     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = r10.b(r1, r9)     // Catch: java.lang.Throwable -> L2c
            if (r10 != r2) goto L6d
            goto Lcd
        L6d:
            r1 = r0
            goto L74
        L6f:
            gs9 r1 = new gs9
            r1.<init>(r10)
        L74:
            java.lang.Throwable r10 = defpackage.hs9.a(r1)
            if (r10 == 0) goto L9b
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto L82
            java.lang.String r10 = ""
        L82:
            boolean r1 = defpackage.jy.a()
            if (r1 == 0) goto L9b
            kw6 r1 = defpackage.kw6.b
            iea r3 = defpackage.iea.e
            z56 r6 = r1.a
            iea r6 = r6.a
            int r6 = r6.compareTo(r3)
            if (r6 > 0) goto L9b
            java.lang.String r6 = "Log"
            r1.a(r3, r6, r10, r8)
        L9b:
            java.lang.Object r10 = r9.c
            v84 r10 = (defpackage.v84) r10
            java.util.HashSet r10 = r10.F
            java.lang.Object r1 = r9.d
            l54 r1 = (defpackage.l54) r1
            java.lang.String r1 = r1.a
            r10.remove(r1)
            hq7 r10 = defpackage.wl3.b
            r10 = 300(0x12c, float:4.2E-43)
            am3 r1 = defpackage.am3.MILLISECONDS
            long r6 = defpackage.jue.O(r10, r1)
            r9.e = r8
            r9.b = r5
            java.lang.Object r10 = defpackage.ade.r(r6, r9)
            if (r10 != r2) goto Lbf
            goto Lcd
        Lbf:
            java.lang.Object r10 = r9.c
            v84 r10 = (defpackage.v84) r10
            r9.e = r8
            r9.b = r4
            java.lang.Object r9 = defpackage.v84.k(r10, r9)
            if (r9 != r2) goto Lce
        Lcd:
            return r2
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw2.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw2.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [zl9, java.lang.Object] */
    private final Object s(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return obj;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        eb2 eb2Var = (eb2) this.d;
        this.b = 1;
        f61 f61Var = new f61(1, w92.t(this));
        f61Var.u();
        ?? obj2 = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        obj2.a = ((zt1) this.e).c(uuid, (b6) this.c, new ij1(29, f61Var, atomicBoolean, (Object) obj2));
        f61Var.w(new y74(2, atomicBoolean, obj2));
        try {
            ((h6) obj2.a).a(eb2Var);
        } catch (Throwable th) {
            o(atomicBoolean, obj2);
            if (f61Var.t() instanceof f48) {
                f61Var.resumeWith(new gs9(th));
            }
        }
        Object s = f61Var.s();
        n82 n82Var = n82.a;
        if (s == n82Var) {
            return n82Var;
        }
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r8 == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.b
            pvc r1 = defpackage.pvc.a
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.hre.r(r8)
            return r1
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L19:
            java.lang.Object r0 = r7.e
            bx8 r0 = (defpackage.bx8) r0
            defpackage.hre.r(r8)
            goto L38
        L21:
            defpackage.hre.r(r8)
            java.lang.Object r8 = r7.c
            r0 = r8
            bx8 r0 = (defpackage.bx8) r0
            java.lang.Object r8 = r7.d
            xt4 r8 = (defpackage.xt4) r8
            r7.e = r0
            r7.b = r4
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r5) goto L38
            goto L52
        L38:
            byte[] r8 = (byte[]) r8
            r7.e = r2
            r7.b = r3
            sw2 r3 = defpackage.ab3.a
            ru2 r3 = defpackage.ru2.c
            iz7 r4 = new iz7
            r6 = 4
            r4.<init>(r0, r8, r2, r6)
            java.lang.Object r7 = defpackage.z87.E(r3, r4, r7)
            if (r7 != r5) goto L4f
            goto L50
        L4f:
            r7 = r1
        L50:
            if (r7 != r5) goto L53
        L52:
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw2.t(java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj) {
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
            ArrayList arrayList = new ArrayList();
            sj4 a = ((gz5) this.c).a();
            nr nrVar = new nr(3, arrayList, (m82) this.e, (gj4) this.d);
            this.b = 1;
            Object a2 = a.a(nrVar, this);
            n82 n82Var = n82.a;
            if (a2 == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object v(Object obj) {
        m82 m82Var = (m82) this.e;
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
            this.e = null;
            this.b = 1;
            Object c = ((mu4) this.c).c(m82Var, (tj4) this.d, this);
            n82 n82Var = n82.a;
            if (c == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object w(Object obj) {
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
            wj4 wj4Var = new wj4((sj4) this.d, (x69) this.e, null, 0);
            this.b = 1;
            Object z = yqe.z((xn6) this.c, wj4Var, this);
            n82 n82Var = n82.a;
            if (z == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object x(Object obj) {
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
            Object b = ((yu7) this.e).b((ez5) this.c, this);
            n82 n82Var = n82.a;
            if (b == n82Var) {
                return n82Var;
            }
        }
        kb3 kb3Var = (kb3) this.d;
        if (kb3Var != null) {
            kb3Var.a();
        }
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                uw2 uw2Var = new uw2((ww2) this.c, (lu4) obj2, m42Var, 0);
                uw2Var.e = obj;
                return uw2Var;
            case 1:
                return new uw2((ww2) this.c, (jw7) this.e, (lu4) obj2, m42Var);
            case 2:
                uw2 uw2Var2 = new uw2(this.c, (oh5) obj2, m42Var, 2);
                uw2Var2.e = obj;
                return uw2Var2;
            case 3:
                return new uw2((dz2) obj2, m42Var, 3);
            case 4:
                return new uw2((iya) this.e, (iya) this.c, (dz2) obj2, m42Var, 4);
            case 5:
                uw2 uw2Var3 = new uw2((kc3) obj2, m42Var, 5);
                uw2Var3.e = obj;
                return uw2Var3;
            case 6:
                uw2 uw2Var4 = new uw2((ie3) this.c, (f76) obj2, m42Var, 6);
                uw2Var4.e = obj;
                return uw2Var4;
            case 7:
                return new uw2((ie3) this.e, (String) this.c, (String) obj2, m42Var, 7);
            case 8:
                return new uw2((kj6) this.e, (aw7) this.c, (yya) obj2, m42Var, 8);
            case 9:
                return new uw2((qg6) this.e, (aw7) this.c, (String) obj2, m42Var, 9);
            case 10:
                uw2 uw2Var5 = new uw2((zq3) this.c, (String) obj2, m42Var, 10);
                uw2Var5.e = obj;
                return uw2Var5;
            case 11:
                uw2 uw2Var6 = new uw2((bw3) obj2, m42Var, 11);
                uw2Var6.e = obj;
                return uw2Var6;
            case 12:
                uw2 uw2Var7 = new uw2((mu4) this.c, obj2, m42Var, 12);
                uw2Var7.e = obj;
                return uw2Var7;
            case 13:
                uw2 uw2Var8 = new uw2((sj4) this.c, (mu4) obj2, m42Var, 13);
                uw2Var8.e = obj;
                return uw2Var8;
            case 14:
                return new uw2((un6) this.e, (sj4) this.c, (mu4) obj2, m42Var, 14);
            case 15:
                return new uw2((xt4) this.c, (f76) obj2, m42Var, 15);
            case 16:
                return new uw2((String) this.c, (aw7) obj2, m42Var, 16);
            case 17:
                uw2 uw2Var9 = new uw2((kb) obj2, m42Var, 17);
                uw2Var9.e = obj;
                return uw2Var9;
            case 18:
                uw2 uw2Var10 = new uw2((m64) this.c, (String) obj2, m42Var, 18);
                uw2Var10.e = obj;
                return uw2Var10;
            case 19:
                uw2 uw2Var11 = new uw2((o84) obj2, m42Var, 19);
                uw2Var11.e = obj;
                return uw2Var11;
            case 20:
                uw2 uw2Var12 = new uw2((v84) this.c, (f76) obj2, m42Var, 20);
                uw2Var12.e = obj;
                return uw2Var12;
            case 21:
                uw2 uw2Var13 = new uw2((v84) this.c, (l54) obj2, m42Var, 21);
                uw2Var13.e = obj;
                return uw2Var13;
            case 22:
                uw2 uw2Var14 = new uw2((da4) obj2, m42Var, 22);
                uw2Var14.e = obj;
                return uw2Var14;
            case 23:
                return new uw2((zt1) this.e, (b6) this.c, (eb2) obj2, m42Var, 23);
            case 24:
                return new uw2((bx8) this.c, (xt4) obj2, m42Var, 24);
            case 25:
                uw2 uw2Var15 = new uw2((gz5) this.c, (gj4) obj2, m42Var, 25);
                uw2Var15.e = obj;
                return uw2Var15;
            case 26:
                uw2 uw2Var16 = new uw2((mu4) this.c, (tj4) obj2, m42Var, 26);
                uw2Var16.e = obj;
                return uw2Var16;
            case 27:
                uw2 uw2Var17 = new uw2((xn6) this.c, (sj4) obj2, m42Var, 27);
                uw2Var17.e = obj;
                return uw2Var17;
            case 28:
                return new uw2((yu7) this.e, (ez5) this.c, (kb3) obj2, m42Var, 28);
            default:
                return new uw2((uo4) this.c, (String) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((uw2) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((uw2) create((bod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((uw2) create((c64) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((uw2) create((x69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((uw2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x036f, code lost:
        if (r0 == r15) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0391, code lost:
        if (r0 == r15) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x08c5, code lost:
        if (((defpackage.iya) r24.e).join(r24) == r15) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x08d3, code lost:
        if (((defpackage.iya) r24.c).join(r24) == r15) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0928, code lost:
        if (defpackage.dz2.b(r13, r24) == r15) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0996, code lost:
        if (r13.d(r0, null, r24) != r15) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:?, code lost:
        return r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x089d  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 2802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw2(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw2(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw2(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
