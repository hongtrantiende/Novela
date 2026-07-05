package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yd  reason: default package */
/* loaded from: classes.dex */
public abstract class yd {
    public static final y4 a = new y4(9);
    public static final pq2 b = new pq2(new ox9(15));

    public static final jt2 a(xt4 xt4Var) {
        dj3 dj3Var = new dj3();
        xt4Var.invoke(dj3Var);
        float[] fArr = dj3Var.b;
        ArrayList arrayList = dj3Var.a;
        int size = arrayList.size();
        fArr.getClass();
        sue.m(size, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
        copyOfRange.getClass();
        return new jt2(arrayList, copyOfRange);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.vt4 r4, defpackage.lu4 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.rd
            if (r0 == 0) goto L13
            r0 = r6
            rd r0 = (defpackage.rd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            rd r0 = new rd
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)     // Catch: defpackage.ld -> L3f
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r6)
            wd r6 = new wd     // Catch: defpackage.ld -> L3f
            r6.<init>(r4, r5, r2, r3)     // Catch: defpackage.ld -> L3f
            r0.b = r3     // Catch: defpackage.ld -> L3f
            java.lang.Object r4 = defpackage.k27.p(r6, r0)     // Catch: defpackage.ld -> L3f
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3f
            return r5
        L3f:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd.b(vt4, lu4, n42):java.lang.Object");
    }

    public static final Object c(qe qeVar, aab aabVar) {
        xd xdVar = new xd(4, null);
        Object a2 = qeVar.a(ah3.b, jw7.a, xdVar, aabVar);
        if (a2 == n82.a) {
            return a2;
        }
        return pvc.a;
    }
}
