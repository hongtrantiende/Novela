package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jf2  reason: default package */
/* loaded from: classes.dex */
public final class jf2 implements n57, e9a {
    public static final Pattern X = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern Y = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final long C;
    public final js6 D;
    public final ij1 E;
    public final bjc F;
    public final if2[] G;
    public final kh5 H;
    public final yz8 I;
    public final cl3 K;
    public final cl3 L;
    public m57 M;
    public lx1 P;
    public ff2 Q;
    public int R;
    public List S;
    public long U;
    public final long V;
    public boolean W;
    public final int a;
    public final kj b;
    public final ys2 c;
    public final fl3 d;
    public final ox9 e;
    public final oaa f;
    public boolean T = true;
    public mh1[] N = new mh1[0];
    public vx3[] O = new vx3[0];
    public final IdentityHashMap J = new IdentityHashMap();

    public jf2(int i, ff2 ff2Var, oaa oaaVar, int i2, kj kjVar, ys2 ys2Var, fl3 fl3Var, cl3 cl3Var, ox9 ox9Var, cl3 cl3Var2, long j, js6 js6Var, ij1 ij1Var, kh5 kh5Var, n07 n07Var, a09 a09Var) {
        String j2;
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        vq4[][] vq4VarArr;
        vq4[] vq4VarArr2;
        int i5;
        i23 c;
        Integer num;
        this.a = i;
        this.Q = ff2Var;
        this.f = oaaVar;
        this.R = i2;
        this.b = kjVar;
        this.c = ys2Var;
        this.d = fl3Var;
        this.L = cl3Var;
        this.e = ox9Var;
        this.K = cl3Var2;
        this.C = j;
        this.D = js6Var;
        this.E = ij1Var;
        this.H = kh5Var;
        boolean z = true;
        this.I = new yz8(ff2Var, n07Var, ij1Var);
        int i6 = 0;
        kh5Var.getClass();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        this.P = new lx1(mm9Var, mm9Var);
        mt8 b = ff2Var.b(i2);
        List list = b.d;
        this.S = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(nxe.p(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            hashMap.put(Long.valueOf(((g7) list2.get(i7)).a), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        int i8 = 0;
        while (i8 < size) {
            g7 g7Var = (g7) list2.get(i8);
            List list3 = g7Var.e;
            List list4 = g7Var.f;
            boolean z2 = z;
            i23 c2 = c("http://dashif.org/guidelines/trickmode", list3);
            c2 = c2 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c2;
            if (c2 != null && (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(c2.b)))) != null && b(g7Var, (g7) list2.get(num.intValue()))) {
                i5 = num.intValue();
            } else {
                i5 = i8;
            }
            if (i5 == i8 && (c = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c.b;
                String str2 = a2d.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i9 = i6; i9 < length; i9++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i9])));
                    if (num2 != null && b(g7Var, (g7) list2.get(num2.intValue()))) {
                        i5 = Math.min(i5, num2.intValue());
                    }
                }
            }
            if (i5 != i8) {
                List list5 = (List) sparseArray.get(i8);
                List list6 = (List) sparseArray.get(i5);
                list6.addAll(list5);
                sparseArray.put(i8, list6);
                arrayList.remove(list5);
            }
            i8++;
            z = z2;
            i6 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] s = hc2.s((Collection) arrayList.get(i10));
            iArr2[i10] = s;
            Arrays.sort(s);
        }
        boolean[] zArr2 = new boolean[size2];
        vq4[][] vq4VarArr3 = new vq4[size2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr3 = iArr2[i11];
            int length2 = iArr3.length;
            int i13 = 0;
            while (true) {
                if (i13 < length2) {
                    List list7 = ((g7) list2.get(iArr3[i13])).c;
                    iArr = iArr2;
                    for (int i14 = 0; i14 < list7.size(); i14++) {
                        if (!((tp9) list7.get(i14)).d.isEmpty()) {
                            zArr2[i11] = z3;
                            i12++;
                            break;
                        }
                    }
                    i13++;
                    iArr2 = iArr;
                } else {
                    iArr = iArr2;
                    break;
                }
            }
            int[] iArr4 = iArr[i11];
            int length3 = iArr4.length;
            int i15 = 0;
            while (true) {
                if (i15 < length3) {
                    int i16 = iArr4[i15];
                    g7 g7Var2 = (g7) list2.get(i16);
                    List list8 = ((g7) list2.get(i16)).d;
                    int[] iArr5 = iArr4;
                    int i17 = 0;
                    while (i17 < list8.size()) {
                        i23 i23Var = (i23) list8.get(i17);
                        zArr = zArr2;
                        vq4VarArr = vq4VarArr3;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(i23Var.a)) {
                            uq4 uq4Var = new uq4();
                            uq4Var.n = lc7.p("application/cea-608");
                            uq4Var.a = hl5.q(new StringBuilder(), g7Var2.a, ":cea608");
                            vq4VarArr2 = m(i23Var, X, new vq4(uq4Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(i23Var.a)) {
                            uq4 uq4Var2 = new uq4();
                            uq4Var2.n = lc7.p("application/cea-708");
                            uq4Var2.a = hl5.q(new StringBuilder(), g7Var2.a, ":cea708");
                            vq4VarArr2 = m(i23Var, Y, new vq4(uq4Var2));
                            break;
                        } else {
                            i17++;
                            vq4VarArr3 = vq4VarArr;
                            zArr2 = zArr;
                        }
                    }
                    i15++;
                    iArr4 = iArr5;
                } else {
                    zArr = zArr2;
                    vq4VarArr = vq4VarArr3;
                    vq4VarArr2 = new vq4[0];
                    break;
                }
            }
            vq4VarArr[i11] = vq4VarArr2;
            if (vq4VarArr2.length != 0) {
                i12++;
            }
            i11++;
            vq4VarArr3 = vq4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        vq4[][] vq4VarArr4 = vq4VarArr3;
        int size3 = list.size() + i12 + size2;
        ajc[] ajcVarArr = new ajc[size3];
        if2[] if2VarArr = new if2[size3];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr7 = iArr6[i18];
            ArrayList arrayList3 = new ArrayList();
            for (int i20 : iArr7) {
                arrayList3.addAll(((g7) list2.get(i20)).c);
            }
            int size4 = arrayList3.size();
            vq4[] vq4VarArr5 = new vq4[size4];
            int i21 = 0;
            while (i21 < size4) {
                int i22 = size2;
                vq4 vq4Var = ((tp9) arrayList3.get(i21)).a;
                int i23 = i19;
                uq4 a = vq4Var.a();
                a.O = fl3Var.m(vq4Var);
                vq4VarArr5[i21] = new vq4(a);
                i21++;
                size2 = i22;
                i19 = i23;
            }
            int i24 = size2;
            int i25 = i19;
            g7 g7Var3 = (g7) list2.get(iArr7[0]);
            long j3 = g7Var3.a;
            if (j3 != -1) {
                j2 = Long.toString(j3);
            } else {
                j2 = a82.j(i18, "unset:");
            }
            int i26 = i25 + 1;
            if (zArr3[i18]) {
                i3 = i25 + 2;
            } else {
                i3 = i26;
                i26 = -1;
            }
            if (vq4VarArr4[i18].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            i(kjVar, vq4VarArr5);
            List list9 = list2;
            ajcVarArr[i25] = new ajc(j2, vq4VarArr5);
            int i27 = g7Var3.b;
            ms5 ms5Var2 = qs5.b;
            mm9 mm9Var2 = mm9.e;
            if2 if2Var = new if2(i27, 0, iArr7, i25, i26, i3, -1, mm9Var2);
            int i28 = i25;
            if2VarArr[i28] = if2Var;
            int i29 = -1;
            if (i26 != -1) {
                String u = nk2.u(j2, ":emsg");
                uq4 uq4Var3 = new uq4();
                uq4Var3.a = u;
                uq4Var3.n = lc7.p("application/x-emsg");
                uq4Var3.l = j2;
                ajcVarArr[i26] = new ajc(u, new vq4(uq4Var3));
                if2 if2Var2 = new if2(5, 1, iArr7, i28, -1, -1, -1, mm9Var2);
                i28 = i28;
                if2VarArr[i26] = if2Var2;
                i29 = -1;
            }
            if (i3 != i29) {
                String u2 = nk2.u(j2, ":cc");
                if2VarArr[i3] = new if2(3, 1, iArr7, i28, -1, -1, -1, qs5.m(vq4VarArr4[i18]));
                i(kjVar, vq4VarArr4[i18]);
                int i30 = 0;
                while (true) {
                    vq4[] vq4VarArr6 = vq4VarArr4[i18];
                    if (i30 >= vq4VarArr6.length) {
                        break;
                    }
                    uq4 a2 = vq4VarArr6[i30].a();
                    a2.l = j2;
                    vq4VarArr6[i30] = new vq4(a2);
                    i30++;
                }
                ajcVarArr[i3] = new ajc(u2, vq4VarArr4[i18]);
            }
            i18++;
            size2 = i24;
            i19 = i4;
            list2 = list9;
        }
        int i31 = 0;
        while (i31 < list.size()) {
            wx3 wx3Var = (wx3) list.get(i31);
            uq4 uq4Var4 = new uq4();
            uq4Var4.a = wx3Var.a();
            uq4Var4.n = lc7.p("application/x-emsg");
            ajcVarArr[i19] = new ajc(wx3Var.a() + ":" + i31, new vq4(uq4Var4));
            ms5 ms5Var3 = qs5.b;
            if2VarArr[i19] = new if2(5, 2, new int[0], -1, -1, -1, i31, mm9.e);
            i31++;
            i19++;
        }
        Pair create = Pair.create(new bjc(ajcVarArr), if2VarArr);
        this.F = (bjc) create.first;
        this.G = (if2[]) create.second;
        this.V = Long.MIN_VALUE;
    }

    public static boolean b(g7 g7Var, g7 g7Var2) {
        int i = g7Var.b;
        List list = g7Var.c;
        int i2 = g7Var2.b;
        List list2 = g7Var2.c;
        if (i == i2) {
            if (!list.isEmpty() && !list2.isEmpty()) {
                vq4 vq4Var = ((tp9) list.get(0)).a;
                vq4 vq4Var2 = ((tp9) list2.get(0)).a;
                int i3 = vq4Var.f & (-16385);
                int i4 = vq4Var2.f & (-16385);
                if (Objects.equals(vq4Var.d, vq4Var2.d) && i3 == i4) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static i23 c(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            i23 i23Var = (i23) list.get(i);
            if (str.equals(i23Var.a)) {
                return i23Var;
            }
        }
        return null;
    }

    public static void i(kj kjVar, vq4[] vq4VarArr) {
        String str;
        for (int i = 0; i < vq4VarArr.length; i++) {
            vq4 vq4Var = vq4VarArr[i];
            du2 du2Var = (du2) kjVar.c;
            if (du2Var.b && du2Var.a.c(vq4Var)) {
                uq4 a = vq4Var.a();
                String str2 = vq4Var.k;
                a.n = lc7.p("application/x-media3-cues");
                a.L = du2Var.a.h(vq4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(vq4Var.o);
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                a.j = sb.toString();
                a.s = Long.MAX_VALUE;
                vq4Var = new vq4(a);
            }
            vq4VarArr[i] = vq4Var;
        }
    }

    public static vq4[] m(i23 i23Var, Pattern pattern, vq4 vq4Var) {
        String str = i23Var.b;
        if (str == null) {
            return new vq4[]{vq4Var};
        }
        String str2 = a2d.a;
        String[] split = str.split(";", -1);
        vq4[] vq4VarArr = new vq4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new vq4[]{vq4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            uq4 a = vq4Var.a();
            a.a = vq4Var.a + ":" + parseInt;
            a.K = parseInt;
            a.d = matcher.group(2);
            vq4VarArr[i] = new vq4(a);
        }
        return vq4VarArr;
    }

    @Override // defpackage.e9a
    public final void d(f9a f9aVar) {
        this.M.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v14, types: [qs5] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.n57
    public final long e(c14[] c14VarArr, boolean[] zArr, gx9[] gx9VarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        boolean z2;
        int i4;
        ajc ajcVar;
        mm9 mm9Var;
        int i5;
        xz8 xz8Var;
        vq4[] vq4VarArr;
        long b;
        int i6;
        boolean z3;
        boolean z4;
        c14[] c14VarArr2 = c14VarArr;
        int[] iArr3 = new int[c14VarArr2.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = -1;
            if (i8 >= c14VarArr2.length) {
                break;
            }
            c14 c14Var = c14VarArr2[i8];
            if (c14Var != null) {
                iArr3[i8] = this.F.b(c14Var.c());
            } else {
                iArr3[i8] = -1;
            }
            i8++;
        }
        for (int i9 = 0; i9 < c14VarArr2.length; i9++) {
            if (c14VarArr2[i9] == null || !zArr[i9]) {
                ?? r4 = gx9VarArr[i9];
                if (r4 instanceof mh1) {
                    ((mh1) r4).D(this);
                } else if (r4 instanceof lh1) {
                    lh1 lh1Var = (lh1) r4;
                    boolean[] zArr3 = lh1Var.e.d;
                    int i10 = lh1Var.c;
                    wq9.D(zArr3[i10]);
                    zArr3[i10] = false;
                }
                gx9VarArr[i9] = 0;
            }
        }
        int i11 = 0;
        while (true) {
            z = true;
            if (i11 >= c14VarArr2.length) {
                break;
            }
            ?? r42 = gx9VarArr[i11];
            if ((r42 instanceof os3) || (r42 instanceof lh1)) {
                int f = f(i11, iArr3);
                if (f == -1) {
                    z4 = gx9VarArr[i11] instanceof os3;
                } else {
                    ?? r10 = gx9VarArr[i11];
                    z4 = ((r10 instanceof lh1) && ((lh1) r10).a == gx9VarArr[f]) ? false : false;
                }
                if (!z4) {
                    ?? r43 = gx9VarArr[i11];
                    if (r43 instanceof lh1) {
                        lh1 lh1Var2 = (lh1) r43;
                        boolean[] zArr4 = lh1Var2.e.d;
                        int i12 = lh1Var2.c;
                        wq9.D(zArr4[i12]);
                        zArr4[i12] = false;
                    }
                    gx9VarArr[i11] = 0;
                }
            }
            i11++;
        }
        int i13 = 0;
        while (i13 < c14VarArr2.length) {
            c14 c14Var2 = c14VarArr2[i13];
            if (c14Var2 == null) {
                iArr2 = iArr3;
                i2 = i7;
                i3 = i13;
            } else {
                ?? r11 = gx9VarArr[i13];
                if (r11 == 0) {
                    zArr2[i13] = z;
                    if2 if2Var = this.G[iArr3[i13]];
                    int i14 = if2Var.c;
                    if (i14 == 0) {
                        int i15 = if2Var.f;
                        if (i15 != i) {
                            z2 = z;
                        } else {
                            z2 = i7;
                        }
                        if (z2 != 0) {
                            ajcVar = this.F.a(i15);
                            i4 = z;
                        } else {
                            i4 = i7;
                            ajcVar = null;
                        }
                        int i16 = if2Var.g;
                        if (i16 != i) {
                            mm9Var = this.G[i16].h;
                        } else {
                            ms5 ms5Var = qs5.b;
                            mm9Var = mm9.e;
                        }
                        int size = mm9Var.size() + i4;
                        int i17 = i13;
                        vq4[] vq4VarArr2 = new vq4[size];
                        int[] iArr4 = new int[size];
                        if (z2 != 0) {
                            vq4VarArr2[i7] = ajcVar.d[i7];
                            iArr4[i7] = 5;
                            i5 = z;
                        } else {
                            i5 = i7;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i18 = i7;
                        boolean z5 = z;
                        int i19 = i5;
                        while (i18 < mm9Var.size()) {
                            vq4 vq4Var = (vq4) mm9Var.get(i18);
                            vq4VarArr2[i19] = vq4Var;
                            iArr4[i19] = 3;
                            arrayList.add(vq4Var);
                            i18++;
                            i19++;
                        }
                        if (this.Q.d && z2 != 0) {
                            yz8 yz8Var = this.I;
                            xz8Var = new xz8(yz8Var, yz8Var.a);
                        } else {
                            xz8Var = null;
                        }
                        ff2 ff2Var = this.Q;
                        int i20 = this.R;
                        pf2 d = ((tp9) ((g7) ff2Var.b(i20).c.get(if2Var.a[i7])).c.get(i7)).d();
                        if (d == null) {
                            b = -9223372036854775807L;
                            vq4VarArr = vq4VarArr2;
                        } else {
                            vq4VarArr = vq4VarArr2;
                            b = d.b(d.r(j, ff2Var.d(i20)));
                        }
                        if (this.T) {
                            ff2 ff2Var2 = this.Q;
                            int i21 = this.R;
                            int[] iArr5 = if2Var.a;
                            List list = ff2Var2.b(i21).c;
                            ls5 i22 = qs5.i();
                            int length = iArr5.length;
                            int i23 = 0;
                            while (i23 < length) {
                                int i24 = i23;
                                i22.c(((g7) list.get(iArr5[i24])).c);
                                i23 = i24 + 1;
                            }
                            mm9 g = i22.g();
                            for (int i25 = 0; i25 < c14Var2.length(); i25++) {
                                vq4 vq4Var2 = ((tp9) g.get(c14Var2.j(i25))).a;
                                if (!lc7.a(vq4Var2.o, vq4Var2.k)) {
                                    i6 = i17;
                                    z3 = z5;
                                    break;
                                }
                            }
                        }
                        i6 = i17;
                        z3 = false;
                        kj kjVar = this.b;
                        js6 js6Var = this.D;
                        ff2 ff2Var3 = this.Q;
                        oaa oaaVar = this.f;
                        int[] iArr6 = iArr3;
                        int i26 = this.R;
                        int[] iArr7 = if2Var.a;
                        int i27 = if2Var.b;
                        i3 = i6;
                        long j2 = this.C;
                        ys2 ys2Var = this.c;
                        jg2 h = ((gg2) kjVar.b).h();
                        if (ys2Var != null) {
                            h.u(ys2Var);
                        }
                        xz8 xz8Var2 = xz8Var;
                        iArr2 = iArr6;
                        mh1 mh1Var = new mh1(if2Var.b, iArr4, vq4VarArr, new ft2((du2) kjVar.c, js6Var, ff2Var3, oaaVar, i26, iArr7, c14Var2, i27, h, j2, kjVar.a, z2, arrayList, xz8Var), this, this.E, j, this.d, this.L, this.e, this.K, z3, b, null);
                        long j3 = this.V;
                        mh1Var.I.I(j3);
                        for (fx9 fx9Var : mh1Var.J) {
                            fx9Var.I(j3);
                        }
                        synchronized (this) {
                            this.J.put(mh1Var, xz8Var2);
                        }
                        gx9VarArr[i3] = mh1Var;
                    } else {
                        iArr2 = iArr3;
                        i3 = i13;
                        if (i14 == 2) {
                            i2 = 0;
                            gx9VarArr[i3] = new vx3((wx3) this.S.get(if2Var.d), c14Var2.c().d[0], this.Q.d);
                        }
                    }
                    i2 = 0;
                } else {
                    iArr2 = iArr3;
                    i2 = i7;
                    i3 = i13;
                    if (r11 instanceof mh1) {
                        ((mh1) r11).e.j = c14Var2;
                    }
                }
            }
            i13 = i3 + 1;
            c14VarArr2 = c14VarArr;
            i7 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr8 = iArr3;
        ?? r14 = i7;
        while (i7 < c14VarArr.length) {
            if (gx9VarArr[i7] == 0 && c14VarArr[i7] != null) {
                iArr = iArr8;
                if2 if2Var2 = this.G[iArr[i7]];
                if (if2Var2.c != 1) {
                    continue;
                } else {
                    int f2 = f(i7, iArr);
                    if (f2 == -1) {
                        gx9VarArr[i7] = new Object();
                    } else {
                        mh1 mh1Var2 = (mh1) gx9VarArr[f2];
                        int i28 = if2Var2.b;
                        boolean[] zArr5 = mh1Var2.d;
                        fx9[] fx9VarArr = mh1Var2.J;
                        for (int i29 = r14 == true ? 1 : 0; i29 < fx9VarArr.length; i29++) {
                            if (mh1Var2.b[i29] == i28) {
                                wq9.D(!zArr5[i29]);
                                zArr5[i29] = true;
                                fx9VarArr[i29].H(true, j);
                                gx9VarArr[i7] = new lh1(mh1Var2, mh1Var2, fx9VarArr[i29], i29);
                            }
                        }
                        vm1.d();
                        return 0L;
                    }
                }
            } else {
                iArr = iArr8;
            }
            i7++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = gx9VarArr.length;
        for (int i30 = r14 == true ? 1 : 0; i30 < length2; i30++) {
            ?? r6 = gx9VarArr[i30];
            if (r6 instanceof mh1) {
                arrayList2.add((mh1) r6);
            } else if (r6 instanceof vx3) {
                arrayList3.add((vx3) r6);
            }
        }
        mh1[] mh1VarArr = new mh1[arrayList2.size()];
        this.N = mh1VarArr;
        arrayList2.toArray(mh1VarArr);
        vx3[] vx3VarArr = new vx3[arrayList3.size()];
        this.O = vx3VarArr;
        arrayList3.toArray(vx3VarArr);
        kh5 kh5Var = this.H;
        AbstractList F = uue.F(arrayList2, new uz0(5));
        kh5Var.getClass();
        this.P = new lx1(arrayList2, F);
        if (this.T) {
            this.T = r14;
            this.U = j;
            mh1[] mh1VarArr2 = this.N;
            int length3 = mh1VarArr2.length;
            int i31 = r14 == true ? 1 : 0;
            while (true) {
                if (i31 >= length3) {
                    break;
                } else if (mh1VarArr2[i31].A()) {
                    this.W = true;
                    mh1[] mh1VarArr3 = this.N;
                    int length4 = mh1VarArr3.length;
                    for (int i32 = r14 == true ? 1 : 0; i32 < length4; i32++) {
                        mh1VarArr3[i32].U = true;
                    }
                } else {
                    i31++;
                }
            }
        }
        return j;
    }

    public final int f(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            if2[] if2VarArr = this.G;
            int i3 = if2VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && if2VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.f9a
    public final long g() {
        return this.P.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r3 < (((r9.z() + r7) + r10) - 1)) goto L20;
     */
    @Override // defpackage.n57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r19, defpackage.o4a r21) {
        /*
            r18 = this;
            r1 = r19
            r0 = r18
            mh1[] r0 = r0.N
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L74
            r6 = r0[r5]
            int r7 = r6.a
            r8 = 2
            if (r7 != r8) goto L6f
            ft2 r0 = r6.e
            dt2[] r0 = r0.i
            int r3 = r0.length
        L17:
            if (r4 >= r3) goto L74
            r5 = r0[r4]
            pf2 r6 = r5.d
            long r7 = r5.f
            pf2 r9 = r5.d
            if (r6 == 0) goto L6a
            long r10 = r5.c()
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L2e
            goto L6a
        L2e:
            r9.getClass()
            long r3 = r5.e
            long r3 = r9.r(r1, r3)
            long r3 = r3 + r7
            r12 = r3
            long r3 = r5.e(r12)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L63
            r14 = -1
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r14 = 1
            if (r0 == 0) goto L5a
            r9.getClass()
            long r16 = r9.z()
            long r16 = r16 + r7
            long r16 = r16 + r10
            long r16 = r16 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L63
        L5a:
            long r6 = r12 + r14
            long r5 = r5.e(r6)
        L60:
            r0 = r21
            goto L65
        L63:
            r5 = r3
            goto L60
        L65:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L6a:
            int r4 = r4 + 1
            r1 = r19
            goto L17
        L6f:
            int r5 = r5 + 1
            r1 = r19
            goto L9
        L74:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf2.h(long, o4a):long");
    }

    @Override // defpackage.n57
    public final void j() {
        this.D.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // defpackage.n57
    public final long k(long j) {
        long j2;
        int i;
        ai0 ai0Var;
        boolean z;
        boolean H;
        int i2;
        boolean z2;
        ai0 ai0Var2;
        mh1[] mh1VarArr = this.N;
        int length = mh1VarArr.length;
        boolean z3 = false;
        int i3 = 0;
        while (i3 < length) {
            mh1 mh1Var = mh1VarArr[i3];
            fx9[] fx9VarArr = mh1Var.J;
            fx9 fx9Var = mh1Var.I;
            ij1 ij1Var = mh1Var.E;
            ?? r14 = mh1Var.G;
            mh1Var.P = j;
            mh1Var.S = z3;
            mh1Var.T = z3;
            if (mh1Var.z()) {
                mh1Var.O = j;
                z2 = z3;
                i = i3;
            } else {
                ?? r15 = z3;
                while (true) {
                    if (r15 < r14.size()) {
                        ai0Var = (ai0) r14.get(r15);
                        int i4 = (ai0Var.C > j ? 1 : (ai0Var.C == j ? 0 : -1));
                        i = i3;
                        if (i4 == 0 && ai0Var.G == -9223372036854775807L) {
                            break;
                        } else if (i4 > 0) {
                            break;
                        } else {
                            r15++;
                            i3 = i;
                        }
                    } else {
                        i = i3;
                        break;
                    }
                }
                ai0Var = null;
                if (ai0Var != null) {
                    H = fx9Var.G(ai0Var.e(0));
                } else {
                    long g = mh1Var.g();
                    if (g != Long.MIN_VALUE && j >= g) {
                        z = false;
                    } else {
                        z = true;
                    }
                    H = fx9Var.H(z, j);
                }
                if (H && (ai0Var2 = mh1Var.R) != null) {
                    i2 = 0;
                    if (ai0Var2.e(0) <= fx9Var.u()) {
                        H = false;
                    }
                } else {
                    i2 = 0;
                }
                if (H) {
                    mh1Var.Q = mh1Var.C(fx9Var.u(), i2);
                    for (fx9 fx9Var2 : fx9VarArr) {
                        fx9Var2.H(true, j);
                    }
                } else {
                    mh1Var.O = j;
                    mh1Var.V = false;
                    r14.clear();
                    mh1Var.Q = 0;
                    if (ij1Var.O()) {
                        fx9Var.k();
                        for (fx9 fx9Var3 : fx9VarArr) {
                            fx9Var3.k();
                        }
                        ij1Var.m();
                    } else {
                        ij1Var.d = null;
                        z2 = false;
                        fx9Var.F(false);
                        for (fx9 fx9Var4 : mh1Var.J) {
                            fx9Var4.F(false);
                        }
                    }
                }
                z2 = false;
            }
            i3 = i + 1;
            z3 = z2;
        }
        vx3[] vx3VarArr = this.O;
        int length2 = vx3VarArr.length;
        for (int i5 = z3; i5 < length2; i5++) {
            vx3 vx3Var = vx3VarArr[i5];
            int b = a2d.b(vx3Var.c, j, true);
            vx3Var.C = b;
            if (vx3Var.d && b == vx3Var.c.length) {
                j2 = j;
            } else {
                j2 = -9223372036854775807L;
            }
            vx3Var.D = j2;
        }
        return j;
    }

    @Override // defpackage.n57
    public final void l(long j) {
        mh1[] mh1VarArr;
        long j2;
        for (mh1 mh1Var : this.N) {
            if (!mh1Var.z()) {
                fx9 fx9Var = mh1Var.I;
                int i = fx9Var.q;
                fx9Var.j(true, j);
                fx9 fx9Var2 = mh1Var.I;
                int i2 = fx9Var2.q;
                if (i2 > i) {
                    synchronized (fx9Var2) {
                        if (fx9Var2.p == 0) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = fx9Var2.n[fx9Var2.r];
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        fx9[] fx9VarArr = mh1Var.J;
                        if (i3 >= fx9VarArr.length) {
                            break;
                        }
                        fx9VarArr[i3].j(mh1Var.d[i3], j2);
                        i3++;
                    }
                }
                int min = Math.min(mh1Var.C(i2, 0), mh1Var.Q);
                if (min > 0) {
                    a2d.V(mh1Var.G, 0, min);
                    mh1Var.Q -= min;
                }
            }
        }
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.P.n();
    }

    @Override // defpackage.n57
    public final long p() {
        mh1[] mh1VarArr;
        if (this.W) {
            boolean z = false;
            for (mh1 mh1Var : this.N) {
                mh1Var.getClass();
                try {
                    boolean z2 = mh1Var.T;
                    mh1Var.T = false;
                    z |= z2;
                } catch (Throwable th) {
                    mh1Var.T = false;
                    throw th;
                }
            }
            mh1[] mh1VarArr2 = this.N;
            int length = mh1VarArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (mh1VarArr2[i].A()) {
                        break;
                    }
                    i++;
                } else {
                    this.W = false;
                    for (mh1 mh1Var2 : this.N) {
                        mh1Var2.U = false;
                    }
                }
            }
            if (z) {
                return this.U;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        this.M = m57Var;
        m57Var.a(this);
    }

    @Override // defpackage.n57
    public final bjc r() {
        return this.F;
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        return this.P.t(vs6Var);
    }

    @Override // defpackage.f9a
    public final long u() {
        return this.P.u();
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        int i;
        mh1[] mh1VarArr = this.N;
        int length = mh1VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            mh1 mh1Var = mh1VarArr[i2];
            if (!mh1Var.E.O()) {
                long d = this.Q.d(this.R);
                fx9 fx9Var = mh1Var.I;
                wq9.D(!mh1Var.E.O());
                if (!mh1Var.z() && d != -9223372036854775807L && !mh1Var.G.isEmpty()) {
                    ai0 v = mh1Var.v();
                    long j2 = v.H;
                    if (j2 == -9223372036854775807L) {
                        j2 = v.D;
                    }
                    if (j2 > d) {
                        long r = fx9Var.r();
                        if (r > d) {
                            fx9Var.l(Math.max(d, fx9Var.s() + 1));
                            fx9[] fx9VarArr = mh1Var.J;
                            int length2 = fx9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                fx9 fx9Var2 = fx9VarArr[i3];
                                fx9Var2.l(Math.max(d, fx9Var2.s() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            mh1Var.C.h(d, r, mh1Var.a);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.P.x(j);
    }
}
