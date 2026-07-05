package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ube  reason: default package */
/* loaded from: classes3.dex */
public abstract class ube {
    public static final en1 a = new Object();
    public static final mn1 b = new Object();
    public static final tu1 c = new tu1(new rv1(25), false, 1194842797);
    public static final tu1 d = new tu1(new rv1(26), false, -1547859470);
    public static final tu1 e = new tu1(new rv1(27), false, -810783255);
    public static final tu1 f = new tu1(new rv1(28), false, 352797930);
    public static final qm1 g;
    public static final float h;
    public static final qm1 i;
    public static final qm1 j;

    /* JADX WARN: Type inference failed for: r0v0, types: [en1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [mn1, java.lang.Object] */
    static {
        qm1 qm1Var = qm1.f;
        g = qm1Var;
        h = 0.38f;
        i = qm1Var;
        j = qm1.D;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [vl8, c3e] */
    public static tl8 A(String str) {
        int i2;
        str.getClass();
        if (str.length() - 1 < 0) {
            tl8.b.getClass();
            return sl8.b;
        }
        sl8 sl8Var = tl8.b;
        ?? c3eVar = new c3e(8);
        int length = str.length() - 1;
        int i3 = 0;
        int i4 = -1;
        if (length >= 0) {
            int i5 = 0;
            i2 = 0;
            int i6 = -1;
            while (i3 != 1000) {
                char charAt = str.charAt(i5);
                if (charAt != '&') {
                    if (charAt == '=' && i6 == -1) {
                        i6 = i5;
                    }
                } else {
                    q(c3eVar, str, i2, i6, i5);
                    i2 = i5 + 1;
                    i3++;
                    i6 = -1;
                }
                if (i5 != length) {
                    i5++;
                } else {
                    i4 = i6;
                }
            }
            return c3eVar.Y();
        }
        i2 = 0;
        if (i3 != 1000) {
            q(c3eVar, str, i2, i4, str.length());
        }
        return c3eVar.Y();
    }

    public static String B() {
        long j2;
        q2d q2dVar;
        AtomicLong atomicLong = t2d.a;
        byte[] bArr = new byte[10];
        j4a.a.nextBytes(bArr);
        int i2 = ((bArr[8] & 7) << 8) | (bArr[9] & 255) | 28672;
        while (true) {
            AtomicLong atomicLong2 = t2d.a;
            long j3 = atomicLong2.get();
            long b2 = by5.a.k().b();
            long j4 = j3 >>> 16;
            if (j4 < b2) {
                j2 = (b2 << 16) | i2;
                if (atomicLong2.compareAndSet(j3, j2)) {
                    break;
                }
            } else {
                long j5 = j3 + 1;
                if ((32768 & j5) != 0) {
                    j2 = ((j4 + 1) << 16) | i2;
                } else {
                    j2 = j5;
                }
                if (atomicLong2.compareAndSet(j3, j2)) {
                    break;
                }
            }
        }
        bArr[0] = (byte) (((byte) (bArr[0] & 63)) | Byte.MIN_VALUE);
        long j6 = lre.j(bArr, 0);
        if (j2 == 0 && j6 == 0) {
            q2dVar = q2d.c;
        } else {
            q2dVar = new q2d(j2, j6);
        }
        byte[] bArr2 = new byte[32];
        lre.i(q2dVar.a, bArr2, 0, 0, 8);
        lre.i(q2dVar.b, bArr2, 16, 0, 8);
        return r4b.F(bArr2);
    }

    public static int C(z63 z63Var, hz9 hz9Var) {
        if (z63Var instanceof w63) {
            return ((w63) z63Var).a;
        }
        int ordinal = hz9Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.MAX_VALUE;
            }
            xk5.o();
            return 0;
        }
        return Integer.MIN_VALUE;
    }

    public static final int D(int i2, int i3, String str) {
        while (i3 > i2 && nqe.y(str.charAt(i3 - 1))) {
            i3--;
        }
        return i3;
    }

    public static final int E(int i2, int i3, String str) {
        while (i2 < i3 && nqe.y(str.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    public static final void F(fd6 fd6Var, xt4 xt4Var) {
        i38 i38Var;
        if (((mq7) fd6Var).a.J && (i38Var = voe.s(fd6Var, 2).R) != null) {
            i38Var.d2(xt4Var, true);
        }
    }

    public static boolean G(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static final void a(wk3 wk3Var, String str, vt4 vt4Var, boolean z, boolean z2, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        kq7 kq7Var;
        boolean z4;
        long g2;
        boolean z5;
        long b2;
        ar5 ar5Var;
        nq7 n;
        boolean z6;
        long j2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-333537981);
        if (rv4Var2.f(wk3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(vt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var2.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var2.g(z2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7 | 196608;
        if ((74899 & i12) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i12 & 1, z3)) {
            kq7 kq7Var2 = kq7.a;
            nq7 k = tte.k(zbe.z(kq7Var2, 4.0f, 4.0f), r0f.z(rv4Var2).d);
            if ((i12 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var2.P();
            if (z4 || P == ax1.a) {
                P = new hi7(23, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 f2 = lbe.f(15, (vt4) P, k, null, false);
            if (z2) {
                rv4Var2.e0(2124760356);
                g2 = zl1.b(0.08f, r0f.y(rv4Var2).w);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(2124856704);
                g2 = rm1.g(r0f.y(rv4Var2), 3.0f);
                rv4Var2.q(false);
            }
            nq7 z7 = zbe.z(nmd.v(f2, g2, r0f.z(rv4Var2).d), 10.0f, 10.0f);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z7);
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
            nq7 n2 = pna.n(kq7Var2, 28.0f);
            su9 su9Var = uu9.a;
            nq7 k2 = tte.k(n2, su9Var);
            if (z2) {
                rv4Var2.e0(-1397245422);
                long b3 = zl1.b(0.12f, r0f.y(rv4Var2).w);
                rv4Var2.q(false);
                b2 = b3;
                z5 = false;
            } else {
                z5 = false;
                rv4Var2.e0(-1397141200);
                b2 = zl1.b(0.12f, r0f.y(rv4Var2).a);
                rv4Var2.q(false);
            }
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k2, b2, ba5Var), 4.0f);
            nk0 nk0Var = kh5.e;
            b37 d2 = fu0.d(nk0Var, z5);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, y);
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
            ar5 c2 = rp5.c(wk3Var, rv4Var2, i12 & 14);
            if (z) {
                ar5Var = c2;
                n = zbe.y(st0.d(nmd.v(tte.k(kq7Var2, su9Var), sve.d(4294959234L), ba5Var), 1.0f, sve.d(4294964164L), su9Var), 2.0f);
            } else {
                ar5Var = c2;
                n = pna.n(kq7Var2, 24.0f);
            }
            if (z2) {
                rv4Var2.e0(9469812);
                j2 = r0f.y(rv4Var2).w;
                z6 = false;
                rv4Var2.q(false);
            } else {
                z6 = false;
                rv4Var2.e0(9546258);
                j2 = r0f.y(rv4Var2).a;
                rv4Var2.q(false);
            }
            nk5.a(ar5Var, str, n, j2, rv4Var2, i12 & Token.ASSIGN_MOD, 0);
            rs8.u(rv4Var2, true, kq7Var2, 8.0f, rv4Var2);
            b37 d3 = fu0.d(nk0Var, z6);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, kq7Var2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            cvb.c("", pna.f(kq7Var2, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 2, 2, null, r0f.A(rv4Var2).m, rv4Var, 54, 221184, 80892);
            cvb.c(str, pna.f(kq7Var2, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 2, 0, null, r0f.A(rv4Var).m, rv4Var, ((i12 >> 3) & 14) | 48, 24576, 113660);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new fw0(wk3Var, str, vt4Var, z, z2, kq7Var, i2);
        }
    }

    public static final void b(int i2, rv4 rv4Var, boolean z) {
        int i3;
        boolean z2;
        long g2;
        rv4Var.g0(310248573);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            kq7 kq7Var = kq7.a;
            nq7 h2 = pna.h(zbe.z(pna.f(kq7Var, 1.0f), 4.0f, 4.0f), 88.0f);
            if (z) {
                rv4Var.e0(-154095222);
                g2 = zl1.b(0.08f, ((h27) rv4Var.j(j27.a)).a.w);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-153998874);
                g2 = rm1.g(((h27) rv4Var.j(j27.a)).a, 3.0f);
                rv4Var.q(false);
            }
            nq7 z3 = zbe.z(nmd.v(h2, g2, ((h27) rv4Var.j(j27.a)).c.d), 10.0f, 10.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z3);
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
            dpe.g(pna.n(kq7Var, 28.0f), uu9.a, rv4Var, 6, 0);
            dpe.g(pna.h(hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, 0.8f), 12.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, 0.58f), 12.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nd1(i2, z);
        }
    }

    public static final void c(boolean z, String str, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-944457305);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            xb.d(z, xt4Var, jce.E(-1539781165, new oo7(2, vt4Var, xt4Var), rv4Var), null, null, jce.E(1576189296, new id1(xt4Var, 20, (byte) 0), rv4Var), eg0.g, null, 0L, 0L, nae.e, false, false, jce.E(-1483521413, new jd1(str, 19), rv4Var), rv4Var, (i10 & 14) | 1769856 | ((i10 >> 3) & Token.ASSIGN_MOD), 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gl7(z, str, xt4Var, vt4Var, i2, 0);
        }
    }

    public static final void d(boolean z, List list, List list2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        rv4Var.g0(118783945);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(list2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        boolean z3 = true;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            if ((i12 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r81) it.next()).a);
                }
                P = yae.z(arrayList);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            xb.d(z, xt4Var, jce.E(-921557219, new or3(3, xt4Var2, aw7Var), rv4Var), null, null, jce.E(488534432, new id1(xt4Var, 21, (byte) 0), rv4Var), eg0.j, null, 0L, 0L, nae.e, false, false, jce.E(-556901515, new sv4(22, list2, aw7Var), rv4Var), rv4Var, (i12 & 14) | 1769856 | ((i12 >> 6) & Token.ASSIGN_MOD), 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(z, list, list2, xt4Var, xt4Var2, i2, 8);
        }
    }

    public static final void e(boolean z, String str, xt4 xt4Var, lu4 lu4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        xt4 xt4Var7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        str.getClass();
        xt4Var.getClass();
        lu4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        rv4Var.g0(-407529514);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i3 | i2;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if ((i2 & 384) == 0) {
            xt4Var7 = xt4Var;
            if (rv4Var.h(xt4Var7)) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i13 |= i11;
        } else {
            xt4Var7 = xt4Var;
        }
        if (rv4Var.h(lu4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i7;
        if (rv4Var.h(xt4Var4)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (rv4Var.h(xt4Var5)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (rv4Var.h(xt4Var6)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10;
        if ((38347923 & i19) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i19 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(1161173381);
                f(z, str, xt4Var7, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, rv4Var, i19 & 268435454);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1161567050);
                g(z, str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, rv4Var, i19 & 268435454);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new al7(z, str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, i2, 0);
        }
    }

    public static final void f(boolean z, String str, xt4 xt4Var, lu4 lu4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, rv4 rv4Var, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        rv4Var.g0(1205605824);
        if ((i2 & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            z2 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(str)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i3 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(lu4Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i3 |= i7;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i2) == 0) {
            if (rv4Var.h(xt4Var5)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i2) == 0) {
            if (rv4Var.h(xt4Var6)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        if ((38347923 & i3) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i3 & 1, z3)) {
            nmd.d(z2, xt4Var, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-1282440164, new sq5(str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6), rv4Var), rv4Var, (i3 & 14) | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new al7(z, str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, i2, 1);
        }
    }

    public static final void g(boolean z, String str, xt4 xt4Var, lu4 lu4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        rv4Var.g0(-1983810690);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(str)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i3 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(lu4Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i3 |= i7;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i2) == 0) {
            if (rv4Var.h(xt4Var5)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i2) == 0) {
            if (rv4Var.h(xt4Var6)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        if ((38347923 & i3) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            xb.d(z, xt4Var, null, null, mwe.u(kq7.a, false, 14), null, null, null, 0L, 0L, nae.e, false, false, jce.E(-979084502, new f07(str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, 4), rv4Var), rv4Var, (i3 & 14) | ((i3 >> 3) & Token.ASSIGN_MOD), 8172);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new al7(z, str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, i2, 2);
        }
    }

    public static final void h(String str, String str2, long j2, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4Var.g0(659171273);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.e(j2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5;
        boolean z2 = false;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            if ((i8 & 896) == 256) {
                z2 = true;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = zj1.f(j2, "E, dd MMM, h:mm aa");
                rv4Var.o0(P);
            }
            String B = yqe.B((y3b) b3b.t.getValue(), new Object[]{str, str2, (String) P}, rv4Var);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                qa5 qa5Var = qa5.a;
                P2 = qa5.d(B);
                rv4Var.o0(P2);
            }
            tza tzaVar = j27.a;
            cvb.d((ps) P2, nq7Var, zl1.b(0.8f, ((h27) rv4Var.j(tzaVar)).a.q), 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 54, 0, 262136);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z42(str, str2, j2, nq7Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void i(List list, boolean z, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean h2;
        int i6;
        rv4Var.g0(-832919800);
        int i7 = 4;
        int i8 = 2;
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rv4Var.f(list);
            } else {
                h2 = rv4Var.h(list);
            }
            if (h2) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        boolean z4 = true;
        ?? r13 = 0;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            int size = list.size();
            if (ikd.a(rv4Var)) {
                i7 = 3;
            }
            if (size < 2) {
                size = 2;
            }
            if (i7 > size) {
                i7 = size;
            }
            if (i7 >= 2) {
                i8 = i7;
            }
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            rv4Var.e0(-931894551);
            List r = r(i8, list);
            int size2 = r.size();
            int i9 = 0;
            while (i9 < size2) {
                List list2 = (List) r.get(i9);
                float f2 = 1.0f;
                nq7 f3 = pna.f(kq7.a, 1.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, r13);
                List list3 = r;
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, f3);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a3);
                jce.F(qw1.e, rv4Var, l2);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p2);
                rv4Var.e0(-1399832981);
                int size3 = list2.size();
                int i10 = 0;
                while (i10 < size3) {
                    dia diaVar = (dia) list2.get(i10);
                    we6 we6Var = new we6(f2, z4);
                    b37 d2 = fu0.d(kh5.a, false);
                    int i11 = size3;
                    int hashCode3 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, we6Var);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d2);
                    jce.F(qw1.e, rv4Var, l3);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p3);
                    int i12 = i9;
                    wk3 wk3Var = diaVar.a;
                    List list4 = list2;
                    String str = diaVar.b;
                    vt4 vt4Var = diaVar.c;
                    if (diaVar.d && !z) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a(wk3Var, str, vt4Var, z3, diaVar.e, null, rv4Var, 0);
                    rv4Var.q(true);
                    i10++;
                    list2 = list4;
                    f2 = 1.0f;
                    z4 = true;
                    i9 = i12;
                    size3 = i11;
                }
                rv4Var.q(false);
                rv4Var.q(z4);
                i9++;
                r13 = 0;
                r = list3;
            }
            rv4Var.q(r13);
            rv4Var.q(z4);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z52(list, z, nq7Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    public static final void j(nq7 nq7Var, rv4 rv4Var, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        rv4Var.g0(1410514354);
        int i5 = 2;
        ?? r5 = 0;
        boolean z3 = true;
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            int i6 = 3;
            if (ikd.a(rv4Var)) {
                i3 = 3;
            } else {
                i3 = 4;
            }
            int i7 = i3 * 2;
            int i8 = i7 + 1;
            if (!ikd.a(rv4Var)) {
                i6 = 4;
            }
            if (i8 < 2) {
                i4 = 2;
            } else {
                i4 = i8;
            }
            if (i6 > i4) {
                i6 = i4;
            }
            if (i6 >= 2) {
                i5 = i6;
            }
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            List C0 = sl1.C0(dce.F(0, i8));
            rv4Var.e0(-777641147);
            List r = r(i5, C0);
            int size = r.size();
            int i9 = 0;
            while (i9 < size) {
                List list = (List) r.get(i9);
                float f2 = 1.0f;
                nq7 f3 = pna.f(kq7.a, 1.0f);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, r5);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, f3);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a3);
                jce.F(qw1.e, rv4Var, l2);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p2);
                rv4Var.e0(387610243);
                int size2 = list.size();
                int i10 = 0;
                while (i10 < size2) {
                    int intValue = ((Number) list.get(i10)).intValue();
                    we6 we6Var = new we6(f2, z3);
                    b37 d2 = fu0.d(kh5.a, false);
                    int i11 = size;
                    int hashCode3 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, we6Var);
                    rw1.k.getClass();
                    zx1 zx1Var3 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var3);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d2);
                    jce.F(qw1.e, rv4Var, l3);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p3);
                    if (intValue == i7) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b(0, rv4Var, z2);
                    rv4Var.q(true);
                    i10++;
                    z3 = true;
                    size = i11;
                    f2 = 1.0f;
                }
                boolean z4 = z3;
                rv4Var.q(false);
                rv4Var.q(z4);
                i9++;
                r5 = 0;
                z3 = z4;
            }
            rv4Var.q(r5);
            rv4Var.q(z3);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i2, 20);
        }
    }

    public static final void k(List list, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean h2;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1213134575);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rv4Var2.f(list);
            } else {
                h2 = rv4Var2.h(list);
            }
            if (h2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            if (list.isEmpty()) {
                rv4Var2.e0(1657887157);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = rv4Var2.P();
                if (z2 || P == ax1.a) {
                    P = new hi7(21, vt4Var);
                    rv4Var2.o0(P);
                }
                nq7 t = q1d.t(1, (vt4) P, rv4Var2, nq7Var, false);
                gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                int hashCode = Long.hashCode(rv4Var2.T);
                xt8 l = rv4Var2.l();
                nq7 p = lye.p(rv4Var2, t);
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
                ar5 c2 = rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0);
                tza tzaVar = j27.a;
                nk5.a(c2, null, null, zl1.b(0.8f, ((h27) rv4Var2.j(tzaVar)).a.q), rv4Var2, 48, 4);
                kq7 kq7Var = kq7.a;
                xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
                cvb.c(yqe.A((y3b) f2b.p0.getValue(), rv4Var2), kq7Var, zl1.b(0.8f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var2, 48, 0, 131064);
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1658638101);
                s9e.f(nq7Var, new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(-605967768, new ld1(list, vt4Var, xt4Var, 24), rv4Var2), rv4Var2, ((i3 >> 3) & 14) | 1573296);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new il7(list, nq7Var, xt4Var, vt4Var, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(String str, nq7 nq7Var, vt4 vt4Var, lu4 lu4Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, vt4 vt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        vt4 vt4Var3;
        xt4 xt4Var6;
        boolean z2;
        pb2 pb2Var;
        int i12;
        boolean z3;
        pb2 pb2Var2;
        boolean z4;
        aw7 aw7Var;
        Object obj;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i13;
        vt4 vt4Var4;
        int i14;
        String str2;
        vt4 vt4Var5;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj2;
        Object obj3;
        boolean z15;
        String str3;
        boolean z16;
        boolean z17;
        boolean z18;
        int i15;
        Object obj4;
        boolean z19;
        int i16;
        Object obj5;
        int i17;
        rv4Var.g0(568958787);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i18 = i2 | i3;
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i18 |= i17;
        }
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i19 = i18 | i4;
        if (rv4Var.h(lu4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i20 = i19 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i21 = i20 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i22 = i21 | i7;
        if (rv4Var.h(xt4Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i23 = i22 | i8;
        if (rv4Var.h(xt4Var4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i24 = i23 | i9;
        if (rv4Var.h(xt4Var5)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i25 = i24 | i10;
        if (rv4Var.h(vt4Var2)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i26 = i25 | i11;
        if ((i26 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i26 & 1, z)) {
            int i27 = i26 & 14;
            if (i27 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj6 = ax1.a;
            Object obj7 = P;
            if (z2 || P == obj6) {
                Object v85Var = new v85(str, 10);
                rv4Var.o0(v85Var);
                obj7 = v85Var;
            }
            vt4 vt4Var6 = (vt4) obj7;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                gia giaVar = (gia) ((fdd) voe.z(cm9.a(gia.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var6));
                sdd sddVar = (sdd) rv4Var.j(idd.b);
                if (sddVar == null) {
                    rv4Var.e0(1368428688);
                    sddVar = kv6.a(rv4Var);
                    i12 = i26;
                    z3 = false;
                } else {
                    i12 = i26;
                    z3 = false;
                    rv4Var.e0(1368426673);
                }
                rv4Var.q(z3);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    pb2 pb2Var3 = pb2Var2;
                    q0a a3 = o96.a(rv4Var);
                    aw7 z20 = jsc.z(giaVar.D, rv4Var);
                    aw7 z21 = jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var3, a3, null))).f, rv4Var);
                    kb kbVar = (kb) rv4Var.j(yb.a);
                    Object P2 = rv4Var.P();
                    Object obj8 = P2;
                    if (P2 == obj6) {
                        Object s = yte.s(rv4Var);
                        rv4Var.o0(s);
                        obj8 = s;
                    }
                    m82 m82Var = (m82) obj8;
                    s02 s02Var = giaVar.E;
                    boolean f2 = rv4Var.f(kbVar);
                    int i28 = i12 & 1879048192;
                    if (i28 == 536870912) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z22 = f2 | z4;
                    Object P3 = rv4Var.P();
                    Object obj9 = P3;
                    if (z22 || P3 == obj6) {
                        Object we1Var = new we1(kbVar, vt4Var2, (m42) null, 12);
                        rv4Var.o0(we1Var);
                        obj9 = we1Var;
                    }
                    jye.b(s02Var, null, (mu4) obj9, rv4Var, 0);
                    Object[] objArr = new Object[0];
                    Object P4 = rv4Var.P();
                    Object obj10 = P4;
                    if (P4 == obj6) {
                        Object rh7Var = new rh7(11);
                        rv4Var.o0(rh7Var);
                        obj10 = rh7Var;
                    }
                    aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) obj10, rv4Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object P5 = rv4Var.P();
                    Object obj11 = P5;
                    if (P5 == obj6) {
                        Object rh7Var2 = new rh7(12);
                        rv4Var.o0(rh7Var2);
                        obj11 = rh7Var2;
                    }
                    aw7 aw7Var3 = (aw7) zpe.k(objArr2, (vt4) obj11, rv4Var, 48);
                    Object[] objArr3 = new Object[0];
                    Object P6 = rv4Var.P();
                    Object obj12 = P6;
                    if (P6 == obj6) {
                        Object rh7Var3 = new rh7(13);
                        rv4Var.o0(rh7Var3);
                        obj12 = rh7Var3;
                    }
                    aw7 aw7Var4 = (aw7) zpe.k(objArr3, (vt4) obj12, rv4Var, 48);
                    Object[] objArr4 = new Object[0];
                    Object P7 = rv4Var.P();
                    if (P7 == obj6) {
                        aw7Var = aw7Var4;
                        Object rh7Var4 = new rh7(14);
                        rv4Var.o0(rh7Var4);
                        obj = rh7Var4;
                    } else {
                        aw7Var = aw7Var4;
                        obj = P7;
                    }
                    aw7 aw7Var5 = (aw7) zpe.k(objArr4, (vt4) obj, rv4Var, 48);
                    Object obj13 = (io5) rv4Var.j(do5.a);
                    eia eiaVar = (eia) z20.getValue();
                    boolean z23 = ((y0d) z21.getValue()).f;
                    boolean z24 = ((y0d) z21.getValue()).a;
                    if ((i12 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i27 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z25 = z5 | z6;
                    Object P8 = rv4Var.P();
                    Object obj14 = P8;
                    if (z25 || P8 == obj6) {
                        Object xr1Var = new xr1(3, xt4Var, str);
                        rv4Var.o0(xr1Var);
                        obj14 = xr1Var;
                    }
                    vt4 vt4Var7 = (vt4) obj14;
                    boolean f3 = rv4Var.f(giaVar) | rv4Var.h(obj13);
                    Object P9 = rv4Var.P();
                    Object obj15 = P9;
                    if (f3 || P9 == obj6) {
                        Object mf6Var = new mf6(27, giaVar, obj13);
                        rv4Var.o0(mf6Var);
                        obj15 = mf6Var;
                    }
                    vt4 vt4Var8 = (vt4) obj15;
                    boolean f4 = rv4Var.f(aw7Var3);
                    Object P10 = rv4Var.P();
                    Object obj16 = P10;
                    if (f4 || P10 == obj6) {
                        Object nd7Var = new nd7(aw7Var3, 21);
                        rv4Var.o0(nd7Var);
                        obj16 = nd7Var;
                    }
                    vt4 vt4Var9 = (vt4) obj16;
                    if ((i12 & 458752) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i27 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z26 = z7 | z8;
                    Object P11 = rv4Var.P();
                    Object obj17 = P11;
                    if (z26 || P11 == obj6) {
                        Object xr1Var2 = new xr1(4, xt4Var2, str);
                        rv4Var.o0(xr1Var2);
                        obj17 = xr1Var2;
                    }
                    vt4 vt4Var10 = (vt4) obj17;
                    boolean f5 = rv4Var.f(aw7Var2);
                    Object P12 = rv4Var.P();
                    Object obj18 = P12;
                    if (f5 || P12 == obj6) {
                        Object nd7Var2 = new nd7(aw7Var2, 22);
                        rv4Var.o0(nd7Var2);
                        obj18 = nd7Var2;
                    }
                    vt4 vt4Var11 = (vt4) obj18;
                    boolean f6 = rv4Var.f(z21);
                    if ((i12 & 3670016) == 1048576) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z27 = z9 | f6;
                    if (i27 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z28 = z27 | z10;
                    if (i28 == 536870912) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean h2 = z28 | z11 | rv4Var.h(m82Var) | rv4Var.f(kbVar);
                    Object P13 = rv4Var.P();
                    if (!h2 && P13 != obj6) {
                        str2 = str;
                        vt4Var5 = vt4Var2;
                        i13 = i27;
                        vt4Var4 = vt4Var8;
                        i14 = i12;
                    } else {
                        i13 = i27;
                        vt4Var4 = vt4Var8;
                        i14 = i12;
                        Object le1Var = new le1(xt4Var3, str, vt4Var2, m82Var, z21, kbVar);
                        str2 = str;
                        vt4Var5 = vt4Var2;
                        rv4Var.o0(le1Var);
                        P13 = le1Var;
                    }
                    vt4 vt4Var12 = (vt4) P13;
                    if ((234881024 & i14) == 67108864) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i13 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z29 = z12 | z13;
                    if (i28 == 536870912) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z30 = z29 | z14;
                    Object P14 = rv4Var.P();
                    if (!z30 && P14 != obj6) {
                        xt4Var6 = xt4Var5;
                        obj2 = P14;
                    } else {
                        xt4Var6 = xt4Var5;
                        Object bl7Var = new bl7(xt4Var6, str2, vt4Var5);
                        rv4Var.o0(bl7Var);
                        obj2 = bl7Var;
                    }
                    vt4 vt4Var13 = (vt4) obj2;
                    aw7 aw7Var6 = aw7Var;
                    boolean f7 = rv4Var.f(aw7Var6);
                    Object P15 = rv4Var.P();
                    Object obj19 = P15;
                    if (f7 || P15 == obj6) {
                        Object nd7Var3 = new nd7(aw7Var6, 19);
                        rv4Var.o0(nd7Var3);
                        obj19 = nd7Var3;
                    }
                    vt4 vt4Var14 = (vt4) obj19;
                    boolean f8 = rv4Var.f(aw7Var5);
                    Object P16 = rv4Var.P();
                    Object obj20 = P16;
                    if (f8 || P16 == obj6) {
                        Object nd7Var4 = new nd7(aw7Var5, 20);
                        rv4Var.o0(nd7Var4);
                        obj20 = nd7Var4;
                    }
                    vt4 vt4Var15 = (vt4) obj20;
                    boolean f9 = rv4Var.f(giaVar);
                    Object P17 = rv4Var.P();
                    if (f9 || P17 == obj6) {
                        Object cl7Var = new cl7(giaVar, 0);
                        rv4Var.o0(cl7Var);
                        obj3 = cl7Var;
                    } else {
                        obj3 = P17;
                    }
                    int i29 = i14 << 6;
                    m(eiaVar, z23, z24, nq7Var, vt4Var7, vt4Var4, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, xt4Var4, vt4Var15, (xt4) obj3, lu4Var, rv4Var, i29 & 7168, ((i14 >> 15) & 896) | (i29 & 458752));
                    boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                    String str4 = ((eia) z20.getValue()).d;
                    if (((eia) z20.getValue()).t == 1) {
                        z15 = booleanValue;
                        str3 = str4;
                        z16 = true;
                    } else {
                        z15 = booleanValue;
                        str3 = str4;
                        z16 = false;
                    }
                    if (((eia) z20.getValue()).s == 0) {
                        z17 = z15;
                        z18 = true;
                    } else {
                        z17 = z15;
                        z18 = false;
                    }
                    boolean f10 = rv4Var.f(aw7Var2);
                    Object P18 = rv4Var.P();
                    Object obj21 = P18;
                    if (f10 || P18 == obj6) {
                        Object dk7Var = new dk7(aw7Var2, 6);
                        rv4Var.o0(dk7Var);
                        obj21 = dk7Var;
                    }
                    xt4 xt4Var7 = (xt4) obj21;
                    boolean f11 = rv4Var.f(giaVar);
                    Object P19 = rv4Var.P();
                    if (!f11 && P19 != obj6) {
                        i15 = 0;
                        obj4 = P19;
                    } else {
                        i15 = 0;
                        Object dl7Var = new dl7(giaVar, 0);
                        rv4Var.o0(dl7Var);
                        obj4 = dl7Var;
                    }
                    zr1.e(z17, str3, z16, z18, 0, xt4Var7, (pu4) obj4, rv4Var, 0, 16);
                    boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
                    String str5 = ((eia) z20.getValue()).d;
                    if (((eia) z20.getValue()).s == 0) {
                        z19 = 1;
                    } else {
                        z19 = i15;
                    }
                    boolean f12 = rv4Var.f(aw7Var3);
                    Object P20 = rv4Var.P();
                    Object obj22 = P20;
                    if (f12 || P20 == obj6) {
                        Object dk7Var2 = new dk7(aw7Var3, 7);
                        rv4Var.o0(dk7Var2);
                        obj22 = dk7Var2;
                    }
                    xt4 xt4Var8 = (xt4) obj22;
                    boolean f13 = rv4Var.f(giaVar);
                    Object P21 = rv4Var.P();
                    Object obj23 = P21;
                    if (f13 || P21 == obj6) {
                        Object el7Var = new el7(giaVar, i15);
                        rv4Var.o0(el7Var);
                        obj23 = el7Var;
                    }
                    yz1.d(str5, z19, 0, booleanValue2, xt4Var8, (lu4) obj23, rv4Var, 0, 4);
                    boolean booleanValue3 = ((Boolean) aw7Var6.getValue()).booleanValue();
                    String str6 = ((eia) z20.getValue()).d;
                    boolean f14 = rv4Var.f(aw7Var6);
                    Object P22 = rv4Var.P();
                    Object obj24 = P22;
                    if (f14 || P22 == obj6) {
                        Object dk7Var3 = new dk7(aw7Var6, 8);
                        rv4Var.o0(dk7Var3);
                        obj24 = dk7Var3;
                    }
                    xt4 xt4Var9 = (xt4) obj24;
                    int i30 = (rv4Var.f(giaVar) ? 1 : 0) | (rv4Var.f(aw7Var6) ? 1 : 0);
                    if ((i14 & 896) == 256) {
                        i16 = 1;
                    } else {
                        i16 = i15;
                    }
                    int i31 = i30 | i16;
                    Object P23 = rv4Var.P();
                    if (i31 == 0 && P23 != obj6) {
                        vt4Var3 = vt4Var;
                        obj5 = P23;
                    } else {
                        vt4Var3 = vt4Var;
                        Object se0Var = new se0(23, giaVar, vt4Var3, aw7Var6);
                        rv4Var.o0(se0Var);
                        obj5 = se0Var;
                    }
                    c(booleanValue3, str6, xt4Var9, (vt4) obj5, rv4Var, 0);
                    boolean booleanValue4 = ((Boolean) aw7Var5.getValue()).booleanValue();
                    List list = ((eia) z20.getValue()).u;
                    List list2 = ((eia) z20.getValue()).v;
                    boolean f15 = rv4Var.f(aw7Var5);
                    Object P24 = rv4Var.P();
                    Object obj25 = P24;
                    if (f15 || P24 == obj6) {
                        Object dk7Var4 = new dk7(aw7Var5, 9);
                        rv4Var.o0(dk7Var4);
                        obj25 = dk7Var4;
                    }
                    xt4 xt4Var10 = (xt4) obj25;
                    boolean f16 = rv4Var.f(aw7Var5) | rv4Var.f(giaVar);
                    Object P25 = rv4Var.P();
                    Object obj26 = P25;
                    if (f16 || P25 == obj6) {
                        Object fl7Var = new fl7(i15, giaVar, aw7Var5);
                        rv4Var.o0(fl7Var);
                        obj26 = fl7Var;
                    }
                    d(booleanValue4, list, list2, xt4Var10, (xt4) obj26, rv4Var, 0);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            vt4Var3 = vt4Var;
            xt4Var6 = xt4Var5;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ql7(str, nq7Var, vt4Var3, lu4Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var6, vt4Var2, i2);
        }
    }

    public static final void m(final eia eiaVar, final boolean z, final boolean z2, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final xt4 xt4Var, final vt4 vt4Var9, final xt4 xt4Var2, final lu4 lu4Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        final boolean z4;
        eia eiaVar2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        kq7 kq7Var;
        boolean z9;
        float f2;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean h2;
        int i15;
        rv4Var.g0(-1170846115);
        int i16 = 2;
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rv4Var.f(eiaVar);
            } else {
                h2 = rv4Var.h(eiaVar);
            }
            if (h2) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i4 = i2 | i15;
        } else {
            i4 = i2;
        }
        int i17 = 32;
        if ((i2 & 48) == 0) {
            if (rv4Var.g(z)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i4 |= i14;
        }
        int i18 = i2 & 384;
        int i19 = Token.CASE;
        if (i18 == 0) {
            if (rv4Var.g(z2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i4 |= i13;
        }
        int i20 = 1024;
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i4 |= i12;
        }
        int i21 = 8192;
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i4 |= i11;
        }
        int i22 = i2 & 196608;
        int i23 = Parser.ARGC_LIMIT;
        if (i22 == 0) {
            if (rv4Var.h(vt4Var2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.h(vt4Var4)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i4 |= i8;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.h(vt4Var5)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i4 |= i7;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.h(vt4Var6)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i4 |= i6;
        }
        int i24 = i4;
        if ((i3 & 6) == 0) {
            if (rv4Var.h(vt4Var7)) {
                i16 = 4;
            }
            i5 = i3 | i16;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (!rv4Var.h(vt4Var8)) {
                i17 = 16;
            }
            i5 |= i17;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i19 = 256;
            }
            i5 |= i19;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.h(vt4Var9)) {
                i20 = 2048;
            }
            i5 |= i20;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i21 = 16384;
            }
            i5 |= i21;
        }
        if ((i3 & 196608) == 0) {
            if (rv4Var.h(lu4Var)) {
                i23 = 131072;
            }
            i5 |= i23;
        }
        int i25 = i5;
        if ((i24 & 306783379) == 306783378 && (i25 & 74899) == 74898) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var.U(i24 & 1, z3)) {
            boolean z10 = eiaVar.a;
            int i26 = eiaVar.t;
            if (z10) {
                rv4Var.e0(-1246635180);
                o(nq7Var, rv4Var, (i24 >> 9) & 14);
                rv4Var.q(false);
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new lu4() { // from class: hl7
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i27 = r20;
                            pvc pvcVar = pvc.a;
                            int i28 = i3;
                            int i29 = i2;
                            switch (i27) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int p = xoe.p(i29 | 1);
                                    int p2 = xoe.p(i28);
                                    ube.m(eiaVar, z, z2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var, vt4Var9, xt4Var2, lu4Var, (rv4) obj, p, p2);
                                    return pvcVar;
                                default:
                                    ((Integer) obj2).getClass();
                                    int p3 = xoe.p(i29 | 1);
                                    int p4 = xoe.p(i28);
                                    ube.m(eiaVar, z, z2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var, vt4Var9, xt4Var2, lu4Var, (rv4) obj, p3, p4);
                                    return pvcVar;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            rv4Var.e0(-1246557339);
            rv4Var.q(false);
            rv4Var.e0(98339130);
            jq6 t = tl1.t();
            t.add(new dia((wk3) jk3.P.getValue(), yqe.A((y3b) v1b.q0.getValue(), rv4Var), vt4Var, 24));
            pka pkaVar = pka.a;
            ((fm) pka.b.getValue()).getClass();
            Context context = twe.e;
            context.getClass();
            if (qka.l(context) && i26 == 1) {
                rv4Var.e0(158375449);
                t.add(new dia((wk3) jk3.i.getValue(), yqe.A((y3b) v1b.n0.getValue(), rv4Var), vt4Var2, 24));
                rv4Var.q(false);
            } else {
                rv4Var.e0(158638763);
                rv4Var.q(false);
            }
            if (i26 != 1) {
                rv4Var.e0(158708327);
                t.add(new dia((wk3) ok3.c0.getValue(), yqe.A((y3b) v1b.u.getValue(), rv4Var), vt4Var3, 24));
                rv4Var.q(false);
            } else {
                rv4Var.e0(158958187);
                rv4Var.q(false);
            }
            if (!eiaVar.p && eiaVar.b) {
                rv4Var.e0(159028247);
                t.add(new dia((wk3) jk3.c0.getValue(), yqe.A((y3b) v1b.v0.getValue(), rv4Var), vt4Var4, 24));
                rv4Var.q(false);
            } else {
                rv4Var.e0(159293483);
                rv4Var.q(false);
            }
            if (eiaVar.q) {
                rv4Var.e0(159343176);
                t.add(new dia((wk3) jk3.L.getValue(), yqe.A((y3b) v1b.p0.getValue(), rv4Var), vt4Var5, 24));
                rv4Var.q(false);
            } else {
                rv4Var.e0(159592075);
                rv4Var.q(false);
            }
            if (eiaVar.r && i26 == 1) {
                rv4Var.e0(159691368);
                t.add(new dia((wk3) rk3.q.getValue(), yqe.A((y3b) v1b.r0.getValue(), rv4Var), vt4Var6, 16));
                rv4Var.q(false);
            } else {
                rv4Var.e0(159971019);
                rv4Var.q(false);
            }
            if (z2) {
                rv4Var.e0(160066189);
                t.add(new dia((wk3) ok3.q.getValue(), yqe.A((y3b) v1b.x0.getValue(), rv4Var), vt4Var7, 24));
                rv4Var.q(false);
            } else {
                rv4Var.e0(160310283);
                rv4Var.q(false);
            }
            t.add(new dia((wk3) jk3.H.getValue(), yqe.A((y3b) v1b.o0.getValue(), rv4Var), vt4Var8, 8));
            jq6 r = tl1.r(t);
            rv4Var.q(false);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (i26 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            String str = eiaVar.c;
            String str2 = eiaVar.d;
            String str3 = eiaVar.e;
            String str4 = eiaVar.f;
            String str5 = eiaVar.g;
            boolean z11 = z5;
            String str6 = eiaVar.i;
            String str7 = eiaVar.h;
            boolean z12 = eiaVar.j;
            if (eiaVar.s == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z13 = eiaVar.k;
            boolean z14 = eiaVar.p;
            boolean z15 = z6;
            kq7 kq7Var2 = kq7.a;
            nq7 f4 = pna.f(kq7Var2, 1.0f);
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(f4, rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), ((h27) rv4Var.j(tzaVar)).c.d), 12.0f);
            if ((i25 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i24 & 14) != 4 && ((i24 & 8) == 0 || !rv4Var.h(eiaVar))) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z16 = z8 | z7;
            Object P = rv4Var.P();
            if (z16 || P == ax1.a) {
                P = new mf6(28, lu4Var, eiaVar);
                rv4Var.o0(P);
            }
            n(str, str2, str3, str4, str6, str7, str5, z12, z15, z13, z11, z14, y, (vt4) P, xt4Var2, rv4Var, 0, i25 & 57344);
            eiaVar2 = eiaVar;
            if (eiaVar2.l > 0) {
                kq7Var = kq7Var2;
                f2 = 12.0f;
                s21.w(rv4Var, 1538024363, kq7Var, 12.0f, rv4Var);
                f3 = 1.0f;
                h(eiaVar2.m, eiaVar2.n, eiaVar2.l, pna.f(kq7Var, 1.0f), rv4Var, 3072);
                z9 = false;
                rv4Var.q(false);
            } else {
                kq7Var = kq7Var2;
                z9 = false;
                f2 = 12.0f;
                f3 = 1.0f;
                rv4Var.e0(1538335727);
                rv4Var.q(false);
            }
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            if (i26 == 1 && !eiaVar2.v.isEmpty()) {
                s21.w(rv4Var, 1538502197, kq7Var, f2, rv4Var);
                k(eiaVar2.u, zbe.y(nmd.v(pna.f(kq7Var, f3), rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), ((h27) rv4Var.j(tzaVar)).c.d), f2), xt4Var, vt4Var9, rv4Var, i25 & 8064);
                rv4Var.q(z9);
            } else {
                rv4Var.e0(1539019215);
                rv4Var.q(z9);
            }
            z4 = z;
            i(r, z4, hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, f3), rv4Var, (i24 & Token.ASSIGN_MOD) | 384);
            rv4Var.q(true);
        } else {
            z4 = z;
            eiaVar2 = eiaVar;
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            final eia eiaVar3 = eiaVar2;
            u2.d = new lu4() { // from class: hl7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i27 = r20;
                    pvc pvcVar = pvc.a;
                    int i28 = i3;
                    int i29 = i2;
                    switch (i27) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int p2 = xoe.p(i29 | 1);
                            int p22 = xoe.p(i28);
                            ube.m(eiaVar3, z4, z2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var, vt4Var9, xt4Var2, lu4Var, (rv4) obj, p2, p22);
                            return pvcVar;
                        default:
                            ((Integer) obj2).getClass();
                            int p3 = xoe.p(i29 | 1);
                            int p4 = xoe.p(i28);
                            ube.m(eiaVar3, z4, z2, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var, vt4Var9, xt4Var2, lu4Var, (rv4) obj, p3, p4);
                            return pvcVar;
                    }
                }
            };
        }
    }

    public static final void n(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final boolean z, final boolean z2, boolean z3, final boolean z4, final boolean z5, final nq7 nq7Var, final vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        lh9 lh9Var;
        ar5 c2;
        final boolean z6 = z3;
        final xt4 xt4Var2 = xt4Var;
        rv4 rv4Var2 = rv4Var;
        mk0 mk0Var = kh5.G;
        rv4Var2.g0(1373391728);
        int i5 = i2 | (rv4Var2.f(str) ? 4 : 2) | (rv4Var2.f(str2) ? 32 : 16);
        boolean f2 = rv4Var2.f(str3);
        int i6 = Token.CASE;
        int i7 = i5 | (f2 ? 256 : 128) | (rv4Var2.f(str4) ? 2048 : 1024) | (rv4Var2.f(str5) ? 16384 : 8192) | (rv4Var2.f(str6) ? 131072 : Parser.ARGC_LIMIT) | (rv4Var2.f(str7) ? 1048576 : 524288) | (rv4Var2.g(z2) ? 67108864 : 33554432) | (rv4Var2.g(z6) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (rv4Var2.g(z4) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= rv4Var2.g(z5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i3 & 3072) == 0) {
            i4 |= rv4Var2.h(vt4Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= rv4Var2.h(xt4Var2) ? 16384 : 8192;
        }
        int i8 = i4;
        if (rv4Var2.U(i7 & 1, ((i7 & 302589075) == 302589074 && (i8 & 9363) == 9362) ? false : true)) {
            mk0 mk0Var2 = kh5.F;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var2, rv4Var2, 48);
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
            u22 u22Var = r0f.d;
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.p(kq7Var, 64.0f, 96.0f), r0f.z(rv4Var2).b);
            boolean z7 = !z5;
            boolean z8 = (i8 & 7168) == 2048;
            Object P = rv4Var2.P();
            boolean z9 = z8;
            lh9 lh9Var2 = ax1.a;
            if (z9 || P == lh9Var2) {
                lh9Var = lh9Var2;
                P = new hi7(22, vt4Var);
                rv4Var2.o0(P);
            } else {
                lh9Var = lh9Var2;
            }
            int i9 = i7 >> 3;
            do5.c(str, str2, str4, str7, u22Var, q1d.b(k, z7, nae.e, (vt4) P, 2), rv4Var, (i7 & 14) | 24576 | (i7 & Token.ASSIGN_MOD) | (i9 & 896) | ((i7 >> 9) & 7168));
            rv4Var2 = rv4Var;
            nq7 h2 = pna.h(rs8.d(kq7Var, 12.0f, rv4Var2, 1.0f, true), 96.0f);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, h2);
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
            cvb.c(str2, rs8.e(1.0f, pna.f(kq7Var, 1.0f), true), 0L, new qa0(bmb.a, zr1.q(18), zr1.p(0.25d)), 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var2, i9 & 14, 384, 125940);
            if (str3.length() > 0) {
                s21.w(rv4Var2, 497974013, kq7Var, 6.0f, rv4Var2);
                gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, kq7Var);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar, rv4Var2, a4);
                jce.F(npVar2, rv4Var2, l3);
                s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar4, rv4Var2, p3);
                nk5.b(rp5.b((wk3) ok3.Y.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 14.0f), r0f.y(rv4Var2).a, rv4Var2, 440, 0);
                xbe.i(rv4Var2, pna.s(kq7Var, 6.0f));
                cvb.c(str3, pna.f(kq7Var, 1.0f), zl1.b(0.8f, r0f.y(rv4Var2).o), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, r0f.A(rv4Var2).k, rv4Var2, ((i7 >> 6) & 14) | 48, 24576, 114680);
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(498880236);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            gv9 a5 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode4 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a5);
            jce.F(npVar2, rv4Var2, l4);
            s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p4);
            if (str5.length() > 0) {
                rv4Var2.e0(1058223587);
                do5.a(new h54(0L, str5, ""), u22Var, false, null, null, eg0.c, tte.k(pna.n(kq7Var, 18.0f), uu9.a), null, rv4Var2, 1572912, 828);
                rs8.v(kq7Var, 6.0f, rv4Var2, false);
            } else {
                rv4Var2.e0(1058697360);
                rv4Var2.q(false);
            }
            cvb.c(str6, null, r0f.y(rv4Var2).a, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, r0f.A(rv4Var2).m, rv4Var2, (i7 >> 15) & 14, 24960, 109562);
            rv4Var2.q(true);
            rv4Var2.q(true);
            gv9 a6 = ev9.a(dzVar, mk0Var2, rv4Var2, 0);
            int hashCode5 = Long.hashCode(rv4Var2.T);
            xt8 l5 = rv4Var2.l();
            nq7 p5 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a6);
            jce.F(npVar2, rv4Var2, l5);
            s21.t(hashCode5, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p5);
            if (z2 && z4) {
                rv4Var2.e0(535207080);
                if (z3) {
                    rv4Var2.e0(535260121);
                    c2 = rp5.c((wk3) ok3.S.getValue(), rv4Var2, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(535362204);
                    c2 = rp5.c((wk3) ok3.T.getValue(), rv4Var2, 0);
                    rv4Var2.q(false);
                }
                ar5 ar5Var = c2;
                nq7 k2 = tte.k(pna.n(kq7Var, 32.0f), uu9.a);
                boolean z10 = ((i8 & 57344) == 16384) | ((i7 & 1879048192) == 536870912);
                Object P2 = rv4Var2.P();
                if (z10 || P2 == lh9Var) {
                    z6 = z3;
                    xt4Var2 = xt4Var;
                    P2 = new up0(11, xt4Var2, z6);
                    rv4Var2.o0(P2);
                } else {
                    z6 = z3;
                    xt4Var2 = xt4Var;
                }
                nk5.a(ar5Var, null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 4.0f), 0L, rv4Var2, 48, 8);
                rv4Var2.q(false);
            } else {
                z6 = z3;
                xt4Var2 = xt4Var;
                rv4Var2.e0(535870170);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(str, str2, str3, str4, str5, str6, str7, z, z2, z6, z4, z5, nq7Var, vt4Var, xt4Var2, i2, i3) { // from class: jl7
                public final /* synthetic */ String C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ nq7 I;
                public final /* synthetic */ vt4 J;
                public final /* synthetic */ xt4 K;
                public final /* synthetic */ int L;
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;

                {
                    this.L = i3;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p6 = xoe.p(1);
                    int p7 = xoe.p(this.L);
                    ube.n(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (rv4) obj, p6, p7);
                    return pvc.a;
                }
            };
        }
    }

    public static final void o(nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        rv4Var.g0(1668688414);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            nq7 C = rte.C(nq7Var, rte.u(rv4Var), 14);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
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
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(f2, rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), ((h27) rv4Var.j(tzaVar)).c.d), 12.0f);
            mk0 mk0Var = kh5.F;
            gv9 a3 = ev9.a(lz.a, mk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, y);
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
            dpe.f(null, tte.k(pna.p(kq7Var, 64.0f, 96.0f), ((h27) rv4Var.j(tzaVar)).c.c), rv4Var, 0, 1);
            we6 d2 = rs8.d(kq7Var, 12.0f, rv4Var, 1.0f, true);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, d2);
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
            dpe.g(pna.h(pna.f(kq7Var, 0.82f), 20.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, 0.54f), 14.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, 0.66f), 14.0f), null, rv4Var, 6, 2);
            s21.x(rv4Var, true, kq7Var, 12.0f, rv4Var);
            su9 su9Var = uu9.a;
            dpe.g(pna.n(kq7Var, 28.0f), su9Var, rv4Var, 6, 0);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            dpe.g(pna.h(pna.f(kq7Var, 0.7f), 16.0f), null, rv4Var, 6, 2);
            nq7 y2 = zbe.y(nmd.v(hl5.f(kq7Var, 12.0f, rv4Var, kq7Var, 1.0f), rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), ((h27) rv4Var.j(tzaVar)).c.d), 12.0f);
            xn1 a5 = wn1.a(new hz(8.0f, true, new vs(2)), lk0Var, rv4Var, 6);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, y2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            gv9 a6 = ev9.a(new hz(8.0f, true, new vs(2)), mk0Var, rv4Var, 6);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, kq7Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a6);
            jce.F(npVar2, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p5);
            dpe.g(pna.h(pna.s(kq7Var, 86.0f), 30.0f), su9Var, rv4Var, 6, 0);
            dpe.g(pna.h(pna.s(kq7Var, 72.0f), 30.0f), su9Var, rv4Var, 6, 0);
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var, 12.0f));
            j(pna.f(kq7Var, 1.0f), rv4Var, 6);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sh(nq7Var, i2, 5, (byte) 0);
        }
    }

    public static final void p(xy4 xy4Var, rv4 rv4Var, int i2) {
        int i3;
        rv4Var.g0(1380468206);
        if (rv4Var.f(xy4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        if (((i3 | i2) & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            vua vuaVar = vua.a;
            rv4Var.f0(-1115894518);
            rv4Var.f0(1886828752);
            if (rv4Var.a instanceof my) {
                rv4Var.c0();
                if (rv4Var.S) {
                    rv4Var.k(new ik(vuaVar, 12));
                } else {
                    rv4Var.r0();
                }
                jce.F(f8a.T, rv4Var, xy4Var);
                rv4Var.q(true);
                rv4Var.q(false);
                rv4Var.q(false);
            } else {
                p17.h();
                throw null;
            }
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new y0(xy4Var, i2, 11);
        }
    }

    public static final void q(vl8 vl8Var, String str, int i2, int i3, int i4) {
        if (i3 == -1) {
            int E = E(i2, i4, str);
            int D = D(E, i4, str);
            if (D > E) {
                vl8Var.d(str.substring(E, D), ks3.a);
                return;
            }
            return;
        }
        int E2 = E(i2, i3, str);
        int D2 = D(E2, i3, str);
        if (D2 > E2) {
            String substring = str.substring(E2, D2);
            int E3 = E(i3 + 1, i4, str);
            vl8Var.h(substring, str.substring(E3, D(E3, i4, str)));
        }
    }

    public static final List r(int i2, List list) {
        int i3;
        if (list.isEmpty()) {
            return ks3.a;
        }
        int size = ((list.size() + i2) - 1) / i2;
        int size2 = list.size() / size;
        int size3 = list.size() % size;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (i4 < size3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i6 = i3 + size2 + i5;
            arrayList.add(list.subList(i5, i6));
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    public static void s(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            vs.m(rs8.k("startIndex: ", i2, i3, " > endIndex: "));
            return;
        }
        cp8.k(i4, hl5.r(i2, i3, "startIndex: ", ", endIndex: ", ", size: "));
    }

    public static void t(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            vs.m(rs8.k("fromIndex: ", i2, i3, " > toIndex: "));
            return;
        }
        cp8.k(i4, hl5.r(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
    }

    public static final long u(int i2, int i3, cna cnaVar, hz9 hz9Var, cna cnaVar2) {
        int i4;
        int i5;
        if (!c16.i(cnaVar, cna.c)) {
            i2 = C(cnaVar.a, hz9Var);
            i3 = C(cnaVar.b, hz9Var);
        }
        z63 z63Var = cnaVar2.a;
        z63 z63Var2 = cnaVar2.b;
        if ((z63Var instanceof w63) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((w63) z63Var).a)) {
            i2 = i5;
        }
        if ((z63Var2 instanceof w63) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((w63) z63Var2).a)) {
            i3 = i4;
        }
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final double v(int i2, int i3, int i4, int i5, hz9 hz9Var, cna cnaVar) {
        double max;
        z63 z63Var;
        z63 z63Var2;
        double d2 = i2;
        double d3 = i4 / d2;
        double d4 = i3;
        double d5 = i5 / d4;
        int ordinal = hz9Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                max = Math.min(d3, d5);
            } else {
                xk5.o();
                return 0.0d;
            }
        } else {
            max = Math.max(d3, d5);
        }
        if (cnaVar.a instanceof w63) {
            double d6 = ((w63) z63Var).a / d2;
            if (max > d6) {
                max = d6;
            }
        }
        if (cnaVar.b instanceof w63) {
            double d7 = ((w63) z63Var2).a / d4;
            if (max > d7) {
                return d7;
            }
        }
        return max;
    }

    public static final void w(m42 m42Var, Throwable th) {
        if (th instanceof sa3) {
            th = ((sa3) th).a;
        }
        m42Var.resumeWith(hre.i(th));
        throw th;
    }

    public static final void x(fd6 fd6Var) {
        voe.s(fd6Var, 2).L1();
    }

    public static final void y(fd6 fd6Var) {
        voe.v(fd6Var).G();
    }

    public static final dq5 z(dq5 dq5Var, boolean z) {
        if (z) {
            bz0 v = dq5Var.v();
            if (!v.P0(0L, vq2.b) && !v.P0(0L, vq2.a)) {
                return dq5Var;
            }
            return kxe.e(new mj9(new ct4(dq5Var.v())), dq5Var.getFileSystem());
        }
        return dq5Var;
    }
}
