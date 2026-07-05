package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq9  reason: default package */
/* loaded from: classes.dex */
public final class mq9 implements kx5, r13, vx1 {
    public wu7 C;
    public wu7 D;
    public wu7 E;
    public long F;
    public int G;
    public xr H;
    public xr I;
    public rwa J;
    public float a;
    public w5b b;
    public x5b c;
    public x5b d;
    public x5b e;
    public x5b f;

    @Override // defpackage.r13
    public final float G0() {
        return 1.0f;
    }

    @Override // defpackage.vx1
    public final Object N0(f99 f99Var) {
        w5b w5bVar = this.b;
        w5bVar.getClass();
        return nye.q(w5bVar, f99Var);
    }

    public final void a(long j) {
        int i;
        n((byte) 34, this.H, this.I);
        xr xrVar = this.H;
        xr xrVar2 = this.I;
        mxc mxcVar = mxc.a;
        if (xrVar == mxcVar) {
            if ((this.G & 2) != 0) {
                wu7 wu7Var = this.C;
                if (wu7Var == null || (xrVar = (xr) wu7Var.b(51)) == null) {
                    xrVar = nq9.a;
                }
            } else {
                xrVar = null;
            }
        }
        if (xrVar2 == mxcVar) {
            if ((this.G & 2) != 0) {
                wu7 wu7Var2 = this.D;
                if (wu7Var2 == null || (xrVar2 = (xr) wu7Var2.b(51)) == null) {
                    xrVar2 = nq9.a;
                }
            } else {
                xrVar2 = null;
            }
        }
        if (xrVar != null && xrVar2 != null) {
            i = this.G | 2;
        } else {
            i = this.G & (-3);
        }
        this.G = i;
        o(51, xrVar, xrVar2);
        x5b x5bVar = this.c;
        if (x5bVar != null) {
            x5bVar.b(j);
        }
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r3 != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq9.j():void");
    }

