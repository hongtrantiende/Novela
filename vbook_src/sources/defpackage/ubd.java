package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ubd  reason: default package */
/* loaded from: classes3.dex */
public abstract class ubd extends fdd {
    public final q6d C;
    public final klc D;
    public final f8b E;
    public vl6 F;
    public gaa G;
    public final cza H;
    public Map I;
    public Map J;
    public boolean K;
    public List L;
    public w26 M;
    public w26 N;
    public int O;
    public long P;
    public final s02 Q;
    public final cza R;
    public final cza S;
    public final cza T;
    public final cza U;
    public final cza V;
    public final String c;
    public final wl6 d;
    public final yf3 e;
    public final w9d f;

    public ubd(String str, wl6 wl6Var, yf3 yf3Var, w9d w9dVar, q6d q6dVar, klc klcVar, f8b f8bVar) {
        this.c = str;
        this.d = wl6Var;
        this.e = yf3Var;
        this.f = w9dVar;
        this.C = q6dVar;
        this.D = klcVar;
        this.E = f8bVar;
        dza.a(null);
        this.H = dza.a(null);
        ls3 ls3Var = ls3.a;
        this.I = ls3Var;
        this.J = ls3Var;
        this.K = true;
        ks3 ks3Var = ks3.a;
        this.L = ks3Var;
        this.O = -1;
        this.Q = new s02();
        this.R = dza.a(new s6d(2, 0, 0, true, true, false, true, 16.0f, 0.5f, 4294967295L, 4278190080L, 1, nae.e, false, 1.0f, 1.0f, 10, 10, true, true, 1.0f, true, false));
        this.S = dza.a(new p6d("", "", "", "", "", 0, "", false, false, false, false, false, false, false, false));
        this.T = dza.a(new c8d(0, "", 0, 0.0d));
        this.U = dza.a(new ibd("", ks3Var, rs3.a));
        this.V = dza.a(new fbd(true, false, null, ks3Var, 0, null, ks3Var, -1, ks3Var, -1));
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new rg0((iaa) this, null, 28));
    }

    public static String t(Map map) {
        String str = (String) map.get("raw");
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.gdd
    public final void d() {
        boolean isTerminated;
        w26 w26Var = this.M;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        gaa n = n();
        if (!(n instanceof AutoCloseable)) {
            if (n instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) n;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
                return;
            }
            p1a.g();
        }
    }

    public final void j(float f) {
        Object value;
        cza czaVar = this.R;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, s6d.a((s6d) value, 0, 0, 0, false, false, false, false, nae.e, nae.e, 0L, 0L, 0, nae.e, false, nae.e, nae.e, 0, 0, false, false, dce.m(f, nae.e, 1.0f), false, false, 6815743)));
        }
    }

    public final void k(float f) {
        Object value;
        cza czaVar = this.R;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, s6d.a((s6d) value, 0, 0, 0, false, false, false, false, nae.e, nae.e, 0L, 0L, 0, nae.e, false, f, nae.e, 0, 0, false, false, nae.e, false, false, 8372223)));
        }
    }

    public final double l(int i) {
        boolean z;
        List list = (List) this.H.getValue();
        if (list == null) {
            list = ks3.a;
        }
        su3 su3Var = (su3) sl1.f0(i, list);
        if (su3Var != null) {
            boolean z2 = true;
            if (m().s == su3Var.b) {
                z = true;
            } else {
                z = false;
            }
            if (m().r.length() <= 0 || (!c16.i(m().r, su3Var.a) && !c16.i(m().r, ox9.m(su3Var.c, false)))) {
                z2 = false;
            }
            if (!z && !z2) {
                return 0.0d;
            }
            return dce.l(m().t, 0.0d, 1.0d);
        }
        return 0.0d;
    }

    public final vl6 m() {
        vl6 vl6Var = this.F;
        if (vl6Var != null) {
            return vl6Var;
        }
        c16.w("book");
        throw null;
    }

    public final gaa n() {
        gaa gaaVar = this.G;
        if (gaaVar != null) {
            return gaaVar;
        }
        c16.w("videoSource");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(14:5|6|7|(1:(2:10|11)(2:50|51))(2:52|(8:(1:54)|56|57|(1:64)|59|60|61|(1:63))(6:57|(0)|59|60|61|(0)))|12|(2:14|(3:16|(2:18|19)(1:21)|20)(3:22|23|24))|26|(2:(2:28|(1:31)(1:30))|32)(1:49)|33|(1:35)(1:(2:(1:46)|48))|36|37|(2:39|(2:(1:41)|43))|44))|67|6|7|(0)(0)|12|(0)|26|(0)(0)|33|(0)(0)|36|37|(0)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
        r1 = new defpackage.gs9(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:30:0x008b, B:32:0x00a7, B:34:0x00b1, B:36:0x00bb, B:37:0x00cc, B:38:0x00d6, B:39:0x00d9, B:41:0x00dc, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:22:0x005f, B:26:0x006e), top: B:61:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc A[Catch: all -> 0x0030, LOOP:1: B:41:0x00dc->B:44:0x00fc, LOOP_START, PHI: r8 
      PHI: (r8v6 int) = (r8v4 int), (r8v8 int) binds: [B:40:0x00da, B:44:0x00fc] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:30:0x008b, B:32:0x00a7, B:34:0x00b1, B:36:0x00bb, B:37:0x00cc, B:38:0x00d6, B:39:0x00d9, B:41:0x00dc, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:22:0x005f, B:26:0x006e), top: B:61:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:30:0x008b, B:32:0x00a7, B:34:0x00b1, B:36:0x00bb, B:37:0x00cc, B:38:0x00d6, B:39:0x00d9, B:41:0x00dc, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:22:0x005f, B:26:0x006e), top: B:61:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r21, boolean r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubd.o(int, boolean, n42):java.lang.Object");
    }

    public final void p(int i) {
        Object value;
        if (i < 0) {
            return;
        }
        if (i != this.O) {
            u();
            this.O = i;
        }
        cza czaVar = this.T;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, c8d.a((c8d) value, 0, null, 0, 0.0d, 7)));
            hk1 a = jdd.a(this);
            sw2 sw2Var = ab3.a;
            f(a, ru2.c, new rr0(this, i, (m42) null, 16));
        }
        hk1 a2 = jdd.a(this);
        sw2 sw2Var2 = ab3.a;
        f(a2, ru2.c, new rr0(this, i, (m42) null, 16));
    }

    public final void q() {
        List list = (List) this.H.getValue();
        if (list == null) {
            list = ks3.a;
        }
        if (this.O < list.size() - 1) {
            p(this.O + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[LOOP:0: B:28:0x008f->B:29:0x00ab, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r29, long r31) {
        /*
            r28 = this;
            r1 = r28
            r2 = r31
            cza r0 = r1.H
            java.lang.Object r4 = r0.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto Lf
            goto L19
        Lf:
            int r5 = r1.O
            java.lang.Object r4 = defpackage.sl1.f0(r5, r4)
            su3 r4 = (defpackage.su3) r4
            if (r4 != 0) goto L1a
        L19:
            return
        L1a:
            int r5 = r1.O
            double r5 = r1.l(r5)
            r7 = 0
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L2b
            r7 = r29
            double r5 = (double) r7
            double r2 = (double) r2
            double r5 = r5 / r2
        L2b:
            r7 = r5
            int r2 = r1.O
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L38
            ks3 r0 = defpackage.ks3.a
        L38:
            java.lang.Object r0 = defpackage.sl1.f0(r2, r0)
            su3 r0 = (defpackage.su3) r0
            r13 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L45
        L43:
            r3 = r2
            goto L5f
        L45:
            java.util.Map r3 = r1.J
            java.lang.String r0 = r0.a
            java.lang.Object r0 = r3.get(r0)
            wac r0 = (defpackage.wac) r0
            if (r0 == 0) goto L5a
            java.util.Map r0 = r0.c
            if (r0 == 0) goto L5a
            java.lang.String r0 = t(r0)
            goto L5b
        L5a:
            r0 = r13
        L5b:
            if (r0 != 0) goto L5e
            goto L43
        L5e:
            r3 = r0
        L5f:
            vl6 r14 = r1.m()
            java.lang.String r0 = r4.a
            int r2 = r4.b
            r9 = 0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r23 = defpackage.dce.l(r7, r9, r11)
            r26 = 0
            r27 = -983041(0xfffffffffff0ffff, float:NaN)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r25 = 0
            r21 = r0
            r22 = r2
            r20 = r3
            vl6 r0 = defpackage.vl6.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27)
            r1.F = r0
            cza r0 = r1.T
            if (r0 == 0) goto Lad
        L8f:
            java.lang.Object r2 = r0.getValue()
            r14 = r2
            c8d r14 = (defpackage.c8d) r14
            int r5 = r1.O
            double r18 = r1.l(r5)
            r20 = 7
            r15 = 0
            r16 = 0
            r17 = 0
            c8d r5 = defpackage.c8d.a(r14, r15, r16, r17, r18, r20)
            boolean r2 = r0.l(r2, r5)
            if (r2 == 0) goto L8f
        Lad:
            m82 r9 = defpackage.idd.a(r1)
            sw2 r0 = defpackage.ab3.a
            ru2 r10 = defpackage.ru2.c
            pr5 r0 = new pr5
            r6 = 0
            r2 = r4
            r4 = r7
            r7 = 4
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r1 = 2
            defpackage.z87.v(r9, r10, r13, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubd.r(long, long):void");
    }

    public final void s(int i) {
        abd abdVar = (abd) sl1.f0(i, this.L);
        if (abdVar == null) {
            return;
        }
        cza czaVar = this.V;
        if (czaVar != null) {
            while (true) {
                Object value = czaVar.getValue();
                ks3 ks3Var = ks3.a;
                if (czaVar.l(value, fbd.a((fbd) value, true, false, null, null, i, null, ks3Var, -1, ks3Var, -1, 12))) {
                    break;
                }
            }
        }
        w26 w26Var = this.M;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        w26 w26Var2 = this.N;
        if (w26Var2 != null) {
            w26Var2.cancel(null);
        }
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        this.M = f(a, ru2.c, new pf(this, i, abdVar, (m42) null, 18));
    }

    public final void u() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new pbd(this, null, 8));
    }
}
