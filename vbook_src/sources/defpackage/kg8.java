package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kg8  reason: default package */
/* loaded from: classes.dex */
public final class kg8 implements b37 {
    public final xt4 a;
    public final boolean b;
    public final isb c;
    public final fsb d;
    public final fsb e;
    public final fsb f;
    public final rh8 g;
    public final float h;

    public kg8(xt4 xt4Var, boolean z, isb isbVar, fsb fsbVar, fsb fsbVar2, fsb fsbVar3, rh8 rh8Var, float f) {
        this.a = xt4Var;
        this.b = z;
        this.c = isbVar;
        this.d = fsbVar;
        this.e = fsbVar2;
        this.f = fsbVar3;
        this.g = rh8Var;
        this.h = f;
    }

    public static final int j(int i, kg8 kg8Var, int i2, int i3, mw8 mw8Var, mw8 mw8Var2) {
        int i4;
        if (kg8Var.b) {
            i3 = Math.round(((i2 - mw8Var2.b) / 2.0f) * 1.0f);
        }
        int i5 = i + i3;
        if (mw8Var != null) {
            i4 = mw8Var.b;
        } else {
            i4 = 0;
        }
        return Math.max(i5, i4 / 2);
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        return h(u06Var, list, i, new j35(24));
    }

    public final int b(u06 u06Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int r = hxe.r(i5, i7, i3, i4, b23.p(f, i6, 0));
        rh8 rh8Var = this.g;
        float L0 = u06Var.L0(rh8Var.d());
        float o = b23.o(L0, Math.max(L0, i6 / 2.0f), f);
        return y02.f(Math.max(i, Math.max(i2, k27.A(o + r + u06Var.L0(rh8Var.a())))) + i8, j);
    }

