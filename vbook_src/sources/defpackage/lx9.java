package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lx9  reason: default package */
/* loaded from: classes.dex */
public final class lx9 implements Closeable {
    public final yn9 C;
    public final AtomicInteger D;
    public final m41 E;
    public final List F;
    public final AtomicBoolean G;
    public final Uri a;
    public final kr8 b;
    public final String c;
    public final ParcelFileDescriptor d;
    public final d82 e;
    public final int f;

    public lx9(Uri uri, kr8 kr8Var, String str, ParcelFileDescriptor parcelFileDescriptor, d82 d82Var, int i, yn9 yn9Var) {
        uri.getClass();
        kr8Var.getClass();
        this.a = uri;
        this.b = kr8Var;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = d82Var;
        this.f = i;
        this.C = yn9Var;
        this.D = new AtomicInteger(1);
        this.E = k27.a(d82Var.plus(rse.b()));
        new CopyOnWriteArrayList();
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        this.F = synchronizedList;
        if (((lr8) kr8Var).c() != null) {
            this.G = new AtomicBoolean(false);
        } else {
            vs.m("Required value was null.");
            throw null;
        }
    }

    public final Object C(xt4 xt4Var, kx9 kx9Var) {
        if (!this.G.get()) {
            r0f r0fVar = r0f.I;
            d82 d82Var = this.e;
            y26 y26Var = new y26((w26) d82Var.get(r0fVar));
            ((lr8) this.b).c.add(y26Var);
            y26Var.invokeOnCompletion(new cn9(3, this, y26Var));
            return z87.E(d82Var.plus(y26Var), new jk8(this, xt4Var, y26Var, null, 16), kx9Var);
        }
        throw new ap8(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.D.decrementAndGet() > 0) {
            return;
        }
        this.G.set(true);
        ((lr8) this.b).b();
        this.d.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v0, types: [lx9] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0077 -> B:21:0x0078). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.ty5 r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jx9
            if (r0 == 0) goto L13
            r0 = r7
            jx9 r0 = (defpackage.jx9) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            jx9 r0 = new jx9
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.util.Collection r6 = r0.c
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r1 = r0.b
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.util.Collection r3 = r0.a
            java.util.Collection r3 = (java.util.Collection) r3
            defpackage.hre.r(r7)
            goto L78
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L38:
            defpackage.hre.r(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.tl1.s(r6, r1)
            r7.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
            r6 = r7
        L4c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L7f
            r7 = r1
            sy5 r7 = (defpackage.sy5) r7
            int r7 = r7.nextInt()
            r3 = r6
            java.util.Collection r3 = (java.util.Collection) r3
            r0.a = r3
            r4 = r1
            java.util.Iterator r4 = (java.util.Iterator) r4
            r0.b = r4
            r0.c = r3
            r0.f = r2
            tr0 r3 = new tr0
            r4 = 15
            r3.<init>(r7, r4)
            java.lang.Object r7 = r5.q(r3, r0)
            n82 r3 = defpackage.n82.a
            if (r7 != r3) goto L77
            return r3
        L77:
            r3 = r6
        L78:
            bp8 r7 = (defpackage.bp8) r7
            r6.add(r7)
            r6 = r3
            goto L4c
        L7f:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx9.o(ty5, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (defpackage.ade.q(r11 * 400, r0) == r4) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0073 -> B:13:0x002d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.xt4 r11, defpackage.n42 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.kx9
            if (r0 == 0) goto L13
            r0 = r12
            kx9 r0 = (defpackage.kx9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kx9 r0 = new kx9
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            int r11 = r0.b
            xt4 r1 = r0.a
            defpackage.hre.r(r12)
        L2d:
            r12 = r11
            r11 = r1
            goto L45
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L37:
            int r11 = r0.b
            xt4 r1 = r0.a
            defpackage.hre.r(r12)     // Catch: java.lang.Exception -> L3f
            return r12
        L3f:
            r12 = move-exception
            goto L58
        L41:
            defpackage.hre.r(r12)
            r12 = r3
        L45:
            r0.a = r11     // Catch: java.lang.Exception -> L53
            r0.b = r12     // Catch: java.lang.Exception -> L53
            r0.e = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r10 = r10.C(r11, r0)     // Catch: java.lang.Exception -> L53
            if (r10 != r4) goto L52
            goto L75
        L52:
            return r10
        L53:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r12
            r12 = r9
        L58:
            r5 = 3
            if (r11 > r5) goto L76
            boolean r5 = r12 instanceof android.os.DeadObjectException
            if (r5 != 0) goto L63
            boolean r5 = r12 instanceof java.util.concurrent.TimeoutException
            if (r5 == 0) goto L76
        L63:
            int r11 = r11 + 1
            r5 = 400(0x190, double:1.976E-321)
            long r7 = (long) r11
            long r7 = r7 * r5
            r0.a = r1
            r0.b = r11
            r0.e = r2
            java.lang.Object r12 = defpackage.ade.q(r7, r0)
            if (r12 != r4) goto L2d
        L75:
            return r4
        L76:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx9.q(xt4, n42):java.lang.Object");
    }
}