    public final int m() {
        int i;
        rwa rwaVar = this.J;
        int i2 = 0;
        if (rwaVar == null) {
            return 0;
        }
        wu7 wu7Var = (wu7) rwaVar.c;
        int[] iArr = wu7Var.b;
        Object[] objArr = wu7Var.c;
        long[] jArr = wu7Var.a;
        int length = jArr.length - 2;
        long j = 0;
        if (length >= 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            o5b o5bVar = (o5b) objArr[i6];
                            if (i7 < 50) {
                                j |= 1 << ((byte) i7);
                            } else {
                                i |= 1 << (i7 - 50);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    i2 = i;
                    break;
                }
            }
        }
        i = i2;
        return y5b.e(i) | y5b.g(j);
    }

    public final void n(byte b, xr xrVar, xr xrVar2) {
        long j;
        mxc mxcVar = mxc.a;
        if (xrVar == mxcVar) {
            long j2 = this.F;
            if (b < 50 && (j2 & (1 << b)) != 0) {
                wu7 wu7Var = this.C;
                if (wu7Var == null || (xrVar = (xr) wu7Var.b(b)) == null) {
                    xrVar = nq9.a;
                }
            } else {
                xrVar = null;
            }
        }
        if (xrVar2 == mxcVar) {
            long j3 = this.F;
            if (b < 50 && (j3 & (1 << b)) != 0) {
                wu7 wu7Var2 = this.D;
                if (wu7Var2 == null || (xrVar2 = (xr) wu7Var2.b(b)) == null) {
                    xrVar2 = nq9.a;
                }
            } else {
                xrVar2 = null;
            }
        }
        if (xrVar != null && xrVar2 != null) {
            j = this.F | (1 << b);
        } else {
            j = this.F & (~(1 << b));
        }
        this.F = j;
        o(b, xrVar, xrVar2);
    }

    public final void o(int i, xr xrVar, xr xrVar2) {
        if (xrVar != null && !xrVar.equals(nq9.a)) {
            wu7 wu7Var = this.C;
            if (wu7Var == null) {
                wu7 wu7Var2 = oy5.a;
                wu7Var = new wu7();
                this.C = wu7Var;
            }
            wu7Var.i(i, xrVar);
        } else {
            wu7 wu7Var3 = this.C;
            if (wu7Var3 != null) {
                xr xrVar3 = (xr) wu7Var3.g(i);
            }
        }
        if (xrVar2 != null && !xrVar2.equals(nq9.a)) {
            wu7 wu7Var4 = this.D;
            if (wu7Var4 == null) {
                wu7 wu7Var5 = oy5.a;
                wu7Var4 = new wu7();
                this.D = wu7Var4;
            }
            wu7Var4.i(i, xrVar2);
            return;
        }
        wu7 wu7Var6 = this.D;
        if (wu7Var6 != null) {
            xr xrVar4 = (xr) wu7Var6.b(i);
            wu7Var6.g(i);
            if (xrVar4 != null) {
                wu7 wu7Var7 = this.E;
                if (wu7Var7 == null) {
                    wu7 wu7Var8 = oy5.a;
                    wu7Var7 = new wu7();
                    this.E = wu7Var7;
                }
                wu7Var7.i(i, xrVar4);
            }
        }
    }

    public final void p(int i, x5b x5bVar) {
        int i2;
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        x5b x5bVar2 = this.c;
        if (x5bVar2 == null) {
            x5bVar2 = y5b.n;
        }
        x5b x5bVar3 = x5bVar2;
        x5bVar3.f(x5bVar);
        rwa rwaVar = this.J;
        if (rwaVar != null) {
            x5b x5bVar4 = this.f;
            if (x5bVar4 != null || (x5bVar4 = this.d) != null) {
                x5b x5bVar5 = x5bVar4;
                synchronized (rwaVar.b) {
                    i2 = 0;
                    if (((wu7) rwaVar.c).e == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.f = null;
                    this.J = null;
                    return;
                }
                int i8 = i & 1;
                if (i8 != 0) {
                    j = y5b.b;
                } else {
                    j = 0;
                }
                int i9 = i & 8;
                if (i9 != 0) {
                    j2 = y5b.c;
                } else {
                    j2 = 0;
                }
                long j7 = j | j2;
                int i10 = i & 2;
                if (i10 != 0) {
                    j3 = y5b.d;
                } else {
                    j3 = 0;
                }
                long j8 = j7 | j3;
                int i11 = i & 4;
                if (i11 != 0) {
                    j4 = y5b.e;
                } else {
                    j4 = 0;
                }
                long j9 = j8 | j4;
                int i12 = i & 32;
                if (i12 != 0) {
                    j5 = y5b.f;
                } else {
                    j5 = 0;
                }
                long j10 = j9 | j5;
                int i13 = i & 16;
                if (i13 != 0) {
                    j6 = y5b.g;
                } else {
                    j6 = 0;
                }
                long j11 = j10 | j6;
                if (i8 != 0) {
                    i3 = y5b.h;
                } else {
                    i3 = 0;
                }
                if (i9 != 0) {
                    i4 = y5b.i;
                } else {
                    i4 = 0;
                }
                int i14 = i3 | i4;
                if (i10 != 0) {
                    i5 = y5b.j;
                } else {
                    i5 = 0;
                }
                int i15 = i14 | i5;
                if (i11 != 0) {
                    i6 = y5b.k;
                } else {
                    i6 = 0;
                }
                int i16 = i15 | i6;
                if (i12 != 0) {
                    i7 = y5b.l;
                } else {
                    i7 = 0;
                }
                int i17 = i16 | i7;
                if (i13 != 0) {
                    i2 = y5b.m;
                }
                long l = rwaVar.l();
                int i18 = (int) (l >> 50);
                long i19 = y5b.i(i18, 2251799813685247L & l) & j11;
                int h = y5b.h(i18, i19) & (i17 | i2);
                if (i19 == 0 && h == 0) {
                    return;
                }
                y5b.a(x5bVar5, x5bVar3, rwaVar, i19, h, x5bVar);
            }
        }
    }
}
