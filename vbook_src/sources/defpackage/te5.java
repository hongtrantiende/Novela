package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: te5  reason: default package */
/* loaded from: classes3.dex */
public class te5 implements m82 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final h40 e;
    public final re5 a;
    public fh5 b;
    public oh5 c;
    private volatile /* synthetic */ int received;

    static {
        nsc nscVar;
        gi1 a = cm9.a(Object.class);
        try {
            nscVar = cm9.d(Object.class);
        } catch (Throwable unused) {
            nscVar = null;
        }
        e = new h40("CustomResponse", new isc(a, nscVar));
        d = AtomicIntegerFieldUpdater.newUpdater(te5.class, "received");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public te5(re5 re5Var, oe4 oe4Var, rh5 rh5Var) {
        this(re5Var);
        re5Var.getClass();
        oe4Var.getClass();
        rh5Var.getClass();
        this.b = new lu2(this, oe4Var);
        this.c = new mu2(this, rh5Var);
        uy1 attributes = getAttributes();
        attributes.getClass();
        h40 h40Var = e;
        h40Var.getClass();
        attributes.d().remove(h40Var);
        Object obj = rh5Var.e;
        if (!(obj instanceof s11)) {
            getAttributes().f(h40Var, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (r8 != r5) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.isc r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.se5
            if (r0 == 0) goto L13
            r0 = r8
            se5 r0 = (defpackage.se5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            se5 r0 = new se5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 0
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r2) goto L31
            isc r7 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2e
            goto La4
        L2e:
            r7 = move-exception
            goto Ld5
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L37:
            isc r7 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2e
            goto L90
        L3d:
            defpackage.hre.r(r8)
            oh5 r8 = r6.d()     // Catch: java.lang.Throwable -> L2e
            gi1 r1 = r7.a     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r1 = defpackage.nmd.B(r1)     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r1.isInstance(r8)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L55
            oh5 r6 = r6.d()     // Catch: java.lang.Throwable -> L2e
            return r6
        L55:
            boolean r8 = r6.b()     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L75
            oh5 r8 = r6.d()     // Catch: java.lang.Throwable -> L2e
            boolean r8 = defpackage.af3.b(r8)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L75
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.te5.d     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            boolean r8 = r8.compareAndSet(r6, r1, r4)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L6f
            goto L75
        L6f:
            xe3 r7 = new xe3     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            throw r7     // Catch: java.lang.Throwable -> L2e
        L75:
            uy1 r8 = r6.getAttributes()     // Catch: java.lang.Throwable -> L2e
            h40 r1 = defpackage.te5.e     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.e(r1)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L90
            r0.a = r7     // Catch: java.lang.Throwable -> L2e
            r0.d = r4     // Catch: java.lang.Throwable -> L2e
            oh5 r8 = r6.d()     // Catch: java.lang.Throwable -> L2e
            s11 r8 = r8.b()     // Catch: java.lang.Throwable -> L2e
            if (r8 != r5) goto L90
            goto La3
        L90:
            qh5 r1 = new qh5     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L2e
            re5 r8 = r6.a     // Catch: java.lang.Throwable -> L2e
            ah5 r8 = r8.e     // Catch: java.lang.Throwable -> L2e
            r0.a = r7     // Catch: java.lang.Throwable -> L2e
            r0.d = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.a(r6, r1, r0)     // Catch: java.lang.Throwable -> L2e
            if (r8 != r5) goto La4
        La3:
            return r5
        La4:
            qh5 r8 = (defpackage.qh5) r8     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L2e
            m68 r0 = defpackage.m68.a     // Catch: java.lang.Throwable -> L2e
            boolean r0 = defpackage.c16.i(r8, r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto Lb1
            r3 = r8
        Lb1:
            if (r3 == 0) goto Ld4
            gi1 r8 = r7.a     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r8 = defpackage.nmd.B(r8)     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r8.isInstance(r3)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto Lc0
            goto Ld4
        Lc0:
            java.lang.Class r8 = r3.getClass()     // Catch: java.lang.Throwable -> L2e
            gi1 r8 = defpackage.cm9.a(r8)     // Catch: java.lang.Throwable -> L2e
            gi1 r7 = r7.a     // Catch: java.lang.Throwable -> L2e
            w28 r0 = new w28     // Catch: java.lang.Throwable -> L2e
            oh5 r1 = r6.d()     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r1, r8, r7)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        Ld4:
            return r3
        Ld5:
            oh5 r6 = r6.d()
            java.lang.String r8 = "Receive failed"
            java.util.concurrent.CancellationException r8 = defpackage.nye.b(r8, r7)
            defpackage.k27.n(r6, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te5.a(isc, n42):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    public final fh5 c() {
        fh5 fh5Var = this.b;
        if (fh5Var != null) {
            return fh5Var;
        }
        c16.w("request");
        throw null;
    }

    public final oh5 d() {
        oh5 oh5Var = this.c;
        if (oh5Var != null) {
            return oh5Var;
        }
        c16.w("response");
        throw null;
    }

    public final uy1 getAttributes() {
        return c().getAttributes();
    }

    @Override // defpackage.m82
    public final d82 q() {
        return d().q();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().e() + ']';
    }

    public te5(re5 re5Var) {
        re5Var.getClass();
        this.a = re5Var;
        this.received = 0;
    }
}
