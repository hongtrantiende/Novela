package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fx9  reason: default package */
/* loaded from: classes.dex */
public class fx9 implements fjc {
    public boolean A;
    public boolean B;
    public vq4 C;
    public vq4 D;
    public long E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public final cx9 a;
    public final kj c;
    public final fl3 d;
    public final cl3 e;
    public ex9 f;
    public vq4 g;
    public mu9 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public boolean z;
    public final x91 b = new Object();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public ejc[] o = new ejc[1000];

    /* JADX WARN: Type inference failed for: r3v1, types: [x91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kj] */
    public fx9(ij1 ij1Var, fl3 fl3Var, cl3 cl3Var) {
        this.d = fl3Var;
        this.e = cl3Var;
        this.a = new cx9(ij1Var);
        Object obj = new Object();
        ?? obj2 = new Object();
        obj2.b = new SparseArray();
        obj2.c = obj;
        obj2.a = -1;
        this.c = obj2;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.A = true;
        this.z = true;
        this.F = true;
        this.u = Long.MIN_VALUE;
        this.x = -1;
    }

    public final boolean A(int i) {
        mu9 mu9Var = this.h;
        if (mu9Var != null && mu9Var.v() != 4) {
            if ((this.m[i] & 1073741824) == 0) {
                this.h.getClass();
                return false;
            }
            return false;
        }
        return true;
    }

    public final void B() {
        mu9 mu9Var = this.h;
        if (mu9Var != null && mu9Var.v() == 1) {
            al3 r = this.h.r();
            r.getClass();
            throw r;
        }
    }

