package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk9  reason: default package */
/* loaded from: classes.dex */
public final class vk9 {
    public final ny5 a;
    public final rg b;
    public final kj c;
    public final k7c d;
    public final kv7 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public bg i;
    public long j;
    public final ik k;
    public final sv7 l;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kj] */
    public vk9(wu7 wu7Var, rg rgVar) {
        this.a = wu7Var;
        this.b = rgVar;
        ?? obj = new Object();
        obj.b = new long[192];
        obj.c = new long[192];
        this.c = obj;
        this.d = new k7c();
        this.e = new kv7();
        this.j = -1L;
        this.k = new ik(this, 21);
        this.l = new sv7(0);
    }

    public static boolean c(i38 i38Var) {
        vg8 vg8Var = i38Var.n0;
        if (vg8Var != null && !pye.n(((s15) vg8Var).b())) {
            return true;
        }
        return false;
    }

    public static boolean d(od6 od6Var) {
        if (od6Var.C != -4) {
            return true;
        }
        return false;
    }

    public static long g(od6 od6Var) {
        kn knVar = od6Var.c0;
        i38 i38Var = (i38) knVar.e;
        long j = 0;
        for (i38 i38Var2 = (wv5) knVar.d; i38Var2 != null && i38Var2 != i38Var; i38Var2 = i38Var2.S) {
            if (c(i38Var2)) {
                return 9223372034707292159L;
            }
            j = py5.d(j, i38Var2.b0);
        }
        return j;
    }

    public static void j(od6 od6Var) {
        if (od6Var.c && !c((i38) od6Var.c0.e)) {
            od6Var.c = false;
            if (od6Var.e) {
                od6Var.d = g(od6Var);
                od6Var.e = false;
            }
            if (!py5.b(od6Var.d, 9223372034707292159L)) {
                gw7 z = od6Var.z();
                Object[] objArr = z.a;
                int i = z.c;
                for (int i2 = 0; i2 < i; i2++) {
                    j((od6) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk9.a():void");
    }

    public final long b(od6 od6Var) {
        if (d(od6Var)) {
            long j = ((long[]) this.c.b)[e(od6Var)];
            return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
        }
        return 9223372034707292159L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.od6 r8) {
        /*
            r7 = this;
            int r0 = r8.C
            r1 = -4
            if (r0 != r1) goto L7
        L5:
            r0 = r1
            goto L3b
        L7:
            int r2 = r8.b
            kj r7 = r7.c
            java.lang.Object r3 = r7.b
            long[] r3 = (long[]) r3
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            if (r0 < 0) goto L25
            int r5 = r7.a
            int r5 = r5 + (-2)
            if (r0 >= r5) goto L25
            int r5 = r0 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            r6 = r2 & r4
            if (r5 != r6) goto L25
            goto L3b
        L25:
            r0 = r2 & r4
            int r7 = r7.a
            r2 = 0
        L2a:
            int r5 = r7 + (-2)
            if (r2 >= r5) goto L5
            int r5 = r2 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            if (r5 != r0) goto L38
            r0 = r2
            goto L3b
        L38:
            int r2 = r2 + 3
            goto L2a
        L3b:
            if (r0 == r1) goto L3e
            goto L56
        L3e:
            int r7 = r8.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutNode "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " not found in RectList"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            defpackage.lv5.a(r7)
        L56:
            r8.C = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk9.e(od6):int");
    }

    public final void f(od6 od6Var) {
        int i;
        od6Var.c = true;
        kn knVar = od6Var.c0;
        i38 i38Var = (i38) knVar.e;
        a37 a37Var = od6Var.d0.p;
        int v0 = a37Var.v0();
        sv7 sv7Var = this.l;
        sv7Var.b = nae.e;
        sv7Var.c = nae.e;
        sv7Var.d = v0;
        sv7Var.e = a37Var.u0();
        while (true) {
            if (i38Var == null) {
                break;
            }
            od6 od6Var2 = i38Var.O;
            if (i38Var == ((i38) od6Var2.c0.e) && !od6Var2.c) {
                long b = b(od6Var2);
                if (!py5.b(b, 9223372034707292159L)) {
                    sv7Var.e((Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            vg8 vg8Var = i38Var.n0;
            if (vg8Var != null) {
                float[] b2 = ((s15) vg8Var).b();
                if (!pye.n(b2)) {
                    l27.e(b2, sv7Var);
                }
            }
            long j = i38Var.b0;
            sv7Var.e((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            i38Var = i38Var.S;
        }
        int i2 = (int) sv7Var.b;
        int i3 = (int) sv7Var.c;
        int i4 = (int) sv7Var.d;
        int i5 = (int) sv7Var.e;
        int i6 = od6Var.b;
        int i7 = od6Var.C;
        kj kjVar = this.c;
        int i8 = -4;
        if (i7 != -4) {
            int e = e(od6Var);
            long[] jArr = (long[]) kjVar.b;
            jArr[e] = (i2 << 32) | (i3 & 4294967295L);
            jArr[e + 1] = (4294967295L & i5) | (i4 << 32);
            int i9 = e + 2;
            long j2 = jArr[i9];
            jArr[i9] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            od6 v = od6Var.v();
            if (v != null) {
                i = v.b;
            } else {
                i = -1;
            }
            int i10 = i;
            if (v != null) {
                i8 = e(v);
            }
            od6Var.C = kjVar.t(i6, i2, i3, i4, i5, i10, i8, knVar.j(1024), knVar.j(16), this.d.a.a(i6));
        }
        od6Var.f = false;
        this.f = true;
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i11 = z.c;
        for (int i12 = 0; i12 < i11; i12++) {
            od6 od6Var3 = (od6) objArr[i12];
            if (od6Var3.K()) {
                f(od6Var3);
            }
        }
    }

    public final void h(od6 od6Var) {
        long j;
        boolean K = od6Var.K();
        kn knVar = od6Var.c0;
        if (K && od6Var.f) {
            od6 v = od6Var.v();
            if (v != null && !v.c) {
                if (v.e) {
                    v.e = false;
                    v.d = g(v);
                }
                j = v.d;
            } else if (v == null) {
                j = 0;
            } else {
                j = 9223372034707292159L;
            }
            i38 i38Var = (i38) knVar.e;
            if (!py5.b(j, 9223372034707292159L) && !c(i38Var)) {
                if (!od6Var.c) {
                    long d = py5.d(j, i38Var.b0);
                    a37 a37Var = od6Var.d0.p;
                    int v0 = a37Var.v0();
                    int u0 = a37Var.u0();
                    int i = od6Var.C;
                    kj kjVar = this.c;
                    if (i != -4) {
                        int e = e(od6Var);
                        if (v != null) {
                            int e2 = e(v);
                            long[] jArr = (long[]) kjVar.b;
                            long j2 = jArr[e2];
                            int i2 = ((int) (j2 >> 32)) + ((int) (d >> 32));
                            int i3 = ((int) j2) + ((int) (d & 4294967295L));
                            long j3 = jArr[e];
                            int i4 = i2 - ((int) (j3 >> 32));
                            int i5 = i3 - ((int) j3);
                            int i6 = e + 2;
                            long j4 = jArr[i6];
                            jArr[e] = (i2 << 32) | (i3 & 4294967295L);
                            jArr[e + 1] = ((v0 + i2) << 32) | ((u0 + i3) & 4294967295L);
                            jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                            if (i4 != 0 || i5 != 0) {
                                kjVar.A(e, i4, i5, j4);
                            }
                        } else {
                            int e3 = e(od6Var);
                            int i7 = (int) (d >> 32);
                            int i8 = (int) (d & 4294967295L);
                            long[] jArr2 = (long[]) kjVar.b;
                            long j5 = jArr2[e3];
                            jArr2[e3] = (i8 & 4294967295L) | (i7 << 32);
                            jArr2[e3 + 1] = ((u0 + i8) & 4294967295L) | ((v0 + i7) << 32);
                            int i9 = e3 + 2;
                            long j6 = jArr2[i9];
                            jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                            int i10 = i7 - ((int) (j5 >> 32));
                            int i11 = i8 - ((int) j5);
                            if (i10 != 0 || i11 != 0) {
                                kjVar.A(e3, i10, i11, j6);
                            }
                        }
                    } else {
                        int i12 = od6Var.b;
                        boolean j7 = knVar.j(1024);
                        boolean j8 = knVar.j(16);
                        boolean a = this.d.a.a(i12);
                        if (v != null) {
                            int i13 = v.b;
                            int e4 = e(v);
                            int i14 = (int) (d >> 32);
                            int i15 = (int) (d & 4294967295L);
                            int i16 = i12 & 33554431;
                            long[] jArr3 = (long[]) kjVar.b;
                            if ((((int) jArr3[e4 + 2]) & 33554431) != (33554431 & i13)) {
                                lv5.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                            }
                            long j9 = jArr3[e4];
                            int i17 = ((int) (j9 >> 32)) + i14;
                            int i18 = ((int) j9) + i15;
                            od6Var.C = kjVar.t(i16, i17, i18, i17 + v0, i18 + u0, i13, e4, j7, j8, a);
                        } else {
                            int i19 = (int) (d >> 32);
                            int i20 = (int) (d & 4294967295L);
                            od6Var.C = kjVar.t(i12, i19, i20, i19 + v0, i20 + u0, -1, -4, j7, j8, a);
                        }
                    }
                } else {
                    f(od6Var);
                    j(od6Var);
                }
            } else {
                f(od6Var);
            }
            od6Var.f = false;
            this.f = true;
            k();
        }
    }

    public final void i(od6 od6Var) {
        if (od6Var.C != -4) {
            int e = e(od6Var);
            long[] jArr = (long[]) this.c.b;
            jArr[e] = -1;
            jArr[e + 1] = -1;
            jArr[e + 2] = tk9.a;
            od6Var.C = -4;
            od6Var.f = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void k() {
        boolean z;
        bg bgVar = this.i;
        if (bgVar != null) {
            z = true;
        } else {
            z = false;
        }
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            rg rgVar = this.b;
            if (bgVar != null) {
                rgVar.removeCallbacks(bgVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.j = max;
            bg bgVar2 = new bg(0, this.k);
            rgVar.postDelayed(bgVar2, max - currentTimeMillis);
            this.i = bgVar2;
        }
    }
}
