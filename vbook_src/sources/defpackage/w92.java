package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w92  reason: default package */
/* loaded from: classes3.dex */
public abstract class w92 {
    public static final float c = 30.0f;
    public static final tu1 a = new tu1(new mv1(9), false, -1972256487);
    public static final xk5 b = new Object();
    public static final mh4 d = new Object();

    public static boolean A(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static final void a(cz7 cz7Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-423093738);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                eb ebVar = (eb) ((fdd) voe.z(cm9.a(eb.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(ebVar.d, rv4Var);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = yae.z(Boolean.FALSE);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) P;
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = ebVar.e;
                boolean f = rv4Var.f(kbVar);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new wa(0, kbVar, (m42) null);
                    rv4Var.o0(P2);
                }
                jye.b(s02Var, null, (mu4) P2, rv4Var, 0);
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new s7(aw7Var, 1);
                    rv4Var.o0(P3);
                }
                ie2.f(48, (xt4) P3, rv4Var, null, booleanValue);
                String A = yqe.A((y3b) v1b.b0.getValue(), rv4Var);
                tu1 E = jce.E(-922845550, new p7(cz7Var, 2), rv4Var);
                tu1 E2 = jce.E(1809387617, new u32(9, ebVar, z2), rv4Var);
                nq7Var2 = kq7.a;
                fxe.h(A, nq7Var2, false, E, null, null, E2, rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(cz7Var, nq7Var2, i, 3);
        }
    }

    public static final void b(xy4 xy4Var, cc ccVar, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(1959221577);
        if ((i & 6) == 0) {
            if (rv4Var.f(xy4Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(ccVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(tu1Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i3 & Token.EXPR_VOID) == 146 && rv4Var.E()) {
            rv4Var.X();
        } else {
            if (i7 != 0) {
                ccVar = cc.c;
            }
            du0 du0Var = du0.a;
            rv4Var.f0(578571862);
            int i8 = i3 & 896;
            rv4Var.f0(-548224868);
            if (rv4Var.a instanceof my) {
                rv4Var.c0();
                if (rv4Var.S) {
                    rv4Var.k(du0Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(np.I, rv4Var, xy4Var);
                jce.F(np.J, rv4Var, ccVar);
                tu1Var.invoke(rv4Var, Integer.valueOf((i8 >> 6) & 14));
                rv4Var.q(true);
                rv4Var.q(false);
                rv4Var.q(false);
            } else {
                p17.h();
                throw null;
            }
        }
        cc ccVar2 = ccVar;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new eu0(xy4Var, ccVar2, tu1Var, i, i2);
        }
    }

    public static final void c(l9 l9Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        String A;
        boolean z2;
        int i4;
        boolean h;
        int i5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-778747599);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(l9Var);
            } else {
                h = rv4Var2.h(l9Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i6 = i2;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            nq7 y = zbe.y(nmd.v(tte.k(pna.f(nq7Var, 1.0f), r0f.z(rv4Var2).c), r0f.y(rv4Var2).c, lre.g), 16.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (l9Var instanceof k9) {
                rv4Var2.e0(-815652339);
                A = yqe.A((y3b) v1b.F.getValue(), rv4Var2);
                rv4Var2.q(false);
            } else if (l9Var instanceof j9) {
                rv4Var2.e0(484684933);
                A = yqe.B((y3b) v1b.G.getValue(), new Object[]{Integer.valueOf((int) (((j9) l9Var).a() * 100.0f))}, rv4Var2);
                rv4Var2.q(false);
            } else if (l9Var instanceof g9) {
                rv4Var2.e0(-815642297);
                A = yqe.A((y3b) v1b.H.getValue(), rv4Var2);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-815640179);
                A = yqe.A((y3b) v1b.F.getValue(), rv4Var2);
                rv4Var2.q(false);
            }
            cvb.c(A, null, r0f.y(rv4Var2).d, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).k, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            boolean z3 = l9Var instanceof j9;
            kq7 kq7Var = kq7.a;
            if (z3 && ((j9) l9Var).a() > nae.e) {
                s21.w(rv4Var2, 485277622, kq7Var, 8.0f, rv4Var2);
                if ((i6 & 14) != 4 && ((i6 & 8) == 0 || !rv4Var2.h(l9Var))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Object P = rv4Var2.P();
                if (z2 || P == ax1.a) {
                    P = new qa(l9Var, 1);
                    rv4Var2.o0(P);
                }
                r79.c((vt4) P, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).b), r0f.y(rv4Var2).d, zl1.b(0.2f, r0f.y(rv4Var2).d), 0, nae.e, null, rv4Var, 0, Token.ASSIGN_MOD);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                s21.w(rv4Var2, 485679878, kq7Var, 8.0f, rv4Var2);
                r79.d(tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).b), r0f.y(rv4Var2).d, zl1.b(0.2f, r0f.y(rv4Var2).d), 0, nae.e, rv4Var2, 0, 24);
                rv4Var2.q(false);
            }
            i3 = 1;
            rv4Var2.q(true);
        } else {
            i3 = 1;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gk7(l9Var, nq7Var, i, i3);
        }
    }

