package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: toc  reason: default package */
/* loaded from: classes.dex */
public final class toc implements r94 {
    public final int a;
    public final int b;
    public final List c;
    public final km8 d;
    public final SparseIntArray e;
    public final qy2 f;
    public final m8b g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final n99 k;
    public yh4 l;
    public t94 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public voc r;
    public int s;
    public int t;

    public toc(int i, int i2, m8b m8bVar, lac lacVar, qy2 qy2Var) {
        this.f = qy2Var;
        this.a = i;
        this.b = i2;
        this.g = m8bVar;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(lacVar);
        } else {
            this.c = Collections.singletonList(lacVar);
        }
        this.d = new km8(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new n99(1);
        this.m = t94.m;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (voc) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new h4a(new rwa(this)));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [bl0, java.lang.Object, kj] */
    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        boolean z;
        s94 s94Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        long j;
        long length = s94Var.getLength();
        int i8 = this.a;
        if (i8 == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.o) {
            int i9 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            long j2 = -9223372036854775807L;
            n99 n99Var = this.k;
            if (i9 != 0 && !z && !n99Var.d) {
                int i10 = this.t;
                lac lacVar = n99Var.b;
                km8 km8Var = n99Var.c;
                if (i10 <= 0) {
                    n99Var.a(s94Var);
                    return 0;
                } else if (!n99Var.f) {
                    long length2 = s94Var.getLength();
                    int min = (int) Math.min(112800L, length2);
                    long j3 = length2 - min;
                    if (s94Var.getPosition() != j3) {
                        fr2Var.a = j3;
                        return 1;
                    }
                    km8Var.J(min);
                    s94Var.p();
                    s94Var.x(km8Var.a, 0, min);
                    int i11 = km8Var.b;
                    int i12 = km8Var.c;
                    int i13 = i12 - 188;
                    while (true) {
                        if (i13 < i11) {
                            break;
                        }
                        byte[] bArr = km8Var.a;
                        int i14 = -4;
                        int i15 = 0;
                        while (true) {
                            if (i14 > 4) {
                                break;
                            }
                            int i16 = (i14 * 188) + i13;
                            if (i16 >= i11 && i16 < i12 && bArr[i16] == 71) {
                                i15++;
                                if (i15 == 5) {
                                    long m = pae.m(km8Var, i13, i10);
                                    if (m != -9223372036854775807L) {
                                        j2 = m;
                                        break;
                                    }
                                }
                            } else {
                                i15 = 0;
                            }
                            i14++;
                        }
                        i13--;
                    }
                    n99Var.h = j2;
                    n99Var.f = true;
                    return 0;
                } else if (n99Var.h == -9223372036854775807L) {
                    n99Var.a(s94Var);
                    return 0;
                } else if (!n99Var.e) {
                    int min2 = (int) Math.min(112800L, s94Var.getLength());
                    if (s94Var.getPosition() != 0) {
                        fr2Var.a = 0L;
                        return 1;
                    }
                    km8Var.J(min2);
                    s94Var.p();
                    s94Var.x(km8Var.a, 0, min2);
                    int i17 = km8Var.b;
                    int i18 = km8Var.c;
                    while (true) {
                        if (i17 < i18) {
                            if (km8Var.a[i17] == 71) {
                                j = pae.m(km8Var, i17, i10);
                                if (j != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i17++;
                        } else {
                            j = -9223372036854775807L;
                            break;
                        }
                    }
                    n99Var.g = j;
                    n99Var.e = true;
                    return 0;
                } else {
                    long j4 = n99Var.g;
                    if (j4 == -9223372036854775807L) {
                        n99Var.a(s94Var);
                        return 0;
                    }
                    n99Var.i = lacVar.c(n99Var.h) - lacVar.b(j4);
                    n99Var.a(s94Var);
                    return 0;
                }
            }
            if (!this.p) {
                this.p = true;
                long j5 = n99Var.i;
                if (j5 != -9223372036854775807L) {
                    lac lacVar2 = n99Var.b;
                    int i19 = this.t;
                    lh9 lh9Var = new lh9(17);
                    ?? obj = new Object();
                    obj.a = i19;
                    obj.b = lacVar2;
                    obj.c = new km8();
                    i = 1;
                    z3 = false;
                    i2 = i8;
                    yh4 yh4Var = new yh4(lh9Var, obj, j5, j5 + 1, 0L, length, 188L, 940);
                    this.l = yh4Var;
                    this.m.v(yh4Var.a);
                } else {
                    i = 1;
                    z3 = false;
                    i2 = i8;
                    this.m.v(new ge0(j5));
                }
            } else {
                i = 1;
                z3 = false;
                i2 = i8;
            }
            if (this.q) {
                this.q = z3;
                d(0L, 0L);
                if (s94Var.getPosition() != 0) {
                    fr2Var.a = 0L;
                    return i;
                }
            }
            yh4 yh4Var2 = this.l;
            if (yh4Var2 != null && yh4Var2.c != null) {
                return yh4Var2.b(s94Var, fr2Var);
            }
            s94Var2 = s94Var;
            r1 = z3;
        } else {
            s94Var2 = s94Var;
            r1 = 0;
            i = 1;
            i2 = i8;
        }
        km8 km8Var2 = this.d;
        byte[] bArr2 = km8Var2.a;
        if (9400 - km8Var2.b < 188) {
            int a = km8Var2.a();
            if (a > 0) {
                System.arraycopy(bArr2, km8Var2.b, bArr2, r1, a);
            }
            km8Var2.K(bArr2, a);
        }
        while (true) {
            int a2 = km8Var2.a();
            SparseArray sparseArray = this.h;
            if (a2 < 188) {
                int i20 = km8Var2.c;
                int read = s94Var2.read(bArr2, i20, 9400 - i20);
                if (read == -1) {
                    int i21 = r1;
                    while (i21 < sparseArray.size()) {
                        voc vocVar = (voc) sparseArray.valueAt(i21);
                        if (vocVar instanceof ou8) {
                            ou8 ou8Var = (ou8) vocVar;
                            if (z && !ou8Var.e()) {
                                i7 = r1;
                            } else {
                                i7 = i;
                            }
                            if (ou8Var.c == 3 && ou8Var.j == -1 && ((!z || !(ou8Var.a instanceof x25)) && i7 != 0)) {
                                ou8Var.a(i, new km8());
                            }
                        }
                        i21++;
                        i = 1;
                    }
                    return -1;
                }
                km8Var2.L(i20 + read);
                i = 1;
            } else {
                int i22 = km8Var2.b;
                int i23 = km8Var2.c;
                byte[] bArr3 = km8Var2.a;
                int i24 = i22;
                while (i24 < i23 && bArr3[i24] != 71) {
                    i24++;
                }
                km8Var2.M(i24);
                int i25 = i24 + 188;
                voc vocVar2 = null;
                if (i25 > i23) {
                    int i26 = (i24 - i22) + this.s;
                    this.s = i26;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i26 > 376) {
                        throw xm8.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i27 = km8Var2.c;
                if (i25 > i27) {
                    return r1;
                }
                int m2 = km8Var2.m();
                if ((8388608 & m2) != 0) {
                    km8Var2.M(i25);
                    return r1;
                }
                if ((4194304 & m2) != 0) {
                    i5 = 1;
                } else {
                    i5 = r1;
                }
                int i28 = (2096896 & m2) >> 8;
                if ((m2 & 32) != 0) {
                    z2 = true;
                } else {
                    z2 = r1;
                }
                if ((m2 & 16) != 0) {
                    vocVar2 = (voc) sparseArray.get(i28);
                }
                if (vocVar2 == null) {
                    km8Var2.M(i25);
                    return r1;
                }
                if (i3 != i4) {
                    int i29 = m2 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i30 = sparseIntArray.get(i28, i29 - 1);
                    sparseIntArray.put(i28, i29);
                    if (i30 == i29) {
                        km8Var2.M(i25);
                        return r1;
                    } else if (i29 != ((i30 + 1) & 15)) {
                        vocVar2.c();
                    }
                }
                if (z2) {
                    int z4 = km8Var2.z();
                    if ((km8Var2.z() & 64) != 0) {
                        i6 = i4;
                    } else {
                        i6 = r1;
                    }
                    i5 |= i6;
                    km8Var2.N(z4 - 1);
                }
                boolean z5 = this.o;
                if (i3 == i4 || z5 || !this.j.get(i28, r1)) {
                    km8Var2.L(i25);
                    vocVar2.a(i5, km8Var2);
                    km8Var2.L(i27);
                }
                if (i3 != i4 && !z5 && this.o && length != -1) {
                    this.q = true;
                }
                km8Var2.M(i25);
                return r1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r1 = r1 + 1;
     */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.s94 r6) {
        /*
            r5 = this;
            km8 r5 = r5.d
            byte[] r5 = r5.a
            tt2 r6 = (defpackage.tt2) r6
            r0 = 0
            r1 = 940(0x3ac, float:1.317E-42)
            r6.f(r5, r0, r1, r0)
            r1 = r0
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r1 >= r2) goto L29
            r2 = r0
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r1
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.e(r1, r0)
            r5 = 1
            return r5
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toc.c(s94):boolean");
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        boolean z;
        yh4 yh4Var;
        long j3;
        boolean z2;
        SparseArray sparseArray = this.h;
        List list = this.c;
        if (this.a != 2) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lac lacVar = (lac) list.get(i);
            synchronized (lacVar) {
                j3 = lacVar.b;
            }
            if (j3 == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long d = lacVar.d();
                if (d != -9223372036854775807L && d != 0 && d != j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                lacVar.f(j2);
            }
        }
        if (j2 != 0 && (yh4Var = this.l) != null) {
            yh4Var.d(j2);
        }
        this.d.J(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((voc) sparseArray.valueAt(i2)).c();
        }
        this.s = 0;
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        if ((this.b & 1) == 0) {
            t94Var = new o40(t94Var, this.g);
        }
        this.m = t94Var;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
