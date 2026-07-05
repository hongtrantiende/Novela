package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h75  reason: default package */
/* loaded from: classes.dex */
public final class h75 implements n57, z75 {
    public final ox9 C;
    public final cl3 D;
    public final ij1 E;
    public final IdentityHashMap F;
    public final g99 G;
    public final kh5 H;
    public final boolean I;
    public final int J;
    public final a09 K;
    public final mce L = new mce(this);
    public m57 M;
    public int N;
    public bjc O;
    public g85[] P;
    public g85[] Q;
    public int R;
    public lx1 S;
    public final long T;
    public final du2 a;
    public final hu2 b;
    public final fz4 c;
    public final ys2 d;
    public final fl3 e;
    public final cl3 f;

    public h75(du2 du2Var, hu2 hu2Var, fz4 fz4Var, ys2 ys2Var, fl3 fl3Var, cl3 cl3Var, ox9 ox9Var, cl3 cl3Var2, ij1 ij1Var, kh5 kh5Var, boolean z, int i, a09 a09Var) {
        this.a = du2Var;
        this.b = hu2Var;
        this.c = fz4Var;
        this.d = ys2Var;
        this.e = fl3Var;
        this.f = cl3Var;
        this.C = ox9Var;
        this.D = cl3Var2;
        this.E = ij1Var;
        this.H = kh5Var;
        this.I = z;
        this.J = i;
        this.K = a09Var;
        kh5Var.getClass();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        this.S = new lx1(mm9Var, mm9Var);
        this.F = new IdentityHashMap();
        this.G = new g99(10);
        this.P = new g85[0];
        this.Q = new g85[0];
        this.T = Long.MIN_VALUE;
    }

