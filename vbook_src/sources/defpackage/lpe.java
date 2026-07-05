package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lpe  reason: default package */
/* loaded from: classes3.dex */
public abstract class lpe implements m5a {
    public static final tu1 a = new tu1(new tx0(8), false, 229646348);
    public static final tu1 b = new tu1(new wu1(2), false, 870161411);
    public static final StackTraceElement[] c = new StackTraceElement[0];
    public static ar5 d;

    public static final void c(boolean z, boolean z2, List list, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        int i10;
        int i11;
        rv4Var.g0(1480844034);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(rh8Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            obj = xt4Var2;
            if (rv4Var.h(obj)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        } else {
            obj = xt4Var2;
        }
        if ((i & 12582912) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((i2 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !rv4Var.f(list))) {
                z4 = false;
            } else {
                z4 = true;
            }
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (z4 || P == obj2) {
                P = yae.z(list);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            bkd r = mwe.r(mwe.r(rh8Var, mwe.f(14, rv4Var, false)), zbe.j(nae.e, nae.e, nae.e, 12.0f, 7));
            kj6 a2 = mj6.a(0, rv4Var, 0, 3);
            boolean f = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (!f && P2 != obj2) {
                i3 = i2;
            } else {
                i3 = i2;
                P2 = new a42(aw7Var, null, 0);
                rv4Var.o0(P2);
            }
            vo9 B = vqe.B(a2, r, (nu4) P2, rv4Var, 12);
            bkd r2 = mwe.r(r, zbe.h(2, 16.0f));
            bkd r3 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean f2 = rv4Var.f(B);
            if ((i3 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = f2 | z5;
            if ((i3 & 458752) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            if ((i3 & Token.ASSIGN_MOD) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z12 = z11 | z7;
            if ((i3 & 3670016) == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean f3 = z12 | z8 | rv4Var.f(aw7Var);
            if ((i3 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z13 = f3 | z9;
            Object P3 = rv4Var.P();
            if (z13 || P3 == obj2) {
                Object w32Var = new w32(B, z2, obj, z, xt4Var, aw7Var, xt4Var3);
                rv4Var.o0(w32Var);
                P3 = w32Var;
            }
            pc2.c(nq7Var, a2, r2, hzVar, null, null, false, r3, 0L, 0L, nae.e, (xt4) P3, rv4Var, ((i3 >> 12) & 14) | 24576, 0, 3816);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x32(z, z2, list, rh8Var, nq7Var, xt4Var, xt4Var2, xt4Var3, i);
        }
    }

    public static final void f(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        boolean z3 = z;
        rv4Var2.g0(990135047);
        if (rv4Var2.g(z3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            String[] strArr = P;
            if (P == lh9Var) {
                String[] strArr2 = {"#F2C24F", "#EE7950", "#97C15C", "#60C3D7"};
                rv4Var2.o0(strArr2);
                strArr = strArr2;
            }
            String[] strArr3 = (String[]) strArr;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(78477272);
            int length = strArr3.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                String str = strArr3[i8];
                int i10 = i9 + 1;
                boolean f = rv4Var2.f(str);
                Object P2 = rv4Var2.P();
                if (f || P2 == lh9Var) {
                    zl1 zl1Var = new zl1(kve.v(str));
                    rv4Var2.o0(zl1Var);
                    P2 = zl1Var;
                }
                long j = ((zl1) P2).a;
                nq7 n = pna.n(zbe.C(kq7Var, 20.0f * i9, nae.e, nae.e, nae.e, 14), 28.0f);
                su9 su9Var = uu9.a;
                nq7 k = tte.k(n, su9Var);
                long j2 = ((h27) rv4Var2.j(j27.a)).a.p;
                ba5 ba5Var = lre.g;
                fu0.a(nmd.v(tte.k(zbe.y(nmd.v(k, j2, ba5Var), 2.0f), su9Var), j, ba5Var), rv4Var2, 0);
                i8++;
                i9 = i10;
            }
            rv4Var2.q(false);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            String A = yqe.A((y3b) s2b.u0.getValue(), rv4Var2);
            tza tzaVar = j27.a;
            cvb.c(A, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var2, 0, 0, 131064);
            rv4Var2 = rv4Var;
            z3 = z;
            tte.g(z3, false, null, xt4Var, rv4Var2, (i7 & 14) | ((i7 << 3) & 7168), 6);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new t32(z3, nq7Var, xt4Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void g(do9 do9Var, m32 m32Var, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        rv4 rv4Var2;
        ?? r7;
        ar5 c2;
        boolean z3;
        String A;
        float f;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        int i8;
        m32 m32Var2 = m32Var;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(-1221435031);
        if ((i & 6) == 0) {
            if (rv4Var3.f(do9Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var3.f(m32Var2);
            } else {
                h = rv4Var3.h(m32Var2);
            }
            if (h) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var3.f(nq7Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var3.h(vt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var3.h(xt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        int i9 = i2;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i9 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(qw1.f, rv4Var3, a2);
            jce.F(qw1.e, rv4Var3, l);
            jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var3);
            jce.F(qw1.d, rv4Var3, p);
            ar5 c3 = rp5.c((wk3) jk3.N.getValue(), rv4Var3, 0);
            kq7 kq7Var = kq7.a;
            nk5.a(c3, null, zbe.y(kqe.i(do9Var, pna.n(kq7Var, 40.0f), vt4Var, 23), 8.0f), 0L, rv4Var3, 48, 8);
            xbe.i(rv4Var3, pna.s(kq7Var, 8.0f));
            ly lyVar = m32Var2.c;
            String str = m32Var2.a;
            if (lyVar == null) {
                rv4Var3.e0(1712028837);
                switch (str.hashCode()) {
                    case -1335458389:
                        r7 = 0;
                        if (str.equals("delete")) {
                            rv4Var3.e0(470885806);
                            c2 = rp5.c((wk3) jk3.I.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case -1097452282:
                        r7 = 0;
                        if (str.equals("lockup")) {
                            rv4Var3.e0(470870160);
                            c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case -906336856:
                        r7 = 0;
                        if (str.equals("search")) {
                            rv4Var3.e0(470890856);
                            c2 = rp5.c((wk3) ok3.l0.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case 115187:
                        r7 = 0;
                        if (str.equals("tts")) {
                            rv4Var3.e0(470883180);
                            c2 = rp5.c((wk3) ok3.g.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case 3059573:
                        r7 = 0;
                        if (str.equals("copy")) {
                            rv4Var3.e0(470875342);
                            c2 = rp5.c((wk3) jk3.C.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case 3108362:
                        r7 = 0;
                        if (str.equals("edit")) {
                            rv4Var3.e0(470888422);
                            c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case 3387378:
                        r7 = 0;
                        if (str.equals("note")) {
                            rv4Var3.e0(470872842);
                            c2 = rp5.c((wk3) ok3.P.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case 109400031:
                        r7 = 0;
                        if (str.equals("share")) {
                            rv4Var3.e0(470877995);
                            c2 = rp5.c((wk3) ok3.q.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                    case 1052832078:
                        if (str.equals("translate")) {
                            rv4Var3.e0(470880683);
                            c2 = rp5.c((wk3) rk3.m.getValue(), rv4Var3, 0);
                            rv4Var3.q(false);
                            break;
                        }
                    default:
                        r7 = 0;
                        rv4Var3.e0(470892912);
                        c2 = rp5.c((wk3) jk3.Z.getValue(), rv4Var3, r7);
                        rv4Var3.q(r7);
                        break;
                }
                tza tzaVar = j27.a;
                nk5.a(c2, "", pna.n(kq7Var, 24.0f), ((h27) rv4Var3.j(tzaVar)).a.q, rv4Var3, 432, 0);
                xbe.i(rv4Var3, pna.s(kq7Var, 8.0f));
                switch (str.hashCode()) {
                    case -1335458389:
                        z3 = false;
                        if (str.equals("delete")) {
                            rv4Var3.e0(470919430);
                            A = yqe.A((y3b) o2b.y.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case -1097452282:
                        z3 = false;
                        if (str.equals("lockup")) {
                            rv4Var3.e0(470905094);
                            A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case -906336856:
                        z3 = false;
                        if (str.equals("search")) {
                            rv4Var3.e0(470924166);
                            A = yqe.A((y3b) b3b.J.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case 115187:
                        z3 = false;
                        if (str.equals("tts")) {
                            rv4Var3.e0(470917029);
                            A = yqe.A((y3b) k3b.J0.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case 3059573:
                        z3 = false;
                        if (str.equals("copy")) {
                            rv4Var3.e0(470909764);
                            A = yqe.A((y3b) o2b.i.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case 3108362:
                        z3 = false;
                        if (str.equals("edit")) {
                            rv4Var3.e0(470921796);
                            A = yqe.A((y3b) o2b.a0.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case 3387378:
                        z3 = false;
                        if (str.equals("note")) {
                            rv4Var3.e0(470907460);
                            A = yqe.A((y3b) x2b.t0.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case 109400031:
                        z3 = false;
                        if (str.equals("share")) {
                            rv4Var3.e0(470912101);
                            A = yqe.A((y3b) k3b.n0.getValue(), rv4Var3);
                            rv4Var3.q(false);
                            break;
                        }
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                    case 1052832078:
                        if (str.equals("translate")) {
                            rv4Var3.e0(470914601);
                            A = yqe.A((y3b) o3b.W.getValue(), rv4Var3);
                            z3 = false;
                            rv4Var3.q(false);
                            break;
                        }
                    default:
                        z3 = false;
                        rv4Var3.e0(470926150);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var3);
                        rv4Var3.q(z3);
                        break;
                }
                String str2 = A;
                oyb oybVar = ((h27) rv4Var3.j(tzaVar)).b.j;
                long j = ((h27) rv4Var3.j(tzaVar)).a.q;
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                z2 = true;
                we6 we6Var = new we6(f, true);
                i3 = i9;
                cvb.c(str2, we6Var, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(z3);
                m32Var2 = m32Var;
            } else {
                i3 = i9;
                z2 = true;
                rv4Var3.e0(1714077193);
                boolean f2 = rv4Var3.f(str);
                Object P = rv4Var3.P();
                if (f2 || P == ax1.a) {
                    P = zxe.i(lyVar.d);
                    rv4Var3.o0(P);
                }
                dxe.i((nl5) P, "", tte.k(pna.n(kq7Var, 24.0f), uu9.a), rv4Var, 24624, 232);
                xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
                m32Var2 = m32Var;
                String str3 = m32Var2.b;
                tza tzaVar2 = j27.a;
                oyb oybVar2 = ((h27) rv4Var.j(tzaVar2)).b.j;
                long j2 = ((h27) rv4Var.j(tzaVar2)).a.q;
                float f3 = 1.0f;
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f3 = Float.MAX_VALUE;
                }
                cvb.c(str3, new we6(f3, true), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var, 0, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            rv4 rv4Var4 = rv4Var2;
            tte.g(m32Var2.d, false, null, xt4Var, rv4Var4, (i3 >> 3) & 7168, 6);
            rv4Var3 = rv4Var4;
            rv4Var3.q(z2);
        } else {
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new ud1((Object) do9Var, (Object) m32Var2, nq7Var, (hu4) vt4Var, xt4Var, i, 2);
        }
    }

    public static final void h(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(1993084950);
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
                h42 h42Var = (h42) ((fdd) voe.z(cm9.a(h42.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                fxe.h(yqe.A((y3b) f3b.b0.getValue(), rv4Var), pna.c, false, jce.E(1929995154, new p7(cz7Var, 12), rv4Var), null, null, jce.E(-1280565983, new u32(0, h42Var, jsc.z(h42Var.d, rv4Var)), rv4Var), rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 13);
        }
    }

    public static final void i(boolean z, String str, List list, List list2, int i, float f, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        char c3;
        boolean z2;
        str.getClass();
        list.getClass();
        list2.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        xt4Var6.getClass();
        xt4Var7.getClass();
        rv4Var.g0(-1922778723);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        char c4 = 256;
        if (rv4Var.f(list)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i15 = i14 | i5;
        if (rv4Var.f(list2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (rv4Var.d(i)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (rv4Var.c(f)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i8;
        if (rv4Var.h(xt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(xt4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (rv4Var.h(xt4Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (rv4Var.h(xt4Var4)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if (rv4Var.h(xt4Var5)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var6)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i23 = c2 | c3;
        if (!rv4Var.h(xt4Var7)) {
            c4 = 128;
        }
        int i24 = i23 | c4;
        if ((306783379 & i22) == 306783378 && (i24 & Token.EXPR_VOID) == 146) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i22 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(478435306);
                j(z, str, list, list2, i, f, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, rv4Var, i22 & 2147483646);
                rv4Var.q(false);
            } else {
                rv4Var.e0(479071023);
                k(z, str, list, list2, i, f, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, rv4Var, i22 & 2147483646);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new op7(z, str, list, list2, i, f, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, i2, 0);
        }
    }

    public static final void j(boolean z, final String str, final List list, final List list2, final int i, final float f, xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, final xt4 xt4Var7, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        char c3;
        int i13;
        boolean z2;
        int i14;
        rv4Var.g0(1949036095);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i16 = i15 | i4;
        if (rv4Var.f(list)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i17 = i16 | i5;
        if (rv4Var.f(list2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i18 = i17 | i6;
        if (rv4Var.d(i)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i19 = i18 | i7;
        if (rv4Var.c(f)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i8;
        if (rv4Var.h(xt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i21 = i20 | i9;
        if (rv4Var.h(xt4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i22 = i21 | i10;
        if (rv4Var.h(xt4Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i23 = i22 | i11;
        if (rv4Var.h(xt4Var4)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i24 = i23 | i12;
        if (rv4Var.h(xt4Var5)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var6)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i25 = c2 | c3;
        if (rv4Var.h(xt4Var7)) {
            i13 = 256;
        } else {
            i13 = Token.CASE;
        }
        int i26 = i25 | i13;
        if ((i24 & 306783379) == 306783378 && (i26 & Token.EXPR_VOID) == 146) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i24 & 1, z2)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            final aw7 aw7Var = (aw7) P;
            Object[] objArr = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                i14 = i26;
                P2 = new rh7(20);
                rv4Var.o0(P2);
            } else {
                i14 = i26;
            }
            final aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
            final aw7 D = yae.D(xt4Var, rv4Var);
            nmd.d(z, (xt4) D.getValue(), null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-280972645, new mu4() { // from class: qp7
                @Override // defpackage.mu4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((zn1) obj2).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        nq7 x = zbe.x(pna.f(kq7.a, 1.0f), mwe.f(14, rv4Var2, false));
                        aw7 aw7Var3 = aw7Var2;
                        boolean f2 = rv4Var2.f(aw7Var3);
                        Object P3 = rv4Var2.P();
                        aw7 aw7Var4 = aw7Var;
                        Object obj5 = ax1.a;
                        if (f2 || P3 == obj5) {
                            P3 = new he1(aw7Var4, aw7Var3, 17);
                            rv4Var2.o0(P3);
                        }
                        vt4 vt4Var = (vt4) P3;
                        boolean f3 = rv4Var2.f(aw7Var3);
                        Object P4 = rv4Var2.P();
                        if (f3 || P4 == obj5) {
                            P4 = new pr0(aw7Var4, aw7Var3, 20);
                            rv4Var2.o0(P4);
                        }
                        xt4 xt4Var8 = (xt4) P4;
                        aw7 aw7Var5 = D;
                        boolean f4 = rv4Var2.f(aw7Var5);
                        Object P5 = rv4Var2.P();
                        if (f4 || P5 == obj5) {
                            P5 = new ao7(aw7Var5, 10);
                            rv4Var2.o0(P5);
                        }
                        lpe.l(str, list, list2, i, f, x, xt4Var2, xt4Var3, xt4Var4, vt4Var, xt4Var7, xt4Var8, (vt4) P5, rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i24 & 14) | 3072, 48, 2036);
            aw7 D2 = yae.D(xt4Var5, rv4Var);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            boolean z3 = false;
            String A = kve.A(((h27) rv4Var.j(j27.a)).a.a, true, false);
            boolean f2 = rv4Var.f(aw7Var2);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                P3 = new qo7(aw7Var2, 4);
                rv4Var.o0(P3);
            }
            xt4 xt4Var8 = (xt4) P3;
            if ((i14 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            }
            boolean f3 = z3 | rv4Var.f(D2) | rv4Var.f(aw7Var2);
            Object P4 = rv4Var.P();
            if (f3 || P4 == obj) {
                P4 = new rp7(xt4Var6, aw7Var, D2, aw7Var2, 0);
                rv4Var.o0(P4);
            }
            nq2.i(0, xt4Var8, (xt4) P4, rv4Var, A, booleanValue);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new op7(z, str, list, list2, i, f, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, i2, 2);
        }
    }

    public static final void k(boolean z, final String str, final List list, final List list2, final int i, final float f, xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, final xt4 xt4Var7, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        char c3;
        int i13;
        boolean z2;
        rv4Var.g0(2053315950);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (rv4Var.f(list)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i16 = i15 | i5;
        if (rv4Var.f(list2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i17 = i16 | i6;
        if (rv4Var.d(i)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i18 = i17 | i7;
        if (rv4Var.c(f)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i8;
        if (rv4Var.h(xt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i20 = i19 | i9;
        if (rv4Var.h(xt4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i21 = i20 | i10;
        if (rv4Var.h(xt4Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i22 = i21 | i11;
        if (rv4Var.h(xt4Var4)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i23 = i22 | i12;
        if (rv4Var.h(xt4Var5)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var6)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i24 = c2 | c3;
        if (rv4Var.h(xt4Var7)) {
            i13 = 256;
        } else {
            i13 = Token.CASE;
        }
        int i25 = i24 | i13;
        if ((i23 & 306783379) == 306783378 && (i25 & Token.EXPR_VOID) == 146) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i23 & 1, z2)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            final aw7 aw7Var = (aw7) P;
            Object[] objArr = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new rh7(21);
                rv4Var.o0(P2);
            }
            final aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
            final aw7 D = yae.D(xt4Var, rv4Var);
            nmd.f(z, (xt4) D.getValue(), null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(-1026547875, new lu4() { // from class: sp7
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        nq7 x = zbe.x(pna.f(kq7.a, 1.0f), mwe.f(13, rv4Var2, false));
                        aw7 aw7Var3 = aw7Var2;
                        boolean f2 = rv4Var2.f(aw7Var3);
                        Object P3 = rv4Var2.P();
                        aw7 aw7Var4 = aw7Var;
                        Object obj4 = ax1.a;
                        if (f2 || P3 == obj4) {
                            P3 = new he1(aw7Var4, aw7Var3, 18);
                            rv4Var2.o0(P3);
                        }
                        vt4 vt4Var = (vt4) P3;
                        boolean f3 = rv4Var2.f(aw7Var3);
                        Object P4 = rv4Var2.P();
                        if (f3 || P4 == obj4) {
                            P4 = new pr0(aw7Var4, aw7Var3, 21);
                            rv4Var2.o0(P4);
                        }
                        xt4 xt4Var8 = (xt4) P4;
                        aw7 aw7Var5 = D;
                        boolean f4 = rv4Var2.f(aw7Var5);
                        Object P5 = rv4Var2.P();
                        if (f4 || P5 == obj4) {
                            P5 = new ao7(aw7Var5, 11);
                            rv4Var2.o0(P5);
                        }
                        lpe.l(str, list, list2, i, f, x, xt4Var2, xt4Var3, xt4Var4, vt4Var, xt4Var7, xt4Var8, (vt4) P5, rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i23 & 14) | 805309440, 500);
            aw7 D2 = yae.D(xt4Var5, rv4Var);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            boolean z3 = false;
            String A = kve.A(((h27) rv4Var.j(j27.a)).a.a, true, false);
            boolean f2 = rv4Var.f(aw7Var2);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                P3 = new qo7(aw7Var2, 5);
                rv4Var.o0(P3);
            }
            xt4 xt4Var8 = (xt4) P3;
            if ((i25 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            }
            boolean f3 = rv4Var.f(D2) | z3 | rv4Var.f(aw7Var2);
            Object P4 = rv4Var.P();
            if (f3 || P4 == obj) {
                Object rp7Var = new rp7(xt4Var6, aw7Var, D2, aw7Var2, 1);
                rv4Var.o0(rp7Var);
                P4 = rp7Var;
            }
            nq2.i(0, xt4Var8, (xt4) P4, rv4Var, A, booleanValue);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new op7(z, str, list, list2, i, f, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, i2, 1);
        }
    }

    public static final void l(String str, final List list, final List list2, final int i, final float f, final nq7 nq7Var, final xt4 xt4Var, xt4 xt4Var2, final xt4 xt4Var3, final vt4 vt4Var, final xt4 xt4Var4, xt4 xt4Var5, final vt4 vt4Var2, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        char c3;
        boolean z;
        String str2;
        rv4 rv4Var2;
        xt4 xt4Var6;
        xt4 xt4Var7;
        boolean z2;
        List list3;
        boolean z3;
        boolean z4;
        boolean z5;
        kq7 kq7Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        rv4Var.g0(819945525);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (rv4Var.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (rv4Var.f(list2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i15 = i14 | i5;
        if (rv4Var.d(i)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (rv4Var.c(f)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (rv4Var.f(nq7Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i8;
        if (rv4Var.h(xt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(xt4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (rv4Var.h(xt4Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (rv4Var.h(vt4Var)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if (rv4Var.h(xt4Var4)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var5)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i23 = c2 | c3;
        if ((i22 & 306783379) == 306783378 && (i23 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i22 & 1, z)) {
            nq7 C = rte.C(nq7Var, rte.u(rv4Var), 14);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, C);
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
            kq7 kq7Var2 = kq7.a;
            nq7 z10 = zbe.z(kq7Var2, 24.0f, 12.0f);
            String A = yqe.A((y3b) f3b.z.getValue(), rv4Var);
            List m = cqe.m((q3b) nz.k.getValue(), rv4Var);
            if ((i22 & 29360128) == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (!z2 && P != lh9Var) {
                list3 = m;
                xt4Var7 = xt4Var2;
            } else {
                list3 = m;
                xt4Var7 = xt4Var2;
                P = new im(19, xt4Var7);
                rv4Var.o0(P);
            }
            l0e.j(A, list3, i, z10, (xt4) P, rv4Var, ((i22 >> 3) & 896) | 3072);
            nq7 A2 = zbe.A(hl5.f(kq7Var2, 12.0f, rv4Var, kq7Var2, 1.0f), 24.0f, nae.e, 2);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, A2);
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
            String A3 = yqe.A((y3b) f3b.g.getValue(), rv4Var);
            tza tzaVar = j27.a;
            cvb.c(A3, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, 0, 0, 130044);
            cvb.c(rqe.h("%.1f", Float.valueOf(f)), kq7Var2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 48, 0, 131068);
            rv4Var.q(true);
            nq7 A4 = zbe.A(kq7Var2, 24.0f, nae.e, 2);
            if ((i22 & 234881024) == 67108864) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new im(20, xt4Var3);
                rv4Var.o0(P2);
            }
            dae.f(f, -1.0f, 1.0f, 19, A4, (xt4) P2, null, rv4Var, ((i22 >> 12) & 14) | 28032, 64);
            xbe.i(rv4Var, pna.h(kq7Var2, 12.0f));
            cvb.c(yqe.A((y3b) f3b.d.getValue(), rv4Var), zbe.A(kq7Var2, 24.0f, nae.e, 2), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, 48, 0, 131068);
            hc2.b(pna.f(zbe.z(kq7Var2, 18.0f, 12.0f), 1.0f), null, jce.E(1700217321, new w81(str, list2, xt4Var, vt4Var, list), rv4Var), rv4Var, 3078, 6);
            nq7 g = c16.g(zbe.A(pna.f(kq7Var2, 1.0f), 18.0f, nae.e, 2), null, 3);
            gv9 a4 = ev9.a(dzVar, kh5.F, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, g);
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
            int i24 = i22 & 14;
            if (i24 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P3 = rv4Var.P();
            if (z4 || P3 == lh9Var) {
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (c16.i(((c6c) it.next()).a, str)) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                P3 = Boolean.valueOf(z5);
                rv4Var.o0(P3);
            }
            if (((Boolean) P3).booleanValue()) {
                rv4Var.e0(-461239635);
                lk5 I = kwe.I(zl1.f, rv4Var);
                nq7 s = pna.s(kq7Var2, 70.0f);
                if ((i23 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i24 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z11 = z6 | z7;
                Object P4 = rv4Var.P();
                if (z11 || P4 == lh9Var) {
                    P4 = new xr1(6, xt4Var4, str);
                    rv4Var.o0(P4);
                }
                kq7Var = kq7Var2;
                str2 = str;
                mwe.b((vt4) P4, s, false, I, null, b16.a, rv4Var, 1572912, 52);
                xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
                lk5 I2 = kwe.I(((h27) rv4Var.j(j27.a)).a.c, rv4Var);
                nq7 s2 = pna.s(kq7Var, 70.0f);
                if ((i23 & Token.ASSIGN_MOD) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i24 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z12 = z9 | z8;
                Object P5 = rv4Var.P();
                if (!z12 && P5 != lh9Var) {
                    xt4Var6 = xt4Var5;
                } else {
                    xt4Var6 = xt4Var5;
                    P5 = new xr1(7, xt4Var6, str2);
                    rv4Var.o0(P5);
                }
                mwe.b((vt4) P5, s2, false, I2, null, b16.b, rv4Var, 1572912, 52);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                xt4Var6 = xt4Var5;
                str2 = str;
                rv4Var2 = rv4Var;
                kq7Var = kq7Var2;
                rv4Var2.e0(-460177730);
                rv4Var2.q(false);
            }
            rs8.u(rv4Var2, true, kq7Var, 24.0f, rv4Var2);
            rv4Var2.q(true);
        } else {
            str2 = str;
            rv4Var2 = rv4Var;
            xt4Var6 = xt4Var5;
            xt4Var7 = xt4Var2;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            final String str3 = str2;
            final xt4 xt4Var8 = xt4Var7;
            final xt4 xt4Var9 = xt4Var6;
            u.d = new lu4(str3, list, list2, i, f, nq7Var, xt4Var, xt4Var8, xt4Var3, vt4Var, xt4Var4, xt4Var9, vt4Var2, i2) { // from class: pp7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ vt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ xt4 H;
                public final /* synthetic */ vt4 I;
                public final /* synthetic */ String a;
                public final /* synthetic */ List b;
                public final /* synthetic */ List c;
                public final /* synthetic */ int d;
                public final /* synthetic */ float e;
                public final /* synthetic */ nq7 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p4 = xoe.p(1);
                    lpe.l(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (rv4) obj, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final nq7 m(nq7 nq7Var, float f) {
        if (f == 1.0f) {
            return nq7Var;
        }
        return axe.l(nq7Var, nae.e, nae.e, f, nae.e, nae.e, null, true, null, 1044475);
    }

    public static final vu7 n(th6 th6Var, bi6 bi6Var, mce mceVar) {
        boolean z;
        int i;
        ora oraVar = bi6Var.a;
        oraVar.getClass();
        d3 d3Var = sve.o(oraVar).c;
        gw7 gw7Var = (gw7) mceVar.a;
        int i2 = 1;
        if (gw7Var.c != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && d3Var.isEmpty()) {
            return ly5.a;
        }
        vu7 vu7Var = new vu7();
        if (((gw7) mceVar.a).c != 0) {
            int i3 = gw7Var.c;
            if (i3 != 0) {
                Object[] objArr = gw7Var.a;
                int i4 = ((ah6) objArr[0]).a;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = ((ah6) objArr[i5]).a;
                    if (i6 < i4) {
                        i4 = i6;
                    }
                }
                if (i4 < 0) {
                    ov5.a("negative minIndex");
                }
                int i7 = gw7Var.c;
                if (i7 != 0) {
                    Object[] objArr2 = gw7Var.a;
                    int i8 = ((ah6) objArr2[0]).b;
                    for (int i9 = 0; i9 < i7; i9++) {
                        int i10 = ((ah6) objArr2[i9]).b;
                        if (i10 > i8) {
                            i8 = i10;
                        }
                    }
                    i = Math.min(i8, th6Var.a() - 1);
                    i2 = i4;
                } else {
                    p1a.l("MutableVector is empty.");
                    return null;
                }
            } else {
                p1a.l("MutableVector is empty.");
                return null;
            }
        } else {
            i = 0;
        }
        int a2 = d3Var.a();
        for (int i11 = 0; i11 < a2; i11++) {
            ai6 ai6Var = (ai6) d3Var.get(i11);
            int k = q1d.k(th6Var, ai6Var.a, ai6Var.c);
            if ((i2 > k || k > i) && k >= 0 && k < th6Var.a()) {
                vu7Var.a(k);
            }
        }
        if (i2 <= i) {
            while (true) {
                vu7Var.a(i2);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i12 = vu7Var.b;
        if (i12 == 0) {
            return vu7Var;
        }
        int[] iArr = vu7Var.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i12);
        return vu7Var;
    }

    public static final rk9 o(rk9 rk9Var, rk9 rk9Var2) {
        rk9Var2.getClass();
        return rk9Var.n(Float.intBitsToFloat((int) (rk9Var2.f() >> 32)) - Float.intBitsToFloat((int) (rk9Var.f() >> 32)), Float.intBitsToFloat((int) (rk9Var2.f() & 4294967295L)) - Float.intBitsToFloat((int) (rk9Var.f() & 4294967295L)));
    }

    public static final long p(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat(i2));
        if (min >= 1.0f) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat(i2) * min;
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i) * min) << 32);
    }

    public static final rk9 q(rk9 rk9Var, rk9 rk9Var2) {
        rk9Var.getClass();
        long j = rk9Var.j();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = rk9Var.c;
        float f2 = rk9Var2.c;
        if (f > f2) {
            intBitsToFloat += f2 - f;
        }
        float f3 = rk9Var.d;
        float f4 = rk9Var2.d;
        if (f3 > f4) {
            intBitsToFloat2 += f4 - f3;
        }
        float f5 = rk9Var2.a;
        if (intBitsToFloat < f5) {
            intBitsToFloat += f5 - intBitsToFloat;
        }
        float f6 = rk9Var2.b;
        if (intBitsToFloat2 < f6) {
            intBitsToFloat2 += f6 - intBitsToFloat2;
        }
        return npe.n((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), rk9Var.h());
    }

    public static final rk9 r(rk9 rk9Var, rk9 rk9Var2) {
        rk9Var2.getClass();
        float f = rk9Var2.c - rk9Var2.a;
        float f2 = rk9Var.c - rk9Var.a;
        float f3 = rk9Var2.d - rk9Var2.b;
        float f4 = rk9Var.d - rk9Var.b;
        float min = Math.min(f / f2, f3 / f4);
        float f5 = f4 * min;
        return npe.n(rk9Var.j(), (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f2 * min) << 32));
    }

    public static boolean s(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static final void t(cz7 cz7Var, String str, String str2) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new q33(str, str2));
    }

    public static final h81 w(rv4 rv4Var) {
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = tl1.A(new xl0(hre.q().toString(), en0.a, new cm0("", ks3.a)));
            rv4Var.o0(P);
        }
        uo3 o = uwe.o((List) P, rv4Var);
        Object P2 = rv4Var.P();
        if (P2 == obj) {
            P2 = new ym0();
            rv4Var.o0(P2);
        }
        ym0 ym0Var = (ym0) P2;
        Object P3 = rv4Var.P();
        if (P3 == obj) {
            P3 = new wm0();
            rv4Var.o0(P3);
        }
        wm0 wm0Var = (wm0) P3;
        boolean f = rv4Var.f(o);
        Object P4 = rv4Var.P();
        if (f || P4 == obj) {
            Object zuaVar = new zua(new m0(1, o, uo3.class, "dispatch", "dispatch(Lio/github/linreal/cascade/editor/action/EditorAction;)V", 0, 5), ym0Var, wm0Var, o);
            rv4Var.o0(zuaVar);
            P4 = zuaVar;
        }
        zua zuaVar2 = (zua) P4;
        boolean f2 = rv4Var.f(o) | rv4Var.f(zuaVar2);
        Object P5 = rv4Var.P();
        if (f2 || P5 == obj) {
            P5 = new h81(o, ym0Var, wm0Var, zuaVar2);
            rv4Var.o0(P5);
        }
        return (h81) P5;
    }

    public static final rk9 x(rk9 rk9Var, e00 e00Var) {
        rk9Var.getClass();
        float f = e00Var.a / e00Var.b;
        float max = Math.max(rk9Var.c - rk9Var.a, rk9Var.d - rk9Var.b);
        return o(r(npe.n(0L, (Float.floatToRawIntBits(f * max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L)), rk9Var), rk9Var);
    }

    public static final rk9 y(rk9 rk9Var, rk9 rk9Var2, long j) {
        rk9Var.getClass();
        float f = rk9Var.a;
        float f2 = rk9Var.b;
        float f3 = rk9Var.c;
        float f4 = rk9Var.d;
        if (Math.abs(rk9Var2.a - f) < Math.abs(rk9Var2.c - f3)) {
            f3 = Float.intBitsToFloat((int) (j >> 32)) + f;
        } else {
            f = f3 - Float.intBitsToFloat((int) (j >> 32));
        }
        if (Math.abs(rk9Var2.b - f2) < Math.abs(rk9Var2.d - f4)) {
            f4 = Float.intBitsToFloat((int) (j & 4294967295L)) + f2;
        } else {
            f2 = f4 - Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return new rk9(f, f2, f3, f4);
    }

    public static void z(int i, Object obj) {
        if (obj != null) {
            return;
        }
        xk5.k(nk2.s(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }

    @Override // defpackage.m5a
    public int a(int i) {
        int u = u(i);
        if (u == -1 || u(u) == -1) {
            return -1;
        }
        return u;
    }

    @Override // defpackage.m5a
    public int b(int i) {
        int v = v(i);
        if (v == -1 || v(v) == -1) {
            return -1;
        }
        return v;
    }

    @Override // defpackage.m5a
    public int d(int i) {
        return v(i);
    }

    @Override // defpackage.m5a
    public int e(int i) {
        return u(i);
    }

    public abstract int u(int i);

    public abstract int v(int i);
}
