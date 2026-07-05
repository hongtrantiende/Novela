package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h23  reason: default package */
/* loaded from: classes.dex */
public final class h23 extends jza implements yya {
    public final vt4 b;
    public final kra c;
    public g23 d = new g23(dra.j().g());

    public h23(vt4 vt4Var, kra kraVar) {
        this.b = vt4Var;
        this.c = kraVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.d;
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.getClass();
        this.d = (g23) kzaVar;
    }

    @Override // defpackage.yya
    public final Object getValue() {
        xt4 e = dra.j().e();
        if (e != null) {
            e.invoke(this);
        }
        zqa j = dra.j();
        return h((g23) dra.i(this.d, j), j, true, this.b).f;
    }

    public final g23 h(g23 g23Var, zqa zqaVar, boolean z, vt4 vt4Var) {
        gw7 p;
        g23 g23Var2;
        kra kraVar;
        int i;
        if (g23Var.d(this, zqaVar)) {
            if (z) {
                p = yae.p();
                Object[] objArr = p.a;
                int i2 = p.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((qv4) objArr[i3]).b();
                }
                try {
                    gv7 gv7Var = g23Var.e;
                    yx9 yx9Var = lra.a;
                    wy5 wy5Var = (wy5) yx9Var.get();
                    if (wy5Var == null) {
                        wy5Var = new wy5();
                        yx9Var.n(wy5Var);
                    }
                    int i4 = wy5Var.a;
                    Object[] objArr2 = gv7Var.b;
                    int[] iArr = gv7Var.c;
                    long[] jArr = gv7Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        iza izaVar = (iza) objArr2[i9];
                                        i = i6;
                                        wy5Var.a = i4 + iArr[i9];
                                        xt4 e = zqaVar.e();
                                        if (e != null) {
                                            e.invoke(izaVar);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    wy5Var.a = i4;
                    Object[] objArr3 = p.a;
                    int i10 = p.c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((qv4) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g23Var;
        }
        gv7 gv7Var2 = new gv7();
        yx9 yx9Var2 = lra.a;
        wy5 wy5Var2 = (wy5) yx9Var2.get();
        if (wy5Var2 == null) {
            wy5Var2 = new wy5();
            yx9Var2.n(wy5Var2);
        }
        int i12 = wy5Var2.a;
        p = yae.p();
        Object[] objArr4 = p.a;
        int i13 = p.c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((qv4) objArr4[i14]).b();
        }
        try {
            wy5Var2.a = i12 + 1;
            Object i15 = pae.i(new gt0(this, wy5Var2, gv7Var2, i12, 1), vt4Var);
            wy5Var2.a = i12;
            Object[] objArr5 = p.a;
            int i16 = p.c;
            for (int i17 = 0; i17 < i16; i17++) {
                ((qv4) objArr5[i17]).a();
            }
            Object obj = dra.c;
            synchronized (obj) {
                try {
                    zqa j2 = dra.j();
                    Object obj2 = g23Var.f;
                    if (obj2 != g23.h && (kraVar = this.c) != null && kraVar.i(i15, obj2)) {
                        g23Var.e = gv7Var2;
                        g23Var.g = g23Var.e(this, j2);
                        g23Var2 = g23Var;
                    } else {
                        g23 g23Var3 = this.d;
                        synchronized (obj) {
                            kza m = dra.m(g23Var3, this);
                            m.a(g23Var3);
                            m.a = j2.g();
                            g23Var2 = (g23) m;
                            g23Var2.e = gv7Var2;
                            g23Var2.g = g23Var2.e(this, j2);
                            g23Var2.f = i15;
                        }
                        return g23Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            wy5 wy5Var3 = (wy5) lra.a.get();
            if (wy5Var3 != null && wy5Var3.a == 0) {
                dra.j().m();
                synchronized (obj) {
                    zqa j3 = dra.j();
                    g23Var2.c = j3.g();
                    g23Var2.d = j3.h();
                    return g23Var2;
                }
            }
            return g23Var2;
        } finally {
            Object[] objArr6 = p.a;
            int i18 = p.c;
            for (int i19 = 0; i19 < i18; i19++) {
                ((qv4) objArr6[i19]).a();
            }
        }
    }

    public final g23 i() {
        zqa j = dra.j();
        return h((g23) dra.i(this.d, j), j, false, this.b);
    }

    public final String toString() {
        String str;
        g23 g23Var = (g23) dra.h(this.d);
        g23 g23Var2 = (g23) dra.h(this.d);
        if (g23Var2.d(this, dra.j())) {
            str = String.valueOf(g23Var2.f);
        } else {
            str = "<Not calculated>";
        }
        int hashCode = hashCode();
        return "DerivedState(value=" + str + ")@" + hashCode;
    }
}
