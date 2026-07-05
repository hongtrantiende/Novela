package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g85  reason: default package */
/* loaded from: classes.dex */
public final class g85 implements es6, hs6, f9a, t94, ex9 {
    public static final Set v0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final fl3 C;
    public final cl3 D;
    public final ox9 E;
    public final ij1 F;
    public final cl3 G;
    public final int H;
    public final ejf I;
    public final ArrayList J;
    public final List K;
    public final d85 L;
    public final d85 M;
    public final Handler N;
    public final ArrayList O;
    public final Map P;
    public hh1 Q;
    public f85[] R;
    public int[] S;
    public final HashSet T;
    public final SparseIntArray U;
    public e85 V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final String a;
    public int a0;
    public final int b;
    public vq4 b0;
    public final mce c;
    public vq4 c0;
    public final f75 d;
    public boolean d0;
    public final ij1 e;
    public bjc e0;
    public final vq4 f;
    public Set f0;
    public int[] g0;
    public int h0;
    public boolean i0;
    public boolean[] j0;
    public boolean[] k0;
    public long l0;
    public long m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public boolean r0;
    public long s0;
    public zk3 t0;
    public g75 u0;

    /* JADX WARN: Type inference failed for: r2v13, types: [d85] */
    /* JADX WARN: Type inference failed for: r2v14, types: [d85] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ejf, java.lang.Object] */
    public g85(String str, int i, mce mceVar, f75 f75Var, Map map, ij1 ij1Var, long j, vq4 vq4Var, fl3 fl3Var, cl3 cl3Var, ox9 ox9Var, cl3 cl3Var2, int i2, dr7 dr7Var) {
        ij1 ij1Var2;
        this.a = str;
        this.b = i;
        this.c = mceVar;
        this.d = f75Var;
        this.P = map;
        this.e = ij1Var;
        this.f = vq4Var;
        this.C = fl3Var;
        this.D = cl3Var;
        this.E = ox9Var;
        this.G = cl3Var2;
        this.H = i2;
        if (dr7Var != null) {
            ij1Var2 = new ij1(dr7Var, 4);
        } else {
            ij1Var2 = new ij1("Loader:HlsSampleStreamWrapper");
        }
        this.F = ij1Var2;
        ?? obj = new Object();
        obj.b = null;
        obj.a = false;
        obj.c = null;
        this.I = obj;
        this.S = new int[0];
        Set set = v0;
        this.T = new HashSet(set.size());
        this.U = new SparseIntArray(set.size());
        this.R = new f85[0];
        this.k0 = new boolean[0];
        this.j0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = Collections.unmodifiableList(arrayList);
        this.O = new ArrayList();
        this.L = new Runnable(this) { // from class: d85
            public final /* synthetic */ g85 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = r2;
                g85 g85Var = this.b;
                switch (i3) {
                    case 0:
                        g85Var.F();
                        return;
                    default:
                        for (f85 f85Var : g85Var.R) {
                            f85Var.I(g85Var.q0);
                        }
                        g85Var.Y = true;
                        g85Var.F();
                        return;
                }
            }
        };
        this.M = new Runnable(this) { // from class: d85
            public final /* synthetic */ g85 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = r2;
                g85 g85Var = this.b;
                switch (i3) {
                    case 0:
                        g85Var.F();
                        return;
                    default:
                        for (f85 f85Var : g85Var.R) {
                            f85Var.I(g85Var.q0);
                        }
                        g85Var.Y = true;
                        g85Var.F();
                        return;
                }
            }
        };
        this.N = a2d.p(null);
        this.l0 = j;
        this.m0 = j;
        this.q0 = Long.MIN_VALUE;
    }

    public static vq4 A(vq4 vq4Var, vq4 vq4Var2, boolean z) {
        String c;
        int i;
        int i2;
        if (vq4Var == null) {
            return vq4Var2;
        }
        String str = vq4Var.k;
        String str2 = vq4Var2.o;
        int i3 = lc7.i(str2);
        if (a2d.u(i3, str) == 1) {
            c = a2d.v(i3, str);
            str2 = lc7.e(c);
        } else {
            c = lc7.c(str, str2);
        }
        uq4 a = vq4Var2.a();
        a.a = vq4Var.a;
        a.b = vq4Var.b;
        a.c = qs5.l(vq4Var.c);
        a.d = vq4Var.d;
        a.e = vq4Var.e;
        a.f = vq4Var.f;
        if (z) {
            i = vq4Var.h;
        } else {
            i = -1;
        }
        a.h = i;
        if (z) {
            i2 = vq4Var.i;
        } else {
            i2 = -1;
        }
        a.i = i2;
        a.j = c;
        if (i3 == 2) {
            a.u = vq4Var.v;
            a.v = vq4Var.w;
            a.y = vq4Var.z;
        }
        if (str2 != null) {
            a.n = lc7.p(str2);
        }
        int i4 = vq4Var.G;
        if (i4 != -1 && i3 == 1) {
            a.F = i4;
        }
        tb7 tb7Var = vq4Var.l;
        if (tb7Var != null) {
            tb7 tb7Var2 = vq4Var2.l;
            if (tb7Var2 != null) {
                tb7Var = tb7Var2.b(tb7Var);
            }
            a.k = tb7Var;
        }
        return new vq4(a);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        return 0;
    }

    public static n73 y(int i, int i2) {
        st0.w("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new n73();
    }

    public final void B(int i) {
        ArrayList arrayList;
        wq9.D(!this.F.O());
        while (true) {
            arrayList = this.J;
            if (i < arrayList.size()) {
                if (c(i)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        long j = C().D;
        g75 g75Var = (g75) arrayList.get(i);
        a2d.V(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.R.length; i2++) {
            this.R[i2].n(g75Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.m0 = this.l0;
        } else {
            ((g75) yf2.t(arrayList)).f0 = true;
        }
        this.p0 = false;
        this.G.h(g75Var.C, j, this.W);
    }

    public final g75 C() {
        return (g75) nk2.n(1, this.J);
    }

    public final boolean E() {
        if (this.m0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        boolean z;
        int i;
        vq4 A;
        if (!this.d0 && this.g0 == null && this.Y) {
            int i2 = 0;
            for (f85 f85Var : this.R) {
                if (f85Var.x() == null) {
                    return;
                }
            }
            bjc bjcVar = this.e0;
            if (bjcVar != null) {
                int i3 = bjcVar.a;
                int[] iArr = new int[i3];
                this.g0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        f85[] f85VarArr = this.R;
                        if (i5 < f85VarArr.length) {
                            vq4 x = f85VarArr[i5].x();
                            x.getClass();
                            vq4 vq4Var = this.e0.a(i4).d[0];
                            String str = x.o;
                            String str2 = vq4Var.o;
                            int i6 = lc7.i(str);
                            if (i6 != 3) {
                                if (i6 == lc7.i(str2)) {
                                    break;
                                }
                                i5++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || x.L == vq4Var.L) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    this.g0[i4] = i5;
                }
                ArrayList arrayList = this.O;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c85) obj).d();
                }
                return;
            }
            int length = this.R.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                vq4 x2 = this.R[i7].x();
                x2.getClass();
                String str3 = x2.o;
                if (lc7.o(str3)) {
                    i10 = 2;
                } else if (!lc7.k(str3)) {
                    if (lc7.n(str3)) {
                        i10 = 3;
                    } else {
                        i10 = -2;
                    }
                }
                if (D(i10) > D(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            ajc ajcVar = this.d.h;
            int i11 = ajcVar.a;
            this.h0 = -1;
            this.g0 = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.g0[i12] = i12;
            }
            ajc[] ajcVarArr = new ajc[length];
            int i13 = 0;
            while (i13 < length) {
                vq4 x3 = this.R[i13].x();
                x3.getClass();
                vq4 vq4Var2 = this.f;
                String str4 = this.a;
                if (i13 == i8) {
                    vq4[] vq4VarArr = new vq4[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        vq4 vq4Var3 = ajcVar.d[i14];
                        if (i9 == 1 && vq4Var2 != null) {
                            vq4Var3 = vq4Var3.d(vq4Var2);
                        }
                        if (i11 == 1) {
                            A = x3.d(vq4Var3);
                        } else {
                            A = A(vq4Var3, x3, true);
                        }
                        vq4VarArr[i14] = A;
                    }
                    ajcVarArr[i13] = new ajc(str4, vq4VarArr);
                    this.h0 = i13;
                    i = 0;
                } else {
                    vq4Var2 = (i9 == 2 && lc7.k(x3.o)) ? null : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i13 < i8 ? i13 : i13 - 1);
                    String sb2 = sb.toString();
                    i = 0;
                    uq4 a = A(vq4Var2, x3, false).a();
                    a.l = str4;
                    ajcVarArr[i13] = new ajc(sb2, new vq4(a));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.e0 = z(ajcVarArr);
            if (this.f0 == null) {
                z = 1;
            } else {
                z = i15;
            }
            wq9.D(z);
            this.f0 = Collections.EMPTY_SET;
            this.Z = true;
            this.c.l();
        }
    }

    public final void G() {
        this.F.b();
        f75 f75Var = this.d;
        hk0 hk0Var = f75Var.n;
        if (hk0Var == null) {
            Uri uri = f75Var.o;
            if (uri != null && uri.equals(f75Var.p)) {
                f75Var.g.j(f75Var.o);
                return;
            }
            return;
        }
        throw hk0Var;
    }

    public final void H(ajc[] ajcVarArr, int... iArr) {
        this.e0 = z(ajcVarArr);
        this.f0 = new HashSet();
        for (int i : iArr) {
            this.f0.add(this.e0.a(i));
        }
        this.h0 = 0;
        this.N.post(new x0(this.c, 25));
        this.Z = true;
    }

    public final void I() {
        for (f85 f85Var : this.R) {
            f85Var.F(this.n0);
        }
        this.n0 = false;
    }

    public final boolean J(boolean z, long j) {
        g75 g75Var;
        boolean z2;
        boolean H;
        this.l0 = j;
        if (E()) {
            this.m0 = j;
            return true;
        }
        boolean z3 = this.d.q;
        ArrayList arrayList = this.J;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                g75Var = (g75) arrayList.get(i);
                if (g75Var.C == j) {
                    break;
                }
            }
        }
        g75Var = null;
        if (this.Y && !z && !arrayList.isEmpty()) {
            int length = this.R.length;
            for (int i2 = 0; i2 < length; i2++) {
                f85 f85Var = this.R[i2];
                if (g75Var != null) {
                    H = f85Var.G(g75Var.g(i2));
                } else {
                    long g = g();
                    if (g != Long.MIN_VALUE && j >= g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    H = f85Var.H(z2, j);
                }
                if (H || (!this.k0[i2] && this.i0)) {
                }
            }
            return false;
        }
        this.m0 = j;
        this.p0 = false;
        arrayList.clear();
        ij1 ij1Var = this.F;
        if (ij1Var.O()) {
            if (this.Y) {
                for (f85 f85Var2 : this.R) {
                    f85Var2.k();
                }
            }
            ij1Var.m();
            return true;
        }
        ij1Var.d = null;
        I();
        return true;
    }

    @Override // defpackage.ex9
    public final void a() {
        this.N.post(this.L);
    }

    public final void b() {
        wq9.D(this.Z);
        this.e0.getClass();
        this.f0.getClass();
    }

    public final boolean c(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.J;
            if (i2 < arrayList.size()) {
                if (((g75) arrayList.get(i2)).h0) {
                    return false;
                }
                i2++;
            } else {
                g75 g75Var = (g75) arrayList.get(i);
                for (int i3 = 0; i3 < this.R.length; i3++) {
                    if (this.R[i3].u() > g75Var.g(i3)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @Override // defpackage.hs6
    public final void d() {
        f85[] f85VarArr;
        for (f85 f85Var : this.R) {
            f85Var.F(true);
            mu9 mu9Var = f85Var.h;
            if (mu9Var != null) {
                mu9Var.y(f85Var.e);
                f85Var.h = null;
                f85Var.g = null;
            }
        }
    }

    @Override // defpackage.es6
    public final void f(gs6 gs6Var, long j, long j2, boolean z) {
        hh1 hh1Var = (hh1) gs6Var;
        this.Q = null;
        long j3 = hh1Var.a;
        mg2 mg2Var = hh1Var.b;
        h0b h0bVar = hh1Var.E;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.E.getClass();
        this.G.c(cs6Var, hh1Var.c, this.b, hh1Var.d, hh1Var.e, hh1Var.f, hh1Var.C, hh1Var.D);
        if (!z) {
            if (E() || this.a0 == 0) {
                I();
            }
            if (this.a0 > 0) {
                this.c.d(this);
            }
        }
    }

    @Override // defpackage.f9a
    public final long g() {
        if (E()) {
            return this.m0;
        }
        if (this.p0) {
            return Long.MIN_VALUE;
        }
        return C().D;
    }

    @Override // defpackage.es6
    public final void i(gs6 gs6Var, long j, long j2) {
        hh1 hh1Var = (hh1) gs6Var;
        this.Q = null;
        if (hh1Var instanceof b75) {
            b75 b75Var = (b75) hh1Var;
            byte[] bArr = b75Var.F;
            f75 f75Var = this.d;
            f75Var.m = bArr;
            fz4 fz4Var = f75Var.j;
            Uri uri = b75Var.b.a;
            byte[] bArr2 = b75Var.H;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((tt4) fz4Var.a).put(uri, bArr2);
        }
        long j3 = hh1Var.a;
        mg2 mg2Var = hh1Var.b;
        h0b h0bVar = hh1Var.E;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.E.getClass();
        this.G.d(cs6Var, hh1Var.c, this.b, hh1Var.d, hh1Var.e, hh1Var.f, hh1Var.C, hh1Var.D);
        if (!this.Z) {
            us6 us6Var = new us6();
            us6Var.a = this.l0;
            t(new vs6(us6Var));
            return;
        }
        this.c.d(this);
    }

    @Override // defpackage.t94
    public final void m() {
        this.r0 = true;
        this.N.post(this.M);
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.F.O();
    }

    @Override // defpackage.es6
    public final void o(gs6 gs6Var, long j, long j2, int i) {
        cs6 cs6Var;
        hh1 hh1Var = (hh1) gs6Var;
        if (i == 0) {
            long j3 = hh1Var.a;
            cs6Var = new cs6(hh1Var.b, j);
        } else {
            long j4 = hh1Var.a;
            mg2 mg2Var = hh1Var.b;
            h0b h0bVar = hh1Var.E;
            cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        }
        this.G.g(cs6Var, hh1Var.c, this.b, hh1Var.d, hh1Var.e, hh1Var.f, hh1Var.C, hh1Var.D, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [f85[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f85[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [fjc] */
    /* JADX WARN: Type inference failed for: r5v4, types: [f85, fx9] */
    /* JADX WARN: Type inference failed for: r5v6, types: [n73] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.t94
    public final fjc s(int i, int i2) {
        g75 g75Var;
        Integer valueOf = Integer.valueOf(i2);
        Set set = v0;
        boolean contains = set.contains(valueOf);
        boolean z = false;
        HashSet hashSet = this.T;
        SparseIntArray sparseIntArray = this.U;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            wq9.s(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.S[i3] = i;
                }
                r5 = this.S[i3] == i ? this.R[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.R;
                if (i4 >= r1.length) {
                    break;
                } else if (this.S[i4] == i) {
                    r5 = r1[i4];
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (r5 == 0) {
            if (this.r0) {
                return y(i, i2);
            }
            int length = this.R.length;
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            r5 = new f85(this.e, this.C, this.D, this.P);
            r5.t = this.l0;
            if (z) {
                r5.K = this.t0;
                r5.B = true;
            }
            long j = this.s0;
            if (r5.H != j) {
                r5.H = j;
                r5.B = true;
            }
            if (this.u0 != null) {
                r5.E = g75Var.G;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.S, i5);
            this.S = copyOf;
            copyOf[length] = i;
            f85[] f85VarArr = this.R;
            String str = a2d.a;
            ?? copyOf2 = Arrays.copyOf(f85VarArr, f85VarArr.length + 1);
            copyOf2[f85VarArr.length] = r5;
            this.R = (f85[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.k0, i5);
            this.k0 = copyOf3;
            copyOf3[length] = z;
            this.i0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (D(i2) > D(this.W)) {
                this.X = length;
                this.W = i2;
            }
            this.j0 = Arrays.copyOf(this.j0, i5);
        }
        if (i2 == 5) {
            if (this.V == null) {
                this.V = new e85(r5, this.H);
            }
            return this.V;
        }
        return r5;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0206  */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.io.IOException, hk0] */
    @Override // defpackage.f9a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(defpackage.vs6 r79) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.t(vs6):boolean");
    }

    @Override // defpackage.f9a
    public final long u() {
        if (this.p0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.m0;
        }
        long j = this.l0;
        g75 C = C();
        if (!C.d0) {
            ArrayList arrayList = this.J;
            if (arrayList.size() > 1) {
                C = (g75) nk2.n(2, arrayList);
            } else {
                C = null;
            }
        }
        if (C != null) {
            j = Math.max(j, C.D);
        }
        if (this.Y) {
            for (f85 f85Var : this.R) {
                j = Math.max(j, f85Var.r());
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    @Override // defpackage.es6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cy5 w(defpackage.gs6 r24, long r25, long r27, java.io.IOException r29, int r30) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.w(gs6, long, long, java.io.IOException, int):cy5");
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        int size;
        ij1 ij1Var = this.F;
        if (!ij1Var.K() && !E()) {
            boolean O = ij1Var.O();
            boolean z = false;
            boolean z2 = false;
            int i = 0;
            z = false;
            f75 f75Var = this.d;
            List list = this.K;
            if (O) {
                this.Q.getClass();
                hh1 hh1Var = this.Q;
                if (f75Var.n == null) {
                    z2 = f75Var.r.f(j, hh1Var, list);
                }
                if (z2) {
                    ij1Var.m();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && f75Var.c((g75) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                B(size2);
            }
            if (f75Var.n == null && f75Var.r.length() >= 2) {
                size = f75Var.r.k(j, list);
            } else {
                size = list.size();
            }
            if (size < this.J.size()) {
                B(size);
            }
            if (this.Y && this.q0 != Long.MIN_VALUE) {
                boolean z3 = true;
                while (true) {
                    f85[] f85VarArr = this.R;
                    if (i >= f85VarArr.length) {
                        break;
                    }
                    if (this.j0[i] && (this.k0[i] || !this.i0)) {
                        z3 &= f85VarArr[i].y();
                    }
                    i++;
                }
                z = z3;
            }
            if (z) {
                this.p0 = true;
            }
        }
    }

    public final bjc z(ajc[] ajcVarArr) {
        for (int i = 0; i < ajcVarArr.length; i++) {
            ajc ajcVar = ajcVarArr[i];
            vq4[] vq4VarArr = new vq4[ajcVar.a];
            for (int i2 = 0; i2 < ajcVar.a; i2++) {
                vq4 vq4Var = ajcVar.d[i2];
                int m = this.C.m(vq4Var);
                uq4 a = vq4Var.a();
                a.O = m;
                vq4VarArr[i2] = new vq4(a);
            }
            ajcVarArr[i] = new ajc(ajcVar.b, vq4VarArr);
        }
        return new bjc(ajcVarArr);
    }

    @Override // defpackage.t94
    public final void v(m4a m4aVar) {
    }
}
