package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zj0  reason: default package */
/* loaded from: classes.dex */
public final class zj0 {
    public static final tu1 a = new tu1(new lv1(9), false, 87095567);

    public zj0(String str, Bundle bundle) {
        if (str.length() > 0) {
            return;
        }
        vs.m("type should not be empty");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final void a(m32 m32Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        ?? r3;
        ar5 c;
        boolean z3;
        String A;
        rv4 rv4Var2 = rv4Var;
        m32Var.getClass();
        String str = m32Var.a;
        rv4Var2.g0(-1662818239);
        if (rv4Var2.h(m32Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3 | 3072;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new cd1(15);
                rv4Var2.o0(P);
            }
            vt4 vt4Var3 = (vt4) P;
            kq7 kq7Var2 = kq7.a;
            nq7 z4 = zbe.z(i(pna.s(kq7Var2, 50.0f), w06.b), 2.0f, 8.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z4);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            nq7 t = jsc.t(1.0f, pna.c, false);
            su9 su9Var = uu9.a;
            fu0.a(lbe.h(tte.k(t, su9Var), vt4Var3, vt4Var), rv4Var2, 0);
            nq7 a2 = pu0.a.a(kq7Var2, kh5.e);
            vt4Var2 = vt4Var3;
            xn1 a3 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, a2);
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
            ly lyVar = m32Var.c;
            if (lyVar == null) {
                rv4Var2.e0(-1306458288);
                switch (str.hashCode()) {
                    case -1335458389:
                        r3 = 0;
                        if (str.equals("delete")) {
                            rv4Var2.e0(1897536998);
                            c = rp5.c((wk3) jk3.I.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case -1097452282:
                        r3 = 0;
                        if (str.equals("lockup")) {
                            rv4Var2.e0(1897520584);
                            c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case -906336856:
                        r3 = 0;
                        if (str.equals("search")) {
                            rv4Var2.e0(1897542304);
                            c = rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case 115187:
                        r3 = 0;
                        if (str.equals("tts")) {
                            rv4Var2.e0(1897534244);
                            c = rp5.c((wk3) ok3.g.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case 3059573:
                        r3 = 0;
                        if (str.equals("copy")) {
                            rv4Var2.e0(1897526022);
                            c = rp5.c((wk3) jk3.C.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case 3108362:
                        r3 = 0;
                        if (str.equals("edit")) {
                            rv4Var2.e0(1897539742);
                            c = rp5.c((wk3) jk3.P.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case 3387378:
                        r3 = 0;
                        if (str.equals("note")) {
                            rv4Var2.e0(1897523394);
                            c = rp5.c((wk3) ok3.P.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case 109400031:
                        r3 = 0;
                        if (str.equals("share")) {
                            rv4Var2.e0(1897528803);
                            c = rp5.c((wk3) ok3.q.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                    case 1052832078:
                        if (str.equals("translate")) {
                            rv4Var2.e0(1897531619);
                            c = rp5.c((wk3) rk3.m.getValue(), rv4Var2, 0);
                            rv4Var2.q(false);
                            break;
                        }
                    default:
                        r3 = 0;
                        rv4Var2.e0(1897544488);
                        c = rp5.c((wk3) jk3.Z.getValue(), rv4Var2, r3);
                        rv4Var2.q(r3);
                        break;
                }
                tza tzaVar = j27.a;
                nk5.a(c, "", pna.n(kq7Var2, 24.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var, 432, 0);
                xbe.i(rv4Var, pna.h(kq7Var2, 2.0f));
                switch (str.hashCode()) {
                    case -1335458389:
                        z3 = false;
                        if (str.equals("delete")) {
                            rv4Var.e0(1897573182);
                            A = yqe.A((y3b) o2b.y.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case -1097452282:
                        z3 = false;
                        if (str.equals("lockup")) {
                            rv4Var.e0(1897558078);
                            A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case -906336856:
                        z3 = false;
                        if (str.equals("search")) {
                            rv4Var.e0(1897578174);
                            A = yqe.A((y3b) b3b.J.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case 115187:
                        z3 = false;
                        if (str.equals("tts")) {
                            rv4Var.e0(1897570653);
                            A = yqe.A((y3b) k3b.J0.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case 3059573:
                        z3 = false;
                        if (str.equals("copy")) {
                            rv4Var.e0(1897563004);
                            A = yqe.A((y3b) o2b.i.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case 3108362:
                        z3 = false;
                        if (str.equals("edit")) {
                            rv4Var.e0(1897575676);
                            A = yqe.A((y3b) o2b.a0.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case 3387378:
                        z3 = false;
                        if (str.equals("note")) {
                            rv4Var.e0(1897560572);
                            A = yqe.A((y3b) x2b.t0.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case 109400031:
                        z3 = false;
                        if (str.equals("share")) {
                            rv4Var.e0(1897565469);
                            A = yqe.A((y3b) k3b.n0.getValue(), rv4Var);
                            rv4Var.q(false);
                            break;
                        }
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                    case 1052832078:
                        if (str.equals("translate")) {
                            rv4Var.e0(1897568097);
                            A = yqe.A((y3b) o3b.W.getValue(), rv4Var);
                            z3 = false;
                            rv4Var.q(false);
                            break;
                        }
                    default:
                        z3 = false;
                        rv4Var.e0(1897580286);
                        A = yqe.A((y3b) x2b.T.getValue(), rv4Var);
                        rv4Var.q(z3);
                        break;
                }
                boolean z5 = z3;
                String str2 = A;
                z2 = true;
                cvb.c(str2, l0e.u(kq7Var2), ((h27) rv4Var.j(tzaVar)).a.q, null, zr1.q(10), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 24624, 24576, 113640);
                rv4Var2 = rv4Var;
                rv4Var2.q(z5);
                kq7Var = kq7Var2;
            } else {
                z2 = true;
                rv4Var2.e0(-1304129444);
                boolean f = rv4Var2.f(str);
                Object P2 = rv4Var2.P();
                if (f || P2 == lh9Var) {
                    P2 = zxe.i(lyVar.d);
                    rv4Var2.o0(P2);
                }
                dxe.i((nl5) P2, "", tte.k(pna.n(kq7Var2, 24.0f), su9Var), rv4Var2, 24624, 232);
                xbe.i(rv4Var2, pna.h(kq7Var2, 2.0f));
                String str3 = m32Var.b;
                tza tzaVar2 = j27.a;
                oyb oybVar = ((h27) rv4Var2.j(tzaVar2)).b.l;
                kq7Var = kq7Var2;
                cvb.c(str3, l0e.u(kq7Var2), ((h27) rv4Var2.j(tzaVar2)).a.q, null, zr1.q(10), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, oybVar, rv4Var, 24624, 24576, 113640);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            rv4Var2.q(z2);
            rv4Var2.q(z2);
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        vt4 vt4Var4 = vt4Var2;
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7(m32Var, kq7Var, vt4Var, vt4Var4, i, 13);
        }
    }

    public static final void b(final boolean z, final String str, final String str2, final int i, final int i2, final boolean z2, final amc amcVar, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final xt4 xt4Var, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final vt4 vt4Var9, final vt4 vt4Var10, rv4 rv4Var, final int i3, final int i4) {
        int i5;
        Object obj;
        int i6;
        Object obj2;
        rv4 rv4Var2 = rv4Var;
        amcVar.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        xt4Var.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        vt4Var7.getClass();
        vt4Var8.getClass();
        vt4Var9.getClass();
        vt4Var10.getClass();
        rv4Var2.g0(1388307658);
        if ((i3 & 6) == 0) {
            i5 = (rv4Var2.g(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= rv4Var2.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            obj = str2;
            i5 |= rv4Var2.f(obj) ? 256 : Token.CASE;
        } else {
            obj = str2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= rv4Var2.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= rv4Var2.d(i2) ? 16384 : 8192;
        }
        int i7 = i3 & 196608;
        int i8 = Parser.ARGC_LIMIT;
        if (i7 == 0) {
            i5 |= rv4Var2.g(z2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= rv4Var2.f(amcVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= rv4Var2.f(nq7Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= rv4Var2.h(vt4Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= rv4Var2.h(vt4Var2) ? 536870912 : 268435456;
        }
        int i9 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (rv4Var2.h(vt4Var3) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= rv4Var2.h(xt4Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            obj2 = vt4Var4;
            i6 |= rv4Var2.h(obj2) ? 256 : Token.CASE;
        } else {
            obj2 = vt4Var4;
        }
        if ((i4 & 3072) == 0) {
            i6 |= rv4Var2.h(vt4Var5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= rv4Var2.h(vt4Var6) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            if (rv4Var2.h(vt4Var7)) {
                i8 = 131072;
            }
            i6 |= i8;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= rv4Var2.h(vt4Var8) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= rv4Var2.h(vt4Var9) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= rv4Var2.h(vt4Var10) ? 67108864 : 33554432;
        }
        if (rv4Var2.U(i9 & 1, ((i9 & 306783379) == 306783378 && (i6 & 38347923) == 38347922) ? false : true)) {
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
            nq7 f = pna.f(kq7Var, 1.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new clb(23);
                rv4Var2.o0(P);
            }
            eu3 a3 = g.a(zt3.t((xt4) P));
            lz3 i10 = zt3.i(null, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new clb(24);
                rv4Var2.o0(P2);
            }
            final String str3 = obj;
            final vt4 vt4Var11 = obj2;
            rte.e(z, f, a3, i10.a(zt3.x((xt4) P2)), null, jce.E(2105204028, new mu4() { // from class: wvb
                @Override // defpackage.mu4
                public final Object c(Object obj3, Object obj4, Object obj5) {
                    boolean z3;
                    wk3 wk3Var;
                    rv4 rv4Var3 = (rv4) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    ((qr) obj3).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var3.U(intValue & 1, z3)) {
                        kq7 kq7Var2 = kq7.a;
                        nq7 f2 = pna.f(kq7Var2, 1.0f);
                        xn1 a4 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                        int hashCode2 = Long.hashCode(rv4Var3.T);
                        xt8 l2 = rv4Var3.l();
                        nq7 p2 = lye.p(rv4Var3, f2);
                        rw1.k.getClass();
                        vt4 vt4Var12 = qw1.b;
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(vt4Var12);
                        } else {
                            rv4Var3.r0();
                        }
                        np npVar5 = qw1.f;
                        jce.F(npVar5, rv4Var3, a4);
                        np npVar6 = qw1.e;
                        jce.F(npVar6, rv4Var3, l2);
                        Integer valueOf2 = Integer.valueOf(hashCode2);
                        np npVar7 = qw1.g;
                        jce.F(npVar7, rv4Var3, valueOf2);
                        kg kgVar2 = qw1.h;
                        jce.C(kgVar2, rv4Var3);
                        np npVar8 = qw1.d;
                        jce.F(npVar8, rv4Var3, p2);
                        nq7 h = q1d.h(rv4Var3, pna.f(kq7Var2, 1.0f));
                        f99 f99Var = j27.a;
                        nq7 z4 = zbe.z(mwe.u(nmd.v(h, zl1.b(0.95f, rm1.g(((h27) rv4Var3.j(f99Var)).a, 4.0f)), lre.g), false, 7), 12.0f, 6.0f);
                        gv9 a5 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
                        int hashCode3 = Long.hashCode(rv4Var3.T);
                        xt8 l3 = rv4Var3.l();
                        nq7 p3 = lye.p(rv4Var3, z4);
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(vt4Var12);
                        } else {
                            rv4Var3.r0();
                        }
                        jce.F(npVar5, rv4Var3, a5);
                        jce.F(npVar6, rv4Var3, l3);
                        s21.t(hashCode3, rv4Var3, npVar7, rv4Var3, kgVar2);
                        jce.F(npVar8, rv4Var3, p3);
                        eh.a(rp5.c(jk3.a(), rv4Var3, 0), null, vt4.this, null, rv4Var3, 0, 10);
                        xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                        boolean z5 = z2;
                        if (z5) {
                            wk3Var = (wk3) jk3.m.getValue();
                        } else {
                            wk3Var = (wk3) jk3.l.getValue();
                        }
                        ar5 c = rp5.c(wk3Var, rv4Var3, 0);
                        xt4 xt4Var2 = xt4Var;
                        boolean f3 = rv4Var3.f(xt4Var2) | rv4Var3.g(z5);
                        Object P3 = rv4Var3.P();
                        if (f3 || P3 == ax1.a) {
                            P3 = new up0(22, xt4Var2, z5);
                            rv4Var3.o0(P3);
                        }
                        eh.a(c, null, (vt4) P3, null, rv4Var3, 0, 10);
                        xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                        eh.a(rp5.c((wk3) rk3.f.getValue(), rv4Var3, 0), null, vt4Var11, null, rv4Var3, 0, 10);
                        xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                        eh.a(rp5.c((wk3) ok3.g0.getValue(), rv4Var3, 0), null, vt4Var5, null, rv4Var3, 0, 10);
                        we6 we6Var = new we6(1.0f, true);
                        xn1 a6 = wn1.a(lz.e, kh5.J, rv4Var3, 54);
                        int hashCode4 = Long.hashCode(rv4Var3.T);
                        xt8 l4 = rv4Var3.l();
                        nq7 p4 = lye.p(rv4Var3, we6Var);
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(vt4Var12);
                        } else {
                            rv4Var3.r0();
                        }
                        jce.F(npVar5, rv4Var3, a6);
                        jce.F(npVar6, rv4Var3, l4);
                        s21.t(hashCode4, rv4Var3, npVar7, rv4Var3, kgVar2);
                        jce.F(npVar8, rv4Var3, p4);
                        dq4 dq4Var = dq4.D;
                        cvb.c(str, pna.f(kq7Var2, 1.0f), ((h27) rv4Var3.j(f99Var)).a.q, null, zr1.q(14), null, dq4Var, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, null, rv4Var3, 1597488, 24960, 240552);
                        long q = zr1.q(12);
                        cvb.c(str3, pna.f(kq7Var2, 1.0f), ((h27) rv4Var3.j(f99Var)).a.q, null, q, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, null, rv4Var3, 24624, 24960, 240616);
                        rv4Var3.q(true);
                        eh.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var3, 0), null, vt4Var6, null, rv4Var3, 0, 10);
                        xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                        eh.a(rp5.c((wk3) ok3.g.getValue(), rv4Var3, 0), null, vt4Var2, vt4Var3, rv4Var3, 0, 2);
                        xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                        eh.a(rp5.c((wk3) ok3.p0.getValue(), rv4Var3, 0), null, vt4Var7, null, rv4Var3, 0, 10);
                        xbe.i(rv4Var3, pna.s(kq7Var2, 12.0f));
                        eh.a(rp5.c((wk3) ok3.M.getValue(), rv4Var3, 0), null, vt4Var8, null, rv4Var3, 0, 10);
                        rv4Var3.q(true);
                        vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var3.j(f99Var)).a, 6.0f), rv4Var3, pna.f(kq7Var2, 1.0f));
                        rv4Var3.q(true);
                    } else {
                        rv4Var3.X();
                    }
                    return pvc.a;
                }
            }, rv4Var2), rv4Var, 1600902 | ((i9 << 3) & Token.ASSIGN_MOD), 16);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            boolean z3 = amcVar.a && z;
            nq7 u = mwe.u(kq7Var, false, 2);
            pu0 pu0Var = pu0.a;
            ch0.k(z3, amcVar, pu0Var.a(u, nk0Var), vt4Var10, rv4Var, ((i9 >> 15) & Token.ASSIGN_MOD) | ((i6 >> 15) & 7168));
            int i11 = i9 >> 6;
            aze.j(z, i, i2, pu0Var.a(mwe.u(kq7Var, false, 4), kh5.c), vt4Var9, rv4Var, (i9 & 14) | (i11 & Token.ASSIGN_MOD) | (i11 & 896) | ((i6 >> 9) & 57344));
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new lu4() { // from class: xvb
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p3 = xoe.p(i3 | 1);
                    int p4 = xoe.p(i4);
                    zj0.b(z, str, str2, i, i2, z2, amcVar, nq7Var, vt4Var, vt4Var2, vt4Var3, xt4Var, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, (rv4) obj3, p3, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(final cyb cybVar, final ymb ymbVar, final bpb bpbVar, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final boolean z2;
        ymbVar.getClass();
        bpbVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(-1004350049);
        if (rv4Var.f(ymbVar)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i7 = i | i2;
        if (rv4Var.f(bpbVar)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 131072;
        } else {
            i5 = Parser.ARGC_LIMIT;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i11 = i10 | i6;
        if ((599187 & i11) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            if (cybVar.d() == p7a.c) {
                z2 = true;
            } else {
                z2 = false;
            }
            WeakHashMap weakHashMap = yjd.w;
            final rp rpVar = h88.n(rv4Var).b;
            final tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            hc2.b(nq7Var, null, jce.E(1471367029, new mu4() { // from class: yxb
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    r13 r13Var;
                    r13 r13Var2;
                    r13 r13Var3;
                    r13 r13Var4;
                    int i12;
                    final su0 su0Var = (su0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        intValue |= i12;
                    }
                    if ((intValue & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        tza tzaVar = dy1.h;
                        float L0 = ((r13) rv4Var2.j(tzaVar)).L0(20.0f);
                        float L02 = ((r13) rv4Var2.j(tzaVar)).L0(20.0f);
                        qid qidVar = rpVar;
                        tc6 tc6Var2 = tc6Var;
                        final float d = L02 + qidVar.d(r13Var, tc6Var2);
                        final float L03 = ((r13) rv4Var2.j(tzaVar)).L0(20.0f) + qidVar.b(r13Var2, tc6Var2);
                        float L04 = ((r13) rv4Var2.j(tzaVar)).L0(20.0f) + qidVar.a(r13Var3);
                        float L05 = ((r13) rv4Var2.j(tzaVar)).L0(20.0f) + qidVar.c(r13Var4);
                        eu3 g = zt3.g(null, 3);
                        long j = ckc.b;
                        eu3 a2 = g.a(zt3.k(null, 0.9f, j, 1));
                        lz3 a3 = zt3.i(null, 3).a(zt3.m(0.9f, j, 1));
                        final cyb cybVar2 = cyb.this;
                        boolean f = rv4Var2.f(cybVar2) | rv4Var2.c(d) | rv4Var2.c(L03) | rv4Var2.c(L0) | rv4Var2.c(L04) | rv4Var2.c(L05);
                        Object P = rv4Var2.P();
                        if (f || P == ax1.a) {
                            jh7 jh7Var = new jh7(cybVar2, d, L03, L0, L04, L05);
                            rv4Var2.o0(jh7Var);
                            P = jh7Var;
                        }
                        nq7 f2 = sze.f(kq7.a, (mu4) P);
                        final ymb ymbVar2 = ymbVar;
                        final bpb bpbVar2 = bpbVar;
                        final xt4 xt4Var4 = xt4Var3;
                        final xt4 xt4Var5 = xt4Var2;
                        final xt4 xt4Var6 = xt4Var;
                        rte.c(z2, f2, a2, a3, null, jce.E(1426098765, new mu4() { // from class: zxb
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v7 */
                            /* JADX WARN: Type inference failed for: r2v9 */
                            /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
                            @Override // defpackage.mu4
                            public final Object c(Object obj4, Object obj5, Object obj6) {
                                boolean z4;
                                aw7 aw7Var;
                                int i13;
                                zxb zxbVar;
                                dz dzVar;
                                int i14;
                                int i15;
                                List list;
                                dz dzVar2;
                                float f3;
                                float f4;
                                boolean z5;
                                rv4 rv4Var3;
                                List list2;
                                int i16;
                                dz dzVar3;
                                nq7 nq7Var2;
                                su9 su9Var;
                                String[] strArr;
                                ayb aybVar;
                                dz dzVar4;
                                int i17;
                                int i18;
                                nq7 nq7Var3;
                                ba5 ba5Var = lre.g;
                                rv4 rv4Var4 = (rv4) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((qr) obj4).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (rv4Var4.U(intValue2 & 1, z4)) {
                                    Object P2 = rv4Var4.P();
                                    Object obj7 = ax1.a;
                                    if (P2 == obj7) {
                                        P2 = yae.z(null);
                                        rv4Var4.o0(P2);
                                    }
                                    aw7 aw7Var2 = P2;
                                    Object P3 = rv4Var4.P();
                                    if (P3 == obj7) {
                                        P3 = yae.z("");
                                        rv4Var4.o0(P3);
                                    }
                                    aw7 aw7Var3 = P3;
                                    cyb cybVar3 = cybVar2;
                                    boolean f5 = rv4Var4.f(cybVar3);
                                    ymb ymbVar3 = ymb.this;
                                    boolean f6 = f5 | rv4Var4.f(ymbVar3);
                                    Object P4 = rv4Var4.P();
                                    if (!f6 && P4 != obj7) {
                                        aw7Var = aw7Var3;
                                    } else {
                                        byb bybVar = new byb(cybVar3, ymbVar3, aw7Var2, aw7Var3, null, 0);
                                        aw7Var = aw7Var3;
                                        rv4Var4.o0(bybVar);
                                        P4 = bybVar;
                                    }
                                    yte.h(ymbVar3, cybVar3, (lu4) P4, rv4Var4);
                                    r13 r13Var5 = (r13) rv4Var4.j(dy1.h);
                                    su0 su0Var2 = su0Var;
                                    boolean c = rv4Var4.c(su0Var2.d()) | rv4Var4.f(r13Var5);
                                    float f7 = d;
                                    boolean c2 = c | rv4Var4.c(f7);
                                    float f8 = L03;
                                    boolean c3 = c2 | rv4Var4.c(f8);
                                    Object P5 = rv4Var4.P();
                                    if (c3 || P5 == obj7) {
                                        P5 = new rg3(((rg3) hxe.u(new rg3((su0Var2.d() - r13Var5.B0(f7 + f8)) - 10.0f), new rg3(400.0f))).a);
                                        rv4Var4.o0(P5);
                                    }
                                    float f9 = ((rg3) P5).a;
                                    w06 w06Var = w06.b;
                                    kq7 kq7Var = kq7.a;
                                    nq7 u = pna.u(zj0.m(kq7Var, w06Var), nae.e, f9, 1);
                                    tza tzaVar2 = j27.a;
                                    int i19 = 1;
                                    nq7 d2 = st0.d(nmd.v(tte.k(u, ((h27) rv4Var4.j(tzaVar2)).c.c), rm1.g(((h27) rv4Var4.j(tzaVar2)).a, 4.0f), ba5Var), 1.0f, rm1.g(((h27) rv4Var4.j(tzaVar2)).a, 10.0f), ((h27) rv4Var4.j(tzaVar2)).c.c);
                                    xn1 a4 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                    int hashCode = Long.hashCode(rv4Var4.T);
                                    xt8 l = rv4Var4.l();
                                    nq7 p = lye.p(rv4Var4, d2);
                                    rw1.k.getClass();
                                    zx1 zx1Var = qw1.b;
                                    rv4Var4.i0();
                                    if (rv4Var4.S) {
                                        rv4Var4.k(zx1Var);
                                    } else {
                                        rv4Var4.r0();
                                    }
                                    np npVar = qw1.f;
                                    jce.F(npVar, rv4Var4, a4);
                                    np npVar2 = qw1.e;
                                    jce.F(npVar2, rv4Var4, l);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    np npVar3 = qw1.g;
                                    jce.F(npVar3, rv4Var4, valueOf);
                                    kg kgVar = qw1.h;
                                    jce.C(kgVar, rv4Var4);
                                    np npVar4 = qw1.d;
                                    jce.F(npVar4, rv4Var4, p);
                                    bpb bpbVar3 = bpbVar2;
                                    boolean z6 = bpbVar3.a;
                                    boolean z7 = bpbVar3.b;
                                    List list3 = bpbVar3.c;
                                    if (z6) {
                                        i13 = list3.size();
                                    } else if (z7) {
                                        i13 = 3;
                                    } else {
                                        i13 = 6;
                                    }
                                    aw7 aw7Var4 = aw7Var;
                                    nq7 q = rte.q(kq7Var, rte.u(rv4Var4), 14);
                                    mk0 mk0Var = kh5.G;
                                    List list4 = list3;
                                    dz dzVar5 = lz.a;
                                    gv9 a5 = ev9.a(dzVar5, mk0Var, rv4Var4, 48);
                                    ba5 ba5Var2 = ba5Var;
                                    int hashCode2 = Long.hashCode(rv4Var4.T);
                                    xt8 l2 = rv4Var4.l();
                                    nq7 p2 = lye.p(rv4Var4, q);
                                    rv4Var4.i0();
                                    if (rv4Var4.S) {
                                        rv4Var4.k(zx1Var);
                                    } else {
                                        rv4Var4.r0();
                                    }
                                    jce.F(npVar, rv4Var4, a5);
                                    jce.F(npVar2, rv4Var4, l2);
                                    s21.t(hashCode2, rv4Var4, npVar3, rv4Var4, kgVar);
                                    jce.F(npVar4, rv4Var4, p2);
                                    if (z7) {
                                        rv4Var4.e0(-395433246);
                                        xbe.i(rv4Var4, pna.s(kq7Var, 8.0f));
                                        Object P6 = rv4Var4.P();
                                        String[] strArr2 = P6;
                                        if (P6 == obj7) {
                                            String[] strArr3 = {"#F2C24F", "#EE7950", "#97C15C", "#60C3D7"};
                                            rv4Var4.o0(strArr3);
                                            strArr2 = strArr3;
                                        }
                                        String[] strArr4 = (String[]) strArr2;
                                        int length = strArr4.length;
                                        int i20 = 0;
                                        while (i20 < length) {
                                            String str = strArr4[i20];
                                            boolean i21 = c16.i((String) aw7Var4.getValue(), str);
                                            boolean f10 = rv4Var4.f(str);
                                            Object P7 = rv4Var4.P();
                                            if (f10 || P7 == obj7) {
                                                zl1 zl1Var = new zl1(kve.v(str));
                                                rv4Var4.o0(zl1Var);
                                                P7 = zl1Var;
                                            }
                                            long j2 = ((zl1) P7).a;
                                            nq7 n = pna.n(kq7Var, 36.0f);
                                            su9 su9Var2 = uu9.a;
                                            nq7 k = tte.k(n, su9Var2);
                                            boolean g2 = rv4Var4.g(i21);
                                            xt4 xt4Var7 = xt4Var4;
                                            xt4 xt4Var8 = xt4Var5;
                                            boolean f11 = g2 | rv4Var4.f(xt4Var7) | rv4Var4.f(xt4Var8) | rv4Var4.f(str);
                                            Object P8 = rv4Var4.P();
                                            if (!f11 && P8 != obj7) {
                                                nq7Var2 = k;
                                                aybVar = P8;
                                                su9Var = su9Var2;
                                                strArr = strArr4;
                                            } else {
                                                aw7 aw7Var5 = aw7Var2;
                                                nq7Var2 = k;
                                                su9Var = su9Var2;
                                                strArr = strArr4;
                                                ayb aybVar2 = new ayb(i21, xt4Var7, xt4Var8, str, aw7Var5);
                                                aw7Var2 = aw7Var5;
                                                rv4Var4.o0(aybVar2);
                                                aybVar = aybVar2;
                                            }
                                            int i22 = length;
                                            ba5 ba5Var3 = ba5Var2;
                                            nq7 v = nmd.v(tte.k(zbe.y(lbe.f(15, (vt4) aybVar, nq7Var2, null, false), 5.0f), su9Var), j2, ba5Var3);
                                            if (i21) {
                                                rv4Var4.e0(-991730316);
                                                dzVar4 = dzVar5;
                                                i17 = i20;
                                                nq7Var3 = nmd.v(zbe.y(nmd.v(zbe.y(kq7Var, 2.0f), rm1.g(((h27) rv4Var4.j(j27.a)).a, 4.0f), su9Var), 2.0f), j2, su9Var);
                                                i18 = 0;
                                                rv4Var4.q(false);
                                            } else {
                                                dzVar4 = dzVar5;
                                                i17 = i20;
                                                i18 = 0;
                                                rv4Var4.e0(-991079440);
                                                rv4Var4.q(false);
                                                nq7Var3 = kq7Var;
                                            }
                                            fu0.a(v.a0(nq7Var3), rv4Var4, i18);
                                            i20 = i17 + 1;
                                            length = i22;
                                            dzVar5 = dzVar4;
                                            strArr4 = strArr;
                                            ba5Var2 = ba5Var3;
                                        }
                                        zxbVar = this;
                                        dzVar = dzVar5;
                                        i14 = 0;
                                        rv4Var4.q(false);
                                    } else {
                                        zxbVar = this;
                                        dzVar = dzVar5;
                                        i14 = 0;
                                        rv4Var4.e0(-393256581);
                                        rv4Var4.q(false);
                                    }
                                    boolean isEmpty = list4.isEmpty();
                                    xt4 xt4Var9 = xt4Var6;
                                    if (!isEmpty) {
                                        rs8.s(rv4Var4, -393163116, kq7Var, 4.0f, rv4Var4);
                                        int n2 = dce.n(i13, i14, list4.size());
                                        int i23 = 0;
                                        while (i23 < n2) {
                                            List list5 = list4;
                                            m32 m32Var = (m32) sl1.f0(i23, list5);
                                            if (m32Var != null) {
                                                rv4Var4.e0(1922209338);
                                                boolean f12 = rv4Var4.f(xt4Var9) | rv4Var4.h(m32Var);
                                                Object P9 = rv4Var4.P();
                                                if (f12 || P9 == obj7) {
                                                    P9 = new dr8(xt4Var9, m32Var, i19);
                                                    rv4Var4.o0(P9);
                                                }
                                                i16 = i13;
                                                list2 = list5;
                                                dzVar3 = dzVar;
                                                zj0.a(m32Var, null, (vt4) P9, null, rv4Var4, 8);
                                                rv4Var4.q(false);
                                            } else {
                                                list2 = list5;
                                                i16 = i13;
                                                dzVar3 = dzVar;
                                                rv4Var4.e0(1922515897);
                                                rv4Var4.q(false);
                                            }
                                            i23++;
                                            i13 = i16;
                                            list4 = list2;
                                            dzVar = dzVar3;
                                            i19 = 1;
                                        }
                                        i15 = i13;
                                        list = list4;
                                        dzVar2 = dzVar;
                                        f3 = 1.0f;
                                        f4 = nae.e;
                                        rv4Var4.q(false);
                                    } else {
                                        i15 = i13;
                                        ?? r3 = i14;
                                        list = list4;
                                        dzVar2 = dzVar;
                                        f3 = 1.0f;
                                        f4 = nae.e;
                                        rv4Var4.e0(-392510597);
                                        rv4Var4.q(r3);
                                    }
                                    xbe.i(rv4Var4, pna.s(kq7Var, 8.0f));
                                    rv4Var4.q(true);
                                    if (list.size() > i15) {
                                        rv4Var4.e0(1742438675);
                                        vqe.m(nae.e, 6, 2, zl1.b(0.3f, ((h27) rv4Var4.j(j27.a)).a.B), rv4Var4, pna.f(kq7Var, f3));
                                        rv4 rv4Var5 = rv4Var4;
                                        nq7 q2 = rte.q(pna.u(kq7Var, f4, 316.0f, 1), rte.u(rv4Var5), 14);
                                        gv9 a6 = ev9.a(dzVar2, kh5.F, rv4Var5, 0);
                                        int hashCode3 = Long.hashCode(rv4Var5.T);
                                        xt8 l3 = rv4Var5.l();
                                        nq7 p3 = lye.p(rv4Var5, q2);
                                        rw1.k.getClass();
                                        zx1 zx1Var2 = qw1.b;
                                        rv4Var5.i0();
                                        if (rv4Var5.S) {
                                            rv4Var5.k(zx1Var2);
                                        } else {
                                            rv4Var5.r0();
                                        }
                                        jce.F(qw1.f, rv4Var5, a6);
                                        jce.F(qw1.e, rv4Var5, l3);
                                        jce.F(qw1.g, rv4Var5, Integer.valueOf(hashCode3));
                                        jce.C(qw1.h, rv4Var5);
                                        jce.F(qw1.d, rv4Var5, p3);
                                        xbe.i(rv4Var5, pna.s(kq7Var, 8.0f));
                                        rv4Var5.e0(-1139334828);
                                        int size = list.size();
                                        while (i15 < size) {
                                            m32 m32Var2 = (m32) sl1.f0(i15, list);
                                            if (m32Var2 != null) {
                                                rv4Var5.e0(-959433567);
                                                boolean f13 = rv4Var5.f(xt4Var9) | rv4Var5.h(m32Var2);
                                                Object P10 = rv4Var5.P();
                                                if (f13 || P10 == obj7) {
                                                    P10 = new dr8(xt4Var9, m32Var2, 2);
                                                    rv4Var5.o0(P10);
                                                }
                                                zj0.a(m32Var2, null, (vt4) P10, null, rv4Var5, 8);
                                                rv4Var5.q(false);
                                            } else {
                                                rv4Var5.e0(-959127008);
                                                rv4Var5.q(false);
                                            }
                                            i15++;
                                        }
                                        s21.x(rv4Var5, false, kq7Var, 8.0f, rv4Var5);
                                        z5 = true;
                                        rv4Var5.q(true);
                                        rv4Var5.q(false);
                                        rv4Var3 = rv4Var5;
                                    } else {
                                        z5 = true;
                                        rv4Var4.e0(1743588031);
                                        rv4Var4.q(false);
                                        rv4Var3 = rv4Var4;
                                    }
                                    rv4Var3.q(z5);
                                } else {
                                    rv4Var4.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2), rv4Var2, 196608, 16);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bx(cybVar, ymbVar, bpbVar, nq7Var, xt4Var, xt4Var2, xt4Var3, i, 10);
        }
    }

    public static final ExecutorService d(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new yy1(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static final f82 e(Executor executor) {
        return new vy3(executor);
    }

    public static final String f(j6d j6dVar) {
        j6dVar.getClass();
        String replace = j6dVar.a.replace('\\', '/');
        replace.getClass();
        return k4b.E0('/', replace, replace);
    }

    public static final ArrayList g(u06 u06Var) {
        List n;
        u06Var.getClass();
        od6 U0 = ((ry6) u06Var).U0();
        boolean k = k(U0);
        iv7 iv7Var = (iv7) U0.p();
        gw7 gw7Var = (gw7) iv7Var.b;
        ArrayList arrayList = new ArrayList(gw7Var.c);
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var = (od6) iv7Var.get(i2);
            if (k) {
                n = od6Var.m();
            } else {
                n = od6Var.n();
            }
            arrayList.add(n);
        }
        return arrayList;
    }

    public static final Object h(u7a u7aVar, k8a k8aVar) {
        Object g = u7aVar.a.g(k8aVar);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final nq7 i(nq7 nq7Var, w06 w06Var) {
        return nq7Var.a0(new s06(w06Var));
    }

    public static final byte[] j(byte[] bArr) {
        bArr.getClass();
        try {
            return ak0.s(bArr, false);
        } catch (Throwable unused) {
            return ak0.s(bArr, true);
        }
    }

    public static final boolean k(od6 od6Var) {
        int ordinal = od6Var.d0.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            od6 v = od6Var.v();
                            if (v != null) {
                                return k(v);
                            }
                            vs.m("no parent for idle node");
                            return false;
                        }
                        xk5.o();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final String l(String str) {
        str.getClass();
        int g0 = k4b.g0(str, ":", 0, false, 6);
        int i = 1;
        if (g0 >= 0) {
            if (r4b.Q(str.substring(g0), "://", false)) {
                i = 3;
            }
            int i2 = g0 + i;
            return str.substring(0, i2).concat(l(str.substring(i2)));
        }
        String replace = str.replace('\\', '/');
        replace.getClass();
        ArrayList arrayList = new ArrayList();
        List z0 = k4b.z0(replace, new String[]{"/"});
        z0.size();
        for (int i3 = 0; i3 < z0.size(); i3++) {
            String str2 = (String) z0.get(i3);
            int hashCode = str2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 46) {
                    if (hashCode == 1472 && str2.equals("..")) {
                        if (!arrayList.isEmpty() && i3 != 1) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    arrayList.add(str2);
                } else {
                    if (str2.equals(".")) {
                    }
                    arrayList.add(str2);
                }
            } else {
                if (str2.equals("")) {
                    if (arrayList.isEmpty()) {
                        arrayList.add("");
                    }
                }
                arrayList.add(str2);
            }
        }
        return sl1.i0(arrayList, "/", null, null, null, 62);
    }

    public static final nq7 m(nq7 nq7Var, w06 w06Var) {
        return nq7Var.a0(new y06(w06Var));
    }

    public static final nq7 n(nq7 nq7Var, btd btdVar, boolean z) {
        nq7Var.getClass();
        btdVar.getClass();
        nq7 k = axe.k(axe.k(tte.l(nq7Var), new f52(btdVar, 1)), new f52(btdVar, 2));
        if (z) {
            return axe.k(k, new f52(btdVar, 3));
        }
        return k;
    }
}
