package defpackage;

import com.vbook.android.R;
import java.io.IOException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j55  reason: default package */
/* loaded from: classes.dex */
public final class j55 implements dj1, vh3, jc6, kg9, osb, nw6, z21, y22, vs3, bed, pxa {
    public final /* synthetic */ int a;
    public static final j55 b = new j55(1);
    public static final /* synthetic */ j55 c = new j55(2);
    public static final j55 d = new j55(3);
    public static final j55 e = new j55(4);
    public static final rk9 f = new rk9(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final j55 C = new j55(6);
    public static final /* synthetic */ j55 D = new j55(7);
    public static final qv2 E = new Object();
    public static final j55 F = new j55(8);
    public static final j55 G = new j55(9);
    public static final j55 H = new j55(10);
    public static final j55 I = new j55(11);
    public static final j55 J = new j55(12);
    public static final j55 K = new j55(13);

    public /* synthetic */ j55(int i) {
        this.a = i;
    }

    public static double A(kfc kfcVar, double d2, double d3) {
        return dce.l(v(kfcVar.a, kfcVar.b, 0.0d, false), d2, d3);
    }

    public static boolean B(int i, vh1 vh1Var, Object obj) {
        int i2 = vh1Var.b;
        xb1 xb1Var = (xb1) vh1Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                vh1Var.R0(5);
                                ((x8e) obj).c(5 | (i3 << 3), Integer.valueOf(xb1Var.W()));
                                return true;
                            }
                            throw w7e.a();
                        } else if (i != 0) {
                            return false;
                        } else {
                            throw new IOException("Protocol message end-group tag did not match expected tag.");
                        }
                    }
                    x8e e2 = x8e.e();
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 < 100) {
                        while (vh1Var.U0() != Integer.MAX_VALUE && B(i7, vh1Var, e2)) {
                        }
                        if (i6 == vh1Var.b) {
                            if (e2.e) {
                                e2.e = false;
                            }
                            ((x8e) obj).c(i5 | 3, e2);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((x8e) obj).c((i3 << 3) | 2, vh1Var.k1());
                return true;
            }
            vh1Var.R0(1);
            ((x8e) obj).c((i3 << 3) | 1, Long.valueOf(xb1Var.c0()));
            return true;
        }
        vh1Var.R0(0);
        ((x8e) obj).c(i3 << 3, Long.valueOf(xb1Var.d0()));
        return true;
    }

    public static x8e C(Object obj) {
        m7e m7eVar = (m7e) obj;
        x8e x8eVar = m7eVar.zzb;
        if (x8eVar == x8e.f) {
            x8e e2 = x8e.e();
            m7eVar.zzb = e2;
            return e2;
        }
        return x8eVar;
    }

    public static final y52 l(double d2) {
        if (d2 == 1.5d) {
            return new y52(1.5d, 1.5d, 3.0d, 5.5d);
        }
        if (d2 == 3.0d) {
            return new y52(3.0d, 3.0d, 4.5d, 7.0d);
        }
        if (d2 == 4.5d) {
            return new y52(4.5d, 4.5d, 7.0d, 11.0d);
        }
        if (d2 == 6.0d) {
            return new y52(6.0d, 6.0d, 7.0d, 11.0d);
        }
        if (d2 == 7.0d) {
            return new y52(7.0d, 7.0d, 11.0d, 21.0d);
        }
        if (d2 == 9.0d) {
            return new y52(9.0d, 9.0d, 11.0d, 21.0d);
        }
        if (d2 == 11.0d) {
            return new y52(11.0d, 11.0d, 21.0d, 21.0d);
        }
        if (d2 == 21.0d) {
            return new y52(21.0d, 21.0d, 21.0d, 21.0d);
        }
        return new y52(d2, d2, 7.0d, 21.0d);
    }

    public static final double r(i45 i45Var, boolean z, rm3 rm3Var) {
        int i;
        double x = x(i45Var);
        if (rm3Var == rm3.c) {
            if (z) {
                if (x >= 105.0d && x < 125.0d) {
                    i = 6;
                } else {
                    i = 14;
                }
            } else {
                i = 18;
            }
        } else {
            i = 12;
        }
        return i;
    }

    public static final double s(i45 i45Var, rm3 rm3Var) {
        double y = y(i45Var);
        int i = 28;
        if (rm3Var != rm3.c && (y < 250.0d || y >= 270.0d)) {
            i = 20;
        }
        return i;
    }

    public static final boolean t(byte b2) {
        int i = b2 & 255;
        if (i != 234 && i != 237 && i != 239 && i != 243 && i != 245) {
            return false;
        }
        return true;
    }

    public static hrb u(int i, rv4 rv4Var) {
        return w(((h27) rv4Var.j(j27.a)).a, rv4Var);
    }

    public static double v(double d2, double d3, double d4, boolean z) {
        double d5;
        i45 i = rqe.i(d2, d3, d4);
        double d6 = d4;
        while (true) {
            double d7 = i.c;
            if (d7 >= d3 || 0.0d > d4 || d4 > 100.0d) {
                break;
            }
            if (z) {
                d5 = -1.0d;
            } else {
                d5 = 1.0d;
            }
            d4 += d5;
            i45 i2 = rqe.i(d2, d3, d4);
            if (d7 < i2.c) {
                d6 = d4;
                i = i2;
            }
        }
        return d6;
    }

    public static hrb w(pm1 pm1Var, rv4 rv4Var) {
        boolean z;
        hrb hrbVar = pm1Var.j0;
        if (hrbVar == null) {
            rv4Var.e0(390452338);
            rv4Var.q(false);
            hrbVar = null;
            z = false;
        } else {
            rv4Var.e0(390452339);
            wxb wxbVar = (wxb) rv4Var.j(xxb.a);
            if (c16.i(hrbVar.k, wxbVar)) {
                z = false;
            } else {
                hrbVar = hrbVar.a(hrbVar.a, hrbVar.b, hrbVar.c, hrbVar.d, hrbVar.e, hrbVar.f, hrbVar.g, hrbVar.h, hrbVar.i, hrbVar.j, wxbVar, hrbVar.l, hrbVar.m, hrbVar.n, hrbVar.o, hrbVar.p, hrbVar.q, hrbVar.r, hrbVar.s, hrbVar.t, hrbVar.u, hrbVar.v, hrbVar.w, hrbVar.x, hrbVar.y, hrbVar.z, hrbVar.A, hrbVar.B, hrbVar.C, hrbVar.D, hrbVar.E, hrbVar.F, hrbVar.G, hrbVar.H, hrbVar.I, hrbVar.J, hrbVar.K, hrbVar.L, hrbVar.M, hrbVar.N, hrbVar.O, hrbVar.P, hrbVar.Q);
                pm1Var.j0 = hrbVar;
                z = false;
            }
            rv4Var.q(z);
        }
        if (hrbVar == null) {
            rv4Var.e0(-1788321191);
            long d2 = rm1.d(pm1Var, xbe.R);
            long d3 = rm1.d(pm1Var, xbe.X);
            qm1 qm1Var = xbe.E;
            long b2 = zl1.b(0.38f, rm1.d(pm1Var, qm1Var));
            long d4 = rm1.d(pm1Var, xbe.L);
            long j = zl1.h;
            long d5 = rm1.d(pm1Var, xbe.C);
            long d6 = rm1.d(pm1Var, xbe.K);
            wxb wxbVar2 = (wxb) rv4Var.j(xxb.a);
            long d7 = rm1.d(pm1Var, xbe.U);
            long d8 = rm1.d(pm1Var, xbe.d0);
            long b3 = zl1.b(0.12f, rm1.d(pm1Var, xbe.H));
            long d9 = rm1.d(pm1Var, xbe.O);
            long d10 = rm1.d(pm1Var, xbe.T);
            long d11 = rm1.d(pm1Var, xbe.c0);
            long b4 = zl1.b(0.38f, rm1.d(pm1Var, xbe.G));
            long d12 = rm1.d(pm1Var, xbe.N);
            long d13 = rm1.d(pm1Var, xbe.W);
            long d14 = rm1.d(pm1Var, xbe.f0);
            long b5 = zl1.b(0.38f, rm1.d(pm1Var, xbe.J));
            long d15 = rm1.d(pm1Var, xbe.Q);
            long d16 = rm1.d(pm1Var, xbe.S);
            long d17 = rm1.d(pm1Var, xbe.b0);
            long b6 = zl1.b(0.38f, rm1.d(pm1Var, xbe.F));
            long d18 = rm1.d(pm1Var, xbe.M);
            qm1 qm1Var2 = xbe.Y;
            long d19 = rm1.d(pm1Var, qm1Var2);
            long d20 = rm1.d(pm1Var, qm1Var2);
            long b7 = zl1.b(0.38f, rm1.d(pm1Var, qm1Var));
            long d21 = rm1.d(pm1Var, qm1Var2);
            long d22 = rm1.d(pm1Var, xbe.V);
            long d23 = rm1.d(pm1Var, xbe.e0);
            long b8 = zl1.b(0.38f, rm1.d(pm1Var, xbe.I));
            long d24 = rm1.d(pm1Var, xbe.P);
            qm1 qm1Var3 = xbe.Z;
            long d25 = rm1.d(pm1Var, qm1Var3);
            long d26 = rm1.d(pm1Var, qm1Var3);
            long b9 = zl1.b(0.38f, rm1.d(pm1Var, qm1Var3));
            long d27 = rm1.d(pm1Var, qm1Var3);
            qm1 qm1Var4 = xbe.a0;
            hrbVar = new hrb(d2, d3, b2, d4, j, j, j, j, d5, d6, wxbVar2, d7, d8, b3, d9, d10, d11, b4, d12, d13, d14, b5, d15, d16, d17, b6, d18, d19, d20, b7, d21, d22, d23, b8, d24, d25, d26, b9, d27, rm1.d(pm1Var, qm1Var4), rm1.d(pm1Var, qm1Var4), zl1.b(0.38f, rm1.d(pm1Var, qm1Var4)), rm1.d(pm1Var, qm1Var4));
            pm1Var.j0 = hrbVar;
        } else {
            rv4Var.e0(-1788515437);
        }
        rv4Var.q(z);
        return hrbVar;
    }

    public static double x(i45 i45Var) {
        return que.u(i45Var, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    public static double y(i45 i45Var) {
        return que.u(i45Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    public static double z(kfc kfcVar, double d2, double d3) {
        return dce.l(v(kfcVar.a, kfcVar.b * 1.0d, 100.0d, true), d2, d3);
    }

    @Override // defpackage.z21
    public byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(final boolean r25, final boolean r26, final defpackage.gz5 r27, defpackage.nq7 r28, final defpackage.hrb r29, final defpackage.wea r30, float r31, float r32, defpackage.rv4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j55.b(boolean, boolean, gz5, nq7, hrb, wea, float, float, rv4, int, int):void");
    }

    @Override // defpackage.pxa
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // defpackage.y22
    public long e(long j, long j2) {
        float b2 = mna.b(j2) / mna.b(j);
        return mz9.a(b2, b2);
    }

    @Override // defpackage.vh3
    public Object f(d19 d19Var, kj3 kj3Var, lj3 lj3Var, lj3 lj3Var2, lu4 lu4Var, zsa zsaVar) {
        Object h = mi3.h(d19Var, kj3Var, lj3Var, lj3Var2, lu4Var, zsaVar);
        if (h == n82.a) {
            return h;
        }
        return pvc.a;
    }

    @Override // defpackage.vs3
    public f31 g(f31 f31Var, d82 d82Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // defpackage.jc6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.p15 r8, defpackage.m42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.kc6
            if (r0 == 0) goto L13
            r0 = r9
            kc6 r0 = (defpackage.kc6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            kc6 r0 = new kc6
            n42 r9 = (defpackage.n42) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r7 = r0.b
            int r9 = r0.d
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L33
            if (r9 != r1) goto L2d
            android.media.ImageReader r8 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L2a
            goto L9a
        L2a:
            r7 = move-exception
            goto Lac
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L33:
            defpackage.hre.r(r7)
            long r3 = r8.u
            android.os.Looper r7 = android.os.Looper.myLooper()
            if (r7 != 0) goto L42
            android.os.Looper r7 = android.os.Looper.getMainLooper()
        L42:
            r9 = 32
            long r5 = r3 >> r9
            int r9 = (int) r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            android.media.ImageReader r9 = android.media.ImageReader.newInstance(r9, r3, r1, r1)
            r0.a = r9     // Catch: java.lang.Throwable -> La4
            r0.d = r1     // Catch: java.lang.Throwable -> La4
            f61 r3 = new f61     // Catch: java.lang.Throwable -> La4
            m42 r0 = defpackage.w92.t(r0)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> La4
            r3.u()     // Catch: java.lang.Throwable -> La4
            lc6 r0 = new lc6     // Catch: java.lang.Throwable -> La4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La4
            android.os.Handler r7 = defpackage.cqe.f(r7)     // Catch: java.lang.Throwable -> La4
            r9.setOnImageAvailableListener(r0, r7)     // Catch: java.lang.Throwable -> La4
            android.view.Surface r7 = r9.getSurface()     // Catch: java.lang.Throwable -> La4
            android.graphics.Canvas r0 = r7.lockHardwareCanvas()     // Catch: java.lang.Throwable -> La4
            long r4 = defpackage.zl1.b     // Catch: java.lang.Throwable -> La7
            int r1 = defpackage.sve.x(r4)     // Catch: java.lang.Throwable -> La7
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> La7
            r0.drawColor(r1, r4)     // Catch: java.lang.Throwable -> La7
            android.graphics.Canvas r1 = defpackage.tf.a     // Catch: java.lang.Throwable -> La7
            sf r1 = new sf     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            r1.a = r0     // Catch: java.lang.Throwable -> La7
            r8.c(r1, r2)     // Catch: java.lang.Throwable -> La7
            r7.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r7 = r3.s()     // Catch: java.lang.Throwable -> La4
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L99
            return r8
        L99:
            r8 = r9
        L9a:
            android.media.Image r7 = (android.media.Image) r7     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r7 = defpackage.jbe.j(r7)     // Catch: java.lang.Throwable -> L2a
            defpackage.dxe.r(r8, r2)
            return r7
        La4:
            r7 = move-exception
            r8 = r9
            goto Lac
        La7:
            r8 = move-exception
            r7.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> La4
            throw r8     // Catch: java.lang.Throwable -> La4
        Lac:
            throw r7     // Catch: java.lang.Throwable -> Lad
        Lad:
            r9 = move-exception
            defpackage.dxe.r(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j55.i(p15, m42):java.lang.Object");
    }

    public void k(final String str, final lu4 lu4Var, final boolean z, final boolean z2, final ted tedVar, final gz5 gz5Var, final boolean z3, final lu4 lu4Var2, final lu4 lu4Var3, final lu4 lu4Var4, final lu4 lu4Var5, final hrb hrbVar, rh8 rh8Var, final tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        boolean z6;
        final rh8 rh8Var2;
        th8 th8Var;
        int i6;
        boolean z7;
        tu1 tu1Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        rv4Var.g0(-1732281618);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i2 = i16 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(lu4Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i2 |= i15;
        }
        if ((i & 384) == 0) {
            z4 = z;
            if (rv4Var.g(z4)) {
                i14 = 256;
            } else {
                i14 = Token.CASE;
            }
            i2 |= i14;
        } else {
            z4 = z;
        }
        int i17 = 2048;
        if ((i & 3072) == 0) {
            z5 = z2;
            if (rv4Var.g(z5)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i2 |= i13;
        } else {
            z5 = z2;
        }
        int i18 = 8192;
        if ((i & 24576) == 0) {
            if (rv4Var.f(tedVar)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i2 |= i12;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(gz5Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i2 |= i11;
        }
        if ((i & 1572864) == 0) {
            if (rv4Var.g(z3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i2 |= i10;
        }
        if ((i & 12582912) == 0) {
            if (rv4Var.h(lu4Var2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i2 |= i9;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var.h(lu4Var3)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i2 |= i8;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.h(lu4Var4)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i2 |= i7;
        }
        if (rv4Var.h(lu4Var5)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i19 = 14155776 | i3;
        if (rv4Var.h(null)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i20 = i19 | i4;
        if (rv4Var.h(null)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i21 = i20 | i5;
        if (!rv4Var.h(null)) {
            i17 = 1024;
        }
        int i22 = i21 | i17;
        if (rv4Var.f(hrbVar)) {
            i18 = 16384;
        }
        int i23 = i22 | i18 | Parser.ARGC_LIMIT;
        boolean z8 = true;
        if ((i2 & 306783379) == 306783378 && (i23 & 4793491) == 4793490) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (rv4Var.U(i2 & 1, z6)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i6 = i23 & (-458753);
                th8Var = rh8Var;
            } else {
                th8Var = new th8(16.0f, 16.0f, 16.0f, 16.0f);
                i6 = i23 & (-458753);
            }
            rv4Var.r();
            if ((i2 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i24 = i6;
            if ((i2 & 57344) != 16384) {
                z8 = false;
            }
            boolean z9 = z7 | z8;
            Object P = rv4Var.P();
            if (z9 || P == ax1.a) {
                P = tedVar.a(new ps(str));
                rv4Var.o0(P);
            }
            String str2 = ((ikc) P).a.b;
            isb isbVar = new isb();
            if (lu4Var2 == null) {
                rv4Var.e0(1927042940);
                rv4Var.q(false);
                tu1Var2 = null;
            } else {
                rv4Var.e0(1927042941);
                tu1 E2 = jce.E(-1459717586, new pl7(lu4Var2, 4), rv4Var);
                rv4Var.q(false);
                tu1Var2 = E2;
            }
            int i25 = i2 >> 9;
            int i26 = i24 << 21;
            tu1 tu1Var3 = tu1Var2;
            boolean z10 = z5;
            dxe.a(str2, lu4Var, isbVar, tu1Var3, lu4Var3, lu4Var4, lu4Var5, z10, z4, z3, gz5Var, th8Var, hrbVar, tu1Var, rv4Var, ((i2 << 3) & 896) | 6 | (i25 & 458752) | (i25 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192), (i2 & 896) | ((i24 >> 9) & 14) | ((i2 >> 6) & Token.ASSIGN_MOD) | (i25 & 7168) | ((i2 >> 3) & 57344) | ((i24 << 6) & 3670016) | 12582912);
            rh8Var2 = th8Var;
        } else {
            rv4Var.X();
            rh8Var2 = rh8Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: zf8
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i | 1);
                    j55.this.k(str, lu4Var, z, z2, tedVar, gz5Var, z3, lu4Var2, lu4Var3, lu4Var4, lu4Var5, hrbVar, rh8Var2, tu1Var, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    @Override // defpackage.nw6
    public void m(String str) {
        str.getClass();
        if (jy.a()) {
            kw6 kw6Var = kw6.b;
            iea ieaVar = iea.b;
            if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                kw6Var.a(ieaVar, "Log", str, null);
            }
        }
    }

    @Override // defpackage.bed
    public int n() {
        return R.id.view_tree_view_model_store_owner;
    }

    @Override // defpackage.vs3
    public s11 o(s11 s11Var, d82 d82Var) {
        throw null;
    }

    @Override // defpackage.vs3
    public s11 p(s11 s11Var, d82 d82Var) {
        throw null;
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        switch (this.a) {
            case 1:
                re5Var.getClass();
                lie lieVar = new lie(3, "ObservableContent", false);
                ah5 ah5Var = re5Var.d;
                ah5Var.f(ah5.m, lieVar);
                ah5Var.g(lieVar, new y8((mu4) aabVar, null, 0));
                return;
            case 10:
                re5Var.getClass();
                re5Var.C.g(ah5.h, new w8((mu4) aabVar, null, 6));
                return;
            default:
                re5Var.getClass();
                re5Var.d.g(ah5.j, new me((lu4) aabVar, (m42) null, 8));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kg9
    public float c(float f2) {
        return f2;
    }

    @Override // defpackage.kg9
    public float h(float f2) {
        return f2;
    }
}
