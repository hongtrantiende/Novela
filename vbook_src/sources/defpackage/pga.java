package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pga  reason: default package */
/* loaded from: classes3.dex */
public class pga extends q3 implements xv7, sj4, zu4 {
    public final py0 C;
    public Object[] D;
    public long E;
    public long F;
    public int G;
    public int H;
    public final int e;
    public final int f;

    public pga(int i, int i2, py0 py0Var) {
        this.e = i;
        this.f = i2;
        this.C = py0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(9:(2:3|(12:5|6|7|(2:9|(1:(1:(9:13|14|15|16|17|(3:18|19|(10:27|(2:32|33)|35|(1:37)|15|16|17|18|19|(0)(1:21))(0))|23|24|25)(2:38|39))(7:40|41|17|(3:18|19|(0)(0))|23|24|25))(4:42|43|44|45))(1:56)|46|47|16|17|(3:18|19|(0)(0))|23|24|25))|46|47|16|17|(3:18|19|(0)(0))|23|24|25)|58|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0075, B:35:0x007f, B:39:0x0092, B:42:0x0099, B:43:0x009d, B:44:0x009e, B:22:0x0047), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [q3] */
    /* JADX WARN: Type inference failed for: r9v0, types: [tj4] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [r3] */
    /* JADX WARN: Type inference failed for: r9v5, types: [rga] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(defpackage.pga r8, defpackage.tj4 r9, defpackage.m42 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.oga
            if (r0 == 0) goto L13
            r0 = r10
            oga r0 = (defpackage.oga) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            oga r0 = new oga
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.C
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            w26 r8 = r0.d
            rga r9 = r0.c
            tj4 r1 = r0.b
            pga r4 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return
        L3f:
            w26 r8 = r0.d
            rga r9 = r0.c
            tj4 r1 = r0.b
            pga r4 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            rga r9 = r0.c
            tj4 r8 = r0.b
            pga r1 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            defpackage.hre.r(r10)
            r3 r10 = r8.g()
            rga r10 = (defpackage.rga) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            d82 r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            r0f r4 = defpackage.r0f.I     // Catch: java.lang.Throwable -> Laf
            b82 r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Laf
            w26 r1 = (defpackage.w26) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.v(r9)     // Catch: java.lang.Throwable -> L36
            lie r5 = defpackage.qga.a     // Catch: java.lang.Throwable -> L36
            n82 r6 = defpackage.n82.a
            if (r10 != r5) goto L90
            r0.a = r4     // Catch: java.lang.Throwable -> L36
            r0.b = r1     // Catch: java.lang.Throwable -> L36
            r0.c = r9     // Catch: java.lang.Throwable -> L36
            r0.d = r8     // Catch: java.lang.Throwable -> L36
            r0.C = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.l(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.isActive()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.a = r4     // Catch: java.lang.Throwable -> L36
            r0.b = r1     // Catch: java.lang.Throwable -> L36
            r0.c = r9     // Catch: java.lang.Throwable -> L36
            r0.d = r8     // Catch: java.lang.Throwable -> L36
            r0.C = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pga.n(pga, tj4, m42):void");
    }

    @Override // defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        n(this, tj4Var, m42Var);
        return n82.a;
    }

    @Override // defpackage.xv7, defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        pga pgaVar;
        Throwable th;
        m42[] q;
        nga ngaVar;
        if (f(obj)) {
            return pvc.a;
        }
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        m42[] m42VarArr = eg0.b;
        synchronized (this) {
            try {
                if (t(obj)) {
                    try {
                        f61Var.resumeWith(pvc.a);
                        q = q(m42VarArr);
                        ngaVar = null;
                        pgaVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        pgaVar = this;
                        throw th;
                    }
                } else {
                    try {
                        pgaVar = this;
                        try {
                            nga ngaVar2 = new nga(pgaVar, r() + this.G + this.H, obj, f61Var);
                            pgaVar.p(ngaVar2);
                            pgaVar.H++;
                            if (pgaVar.f == 0) {
                                m42VarArr = pgaVar.q(m42VarArr);
                            }
                            q = m42VarArr;
                            ngaVar = ngaVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        pgaVar = this;
                        th = th4;
                        throw th;
                    }
                }
                if (ngaVar != null) {
                    f61Var.x(new z51(ngaVar, 2));
                }
                for (m42 m42Var2 : q) {
                    if (m42Var2 != null) {
                        m42Var2.resumeWith(pvc.a);
                    }
                }
                Object s = f61Var.s();
                n82 n82Var = n82.a;
                if (s != n82Var) {
                    s = pvc.a;
                }
                if (s == n82Var) {
                    return s;
                }
                return pvc.a;
            } catch (Throwable th5) {
                th = th5;
                pgaVar = this;
            }
        }
    }

    @Override // defpackage.zu4
    public final sj4 c(d82 d82Var, int i, py0 py0Var) {
        if ((i == 0 || i == -3) && py0Var == py0.a) {
            return this;
        }
        return new za1(this, d82Var, i, py0Var);
    }

    @Override // defpackage.xv7
    public final void e() {
        pga pgaVar;
        synchronized (this) {
            try {
                pgaVar = this;
                try {
                    pgaVar.w(r() + this.G, this.F, r() + this.G, r() + this.G + this.H);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                pgaVar = this;
            }
        }
    }

    @Override // defpackage.xv7
    public final boolean f(Object obj) {
        int i;
        boolean z;
        m42[] m42VarArr = eg0.b;
        synchronized (this) {
            if (t(obj)) {
                m42VarArr = q(m42VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (m42 m42Var : m42VarArr) {
            if (m42Var != null) {
                m42Var.resumeWith(pvc.a);
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [r3, java.lang.Object, rga] */
    @Override // defpackage.q3
    public final r3 h() {
        ?? obj = new Object();
        obj.a = -1L;
        return obj;
    }

