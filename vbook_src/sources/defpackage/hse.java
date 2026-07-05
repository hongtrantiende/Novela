package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hse  reason: default package */
/* loaded from: classes.dex */
public abstract class hse {
    public static final tu1 a = new tu1(new wu1(7), false, 628503269);
    public static final tu1 b = new tu1(new tx0(28), false, -918233786);
    public static final tu1 c = new tu1(new tx0(29), false, 1000985808);
    public static final tu1 d = new tu1(new wu1(8), false, -1828718865);

    public static final void a(c0a c0aVar, g08 g08Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        vt4 vt4Var3;
        boolean z2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-1784101165);
        if ((i & 6) == 0) {
            if (rv4Var.f(c0aVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(g08Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i6 = i2 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i6 |= i3;
        }
        boolean z3 = false;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            rv4Var.Z();
            int i7 = i & 1;
            lh9 lh9Var = ax1.a;
            if (i7 != 0 && !rv4Var.B()) {
                rv4Var.X();
                vt4Var3 = vt4Var;
            } else {
                Object P = rv4Var.P();
                if (P == lh9Var) {
                    P = new cd1(15);
                    rv4Var.o0(P);
                }
                vt4Var3 = (vt4) P;
            }
            rv4Var.r();
            boolean z4 = !c0aVar.c.a().isEmpty();
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i6 & 7168) == 2048) {
                z3 = true;
            }
            boolean z5 = z2 | z3;
            Object P2 = rv4Var.P();
            if (z5 || P2 == lh9Var) {
                P2 = new mm7(9, c0aVar, vt4Var2);
                rv4Var.o0(P2);
            }
            ese.h(g08Var, z4, vt4Var3, (vt4) P2, rv4Var, (i6 & 896) | ((i6 >> 3) & 14));
        } else {
            rv4Var.X();
            vt4Var3 = vt4Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90((Object) c0aVar, (Object) g08Var, (Object) vt4Var3, (Object) vt4Var2, i, 14, false);
        }
    }

    public static final void b(nq7 nq7Var, na5 na5Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        float f;
        boolean z2;
        boolean z3;
        na5Var.getClass();
        float f2 = na5Var.a;
        lu4Var.getClass();
        rv4Var.g0(363121565);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(na5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(lu4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                j = 4294967295L;
                P = ox9.B(tl1.B(new zl1(sve.d(4294967295L)), new zl1(sve.d(4278190080L))), nae.e, 14);
                rv4Var.o0(P);
            } else {
                j = 4294967295L;
            }
            hy0 hy0Var = (hy0) P;
            boolean c2 = rv4Var.c(f2);
            Object P2 = rv4Var.P();
            if (c2 || P2 == lh9Var) {
                ig9 b2 = new f35(f2, 1.0f, 1.0f, 1.0f).b();
                zl1 zl1Var = new zl1(sve.d(j));
                int A = k27.A(b2.a * 255.0f);
                int A2 = k27.A(b2.b * 255.0f);
                int A3 = k27.A(b2.c * 255.0f);
                float f3 = b2.d;
                if (Float.isNaN(f3)) {
                    f = 1.0f;
                } else {
                    f = f3;
                }
                P2 = ox9.v(tl1.B(zl1Var, new zl1(sve.c(A, A2, A3, k27.A(f * 255.0f)))), nae.e, 14);
                rv4Var.o0(P2);
            }
            hy0 hy0Var2 = (hy0) P2;
            nq7 a0 = nq7Var.a0(pna.c);
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P3 = rv4Var.P();
            if (z2 || P3 == lh9Var) {
                P3 = new vi(lu4Var, 8);
                rv4Var.o0(P3);
            }
            nq7 b3 = dab.b(a0, pvc.a, (PointerInputEventHandler) P3);
            boolean f4 = rv4Var.f(hy0Var2);
            if ((i7 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4 = f4 | z3;
            Object P4 = rv4Var.P();
            if (z4 || P4 == lh9Var) {
                P4 = new nq3(28, hy0Var, hy0Var2, na5Var);
                rv4Var.o0(P4);
            }
            bce.a(b3, (xt4) P4, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg7(nq7Var, na5Var, lu4Var, i, 13);
        }
    }

    public static final byte[] c(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length >= 16) {
                return Arrays.copyOf(bArr, 16);
            }
            vs.m("Wrong IV length: must be 16 bytes long");
            return null;
        }
        throw new Error("An operation is not implemented: IV not provided");
    }

    public static final yk8 d(long j, long j2) {
        long A = eg0.A(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (A >> 32));
        int i = (int) (A & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        Float valueOf = Float.valueOf(dce.m((1.0f / intBitsToFloat) * dce.m(Float.intBitsToFloat((int) (j >> 32)), nae.e, intBitsToFloat), nae.e, 1.0f));
        Float valueOf2 = Float.valueOf(dce.m(1.0f - ((1.0f / intBitsToFloat2) * dce.m(Float.intBitsToFloat((int) (j & 4294967295L)), nae.e, Float.intBitsToFloat(i))), nae.e, 1.0f));
        return new yk8(Float.valueOf(valueOf.floatValue()), Float.valueOf(valueOf2.floatValue()));
    }

    public static final void e(c5d c5dVar, z09 z09Var) {
        mz6 mz6Var = c5dVar.a;
        mz6Var.getClass();
        b5d b5dVar = (b5d) mz6Var.c;
        b5d b5dVar2 = (b5d) mz6Var.b;
        boolean k = ie2.k(z09Var);
        long j = z09Var.b;
        if (k) {
            b00.g0(0, r4.length, null, b5dVar2.d);
            b5dVar2.e = 0;
            b00.g0(0, r4.length, null, b5dVar.d);
            b5dVar.e = 0;
            mz6Var.a = 0L;
        }
        if (!ie2.m(z09Var)) {
            List b2 = z09Var.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                m65 m65Var = (m65) b2.get(i);
                mz6Var.a(m65Var.a, y78.j(m65Var.e, 0L));
            }
            mz6Var.a(j, y78.j(z09Var.n, 0L));
        }
        if (ie2.m(z09Var) && j - mz6Var.a > 40) {
            b00.g0(0, r1.length, null, b5dVar2.d);
            b5dVar2.e = 0;
            b00.g0(0, r3.length, null, b5dVar.d);
            b5dVar.e = 0;
            mz6Var.a = 0L;
        }
        mz6Var.a = j;
    }

    public static final float f(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = nae.e;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static long g(double d2) {
        wq9.r("not a normal value", h(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean h(double d2) {
        if (Math.getExponent(d2) <= 1023) {
            return true;
        }
        return false;
    }

    public static void i(x7b x7bVar, int i, h12 h12Var) {
        long c2 = x7bVar.c(i);
        List f = x7bVar.f(c2);
        if (!f.isEmpty()) {
            if (i != x7bVar.g() - 1) {
                long c3 = x7bVar.c(i + 1) - x7bVar.c(i);
                if (c3 > 0) {
                    h12Var.accept(new wd2(c2, c3, f));
                    return;
                }
                return;
            }
            vm1.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.kk r16, defpackage.mkc r17, defpackage.hvb r18, defpackage.as5 r19, defpackage.xt4 r20, defpackage.vt4 r21, defpackage.kw5 r22, defpackage.xv7 r23, defpackage.ucd r24, defpackage.xt4 r25, defpackage.n42 r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof defpackage.hn
            if (r1 == 0) goto L15
            r1 = r0
            hn r1 = (defpackage.hn) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.b = r2
            goto L1a
        L15:
            hn r1 = new hn
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.a
            int r2 = r1.b
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return
        L29:
            defpackage.hre.r(r0)
            goto L55
        L2d:
            defpackage.hre.r(r0)
            ln r4 = new ln
            r15 = 0
            r9 = r16
            r6 = r17
            r7 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r8 = r22
            r5 = r23
            r13 = r24
            r14 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.b = r3
            java.lang.Object r0 = defpackage.k27.p(r4, r1)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L55
            return
        L55:
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hse.j(kk, mkc, hvb, as5, xt4, vt4, kw5, xv7, ucd, xt4, n42):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.kk r13, defpackage.mkc r14, defpackage.hvb r15, defpackage.as5 r16, defpackage.u1a r17, defpackage.prb r18, defpackage.xv7 r19, defpackage.ucd r20, defpackage.qrb r21, defpackage.n42 r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof defpackage.gn
            if (r1 == 0) goto L16
            r1 = r0
            gn r1 = (defpackage.gn) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.b = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            gn r1 = new gn
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.a
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return
        L2b:
            gt1 r13 = defpackage.a82.e(r0)
            throw r13
        L30:
            defpackage.hre.r(r0)
            android.view.View r0 = r13.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            r4 = 11
            if (r1 < r3) goto L44
            bw1 r1 = new bw1
            r1.<init>(r0, r4)
        L42:
            r8 = r1
            goto L4a
        L44:
            kw5 r1 = new kw5
            r1.<init>(r0, r4)
            goto L42
        L4a:
            r12.b = r2
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hse.k(kk, mkc, hvb, as5, u1a, prb, xv7, ucd, qrb, n42):void");
    }

    public static final void l(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float f;
        if (i == 0) {
            lv5.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        for (int i9 = 0; i9 < i3; i9++) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float f2 = f(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * f2);
                }
            }
            float sqrt = (float) Math.sqrt(f(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f3 = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f3;
            }
            float[] fArr10 = fArr6[i9];
            for (int i13 = 0; i13 < i3; i13++) {
                if (i13 < i9) {
                    f = nae.e;
                } else {
                    f = f(fArr7, fArr4[i13]);
                }
                fArr10[i13] = f;
            }
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float f4 = f(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    f4 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = f4 / fArr11[i14];
        }
    }

    public static void m(sd2 sd2Var) {
        Object[] spans;
        sd2Var.k = -3.4028235E38f;
        sd2Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = sd2Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                sd2Var.a = SpannableString.valueOf(charSequence);
                sd2Var.b = null;
            }
            CharSequence charSequence2 = sd2Var.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float n(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        } else {
            f2 = i3;
        }
        return f * f2;
    }

    public static final long o(na5 na5Var) {
        na5Var.getClass();
        ig9 b2 = new f35(na5Var.a, na5Var.b, na5Var.c, na5Var.d).b();
        int A = k27.A(b2.a * 255.0f);
        int A2 = k27.A(b2.b * 255.0f);
        int A3 = k27.A(b2.c * 255.0f);
        float f = b2.d;
        if (Float.isNaN(f)) {
            f = 1.0f;
        }
        return sve.c(A, A2, A3, k27.A(f * 255.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[LOOP:0: B:23:0x0053->B:25:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(defpackage.x7b r12, defpackage.n8b r13, defpackage.h12 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.g()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.c(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.g()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.f(r0)
            long r2 = r12.c(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            wd2 r6 = new wd2
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.g()
            if (r3 >= r6) goto L5f
            i(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            i(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            wd2 r6 = new wd2
            java.util.List r11 = r12.f(r0)
            long r7 = r12.c(r4)
            long r12 = r12.c(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hse.p(x7b, n8b, h12):void");
    }
}
