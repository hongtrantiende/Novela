package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: agc  reason: default package */
/* loaded from: classes.dex */
public final class agc implements b37 {
    public final yi4 a;
    public final jz b;
    public final int c;
    public final float d;
    public final rh8 e;

    public agc(yi4 yi4Var, jz jzVar, int i, float f, rh8 rh8Var) {
        this.a = yi4Var;
        this.b = jzVar;
        this.c = i;
        this.d = f;
        this.e = rh8Var;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((w27) list.get(i3)).J(i);
        }
        return i2;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, final long j) {
        int i;
        final int i2;
        int A;
        int i3;
        final agc agcVar = this;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            w27 w27Var = (w27) list.get(i5);
            if (c16.i(bze.n(w27Var), "navigationIcon")) {
                final mw8 M = w27Var.M(x02.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i6 = 0;
                while (i6 < size2) {
                    w27 w27Var2 = (w27) list.get(i6);
                    if (c16.i(bze.n(w27Var2), "actionIcons")) {
                        final mw8 M2 = w27Var2.M(x02.b(j, 0, 0, 0, 0, 14));
                        tc6 layoutDirection = e37Var.getLayoutDirection();
                        rh8 rh8Var = agcVar.e;
                        float o = zbe.o(rh8Var, layoutDirection);
                        float n = zbe.n(rh8Var, e37Var.getLayoutDirection());
                        int max = Math.max(e37Var.X0(vv.f), M.a);
                        if (x02.i(j) == Integer.MAX_VALUE) {
                            i = x02.i(j);
                        } else {
                            int i7 = (((x02.i(j) - max) - M2.a) - e37Var.X0(o)) - e37Var.X0(n);
                            if (i7 < 0) {
                                i = 0;
                            } else {
                                i = i7;
                            }
                        }
                        int i8 = i;
                        int size3 = list.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            w27 w27Var3 = (w27) list.get(i9);
                            if (c16.i(bze.n(w27Var3), "title")) {
                                final mw8 M3 = w27Var3.M(x02.b(j, 0, i8, 0, 0, 12));
                                n95 n95Var = hc.b;
                                if (M3.o0(n95Var) != Integer.MIN_VALUE) {
                                    i2 = M3.o0(n95Var);
                                } else {
                                    i2 = 0;
                                }
                                float invoke = agcVar.a.invoke();
                                if (Float.isNaN(invoke)) {
                                    A = 0;
                                } else {
                                    A = k27.A(invoke);
                                }
                                final int max2 = Math.max(e37Var.X0(agcVar.d), M3.b) + e37Var.X0(rh8Var.d()) + e37Var.X0(rh8Var.a());
                                if (x02.h(j) == Integer.MAX_VALUE) {
                                    i3 = max2;
                                } else {
                                    int i10 = A + max2;
                                    if (i10 >= 0) {
                                        i4 = i10;
                                    }
                                    i3 = i4;
                                }
                                int X0 = e37Var.X0(rh8Var.d());
                                int X02 = e37Var.X0(rh8Var.a());
                                final int X03 = e37Var.X0(zbe.o(rh8Var, e37Var.getLayoutDirection()));
                                final int X04 = e37Var.X0(zbe.n(rh8Var, e37Var.getLayoutDirection()));
                                final int i11 = (X0 + i3) - X02;
                                return e37Var.q0(x02.i(j), i3, ls3.a, new xt4() { // from class: zfc
                                    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
                                    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
                                    @Override // defpackage.xt4
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r12) {
                                        /*
                                            r11 = this;
                                            lw8 r12 = (defpackage.lw8) r12
                                            mw8 r0 = defpackage.mw8.this
                                            int r1 = r0.b
                                            int r2 = r3
                                            int r1 = r2 - r1
                                            int r1 = r1 / 2
                                            int r3 = r2
                                            defpackage.lw8.z(r12, r0, r3, r1)
                                            float r1 = defpackage.vv.f
                                            int r1 = r12.X0(r1)
                                            int r0 = r0.a
                                            int r0 = java.lang.Math.max(r1, r0)
                                            mw8 r1 = r5
                                            int r4 = r1.a
                                            mw8 r5 = r4
                                            int r6 = r5.a
                                            long r7 = r6
                                            int r9 = defpackage.x02.i(r7)
                                            int r9 = r9 - r6
                                            float r6 = (float) r9
                                            r9 = 1073741824(0x40000000, float:2.0)
                                            float r6 = r6 / r9
                                            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
                                            r10 = 1065353216(0x3f800000, float:1.0)
                                            float r10 = r10 + r9
                                            float r10 = r10 * r6
                                            int r6 = java.lang.Math.round(r10)
                                            if (r6 >= r0) goto L40
                                            int r0 = r0 - r6
                                        L3d:
                                            int r0 = r0 + r3
                                            int r6 = r6 + r0
                                            goto L54
                                        L40:
                                            int r0 = r5.a
                                            int r0 = r0 + r6
                                            int r9 = defpackage.x02.i(r7)
                                            int r9 = r9 - r4
                                            if (r0 <= r9) goto L54
                                            int r0 = defpackage.x02.i(r7)
                                            int r0 = r0 - r4
                                            int r4 = r5.a
                                            int r4 = r4 + r6
                                            int r0 = r0 - r4
                                            goto L3d
                                        L54:
                                            agc r0 = r9
                                            jz r3 = r0.b
                                            lh9 r4 = defpackage.lz.e
                                            boolean r4 = r3.equals(r4)
                                            if (r4 == 0) goto L67
                                            int r0 = r5.b
                                            int r0 = r2 - r0
                                            int r0 = r0 / 2
                                            goto L90
                                        L67:
                                            ez r4 = defpackage.lz.d
                                            boolean r3 = r3.equals(r4)
                                            r4 = 0
                                            if (r3 == 0) goto L8f
                                            int r0 = r0.c
                                            int r3 = r5.b
                                            if (r0 != 0) goto L79
                                            int r0 = r2 - r3
                                            goto L90
                                        L79:
                                            int r9 = r10
                                            int r9 = r3 - r9
                                            int r0 = r0 - r9
                                            int r9 = r0 + r3
                                            int r10 = r11
                                            if (r9 <= r10) goto L86
                                            int r9 = r9 - r10
                                            int r0 = r0 - r9
                                        L86:
                                            int r3 = r2 - r3
                                            int r0 = java.lang.Math.max(r4, r0)
                                            int r0 = r3 - r0
                                            goto L90
                                        L8f:
                                            r0 = r4
                                        L90:
                                            defpackage.lw8.z(r12, r5, r6, r0)
                                            int r0 = defpackage.x02.i(r7)
                                            int r3 = r1.a
                                            int r0 = r0 - r3
                                            int r11 = r8
                                            int r0 = r0 - r11
                                            int r11 = r1.b
                                            int r2 = r2 - r11
                                            int r2 = r2 / 2
                                            defpackage.lw8.z(r12, r1, r0, r2)
                                            pvc r11 = defpackage.pvc.a
                                            return r11
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfc.invoke(java.lang.Object):java.lang.Object");
                                    }
                                });
                            }
                            i9++;
                            agcVar = this;
                        }
                        throw a82.A("Collection contains no element matching the predicate.");
                    }
                    i6++;
                    agcVar = this;
                }
                throw a82.A("Collection contains no element matching the predicate.");
            }
            i5++;
            agcVar = this;
        }
        throw a82.A("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.b37
    public final int f(u06 u06Var, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((w27) list.get(i3)).F(i);
        }
        return i2;
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        Integer valueOf;
        int X0 = u06Var.X0(this.d);
        int i2 = 0;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((w27) list.get(0)).j(i));
            int i3 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((w27) list.get(i3)).j(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        return Math.max(X0, i2);
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        Integer valueOf;
        int X0 = u06Var.X0(this.d);
        int i2 = 0;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((w27) list.get(0)).n0(i));
            int i3 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((w27) list.get(i3)).n0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        return Math.max(X0, i2);
    }
}
