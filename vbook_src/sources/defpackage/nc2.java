package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nc2  reason: default package */
/* loaded from: classes.dex */
public abstract class nc2 {
    public static oc2 a = null;
    public static volatile FirebaseAnalytics b = null;
    public static final Object c = new Object();
    public static final tu1 d = new tu1(new nv1(5), false, 2089456749);
    public static final tu1 e = new tu1(new mv1(12), false, 1089886705);
    public static final int[] f = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final x8d g = new x8d(7);
    public static final float h = 1.0f;

    public static final void a(boolean z, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-1668131303);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z3 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            int i8 = i7 & 14;
            if (i8 != 4) {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = yae.z("");
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            xb.d(z, xt4Var, jce.E(98570861, new h24(2, xt4Var2, xt4Var, aw7Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(-718738000, new id1(xt4Var, 10, (byte) 0), rv4Var), uwe.c, null, 0L, 0L, nae.e, false, false, jce.E(1959582917, new sp0(aw7Var, 8), rv4Var), rv4Var, 1769856 | i8 | (i7 & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kr3(z, xt4Var, xt4Var2, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.io.File r4, defpackage.xt4 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.me4
            if (r0 == 0) goto L13
            r0 = r6
            me4 r0 = (defpackage.me4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me4 r0 = new me4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.io.File r4 = r0.a
            defpackage.hre.r(r6)     // Catch: java.io.IOException -> L27
            return r6
        L27:
            r5 = move-exception
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L30:
            defpackage.hre.r(r6)
            r0.a = r4     // Catch: java.io.IOException -> L27
            r0.c = r2     // Catch: java.io.IOException -> L27
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L27
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof defpackage.u82
            if (r6 != 0) goto La5
            r4.getClass()
            boolean r6 = r4.exists()
            if (r6 == 0) goto La0
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7a
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6a
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L65
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L65:
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L6a:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L75
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L75:
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L7a:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L90
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8b
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L8b:
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L90:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9b
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        L9b:
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
            goto La4
        La0:
            java.io.IOException r4 = defpackage.eg0.q(r4, r5)
        La4:
            throw r4
        La5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.b(java.io.File, xt4, n42):java.lang.Object");
    }

    public static final Integer c(int i) {
        return new Integer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oc2 d(android.content.Context r4, defpackage.lc2 r5) {
        /*
            java.lang.Class<nc2> r0 = defpackage.nc2.class
            monitor-enter(r0)
            oc2 r1 = defpackage.nc2.a     // Catch: java.lang.Throwable -> L34
            r2 = 1
            if (r1 != 0) goto L3e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            r3 = 30
            if (r1 < r3) goto L3e
            lc2 r1 = defpackage.lc2.e     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r5 == r1) goto L1a
            lc2 r1 = defpackage.lc2.c     // Catch: java.lang.Throwable -> L34
            if (r5 != r1) goto L18
            goto L1a
        L18:
            r5 = r3
            goto L1b
        L1a:
            r5 = r2
        L1b:
            android.os.Bundle r4 = defpackage.pc2.k(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "android.net.http.EnableTelemetry"
            boolean r4 = r4.getBoolean(r1, r5)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L3e
            oc2 r4 = new oc2     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            defpackage.nc2.a = r4     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            goto L3e
        L34:
            r4 = move-exception
            goto L4d
        L36:
            r4 = move-exception
            java.lang.String r5 = "nc2"
            java.lang.String r1 = "Exception creating an instance of CronetLoggerImpl"
            android.util.Log.e(r5, r1, r4)     // Catch: java.lang.Throwable -> L34
        L3e:
            oc2 r4 = defpackage.nc2.a     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L49
            oc2 r4 = new oc2     // Catch: java.lang.Throwable -> L34
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L34
            defpackage.nc2.a = r4     // Catch: java.lang.Throwable -> L34
        L49:
            oc2 r4 = defpackage.nc2.a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r4
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.d(android.content.Context, lc2):oc2");
    }

    public static final long e(float f2, long j) {
        return wi4.a(i(j) / f2, j(j) / f2);
    }

    public static final float f(long j, long j2) {
        float i = i(j);
        return (j(j2) * j(j)) + (i(j2) * i);
    }

    public static final float h(long j) {
        return (float) Math.sqrt((j(j) * j(j)) + (i(j) * i(j)));
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float j(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean k(float[] fArr, float[] fArr2) {
        boolean z;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        int i = (f30 > nae.e ? 1 : (f30 == nae.e ? 0 : -1));
        if (i != 0) {
            float f31 = 1.0f / f30;
            fArr2[0] = a82.B(f9, f27, (f7 * f29) - (f8 * f28), f31);
            fArr2[1] = nk2.c(f5, f27, (f4 * f28) + ((-f3) * f29), f31);
            fArr2[2] = a82.B(f17, f21, (f15 * f23) - (f16 * f22), f31);
            fArr2[3] = nk2.c(f13, f21, (f12 * f22) + ((-f11) * f23), f31);
            float f32 = -f6;
            fArr2[4] = nk2.c(f9, f25, (f8 * f26) + (f32 * f29), f31);
            fArr2[5] = a82.B(f5, f25, (f29 * f2) - (f4 * f26), f31);
            float f33 = -f14;
            fArr2[6] = nk2.c(f17, f19, (f16 * f20) + (f33 * f23), f31);
            fArr2[7] = a82.B(f13, f19, (f10 * f23) - (f12 * f20), f31);
            fArr2[8] = a82.B(f9, f24, (f6 * f28) - (f7 * f26), f31);
            fArr2[9] = nk2.c(f5, f24, (f26 * f3) + ((-f2) * f28), f31);
            fArr2[10] = a82.B(f17, f18, (f14 * f22) - (f15 * f20), f31);
            fArr2[11] = nk2.c(f13, f18, (f20 * f11) + ((-f10) * f22), f31);
            fArr2[12] = nk2.c(f8, f24, (f7 * f25) + (f32 * f27), f31);
            fArr2[13] = a82.B(f4, f24, (f2 * f27) - (f3 * f25), f31);
            fArr2[14] = nk2.c(f16, f18, (f15 * f19) + (f33 * f21), f31);
            fArr2[15] = a82.B(f12, f18, (f10 * f21) - (f11 * f19), f31);
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final long l(long j, long j2) {
        return wi4.a(i(j) - i(j2), j(j) - j(j2));
    }

    public static final long m(long j, long j2) {
        return wi4.a(i(j2) + i(j), j(j2) + j(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [nq7, java.lang.Object] */
    public static final nq7 o(nq7 nq7Var) {
        return nq7Var.a0(new Object());
    }

    public static final long p(float f2, long j) {
        return wi4.a(i(j) * f2, j(j) * f2);
    }

    public static Object q(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e2) {
            xk5.m(e2);
            return null;
        }
    }

    public abstract void g(ifa ifaVar, float f2, float f3);

    public abstract long n();
}
