package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ia6  reason: default package */
/* loaded from: classes3.dex */
public final class ia6 implements tj4 {
    public int a;
    public final /* synthetic */ f31 b;
    public final /* synthetic */ x36 c;
    public final /* synthetic */ ka6 d;
    public final /* synthetic */ s76 e;
    public final /* synthetic */ Charset f;

    public ia6(f31 f31Var, x36 x36Var, ka6 ka6Var, s76 s76Var, Charset charset) {
        this.b = f31Var;
        this.c = x36Var;
        this.d = ka6Var;
        this.e = s76Var;
        this.f = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (defpackage.gae.q(r2, r8, r8.length, r0) == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r2.c(r0) != r7) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    @Override // defpackage.tj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10, defpackage.m42 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ha6
            if (r0 == 0) goto L13
            r0 = r11
            ha6 r0 = (defpackage.ha6) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ha6 r0 = new ha6
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            f31 r2 = r9.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.hre.r(r11)
            goto La0
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r6
        L37:
            int r9 = r0.f
            int r10 = r0.e
            defpackage.hre.r(r11)
            goto L91
        L3f:
            int r10 = r0.f
            int r1 = r0.e
            java.lang.Object r5 = r0.d
            defpackage.hre.r(r11)
            r11 = r10
            r10 = r5
            goto L6d
        L4b:
            defpackage.hre.r(r11)
            int r1 = r9.a
            int r11 = r1 + 1
            r9.a = r11
            if (r1 < 0) goto La3
            r11 = 0
            if (r1 <= 0) goto L6d
            x36 r8 = r9.c
            byte[] r8 = r8.c
            r0.d = r10
            r0.e = r1
            r0.f = r11
            r0.b = r5
            int r5 = r8.length
            java.lang.Object r5 = defpackage.gae.q(r2, r8, r5, r0)
            if (r5 != r7) goto L6d
            goto L9f
        L6d:
            ka6 r5 = r9.d
            r36 r5 = r5.a
            s76 r8 = r9.e
            s76 r8 = (defpackage.s76) r8
            java.lang.String r10 = r5.b(r8, r10)
            java.nio.charset.Charset r9 = r9.f
            byte[] r9 = defpackage.fre.t(r10, r9)
            r0.d = r6
            r0.e = r1
            r0.f = r11
            r0.b = r4
            int r10 = r9.length
            java.lang.Object r9 = defpackage.gae.q(r2, r9, r10, r0)
            if (r9 != r7) goto L8f
            goto L9f
        L8f:
            r9 = r11
            r10 = r1
        L91:
            r0.d = r6
            r0.e = r10
            r0.f = r9
            r0.b = r3
            java.lang.Object r9 = r2.c(r0)
            if (r9 != r7) goto La0
        L9f:
            return r7
        La0:
            pvc r9 = defpackage.pvc.a
            return r9
        La3:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "Index overflow has happened"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia6.b(java.lang.Object, m42):java.lang.Object");
    }
}
