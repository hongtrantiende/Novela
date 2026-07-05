package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b10  reason: default package */
/* loaded from: classes.dex */
public final class b10 implements yya {
    public final List a;
    public final zsc b;
    public final xt4 c;
    public final hm8 d;
    public boolean e = true;

    public b10(List list, Object obj, zsc zscVar, ij1 ij1Var, xt4 xt4Var, ej ejVar) {
        this.a = list;
        this.b = zscVar;
        this.c = xt4Var;
        this.d = yae.z(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:35:0x0095, B:21:0x0047, B:23:0x004c, B:27:0x0072, B:33:0x008b), top: B:40:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0095 -> B:36:0x009e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.a10
            if (r0 == 0) goto L13
            r0 = r13
            a10 r0 = (defpackage.a10) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            a10 r0 = new a10
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.C
            pvc r2 = defpackage.pvc.a
            xt4 r3 = r12.c
            hm8 r4 = r12.d
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L88
            r7 = 0
            r8 = 2
            if (r1 == r5) goto L3f
            if (r1 != r8) goto L39
            int r1 = r0.d
            int r7 = r0.c
            java.util.List r8 = r0.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> L36
            goto L9e
        L36:
            r13 = move-exception
            goto Lb4
        L39:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r7
        L3f:
            int r1 = r0.d
            int r9 = r0.c
            rf r10 = r0.b
            java.util.List r11 = r0.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> L36
            if (r13 == 0) goto L72
            zsc r1 = r12.b     // Catch: java.lang.Throwable -> L36
            int r5 = r1.d     // Catch: java.lang.Throwable -> L36
            dq4 r7 = r1.b     // Catch: java.lang.Throwable -> L36
            int r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = defpackage.rae.k(r5, r13, r10, r7, r1)     // Catch: java.lang.Throwable -> L36
            r4.setValue(r13)     // Catch: java.lang.Throwable -> L36
            d82 r13 = r0.getContext()
            boolean r13 = defpackage.k27.u(r13)
            r12.e = r6
            btc r12 = new btc
            java.lang.Object r0 = r4.getValue()
            r12.<init>(r0, r13)
        L6e:
            r3.invoke(r12)
            return r2
        L72:
            r0.a = r11     // Catch: java.lang.Throwable -> L36
            r0.b = r7     // Catch: java.lang.Throwable -> L36
            r0.c = r9     // Catch: java.lang.Throwable -> L36
            r0.d = r1     // Catch: java.lang.Throwable -> L36
            r0.C = r8     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = defpackage.b23.t(r0)     // Catch: java.lang.Throwable -> L36
            n82 r7 = defpackage.n82.a
            if (r13 != r7) goto L85
            return r7
        L85:
            r7 = r9
            r8 = r11
            goto L9e
        L88:
            defpackage.hre.r(r13)
            java.util.List r13 = r12.a     // Catch: java.lang.Throwable -> L36
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L36
            r8 = r13
            r7 = r6
        L93:
            if (r7 >= r1) goto La0
            java.lang.Object r13 = r8.get(r7)     // Catch: java.lang.Throwable -> L36
            rf r13 = (defpackage.rf) r13     // Catch: java.lang.Throwable -> L36
            r13.getClass()     // Catch: java.lang.Throwable -> L36
        L9e:
            int r7 = r7 + r5
            goto L93
        La0:
            d82 r13 = r0.getContext()
            boolean r13 = defpackage.k27.u(r13)
            r12.e = r6
            btc r12 = new btc
            java.lang.Object r0 = r4.getValue()
            r12.<init>(r0, r13)
            goto L6e
        Lb4:
            d82 r0 = r0.getContext()
            boolean r0 = defpackage.k27.u(r0)
            r12.e = r6
            btc r12 = new btc
            java.lang.Object r1 = r4.getValue()
            r12.<init>(r1, r0)
            r3.invoke(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.a(n42):java.lang.Object");
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return this.d.getValue();
    }
}
