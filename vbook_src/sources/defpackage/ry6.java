package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ry6  reason: default package */
/* loaded from: classes.dex */
public abstract class ry6 extends mw8 implements qr7, xg8, e37 {
    public xt4 C;
    public lu4 D;
    public xt4 E;
    public ow8 F;
    public tv7 G;
    public boolean H;
    public tv7 I;
    public boolean J;
    public boolean K;
    public final sy6 L = new sy6(this, 0);
    public t6f M;
    public tv7 N;
    public oy6 f;

    public static void j1(i38 i38Var) {
        od6 od6Var;
        pd6 pd6Var;
        i38 i38Var2 = i38Var.R;
        od6 od6Var2 = i38Var.O;
        if (i38Var2 != null) {
            od6Var = i38Var2.O;
        } else {
            od6Var = null;
        }
        if (!c16.i(od6Var, od6Var2)) {
            od6Var2.d0.p.U.f();
            return;
        }
        kc p = od6Var2.d0.p.p();
        if (p != null && (pd6Var = ((a37) p).U) != null) {
            pd6Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(defpackage.od6 r32, defpackage.u95 r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry6.H0(od6, u95):void");
    }

    @Override // defpackage.u06
    public boolean I0() {
        return false;
    }

    public abstract int M0(ec ecVar);

    public final void N0(ow8 ow8Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        od6 od6Var;
        boolean z2;
        long j6;
        int i;
        ry6 ry6Var;
        uv7 uv7Var;
        yg8 snapshotObserver;
        tv7 tv7Var = this.N;
        t6f t6fVar = this.M;
        if (t6fVar == null) {
            t6fVar = new t6f(7);
            this.M = t6fVar;
        }
        t6f t6fVar2 = t6fVar;
        wg8 wg8Var = U0().K;
        if (wg8Var != null && (snapshotObserver = ((rg) wg8Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(ow8Var, vt3.G, new py6(this, j, j2, ow8Var));
        }
        boolean I0 = I0();
        uv7 uv7Var2 = (uv7) t6fVar2.f;
        uv7 uv7Var3 = (uv7) t6fVar2.C;
        int i2 = t6fVar2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) t6fVar2.e)[i3];
            if (b == 3) {
                u95 u95Var = ((u95[]) t6fVar2.c)[i3];
                u95Var.getClass();
                uv7Var3.k(u95Var);
            } else if (b != 0 && tv7Var != null) {
                u95 u95Var2 = ((u95[]) t6fVar2.c)[i3];
                u95Var2.getClass();
                uv7 uv7Var4 = (uv7) tv7Var.l(u95Var2);
                if (uv7Var4 != null) {
                    uv7Var2.j(uv7Var4);
                }
            }
        }
        int i4 = t6fVar2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) t6fVar2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                u95[] u95VarArr = (u95[]) t6fVar2.c;
                u95VarArr[i6 - i5] = u95VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = t6fVar2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((u95[]) t6fVar2.c)[i8] = null;
        }
        t6fVar2.b -= i5;
        ry6 a1 = a1();
        Object[] objArr = uv7Var3.b;
        long[] jArr = uv7Var3.a;
        int length = jArr.length - 2;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            c = 7;
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << 7) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            u95 u95Var3 = (u95) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (a1 == null) {
                                ry6Var = this;
                            } else {
                                ry6Var = a1;
                            }
                            i = i9;
                            ry6 ry6Var2 = ry6Var;
                            while (true) {
                                t6f t6fVar3 = ry6Var2.M;
                                if (t6fVar3 != null) {
                                    z2 = I0;
                                    if (b00.S(u95Var3, (u95[]) t6fVar3.c)) {
                                        break;
                                    }
                                } else {
                                    z2 = I0;
                                }
                                ry6 a12 = ry6Var2.a1();
                                if (a12 == null) {
                                    break;
                                }
                                ry6Var2 = a12;
                                I0 = z2;
                            }
                            tv7 tv7Var2 = ry6Var2.N;
                            if (tv7Var2 != null) {
                                uv7Var = (uv7) tv7Var2.l(u95Var3);
                            } else {
                                uv7Var = null;
                            }
                            if (uv7Var != null) {
                                ry6Var.l1(uv7Var);
                            }
                        } else {
                            z2 = I0;
                            j6 = j7;
                            i = i9;
                        }
                        j8 >>= i;
                        i12++;
                        i9 = i;
                        j7 = j6;
                        I0 = z2;
                    }
                    z = I0;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = I0;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                j7 = j3;
                I0 = z;
                i9 = 8;
            }
        } else {
            z = I0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        uv7Var3.b();
        Object[] objArr2 = uv7Var2.b;
        long[] jArr2 = uv7Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (od6Var = (od6) ((ofd) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                od6Var.X(false);
                            } else {
                                od6Var.Z(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                }
                i13++;
            }
        }
        uv7Var2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(defpackage.c37 r28) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry6.O0(c37):void");
    }

    public abstract ry6 P0();

    public abstract sc6 S0();

    public boolean T() {
        return U0().J();
    }

    public abstract boolean T0();

    public abstract od6 U0();

    public abstract c37 V0();

    @Override // defpackage.e37
    public final c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            lv5.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new vy(i, i2, map, xt4Var, xt4Var2, this, 1);
    }

    public abstract ry6 a1();

    @Override // defpackage.qr7
    public final void b0(boolean z) {
        od6 od6Var;
        kd6 kd6Var;
        ry6 a1 = a1();
        kd6 kd6Var2 = null;
        if (a1 != null) {
            od6Var = a1.U0();
        } else {
            od6Var = null;
        }
        if (c16.i(od6Var, U0())) {
            this.H = z;
            return;
        }
        if (od6Var != null) {
            kd6Var = od6Var.d0.d;
        } else {
            kd6Var = null;
        }
        if (kd6Var != kd6.c) {
            if (od6Var != null) {
                kd6Var2 = od6Var.d0.d;
            }
            if (kd6Var2 != kd6.d) {
                return;
            }
        }
        this.H = z;
    }

    public abstract long d1();

    @Override // defpackage.e37
    public final c37 i0(int i, int i2, jc jcVar, y0 y0Var, Map map, dg dgVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            lv5.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new qy6(i, i2, map, jcVar, y0Var, dgVar, this);
    }

    public final oy6 i1() {
        oy6 oy6Var = this.f;
        if (oy6Var == null) {
            oy6 oy6Var2 = new oy6(this);
            this.f = oy6Var2;
            return oy6Var2;
        }
        return oy6Var;
    }

    public final void l1(uv7 uv7Var) {
        od6 od6Var;
        Object[] objArr = uv7Var.b;
        long[] jArr = uv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (od6Var = (od6) ((ofd) objArr[(i << 3) + i3]).get()) != null) {
                            if (I0()) {
                                od6Var.X(false);
                            } else {
                                od6Var.Z(false);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void m1();

    @Override // defpackage.mw8
    public final int o0(ec ecVar) {
        int M0;
        long j;
        if (!T0() || (M0 = M0(ecVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = ecVar instanceof m5d;
        long j2 = this.e;
        if (z) {
            j = j2 >> 32;
        } else {
            j = 4294967295L & j2;
        }
        return M0 + ((int) j);
    }

    public final void o1() {
        t6f t6fVar = this.M;
        if (t6fVar != null) {
            int i = t6fVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((u95[]) t6fVar.c)[i2] = null;
                ((float[]) t6fVar.d)[i2] = Float.NaN;
                ((byte[]) t6fVar.e)[i2] = 0;
            }
            t6fVar.b = 0;
        }
        tv7 tv7Var = this.N;
        if (tv7Var == null) {
            return;
        }
        Object[] objArr = tv7Var.c;
        long[] jArr = tv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            l1((uv7) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        tv7Var.a();
    }
}
