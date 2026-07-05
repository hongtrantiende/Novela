package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gae  reason: default package */
/* loaded from: classes.dex */
public abstract class gae {
    public static final qm1 C;
    public static final qm1 D;
    public static final float E;
    public static final ftc F;
    public static final int[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final et1 a = new et1(2);
    public static final tu1 b = new tu1(new pv1(9), false, -622028958);
    public static final qm1 c = qm1.d;
    public static final qm1 d = qm1.I;
    public static final afa e = afa.c;
    public static final qm1 f = qm1.H;

    static {
        qm1 qm1Var = qm1.f;
        C = qm1Var;
        D = qm1Var;
        E = 80.0f;
        F = ftc.c;
        G = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        H = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        I = new int[]{67108863, 33554431};
        J = new int[]{26, 25};
    }

    public static byte[] A(long[] jArr) {
        long j;
        int[] iArr;
        int i;
        int i2;
        int[] iArr2;
        long j2;
        int i3;
        int i4;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            j = 19;
            iArr = J;
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j4 = copyOf[i12];
                copyOf[i12] = j4 + (i9 << i8);
                i12++;
                copyOf[i12] = copyOf[i12] - (-((int) (((j4 >> 31) & j4) >> iArr[i12 & 1])));
            }
            long j5 = copyOf[9];
            copyOf[9] = j5 + (i7 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j5 >> 31) & j5) >> 25))) * 19);
            i11++;
        }
        long j6 = copyOf[0];
        copyOf[0] = j6 + (i2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j6 >> 31) & j6) >> 26)));
        int i13 = 0;
        while (true) {
            iArr2 = I;
            if (i13 >= 2) {
                break;
            }
            int i14 = i10;
            while (i14 < 9) {
                int i15 = i13;
                copyOf[i14] = copyOf[i14] & iArr2[i14 & 1];
                i14++;
                copyOf[i14] = copyOf[i14] + ((int) (j3 >> iArr[i6]));
                i10 = i10;
                j = j;
                i13 = i15;
            }
            i13++;
        }
        int i16 = i10;
        copyOf[9] = copyOf[9] & 33554431;
        long j7 = (((int) (j2 >> 25)) * j) + copyOf[i16];
        copyOf[i16] = j7;
        int i17 = ~((((int) j7) - 67108845) >> 31);
        for (int i18 = 1; i18 < 10; i18++) {
            int i19 = ~(((int) copyOf[i18]) ^ iArr2[i18 & 1]);
            int i20 = i19 & (i19 << 16);
            int i21 = i20 & (i20 << 8);
            int i22 = i21 & (i21 << 4);
            int i23 = i22 & (i22 << 2);
            i17 &= (i23 & (i23 << 1)) >> 31;
        }
        copyOf[i16] = copyOf[i16] - (67108845 & i17);
        long j8 = 33554431 & i17;
        copyOf[1] = copyOf[1] - j8;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - (67108863 & i17);
            int i24 = i + 1;
            copyOf[i24] = copyOf[i24] - j8;
        }
        for (int i25 = i16; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << H[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = i16; i26 < 10; i26++) {
            int i27 = G[i26];
            long j9 = copyOf[i26];
            bArr[i27] = (byte) (bArr[i27] | (j9 & 255));
            bArr[i27 + 1] = (byte) (bArr[i3] | ((j9 >> 8) & 255));
            bArr[i27 + 2] = (byte) (bArr[i4] | ((j9 >> 16) & 255));
            bArr[i27 + 3] = (byte) (bArr[i5] | ((j9 >> 24) & 255));
        }
        return bArr;
    }

    public static void B(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static final void a(dt5 dt5Var, boolean z, cs9 cs9Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        dt5 dt5Var2;
        xt4 xt4Var2;
        boolean z3;
        lh9 lh9Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String A;
        int i5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1262461770);
        if (rv4Var2.f(dt5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.d(cs9Var.ordinal())) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1155) != 1154) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i8 & 1, z2)) {
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.z(cs9Var);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            nq7 f2 = pna.f(sye.n(), 1.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f2);
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
            nq7 z9 = zbe.z(hl5.f(kq7Var, 12.0f, rv4Var2, kq7Var, 1.0f), 16.0f, 8.0f);
            if (((cs9) aw7Var.getValue()) == cs9.a) {
                z3 = true;
            } else {
                z3 = false;
            }
            String A2 = yqe.A((y3b) k3b.g.getValue(), rv4Var2);
            String A3 = yqe.A((y3b) k3b.h.getValue(), rv4Var2);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var2) {
                lh9Var = lh9Var2;
                P2 = new ig7(aw7Var, 10);
                rv4Var2.o0(P2);
            } else {
                lh9Var = lh9Var2;
            }
            lh9 lh9Var3 = lh9Var;
            l0e.m(A2, A3, z9, false, z3, (xt4) P2, rv4Var2, 196992, 8);
            nq7 z10 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
            if (((cs9) aw7Var.getValue()) == cs9.b) {
                z4 = true;
            } else {
                z4 = false;
            }
            String A4 = yqe.A((y3b) k3b.c.getValue(), rv4Var2);
            String A5 = yqe.A((y3b) k3b.d.getValue(), rv4Var2);
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var3) {
                P3 = new ig7(aw7Var, 11);
                rv4Var2.o0(P3);
            }
            l0e.m(A4, A5, z10, false, z4, (xt4) P3, rv4Var2, 196992, 8);
            nq7 z11 = zbe.z(pna.f(kq7Var, 1.0f), 16.0f, 8.0f);
            if (((cs9) aw7Var.getValue()) == cs9.c) {
                z5 = true;
            } else {
                z5 = false;
            }
            String A6 = yqe.A((y3b) k3b.e.getValue(), rv4Var2);
            String A7 = yqe.A((y3b) k3b.f.getValue(), rv4Var2);
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var3) {
                P4 = new ig7(aw7Var, 12);
                rv4Var2.o0(P4);
            }
            l0e.m(A6, A7, z11, false, z5, (xt4) P4, rv4Var2, 196992, 8);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            if (dt5Var != null) {
                rv4Var2.e0(377942751);
                nq7 A8 = zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2);
                gv9 a3 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l2 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, A8);
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
                dt5Var2 = dt5Var;
                int ordinal = dt5Var2.a.ordinal();
                if (ordinal != 0) {
                    z8 = true;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        rv4Var.e0(1110170616);
                                        A = yqe.A((y3b) b3b.t0.getValue(), rv4Var);
                                        rv4Var.q(false);
                                    } else {
                                        throw rs8.b(1110144319, rv4Var, false);
                                    }
                                } else {
                                    rv4Var.e0(1110166903);
                                    A = yqe.A((y3b) b3b.s0.getValue(), rv4Var);
                                    rv4Var.q(false);
                                }
                            } else {
                                rv4Var.e0(1110157550);
                                y3b c2 = k3b.c();
                                String A9 = yqe.A((y3b) b3b.u0.getValue(), rv4Var);
                                int i9 = dt5Var2.c;
                                if (i9 > 0) {
                                    i5 = (dt5Var2.b * 100) / i9;
                                } else {
                                    i5 = 0;
                                }
                                A = yqe.B(c2, new Object[]{A9, Integer.valueOf(i5)}, rv4Var);
                                rv4Var.q(false);
                            }
                        } else {
                            rv4Var.e0(1110153624);
                            A = yqe.A((y3b) b3b.w0.getValue(), rv4Var);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(1110149880);
                        A = yqe.A((y3b) k3b.R.getValue(), rv4Var);
                        rv4Var.q(false);
                    }
                } else {
                    z8 = true;
                    rv4Var.e0(1110146072);
                    A = yqe.A((y3b) b3b.v0.getValue(), rv4Var);
                    rv4Var.q(false);
                }
                String str = A;
                z7 = z8;
                cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.j, rv4Var, 0, 0, 131070);
                rv4Var2 = rv4Var;
                rv4Var2.q(z7);
                rv4Var2.q(false);
                xt4Var2 = xt4Var;
            } else {
                dt5Var2 = dt5Var;
                rv4Var2.e0(379356382);
                ar5 c3 = rp5.c((wk3) rk3.h.getValue(), rv4Var2, 0);
                String A10 = yqe.A((y3b) k3b.y.getValue(), rv4Var2);
                nq7 A11 = zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2);
                if ((i8 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object P5 = rv4Var2.P();
                if (!z6 && P5 != lh9Var3) {
                    xt4Var2 = xt4Var;
                } else {
                    xt4Var2 = xt4Var;
                    P5 = new v90(6, xt4Var2, aw7Var);
                    rv4Var2.o0(P5);
                }
                z7 = true;
                z1d.f(c3, A10, false, null, A11, null, null, null, (vt4) P5, rv4Var, 24576, 236);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            hl5.w(kq7Var, 8.0f, rv4Var2, z7);
        } else {
            dt5Var2 = dt5Var;
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rd0(dt5Var2, z, cs9Var, xt4Var2, i, 12);
        }
    }

    public static final void b(boolean z, String str, xeb xebVar, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        str.getClass();
        xebVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-1121275341);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(xebVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            tu1 E2 = jce.E(1482928902, new jd1(str, 14), rv4Var);
            dt5 dt5Var = xebVar.k;
            if (dt5Var == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dt5Var == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            xb.a(z, xt4Var, null, null, null, null, E2, null, 0L, 0L, nae.e, null, null, null, z3, z4, jce.E(1863284239, new sv4(17, xebVar, xt4Var2), rv4Var), rv4Var, (i11 & 14) | 1572864 | ((i11 >> 6) & Token.ASSIGN_MOD), 1572864, 16316);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(z, str, xebVar, xt4Var, xt4Var2, i, 4);
        }
    }

    public static final void c(vu7 vu7Var, int i) {
        if (vu7Var.b != 0 && (vu7Var.c(0) == i || vu7Var.c(vu7Var.b - 1) == i)) {
            return;
        }
        int i2 = vu7Var.b;
        vu7Var.a(i);
        while (i2 > 0) {
            int i3 = ((i2 + 1) >>> 1) - 1;
            int c2 = vu7Var.c(i3);
            if (i <= c2) {
                break;
            }
            vu7Var.f(i2, c2);
            i2 = i3;
        }
        vu7Var.f(i2, i);
    }

    public static final void d(f31 f31Var, Throwable th) {
        f31Var.getClass();
        if (th == null) {
            g(new m0(1, f31Var, f31.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4));
        } else {
            f31Var.a(th);
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final go4 f(Context context) {
        int i = 0;
        ej ejVar = new ej(context, 0);
        if (Build.VERSION.SDK_INT >= 31) {
            i = eq4.a.a(context);
        }
        return new go4(ejVar, new fj(i));
    }

    public static final void g(xt4 xt4Var) {
        m42 d16Var;
        et1 et1Var = a;
        try {
            if (xt4Var instanceof hh0) {
                d16Var = ((hh0) xt4Var).create(et1Var);
            } else {
                d16Var = new d16(xt4Var);
            }
            ua3.a(w92.t(d16Var), pvc.a);
        } catch (Throwable th) {
            ube.w(et1Var, th);
            throw null;
        }
    }

    public static final d82 h(fu9 fu9Var, n42 n42Var) {
        if (fu9Var.j()) {
            if (n42Var.getContext().get(t39.b) == null) {
                m41 m41Var = fu9Var.a;
                if (m41Var != null) {
                    return m41Var.b;
                }
                c16.w("coroutineScope");
                throw null;
            }
            vm1.h();
            return null;
        }
        m41 m41Var2 = fu9Var.a;
        if (m41Var2 != null) {
            return m41Var2.b;
        }
        c16.w("coroutineScope");
        throw null;
    }

    public static final long i(KeyEvent keyEvent) {
        return rae.a(keyEvent.getKeyCode());
    }

    public static final int j(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List k(eqa eqaVar, int i, eqa eqaVar2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ks3 ks3Var;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int u = eqaVar.u(i);
        int i5 = i + u;
        int f2 = eqaVar.f(i);
        int f3 = eqaVar.f(i5);
        int i6 = f3 - f2;
        if (i >= 0 && (eqaVar.b[(eqaVar.r(i) * 5) + 1] & 201326592) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        eqaVar2.w(u);
        eqaVar2.x(i6, eqaVar2.t);
        if (eqaVar.g < i5) {
            eqaVar.B(i5);
        }
        if (eqaVar.k < f3) {
            eqaVar.C(f3, i5);
        }
        int[] iArr = eqaVar2.b;
        int i7 = eqaVar2.t;
        int i8 = i7 * 5;
        b00.V(i8, i * 5, i5 * 5, eqaVar.b, iArr);
        Object[] objArr = eqaVar2.c;
        int i9 = eqaVar2.i;
        System.arraycopy(eqaVar.c, f2, objArr, i9, i6);
        int i10 = eqaVar2.v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i;
        int i12 = i7 + u;
        int g = i9 - eqaVar2.g(i7, iArr);
        int i13 = eqaVar2.m;
        int i14 = eqaVar2.l;
        int length = objArr.length;
        boolean z7 = z4;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int[] iArr2 = iArr;
            int g2 = eqaVar2.g(i16, iArr) + g;
            if (i15 < i16) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = eqaVar2.k;
            }
            iArr2[(i16 * 5) + 4] = eqa.i(g2, i4, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        eqaVar2.m = i15;
        int a2 = dqa.a(eqaVar.d, i, eqaVar.p());
        int a3 = dqa.a(eqaVar.d, i5, eqaVar.p());
        if (a2 < a3) {
            ArrayList arrayList = eqaVar.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i18 = a2; i18 < a3; i18++) {
                lv4 lv4Var = (lv4) arrayList.get(i18);
                lv4Var.a += i11;
                arrayList2.add(lv4Var);
            }
            eqaVar2.d.addAll(dqa.a(eqaVar2.d, eqaVar2.t, eqaVar2.p()), arrayList2);
            arrayList.subList(a2, a3).clear();
            ks3Var = arrayList2;
        } else {
            ks3Var = ks3.a;
        }
        if (!ks3Var.isEmpty()) {
            HashMap hashMap = eqaVar.e;
            HashMap hashMap2 = eqaVar2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = ks3Var.size();
                for (int i19 = 0; i19 < size; i19++) {
                    uv4 uv4Var = (uv4) hashMap.get((lv4) ks3Var.get(i19));
                }
            }
        }
        int i20 = eqaVar2.v;
        eqaVar2.Q(i10);
        int G2 = eqaVar.G(i, eqaVar.b);
        if (!z3) {
            z5 = false;
        } else if (z) {
            if (G2 >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                eqaVar.R();
                eqaVar.a(G2 - eqaVar.t);
                eqaVar.R();
            }
            eqaVar.a(i - eqaVar.t);
            boolean J2 = eqaVar.J();
            if (z6) {
                eqaVar.O();
                eqaVar.j();
                eqaVar.O();
                eqaVar.j();
            }
            z5 = J2;
        } else {
            boolean K = eqaVar.K(i, u);
            eqaVar.L(f2, i6, i - 1);
            z5 = K;
        }
        if (z5) {
            ex1.a("Unexpectedly removed anchors");
        }
        int i21 = eqaVar2.o;
        int i22 = iArr3[i8 + 1];
        if ((1073741824 & i22) != 0) {
            i2 = 1;
        } else {
            i2 = i22 & 67108863;
        }
        eqaVar2.o = i21 + i2;
        if (z2) {
            eqaVar2.t = i12;
            eqaVar2.i = i9 + i6;
        }
        if (z7) {
            eqaVar2.W(i10);
        }
        return ks3Var;
    }

    public static final Object l(fu9 fu9Var, boolean z, boolean z2, xt4 xt4Var) {
        fu9Var.getClass();
        fu9Var.a();
        if (fu9Var.j() && !fu9Var.k() && fu9Var.h.get() != null) {
            vs.k("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            return null;
        }
        return mue.q(new te2((m42) null, xt4Var, fu9Var, z, z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r10 == r6) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.fu9 r7, boolean r8, defpackage.x8d r9, defpackage.n42 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ue2
            if (r0 == 0) goto L13
            r0 = r10
            ue2 r0 = (defpackage.ue2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ue2 r0 = new ue2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.hre.r(r10)
            return r10
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L34:
            boolean r8 = r0.c
            x8d r9 = r0.b
            fu9 r7 = r0.a
            defpackage.hre.r(r10)
            goto L75
        L3e:
            defpackage.hre.r(r10)
            return r10
        L42:
            defpackage.hre.r(r10)
            boolean r10 = r7.j()
            if (r10 == 0) goto L66
            boolean r10 = r7.m()
            if (r10 == 0) goto L66
            boolean r10 = r7.k()
            if (r10 == 0) goto L66
            ds r10 = new ds
            r10.<init>(r2, r9, r7, r8)
            r0.e = r5
            java.lang.Object r7 = r7.q(r8, r10, r0)
            if (r7 != r6) goto L65
            goto L88
        L65:
            return r7
        L66:
            r0.a = r7
            r0.b = r9
            r0.c = r8
            r0.e = r4
            d82 r10 = h(r7, r0)
            if (r10 != r6) goto L75
            goto L88
        L75:
            d82 r10 = (defpackage.d82) r10
            lq0 r1 = new lq0
            r1.<init>(r2, r9, r7, r8)
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = defpackage.z87.E(r10, r1, r0)
            if (r7 != r6) goto L89
        L88:
            return r6
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gae.m(fu9, boolean, x8d, n42):java.lang.Object");
    }

    public static final byte[] n(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        e(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final Object o(r36 r36Var, String str, d56 d56Var, s76 s76Var) {
        r36Var.getClass();
        str.getClass();
        return new n56(r36Var, d56Var, str, s76Var.e()).d(s76Var);
    }

    public static final int p(vu7 vu7Var) {
        int c2;
        int i = vu7Var.b;
        int c3 = vu7Var.c(0);
        while (vu7Var.b != 0 && vu7Var.c(0) == c3) {
            vu7Var.f(0, vu7Var.d());
            vu7Var.e(vu7Var.b - 1);
            int i2 = vu7Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int c4 = vu7Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int c5 = vu7Var.c(i6);
                if (i5 < i2 && (c2 = vu7Var.c(i5)) > c5) {
                    if (c2 > c4) {
                        vu7Var.f(i4, c2);
                        vu7Var.f(i5, c4);
                        i4 = i5;
                    }
                } else if (c5 > c4) {
                    vu7Var.f(i4, c5);
                    vu7Var.f(i6, c4);
                    i4 = i6;
                }
            }
        }
        return c3;
    }

    public static final Object q(f31 f31Var, byte[] bArr, int i, n42 n42Var) {
        f31Var.f().n(bArr, i);
        Object m = nae.m(f31Var, n42Var);
        if (m == n82.a) {
            return m;
        }
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.f31 r6, defpackage.psa r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.g31
            if (r0 == 0) goto L13
            r0 = r8
            g31 r0 = (defpackage.g31) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            g31 r0 = new g31
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            psa r6 = r0.b
            f31 r7 = r0.a
            defpackage.hre.r(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L36
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L33:
            defpackage.hre.r(r8)
        L36:
            boolean r8 = r7.k()
            if (r8 != 0) goto L58
            zma r8 = r6.f()
            ly0 r1 = r7.b()
            long r3 = r1.c
            r8.z0(r7, r3)
            r0.a = r6
            r0.b = r7
            r0.d = r2
            java.lang.Object r8 = defpackage.nae.m(r6, r0)
            n82 r1 = defpackage.n82.a
            if (r8 != r1) goto L36
            return r1
        L58:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gae.r(f31, psa, n42):java.lang.Object");
    }

    public static final rwa s(m82 m82Var, d82 d82Var, lu4 lu4Var) {
        m82Var.getClass();
        d82Var.getClass();
        i11 i11Var = new i11(false);
        iya v = z87.v(m82Var, d82Var, null, new r9(lu4Var, i11Var, null, 5), 2);
        v.invokeOnCompletion(new t11(i11Var, 1));
        return new rwa(12, i11Var, v);
    }

    public static /* synthetic */ rwa t(m82 m82Var, d82 d82Var, lu4 lu4Var, int i) {
        if ((i & 1) != 0) {
            d82Var = gs3.a;
        }
        return s(m82Var, d82Var, lu4Var);
    }

    public static void u(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void v(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        y(jArr4, jArr2, jArr3);
        w(jArr4);
        u(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void w(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void x(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j8 = jArr2[6];
        long j9 = jArr2[7];
        long j10 = jArr2[8];
        long j11 = (((((j5 * j7) + (j3 * j9)) * 2) + (j * j10) + (j4 * j8)) * 2) + (j6 * j6);
        long j12 = jArr2[9];
        long j13 = (((((j5 * j12) + (j7 * j9)) * 2) + (j6 * j10)) * 2) + (j8 * j8);
        long[] jArr3 = {j * j, j2 * j3, ((j * j4) + (j3 * j3)) * 2, ((j * j5) + (j3 * j4)) * 2, (j2 * j6) + (j3 * 4 * j5) + (j4 * j4), ((j * j7) + (j3 * j6) + (j4 * j5)) * 2, ((j3 * 2 * j7) + (j * j8) + (j4 * j6) + (j5 * j5)) * 2, ((j * j9) + (j3 * j8) + (j4 * j7) + (j5 * j6)) * 2, j11, ((j * j12) + (j3 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, ((((j3 * j12) + (j5 * j9)) * 2) + (j4 * j10) + (j6 * j8) + (j7 * j7)) * 2, ((j4 * j12) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, j13, ((j6 * j12) + (j7 * j10) + (j8 * j9)) * 2, ((j7 * 2 * j12) + (j8 * j10) + (j9 * j9)) * 2, ((j8 * j12) + (j9 * j10)) * 2, (j9 * 4 * j12) + (j10 * j10), j10 * 2 * j12, 2 * j12 * j12};
        w(jArr3);
        u(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void y(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr3[0];
        jArr[1] = (j2 * j3) + (jArr3[1] * j);
        long j4 = jArr2[1];
        long j5 = jArr3[1];
        jArr[2] = (jArr2[2] * j3) + (jArr3[2] * j) + (j4 * 2 * j5);
        long j6 = jArr3[2];
        long j7 = jArr2[2];
        jArr[3] = (jArr2[3] * j3) + (jArr3[3] * j) + (j7 * j5) + (j4 * j6);
        long j8 = jArr3[3];
        long j9 = jArr2[3];
        long j10 = jArr2[4] * j3;
        jArr[4] = j10 + (jArr3[4] * j) + (((j9 * j5) + (j4 * j8)) * 2) + (j7 * j6);
        long j11 = jArr3[4];
        long j12 = (j4 * j11) + (j9 * j6) + (j7 * j8);
        long j13 = jArr2[4];
        jArr[5] = (jArr2[5] * j3) + (jArr3[5] * j) + (j13 * j5) + j12;
        long j14 = jArr3[5];
        long j15 = (j4 * j14) + (j9 * j8);
        long j16 = jArr2[5];
        jArr[6] = (jArr2[6] * j3) + (jArr3[6] * j) + (j13 * j6) + (j7 * j11) + (((j16 * j5) + j15) * 2);
        long j17 = (j16 * j6) + (j7 * j14) + (j13 * j8) + (j9 * j11);
        long j18 = jArr3[6];
        long j19 = (j4 * j18) + j17;
        long j20 = jArr2[6];
        jArr[7] = (jArr2[7] * j3) + (jArr3[7] * j) + (j20 * j5) + j19;
        long j21 = jArr3[7];
        long j22 = (j4 * j21) + (j16 * j8) + (j9 * j14);
        long j23 = jArr2[7];
        long j24 = j20 * j6;
        jArr[8] = (jArr2[8] * j3) + (jArr3[8] * j) + j24 + (j7 * j18) + (((j23 * j5) + j22) * 2) + (j13 * j11);
        long j25 = (j23 * j6) + (j7 * j21) + (j20 * j8) + (j9 * j18) + (j16 * j11) + (j13 * j14);
        long j26 = jArr3[8];
        long j27 = (j4 * j26) + j25;
        long j28 = jArr2[8];
        long j29 = (j28 * j5) + j27;
        jArr[9] = (jArr2[9] * j3) + (j * jArr3[9]) + j29;
        long j30 = (j23 * j8) + (j9 * j21) + (j16 * j14);
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = j13 * j18;
        long j34 = j20 * j11;
        jArr[10] = (j28 * j6) + (j7 * j26) + j34 + j33 + (((j5 * j32) + (j4 * j31) + j30) * 2);
        long j35 = j7 * j31;
        long j36 = j6 * j32;
        jArr[11] = j36 + j35 + (j28 * j8) + (j9 * j26) + (j23 * j11) + (j13 * j21) + (j20 * j14) + (j16 * j18);
        long j37 = j9 * j31;
        long j38 = j8 * j32;
        long j39 = j28 * j11;
        jArr[12] = j39 + (j13 * j26) + ((j38 + j37 + (j23 * j14) + (j16 * j21)) * 2) + (j20 * j18);
        long j40 = j13 * j31;
        long j41 = j11 * j32;
        jArr[13] = j41 + j40 + (j28 * j14) + (j16 * j26) + (j23 * j18) + (j20 * j21);
        long j42 = j14 * j32;
        long j43 = j20 * j26;
        long j44 = j28 * j18;
        jArr[14] = j44 + j43 + ((j42 + (j16 * j31) + (j23 * j21)) * 2);
        long j45 = j20 * j31;
        long j46 = j18 * j32;
        jArr[15] = j46 + j45 + (j28 * j21) + (j23 * j26);
        jArr[16] = (((j21 * j32) + (j23 * j31)) * 2) + (j28 * j26);
        jArr[17] = (j26 * j32) + (j28 * j31);
        jArr[18] = j32 * 2 * j31;
    }

    public static void z(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }
}
