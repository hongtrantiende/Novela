package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b0c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0c implements mu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ t2c e;
    public final /* synthetic */ lha f;

    public /* synthetic */ b0c(nq7 nq7Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, t2c t2cVar, lha lhaVar, int i, aw7 aw7Var4) {
        this.E = nq7Var;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
        this.e = t2cVar;
        this.f = lhaVar;
        this.C = i;
        this.D = aw7Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        aw7 aw7Var;
        aw7 aw7Var2;
        aw7 aw7Var3;
        xt4 xt4Var;
        su9 su9Var;
        final aw7 aw7Var4;
        c1c c1cVar;
        np npVar;
        np npVar2;
        final aw7 aw7Var5;
        final int i;
        String str;
        final t2c t2cVar;
        vt4 vt4Var;
        boolean z2;
        boolean z3;
        boolean z4;
        nk0 nk0Var;
        boolean z5;
        boolean h;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        int i3 = 4;
        Object obj4 = this.E;
        switch (i2) {
            case 0:
                qr qrVar = (qr) obj4;
                su0 su0Var = (su0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                long j = su0Var.b;
                if ((intValue & 6) == 0) {
                    if (!rv4Var.f(su0Var)) {
                        i3 = 2;
                    }
                    intValue |= i3;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    final int i4 = x02.i(j);
                    final int h2 = x02.h(j);
                    Object P = rv4Var.P();
                    Object obj5 = ax1.a;
                    if (P == obj5) {
                        P = yae.z(new zy5(0L));
                        rv4Var.o0(P);
                    }
                    final aw7 aw7Var6 = P;
                    Object P2 = rv4Var.P();
                    if (P2 == obj5) {
                        P2 = yte.s(rv4Var);
                        rv4Var.o0(P2);
                    }
                    final m82 m82Var = (m82) P2;
                    Object P3 = rv4Var.P();
                    if (P3 == obj5) {
                        P3 = new c5d();
                        rv4Var.o0(P3);
                    }
                    c5d c5dVar = (c5d) P3;
                    WeakHashMap weakHashMap = yjd.w;
                    rp rpVar = h88.n(rv4Var).c;
                    r13 r13Var = (r13) rv4Var.j(dy1.h);
                    final int i5 = rpVar.e().d;
                    final aw7 aw7Var7 = this.b;
                    final aw7 aw7Var8 = this.c;
                    boolean f = rv4Var.f(aw7Var7) | rv4Var.d(i4) | rv4Var.d(h2) | rv4Var.d(i5) | rv4Var.f(aw7Var8);
                    Object P4 = rv4Var.P();
                    if (!f && P4 != obj5) {
                        aw7Var3 = aw7Var8;
                        xt4Var = P4;
                        aw7Var = aw7Var7;
                        aw7Var2 = aw7Var6;
                    } else {
                        xt4 xt4Var2 = new xt4() { // from class: h0c
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj6) {
                                ((r13) obj6).getClass();
                                float j2 = e1c.j(aw7Var7);
                                aw7 aw7Var9 = aw7Var6;
                                int A = k27.A(j2 * (i4 - ((int) (e1c.i(aw7Var9) >> 32))));
                                int i6 = h2;
                                return new py5((Math.min((i6 - i5) - ((int) (((zy5) aw7Var9.getValue()).a & 4294967295L)), k27.A(((Number) aw7Var8.getValue()).floatValue() * (i6 - ((int) (((zy5) aw7Var9.getValue()).a & 4294967295L))))) & 4294967295L) | (A << 32));
                            }
                        };
                        aw7Var = aw7Var7;
                        aw7Var2 = aw7Var6;
                        aw7Var3 = aw7Var8;
                        rv4Var.o0(xt4Var2);
                        xt4Var = xt4Var2;
                    }
                    kq7 kq7Var = kq7.a;
                    nq7 p = lbe.p(kq7Var, (xt4) xt4Var);
                    Object P5 = rv4Var.P();
                    if (P5 == obj5) {
                        P5 = new g0c(aw7Var2, 1);
                        rv4Var.o0(P5);
                    }
                    nq7 y = zbe.y(pbe.l(p, (xt4) P5), 16.0f);
                    su9 su9Var2 = uu9.a;
                    tza tzaVar = j27.a;
                    aw7 aw7Var9 = aw7Var2;
                    aw7 aw7Var10 = aw7Var3;
                    nq7 a0 = y.a0(new nla(su9Var2, new lea(zl1.b(0.1f, ((h27) rv4Var.j(tzaVar)).a.q), (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(3.0f) & 4294967295L))));
                    aw7 aw7Var11 = this.d;
                    boolean f2 = rv4Var.f(aw7Var11);
                    Object P6 = rv4Var.P();
                    if (f2 || P6 == obj5) {
                        P6 = new g0c(aw7Var11, 2);
                        rv4Var.o0(P6);
                    }
                    nq7 k = axe.k(a0, (xt4) P6);
                    k.getClass();
                    nq7 A = fxe.A(k);
                    Integer valueOf = Integer.valueOf(i4);
                    Integer valueOf2 = Integer.valueOf(h2);
                    boolean h3 = rv4Var.h(c5dVar) | rv4Var.f(aw7Var11) | rv4Var.h(m82Var) | rv4Var.f(aw7Var) | rv4Var.d(i4) | rv4Var.f(aw7Var10) | rv4Var.d(h2);
                    Object P7 = rv4Var.P();
                    if (h3 || P7 == obj5) {
                        su9Var = su9Var2;
                        aw7Var4 = aw7Var9;
                        c1c c1cVar2 = new c1c(c5dVar, aw7Var11, m82Var, i4, aw7Var, aw7Var4, h2, aw7Var10);
                        i4 = i4;
                        rv4Var.o0(c1cVar2);
                        c1cVar = c1cVar2;
                    } else {
                        c1cVar = P7;
                        su9Var = su9Var2;
                        aw7Var4 = aw7Var9;
                    }
                    nq7 c = dab.c(A, valueOf, valueOf2, (PointerInputEventHandler) c1cVar);
                    nk0 nk0Var2 = kh5.a;
                    b37 d = fu0.d(nk0Var2, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, c);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar3 = qw1.f;
                    jce.F(npVar3, rv4Var, d);
                    np npVar4 = qw1.e;
                    jce.F(npVar4, rv4Var, l);
                    Integer valueOf3 = Integer.valueOf(hashCode);
                    np npVar5 = qw1.g;
                    jce.F(npVar5, rv4Var, valueOf3);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var);
                    np npVar6 = qw1.d;
                    jce.F(npVar6, rv4Var, p2);
                    t2c t2cVar2 = this.e;
                    int i6 = i4;
                    aw7 z6 = jsc.z(t2cVar2.G, rv4Var);
                    aw7 z7 = jsc.z(t2cVar2.I, rv4Var);
                    mk0 mk0Var = kh5.G;
                    final aw7 aw7Var12 = aw7Var;
                    rv4Var.e0(1419515645);
                    lha lhaVar = this.f;
                    lhaVar.getClass();
                    nq7 k2 = tte.k(lha.d(lhaVar, kq7Var, lha.c("tts_container", rv4Var), qrVar), su9Var);
                    long j2 = ((h27) rv4Var.j(tzaVar)).a.p;
                    ba5 ba5Var = lre.g;
                    nq7 g = c16.g(tte.k(zbe.y(nmd.v(k2, j2, ba5Var), 3.0f), su9Var), null, 3);
                    rv4Var.q(false);
                    gv9 a = ev9.a(lz.a, mk0Var, rv4Var, 48);
                    su9 su9Var3 = su9Var;
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, g);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar3, rv4Var, a);
                    jce.F(npVar4, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar5, rv4Var, kgVar);
                    jce.F(npVar6, rv4Var, p3);
                    rv4Var.e0(-242679835);
                    aw7 aw7Var13 = this.D;
                    String str2 = ((n1c) aw7Var13.getValue()).a;
                    String str3 = ((n1c) aw7Var13.getValue()).b;
                    String str4 = ((n1c) aw7Var13.getValue()).f;
                    String str5 = ((n1c) aw7Var13.getValue()).e;
                    u22 u22Var = r0f.d;
                    nq7 k3 = tte.k(lha.e(lhaVar, pna.n(kq7Var, 44.0f), lha.c("tts_cover", rv4Var), qrVar), su9Var3);
                    boolean f3 = rv4Var.f(t2cVar2);
                    Object P8 = rv4Var.P();
                    if (!f3 && P8 != obj5) {
                        npVar = npVar4;
                    } else {
                        npVar = npVar4;
                        P8 = new i0c(t2cVar2, 0);
                        rv4Var.o0(P8);
                    }
                    vt4 vt4Var2 = (vt4) P8;
                    boolean f4 = rv4Var.f(aw7Var11) | rv4Var.h(m82Var) | rv4Var.f(aw7Var12) | rv4Var.d(i6) | rv4Var.f(t2cVar2);
                    Object P9 = rv4Var.P();
                    if (f4 || P9 == obj5) {
                        npVar2 = npVar3;
                        aw7Var5 = aw7Var11;
                        i = i6;
                        str = str5;
                        t2cVar = t2cVar2;
                        vt4 vt4Var3 = new vt4() { // from class: j0c
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i7 = r7;
                                pvc pvcVar2 = pvc.a;
                                m82 m82Var2 = m82Var;
                                t2c t2cVar3 = t2cVar;
                                switch (i7) {
                                    case 0:
                                        aw7 aw7Var14 = aw7Var5;
                                        if (((Boolean) aw7Var14.getValue()).booleanValue()) {
                                            z87.v(m82Var2, null, null, new q08(false, i, aw7Var12, aw7Var4, aw7Var14, null), 3);
                                        } else {
                                            t2cVar3.getClass();
                                            fdd.g(t2cVar3, jdd.a(t2cVar3), new n2c(t2cVar3, null, 3));
                                        }
                                        return pvcVar2;
                                    default:
                                        aw7 aw7Var15 = aw7Var5;
                                        if (((Boolean) aw7Var15.getValue()).booleanValue()) {
                                            z87.v(m82Var2, null, null, new q08(false, i, aw7Var12, aw7Var4, aw7Var15, null), 3);
                                        } else {
                                            t2cVar3.getClass();
                                            fdd.g(t2cVar3, jdd.a(t2cVar3), new n2c(t2cVar3, null, 3));
                                        }
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(vt4Var3);
                        vt4Var = vt4Var3;
                    } else {
                        vt4Var = P9;
                        npVar2 = npVar3;
                        i = i6;
                        str = str5;
                        t2cVar = t2cVar2;
                        aw7Var5 = aw7Var11;
                    }
                    nq7 h4 = lbe.h(k3, vt4Var2, (vt4) vt4Var);
                    np npVar7 = npVar;
                    final t2c t2cVar3 = t2cVar;
                    final aw7 aw7Var14 = aw7Var5;
                    final int i7 = i;
                    do5.c(str2, str3, str4, str, u22Var, h4, rv4Var, 24576);
                    s21.x(rv4Var, false, kq7Var, 4.0f, rv4Var);
                    int i8 = this.C;
                    if (i8 == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rte.d(z2, null, zt3.g(null, 3).a(zt3.c()), zt3.i(null, 3).a(zt3.n()), null, jce.E(-1385153603, new mu4() { // from class: k0c
                        @Override // defpackage.mu4
                        public final Object c(Object obj6, Object obj7, Object obj8) {
                            boolean z8;
                            boolean z9;
                            int i9 = r2;
                            pvc pvcVar2 = pvc.a;
                            lh9 lh9Var = ax1.a;
                            dz dzVar = lz.a;
                            kq7 kq7Var2 = kq7.a;
                            t2c t2cVar4 = t2cVar3;
                            switch (i9) {
                                case 0:
                                    rv4 rv4Var2 = (rv4) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((qr) obj6).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (rv4Var2.U(intValue2 & 1, z8)) {
                                        gv9 a2 = ev9.a(dzVar, kh5.G, rv4Var2, 48);
                                        int hashCode3 = Long.hashCode(rv4Var2.T);
                                        xt8 l3 = rv4Var2.l();
                                        nq7 p4 = lye.p(rv4Var2, kq7Var2);
                                        rw1.k.getClass();
                                        zx1 zx1Var2 = qw1.b;
                                        rv4Var2.i0();
                                        if (rv4Var2.S) {
                                            rv4Var2.k(zx1Var2);
                                        } else {
                                            rv4Var2.r0();
                                        }
                                        jce.F(qw1.f, rv4Var2, a2);
                                        jce.F(qw1.e, rv4Var2, l3);
                                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode3));
                                        jce.C(qw1.h, rv4Var2);
                                        jce.F(qw1.d, rv4Var2, p4);
                                        ar5 c2 = rp5.c((wk3) jk3.Y.getValue(), rv4Var2, 0);
                                        long j3 = ((h27) rv4Var2.j(j27.a)).a.q;
                                        nq7 k4 = tte.k(pna.n(kq7Var2, 36.0f), uu9.a);
                                        boolean f5 = rv4Var2.f(t2cVar4);
                                        Object P10 = rv4Var2.P();
                                        if (f5 || P10 == lh9Var) {
                                            P10 = new i0c(t2cVar4, 18);
                                            rv4Var2.o0(P10);
                                        }
                                        nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P10, k4, null, false), 4.0f), j3, rv4Var2, 48, 0);
                                        rs8.v(kq7Var2, 2.0f, rv4Var2, true);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var3 = (rv4) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((qr) obj6).getClass();
                                    if ((intValue3 & 17) != 16) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (rv4Var3.U(intValue3 & 1, z9)) {
                                        gv9 a3 = ev9.a(dzVar, kh5.G, rv4Var3, 48);
                                        int hashCode4 = Long.hashCode(rv4Var3.T);
                                        xt8 l4 = rv4Var3.l();
                                        nq7 p5 = lye.p(rv4Var3, kq7Var2);
                                        rw1.k.getClass();
                                        zx1 zx1Var3 = qw1.b;
                                        rv4Var3.i0();
                                        if (rv4Var3.S) {
                                            rv4Var3.k(zx1Var3);
                                        } else {
                                            rv4Var3.r0();
                                        }
                                        jce.F(qw1.f, rv4Var3, a3);
                                        jce.F(qw1.e, rv4Var3, l4);
                                        jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode4));
                                        jce.C(qw1.h, rv4Var3);
                                        jce.F(qw1.d, rv4Var3, p5);
                                        xbe.i(rv4Var3, pna.s(kq7Var2, 2.0f));
                                        ar5 c3 = rp5.c((wk3) jk3.X.getValue(), rv4Var3, 0);
                                        long j4 = ((h27) rv4Var3.j(j27.a)).a.q;
                                        nq7 k5 = tte.k(pna.n(kq7Var2, 36.0f), uu9.a);
                                        boolean f6 = rv4Var3.f(t2cVar4);
                                        Object P11 = rv4Var3.P();
                                        if (f6 || P11 == lh9Var) {
                                            P11 = new i0c(t2cVar4, 19);
                                            rv4Var3.o0(P11);
                                        }
                                        nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P11, k5, null, false), 4.0f), j4, rv4Var3, 48, 0);
                                        rv4Var3.q(true);
                                    } else {
                                        rv4Var3.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, rv4Var), rv4Var, 1600518, 18);
                    rv4Var.e0(-242598843);
                    boolean z8 = ((f1c) z6.getValue()).a;
                    boolean z9 = ((f1c) z6.getValue()).b;
                    boolean z10 = ((f1c) z6.getValue()).c;
                    int i9 = ((z1c) z7.getValue()).a;
                    nq7 k4 = tte.k(lha.e(lhaVar, pna.n(kq7Var, 40.0f), lha.c("tts_play", rv4Var), qrVar), su9Var3);
                    boolean f5 = rv4Var.f(t2cVar3);
                    Object P10 = rv4Var.P();
                    if (f5 || P10 == obj5) {
                        P10 = new i0c(t2cVar3, 1);
                        rv4Var.o0(P10);
                    }
                    e1c.e(i9, 0, (vt4) P10, rv4Var, k4, z8, z9, z10);
                    rv4Var.q(false);
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    rte.d(z3, null, zt3.g(null, 3).a(zt3.c()), zt3.i(null, 3).a(zt3.n()), null, jce.E(-84085836, new mu4() { // from class: k0c
                        @Override // defpackage.mu4
                        public final Object c(Object obj6, Object obj7, Object obj8) {
                            boolean z82;
                            boolean z92;
                            int i92 = r2;
                            pvc pvcVar2 = pvc.a;
                            lh9 lh9Var = ax1.a;
                            dz dzVar = lz.a;
                            kq7 kq7Var2 = kq7.a;
                            t2c t2cVar4 = t2cVar3;
                            switch (i92) {
                                case 0:
                                    rv4 rv4Var2 = (rv4) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((qr) obj6).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z82 = true;
                                    } else {
                                        z82 = false;
                                    }
                                    if (rv4Var2.U(intValue2 & 1, z82)) {
                                        gv9 a2 = ev9.a(dzVar, kh5.G, rv4Var2, 48);
                                        int hashCode3 = Long.hashCode(rv4Var2.T);
                                        xt8 l3 = rv4Var2.l();
                                        nq7 p4 = lye.p(rv4Var2, kq7Var2);
                                        rw1.k.getClass();
                                        zx1 zx1Var2 = qw1.b;
                                        rv4Var2.i0();
                                        if (rv4Var2.S) {
                                            rv4Var2.k(zx1Var2);
                                        } else {
                                            rv4Var2.r0();
                                        }
                                        jce.F(qw1.f, rv4Var2, a2);
                                        jce.F(qw1.e, rv4Var2, l3);
                                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode3));
                                        jce.C(qw1.h, rv4Var2);
                                        jce.F(qw1.d, rv4Var2, p4);
                                        ar5 c2 = rp5.c((wk3) jk3.Y.getValue(), rv4Var2, 0);
                                        long j3 = ((h27) rv4Var2.j(j27.a)).a.q;
                                        nq7 k42 = tte.k(pna.n(kq7Var2, 36.0f), uu9.a);
                                        boolean f52 = rv4Var2.f(t2cVar4);
                                        Object P102 = rv4Var2.P();
                                        if (f52 || P102 == lh9Var) {
                                            P102 = new i0c(t2cVar4, 18);
                                            rv4Var2.o0(P102);
                                        }
                                        nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P102, k42, null, false), 4.0f), j3, rv4Var2, 48, 0);
                                        rs8.v(kq7Var2, 2.0f, rv4Var2, true);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var3 = (rv4) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((qr) obj6).getClass();
                                    if ((intValue3 & 17) != 16) {
                                        z92 = true;
                                    } else {
                                        z92 = false;
                                    }
                                    if (rv4Var3.U(intValue3 & 1, z92)) {
                                        gv9 a3 = ev9.a(dzVar, kh5.G, rv4Var3, 48);
                                        int hashCode4 = Long.hashCode(rv4Var3.T);
                                        xt8 l4 = rv4Var3.l();
                                        nq7 p5 = lye.p(rv4Var3, kq7Var2);
                                        rw1.k.getClass();
                                        zx1 zx1Var3 = qw1.b;
                                        rv4Var3.i0();
                                        if (rv4Var3.S) {
                                            rv4Var3.k(zx1Var3);
                                        } else {
                                            rv4Var3.r0();
                                        }
                                        jce.F(qw1.f, rv4Var3, a3);
                                        jce.F(qw1.e, rv4Var3, l4);
                                        jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode4));
                                        jce.C(qw1.h, rv4Var3);
                                        jce.F(qw1.d, rv4Var3, p5);
                                        xbe.i(rv4Var3, pna.s(kq7Var2, 2.0f));
                                        ar5 c3 = rp5.c((wk3) jk3.X.getValue(), rv4Var3, 0);
                                        long j4 = ((h27) rv4Var3.j(j27.a)).a.q;
                                        nq7 k5 = tte.k(pna.n(kq7Var2, 36.0f), uu9.a);
                                        boolean f6 = rv4Var3.f(t2cVar4);
                                        Object P11 = rv4Var3.P();
                                        if (f6 || P11 == lh9Var) {
                                            P11 = new i0c(t2cVar4, 19);
                                            rv4Var3.o0(P11);
                                        }
                                        nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P11, k5, null, false), 4.0f), j4, rv4Var3, 48, 0);
                                        rv4Var3.q(true);
                                    } else {
                                        rv4Var3.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, rv4Var), rv4Var, 1600518, 18);
                    xbe.i(rv4Var, pna.s(kq7Var, 2.0f));
                    ar5 c2 = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
                    long j3 = ((h27) rv4Var.j(tzaVar)).a.q;
                    nq7 k5 = tte.k(pna.n(kq7Var, 32.0f), su9Var3);
                    boolean f6 = rv4Var.f(t2cVar3);
                    Object P11 = rv4Var.P();
                    if (f6 || P11 == obj5) {
                        P11 = new i0c(t2cVar3, 2);
                        rv4Var.o0(P11);
                    }
                    nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P11, k5, null, false), 4.0f), j3, rv4Var, 48, 0);
                    rv4 rv4Var2 = rv4Var;
                    xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
                    rv4Var2.q(true);
                    if (((Boolean) aw7Var14.getValue()).booleanValue()) {
                        rv4Var2.e0(1061254148);
                        nq7 y2 = zbe.y(nmd.v(tte.k(kq7Var, su9Var3), ((h27) rv4Var2.j(tzaVar)).a.p, ba5Var), 3.0f);
                        if (e1c.j(aw7Var12) < nae.e) {
                            nk0Var = kh5.f;
                        } else {
                            nk0Var = kh5.d;
                        }
                        nq7 k6 = tte.k(pu0.a.a(y2, nk0Var), su9Var3);
                        b37 d2 = fu0.d(nk0Var2, false);
                        int hashCode3 = Long.hashCode(rv4Var2.T);
                        xt8 l3 = rv4Var2.l();
                        nq7 p4 = lye.p(rv4Var2, k6);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar2, rv4Var2, d2);
                        jce.F(npVar7, rv4Var2, l3);
                        s21.t(hashCode3, rv4Var2, npVar5, rv4Var2, kgVar);
                        jce.F(npVar6, rv4Var2, p4);
                        String str6 = ((n1c) aw7Var13.getValue()).a;
                        String str7 = ((n1c) aw7Var13.getValue()).b;
                        String str8 = ((n1c) aw7Var13.getValue()).f;
                        String str9 = ((n1c) aw7Var13.getValue()).e;
                        nq7 k7 = tte.k(pna.n(kq7Var, 44.0f), su9Var3);
                        boolean f7 = rv4Var2.f(aw7Var14) | rv4Var2.h(m82Var) | rv4Var2.f(aw7Var12) | rv4Var2.d(i7) | rv4Var2.f(t2cVar3);
                        Object P12 = rv4Var2.P();
                        if (f7 || P12 == obj5) {
                            vt4 vt4Var4 = new vt4() { // from class: j0c
                                @Override // defpackage.vt4
                                public final Object invoke() {
                                    int i72 = r7;
                                    pvc pvcVar2 = pvc.a;
                                    m82 m82Var2 = m82Var;
                                    t2c t2cVar32 = t2cVar3;
                                    switch (i72) {
                                        case 0:
                                            aw7 aw7Var142 = aw7Var14;
                                            if (((Boolean) aw7Var142.getValue()).booleanValue()) {
                                                z87.v(m82Var2, null, null, new q08(false, i7, aw7Var12, aw7Var4, aw7Var142, null), 3);
                                            } else {
                                                t2cVar32.getClass();
                                                fdd.g(t2cVar32, jdd.a(t2cVar32), new n2c(t2cVar32, null, 3));
                                            }
                                            return pvcVar2;
                                        default:
                                            aw7 aw7Var15 = aw7Var14;
                                            if (((Boolean) aw7Var15.getValue()).booleanValue()) {
                                                z87.v(m82Var2, null, null, new q08(false, i7, aw7Var12, aw7Var4, aw7Var15, null), 3);
                                            } else {
                                                t2cVar32.getClass();
                                                fdd.g(t2cVar32, jdd.a(t2cVar32), new n2c(t2cVar32, null, 3));
                                            }
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var2.o0(vt4Var4);
                            P12 = vt4Var4;
                        }
                        do5.c(str6, str7, str8, str9, u22Var, lbe.f(15, (vt4) P12, k7, null, false), rv4Var2, 24576);
                        rv4Var2 = rv4Var2;
                        z4 = true;
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                    } else {
                        z4 = true;
                        rv4Var2.e0(1062450593);
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(z4);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar;
            default:
                nq7 nq7Var = (nq7) obj4;
                qr qrVar2 = (qr) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                qrVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h = rv4Var3.f(qrVar2);
                    } else {
                        h = rv4Var3.h(qrVar2);
                    }
                    if (!h) {
                        i3 = 2;
                    }
                    intValue2 |= i3;
                }
                if ((intValue2 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var3.U(intValue2 & 1, z5)) {
                    hc2.b(mwe.u(nq7Var, false, 15), null, jce.E(2057284603, new b0c(this.b, this.c, this.d, this.e, this.f, qrVar2, this.C, this.D), rv4Var3), rv4Var3, 3072, 6);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ b0c(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, t2c t2cVar, lha lhaVar, qr qrVar, int i, aw7 aw7Var4) {
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
        this.e = t2cVar;
        this.f = lhaVar;
        this.E = qrVar;
        this.C = i;
        this.D = aw7Var4;
    }
}
