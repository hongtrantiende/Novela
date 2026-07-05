package defpackage;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v9e  reason: default package */
/* loaded from: classes3.dex */
public abstract class v9e {
    public static final tu1 a;
    public static final tu1 b;
    public static final byte[] c;

    static {
        new tu1(new ov1(14), false, 927470173);
        a = new tu1(new wu1(23), false, 1672729776);
        b = new tu1(new wu1(24), false, -1673747791);
        c = new byte[0];
    }

    public static final sl4 A(s02 s02Var, d82 d82Var) {
        d82Var.getClass();
        return new sl4(s02Var, d82Var, 1);
    }

    public static final sl4 B(s02 s02Var, d82 d82Var) {
        d82Var.getClass();
        return new sl4(s02Var, d82Var, 2);
    }

    public static final akc C(akc akcVar, akc akcVar2) {
        float f;
        float f2;
        long j;
        long j2;
        akc akcVar3;
        akcVar.getClass();
        float f3 = akcVar.c;
        long j3 = akcVar.a;
        long j4 = akcVar.e;
        akcVar2.getClass();
        float f4 = akcVar2.c;
        long j5 = akcVar2.e;
        long j6 = akcVar2.a;
        long j7 = akcVar.d;
        long j8 = akcVar2.d;
        if (!dkc.a(j7, j8)) {
            int i = lz9.c;
            f = f3;
            if (!lz9.a(j3, mz9.b()) && !lz9.a(j6, mz9.b())) {
                StringBuilder sb = new StringBuilder("When both this and other TransformCompat's scale are not empty, their scaleOrigin must be the same: this.scaleOrigin=");
                sb.append((Object) dkc.b(j7));
                p1a.m(sb, ", other.scaleOrigin=", dkc.b(j8));
                return null;
            }
        } else {
            f = f3;
        }
        if (!dkc.a(j4, j5) && f != nae.e && f4 != nae.e) {
            StringBuilder sb2 = new StringBuilder("When both this and other TransformCompat's rotation are not zero, their rotationOrigin must be the same: this.rotationOrigin=");
            sb2.append((Object) dkc.b(j4));
            p1a.m(sb2, ", other.rotationOrigin=", dkc.b(j5));
            return null;
        }
        if (!dkc.a(j7, j8)) {
            int i2 = lz9.c;
            f2 = 0.0f;
            j = j3;
            if (!lz9.a(j6, mz9.b())) {
                j2 = j8;
                if (dkc.a(j4, j5) && f4 != f2) {
                    akcVar3 = akcVar2;
                } else {
                    akcVar3 = akcVar;
                }
                long j9 = akcVar3.e;
                long a2 = mz9.a(lz9.b(j) / lz9.b(j6), lz9.c(j) / lz9.c(j6));
                return new akc(a2, z78.d(akcVar.b, mue.s(akcVar2.b, a2)), f - f4, j2, j9);
            }
        } else {
            f2 = 0.0f;
            j = j3;
        }
        j2 = j7;
        if (dkc.a(j4, j5)) {
        }
        akcVar3 = akcVar;
        long j92 = akcVar3.e;
        long a22 = mz9.a(lz9.b(j) / lz9.b(j6), lz9.c(j) / lz9.c(j6));
        return new akc(a22, z78.d(akcVar.b, mue.s(akcVar2.b, a22)), f - f4, j2, j92);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable D(defpackage.s11 r4, int r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.a21
            if (r0 == 0) goto L13
            r0 = r6
            a21 r0 = (defpackage.a21) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            a21 r0 = new a21
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            int r5 = r0.b
            s11 r4 = r0.a
            defpackage.hre.r(r6)
            goto L49
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L30:
            defpackage.hre.r(r6)
            boolean r6 = r4.i()
            if (r6 == 0) goto L3a
            goto L51
        L3a:
            r0.a = r4
            r0.b = r5
            r0.d = r2
            java.lang.Object r6 = r4.e(r5, r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L49
            return r0
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L52
        L51:
            return r3
        L52:
            ly0 r4 = r4.h()
            wj9 r4 = r4.peek()
            byte[] r4 = defpackage.pbe.m(r4, r5)
            d31 r5 = new d31
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.D(s11, int, n42):java.lang.Comparable");
    }

    public static final akc E(akc akcVar, akc akcVar2) {
        float f;
        float f2;
        long j;
        long j2;
        akc akcVar3;
        akcVar.getClass();
        float f3 = akcVar.c;
        long j3 = akcVar.a;
        long j4 = akcVar.e;
        akcVar2.getClass();
        float f4 = akcVar2.c;
        long j5 = akcVar2.e;
        long j6 = akcVar2.a;
        long j7 = akcVar.d;
        long j8 = akcVar2.d;
        if (!dkc.a(j7, j8)) {
            int i = lz9.c;
            f = f3;
            if (!lz9.a(j3, mz9.b()) && !lz9.a(j6, mz9.b())) {
                StringBuilder sb = new StringBuilder("When both this and other TransformCompat's scale are not empty, their scaleOrigin must be the same: this.scaleOrigin=");
                sb.append((Object) dkc.b(j7));
                p1a.m(sb, ", other.scaleOrigin=", dkc.b(j8));
                return null;
            }
        } else {
            f = f3;
        }
        if (!dkc.a(j4, j5) && f != nae.e && f4 != nae.e) {
            StringBuilder sb2 = new StringBuilder("When both this and other TransformCompat's rotation are not zero, their rotationOrigin must be the same: this.rotationOrigin=");
            sb2.append((Object) dkc.b(j4));
            p1a.m(sb2, ", other.rotationOrigin=", dkc.b(j5));
            return null;
        }
        if (!dkc.a(j7, j8)) {
            int i2 = lz9.c;
            f2 = 0.0f;
            j = j3;
            if (!lz9.a(j6, mz9.b())) {
                j2 = j8;
                if (dkc.a(j4, j5) && f4 != f2) {
                    akcVar3 = akcVar2;
                } else {
                    akcVar3 = akcVar;
                }
                return new akc(mz9.a(lz9.b(j6) * lz9.b(j), lz9.c(j6) * lz9.c(j)), z78.e(mue.s(akcVar.b, j6), akcVar2.b), f + f4, j2, akcVar3.e);
            }
        } else {
            f2 = 0.0f;
            j = j3;
        }
        j2 = j7;
        if (dkc.a(j4, j5)) {
        }
        akcVar3 = akcVar;
        return new akc(mz9.a(lz9.b(j6) * lz9.b(j), lz9.c(j6) * lz9.c(j)), z78.e(mue.s(akcVar.b, j6), akcVar2.b), f + f4, j2, akcVar3.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.s11 r4, byte[] r5, int r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.b21
            if (r0 == 0) goto L13
            r0 = r7
            b21 r0 = (defpackage.b21) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            b21 r0 = new b21
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.e
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2c
            int r6 = r0.c
            byte[] r5 = r0.b
            s11 r4 = r0.a
            defpackage.hre.r(r7)
            goto L5d
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L33:
            defpackage.hre.r(r7)
            boolean r7 = r4.i()
            if (r7 == 0) goto L42
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L42:
            ly0 r7 = r4.h()
            boolean r7 = r7.k()
            if (r7 == 0) goto L5d
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.e = r3
            java.lang.Object r7 = r4.e(r3, r0)
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L5d
            return r0
        L5d:
            boolean r7 = r4.i()
            if (r7 == 0) goto L69
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L69:
            ly0 r4 = r4.h()
            r4.getClass()
            r5.getClass()
            r7 = 0
            int r4 = r4.q(r5, r7, r6)
            if (r4 != r2) goto L7b
            goto L7c
        L7b:
            r7 = r4
        L7c:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.F(s11, byte[], int, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.s11 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.c21
            if (r0 == 0) goto L13
            r0 = r5
            c21 r0 = (defpackage.c21) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            c21 r0 = new c21
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            ly0 r4 = r0.b
            s11 r1 = r0.a
            defpackage.hre.r(r5)
            r5 = r4
            r4 = r1
            goto L3a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r5)
            ly0 r5 = new ly0
            r5.<init>()
        L3a:
            boolean r1 = r4.i()
            if (r1 != 0) goto L56
            ly0 r1 = r4.h()
            r5.D0(r1)
            r0.a = r4
            r0.b = r5
            r0.d = r2
            java.lang.Object r1 = r4.e(r2, r0)
            n82 r3 = defpackage.n82.a
            if (r1 != r3) goto L3a
            return r3
        L56:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L5d
            return r5
        L5d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.G(s11, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:24:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:23:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.s11 r10, int r11, defpackage.n42 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.d21
            if (r0 == 0) goto L13
            r0 = r12
            d21 r0 = (defpackage.d21) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            d21 r0 = new d21
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r10 = r0.c
            ly0 r11 = r0.b
            s11 r1 = r0.a
            defpackage.hre.r(r12)
            goto L61
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L32:
            defpackage.hre.r(r12)
            ly0 r12 = new ly0
            r12.<init>()
            r9 = r12
            r12 = r11
            r11 = r9
        L3d:
            long r3 = r11.c
            long r5 = (long) r12
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L93
            ly0 r1 = r10.h()
            boolean r1 = r1.k()
            if (r1 == 0) goto L63
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.e = r2
            java.lang.Object r1 = r10.e(r2, r0)
            n82 r3 = defpackage.n82.a
            if (r1 != r3) goto L5f
            return r3
        L5f:
            r1 = r10
            r10 = r12
        L61:
            r12 = r10
            r10 = r1
        L63:
            boolean r1 = r10.i()
            if (r1 != 0) goto L93
            ly0 r1 = r10.h()
            long r3 = defpackage.cae.u(r1)
            long r5 = (long) r12
            long r7 = r11.c
            long r7 = r5 - r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L85
            ly0 r1 = r10.h()
            long r3 = r11.c
            long r5 = r5 - r3
            r1.C(r11, r5)
            goto L3d
        L85:
            ly0 r1 = r10.h()
            long r3 = r1.V(r11)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            goto L3d
        L93:
            long r0 = r11.c
            long r2 = (long) r12
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L9b
            return r11
        L9b:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r12 = defpackage.hl5.s(r0, r1, r12)
            long r0 = r11.c
            java.lang.String r11 = " available"
            java.lang.String r11 = defpackage.hl5.q(r12, r0, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.H(s11, int, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Type inference failed for: r0v2, types: [f21] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r13v3, types: [hh9, zma] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.s11 r10, long r11, defpackage.n42 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.f21
            if (r0 == 0) goto L13
            r0 = r13
            f21 r0 = (defpackage.f21) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            f21 r0 = new f21
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            long r10 = r0.d
            long r3 = r0.c
            zma r12 = r0.b
            s11 r1 = r0.a
            defpackage.hre.r(r13)
            r13 = r12
            r11 = r10
            r10 = r1
            r8 = r3
            r3 = r0
            r0 = r8
            goto L44
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L3a:
            defpackage.hre.r(r13)
            ly0 r13 = new ly0
            r13.<init>()
            r3 = r0
            r0 = r11
        L44:
            boolean r4 = r10.i()
            if (r4 != 0) goto L90
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L90
            ly0 r6 = r10.h()
            long r6 = defpackage.cae.u(r6)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L74
            ly0 r4 = r10.h()
            long r4 = defpackage.cae.u(r4)
            long r4 = r11 - r4
            ly0 r11 = r10.h()
            long r11 = r11.V(r13)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r11)
            goto L7b
        L74:
            ly0 r6 = r10.h()
            r6.C(r13, r11)
        L7b:
            r3.a = r10
            r3.b = r13
            r3.c = r0
            r3.d = r4
            r3.f = r2
            java.lang.Object r11 = r10.e(r2, r3)
            n82 r12 = defpackage.n82.a
            if (r11 != r12) goto L8e
            return r12
        L8e:
            r11 = r4
            goto L44
        L90:
            ly0 r10 = r13.b()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.I(s11, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Type inference failed for: r0v2, types: [e21, n42] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zma] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(defpackage.s11 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.e21
            if (r0 == 0) goto L13
            r0 = r5
            e21 r0 = (defpackage.e21) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            e21 r0 = new e21
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            zma r4 = r0.b
            s11 r1 = r0.a
            defpackage.hre.r(r5)
            r5 = r4
            r4 = r1
            goto L3a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r5)
            ly0 r5 = new ly0
            r5.<init>()
        L3a:
            boolean r1 = r4.i()
            if (r1 != 0) goto L56
            ly0 r1 = r4.h()
            r5.D0(r1)
            r0.a = r4
            r0.b = r5
            r0.d = r2
            java.lang.Object r1 = r4.e(r2, r0)
            n82 r3 = defpackage.n82.a
            if (r1 != r3) goto L3a
            return r3
        L56:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L61
            ly0 r4 = r5.b()
            return r4
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.J(s11, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.s11 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.g21
            if (r0 == 0) goto L13
            r0 = r5
            g21 r0 = (defpackage.g21) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            g21 r0 = new g21
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            s11 r4 = r0.a
            defpackage.hre.r(r5)
            goto L3f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            r0.a = r4
            r0.c = r2
            r5 = 2
            java.lang.Object r5 = r(r4, r5, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L3f
            return r0
        L3f:
            ly0 r4 = r4.h()
            short r4 = r4.readShort()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.K(s11, n42):java.lang.Object");
    }

    public static byte[] L() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (t(r6, r7.a.length, r0) == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(defpackage.s11 r6, defpackage.d31 r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.i21
            if (r0 == 0) goto L13
            r0 = r8
            i21 r0 = (defpackage.i21) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            i21 r0 = new i21
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            d31 r7 = r0.b
            s11 r6 = r0.a
            defpackage.hre.r(r8)
            goto L4c
        L39:
            defpackage.hre.r(r8)
            byte[] r8 = r7.a
            int r8 = r8.length
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Comparable r8 = D(r6, r8, r0)
            if (r8 != r5) goto L4c
            goto L62
        L4c:
            boolean r8 = defpackage.c16.i(r8, r7)
            if (r8 == 0) goto L66
            byte[] r7 = r7.a
            int r7 = r7.length
            long r7 = (long) r7
            r0.a = r2
            r0.b = r2
            r0.d = r3
            java.lang.Object r6 = t(r6, r7, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L66:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.M(s11, d31, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable N(defpackage.s11 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.j21
            if (r0 == 0) goto L13
            r0 = r5
            j21 r0 = (defpackage.j21) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            j21 r0 = new j21
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.b = r2
            java.lang.Object r5 = G(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            ly0 r5 = (defpackage.ly0) r5
            long r0 = r5.c
            int r4 = (int) r0
            byte[] r4 = defpackage.pbe.m(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.N(s11, n42):java.io.Serializable");
    }

    public static final s02 O(pf9 pf9Var) {
        return new s02(new l(pf9Var, null, 25), 6);
    }

    public static final String P(akc akcVar) {
        akcVar.getClass();
        return "(" + mz9.d(akcVar.a) + ',' + mue.t(akcVar.b) + ',' + akcVar.c + ',' + ekc.c(akcVar.d) + ',' + ekc.c(akcVar.e) + ')';
    }

    public static i0f Q(yxe yxeVar) {
        bfe bfeVar = yxeVar.e;
        if (bfeVar instanceof gje) {
            return new r95((gje) bfeVar);
        }
        if (bfeVar instanceof bie) {
            return new jt1((bie) bfeVar);
        }
        if (bfeVar instanceof lwe) {
            return new jt1((lwe) bfeVar);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(bfeVar)));
    }

    public static void R(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            xk5.k(hl5.n("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        xk5.k("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static final void a(float f, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        boolean z2;
        wk3 wk3Var;
        long j;
        rv4Var.g0(-1372322797);
        if (rv4Var.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var, nq7Var2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(-217498458);
            for (int i4 = 1; i4 < 6; i4++) {
                if (i4 <= ((int) f)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    wk3Var = (wk3) ok3.A.getValue();
                } else {
                    wk3Var = (wk3) ok3.z.getValue();
                }
                ar5 c2 = rp5.c(wk3Var, rv4Var, 0);
                if (z2) {
                    rv4Var.e0(-217489218);
                    j = ((h27) rv4Var.j(j27.a)).a.a;
                } else {
                    rv4Var.e0(-217487961);
                    j = ((h27) rv4Var.j(j27.a)).a.s;
                }
                rv4Var.q(false);
                nk5.a(c2, null, pna.n(nq7Var2, 14.0f), j, rv4Var, 432, 0);
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yq0(f, nq7Var2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.cz7 r27, defpackage.rh8 r28, defpackage.bkd r29, java.lang.String r30, boolean r31, defpackage.nq7 r32, defpackage.rv4 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.b(cz7, rh8, bkd, java.lang.String, boolean, nq7, rv4, int, int):void");
    }

    public static final void c(int i, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        String A;
        String A2;
        rv4Var.g0(66994602);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            ar5 G = owe.G(rv4Var);
            if (z) {
                rv4Var.e0(-1323427725);
                A = yqe.A((y3b) o2b.M0.getValue(), rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1323353294);
                A = yqe.A((y3b) o2b.K0.getValue(), rv4Var);
                rv4Var.q(false);
            }
            if (z) {
                rv4Var.e0(-1323241849);
                A2 = yqe.A((y3b) o2b.N0.getValue(), rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1323155514);
                A2 = yqe.A((y3b) o2b.L0.getValue(), rv4Var);
                rv4Var.q(false);
            }
            jxe.d(G, A, A2, nq7Var.a0(pna.c), null, null, rv4Var, 0, 48);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new uq0(z, nq7Var, i, 0);
        }
    }

    public static final void d(tq0 tq0Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        float f;
        float f2;
        zx1 zx1Var;
        boolean z2;
        float f3;
        dz dzVar;
        lh9 lh9Var;
        int i6;
        wk3 wk3Var;
        rv4 rv4Var2 = rv4Var;
        mk0 mk0Var = kh5.G;
        rv4Var2.g0(-1010705114);
        if (rv4Var2.h(tq0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            bzc bzcVar = tq0Var.h;
            List<String> list = tq0Var.j;
            float f4 = tq0Var.k;
            String str = tq0Var.b;
            bzc bzcVar2 = tq0Var.h;
            boolean f5 = rv4Var2.f(bzcVar.f);
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (!f5 && P != lh9Var2) {
                f = f4;
            } else {
                List<String> list2 = bzcVar2.f;
                ArrayList arrayList = new ArrayList(tl1.s(list2, 10));
                for (String str2 : list2) {
                    arrayList.add(new zl1(kve.v(str2)));
                    f4 = f4;
                }
                f = f4;
                rv4Var2.o0(arrayList);
                P = arrayList;
            }
            List list3 = (List) P;
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 f6 = pna.f(kq7Var, 1.0f);
            dz dzVar2 = lz.a;
            gv9 a3 = ev9.a(dzVar2, mk0Var, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f6);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String str3 = bzcVar2.c;
            u22 u22Var = r0f.d;
            nq7 k = tte.k(pna.n(kq7Var, 30.0f), uu9.a);
            long j = r0f.y(rv4Var2).a;
            ba5 ba5Var = lre.g;
            float f7 = f;
            do5.a(str3, u22Var, false, null, null, null, nmd.v(k, j, ba5Var), null, rv4Var, 48, 892);
            xbe.i(rv4Var, pna.s(kq7Var, 10.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, we6Var);
            rv4Var.i0();
            if (rv4Var.S) {
                zx1Var = zx1Var2;
                rv4Var.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            zx1 zx1Var3 = zx1Var;
            ipe.g(bzcVar2.b, null, list3, zr1.q(16), 0L, new tlb(5), 0L, 0, false, 1, 0, r0f.A(rv4Var).h, rv4Var, 3072, 3072, 56818);
            xbe.i(rv4Var, pna.h(kq7Var, 2.0f));
            tc4.l(tq0Var.p, null, false, r0f.y(rv4Var).s, 0L, 0L, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).n, rv4Var, 0, 0, 131062);
            s21.x(rv4Var, true, kq7Var, 12.0f, rv4Var);
            rs8.u(rv4Var, true, kq7Var, 14.0f, rv4Var);
            nq7 g = a82.g(rv4Var, 7.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var).c), ba5Var);
            if ((i10 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var.P();
            if (z2 || P2 == lh9Var2) {
                P2 = new pa(2, vt4Var2);
                rv4Var.o0(P2);
            }
            nq7 y = zbe.y(lbe.f(15, (vt4) P2, g, null, false), 10.0f);
            gv9 a5 = ev9.a(dzVar2, mk0Var, rv4Var, 48);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, y);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            do5.d(str, tq0Var.d, tq0Var.f, u22Var, tte.k(pna.p(kq7Var, 48.0f, 72.0f), r0f.z(rv4Var).b), rv4Var, 3072);
            xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            we6 we6Var2 = new we6(f3, true);
            xn1 a6 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, we6Var2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a6);
            jce.F(npVar2, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p5);
            lh9 lh9Var3 = lh9Var2;
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var).i, rv4Var, 48, 24960, 109564);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            String str4 = tq0Var.c;
            if (k4b.j0(str4)) {
                str4 = tq0Var.e;
            }
            cvb.c(str4, pna.f(kq7Var, 1.0f), r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, r0f.A(rv4Var).n, rv4Var, 48, 24960, 109560);
            if (f7 > nae.e) {
                s21.w(rv4Var, 333663441, kq7Var, 6.0f, rv4Var);
                a(f7, null, rv4Var, 0);
                rv4Var.q(false);
            } else {
                rv4Var.e0(333790293);
                rv4Var.q(false);
            }
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var, 12.0f));
            cvb.c(tq0Var.g, pna.f(kq7Var, 1.0f), zl1.b(0.88f, r0f.y(rv4Var).q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 4, 0, null, r0f.A(rv4Var).j, rv4Var, 48, 24960, 109560);
            rv4 rv4Var3 = rv4Var;
            if (!list.isEmpty()) {
                s21.w(rv4Var3, -1955287242, kq7Var, 10.0f, rv4Var3);
                nq7 f8 = pna.f(kq7Var, 1.0f);
                dzVar = dzVar2;
                gv9 a7 = ev9.a(dzVar, kh5.F, rv4Var3, 0);
                int hashCode6 = Long.hashCode(rv4Var3.T);
                xt8 l6 = rv4Var3.l();
                nq7 p6 = lye.p(rv4Var3, f8);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var3);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, a7);
                jce.F(npVar2, rv4Var3, l6);
                s21.t(hashCode6, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p6);
                rv4Var3.e0(1708764907);
                for (String str5 : list) {
                    Object P3 = rv4Var3.P();
                    lh9 lh9Var4 = lh9Var3;
                    if (P3 == lh9Var4) {
                        P3 = new cd1(15);
                        rv4Var3.o0(P3);
                    }
                    ese.p(str5, null, 0L, null, (vt4) P3, rv4Var, 24576);
                    rv4Var3 = rv4Var;
                    xbe.i(rv4Var3, pna.s(kq7Var, 6.0f));
                    lh9Var3 = lh9Var4;
                }
                lh9Var = lh9Var3;
                i6 = 15;
                hl5.v(rv4Var3, false, true, false);
            } else {
                dzVar = dzVar2;
                lh9Var = lh9Var3;
                i6 = 15;
                rv4Var3.e0(-1954872090);
                rv4Var3.q(false);
            }
            nq7 f9 = hl5.f(kq7Var, 14.0f, rv4Var3, kq7Var, 1.0f);
            gv9 a8 = ev9.a(dzVar, mk0Var, rv4Var3, 48);
            int hashCode7 = Long.hashCode(rv4Var3.T);
            xt8 l7 = rv4Var3.l();
            nq7 p7 = lye.p(rv4Var3, f9);
            rw1.k.getClass();
            zx1 zx1Var4 = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var4);
            } else {
                rv4Var3.r0();
            }
            jce.F(qw1.f, rv4Var3, a8);
            jce.F(qw1.e, rv4Var3, l7);
            jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode7));
            jce.C(qw1.h, rv4Var3);
            jce.F(qw1.d, rv4Var3, p7);
            String valueOf2 = String.valueOf(tq0Var.l);
            if (tq0Var.m) {
                wk3Var = (wk3) rk3.l.getValue();
            } else {
                wk3Var = (wk3) rk3.k.getValue();
            }
            h(valueOf2, wk3Var, tq0Var.m, vt4Var, rv4Var3, (i10 << 3) & 7168);
            xbe.i(rv4Var3, pna.s(kq7Var, 8.0f));
            String valueOf3 = String.valueOf(tq0Var.n);
            wk3 wk3Var2 = (wk3) jk3.u.getValue();
            Object P4 = rv4Var3.P();
            if (P4 == lh9Var) {
                P4 = new cd1(i6);
                rv4Var3.o0(P4);
            }
            h(valueOf3, wk3Var2, false, (vt4) P4, rv4Var3, 3456);
            xbe.i(rv4Var3, new we6(1.0f, true));
            long j2 = tq0Var.o;
            tza tzaVar = j27.a;
            tc4.l(j2, null, false, ((h27) rv4Var3.j(tzaVar)).a.s, 0L, 0L, 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(tzaVar)).b.n, rv4Var, 0, 0, 131062);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(tq0Var, nq7Var, vt4Var, vt4Var2, i, 12);
        }
    }

    public static final void e(qr0 qr0Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4Var.g0(-1636860607);
        if ((i & 6) == 0) {
            if (rv4Var.f(qr0Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            obj = bkdVar;
            if (rv4Var.f(obj)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        } else {
            obj = bkdVar;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            obj2 = xt4Var2;
            if (rv4Var.h(obj2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        } else {
            obj2 = xt4Var2;
        }
        if ((100663296 & i) == 0) {
            obj3 = xt4Var3;
            if (rv4Var.h(obj3)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        } else {
            obj3 = xt4Var3;
        }
        int i12 = i2;
        if ((38347923 & i12) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i12 & 1, z)) {
            ya9 b2 = ra9.b(rv4Var);
            nk6 m = lre.m(rv4Var);
            int i13 = i12 >> 9;
            ej6.d(m, vt4Var2, rv4Var, i13 & 896);
            ra9.a(qr0Var.a, vt4Var, nq7Var, b2, null, jce.E(-245254648, new ld1(4, b2, qr0Var, rh8Var), rv4Var), false, nae.e, jce.E(1535211365, new cr0(m, rh8Var, obj, qr0Var, obj2, xt4Var, obj3, 0), rv4Var), rv4Var, (i13 & Token.ASSIGN_MOD) | 100859904 | ((i12 >> 3) & 896));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dr0(qr0Var, rh8Var, bkdVar, nq7Var, vt4Var, vt4Var2, xt4Var, xt4Var2, xt4Var3, i);
        }
    }

    public static final void f(rh8 rh8Var, bkd bkdVar, nq7 nq7Var, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(753638155);
        if ((i & 6) == 0) {
            obj = rh8Var;
            if (rv4Var.f(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            obj = rh8Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(bkdVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            bya byaVar = new bya(320.0f);
            nk6 m = lre.m(rv4Var);
            hz hzVar = new hz(6.0f, true, new vs(2));
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new nj0(10);
                rv4Var.o0(P);
            }
            pc2.e(byaVar, nq7Var, m, obj, 6.0f, hzVar, null, false, 0L, 0L, bkdVar, (xt4) P, rv4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | 102432768 | ((i2 << 9) & 7168), (i2 & Token.ASSIGN_MOD) | 384, 1680);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vq0(rh8Var, bkdVar, nq7Var, i, 0);
        }
    }

    public static final void g(int i, int i2, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        zx1 zx1Var;
        rv4Var.g0(651635603);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            if (i != 1) {
                if (i != 2) {
                    f = 0.7f;
                } else {
                    f = 0.62f;
                }
            } else {
                f = 0.78f;
            }
            if (i != 1) {
                if (i != 2) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.42f;
                }
            } else {
                f2 = 0.28f;
            }
            if (i != 1) {
                if (i != 2) {
                    f3 = 0.8f;
                } else {
                    f3 = 0.88f;
                }
            } else {
                f3 = 0.72f;
            }
            if (i != 1) {
                if (i != 2) {
                    f4 = 0.44f;
                } else {
                    f4 = 0.36f;
                }
            } else {
                f4 = 0.52f;
            }
            if (i != 1) {
                if (i != 2) {
                    f5 = 0.48f;
                } else {
                    f5 = 0.6f;
                }
            } else {
                f5 = 0.34f;
            }
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            float f6 = f5;
            nq7 f7 = pna.f(kq7Var, 1.0f);
            mk0 mk0Var = kh5.G;
            float f8 = f4;
            dz dzVar = lz.a;
            float f9 = f3;
            float f10 = f2;
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f7);
            rv4Var.i0();
            float f11 = f;
            if (rv4Var.S) {
                zx1Var = zx1Var2;
                rv4Var.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            nq7 n = pna.n(kq7Var, 30.0f);
            su9 su9Var = uu9.a;
            dpe.f(null, tte.k(n, su9Var), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.s(kq7Var, 10.0f));
            jv9 jv9Var = jv9.a;
            nq7 a4 = jv9Var.a(1.0f, kq7Var, true);
            xn1 a5 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, a4);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            dpe.g(pna.h(pna.s(kq7Var, 110.0f), 18.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            dpe.g(pna.h(pna.s(kq7Var, 72.0f), 12.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var, 14.0f));
            nq7 f12 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(f12, ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 7.0f), lre.g), 10.0f);
            gv9 a6 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, y);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a6);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            dpe.f(null, tte.k(pna.p(kq7Var, 48.0f, 72.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
            nq7 a7 = jv9Var.a(1.0f, kq7Var, true);
            xn1 a8 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, a7);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a8);
            jce.F(npVar2, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p5);
            dpe.g(pna.h(pna.f(kq7Var, f11), 16.0f), null, rv4Var, 0, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, f10), 12.0f), null, rv4Var, 0, 2);
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var, 12.0f));
            dpe.g(pna.h(pna.f(kq7Var, 1.0f), 14.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, f9), 14.0f), null, rv4Var, 0, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, f8), 14.0f), null, rv4Var, 0, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, f6), 14.0f), null, rv4Var, 0, 2);
            nq7 f13 = hl5.f(kq7Var, 14.0f, rv4Var, kq7Var, 1.0f);
            gv9 a9 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode6 = Long.hashCode(rv4Var.T);
            xt8 l6 = rv4Var.l();
            nq7 p6 = lye.p(rv4Var, f13);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a9);
            jce.F(npVar2, rv4Var, l6);
            s21.t(hashCode6, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p6);
            dpe.g(pna.h(pna.s(kq7Var, 62.0f), 30.0f), su9Var, rv4Var, 6, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            dpe.g(pna.h(pna.s(kq7Var, 62.0f), 30.0f), su9Var, rv4Var, 6, 0);
            i5 = 1;
            xbe.i(rv4Var, jv9Var.a(1.0f, kq7Var, true));
            dpe.g(pna.h(pna.s(kq7Var, 58.0f), 28.0f), su9Var, rv4Var, 6, 0);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            i5 = 1;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sh(i, i2, i5, nq7Var);
        }
    }

    public static final void h(String str, wk3 wk3Var, boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        boolean z2;
        long g;
        nq7 nq7Var;
        boolean z3;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-541199655);
        if ((i & 6) == 0) {
            obj = str;
            if (rv4Var2.f(obj)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            obj = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(wk3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            su9 su9Var = uu9.a;
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(kq7Var, su9Var);
            if (z) {
                rv4Var2.e0(428539116);
                g = zl1.b(0.14f, ((h27) rv4Var2.j(j27.a)).a.a);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(428637386);
                g = rm1.g(((h27) rv4Var2.j(j27.a)).a, 8.0f);
                rv4Var2.q(false);
            }
            nq7 v = nmd.v(k, g, lre.g);
            if (z) {
                rv4Var2.e0(428800849);
                nq7Var = st0.d(kq7Var, 1.0f, zl1.b(0.18f, ((h27) rv4Var2.j(j27.a)).a.a), su9Var);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(429046617);
                rv4Var2.q(false);
                nq7Var = kq7Var;
            }
            nq7 a0 = v.a0(nq7Var);
            if ((i7 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            if (z3 || P == ax1.a) {
                P = new pa(3, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 z4 = zbe.z(q1d.b(a0, false, 0.94f, (vt4) P, 1), 10.0f, 7.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z4);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c(wk3Var, rv4Var2, (i7 >> 3) & 14);
            if (z) {
                rv4Var2.e0(-69076484);
                j = ((h27) rv4Var2.j(j27.a)).a.a;
            } else {
                rv4Var2.e0(-69075227);
                j = ((h27) rv4Var2.j(j27.a)).a.s;
            }
            rv4Var2.q(false);
            nk5.a(c2, null, pna.n(kq7Var, 16.0f), j, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.m;
            if (z) {
                rv4Var2.e0(-69066372);
                j2 = ((h27) rv4Var2.j(tzaVar)).a.a;
            } else {
                rv4Var2.e0(-69065115);
                j2 = ((h27) rv4Var2.j(tzaVar)).a.s;
            }
            rv4Var2.q(false);
            cvb.c(obj, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, i7 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new xq0(str, wk3Var, z, vt4Var, i, 0);
        }
    }

    public static final void i(boolean z, pn1 pn1Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        float f;
        long j;
        rv4 rv4Var2 = rv4Var;
        String str = pn1Var.b;
        rv4Var2.g0(2142623335);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(pn1Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            String str2 = pn1Var.c;
            boolean f2 = rv4Var2.f(str);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (f2 || P == lh9Var) {
                zl1 zl1Var = new zl1(kve.v(str));
                rv4Var2.o0(zl1Var);
                P = zl1Var;
            }
            long j2 = ((zl1) P).a;
            boolean f3 = rv4Var2.f(str2);
            Object P2 = rv4Var2.P();
            if (f3 || P2 == lh9Var) {
                zl1 zl1Var2 = new zl1(kve.v(str2));
                rv4Var2.o0(zl1Var2);
                P2 = zl1Var2;
            }
            long j3 = ((zl1) P2).a;
            tza tzaVar = j27.a;
            nq7 k = tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.a);
            if (z) {
                f = 2.0f;
            } else {
                f = 1.5f;
            }
            if (z) {
                j = j2;
            } else {
                j = j3;
            }
            nq7 d = st0.d(k, f, j, ((h27) rv4Var2.j(tzaVar)).c.a);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, d);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            fca.c(384, j3, rv4Var2, pna.c, pn1Var.d);
            cvb.c("Aa", pu0.a.a(kq7.a, kh5.e), j2, null, zr1.q(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var, 24582, 0, 262120);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qd1(z, pn1Var, nq7Var, i, 5);
        }
    }

    public static final void j(r24 r24Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final ou4 ou4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z7;
        r24 r24Var2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        nq7 nq7Var;
        boolean z13;
        String A;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2107114642);
        if (rv4Var2.f(r24Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var2.g(z2)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i10 = i9 | i3;
        if (rv4Var2.g(z3)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i11 = i10 | i4;
        if (rv4Var2.g(z4)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i12 = i11 | i5;
        if (rv4Var2.g(z5)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i6;
        if (rv4Var2.g(z6)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (rv4Var2.h(ou4Var)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i15 = i14 | i8;
        if ((i15 & 4793475) != 4793474) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (rv4Var2.U(i15 & 1, z7)) {
            Object[] objArr = new Object[0];
            if ((458752 & i15) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z8 || P == lh9Var) {
                P = new g64(3, z5);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 0);
            Object[] objArr2 = new Object[0];
            if ((i15 & 896) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object P2 = rv4Var2.P();
            if (z9 || P2 == lh9Var) {
                P2 = new g64(4, z2);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var2, 0);
            Object[] objArr3 = new Object[0];
            if ((i15 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object P3 = rv4Var2.P();
            if (z10 || P3 == lh9Var) {
                P3 = new g64(5, z3);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var2, 0);
            Object[] objArr4 = new Object[0];
            if ((57344 & i15) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object P4 = rv4Var2.P();
            if (z11 || P4 == lh9Var) {
                P4 = new g64(6, z4);
                rv4Var2.o0(P4);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var2, 0);
            Object[] objArr5 = new Object[0];
            if ((3670016 & i15) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object P5 = rv4Var2.P();
            if (z12 || P5 == lh9Var) {
                P5 = new g64(7, z6);
                rv4Var2.o0(P5);
            }
            aw7 aw7Var5 = (aw7) zpe.k(objArr5, (vt4) P5, rv4Var2, 0);
            nq7 f = pna.f(sye.n(), 1.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 z14 = zbe.z(hl5.f(kq7Var, 12.0f, rv4Var2, kq7Var, 1.0f), 16.0f, 8.0f);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            String A2 = yqe.A((y3b) k3b.D.getValue(), rv4Var2);
            String A3 = yqe.A((y3b) k3b.E.getValue(), rv4Var2);
            boolean f2 = rv4Var2.f(aw7Var2);
            Object P6 = rv4Var2.P();
            if (!f2 && P6 != lh9Var) {
                nq7Var = z14;
            } else {
                nq7Var = z14;
                P6 = new ig7(aw7Var2, 2);
                rv4Var2.o0(P6);
            }
            l0e.i(A2, A3, nq7Var, false, booleanValue, (xt4) P6, rv4Var2, 384);
            nq7 z15 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
            boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
            String A4 = yqe.A((y3b) k3b.w.getValue(), rv4Var2);
            String A5 = yqe.A((y3b) k3b.x.getValue(), rv4Var2);
            boolean f3 = rv4Var2.f(aw7Var3);
            Object P7 = rv4Var2.P();
            if (f3 || P7 == lh9Var) {
                P7 = new d07(aw7Var3, 28);
                rv4Var2.o0(P7);
            }
            l0e.i(A4, A5, z15, false, booleanValue2, (xt4) P7, rv4Var2, 384);
            nq7 z16 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
            boolean booleanValue3 = ((Boolean) aw7Var4.getValue()).booleanValue();
            String A6 = yqe.A((y3b) k3b.r.getValue(), rv4Var2);
            String A7 = yqe.A((y3b) k3b.s.getValue(), rv4Var2);
            boolean f4 = rv4Var2.f(aw7Var4);
            Object P8 = rv4Var2.P();
            if (f4 || P8 == lh9Var) {
                P8 = new d07(aw7Var4, 29);
                rv4Var2.o0(P8);
            }
            l0e.i(A6, A7, z16, false, booleanValue3, (xt4) P8, rv4Var2, 384);
            nq7 z17 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
            boolean booleanValue4 = ((Boolean) aw7Var.getValue()).booleanValue();
            String A8 = yqe.A((y3b) k3b.B.getValue(), rv4Var2);
            String A9 = yqe.A((y3b) k3b.C.getValue(), rv4Var2);
            boolean f5 = rv4Var2.f(aw7Var);
            Object P9 = rv4Var2.P();
            if (f5 || P9 == lh9Var) {
                P9 = new ig7(aw7Var, 0);
                rv4Var2.o0(P9);
            }
            l0e.i(A8, A9, z17, false, booleanValue4, (xt4) P9, rv4Var2, 384);
            nq7 z18 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
            boolean booleanValue5 = ((Boolean) aw7Var5.getValue()).booleanValue();
            String A10 = yqe.A((y3b) k3b.p.getValue(), rv4Var2);
            String A11 = yqe.A((y3b) k3b.q.getValue(), rv4Var2);
            boolean f6 = rv4Var2.f(aw7Var5);
            Object P10 = rv4Var2.P();
            if (f6 || P10 == lh9Var) {
                P10 = new ig7(aw7Var5, 1);
                rv4Var2.o0(P10);
            }
            l0e.i(A10, A11, z18, false, booleanValue5, (xt4) P10, rv4Var2, 384);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            if (r24Var != null) {
                rv4Var2.e0(-1362770361);
                nq7 A12 = zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2);
                gv9 a3 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l2 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, A12);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar, rv4Var2, a3);
                jce.F(npVar2, rv4Var2, l2);
                s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar4, rv4Var2, p2);
                eg0.f(pna.n(kq7Var, 28.0f), 0L, null, rv4Var, 6, 6);
                xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
                r24Var2 = r24Var;
                int ordinal = r24Var2.a.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        rv4Var.e0(1990495230);
                                        A = yqe.A((y3b) k3b.Q.getValue(), rv4Var);
                                        rv4Var.q(false);
                                    } else {
                                        throw rs8.b(1990463787, rv4Var, false);
                                    }
                                } else {
                                    rv4Var.e0(1990491581);
                                    A = yqe.A((y3b) k3b.P.getValue(), rv4Var);
                                    rv4Var.q(false);
                                }
                            } else {
                                rv4Var.e0(1990487934);
                                A = yqe.A((y3b) k3b.W.getValue(), rv4Var);
                                rv4Var.q(false);
                            }
                        } else {
                            rv4Var.e0(1990478674);
                            A = yqe.B(k3b.c(), new Object[]{yqe.A((y3b) k3b.X.getValue(), rv4Var), Integer.valueOf(r24Var2.a())}, rv4Var);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(1990469236);
                        A = yqe.B(k3b.c(), new Object[]{yqe.A((y3b) k3b.S.getValue(), rv4Var), Integer.valueOf(r24Var2.a())}, rv4Var);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.e0(1990465374);
                    A = yqe.A(k3b.d(), rv4Var);
                    rv4Var.q(false);
                }
                cvb.c(A, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.j, rv4Var, 0, 0, 131070);
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                r24Var2 = r24Var;
                rv4Var2.e0(-1361211743);
                ar5 c2 = rp5.c((wk3) rk3.h.getValue(), rv4Var2, 0);
                String A13 = yqe.A((y3b) b3b.r0.getValue(), rv4Var2);
                nq7 A14 = zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2);
                if ((i15 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean f7 = z13 | rv4Var2.f(aw7Var) | rv4Var2.f(aw7Var2) | rv4Var2.f(aw7Var3) | rv4Var2.f(aw7Var4) | rv4Var2.f(aw7Var5);
                Object P11 = rv4Var2.P();
                if (f7 || P11 == lh9Var) {
                    P11 = new le1(ou4Var, aw7Var, aw7Var2, aw7Var3, aw7Var4, aw7Var5);
                    rv4Var2.o0(P11);
                }
                z1d.f(c2, A13, false, null, A14, null, null, null, (vt4) P11, rv4Var, 24576, 236);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            hl5.w(kq7Var, 8.0f, rv4Var2, true);
        } else {
            r24Var2 = r24Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            final r24 r24Var3 = r24Var2;
            u.d = new lu4(z, z2, z3, z4, z5, z6, ou4Var, i) { // from class: jg7
                public final /* synthetic */ boolean C;
                public final /* synthetic */ ou4 D;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p3 = xoe.p(1);
                    v9e.j(r24.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void k(boolean z, xeb xebVar, xt4 xt4Var, ou4 ou4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        xebVar.getClass();
        xt4Var.getClass();
        ou4Var.getClass();
        rv4Var.g0(-358284670);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(xebVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(ou4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            r24 r24Var = xebVar.l;
            if (r24Var == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (r24Var == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            xb.a(z, xt4Var, null, null, null, null, zj0.a, null, 0L, 0L, nae.e, null, null, null, z3, z4, jce.E(-1588814298, new sv4(15, xebVar, ou4Var), rv4Var), rv4Var, (i9 & 14) | 1572864 | ((i9 >> 3) & Token.ASSIGN_MOD), 1572864, 16316);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, xebVar, xt4Var, ou4Var, i, 11);
        }
    }

    public static final void l(boolean z, nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, mu4 mu4Var, nu4 nu4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        nnbVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        mu4Var.getClass();
        nu4Var.getClass();
        xt4Var3.getClass();
        rv4Var.g0(-1985120739);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nnbVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(nu4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1326880361);
                m(z, nnbVar, xt4Var, xt4Var2, mu4Var, nu4Var, xt4Var3, rv4Var, i2 & 4194302);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1326543236);
                n(z, nnbVar, xt4Var, xt4Var2, mu4Var, nu4Var, xt4Var3, rv4Var, i2 & 4194302);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mp7(z, nnbVar, xt4Var, xt4Var2, mu4Var, nu4Var, xt4Var3, i, 0);
        }
    }

    public static final void m(boolean z, nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, mu4 mu4Var, nu4 nu4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(1743607279);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nnbVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(nu4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            hc2.b(pna.c, null, jce.E(774203205, new fs1(z, xt4Var, nnbVar, xt4Var2, mu4Var, nu4Var, xt4Var3, 5), rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mp7(z, nnbVar, xt4Var, xt4Var2, mu4Var, nu4Var, xt4Var3, i, 1);
        }
    }

    public static final void n(boolean z, nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, mu4 mu4Var, nu4 nu4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(35376492);
        if ((i & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nnbVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(nu4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            nmd.f(z2, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(-371991333, new bn7(nnbVar, xt4Var2, mu4Var, nu4Var, xt4Var3, xt4Var), rv4Var), rv4Var, (i2 & 14) | 805309440 | ((i2 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mp7(z, nnbVar, xt4Var, xt4Var2, mu4Var, nu4Var, xt4Var3, i, 2);
        }
    }

    public static final h49 o(String str) {
        ng2 ng2Var;
        m66 m66Var = pe4.a;
        hn8 f = hn8.f(ie2.u(m66Var), "preferences");
        if (!m66Var.j0(f)) {
            m66Var.Q(f);
        }
        hn8 f2 = hn8.f(f, str.concat(".pb"));
        Object obj = z39.a;
        String t = f2.a.t();
        synchronized (z39.a) {
            try {
                HashMap hashMap = z39.b;
                Object obj2 = hashMap.get(t);
                if (obj2 == null) {
                    k98 k98Var = new k98(m66Var, new v85(t, 13));
                    ks3 ks3Var = ks3.a;
                    sw2 sw2Var = ab3.a;
                    ru2 ru2Var = ru2.c;
                    b9b b2 = rse.b();
                    ru2Var.getClass();
                    m41 a2 = k27.a(nq2.C(ru2Var, b2));
                    y39 y39Var = new y39(new gh2(k98Var, tl1.A(new cv0(ks3Var, null, 25)), new u28(0), a2));
                    hashMap.put(t, y39Var);
                    obj2 = y39Var;
                }
                ng2Var = (ng2) obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new h49(ng2Var);
    }

    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    public static final void p(final xoa xoaVar, final uo3 uo3Var, final loa loaVar, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        xoa xoaVar2;
        loa loaVar2;
        ek9 u;
        lu4 lu4Var;
        boolean z2;
        int i5;
        int i6;
        float f;
        List list;
        aw7 aw7Var;
        kq7 kq7Var;
        Object obj;
        float f2;
        boolean z3;
        ?? r13;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4 rv4Var2 = rv4Var;
        Float valueOf = Float.valueOf(Float.MAX_VALUE);
        xoaVar.getClass();
        List list2 = xoaVar.d;
        uo3Var.getClass();
        loaVar.getClass();
        rv4Var2.g0(-1700533773);
        if (rv4Var2.f(xoaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.f(uo3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(loaVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            hoa hoaVar = (hoa) rv4Var2.j(xu6.a);
            rk9 rk9Var = (rk9) hoaVar.b.getValue();
            if (rk9Var == null) {
                u = rv4Var2.u();
                if (u != null) {
                    lu4Var = new lu4(xoaVar, uo3Var, loaVar, i, 0) { // from class: ooa
                        public final /* synthetic */ int a;
                        public final /* synthetic */ xoa b;
                        public final /* synthetic */ uo3 c;
                        public final /* synthetic */ loa d;

                        {
                            this.a = r5;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj2, Object obj3) {
                            int i10 = this.a;
                            pvc pvcVar = pvc.a;
                            loa loaVar3 = this.d;
                            uo3 uo3Var2 = this.c;
                            xoa xoaVar3 = this.b;
                            rv4 rv4Var3 = (rv4) obj2;
                            ((Integer) obj3).getClass();
                            switch (i10) {
                                case 0:
                                    v9e.p(xoaVar3, uo3Var2, loaVar3, rv4Var3, xoe.p(513));
                                    return pvcVar;
                                default:
                                    v9e.p(xoaVar3, uo3Var2, loaVar3, rv4Var3, xoe.p(513));
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                }
                return;
            }
            tza tzaVar = jt6.a;
            p71 p71Var = ((e81) rv4Var2.j(tzaVar)).a;
            f81 f81Var = ((e81) rv4Var2.j(tzaVar)).b;
            c81 c81Var = (c81) rv4Var2.j(it6.a);
            boolean h = rv4Var2.h(hoaVar);
            Object P = rv4Var2.P();
            Object obj2 = ax1.a;
            if (h || P == obj2) {
                P = new ux9(hoaVar, 15);
                rv4Var2.o0(P);
            }
            yte.b(pvc.a, (xt4) P, rv4Var2);
            List list3 = (List) rv4Var2.j(bv6.a);
            int i10 = i9 & Token.ASSIGN_MOD;
            if (i10 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h2 = z2 | rv4Var2.h(list3);
            Object P2 = rv4Var2.P();
            if (h2 || P2 == obj2) {
                P2 = new iz7(uo3Var, list3, null, 10);
                rv4Var2.o0(P2);
            }
            yte.g((lu4) P2, rv4Var2, list3);
            r13 r13Var = (r13) rv4Var2.j(dy1.h);
            boolean d = rv4Var2.d(list3.size()) | rv4Var2.f(list2);
            Object P3 = rv4Var2.P();
            if (d || P3 == obj2) {
                int size = list3.size();
                if (!list2.isEmpty()) {
                    i5 = 57;
                } else {
                    i5 = 16;
                }
                int i11 = 150;
                if (size == 0) {
                    int i12 = i5 + 32;
                    if (i12 <= 150) {
                        i11 = i12;
                    }
                } else {
                    int i13 = (size * 32) + i5;
                    if (i13 <= 150) {
                        i11 = i13;
                    }
                }
                P3 = Integer.valueOf(i11);
                rv4Var2.o0(P3);
            }
            float L0 = r13Var.L0(((Number) P3).intValue());
            float L02 = r13Var.L0(4.0f);
            Object P4 = rv4Var2.P();
            if (P4 == obj2) {
                i6 = i9;
                f = L02;
                P4 = yae.z(new y78(0L));
                rv4Var2.o0(P4);
            } else {
                i6 = i9;
                f = L02;
            }
            aw7 aw7Var2 = (aw7) P4;
            Object P5 = rv4Var2.P();
            if (P5 == obj2) {
                P5 = yae.z(valueOf);
                rv4Var2.o0(P5);
            }
            aw7 aw7Var3 = (aw7) P5;
            Object P6 = rv4Var2.P();
            if (P6 == obj2) {
                P6 = yae.z(valueOf);
                rv4Var2.o0(P6);
            }
            aw7 aw7Var4 = (aw7) P6;
            Object P7 = rv4Var2.P();
            if (P7 == obj2) {
                list = list2;
                P7 = new mj7(aw7Var2, aw7Var3, aw7Var4, 1);
                rv4Var2.o0(P7);
            } else {
                list = list2;
            }
            kq7 kq7Var2 = kq7.a;
            nq7 y = obe.y(kq7Var2, (xt4) P7);
            Object P8 = rv4Var2.P();
            if (P8 == obj2) {
                aw7Var = aw7Var3;
                P8 = new eja(19);
                rv4Var2.o0(P8);
            } else {
                aw7Var = aw7Var3;
            }
            nq7 D = kwe.D(y, (xt4) P8);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, D);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf2 = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf2);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            float intBitsToFloat = rk9Var.a - Float.intBitsToFloat((int) (((y78) aw7Var2.getValue()).a >> 32));
            float intBitsToFloat2 = rk9Var.b - Float.intBitsToFloat((int) (((y78) aw7Var2.getValue()).a & 4294967295L));
            float intBitsToFloat3 = rk9Var.d - Float.intBitsToFloat((int) (((y78) aw7Var2.getValue()).a & 4294967295L));
            rk9 rk9Var2 = new rk9(intBitsToFloat, intBitsToFloat2, rk9Var.c - Float.intBitsToFloat((int) (((y78) aw7Var2.getValue()).a >> 32)), intBitsToFloat3);
            float L03 = r13Var.L0(280.0f);
            boolean f3 = rv4Var2.f(rk9Var2) | rv4Var2.c(L0) | rv4Var2.c(L03) | rv4Var2.c(((Number) aw7Var.getValue()).floatValue()) | rv4Var2.c(((Number) aw7Var4.getValue()).floatValue());
            Object P9 = rv4Var2.P();
            if (f3 || P9 == obj2) {
                float floatValue = ((Number) aw7Var.getValue()).floatValue();
                float floatValue2 = ((Number) aw7Var4.getValue()).floatValue();
                float f4 = intBitsToFloat3 + f;
                float f5 = (intBitsToFloat2 - f) - L0;
                if (L0 + f4 > floatValue) {
                    if (f5 >= nae.e) {
                        f4 = f5;
                    } else if (f4 < nae.e) {
                        f4 = 0.0f;
                    }
                }
                float f6 = floatValue2 - L03;
                if (f6 < nae.e) {
                    f6 = 0.0f;
                }
                P9 = new y78((Float.floatToRawIntBits(dce.m(intBitsToFloat, nae.e, f6)) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
                rv4Var2.o0(P9);
            }
            long j = ((y78) P9).a;
            boolean e = rv4Var2.e(j);
            Object P10 = rv4Var2.P();
            if (e || P10 == obj2) {
                P10 = new th(j, 16);
                rv4Var2.o0(P10);
            }
            nq7 v = nmd.v(st0.s(pna.j(pna.s(lbe.p(kq7Var2, (xt4) P10), 280.0f), nae.e, 150.0f, 1), 8.0f, uu9.a(8.0f), 28), p71Var.d, uu9.a(8.0f));
            Object P11 = rv4Var2.P();
            if (P11 == obj2) {
                P11 = new eja(20);
                rv4Var2.o0(P11);
            }
            nq7 D2 = kwe.D(v, (xt4) P11);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, D2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            if (!list.isEmpty()) {
                rv4Var2.e0(1835331179);
                nq7 j2 = pna.j(pna.f(kq7Var2, 1.0f), 40.0f, nae.e, 2);
                if (i10 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object P12 = rv4Var2.P();
                if (z6 || P12 == obj2) {
                    P12 = new u71(uo3Var, 14);
                    rv4Var2.o0(P12);
                }
                nq7 z7 = zbe.z(ote.x(1, (vt4) P12, rv4Var2, j2, false), 12.0f, 4.0f);
                gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, z7);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar, rv4Var2, a3);
                jce.F(npVar2, rv4Var2, l3);
                s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar4, rv4Var2, p3);
                obj = obj2;
                kq7Var = kq7Var2;
                r13 = 1;
                f2 = 1.0f;
                qye.b(c81Var.a, null, oyb.a(f81Var.j, p71Var.a, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), null, 0, false, 0, 0, null, rv4Var, 0, 1018);
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
                abf.e.k(p71Var.k, null, nae.e, rv4Var2, 3072);
                z3 = false;
                rv4Var2.q(false);
            } else {
                kq7Var = kq7Var2;
                obj = obj2;
                f2 = 1.0f;
                z3 = false;
                r13 = 1;
                rv4Var2.e0(1836015411);
                rv4Var2.q(false);
            }
            nq7 A = zbe.A(rs8.e(f2, pna.f(kq7Var, f2), z3), nae.e, 8.0f, r13);
            Object P13 = rv4Var2.P();
            Object obj3 = obj;
            if (P13 == obj3) {
                P13 = new eja(21);
                rv4Var2.o0(P13);
            }
            nq7 D3 = kwe.D(A, (xt4) P13);
            boolean h3 = rv4Var2.h(list3);
            if ((i6 & 14) == 4) {
                z4 = r13;
            } else {
                z4 = z3;
            }
            boolean z8 = h3 | z4;
            loaVar2 = loaVar;
            if ((i6 & 896) != 256 && !rv4Var2.h(loaVar2)) {
                z5 = z3;
            } else {
                z5 = r13;
            }
            boolean z9 = z8 | z5;
            Object P14 = rv4Var2.P();
            if (!z9 && P14 != obj3) {
                xoaVar2 = xoaVar;
            } else {
                xoaVar2 = xoaVar;
                P14 = new r6a(5, list3, xoaVar2, loaVar2);
                rv4Var2.o0(P14);
            }
            jce.d(D3, null, null, false, null, null, null, false, null, (xt4) P14, rv4Var, 0, 510);
            rv4Var2 = rv4Var;
            rv4Var2.q(r13);
            rv4Var2.q(r13);
        } else {
            xoaVar2 = xoaVar;
            loaVar2 = loaVar;
            rv4Var2.X();
        }
        u = rv4Var2.u();
        if (u != null) {
            final loa loaVar3 = loaVar2;
            final xoa xoaVar3 = xoaVar2;
            lu4Var = new lu4(xoaVar3, uo3Var, loaVar3, i, 1) { // from class: ooa
                public final /* synthetic */ int a;
                public final /* synthetic */ xoa b;
                public final /* synthetic */ uo3 c;
                public final /* synthetic */ loa d;

                {
                    this.a = r5;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj22, Object obj32) {
                    int i102 = this.a;
                    pvc pvcVar = pvc.a;
                    loa loaVar32 = this.d;
                    uo3 uo3Var2 = this.c;
                    xoa xoaVar32 = this.b;
                    rv4 rv4Var3 = (rv4) obj22;
                    ((Integer) obj32).getClass();
                    switch (i102) {
                        case 0:
                            v9e.p(xoaVar32, uo3Var2, loaVar32, rv4Var3, xoe.p(513));
                            return pvcVar;
                        default:
                            v9e.p(xoaVar32, uo3Var2, loaVar32, rv4Var3, xoe.p(513));
                            return pvcVar;
                    }
                }
            };
            u.d = lu4Var;
        }
    }

    public static final void q(String str, List list, List list2, nq7 nq7Var, xt4 xt4Var, mu4 mu4Var, nu4 nu4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        kq7 kq7Var;
        int i10;
        int i11;
        aw7 aw7Var;
        int i12;
        aw7 aw7Var2;
        p6 p6Var;
        boolean z10;
        boolean z11;
        boolean z12;
        rv4 rv4Var2;
        aw7 aw7Var3;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i14;
        rv4Var.g0(-2115887822);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i15 = i2 | i;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i16 = i15 | i3;
        if (rv4Var.f(list2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i17 = i16 | i4;
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i17 |= i14;
        }
        if (rv4Var.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i18 = i17 | i5;
        if (rv4Var.h(mu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i6;
        if (rv4Var.h(nu4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i20 = i19 | i7;
        if (rv4Var.h(xt4Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i21 = i20 | i8;
        if ((i21 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i21 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(new pn1());
                rv4Var.o0(P);
            }
            aw7 aw7Var4 = (aw7) P;
            Object[] objArr = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new rh7(19);
                rv4Var.o0(P2);
            }
            aw7 aw7Var5 = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
            nq7 g = c16.g(rte.C(nq7Var, rte.u(rv4Var), 14), null, 3);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, g);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            String A = yqe.A((y3b) f3b.d.getValue(), rv4Var);
            oyb oybVar = ((h27) rv4Var.j(j27.a)).b.h;
            kq7 kq7Var2 = kq7.a;
            cvb.c(A, zbe.A(kq7Var2, 24.0f, nae.e, 2), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 131068);
            int i22 = i21 & 14;
            if (i22 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P3 = rv4Var.P();
            int i23 = -1;
            if (z2 || P3 == obj) {
                Iterator it = list.iterator();
                int i24 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (c16.i(((pn1) it.next()).a, str)) {
                            break;
                        }
                        i24++;
                    } else {
                        i24 = -1;
                        break;
                    }
                }
                P3 = Integer.valueOf(i24);
                rv4Var.o0(P3);
            }
            int intValue = ((Number) P3).intValue();
            nq7 f = pna.f(zbe.z(kq7Var2, 24.0f, 12.0f), 1.0f);
            if ((i21 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i22 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z20 = z3 | z4;
            int i25 = 57344 & i21;
            if (i25 == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z21 = z20 | z5;
            Object P4 = rv4Var.P();
            if (!z21 && P4 != obj) {
                i9 = 3;
            } else {
                i9 = 3;
                P4 = new k34(3, xt4Var, str, list);
                rv4Var.o0(P4);
            }
            int i26 = i9;
            ej6.a(f, intValue, null, null, null, null, null, false, (xt4) P4, rv4Var, 0, 508);
            xbe.i(rv4Var, pna.h(kq7Var2, 12.0f));
            cvb.c(yqe.A((y3b) f3b.e.getValue(), rv4Var), zbe.A(kq7Var2, 24.0f, nae.e, 2), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.h, rv4Var, 48, 0, 131068);
            if (i22 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P5 = rv4Var.P();
            if (z6 || P5 == obj) {
                Iterator it2 = list2.iterator();
                int i27 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (c16.i(((pn1) it2.next()).a, str)) {
                        i23 = i27;
                        break;
                    } else {
                        i27++;
                    }
                }
                P5 = Integer.valueOf(i23);
                rv4Var.o0(P5);
            }
            int intValue2 = ((Number) P5).intValue();
            nq7 f2 = pna.f(zbe.z(kq7Var2, 24.0f, 12.0f), 1.0f);
            int i28 = i21 & 896;
            if (i28 != 256) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (i22 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z22 = z7 | z8;
            if (i25 == 16384) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean f3 = z22 | z9 | rv4Var.f(aw7Var5);
            Object P6 = rv4Var.P();
            if (!f3 && P6 != obj) {
                i10 = i22;
                p6Var = P6;
                kq7Var = kq7Var2;
                i11 = i21;
                aw7Var = aw7Var5;
                i12 = 4;
                aw7Var2 = aw7Var4;
            } else {
                kq7Var = kq7Var2;
                i10 = i22;
                i11 = i21;
                aw7Var = aw7Var5;
                i12 = 4;
                p6 p6Var2 = new p6(list2, str, xt4Var, aw7Var, aw7Var4);
                aw7Var2 = aw7Var4;
                rv4Var.o0(p6Var2);
                p6Var = p6Var2;
            }
            int i29 = i10;
            kq7 kq7Var3 = kq7Var;
            aw7 aw7Var6 = aw7Var2;
            int i30 = i12;
            ej6.a(f2, intValue2, null, null, null, null, null, false, (xt4) p6Var, rv4Var, 0, 508);
            if (i28 != 256) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i29 == i30) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z23 = z11 | z10;
            Object P7 = rv4Var.P();
            if (z23 || P7 == obj) {
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (c16.i(((pn1) it3.next()).a, str)) {
                            z12 = true;
                            break;
                        }
                    }
                }
                z12 = false;
                P7 = Boolean.valueOf(z12);
                rv4Var.o0(P7);
            }
            if (((Boolean) P7).booleanValue()) {
                rv4Var.e0(600571238);
                nq7 A2 = zbe.A(pna.f(kq7Var3, 1.0f), 24.0f, nae.e, 2);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, 0);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, A2);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a3);
                jce.F(qw1.e, rv4Var, l2);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p2);
                lk5 I = kwe.I(zl1.f, rv4Var);
                nq7 s = pna.s(kq7Var3, 70.0f);
                if ((i11 & 29360128) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i29 == i30) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z24 = z16 | z17;
                Object P8 = rv4Var.P();
                if (z24 || P8 == obj) {
                    P8 = new xr1(5, xt4Var2, str);
                    rv4Var.o0(P8);
                }
                mwe.b((vt4) P8, s, false, I, null, tc4.j, rv4Var, 1572912, 52);
                xbe.i(rv4Var, pna.s(kq7Var3, 12.0f));
                lk5 I2 = kwe.I(((h27) rv4Var.j(j27.a)).a.c, rv4Var);
                nq7 s2 = pna.s(kq7Var3, 70.0f);
                if (i28 != 256) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                if (i29 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean f4 = z19 | z18 | rv4Var.f(aw7Var);
                Object P9 = rv4Var.P();
                if (!f4 && P9 != obj) {
                    aw7Var3 = aw7Var6;
                    i13 = i26;
                } else {
                    aw7Var3 = aw7Var6;
                    i13 = i26;
                    xw0 xw0Var = new xw0((Object) list2, (Object) str, aw7Var3, (yya) aw7Var, 15);
                    rv4Var.o0(xw0Var);
                    P9 = xw0Var;
                }
                mwe.b((vt4) P9, s2, false, I2, null, tc4.k, rv4Var, 1572912, 52);
                rv4Var2 = rv4Var;
                z13 = true;
                rv4Var2.q(true);
                z14 = false;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                aw7Var3 = aw7Var6;
                i13 = i26;
                z13 = true;
                z14 = false;
                rv4Var2.e0(602016582);
                rv4Var2.q(false);
            }
            rv4Var2.q(z13);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            pn1 pn1Var = (pn1) aw7Var3.getValue();
            boolean f5 = rv4Var2.f(aw7Var);
            Object P10 = rv4Var2.P();
            if (f5 || P10 == obj) {
                P10 = new qo7(aw7Var, i13);
                rv4Var2.o0(P10);
            }
            xt4 xt4Var3 = (xt4) P10;
            boolean f6 = rv4Var2.f(aw7Var);
            if ((i11 & 458752) == 131072) {
                z15 = z13;
            } else {
                z15 = z14;
            }
            boolean z25 = f6 | z15;
            if ((i11 & 3670016) == 1048576) {
                z14 = z13;
            }
            boolean z26 = z25 | z14;
            Object P11 = rv4Var2.P();
            if (z26 || P11 == obj) {
                g83 g83Var = new g83(mu4Var, nu4Var, aw7Var, aw7Var3, 20);
                rv4Var2.o0(g83Var);
                P11 = g83Var;
            }
            b16.j(booleanValue, pn1Var, xt4Var3, (mu4) P11, rv4Var2, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ua(str, list, list2, nq7Var, xt4Var, mu4Var, nu4Var, xt4Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.s11 r4, int r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.u11
            if (r0 == 0) goto L13
            r0 = r6
            u11 r0 = (defpackage.u11) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            u11 r0 = new u11
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            r0.b = r2
            java.lang.Object r6 = r4.e(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3a
            return r4
        L3a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L45
            pvc r4 = defpackage.pvc.a
            return r4
        L45:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.r(s11, int, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r1.e(r6, r13) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r0 != r8) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [v11] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [v11, n42] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [f31] */
    /* JADX WARN: Type inference failed for: r2v4, types: [f31] */
    /* JADX WARN: Type inference failed for: r2v5, types: [f31] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cb -> B:20:0x0050). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.s11 r17, defpackage.f31 r18, long r19, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.s(s11, f31, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:26:0x006a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:25:0x0065). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.s11 r8, long r9, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.w11
            if (r0 == 0) goto L13
            r0 = r11
            w11 r0 = (defpackage.w11) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            w11 r0 = new w11
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            long r8 = r0.c
            long r3 = r0.b
            s11 r10 = r0.a
            defpackage.hre.r(r11)
            goto L65
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L32:
            defpackage.hre.r(r11)
            r11 = r0
            r0 = r9
        L37:
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 <= 0) goto L7f
            boolean r3 = r8.i()
            if (r3 != 0) goto L7f
            ly0 r3 = r8.h()
            r3.getClass()
            long r3 = r3.c
            int r3 = (int) r3
            if (r3 != 0) goto L6a
            r11.a = r8
            r11.b = r0
            r11.c = r9
            r11.e = r2
            java.lang.Object r3 = r8.e(r2, r11)
            n82 r4 = defpackage.n82.a
            if (r3 != r4) goto L60
            return r4
        L60:
            r3 = r9
            r10 = r8
            r8 = r3
            r3 = r0
            r0 = r11
        L65:
            r6 = r8
            r8 = r10
            r9 = r6
            r11 = r0
            r0 = r3
        L6a:
            ly0 r3 = r8.h()
            long r3 = defpackage.cae.u(r3)
            long r3 = java.lang.Math.min(r9, r3)
            ly0 r5 = r8.h()
            defpackage.cae.t(r5, r3)
            long r9 = r9 - r3
            goto L37
        L7f:
            long r0 = r0 - r9
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.t(s11, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.s11 r4, long r5, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.x11
            if (r0 == 0) goto L13
            r0 = r7
            x11 r0 = (defpackage.x11) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            x11 r0 = new x11
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            long r5 = r0.a
            defpackage.hre.r(r7)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r7)
            r0.a = r5
            r0.c = r2
            java.lang.Object r7 = t(r4, r5, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4b
            pvc r4 = defpackage.pvc.a
            return r4
        L4b:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r7 = "Unable to discard "
            java.lang.String r0 = " bytes"
            java.lang.String r5 = defpackage.nk2.t(r5, r7, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.u(s11, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02a9 -> B:85:0x02ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x02ca -> B:89:0x02be). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.s11 r35, defpackage.vb1 r36, long r37, boolean r39, boolean r40, defpackage.n42 r41) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.v(s11, vb1, long, boolean, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.psa r9, defpackage.s11 r10, boolean r11, defpackage.n42 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.z11
            if (r0 == 0) goto L13
            r0 = r12
            z11 r0 = (defpackage.z11) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            z11 r0 = new z11
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.d
            r2 = 1
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 != r6) goto L2d
            boolean r11 = r0.b
            psa r9 = r0.a
            defpackage.hre.r(r12)
            goto L4f
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L34:
            defpackage.hre.r(r12)
            long r7 = defpackage.cae.u(r9)
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 >= 0) goto L57
            r0.a = r9
            r0.b = r11
            r0.d = r6
            r12 = 2
            java.lang.Object r12 = r10.e(r12, r0)
            n82 r10 = defpackage.n82.a
            if (r12 != r10) goto L4f
            return r10
        L4f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L69
        L57:
            ly0 r10 = r9.b()
            byte r10 = r10.o(r2)
            r12 = 10
            if (r10 != r12) goto L69
            defpackage.cae.t(r9, r4)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L69:
            if (r11 == 0) goto L71
            defpackage.cae.t(r9, r2)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L71:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9e.w(psa, s11, boolean, n42):java.lang.Object");
    }

    public static final void x(psa psaVar, Appendable appendable, yl9 yl9Var, long j) {
        String f;
        if (j > 0) {
            psaVar.getClass();
            psaVar.w(j);
            appendable.append(zpe.f(psaVar.b(), j));
            yl9Var.a += f.length();
        }
    }

    public static w76 y(nsc nscVar) {
        return new w76(y76.a, nscVar);
    }

    public static final sl4 z(s02 s02Var, d82 d82Var) {
        d82Var.getClass();
        return new sl4(s02Var, d82Var, 0);
    }
}
