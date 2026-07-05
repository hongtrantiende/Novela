package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af5  reason: default package */
/* loaded from: classes3.dex */
public interface af5 extends m82, Closeable {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r11 == r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object n0(defpackage.b98 r9, defpackage.oe4 r10, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ze5
            if (r0 == 0) goto L13
            r0 = r11
            ze5 r0 = (defpackage.ze5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ze5 r0 = new ze5
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            return r11
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r4
        L31:
            oe4 r10 = r0.a
            defpackage.hre.r(r11)
            goto L7a
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r11 = r10.f
            w26 r11 = (defpackage.w26) r11
            r0.a = r10
            r0.d = r3
            i82 r1 = defpackage.hf5.a
            y26 r1 = new y26
            r1.<init>(r11)
            d82 r11 = r9.D
            d82 r11 = r11.plus(r1)
            i82 r6 = defpackage.hf5.a
            d82 r11 = r11.plus(r6)
            d82 r6 = r0.getContext()
            r0f r7 = defpackage.r0f.I
            b82 r6 = r6.get(r7)
            w26 r6 = (defpackage.w26) r6
            if (r6 != 0) goto L64
            goto L77
        L64:
            lv0 r7 = new lv0
            r8 = 6
            r7.<init>(r1, r8)
            kb3 r6 = r6.invokeOnCompletion(r3, r3, r7)
            lv0 r7 = new lv0
            r8 = 5
            r7.<init>(r6, r8)
            r1.invokeOnCompletion(r7)
        L77:
            if (r11 != r5) goto L7a
            goto L98
        L7a:
            d82 r11 = (defpackage.d82) r11
            pa6 r1 = new pa6
            r1.<init>(r11)
            d82 r11 = r11.plus(r1)
            c95 r1 = new c95
            r1.<init>(r9, r10, r4, r3)
            hz2 r9 = defpackage.z87.s(r9, r11, r1, r2)
            r0.a = r4
            r0.d = r2
            java.lang.Object r9 = r9.r(r0)
            if (r9 != r5) goto L99
        L98:
            return r5
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af5.n0(b98, oe4, n42):java.lang.Object");
    }
}
