package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jk8  reason: default package */
/* loaded from: classes3.dex */
public final class jk8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk8(do9 do9Var, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 12;
        this.c = do9Var;
        this.e = aw7Var;
        this.d = aw7Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (r0 == r8) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk8.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        Object gs9Var;
        Object value;
        String str = (String) this.e;
        lia liaVar = (lia) this.d;
        m82 m82Var = (m82) this.c;
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
                wl6 wl6Var = liaVar.F;
                String str2 = liaVar.E;
                this.c = null;
                this.b = 1;
                ((bn6) wl6Var).u(str2, str);
                n82 n82Var = n82.a;
                if (pvcVar == n82Var) {
                    return n82Var;
                }
            }
            gs9Var = pvcVar;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            pvc pvcVar2 = (pvc) gs9Var;
            cza czaVar = liaVar.G;
            if (czaVar != null) {
                do {
                    value = czaVar.getValue();
                    ((kia) value).getClass();
                    str.getClass();
                } while (!czaVar.l(value, new kia(str)));
            }
        }
        Throwable a = hs9.a(gs9Var);
        if (a != null) {
            a.printStackTrace();
        }
        return pvcVar;
    }

    private final Object q(Object obj) {
        wpa wpaVar = (wpa) this.e;
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
            d19 d19Var = (d19) this.c;
            upa upaVar = new upa((yu7) this.d, wpaVar, null, 0);
            opa opaVar = new opa(wpaVar, 3);
            this.b = 1;
            Object e = ukb.e(d19Var, null, null, upaVar, opaVar, this, 3);
            n82 n82Var = n82.a;
            if (e == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0.a(r1, r7) == r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (defpackage.z87.E(r1, r2, r7) == r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            sj4 r0 = (defpackage.sj4) r0
            java.lang.Object r1 = r7.d
            d82 r1 = (defpackage.d82) r1
            int r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1e
            if (r2 == r5) goto L1a
            if (r2 != r4) goto L14
            goto L1a
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r3
        L1a:
            defpackage.hre.r(r8)
            goto L4b
        L1e:
            defpackage.hre.r(r8)
            java.lang.Object r8 = r7.c
            x69 r8 = (defpackage.x69) r8
            gs3 r2 = defpackage.gs3.a
            boolean r2 = defpackage.c16.i(r1, r2)
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L3d
            vj4 r1 = new vj4
            r1.<init>(r8, r5)
            r7.b = r5
            java.lang.Object r7 = r0.a(r1, r7)
            if (r7 != r6) goto L4b
            goto L4a
        L3d:
            wj4 r2 = new wj4
            r2.<init>(r0, r8, r3, r5)
            r7.b = r4
            java.lang.Object r7 = defpackage.z87.E(r1, r2, r7)
            if (r7 != r6) goto L4b
        L4a:
            return r6
        L4b:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk8.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        sq9 sq9Var = (sq9) this.c;
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
        this.c = null;
        this.b = 1;
        Object b = cqe.b((q3b) this.d, (ns2) this.e, sq9Var, this);
        n82 n82Var = n82.a;
        if (b == n82Var) {
            return n82Var;
        }
        return b;
    }

    private final Object t(Object obj) {
        sq9 sq9Var = (sq9) this.c;
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
        this.c = null;
        this.b = 1;
        Object w = yqe.w((y3b) this.d, (ns2) this.e, sq9Var, this);
        n82 n82Var = n82.a;
        if (w == n82Var) {
            return n82Var;
        }
        return w;
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
            s02 G = yae.G(new on7(28, (vt4) this.c));
            er0 er0Var = new er0((ef2) this.d, (dm8) this.e, (m42) null);
            this.b = 1;
            Object v = z1d.v(G, er0Var, this);
            n82 n82Var = n82.a;
            if (v == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object v(Object obj) {
        kb kbVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                kbVar = (kb) this.c;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            kb kbVar2 = (kb) this.d;
            this.c = kbVar2;
            this.b = 1;
            Object v = yqe.v((y3b) s2b.e0.getValue(), new Object[]{(String) this.e}, this);
            n82 n82Var = n82.a;
            if (v == n82Var) {
                return n82Var;
            }
            obj = v;
            kbVar = kbVar2;
        }
        kb.b(kbVar, (String) obj);
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new jk8((kj6) this.c, (List) this.d, (aw7) obj2, m42Var, 0);
            case 1:
                return new jk8((m32) this.c, (ss8) this.d, (String) obj2, m42Var, 1);
            case 2:
                return new jk8(m42Var, (aw7) obj2, (aw7) this.d, (dt8) this.c);
            case 3:
                return new jk8((ho5) this.d, (po5) obj2, m42Var, 3);
            case 4:
                jk8 jk8Var = new jk8((v99) this.d, (String) obj2, m42Var, 4);
                jk8Var.c = obj;
                return jk8Var;
            case 5:
                return new jk8((zb9) this.c, (f76) this.d, (cs9) obj2, m42Var, 5);
            case 6:
                return new jk8((LinkedHashMap) this.c, (be9) this.d, (String) obj2, m42Var, 6);
            case 7:
                return new jk8((String) this.c, (re9) this.d, (xt4) obj2, m42Var, 7);
            case 8:
                jk8 jk8Var2 = new jk8((kf9) obj2, m42Var, 8);
                jk8Var2.d = obj;
                return jk8Var2;
            case 9:
                jk8 jk8Var3 = new jk8((gj9) obj2, m42Var, 9);
                jk8Var3.d = obj;
                return jk8Var3;
            case 10:
                jk8 jk8Var4 = new jk8((rj9) this.d, (jp5) obj2, m42Var, 10);
                jk8Var4.c = obj;
                return jk8Var4;
            case 11:
                jk8 jk8Var5 = new jk8((jk9) this.d, (xq7) obj2, m42Var, 11);
                jk8Var5.c = obj;
                return jk8Var5;
            case 12:
                return new jk8((do9) this.c, (aw7) obj2, (aw7) this.d, m42Var);
            case 13:
                jk8 jk8Var6 = new jk8((xn6) this.d, (lu4) obj2, m42Var, 13);
                jk8Var6.c = obj;
                return jk8Var6;
            case 14:
                jk8 jk8Var7 = new jk8((zc2) this.d, (zy5) obj2, m42Var, 14);
                jk8Var7.c = obj;
                return jk8Var7;
            case 15:
                jk8 jk8Var8 = new jk8((bt1) this.d, (lu4) obj2, m42Var, 15);
                jk8Var8.c = obj;
                return jk8Var8;
            case 16:
                return new jk8((lx9) this.c, (xt4) this.d, (y26) obj2, m42Var, 16);
            case 17:
                jk8 jk8Var9 = new jk8((si3) this.d, (t3a) obj2, m42Var, 17);
                jk8Var9.c = obj;
                return jk8Var9;
            case 18:
                jk8 jk8Var10 = new jk8((t3a) this.d, (lu4) obj2, m42Var, 18);
                jk8Var10.c = obj;
                return jk8Var10;
            case 19:
                jk8 jk8Var11 = new jk8((yya) this.d, (lq) obj2, m42Var, 19);
                jk8Var11.c = obj;
                return jk8Var11;
            case 20:
                jk8 jk8Var12 = new jk8((iaa) obj2, m42Var, 20);
                jk8Var12.d = obj;
                return jk8Var12;
            case 21:
                return new jk8((sac) this.d, (aw7) obj2, m42Var, 21);
            case 22:
                jk8 jk8Var13 = new jk8((lia) this.d, (String) obj2, m42Var, 22);
                jk8Var13.c = obj;
                return jk8Var13;
            case 23:
                return new jk8((d19) this.c, (yu7) this.d, (wpa) obj2, m42Var, 23);
            case 24:
                jk8 jk8Var14 = new jk8((d82) this.d, (sj4) obj2, m42Var, 24);
                jk8Var14.c = obj;
                return jk8Var14;
            case 25:
                jk8 jk8Var15 = new jk8((q3b) this.d, (ns2) obj2, m42Var, 25);
                jk8Var15.c = obj;
                return jk8Var15;
            case 26:
                jk8 jk8Var16 = new jk8((y3b) this.d, (ns2) obj2, m42Var, 26);
                jk8Var16.c = obj;
                return jk8Var16;
            case 27:
                return new jk8((vt4) this.c, (ef2) this.d, (dm8) obj2, m42Var, 27);
            case 28:
                return new jk8((kb) this.d, (String) obj2, m42Var, 28);
            default:
                jk8 jk8Var17 = new jk8((web) this.d, (xfd) obj2, m42Var, 29);
                jk8Var17.c = obj;
                return jk8Var17;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((jk8) create((s3a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((jk8) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((jk8) create((x69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((jk8) create((sq9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((jk8) create((sq9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((jk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0589, code lost:
        if (r1 == r10) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05eb, code lost:
        if (r0 == r10) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:?, code lost:
        return r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0888  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 2592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk8(m42 m42Var, aw7 aw7Var, aw7 aw7Var2, dt8 dt8Var) {
        super(2, m42Var);
        this.a = 2;
        this.e = aw7Var;
        this.c = dt8Var;
        this.d = aw7Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk8(fdd fddVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = fddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk8(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk8(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