    public static final void d(final String str, nq7 nq7Var, long j, long j2, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
        final nq7 nq7Var2;
        final long j3;
        final long j4;
        long g;
        int i3;
        kq7 kq7Var;
        long j5;
        rv4Var.g0(-98968076);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 1200;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                g = j;
                j5 = j2;
                i3 = i4 & (-8065);
                kq7Var = nq7Var;
            } else {
                tza tzaVar = j27.a;
                g = rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f);
                long b2 = rm1.b(((h27) rv4Var.j(tzaVar)).a.h, rv4Var);
                i3 = i4 & (-8065);
                kq7Var = kq7.a;
                j5 = b2;
            }
            rv4Var.r();
            long q = zr1.q(10);
            tza tzaVar2 = j27.a;
            long j6 = g;
            cvb.c(str, zbe.z(nmd.v(tte.k(kq7Var, ((h27) rv4Var.j(tzaVar2)).c.a), g, lre.g), 7.0f, 2.0f), j5, null, q, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(tzaVar2)).b.l, rv4Var, (i3 & 14) | 24576, 24576, 114664);
            j4 = j5;
            nq7Var2 = kq7Var;
            j3 = j6;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            j3 = j;
            j4 = j2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(str, nq7Var2, j3, j4, i) { // from class: sa
                public final /* synthetic */ String a;
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    w92.d(this.a, this.b, this.c, this.d, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(boolean z, String str, String str2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        String str3;
        str.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-2006698228);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        int i11 = i2 & 4;
        if (i11 != 0) {
            i6 = i10 | 384;
            obj = str2;
        } else {
            obj = str2;
            if (rv4Var.f(obj)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i6 = i10 | i5;
        }
        if (rv4Var.h(xt4Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i12 = i6 | i7;
        if (rv4Var.h(xt4Var2)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i13 = i8 | i12;
        boolean z3 = true;
        if ((i13 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i13 & 1, z2)) {
            if (i11 != 0) {
                obj = "";
            }
            if ((i13 & 896) != 256) {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                int length = obj.length();
                P = yae.z(new jub(obj, sze.a(length, length), 4));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            String str4 = obj;
            xb.d(z, xt4Var, jce.E(1692945208, new yd7(0, xt4Var2, xt4Var, aw7Var, obj), rv4Var), null, mwe.x(kq7.a, 14), jce.E(513948373, new zd7(0, xt4Var, aw7Var, str4), rv4Var), jce.E(120949428, new jd1(str, 11), rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(1749204960, new sp0(aw7Var, 7), rv4Var), rv4Var, (i13 & 14) | 1769856 | ((i13 >> 6) & Token.ASSIGN_MOD), 8072);
            str3 = str4;
        } else {
            rv4Var.X();
            str3 = obj;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ae7(z, str, str3, xt4Var, xt4Var2, i, i2);
        }
    }

    public static final void f(l9 l9Var, boolean z, boolean z2, vt4 vt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        kq7 kq7Var;
        long j;
        boolean z4;
        kq7 kq7Var2;
        wk3 wk3Var;
        long j2;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-455414324);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(l9Var);
            } else {
                h = rv4Var2.h(l9Var);
            }
            if (h) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z2)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2 | 24576;
        if ((i7 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i7 & 1, z3)) {
            kq7 kq7Var3 = kq7.a;
            nq7 k = tte.k(c16.g(pna.n(kq7Var3, 40.0f), null, 3), uu9.a);
            if (z) {
                rv4Var2.e0(553931643);
                j = zl1.b(0.12f, ((h27) rv4Var2.j(j27.a)).a.w);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(554027588);
                j = ((h27) rv4Var2.j(j27.a)).a.c;
                rv4Var2.q(false);
            }
            nq7 v = nmd.v(k, j, lre.g);
            if ((i7 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z4 || P == lh9Var) {
                P = new pa(0, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 f = lbe.f(15, (vt4) P, v, null, false);
            b37 d2 = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (z2) {
                rv4Var2.e0(15903293);
                if (l9Var instanceof j9) {
                    rv4Var2.e0(15964115);
                    nq7 n = pna.n(kq7Var3, 22.0f);
                    if ((i7 & 14) != 4 && ((i7 & 8) == 0 || !rv4Var2.h(l9Var))) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    Object P2 = rv4Var2.P();
                    if (!z6 && P2 != lh9Var) {
                        z7 = false;
                    } else {
                        z7 = false;
                        P2 = new qa(l9Var, 0);
                        rv4Var2.o0(P2);
                    }
                    kq7Var2 = kq7Var3;
                    z5 = z7;
                    r79.b((vt4) P2, n, 0L, 2.0f, 0L, 0, nae.e, rv4Var, 3120, Token.COLON);
                    rv4Var2 = rv4Var;
                    rv4Var2.q(z5);
                } else {
                    kq7Var2 = kq7Var3;
                    z5 = false;
                    rv4Var2.e0(16175783);
                    r79.a(pna.n(kq7Var2, 22.0f), 0L, 2.0f, 0L, 0, nae.e, rv4Var, 390, 58);
                    rv4Var2 = rv4Var;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z5);
            } else {
                kq7Var2 = kq7Var3;
                rv4Var2.e0(16361845);
                nq7 n2 = pna.n(kq7Var2, 22.0f);
                if (z) {
                    wk3Var = (wk3) jk3.H.getValue();
                } else {
                    wk3Var = (wk3) jk3.L.getValue();
                }
                ar5 c2 = rp5.c(wk3Var, rv4Var2, 0);
                if (z) {
                    rv4Var2.e0(-415105673);
                    j2 = ((h27) rv4Var2.j(j27.a)).a.w;
                } else {
                    rv4Var2.e0(-415104476);
                    j2 = ((h27) rv4Var2.j(j27.a)).a.d;
                }
                rv4Var2.q(false);
                nk5.a(c2, null, n2, j2, rv4Var2, 432, 0);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ra(l9Var, z, z2, vt4Var, kq7Var, i);
        }
    }

    public static final void g(String str, m9 m9Var, boolean z, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        rv4 rv4Var2;
        kq7 kq7Var;
        boolean z3;
        String str2;
        long j;
        float f;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(1577161161);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.d(m9Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        int i6 = i2 | 3072;
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i6 & 1, z2)) {
            if ((i6 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                int length = str.length();
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (!Character.isLetter(str.charAt(i7))) {
                            str2 = str.substring(0, i7);
                            break;
                        }
                        i7++;
                    } else {
                        str2 = str;
                        break;
                    }
                }
                String upperCase = k4b.L0(2, str2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (upperCase.length() == 0) {
                    upperCase = "?";
                }
                P = upperCase;
                rv4Var.o0(P);
            }
            String str3 = (String) P;
            int ordinal = m9Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        rv4Var.e0(-471564302);
                        j = ((h27) rv4Var.j(j27.a)).a.f;
                        rv4Var.q(false);
                    } else {
                        throw rs8.b(-471570434, rv4Var, false);
                    }
                } else {
                    rv4Var.e0(-471566351);
                    j = ((h27) rv4Var.j(j27.a)).a.j;
                    rv4Var.q(false);
                }
            } else {
                rv4Var.e0(-471568400);
                j = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            }
            long j2 = j;
            kq7 kq7Var2 = kq7.a;
            nq7 n = pna.n(kq7Var2, 44.0f);
            tza tzaVar = j27.a;
            nq7 k = tte.k(n, ((h27) rv4Var.j(tzaVar)).c.c);
            if (z) {
                f = 0.2f;
            } else {
                f = 0.12f;
            }
            nq7 v = nmd.v(k, zl1.b(f, j2), lre.g);
            b37 d2 = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, v);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7Var = kq7Var2;
            cvb.c(str3, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oyb.a(((h27) rv4Var.j(tzaVar)).b.i, 0L, 0L, dq4.D, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ta(str, m9Var, z, kq7Var, i, 0);
        }
    }

    public static final void h(List list, List list2, Map map, String str, rh8 rh8Var, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        boolean h2;
        int i8;
        boolean h3;
        int i9;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1513725132);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rv4Var2.f(list);
            } else {
                h3 = rv4Var2.h(list);
            }
            if (h3) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h2 = rv4Var2.f(list2);
            } else {
                h2 = rv4Var2.h(list2);
            }
            if (h2) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var2.f(map);
            } else {
                h = rv4Var2.h(map);
            }
            if (h) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(str)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        int i10 = i2 | 12582912;
        boolean z7 = true;
        if ((i10 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            if (list.isEmpty() && list2.isEmpty()) {
                rv4Var2.e0(1771609139);
                jxe.d(owe.D(rv4Var2), yqe.A((y3b) v1b.c0.getValue(), rv4Var2), str, zbe.x(pna.c, rh8Var), null, null, rv4Var2, (i10 >> 3) & 896, 48);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1771985200);
                ze4 ze4Var = pna.c;
                th8 th8Var = new th8(16.0f, rh8Var.d(), 16.0f, 100.0f);
                hz hzVar = new hz(8.0f, true, new vs(2));
                if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !rv4Var2.h(list))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if ((3670016 & i10) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z2 | z3;
                if ((i10 & Token.ASSIGN_MOD) != 32 && ((i10 & 64) == 0 || !rv4Var2.h(list2))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z9 = z8 | z4;
                if ((i10 & 896) != 256 && ((i10 & 512) == 0 || !rv4Var2.h(map))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                boolean z10 = z9 | z5;
                if ((i10 & 458752) != 131072) {
                    z7 = false;
                }
                boolean z11 = z10 | z7;
                Object P = rv4Var2.P();
                if (!z11 && P != ax1.a) {
                    z6 = false;
                } else {
                    z6 = false;
                    p6 p6Var = new p6(list, list2, xt4Var2, map, xt4Var, 1);
                    rv4Var2.o0(p6Var);
                    P = p6Var;
                }
                jce.d(ze4Var, null, th8Var, false, hzVar, null, null, false, null, (xt4) P, rv4Var, 24576, 490);
                rv4Var2 = rv4Var;
                rv4Var2.q(z6);
            }
            kq7Var = kq7.a;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ua(list, list2, map, str, rh8Var, xt4Var, xt4Var2, kq7Var, i);
        }
    }

    public static final void i(l9 l9Var, rh8 rh8Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        float d2;
        int i3;
        boolean h;
        int i4;
        rv4Var.g0(-150901558);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(l9Var);
            } else {
                h = rv4Var.h(l9Var);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, ze4Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (!c16.i(l9Var, f9.a) && !c16.i(l9Var, i9.a) && !(l9Var instanceof h9)) {
                z2 = true;
            } else {
                z2 = false;
            }
            kq7 kq7Var2 = kq7.a;
            if (z2) {
                rv4Var.e0(-577943600);
                c(l9Var, zbe.z(zbe.C(kq7Var2, nae.e, rh8Var.d(), nae.e, nae.e, 13), 16.0f, 8.0f), rv4Var, i5 & 14);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-577680286);
                rv4Var.q(false);
            }
            if (z2) {
                d2 = nae.e;
            } else {
                d2 = rh8Var.d();
            }
            th8 th8Var = new th8(16.0f, d2, 16.0f, 100.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new y4(6);
                rv4Var.o0(P);
            }
            jce.d(ze4Var, null, th8Var, false, hzVar, null, null, false, null, (xt4) P, rv4Var, 817913862, 362);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(l9Var, rh8Var, kq7Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [gs9] */
    public static final void j(final String str, final String str2, final m9 m9Var, long j, String str3, String str4, final l9 l9Var, final vt4 vt4Var, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        String str5;
        boolean z2;
        boolean z3;
        mv6 mv6Var;
        String A;
        boolean z4;
        String str6;
        String str7;
        int i10;
        final long j2 = j;
        final String str8 = str3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(469493443);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (rv4Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (rv4Var2.d(m9Var.ordinal())) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i13 = i12 | i4;
        if (rv4Var2.e(j2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (rv4Var2.f(str8)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (rv4Var2.f(str4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i7;
        if ((i & 1572864) == 0) {
            if (rv4Var2.f(l9Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i16 |= i10;
        }
        if (rv4Var2.h(vt4Var)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        if (rv4Var2.f(nq7Var)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i18 = i17 | i9;
        if ((i18 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i18 & 1, z)) {
            if (!l9Var.equals(k9.a) && !(l9Var instanceof j9)) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean equals = l9Var.equals(f9.a);
            if ((i18 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            if (z3 || P == ax1.a) {
                str2.getClass();
                String O = r4b.O(k4b.N0(str2).toString(), '_', '-');
                mv6 mv6Var2 = null;
                if (O.length() == 0 || O.equalsIgnoreCase("und")) {
                    O = null;
                }
                if (O != null) {
                    try {
                        mv6Var = new mv6(xve.c(O));
                    } catch (Throwable th) {
                        mv6Var = new gs9(th);
                    }
                    if (!(mv6Var instanceof gs9)) {
                        mv6Var2 = mv6Var;
                    }
                    mv6Var2 = mv6Var2;
                }
                if (mv6Var2 != null) {
                    P = mv6Var2.b();
                } else {
                    P = str2;
                }
                rv4Var2.o0(P);
            }
            String str9 = (String) P;
            int ordinal = m9Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        rv4Var2.e0(211657722);
                        A = yqe.A((y3b) v1b.N.getValue(), rv4Var2);
                        rv4Var2.q(false);
                    } else {
                        throw rs8.b(211651187, rv4Var2, false);
                    }
                } else {
                    rv4Var2.e0(211655033);
                    A = yqe.A((y3b) v1b.L.getValue(), rv4Var2);
                    rv4Var2.q(false);
                }
            } else {
                rv4Var2.e0(211652375);
                A = yqe.A((y3b) v1b.M.getValue(), rv4Var2);
                rv4Var2.q(false);
            }
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            String str10 = A;
            g(str2, m9Var, equals, null, rv4Var2, (i18 >> 3) & Token.ELSE);
            kq7 kq7Var = kq7.a;
            we6 d2 = rs8.d(kq7Var, 12.0f, rv4Var2, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nq7 u = l0e.u(pna.f(kq7Var, 1.0f));
            tza tzaVar = j27.a;
            cvb.c(str, u, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, (i18 & 14) | 48, 24576, 114684);
            xbe.i(rv4Var, pna.h(kq7Var, 6.0f));
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, kq7Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            Locale locale = Locale.ROOT;
            str8 = str3;
            String upperCase = str8.toUpperCase(locale);
            upperCase.getClass();
            d(upperCase, null, 0L, 0L, rv4Var, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            if (str4.length() > 0) {
                StringBuilder sb = new StringBuilder();
                str5 = str4;
                String valueOf2 = String.valueOf(str5.charAt(0));
                valueOf2.getClass();
                String upperCase2 = valueOf2.toUpperCase(locale);
                upperCase2.getClass();
                sb.append((Object) upperCase2);
                z4 = true;
                sb.append(str5.substring(1));
                str6 = sb.toString();
            } else {
                str5 = str4;
                z4 = true;
                str6 = str5;
            }
            d(str6, null, 0L, 0L, rv4Var, 0);
            rs8.u(rv4Var, z4, kq7Var, 4.0f, rv4Var);
            if (j >= 1000000000) {
                j2 = j;
                str7 = hbe.g0(j2 / 1.0E9d).concat(" GB");
            } else {
                j2 = j;
                if (j2 >= 1000000) {
                    str7 = hbe.g0(j2 / 1000000.0d).concat(" MB");
                } else if (j2 >= 1000) {
                    str7 = hbe.g0(j2 / 1000.0d).concat(" KB");
                } else {
                    str7 = j2 + " B";
                }
            }
            cvb.c(str9 + " • " + str10 + " • " + str7, null, zl1.b(0.6f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 0, 24960, 110586);
            rv4Var2 = rv4Var;
            s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            f(l9Var, equals, z2, vt4Var, null, rv4Var2, ((i18 >> 18) & 14) | ((i18 >> 12) & 7168));
            rv4Var2.q(true);
        } else {
            str5 = str4;
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            final String str11 = str5;
            u2.d = new lu4() { // from class: na
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w92.j(str, str2, m9Var, j2, str8, str11, l9Var, vt4Var, nq7Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void k(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        rv4Var.g0(584535738);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 n = pna.n(kq7Var, 44.0f);
            tza tzaVar = j27.a;
            dpe.f(null, tte.k(n, ((h27) rv4Var.j(tzaVar)).c.c), rv4Var, 0, 1);
            we6 d2 = rs8.d(kq7Var, 12.0f, rv4Var, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, d2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            dpe.f(null, tte.k(pna.h(pna.f(kq7Var, 0.6f), 16.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 6.0f));
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, kq7Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            dpe.f(null, tte.k(pna.h(pna.s(kq7Var, 40.0f), 14.0f), ((h27) rv4Var.j(tzaVar)).c.a), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            i3 = 0;
            dpe.f(null, tte.k(pna.h(pna.s(kq7Var, 36.0f), 14.0f), ((h27) rv4Var.j(tzaVar)).c.a), rv4Var, 0, 1);
            rs8.u(rv4Var, true, kq7Var, 4.0f, rv4Var);
            dpe.f(null, tte.k(pna.h(pna.f(kq7Var, 0.45f), 12.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            s21.x(rv4Var, true, kq7Var, 12.0f, rv4Var);
            dpe.f(null, tte.k(pna.n(kq7Var, 40.0f), uu9.a), rv4Var, 0, 1);
            rv4Var.q(true);
        } else {
            i3 = 0;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, i3);
        }
    }

    public static final void l(String str, int i, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1457390145);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var2.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5 | 3072;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 A = zbe.A(kq7Var, nae.e, 8.0f, 1);
            tza tzaVar = j27.a;
            cvb.c(str, A, ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var2, (i8 & 14) | 48, 0, 131064);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            cvb.c(String.valueOf(i), zbe.z(nmd.v(tte.k(kq7Var, uu9.a), zl1.b(0.14f, ((h27) rv4Var2.j(tzaVar)).a.a), lre.g), 8.0f, 3.0f), ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.m, rv4Var2, 0, 0, 131064);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, new we6(1.0f, true));
            rv4Var2.e0(1011260188);
            rv4Var2.q(false);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ma(i, i2, 0, nq7Var, str);
        }
    }

    public static final void m(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-61772156);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            dpe.f(null, tte.k(pna.h(pna.s(zbe.A(kq7Var, nae.e, 8.0f, 1), 120.0f), 20.0f), ((h27) rv4Var.j(j27.a)).c.b), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            dpe.f(null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), rv4Var, 0, 1);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 1);
        }
    }

    public static final ix5 n(rp rpVar, r13 r13Var) {
        return new ix5(rpVar, r13Var);
    }

    public static final ix5 o(qid qidVar, rv4 rv4Var) {
        return new ix5(qidVar, (r13) rv4Var.j(dy1.h));
    }

    public static xu9 p(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 8;
        } else {
            i2 = 10;
        }
        float f = i2;
        float cos = 1.0f / ((float) Math.cos(d2d.b / f));
        x72 x72Var = new x72(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long m = nc2.m(d2d.d(cos, (d2d.b / f) * 2.0f * i4), wi4.a(nae.e, nae.e));
            int i5 = i3 + 1;
            fArr[i3] = nc2.i(m);
            i3 += 2;
            fArr[i5] = nc2.j(m);
        }
        return hud.g(fArr, x72Var, null, nae.e, nae.e);
    }

    public static m42 q(m42 m42Var, m42 m42Var2, lu4 lu4Var) {
        lu4Var.getClass();
        if (lu4Var instanceof hh0) {
            return ((hh0) lu4Var).create(m42Var, m42Var2);
        }
        d82 context = m42Var2.getContext();
        if (context == gs3.a) {
            return new e16(m42Var2, m42Var, lu4Var);
        }
        return new f16(m42Var2, context, lu4Var, m42Var);
    }

    public static final long r() {
        return Thread.currentThread().getId();
    }

    public static final boolean s(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static m42 t(m42 m42Var) {
        n42 n42Var;
        m42 intercepted;
        m42Var.getClass();
        if (m42Var instanceof n42) {
            n42Var = (n42) m42Var;
        } else {
            n42Var = null;
        }
        if (n42Var != null && (intercepted = n42Var.intercepted()) != null) {
            return intercepted;
        }
        return m42Var;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, jd4] */
    public static final kd4 u(dv8 dv8Var, xt4 xt4Var, rv4 rv4Var, int i) {
        vd4 rd4Var;
        dv8Var.getClass();
        xt4Var.getClass();
        aw7 D = yae.D(xt4Var, rv4Var);
        ?? obj = new Object();
        Set set = null;
        if (dv8Var instanceof zu8) {
            List list = ((zu8) dv8Var).a;
            if (list != null) {
                set = sl1.H0(list);
            }
            rd4Var = new rd4(set);
        } else if (dv8Var.equals(av8.a)) {
            rd4Var = sd4.a;
        } else if (dv8Var.equals(bv8.a)) {
            rd4Var = td4.a;
        } else if (dv8Var.equals(cv8.a)) {
            rd4Var = ud4.a;
        } else if (dv8Var.equals(yu8.a)) {
            rd4Var = new rd4(sl1.H0(tl1.B("mp3", "wav", "m4a")));
        } else {
            xk5.o();
            return null;
        }
        boolean f = rv4Var.f(D);
        Object P = rv4Var.P();
        Object obj2 = ax1.a;
        if (f || P == obj2) {
            P = new zn3(D, 28);
            rv4Var.o0(P);
        }
        fv8 q = st0.q(rd4Var, obj, (xt4) P, rv4Var, 0);
        boolean f2 = rv4Var.f(q);
        Object P2 = rv4Var.P();
        if (f2 || P2 == obj2) {
            P2 = new kd4(q);
            rv4Var.o0(P2);
        }
        return (kd4) P2;
    }

    public static final kd4 v(dv8 dv8Var, xt4 xt4Var, rv4 rv4Var, int i) {
        vd4 rd4Var;
        dv8Var.getClass();
        xt4Var.getClass();
        aw7 D = yae.D(xt4Var, rv4Var);
        Set set = null;
        if (dv8Var instanceof zu8) {
            List list = ((zu8) dv8Var).a;
            if (list != null) {
                set = sl1.H0(list);
            }
            rd4Var = new rd4(set);
        } else if (dv8Var.equals(av8.a)) {
            rd4Var = sd4.a;
        } else if (dv8Var.equals(bv8.a)) {
            rd4Var = td4.a;
        } else if (dv8Var.equals(cv8.a)) {
            rd4Var = ud4.a;
        } else if (dv8Var.equals(yu8.a)) {
            rd4Var = new rd4(sl1.H0(tl1.B("mp3", "wav", "m4a")));
        } else {
            xk5.o();
            return null;
        }
        boolean f = rv4Var.f(D);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (f || P == obj) {
            P = new zn3(D, 27);
            rv4Var.o0(P);
        }
        fv8 q = st0.q(rd4Var, hd4.a, (xt4) P, rv4Var, 48);
        boolean f2 = rv4Var.f(q);
        Object P2 = rv4Var.P();
        if (f2 || P2 == obj) {
            P2 = new kd4(q);
            rv4Var.o0(P2);
        }
        return (kd4) P2;
    }

    public static xu9 w(int i, float f, x72 x72Var) {
        x72Var.getClass();
        if (f > nae.e) {
            if (f < 1.0f) {
                float[] fArr = new float[i * 4];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    float f2 = d2d.b / i;
                    long d2 = d2d.d(1.0f, 2.0f * f2 * i3);
                    fArr[i2] = nc2.i(d2) + nae.e;
                    fArr[i2 + 1] = nc2.j(d2) + nae.e;
                    long d3 = d2d.d(f, f2 * ((i3 * 2) + 1));
                    int i4 = i2 + 3;
                    fArr[i2 + 2] = nc2.i(d3) + nae.e;
                    i2 += 4;
                    fArr[i4] = nc2.j(d3) + nae.e;
                }
                return hud.g(fArr, x72Var, null, nae.e, nae.e);
            }
            vs.m("innerRadius must be less than radius");
            return null;
        }
        vs.m("Star radii must both be greater than 0");
        return null;
    }

    public static final void x(int i, int i2, o9a o9aVar) {
        String str;
        o9aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(o9aVar.g(i4));
            }
            i3 >>>= 1;
        }
        String a2 = o9aVar.a();
        a2.getClass();
        if (arrayList.size() == 1) {
            str = nk2.w(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", a2, "', but it was missing");
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a2 + "', but they were missing";
        }
        throw new tc7(str, null, arrayList, a2);
    }

    public static String y(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return hl5.n("CornerRadius.circular(", dce.E(Float.intBitsToFloat(i)), ")");
        }
        return hl5.o("CornerRadius.elliptical(", dce.E(Float.intBitsToFloat(i)), ", ", dce.E(Float.intBitsToFloat(i2)), ")");
    }

    public static Object z(lu4 lu4Var, Object obj, m42 m42Var) {
        Object n42Var;
        lu4Var.getClass();
        d82 context = m42Var.getContext();
        if (context == gs3.a) {
            n42Var = new es9(m42Var);
        } else {
            n42Var = new n42(m42Var, context);
        }
        jsc.u(2, lu4Var);
        return lu4Var.invoke(obj, n42Var);
    }
}
