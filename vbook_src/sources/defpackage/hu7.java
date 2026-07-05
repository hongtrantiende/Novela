package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyAgreement;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hu7  reason: default package */
/* loaded from: classes3.dex */
public final class hu7 {
    public static final tu1 a = new tu1(new tx0(27), false, 1195690754);
    public static final tu1 b = new tu1(new xu1(10), false, -591632030);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        f25 f25Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-284611459);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            kq7 kq7Var = kq7.a;
            nq7 z2 = zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 12.0f);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            nq7 h = pna.h(s21.f(rv4Var2, p2, npVar4, 1.0f, true), 40.0f);
            tza tzaVar = j27.a;
            dpe.g(tte.k(h, ((h27) rv4Var2.j(tzaVar)).c.e), null, rv4Var2, 0, 2);
            xbe.i(rv4Var2, pna.n(kq7Var, 12.0f));
            dpe.g(pna.n(kq7Var, 40.0f), ((h27) rv4Var2.j(tzaVar)).c.e, rv4Var2, 6, 0);
            xbe.i(rv4Var2, pna.n(kq7Var, 8.0f));
            dpe.g(pna.n(kq7Var, 40.0f), ((h27) rv4Var2.j(tzaVar)).c.e, rv4Var2, 6, 0);
            rv4Var2.q(true);
            s9e.f(zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, a, rv4Var2, 1573302);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            if (ikd.a(rv4Var2)) {
                f25Var = new Object();
            } else {
                f25Var = new f25(160.0f);
            }
            ze4 ze4Var = pna.c;
            th8 th8Var = new th8(12.0f, 8.0f, 12.0f, 8.0f);
            Object P = rv4Var2.P();
            if (P == ax1.a) {
                P = new u83(0);
                rv4Var2.o0(P);
            }
            ade.e(f25Var, ze4Var, null, th8Var, null, null, null, false, null, (xt4) P, rv4Var, 3120, 6, 1012);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 5);
        }
    }

    public static final void b(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        pb2 pb2Var2;
        cz7Var.getClass();
        rv4Var.g0(1857156757);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
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
                l93 l93Var = (l93) ((fdd) voe.z(cm9.a(l93.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd sddVar = (sdd) rv4Var.j(idd.b);
                if (sddVar == null) {
                    rv4Var.e0(1368428688);
                    sddVar = kv6.a(rv4Var);
                } else {
                    rv4Var.e0(1368426673);
                }
                rv4Var.q(false);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    pb2 pb2Var3 = pb2Var2;
                    fxe.i(jue.J(pna.c), jce.E(-964803273, new g83(cz7Var, l93Var, jsc.z(l93Var.d, rv4Var), jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var3, o96.a(rv4Var), null))).f, rv4Var), 1), rv4Var), rv4Var, 48);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 16);
        }
    }

    public static final void c(nq7 nq7Var, dt8 dt8Var, float f, xt4 xt4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        ied iedVar = dt8Var.a;
        rv4Var.g0(-1755179927);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(dt8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.c(f)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.g(true)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(nu4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            aw7 n = yae.n(iedVar.d, rv4Var);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.q(new jw0(n, 2));
                rv4Var.o0(P);
            }
            yya yyaVar = (yya) P;
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = yae.q(new jw0(n, 3));
                rv4Var.o0(P2);
            }
            yya yyaVar2 = (yya) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yae.q(new jw0(n, 4));
                rv4Var.o0(P3);
            }
            yya yyaVar3 = (yya) P3;
            Object P4 = rv4Var.P();
            if (P4 == obj) {
                P4 = yae.q(new jw0(n, 5));
                rv4Var.o0(P4);
            }
            yya yyaVar4 = (yya) P4;
            Object P5 = rv4Var.P();
            if (P5 == obj) {
                P5 = yae.q(new jw0(n, 6));
                rv4Var.o0(P5);
            }
            yya yyaVar5 = (yya) P5;
            Object P6 = rv4Var.P();
            if (P6 == obj) {
                P6 = yae.q(new jw0(n, 7));
                rv4Var.o0(P6);
            }
            yya yyaVar6 = (yya) P6;
            List list = (List) yyaVar.getValue();
            int i14 = ((i13 >> 9) & 896) | 48;
            list.getClass();
            yyaVar4.getClass();
            boolean f2 = rv4Var.f(list);
            if ((((i14 & 896) ^ 384) > 256 && rv4Var.f(nu4Var)) || (i14 & 384) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = f2 | z2;
            Object P7 = rv4Var.P();
            if (z3 || P7 == obj) {
                P7 = new x42(list, yyaVar4, nu4Var);
                rv4Var.o0(P7);
            }
            Object obj2 = (x42) P7;
            a52 a52Var = iedVar.g;
            a52Var.getClass();
            xt4Var.getClass();
            nq7 a0 = nq7Var.a0(dab.b(kq7.a, a52Var, new w42(0, a52Var, xt4Var)));
            Object P8 = rv4Var.P();
            if (P8 == obj) {
                P8 = new hq(yyaVar4, yyaVar5, yyaVar6, yyaVar2, 10);
                rv4Var.o0(P8);
            }
            nq7 k = axe.k(a0, (xt4) P8);
            xc3 xc3Var = new xc3(yyaVar, yyaVar2, yyaVar3, f, dt8Var);
            boolean f3 = rv4Var.f(obj2);
            Object P9 = rv4Var.P();
            if (f3 || P9 == obj) {
                P9 = new t42(obj2, 10);
                rv4Var.o0(P9);
            }
            r1d.e((vt4) P9, k, null, xc3Var, rv4Var, 0, 4);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vc3(nq7Var, dt8Var, f, xt4Var, nu4Var, i);
        }
    }

    public static final void d(List list, rh8 rh8Var, nq7 nq7Var, mu4 mu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        kj6 kj6Var;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4Var.g0(-1882412180);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(mu4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = yae.z(list);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var)), zbe.j(nae.e, nae.e, nae.e, 80.0f, 7));
            kj6 a2 = mj6.a(0, rv4Var, 0, 3);
            boolean f = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f || P2 == obj) {
                P2 = new a42(aw7Var, null, 3);
                rv4Var.o0(P2);
            }
            vo9 B = vqe.B(a2, r, (nu4) P2, rv4Var, 12);
            bkd r2 = mwe.r(r, zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            bkd r3 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean f2 = rv4Var.f(aw7Var) | rv4Var.f(B);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = f2 | z3;
            if ((57344 & i2) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P3 = rv4Var.P();
            if (z6 || P3 == obj) {
                kj6Var = a2;
                Object bz6Var = new bz6(aw7Var, B, mu4Var, xt4Var, 1);
                rv4Var.o0(bz6Var);
                P3 = bz6Var;
            } else {
                kj6Var = a2;
            }
            pc2.c(nq7Var, kj6Var, r2, hzVar, null, null, false, r3, 0L, 0L, nae.e, (xt4) P3, rv4Var, ((i2 >> 6) & 14) | 24576, 0, 3816);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new cz6(list, rh8Var, nq7Var, mu4Var, xt4Var, i, 1);
        }
    }

    public static final void e(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1388806659);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            nq7 y = zbe.y(nq7Var, 24.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            cvb.c(yqe.A((y3b) x2b.r0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i5 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, 5);
        }
    }

    public static final void f(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-738837923);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
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
                mc9 mc9Var = (mc9) ((fdd) voe.z(cm9.a(mc9.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(mc9Var.d, rv4Var);
                do3 I = z1d.I(rv4Var);
                fxe.h(yqe.A((y3b) z1b.e.getValue(), rv4Var), pna.c, false, jce.E(1314498913, new h64(cz7Var, 26), rv4Var), null, jce.E(-1785066180, new dz6(z2, I, 1), rv4Var), jce.E(-1080102286, new cs1(10, I, mc9Var, z2), rv4Var), rv4Var, 1772592, 20);
                boolean f = rv4Var.f(mc9Var);
                Object P = rv4Var.P();
                if (f || P == ax1.a) {
                    P = new pl7(mc9Var, 5);
                    rv4Var.o0(P);
                }
                z1d.i(I, (mu4) P, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 27);
        }
    }

    public static final int[] g(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i - ((i2 - 1) * i3);
        int i7 = i6 / i2;
        int i8 = i6 % i2;
        int[] iArr = new int[i2];
        for (int i9 = 0; i9 < i2; i9++) {
            if (i7 < 0) {
                i5 = 0;
            } else {
                if (i9 < i8) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                i5 = i4 + i7;
            }
            iArr[i9] = i5;
        }
        return iArr;
    }

    public static final void h(h4b h4bVar, h4b h4bVar2) {
        h4bVar.getClass();
        h4bVar2.getClass();
        for (Map.Entry entry : h4bVar2.a()) {
            h4bVar.d((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final void i(Long l, long j, pg5 pg5Var) {
        pg5Var.getClass();
        if (l == null || l.longValue() < 0 || pg5Var.equals(pg5.g) || l.longValue() == j) {
            return;
        }
        long longValue = l.longValue();
        throw new IllegalStateException(("Content-Length mismatch: expected " + longValue + " bytes, but received " + j + " bytes").toString());
    }

    public static char j(int i) {
        int i2;
        if (i >= 10) {
            i2 = i + 87;
        } else {
            i2 = i + 48;
        }
        return (char) i2;
    }

    public static final v56 k(fd1 fd1Var, String str) {
        str.getClass();
        Charset forName = Charset.forName(str);
        forName.getClass();
        return new v56(forName);
    }

    public static final int l(dq4 dq4Var, int i) {
        boolean z;
        boolean z2;
        if (dq4Var.compareTo(dq4.d) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public static final void m(wq7 wq7Var) {
        wq7Var.getClass();
        vh9 vh9Var = new vh9(26);
        x3b x3bVar = oaa.E;
        gi1 a2 = cm9.a(c74.class);
        l96 l96Var = l96.a;
        ima h = s21.h(new yj0(x3bVar, a2, vh9Var, l96Var), wq7Var);
        gi1 a3 = cm9.a(n64.class);
        yj0 yj0Var = h.a;
        yj0Var.e.add(a3);
        nf9 nf9Var = yj0Var.a;
        StringBuilder sb = new StringBuilder();
        s21.v(a3, sb, ':', "", ':');
        sb.append(nf9Var);
        String sb2 = sb.toString();
        LinkedHashMap linkedHashMap = wq7Var.c;
        linkedHashMap.put(sb2, h);
        ima h2 = s21.h(new yj0(x3bVar, cm9.a(k84.class), new pp9(7), l96Var), wq7Var);
        gi1 a4 = cm9.a(g84.class);
        yj0 yj0Var2 = h2.a;
        yj0Var2.e.add(a4);
        nf9 nf9Var2 = yj0Var2.a;
        StringBuilder sb3 = new StringBuilder();
        s21.v(a4, sb3, ':', "", ':');
        sb3.append(nf9Var2);
        linkedHashMap.put(sb3.toString(), h2);
        ima h3 = s21.h(new yj0(x3bVar, cm9.a(bp4.class), new pp9(18), l96Var), wq7Var);
        gi1 a5 = cm9.a(xo4.class);
        yj0 yj0Var3 = h3.a;
        yj0Var3.e.add(a5);
        nf9 nf9Var3 = yj0Var3.a;
        StringBuilder sb4 = new StringBuilder();
        s21.v(a5, sb4, ':', "", ':');
        sb4.append(nf9Var3);
        linkedHashMap.put(sb4.toString(), h3);
        ima h4 = s21.h(new yj0(x3bVar, cm9.a(bn6.class), new pp9(25), l96Var), wq7Var);
        gi1 a6 = cm9.a(wl6.class);
        yj0 yj0Var4 = h4.a;
        yj0Var4.e.add(a6);
        nf9 nf9Var4 = yj0Var4.a;
        StringBuilder sb5 = new StringBuilder();
        s21.v(a6, sb5, ':', "", ':');
        sb5.append(nf9Var4);
        linkedHashMap.put(sb5.toString(), h4);
        ima h5 = s21.h(new yj0(x3bVar, cm9.a(t83.class), new pp9(26), l96Var), wq7Var);
        gi1 a7 = cm9.a(n83.class);
        yj0 yj0Var5 = h5.a;
        yj0Var5.e.add(a7);
        nf9 nf9Var5 = yj0Var5.a;
        StringBuilder sb6 = new StringBuilder();
        s21.v(a7, sb6, ':', "", ':');
        sb6.append(nf9Var5);
        linkedHashMap.put(sb6.toString(), h5);
        ima h6 = s21.h(new yj0(x3bVar, cm9.a(n33.class), new pp9(27), l96Var), wq7Var);
        gi1 a8 = cm9.a(g33.class);
        yj0 yj0Var6 = h6.a;
        yj0Var6.e.add(a8);
        nf9 nf9Var6 = yj0Var6.a;
        StringBuilder sb7 = new StringBuilder();
        s21.v(a8, sb7, ':', "", ':');
        sb7.append(nf9Var6);
        linkedHashMap.put(sb7.toString(), h6);
        ima h7 = s21.h(new yj0(x3bVar, cm9.a(plc.class), new pp9(28), l96Var), wq7Var);
        gi1 a9 = cm9.a(klc.class);
        yj0 yj0Var7 = h7.a;
        yj0Var7.e.add(a9);
        nf9 nf9Var7 = yj0Var7.a;
        StringBuilder sb8 = new StringBuilder();
        s21.v(a9, sb8, ':', "", ':');
        sb8.append(nf9Var7);
        linkedHashMap.put(sb8.toString(), h7);
        ima h8 = s21.h(new yj0(x3bVar, cm9.a(b4a.class), new pp9(29), l96Var), wq7Var);
        gi1 a10 = cm9.a(a4a.class);
        yj0 yj0Var8 = h8.a;
        yj0Var8.e.add(a10);
        nf9 nf9Var8 = yj0Var8.a;
        StringBuilder sb9 = new StringBuilder();
        s21.v(a10, sb9, ':', "", ':');
        sb9.append(nf9Var8);
        linkedHashMap.put(sb9.toString(), h8);
        ima h9 = s21.h(new yj0(x3bVar, cm9.a(bda.class), new qp9(0), l96Var), wq7Var);
        gi1 a11 = cm9.a(yca.class);
        yj0 yj0Var9 = h9.a;
        yj0Var9.e.add(a11);
        nf9 nf9Var9 = yj0Var9.a;
        StringBuilder sb10 = new StringBuilder();
        s21.v(a11, sb10, ':', "", ':');
        sb10.append(nf9Var9);
        linkedHashMap.put(sb10.toString(), h9);
        ima h10 = s21.h(new yj0(x3bVar, cm9.a(n6c.class), new vh9(16), l96Var), wq7Var);
        gi1 a12 = cm9.a(i6c.class);
        yj0 yj0Var10 = h10.a;
        yj0Var10.e.add(a12);
        nf9 nf9Var10 = yj0Var10.a;
        StringBuilder sb11 = new StringBuilder();
        s21.v(a12, sb11, ':', "", ':');
        sb11.append(nf9Var10);
        linkedHashMap.put(sb11.toString(), h10);
        ima h11 = s21.h(new yj0(x3bVar, cm9.a(en6.class), new vh9(17), l96Var), wq7Var);
        gi1 a13 = cm9.a(dn6.class);
        yj0 yj0Var11 = h11.a;
        yj0Var11.e.add(a13);
        nf9 nf9Var11 = yj0Var11.a;
        StringBuilder sb12 = new StringBuilder();
        s21.v(a13, sb12, ':', "", ':');
        sb12.append(nf9Var11);
        linkedHashMap.put(sb12.toString(), h11);
        ima h12 = s21.h(new yj0(x3bVar, cm9.a(cm5.class), new vh9(18), l96Var), wq7Var);
        gi1 a14 = cm9.a(bm5.class);
        yj0 yj0Var12 = h12.a;
        yj0Var12.e.add(a14);
        nf9 nf9Var12 = yj0Var12.a;
        StringBuilder sb13 = new StringBuilder();
        s21.v(a14, sb13, ':', "", ':');
        sb13.append(nf9Var12);
        linkedHashMap.put(sb13.toString(), h12);
        ima h13 = s21.h(new yj0(x3bVar, cm9.a(mnb.class), new vh9(19), l96Var), wq7Var);
        gi1 a15 = cm9.a(fnb.class);
        yj0 yj0Var13 = h13.a;
        yj0Var13.e.add(a15);
        nf9 nf9Var13 = yj0Var13.a;
        StringBuilder sb14 = new StringBuilder();
        s21.v(a15, sb14, ':', "", ':');
        sb14.append(nf9Var13);
        linkedHashMap.put(sb14.toString(), h13);
        ima h14 = s21.h(new yj0(x3bVar, cm9.a(r6d.class), new vh9(20), l96Var), wq7Var);
        gi1 a16 = cm9.a(q6d.class);
        yj0 yj0Var14 = h14.a;
        yj0Var14.e.add(a16);
        nf9 nf9Var14 = yj0Var14.a;
        StringBuilder sb15 = new StringBuilder();
        s21.v(a16, sb15, ':', "", ':');
        sb15.append(nf9Var14);
        linkedHashMap.put(sb15.toString(), h14);
        ima h15 = s21.h(new yj0(x3bVar, cm9.a(i2c.class), new vh9(21), l96Var), wq7Var);
        gi1 a17 = cm9.a(a2c.class);
        yj0 yj0Var15 = h15.a;
        yj0Var15.e.add(a17);
        nf9 nf9Var15 = yj0Var15.a;
        StringBuilder sb16 = new StringBuilder();
        s21.v(a17, sb16, ':', "", ':');
        sb16.append(nf9Var15);
        linkedHashMap.put(sb16.toString(), h15);
        ima h16 = s21.h(new yj0(x3bVar, cm9.a(jg3.class), new vh9(22), l96Var), wq7Var);
        gi1 a18 = cm9.a(yf3.class);
        yj0 yj0Var16 = h16.a;
        yj0Var16.e.add(a18);
        nf9 nf9Var16 = yj0Var16.a;
        StringBuilder sb17 = new StringBuilder();
        s21.v(a18, sb17, ':', "", ':');
        sb17.append(nf9Var16);
        linkedHashMap.put(sb17.toString(), h16);
        ima h17 = s21.h(new yj0(x3bVar, cm9.a(lz1.class), new vh9(23), l96Var), wq7Var);
        gi1 a19 = cm9.a(kz1.class);
        yj0 yj0Var17 = h17.a;
        yj0Var17.e.add(a19);
        nf9 nf9Var17 = yj0Var17.a;
        StringBuilder sb18 = new StringBuilder();
        s21.v(a19, sb18, ':', "", ':');
        sb18.append(nf9Var17);
        linkedHashMap.put(sb18.toString(), h17);
        ima h18 = s21.h(new yj0(x3bVar, cm9.a(i58.class), new vh9(24), l96Var), wq7Var);
        gi1 a20 = cm9.a(h58.class);
        yj0 yj0Var18 = h18.a;
        yj0Var18.e.add(a20);
        nf9 nf9Var18 = yj0Var18.a;
        StringBuilder sb19 = new StringBuilder();
        s21.v(a20, sb19, ':', "", ':');
        sb19.append(nf9Var18);
        linkedHashMap.put(sb19.toString(), h18);
        ima h19 = s21.h(new yj0(x3bVar, cm9.a(c54.class), new vh9(25), l96Var), wq7Var);
        gi1 a21 = cm9.a(b54.class);
        yj0 yj0Var19 = h19.a;
        yj0Var19.e.add(a21);
        nf9 nf9Var19 = yj0Var19.a;
        StringBuilder sb20 = new StringBuilder();
        s21.v(a21, sb20, ':', "", ':');
        sb20.append(nf9Var19);
        linkedHashMap.put(sb20.toString(), h19);
        ima h20 = s21.h(new yj0(x3bVar, cm9.a(qi9.class), new vh9(27), l96Var), wq7Var);
        gi1 a22 = cm9.a(pi9.class);
        yj0 yj0Var20 = h20.a;
        yj0Var20.e.add(a22);
        nf9 nf9Var20 = yj0Var20.a;
        StringBuilder sb21 = new StringBuilder();
        s21.v(a22, sb21, ':', "", ':');
        sb21.append(nf9Var20);
        linkedHashMap.put(sb21.toString(), h20);
        ima h21 = s21.h(new yj0(x3bVar, cm9.a(is0.class), new vh9(28), l96Var), wq7Var);
        gi1 a23 = cm9.a(cs0.class);
        yj0 yj0Var21 = h21.a;
        yj0Var21.e.add(a23);
        nf9 nf9Var21 = yj0Var21.a;
        StringBuilder sb22 = new StringBuilder();
        s21.v(a23, sb22, ':', "", ':');
        sb22.append(nf9Var21);
        linkedHashMap.put(sb22.toString(), h21);
        ima h22 = s21.h(new yj0(x3bVar, cm9.a(yld.class), new vh9(29), l96Var), wq7Var);
        gi1 a24 = cm9.a(nld.class);
        yj0 yj0Var22 = h22.a;
        yj0Var22.e.add(a24);
        nf9 nf9Var22 = yj0Var22.a;
        StringBuilder sb23 = new StringBuilder();
        s21.v(a24, sb23, ':', "", ':');
        sb23.append(nf9Var22);
        linkedHashMap.put(sb23.toString(), h22);
        ima h23 = s21.h(new yj0(x3bVar, cm9.a(pxb.class), new pp9(0), l96Var), wq7Var);
        gi1 a25 = cm9.a(ixb.class);
        yj0 yj0Var23 = h23.a;
        yj0Var23.e.add(a25);
        nf9 nf9Var23 = yj0Var23.a;
        StringBuilder sb24 = new StringBuilder();
        s21.v(a25, sb24, ':', "", ':');
        sb24.append(nf9Var23);
        linkedHashMap.put(sb24.toString(), h23);
        ima h24 = s21.h(new yj0(x3bVar, cm9.a(ep5.class), new pp9(1), l96Var), wq7Var);
        gi1 a26 = cm9.a(wo5.class);
        yj0 yj0Var24 = h24.a;
        yj0Var24.e.add(a26);
        nf9 nf9Var24 = yj0Var24.a;
        StringBuilder sb25 = new StringBuilder();
        s21.v(a26, sb25, ':', "", ':');
        sb25.append(nf9Var24);
        linkedHashMap.put(sb25.toString(), h24);
        ima h25 = s21.h(new yj0(x3bVar, cm9.a(ead.class), new pp9(2), l96Var), wq7Var);
        gi1 a27 = cm9.a(w9d.class);
        yj0 yj0Var25 = h25.a;
        yj0Var25.e.add(a27);
        nf9 nf9Var25 = yj0Var25.a;
        StringBuilder sb26 = new StringBuilder();
        s21.v(a27, sb26, ':', "", ':');
        sb26.append(nf9Var25);
        linkedHashMap.put(sb26.toString(), h25);
        ima h26 = s21.h(new yj0(x3bVar, cm9.a(zs5.class), new pp9(3), l96Var), wq7Var);
        gi1 a28 = cm9.a(xs5.class);
        yj0 yj0Var26 = h26.a;
        yj0Var26.e.add(a28);
        nf9 nf9Var26 = yj0Var26.a;
        StringBuilder sb27 = new StringBuilder();
        s21.v(a28, sb27, ':', "", ':');
        sb27.append(nf9Var26);
        linkedHashMap.put(sb27.toString(), h26);
        ima h27 = s21.h(new yj0(x3bVar, cm9.a(a24.class), new pp9(4), l96Var), wq7Var);
        gi1 a29 = cm9.a(y14.class);
        yj0 yj0Var27 = h27.a;
        yj0Var27.e.add(a29);
        nf9 nf9Var27 = yj0Var27.a;
        StringBuilder sb28 = new StringBuilder();
        s21.v(a29, sb28, ':', "", ':');
        sb28.append(nf9Var27);
        linkedHashMap.put(sb28.toString(), h27);
        ima h28 = s21.h(new yj0(x3bVar, cm9.a(wrc.class), new pp9(5), l96Var), wq7Var);
        gi1 a30 = cm9.a(src.class);
        yj0 yj0Var28 = h28.a;
        yj0Var28.e.add(a30);
        nf9 nf9Var28 = yj0Var28.a;
        StringBuilder sb29 = new StringBuilder();
        s21.v(a30, sb29, ':', "", ':');
        sb29.append(nf9Var28);
        linkedHashMap.put(sb29.toString(), h28);
        ima h29 = s21.h(new yj0(x3bVar, cm9.a(svb.class), new pp9(6), l96Var), wq7Var);
        gi1 a31 = cm9.a(qvb.class);
        yj0 yj0Var29 = h29.a;
        yj0Var29.e.add(a31);
        nf9 nf9Var29 = yj0Var29.a;
        StringBuilder sb30 = new StringBuilder();
        s21.v(a31, sb30, ':', "", ':');
        sb30.append(nf9Var29);
        linkedHashMap.put(sb30.toString(), h29);
        ima h30 = s21.h(new yj0(x3bVar, cm9.a(ae3.class), new pp9(8), l96Var), wq7Var);
        gi1 a32 = cm9.a(td3.class);
        yj0 yj0Var30 = h30.a;
        yj0Var30.e.add(a32);
        nf9 nf9Var30 = yj0Var30.a;
        StringBuilder sb31 = new StringBuilder();
        s21.v(a32, sb31, ':', "", ':');
        sb31.append(nf9Var30);
        linkedHashMap.put(sb31.toString(), h30);
        ima h31 = s21.h(new yj0(x3bVar, cm9.a(d58.class), new pp9(9), l96Var), wq7Var);
        gi1 a33 = cm9.a(a58.class);
        yj0 yj0Var31 = h31.a;
        yj0Var31.e.add(a33);
        nf9 nf9Var31 = yj0Var31.a;
        StringBuilder sb32 = new StringBuilder();
        s21.v(a33, sb32, ':', "", ':');
        sb32.append(nf9Var31);
        linkedHashMap.put(sb32.toString(), h31);
        ima h32 = s21.h(new yj0(x3bVar, cm9.a(x0d.class), new pp9(10), l96Var), wq7Var);
        gi1 a34 = cm9.a(m0d.class);
        yj0 yj0Var32 = h32.a;
        yj0Var32.e.add(a34);
        nf9 nf9Var32 = yj0Var32.a;
        StringBuilder sb33 = new StringBuilder();
        s21.v(a34, sb33, ':', "", ':');
        sb33.append(nf9Var32);
        linkedHashMap.put(sb33.toString(), h32);
        ima h33 = s21.h(new yj0(x3bVar, cm9.a(nr0.class), new pp9(11), l96Var), wq7Var);
        gi1 a35 = cm9.a(kr0.class);
        yj0 yj0Var33 = h33.a;
        yj0Var33.e.add(a35);
        nf9 nf9Var33 = yj0Var33.a;
        StringBuilder sb34 = new StringBuilder();
        s21.v(a35, sb34, ':', "", ':');
        sb34.append(nf9Var33);
        linkedHashMap.put(sb34.toString(), h33);
        ima h34 = s21.h(new yj0(x3bVar, cm9.a(ja3.class), new pp9(12), l96Var), wq7Var);
        gi1 a36 = cm9.a(ga3.class);
        yj0 yj0Var34 = h34.a;
        yj0Var34.e.add(a36);
        nf9 nf9Var34 = yj0Var34.a;
        StringBuilder sb35 = new StringBuilder();
        s21.v(a36, sb35, ':', "", ':');
        sb35.append(nf9Var34);
        linkedHashMap.put(sb35.toString(), h34);
        ima h35 = s21.h(new yj0(x3bVar, cm9.a(qr1.class), new pp9(13), l96Var), wq7Var);
        gi1 a37 = cm9.a(zq1.class);
        yj0 yj0Var35 = h35.a;
        yj0Var35.e.add(a37);
        nf9 nf9Var35 = yj0Var35.a;
        StringBuilder sb36 = new StringBuilder();
        s21.v(a37, sb36, ':', "", ':');
        sb36.append(nf9Var35);
        linkedHashMap.put(sb36.toString(), h35);
        ima h36 = s21.h(new yj0(x3bVar, cm9.a(lp9.class), new pp9(14), l96Var), wq7Var);
        gi1 a38 = cm9.a(jp9.class);
        yj0 yj0Var36 = h36.a;
        yj0Var36.e.add(a38);
        nf9 nf9Var36 = yj0Var36.a;
        StringBuilder sb37 = new StringBuilder();
        s21.v(a38, sb37, ':', "", ':');
        sb37.append(nf9Var36);
        linkedHashMap.put(sb37.toString(), h36);
        ima h37 = s21.h(new yj0(x3bVar, cm9.a(yf1.class), new pp9(15), l96Var), wq7Var);
        gi1 a39 = cm9.a(gf1.class);
        yj0 yj0Var37 = h37.a;
        yj0Var37.e.add(a39);
        nf9 nf9Var37 = yj0Var37.a;
        StringBuilder sb38 = new StringBuilder();
        s21.v(a39, sb38, ':', "", ':');
        sb38.append(nf9Var37);
        linkedHashMap.put(sb38.toString(), h37);
        ima h38 = s21.h(new yj0(x3bVar, cm9.a(m8.class), new pp9(16), l96Var), wq7Var);
        gi1 a40 = cm9.a(i8.class);
        yj0 yj0Var38 = h38.a;
        yj0Var38.e.add(a40);
        nf9 nf9Var38 = yj0Var38.a;
        StringBuilder sb39 = new StringBuilder();
        s21.v(a40, sb39, ':', "", ':');
        sb39.append(nf9Var38);
        linkedHashMap.put(sb39.toString(), h38);
        ima h39 = s21.h(new yj0(x3bVar, cm9.a(jr3.class), new pp9(17), l96Var), wq7Var);
        gi1 a41 = cm9.a(dr3.class);
        yj0 yj0Var39 = h39.a;
        yj0Var39.e.add(a41);
        nf9 nf9Var39 = yj0Var39.a;
        StringBuilder sb40 = new StringBuilder();
        s21.v(a41, sb40, ':', "", ':');
        sb40.append(nf9Var39);
        linkedHashMap.put(sb40.toString(), h39);
        ima h40 = s21.h(new yj0(x3bVar, cm9.a(qw0.class), new pp9(19), l96Var), wq7Var);
        gi1 a42 = cm9.a(mw0.class);
        yj0 yj0Var40 = h40.a;
        yj0Var40.e.add(a42);
        nf9 nf9Var40 = yj0Var40.a;
        StringBuilder sb41 = new StringBuilder();
        s21.v(a42, sb41, ':', "", ':');
        sb41.append(nf9Var40);
        linkedHashMap.put(sb41.toString(), h40);
        ima h41 = s21.h(new yj0(x3bVar, cm9.a(uw.class), new pp9(20), l96Var), wq7Var);
        gi1 a43 = cm9.a(sw.class);
        yj0 yj0Var41 = h41.a;
        yj0Var41.e.add(a43);
        nf9 nf9Var41 = yj0Var41.a;
        StringBuilder sb42 = new StringBuilder();
        s21.v(a43, sb42, ':', "", ':');
        sb42.append(nf9Var41);
        linkedHashMap.put(sb42.toString(), h41);
        ima h42 = s21.h(new yj0(x3bVar, cm9.a(x6.class), new pp9(21), l96Var), wq7Var);
        gi1 a44 = cm9.a(t6.class);
        yj0 yj0Var42 = h42.a;
        yj0Var42.e.add(a44);
        nf9 nf9Var42 = yj0Var42.a;
        StringBuilder sb43 = new StringBuilder();
        s21.v(a44, sb43, ':', "", ':');
        sb43.append(nf9Var42);
        linkedHashMap.put(sb43.toString(), h42);
        ima h43 = s21.h(new yj0(x3bVar, cm9.a(ic7.class), new pp9(22), l96Var), wq7Var);
        gi1 a45 = cm9.a(fc7.class);
        yj0 yj0Var43 = h43.a;
        yj0Var43.e.add(a45);
        nf9 nf9Var43 = yj0Var43.a;
        StringBuilder sb44 = new StringBuilder();
        s21.v(a45, sb44, ':', "", ':');
        sb44.append(nf9Var43);
        linkedHashMap.put(sb44.toString(), h43);
        ima h44 = s21.h(new yj0(x3bVar, cm9.a(heb.class), new pp9(23), l96Var), wq7Var);
        gi1 a46 = cm9.a(tdb.class);
        yj0 yj0Var44 = h44.a;
        yj0Var44.e.add(a46);
        nf9 nf9Var44 = yj0Var44.a;
        StringBuilder sb45 = new StringBuilder();
        s21.v(a46, sb45, ':', "", ':');
        sb45.append(nf9Var44);
        linkedHashMap.put(sb45.toString(), h44);
        ima h45 = s21.h(new yj0(x3bVar, cm9.a(yxc.class), new pp9(24), l96Var), wq7Var);
        gi1 a47 = cm9.a(wxc.class);
        yj0 yj0Var45 = h45.a;
        yj0Var45.e.add(a47);
        nf9 nf9Var45 = yj0Var45.a;
        StringBuilder sb46 = new StringBuilder();
        s21.v(a47, sb46, ':', "", ':');
        sb46.append(nf9Var45);
        linkedHashMap.put(sb46.toString(), h45);
    }

    public static int n(EllipticCurve ellipticCurve) {
        return (u2f.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger o(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger a2 = u2f.a(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(a2);
        if (a2.signum() == 1) {
            BigInteger mod2 = mod.mod(a2);
            BigInteger bigInteger2 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger2)) {
                if (a2.testBit(0) && a2.testBit(1)) {
                    bigInteger2 = mod2.modPow(a2.add(BigInteger.ONE).shiftRight(2), a2);
                } else if (a2.testBit(0) && !a2.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = a2.subtract(bigInteger2).shiftRight(1);
                    int i = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(a2);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, a2);
                        BigInteger bigInteger3 = BigInteger.ONE;
                        if (!modPow.add(bigInteger3).equals(a2)) {
                            if (modPow.equals(bigInteger3)) {
                                bigInteger2 = bigInteger2.add(bigInteger3);
                                i++;
                                if (i == 128 && !a2.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        } else {
                            BigInteger shiftRight2 = a2.add(bigInteger3).shiftRight(1);
                            BigInteger bigInteger4 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(a2).multiply(mod3)).mod(a2);
                                BigInteger mod4 = multiply.add(multiply).mod(a2);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(a2);
                                    bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(a2);
                                    bigInteger4 = mod5;
                                } else {
                                    bigInteger3 = mod4;
                                }
                            }
                            bigInteger2 = bigInteger4;
                        }
                    }
                } else {
                    bigInteger2 = null;
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(a2).compareTo(mod2) != 0) {
                    hfd.j("Could not find a modular square root");
                    return null;
                }
            }
            if (z != bigInteger2.testBit(0)) {
                return a2.subtract(bigInteger2).mod(a2);
            }
            return bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECParameterSpec p(bkf bkfVar) {
        int ordinal = bkfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return u2f.c;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(bkfVar)));
            }
            return u2f.b;
        }
        return u2f.a;
    }

    public static ECPoint q(EllipticCurve ellipticCurve, hkf hkfVar, byte[] bArr) {
        int n = n(ellipticCurve);
        int ordinal = hkfVar.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (bArr.length == n * 2) {
                        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, n)), new BigInteger(1, Arrays.copyOfRange(bArr, n, bArr.length)));
                        u2f.g(eCPoint, ellipticCurve);
                        return eCPoint;
                    }
                    hfd.j("invalid point size");
                    return null;
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(hkfVar)));
            }
            BigInteger a2 = u2f.a(ellipticCurve);
            if (bArr.length == n + 1) {
                byte b2 = bArr[0];
                if (b2 != 2) {
                    if (b2 == 3) {
                        z = true;
                    } else {
                        hfd.j("invalid format");
                        return null;
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(a2) < 0) {
                    return new ECPoint(bigInteger, o(bigInteger, z, ellipticCurve));
                }
                hfd.j("x is out of range");
                return null;
            }
            hfd.j("compressed point has wrong length");
            return null;
        } else if (bArr.length == (n * 2) + 1) {
            if (bArr[0] == 4) {
                int i = n + 1;
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
                u2f.g(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            hfd.j("invalid point format");
            return null;
        } else {
            hfd.j("invalid point size");
            return null;
        }
    }

    public static byte[] r(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (u2f.h(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                ECPoint w = eCPublicKey.getW();
                u2f.g(w, eCPrivateKey.getParams().getCurve());
                PublicKey generatePublic = ((KeyFactory) kkf.f.a.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
                KeyAgreement keyAgreement = (KeyAgreement) kkf.d.a.zza("ECDH");
                keyAgreement.init(eCPrivateKey);
                try {
                    keyAgreement.doPhase(generatePublic, true);
                    byte[] generateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger = new BigInteger(1, generateSecret);
                    if (bigInteger.signum() != -1 && bigInteger.compareTo(u2f.a(curve)) < 0) {
                        o(bigInteger, true, curve);
                        return generateSecret;
                    }
                    throw new GeneralSecurityException("shared secret is out of range");
                } catch (IllegalStateException e) {
                    throw new GeneralSecurityException(e);
                }
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
