package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gy  reason: default package */
/* loaded from: classes.dex */
public final class gy implements b82 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ y69 b;

    public gy(AtomicReference atomicReference, y69 y69Var) {
        this.a = atomicReference;
        this.b = y69Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.lu4 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fy
            if (r0 == 0) goto L13
            r0 = r6
            fy r0 = (defpackage.fy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fy r0 = new fy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            defpackage.hre.r(r6)
            goto L62
        L2b:
            defpackage.hre.r(r6)
            r0.c = r2
            f61 r6 = new f61
            m42 r0 = defpackage.w92.t(r0)
            r6.<init>(r2, r0)
            r6.u()
            jc r0 = new jc
            r1 = 8
            y69 r2 = r4.b
            r0.<init>(r2, r1)
            r6.w(r0)
            java.util.concurrent.atomic.AtomicReference r4 = r4.a
            java.lang.Object r4 = r4.getAndSet(r6)
            e61 r4 = (defpackage.e61) r4
            if (r4 == 0) goto L56
            r0 = 0
            r4.a(r0)
        L56:
            r2.j(r5)
            java.lang.Object r4 = r6.s()
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L62
            return
        L62:
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy.a(lu4, n42):void");
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        return nq2.x(this, c82Var);
    }

    @Override // defpackage.b82
    public c82 getKey() {
        return cne.c;
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        return nq2.B(this, c82Var);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }
}
