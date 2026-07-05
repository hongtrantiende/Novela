package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ol4  reason: default package */
/* loaded from: classes.dex */
public final class ol4 implements bv9 {
    public final fz a;
    public final jz b;
    public final float c;
    public final id2 d;
    public final float e;
    public final ml4 f;

    public ol4(fz fzVar, jz jzVar, float f, id2 id2Var, float f2, ml4 ml4Var) {
        this.a = fzVar;
        this.b = jzVar;
        this.c = f;
        this.d = id2Var;
        this.e = f2;
        this.f = ml4Var;
    }

    public static int a(List list, int i, int i2, int i3, ml4 ml4Var) {
        int i4;
        int i5;
        boolean z;
        jy5 jy5Var;
        int i6;
        boolean z2;
        jy5 jy5Var2;
        boolean z3;
        long a = jy5.a(0, 0);
        if (!list.isEmpty()) {
            int i7 = Integer.MAX_VALUE;
            lzd lzdVar = new lzd(ml4Var, y02.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            w27 w27Var = (w27) sl1.f0(0, list);
            if (w27Var != null) {
                i4 = w27Var.n0(i);
            } else {
                i4 = 0;
            }
            if (w27Var != null) {
                i5 = w27Var.F(i4);
            } else {
                i5 = 0;
            }
            boolean z4 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            long a2 = jy5.a(i, Integer.MAX_VALUE);
            if (w27Var == null) {
                jy5Var = null;
            } else {
                jy5Var = new jy5(jy5.a(i5, i4));
            }
            int i8 = 0;
            if (lzdVar.b(z4, 0, a2, jy5Var, 0, 0, 0, false, false).b) {
                ml4Var.getClass();
                a = a;
            } else {
                int size = list.size();
                int i9 = i;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    int i15 = i9 - i5;
                    int i16 = i12 + 1;
                    int max = Math.max(i11, i4);
                    w27 w27Var2 = (w27) sl1.f0(i16, list);
                    if (w27Var2 != null) {
                        i4 = w27Var2.n0(i);
                    } else {
                        i4 = 0;
                    }
                    if (w27Var2 != null) {
                        i6 = w27Var2.F(i4) + i2;
                    } else {
                        i6 = 0;
                    }
                    if (i12 + 2 < list.size()) {
                        i12 = i16;
                        z2 = z;
                    } else {
                        i12 = i16;
                        z2 = false;
                    }
                    int i17 = i12 - i14;
                    int i18 = i10;
                    long a3 = jy5.a(i15, i7);
                    if (w27Var2 == null) {
                        jy5Var2 = null;
                    } else {
                        jy5Var2 = new jy5(jy5.a(i6, i4));
                    }
                    int i19 = i6;
                    qm8 b = lzdVar.b(z2, i17, a3, jy5Var2, i18, i8, max, false, false);
                    if (b.a) {
                        int i20 = max + i3 + i8;
                        if (w27Var2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        lzdVar.a(b, z3, i18, i20, i15, i17);
                        int i21 = i19 - i2;
                        i10 = i18 + 1;
                        if (b.b) {
                            i13 = i12;
                            i8 = i20;
                            break;
                        }
                        i9 = i;
                        i14 = i12;
                        i5 = i21;
                        i8 = i20;
                        i11 = 0;
                    } else {
                        i5 = i19;
                        i9 = i15;
                        i10 = i18;
                        i11 = max;
                    }
                    i13 = i12;
                    i7 = Integer.MAX_VALUE;
                    z = true;
                }
                a = jy5.a(i8 - i3, i13);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.bv9
    public final void b(int i, int[] iArr, int[] iArr2, e37 e37Var) {
        this.a.f(e37Var, i, iArr, e37Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.bv9
    public final long c(int i, int i2, int i3, boolean z) {
        gv9 gv9Var = ev9.a;
        if (!z) {
            return y02.a(i, i2, 0, i3);
        }
        return ak0.r(i, i2, 0, i3);
    }

    @Override // defpackage.bv9
    public final c37 d(final mw8[] mw8VarArr, e37 e37Var, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final tc6 tc6Var = tc6.a;
        return e37Var.q0(i2, i3, ls3.a, new xt4() { // from class: nl4
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i7;
                cv9 cv9Var;
                nmd nmdVar;
                lw8 lw8Var = (lw8) obj;
                int[] iArr3 = iArr2;
                if (iArr3 != null) {
                    i7 = iArr3[i4];
                } else {
                    i7 = 0;
                }
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    mw8 mw8Var = mw8VarArr[i9];
                    mw8Var.getClass();
                    Object S = mw8Var.S();
                    if (S instanceof cv9) {
                        cv9Var = (cv9) S;
                    } else {
                        cv9Var = null;
                    }
                    if (cv9Var == null || (nmdVar = cv9Var.c) == null) {
                        nmdVar = this.d;
                    }
                    nmd nmdVar2 = nmdVar;
                    lw8Var.o(mw8Var, iArr[i9 - i8], nmdVar2.t(i3, mw8Var.u0(), tc6Var, mw8Var, i) + i7, nae.e);
                }
                return pvc.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ol4) {
                ol4 ol4Var = (ol4) obj;
                if (!this.a.equals(ol4Var.a) || !this.b.equals(ol4Var.b) || !rg3.b(this.c, ol4Var.c) || !this.d.equals(ol4Var.d) || !rg3.b(this.e, ol4Var.e) || !c16.i(this.f, ol4Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bv9
    public final int h(mw8 mw8Var) {
        return mw8Var.u0();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int d = nk2.d(this.c, (hashCode2 + ((hashCode + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31);
        return this.f.hashCode() + hl5.a(Integer.MAX_VALUE, hl5.a(Integer.MAX_VALUE, nk2.d(this.e, (this.d.hashCode() + d) * 31, 31), 31), 31);
    }

    @Override // defpackage.bv9
    public final int j(mw8 mw8Var) {
        return mw8Var.v0();
    }

    public final String toString() {
        String c = rg3.c(this.c);
        String c2 = rg3.c(this.e);
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + c + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + c2 + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
