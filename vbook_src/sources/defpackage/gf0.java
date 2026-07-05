package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gf0  reason: default package */
/* loaded from: classes.dex */
public final class gf0 {
    public final long a;
    public final long b;
    public final long c;
    public final af0 d;
    public final float e;
    public final float f;
    public final float g;
    public final ws2 h;
    public final mu4 i;
    public final vt4 j;
    public Iterator k;

    public gf0(long j, long j2, long j3, af0 af0Var, float f, float f2, float f3, ws2 ws2Var, mu4 mu4Var, vt4 vt4Var) {
        ws2Var.getClass();
        mu4Var.getClass();
        vt4Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = af0Var;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = ws2Var;
        this.i = mu4Var;
        this.j = vt4Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:16:0x0033). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0060 -> B:30:0x0063). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gab r9, defpackage.n42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bf0
            if (r0 == 0) goto L13
            r0 = r10
            bf0 r0 = (defpackage.bf0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bf0 r0 = new bf0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            gab r9 = r0.a
            defpackage.hre.r(r10)
            goto L63
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L2e:
            defpackage.hre.r(r10)
        L31:
            java.util.Iterator r10 = r8.k
        L33:
            if (r10 == 0) goto L54
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L3c
            goto L54
        L3c:
            java.lang.Object r10 = r10.next()
            r1 = r10
            z09 r1 = (defpackage.z09) r1
            long r4 = r1.a
            long r6 = r8.a
            boolean r1 = defpackage.y09.a(r4, r6)
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r10 = r2
        L4f:
            z09 r10 = (defpackage.z09) r10
            if (r10 == 0) goto L31
            return r10
        L54:
            r0.a = r9
            r0.d = r3
            s09 r10 = defpackage.s09.a
            java.lang.Object r10 = r9.j(r10, r0)
            n82 r1 = defpackage.n82.a
            if (r10 != r1) goto L63
            return r1
        L63:
            r09 r10 = (defpackage.r09) r10
            java.util.List r10 = r10.a
            java.util.Iterator r10 = r10.iterator()
            r8.k = r10
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf0.a(gab, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, mce] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gab r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cf0
            if (r0 == 0) goto L13
            r0 = r9
            cf0 r0 = (defpackage.cf0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cf0 r0 = new cf0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r9)
            goto L3a
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L2c:
            defpackage.hre.r(r9)
            r0.c = r3
            java.lang.Object r9 = r7.c(r8, r0)
            n82 r8 = defpackage.n82.a
            if (r9 != r8) goto L3a
            return r8
        L3a:
            z09 r9 = (defpackage.z09) r9
            if (r9 != 0) goto L41
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L41:
            r9.a()
            long r8 = r9.c
            ye0 r0 = new ye0
            float r1 = r7.d(r8)
            af0 r4 = r7.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5d
            if (r4 != r3) goto L59
            xe0 r2 = defpackage.xe0.b
            goto L5f
        L59:
            defpackage.xk5.o()
            return r2
        L5d:
            xe0 r2 = defpackage.xe0.a
        L5f:
            r4 = 32
            long r4 = r8 >> r4
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r5
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r0.<init>(r1, r2, r4, r8)
            ws2 r7 = r7.h
            r7.getClass()
            java.util.Set r8 = r7.a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            we0 r8 = defpackage.bce.j(r8)
            if (r8 != 0) goto L87
            r3 = 0
            goto L90
        L87:
            mce r9 = new mce
            r9.<init>()
            r9.a = r8
            r7.b = r9
        L90:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf0.b(gab, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (java.lang.Float.intBitsToFloat(r1) < (java.lang.Float.intBitsToFloat(r5) - r6)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
        if (java.lang.Float.intBitsToFloat(r1) > (java.lang.Float.intBitsToFloat(r5) + r6)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
        return r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:18:0x003e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.gab r13, defpackage.n42 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.df0
            if (r0 == 0) goto L13
            r0 = r14
            df0 r0 = (defpackage.df0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            df0 r0 = new df0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            gab r13 = r0.a
            defpackage.hre.r(r14)
            goto L3e
        L28:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r2
        L2e:
            defpackage.hre.r(r14)
        L31:
            r0.a = r13
            r0.d = r3
            java.lang.Object r14 = r12.a(r13, r0)
            n82 r1 = defpackage.n82.a
            if (r14 != r1) goto L3e
            return r1
        L3e:
            z09 r14 = (defpackage.z09) r14
            long r4 = r14.c
            boolean r1 = r14.d
            if (r1 == 0) goto Lc3
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r4 & r6
            int r1 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r1)
            long r9 = r12.b
            long r6 = r6 & r9
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r11 = r12.e
            float r7 = r7 - r11
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto Lc3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r11
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L6f
            goto Lc3
        L6f:
            af0 r1 = r12.d
            int r1 = r1.ordinal()
            float r6 = r12.f
            r7 = 32
            if (r1 == 0) goto La2
            if (r1 != r3) goto L9e
            long r4 = r4 >> r7
            int r1 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r1)
            long r7 = r9 >> r7
            int r5 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r5)
            float r7 = r7 + r11
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L90
            goto Lc3
        L90:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r4 = java.lang.Float.intBitsToFloat(r5)
            float r4 = r4 - r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L31
            goto Lc2
        L9e:
            defpackage.xk5.o()
            return r2
        La2:
            long r4 = r4 >> r7
            int r1 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r1)
            long r7 = r9 >> r7
            int r5 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r5)
            float r7 = r7 - r11
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto Lb5
            goto Lc3
        Lb5:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r4 = java.lang.Float.intBitsToFloat(r5)
            float r4 = r4 + r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L31
        Lc2:
            return r14
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf0.c(gab, n42):java.lang.Object");
    }

    public final float d(long j) {
        float intBitsToFloat;
        float f;
        int ordinal = this.d.ordinal();
        float f2 = this.f;
        long j2 = this.b;
        if (ordinal != 0) {
            if (ordinal == 1) {
                f = Float.intBitsToFloat((int) (j2 >> 32)) - f2;
                intBitsToFloat = f - Float.intBitsToFloat((int) (j >> 32));
            } else {
                xk5.o();
                return nae.e;
            }
        } else {
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32)) + f2;
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - intBitsToFloat2;
            f = ((int) (this.c >> 32)) - intBitsToFloat2;
        }
        return dce.m(intBitsToFloat / f, nae.e, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r8 == r5) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.gab r7, defpackage.hh0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ef0
            if (r0 == 0) goto L13
            r0 = r8
            ef0 r0 = (defpackage.ef0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ef0 r0 = new ef0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            gab r7 = r0.a
            defpackage.hre.r(r8)
            goto L45
        L37:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 != r5) goto L45
            goto L57
        L45:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L59
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.f(r7, r0)
            if (r6 != r5) goto L58
        L57:
            return r5
        L58:
            return r6
        L59:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf0.e(gab, hh0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004a -> B:19:0x004f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.gab r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf0.f(gab, n42):java.lang.Object");
    }
}
