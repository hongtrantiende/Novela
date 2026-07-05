package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: re5  reason: default package */
/* loaded from: classes3.dex */
public final class re5 implements m82, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(re5.class, "closed");
    public final ah5 C;
    public final uy1 D;
    public final uwd E;
    public final ye5 F;
    public final b98 a;
    public final y26 b;
    public final d82 c;
    private volatile /* synthetic */ int closed = 0;
    public final ah5 d;
    public final ah5 e;
    public final ah5 f;

    public re5(b98 b98Var, ye5 ye5Var) {
        this.a = b98Var;
        d82 d82Var = b98Var.D;
        r0f r0fVar = r0f.I;
        y26 y26Var = new y26((w26) d82Var.get(r0fVar));
        this.b = y26Var;
        this.c = b98Var.D.plus(y26Var);
        this.d = new ah5(1);
        this.e = new ah5(2);
        ah5 ah5Var = new ah5(3);
        this.f = ah5Var;
        this.C = new ah5(0);
        this.D = new uy1();
        this.E = new uwd(19);
        ye5 ye5Var2 = new ye5();
        this.F = ye5Var2;
        ah5Var.g(ah5.w, new zp0(this, b98Var, null));
        ah5Var.g(ah5.x, new wa(this, (m42) null, 14));
        ye5Var2.a(ih5.b, new tn4(25));
        ye5Var2.a(co0.c, new tn4(25));
        ye5Var2.a(af3.d, new tn4(25));
        if (ye5Var.f) {
            ye5Var2.c.put("DefaultTransformers", new tn4(23));
        }
        ye5Var2.a(ci5.b, new tn4(25));
        ij1 ij1Var = pe5.b;
        ye5Var2.a(ij1Var, new tn4(25));
        if (ye5Var.e) {
            ye5Var2.a(eh5.d, new tn4(25));
        }
        ye5Var2.e = ye5Var.e;
        ye5Var2.f = ye5Var.f;
        ye5Var2.a.putAll(ye5Var.a);
        ye5Var2.b.putAll(ye5Var.b);
        ye5Var2.c.putAll(ye5Var.c);
        if (ye5Var.f) {
            ye5Var2.a(yg5.b, new tn4(25));
        }
        h40 h40Var = pw2.a;
        ye5Var2.a(ij1Var, new bq2(ye5Var2));
        for (xt4 xt4Var : ye5Var2.a.values()) {
            xt4Var.invoke(this);
        }
        for (xt4 xt4Var2 : ye5Var2.c.values()) {
            xt4Var2.invoke(this);
        }
        this.e.g(ah5.o, new me(this, (m42) null, 6));
        cf5.d.incrementAndGet(b98Var);
        b82 b82Var = this.c.get(r0fVar);
        b82Var.getClass();
        ((w26) b82Var).invokeOnCompletion(new fo4(b98Var, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.gh5 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qe5
            if (r0 == 0) goto L13
            r0 = r6
            qe5 r0 = (defpackage.qe5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qe5 r0 = new qe5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L45
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            uwd r6 = r4.E
            hq7 r1 = defpackage.cj1.a
            r6.u(r1)
            java.lang.Object r6 = r5.d
            r0.c = r2
            ah5 r4 = r4.d
            java.lang.Object r6 = r4.a(r5, r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L45
            return r4
        L45:
            r6.getClass()
            te5 r6 = (defpackage.te5) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re5.G(gh5, n42):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        if (!G.compareAndSet(this, 0, 1)) {
            return;
        }
        uy1 uy1Var = (uy1) this.D.c(kf5.a);
        for (h40 h40Var : sl1.C0(uy1Var.d().keySet())) {
            h40Var.getClass();
            Object c = uy1Var.c(h40Var);
            if (c instanceof AutoCloseable) {
                AutoCloseable autoCloseable = (AutoCloseable) c;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
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
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else {
                    p1a.g();
                    return;
                }
            }
        }
        this.b.o0();
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.c;
    }

    public final String toString() {
        return "HttpClient[" + this.a + ']';
    }
}