    @Override // defpackage.q3
    public final r3[] i() {
        return new rga[2];
    }

    public final Object l(rga rgaVar, oga ogaVar) {
        f61 f61Var = new f61(1, w92.t(ogaVar));
        f61Var.u();
        synchronized (this) {
            try {
                if (u(rgaVar) < 0) {
                    rgaVar.b = f61Var;
                } else {
                    f61Var.resumeWith(pvc.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = f61Var.s();
        if (s == n82.a) {
            return s;
        }
        return pvc.a;
    }

    public final void m() {
        if (this.f != 0 || this.H > 1) {
            Object[] objArr = this.D;
            objArr.getClass();
            while (this.H > 0) {
                long r = r();
                int i = this.G;
                int i2 = this.H;
                if (objArr[((int) ((r + (i + i2)) - 1)) & (objArr.length - 1)] == qga.a) {
                    this.H = i2 - 1;
                    qga.b(objArr, r() + this.G + this.H, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void o() {
        r3[] r3VarArr;
        Object[] objArr = this.D;
        objArr.getClass();
        qga.b(objArr, r(), null);
        this.G--;
        long r = r() + 1;
        if (this.E < r) {
            this.E = r;
        }
        if (this.F < r) {
            if (this.b != 0 && (r3VarArr = this.a) != null) {
                for (r3 r3Var : r3VarArr) {
                    if (r3Var != null) {
                        rga rgaVar = (rga) r3Var;
                        long j = rgaVar.a;
                        if (0 <= j && j < r) {
                            rgaVar.a = r;
                        }
                    }
                }
            }
            this.F = r;
        }
    }

    public final void p(Object obj) {
        int i = this.G + this.H;
        Object[] objArr = this.D;
        if (objArr == null) {
            objArr = s(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = s(objArr, i, objArr.length * 2);
        }
        qga.b(objArr, r() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m42[] q(m42[] m42VarArr) {
        r3[] r3VarArr;
        rga rgaVar;
        f61 f61Var;
        int length = m42VarArr.length;
        if (this.b != 0 && (r3VarArr = this.a) != null) {
            int length2 = r3VarArr.length;
            int i = 0;
            m42VarArr = m42VarArr;
            while (i < length2) {
                r3 r3Var = r3VarArr[i];
                if (r3Var != null && (f61Var = (rgaVar = (rga) r3Var).b) != null && u(rgaVar) >= 0) {
                    int length3 = m42VarArr.length;
                    m42VarArr = m42VarArr;
                    if (length >= length3) {
                        m42VarArr = Arrays.copyOf(m42VarArr, Math.max(2, m42VarArr.length * 2));
                    }
                    m42VarArr[length] = f61Var;
                    rgaVar.b = null;
                    length++;
                }
                i++;
                m42VarArr = m42VarArr;
            }
        }
        return m42VarArr;
    }

    public final long r() {
        return Math.min(this.F, this.E);
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.D = objArr2;
            if (objArr != null) {
                long r = r();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + r;
                    qga.b(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        vs.k("Buffer size overflow");
        return null;
    }

    public final boolean t(Object obj) {
        int i = this.b;
        int i2 = this.e;
        if (i == 0) {
            if (i2 != 0) {
                p(obj);
                int i3 = this.G + 1;
                this.G = i3;
                if (i3 > i2) {
                    o();
                }
                this.F = r() + this.G;
                return true;
            }
        } else {
            int i4 = this.G;
            int i5 = this.f;
            if (i4 >= i5 && this.F <= this.E) {
                int ordinal = this.C.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            xk5.o();
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            p(obj);
            int i6 = this.G + 1;
            this.G = i6;
            if (i6 > i5) {
                o();
            }
            long r = r() + this.G;
            long j = this.E;
            if (((int) (r - j)) > i2) {
                w(1 + j, this.F, r() + this.G, r() + this.G + this.H);
            }
        }
        return true;
    }

    public final long u(rga rgaVar) {
        long j = rgaVar.a;
        if (j >= r() + this.G && (this.f > 0 || j > r() || this.H == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object v(rga rgaVar) {
        Object obj;
        m42[] m42VarArr = eg0.b;
        synchronized (this) {
            try {
                long u = u(rgaVar);
                if (u < 0) {
                    obj = qga.a;
                } else {
                    long j = rgaVar.a;
                    Object[] objArr = this.D;
                    objArr.getClass();
                    Object obj2 = objArr[((int) u) & (objArr.length - 1)];
                    if (obj2 instanceof nga) {
                        obj2 = ((nga) obj2).c;
                    }
                    rgaVar.a = u + 1;
                    Object obj3 = obj2;
                    m42VarArr = x(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (m42 m42Var : m42VarArr) {
            if (m42Var != null) {
                m42Var.resumeWith(pvc.a);
            }
        }
        return obj;
    }

    public final void w(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long r = r(); r < min; r++) {
            Object[] objArr = this.D;
            objArr.getClass();
            qga.b(objArr, r, null);
        }
        this.E = j;
        this.F = j2;
        this.G = (int) (j3 - min);
        this.H = (int) (j4 - j3);
    }

    public final m42[] x(long j) {
        long j2;
        int i;
        long j3;
        m42[] m42VarArr;
        long j4;
        m42[] m42VarArr2;
        r3[] r3VarArr;
        m42[] m42VarArr3 = eg0.b;
        if (j <= this.F) {
            long r = r();
            long j5 = this.G + r;
            int i2 = this.f;
            if (i2 == 0 && this.H > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.b != 0 && (r3VarArr = this.a) != null) {
                for (r3 r3Var : r3VarArr) {
                    if (r3Var != null) {
                        long j6 = ((rga) r3Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.F) {
                long r2 = r() + this.G;
                int i4 = this.b;
                int i5 = this.H;
                if (i4 > 0) {
                    i5 = Math.min(i5, i2 - ((int) (r2 - j5)));
                }
                long j7 = this.H + r2;
                lie lieVar = qga.a;
                if (i5 > 0) {
                    m42[] m42VarArr4 = new m42[i5];
                    j3 = 1;
                    Object[] objArr = this.D;
                    objArr.getClass();
                    j2 = j5;
                    long j8 = r2;
                    while (true) {
                        if (r2 < j7) {
                            m42VarArr2 = m42VarArr4;
                            Object obj = objArr[(objArr.length - 1) & ((int) r2)];
                            if (obj != lieVar) {
                                obj.getClass();
                                nga ngaVar = (nga) obj;
                                int i6 = i3 + 1;
                                i = i2;
                                m42VarArr2[i3] = ngaVar.d;
                                qga.b(objArr, r2, lieVar);
                                qga.b(objArr, j8, ngaVar.c);
                                j8++;
                                if (i6 >= i5) {
                                    break;
                                }
                                i3 = i6;
                            } else {
                                i = i2;
                            }
                            r2++;
                            m42VarArr4 = m42VarArr2;
                            i2 = i;
                        } else {
                            m42VarArr2 = m42VarArr4;
                            i = i2;
                            break;
                        }
                    }
                    r2 = j8;
                    m42VarArr = m42VarArr2;
                } else {
                    j2 = j5;
                    i = i2;
                    j3 = 1;
                    m42VarArr = m42VarArr3;
                }
                long max = Math.max(this.E, Math.max(r, r2 - this.e));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.D;
                    objArr2.getClass();
                    if (c16.i(objArr2[((int) max) & (objArr2.length - 1)], lieVar)) {
                        r2 += j3;
                        max += j3;
                    }
                }
                long j9 = r2;
                if (this.b == 0) {
                    j4 = j9;
                } else {
                    j4 = j2;
                }
                w(max, j4, j9, j7);
                m();
                if (m42VarArr.length == 0) {
                    return m42VarArr;
                }
                return q(m42VarArr);
            }
        }
        return m42VarArr3;
    }
}
