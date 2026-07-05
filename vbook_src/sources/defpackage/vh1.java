package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vh1  reason: default package */
/* loaded from: classes.dex */
public final class vh1 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public vh1(xb1 xb1Var, char c) {
        this.a = 6;
        this.d = 0;
        byte[] bArr = n7e.a;
        if (xb1Var != null) {
            this.e = xb1Var;
            xb1Var.c = this;
            return;
        }
        xk5.k("input");
        throw null;
    }

    public static final void K0(int i) {
        if ((i & 3) == 0) {
            return;
        }
        hfd.s("Failed to parse the message.");
    }

    public static final void L0(int i) {
        if ((i & 7) == 0) {
            return;
        }
        hfd.s("Failed to parse the message.");
    }

    public Object A(eld eldVar, Class cls, y54 y54Var) {
        cl1 cl1Var = (cl1) this.e;
        int i = 0;
        switch (eldVar.ordinal()) {
            case 0:
                n0(1);
                return Double.valueOf(cl1Var.n());
            case 1:
                n0(5);
                return Float.valueOf(cl1Var.r());
            case 2:
                n0(0);
                return Long.valueOf(cl1Var.s0());
            case 3:
                n0(0);
                return Long.valueOf(cl1Var.s0());
            case 4:
                n0(0);
                return Integer.valueOf(cl1Var.r0());
            case 5:
                n0(1);
                return Long.valueOf(cl1Var.q0());
            case 6:
                n0(5);
                return Integer.valueOf(cl1Var.p0());
            case 7:
                n0(0);
                return Boolean.valueOf(cl1Var.k());
            case 8:
                n0(2);
                byte[] bArr = cl1Var.e;
                int r0 = cl1Var.r0();
                int i2 = cl1Var.D;
                int i3 = cl1Var.f;
                if (r0 <= i3 - i2 && r0 > 0) {
                    cl1Var.D = i2 + r0;
                    i = i2;
                } else if (r0 == 0) {
                    return "";
                } else {
                    if (r0 <= i3) {
                        cl1Var.v0(r0);
                        cl1Var.D = r0;
                    } else {
                        bArr = cl1Var.m0(r0);
                    }
                }
                return v1d.a.g(bArr, i, r0);
            case 9:
            default:
                vs.m("unsupported field type.");
                return null;
            case 10:
                n0(2);
                i0a a = y89.c.a(cls);
                pw4 d = a.d();
                j(d, a, y54Var);
                a.b(d);
                return d;
            case 11:
                return p();
            case 12:
                n0(0);
                return Integer.valueOf(cl1Var.r0());
            case 13:
                n0(0);
                return Integer.valueOf(cl1Var.r0());
            case 14:
                n0(5);
                return Integer.valueOf(cl1Var.p0());
            case 15:
                n0(1);
                return Long.valueOf(cl1Var.q0());
            case 16:
                n0(0);
                return Integer.valueOf(cl1Var.x());
            case 17:
                n0(0);
                return Long.valueOf(cl1Var.y());
        }
    }

    public void A0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof q0e;
        int i2 = this.b;
        if (z) {
            q0e q0eVar = (q0e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        q0eVar.zzh(dccVar.I());
                        if (!dccVar.j()) {
                            i = dccVar.r();
                        } else {
                            return;
                        }
                    } while (i == this.b);
                } else {
                    hfd.c();
                    return;
                }
            } else {
                int G = dccVar.G();
                K0(G);
                int k = dccVar.k() + G;
                do {
                    q0eVar.zzh(dccVar.I());
                } while (dccVar.k() < k);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 == 5) {
                    do {
                        f1eVar.add(Integer.valueOf(dccVar.I()));
                        if (!dccVar.j()) {
                            r = dccVar.r();
                        } else {
                            return;
                        }
                    } while (r == this.b);
                    i = r;
                } else {
                    hfd.c();
                    return;
                }
            } else {
                int G2 = dccVar.G();
                K0(G2);
                int k2 = dccVar.k() + G2;
                do {
                    f1eVar.add(Integer.valueOf(dccVar.I()));
                } while (dccVar.k() < k2);
                return;
            }
        }
        this.d = i;
    }

    public Object B(fld fldVar, Class cls, z54 z54Var) {
        xb1 xb1Var = (xb1) this.e;
        switch (fldVar.ordinal()) {
            case 0:
                n0(1);
                return Double.valueOf(xb1Var.n());
            case 1:
                n0(5);
                return Float.valueOf(xb1Var.r());
            case 2:
                n0(0);
                return Long.valueOf(xb1Var.t());
            case 3:
                n0(0);
                return Long.valueOf(xb1Var.D());
            case 4:
                n0(0);
                return Integer.valueOf(xb1Var.s());
            case 5:
                n0(1);
                return Long.valueOf(xb1Var.q());
            case 6:
                n0(5);
                return Integer.valueOf(xb1Var.p());
            case 7:
                n0(0);
                return Boolean.valueOf(xb1Var.k());
            case 8:
                n0(2);
                return xb1Var.A();
            case 9:
            default:
                vs.m("unsupported field type.");
                return null;
            case 10:
                n0(2);
                j0a a = z89.c.a(cls);
                qw4 d = a.d();
                k(d, a, z54Var);
                a.b(d);
                return d;
            case 11:
                return q();
            case 12:
                n0(0);
                return Integer.valueOf(xb1Var.C());
            case 13:
                n0(0);
                return Integer.valueOf(xb1Var.o());
            case 14:
                n0(5);
                return Integer.valueOf(xb1Var.v());
            case 15:
                n0(1);
                return Long.valueOf(xb1Var.w());
            case 16:
                n0(0);
                return Integer.valueOf(xb1Var.x());
            case 17:
                n0(0);
                return Long.valueOf(xb1Var.y());
        }
    }

    public void B0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof o1e;
        int i2 = this.b;
        if (z) {
            o1e o1eVar = (o1e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int G = dccVar.G();
                    L0(G);
                    int k = dccVar.k() + G;
                    do {
                        o1eVar.d(dccVar.J());
                    } while (dccVar.k() < k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                o1eVar.d(dccVar.J());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int G2 = dccVar.G();
                    L0(G2);
                    int k2 = dccVar.k() + G2;
                    do {
                        f1eVar.add(Long.valueOf(dccVar.J()));
                    } while (dccVar.k() < k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Long.valueOf(dccVar.J()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void C(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((a99) sz5Var).add(Integer.valueOf(xb1Var.p()));
                    if (!xb1Var.c()) {
                        B = xb1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw o16.b();
        }
        int C = xb1Var.C();
        if ((C & 3) == 0) {
            int b = xb1Var.b() + C;
            do {
                ((a99) sz5Var).add(Integer.valueOf(xb1Var.p()));
            } while (xb1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void C0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof q0e;
        int i2 = this.b;
        if (z) {
            q0e q0eVar = (q0e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        q0eVar.zzh(dccVar.K());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                q0eVar.zzh(dccVar.K());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Integer.valueOf(dccVar.K()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Integer.valueOf(dccVar.K()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void D(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((c99) tz5Var).add(Integer.valueOf(xb1Var.p()));
                    if (!xb1Var.c()) {
                        B = xb1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw q16.b();
        }
        int C = xb1Var.C();
        if ((C & 3) == 0) {
            int b = xb1Var.b() + C;
            do {
                ((c99) tz5Var).add(Integer.valueOf(xb1Var.p()));
            } while (xb1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void D0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof o1e;
        int i2 = this.b;
        if (z) {
            o1e o1eVar = (o1e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        o1eVar.d(dccVar.L());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                o1eVar.d(dccVar.L());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Long.valueOf(dccVar.L()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Long.valueOf(dccVar.L()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void E(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    list.add(Integer.valueOf(cl1Var.p0()));
                    if (!cl1Var.c()) {
                        B = cl1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw p16.b();
        }
        int r0 = cl1Var.r0();
        if ((r0 & 3) == 0) {
            int b = cl1Var.b() + r0;
            do {
                list.add(Integer.valueOf(cl1Var.p0()));
            } while (cl1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
        r1.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E0(defpackage.r1e r12, defpackage.yx9 r13, defpackage.h0e r14) {
        /*
            r11 = this;
            r0 = 2
            r11.F0(r0)
            java.lang.Object r1 = r11.e
            dcc r1 = (defpackage.dcc) r1
            int r2 = r1.G()
            int r2 = r1.g(r2)
            java.lang.Object r3 = r13.d
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.Q0()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.j()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.j()     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.b     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            int r7 = r11.c     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.t(r6)     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            i1e r6 = new i1e     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
        L49:
            r11 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.c     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            i3e r6 = (defpackage.i3e) r6     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            java.lang.Object r5 = r11.I0(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.b     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            i3e r6 = (defpackage.i3e) r6     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            r7 = 0
            java.lang.Object r4 = r11.I0(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 defpackage.g1e -> L4b
            goto L15
        L64:
            boolean r7 = r1.j()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.b     // Catch: java.lang.Throwable -> L49
            int r10 = r11.c     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.t(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            i1e r11 = new i1e     // Catch: java.lang.Throwable -> L49
            r11.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.h(r2)
            return
        L85:
            r1.h(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh1.E0(r1e, yx9, h0e):void");
    }

    public void F(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int C = xb1Var.C();
                if ((C & 7) == 0) {
                    int b = xb1Var.b() + C;
                    do {
                        ((a99) sz5Var).add(Long.valueOf(xb1Var.q()));
                    } while (xb1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Long.valueOf(xb1Var.q()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void F0(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        hfd.c();
    }

    public void G(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int C = xb1Var.C();
                if ((C & 7) == 0) {
                    int b = xb1Var.b() + C;
                    do {
                        ((c99) tz5Var).add(Long.valueOf(xb1Var.q()));
                    } while (xb1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Long.valueOf(xb1Var.q()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void G0(Object obj, m2e m2eVar, h0e h0eVar) {
        dcc dccVar = (dcc) this.e;
        int G = dccVar.G();
        if (dccVar.a + dccVar.b < 100) {
            int g = dccVar.g(G);
            dccVar.a++;
            m2eVar.f(obj, this, h0eVar);
            dccVar.s(0);
            dccVar.a--;
            dccVar.h(g);
            return;
        }
        hfd.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void H(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int r0 = cl1Var.r0();
                if ((r0 & 7) == 0) {
                    int b = cl1Var.b() + r0;
                    do {
                        list.add(Long.valueOf(cl1Var.q0()));
                    } while (cl1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw p16.b();
        }
        do {
            list.add(Long.valueOf(cl1Var.q0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void H0(Object obj, m2e m2eVar, h0e h0eVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            m2eVar.f(obj, this, h0eVar);
            if (this.b == this.c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    public void I(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((a99) sz5Var).add(Float.valueOf(xb1Var.r()));
                    if (!xb1Var.c()) {
                        B = xb1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw o16.b();
        }
        int C = xb1Var.C();
        if ((C & 3) == 0) {
            int b = xb1Var.b() + C;
            do {
                ((a99) sz5Var).add(Float.valueOf(xb1Var.r()));
            } while (xb1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public Object I0(i3e i3eVar, Class cls, h0e h0eVar) {
        dcc dccVar = (dcc) this.e;
        i3e i3eVar2 = i3e.c;
        switch (i3eVar.ordinal()) {
            case 0:
                F0(1);
                return Double.valueOf(dccVar.u());
            case 1:
                F0(5);
                return Float.valueOf(dccVar.v());
            case 2:
                F0(0);
                return Long.valueOf(dccVar.x());
            case 3:
                F0(0);
                return Long.valueOf(dccVar.w());
            case 4:
                F0(0);
                return Integer.valueOf(dccVar.y());
            case 5:
                F0(1);
                return Long.valueOf(dccVar.z());
            case 6:
                F0(5);
                return Integer.valueOf(dccVar.A());
            case 7:
                F0(0);
                return Boolean.valueOf(dccVar.B());
            case 8:
                F0(2);
                return dccVar.D();
            case 9:
            default:
                vs.m("unsupported field type.");
                return null;
            case 10:
                F0(2);
                m2e a = i2e.c.a(cls);
                o0e zza = a.zza();
                G0(zza, a, h0eVar);
                a.c(zza);
                return zza;
            case 11:
                return m1();
            case 12:
                F0(0);
                return Integer.valueOf(dccVar.G());
            case 13:
                F0(0);
                return Integer.valueOf(dccVar.H());
            case 14:
                F0(5);
                return Integer.valueOf(dccVar.I());
            case 15:
                F0(1);
                return Long.valueOf(dccVar.J());
            case 16:
                F0(0);
                return Integer.valueOf(dccVar.K());
            case 17:
                F0(0);
                return Long.valueOf(dccVar.L());
        }
    }

    public void J(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((c99) tz5Var).add(Float.valueOf(xb1Var.r()));
                    if (!xb1Var.c()) {
                        B = xb1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw q16.b();
        }
        int C = xb1Var.C();
        if ((C & 3) == 0) {
            int b = xb1Var.b() + C;
            do {
                ((c99) tz5Var).add(Float.valueOf(xb1Var.r()));
            } while (xb1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void J0(int i) {
        if (((dcc) this.e).k() == i) {
            return;
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public void K(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    list.add(Float.valueOf(cl1Var.r()));
                    if (!cl1Var.c()) {
                        B = cl1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw p16.b();
        }
        int r0 = cl1Var.r0();
        if ((r0 & 3) == 0) {
            int b = cl1Var.b() + r0;
            do {
                list.add(Float.valueOf(cl1Var.r()));
            } while (cl1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void L(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Integer.valueOf(xb1Var.s()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Integer.valueOf(xb1Var.s()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void M(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Integer.valueOf(xb1Var.s()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Integer.valueOf(xb1Var.s()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void M0(int i) {
        if (((xb1) this.e).S() == i) {
            return;
        }
        throw w7e.g();
    }

    public void N(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Integer.valueOf(cl1Var.r0()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Integer.valueOf(cl1Var.r0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void N0(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Boolean.valueOf(xb1Var.l0()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Boolean.valueOf(xb1Var.l0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void O(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Long.valueOf(xb1Var.t()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Long.valueOf(xb1Var.t()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void O0(v7e v7eVar, o8e o8eVar, g7e g7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                m7e zza = o8eVar.zza();
                V0(zza, o8eVar, g7eVar);
                o8eVar.d(zza);
                ((l8e) v7eVar).add(zza);
                if (!xb1Var.k0() && this.d == 0) {
                    a0 = xb1Var.a0();
                } else {
                    return;
                }
            } while (a0 == i);
            this.d = a0;
            return;
        }
        throw w7e.a();
    }

    public void P(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Long.valueOf(xb1Var.t()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Long.valueOf(xb1Var.t()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void P0(v7e v7eVar, boolean z) {
        String i0;
        int a0;
        xb1 xb1Var = (xb1) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    R0(2);
                    i0 = xb1Var.j0();
                } else {
                    R0(2);
                    i0 = xb1Var.i0();
                }
                ((l8e) v7eVar).add(i0);
                if (xb1Var.k0()) {
                    return;
                }
                a0 = xb1Var.a0();
            } while (a0 == this.b);
            this.d = a0;
            return;
        }
        throw w7e.a();
    }

    public void Q(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Long.valueOf(cl1Var.s0()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Long.valueOf(cl1Var.s0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public int Q0() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = ((dcc) this.e).r();
            this.b = i;
        }
        if (i != 0 && i != this.c) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public void R(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((a99) sz5Var).add(Integer.valueOf(xb1Var.v()));
                    if (!xb1Var.c()) {
                        B = xb1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw o16.b();
        }
        int C = xb1Var.C();
        if ((C & 3) == 0) {
            int b = xb1Var.b() + C;
            do {
                ((a99) sz5Var).add(Integer.valueOf(xb1Var.v()));
            } while (xb1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void R0(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        throw w7e.a();
    }

    public void S(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((c99) tz5Var).add(Integer.valueOf(xb1Var.v()));
                    if (!xb1Var.c()) {
                        B = xb1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw q16.b();
        }
        int C = xb1Var.C();
        if ((C & 3) == 0) {
            int b = xb1Var.b() + C;
            do {
                ((c99) tz5Var).add(Integer.valueOf(xb1Var.v()));
            } while (xb1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void S0(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        if ((this.b & 7) == 2) {
            do {
                ((l8e) v7eVar).add(k1());
                if (xb1Var.k0()) {
                    return;
                }
                a0 = xb1Var.a0();
            } while (a0 == this.b);
            this.d = a0;
            return;
        }
        throw w7e.a();
    }

    public void T(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    list.add(Integer.valueOf(cl1Var.p0()));
                    if (!cl1Var.c()) {
                        B = cl1Var.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw p16.b();
        }
        int r0 = cl1Var.r0();
        if ((r0 & 3) == 0) {
            int b = cl1Var.b() + r0;
            do {
                list.add(Integer.valueOf(cl1Var.p0()));
            } while (cl1Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void T0(v7e v7eVar, o8e o8eVar, g7e g7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                m7e zza = o8eVar.zza();
                X0(zza, o8eVar, g7eVar);
                o8eVar.d(zza);
                ((l8e) v7eVar).add(zza);
                if (!xb1Var.k0() && this.d == 0) {
                    a0 = xb1Var.a0();
                } else {
                    return;
                }
            } while (a0 == i);
            this.d = a0;
            return;
        }
        throw w7e.a();
    }

    public void U(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int C = xb1Var.C();
                if ((C & 7) == 0) {
                    int b = xb1Var.b() + C;
                    do {
                        ((a99) sz5Var).add(Long.valueOf(xb1Var.w()));
                    } while (xb1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Long.valueOf(xb1Var.w()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public int U0() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = ((xb1) this.e).a0();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return i2 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public void V(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int C = xb1Var.C();
                if ((C & 7) == 0) {
                    int b = xb1Var.b() + C;
                    do {
                        ((c99) tz5Var).add(Long.valueOf(xb1Var.w()));
                    } while (xb1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Long.valueOf(xb1Var.w()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void V0(Object obj, o8e o8eVar, g7e g7eVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            o8eVar.i(obj, this, g7eVar);
            if (this.b == this.c) {
                return;
            }
            throw w7e.f();
        } finally {
            this.c = i;
        }
    }

    public void W(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int r0 = cl1Var.r0();
                if ((r0 & 7) == 0) {
                    int b = cl1Var.b() + r0;
                    do {
                        list.add(Long.valueOf(cl1Var.q0()));
                    } while (cl1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw p16.b();
        }
        do {
            list.add(Long.valueOf(cl1Var.q0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void W0(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int b0 = xb1Var.b0();
                if ((b0 & 7) == 0) {
                    int S = xb1Var.S() + b0;
                    do {
                        ((l8e) v7eVar).add(Double.valueOf(xb1Var.I()));
                    } while (xb1Var.S() < S);
                    return;
                }
                throw w7e.f();
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Double.valueOf(xb1Var.I()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void X(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Integer.valueOf(xb1Var.x()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Integer.valueOf(xb1Var.x()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void X0(Object obj, o8e o8eVar, g7e g7eVar) {
        xb1 xb1Var = (xb1) this.e;
        int b0 = xb1Var.b0();
        if (xb1Var.b + 0 < 100) {
            int Q = xb1Var.Q(b0);
            xb1Var.b++;
            o8eVar.i(obj, this, g7eVar);
            xb1Var.T(0);
            xb1Var.b--;
            xb1Var.V(Q);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void Y(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Integer.valueOf(xb1Var.x()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Integer.valueOf(xb1Var.x()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void Y0(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Integer.valueOf(xb1Var.U()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Integer.valueOf(xb1Var.U()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void Z(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Integer.valueOf(cl1Var.x()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Integer.valueOf(cl1Var.x()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void Z0(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((l8e) v7eVar).add(Integer.valueOf(xb1Var.W()));
                    if (!xb1Var.k0()) {
                        a0 = xb1Var.a0();
                    } else {
                        return;
                    }
                } while (a0 == this.b);
                this.d = a0;
                return;
            }
            throw w7e.a();
        }
        int b0 = xb1Var.b0();
        if ((b0 & 3) == 0) {
            int S = xb1Var.S() + b0;
            do {
                ((l8e) v7eVar).add(Integer.valueOf(xb1Var.W()));
            } while (xb1Var.S() < S);
            return;
        }
        throw w7e.f();
    }

    public void a(uz1 uz1Var) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = uz1Var;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 >= 0) {
                Object[] objArr2 = new Object[i5];
                b00.W(0, i3, length, objArr, objArr2);
                b00.W(i4, 0, this.b, (Object[]) this.e, objArr2);
                this.e = objArr2;
                this.b = 0;
                this.c = length;
                this.d = i5 - 1;
                return;
            }
            cy7.e("Max array capacity exceeded");
        }
    }

    public void a0(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Long.valueOf(xb1Var.y()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Long.valueOf(xb1Var.y()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void a1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int b0 = xb1Var.b0();
                if ((b0 & 7) == 0) {
                    int S = xb1Var.S() + b0;
                    do {
                        ((l8e) v7eVar).add(Long.valueOf(xb1Var.c0()));
                    } while (xb1Var.S() < S);
                    return;
                }
                throw w7e.f();
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Long.valueOf(xb1Var.c0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public int b() {
        switch (this.a) {
            case 1:
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    this.b = ((xb1) this.e).B();
                }
                int i2 = this.b;
                if (i2 != 0 && i2 != this.c) {
                    return i2 >>> 3;
                }
                return Integer.MAX_VALUE;
            case 2:
                int i3 = this.d;
                if (i3 != 0) {
                    this.b = i3;
                    this.d = 0;
                } else {
                    this.b = ((cl1) this.e).B();
                }
                int i4 = this.b;
                if (i4 != 0 && i4 != this.c) {
                    return i4 >>> 3;
                }
                return Integer.MAX_VALUE;
            default:
                int i5 = this.d;
                if (i5 != 0) {
                    this.b = i5;
                    this.d = 0;
                } else {
                    this.b = ((xb1) this.e).B();
                }
                int i6 = this.b;
                if (i6 != 0 && i6 != this.c) {
                    return i6 >>> 3;
                }
                return Integer.MAX_VALUE;
        }
    }

    public void b0(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Long.valueOf(xb1Var.y()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Long.valueOf(xb1Var.y()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void b1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((l8e) v7eVar).add(Float.valueOf(xb1Var.P()));
                    if (!xb1Var.k0()) {
                        a0 = xb1Var.a0();
                    } else {
                        return;
                    }
                } while (a0 == this.b);
                this.d = a0;
                return;
            }
            throw w7e.a();
        }
        int b0 = xb1Var.b0();
        if ((b0 & 3) == 0) {
            int S = xb1Var.S() + b0;
            do {
                ((l8e) v7eVar).add(Float.valueOf(xb1Var.P()));
            } while (xb1Var.S() < S);
            return;
        }
        throw w7e.f();
    }

    public int c(int i) {
        return ((re8) this.e).m[this.c + i];
    }

    public void c0(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Long.valueOf(cl1Var.y()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Long.valueOf(cl1Var.y()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void c1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Integer.valueOf(xb1Var.X()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Integer.valueOf(xb1Var.X()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public Object d(int i) {
        return ((re8) this.e).o[this.d + i];
    }

    public void d0(sz5 sz5Var, boolean z) {
        String z2;
        int B;
        xb1 xb1Var = (xb1) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    n0(2);
                    z2 = xb1Var.A();
                } else {
                    n0(2);
                    z2 = xb1Var.z();
                }
                ((a99) sz5Var).add(z2);
                if (xb1Var.c()) {
                    return;
                }
                B = xb1Var.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw o16.b();
    }

    public void d1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Long.valueOf(xb1Var.d0()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Long.valueOf(xb1Var.d0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void e(pw4 pw4Var, i0a i0aVar, y54 y54Var) {
        n0(3);
        g(pw4Var, i0aVar, y54Var);
    }

    public void e0(tz5 tz5Var, boolean z) {
        String z2;
        int B;
        xb1 xb1Var = (xb1) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    n0(2);
                    z2 = xb1Var.A();
                } else {
                    n0(2);
                    z2 = xb1Var.z();
                }
                ((c99) tz5Var).add(z2);
                if (xb1Var.c()) {
                    return;
                }
                B = xb1Var.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw q16.b();
    }

    public void e1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    ((l8e) v7eVar).add(Integer.valueOf(xb1Var.Y()));
                    if (!xb1Var.k0()) {
                        a0 = xb1Var.a0();
                    } else {
                        return;
                    }
                } while (a0 == this.b);
                this.d = a0;
                return;
            }
            throw w7e.a();
        }
        int b0 = xb1Var.b0();
        if ((b0 & 3) == 0) {
            int S = xb1Var.S() + b0;
            do {
                ((l8e) v7eVar).add(Integer.valueOf(xb1Var.Y()));
            } while (xb1Var.S() < S);
            return;
        }
        throw w7e.f();
    }

    public void f(Object obj, h0a h0aVar, x54 x54Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            h0aVar.i(obj, this, x54Var);
            if (this.b == this.c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    public void f0(List list, boolean z) {
        int B;
        int B2;
        cl1 cl1Var = (cl1) this.e;
        if ((this.b & 7) == 2) {
            if ((list instanceof qk6) && !z) {
                qk6 qk6Var = (qk6) list;
                do {
                    qk6Var.q(p());
                    if (!cl1Var.c()) {
                        B2 = cl1Var.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            }
            do {
                String str = "";
                if (z) {
                    n0(2);
                    byte[] bArr = cl1Var.e;
                    int r0 = cl1Var.r0();
                    int i = cl1Var.D;
                    int i2 = cl1Var.f;
                    if (r0 <= i2 - i && r0 > 0) {
                        cl1Var.D = i + r0;
                    } else if (r0 != 0) {
                        i = 0;
                        if (r0 <= i2) {
                            cl1Var.v0(r0);
                            cl1Var.D = r0;
                        } else {
                            bArr = cl1Var.m0(r0);
                        }
                    }
                    str = v1d.a.g(bArr, i, r0);
                } else {
                    n0(2);
                    byte[] bArr2 = cl1Var.e;
                    int r02 = cl1Var.r0();
                    if (r02 > 0) {
                        int i3 = cl1Var.f;
                        int i4 = cl1Var.D;
                        if (r02 <= i3 - i4) {
                            str = new String(bArr2, i4, r02, vz5.a);
                            cl1Var.D += r02;
                        }
                    }
                    if (r02 != 0) {
                        if (r02 <= cl1Var.f) {
                            cl1Var.v0(r02);
                            str = new String(bArr2, cl1Var.D, r02, vz5.a);
                            cl1Var.D += r02;
                        } else {
                            str = new String(cl1Var.m0(r02), vz5.a);
                        }
                    }
                }
                list.add(str);
                if (cl1Var.c()) {
                    return;
                }
                B = cl1Var.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw p16.b();
    }

    public void f1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int b0 = xb1Var.b0();
                if ((b0 & 7) == 0) {
                    int S = xb1Var.S() + b0;
                    do {
                        ((l8e) v7eVar).add(Long.valueOf(xb1Var.e0()));
                    } while (xb1Var.S() < S);
                    return;
                }
                throw w7e.f();
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Long.valueOf(xb1Var.e0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void g(Object obj, i0a i0aVar, y54 y54Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            i0aVar.e(obj, this, y54Var);
            if (this.b == this.c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    public void g0(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Integer.valueOf(xb1Var.C()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Integer.valueOf(xb1Var.C()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void g1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Integer.valueOf(xb1Var.Z()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Integer.valueOf(xb1Var.Z()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void h(Object obj, j0a j0aVar, z54 z54Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            j0aVar.g(obj, this, z54Var);
            if (this.b == this.c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    public void h0(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Integer.valueOf(xb1Var.C()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Integer.valueOf(xb1Var.C()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void h1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Long.valueOf(xb1Var.f0()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Long.valueOf(xb1Var.f0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void i(Object obj, h0a h0aVar, x54 x54Var) {
        xb1 xb1Var = (xb1) this.e;
        int C = xb1Var.C();
        if (xb1Var.b < 100) {
            int j = xb1Var.j(C);
            xb1Var.b++;
            h0aVar.i(obj, this, x54Var);
            xb1Var.a(0);
            xb1Var.b--;
            xb1Var.h(j);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void i0(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Integer.valueOf(cl1Var.r0()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Integer.valueOf(cl1Var.r0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void i1(v7e v7eVar) {
        P0(v7eVar, false);
    }

    public void j(Object obj, i0a i0aVar, y54 y54Var) {
        cl1 cl1Var = (cl1) this.e;
        int r0 = cl1Var.r0();
        if (cl1Var.b < 100) {
            int j = cl1Var.j(r0);
            cl1Var.b++;
            i0aVar.e(obj, this, y54Var);
            cl1Var.a(0);
            cl1Var.b--;
            cl1Var.h(j);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void j0(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Long.valueOf(xb1Var.D()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Long.valueOf(xb1Var.D()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void j1(v7e v7eVar) {
        P0(v7eVar, true);
    }

    public void k(Object obj, j0a j0aVar, z54 z54Var) {
        xb1 xb1Var = (xb1) this.e;
        int C = xb1Var.C();
        if (xb1Var.b < 100) {
            int j = xb1Var.j(C);
            xb1Var.b++;
            j0aVar.g(obj, this, z54Var);
            xb1Var.a(0);
            xb1Var.b--;
            xb1Var.h(j);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void k0(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Long.valueOf(xb1Var.D()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Long.valueOf(xb1Var.D()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public s6e k1() {
        R0(2);
        return ((xb1) this.e).h0();
    }

    public void l(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Boolean.valueOf(xb1Var.k()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Boolean.valueOf(xb1Var.k()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void l0(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Long.valueOf(cl1Var.s0()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Long.valueOf(cl1Var.s0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void l1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Integer.valueOf(xb1Var.b0()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Integer.valueOf(xb1Var.b0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public void m(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Boolean.valueOf(xb1Var.k()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Boolean.valueOf(xb1Var.k()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void m0(int i) {
        switch (this.a) {
            case 1:
                if (((xb1) this.e).b() == i) {
                    return;
                }
                throw o16.e();
            case 2:
                if (((cl1) this.e).b() == i) {
                    return;
                }
                throw p16.e();
            default:
                if (((xb1) this.e).b() == i) {
                    return;
                }
                throw q16.e();
        }
    }

    public szd m1() {
        F0(2);
        return ((dcc) this.e).E();
    }

    public void n(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Boolean.valueOf(cl1Var.k()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Boolean.valueOf(cl1Var.k()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void n0(int i) {
        switch (this.a) {
            case 1:
                if ((this.b & 7) == i) {
                    return;
                }
                throw o16.b();
            case 2:
                if ((this.b & 7) == i) {
                    return;
                }
                throw p16.b();
            default:
                if ((this.b & 7) == i) {
                    return;
                }
                throw q16.b();
        }
    }

    public void n1(v7e v7eVar) {
        int a0;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int S = xb1Var.S() + xb1Var.b0();
                do {
                    ((l8e) v7eVar).add(Long.valueOf(xb1Var.g0()));
                } while (xb1Var.S() < S);
                M0(S);
                return;
            }
            throw w7e.a();
        }
        do {
            ((l8e) v7eVar).add(Long.valueOf(xb1Var.g0()));
            if (xb1Var.k0()) {
                return;
            }
            a0 = xb1Var.a0();
        } while (a0 == this.b);
        this.d = a0;
    }

    public a31 o() {
        n0(2);
        return ((xb1) this.e).l();
    }

    public boolean o0() {
        int i;
        int i2;
        switch (this.a) {
            case 2:
                cl1 cl1Var = (cl1) this.e;
                if (cl1Var.c() || (i = this.b) == this.c) {
                    return false;
                }
                return cl1Var.F(i);
            default:
                xb1 xb1Var = (xb1) this.e;
                if (xb1Var.c() || (i2 = this.b) == this.c) {
                    return false;
                }
                return xb1Var.F(i2);
        }
    }

    public void o1(f1e f1eVar) {
        int r;
        dcc dccVar = (dcc) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int G = dccVar.G();
                L0(G);
                int k = dccVar.k() + G;
                do {
                    f1eVar.add(Double.valueOf(dccVar.u()));
                } while (dccVar.k() < k);
                return;
            }
            hfd.c();
            return;
        }
        do {
            f1eVar.add(Double.valueOf(dccVar.u()));
            if (!dccVar.j()) {
                r = dccVar.r();
            } else {
                return;
            }
        } while (r == this.b);
        this.d = r;
    }

    public b31 p() {
        n0(2);
        cl1 cl1Var = (cl1) this.e;
        byte[] bArr = cl1Var.e;
        int r0 = cl1Var.r0();
        int i = cl1Var.f;
        int i2 = cl1Var.D;
        if (r0 <= i - i2 && r0 > 0) {
            b31 c = b31.c(bArr, i2, r0);
            cl1Var.D += r0;
            return c;
        } else if (r0 == 0) {
            return b31.c;
        } else {
            byte[] n0 = cl1Var.n0(r0);
            if (n0 != null) {
                return b31.c(n0, 0, n0.length);
            }
            int i3 = cl1Var.D;
            int i4 = cl1Var.f;
            int i5 = i4 - i3;
            cl1Var.F += i4;
            cl1Var.D = 0;
            cl1Var.f = 0;
            ArrayList o0 = cl1Var.o0(r0 - i5);
            byte[] bArr2 = new byte[r0];
            System.arraycopy(bArr, i3, bArr2, 0, i5);
            int size = o0.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = o0.get(i6);
                i6++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, i5, bArr3.length);
                i5 += bArr3.length;
            }
            b31 b31Var = b31.c;
            return new b31(bArr2);
        }
    }

    public void p0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof o1e;
        int i2 = this.b;
        if (z) {
            o1e o1eVar = (o1e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        o1eVar.d(dccVar.x());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                o1eVar.d(dccVar.x());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Long.valueOf(dccVar.x()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Long.valueOf(dccVar.x()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void p1(f1e f1eVar) {
        int r;
        dcc dccVar = (dcc) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    f1eVar.add(Float.valueOf(dccVar.v()));
                    if (!dccVar.j()) {
                        r = dccVar.r();
                    } else {
                        return;
                    }
                } while (r == this.b);
                this.d = r;
                return;
            }
            hfd.c();
            return;
        }
        int G = dccVar.G();
        K0(G);
        int k = dccVar.k() + G;
        do {
            f1eVar.add(Float.valueOf(dccVar.v()));
        } while (dccVar.k() < k);
    }

    public c31 q() {
        n0(2);
        return ((xb1) this.e).m();
    }

    public void q0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof q0e;
        int i2 = this.b;
        if (z) {
            q0e q0eVar = (q0e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        q0eVar.zzh(dccVar.y());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                q0eVar.zzh(dccVar.y());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Integer.valueOf(dccVar.y()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Integer.valueOf(dccVar.y()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void q1(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof o1e;
        int i2 = this.b;
        if (z) {
            o1e o1eVar = (o1e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        o1eVar.d(dccVar.w());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                o1eVar.d(dccVar.w());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Long.valueOf(dccVar.w()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Long.valueOf(dccVar.w()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void r(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        if ((this.b & 7) == 2) {
            do {
                ((a99) sz5Var).add(o());
                if (xb1Var.c()) {
                    return;
                }
                B = xb1Var.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw o16.b();
    }

    public void r0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof o1e;
        int i2 = this.b;
        if (z) {
            o1e o1eVar = (o1e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int G = dccVar.G();
                    L0(G);
                    int k = dccVar.k() + G;
                    do {
                        o1eVar.d(dccVar.z());
                    } while (dccVar.k() < k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                o1eVar.d(dccVar.z());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int G2 = dccVar.G();
                    L0(G2);
                    int k2 = dccVar.k() + G2;
                    do {
                        f1eVar.add(Long.valueOf(dccVar.z()));
                    } while (dccVar.k() < k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Long.valueOf(dccVar.z()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void s(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        if ((this.b & 7) == 2) {
            do {
                ((c99) tz5Var).add(q());
                if (xb1Var.c()) {
                    return;
                }
                B = xb1Var.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw q16.b();
    }

    public void s0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof q0e;
        int i2 = this.b;
        if (z) {
            q0e q0eVar = (q0e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        q0eVar.zzh(dccVar.A());
                        if (!dccVar.j()) {
                            i = dccVar.r();
                        } else {
                            return;
                        }
                    } while (i == this.b);
                } else {
                    hfd.c();
                    return;
                }
            } else {
                int G = dccVar.G();
                K0(G);
                int k = dccVar.k() + G;
                do {
                    q0eVar.zzh(dccVar.A());
                } while (dccVar.k() < k);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 == 5) {
                    do {
                        f1eVar.add(Integer.valueOf(dccVar.A()));
                        if (!dccVar.j()) {
                            r = dccVar.r();
                        } else {
                            return;
                        }
                    } while (r == this.b);
                    i = r;
                } else {
                    hfd.c();
                    return;
                }
            } else {
                int G2 = dccVar.G();
                K0(G2);
                int k2 = dccVar.k() + G2;
                do {
                    f1eVar.add(Integer.valueOf(dccVar.A()));
                } while (dccVar.k() < k2);
                return;
            }
        }
        this.d = i;
    }

    public void t(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        if ((this.b & 7) == 2) {
            do {
                list.add(p());
                if (cl1Var.c()) {
                    return;
                }
                B = cl1Var.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw p16.b();
    }

    public void t0(f1e f1eVar) {
        int r;
        dcc dccVar = (dcc) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int k = dccVar.k() + dccVar.G();
                do {
                    f1eVar.add(Boolean.valueOf(dccVar.B()));
                } while (dccVar.k() < k);
                J0(k);
                return;
            }
            hfd.c();
            return;
        }
        do {
            f1eVar.add(Boolean.valueOf(dccVar.B()));
            if (!dccVar.j()) {
                r = dccVar.r();
            } else {
                return;
            }
        } while (r == this.b);
        this.d = r;
    }

    public void u(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int C = xb1Var.C();
                if ((C & 7) == 0) {
                    int b = xb1Var.b() + C;
                    do {
                        ((a99) sz5Var).add(Double.valueOf(xb1Var.n()));
                    } while (xb1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Double.valueOf(xb1Var.n()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void u0(f1e f1eVar, boolean z) {
        String C;
        int r;
        dcc dccVar = (dcc) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    F0(2);
                    C = dccVar.D();
                } else {
                    F0(2);
                    C = dccVar.C();
                }
                f1eVar.add(C);
                if (dccVar.j()) {
                    return;
                }
                r = dccVar.r();
            } while (r == this.b);
            this.d = r;
            return;
        }
        hfd.c();
    }

    public void v(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int C = xb1Var.C();
                if ((C & 7) == 0) {
                    int b = xb1Var.b() + C;
                    do {
                        ((c99) tz5Var).add(Double.valueOf(xb1Var.n()));
                    } while (xb1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Double.valueOf(xb1Var.n()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void v0(f1e f1eVar, m2e m2eVar, h0e h0eVar) {
        int r;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                o0e zza = m2eVar.zza();
                G0(zza, m2eVar, h0eVar);
                m2eVar.c(zza);
                f1eVar.add(zza);
                dcc dccVar = (dcc) this.e;
                if (!dccVar.j() && this.d == 0) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == i);
            this.d = r;
            return;
        }
        hfd.c();
    }

    public void w(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int r0 = cl1Var.r0();
                if ((r0 & 7) == 0) {
                    int b = cl1Var.b() + r0;
                    do {
                        list.add(Double.valueOf(cl1Var.n()));
                    } while (cl1Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw p16.b();
        }
        do {
            list.add(Double.valueOf(cl1Var.n()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void w0(f1e f1eVar, m2e m2eVar, h0e h0eVar) {
        int r;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                o0e zza = m2eVar.zza();
                H0(zza, m2eVar, h0eVar);
                m2eVar.c(zza);
                f1eVar.add(zza);
                dcc dccVar = (dcc) this.e;
                if (!dccVar.j() && this.d == 0) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == i);
            this.d = r;
            return;
        }
        hfd.c();
    }

    public void x(sz5 sz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((a99) sz5Var).add(Integer.valueOf(xb1Var.o()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw o16.b();
        }
        do {
            ((a99) sz5Var).add(Integer.valueOf(xb1Var.o()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void x0(f1e f1eVar) {
        int r;
        if ((this.b & 7) == 2) {
            do {
                f1eVar.add(m1());
                dcc dccVar = (dcc) this.e;
                if (dccVar.j()) {
                    return;
                }
                r = dccVar.r();
            } while (r == this.b);
            this.d = r;
            return;
        }
        hfd.c();
    }

    public void y(tz5 tz5Var) {
        int B;
        xb1 xb1Var = (xb1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = xb1Var.b() + xb1Var.C();
                do {
                    ((c99) tz5Var).add(Integer.valueOf(xb1Var.o()));
                } while (xb1Var.b() < b);
                m0(b);
                return;
            }
            throw q16.b();
        }
        do {
            ((c99) tz5Var).add(Integer.valueOf(xb1Var.o()));
            if (xb1Var.c()) {
                return;
            }
            B = xb1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void y0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof q0e;
        int i2 = this.b;
        if (z) {
            q0e q0eVar = (q0e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        q0eVar.zzh(dccVar.G());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                q0eVar.zzh(dccVar.G());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Integer.valueOf(dccVar.G()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Integer.valueOf(dccVar.G()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public void z(List list) {
        int B;
        cl1 cl1Var = (cl1) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int b = cl1Var.b() + cl1Var.r0();
                do {
                    list.add(Integer.valueOf(cl1Var.r0()));
                } while (cl1Var.b() < b);
                m0(b);
                return;
            }
            throw p16.b();
        }
        do {
            list.add(Integer.valueOf(cl1Var.r0()));
            if (cl1Var.c()) {
                return;
            }
            B = cl1Var.B();
        } while (B == this.b);
        this.d = B;
    }

    public void z0(f1e f1eVar) {
        int r;
        int i;
        dcc dccVar = (dcc) this.e;
        boolean z = f1eVar instanceof q0e;
        int i2 = this.b;
        if (z) {
            q0e q0eVar = (q0e) f1eVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int k = dccVar.k() + dccVar.G();
                    do {
                        q0eVar.zzh(dccVar.H());
                    } while (dccVar.k() < k);
                    J0(k);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                q0eVar.zzh(dccVar.H());
                if (!dccVar.j()) {
                    i = dccVar.r();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int k2 = dccVar.k() + dccVar.G();
                    do {
                        f1eVar.add(Integer.valueOf(dccVar.H()));
                    } while (dccVar.k() < k2);
                    J0(k2);
                    return;
                }
                hfd.c();
                return;
            }
            do {
                f1eVar.add(Integer.valueOf(dccVar.H()));
                if (!dccVar.j()) {
                    r = dccVar.r();
                } else {
                    return;
                }
            } while (r == this.b);
            i = r;
        }
        this.d = i;
    }

    public vh1(dcc dccVar) {
        this.a = 5;
        this.d = 0;
        this.e = dccVar;
        dccVar.c = this;
    }

    public vh1(xb1 xb1Var) {
        this.a = 1;
        this.d = 0;
        Charset charset = uz5.a;
        this.e = xb1Var;
        xb1Var.c = this;
    }

    public vh1(xb1 xb1Var, byte b) {
        this.a = 3;
        this.d = 0;
        Charset charset = wz5.a;
        this.e = xb1Var;
        xb1Var.c = this;
    }

    public vh1(cl1 cl1Var) {
        this.a = 2;
        this.d = 0;
        Charset charset = vz5.a;
        this.e = cl1Var;
        cl1Var.c = this;
    }

    public /* synthetic */ vh1() {
        this.a = 0;
    }

    public vh1(re8 re8Var) {
        this.a = 4;
        this.e = re8Var;
    }
}
