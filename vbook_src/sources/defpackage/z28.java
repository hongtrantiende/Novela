package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z28  reason: default package */
/* loaded from: classes.dex */
public final class z28 extends s38 {
    public final mq7 c;
    public final tx6 d;
    public final my6 e;
    public i38 f;
    public r09 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public z28(mq7 mq7Var) {
        this.c = mq7Var;
        tx6 tx6Var = new tx6();
        tx6Var.c = new long[2];
        this.d = tx6Var;
        this.e = new my6(2);
        this.i = true;
        this.j = true;
    }

    @Override // defpackage.s38
    public final boolean a(my6 my6Var, sc6 sc6Var, ejf ejfVar, boolean z) {
        tx6 tx6Var;
        my6 my6Var2;
        Object obj;
        int i;
        boolean z2;
        boolean z3;
        r09 r09Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        int i4;
        boolean z10;
        int i5;
        int i6;
        int i7;
        int i8;
        z09 z09Var;
        sc6 sc6Var2 = sc6Var;
        boolean a = super.a(my6Var, sc6Var, ejfVar, z);
        mq7 mq7Var = this.c;
        if (mq7Var.J) {
            gw7 gw7Var = null;
            while (mq7Var != null) {
                if (mq7Var instanceof c19) {
                    this.f = voe.s((c19) mq7Var, 16);
                } else if ((mq7Var.c & 16) != 0 && (mq7Var instanceof m03)) {
                    int i9 = 0;
                    for (mq7 mq7Var2 = ((m03) mq7Var).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                        if ((mq7Var2.c & 16) != 0) {
                            i9++;
                            if (i9 == 1) {
                                mq7Var = mq7Var2;
                            } else {
                                if (gw7Var == null) {
                                    gw7Var = new gw7(new mq7[16], 0);
                                }
                                if (mq7Var != null) {
                                    gw7Var.b(mq7Var);
                                    mq7Var = null;
                                }
                                gw7Var.b(mq7Var2);
                            }
                        }
                    }
                    if (i9 == 1) {
                    }
                }
                mq7Var = voe.h(gw7Var);
            }
            if (this.f != null) {
                int f = my6Var.f();
                int i10 = 0;
                while (true) {
                    tx6Var = this.d;
                    my6Var2 = this.e;
                    if (i10 >= f) {
                        break;
                    }
                    long c = my6Var.c(i10);
                    z09 z09Var2 = (z09) my6Var.g(i10);
                    if (tx6Var.c(c)) {
                        long j = z09Var2.g;
                        long j2 = z09Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z10 = a;
                            ArrayList arrayList = new ArrayList(z09Var2.b().size());
                            List b = z09Var2.b();
                            i5 = f;
                            int size = b.size();
                            i6 = i10;
                            int i11 = 0;
                            while (i11 < size) {
                                List list = b;
                                m65 m65Var = (m65) b.get(i11);
                                my6 my6Var3 = my6Var2;
                                long j3 = c;
                                long j4 = m65Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    z09Var = z09Var2;
                                    long j5 = m65Var.a;
                                    i7 = size;
                                    i38 i38Var = this.f;
                                    i38Var.getClass();
                                    i8 = i11;
                                    arrayList.add(new m65(j5, i38Var.l0(sc6Var2, j4, true), m65Var.c, m65Var.d, m65Var.e));
                                } else {
                                    i7 = size;
                                    i8 = i11;
                                    z09Var = z09Var2;
                                }
                                i11 = i8 + 1;
                                size = i7;
                                b = list;
                                my6Var2 = my6Var3;
                                c = j3;
                                z09Var2 = z09Var;
                            }
                            my6 my6Var4 = my6Var2;
                            long j6 = c;
                            i38 i38Var2 = this.f;
                            i38Var2.getClass();
                            long l0 = i38Var2.l0(sc6Var2, j, true);
                            i38 i38Var3 = this.f;
                            i38Var3.getClass();
                            z09 z09Var3 = new z09(z09Var2.a, z09Var2.b, i38Var3.l0(sc6Var2, j2, true), z09Var2.d, z09Var2.e, z09Var2.f, l0, z09Var2.h, z09Var2.i, arrayList, z09Var2.j, z09Var2.k, z09Var2.l, z09Var2.n);
                            z09 z09Var4 = z09Var2.q;
                            if (z09Var4 == null) {
                                z09Var4 = z09Var2;
                            }
                            z09Var3.q = z09Var4;
                            z09 z09Var5 = z09Var2.q;
                            if (z09Var5 != null) {
                                z09Var2 = z09Var5;
                            }
                            z09Var3.q = z09Var2;
                            my6Var4.d(z09Var3, j6);
                        } else {
                            z10 = a;
                            i5 = f;
                            i6 = i10;
                        }
                    } else {
                        z10 = a;
                        i5 = f;
                        i6 = i10;
                    }
                    i10 = i6 + 1;
                    sc6Var2 = sc6Var;
                    f = i5;
                    a = z10;
                }
                boolean z11 = a;
                if (my6Var2.f() == 0) {
                    tx6Var.b = 0;
                    this.a.g();
                    return true;
                }
                int i12 = tx6Var.b;
                while (true) {
                    i12--;
                    char c2 = 65535;
                    if (-1 >= i12) {
                        break;
                    }
                    long j7 = tx6Var.c[i12];
                    if (my6Var.a) {
                        int i13 = my6Var.d;
                        long[] jArr = my6Var.b;
                        Object[] objArr = my6Var.c;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < i13) {
                            Object obj2 = objArr[i14];
                            char c3 = c2;
                            if (obj2 != zr1.e) {
                                if (i14 != i15) {
                                    jArr[i15] = jArr[i14];
                                    objArr[i15] = obj2;
                                    objArr[i14] = null;
                                }
                                i15++;
                            }
                            i14++;
                            c2 = c3;
                        }
                        my6Var.a = false;
                        my6Var.d = i15;
                    }
                    if (ipe.q(my6Var.b, my6Var.d, j7) < 0 && i12 < (i4 = tx6Var.b)) {
                        int i16 = i4 - 1;
                        int i17 = i12;
                        while (i17 < i16) {
                            long[] jArr2 = tx6Var.c;
                            int i18 = i17 + 1;
                            jArr2[i17] = jArr2[i18];
                            i17 = i18;
                        }
                        tx6Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(my6Var2.f());
                int f2 = my6Var2.f();
                for (int i19 = 0; i19 < f2; i19++) {
                    arrayList2.add(my6Var2.g(i19));
                }
                r09 r09Var2 = new r09(arrayList2, ejfVar);
                int size2 = arrayList2.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size2) {
                        obj = arrayList2.get(i20);
                        if (ejfVar.h(((z09) obj).a)) {
                            break;
                        }
                        i20++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                z09 z09Var6 = (z09) obj;
                if (z09Var6 != null) {
                    boolean z12 = z09Var6.d;
                    if (!z) {
                        i = false;
                        this.i = false;
                    } else {
                        i = false;
                        if (!this.i && (z12 || z09Var6.h)) {
                            i38 i38Var4 = this.f;
                            i38Var4.getClass();
                            long j8 = i38Var4.c;
                            long j9 = z09Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i21 = (int) (j8 >> 32);
                            int i22 = (int) (j8 & 4294967295L);
                            if (intBitsToFloat < nae.e) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (intBitsToFloat > i21) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean z13 = z4 | z5;
                            if (intBitsToFloat2 < nae.e) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            boolean z14 = z13 | z6;
                            if (intBitsToFloat2 > i22) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z2 = true;
                            this.i = !(z14 | z7);
                            z8 = this.i;
                            z9 = this.h;
                            int i23 = 5;
                            if (z8 == z9 && ((i3 = r09Var2.f) == 3 || i3 == 4 || i3 == 5)) {
                                if (z8) {
                                    i23 = 4;
                                }
                                r09Var2.f = i23;
                            } else {
                                i2 = r09Var2.f;
                                if (i2 != 4 && z9 && !this.j) {
                                    r09Var2.f = 3;
                                } else if (i2 == 5 && z8 && z12) {
                                    r09Var2.f = 3;
                                }
                            }
                        }
                    }
                    z2 = true;
                    z8 = this.i;
                    z9 = this.h;
                    int i232 = 5;
                    if (z8 == z9) {
                    }
                    i2 = r09Var2.f;
                    if (i2 != 4) {
                    }
                    if (i2 == 5) {
                        r09Var2.f = 3;
                    }
                } else {
                    i = false;
                    z2 = true;
                }
                if (!z11 && r09Var2.f == 3 && (r09Var = this.g) != null) {
                    List list2 = r09Var.a;
                    int size3 = list2.size();
                    List list3 = r09Var2.a;
                    if (size3 == list3.size()) {
                        int size4 = list3.size();
                        for (int i24 = i; i24 < size4; i24++) {
                            if (y78.d(((z09) list2.get(i24)).c, ((z09) list3.get(i24)).c)) {
                            }
                        }
                        z3 = i;
                        this.g = r09Var2;
                        return z3;
                    }
                }
                z3 = z2;
                this.g = r09Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.s38
    public final void b(ejf ejfVar) {
        super.b(ejfVar);
        r09 r09Var = this.g;
        if (r09Var == null) {
            return;
        }
        this.h = this.i;
        List list = r09Var.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z09 z09Var = (z09) list.get(i);
            boolean z2 = z09Var.d;
            long j = z09Var.a;
            boolean h = ejfVar.h(j);
            boolean z3 = this.i;
            if ((!z2 && !h) || (!z2 && !z3)) {
                this.d.e(j);
            }
        }
        this.i = false;
        if (r09Var.f == 5) {
            z = true;
        }
        this.j = z;
    }

    public final void c() {
        gw7 gw7Var = this.a;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((z28) objArr[i2]).c();
        }
        mq7 mq7Var = this.c;
        gw7 gw7Var2 = null;
        while (mq7Var != null) {
            if (mq7Var instanceof c19) {
                ((c19) mq7Var).n0();
            } else if ((mq7Var.c & 16) != 0 && (mq7Var instanceof m03)) {
                int i3 = 0;
                for (mq7 mq7Var2 = ((m03) mq7Var).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                    if ((mq7Var2.c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            mq7Var = mq7Var2;
                        } else {
                            if (gw7Var2 == null) {
                                gw7Var2 = new gw7(new mq7[16], 0);
                            }
                            if (mq7Var != null) {
                                gw7Var2.b(mq7Var);
                                mq7Var = null;
                            }
                            gw7Var2.b(mq7Var2);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            mq7Var = voe.h(gw7Var2);
        }
    }

    public final boolean d(ejf ejfVar) {
        boolean z;
        od6 od6Var;
        my6 my6Var = this.e;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (my6Var.f() != 0) {
            mq7 mq7Var = this.c;
            if (mq7Var.J) {
                i38 i38Var = mq7Var.D;
                if (i38Var != null && (od6Var = i38Var.O) != null) {
                    z = od6Var.K();
                } else {
                    z = false;
                }
                if (z) {
                    r09 r09Var = this.g;
                    r09Var.getClass();
                    i38 i38Var2 = this.f;
                    i38Var2.getClass();
                    long j = i38Var2.c;
                    mq7 mq7Var2 = mq7Var;
                    gw7 gw7Var = null;
                    while (mq7Var2 != null) {
                        if (mq7Var2 instanceof c19) {
                            ((c19) mq7Var2).b0(r09Var, s09.c, j);
                        } else if ((mq7Var2.c & 16) != 0 && (mq7Var2 instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mq7Var2 = mq7Var3;
                                    } else {
                                        if (gw7Var == null) {
                                            gw7Var = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var2 != null) {
                                            gw7Var.b(mq7Var2);
                                            mq7Var2 = null;
                                        }
                                        gw7Var.b(mq7Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mq7Var2 = voe.h(gw7Var);
                    }
                    if (mq7Var.J) {
                        gw7 gw7Var2 = this.a;
                        Object[] objArr = gw7Var2.a;
                        int i2 = gw7Var2.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((z28) objArr[i3]).d(ejfVar);
                        }
                    }
                    z2 = true;
                }
            }
        }
        b(ejfVar);
        my6Var.a();
        this.f = null;
        return z2;
    }

    public final boolean e(ejf ejfVar, boolean z) {
        boolean z2;
        od6 od6Var;
        if (this.e.f() == 0) {
            return false;
        }
        mq7 mq7Var = this.c;
        if (mq7Var.J) {
            i38 i38Var = mq7Var.D;
            if (i38Var != null && (od6Var = i38Var.O) != null) {
                z2 = od6Var.K();
            } else {
                z2 = false;
            }
            if (z2) {
                r09 r09Var = this.g;
                r09Var.getClass();
                i38 i38Var2 = this.f;
                i38Var2.getClass();
                long j = i38Var2.c;
                mq7 mq7Var2 = mq7Var;
                gw7 gw7Var = null;
                while (mq7Var2 != null) {
                    if (mq7Var2 instanceof c19) {
                        ((c19) mq7Var2).b0(r09Var, s09.a, j);
                    } else if ((mq7Var2.c & 16) != 0 && (mq7Var2 instanceof m03)) {
                        int i = 0;
                        for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                            if ((mq7Var3.c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    mq7Var2 = mq7Var3;
                                } else {
                                    if (gw7Var == null) {
                                        gw7Var = new gw7(new mq7[16], 0);
                                    }
                                    if (mq7Var2 != null) {
                                        gw7Var.b(mq7Var2);
                                        mq7Var2 = null;
                                    }
                                    gw7Var.b(mq7Var3);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    mq7Var2 = voe.h(gw7Var);
                }
                if (mq7Var.J) {
                    gw7 gw7Var2 = this.a;
                    Object[] objArr = gw7Var2.a;
                    int i2 = gw7Var2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        this.f.getClass();
                        ((z28) objArr[i3]).e(ejfVar, z);
                    }
                }
                if (mq7Var.J) {
                    gw7 gw7Var3 = null;
                    while (mq7Var != null) {
                        if (mq7Var instanceof c19) {
                            ((c19) mq7Var).b0(r09Var, s09.b, j);
                        } else if ((mq7Var.c & 16) != 0 && (mq7Var instanceof m03)) {
                            int i4 = 0;
                            for (mq7 mq7Var4 = ((m03) mq7Var).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                if ((mq7Var4.c & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        mq7Var = mq7Var4;
                                    } else {
                                        if (gw7Var3 == null) {
                                            gw7Var3 = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var != null) {
                                            gw7Var3.b(mq7Var);
                                            mq7Var = null;
                                        }
                                        gw7Var3.b(mq7Var4);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        mq7Var = voe.h(gw7Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, kv7 kv7Var) {
        tx6 tx6Var = this.d;
        if (tx6Var.c(j) && kv7Var.g(this) < 0) {
            tx6Var.e(j);
            this.e.e(j);
        }
        gw7 gw7Var = this.a;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((z28) objArr[i2]).f(j, kv7Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
