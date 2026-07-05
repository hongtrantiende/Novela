package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qq4  reason: default package */
/* loaded from: classes3.dex */
public final class qq4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq4(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final Object o(Object obj) {
        mh6 mh6Var = (mh6) this.c;
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
                lq lqVar = mh6Var.q;
                Float f = new Float((float) nae.e);
                lf4 lf4Var = (lf4) this.d;
                kh6 kh6Var = new kh6((p15) this.e, mh6Var, 1);
                this.b = 1;
                Object c = lq.c(lqVar, f, lf4Var, null, kh6Var, this, 4);
                n82 n82Var = n82.a;
                if (c == n82Var) {
                    return n82Var;
                }
            }
            mh6Var.k.setValue(Boolean.TRUE);
            mh6Var.f(false);
            return pvc.a;
        } catch (Throwable th) {
            mh6Var.f(false);
            throw th;
        }
    }

    private final Object p(Object obj) {
        p51 p51Var = (p51) this.e;
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
                m82 m82Var = (m82) this.c;
                this.b = 1;
                obj = ((lu4) this.d).invoke(m82Var, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            }
            p51Var.a(obj);
        } catch (CancellationException unused) {
            p51Var.d = true;
            s51 s51Var = p51Var.b;
            if (s51Var != null && s51Var.b.cancel(true)) {
                p51Var.a = null;
                p51Var.b = null;
                p51Var.c = null;
            }
        } catch (Throwable th) {
            p51Var.b(th);
        }
        return pvc.a;
    }

    private final Object q(Object obj) {
        xe5 xe5Var;
        oh5 oh5Var = (oh5) this.c;
        int i = this.b;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    hre.r(obj);
                    return pvcVar;
                }
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xe5Var = (xe5) this.d;
            hre.r(obj);
        } else {
            hre.r(obj);
            if (((ew6) this.e) != ew6.NONE && !oh5Var.y0().getAttributes().b(hx6.b)) {
                xe5 xe5Var2 = (xe5) oh5Var.y0().getAttributes().c(hx6.a);
                this.c = null;
                this.d = xe5Var2;
                this.b = 1;
                if (owe.K(xe5Var2, oh5Var, this) != n82Var) {
                    xe5Var = xe5Var2;
                }
                return n82Var;
            }
            return pvcVar;
        }
        this.c = null;
        this.d = null;
        this.b = 2;
        if (xe5Var.b(this) == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v7, types: [xr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
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
            if (((Boolean) ((aw7) this.e).getValue()).booleanValue()) {
                this.b = 1;
                Object c = ((atd) this.c).c(this);
                n82 n82Var = n82.a;
                if (c == n82Var) {
                    return n82Var;
                }
            }
            return pvc.a;
        }
        ((p59) this.d).a(false);
        return pvc.a;
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
            String h = rqe.h(((mvb) this.d).c, ((tvb) this.e).a);
            this.b = 1;
            Object l = ((lhd) this.c).l(h, this);
            n82 n82Var = n82.a;
            if (l == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (defpackage.pae.c(r4, r10, r9) == r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r10) {
        /*
            r9 = this;
            n82 r0 = defpackage.n82.a
            int r1 = r9.b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L18
            if (r1 != r2) goto L12
            defpackage.hre.r(r10)
            goto L9e
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r3
        L18:
            java.lang.Object r1 = r9.d
            m35 r1 = (defpackage.m35) r1
            java.lang.Object r4 = r9.c
            y69 r4 = (defpackage.y69) r4
            defpackage.hre.r(r10)
            goto L8a
        L24:
            defpackage.hre.r(r10)
            java.lang.Object r10 = r9.c
            y69 r10 = (defpackage.y69) r10
            java.lang.Object r1 = r9.e
            java.io.File r1 = (java.io.File) r1
            fl7 r5 = new fl7
            r6 = 4
            r5.<init>(r6, r1, r10)
            java.lang.Object r6 = defpackage.eu7.b
            java.io.File r1 = r1.getParentFile()
            r1.getClass()
            java.io.File r1 = r1.getCanonicalFile()
            java.lang.String r1 = r1.getPath()
            java.lang.Object r6 = defpackage.eu7.b
            monitor-enter(r6)
            java.util.LinkedHashMap r7 = defpackage.eu7.c     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r8 = r7.get(r1)     // Catch: java.lang.Throwable -> L5d
            if (r8 != 0) goto L5f
            eu7 r8 = new eu7     // Catch: java.lang.Throwable -> L5d
            r1.getClass()     // Catch: java.lang.Throwable -> L5d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r7.put(r1, r8)     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r9 = move-exception
            goto La1
        L5f:
            eu7 r8 = (defpackage.eu7) r8     // Catch: java.lang.Throwable -> L5d
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.a     // Catch: java.lang.Throwable -> L5d
            r7.add(r5)     // Catch: java.lang.Throwable -> L5d
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.a     // Catch: java.lang.Throwable -> L5d
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L5d
            if (r7 != r4) goto L71
            r8.startWatching()     // Catch: java.lang.Throwable -> L5d
        L71:
            monitor-exit(r6)
            m35 r6 = new m35
            r6.<init>(r4, r1, r5)
            pvc r1 = defpackage.pvc.a
            r9.c = r10
            r9.d = r6
            r9.b = r4
            xy0 r4 = r10.f
            java.lang.Object r1 = r4.e(r9, r1)
            if (r1 != r0) goto L88
            goto L9d
        L88:
            r4 = r10
            r1 = r6
        L8a:
            u76 r10 = new u76
            r5 = 18
            r10.<init>(r1, r5)
            r9.c = r3
            r9.d = r3
            r9.b = r2
            java.lang.Object r9 = defpackage.pae.c(r4, r10, r9)
            if (r9 != r0) goto L9e
        L9d:
            return r0
        L9e:
            pvc r9 = defpackage.pvc.a
            return r9
        La1:
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (new defpackage.m11(r7, r8, r9, 8193).d(true, r12) == r5) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r13.g(r12) == r5) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            bod r0 = (defpackage.bod) r0
            int r1 = r12.b
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.hre.r(r13)
            goto L4f
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r2
        L1b:
            defpackage.hre.r(r13)
            goto L42
        L1f:
            defpackage.hre.r(r13)
            java.lang.Object r13 = r12.d
            r8 = r13
            d31 r8 = (defpackage.d31) r8
            java.lang.Object r13 = r12.e
            r7 = r13
            x82 r7 = (defpackage.x82) r7
            f31 r9 = r0.a
            r12.c = r0
            r12.b = r4
            d31 r13 = defpackage.mu7.a
            m11 r6 = new m11
            r10 = 8193(0x2001, double:4.048E-320)
            r6.<init>(r7, r8, r9, r10)
            java.lang.Object r13 = r6.d(r4, r12)
            if (r13 != r5) goto L42
            goto L4e
        L42:
            f31 r13 = r0.a
            r12.c = r2
            r12.b = r3
            java.lang.Object r12 = r13.g(r12)
            if (r12 != r5) goto L4f
        L4e:
            return r5
        L4f:
            pvc r12 = defpackage.pvc.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        tkc tkcVar = (tkc) this.c;
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        s02 G = yae.G(new gz7(tkcVar, 0));
        nr nrVar = new nr(tkcVar, (qra) this.d, (fv7) this.e);
        this.b = 1;
        Object a = G.a(new tm6(nrVar, 4), this);
        n82 n82Var = n82.a;
        if (a != n82Var) {
            a = pvcVar;
        }
        if (a == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [vl9, java.lang.Object] */
    private final Object y(Object obj) {
        vt4 se0Var;
        Object c12Var;
        n82 n82Var = n82.a;
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
            y69 y69Var = (y69) this.c;
            NetworkRequest a = ((w02) this.d).a();
            if (a == null) {
                c28 c28Var = ((w02) this.d).a;
                c28Var.getClass();
                if (c28Var == c28.a) {
                    a = null;
                } else {
                    NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT >= 30 && c28Var == c28.f) {
                        a = removeCapability.addCapability(25).build();
                    } else {
                        int ordinal = c28Var.ordinal();
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    removeCapability = removeCapability.addTransportType(0);
                                }
                            } else {
                                removeCapability = removeCapability.addCapability(18);
                            }
                        } else {
                            removeCapability = removeCapability.addCapability(11);
                        }
                        a = removeCapability.build();
                    }
                }
            }
            if (a == null) {
                y69Var.getClass();
                y69Var.f(null);
                return pvc.a;
            }
            fl7 fl7Var = new fl7(9, z87.v(y69Var, null, null, new c95((x18) this.e, y69Var, (m42) null, 28), 3), y69Var);
            if (Build.VERSION.SDK_INT >= 30) {
                tga tgaVar = tga.a;
                ConnectivityManager connectivityManager = ((x18) this.e).a;
                tgaVar.getClass();
                synchronized (tga.b) {
                    try {
                        LinkedHashMap linkedHashMap = tga.c;
                        boolean isEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(fl7Var, a);
                        if (isEmpty) {
                            r95.n().c(zld.a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(tgaVar);
                        } else if (tga.e && tga.f != null) {
                            r95.n().c(zld.a, "NetworkRequestConstraintController send initial capabilities");
                            if (tga.a(a, tga.d)) {
                                c12Var = b12.a;
                            } else {
                                c12Var = new c12(7);
                            }
                            fl7Var.invoke(c12Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                se0Var = new mm7(25, fl7Var, connectivityManager);
            } else {
                int i2 = vu5.c;
                ConnectivityManager connectivityManager2 = ((x18) this.e).a;
                vu5 vu5Var = new vu5(fl7Var);
                ?? obj2 = new Object();
                try {
                    r95.n().c(zld.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(a, vu5Var);
                    obj2.a = true;
                } catch (RuntimeException e) {
                    if (r4b.I(e.getClass().getName(), "TooManyRequestsException", false)) {
                        r95.n().e(zld.a, "NetworkRequestConstraintController couldn't register callback", e);
                        fl7Var.invoke(new c12(7));
                    } else {
                        throw e;
                    }
                }
                se0Var = new se0(15, (Object) obj2, connectivityManager2, vu5Var);
            }
            on7 on7Var = new on7(12, se0Var);
            this.b = 1;
            if (pae.c(y69Var, on7Var, this) == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object z(Object obj) {
        x69 x69Var = (x69) this.c;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                x69Var = (x69) this.d;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            long j = ((j48) sl1.c0(((g58) this.e).b)).e;
            this.c = null;
            this.d = x69Var;
            this.b = 1;
            obj = tn3.t(j, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        x69Var.setValue(obj);
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                qq4 qq4Var = new qq4((rq4) this.d, (String) obj2, m42Var, 0);
                qq4Var.c = obj;
                return qq4Var;
            case 1:
                return new qq4((d19) this.c, (zg4) this.d, (zl9) obj2, m42Var, 1);
            case 2:
                return new qq4((xy0) obj2, m42Var, 2);
            case 3:
                qq4 qq4Var2 = new qq4((l05) this.d, (hn8) obj2, m42Var, 3);
                qq4Var2.c = obj;
                return qq4Var2;
            case 4:
                return new qq4((Object) ((pgd) this.c), (String) obj2, (String) this.d, m42Var, 4);
            case 5:
                return new qq4((Object) ((e95) this.c), (String) obj2, (String) this.d, m42Var, 5);
            case 6:
                qq4 qq4Var3 = new qq4((ee5) obj2, m42Var, 6);
                qq4Var3.c = obj;
                return qq4Var3;
            case 7:
                return new qq4((Object) ((z62) this.c), (String) obj2, (String) this.d, m42Var, 7);
            case 8:
                return new qq4((Long) this.c, (gh5) this.d, (w26) obj2, m42Var, 8);
            case 9:
                qq4 qq4Var4 = new qq4((ur5) this.d, (po5) obj2, m42Var, 9);
                qq4Var4.c = obj;
                return qq4Var4;
            case 10:
                qq4 qq4Var5 = new qq4((tx5) this.d, (String) obj2, m42Var, 10);
                qq4Var5.c = obj;
                return qq4Var5;
            case 11:
                qq4 qq4Var6 = new qq4((e06) obj2, m42Var, 11);
                qq4Var6.d = obj;
                return qq4Var6;
            case 12:
                return new qq4((n26) this.c, (e49) this.d, (Long) obj2, m42Var, 12);
            case 13:
                qq4 qq4Var7 = new qq4((lu4) obj2, m42Var, 13);
                qq4Var7.c = obj;
                return qq4Var7;
            case 14:
                return new qq4((xb6) this.d, (String) obj2, m42Var, 14);
            case 15:
                return new qq4((xb6) obj2, m42Var, 15);
            case 16:
                return new qq4((mh6) this.c, (lf4) this.d, (p15) obj2, m42Var, 16);
            case 17:
                qq4 qq4Var8 = new qq4((lu4) this.d, (p51) obj2, m42Var, 17);
                qq4Var8.c = obj;
                return qq4Var8;
            case 18:
                qq4 qq4Var9 = new qq4((ew6) obj2, m42Var, 18);
                qq4Var9.c = obj;
                return qq4Var9;
            case 19:
                qq4 qq4Var10 = new qq4((s17) obj2, m42Var, 19);
                qq4Var10.c = obj;
                return qq4Var10;
            case 20:
                return new qq4((k37) this.c, (Uri) this.d, (InputEvent) obj2, m42Var, 20);
            case 21:
                qq4 qq4Var11 = new qq4((kd7) obj2, m42Var, 21);
                qq4Var11.c = obj;
                return qq4Var11;
            case 22:
                return new qq4((atd) this.c, (p59) this.d, (aw7) obj2, m42Var, 22);
            case 23:
                return new qq4((lhd) this.c, (mvb) this.d, (tvb) obj2, m42Var, 23);
            case 24:
                qq4 qq4Var12 = new qq4((File) obj2, m42Var, 24);
                qq4Var12.c = obj;
                return qq4Var12;
            case 25:
                qq4 qq4Var13 = new qq4((d31) this.d, (x82) obj2, m42Var, 25);
                qq4Var13.c = obj;
                return qq4Var13;
            case 26:
                return new qq4((tkc) this.c, (qra) this.d, (fv7) obj2, m42Var, 26);
            case 27:
                qq4 qq4Var14 = new qq4((w02) this.d, (x18) obj2, m42Var, 27);
                qq4Var14.c = obj;
                return qq4Var14;
            case 28:
                qq4 qq4Var15 = new qq4((g58) obj2, m42Var, 28);
                qq4Var15.c = obj;
                return qq4Var15;
            default:
                qq4 qq4Var16 = new qq4((j68) obj2, m42Var, 29);
                qq4Var16.c = obj;
                return qq4Var16;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((qq4) create((f31) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((qq4) create((xra) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((qq4) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((qq4) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((qq4) create((Float) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((qq4) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((qq4) create((bod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((qq4) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((qq4) create((x69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((qq4) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0253, code lost:
        if (r3 == r7) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02c2, code lost:
        if (r3 != r7) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0379, code lost:
        if (r3 == r7) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r0 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x043c, code lost:
        if (r0 == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04bb, code lost:
        if (defpackage.e06.a(r0, r6, r18) == r7) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04d5, code lost:
        if (r6.a(r18) == r7) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05b3, code lost:
        if (r0 == r10) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x067b, code lost:
        if (r0 == r10) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (r0 != r7) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:?, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:?, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:?, code lost:
        return r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ea A[LOOP:9: B:185:0x03ea->B:186:0x0401, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4 A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #4 {all -> 0x002a, blocks: (B:9:0x0023, B:38:0x010c, B:31:0x00e4, B:33:0x00e8, B:35:0x00f9), top: B:517:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x093e A[Catch: all -> 0x0911, TryCatch #9 {all -> 0x0911, blocks: (B:434:0x090b, B:444:0x0936, B:446:0x093e, B:447:0x094c, B:455:0x095d, B:441:0x0927, B:457:0x0960, B:440:0x0922, B:448:0x094d, B:450:0x0953), top: B:525:0x08ff }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARN: Type inference failed for: r2v15, types: [ta1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ex4] */
    /* JADX WARN: Type inference failed for: r4v63, types: [my0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:442:0x0932 -> B:444:0x0936). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq4(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq4(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq4(Object obj, String str, String str2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.e = str;
        this.d = str2;
    }
}
