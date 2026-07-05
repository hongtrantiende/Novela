package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g23  reason: default package */
/* loaded from: classes.dex */
public final class g23 extends kza {
    public static final Object h = new Object();
    public long c;
    public int d;
    public gv7 e;
    public Object f;
    public int g;

    public g23(long j) {
        super(j);
        gv7 gv7Var = h78.a;
        gv7Var.getClass();
        this.e = gv7Var;
        this.f = h;
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        kzaVar.getClass();
        g23 g23Var = (g23) kzaVar;
        this.e = g23Var.e;
        this.f = g23Var.f;
        this.g = g23Var.g;
    }

    @Override // defpackage.kza
    public final kza b() {
        return new g23(dra.j().g());
    }

    @Override // defpackage.kza
    public final kza c(long j) {
        return new g23(j);
    }

    public final boolean d(h23 h23Var, zqa zqaVar) {
        boolean z;
        boolean z2;
        Object obj = dra.c;
        synchronized (obj) {
            z = true;
            if (this.c == zqaVar.g()) {
                if (this.d == zqaVar.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != e(h23Var, zqaVar))) {
            z = false;
        }
        if (z && z2) {
            synchronized (obj) {
                this.c = zqaVar.g();
                this.d = zqaVar.h();
            }
            return z;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [g23] */
    /* JADX WARN: Type inference failed for: r13v5, types: [kza] */
    /* JADX WARN: Type inference failed for: r13v6, types: [kza, java.lang.Object] */
    public final int e(h23 h23Var, zqa zqaVar) {
        gv7 gv7Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? i5;
        synchronized (dra.c) {
            gv7Var = this.e;
        }
        int i6 = 7;
        if (gv7Var.e == 0) {
            return 7;
        }
        gw7 p = yae.p();
        Object[] objArr3 = p.a;
        int i7 = p.c;
        boolean z = false;
        for (int i8 = 0; i8 < i7; i8++) {
            ((qv4) objArr3[i8]).b();
        }
        try {
            Object[] objArr4 = gv7Var.b;
            int[] iArr = gv7Var.c;
            long[] jArr3 = gv7Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i9 = 0;
                while (true) {
                    long j3 = jArr3[i9];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i6) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        i2 = i6;
                        int i12 = z ? 1 : 0;
                        while (i12 < i11) {
                            if ((j3 & 255) < 128) {
                                int i13 = (i9 << 3) + i12;
                                j2 = j4;
                                iza izaVar = (iza) objArr4[i13];
                                int i14 = i10;
                                if (iArr[i13] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i12;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (izaVar instanceof h23) {
                                        h23 h23Var2 = (h23) izaVar;
                                        i5 = h23Var2.h((g23) dra.i(h23Var2.d, zqaVar), zqaVar, z, h23Var2.b);
                                        gv7 gv7Var2 = i5.e;
                                        Object[] objArr5 = gv7Var2.b;
                                        long[] jArr4 = gv7Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i12;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j5 = jArr4[i15];
                                                j = j3;
                                                int i16 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i17 = 8 - ((~(i15 - length2)) >>> 31);
                                                    for (int i18 = 0; i18 < i17; i18++) {
                                                        if ((j5 & 255) < 128) {
                                                            i16 = (i16 * 31) + System.identityHashCode((iza) objArr5[(i15 << 3) + i18]);
                                                        }
                                                        j5 >>= i14;
                                                    }
                                                    if (i17 != i14) {
                                                        i = i16;
                                                        break;
                                                    }
                                                }
                                                i = i16;
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                j3 = j;
                                                i14 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i12;
                                        objArr2 = objArr4;
                                        j = j3;
                                        i5 = dra.i(izaVar.a(), zqaVar);
                                    }
                                    i = (((i * 31) + System.identityHashCode(i5)) * 31) + Long.hashCode(i5.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i12;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i10;
                            }
                            j3 = j >> i4;
                            i10 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i12 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i6;
                        objArr = objArr4;
                    }
                    if (i9 != length) {
                        i9++;
                        i6 = i2;
                        jArr3 = jArr;
                        objArr4 = objArr;
                        z = false;
                    } else {
                        i6 = i;
                        break;
                    }
                }
            }
            i = i6;
            Object[] objArr6 = p.a;
            int i19 = p.c;
            for (int i20 = 0; i20 < i19; i20++) {
                ((qv4) objArr6[i20]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = p.a;
            int i21 = p.c;
            for (int i22 = 0; i22 < i21; i22++) {
                ((qv4) objArr7[i22]).a();
            }
            throw th;
        }
    }
}
