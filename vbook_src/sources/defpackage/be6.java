package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be6  reason: default package */
/* loaded from: classes.dex */
public final class be6 implements ew1 {
    public final tv7 C;
    public final wd6 D;
    public final td6 E;
    public final tv7 F;
    public final q6b G;
    public final tv7 H;
    public final gw7 I;
    public int J;
    public int K;
    public final String L;
    public final od6 a;
    public px1 b;
    public r6b c;
    public int d;
    public int e;
    public final tv7 f;

    public be6(od6 od6Var, r6b r6bVar) {
        this.a = od6Var;
        this.c = r6bVar;
        long[] jArr = tz9.a;
        this.f = new tv7();
        this.C = new tv7();
        this.D = new wd6(this);
        this.E = new td6(this);
        this.F = new tv7();
        this.G = new q6b();
        this.H = new tv7();
        this.I = new gw7(new Object[16], 0);
        this.L = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void b(be6 be6Var, Object obj) {
        od6 od6Var = be6Var.a;
        be6Var.i();
        od6 od6Var2 = (od6) be6Var.F.l(obj);
        if (od6Var2 != null) {
            if (be6Var.K <= 0) {
                lv5.c("No pre-composed items to dispose");
            }
            int i = ((gw7) ((iv7) od6Var.p()).b).i(od6Var2);
            if (i < ((gw7) ((iv7) od6Var.p()).b).c - be6Var.K) {
                lv5.c("Item is not in pre-composed item range");
            }
            be6Var.J++;
            be6Var.K--;
            ud6 ud6Var = (ud6) be6Var.f.g(od6Var2);
            if (ud6Var != null) {
                e(ud6Var);
            }
            int i2 = (((gw7) ((iv7) od6Var.p()).b).c - be6Var.K) - be6Var.J;
            be6Var.k(i, i2);
            be6Var.g(i2);
        }
        if (be6Var.I.h(obj)) {
            od6.a0(od6Var, true, 6);
        }
    }

    public static void e(ud6 ud6Var) {
        uv7 uv7Var;
        qo8 qo8Var = ud6Var.f;
        if (qo8Var != null) {
            qo8Var.h.set(so8.b);
            zm9 zm9Var = qo8Var.k;
            if (((uv7) zm9Var.g).h()) {
                uv7Var = (uv7) zm9Var.g;
                uv7 uv7Var2 = uz9.a;
                zm9Var.g = new uv7();
                ((gw7) zm9Var.c).g();
            } else {
                uv7Var = null;
            }
            zm9Var.b();
            ux1 ux1Var = qo8Var.a;
            ux1Var.M = null;
            if (uv7Var != null) {
                ux1Var.Q.i = uv7Var;
                ux1Var.S = 2;
            }
            ud6Var.f = null;
            ux1 ux1Var2 = ud6Var.c;
            if (ux1Var2 != null) {
                ux1Var2.a();
            }
            ud6Var.c = null;
        }
    }

    @Override // defpackage.ew1
    public final void a() {
        ux1 ux1Var;
        od6 od6Var = this.a;
        od6Var.N = true;
        tv7 tv7Var = this.f;
        Object[] objArr = tv7Var.c;
        long[] jArr = tv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (ux1Var = ((ud6) objArr[(i << 3) + i3]).c) != null) {
                            ux1Var.a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        od6Var.U();
        od6Var.N = false;
        tv7Var.a();
        this.C.a();
        this.K = 0;
        this.J = 0;
        this.F.a();
        i();
    }

    @Override // defpackage.ew1
    public final void c() {
        j(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [rka, java.lang.Object] */
    public final void d(ud6 ud6Var, boolean z) {
        xt4 xt4Var;
        qo8 qo8Var = ud6Var.f;
        if (qo8Var != 0) {
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            try {
                od6 od6Var = this.a;
                od6Var.N = true;
                if (z) {
                    while (!qo8Var.c()) {
                        qo8Var.e(new Object());
                    }
                }
                qo8Var.a();
                ud6Var.f = null;
                od6Var.N = false;
            } finally {
                pae.n(f, h, xt4Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m6b, java.lang.Object] */
    public final m6b f(Object obj) {
        if (!this.a.J()) {
            return new Object();
        }
        return new ae6(this, obj);
    }

    public final void g(int i) {
        boolean z;
        xt4 xt4Var;
        boolean z2 = false;
        this.J = 0;
        List p = this.a.p();
        iv7 iv7Var = (iv7) p;
        int i2 = (((gw7) iv7Var.b).c - this.K) - 1;
        if (i <= i2) {
            this.G.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.f.g((od6) iv7Var.get(i3));
                    g.getClass();
                    ((lv7) this.G.b).a(((ud6) g).a);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.c.c(this.G);
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            z = false;
            while (i2 >= i) {
                try {
                    od6 od6Var = (od6) ((iv7) p).get(i2);
                    Object g2 = this.f.g(od6Var);
                    g2.getClass();
                    ud6 ud6Var = (ud6) g2;
                    Object obj = ud6Var.a;
                    if (((lv7) this.G.b).c(obj)) {
                        this.J++;
                        if (((Boolean) ud6Var.g.getValue()).booleanValue()) {
                            sd6 sd6Var = od6Var.d0;
                            a37 a37Var = sd6Var.p;
                            md6 md6Var = md6.c;
                            a37Var.H = md6Var;
                            xy6 xy6Var = sd6Var.q;
                            if (xy6Var != null) {
                                xy6Var.F = md6Var;
                            }
                            m(ud6Var, false);
                            if (ud6Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        od6 od6Var2 = this.a;
                        od6Var2.N = true;
                        this.f.l(od6Var);
                        ux1 ux1Var = ud6Var.c;
                        if (ux1Var != null) {
                            ux1Var.a();
                        }
                        this.a.V(i2, 1);
                        od6Var2.N = false;
                    }
                    this.C.l(obj);
                    i2--;
                } catch (Throwable th) {
                    pae.n(f, h, xt4Var);
                    throw th;
                }
            }
            pae.n(f, h, xt4Var);
        } else {
            z = false;
        }
        if (z) {
            synchronized (dra.c) {
                uv7 uv7Var = dra.j.h;
                if (uv7Var != null) {
                    if (uv7Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                dra.a();
            }
        }
        i();
    }

    @Override // defpackage.ew1
    public final void h() {
        j(false);
    }

    public final void i() {
        int i = ((gw7) ((iv7) this.a.p()).b).c;
        int i2 = this.f.e;
        if (i2 != i) {
            lv5.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.J;
        int i4 = this.K;
        if ((i - i3) - i4 < 0) {
            StringBuilder r = hl5.r(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            r.append(i4);
            lv5.a(r.toString());
        }
        int i5 = this.F.e;
        int i6 = this.K;
        if (i5 == i6) {
            return;
        }
        lv5.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void j(boolean z) {
        xt4 xt4Var;
        this.K = 0;
        this.F.a();
        List p = this.a.p();
        int i = ((gw7) ((iv7) p).b).c;
        if (this.J != i) {
            this.J = i;
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    od6 od6Var = (od6) ((iv7) p).get(i2);
                    ud6 ud6Var = (ud6) this.f.g(od6Var);
                    if (ud6Var != null && ((Boolean) ud6Var.g.getValue()).booleanValue()) {
                        sd6 sd6Var = od6Var.d0;
                        a37 a37Var = sd6Var.p;
                        md6 md6Var = md6.c;
                        a37Var.H = md6Var;
                        xy6 xy6Var = sd6Var.q;
                        if (xy6Var != null) {
                            xy6Var.F = md6Var;
                        }
                        m(ud6Var, z);
                        ud6Var.a = k6b.a;
                    }
                } catch (Throwable th) {
                    pae.n(f, h, xt4Var);
                    throw th;
                }
            }
            pae.n(f, h, xt4Var);
            this.C.a();
        }
        i();
    }

    public final void k(int i, int i2) {
        od6 od6Var = this.a;
        od6Var.N = true;
        od6Var.N(i, i2, 1);
        od6Var.N = false;
    }

    public final void l(Object obj, lu4 lu4Var, boolean z) {
        od6 od6Var = this.a;
        if (od6Var.J()) {
            i();
            if (!this.C.c(obj)) {
                this.H.l(obj);
                tv7 tv7Var = this.F;
                Object g = tv7Var.g(obj);
                od6 od6Var2 = g;
                if (g == null) {
                    od6 o = o(obj);
                    if (o != null) {
                        k(((gw7) ((iv7) od6Var.p()).b).i(o), ((gw7) ((iv7) od6Var.p()).b).c);
                        this.K++;
                    } else {
                        int i = ((gw7) ((iv7) od6Var.p()).b).c;
                        od6 od6Var3 = new od6(2);
                        od6Var.N = true;
                        od6Var.B(i, od6Var3);
                        od6Var.N = false;
                        this.K++;
                        o = od6Var3;
                    }
                    tv7Var.n(obj, o);
                    od6Var2 = o;
                }
                n(od6Var2, obj, z, lu4Var);
            }
        }
    }

    public final void m(ud6 ud6Var, boolean z) {
        ux1 ux1Var;
        if (!z && ud6Var.h) {
            ud6Var.g.setValue(Boolean.FALSE);
        } else {
            ud6Var.g = yae.z(Boolean.FALSE);
        }
        if (ud6Var.f != null) {
            e(ud6Var);
        } else if (z) {
            ux1 ux1Var2 = ud6Var.c;
            if (ux1Var2 != null) {
                ux1Var2.p();
            }
        } else {
            lf8 outOfFrameExecutor = ((rg) rd6.a(this.a)).getOutOfFrameExecutor();
            if (outOfFrameExecutor != null) {
                ((rg) outOfFrameExecutor).J(new ik(ud6Var, 16));
            } else if (!ud6Var.h && (ux1Var = ud6Var.c) != null) {
                ux1Var.p();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:44:0x0076, B:47:0x0082, B:56:0x00a9, B:58:0x00bb, B:61:0x00d0, B:63:0x00d4, B:75:0x0118, B:64:0x00e1, B:65:0x00ec, B:67:0x00f0, B:69:0x0105, B:73:0x010f, B:72:0x010a, B:74:0x0115, B:59:0x00be, B:53:0x008e, B:55:0x009c, B:78:0x0122, B:79:0x012d), top: B:82:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:44:0x0076, B:47:0x0082, B:56:0x00a9, B:58:0x00bb, B:61:0x00d0, B:63:0x00d4, B:75:0x0118, B:64:0x00e1, B:65:0x00ec, B:67:0x00f0, B:69:0x0105, B:73:0x010f, B:72:0x010a, B:74:0x0115, B:59:0x00be, B:53:0x008e, B:55:0x009c, B:78:0x0122, B:79:0x012d), top: B:82:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:44:0x0076, B:47:0x0082, B:56:0x00a9, B:58:0x00bb, B:61:0x00d0, B:63:0x00d4, B:75:0x0118, B:64:0x00e1, B:65:0x00ec, B:67:0x00f0, B:69:0x0105, B:73:0x010f, B:72:0x010a, B:74:0x0115, B:59:0x00be, B:53:0x008e, B:55:0x009c, B:78:0x0122, B:79:0x012d), top: B:82:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:44:0x0076, B:47:0x0082, B:56:0x00a9, B:58:0x00bb, B:61:0x00d0, B:63:0x00d4, B:75:0x0118, B:64:0x00e1, B:65:0x00ec, B:67:0x00f0, B:69:0x0105, B:73:0x010f, B:72:0x010a, B:74:0x0115, B:59:0x00be, B:53:0x008e, B:55:0x009c, B:78:0x0122, B:79:0x012d), top: B:82:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ud6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.od6 r9, java.lang.Object r10, boolean r11, defpackage.lu4 r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be6.n(od6, java.lang.Object, boolean, lu4):void");
    }

    public final od6 o(Object obj) {
        tv7 tv7Var;
        int i;
        if (this.J != 0) {
            iv7 iv7Var = (iv7) this.a.p();
            int i2 = ((gw7) iv7Var.b).c - this.K;
            int i3 = i2 - this.J;
            int i4 = i2 - 1;
            int i5 = i4;
            while (true) {
                tv7Var = this.f;
                if (i5 >= i3) {
                    Object g = tv7Var.g((od6) iv7Var.get(i5));
                    g.getClass();
                    if (c16.i(((ud6) g).a, obj)) {
                        i = i5;
                        break;
                    }
                    i5--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                while (i4 >= i3) {
                    Object g2 = tv7Var.g((od6) iv7Var.get(i4));
                    g2.getClass();
                    ud6 ud6Var = (ud6) g2;
                    Object obj2 = ud6Var.a;
                    if (obj2 != k6b.a && !this.c.h(obj, obj2)) {
                        i4--;
                    } else {
                        ud6Var.a = obj;
                        i5 = i4;
                        i = i5;
                        break;
                    }
                }
                i5 = i4;
            }
            if (i == -1) {
                return null;
            }
            if (i5 != i3) {
                k(i5, i3);
            }
            this.J--;
            od6 od6Var = (od6) iv7Var.get(i3);
            Object g3 = tv7Var.g(od6Var);
            g3.getClass();
            ud6 ud6Var2 = (ud6) g3;
            ud6Var2.g = yae.z(Boolean.TRUE);
            ud6Var2.e = true;
            ud6Var2.d = true;
            return od6Var;
        }
        return null;
    }
}
