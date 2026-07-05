package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m11  reason: default package */
/* loaded from: classes3.dex */
public final class m11 {
    public final s11 a;
    public final d31 b;
    public final f31 c;
    public final long d;
    public final psa e;
    public final int[] f;
    public final ly0 g;
    public long h;
    public int i;

    /* JADX WARN: Type inference failed for: r3v4, types: [ly0, java.lang.Object] */
    public m11(s11 s11Var, d31 d31Var, f31 f31Var, long j) {
        s11Var.getClass();
        d31Var.getClass();
        f31Var.getClass();
        this.a = s11Var;
        this.b = d31Var;
        this.c = f31Var;
        this.d = j;
        byte[] bArr = d31Var.a;
        if (bArr.length > 0) {
            this.e = s11Var.h();
            int[] iArr = new int[bArr.length];
            int length = bArr.length;
            int i = 0;
            for (int i2 = 1; i2 < length; i2++) {
                while (i > 0 && d31Var.a(i2) != d31Var.a(i)) {
                    i = iArr[i - 1];
                }
                if (d31Var.a(i2) == d31Var.a(i)) {
                    i++;
                }
                iArr[i2] = i;
            }
            this.f = iArr;
            this.g = new Object();
            return;
        }
        vs.m("Empty match string not permitted for scanning");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r13 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (defpackage.nae.m(r1, r0) == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:19:0x003f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.j11
            if (r0 == 0) goto L13
            r0 = r13
            j11 r0 = (defpackage.j11) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            j11 r0 = new j11
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 3
            r4 = 2
            r5 = 1
            psa r6 = r12.e
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L31
            defpackage.hre.r(r13)
            return r2
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            r12 = 0
            return r12
        L38:
            defpackage.hre.r(r13)
            goto L52
        L3c:
            defpackage.hre.r(r13)
        L3f:
            boolean r13 = r6.k()
            if (r13 == 0) goto L5a
            r0.c = r5
            r11 r13 = defpackage.s11.a
            s11 r13 = r12.a
            java.lang.Object r13 = r13.e(r5, r0)
            if (r13 != r7) goto L52
            goto Lae
        L52:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Laf
        L5a:
            d31 r13 = r12.b
            r1 = 0
            byte r13 = r13.a(r1)
            r8 = 0
            r1 = 6
            long r8 = defpackage.pbe.k(r6, r13, r8, r1)
            r10 = -1
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            f31 r1 = r12.c
            if (r13 != 0) goto L91
            r6.getClass()
            r13 = r6
            ly0 r13 = (defpackage.ly0) r13
            long r8 = r13.c
            r12.b(r8)
            long r8 = r12.h
            zma r10 = r1.f()
            long r10 = r13.V(r10)
            long r10 = r10 + r8
            r12.h = r10
            r0.c = r4
            java.lang.Object r13 = defpackage.nae.m(r1, r0)
            if (r13 != r7) goto L3f
            goto Lae
        L91:
            r12.b(r8)
            long r4 = r12.h
            zma r13 = r1.f()
            r13.getClass()
            ly0 r13 = (defpackage.ly0) r13
            long r8 = r6.M(r13, r8)
            long r8 = r8 + r4
            r12.h = r8
            r0.c = r3
            java.lang.Object r12 = defpackage.nae.m(r1, r0)
            if (r12 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m11.a(n42):java.lang.Object");
    }

    public final void b(long j) {
        long j2 = this.h + j;
        long j3 = this.d;
        if (j2 <= j3) {
            return;
        }
        StringBuilder o = rs8.o(j3, "Limit of ", " bytes exceeded while searching for \"");
        d31 d31Var = this.b;
        d31Var.getClass();
        o.append(r4b.N(r4b.F(d31Var.a), false, "\n", "\\n"));
        o.append('\"');
        throw new IOException(o.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r14 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
        if (r14 != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003f -> B:27:0x005b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:22:0x004f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m11.c(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r11 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r1.c(r0) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        if (a(r0) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
        if (r11 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d8 -> B:43:0x00db). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m11.d(boolean, n42):java.lang.Object");
    }
}
