package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ur5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ur5 extends fdd {
    public final cs0 C;
    public final nld D;
    public final klc E;
    public final bm5 F;
    public final pi9 G;
    public final sw7 H = new sw7();
    public vl6 I;
    public cq5 J;
    public final cza K;
    public final cza L;
    public Map M;
    public Map N;
    public List O;
    public final k97 P;
    public final k97 Q;
    public final HashSet R;
    public int S;
    public boolean T;
    public boolean U;
    public long V;
    public final s02 W;
    public final cza X;
    public final cza Y;
    public final cza Z;
    public final cza a0;
    public final cza b0;
    public final String c;
    public final cza c0;
    public final wl6 d;
    public final cza d0;
    public final yf3 e;
    public final wo5 f;

    public ur5(String str, wl6 wl6Var, yf3 yf3Var, wo5 wo5Var, cs0 cs0Var, nld nldVar, klc klcVar, bm5 bm5Var, pi9 pi9Var) {
        this.c = str;
        this.d = wl6Var;
        this.e = yf3Var;
        this.f = wo5Var;
        this.C = cs0Var;
        this.D = nldVar;
        this.E = klcVar;
        this.F = bm5Var;
        this.G = pi9Var;
        dza.a(null);
        this.K = dza.a(null);
        this.L = dza.a(null);
        ls3 ls3Var = ls3.a;
        this.M = ls3Var;
        this.N = ls3Var;
        ks3 ks3Var = ks3.a;
        this.O = ks3Var;
        this.P = new k97(10);
        this.Q = new k97(100);
        this.R = new HashSet();
        this.S = -1;
        this.T = true;
        this.U = true;
        this.W = new s02();
        this.X = dza.a(new dm5(0, 0, 0, 0, false, nae.e, false, 0, 4194303));
        this.Y = dza.a(new rl5());
        this.Z = dza.a(new am5());
        this.a0 = dza.a(new kq5());
        this.b0 = dza.a(new sm5(new kj6(0, 3, 0), ks3Var));
        this.c0 = dza.a(new xp5(-1, -1, -1));
        this.d0 = dza.a(new tl5(ks3Var));
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new rr5(0, null, this));
    }

    public static final xac j(ur5 ur5Var, int i) {
        List list = (List) ur5Var.K.getValue();
        if (list == null) {
            list = ks3.a;
        }
        mb1 mb1Var = (mb1) sl1.f0(i, list);
        if (mb1Var == null) {
            return null;
        }
        return (xac) ur5Var.N.get(mb1Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[LOOP:0: B:23:0x0062->B:24:0x0071, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.ur5 r6, defpackage.n42 r7) {
        /*
            cza r0 = r6.b0
            boolean r1 = r7 instanceof defpackage.tr5
            if (r1 == 0) goto L15
            r1 = r7
            tr5 r1 = (defpackage.tr5) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            tr5 r1 = new tr5
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.a
            int r2 = r1.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.hre.r(r7)
            goto L5e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L2e:
            defpackage.hre.r(r7)
            int r7 = r6.S
            r1.c = r4
            java.lang.Object r2 = r0.getValue()
            sm5 r2 = (defpackage.sm5) r2
            kj6 r2 = r2.a
            int r2 = r2.h()
            java.lang.Object r5 = r0.getValue()
            sm5 r5 = (defpackage.sm5) r5
            java.util.List r5 = r5.b
            java.lang.Object r2 = defpackage.sl1.f0(r2, r5)
            vh8 r2 = (defpackage.vh8) r2
            if (r2 == 0) goto L54
            java.lang.String r2 = r2.a
            goto L55
        L54:
            r2 = r3
        L55:
            java.lang.Object r7 = r6.n(r7, r1, r2)
            n82 r6 = defpackage.n82.a
            if (r7 != r6) goto L5e
            return r6
        L5e:
            java.util.List r7 = (java.util.List) r7
            if (r0 == 0) goto L73
        L62:
            java.lang.Object r6 = r0.getValue()
            r1 = r6
            sm5 r1 = (defpackage.sm5) r1
            sm5 r1 = defpackage.sm5.b(r1, r3, r7, r4)
            boolean r6 = r0.l(r6, r1)
            if (r6 == 0) goto L62
        L73:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur5.k(ur5, n42):java.lang.Object");
    }

    public static String w(Map map) {
        String str = (String) map.get("raw");
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.gdd
    public final void d() {
        boolean isTerminated;
        cq5 cq5Var = this.J;
        if (cq5Var != null) {
            if (cq5Var instanceof AutoCloseable) {
                cq5Var.close();
            } else if (cq5Var instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) cq5Var;
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
                    }
                }
            } else if (cq5Var instanceof TypedArray) {
                ((TypedArray) cq5Var).recycle();
            } else if (cq5Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cq5Var).release();
            } else if (cq5Var instanceof MediaDrm) {
                ((MediaDrm) cq5Var).release();
            } else {
                p1a.g();
            }
        }
    }

    public final void l() {
        long j = this.V;
        if (j > 0) {
            this.V = 0L;
            m82 a = idd.a(this);
            sw2 sw2Var = ab3.a;
            z87.v(a, ru2.c, null, new ir5(this, j, by5.a.k().b() - j, null, 0), 2);
        }
    }

    public final String m(int i) {
        String str;
        Map map;
        List list = (List) this.K.getValue();
        if (list == null) {
            list = ks3.a;
        }
        mb1 mb1Var = (mb1) sl1.f0(i, list);
        if (mb1Var != null) {
            xac xacVar = (xac) this.N.get(mb1Var.a);
            if (xacVar != null && (map = xacVar.c) != null) {
                str = w(map);
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r5, defpackage.n42 r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jr5
            if (r0 == 0) goto L13
            r0 = r6
            jr5 r0 = (defpackage.jr5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jr5 r0 = new jr5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3f
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            bl r6 = new bl
            r6.<init>(r7, r5, r2)
            r0.c = r2
            java.io.Serializable r6 = r4.o(r5, r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3f
            return r4
        L3f:
            yk8 r6 = (defpackage.yk8) r6
            java.lang.Object r4 = r6.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur5.n(int, n42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable o(int r5, defpackage.xt4 r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.kr5
            if (r0 == 0) goto L13
            r0 = r7
            kr5 r0 = (defpackage.kr5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kr5 r0 = new kr5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            xt4 r6 = r0.a
            defpackage.hre.r(r7)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2e:
            defpackage.hre.r(r7)
            r0.a = r6
            r0.d = r3
            pf r7 = new pf
            r1 = 7
            r7.<init>(r4, r5, r2, r1)
            java.lang.Object r7 = defpackage.k27.p(r7, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L44
            return r4
        L44:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = r6.invoke(r7)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r5 = r4 + (-25)
            r6 = 0
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r4 + 25
            int r0 = r7.size()
            int r6 = java.lang.Math.min(r6, r0)
            java.util.List r6 = r7.subList(r5, r6)
            int r4 = r4 - r5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            yk8 r4 = new yk8
            r4.<init>(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur5.o(int, xt4, n42):java.io.Serializable");
    }

    public final vl6 p() {
        vl6 vl6Var = this.I;
        if (vl6Var != null) {
            return vl6Var;
        }
        c16.w("book");
        throw null;
    }

    public abstract ho5 q();

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|(1:(1:(5:10|11|12|13|14)(2:16|17))(4:18|19|20|21))(7:66|(1:68)|70|71|(1:73)|74|(1:76)(2:78|79))|22|23|24|(3:26|(2:28|29)(1:31)|30)|32|33|(4:35|36|37|38)|55|56|(5:58|42|43|(2:45|(1:47)(2:50|(3:52|12|13)(2:53|13)))|14)(2:59|60)))|82|6|(0)(0)|22|23|24|(0)|32|33|(0)|55|56|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r8.a.h(r3) == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r3 == r11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
        if (r3 == r11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #3 {all -> 0x007b, blocks: (B:37:0x00c1, B:39:0x00d4, B:24:0x006e, B:26:0x0078, B:29:0x007e, B:31:0x009c, B:56:0x0141, B:57:0x0148), top: B:79:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #2 {all -> 0x0114, blocks: (B:34:0x00b0, B:41:0x00d9, B:43:0x00ea), top: B:77:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:45:0x00fc, B:50:0x0118, B:52:0x0120, B:54:0x013b, B:55:0x0140), top: B:74:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:45:0x00fc, B:50:0x0118, B:52:0x0120, B:54:0x013b, B:55:0x0140), top: B:74:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(int r21, boolean r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur5.r(int, boolean, n42):java.lang.Object");
    }

    public final void s(int i) {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new rr0(this, i, (m42) null, 4));
    }

    public final void t(int i, float f) {
        if (i < 0) {
            return;
        }
        if (i != this.S) {
            y();
            this.S = i;
        }
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new nr5(f, i, null, this));
    }

    public final void u() {
        mb1 mb1Var;
        double d;
        List list = (List) this.K.getValue();
        if (list == null || (mb1Var = (mb1) sl1.f0(this.S, list)) == null) {
            return;
        }
        cza czaVar = this.c0;
        int i = ((xp5) czaVar.getValue()).b;
        int i2 = ((xp5) czaVar.getValue()).c;
        if (i2 > 0) {
            d = i / i2;
        } else {
            d = 0.0d;
        }
        z87.v(idd.a(this), null, null, new pr5(this, mb1Var, m(this.S), d, null), 3);
    }

    public final void v() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        f(a, ru2Var, new c95(this, null, 7));
        f(jdd.a(this), ru2Var, new hr5(5, null, this));
        f(jdd.a(this), ru2Var, new c95(this, null, 8));
        f(jdd.a(this), ru2Var, new pr5(this, null, 0));
    }

    public final void x() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new rr5(1, null, this));
    }

    public final void y() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new hr5(7, null, this));
    }

    public abstract void z(boolean z);
}
