package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz7  reason: default package */
/* loaded from: classes.dex */
public final class uz7 implements b37 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ lu4 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ uz7(vt4 vt4Var, lu4 lu4Var, boolean z, int i) {
        this.a = i;
        this.b = vt4Var;
        this.c = lu4Var;
        this.d = z;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        final float f;
        boolean z;
        boolean z2;
        Object obj;
        final mw8 mw8Var;
        final float f2;
        float f3;
        int i;
        int i2;
        boolean z3;
        final float f4;
        float f5;
        boolean z4;
        boolean z5;
        Object obj2;
        mw8 mw8Var2;
        final float f6;
        float f7;
        int i3;
        int i4;
        boolean z6;
        int i5 = this.a;
        vt4 vt4Var = this.b;
        boolean z7 = true;
        lu4 lu4Var = this.c;
        mw8 mw8Var3 = null;
        ls3 ls3Var = ls3.a;
        switch (i5) {
            case 0:
                float floatValue = ((Number) vt4Var.invoke()).floatValue();
                if (floatValue < nae.e) {
                    f = 0.0f;
                } else {
                    f = floatValue;
                }
                long b = x02.b(j, 0, 0, 0, 0, 10);
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    w27 w27Var = (w27) list.get(i6);
                    if (c16.i(bze.n(w27Var), "icon")) {
                        mw8 M = w27Var.M(b);
                        int X0 = e37Var.X0(vz7.d * 2.0f) + M.a;
                        int A = k27.A(X0 * f);
                        int X02 = e37Var.X0(vz7.e * 2.0f) + M.b;
                        int size2 = list.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            int i8 = size2;
                            w27 w27Var2 = (w27) list.get(i7);
                            int i9 = i7;
                            if (c16.i(bze.n(w27Var2), "indicatorRipple")) {
                                if (X0 >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (X02 >= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!(z & z2)) {
                                    nv5.a("width and height must be >= 0");
                                }
                                final mw8 M2 = w27Var2.M(y02.h(X0, X0, X02, X02));
                                int size3 = list.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size3) {
                                        obj = list.get(i10);
                                        if (!c16.i(bze.n((w27) obj), "indicator")) {
                                            i10++;
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                w27 w27Var3 = (w27) obj;
                                if (w27Var3 != null) {
                                    if (A >= 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (X02 < 0) {
                                        z7 = false;
                                    }
                                    if (!(z3 & z7)) {
                                        nv5.a("width and height must be >= 0");
                                    }
                                    mw8Var = w27Var3.M(y02.h(A, A, X02, X02));
                                } else {
                                    mw8Var = null;
                                }
                                if (lu4Var != null) {
                                    int size4 = list.size();
                                    for (int i11 = 0; i11 < size4; i11++) {
                                        w27 w27Var4 = (w27) list.get(i11);
                                        if (c16.i(bze.n(w27Var4), "label")) {
                                            mw8Var3 = w27Var4.M(b);
                                        }
                                    }
                                    throw a82.A("Collection contains no element matching the predicate.");
                                }
                                final mw8 mw8Var4 = mw8Var3;
                                if (lu4Var == null) {
                                    if (x02.i(j) == Integer.MAX_VALUE) {
                                        i2 = (e37Var.X0(vz7.g) * 2) + M.a;
                                    } else {
                                        i2 = x02.i(j);
                                    }
                                    final int i12 = i2;
                                    final int f8 = y02.f(e37Var.X0(vz7.a), j);
                                    final int i13 = (i12 - M.a) / 2;
                                    final int i14 = (f8 - M.b) / 2;
                                    final int i15 = (i12 - M2.a) / 2;
                                    final int i16 = (f8 - M2.b) / 2;
                                    final mw8 mw8Var5 = M;
                                    return e37Var.q0(i12, f8, ls3Var, new xt4() { // from class: sz7
                                        @Override // defpackage.xt4
                                        public final Object invoke(Object obj3) {
                                            int i17 = r10;
                                            pvc pvcVar = pvc.a;
                                            int i18 = f8;
                                            int i19 = i12;
                                            int i20 = i16;
                                            int i21 = i15;
                                            mw8 mw8Var6 = M2;
                                            int i22 = i14;
                                            int i23 = i13;
                                            mw8 mw8Var7 = mw8Var5;
                                            mw8 mw8Var8 = mw8Var;
                                            lw8 lw8Var = (lw8) obj3;
                                            switch (i17) {
                                                case 0:
                                                    if (mw8Var8 != null) {
                                                        lw8.z(lw8Var, mw8Var8, (i19 - mw8Var8.a) / 2, (i18 - mw8Var8.b) / 2);
                                                    }
                                                    lw8.z(lw8Var, mw8Var7, i23, i22);
                                                    lw8.z(lw8Var, mw8Var6, i21, i20);
                                                    return pvcVar;
                                                default:
                                                    if (mw8Var8 != null) {
                                                        lw8.z(lw8Var, mw8Var8, (i19 - mw8Var8.a) / 2, (i18 - mw8Var8.b) / 2);
                                                    }
                                                    lw8.z(lw8Var, mw8Var7, i23, i22);
                                                    lw8.z(lw8Var, mw8Var6, i21, i20);
                                                    return pvcVar;
                                            }
                                        }
                                    });
                                }
                                mw8Var4.getClass();
                                float f9 = vz7.e;
                                float L0 = e37Var.L0(f9) + M.b;
                                float f10 = vz7.c;
                                float L02 = e37Var.L0(f10) + L0 + mw8Var4.b;
                                float j2 = (x02.j(j) - L02) / 2.0f;
                                float L03 = e37Var.L0(f9);
                                if (j2 < L03) {
                                    f2 = L03;
                                } else {
                                    f2 = j2;
                                }
                                float f11 = (f2 * 2.0f) + L02;
                                final boolean z8 = this.d;
                                if (z8) {
                                    f3 = f2;
                                } else {
                                    f3 = (f11 - M.b) / 2.0f;
                                }
                                final float f12 = (1.0f - f) * (f3 - f2);
                                final float L04 = e37Var.L0(f10) + e37Var.L0(f9) + f2 + M.b;
                                if (x02.i(j) == Integer.MAX_VALUE) {
                                    i = (e37Var.X0(vz7.g) * 2) + M.a;
                                } else {
                                    i = x02.i(j);
                                }
                                final int i17 = i;
                                final int i18 = (i17 - mw8Var4.a) / 2;
                                final int i19 = (i17 - M.a) / 2;
                                final int i20 = (i17 - M2.a) / 2;
                                final float L05 = f2 - e37Var.L0(f9);
                                final mw8 mw8Var6 = M;
                                final mw8 mw8Var7 = mw8Var;
                                return e37Var.q0(i17, k27.A(f11), ls3Var, new xt4() { // from class: rz7
                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj3) {
                                        int i21 = r16;
                                        pvc pvcVar = pvc.a;
                                        int i22 = i17;
                                        float f13 = L05;
                                        int i23 = i20;
                                        mw8 mw8Var8 = M2;
                                        float f14 = f2;
                                        int i24 = i19;
                                        mw8 mw8Var9 = mw8Var6;
                                        float f15 = f12;
                                        float f16 = L04;
                                        int i25 = i18;
                                        mw8 mw8Var10 = mw8Var4;
                                        float f17 = f;
                                        boolean z9 = z8;
                                        mw8 mw8Var11 = mw8Var7;
                                        switch (i21) {
                                            case 0:
                                                lw8 lw8Var = (lw8) obj3;
                                                if (mw8Var11 != null) {
                                                    lw8.z(lw8Var, mw8Var11, (i22 - mw8Var11.a) / 2, k27.A((f14 - lw8Var.X0(vz7.e)) + f15));
                                                }
                                                if (z9 || f17 != nae.e) {
                                                    lw8.z(lw8Var, mw8Var10, i25, k27.A(f16 + f15));
                                                }
                                                lw8.z(lw8Var, mw8Var9, i24, k27.A(f14 + f15));
                                                lw8.z(lw8Var, mw8Var8, i23, k27.A(f13 + f15));
                                                return pvcVar;
                                            default:
                                                lw8 lw8Var2 = (lw8) obj3;
                                                if (mw8Var11 != null) {
                                                    lw8.z(lw8Var2, mw8Var11, (i22 - mw8Var11.a) / 2, k27.A((f14 - (lw8Var2.f() * l08.e)) + f15));
                                                }
                                                if (z9 || f17 != nae.e) {
                                                    lw8.z(lw8Var2, mw8Var10, i25, k27.A(f16 + f15));
                                                }
                                                lw8.z(lw8Var2, mw8Var9, i24, k27.A(f14 + f15));
                                                lw8.z(lw8Var2, mw8Var8, i23, k27.A(f13 + f15));
                                                return pvcVar;
                                        }
                                    }
                                });
                            }
                            i7 = i9 + 1;
                            size2 = i8;
                            M = M;
                        }
                        throw a82.A("Collection contains no element matching the predicate.");
                    }
                }
                throw a82.A("Collection contains no element matching the predicate.");
            default:
                float floatValue2 = ((Number) vt4Var.invoke()).floatValue();
                if (floatValue2 < nae.e) {
                    f4 = 0.0f;
                } else {
                    f4 = floatValue2;
                }
                ls3 ls3Var2 = ls3Var;
                long b2 = x02.b(j, 0, 0, 0, 0, 10);
                int size5 = list.size();
                int i21 = 0;
                while (i21 < size5) {
                    w27 w27Var5 = (w27) list.get(i21);
                    if (c16.i(bze.n(w27Var5), "icon")) {
                        final mw8 M3 = w27Var5.M(b2);
                        int X03 = e37Var.X0(l08.d * 2.0f) + M3.a;
                        int A2 = k27.A(X03 * f4);
                        if (lu4Var == null) {
                            f5 = l08.f;
                        } else {
                            f5 = l08.e;
                        }
                        int X04 = e37Var.X0(f5 * 2.0f) + M3.b;
                        int size6 = list.size();
                        int i22 = 0;
                        while (i22 < size6) {
                            int i23 = i22;
                            w27 w27Var6 = (w27) list.get(i22);
                            int i24 = size6;
                            if (c16.i(bze.n(w27Var6), "indicatorRipple")) {
                                if (X03 >= 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (X04 >= 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!(z4 & z5)) {
                                    nv5.a("width and height must be >= 0");
                                }
                                ls3 ls3Var3 = ls3Var2;
                                final mw8 M4 = w27Var6.M(y02.h(X03, X03, X04, X04));
                                int size7 = list.size();
                                int i25 = 0;
                                while (true) {
                                    if (i25 < size7) {
                                        obj2 = list.get(i25);
                                        int i26 = size7;
                                        if (!c16.i(bze.n((w27) obj2), "indicator")) {
                                            i25++;
                                            size7 = i26;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                w27 w27Var7 = (w27) obj2;
                                if (w27Var7 != null) {
                                    if (A2 >= 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (X04 < 0) {
                                        z7 = false;
                                    }
                                    if (!(z6 & z7)) {
                                        nv5.a("width and height must be >= 0");
                                    }
                                    mw8Var2 = w27Var7.M(y02.h(A2, A2, X04, X04));
                                } else {
                                    mw8Var2 = null;
                                }
                                if (lu4Var != null) {
                                    int size8 = list.size();
                                    for (int i27 = 0; i27 < size8; i27++) {
                                        w27 w27Var8 = (w27) list.get(i27);
                                        if (c16.i(bze.n(w27Var8), "label")) {
                                            mw8Var3 = w27Var8.M(b2);
                                        }
                                    }
                                    throw a82.A("Collection contains no element matching the predicate.");
                                }
                                final mw8 mw8Var8 = mw8Var3;
                                if (lu4Var == null) {
                                    int i28 = M3.a;
                                    int i29 = M4.a;
                                    if (mw8Var2 != null) {
                                        i4 = mw8Var2.a;
                                    } else {
                                        i4 = 0;
                                    }
                                    final int g = y02.g(Math.max(i28, Math.max(i29, i4)), j);
                                    final int f13 = y02.f(e37Var.X0(l08.b), j);
                                    final int i30 = (g - M3.a) / 2;
                                    final int i31 = (f13 - M3.b) / 2;
                                    final int i32 = (g - M4.a) / 2;
                                    final int i33 = (f13 - M4.b) / 2;
                                    final mw8 mw8Var9 = mw8Var2;
                                    return e37Var.q0(g, f13, ls3Var3, new xt4() { // from class: sz7
                                        @Override // defpackage.xt4
                                        public final Object invoke(Object obj3) {
                                            int i172 = r10;
                                            pvc pvcVar = pvc.a;
                                            int i182 = f13;
                                            int i192 = g;
                                            int i202 = i33;
                                            int i212 = i32;
                                            mw8 mw8Var62 = M4;
                                            int i222 = i31;
                                            int i232 = i30;
                                            mw8 mw8Var72 = M3;
                                            mw8 mw8Var82 = mw8Var9;
                                            lw8 lw8Var = (lw8) obj3;
                                            switch (i172) {
                                                case 0:
                                                    if (mw8Var82 != null) {
                                                        lw8.z(lw8Var, mw8Var82, (i192 - mw8Var82.a) / 2, (i182 - mw8Var82.b) / 2);
                                                    }
                                                    lw8.z(lw8Var, mw8Var72, i232, i222);
                                                    lw8.z(lw8Var, mw8Var62, i212, i202);
                                                    return pvcVar;
                                                default:
                                                    if (mw8Var82 != null) {
                                                        lw8.z(lw8Var, mw8Var82, (i192 - mw8Var82.a) / 2, (i182 - mw8Var82.b) / 2);
                                                    }
                                                    lw8.z(lw8Var, mw8Var72, i232, i222);
                                                    lw8.z(lw8Var, mw8Var62, i212, i202);
                                                    return pvcVar;
                                            }
                                        }
                                    });
                                }
                                mw8Var8.getClass();
                                float f14 = l08.e;
                                float L06 = e37Var.L0(f14) + M3.b;
                                float f15 = l08.c;
                                float L07 = e37Var.L0(f15) + L06 + mw8Var8.b;
                                float j3 = (x02.j(j) - L07) / 2.0f;
                                float L08 = e37Var.L0(f14);
                                if (j3 < L08) {
                                    f6 = L08;
                                } else {
                                    f6 = j3;
                                }
                                float f16 = (f6 * 2.0f) + L07;
                                final boolean z9 = this.d;
                                if (z9) {
                                    f7 = f6;
                                } else {
                                    f7 = (f16 - M3.b) / 2.0f;
                                }
                                final float f17 = (1.0f - f4) * (f7 - f6);
                                final float L09 = e37Var.L0(f15) + e37Var.L0(f14) + f6 + M3.b;
                                int i34 = M3.a;
                                int i35 = mw8Var8.a;
                                if (mw8Var2 != null) {
                                    i3 = mw8Var2.a;
                                } else {
                                    i3 = 0;
                                }
                                final int g2 = y02.g(Math.max(i34, Math.max(i35, i3)), j);
                                final int i36 = (g2 - mw8Var8.a) / 2;
                                final int i37 = (g2 - M3.a) / 2;
                                final int i38 = (g2 - M4.a) / 2;
                                final float L010 = f6 - e37Var.L0(f14);
                                final mw8 mw8Var10 = mw8Var2;
                                return e37Var.q0(g2, k27.A(f16), ls3Var3, new xt4() { // from class: rz7
                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj3) {
                                        int i212 = r16;
                                        pvc pvcVar = pvc.a;
                                        int i222 = g2;
                                        float f132 = L010;
                                        int i232 = i38;
                                        mw8 mw8Var82 = M4;
                                        float f142 = f6;
                                        int i242 = i37;
                                        mw8 mw8Var92 = M3;
                                        float f152 = f17;
                                        float f162 = L09;
                                        int i252 = i36;
                                        mw8 mw8Var102 = mw8Var8;
                                        float f172 = f4;
                                        boolean z92 = z9;
                                        mw8 mw8Var11 = mw8Var10;
                                        switch (i212) {
                                            case 0:
                                                lw8 lw8Var = (lw8) obj3;
                                                if (mw8Var11 != null) {
                                                    lw8.z(lw8Var, mw8Var11, (i222 - mw8Var11.a) / 2, k27.A((f142 - lw8Var.X0(vz7.e)) + f152));
                                                }
                                                if (z92 || f172 != nae.e) {
                                                    lw8.z(lw8Var, mw8Var102, i252, k27.A(f162 + f152));
                                                }
                                                lw8.z(lw8Var, mw8Var92, i242, k27.A(f142 + f152));
                                                lw8.z(lw8Var, mw8Var82, i232, k27.A(f132 + f152));
                                                return pvcVar;
                                            default:
                                                lw8 lw8Var2 = (lw8) obj3;
                                                if (mw8Var11 != null) {
                                                    lw8.z(lw8Var2, mw8Var11, (i222 - mw8Var11.a) / 2, k27.A((f142 - (lw8Var2.f() * l08.e)) + f152));
                                                }
                                                if (z92 || f172 != nae.e) {
                                                    lw8.z(lw8Var2, mw8Var102, i252, k27.A(f162 + f152));
                                                }
                                                lw8.z(lw8Var2, mw8Var92, i242, k27.A(f142 + f152));
                                                lw8.z(lw8Var2, mw8Var82, i232, k27.A(f132 + f152));
                                                return pvcVar;
                                        }
                                    }
                                });
                            }
                            i22 = i23 + 1;
                            ls3Var2 = ls3Var2;
                            size6 = i24;
                        }
                        throw a82.A("Collection contains no element matching the predicate.");
                    }
                    i21++;
                    ls3Var2 = ls3Var2;
                }
                throw a82.A("Collection contains no element matching the predicate.");
        }
    }
}
