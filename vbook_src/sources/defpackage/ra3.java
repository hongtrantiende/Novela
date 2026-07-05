package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra3  reason: default package */
/* loaded from: classes.dex */
public final class ra3 implements AutoCloseable {
    public static final gm9 N = new gm9("[a-z0-9_-]{1,120}");
    public final m41 C;
    public final Object D;
    public long E;
    public int F;
    public lj9 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final qa3 M;
    public final hn8 a;
    public final long b;
    public final hn8 c;
    public final hn8 d;
    public final hn8 e;
    public final LinkedHashMap f;

    /* JADX WARN: Type inference failed for: r3v13, types: [qa3, fr4] */
    public ra3(long j, pe4 pe4Var, hn8 hn8Var) {
        this.a = hn8Var;
        this.b = j;
        if (j > 0) {
            this.c = hn8Var.e("journal");
            this.d = hn8Var.e("journal.tmp");
            this.e = hn8Var.e("journal.bkp");
            this.f = new LinkedHashMap(0, 0.75f, true);
            b9b b = rse.b();
            sw2 sw2Var = ab3.a;
            ru2 ru2Var = ru2.c;
            e82 e82Var = f82.b;
            this.C = k27.a(nq2.C(b, ru2Var.j0(1)));
            this.D = new Object();
            this.M = new fr4(pe4Var);
            return;
        }
        vs.m("maxSize <= 0");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
        if (r3 != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0077, B:33:0x007e, B:28:0x005e, B:37:0x009e, B:39:0x00a5, B:42:0x00aa, B:44:0x00bb, B:47:0x00c0, B:52:0x00fb, B:54:0x0106, B:58:0x010f, B:48:0x00d8, B:50:0x00ed, B:51:0x00f8, B:36:0x008e, B:61:0x0114, B:62:0x011b), top: B:65:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.ra3 r10, defpackage.o40 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra3.o(ra3, o40, boolean):void");
    }