    public final void C(vq4 vq4Var, s6f s6fVar) {
        boolean z;
        zk3 zk3Var;
        vq4 vq4Var2;
        vq4 vq4Var3 = this.g;
        if (vq4Var3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (vq4Var3 == null) {
            zk3Var = null;
        } else {
            zk3Var = vq4Var3.s;
        }
        this.g = vq4Var;
        zk3 zk3Var2 = vq4Var.s;
        fl3 fl3Var = this.d;
        if (fl3Var != null) {
            int m = fl3Var.m(vq4Var);
            uq4 a = vq4Var.a();
            a.O = m;
            vq4Var2 = new vq4(a);
        } else {
            vq4Var2 = vq4Var;
        }
        s6fVar.b = vq4Var2;
        s6fVar.a = this.h;
        if (fl3Var != null) {
            if (z || !Objects.equals(zk3Var, zk3Var2)) {
                mu9 mu9Var = this.h;
                cl3 cl3Var = this.e;
                mu9 k = fl3Var.k(cl3Var, vq4Var);
                this.h = k;
                s6fVar.a = k;
                if (mu9Var != null) {
                    mu9Var.y(cl3Var);
                }
            }
        }
    }

    public final synchronized long D() {
        boolean z;
        long j;
        try {
            int v = v(this.s);
            if (this.s != this.p) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j = this.j[v];
            } else {
                j = this.E;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        if (r11.y != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
        if (r5 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
        r15 = r11.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
        if (r15 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
        if (r0 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009c, code lost:
        if (r15 == r11.g) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        C(r15, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E(defpackage.s6f r12, defpackage.cr2 r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx9.E(s6f, cr2, int, boolean):int");
    }

    public final void F(boolean z) {
        boolean z2;
        cx9 cx9Var = this.a;
        ju0 ju0Var = cx9Var.d;
        if (((nc) ju0Var.c) != null) {
            ij1 ij1Var = cx9Var.a;
            synchronized (ij1Var) {
                ((jv2) ij1Var.d).c.b(ju0Var);
                ju0 ju0Var2 = ju0Var;
                while (ju0Var2 != null) {
                    nc ncVar = (nc) ju0Var2.c;
                    ncVar.getClass();
                    ij1Var.T(ncVar);
                    ju0Var2 = (ju0) ju0Var2.d;
                    if (ju0Var2 == null || ((nc) ju0Var2.c) == null) {
                        ju0Var2 = null;
                    }
                }
            }
            ju0Var.c = null;
            ju0Var.d = null;
        }
        ju0 ju0Var3 = cx9Var.d;
        int i = cx9Var.b;
        if (((nc) ju0Var3.c) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wq9.D(z2);
        ju0Var3.a = 0L;
        ju0Var3.b = i;
        ju0 ju0Var4 = cx9Var.d;
        cx9Var.e = ju0Var4;
        cx9Var.f = ju0Var4;
        cx9Var.g = 0L;
        ij1 ij1Var2 = cx9Var.a;
        synchronized (ij1Var2) {
            ((jv2) ij1Var2.d).c.d();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.z = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.y = false;
        kj kjVar = this.c;
        SparseArray sparseArray = (SparseArray) kjVar.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((cp8) kjVar.c).accept(sparseArray.valueAt(i2));
        }
        kjVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized boolean G(int i) {
        synchronized (this) {
            this.s = 0;
            cx9 cx9Var = this.a;
            cx9Var.e = cx9Var.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean H(boolean z, long j) {
        Throwable th;
        fx9 fx9Var;
        boolean z2;
        fx9 fx9Var2;
        long j2;
        int p;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                cx9 cx9Var = this.a;
                                cx9Var.e = cx9Var.d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    fx9Var = this;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fx9Var = this;
                                while (true) {
                                    try {
                                        try {
                                            break;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                throw th;
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        fx9Var = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int v = v(0);
            long j3 = this.u;
            int i = (j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1));
            long j4 = this.w;
            if (i != 0) {
                try {
                    j4 = Math.min(j4, j3);
                } catch (Throwable th8) {
                    th = th8;
                    fx9Var = this;
                    throw th;
                }
            }
            int i2 = this.s;
            int i3 = this.p;
            if (i2 != i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || j < this.n[v] || (j > j4 && !z)) {
                return false;
            }
            if (this.F) {
                fx9Var2 = this;
                j2 = j;
                p = fx9Var2.o(v, j2, i3 - i2, z);
            } else {
                fx9Var2 = this;
                j2 = j;
                p = fx9Var2.p(v, j2, i3 - i2, true);
            }
            if (p == -1) {
                return false;
            }
            fx9Var2.t = j2;
            fx9Var2.s += p;
            return true;
        } catch (Throwable th9) {
            th = th9;
            fx9Var = this;
            th = th;
            throw th;
        }
    }

    public final synchronized void I(long j) {
        fx9 fx9Var;
        Throwable th;
        fx9 fx9Var2;
        long j2;
        int i;
        try {
            try {
                if (j == this.u) {
                    return;
                }
                int i2 = -1;
                if (j == Long.MIN_VALUE) {
                    try {
                        this.x = -1;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fx9Var = this;
                        throw th;
                    }
                }
                if (j <= this.w) {
                    fx9Var2 = this;
                    j2 = j;
                    i = fx9Var2.o(this.r, j2, this.p, false);
                } else {
                    fx9Var2 = this;
                    j2 = j;
                    i = -1;
                }
                if (i != -1) {
                    i2 = fx9Var2.q + i;
                }
                fx9Var2.x = i2;
                fx9Var2.u = j2;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fx9Var = this;
            th = th;
            throw th;
        }
    }

    public final synchronized void J(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    wq9.s(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        wq9.s(z);
        this.s += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
        if (((defpackage.dx9) r10.valueAt(r10.size() - 1)).a.equals(r9.D) == false) goto L83;
     */
    @Override // defpackage.fjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r10, int r12, int r13, int r14, defpackage.ejc r15) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx9.a(long, int, int, int, ejc):void");
    }

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        while (true) {
            cx9 cx9Var = this.a;
            if (i > 0) {
                int b = cx9Var.b(i);
                ju0 ju0Var = cx9Var.f;
                nc ncVar = (nc) ju0Var.c;
                km8Var.k(ncVar.a, ((int) (cx9Var.g - ju0Var.a)) + ncVar.b, b);
                i -= b;
                long j = cx9Var.g + b;
                cx9Var.g = j;
                ju0 ju0Var2 = cx9Var.f;
                if (j == ju0Var2.b) {
                    cx9Var.f = (ju0) ju0Var2.d;
                }
            } else {
                cx9Var.getClass();
                return;
            }
        }
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        cx9 cx9Var = this.a;
        int b = cx9Var.b(i);
        ju0 ju0Var = cx9Var.f;
        nc ncVar = (nc) ju0Var.c;
        int read = eg2Var.read(ncVar.a, ((int) (cx9Var.g - ju0Var.a)) + ncVar.b, b);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = cx9Var.g + read;
        cx9Var.g = j;
        ju0 ju0Var2 = cx9Var.f;
        if (j == ju0Var2.b) {
            cx9Var.f = (ju0) ju0Var2.d;
        }
        return read;
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
        boolean z;
        String str;
        boolean z2;
        vq4 q = q(vq4Var);
        boolean z3 = false;
        this.B = false;
        this.C = vq4Var;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(q, this.D)) {
                    if (((SparseArray) this.c.b).size() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        SparseArray sparseArray = (SparseArray) this.c.b;
                        if (((dx9) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.b;
                            this.D = ((dx9) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z4 = this.F;
                            vq4 vq4Var2 = this.D;
                            str = vq4Var2.o;
                            String str2 = vq4Var2.k;
                            if (lc7.i(str) != 1 && lc7.a(str, str2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.F = z4 & z2;
                            this.G = false;
                            z3 = true;
                        }
                    }
                    this.D = q;
                    boolean z42 = this.F;
                    vq4 vq4Var22 = this.D;
                    str = vq4Var22.o;
                    String str22 = vq4Var22.k;
                    if (lc7.i(str) != 1) {
                    }
                    z2 = false;
                    this.F = z42 & z2;
                    this.G = false;
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ex9 ex9Var = this.f;
        if (ex9Var != null && z3) {
            ex9Var.a();
        }
    }

    public final int h(long j) {
        int i = this.p;
        int v = v(i - 1);
        while (i > this.s && this.n[v] >= j) {
            i--;
            v--;
            if (v == -1) {
                v = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        int i2;
        this.v = Math.max(this.v, t(i));
        this.p -= i;
        int i3 = this.q + i;
        this.q = i3;
        int i4 = this.r + i;
        this.r = i4;
        int i5 = this.i;
        if (i4 >= i5) {
            this.r = i4 - i5;
        }
        int i6 = this.s - i;
        this.s = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.s = 0;
        }
        kj kjVar = this.c;
        SparseArray sparseArray = (SparseArray) kjVar.b;
        while (i7 < sparseArray.size() - 1) {
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            ((cp8) kjVar.c).accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = kjVar.a;
            if (i9 > 0) {
                kjVar.a = i9 - 1;
            }
            i7 = i8;
        }
        if (this.p == 0) {
            int i10 = this.r;
            if (i10 == 0) {
                i10 = this.i;
            }
            return this.k[i10 - 1] + this.l[i2];
        }
        return this.k[this.r];
    }

    public final void j(boolean z, long j) {
        fx9 fx9Var;
        Throwable th;
        long j2;
        cx9 cx9Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fx9Var = this;
                                    throw th;
                                }
                            }
                            int p = p(i2, j, i, false);
                            if (p != -1) {
                                j2 = i(p);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fx9Var = this;
                th = th;
                throw th;
            }
        }
        cx9Var.a(j2);
    }

    public final void k() {
        long i;
        cx9 cx9Var = this.a;
        synchronized (this) {
            int i2 = this.p;
            if (i2 == 0) {
                i = -1;
            } else {
                i = i(i2);
            }
        }
        cx9Var.a(i);
    }

    public final void l(long j) {
        boolean z;
        if (this.p == 0) {
            return;
        }
        if (j > s()) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        n(this.q + h(j));
    }

    public final long m(int i) {
        boolean z;
        int v;
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z2 = false;
        if (i4 >= 0 && i4 <= i3 - this.s) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        int i5 = this.p - i4;
        this.p = i5;
        this.w = Math.max(this.v, t(i5));
        if (i4 == 0 && this.y) {
            z2 = true;
        }
        this.y = z2;
        int i6 = this.x;
        int i7 = -1;
        if (i6 != -1 && i < i6) {
            this.x = -1;
        }
        kj kjVar = this.c;
        SparseArray sparseArray = (SparseArray) kjVar.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((cp8) kjVar.c).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i7 = Math.min(kjVar.a, sparseArray.size() - 1);
        }
        kjVar.a = i7;
        int i8 = this.p;
        if (i8 != 0) {
            return this.k[v(i8 - 1)] + this.l[v];
        }
        return 0L;
    }

    public final void n(int i) {
        boolean z;
        ju0 ju0Var;
        cx9 cx9Var = this.a;
        long m = m(i);
        int i2 = cx9Var.b;
        if (m <= cx9Var.g) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        cx9Var.g = m;
        if (m != 0) {
            ju0 ju0Var2 = cx9Var.d;
            if (m != ju0Var2.a) {
                while (true) {
                    int i3 = (cx9Var.g > ju0Var2.b ? 1 : (cx9Var.g == ju0Var2.b ? 0 : -1));
                    ju0Var = (ju0) ju0Var2.d;
                    if (i3 <= 0) {
                        break;
                    }
                    ju0Var2 = ju0Var;
                }
                ju0Var.getClass();
                if (((nc) ju0Var.c) != null) {
                    ij1 ij1Var = cx9Var.a;
                    synchronized (ij1Var) {
                        ((jv2) ij1Var.d).c.b(ju0Var);
                        ju0 ju0Var3 = ju0Var;
                        while (ju0Var3 != null) {
                            nc ncVar = (nc) ju0Var3.c;
                            ncVar.getClass();
                            ij1Var.T(ncVar);
                            ju0Var3 = (ju0) ju0Var3.d;
                            if (ju0Var3 == null || ((nc) ju0Var3.c) == null) {
                                ju0Var3 = null;
                            }
                        }
                    }
                    ju0Var.c = null;
                    ju0Var.d = null;
                }
                ju0 ju0Var4 = new ju0(ju0Var2.b, i2);
                ju0Var2.d = ju0Var4;
                if (cx9Var.g == ju0Var2.b) {
                    ju0Var2 = ju0Var4;
                }
                cx9Var.f = ju0Var2;
                if (cx9Var.e == ju0Var) {
                    cx9Var.e = ju0Var4;
                    return;
                }
                return;
            }
        }
        ju0 ju0Var5 = cx9Var.d;
        if (((nc) ju0Var5.c) != null) {
            ij1 ij1Var2 = cx9Var.a;
            synchronized (ij1Var2) {
                ((jv2) ij1Var2.d).c.b(ju0Var5);
                ju0 ju0Var6 = ju0Var5;
                while (ju0Var6 != null) {
                    nc ncVar2 = (nc) ju0Var6.c;
                    ncVar2.getClass();
                    ij1Var2.T(ncVar2);
                    ju0Var6 = (ju0) ju0Var6.d;
                    if (ju0Var6 == null || ((nc) ju0Var6.c) == null) {
                        ju0Var6 = null;
                    }
                }
            }
            ju0Var5.c = null;
            ju0Var5.d = null;
        }
        ju0 ju0Var7 = new ju0(cx9Var.g, i2);
        cx9Var.d = ju0Var7;
        cx9Var.e = ju0Var7;
        cx9Var.f = ju0Var7;
    }

    public final int o(int i, long j, int i2, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int p(int i, long j, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.n[i] > j ? 1 : (this.n[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (i5 == 0) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public vq4 q(vq4 vq4Var) {
        if (this.H != 0 && vq4Var.t != Long.MAX_VALUE) {
            uq4 a = vq4Var.a();
            a.s = vq4Var.t + this.H;
            return new vq4(a);
        }
        return vq4Var;
    }

    public final synchronized long r() {
        return this.w;
    }

    public final synchronized long s() {
        return Math.max(this.v, t(this.s));
    }

    public final long t(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int v = v(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[v]);
            if ((this.m[v] & 1) != 0) {
                return j;
            }
            v--;
            if (v == -1) {
                v = this.i - 1;
            }
        }
        return j;
    }

    public final int u() {
        return this.q + this.s;
    }

    public final int v(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    public final synchronized int w(boolean z, long j) {
        boolean z2;
        try {
            try {
                int v = v(this.s);
                int i = this.s;
                int i2 = this.p;
                if (i != i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || j < this.n[v]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int p = p(v, j, i2 - i, true);
                if (p == -1) {
                    return 0;
                }
                return p;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized vq4 x() {
        vq4 vq4Var;
        if (this.A) {
            vq4Var = null;
        } else {
            vq4Var = this.D;
        }
        return vq4Var;
    }

    public final synchronized boolean y() {
        boolean z;
        if (this.x != -1) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean z(boolean z) {
        boolean z2;
        vq4 vq4Var;
        int u = u();
        int i = this.x;
        boolean z3 = true;
        if (i != -1 && u >= i) {
            return true;
        }
        if (this.s != this.p) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z && !this.y && ((vq4Var = this.D) == null || vq4Var == this.g)) {
                z3 = false;
            }
            return z3;
        } else if (((dx9) this.c.m(u)).a != this.g) {
            return true;
        } else {
            return A(v(this.s));
        }
    }
}
