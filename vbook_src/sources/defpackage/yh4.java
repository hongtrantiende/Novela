package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yh4  reason: default package */
/* loaded from: classes.dex */
public final class yh4 {
    public final xk0 a;
    public final bl0 b;
    public yk0 c;
    public final int d;

    public yh4(zk0 zk0Var, bl0 bl0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = bl0Var;
        this.d = i;
        this.a = new xk0(zk0Var, j, j2, j3, j4, j5);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(s94 s94Var, long j, fr2 fr2Var) {
        if (j == s94Var.getPosition()) {
            return 0;
        }
        fr2Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r28, defpackage.fr2 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            yk0 r3 = r0.c
            r3.getClass()
            long r4 = r3.f
            long r6 = r3.g
            long r8 = r3.h
            long r6 = r6 - r4
            int r10 = r0.d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            bl0 r10 = r0.b
            if (r6 > 0) goto L26
            r0.c = r7
            r10.f()
            int r0 = c(r1, r4, r2)
            return r0
        L26:
            long r4 = r1.getPosition()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc7
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc7
            int r4 = (int) r4
            r1.q(r4)
            r1.p()
            long r4 = r3.b
            al0 r4 = r10.a(r1, r4)
            int r5 = r4.a
            r15 = r11
            long r11 = r4.b
            r17 = r13
            long r13 = r4.c
            r4 = -3
            if (r5 == r4) goto Lbd
            r4 = -2
            if (r5 == r4) goto L9c
            r4 = -1
            if (r5 == r4) goto L7d
            if (r5 != 0) goto L76
            long r3 = r1.getPosition()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6c
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6c
            int r3 = (int) r3
            r1.q(r3)
        L6c:
            r0.c = r7
            r10.f()
            int r0 = c(r1, r13, r2)
            return r0
        L76:
            java.lang.String r0 = "Invalid case"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L7d:
            r3.e = r11
            r3.g = r13
            long r4 = r3.b
            long r6 = r3.d
            long r8 = r3.f
            r15 = r4
            long r4 = r3.c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = defpackage.yk0.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        L9c:
            r4 = r11
            r6 = r13
            r3.d = r4
            r3.f = r6
            long r8 = r3.b
            long r10 = r3.e
            long r12 = r3.g
            long r14 = r3.c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = defpackage.yk0.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        Lbd:
            r0.c = r7
            r10.f()
            int r0 = c(r1, r8, r2)
            return r0
        Lc7:
            int r0 = c(r1, r8, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh4.b(s94, fr2):int");
    }

    public final void d(long j) {
        yk0 yk0Var = this.c;
        if (yk0Var != null && yk0Var.a == j) {
            return;
        }
        xk0 xk0Var = this.a;
        this.c = new yk0(j, xk0Var.a.g(j), xk0Var.c, xk0Var.d, xk0Var.e, xk0Var.f);
    }
}
