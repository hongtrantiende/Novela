package defpackage;

import android.content.Intent;
import android.view.View;
import com.reader.data.download.impl.AndroidDownloadService;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import java.util.List;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l0  reason: default package */
/* loaded from: classes3.dex */
public final class l0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    private final Object A(Object obj) {
        String str = (String) this.d;
        sr0 sr0Var = (sr0) this.c;
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
            n64 n64Var = sr0Var.d;
            this.b = 1;
            obj = ((c74) n64Var).c(str, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        if (((f34) obj) != null) {
            sr0Var.h(sr0Var.f, new hr0(str));
        }
        return pvc.a;
    }

    private final Object B(Object obj) {
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
            mx mxVar = new mx(yae.G(new ve((em8) this.c, 17)), 3);
            nt0 nt0Var = new nt0((ef2) this.d, null, 0);
            this.b = 1;
            Object v = z1d.v(mxVar, nt0Var, this);
            n82 n82Var = n82.a;
            if (v == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object C(Object obj) {
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
            lq lqVar = (lq) this.c;
            Float f = new Float(Float.intBitsToFloat((int) (((y78) this.d).a >> 32)) + ((Number) lqVar.e()).floatValue());
            this.b = 1;
            Object g = lqVar.g(this, f);
            n82 n82Var = n82.a;
            if (g == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:16:0x0047). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 != r2) goto L10
            java.lang.Object r0 = r8.c
            m82 r0 = (defpackage.m82) r0
            defpackage.hre.r(r9)
            goto L47
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r1
        L16:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r8.c
            m82 r9 = (defpackage.m82) r9
            r0 = r9
        L1e:
            boolean r9 = defpackage.k27.v(r0)
            if (r9 == 0) goto L6e
            kg r9 = defpackage.kg.C
            r8.c = r0
            r8.b = r2
            d82 r3 = r8.getContext()
            cne r4 = defpackage.cne.f
            b82 r3 = r3.get(r4)
            if (r3 != 0) goto L6a
            d82 r3 = r8.getContext()
            xq7 r3 = defpackage.cqe.i(r3)
            java.lang.Object r9 = r3.m0(r9, r8)
            n82 r3 = defpackage.n82.a
            if (r9 != r3) goto L47
            return r3
        L47:
            java.lang.Object r9 = r8.d
            i29 r9 = (defpackage.i29) r9
            int[] r3 = r9.d0
            boolean r4 = r9.isAttachedToWindow()
            if (r4 != 0) goto L54
            goto L1e
        L54:
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.I
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L66
            r3 = r3[r2]
            if (r6 == r3) goto L1e
        L66:
            r9.q()
            goto L1e
        L6a:
            defpackage.vm1.h()
            return r1
        L6e:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [jn] */
    private final Object p(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            throw a82.e(obj);
        }
        hre.r(obj);
        final kw5 kw5Var = (kw5) this.d;
        ?? r2 = new cub() { // from class: jn
            @Override // defpackage.cub
            public final void a(grb grbVar, grb grbVar2, boolean z) {
                int i2;
                long j = grbVar.e;
                fxb fxbVar = grbVar.f;
                long j2 = grbVar2.e;
                fxb fxbVar2 = grbVar2.f;
                kw5 kw5Var2 = kw5.this;
                if (z) {
                    kw5Var2.C().restartInput((View) kw5Var2.b);
                } else if (fxb.c(j, j2) && c16.i(fxbVar, fxbVar2)) {
                } else {
                    int g = fxb.g(j2);
                    int f = fxb.f(j2);
                    int i3 = -1;
                    if (fxbVar2 != null) {
                        i2 = fxb.g(fxbVar2.a);
                    } else {
                        i2 = -1;
                    }
                    if (fxbVar2 != null) {
                        i3 = fxb.f(fxbVar2.a);
                    }
                    kw5Var2.C().updateSelection((View) kw5Var2.b, g, f, i2, i3);
                }
            }
        };
        this.b = 1;
        ((mkc) this.c).b(r2, this);
        return n82.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (defpackage.cqe.i(getContext()).m0(new defpackage.kz4(1, r7), r6) == r4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (((defpackage.xv7) r6.c).a(r0, r6) == r4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.b
            r1 = 0
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L13
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r1
        L13:
            defpackage.hre.r(r7)
            goto L51
        L17:
            defpackage.hre.r(r7)
            goto L3a
        L1b:
            defpackage.hre.r(r7)
            ww6 r7 = new ww6
            r0 = 5
            r7.<init>(r0)
            r6.b = r3
            d82 r0 = r6.getContext()
            xq7 r0 = defpackage.cqe.i(r0)
            kz4 r5 = new kz4
            r5.<init>(r3, r7)
            java.lang.Object r7 = r0.m0(r5, r6)
            if (r7 != r4) goto L3a
            goto L50
        L3a:
            java.lang.Object r7 = r6.c
            xv7 r7 = (defpackage.xv7) r7
            bb r0 = new bb
            java.lang.Object r3 = r6.d
            kw5 r3 = (defpackage.kw5) r3
            r5 = 3
            r0.<init>(r3, r5)
            r6.b = r2
            java.lang.Object r6 = r7.a(r0, r6)
            if (r6 != r4) goto L51
        L50:
            return r4
        L51:
            defpackage.ls2.c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
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
            tqc tqcVar = (tqc) this.d;
            if (tqcVar != null) {
                this.c = null;
                this.b = 1;
                obj = tqcVar.f(this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            }
            return pvc.a;
        }
        pvc pvcVar = (pvc) obj;
        return pvc.a;
    }

    private final Object s(Object obj) {
        AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) this.c;
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
            boolean z = AndroidTextToSpeechService.R;
            y1c y1cVar = ((i2c) androidTextToSpeechService.f()).a;
            if (((Boolean) y1cVar.d.c(y1c.o[3], y1cVar)).booleanValue()) {
                sw2 sw2Var = ab3.a;
                n35 n35Var = zz6.a.f;
                db dbVar = new db(androidTextToSpeechService, (Intent) this.d, null, 2);
                this.b = 1;
                if (z87.E(n35Var, dbVar, this) == n82Var) {
                    return n82Var;
                }
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r1.b(r10) == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r1.a((java.lang.String) r11, r10) != r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (defpackage.z1d.v(r1, r11, r10) == r8) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            tx r0 = (defpackage.tx) r0
            zk r1 = r0.E
            int r2 = r10.b
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            n82 r8 = defpackage.n82.a
            if (r2 == 0) goto L33
            if (r2 == r7) goto L2f
            if (r2 == r6) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            defpackage.hre.r(r11)
            goto L75
        L1d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r3
        L23:
            defpackage.hre.r(r11)
            goto L5c
        L27:
            java.lang.Object r1 = r10.c
            ib4 r1 = (defpackage.ib4) r1
            defpackage.hre.r(r11)
            goto L4f
        L2f:
            defpackage.hre.r(r11)
            goto L3f
        L33:
            defpackage.hre.r(r11)
            r10.b = r7
            java.lang.Object r11 = r1.b(r10)
            if (r11 != r8) goto L3f
            goto L74
        L3f:
            ib4 r11 = r0.F
            r10.c = r11
            r10.b = r6
            java.io.Serializable r1 = r1.a(r10)
            if (r1 != r8) goto L4c
            goto L74
        L4c:
            r9 = r1
            r1 = r11
            r11 = r9
        L4f:
            java.lang.String r11 = (java.lang.String) r11
            r10.c = r3
            r10.b = r5
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r8) goto L5c
            goto L74
        L5c:
            h58 r11 = r0.C
            i58 r11 = (defpackage.i58) r11
            cza r11 = r11.b
            mx r1 = new mx
            r1.<init>(r11, r4)
            gx r11 = new gx
            r11.<init>(r0, r3)
            r10.b = r4
            java.lang.Object r10 = defpackage.z1d.v(r1, r11, r10)
            if (r10 != r8) goto L75
        L74:
            return r8
        L75:
            pvc r10 = defpackage.pvc.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.t(java.lang.Object):java.lang.Object");
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
            n0 n0Var = new n0((qq4) this.c, (xra) this.d, null, 10);
            this.b = 1;
            r0a r0aVar = new r0a(this, getContext());
            Object J = zbe.J(r0aVar, true, r0aVar, n0Var);
            n82 n82Var = n82.a;
            if (J == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object v(Object obj) {
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
            nd0 nd0Var = new nd0(pgdVar, (String) this.d, null, 0);
            this.c = null;
            this.b = 1;
            Object E = z87.E(n35Var, nd0Var, this);
            n82 n82Var = n82.a;
            if (E == n82Var) {
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
            int h = ((ud0) this.d).b.h();
            this.b = 1;
            yy9 yy9Var = kj6.y;
            Object f = ((kj6) this.c).f(h, 0, this);
            n82 n82Var = n82.a;
            if (f == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    private final Object x(Object obj) {
        Object obj2;
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
            gh0 gh0Var = (gh0) this.d;
            fh0 fh0Var = new fh0(gh0Var, y69Var);
            m02 m02Var = gh0Var.a;
            m02Var.getClass();
            synchronized (m02Var.c) {
                try {
                    if (m02Var.d.add(fh0Var)) {
                        if (m02Var.d.size() == 1) {
                            m02Var.e = m02Var.a();
                            r95 n = r95.n();
                            String str = n02.a;
                            n.c(str, m02Var.getClass().getSimpleName() + ": initial state = " + m02Var.e);
                            m02Var.c();
                        }
                        if (gh0Var.e(m02Var.e)) {
                            obj2 = new c12(gh0Var.d());
                        } else {
                            obj2 = b12.a;
                        }
                        y69Var.getClass();
                        y69Var.j(obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            t7 t7Var = new t7(11, (gh0) this.d, fh0Var);
            this.b = 1;
            if (pae.c(y69Var, t7Var, this) == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r14 == r6) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[LOOP:0: B:19:0x0066->B:24:0x0084, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.d
            pq0 r0 = (defpackage.pq0) r0
            wl6 r1 = r0.d
            int r2 = r13.b
            r3 = 0
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1c
            java.lang.Object r13 = r13.c
            java.util.List r13 = (java.util.List) r13
            defpackage.hre.r(r14)
            r8 = r13
            goto L5c
        L1c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            r13 = 0
            return r13
        L23:
            defpackage.hre.r(r14)
            goto L38
        L27:
            defpackage.hre.r(r14)
            java.lang.String r14 = r0.c
            r13.b = r5
            r2 = r1
            bn6 r2 = (defpackage.bn6) r2
            java.util.ArrayList r14 = r2.r(r3, r14)
            if (r14 != r6) goto L38
            goto L59
        L38:
            java.util.List r14 = (java.util.List) r14
            r13.c = r14
            r13.b = r4
            bn6 r1 = (defpackage.bn6) r1
            ii2 r13 = r1.a
            gk2 r13 = r13.c
            r13.getClass()
            pk2 r1 = new pk2
            bk2 r2 = new bk2
            r4 = 10
            r2.<init>(r4)
            r1.<init>(r13, r2)
            java.lang.Object r13 = r1.d()
            if (r13 != r6) goto L5a
        L59:
            return r6
        L5a:
            r8 = r14
            r14 = r13
        L5c:
            java.lang.Number r14 = (java.lang.Number) r14
            long r13 = r14.longValue()
            cza r0 = r0.e
            if (r0 == 0) goto L86
        L66:
            java.lang.Object r1 = r0.getValue()
            r7 = r1
            oq0 r7 = (defpackage.oq0) r7
            int r2 = r8.size()
            long r9 = (long) r2
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 >= 0) goto L78
            r11 = r5
            goto L79
        L78:
            r11 = r3
        L79:
            r10 = 0
            r12 = 4
            r9 = 0
            oq0 r2 = defpackage.oq0.a(r7, r8, r9, r10, r11, r12)
            boolean r1 = r0.l(r1, r2)
            if (r1 == 0) goto L66
        L86:
            pvc r13 = defpackage.pvc.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.y(java.lang.Object):java.lang.Object");
    }

    private final Object z(Object obj) {
        Object value;
        pq0 pq0Var = (pq0) this.d;
        String str = (String) this.c;
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
            if (str.length() == 0) {
                hk1 a = jdd.a(pq0Var);
                sw2 sw2Var = ab3.a;
                pq0Var.f(a, ru2.c, new l0(pq0Var, null, 24));
                return pvc.a;
            }
            wl6 wl6Var = pq0Var.d;
            this.b = 1;
            obj = ((bn6) wl6Var).h(Context.VERSION_ES6, str);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        List list = (List) obj;
        cza czaVar = pq0Var.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, oq0.a((oq0) value, list, false, false, false, 4)));
        }
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new l0((yu7) this.c, (ga5) obj2, m42Var, 0);
            case 1:
                return new l0((yu7) this.c, (ha5) obj2, m42Var, 1);
            case 2:
                return new l0((Intent) this.c, (android.content.Context) obj2, m42Var, 2);
            case 3:
                l0 l0Var = new l0((b8) obj2, m42Var, 3);
                l0Var.c = obj;
                return l0Var;
            case 4:
                return new l0((eb) this.c, (fb) obj2, m42Var, 4);
            case 5:
                l0 l0Var2 = new l0((eb) obj2, m42Var, 5);
                l0Var2.c = obj;
                return l0Var2;
            case 6:
                return new l0((ce) this.c, (th3) obj2, m42Var, 6);
            case 7:
                l0 l0Var3 = new l0((df) obj2, m42Var, 7);
                l0Var3.c = obj;
                return l0Var3;
            case 8:
                return new l0((AndroidBookUpdateWorker) this.c, (hk2) obj2, m42Var, 8);
            case 9:
                l0 l0Var4 = new l0((AndroidBookUpdateWorker) obj2, m42Var, 9);
                l0Var4.c = obj;
                return l0Var4;
            case 10:
                return new l0((ef3) this.c, (AndroidDownloadService) obj2, m42Var, 10);
            case 11:
                return new l0((AndroidDownloadService) this.c, (String) obj2, m42Var, 11);
            case 12:
                return new l0((oj) this.c, (kw5) obj2, m42Var, 12);
            case 13:
                l0 l0Var5 = new l0((kk) obj2, m42Var, 13);
                l0Var5.c = obj;
                return l0Var5;
            case 14:
                l0 l0Var6 = new l0((i29) obj2, m42Var, 14);
                l0Var6.c = obj;
                return l0Var6;
            case 15:
                return new l0((mkc) this.c, (kw5) obj2, m42Var, 15);
            case 16:
                return new l0((xv7) this.c, (kw5) obj2, m42Var, 16);
            case 17:
                l0 l0Var7 = new l0((tqc) obj2, m42Var, 17);
                l0Var7.c = obj;
                return l0Var7;
            case 18:
                return new l0((AndroidTextToSpeechService) this.c, (Intent) obj2, m42Var, 18);
            case 19:
                return new l0((tx) obj2, m42Var, 19);
            case 20:
                return new l0((qq4) this.c, (xra) obj2, m42Var, 20);
            case 21:
                l0 l0Var8 = new l0((String) obj2, m42Var, 21);
                l0Var8.c = obj;
                return l0Var8;
            case 22:
                return new l0((kj6) this.c, (ud0) obj2, m42Var, 22);
            case 23:
                l0 l0Var9 = new l0((gh0) obj2, m42Var, 23);
                l0Var9.c = obj;
                return l0Var9;
            case 24:
                return new l0((pq0) obj2, m42Var, 24);
            case 25:
                return new l0((String) this.c, (pq0) obj2, m42Var, 25);
            case 26:
                return new l0((sr0) this.c, (String) obj2, m42Var, 26);
            case 27:
                return new l0((em8) this.c, (ef2) obj2, m42Var, 27);
            case 28:
                return new l0((lq) this.c, (y78) obj2, m42Var, 28);
            default:
                return new l0((wu0) this.c, (rk9) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((l0) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                ((l0) create((lw5) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82Var;
            case 14:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82Var;
            case 16:
                ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82Var;
            case 17:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((l0) create((pgd) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((l0) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((l0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0220, code lost:
        if (r0.b(r1, r2, r4, r6.g - r4, r31) == r11) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0264, code lost:
        if (r8 == r11) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
        if (defpackage.cqe.i(getContext()).m0(new defpackage.kz4(1, r0), r31) == r11) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05e0  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
    }
}