    public static vq4 d(vq4 vq4Var, vq4 vq4Var2, boolean z) {
        tb7 tb7Var;
        int i;
        String str;
        String str2;
        qs5 qs5Var;
        int i2;
        int i3;
        String str3;
        int i4;
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        int i5 = -1;
        if (vq4Var2 != null) {
            str2 = vq4Var2.k;
            tb7Var = vq4Var2.l;
            i2 = vq4Var2.G;
            i = vq4Var2.e;
            i3 = vq4Var2.f;
            str = vq4Var2.d;
            str3 = vq4Var2.b;
            qs5Var = vq4Var2.c;
        } else {
            String v = a2d.v(1, vq4Var.k);
            tb7Var = vq4Var.l;
            if (z) {
                i2 = vq4Var.G;
                i = vq4Var.e;
                i3 = vq4Var.f;
                str = vq4Var.d;
                str3 = vq4Var.b;
                str2 = v;
                qs5Var = vq4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = v;
                qs5Var = mm9Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String e = lc7.e(str2);
        if (z) {
            i4 = vq4Var.h;
        } else {
            i4 = -1;
        }
        if (z) {
            i5 = vq4Var.i;
        }
        uq4 uq4Var = new uq4();
        uq4Var.a = vq4Var.a;
        uq4Var.b = str3;
        uq4Var.c = qs5.l(qs5Var);
        uq4Var.m = lc7.p(vq4Var.n);
        uq4Var.n = lc7.p(e);
        uq4Var.j = str2;
        uq4Var.k = tb7Var;
        uq4Var.h = i4;
        uq4Var.i = i5;
        uq4Var.F = i2;
        uq4Var.e = i;
        uq4Var.f = i3;
        uq4Var.d = str;
        return new vq4(uq4Var);
    }

    @Override // defpackage.z75
    public final void a() {
        g85[] g85VarArr;
        qs5 qs5Var;
        long j;
        for (g85 g85Var : this.P) {
            ij1 ij1Var = g85Var.F;
            f75 f75Var = g85Var.d;
            ArrayList arrayList = g85Var.J;
            if (!arrayList.isEmpty()) {
                g75 g75Var = (g75) yf2.t(arrayList);
                int c = f75Var.c(g75Var);
                int i = g75Var.K;
                boolean z = true;
                if (c == 1) {
                    if (!g75Var.h()) {
                        if (i == -1) {
                            z = false;
                        }
                        wq9.D(z);
                        q75 b = f75Var.g.b(false, g75Var.I);
                        b.getClass();
                        qs5 qs5Var2 = b.r;
                        int i2 = (int) (g75Var.F - b.k);
                        if (i2 < 0) {
                            j = 0;
                        } else {
                            if (i2 < qs5Var2.size()) {
                                qs5Var = ((n75) qs5Var2.get(i2)).I;
                            } else {
                                qs5Var = b.s;
                            }
                            j = ((l75) qs5Var.get(i)).c;
                        }
                        g75Var.g0 = j;
                    }
                } else if (c == 0) {
                    g85Var.N.post(new ex2(7, g85Var, g75Var));
                } else if (c == 2 && !g85Var.p0 && ij1Var.O()) {
                    ij1Var.m();
                }
            }
        }
        this.M.d(this);
    }

    @Override // defpackage.z75
    public final boolean b(Uri uri, jt1 jt1Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        b85 b85Var;
        cy5 cy5Var;
        int u;
        boolean z4;
        b85 b85Var2;
        g85[] g85VarArr = this.P;
        int length = g85VarArr.length;
        int i2 = 0;
        boolean z5 = false;
        while (i2 < length) {
            g85 g85Var = g85VarArr[i2];
            f75 f75Var = g85Var.d;
            b85[] b85VarArr = f75Var.e;
            hu2 hu2Var = f75Var.g;
            int length2 = b85VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                b85 b85Var3 = b85VarArr[i3];
                gu2 gu2Var = (gu2) hu2Var.d.get(uri);
                if (gu2Var != null) {
                    b85Var = gu2Var.a;
                } else {
                    b85Var = null;
                }
                if (b85Var3.equals(b85Var)) {
                    if (!z) {
                        mc2 a = f75Var.a(uri);
                        g85Var.E.getClass();
                        cy5Var = ox9.o(a, jt1Var);
                    } else {
                        cy5Var = null;
                    }
                    f75Var.o = uri;
                    if (cy5Var != null) {
                        int i4 = cy5Var.a;
                        i = i2;
                        boolean z6 = false;
                        long j = cy5Var.b;
                        if (i4 != 1) {
                            if (i4 == 2) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < b85VarArr.length) {
                                        b85 b85Var4 = b85VarArr[i5];
                                        z2 = z6;
                                        gu2 gu2Var2 = (gu2) hu2Var.d.get(uri);
                                        if (gu2Var2 != null) {
                                            b85Var2 = gu2Var2.a;
                                        } else {
                                            b85Var2 = null;
                                        }
                                        if (b85Var4.equals(b85Var2)) {
                                            break;
                                        }
                                        i5++;
                                        z6 = z2;
                                    } else {
                                        z2 = z6;
                                        i5 = -1;
                                        break;
                                    }
                                }
                                if (i5 != -1 && (u = f75Var.r.u(i5)) != -1 && f75Var.r.p(u, j)) {
                                    gu2 gu2Var3 = (gu2) hu2Var.d.get(uri);
                                    if (gu2Var3 != null) {
                                        z4 = gu2.c(gu2Var3, uri, j);
                                    } else {
                                        z4 = z2;
                                    }
                                    if (z4) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                vs.k(a82.j(i4, "Invalid fallback selection type: "));
                                return false;
                            }
                        } else {
                            z2 = false;
                            gu2 gu2Var4 = (gu2) hu2Var.d.get(uri);
                            if (gu2Var4 != null) {
                                z3 = gu2.c(gu2Var4, uri, j);
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 = z2;
            z5 |= z3;
            i2 = i + 1;
        }
        this.M.d(this);
        return z5;
    }

    public final g85 c(String str, int i, b85[] b85VarArr, vq4[] vq4VarArr, vq4 vq4Var, List list, Map map, long j) {
        g85 g85Var = new g85(str, i, this.L, new f75(this.a, this.b, b85VarArr, vq4VarArr, this.c, this.d, this.G, list, this.K), map, this.E, j, vq4Var, this.e, this.f, this.C, this.D, this.J, null);
        long j2 = this.T;
        g85Var.q0 = j2;
        if (g85Var.Y) {
            for (f85 f85Var : g85Var.R) {
                f85Var.I(j2);
            }
        }
        return g85Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
        if (r44 != r3.l0) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.n57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.c14[] r40, boolean[] r41, defpackage.gx9[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.e(c14[], boolean[], gx9[], boolean[], long):long");
    }

    @Override // defpackage.f9a
    public final long g() {
        return this.S.g();
    }

    @Override // defpackage.n57
    public final long h(long j, o4a o4aVar) {
        q75 q75Var;
        long j2;
        g85[] g85VarArr = this.Q;
        int length = g85VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            g85 g85Var = g85VarArr[i];
            if (g85Var.W == 2) {
                f75 f75Var = g85Var.d;
                hu2 hu2Var = f75Var.g;
                int d = f75Var.r.d();
                b85[] b85VarArr = f75Var.e;
                if (d < b85VarArr.length && d != -1) {
                    q75Var = hu2Var.b(true, b85VarArr[f75Var.r.m()].c());
                } else {
                    q75Var = null;
                }
                if (q75Var != null) {
                    qs5 qs5Var = q75Var.r;
                    if (!qs5Var.isEmpty()) {
                        long j3 = q75Var.h - hu2Var.O;
                        long j4 = j - j3;
                        int d2 = a2d.d(qs5Var, Long.valueOf(j4), true);
                        long j5 = ((n75) qs5Var.get(d2)).e;
                        if (q75Var.c && d2 != qs5Var.size() - 1) {
                            j2 = ((n75) qs5Var.get(d2 + 1)).e;
                        } else {
                            j2 = j5;
                        }
                        return o4aVar.a(j4, j5, j2) + j3;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.n57
    public final void j() {
        g85[] g85VarArr;
        for (g85 g85Var : this.P) {
            g85Var.G();
            if (g85Var.p0 && !g85Var.Z) {
                throw xm8.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.n57
    public final long k(long j) {
        g85[] g85VarArr = this.Q;
        if (g85VarArr.length > 0) {
            boolean J = g85VarArr[0].J(false, j);
            int i = 1;
            while (true) {
                g85[] g85VarArr2 = this.Q;
                if (i >= g85VarArr2.length) {
                    break;
                }
                g85VarArr2[i].J(J, j);
                i++;
            }
            if (J) {
                ((SparseArray) this.G.b).clear();
            }
        }
        return j;
    }

    @Override // defpackage.n57
    public final void l(long j) {
        g85[] g85VarArr;
        for (g85 g85Var : this.Q) {
            if (g85Var.Y && !g85Var.E()) {
                int length = g85Var.R.length;
                for (int i = 0; i < length; i++) {
                    g85Var.R[i].j(g85Var.j0[i], j);
                }
            }
        }
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.S.n();
    }

    @Override // defpackage.n57
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        String str;
        boolean z;
        Map map;
        qs5 qs5Var;
        du2 du2Var;
        g85[] g85VarArr;
        HashSet hashSet;
        int i;
        ArrayList arrayList;
        HashSet hashSet2;
        ArrayList arrayList2;
        Map map2;
        ArrayList arrayList3;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        List list;
        this.M = m57Var;
        hu2 hu2Var = this.b;
        hu2Var.getClass();
        hu2Var.e.add(this);
        u75 u75Var = hu2Var.F;
        u75Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        qs5 c = hu2Var.c(0);
        c.getClass();
        qs5 c2 = hu2Var.c(2);
        c2.getClass();
        qs5 c3 = hu2Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.N = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        du2 du2Var2 = this.a;
        boolean z6 = this.I;
        if (isEmpty) {
            str = "ID3";
            z = z6;
            map = map3;
            qs5Var = c3;
            du2Var = du2Var2;
        } else {
            vq4 vq4Var = u75Var.j;
            List list2 = u75Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                vq4 vq4Var2 = ((b85) c.get(i6)).a.a;
                int i7 = vq4Var2.w;
                String str2 = vq4Var2.k;
                if (i7 > 0 || a2d.v(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (a2d.v(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z4 = false;
                i3 = i4;
                z3 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z3 = false;
                i3 = i10;
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
                i3 = size;
            }
            b85[] b85VarArr = new b85[i3];
            vq4[] vq4VarArr = new vq4[i3];
            int[] iArr2 = new int[i3];
            int i11 = 0;
            boolean z7 = z3;
            int i12 = 0;
            while (i12 < c.size()) {
                if (z7) {
                    list = list2;
                    if (iArr[i12] != 2) {
                        i12++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z4 || iArr[i12] != 1) {
                    b85 b85Var = (b85) c.get(i12);
                    b85VarArr[i11] = b85Var;
                    vq4VarArr[i11] = b85Var.a.a;
                    iArr2[i11] = i12;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = vq4VarArr[0].k;
            int u = a2d.u(2, str3);
            int i13 = 1;
            int u2 = a2d.u(1, str3);
            if ((u2 == 1 || (u2 == 0 && c2.isEmpty())) && u <= 1 && u2 + u > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z7 || u2 <= 0) {
                i13 = 0;
            }
            qs5Var = c3;
            du2Var = du2Var2;
            z = z6;
            g85 c4 = c("main", i13, b85VarArr, vq4VarArr, vq4Var, list3, map3, j);
            arrayList4.add(c4);
            arrayList5.add(iArr2);
            if (z && z5) {
                ArrayList arrayList6 = new ArrayList();
                if (u > 0) {
                    vq4[] vq4VarArr2 = new vq4[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        vq4 vq4Var3 = vq4VarArr[i14];
                        vq4[] vq4VarArr3 = vq4VarArr;
                        String v = a2d.v(2, vq4Var3.k);
                        String e = lc7.e(v);
                        uq4 uq4Var = new uq4();
                        uq4Var.a = vq4Var3.a;
                        uq4Var.b = vq4Var3.b;
                        uq4Var.c = qs5.l(vq4Var3.c);
                        uq4Var.m = lc7.p(vq4Var3.n);
                        uq4Var.n = lc7.p(e);
                        uq4Var.j = v;
                        uq4Var.k = vq4Var3.l;
                        uq4Var.h = vq4Var3.h;
                        uq4Var.i = vq4Var3.i;
                        uq4Var.u = vq4Var3.v;
                        uq4Var.v = vq4Var3.w;
                        uq4Var.y = vq4Var3.z;
                        uq4Var.e = vq4Var3.e;
                        uq4Var.f = vq4Var3.f;
                        uq4Var.D = vq4Var3.E;
                        vq4VarArr2[i14] = new vq4(uq4Var);
                        i14++;
                        vq4VarArr = vq4VarArr3;
                        map3 = map3;
                    }
                    vq4[] vq4VarArr4 = vq4VarArr;
                    map = map3;
                    arrayList6.add(new ajc("main", vq4VarArr2));
                    if (u2 > 0 && (vq4Var != null || c2.isEmpty())) {
                        uq4 a = d(vq4VarArr4[0], vq4Var, false).a();
                        a.l = "main";
                        arrayList6.add(new ajc("main:audio", new vq4(a)));
                    }
                    if (list3 != null) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            String j2 = a82.j(i15, "main:cc:");
                            uq4 a2 = du2Var.b((vq4) list3.get(i15)).a();
                            a2.l = "main";
                            arrayList6.add(new ajc(j2, new vq4(a2)));
                        }
                    }
                } else {
                    map = map3;
                    vq4[] vq4VarArr5 = new vq4[i3];
                    for (int i16 = 0; i16 < i3; i16++) {
                        vq4VarArr5[i16] = d(vq4VarArr[i16], vq4Var, true);
                    }
                    arrayList6.add(new ajc("main", vq4VarArr5));
                }
                uq4 uq4Var2 = new uq4();
                str = "ID3";
                uq4Var2.a = str;
                uq4Var2.n = lc7.p("application/id3");
                uq4Var2.l = "main";
                ajc ajcVar = new ajc("main:id3", new vq4(uq4Var2));
                arrayList6.add(ajcVar);
                c4.H((ajc[]) arrayList6.toArray(new ajc[0]), arrayList6.indexOf(ajcVar));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList7 = new ArrayList(c2.size());
        ArrayList arrayList8 = new ArrayList(c2.size());
        ArrayList arrayList9 = new ArrayList(c2.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < c2.size()) {
            String str4 = ((b85) c2.get(i17)).a.c;
            str4.getClass();
            if (!hashSet3.add(str4)) {
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
            } else {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                boolean z8 = true;
                for (int i18 = 0; i18 < c2.size(); i18++) {
                    if (str4.equals(((b85) c2.get(i18)).a.c)) {
                        b85 b85Var2 = (b85) c2.get(i18);
                        vq4 vq4Var4 = b85Var2.a.a;
                        arrayList9.add(Integer.valueOf(i18));
                        arrayList7.add(b85Var2);
                        arrayList8.add(vq4Var4);
                        if (a2d.u(1, vq4Var4.k) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z8 &= z2;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = a2d.a;
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
                g85 c5 = c(concat, 1, (b85[]) arrayList7.toArray(new b85[0]), (vq4[]) arrayList8.toArray(new vq4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList5.add(hc2.s(arrayList));
                arrayList4.add(c5);
                if (z && z8) {
                    String concat2 = concat.concat(":id3");
                    uq4 uq4Var3 = new uq4();
                    uq4Var3.a = str;
                    uq4Var3.n = lc7.p("application/id3");
                    uq4Var3.l = concat;
                    c5.H(new ajc[]{new ajc(concat, (vq4[]) arrayList3.toArray(new vq4[0])), new ajc(concat2, new vq4(uq4Var3))}, 1);
                }
            }
            i17 = i2 + 1;
            map = map2;
            arrayList8 = arrayList3;
            arrayList7 = arrayList2;
            arrayList9 = arrayList;
            hashSet3 = hashSet2;
        }
        Map map4 = map;
        this.R = arrayList4.size();
        ArrayList arrayList10 = new ArrayList(qs5Var.size());
        ArrayList arrayList11 = new ArrayList(qs5Var.size());
        ArrayList arrayList12 = new ArrayList(qs5Var.size());
        HashSet hashSet4 = new HashSet();
        int i19 = 0;
        while (i19 < qs5Var.size()) {
            qs5 qs5Var2 = qs5Var;
            String str6 = ((b85) qs5Var2.get(i19)).a.c;
            str6.getClass();
            if (!hashSet4.add(str6)) {
                hashSet = hashSet4;
                i = i19;
                qs5Var = qs5Var2;
            } else {
                arrayList10.clear();
                arrayList11.clear();
                arrayList12.clear();
                for (int i20 = 0; i20 < qs5Var2.size(); i20++) {
                    if (str6.equals(((b85) qs5Var2.get(i20)).a.c)) {
                        b85 b85Var3 = (b85) qs5Var2.get(i20);
                        arrayList12.add(Integer.valueOf(i20));
                        arrayList10.add(b85Var3);
                        arrayList11.add(b85Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                vq4[] vq4VarArr6 = (vq4[]) arrayList11.toArray(new vq4[0]);
                String str7 = a2d.a;
                ms5 ms5Var = qs5.b;
                qs5Var = qs5Var2;
                hashSet = hashSet4;
                i = i19;
                g85 c6 = c(concat3, 3, (b85[]) arrayList10.toArray(new b85[0]), vq4VarArr6, null, mm9.e, map4, j);
                arrayList5.add(hc2.s(arrayList12));
                arrayList4.add(c6);
                int length = vq4VarArr6.length;
                vq4[] vq4VarArr7 = new vq4[length];
                for (int i21 = 0; i21 < length; i21++) {
                    vq4VarArr7[i21] = du2Var.b(vq4VarArr6[i21]);
                }
                c6.H(new ajc[]{new ajc(concat3, vq4VarArr7)}, new int[0]);
            }
            i19 = i + 1;
            hashSet4 = hashSet;
        }
        this.P = (g85[]) arrayList4.toArray(new g85[0]);
        int[][] iArr3 = (int[][]) arrayList5.toArray(new int[0]);
        this.N = this.P.length;
        int i22 = 0;
        while (true) {
            int i23 = this.R;
            g85VarArr = this.P;
            if (i22 >= i23) {
                break;
            }
            g85VarArr[i22].d.l = true;
            i22++;
        }
        for (g85 g85Var : g85VarArr) {
            if (!g85Var.Z) {
                us6 us6Var = new us6();
                us6Var.a = g85Var.l0;
                g85Var.t(new vs6(us6Var));
            }
        }
        this.Q = this.P;
    }

    @Override // defpackage.n57
    public final bjc r() {
        bjc bjcVar = this.O;
        bjcVar.getClass();
        return bjcVar;
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        g85[] g85VarArr;
        if (this.O == null) {
            for (g85 g85Var : this.P) {
                if (!g85Var.Z) {
                    us6 us6Var = new us6();
                    us6Var.a = g85Var.l0;
                    g85Var.t(new vs6(us6Var));
                }
            }
            return false;
        }
        return this.S.t(vs6Var);
    }

    @Override // defpackage.f9a
    public final long u() {
        return this.S.u();
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        this.S.x(j);
    }
}