    public static void y0(String str) {
        if (N.g(str)) {
            return;
        }
        p1a.k(hl5.n("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final pa3 C(String str) {
        pa3 a;
        synchronized (this.D) {
            if (!this.J) {
                y0(str);
                G();
                oa3 oa3Var = (oa3) this.f.get(str);
                if (oa3Var != null && (a = oa3Var.a()) != null) {
                    boolean z = true;
                    this.F++;
                    lj9 lj9Var = this.G;
                    lj9Var.getClass();
                    lj9Var.i0("READ");
                    lj9Var.writeByte(32);
                    lj9Var.i0(str);
                    lj9Var.writeByte(10);
                    lj9Var.flush();
                    if (this.F < 2000) {
                        z = false;
                    }
                    if (z) {
                        Q();
                    }
                    return a;
                }
                return null;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void G() {
        synchronized (this.D) {
            try {
                if (this.I) {
                    return;
                }
                this.M.S(this.d);
                if (this.M.j0(this.e)) {
                    boolean j0 = this.M.j0(this.c);
                    qa3 qa3Var = this.M;
                    hn8 hn8Var = this.e;
                    if (j0) {
                        qa3Var.S(hn8Var);
                    } else {
                        qa3Var.q(hn8Var, this.c);
                    }
                }
                if (this.M.j0(this.c)) {
                    try {
                        g0();
                        V();
                        this.I = true;
                        return;
                    } catch (IOException unused) {
                        close();
                        yf2.r(this.M, this.a);
                        this.J = false;
                    }
                }
                I0();
                this.I = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I0() {
        long[] jArr;
        synchronized (this.D) {
            try {
                lj9 lj9Var = this.G;
                if (lj9Var != null) {
                    lj9Var.close();
                }
                lj9 p = tl1.p(this.M.g1(this.d, false));
                p.i0("libcore.io.DiskLruCache");
                p.writeByte(10);
                p.i0("1");
                p.writeByte(10);
                p.o(3L);
                p.writeByte(10);
                p.o(2L);
                p.writeByte(10);
                p.writeByte(10);
                for (oa3 oa3Var : this.f.values()) {
                    if (oa3Var.g != null) {
                        p.i0("DIRTY");
                        p.writeByte(32);
                        p.i0(oa3Var.a);
                        p.writeByte(10);
                    } else {
                        p.i0("CLEAN");
                        p.writeByte(32);
                        p.i0(oa3Var.a);
                        for (long j : oa3Var.b) {
                            p.writeByte(32);
                            p.o(j);
                        }
                        p.writeByte(10);
                    }
                }
                try {
                    p.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                if (th == null) {
                    boolean j0 = this.M.j0(this.c);
                    qa3 qa3Var = this.M;
                    if (j0) {
                        qa3Var.q(this.c, this.e);
                        this.M.q(this.d, this.c);
                        this.M.S(this.e);
                    } else {
                        qa3Var.q(this.d, this.c);
                    }
                    this.G = S();
                    this.F = 0;
                    this.H = false;
                    this.L = false;
                } else {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Q() {
        z87.v(this.C, null, null, new rg0(this, null, 5), 3);
    }

    public final lj9 S() {
        qa3 qa3Var = this.M;
        qa3Var.getClass();
        hn8 hn8Var = this.c;
        hn8Var.getClass();
        return new lj9(new b03(qa3Var.c.o(hn8Var), new cq2(this, 13), 1));
    }

    public final void V() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            oa3 oa3Var = (oa3) it.next();
            int i = 0;
            if (oa3Var.g == null) {
                while (i < 2) {
                    j += oa3Var.b[i];
                    i++;
                }
            } else {
                oa3Var.g = null;
                while (i < 2) {
                    qa3 qa3Var = this.M;
                    qa3Var.S((hn8) oa3Var.c.get(i));
                    qa3Var.S((hn8) oa3Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.E = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.D) {
            try {
                if (this.I && !this.J) {
                    for (oa3 oa3Var : (oa3[]) this.f.values().toArray(new oa3[0])) {
                        o40 o40Var = oa3Var.g;
                        if (o40Var != null) {
                            oa3 oa3Var2 = (oa3) o40Var.b;
                            if (c16.i(oa3Var2.g, o40Var)) {
                                oa3Var2.f = true;
                            }
                        }
                    }
                    p0();
                    k27.n(this.C, null);
                    lj9 lj9Var = this.G;
                    lj9Var.getClass();
                    lj9Var.close();
                    this.G = null;
                    this.J = true;
                    return;
                }
                this.J = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g0() {
        mj9 q = tl1.q(this.M.k1(this.c));
        try {
            String c0 = q.c0(Long.MAX_VALUE);
            String c02 = q.c0(Long.MAX_VALUE);
            String c03 = q.c0(Long.MAX_VALUE);
            String c04 = q.c0(Long.MAX_VALUE);
            String c05 = q.c0(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(c0) && "1".equals(c02) && c16.i(String.valueOf(3), c03) && c16.i(String.valueOf(2), c04) && c05.length() <= 0) {
                int i = 0;
                while (true) {
                    try {
                        j0(q.c0(Long.MAX_VALUE));
                        i++;
                    } catch (EOFException unused) {
                        this.F = i - this.f.size();
                        if (!q.k()) {
                            I0();
                        } else {
                            this.G = S();
                        }
                        try {
                            q.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th == null) {
                            return;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + c0 + ", " + c02 + ", " + c03 + ", " + c04 + ", " + c05 + "]");
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                q.close();
            } catch (Throwable th3) {
                pye.e(th, th3);
            }
        }
    }

    public final void j0(String str) {
        String substring;
        int f0 = k4b.f0(str, ' ', 0, 6);
        if (f0 != -1) {
            int i = f0 + 1;
            int f02 = k4b.f0(str, ' ', i, 4);
            LinkedHashMap linkedHashMap = this.f;
            if (f02 == -1) {
                substring = str.substring(i);
                if (f0 == 6 && r4b.Q(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, f02);
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new oa3(this, substring);
                linkedHashMap.put(substring, obj);
            }
            oa3 oa3Var = (oa3) obj;
            if (f02 != -1 && f0 == 5 && r4b.Q(str, "CLEAN", false)) {
                List y0 = k4b.y0(str.substring(f02 + 1), new char[]{' '}, 0, 6);
                oa3Var.e = true;
                oa3Var.g = null;
                if (y0.size() == 2) {
                    try {
                        int size = y0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            oa3Var.b[i2] = Long.parseLong((String) y0.get(i2));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        hfd.i(y0, "unexpected journal line: ");
                        return;
                    }
                }
                hfd.i(y0, "unexpected journal line: ");
                return;
            } else if (f02 == -1 && f0 == 5 && r4b.Q(str, "DIRTY", false)) {
                oa3Var.g = new o40(this, oa3Var);
                return;
            } else if (f02 == -1 && f0 == 4 && r4b.Q(str, "READ", false)) {
                return;
            } else {
                fb4.k("unexpected journal line: ".concat(str));
                return;
            }
        }
        fb4.k("unexpected journal line: ".concat(str));
    }

    public final void m0(oa3 oa3Var) {
        lj9 lj9Var;
        int i = oa3Var.h;
        String str = oa3Var.a;
        if (i > 0 && (lj9Var = this.G) != null) {
            lj9Var.i0("DIRTY");
            lj9Var.writeByte(32);
            lj9Var.i0(str);
            lj9Var.writeByte(10);
            lj9Var.flush();
        }
        if (oa3Var.h <= 0 && oa3Var.g == null) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.M.S((hn8) oa3Var.c.get(i2));
                long j = this.E;
                long[] jArr = oa3Var.b;
                this.E = j - jArr[i2];
                jArr[i2] = 0;
            }
            this.F++;
            lj9 lj9Var2 = this.G;
            if (lj9Var2 != null) {
                lj9Var2.i0("REMOVE");
                lj9Var2.writeByte(32);
                lj9Var2.i0(str);
                lj9Var2.writeByte(10);
                lj9Var2.flush();
            }
            this.f.remove(str);
            if (this.F >= 2000) {
                Q();
                return;
            }
            return;
        }
        oa3Var.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        m0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0() {
        /*
            r4 = this;
        L0:
            long r0 = r4.E
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            oa3 r1 = (defpackage.oa3) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.m0(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra3.p0():void");
    }

    public final o40 q(String str) {
        o40 o40Var;
        synchronized (this.D) {
            if (!this.J) {
                y0(str);
                G();
                oa3 oa3Var = (oa3) this.f.get(str);
                if (oa3Var != null) {
                    o40Var = oa3Var.g;
                } else {
                    o40Var = null;
                }
                if (o40Var != null) {
                    return null;
                }
                if (oa3Var != null && oa3Var.h != 0) {
                    return null;
                }
                if (!this.K && !this.L) {
                    lj9 lj9Var = this.G;
                    lj9Var.getClass();
                    lj9Var.i0("DIRTY");
                    lj9Var.writeByte(32);
                    lj9Var.i0(str);
                    lj9Var.writeByte(10);
                    lj9Var.flush();
                    if (this.H) {
                        return null;
                    }
                    if (oa3Var == null) {
                        oa3Var = new oa3(this, str);
                        this.f.put(str, oa3Var);
                    }
                    o40 o40Var2 = new o40(this, oa3Var);
                    oa3Var.g = o40Var2;
                    return o40Var2;
                }
                Q();
                return null;
            }
            throw new IllegalStateException("cache is closed");
        }
    }
}
