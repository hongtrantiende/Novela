package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o57  reason: default package */
/* loaded from: classes.dex */
public final class o57 {
    public final n57 a;
    public final Object b;
    public final gx9[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public p57 g;
    public boolean h;
    public final boolean[] i;
    public final ei0[] j;
    public final ly2 k;
    public final u67 l;
    public o57 m;
    public bjc n;
    public ljc o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [sj1] */
    public o57(ei0[] ei0VarArr, long j, ly2 ly2Var, ij1 ij1Var, u67 u67Var, p57 p57Var, ljc ljcVar) {
        this.j = ei0VarArr;
        this.p = j;
        this.k = ly2Var;
        this.l = u67Var;
        e67 e67Var = p57Var.a;
        this.b = e67Var.a;
        this.g = p57Var;
        this.n = bjc.d;
        this.o = ljcVar;
        this.c = new gx9[ei0VarArr.length];
        this.i = new boolean[ei0VarArr.length];
        long j2 = p57Var.b;
        long j3 = p57Var.e;
        boolean z = p57Var.g;
        u67Var.getClass();
        Object obj = e67Var.a;
        int i = l09.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        e67 a = e67Var.a(pair.second);
        t67 t67Var = (t67) ((HashMap) u67Var.e).get(obj2);
        t67Var.getClass();
        ((HashSet) u67Var.h).add(t67Var);
        s67 s67Var = (s67) ((HashMap) u67Var.f).get(t67Var);
        if (s67Var != null) {
            s67Var.a.e(s67Var.b);
        }
        t67Var.c.add(a);
        t17 b = t67Var.a.b(a, ij1Var, j2);
        ((IdentityHashMap) u67Var.d).put(b, t67Var);
        u67Var.d();
        if (j3 != -9223372036854775807L) {
            b = new sj1(b, !z, 0L, j3, 0);
        }
        this.a = b;
    }

    public final long a(ljc ljcVar, long j, boolean z, boolean[] zArr) {
        ei0[] ei0VarArr;
        Object[] objArr;
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= ljcVar.a) {
                break;
            }
            if (z || !ljcVar.j(this.o, i)) {
                z3 = false;
            }
            this.i[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            ei0VarArr = this.j;
            int length = ei0VarArr.length;
            objArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (ei0VarArr[i2].b == -2) {
                objArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = ljcVar;
        c();
        long e = this.a.e((c14[]) ljcVar.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < ei0VarArr.length; i3++) {
            if (ei0VarArr[i3].b == -2 && this.o.k(i3)) {
                objArr[i3] = new Object();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (objArr[i4] != null) {
                wq9.D(ljcVar.k(i4));
                if (ei0VarArr[i4].b != -2) {
                    this.f = true;
                }
            } else {
                if (((c14[]) ljcVar.c)[i4] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wq9.D(z2);
            }
        }
        return e;
    }

    public final void b() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                ljc ljcVar = this.o;
                if (i < ljcVar.a) {
                    boolean k = ljcVar.k(i);
                    c14 c14Var = ((c14[]) this.o.c)[i];
                    if (k && c14Var != null) {
                        c14Var.l();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                ljc ljcVar = this.o;
                if (i < ljcVar.a) {
                    boolean k = ljcVar.k(i);
                    c14 c14Var = ((c14[]) this.o.c)[i];
                    if (k && c14Var != null) {
                        c14Var.i();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j;
        if (!this.e) {
            return this.g.b;
        }
        if (this.f) {
            j = this.a.u();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.g.f;
        }
        return j;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, aac aacVar, boolean z) {
        this.e = true;
        this.n = this.a.r();
        ljc j = j(f, aacVar, z);
        p57 p57Var = this.g;
        long j2 = p57Var.b;
        long j3 = p57Var.f;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        p57 p57Var2 = this.g;
        this.p = (p57Var2.b - a) + j4;
        this.g = p57Var2.b(a, p57Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f || this.a.u() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.g.b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        n57 n57Var = this.a;
        try {
            boolean z = n57Var instanceof sj1;
            u67 u67Var = this.l;
            if (z) {
                u67Var.h(((sj1) n57Var).a);
            } else {
                u67Var.h(n57Var);
            }
        } catch (RuntimeException e) {
            st0.i("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [hs5, ls5] */
    /* JADX WARN: Type inference failed for: r7v12, types: [ss5, hs5] */
    public final ljc j(float f, aac aacVar, boolean z) {
        gy2 gy2Var;
        String str;
        boolean z2;
        boolean z3;
        c14[] c14VarArr;
        boolean z4;
        boolean z5;
        boolean z6;
        mm9 mm9Var;
        ao9 ao9Var;
        ji0 k7Var;
        mm9 g;
        ys2 ys2Var;
        int i;
        int[] iArr;
        double d;
        long j;
        int[] iArr2;
        bjc[] bjcVarArr;
        Pair m;
        Point point;
        Pair pair;
        Context context;
        boolean z7;
        Context context2;
        int i2;
        int[] iArr3;
        int i3;
        ly2 ly2Var = this.k;
        ei0[] ei0VarArr = this.j;
        bjc bjcVar = this.n;
        ly2Var.getClass();
        int i4 = 1;
        int[] iArr4 = new int[ei0VarArr.length + 1];
        int length = ei0VarArr.length + 1;
        ajc[][] ajcVarArr = new ajc[length];
        int[][][] iArr5 = new int[ei0VarArr.length + 1][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = bjcVar.a;
            ajcVarArr[i5] = new ajc[i6];
            iArr5[i5] = new int[i6];
        }
        int length2 = ei0VarArr.length;
        int[] iArr6 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr6[i7] = ei0VarArr[i7].E();
        }
        int i8 = 0;
        while (i8 < bjcVar.a) {
            ajc a = bjcVar.a(i8);
            if (a.c == 5) {
                i2 = i4;
            } else {
                i2 = 0;
            }
            int length3 = ei0VarArr.length;
            int i9 = i4;
            int i10 = 0;
            int i11 = 0;
            while (i10 < ei0VarArr.length) {
                ei0 ei0Var = ei0VarArr[i10];
                bjc bjcVar2 = bjcVar;
                int[] iArr7 = iArr4;
                int i12 = i4;
                int i13 = 0;
                for (int i14 = 0; i14 < a.a; i14++) {
                    i13 = Math.max(i13, ei0Var.D(a.d[i14]) & 7);
                }
                if (iArr7[i10] == 0) {
                    i3 = i12;
                } else {
                    i3 = 0;
                }
                if (i13 > i11 || (i13 == i11 && i2 != 0 && i9 == 0 && i3 != 0)) {
                    i11 = i13;
                    i9 = i3;
                    length3 = i10;
                }
                i10++;
                i4 = i12;
                bjcVar = bjcVar2;
                iArr4 = iArr7;
            }
            bjc bjcVar3 = bjcVar;
            int[] iArr8 = iArr4;
            int i15 = i4;
            if (length3 == ei0VarArr.length) {
                iArr3 = new int[a.a];
            } else {
                ei0 ei0Var2 = ei0VarArr[length3];
                int[] iArr9 = new int[a.a];
                for (int i16 = 0; i16 < a.a; i16++) {
                    iArr9[i16] = ei0Var2.D(a.d[i16]);
                }
                iArr3 = iArr9;
            }
            int i17 = iArr8[length3];
            ajcVarArr[length3][i17] = a;
            iArr5[length3][i17] = iArr3;
            iArr8[length3] = i17 + 1;
            i8++;
            i4 = i15;
            bjcVar = bjcVar3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i18 = i4;
        bjc[] bjcVarArr2 = new bjc[ei0VarArr.length];
        String[] strArr = new String[ei0VarArr.length];
        int[] iArr11 = new int[ei0VarArr.length];
        for (int i19 = 0; i19 < ei0VarArr.length; i19++) {
            int i20 = iArr10[i19];
            bjcVarArr2[i19] = new bjc((ajc[]) a2d.S(i20, ajcVarArr[i19]));
            iArr5[i19] = (int[][]) a2d.S(i20, iArr5[i19]);
            strArr[i19] = ei0VarArr[i19].k();
            iArr11[i19] = ei0VarArr[i19].b;
        }
        m17 m17Var = new m17(iArr11, bjcVarArr2, iArr6, iArr5, new bjc((ajc[]) a2d.S(iArr10[ei0VarArr.length], ajcVarArr[ei0VarArr.length])));
        synchronized (ly2Var.c) {
            ly2Var.g = Thread.currentThread();
            gy2Var = ly2Var.f;
        }
        if (ly2Var.j == null && (context2 = ly2Var.d) != null) {
            ly2Var.j = Boolean.valueOf(a2d.P(context2));
        }
        if (gy2Var.B && Build.VERSION.SDK_INT >= 32 && ly2Var.h == null) {
            ly2Var.h = new hwa(ly2Var.d, new x0(ly2Var, 18), ly2Var.j);
        }
        int i21 = m17Var.a;
        b14[] b14VarArr = new b14[i21];
        ly2.d(m17Var, gy2Var, b14VarArr);
        ly2.b(m17Var, gy2Var, b14VarArr);
        ly2.c(m17Var, gy2Var, b14VarArr);
        int i22 = m17Var.a;
        Pair f2 = ly2.f(b14VarArr, i18);
        if (f2 == null) {
            int i23 = 0;
            while (true) {
                if (i23 < i22) {
                    if (2 == iArr11[i23] && bjcVarArr2[i23].a > 0) {
                        z7 = true;
                        break;
                    }
                    i23++;
                } else {
                    z7 = false;
                    break;
                }
            }
            f2 = ly2.n(1, m17Var, iArr5, new by2(z7, ly2Var, gy2Var, iArr6), new uk(12));
            if (f2 != null) {
                b14VarArr[((Integer) f2.second).intValue()] = (b14) f2.first;
            }
        }
        if (f2 == null) {
            str = null;
        } else {
            b14 b14Var = (b14) f2.first;
            str = b14Var.a.d[b14Var.b[0]].d;
        }
        Pair f3 = ly2.f(b14VarArr, 2);
        Pair f4 = ly2.f(b14VarArr, 4);
        if (f3 == null && f4 == null) {
            gy2Var.q.getClass();
            if (gy2Var.g && (context = ly2Var.d) != null) {
                point = a2d.x(context);
            } else {
                point = null;
            }
            Pair n = ly2.n(2, m17Var, iArr5, new j32(gy2Var, str, iArr6, point), new uk(11));
            if (n == null) {
                gy2Var.q.getClass();
                pair = ly2.n(4, m17Var, iArr5, new q6(gy2Var, 12), new uk(10));
            } else {
                pair = null;
            }
            if (pair != null) {
                b14VarArr[((Integer) pair.second).intValue()] = (b14) pair.first;
            } else if (n != null) {
                b14VarArr[((Integer) n.second).intValue()] = (b14) n.first;
            }
        }
        if (ly2.f(b14VarArr, 3) == null && (m = ly2Var.m(m17Var, iArr5, gy2Var, str)) != null) {
            b14VarArr[((Integer) m.second).intValue()] = (b14) m.first;
        }
        gy2Var.q.getClass();
        int i24 = ts5.c;
        ?? hs5Var = new hs5(4);
        int f5 = ei0.f(0, 0, 0, 0);
        int i25 = 0;
        while (i25 < i21) {
            b14 b14Var2 = b14VarArr[i25];
            if (b14Var2 != null) {
                ajc ajcVar = b14Var2.a;
                if (!gy2Var.F.get(i25)) {
                    iArr2 = iArr11;
                    if (!gy2Var.w.contains(Integer.valueOf(ajcVar.c))) {
                        hs5Var.a(ajcVar.b);
                        int i26 = 0;
                        while (true) {
                            int[] iArr12 = b14Var2.b;
                            bjcVarArr = bjcVarArr2;
                            if (i26 < iArr12.length) {
                                String str2 = ajcVar.d[iArr12[i26]].m;
                                if (str2 != null) {
                                    hs5Var.b(str2);
                                }
                                i26++;
                                bjcVarArr2 = bjcVarArr;
                            }
                        }
                        i25++;
                        iArr11 = iArr2;
                        bjcVarArr2 = bjcVarArr;
                    }
                    bjcVarArr = bjcVarArr2;
                    i25++;
                    iArr11 = iArr2;
                    bjcVarArr2 = bjcVarArr;
                }
            }
            iArr2 = iArr11;
            bjcVarArr = bjcVarArr2;
            i25++;
            iArr11 = iArr2;
            bjcVarArr2 = bjcVarArr;
        }
        int[] iArr13 = iArr11;
        bjc[] bjcVarArr3 = bjcVarArr2;
        ts5 g2 = hs5Var.g();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i27 = 0;
        while (i27 < i22) {
            if (iArr13[i27] == 5) {
                bjc bjcVar4 = bjcVarArr3[i27];
                int i28 = 0;
                while (i28 < bjcVar4.a) {
                    ajc a2 = bjcVar4.a(i28);
                    arrayList.add(a2);
                    int i29 = i27;
                    int[] iArr14 = (int[]) iArr5[i27][i28].clone();
                    bjc bjcVar5 = bjcVar4;
                    int i30 = i28;
                    for (int i31 = 0; i31 < iArr14.length; i31++) {
                        String str3 = a2.d[i31].m;
                        if (str3 != null && !g2.contains(str3)) {
                            iArr14[i31] = f5;
                        }
                    }
                    arrayList2.add(iArr14);
                    i28 = i30 + 1;
                    bjcVar4 = bjcVar5;
                    i27 = i29;
                }
            }
            i27++;
        }
        int size = arrayList.size();
        ajc[] ajcVarArr2 = new ajc[size];
        if (arrayList.size() == size) {
            z2 = true;
        } else {
            z2 = false;
        }
        wq9.D(z2);
        arrayList.toArray(ajcVarArr2);
        bjc bjcVar6 = new bjc(ajcVarArr2);
        int size2 = arrayList2.size();
        int[][] iArr15 = new int[size2];
        if (arrayList2.size() == size2) {
            z3 = true;
        } else {
            z3 = false;
        }
        wq9.D(z3);
        arrayList2.toArray(iArr15);
        for (int i32 = 0; i32 < i22; i32++) {
            if (iArr13[i32] == 5) {
                b14 l = ly2.l(bjcVar6, iArr15, gy2Var);
                b14VarArr[i32] = l;
                if (l == null) {
                    break;
                }
                Arrays.fill(iArr15[bjcVar6.b(l.a)], f5);
            }
        }
        for (int i33 = 0; i33 < i22; i33++) {
            int i34 = iArr13[i33];
            if (i34 != 2 && i34 != 1) {
                if (i34 != 3 && i34 != 4) {
                    if (i34 != 5 && b14VarArr[i33] == null) {
                        b14VarArr[i33] = ly2.l(bjcVarArr3[i33], iArr5[i33], gy2Var);
                    }
                }
            }
        }
        ly2.d(m17Var, gy2Var, b14VarArr);
        ly2.b(m17Var, gy2Var, b14VarArr);
        ly2.c(m17Var, gy2Var, b14VarArr);
        j55 j55Var = ly2Var.e;
        ys2 ys2Var2 = ly2Var.b;
        ys2Var2.getClass();
        j55Var.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (b14 b14Var3 : b14VarArr) {
            if (b14Var3 != null && b14Var3.b.length > 1) {
                ls5 i35 = qs5.i();
                i35.b(new j7(0L, 0L));
                arrayList3.add(i35);
            } else {
                arrayList3.add(null);
            }
        }
        int length4 = b14VarArr.length;
        long[][] jArr = new long[length4];
        for (int i36 = 0; i36 < b14VarArr.length; i36++) {
            b14 b14Var4 = b14VarArr[i36];
            if (b14Var4 == null) {
                jArr[i36] = new long[0];
            } else {
                int[] iArr16 = b14Var4.b;
                jArr[i36] = new long[iArr16.length];
                for (int i37 = 0; i37 < iArr16.length; i37++) {
                    long j2 = b14Var4.a.d[iArr16[i37]].j;
                    long[] jArr2 = jArr[i36];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i37] = j2;
                }
                Arrays.sort(jArr[i36]);
            }
        }
        int[] iArr17 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i38 = 0; i38 < length4; i38++) {
            long[] jArr4 = jArr[i38];
            if (jArr4.length == 0) {
                j = 0;
            } else {
                j = jArr4[0];
            }
            jArr3[i38] = j;
        }
        k7.v(arrayList3, jArr3);
        kue.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(az7.b);
        fu7 fu7Var = new fu7();
        gu7 gu7Var = new gu7(treeMap);
        gu7Var.C = fu7Var;
        int i39 = 0;
        while (i39 < length4) {
            long[] jArr5 = jArr[i39];
            if (jArr5.length <= 1) {
                ys2Var = ys2Var2;
                i = length4;
                iArr = iArr17;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                ys2Var = ys2Var2;
                int i40 = 0;
                while (true) {
                    long[] jArr6 = jArr[i39];
                    i = length4;
                    double d2 = 0.0d;
                    if (i40 >= jArr6.length) {
                        break;
                    }
                    int[] iArr18 = iArr17;
                    long j3 = jArr6[i40];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i40] = d2;
                    i40++;
                    length4 = i;
                    iArr17 = iArr18;
                }
                iArr = iArr17;
                int i41 = length5 - 1;
                double d3 = dArr[i41] - dArr[0];
                int i42 = 0;
                while (i42 < i41) {
                    double d4 = dArr[i42];
                    int i43 = i42 + 1;
                    double d5 = (d4 + dArr[i43]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    gu7Var.j(Double.valueOf(d), Integer.valueOf(i39));
                    i42 = i43;
                }
            }
            i39++;
            ys2Var2 = ys2Var;
            length4 = i;
            iArr17 = iArr;
        }
        ys2 ys2Var3 = ys2Var2;
        int[] iArr19 = iArr17;
        Collection collection = gu7Var.c;
        if (collection == null) {
            collection = new y2(gu7Var, 1);
            gu7Var.c = collection;
        }
        qs5 l2 = qs5.l(collection);
        for (int i44 = 0; i44 < l2.size(); i44++) {
            int intValue = ((Integer) l2.get(i44)).intValue();
            int i45 = iArr19[intValue] + 1;
            iArr19[intValue] = i45;
            jArr3[intValue] = jArr[intValue][i45];
            k7.v(arrayList3, jArr3);
        }
        for (int i46 = 0; i46 < b14VarArr.length; i46++) {
            if (arrayList3.get(i46) != null) {
                jArr3[i46] = jArr3[i46] * 2;
            }
        }
        k7.v(arrayList3, jArr3);
        ls5 i47 = qs5.i();
        for (int i48 = 0; i48 < arrayList3.size(); i48++) {
            ls5 ls5Var = (ls5) arrayList3.get(i48);
            if (ls5Var == null) {
                g = mm9.e;
            } else {
                g = ls5Var.g();
            }
            i47.b(g);
        }
        mm9 g3 = i47.g();
        c14[] c14VarArr2 = new c14[b14VarArr.length];
        for (int i49 = 0; i49 < b14VarArr.length; i49++) {
            b14 b14Var5 = b14VarArr[i49];
            if (b14Var5 != null) {
                int[] iArr20 = b14Var5.b;
                if (iArr20.length != 0) {
                    int length6 = iArr20.length;
                    ajc ajcVar2 = b14Var5.a;
                    if (length6 == 1) {
                        k7Var = new ji0(ajcVar2, new int[]{iArr20[0]});
                    } else {
                        k7Var = new k7(ajcVar2, iArr20, ys2Var3, 10000L, 25000L, 25000L, (qs5) g3.get(i49));
                    }
                    c14VarArr2[i49] = k7Var;
                }
            }
        }
        ao9[] ao9VarArr = new ao9[i21];
        for (int i50 = 0; i50 < i21; i50++) {
            int i51 = m17Var.b[i50];
            if (!gy2Var.F.get(i50) && !gy2Var.w.contains(Integer.valueOf(i51)) && (m17Var.b[i50] == -2 || c14VarArr2[i50] != null)) {
                ao9Var = ao9.c;
            } else {
                ao9Var = null;
            }
            ao9VarArr[i50] = ao9Var;
        }
        gy2Var.q.getClass();
        Pair create = Pair.create(ao9VarArr, c14VarArr2);
        c14[] c14VarArr3 = (c14[]) create.second;
        int length7 = c14VarArr3.length;
        List[] listArr = new List[length7];
        for (int i52 = 0; i52 < c14VarArr3.length; i52++) {
            c14 c14Var = c14VarArr3[i52];
            if (c14Var != null) {
                mm9Var = qs5.r(c14Var);
            } else {
                ms5 ms5Var = qs5.b;
                mm9Var = mm9.e;
            }
            listArr[i52] = mm9Var;
        }
        ?? hs5Var2 = new hs5(4);
        int i53 = 0;
        while (true) {
            int i54 = m17Var.a;
            bjc[] bjcVarArr4 = m17Var.c;
            if (i53 >= i54) {
                break;
            }
            bjc bjcVar7 = bjcVarArr4[i53];
            int i55 = 0;
            while (i55 < bjcVar7.a) {
                ajc a3 = bjcVar7.a(i55);
                int i56 = bjcVarArr4[i53].a(i55).a;
                int[] iArr21 = new int[i56];
                int i57 = 0;
                int i58 = 0;
                while (i57 < i56) {
                    List[] listArr2 = listArr;
                    if ((m17Var.e[i53][i55][i57] & 7) == 4) {
                        iArr21[i58] = i57;
                        i58++;
                    }
                    i57++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr21, i58);
                int i59 = 16;
                bjc bjcVar8 = bjcVar7;
                String str4 = null;
                int i60 = 0;
                boolean z8 = false;
                int i61 = 0;
                while (i60 < copyOf.length) {
                    int[] iArr22 = copyOf;
                    String str5 = bjcVarArr4[i53].a(i55).d[copyOf[i60]].o;
                    int i62 = i61 + 1;
                    if (i61 == 0) {
                        str4 = str5;
                    } else {
                        z8 = (!Objects.equals(str4, str5)) | z8;
                    }
                    i59 = Math.min(i59, m17Var.e[i53][i55][i60] & 24);
                    i60++;
                    i61 = i62;
                    copyOf = iArr22;
                }
                if (z8) {
                    i59 = Math.min(i59, m17Var.d[i53]);
                }
                if (i59 != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i63 = a3.a;
                int[] iArr23 = new int[i63];
                boolean[] zArr = new boolean[i63];
                for (int i64 = 0; i64 < a3.a; i64++) {
                    iArr23[i64] = m17Var.e[i53][i55][i64] & 7;
                    boolean z9 = false;
                    int i65 = 0;
                    while (i65 < length7) {
                        List list = listArr3[i65];
                        int i66 = length7;
                        bjc[] bjcVarArr5 = bjcVarArr4;
                        int i67 = 0;
                        while (true) {
                            if (i67 < list.size()) {
                                c14 c14Var2 = (c14) list.get(i67);
                                int i68 = i67;
                                if (c14Var2.c().equals(a3) && c14Var2.u(i64) != -1) {
                                    z9 = true;
                                    break;
                                }
                                i67 = i68 + 1;
                            }
                        }
                        i65++;
                        length7 = i66;
                        bjcVarArr4 = bjcVarArr5;
                    }
                    zArr[i64] = z9;
                }
                hs5Var2.b(new sjc(a3, z6, iArr23, zArr));
                i55++;
                listArr = listArr3;
                bjcVar7 = bjcVar8;
                length7 = length7;
            }
            i53++;
        }
        bjc bjcVar9 = m17Var.f;
        for (int i69 = 0; i69 < bjcVar9.a; i69++) {
            ajc a4 = bjcVar9.a(i69);
            int[] iArr24 = new int[a4.a];
            Arrays.fill(iArr24, 0);
            hs5Var2.b(new sjc(a4, false, iArr24, new boolean[a4.a]));
        }
        ljc ljcVar = new ljc((ao9[]) create.first, (c14[]) create.second, new tjc(hs5Var2.g()), m17Var);
        for (int i70 = 0; i70 < ljcVar.a; i70++) {
            boolean k = ljcVar.k(i70);
            c14[] c14VarArr4 = (c14[]) ljcVar.c;
            if (k) {
                if (c14VarArr4[i70] == null && this.j[i70].b != -2) {
                    z5 = false;
                    wq9.D(z5);
                }
                z5 = true;
                wq9.D(z5);
            } else {
                if (c14VarArr4[i70] == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                wq9.D(z4);
            }
        }
        for (c14 c14Var3 : (c14[]) ljcVar.c) {
            if (c14Var3 != null) {
                c14Var3.q(f);
                c14Var3.g(z);
            }
        }
        return ljcVar;
    }

    public final void k() {
        n57 n57Var = this.a;
        if (n57Var instanceof sj1) {
            long j = this.g.e;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            sj1 sj1Var = (sj1) n57Var;
            sj1Var.f = 0L;
            sj1Var.C = j;
        }
    }
}