    public final int c(u06 u06Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, b23.p(f, i6, 0))) + i + i2;
        rh8 rh8Var = this.g;
        tc6 tc6Var = tc6.a;
        return y02.g(Math.max(max, k27.A((i6 + u06Var.L0(rh8Var.c(tc6Var) + rh8Var.b(tc6Var))) * f)), j);
    }

    public final int d(u06 u06Var, List list, int i, lu4 lu4Var) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        int i8;
        Object obj7;
        int i9;
        kg8 kg8Var = this;
        float invoke = kg8Var.d.invoke();
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (c16.i(zbe.t((w27) obj), "Leading")) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        w27 w27Var = (w27) obj;
        if (w27Var != null) {
            i2 = zbe.K(i, w27Var.J(Integer.MAX_VALUE));
            i3 = ((Number) lu4Var.invoke(w27Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                obj2 = list.get(i11);
                if (c16.i(zbe.t((w27) obj2), "Trailing")) {
                    break;
                }
                i11++;
            } else {
                obj2 = null;
                break;
            }
        }
        w27 w27Var2 = (w27) obj2;
        if (w27Var2 != null) {
            i2 = zbe.K(i2, w27Var2.J(Integer.MAX_VALUE));
            i4 = ((Number) lu4Var.invoke(w27Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 < size3) {
                obj3 = list.get(i12);
                if (c16.i(zbe.t((w27) obj3), "Label")) {
                    break;
                }
                i12++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (w27) obj3;
        if (obj8 != null) {
            i5 = ((Number) lu4Var.invoke(obj8, Integer.valueOf(b23.p(invoke, i2, i)))).intValue();
        } else {
            i5 = 0;
        }
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size4) {
                obj4 = list.get(i13);
                if (c16.i(zbe.t((w27) obj4), "Prefix")) {
                    break;
                }
                i13++;
            } else {
                obj4 = null;
                break;
            }
        }
        w27 w27Var3 = (w27) obj4;
        if (w27Var3 != null) {
            i6 = ((Number) lu4Var.invoke(w27Var3, Integer.valueOf(i2))).intValue();
            i2 = zbe.K(i2, w27Var3.J(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size5) {
                obj5 = list.get(i14);
                if (c16.i(zbe.t((w27) obj5), "Suffix")) {
                    break;
                }
                i14++;
            } else {
                obj5 = null;
                break;
            }
        }
        w27 w27Var4 = (w27) obj5;
        if (w27Var4 != null) {
            i7 = ((Number) lu4Var.invoke(w27Var4, Integer.valueOf(i2))).intValue();
            i2 = zbe.K(i2, w27Var4.J(Integer.MAX_VALUE));
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        int i15 = 0;
        while (i15 < size6) {
            Object obj9 = list.get(i15);
            if (c16.i(zbe.t((w27) obj9), "TextField")) {
                int intValue = ((Number) lu4Var.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size7) {
                        obj6 = list.get(i16);
                        if (c16.i(zbe.t((w27) obj6), "Hint")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (w27) obj6;
                if (obj10 != null) {
                    i8 = ((Number) lu4Var.invoke(obj10, Integer.valueOf(i2))).intValue();
                } else {
                    i8 = 0;
                }
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size8) {
                        obj7 = list.get(i17);
                        if (c16.i(zbe.t((w27) obj7), "Supporting")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj11 = (w27) obj7;
                if (obj11 != null) {
                    i9 = ((Number) lu4Var.invoke(obj11, Integer.valueOf(i))).intValue();
                } else {
                    i9 = 0;
                }
                int i18 = i4;
                int i19 = i9;
                return kg8Var.b(u06Var, i3, i18, i6, i7, intValue, i5, i8, i19, y02.b(0, 0, 0, 0, 15), invoke);
            }
            i15++;
            i7 = i7;
            kg8Var = this;
            i6 = i6;
        }
        throw a82.A("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [zl9, java.lang.Object] */
    @Override // defpackage.b37
    public final c37 e(final e37 e37Var, List list, long j) {
        mw8 mw8Var;
        Object obj;
        mw8 mw8Var2;
        int i;
        int i2;
        Object obj2;
        mw8 mw8Var3;
        int i3;
        mw8 mw8Var4;
        int i4;
        int i5;
        Object obj3;
        mw8 mw8Var5;
        int i6;
        mw8 mw8Var6;
        int i7;
        int i8;
        Object obj4;
        mw8 mw8Var7;
        int i9;
        mw8 mw8Var8;
        int i10;
        int i11;
        Object obj5;
        mw8 mw8Var9;
        long j2;
        Object obj6;
        int i12;
        int i13;
        Object obj7;
        mw8 mw8Var10;
        int i14;
        int i15;
        int i16;
        int i17;
        mw8 mw8Var11;
        int i18;
        zl9 zl9Var;
        int i19;
        zl9 zl9Var2;
        mw8 mw8Var12;
        int i20;
        long j3;
        int i21;
        mw8 mw8Var13;
        mw8 mw8Var14;
        int i22;
        mw8 mw8Var15;
        w27 w27Var;
        kg8 kg8Var;
        e37 e37Var2;
        mw8 mw8Var16;
        int i23;
        mw8 mw8Var17;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        mw8 mw8Var18;
        int i30;
        int i31;
        int i32;
        zl9 zl9Var3;
        int i33;
        kg8 kg8Var2;
        mw8 mw8Var19;
        mw8 mw8Var20;
        int i34;
        mw8 mw8Var21;
        int i35;
        e37 e37Var3;
        float f;
        int i36;
        int i37;
        List list2 = list;
        float invoke = this.d.invoke();
        rh8 rh8Var = this.g;
        int X0 = e37Var.X0(rh8Var.a());
        long b = x02.b(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i38 = 0;
        while (true) {
            mw8Var = null;
            if (i38 < size) {
                obj = list2.get(i38);
                if (c16.i(bze.n((w27) obj), "Leading")) {
                    break;
                }
                i38++;
            } else {
                obj = null;
                break;
            }
        }
        w27 w27Var2 = (w27) obj;
        if (w27Var2 != null) {
            mw8Var2 = w27Var2.M(b);
        } else {
            mw8Var2 = null;
        }
        if (mw8Var2 != null) {
            i = mw8Var2.a;
        } else {
            i = 0;
        }
        if (mw8Var2 != null) {
            i2 = mw8Var2.b;
        } else {
            i2 = 0;
        }
        int max = Math.max(0, i2);
        int size2 = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 < size2) {
                obj2 = list2.get(i39);
                if (c16.i(bze.n((w27) obj2), "Trailing")) {
                    break;
                }
                i39++;
            } else {
                obj2 = null;
                break;
            }
        }
        w27 w27Var3 = (w27) obj2;
        if (w27Var3 != null) {
            mw8Var3 = mw8Var2;
            i3 = i;
            mw8Var4 = w27Var3.M(y02.j(-i, 0, 2, b));
        } else {
            mw8Var3 = mw8Var2;
            i3 = i;
            mw8Var4 = null;
        }
        if (mw8Var4 != null) {
            i4 = mw8Var4.a;
        } else {
            i4 = 0;
        }
        int i40 = i3 + i4;
        if (mw8Var4 != null) {
            i5 = mw8Var4.b;
        } else {
            i5 = 0;
        }
        int max2 = Math.max(max, i5);
        int size3 = list2.size();
        int i41 = 0;
        while (true) {
            if (i41 < size3) {
                obj3 = list2.get(i41);
                int i42 = size3;
                if (c16.i(bze.n((w27) obj3), "Prefix")) {
                    break;
                }
                i41++;
                size3 = i42;
            } else {
                obj3 = null;
                break;
            }
        }
        w27 w27Var4 = (w27) obj3;
        if (w27Var4 != null) {
            mw8Var5 = mw8Var4;
            i6 = i40;
            mw8Var6 = w27Var4.M(y02.j(-i40, 0, 2, b));
        } else {
            mw8Var5 = mw8Var4;
            i6 = i40;
            mw8Var6 = null;
        }
        if (mw8Var6 != null) {
            i7 = mw8Var6.a;
        } else {
            i7 = 0;
        }
        int i43 = i6 + i7;
        if (mw8Var6 != null) {
            i8 = mw8Var6.b;
        } else {
            i8 = 0;
        }
        int max3 = Math.max(max2, i8);
        int size4 = list2.size();
        int i44 = 0;
        while (true) {
            if (i44 < size4) {
                obj4 = list2.get(i44);
                int i45 = size4;
                if (c16.i(bze.n((w27) obj4), "Suffix")) {
                    break;
                }
                i44++;
                size4 = i45;
            } else {
                obj4 = null;
                break;
            }
        }
        w27 w27Var5 = (w27) obj4;
        if (w27Var5 != null) {
            mw8Var7 = mw8Var6;
            i9 = i43;
            mw8Var8 = w27Var5.M(y02.j(-i43, 0, 2, b));
        } else {
            mw8Var7 = mw8Var6;
            i9 = i43;
            mw8Var8 = null;
        }
        if (mw8Var8 != null) {
            i10 = mw8Var8.a;
        } else {
            i10 = 0;
        }
        int i46 = i9 + i10;
        if (mw8Var8 != null) {
            i11 = mw8Var8.b;
        } else {
            i11 = 0;
        }
        int max4 = Math.max(max3, i11);
        int size5 = list2.size();
        int i47 = 0;
        while (true) {
            if (i47 < size5) {
                obj5 = list2.get(i47);
                int i48 = size5;
                if (c16.i(bze.n((w27) obj5), "Label")) {
                    break;
                }
                i47++;
                size5 = i48;
            } else {
                obj5 = null;
                break;
            }
        }
        w27 w27Var6 = (w27) obj5;
        ?? obj8 = new Object();
        int X02 = e37Var.X0(rh8Var.c(e37Var.getLayoutDirection())) + e37Var.X0(rh8Var.b(e37Var.getLayoutDirection()));
        int i49 = -X0;
        long i50 = y02.i(-b23.p(invoke, i46 + X02, X02), b, i49);
        if (w27Var6 != null) {
            mw8Var9 = w27Var6.M(i50);
        } else {
            mw8Var9 = null;
        }
        obj8.a = mw8Var9;
        if (mw8Var9 != null) {
            j2 = (Float.floatToRawIntBits(mw8Var9.b) & 4294967295L) | (Float.floatToRawIntBits(mw8Var9.a) << 32);
        } else {
            j2 = 0;
        }
        this.a.invoke(new dna(j2));
        int size6 = list2.size();
        int i51 = 0;
        while (true) {
            if (i51 < size6) {
                obj6 = list2.get(i51);
                if (c16.i(bze.n((w27) obj6), "Supporting")) {
                    break;
                }
                i51++;
            } else {
                obj6 = null;
                break;
            }
        }
        w27 w27Var7 = (w27) obj6;
        if (w27Var7 != null) {
            i12 = w27Var7.n0(x02.k(j));
        } else {
            i12 = 0;
        }
        mw8 mw8Var22 = (mw8) obj8.a;
        if (mw8Var22 != null) {
            i13 = mw8Var22.b;
        } else {
            i13 = 0;
        }
        int max5 = Math.max(i13 / 2, e37Var.X0(rh8Var.d()));
        long j4 = j;
        w27 w27Var8 = w27Var7;
        long b2 = x02.b(y02.i(-i46, j4, (i49 - max5) - i12), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i52 = 0;
        while (i52 < size7) {
            w27 w27Var9 = w27Var8;
            w27 w27Var10 = (w27) list2.get(i52);
            int i53 = max5;
            int i54 = size7;
            if (c16.i(bze.n(w27Var10), "TextField")) {
                mw8 M = w27Var10.M(b2);
                long b3 = x02.b(b2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i55 = 0;
                while (true) {
                    if (i55 < size8) {
                        Object obj9 = list2.get(i55);
                        int i56 = size8;
                        if (c16.i(bze.n((w27) obj9), "Hint")) {
                            obj7 = obj9;
                            break;
                        }
                        i55++;
                        size8 = i56;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                w27 w27Var11 = (w27) obj7;
                if (w27Var11 != null) {
                    mw8Var10 = w27Var11.M(b3);
                } else {
                    mw8Var10 = null;
                }
                int i57 = M.b;
                if (mw8Var10 != null) {
                    i14 = mw8Var10.b;
                } else {
                    i14 = 0;
                }
                int max6 = Math.max(max4, Math.max(i57, i14) + i53 + X0);
                if (mw8Var3 != null) {
                    i15 = mw8Var3.a;
                } else {
                    i15 = 0;
                }
                mw8 mw8Var23 = mw8Var5;
                if (mw8Var5 != null) {
                    i16 = mw8Var23.a;
                } else {
                    i16 = 0;
                }
                mw8 mw8Var24 = mw8Var7;
                if (mw8Var7 != null) {
                    i17 = mw8Var24.a;
                } else {
                    i17 = 0;
                }
                int i58 = i17;
                if (mw8Var8 != null) {
                    i18 = mw8Var8.a;
                    mw8Var11 = mw8Var23;
                } else {
                    mw8Var11 = mw8Var23;
                    i18 = 0;
                }
                int i59 = M.a;
                mw8 mw8Var25 = mw8Var11;
                mw8 mw8Var26 = (mw8) obj8.a;
                if (mw8Var26 != null) {
                    i19 = mw8Var26.a;
                    zl9Var = obj8;
                } else {
                    zl9Var = obj8;
                    i19 = 0;
                }
                if (mw8Var10 != null) {
                    mw8Var12 = M;
                    i20 = i15;
                    zl9Var2 = zl9Var;
                    j3 = j4;
                    i21 = mw8Var10.a;
                    mw8Var13 = mw8Var10;
                    mw8Var14 = mw8Var8;
                    i22 = i58;
                    mw8Var15 = mw8Var24;
                    w27Var = w27Var9;
                    kg8Var = this;
                    mw8Var16 = mw8Var3;
                    i23 = max6;
                    mw8Var17 = mw8Var25;
                    e37Var2 = e37Var;
                } else {
                    zl9Var2 = zl9Var;
                    mw8Var12 = M;
                    i20 = i15;
                    j3 = j4;
                    i21 = 0;
                    mw8Var13 = mw8Var10;
                    mw8Var14 = mw8Var8;
                    i22 = i58;
                    mw8Var15 = mw8Var24;
                    w27Var = w27Var9;
                    kg8Var = this;
                    e37Var2 = e37Var;
                    mw8Var16 = mw8Var3;
                    i23 = max6;
                    mw8Var17 = mw8Var25;
                }
                final int c = kg8Var.c(e37Var2, i20, i16, i22, i18, i59, i19, i21, j3, invoke);
                long b4 = x02.b(y02.j(0, -i23, 1, b), 0, c, 0, 0, 9);
                if (w27Var != null) {
                    mw8Var = w27Var.M(b4);
                }
                final mw8 mw8Var27 = mw8Var;
                if (mw8Var27 != null) {
                    i24 = mw8Var27.b;
                } else {
                    i24 = 0;
                }
                mw8 mw8Var28 = mw8Var16;
                if (mw8Var16 != null) {
                    i25 = mw8Var28.b;
                } else {
                    i25 = 0;
                }
                final mw8 mw8Var29 = mw8Var17;
                if (mw8Var17 != null) {
                    i26 = mw8Var29.b;
                } else {
                    i26 = 0;
                }
                mw8 mw8Var30 = mw8Var15;
                if (mw8Var30 != null) {
                    i27 = mw8Var30.b;
                } else {
                    i27 = 0;
                }
                mw8 mw8Var31 = mw8Var14;
                if (mw8Var31 != null) {
                    i28 = mw8Var31.b;
                } else {
                    i28 = 0;
                }
                mw8 mw8Var32 = mw8Var12;
                int i60 = mw8Var32.b;
                zl9 zl9Var4 = zl9Var2;
                mw8 mw8Var33 = (mw8) zl9Var4.a;
                if (mw8Var33 != null) {
                    i29 = mw8Var33.b;
                } else {
                    i29 = 0;
                }
                int i61 = i24;
                final mw8 mw8Var34 = mw8Var13;
                if (mw8Var34 != null) {
                    mw8Var18 = mw8Var31;
                    i30 = i28;
                    i31 = i60;
                    i32 = mw8Var34.b;
                } else {
                    mw8Var18 = mw8Var31;
                    i30 = i28;
                    i31 = i60;
                    i32 = 0;
                }
                if (mw8Var27 != null) {
                    zl9Var3 = zl9Var4;
                    i33 = mw8Var27.b;
                    mw8Var19 = mw8Var30;
                    mw8Var20 = mw8Var32;
                    i34 = i29;
                    mw8Var21 = mw8Var28;
                    i35 = 0;
                    e37Var3 = e37Var;
                    f = invoke;
                    kg8Var2 = this;
                } else {
                    zl9Var3 = zl9Var4;
                    i33 = 0;
                    kg8Var2 = this;
                    mw8Var19 = mw8Var30;
                    mw8Var20 = mw8Var32;
                    i34 = i29;
                    mw8Var21 = mw8Var28;
                    i35 = 0;
                    e37Var3 = e37Var;
                    f = invoke;
                }
                final int b5 = kg8Var2.b(e37Var3, i25, i26, i27, i30, i31, i34, i32, i33, j, f);
                final float f2 = f;
                int i62 = b5 - i61;
                int size9 = list.size();
                int i63 = i35;
                while (i63 < size9) {
                    w27 w27Var12 = (w27) list.get(i63);
                    if (c16.i(bze.n(w27Var12), "Container")) {
                        if (c != Integer.MAX_VALUE) {
                            i36 = c;
                        } else {
                            i36 = i35;
                        }
                        if (i62 != Integer.MAX_VALUE) {
                            i37 = i62;
                        } else {
                            i37 = i35;
                        }
                        final mw8 M2 = w27Var12.M(y02.a(i36, c, i37, i62));
                        final mw8 mw8Var35 = mw8Var21;
                        final mw8 mw8Var36 = mw8Var19;
                        final mw8 mw8Var37 = mw8Var18;
                        final zl9 zl9Var5 = zl9Var3;
                        final mw8 mw8Var38 = mw8Var20;
                        return e37Var.q0(c, b5, ls3.a, new xt4() { // from class: ig8
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj10) {
                                int i64;
                                float f3;
                                kg8 kg8Var3;
                                int i65;
                                int i66;
                                int i67;
                                int i68;
                                int i69;
                                int i70;
                                kg8 kg8Var4;
                                int i71;
                                int i72;
                                int i73;
                                int i74;
                                mw8 mw8Var39;
                                int i75;
                                int i76;
                                float f4;
                                float f5;
                                float f6;
                                float f7;
                                float f8;
                                lw8 lw8Var = (lw8) obj10;
                                mw8 mw8Var40 = (mw8) zl9Var5.a;
                                kg8 kg8Var5 = kg8.this;
                                final fsb fsbVar = kg8Var5.e;
                                final fsb fsbVar2 = kg8Var5.f;
                                float f9 = lw8Var.f();
                                tc6 layoutDirection = e37Var.getLayoutDirection();
                                float f10 = lw8Var.f() * kg8Var5.h;
                                isb isbVar = kg8Var5.c;
                                rh8 rh8Var2 = kg8Var5.g;
                                lw8Var.o(M2, 0, 0, nae.e);
                                mw8 mw8Var41 = mw8Var27;
                                if (mw8Var41 != null) {
                                    i64 = mw8Var41.b;
                                } else {
                                    i64 = 0;
                                }
                                int i77 = b5 - i64;
                                int A = k27.A(rh8Var2.d() * f9);
                                mw8 mw8Var42 = mw8Var35;
                                if (mw8Var42 != null) {
                                    f3 = f9;
                                    lw8.z(lw8Var, mw8Var42, 0, Math.round(((i77 - mw8Var42.b) / 2.0f) * 1.0f));
                                } else {
                                    f3 = f9;
                                }
                                int i78 = c;
                                mw8 mw8Var43 = mw8Var29;
                                if (mw8Var40 != null) {
                                    if (kg8Var5.b) {
                                        i76 = Math.round(((i77 - mw8Var40.b) / 2.0f) * 1.0f);
                                    } else {
                                        i76 = A;
                                    }
                                    kg8Var3 = kg8Var5;
                                    float f11 = f2;
                                    int p = b23.p(f11, i76, -(mw8Var40.b / 2));
                                    float o = zbe.o(rh8Var2, layoutDirection) * f3;
                                    float n = zbe.n(rh8Var2, layoutDirection) * f3;
                                    if (mw8Var42 == null) {
                                        f4 = o;
                                    } else {
                                        f4 = o;
                                        float f12 = mw8Var42.a;
                                        float f13 = f4 - f10;
                                        if (f13 < nae.e) {
                                            f13 = 0.0f;
                                        }
                                        o = f12 + f13;
                                    }
                                    if (mw8Var43 == null) {
                                        f5 = o;
                                        f6 = n;
                                    } else {
                                        f5 = o;
                                        float f14 = mw8Var43.a;
                                        float f15 = n - f10;
                                        if (f15 < nae.e) {
                                            f15 = 0.0f;
                                        }
                                        f6 = f14 + f15;
                                    }
                                    tc6 tc6Var = tc6.a;
                                    if (layoutDirection == tc6Var) {
                                        f7 = f4;
                                    } else {
                                        f7 = n;
                                    }
                                    if (layoutDirection == tc6Var) {
                                        f8 = f5;
                                    } else {
                                        f8 = f6;
                                    }
                                    i65 = i77;
                                    lw8Var.o(mw8Var40, k27.A(b23.o(isbVar.b.a(mw8Var40.a, i78 - k27.A(f5 + f6), layoutDirection) + f8, dxe.u(isbVar).a(mw8Var40.a, i78 - k27.A(f4 + n), layoutDirection) + f7, f11)), p, nae.e);
                                } else {
                                    kg8Var3 = kg8Var5;
                                    i65 = i77;
                                }
                                mw8 mw8Var44 = mw8Var36;
                                if (mw8Var44 != null) {
                                    if (mw8Var42 != null) {
                                        mw8Var39 = mw8Var44;
                                        i75 = mw8Var42.a;
                                    } else {
                                        mw8Var39 = mw8Var44;
                                        i75 = 0;
                                    }
                                    kg8 kg8Var6 = kg8Var3;
                                    int i79 = i65;
                                    int j5 = kg8.j(0, kg8Var6, i79, A, mw8Var40, mw8Var39);
                                    i67 = 0;
                                    kg8Var3 = kg8Var6;
                                    i65 = i79;
                                    int i80 = i75;
                                    mw8Var44 = mw8Var39;
                                    i66 = A;
                                    lw8.E(lw8Var, mw8Var44, i80, j5, new xt4() { // from class: jg8
                                        @Override // defpackage.xt4
                                        public final Object invoke(Object obj11) {
                                            int i81 = r2;
                                            pvc pvcVar = pvc.a;
                                            fsb fsbVar3 = fsbVar2;
                                            t15 t15Var = (t15) obj11;
                                            switch (i81) {
                                                case 0:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                                case 1:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                                default:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                            }
                                        }
                                    }, 4);
                                } else {
                                    i66 = A;
                                    i67 = 0;
                                }
                                if (mw8Var42 != null) {
                                    i68 = mw8Var42.a;
                                } else {
                                    i68 = 0;
                                }
                                if (mw8Var44 != null) {
                                    i69 = mw8Var44.a;
                                } else {
                                    i69 = 0;
                                }
                                int i81 = i69 + i68;
                                int i82 = i66;
                                mw8 mw8Var45 = mw8Var38;
                                int i83 = i67;
                                kg8 kg8Var7 = kg8Var3;
                                int i84 = i65;
                                lw8.z(lw8Var, mw8Var45, i81, kg8.j(i83, kg8Var7, i84, i82, mw8Var40, mw8Var45));
                                mw8 mw8Var46 = mw8Var34;
                                if (mw8Var46 != null) {
                                    int j6 = kg8.j(i83, kg8Var7, i84, i82, mw8Var40, mw8Var46);
                                    i70 = i83;
                                    kg8Var4 = kg8Var7;
                                    i71 = i84;
                                    i72 = i82;
                                    lw8.E(lw8Var, mw8Var46, i81, j6, new xt4() { // from class: jg8
                                        @Override // defpackage.xt4
                                        public final Object invoke(Object obj11) {
                                            int i812 = r2;
                                            pvc pvcVar = pvc.a;
                                            fsb fsbVar3 = fsbVar;
                                            t15 t15Var = (t15) obj11;
                                            switch (i812) {
                                                case 0:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                                case 1:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                                default:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                            }
                                        }
                                    }, 4);
                                } else {
                                    i70 = i83;
                                    kg8Var4 = kg8Var7;
                                    i71 = i84;
                                    i72 = i82;
                                }
                                mw8 mw8Var47 = mw8Var37;
                                if (mw8Var47 != null) {
                                    if (mw8Var43 != null) {
                                        i74 = mw8Var43.a;
                                    } else {
                                        i74 = 0;
                                    }
                                    int i85 = i71;
                                    i73 = i85;
                                    lw8.E(lw8Var, mw8Var47, (i78 - i74) - mw8Var47.a, kg8.j(i70, kg8Var4, i85, i72, mw8Var40, mw8Var47), new xt4() { // from class: jg8
                                        @Override // defpackage.xt4
                                        public final Object invoke(Object obj11) {
                                            int i812 = r2;
                                            pvc pvcVar = pvc.a;
                                            fsb fsbVar3 = fsbVar2;
                                            t15 t15Var = (t15) obj11;
                                            switch (i812) {
                                                case 0:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                                case 1:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                                default:
                                                    t15Var.q(fsbVar3.invoke());
                                                    return pvcVar;
                                            }
                                        }
                                    }, 4);
                                    lw8Var = lw8Var;
                                } else {
                                    i73 = i71;
                                }
                                if (mw8Var43 != null) {
                                    lw8.z(lw8Var, mw8Var43, i78 - mw8Var43.a, Math.round(((i73 - mw8Var43.b) / 2.0f) * 1.0f));
                                }
                                if (mw8Var41 != null) {
                                    lw8.z(lw8Var, mw8Var41, 0, i73);
                                }
                                return pvc.a;
                            }
                        });
                    }
                    i63++;
                    b5 = b5;
                }
                throw a82.A("Collection contains no element matching the predicate.");
            }
            i52++;
            j4 = j;
            w27Var8 = w27Var9;
            size7 = i54;
            mw8Var7 = mw8Var7;
            list2 = list2;
            max5 = i53;
        }
        throw a82.A("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.b37
    public final int f(u06 u06Var, List list, int i) {
        return h(u06Var, list, i, new j35(26));
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        return d(u06Var, list, i, new j35(25));
    }

    public final int h(u06 u06Var, List list, int i, lu4 lu4Var) {
        w27 w27Var;
        Object obj;
        int i2;
        Object obj2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        int i7;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj6 = list.get(i8);
            if (c16.i(zbe.t((w27) obj6), "TextField")) {
                int intValue = ((Number) lu4Var.invoke(obj6, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    w27Var = null;
                    if (i9 < size2) {
                        obj = list.get(i9);
                        if (c16.i(zbe.t((w27) obj), "Label")) {
                            break;
                        }
                        i9++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                w27 w27Var2 = (w27) obj;
                if (w27Var2 != null) {
                    i2 = ((Number) lu4Var.invoke(w27Var2, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size3) {
                        obj2 = list.get(i10);
                        if (c16.i(zbe.t((w27) obj2), "Trailing")) {
                            break;
                        }
                        i10++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                w27 w27Var3 = (w27) obj2;
                if (w27Var3 != null) {
                    i3 = ((Number) lu4Var.invoke(w27Var3, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                int size4 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size4) {
                        obj3 = list.get(i11);
                        if (c16.i(zbe.t((w27) obj3), "Leading")) {
                            break;
                        }
                        i11++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                w27 w27Var4 = (w27) obj3;
                if (w27Var4 != null) {
                    i4 = ((Number) lu4Var.invoke(w27Var4, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size5) {
                        obj4 = list.get(i12);
                        if (c16.i(zbe.t((w27) obj4), "Prefix")) {
                            break;
                        }
                        i12++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                w27 w27Var5 = (w27) obj4;
                if (w27Var5 != null) {
                    i5 = ((Number) lu4Var.invoke(w27Var5, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size6) {
                        obj5 = list.get(i13);
                        if (c16.i(zbe.t((w27) obj5), "Suffix")) {
                            break;
                        }
                        i13++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                w27 w27Var6 = (w27) obj5;
                if (w27Var6 != null) {
                    i6 = ((Number) lu4Var.invoke(w27Var6, Integer.valueOf(i))).intValue();
                } else {
                    i6 = 0;
                }
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    Object obj7 = list.get(i14);
                    if (c16.i(zbe.t((w27) obj7), "Hint")) {
                        w27Var = obj7;
                        break;
                    }
                    i14++;
                }
                w27 w27Var7 = w27Var;
                if (w27Var7 != null) {
                    i7 = ((Number) lu4Var.invoke(w27Var7, Integer.valueOf(i))).intValue();
                } else {
                    i7 = 0;
                }
                return c(u06Var, i4, i3, i5, i6, intValue, i2, i7, y02.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        throw a82.A("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        return d(u06Var, list, i, new j35(23));
    }
}
