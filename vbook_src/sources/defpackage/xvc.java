package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xvc  reason: default package */
/* loaded from: classes3.dex */
public final class xvc implements tm0 {
    public static final xvc b = new xvc(0);
    public final /* synthetic */ int a;

    public /* synthetic */ xvc(int i) {
        this.a = i;
    }

    @Override // defpackage.tm0
    public final void a(final xl0 xl0Var, final boolean z, final boolean z2, final nq7 nq7Var, final zl0 zl0Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        nq7 nq7Var2;
        oyb oybVar;
        int i6;
        boolean h;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z6;
        rv4 rv4Var2;
        ek9 u;
        lu4 lu4Var;
        gn0 gn0Var;
        boolean z7;
        boolean z8;
        float f;
        float f2;
        gpb gpbVar;
        boolean h2;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        Object obj = ax1.a;
        int i15 = 16384;
        int i16 = 4;
        int i17 = 2048;
        switch (i14) {
            case 0:
                rv4 rv4Var3 = rv4Var;
                xl0Var.getClass();
                nq7Var.getClass();
                zl0Var.getClass();
                rv4Var3.g0(-894892420);
                if ((i & 6) == 0) {
                    if (!rv4Var3.f(xl0Var)) {
                        i16 = 2;
                    }
                    i2 = i | i16;
                } else {
                    i2 = i;
                }
                if ((i & 3072) == 0) {
                    if (rv4Var3.f(nq7Var)) {
                        i3 = 2048;
                    } else {
                        i3 = 1024;
                    }
                    i2 |= i3;
                }
                if ((i2 & 1027) != 1026) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i2 & 1, z3)) {
                    p71 p71Var = ((e81) rv4Var3.j(jt6.a)).a;
                    c81 c81Var = (c81) rv4Var3.j(it6.a);
                    nq7 y = zbe.y(nmd.v(pna.f(nq7Var, 1.0f), p71Var.e, uu9.a(4.0f)), 12.0f);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, y);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d);
                    jce.F(qw1.e, rv4Var3, l);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p);
                    qye.b((String) c81Var.b.invoke(xl0Var.b.c()), null, new oyb(p71Var.j, zr1.q(14), null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777212), null, 0, false, 0, 0, null, rv4Var, 0, 1018);
                    rv4Var3 = rv4Var;
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                ek9 u2 = rv4Var3.u();
                if (u2 != null) {
                    u2.d = new sb3(this, xl0Var, z, z2, nq7Var, zl0Var, i, 5);
                    return;
                }
                return;
            case 1:
                xl0Var.getClass();
                nq7Var.getClass();
                zl0Var.getClass();
                rv4Var.g0(-680582758);
                if ((i & 3072) == 0) {
                    if (!rv4Var.f(nq7Var)) {
                        i17 = 1024;
                    }
                    i4 = i | i17;
                } else {
                    i4 = i;
                }
                if ((i4 & 1025) != 1024) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var.U(i4 & 1, z4)) {
                    nq7 A = zbe.A(pna.f(nq7Var, 1.0f), nae.e, 8.0f, 1);
                    b37 d2 = fu0.d(kh5.e, false);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, A);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var2);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d2);
                    jce.F(qw1.e, rv4Var, l2);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p2);
                    abf.e.k(((e81) rv4Var.j(jt6.a)).a.l, null, nae.e, rv4Var, 3072);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                ek9 u3 = rv4Var.u();
                if (u3 != null) {
                    u3.d = new sb3(this, xl0Var, z, z2, nq7Var, zl0Var, i, 0);
                    return;
                }
                return;
            case 2:
                rv4 rv4Var4 = rv4Var;
                xl0Var.getClass();
                hn0 hn0Var = xl0Var.b;
                nq7Var.getClass();
                zl0Var.getClass();
                rv4Var4.g0(2030865122);
                if ((i & 6) == 0) {
                    if (rv4Var4.f(xl0Var)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i5 = i9 | i;
                } else {
                    i5 = i;
                }
                if ((i & 384) == 0) {
                    if (rv4Var4.g(z2)) {
                        i8 = 256;
                    } else {
                        i8 = Token.CASE;
                    }
                    i5 |= i8;
                }
                if ((i & 3072) == 0) {
                    if (rv4Var4.f(nq7Var)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i & 32768) == 0) {
                        h = rv4Var4.f(zl0Var);
                    } else {
                        h = rv4Var4.h(zl0Var);
                    }
                    if (!h) {
                        i15 = 8192;
                    }
                    i5 |= i15;
                }
                if ((196608 & i) == 0) {
                    if (rv4Var4.f(this)) {
                        i6 = 131072;
                    } else {
                        i6 = Parser.ARGC_LIMIT;
                    }
                    i5 |= i6;
                }
                int i18 = i5;
                if ((74883 & i18) != 74882) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var4.U(i18 & 1, z5)) {
                    e81 e81Var = (e81) rv4Var4.j(jt6.a);
                    String c = hn0Var.c();
                    f81 f81Var = e81Var.b;
                    p71 p71Var2 = e81Var.a;
                    boolean f3 = rv4Var4.f(c) | rv4Var4.f(f81Var);
                    Object P = rv4Var4.P();
                    if (f3 || P == obj) {
                        f81 f81Var2 = e81Var.b;
                        if (hn0Var instanceof cn0) {
                            int i19 = ((cn0) hn0Var).a;
                            if (i19 != 1) {
                                if (i19 != 2) {
                                    if (i19 != 3) {
                                        if (i19 != 4) {
                                            if (i19 != 5) {
                                                oybVar = f81Var2.g;
                                            } else {
                                                oybVar = f81Var2.f;
                                            }
                                        } else {
                                            oybVar = f81Var2.e;
                                        }
                                    } else {
                                        oybVar = f81Var2.d;
                                    }
                                } else {
                                    oybVar = f81Var2.c;
                                }
                            } else {
                                oybVar = f81Var2.b;
                            }
                        } else if (hn0Var instanceof fn0) {
                            oybVar = oyb.a(f81Var2.a, 0L, 0L, null, new wp4(1), null, 0L, null, 0, 0L, null, 16777207);
                        } else if (hn0Var instanceof an0) {
                            oybVar = f81Var2.h;
                        } else {
                            oybVar = f81Var2.a;
                        }
                        P = oybVar;
                        rv4Var4.o0(P);
                    }
                    oyb oybVar2 = (oyb) P;
                    if (hn0Var instanceof an0) {
                        rv4Var4.e0(-1700807486);
                        zve.a(xl0Var, z2, oyb.a(oybVar2, p71Var2.c, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), nq7Var, zl0Var, rv4Var4, (i18 & 14) | ((i18 >> 3) & Token.ASSIGN_MOD) | (i18 & 7168) | (i18 & 57344));
                        rv4Var4.q(false);
                        ek9 u4 = rv4Var4.u();
                        if (u4 != null) {
                            u4.d = new lu4(this) { // from class: nmb
                                public final /* synthetic */ xvc b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.lu4
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i20 = r8;
                                    pvc pvcVar = pvc.a;
                                    int i21 = i;
                                    switch (i20) {
                                        case 0:
                                            ((Integer) obj3).getClass();
                                            int p3 = xoe.p(i21 | 1);
                                            this.b.a(xl0Var, z, z2, nq7Var, zl0Var, (rv4) obj2, p3);
                                            return pvcVar;
                                        default:
                                            ((Integer) obj3).getClass();
                                            int p4 = xoe.p(i21 | 1);
                                            this.b.a(xl0Var, z, z2, nq7Var, zl0Var, (rv4) obj2, p4);
                                            return pvcVar;
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    rv4Var4.e0(-1700532640);
                    rv4Var4.q(false);
                    rv4Var4 = rv4Var;
                    oyb a = oyb.a(oybVar2, p71Var2.c, zr1.x(((Number) nq.b(e4c.c(oybVar2.a.b), tte.x(300, 0, null, 6), null, rv4Var, 48, 28).getValue()).floatValue(), 4294967296L), null, null, null, 0L, null, 0, 0L, null, 16777212);
                    if ((hn0Var instanceof zm0) || (hn0Var instanceof dn0)) {
                        nq7Var2 = nq7Var;
                        rv4Var4.e0(-1700155401);
                        zve.b(xl0Var, z2, a, q0f.r(nq7Var2, xl0Var, rv4Var4), zl0Var, rv4Var4, (i18 & 14) | ((i18 >> 3) & Token.ASSIGN_MOD) | (i18 & 57344));
                        rv4Var4.q(false);
                    } else if (hn0Var instanceof fn0) {
                        rv4Var4.e0(-1699827018);
                        zve.c(xl0Var, z2, a, nq7Var, zl0Var, rv4Var4, (i18 & 14) | ((i18 >> 3) & Token.ASSIGN_MOD) | (i18 & 7168) | (i18 & 57344));
                        nq7Var2 = nq7Var;
                        rv4Var4.q(false);
                    } else {
                        nq7Var2 = nq7Var;
                        rv4Var4.e0(-1699541322);
                        xve.e(xl0Var, z2, a, q0f.r(nq7Var2, xl0Var, rv4Var4), zl0Var, rv4Var4, (i18 & 14) | ((i18 >> 3) & Token.ASSIGN_MOD) | (i18 & 57344));
                        rv4Var4.q(false);
                    }
                } else {
                    nq7Var2 = nq7Var;
                    rv4Var4.X();
                }
                ek9 u5 = rv4Var4.u();
                if (u5 != null) {
                    final nq7 nq7Var3 = nq7Var2;
                    u5.d = new lu4(this) { // from class: nmb
                        public final /* synthetic */ xvc b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj2, Object obj3) {
                            int i20 = r8;
                            pvc pvcVar = pvc.a;
                            int i21 = i;
                            switch (i20) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int p3 = xoe.p(i21 | 1);
                                    this.b.a(xl0Var, z, z2, nq7Var3, zl0Var, (rv4) obj2, p3);
                                    return pvcVar;
                                default:
                                    ((Integer) obj3).getClass();
                                    int p4 = xoe.p(i21 | 1);
                                    this.b.a(xl0Var, z, z2, nq7Var3, zl0Var, (rv4) obj2, p4);
                                    return pvcVar;
                            }
                        }
                    };
                    return;
                }
                return;
            default:
                xl0Var.getClass();
                String str = xl0Var.a;
                nq7Var.getClass();
                zl0Var.getClass();
                rv4Var.g0(-143130878);
                if ((i & 6) == 0) {
                    if (!rv4Var.f(xl0Var)) {
                        i16 = 2;
                    }
                    i10 = i16 | i;
                } else {
                    i10 = i;
                }
                if ((i & 384) == 0) {
                    if (rv4Var.g(z2)) {
                        i13 = 256;
                    } else {
                        i13 = Token.CASE;
                    }
                    i10 |= i13;
                }
                if ((i & 3072) == 0) {
                    if (rv4Var.f(nq7Var)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i10 |= i12;
                }
                if ((i & 24576) == 0) {
                    if ((i & 32768) == 0) {
                        h2 = rv4Var.f(zl0Var);
                    } else {
                        h2 = rv4Var.h(zl0Var);
                    }
                    if (h2) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i10 |= i11;
                }
                if ((i10 & 9347) != 9346) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var.U(i10 & 1, z6)) {
                    hn0 hn0Var2 = xl0Var.b;
                    if (hn0Var2 instanceof gn0) {
                        gn0Var = (gn0) hn0Var2;
                    } else {
                        gn0Var = null;
                    }
                    if (gn0Var == null) {
                        u = rv4Var.u();
                        if (u != null) {
                            lu4Var = new lu4(this) { // from class: hbc
                                public final /* synthetic */ xvc b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.lu4
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i20 = r8;
                                    pvc pvcVar = pvc.a;
                                    int i21 = i;
                                    switch (i20) {
                                        case 0:
                                            ((Integer) obj3).getClass();
                                            int p3 = xoe.p(i21 | 1);
                                            this.b.a(xl0Var, z, z2, nq7Var, zl0Var, (rv4) obj2, p3);
                                            return pvcVar;
                                        default:
                                            ((Integer) obj3).getClass();
                                            int p4 = xoe.p(i21 | 1);
                                            this.b.a(xl0Var, z, z2, nq7Var, zl0Var, (rv4) obj2, p4);
                                            return pvcVar;
                                    }
                                }
                            };
                            u.d = lu4Var;
                            return;
                        }
                        return;
                    }
                    e81 e81Var2 = (e81) rv4Var.j(jt6.a);
                    qo3 qo3Var = (qo3) rv4Var.j(gu6.a);
                    aw7 D = yae.D(zl0Var, rv4Var);
                    aw7 D2 = yae.D(qo3Var, rv4Var);
                    int i20 = xl0Var.d.a;
                    if (i20 % 2 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean f4 = rv4Var.f(str);
                    int i21 = i10 & 57344;
                    if (i21 != 16384 && ((i10 & 32768) == 0 || !rv4Var.f(zl0Var))) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    boolean f5 = f4 | z8 | rv4Var.f(qo3Var);
                    Object P2 = rv4Var.P();
                    if (f5 || P2 == obj) {
                        p0c p0cVar = new p0c(D, 13);
                        p0c p0cVar2 = new p0c(D2, 14);
                        str.getClass();
                        P2 = new r6a(21, p0cVar2, p0cVar, str);
                        rv4Var.o0(P2);
                    }
                    xt4 xt4Var = (xt4) P2;
                    nq7 r = q0f.r(nq7Var, xl0Var, rv4Var);
                    gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 48);
                    int hashCode3 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, r);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a2);
                    jce.F(qw1.e, rv4Var, l3);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p3);
                    boolean z9 = gn0Var.a;
                    p71 p71Var3 = e81Var2.a;
                    long j = p71Var3.a;
                    long j2 = p71Var3.b;
                    long b2 = zl1.b(0.5f, p71Var3.c);
                    if (i20 == 0) {
                        f = 20.0f;
                    } else {
                        f = 18.0f;
                    }
                    if (z7) {
                        f2 = 99.0f;
                    } else {
                        f2 = 5.0f;
                    }
                    int i22 = i10;
                    gn0 gn0Var2 = gn0Var;
                    am8.l(z9, xt4Var, null, j, j2, b2, f, f2, qo3Var.c, rv4Var, 0);
                    rv4Var2 = rv4Var;
                    r0f.N.l(12.0f, rv4Var2, 54);
                    oyb oybVar3 = e81Var2.b.a;
                    long j3 = e81Var2.a.c;
                    if (gn0Var2.a) {
                        gpbVar = gpb.d;
                    } else {
                        gpbVar = gpb.b;
                    }
                    xve.e(xl0Var, z2, oyb.a(oybVar3, j3, 0L, null, null, null, 0L, gpbVar, 0, 0L, null, 16773118), new we6(1.0f, true), zl0Var, rv4Var2, (i22 & 14) | ((i22 >> 3) & Token.ASSIGN_MOD) | i21);
                    rv4Var2.q(true);
                } else {
                    rv4Var2 = rv4Var;
                    rv4Var2.X();
                }
                u = rv4Var2.u();
                if (u != null) {
                    lu4Var = new lu4(this) { // from class: hbc
                        public final /* synthetic */ xvc b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj2, Object obj3) {
                            int i202 = r8;
                            pvc pvcVar = pvc.a;
                            int i212 = i;
                            switch (i202) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int p32 = xoe.p(i212 | 1);
                                    this.b.a(xl0Var, z, z2, nq7Var, zl0Var, (rv4) obj2, p32);
                                    return pvcVar;
                                default:
                                    ((Integer) obj3).getClass();
                                    int p4 = xoe.p(i212 | 1);
                                    this.b.a(xl0Var, z, z2, nq7Var, zl0Var, (rv4) obj2, p4);
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                    return;
                }
                return;
        }
    }
}
