package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a12  reason: default package */
/* loaded from: classes.dex */
public final class a12 implements una, dd6 {
    public long a = j2d.a;
    public ArrayList b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Type inference failed for: r7v4, types: [zl9, java.lang.Object] */
    @Override // defpackage.una
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.m42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.z02
            if (r0 == 0) goto L13
            r0 = r7
            z02 r0 = (defpackage.z02) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            z02 r0 = new z02
            n42 r7 = (defpackage.n42) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            zl9 r0 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r7 = move-exception
            goto L73
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L32:
            defpackage.hre.r(r7)
            long r3 = r6.a
            boolean r7 = defpackage.x02.l(r3)
            if (r7 == 0) goto L7f
            zl9 r7 = new zl9
            r7.<init>()
            r0.a = r7     // Catch: java.lang.Throwable -> L6f
            r0.d = r2     // Catch: java.lang.Throwable -> L6f
            f61 r1 = new f61     // Catch: java.lang.Throwable -> L6f
            m42 r0 = defpackage.w92.t(r0)     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6f
            r1.u()     // Catch: java.lang.Throwable -> L6f
            r7.a = r1     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r0 = r6.b     // Catch: java.lang.Throwable -> L6f
            r0.add(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r1.s()     // Catch: java.lang.Throwable -> L6f
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L62
            return r1
        L62:
            r0 = r7
        L63:
            java.util.ArrayList r7 = r6.b
            java.lang.Object r0 = r0.a
            java.util.Collection r7 = defpackage.jsc.r(r7)
            r7.remove(r0)
            goto L7f
        L6f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L73:
            java.util.ArrayList r6 = r6.b
            java.lang.Object r0 = r0.a
            java.util.Collection r6 = defpackage.jsc.r(r6)
            r6.remove(r0)
            throw r7
        L7f:
            long r6 = r6.a
            int r0 = defpackage.j2d.b
            cna r0 = new cna
            int r1 = defpackage.x02.i(r6)
            x63 r2 = defpackage.x63.a
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L99
            defpackage.xpe.b(r1)
            w63 r4 = new w63
            r4.<init>(r1)
            goto L9a
        L99:
            r4 = r2
        L9a:
            int r6 = defpackage.x02.h(r6)
            if (r6 == r3) goto La8
            defpackage.xpe.b(r6)
            w63 r2 = new w63
            r2.<init>(r6)
        La8:
            r0.<init>(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.b(m42):java.lang.Object");
    }

    public final void c(long j) {
        this.a = j;
        if (!x02.l(j)) {
            ArrayList arrayList = this.b;
            if (!arrayList.isEmpty()) {
                this.b = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((m42) obj).resumeWith(pvc.a);
                }
            }
        }
    }

    @Override // defpackage.dd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        c(j);
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new a1(M, 5));
    }
}
