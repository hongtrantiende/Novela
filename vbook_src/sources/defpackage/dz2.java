package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dz2  reason: default package */
/* loaded from: classes3.dex */
public final class dz2 implements yy2, egd {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ AtomicIntegerFieldUpdater E;
    public static final /* synthetic */ AtomicIntegerFieldUpdater F;
    public final ArrayList C;
    public final egd a;
    public final bt1 b;
    public final y26 c;
    private volatile /* synthetic */ int closed;
    public final d82 d;
    public final xy0 e;
    public final xy0 f;
    volatile /* synthetic */ Object pinger;
    private volatile /* synthetic */ int started;

    static {
        new ys4(new byte[0], x38.a);
        D = AtomicReferenceFieldUpdater.newUpdater(dz2.class, Object.class, "pinger");
        E = AtomicIntegerFieldUpdater.newUpdater(dz2.class, "closed");
        F = AtomicIntegerFieldUpdater.newUpdater(dz2.class, "started");
    }

    public dz2(egd egdVar, va1 va1Var, va1 va1Var2) {
        egdVar.getClass();
        va1Var.getClass();
        va1Var2.getClass();
        this.a = egdVar;
        this.pinger = null;
        this.b = jxe.c();
        y26 c = k27.c();
        this.c = c;
        this.d = egdVar.q().minusKey(r0f.I).plus(c).plus(new i82("ws-default"));
        sa1 sa1Var = ta1.i;
        this.e = que.s(sa1Var, va1Var);
        this.f = que.s(sa1Var, va1Var2);
        this.closed = 0;
        this.C = new ArrayList();
        this.started = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dz2 r9, defpackage.zma r10, defpackage.at4 r11, defpackage.n42 r12) {
        /*
            egd r0 = r9.a
            boolean r1 = r12 instanceof defpackage.zy2
            if (r1 == 0) goto L15
            r1 = r12
            zy2 r1 = (defpackage.zy2) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            zy2 r1 = new zy2
            r1.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r1.b
            int r2 = r1.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2a
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r4
        L2a:
            int r9 = r1.a
            defpackage.hre.r(r12)
            goto L7a
        L30:
            defpackage.hre.r(r12)
            byte[] r11 = r11.b
            int r11 = r11.length
            if (r10 == 0) goto L40
            ly0 r12 = r10.b()
            long r5 = r12.c
            int r12 = (int) r5
            goto L41
        L40:
            r12 = 0
        L41:
            int r11 = r11 + r12
            long r5 = (long) r11
            long r7 = r0.g1()
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L81
            if (r10 == 0) goto L50
            r10.close()
        L50:
            dk1 r10 = new dk1
            r0f r12 = defpackage.ck1.b
            java.lang.String r12 = "Frame is too big: "
            java.lang.String r2 = ". Max size is "
            java.lang.StringBuilder r12 = defpackage.hl5.s(r12, r2, r11)
            long r5 = r0.g1()
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r0 = 1009(0x3f1, float:1.414E-42)
            r10.<init>(r0, r12)
            r1.a = r11
            r1.d = r3
            java.lang.Object r9 = defpackage.sue.j(r9, r10, r1)
            n82 r10 = defpackage.n82.a
            if (r9 != r10) goto L79
            return r10
        L79:
            r9 = r11
        L7a:
            dt4 r10 = new dt4
            long r11 = (long) r9
            r10.<init>(r11, r4)
            throw r10
        L81:
            pvc r9 = defpackage.pvc.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.a(dz2, zma, at4, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r11 != r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r10.d(r11, null, r0) == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if (r7.e(r0, r11) == r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c3 -> B:19:0x0052). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.dz2 r10, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.az2
            if (r0 == 0) goto L13
            r0 = r11
            az2 r0 = (defpackage.az2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            az2 r0 = new az2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            qy0 r1 = r0.a
            defpackage.hre.r(r11)
            goto L52
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r5
        L36:
            qy0 r10 = r0.a
            at4 r10 = (defpackage.at4) r10
            defpackage.hre.r(r11)
            goto Lcb
        L3f:
            qy0 r1 = r0.a
            defpackage.hre.r(r11)
            goto L5d
        L45:
            defpackage.hre.r(r11)
            xy0 r11 = r10.f
            r11.getClass()
            qy0 r1 = new qy0
            r1.<init>(r11)
        L52:
            r0.a = r1
            r0.d = r4
            java.lang.Object r11 = r1.a(r0)
            if (r11 != r6) goto L5d
            goto Lc5
        L5d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lcb
            java.lang.Object r11 = r1.c()
            at4 r11 = (defpackage.at4) r11
            pw6 r7 = defpackage.ez2.a
            boolean r8 = defpackage.gwe.k(r7)
            if (r8 == 0) goto L8c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Sending "
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r9 = " from session "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.i(r8)
        L8c:
            boolean r7 = r11 instanceof defpackage.ws4
            if (r7 == 0) goto La1
            ws4 r11 = (defpackage.ws4) r11
            dk1 r11 = defpackage.pbe.o(r11)
            r0.a = r5
            r0.d = r3
            java.lang.Object r10 = r10.d(r11, r5, r0)
            if (r10 != r6) goto Lcb
            goto Lc5
        La1:
            boolean r7 = r11 instanceof defpackage.zs4
            if (r7 != 0) goto La9
            boolean r7 = r11 instanceof defpackage.vs4
            if (r7 == 0) goto Lb5
        La9:
            java.util.ArrayList r7 = r10.C
            java.util.Iterator r7 = r7.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto Lc6
        Lb5:
            egd r7 = r10.a
            u8a r7 = r7.j0()
            r0.a = r1
            r0.d = r2
            java.lang.Object r11 = r7.e(r0, r11)
            if (r11 != r6) goto L52
        Lc5:
            return r6
        Lc6:
            java.lang.ClassCastException r10 = defpackage.rs8.f(r7)
            throw r10
        Lcb:
            pvc r10 = defpackage.pvc.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.b(dz2, n42):java.lang.Object");
    }

    @Override // defpackage.egd
    public final ta1 C() {
        return this.e;
    }

    @Override // defpackage.yy2
    public final void I0(List list) {
        List list2;
        if (F.compareAndSet(this, 0, 1)) {
            pw6 pw6Var = ez2.a;
            if (gwe.k(pw6Var)) {
                StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
                sb.append(this);
                sb.append(") with negotiated extensions: ");
                list2 = list;
                sb.append(sl1.i0(list2, null, null, null, null, 63));
                pw6Var.i(sb.toString());
            } else {
                list2 = list;
            }
            this.C.addAll(list2);
            c();
            i82 i82Var = lv8.a;
            xy0 xy0Var = this.f;
            xy0Var.getClass();
            xy0 a = xpe.a(5, 6, null);
            z87.v(this, lv8.a, null, new kv8(a, xy0Var, null), 2);
            i82 i82Var2 = ez2.b;
            dvc dvcVar = ab3.b;
            i82Var2.getClass();
            iya v = z87.v(this, nq2.C(i82Var2, dvcVar), null, new bz2(this, a, null), 2);
            i82 i82Var3 = ez2.c;
            i82Var3.getClass();
            z87.v(this, null, null, new uw2(v, z87.u(this, nq2.C(i82Var3, dvcVar), p82.d, new uw2(this, null, 3)), this, null, 4), 3);
            return;
        }
        cp8.m(this, " is already started.", "WebSocket session ");
    }

    @Override // defpackage.egd
    public final Object Q(fgd fgdVar) {
        Object Q = this.a.Q(fgdVar);
        if (Q == n82.a) {
            return Q;
        }
        return pvc.a;
    }

    @Override // defpackage.egd
    public final void V0(long j) {
        this.a.V0(j);
    }

    public final void c() {
        u8a u8aVar = (u8a) D.getAndSet(this, null);
        if (u8aVar != null) {
            u8aVar.f(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dk1 r11, java.io.IOException r12, defpackage.n42 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.cz2
            if (r0 == 0) goto L13
            r0 = r13
            cz2 r0 = (defpackage.cz2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cz2 r0 = new cz2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            int r1 = r0.e
            xy0 r2 = r10.e
            xy0 r3 = r10.f
            bt1 r4 = r10.b
            pvc r5 = defpackage.pvc.a
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L3d
            if (r1 != r6) goto L36
            dk1 r10 = r0.b
            java.io.IOException r12 = r0.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> L33
            goto Lab
        L33:
            r11 = move-exception
            goto Lbe
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L3d:
            defpackage.hre.r(r13)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.dz2.E
            boolean r13 = r13.compareAndSet(r10, r7, r6)
            if (r13 != 0) goto L4a
            goto Lbd
        L4a:
            pw6 r13 = defpackage.ez2.a
            boolean r1 = defpackage.gwe.k(r13)
            if (r1 == 0) goto L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "Sending Close Sequence for session "
            r1.<init>(r8)
            r1.append(r10)
            java.lang.String r8 = " with reason "
            r1.append(r8)
            r1.append(r11)
            java.lang.String r8 = " and exception "
            r1.append(r8)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r13.i(r1)
        L73:
            y26 r13 = r10.c
            r13.o0()
            if (r11 != 0) goto L85
            dk1 r11 = new dk1
            r0f r13 = defpackage.ck1.b
            java.lang.String r13 = ""
            r1 = 1000(0x3e8, float:1.401E-42)
            r11.<init>(r1, r13)
        L85:
            r10.c()     // Catch: java.lang.Throwable -> Lad
            short r13 = r11.a     // Catch: java.lang.Throwable -> Lad
            r0f r1 = defpackage.ck1.b     // Catch: java.lang.Throwable -> Lad
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r13 == r1) goto Lb2
            egd r10 = r10.a     // Catch: java.lang.Throwable -> Lad
            u8a r10 = r10.j0()     // Catch: java.lang.Throwable -> Lad
            ws4 r13 = new ws4     // Catch: java.lang.Throwable -> Lad
            r13.<init>(r11)     // Catch: java.lang.Throwable -> Lad
            r0.a = r12     // Catch: java.lang.Throwable -> Lad
            r0.b = r11     // Catch: java.lang.Throwable -> Lad
            r0.e = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r10 = r10.e(r0, r13)     // Catch: java.lang.Throwable -> Lad
            n82 r13 = defpackage.n82.a
            if (r10 != r13) goto Laa
            return r13
        Laa:
            r10 = r11
        Lab:
            r11 = r10
            goto Lb2
        Lad:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto Lbe
        Lb2:
            r4.P(r11)
            if (r12 == 0) goto Lbd
            r3.p(r12, r7)
            r2.p(r12, r7)
        Lbd:
            return r5
        Lbe:
            r4.P(r10)
            if (r12 == 0) goto Lc9
            r3.p(r12, r7)
            r2.p(r12, r7)
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.d(dk1, java.io.IOException, n42):java.lang.Object");
    }

    @Override // defpackage.egd
    public final long g1() {
        return this.a.g1();
    }

    @Override // defpackage.egd
    public final u8a j0() {
        return this.f;
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.d;
    }
}
