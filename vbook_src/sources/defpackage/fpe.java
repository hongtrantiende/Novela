package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fpe  reason: default package */
/* loaded from: classes3.dex */
public abstract class fpe {
    public static final tu1 a = new tu1(new wu1(1), false, 1305937837);
    public static final tu1 b = new tu1(new xu1(7), false, 1179784205);
    public static final String[] c = {"document_id", "_display_name", "mime_type"};

    public static void A(int i, int i2, int i3) {
        String B;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                B = nqe.C("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                B = B(i2, i3, "end index");
            }
        } else {
            B = B(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(B);
    }

    public static String B(int i, int i2, String str) {
        if (i < 0) {
            return nqe.C("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return nqe.C("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        vs.m(nk2.s(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    public static final void a(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        str.getClass();
        rv4Var.g0(-1737118665);
        int i2 = i & 1;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2, z)) {
            nq7Var = kq7.a;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ma(str, nq7Var, i, 1);
        }
    }

    public static final void b(qz1 qz1Var, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        xt4 xt4Var6;
        xt4 xt4Var7;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean h;
        int i11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1774051774);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(qz1Var);
            } else {
                h = rv4Var2.h(qz1Var);
            }
            if (h) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var5)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((i2 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nq7 C = rte.C(mwe.u(nq7Var, false, 6).a0(pna.c), rte.u(rv4Var2), 14);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, C);
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
            int i12 = i2;
            xbe.i(rv4Var2, zbe.x(kq7Var, rh8Var));
            cvb.c(yqe.A((y3b) b3b.E0.getValue(), rv4Var2), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 48, 0, 131064);
            nq7 k = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, k);
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
            nq7 k2 = tte.k(kq7Var, r0f.z(rv4Var).a);
            long g = rm1.g(r0f.y(rv4Var), 1.0f);
            ba5 ba5Var = lre.g;
            l0e.j(yqe.A((y3b) b3b.H0.getValue(), rv4Var), cqe.m((q3b) nz.j.getValue(), rv4Var), qz1Var.b, zbe.y(nmd.v(k2, g, ba5Var), 16.0f), xt4Var, rv4Var, (i12 << 3) & 57344);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.j(yqe.A((y3b) b3b.A0.getValue(), rv4Var), cqe.m((q3b) nz.g.getValue(), rv4Var), qz1Var.a, nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), xt4Var2, rv4Var, i12 & 57344);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.j(yqe.A((y3b) b3b.G0.getValue(), rv4Var), cqe.m((q3b) nz.i.getValue(), rv4Var), qz1Var.c, nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f), xt4Var3, rv4Var, (i12 >> 3) & 57344);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) b3b.F0.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k3 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, k3);
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
            rv4Var.e0(636592267);
            nq7 g2 = nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f);
            String A = yqe.A((y3b) b3b.B0.getValue(), rv4Var);
            List m = cqe.m((q3b) nz.h.getValue(), rv4Var);
            int i13 = qz1Var.d;
            if ((i12 & 3670016) == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (!z2 && P != lh9Var) {
                xt4Var6 = xt4Var4;
            } else {
                xt4Var6 = xt4Var4;
                P = new im(3, xt4Var6);
                rv4Var.o0(P);
            }
            l0e.j(A, m, i13, g2, (xt4) P, rv4Var, 0);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            rv4Var.q(false);
            rv4Var.e0(637291999);
            nq7 g3 = nk2.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var, 16.0f);
            boolean z4 = qz1Var.e;
            String A2 = yqe.A((y3b) b3b.y0.getValue(), rv4Var);
            String A3 = yqe.A((y3b) b3b.z0.getValue(), rv4Var);
            if ((i12 & 29360128) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (!z3 && P2 != lh9Var) {
                xt4Var7 = xt4Var5;
            } else {
                xt4Var7 = xt4Var5;
                P2 = new im(4, xt4Var7);
                rv4Var.o0(P2);
            }
            l0e.n(null, A2, A3, g3, false, z4, (xt4) P2, rv4Var, 0, 17);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            rv4Var2.q(false);
            l0e.l(null, yqe.A((y3b) b3b.I0.getValue(), rv4Var2), yqe.A((y3b) b3b.J0.getValue(), rv4Var2), nk2.g(rv4Var2, 1.0f, tte.k(kq7Var, r0f.z(rv4Var2).a), ba5Var, 16.0f), vt4Var, rv4Var2, (i12 >> 12) & 57344, 1);
            rv4Var2.q(true);
            xbe.i(rv4Var2, mwe.u(kq7Var, false, 14));
            rv4Var2.q(true);
        } else {
            xt4Var6 = xt4Var4;
            xt4Var7 = xt4Var5;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new dr0(qz1Var, rh8Var, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var6, xt4Var7, vt4Var, i);
        }
    }

    public static final void c(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(580636753);
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
                pz1 pz1Var = (pz1) ((fdd) voe.z(cm9.a(pz1.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                fxe.h(yqe.A((y3b) f3b.A.getValue(), rv4Var), pna.c, false, jce.E(1355482573, new p7(cz7Var, 10), rv4Var), null, null, jce.E(-1488429092, new cs1(pz1Var, cz7Var, jsc.z(pz1Var.d, rv4Var), 1), rv4Var), rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 11);
        }
    }

    public static u13 d() {
        return new u13(1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final qg6 qg6Var, boolean z, float f, rh8 rh8Var, float f2, long j, long j2, wea weaVar, h3a h3aVar, g3a g3aVar, int i, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        aw7 aw7Var;
        yya yyaVar;
        final yya yyaVar2;
        yya yyaVar3;
        int i7;
        aw7 aw7Var2;
        int i8;
        int i9;
        dm8 dm8Var;
        float f3;
        yya yyaVar4;
        yya yyaVar5;
        yya yyaVar6;
        xt4 xt4Var;
        lh9 lh9Var;
        int i10;
        qg6 qg6Var2;
        yya yyaVar7;
        dm8 dm8Var2;
        boolean z3;
        int i11;
        int i12;
        int ordinal;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        qg6Var.getClass();
        rh8Var.getClass();
        rv4Var.g0(-1888260668);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(qg6Var)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i4 = i23 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(kq7.a)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i4 |= i22;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.g(z)) {
                i21 = 256;
            } else {
                i21 = Token.CASE;
            }
            i4 |= i21;
        }
        int i24 = 2048;
        if ((i2 & 3072) == 0) {
            if (rv4Var.g(false)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i4 |= i20;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.c(f)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i4 |= i19;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.f(rh8Var)) {
                i18 = 131072;
            } else {
                i18 = Parser.ARGC_LIMIT;
            }
            i4 |= i18;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.c(f2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i4 |= i17;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.e(j)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i4 |= i16;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.e(j2)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i4 |= i15;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.f(weaVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        int i25 = -1;
        if ((i3 & 6) == 0) {
            if (h3aVar == null) {
                ordinal = -1;
            } else {
                ordinal = h3aVar.ordinal();
            }
            if (rv4Var.d(ordinal)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (g3aVar != null) {
                i25 = g3aVar.ordinal();
            }
            if (rv4Var.d(i25)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.d(i)) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i5 |= i11;
        }
        if ((i3 & 3072) == 0) {
            if (!rv4Var.h(null)) {
                i24 = 1024;
            }
            i5 |= i24;
        }
        if ((306783379 & i4) == 306783378 && (i5 & 1171) == 1170) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.q(new vv0(qg6Var, 1));
                rv4Var.o0(P);
            }
            yya yyaVar8 = (yya) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = yte.s(rv4Var);
                rv4Var.o0(P2);
            }
            m82 m82Var = (m82) P2;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var2) {
                P3 = yae.z(Boolean.FALSE);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) P3;
            Object P4 = rv4Var.P();
            if (P4 == lh9Var2) {
                P4 = hl5.g(nae.e, rv4Var);
            }
            dm8 dm8Var3 = (dm8) P4;
            Object P5 = rv4Var.P();
            if (P5 == lh9Var2) {
                i6 = i4;
                P5 = yae.q(new vv0(qg6Var, 2));
                rv4Var.o0(P5);
            } else {
                i6 = i4;
            }
            final yya yyaVar9 = (yya) P5;
            Object P6 = rv4Var.P();
            if (P6 == lh9Var2) {
                P6 = yae.q(new vv0(qg6Var, 3));
                rv4Var.o0(P6);
            }
            yya yyaVar10 = (yya) P6;
            Object P7 = rv4Var.P();
            if (P7 == lh9Var2) {
                aw7Var = aw7Var3;
                P7 = yae.q(new vv0(qg6Var, 4));
                rv4Var.o0(P7);
            } else {
                aw7Var = aw7Var3;
            }
            yya yyaVar11 = (yya) P7;
            Object P8 = rv4Var.P();
            if (P8 == lh9Var2) {
                yyaVar = yyaVar11;
                P8 = yae.q(new mf6(2, qg6Var, yyaVar10));
                rv4Var.o0(P8);
            } else {
                yyaVar = yyaVar11;
            }
            yya yyaVar12 = (yya) P8;
            Object P9 = rv4Var.P();
            if (P9 == lh9Var2) {
                yyaVar2 = yyaVar10;
                int i26 = i5;
                dm8Var = dm8Var3;
                yya yyaVar13 = yyaVar;
                i9 = i26;
                i7 = i6;
                aw7Var2 = aw7Var;
                i8 = 1;
                yyaVar3 = yyaVar13;
                P9 = yae.q(new xw0(qg6Var, yyaVar2, yyaVar13, yyaVar12, 7));
                rv4Var.o0(P9);
            } else {
                yyaVar2 = yyaVar10;
                yyaVar3 = yyaVar;
                i7 = i6;
                aw7Var2 = aw7Var;
                i8 = 1;
                i9 = i5;
                dm8Var = dm8Var3;
            }
            final yya yyaVar14 = (yya) P9;
            Object P10 = rv4Var.P();
            if (P10 == lh9Var2) {
                f3 = f2;
                P10 = yae.q(new ef6(f3, yyaVar14, i8));
                rv4Var.o0(P10);
            } else {
                f3 = f2;
            }
            yya yyaVar15 = (yya) P10;
            Object P11 = rv4Var.P();
            if (P11 == lh9Var2) {
                final yya yyaVar16 = yyaVar3;
                yyaVar5 = yyaVar8;
                yyaVar4 = yyaVar15;
                final float f4 = f3;
                vt4 vt4Var = new vt4() { // from class: vg6
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        fg6 fg6Var;
                        yya yyaVar17;
                        float f5;
                        qg6 qg6Var3 = qg6.this;
                        eg6 j3 = qg6Var3.j();
                        int i27 = j3.p;
                        float f6 = nae.e;
                        if (i27 != 0 && !j3.m.isEmpty() && (fg6Var = (fg6) yyaVar2.getValue()) != null) {
                            float intValue = fg6Var.a / ((Number) yyaVar16.getValue()).intValue();
                            int i28 = qg6Var3.i();
                            int i29 = (int) (fg6Var.w & 4294967295L);
                            if (i29 == 0) {
                                f5 = 0.0f;
                            } else {
                                f5 = i28 / i29;
                            }
                            float intValue2 = (f5 + intValue) / (j3.p / ((Number) yyaVar17.getValue()).intValue());
                            yya yyaVar18 = yyaVar14;
                            float m = dce.m(1.0f - ((Number) yyaVar18.getValue()).floatValue(), nae.e, 1.0f);
                            float floatValue = ((Number) yyaVar18.getValue()).floatValue();
                            float f7 = f4;
                            int i30 = (floatValue > f7 ? 1 : (floatValue == f7 ? 0 : -1));
                            yya yyaVar19 = yyaVar9;
                            if (i30 >= 0) {
                                f6 = ((Boolean) yyaVar19.getValue()).booleanValue() ? m - intValue2 : intValue2;
                            } else {
                                float f8 = 1.0f - f7;
                                f6 = ((Boolean) yyaVar19.getValue()).booleanValue() ? ((m - intValue2) * f8) / m : (intValue2 * f8) / m;
                            }
                        }
                        return Float.valueOf(f6);
                    }
                };
                yyaVar3 = yyaVar16;
                yyaVar6 = yyaVar9;
                P11 = yae.q(vt4Var);
                rv4Var.o0(P11);
            } else {
                yyaVar4 = yyaVar15;
                yyaVar5 = yyaVar8;
                yyaVar6 = yyaVar9;
            }
            yya yyaVar17 = (yya) P11;
            Object P12 = rv4Var.P();
            if (P12 == lh9Var2) {
                P12 = new gf6(yyaVar4, dm8Var, i8);
                rv4Var.o0(P12);
            }
            xt4 xt4Var2 = (xt4) P12;
            Object P13 = rv4Var.P();
            if (P13 == lh9Var2) {
                dm8 dm8Var4 = dm8Var;
                yyaVar7 = yyaVar17;
                lh9Var = lh9Var2;
                P13 = new wg6(xt4Var2, qg6Var, m82Var, yyaVar3, dm8Var4, f2, yyaVar14, yyaVar2, 0);
                xt4Var = xt4Var2;
                qg6Var2 = qg6Var;
                dm8Var2 = dm8Var4;
                i10 = 1;
                rv4Var.o0(P13);
            } else {
                xt4Var = xt4Var2;
                lh9Var = lh9Var2;
                i10 = i8;
                qg6Var2 = qg6Var;
                yyaVar7 = yyaVar17;
                dm8Var2 = dm8Var;
            }
            xt4 xt4Var3 = (xt4) P13;
            Object P14 = rv4Var.P();
            if (P14 == lh9Var) {
                P14 = new qp4(aw7Var2, 24);
                rv4Var.o0(P14);
            }
            xt4 xt4Var4 = (xt4) P14;
            if (!qg6Var2.h.a() && !((Boolean) aw7Var2.getValue()).booleanValue()) {
                z3 = 0;
            } else {
                z3 = i10;
            }
            Object P15 = rv4Var.P();
            if (P15 == lh9Var) {
                P15 = new jw0(yyaVar5, 22);
                rv4Var.o0(P15);
            }
            vt4 vt4Var2 = (vt4) P15;
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            float h = dm8Var2.h();
            boolean booleanValue2 = ((Boolean) yyaVar6.getValue()).booleanValue();
            Object P16 = rv4Var.P();
            if (P16 == lh9Var) {
                P16 = new jw0(yyaVar4, 23);
                rv4Var.o0(P16);
            }
            vt4 vt4Var3 = (vt4) P16;
            Object P17 = rv4Var.P();
            if (P17 == lh9Var) {
                P17 = new jw0(yyaVar7, 24);
                rv4Var.o0(P17);
            }
            int i27 = i7 >> 3;
            g(rh8Var, z, i, weaVar, f, j, j2, g3aVar, h3aVar, vt4Var2, booleanValue, h, booleanValue2, vt4Var3, (vt4) P17, z3, xt4Var, xt4Var3, xt4Var4, rv4Var, (i27 & 29360128) | (i27 & 14) | ((i7 >> 12) & Token.ASSIGN_MOD) | (i7 & 896) | ((i9 << 3) & 7168) | ((i7 >> 15) & 57344) | (458752 & (i7 << 3)) | (3670016 & i27) | ((i9 << 21) & 234881024) | ((i9 << 27) & 1879048192), ((i9 >> 9) & 14) | 907739184);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lf6(qg6Var, z, f, rh8Var, f2, j, j2, weaVar, h3aVar, g3aVar, i, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.qg6 r23, final defpackage.nq7 r24, boolean r25, final float r26, final defpackage.rh8 r27, float r28, final long r29, final long r31, defpackage.wea r33, defpackage.h3a r34, defpackage.g3a r35, int r36, boolean r37, final defpackage.tu1 r38, defpackage.rv4 r39, final int r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.f(qg6, nq7, boolean, float, rh8, float, long, long, wea, h3a, g3a, int, boolean, tu1, rv4, int, int, int):void");
    }

    public static final void g(rh8 rh8Var, boolean z, int i, wea weaVar, float f, long j, long j2, g3a g3aVar, h3a h3aVar, vt4 vt4Var, boolean z2, float f2, boolean z3, vt4 vt4Var2, vt4 vt4Var3, boolean z4, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2, int i3) {
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        float f3;
        rv4Var.g0(-1266139707);
        int i7 = i2 & 6;
        kq7 kq7Var = kq7.a;
        if (i7 == 0) {
            i4 = (rv4Var.f(kq7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rv4Var.f(rh8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z;
            i4 |= rv4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rv4Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rv4Var.f(weaVar) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i4 |= rv4Var.c(f) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= rv4Var.e(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= rv4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= rv4Var.d(g3aVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 805306368;
            i4 |= rv4Var.d(h3aVar.ordinal()) ? 536870912 : 268435456;
        } else {
            i5 = 805306368;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (rv4Var.h(null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= rv4Var.h(vt4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z6 = z2;
            i6 |= rv4Var.g(z6) ? 256 : Token.CASE;
        } else {
            z6 = z2;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i6 |= rv4Var.c(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        int i10 = i4;
        if ((i3 & 24576) == 0) {
            i6 |= rv4Var.g(z3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= rv4Var.h(vt4Var3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= rv4Var.g(z4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= rv4Var.h(xt4Var) ? 67108864 : 33554432;
        }
        if ((i3 & i5) == 0) {
            i6 |= rv4Var.h(xt4Var2) ? 536870912 : 268435456;
        }
        if (rv4Var.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            nq7 f4 = pna.f(kq7Var, 1.0f);
            int i11 = i10 & Token.ASSIGN_MOD;
            boolean z7 = i11 == 32;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z7 || P == obj) {
                P = new rg3(rh8Var.d());
                rv4Var.o0(P);
            }
            float f5 = ((rg3) P).a;
            boolean z8 = i11 == 32;
            Object P2 = rv4Var.P();
            if (z8 || P2 == obj) {
                Object rg3Var = new rg3(rh8Var.a());
                rv4Var.o0(rg3Var);
                P2 = rg3Var;
            }
            hc2.b(zbe.C(f4, nae.e, f5, nae.e, ((rg3) P2).a, 5), null, jce.E(312797231, new if6(rh8Var, z5, z6, j2, j, i, weaVar, f, g3aVar, z3, xt4Var2, f3, h3aVar, vt4Var2, vt4Var3, z4, vt4Var, xt4Var, xt4Var3, 1), rv4Var), rv4Var, 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jf6(rh8Var, z, i, weaVar, f, j, j2, g3aVar, h3aVar, vt4Var, z2, f2, z3, vt4Var2, vt4Var3, z4, xt4Var, xt4Var2, xt4Var3, i2, i3, 1);
        }
    }

    public static final void h(final boolean z, final boolean z2, final long j, final boolean z3, final xt4 xt4Var, final lu4 lu4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        xt4Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(2015602500);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.e(j)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i11 & 1, z4)) {
            if (z2) {
                rv4Var.e0(-1123470440);
                int i12 = i11 >> 3;
                j(z, j, z3, null, xt4Var, lu4Var, rv4Var, (i11 & 14) | (i12 & Token.ASSIGN_MOD) | (i12 & 896) | 24576 | (i11 & 458752));
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1123236173);
                int i13 = i11 >> 3;
                i(z, j, z3, null, xt4Var, lu4Var, rv4Var, (i11 & 14) | (i13 & Token.ASSIGN_MOD) | (i13 & 896) | 24576 | (i11 & 458752));
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, z2, j, z3, xt4Var, lu4Var, i) { // from class: bp7
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ xt4 e;
                public final /* synthetic */ lu4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(24577);
                    fpe.h(this.a, this.b, this.c, this.d, this.e, this.f, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(boolean z, final long j, final boolean z2, nq7 nq7Var, xt4 xt4Var, final lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z3;
        kq7 kq7Var;
        int i4;
        int i5;
        rv4Var.g0(-221941169);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if ((i & 48) == 0) {
            if (rv4Var.e(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z2)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        int i7 = i6 | 3072;
        if (rv4Var.h(lu4Var)) {
            i3 = 131072;
        } else {
            i3 = Parser.ARGC_LIMIT;
        }
        int i8 = i7 | i3;
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i8 & 1, z3)) {
            kq7 kq7Var2 = kq7.a;
            nmd.d(z, xt4Var, kq7Var2, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(1339736747, new mu4() { // from class: dp7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zn1) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z4)) {
                        fpe.m(j, z2, zbe.C(zbe.A(mwe.x(pna.f(kq7.a, 1.0f), 14), 12.0f, nae.e, 2), nae.e, nae.e, nae.e, 12.0f, 7), lu4Var, rv4Var2, 0, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i8 & 14) | 3504, 48, 2032);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ep7(z, j, z2, kq7Var, xt4Var, lu4Var, i, 0);
        }
    }

    public static final void j(boolean z, long j, boolean z2, nq7 nq7Var, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z3;
        kq7 kq7Var;
        int i4;
        int i5;
        rv4Var.g0(145945627);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if ((i & 48) == 0) {
            if (rv4Var.e(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z2)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        int i7 = i6 | 3072;
        if (rv4Var.h(lu4Var)) {
            i3 = 131072;
        } else {
            i3 = Parser.ARGC_LIMIT;
        }
        int i8 = i7 | i3;
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i8 & 1, z3)) {
            kq7 kq7Var2 = kq7.a;
            xb.d(z, xt4Var, null, kq7Var2, null, null, nq2.a, null, 0L, 0L, nae.e, false, false, jce.E(-1693198905, new aa3(j, z2, lu4Var), rv4Var), rv4Var, (i8 & 14) | 1575984, 8116);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ep7(z, j, z2, kq7Var, xt4Var, lu4Var, i, 1);
        }
    }

    public static final bx8 k(Uri uri) {
        String path;
        uri.getClass();
        File file = null;
        if (r4b.J(uri.getScheme(), "file", true) && (path = uri.getPath()) != null) {
            file = new File(path);
        }
        if (file != null) {
            return new bx8(new zi(file));
        }
        return new bx8(new aj(uri));
    }

    public static final void l(boolean z, yxa yxaVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        int i5;
        rv4Var.g0(-881270319);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(yxaVar);
            } else {
                h = rv4Var.h(yxaVar);
            }
            if (h) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            b37 d = fu0.d(kh5.b, false);
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
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new dva(4);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P)).a(zt3.k(null, 0.9f, 0L, 5));
            lz3 i6 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new dva(5);
                rv4Var.o0(P2);
            }
            rte.c(z, null, a2, i6.a(zt3.x((xt4) P2)).a(zt3.m(0.9f, 0L, 5)), null, jce.E(1744452019, new pl7(yxaVar, 13), rv4Var), rv4Var, (i2 & 14) | 200064, 18);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z52(i, 7, yxaVar, nq7Var, z);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void m(final long j, final boolean z, nq7 nq7Var, final lu4 lu4Var, rv4 rv4Var, final int i, final int i2) {
        int i3;
        int i4;
        nq7 nq7Var2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        final nq7 nq7Var3;
        kq7 kq7Var;
        boolean z3;
        int i8;
        zx1 zx1Var;
        np npVar;
        aw7 aw7Var;
        lh9 lh9Var;
        kq7 kq7Var2;
        ?? r2;
        aw7 aw7Var2;
        aw7 aw7Var3;
        boolean z4;
        v72 v72Var;
        boolean z5;
        int i9;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1248428763);
        if (rv4Var2.e(j)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i | i3;
        if (rv4Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        int i12 = i2 & 4;
        if (i12 != 0) {
            i6 = i11 | 384;
            nq7Var2 = nq7Var;
        } else {
            nq7Var2 = nq7Var;
            if (rv4Var2.f(nq7Var2)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i6 = i11 | i5;
        }
        if (rv4Var2.h(lu4Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i13 = i6 | i7;
        if ((i13 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i13 & 1, z2)) {
            kq7 kq7Var3 = kq7.a;
            if (i12 != 0) {
                kq7Var = kq7Var3;
            } else {
                kq7Var = nq7Var2;
            }
            Object P = rv4Var2.P();
            long j2 = 0;
            lh9 lh9Var2 = ax1.a;
            Long[] lArr = P;
            if (P == lh9Var2) {
                Long[] lArr2 = {0L, 900L, 1800L, 3600L, 5400L};
                rv4Var2.o0(lArr2);
                lArr = lArr2;
            }
            Long[] lArr3 = (Long[]) lArr;
            if ((i13 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var2) {
                long j3 = j / 60;
                if (j3 >= 0) {
                    j2 = j3;
                }
                String valueOf = String.valueOf(j2);
                int length = valueOf.length();
                P2 = yae.z(new jub(valueOf, sze.a(length, length), 4));
                rv4Var2.o0(P2);
            }
            aw7 aw7Var4 = (aw7) P2;
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var2) {
                int r0 = b00.r0(Long.valueOf(j), lArr3);
                Integer valueOf2 = Integer.valueOf(r0);
                if (r0 == -1) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    i9 = valueOf2.intValue();
                } else {
                    i9 = 5;
                }
                P3 = yae.z(Integer.valueOf(i9));
                rv4Var2.o0(P3);
            }
            aw7 aw7Var5 = (aw7) P3;
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var2) {
                P4 = yae.z(Boolean.valueOf(z));
                rv4Var2.o0(P4);
            }
            aw7 aw7Var6 = (aw7) P4;
            List m = cqe.m((q3b) nz.H.getValue(), rv4Var2);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, kq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar2 = qw1.f;
            jce.F(npVar2, rv4Var2, a2);
            np npVar3 = qw1.e;
            jce.F(npVar3, rv4Var2, l);
            Integer valueOf3 = Integer.valueOf(hashCode);
            np npVar4 = qw1.g;
            jce.F(npVar4, rv4Var2, valueOf3);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar5 = qw1.d;
            jce.F(npVar5, rv4Var2, p);
            nq7 nq7Var4 = kq7Var;
            s9e.f(zbe.z(pna.f(kq7Var3, 1.0f), 12.0f, 12.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(-2112190218, new gg7(m, aw7Var5, 3), rv4Var2), rv4Var, 1573302);
            rv4 rv4Var3 = rv4Var;
            if (((Number) aw7Var5.getValue()).intValue() == 5) {
                rv4Var3.e0(-551617898);
                Object P5 = rv4Var3.P();
                if (P5 == lh9Var2) {
                    P5 = s21.e(rv4Var3);
                }
                zm4 zm4Var = (zm4) P5;
                Object P6 = rv4Var3.P();
                if (P6 == lh9Var2) {
                    P6 = new l24(zm4Var, null, 7);
                    rv4Var3.o0(P6);
                }
                yte.g((lu4) P6, rv4Var3, pvc.a);
                jub jubVar = (jub) aw7Var4.getValue();
                t86 t86Var = new t86(3, 7, Token.HOOK);
                v72 v72Var2 = ((h27) rv4Var3.j(j27.a)).c.b;
                nq7 A = zbe.A(mwe.n(pna.f(kq7Var3, 1.0f), zm4Var), 12.0f, nae.e, 2);
                boolean f = rv4Var3.f(aw7Var4);
                Object P7 = rv4Var3.P();
                if (!f && P7 != lh9Var2) {
                    v72Var = v72Var2;
                    z5 = true;
                } else {
                    v72Var = v72Var2;
                    z5 = true;
                    P7 = new qo7(aw7Var4, 1);
                    rv4Var3.o0(P7);
                }
                i8 = i13;
                npVar = npVar2;
                aw7Var = aw7Var4;
                kq7Var2 = kq7Var3;
                r2 = 0;
                aw7Var2 = aw7Var5;
                zx1Var = zx1Var2;
                lh9Var = lh9Var2;
                uwe.g(jubVar, (xt4) P7, A, false, null, nq2.b, nq2.c, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var, 102236160, 12779520, 6127288);
                rv4Var3 = rv4Var;
                rv4Var3.q(false);
            } else {
                i8 = i13;
                zx1Var = zx1Var2;
                npVar = npVar2;
                aw7Var = aw7Var4;
                lh9Var = lh9Var2;
                kq7Var2 = kq7Var3;
                r2 = 0;
                aw7Var2 = aw7Var5;
                rv4Var3.e0(-550515631);
                rv4Var3.q(false);
            }
            nq7 A2 = zbe.A(pna.f(kq7Var2, 1.0f), 4.0f, nae.e, 2);
            Object P8 = rv4Var3.P();
            if (P8 == lh9Var) {
                aw7Var3 = aw7Var6;
                P8 = new ao7(aw7Var3, 5);
                rv4Var3.o0(P8);
            } else {
                aw7Var3 = aw7Var6;
            }
            nq7 t = q1d.t(1, (vt4) P8, rv4Var3, A2, r2);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, t);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar, rv4Var3, a3);
            jce.F(npVar3, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar4, rv4Var3, kgVar);
            jce.F(npVar5, rv4Var3, p2);
            boolean booleanValue = ((Boolean) aw7Var3.getValue()).booleanValue();
            Object P9 = rv4Var3.P();
            if (P9 == lh9Var) {
                P9 = new qo7(aw7Var3, 2);
                rv4Var3.o0(P9);
            }
            ase.b(booleanValue, (xt4) P9, null, false, null, rv4Var3, 48);
            aw7 aw7Var7 = aw7Var3;
            cvb.c(yqe.A((y3b) z1b.b0.getValue(), rv4Var3), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(j27.a)).b.j, rv4Var, 0, 0, 131070);
            rs8.u(rv4Var, true, kq7Var2, 12.0f, rv4Var);
            ar5 c2 = rp5.c((wk3) jk3.v.getValue(), rv4Var, r2);
            String A3 = yqe.A((y3b) b3b.F.getValue(), rv4Var);
            nq7 A4 = zbe.A(pna.f(kq7Var2, 1.0f), 16.0f, nae.e, 2);
            if ((i8 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = r2;
            }
            aw7 aw7Var8 = aw7Var;
            boolean f2 = rv4Var.f(aw7Var8) | z4 | rv4Var.h(lArr3);
            Object P10 = rv4Var.P();
            if (f2 || P10 == lh9Var) {
                P10 = new w24(lu4Var, lArr3, aw7Var2, aw7Var8, aw7Var7, 2);
                rv4Var.o0(P10);
            }
            z1d.f(c2, A3, false, null, A4, null, null, null, (vt4) P10, rv4Var, 24576, 236);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            nq7Var3 = nq7Var4;
        } else {
            rv4Var2.X();
            nq7Var3 = nq7Var2;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(j, z, nq7Var3, lu4Var, i, i2) { // from class: cp7
                public final /* synthetic */ long a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ nq7 c;
                public final /* synthetic */ lu4 d;
                public final /* synthetic */ int e;

                {
                    this.e = i2;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p3 = xoe.p(1);
                    fpe.m(this.a, this.b, this.c, this.d, (rv4) obj, p3, this.e);
                    return pvc.a;
                }
            };
        }
    }

    public static final void n(int i, long j, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2;
        rv4Var.g0(225133013);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 a0 = tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d).a0(new nla(((h27) rv4Var.j(tzaVar)).c.d, new lea(zl1.b(0.2f, ((h27) rv4Var.j(tzaVar)).a.q), (Float.floatToRawIntBits(6.0f) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32))));
            long g = rm1.g(((h27) rv4Var.j(tzaVar)).a, 10.0f);
            ba5 ba5Var = lre.g;
            nq7 v = nmd.v(nmd.v(a0, g, ba5Var), zl1.b(0.3f, j), ba5Var);
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            cvb.c(str, zbe.z(kq7.a, 16.0f, 8.0f), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.j, rv4Var, (i5 & 14) | 432, 0, 131064);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new aya(str, j, nq7Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01db, code lost:
        if (r0.length() > 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a5, code lost:
        if (r0.length() > 0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c1 A[EDGE_INSN: B:145:0x01c1->B:114:0x01c1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197 A[Catch: all -> 0x01a8, TryCatch #5 {IllegalArgumentException | SecurityException -> 0x01b5, blocks: (B:82:0x0170, B:102:0x01ab, B:84:0x017a, B:87:0x0182, B:89:0x0188, B:92:0x018f, B:95:0x0197, B:97:0x01a1), top: B:136:0x0170 }] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String o(defpackage.bx8 r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.o(bx8):java.lang.String");
    }

    public static final String p(bx8 bx8Var) {
        bx8Var.getClass();
        yqe yqeVar = bx8Var.a;
        if (yqeVar instanceof zi) {
            return w(bx8Var).toString();
        }
        if (yqeVar instanceof aj) {
            String uri = ((aj) yqeVar).b.toString();
            uri.getClass();
            return uri;
        }
        xk5.o();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00b8: INVOKE  (r7 I:d89) type: VIRTUAL call: d89.a():void, block:B:52:0x00b8 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: all -> 0x0031, TryCatch #5 {all -> 0x00b0, blocks: (B:43:0x00a7, B:12:0x002d, B:27:0x007a, B:29:0x0082, B:30:0x008d, B:37:0x009d, B:24:0x0069, B:39:0x00a0, B:41:0x00a5, B:42:0x00a6, B:23:0x0063), top: B:59:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00b0, blocks: (B:43:0x00a7, B:12:0x002d, B:27:0x007a, B:29:0x0082, B:30:0x008d, B:37:0x009d, B:24:0x0069, B:39:0x00a0, B:41:0x00a5, B:42:0x00a6, B:23:0x0063), top: B:59:0x0021 }] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nz4, n42] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ta1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:27:0x007a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.n42 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.nz4
            if (r0 == 0) goto L13
            r0 = r10
            nz4 r0 = (defpackage.nz4) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            nz4 r0 = new nz4
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            n82 r1 = defpackage.n82.a
            int r2 = r0.f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            qy0 r2 = r0.d
            ta1 r6 = r0.c
            d89 r7 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L31
            goto L7a
        L31:
            r10 = move-exception
            goto Lb2
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r4
        L3a:
            defpackage.hre.r(r10)
            r10 = 6
            xy0 r6 = defpackage.xpe.a(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            jk r2 = new jk
            r7 = 11
            r2.<init>(r7, r10, r6)
            java.lang.Object r7 = defpackage.dra.c
            monitor-enter(r7)
            java.util.List r8 = defpackage.dra.i     // Catch: java.lang.Throwable -> Lbc
            java.util.ArrayList r8 = defpackage.sl1.o0(r8, r2)     // Catch: java.lang.Throwable -> Lbc
            defpackage.dra.i = r8     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r7)
            defpackage.dra.a()
            d89 r7 = new d89
            r8 = 3
            r7.<init>(r2, r8)
            qy0 r2 = new qy0     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L69:
            r0.a = r8     // Catch: java.lang.Throwable -> L31
            r0.b = r7     // Catch: java.lang.Throwable -> L31
            r0.c = r6     // Catch: java.lang.Throwable -> L31
            r0.d = r2     // Catch: java.lang.Throwable -> L31
            r0.f = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto La7
            java.lang.Object r10 = r2.c()     // Catch: java.lang.Throwable -> L31
            pvc r10 = (defpackage.pvc) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = defpackage.dra.c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            lz4 r9 = defpackage.dra.j     // Catch: java.lang.Throwable -> La4
            uv7 r9 = r9.h     // Catch: java.lang.Throwable -> La4
            if (r9 == 0) goto L9c
            boolean r9 = r9.h()     // Catch: java.lang.Throwable -> La4
            if (r9 != r5) goto L9c
            r9 = r5
            goto L9d
        L9c:
            r9 = r3
        L9d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L69
            defpackage.dra.a()     // Catch: java.lang.Throwable -> L31
            goto L69
        La4:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La7:
            r6.cancel(r4)     // Catch: java.lang.Throwable -> Lb0
            r7.a()
            pvc r10 = defpackage.pvc.a
            return r10
        Lb0:
            r10 = move-exception
            goto Lb8
        Lb2:
            throw r10     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            defpackage.zpe.e(r6, r10)     // Catch: java.lang.Throwable -> Lb0
            throw r0     // Catch: java.lang.Throwable -> Lb0
        Lb8:
            r7.a()
            throw r10
        Lbc:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.q(n42):java.lang.Object");
    }

    public static p71 r() {
        long d = sve.d(4279923688L);
        long j = zl1.e;
        return new p71(d, j, sve.d(4279966495L), j, sve.d(4293980400L), sve.d(4281545523L), sve.d(4288256409L), sve.d(4280361249L), sve.d(4288585374L), sve.d(4287137928L), sve.d(4292927712L), sve.d(4292927712L), sve.d(4293128957L), sve.b(335544320), sve.d(3439323963L), sve.d(4279923688L), sve.b(1713009640), sve.d(4290624957L), sve.b(167772160), sve.b(572158952), sve.d(4279923688L), sve.d(4289930782L), sve.b(251658240));
    }

    public static final sk9 s(sk9 sk9Var, long j) {
        sk9Var.getClass();
        float b2 = mna.b(j);
        float a2 = mna.a(j);
        float f = sk9Var.d;
        float f2 = sk9Var.c;
        float f3 = sk9Var.b;
        float f4 = sk9Var.a;
        if (f4 >= nae.e && f4 <= b2 && f3 >= nae.e && f3 <= a2 && f2 >= nae.e && f2 <= b2 && f >= nae.e && f <= a2) {
            return sk9Var;
        }
        return new sk9(dce.m(f4, nae.e, b2), dce.m(f3, nae.e, a2), dce.m(f2, nae.e, b2), dce.m(f, nae.e, a2));
    }

    public static final yk8 t(Uri uri) {
        String treeDocumentId;
        try {
            try {
                treeDocumentId = DocumentsContract.getDocumentId(uri);
                treeDocumentId.getClass();
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (IllegalArgumentException unused2) {
            treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
            treeDocumentId.getClass();
        }
        String I0 = k4b.I0('/', treeDocumentId, "");
        String E0 = k4b.E0('/', treeDocumentId, treeDocumentId);
        if (I0.length() != 0 && E0.length() != 0 && !E0.equals(treeDocumentId)) {
            return new yk8(I0, E0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mg8 u(defpackage.bx8 r16) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.u(bx8):mg8");
    }

    public static final n21 v(bx8 bx8Var) {
        bx8Var.getClass();
        yqe yqeVar = bx8Var.a;
        if (yqeVar instanceof zi) {
            return qe4.a.A(w(bx8Var));
        }
        if (yqeVar instanceof aj) {
            Context context = (Context) dd4.a.get();
            if (context != null) {
                InputStream openInputStream = context.getContentResolver().openInputStream(((aj) yqeVar).b);
                if (openInputStream != null) {
                    int i = w56.a;
                    return new n21(openInputStream);
                }
                throw new e60(10, "Could not open input stream for Uri", false);
            }
            throw new e60(10, "FileKit Core not initialized properly. You may have disabled App Startup in your app. Please check the documentation: https://filekit.mintlify.app/core/setup#android-setup", false);
        }
        xk5.o();
        return null;
    }

    public static final gn8 w(bx8 bx8Var) {
        bx8Var.getClass();
        yqe yqeVar = bx8Var.a;
        if (yqeVar instanceof zi) {
            String path = ((zi) yqeVar).b.getPath();
            path.getClass();
            return oo8.a(path);
        } else if (!(yqeVar instanceof aj)) {
            xk5.o();
            return null;
        } else {
            throw new e60(10, "Uri-based PlatformFile does not have a Path representation", false);
        }
    }

    public static final String x(sk9 sk9Var) {
        sk9Var.getClass();
        return "[" + yz1.k(2, sk9Var.a) + 'x' + yz1.k(2, sk9Var.b) + ',' + yz1.k(2, sk9Var.c) + 'x' + yz1.k(2, sk9Var.d) + ']';
    }

    public static final bzc y(vzc vzcVar) {
        vzcVar.getClass();
        String str = vzcVar.g;
        String str2 = vzcVar.a;
        String str3 = vzcVar.b;
        String str4 = vzcVar.c;
        int i = vzcVar.d;
        boolean z = vzcVar.e;
        List list = vzcVar.h;
        if (list.isEmpty()) {
            if (str.length() > 0) {
                list = tl1.A(str);
            } else {
                list = ks3.a;
            }
        }
        return new bzc(str2, str3, str4, i, z, list);
    }

    public static void z(int i, int i2) {
        String C;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                vs.m(nk2.s(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                return;
            }
            C = nqe.C("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            C = nqe.C("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(C);
    }
}
