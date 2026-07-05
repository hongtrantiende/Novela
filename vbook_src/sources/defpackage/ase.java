package defpackage;

import android.os.Build;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ase  reason: default package */
/* loaded from: classes.dex */
public abstract class ase {
    public static final tu1 a = new tu1(new wu1(6), false, 792427710);
    public static final wt9 b = new wt9(new Object());

    public static final String A(ArrayList arrayList) {
        arrayList.getClass();
        return sl1.i0(arrayList, ",", "[", "]", new dva(8), 24);
    }

    public static final long[] B(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = zpe.o(((zl1) list.get(i)).a);
        }
        return jArr;
    }

    public static final long C(boolean z, a6b a6bVar, p71 p71Var) {
        boolean z2;
        long j = p71Var.a;
        boolean z3 = false;
        if (a6bVar == a6b.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a6bVar == a6b.b) {
            z3 = true;
        }
        if (!z) {
            return zl1.h;
        }
        if (z2) {
            return j;
        }
        if (z3) {
            return zl1.b(0.15f, j);
        }
        return zl1.h;
    }

    public static final void D(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                vs.m("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            vs.m("colors and colorStops arguments must have equal length.");
        }
    }

    public static String E(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        vs.m("key URI must start with android-keystore://");
        return null;
    }

    public static void F(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
    }

    public static final void a(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-994057707);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var4)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var, jce.E(-1904639967, new y33(vt4Var3, vt4Var2, vt4Var4, 1), rv4Var), rv4Var, (i11 & 14) | 12779520 | ((i11 << 15) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z33(z, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, 1);
        }
    }

    public static final void b(boolean z, xt4 xt4Var, nq7 nq7Var, boolean z2, pg1 pg1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        nq7 nq7Var2;
        boolean z4;
        pg1 pg1Var2;
        int i3;
        int i4;
        nq7 nq7Var3;
        pg1 pg1Var3;
        boolean z5;
        rbc rbcVar;
        vt4 vt4Var;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        rv4Var.g0(-1406741137);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        int i7 = i2 | 3456;
        if ((i & 24576) == 0) {
            i7 = i2 | 11648;
        }
        int i8 = 196608 | i7;
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i8 & 1, z3)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i8 & (-57345);
                nq7Var3 = nq7Var;
                z5 = z2;
                pg1Var3 = pg1Var;
            } else {
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                pg1 pg1Var4 = pm1Var.c0;
                if (pg1Var4 == null) {
                    long d = rm1.d(pm1Var, ug1.e);
                    long j = zl1.h;
                    long d2 = rm1.d(pm1Var, ug1.d);
                    qm1 qm1Var = ug1.a;
                    long d3 = rm1.d(pm1Var, qm1Var);
                    qm1 qm1Var2 = ug1.b;
                    i3 = -57345;
                    long d4 = rm1.d(pm1Var, qm1Var2);
                    float f = ug1.c;
                    pg1 pg1Var5 = new pg1(d, j, d3, j, zl1.b(f, d4), j, zl1.b(f, rm1.d(pm1Var, qm1Var2)), rm1.d(pm1Var, qm1Var), rm1.d(pm1Var, ug1.i), zl1.b(f, rm1.d(pm1Var, qm1Var2)), zl1.b(ug1.g, rm1.d(pm1Var, ug1.h)), zl1.b(f, rm1.d(pm1Var, qm1Var2)), d2);
                    pm1Var.c0 = pg1Var5;
                    pg1Var4 = pg1Var5;
                } else {
                    i3 = -57345;
                }
                i4 = i8 & i3;
                nq7Var3 = kq7.a;
                pg1Var3 = pg1Var4;
                z5 = true;
            }
            rv4Var.r();
            float floor = (float) Math.floor(((r13) rv4Var.j(dy1.h)).L0(2.0f));
            if (z) {
                rbcVar = rbc.a;
            } else {
                rbcVar = rbc.b;
            }
            if (xt4Var != null) {
                rv4Var.e0(2066141046);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z8 = z6 | z7;
                Object P = rv4Var.P();
                if (z8 || P == ax1.a) {
                    P = new up0(2, xt4Var, z);
                    rv4Var.o0(P);
                }
                vt4Var = (vt4) P;
                rv4Var.q(false);
            } else {
                rv4Var.e0(2066206735);
                rv4Var.q(false);
                vt4Var = null;
            }
            vt4 vt4Var2 = vt4Var;
            int i9 = i4 << 6;
            nq7 nq7Var4 = nq7Var3;
            o(rbcVar, vt4Var2, new s4b(floor, nae.e, 2, 0, null, 26), new s4b(floor, nae.e, 0, 0, null, 30), nq7Var4, z5, pg1Var3, rv4Var, (i9 & 29360128) | (57344 & i9) | 4608 | (458752 & i9));
            nq7Var2 = nq7Var4;
            z4 = z5;
            pg1Var2 = pg1Var3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            z4 = z2;
            pg1Var2 = pg1Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ra(z, xt4Var, nq7Var2, z4, pg1Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x044b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r29, defpackage.rbc r30, defpackage.nq7 r31, defpackage.pg1 r32, defpackage.s4b r33, defpackage.s4b r34, defpackage.rv4 r35, int r36) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ase.c(boolean, rbc, nq7, pg1, s4b, s4b, rv4, int):void");
    }

    public static final void d(List list, rh8 rh8Var, nq7 nq7Var, lu4 lu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4Var.g0(1885377413);
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
            if (rv4Var.h(lu4Var)) {
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
                P2 = new a42(aw7Var, null, 1);
                rv4Var.o0(P2);
            }
            Object B = vqe.B(a2, r, (nu4) P2, rv4Var, 12);
            boolean f2 = rv4Var.f(aw7Var) | rv4Var.f(B);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z3 | f2;
            if ((57344 & i2) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P3 = rv4Var.P();
            if (z6 || P3 == obj) {
                Object hqVar = new hq(11, xt4Var, aw7Var, B, lu4Var);
                rv4Var.o0(hqVar);
                P3 = hqVar;
            }
            pc2.c(nq7Var, a2, r, null, null, null, false, null, 0L, 0L, nae.e, (xt4) P3, rv4Var, (i2 >> 6) & 14, 0, 4088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1((Object) list, (Object) rh8Var, nq7Var, (hu4) lu4Var, xt4Var, i, 4);
        }
    }

    public static final void e(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(926715325);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
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
            cvb.c(yqe.A((y3b) o2b.U.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            i4 = 2;
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i6 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            i4 = 2;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, i4);
        }
    }

    public static final void f(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(22396105);
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
                ie3 ie3Var = (ie3) ((fdd) voe.z(cm9.a(ie3.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(ie3Var.d, rv4Var);
                Object[] objArr = new Object[0];
                yy9 yy9Var = co3.e;
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = new qx6(22);
                    rv4Var.o0(P);
                }
                co3 co3Var = (co3) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new rj2(29);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                zu8 zu8Var = new zu8(tl1.A("json"));
                boolean f = rv4Var.f(ie3Var);
                Object P3 = rv4Var.P();
                if (f || P3 == obj) {
                    P3 = new ce3(ie3Var, 1);
                    rv4Var.o0(P3);
                }
                kd4 v = w92.v(zu8Var, (xt4) P3, rv4Var, 8);
                Object obj2 = (sac) rv4Var.j(uac.a);
                s02 s02Var = ie3Var.e;
                boolean f2 = rv4Var.f(obj2);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new wa(obj2, (m42) null, 5);
                    rv4Var.o0(P4);
                }
                jye.b(s02Var, null, (mu4) P4, rv4Var, 0);
                fxe.h(yqe.A((y3b) b3b.I0.getValue(), rv4Var), pna.c, false, jce.E(2055847749, new p7(cz7Var, 21), rv4Var), jce.E(906391150, new ld1(ie3Var, aw7Var, v, 12), rv4Var), jce.E(414058890, new t81(1, z2, co3Var), rv4Var), jce.E(-396652396, new cs1(2, co3Var, ie3Var, z2), rv4Var), rv4Var, 1797168, 4);
                boolean f3 = rv4Var.f(ie3Var);
                Object P5 = rv4Var.P();
                if (f3 || P5 == obj) {
                    P5 = new sj(ie3Var, 12);
                    rv4Var.o0(P5);
                }
                jsc.e(co3Var, (lu4) P5, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 22);
        }
    }

    public static final void g(boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        lh9 lh9Var;
        boolean z4;
        boolean z5;
        boolean z6;
        xt4 xt4Var3;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = z;
        rv4 rv4Var2 = rv4Var;
        mk0 mk0Var = kh5.G;
        rv4Var2.g0(-1279265141);
        if (rv4Var2.g(z10)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i11 & 1, z3)) {
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
            su9 su9Var = uu9.a;
            kq7 kq7Var = kq7.a;
            nq7 d = st0.d(tte.k(kq7Var, su9Var), 1.0f, rm1.g(((h27) rv4Var2.j(j27.a)).a, 4.0f), su9Var);
            gv9 a3 = ev9.a(dzVar, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d);
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
            rv4Var2.e0(1882286183);
            List m = cqe.m((q3b) nz.d.getValue(), rv4Var2);
            int size = m.size();
            int i12 = 0;
            while (true) {
                lh9Var = ax1.a;
                if (i12 >= size) {
                    break;
                }
                String str = (String) m.get(i12);
                if (i12 == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z10 == z7) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                tza tzaVar = j27.a;
                nq7 m2 = r1d.m(nmd.v(kq7Var, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), z8, new sv1(17), rv4Var2, 0);
                if ((i11 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean d2 = z9 | rv4Var2.d(i12);
                Object P = rv4Var2.P();
                if (d2 || P == lh9Var) {
                    P = new tp0(xt4Var, i12, 3);
                    rv4Var2.o0(P);
                }
                nq7 f = lbe.f(15, (vt4) P, m2, null, false);
                b37 d3 = fu0.d(kh5.a, false);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, f);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                jce.F(qw1.f, rv4Var2, d3);
                jce.F(qw1.e, rv4Var2, l3);
                jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode3));
                jce.C(qw1.h, rv4Var2);
                jce.F(qw1.d, rv4Var2, p3);
                rv4 rv4Var3 = rv4Var2;
                cvb.c(str, zbe.z(pu0.a.a(kq7Var, kh5.e), 12.0f, 8.0f), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var3, 0, 24576, 114680);
                rv4Var3.q(true);
                i12++;
                z10 = z;
                rv4Var2 = rv4Var3;
            }
            rv4 rv4Var4 = rv4Var2;
            rv4Var4.q(false);
            rv4Var4.q(true);
            xbe.i(rv4Var4, new we6(1.0f, true));
            if ((57344 & i11) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i11 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5 | z4;
            Object P2 = rv4Var4.P();
            if (!z11 && P2 != lh9Var) {
                z6 = z2;
                xt4Var3 = xt4Var2;
            } else {
                z6 = z2;
                xt4Var3 = xt4Var2;
                P2 = new up0(5, xt4Var3, z6);
                rv4Var4.o0(P2);
            }
            nq7 t = q1d.t(1, (vt4) P2, rv4Var4, kq7Var, false);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var4, 48);
            int hashCode4 = Long.hashCode(rv4Var4.T);
            xt8 l4 = rv4Var4.l();
            nq7 p4 = lye.p(rv4Var4, t);
            rw1.k.getClass();
            zx1 zx1Var3 = qw1.b;
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var3);
            } else {
                rv4Var4.r0();
            }
            jce.F(qw1.f, rv4Var4, a4);
            jce.F(qw1.e, rv4Var4, l4);
            jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode4));
            jce.C(qw1.h, rv4Var4);
            jce.F(qw1.d, rv4Var4, p4);
            cvb.c(yqe.A((y3b) s2b.x0.getValue(), rv4Var4), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(j27.a)).b.j, rv4Var4, 0, 0, 131070);
            rv4Var2 = rv4Var;
            b(z6, xt4Var3, null, false, null, rv4Var2, ((i11 >> 3) & 14) | ((i11 >> 9) & Token.ASSIGN_MOD));
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vp0(z, z2, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void h(h34 h34Var, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        xt4 xt4Var2;
        boolean z2;
        rv4 rv4Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4 rv4Var3 = rv4Var;
        boolean z7 = h34Var.f;
        lk0 lk0Var = kh5.J;
        rv4Var3.g0(1747847423);
        if (rv4Var3.f(h34Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var3.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var3.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var3.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var3.h(vt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i11 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var3, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var3, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var3);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var3, p);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            l54 l54Var = h34Var.e;
            if ((i11 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var3.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new jf3(27, vt4Var2);
                rv4Var3.o0(P);
            }
            nq7 t = q1d.t(0, (vt4) P, rv4Var3, f, z7);
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
            jce.F(npVar2, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
            jce.F(npVar4, rv4Var3, p2);
            h54 h54Var = new h54(l54Var.r, l54Var.a, l54Var.c);
            u22 u22Var = r0f.d;
            nq7 n = pna.n(kq7Var, 32.0f);
            tza tzaVar = j27.a;
            do5.a(h54Var, u22Var, false, null, null, tl1.a, tte.k(n, ((h27) rv4Var3.j(tzaVar)).c.b), null, rv4Var3, 1572912, 828);
            xbe.i(rv4Var3, pna.s(kq7Var, 8.0f));
            cvb.c(l54Var.b, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(tzaVar)).b.h, rv4Var, 0, 0, 131068);
            if (z7) {
                rv4Var.e0(1129782720);
                nq7 n2 = pna.n(kq7Var, 24.0f);
                rv4Var2 = rv4Var;
                z3 = false;
                nk5.a(rp5.c((wk3) jk3.f.getValue(), rv4Var, 0), null, n2, 0L, rv4Var2, 432, 8);
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                z3 = false;
                rv4Var2.e0(1129989769);
                rv4Var2.q(false);
            }
            rs8.u(rv4Var2, true, kq7Var, 9.0f, rv4Var2);
            if (h34Var.a) {
                rv4Var2.e0(334646975);
                nq7 f2 = pna.f(kq7Var, 1.0f);
                hz hzVar = new hz(8.0f, true, new vs(2));
                Object P2 = rv4Var2.P();
                if (P2 == lh9Var) {
                    P2 = new tn4(17);
                    rv4Var2.o0(P2);
                }
                boolean z8 = z3;
                rv4Var3 = rv4Var;
                kqe.b(f2, null, null, hzVar, null, null, false, (xt4) P2, rv4Var3, 113270790, 110);
                rv4Var3.q(z8);
            } else {
                boolean z9 = z3;
                rv4Var3 = rv4Var2;
                boolean z10 = h34Var.c;
                lh9 lh9Var2 = lz.e;
                if (z10) {
                    rv4Var3.e0(335149547);
                    nq7 h = pna.h(pna.f(kq7Var, 1.0f), 200.0f);
                    xn1 a4 = wn1.a(lh9Var2, lk0Var, rv4Var3, 54);
                    int hashCode3 = Long.hashCode(rv4Var3.T);
                    xt8 l3 = rv4Var3.l();
                    nq7 p3 = lye.p(rv4Var3, h);
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(npVar, rv4Var3, a4);
                    jce.F(npVar2, rv4Var3, l3);
                    s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                    jce.F(npVar4, rv4Var3, p3);
                    rv4Var3.e0(-1057074587);
                    String str = h34Var.d;
                    if (str.length() == 0) {
                        str = yqe.A((y3b) s2b.a.getValue(), rv4Var3);
                    }
                    rv4Var3.q(z9);
                    cvb.c(str, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(tzaVar)).b.j, rv4Var, 24576, 0, 130030);
                    xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
                    z1d.f(rp5.c((wk3) ok3.d0.getValue(), rv4Var, z9 ? 1 : 0), yqe.A((y3b) b3b.D.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, (i11 << 18) & 234881024, 252);
                    rv4Var3 = rv4Var;
                    rv4Var3.q(true);
                    rv4Var3.q(z9);
                } else {
                    List list = h34Var.g;
                    if (list == null || list.isEmpty()) {
                        xt4Var2 = xt4Var;
                        rv4Var3.e0(336114856);
                        nq7 h2 = pna.h(pna.f(kq7Var, 1.0f), 200.0f);
                        xn1 a5 = wn1.a(lh9Var2, lk0Var, rv4Var3, 54);
                        int hashCode4 = Long.hashCode(rv4Var3.T);
                        xt8 l4 = rv4Var3.l();
                        nq7 p4 = lye.p(rv4Var3, h2);
                        rv4Var3.i0();
                        if (rv4Var3.S) {
                            rv4Var3.k(zx1Var);
                        } else {
                            rv4Var3.r0();
                        }
                        jce.F(npVar, rv4Var3, a5);
                        jce.F(npVar2, rv4Var3, l4);
                        s21.t(hashCode4, rv4Var3, npVar3, rv4Var3, kgVar);
                        jce.F(npVar4, rv4Var3, p4);
                        cvb.c(yqe.A((y3b) o2b.K0.getValue(), rv4Var3), null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(tzaVar)).b.j, rv4Var, 24576, 0, 130030);
                        xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
                        z1d.f(rp5.c((wk3) ok3.d0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.D.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, (i11 << 18) & 234881024, 252);
                        rv4Var3 = rv4Var;
                        z4 = true;
                        rv4Var3.q(true);
                        rv4Var3.q(false);
                        rv4Var3.q(z4);
                    } else {
                        rv4Var3.e0(337010539);
                        nq7 f3 = pna.f(kq7Var, 1.0f);
                        hz hzVar2 = new hz(8.0f, true, new vs(2));
                        if ((i11 & 14) != 4) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if ((i11 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z11 = z6 | z5;
                        Object P3 = rv4Var3.P();
                        if (!z11 && P3 != lh9Var) {
                            xt4Var2 = xt4Var;
                        } else {
                            xt4Var2 = xt4Var;
                            P3 = new j34(6, h34Var, xt4Var2);
                            rv4Var3.o0(P3);
                        }
                        kqe.b(f3, null, null, hzVar2, null, null, false, (xt4) P3, rv4Var3, 24582, 238);
                        rv4Var3.q(false);
                        z4 = true;
                        rv4Var3.q(z4);
                    }
                }
            }
            xt4Var2 = xt4Var;
            z4 = true;
            rv4Var3.q(z4);
        } else {
            xt4Var2 = xt4Var;
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new wp0(h34Var, nq7Var, vt4Var, xt4Var2, vt4Var2, i, 9);
        }
    }

    public static final void i(List list, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        rv4Var.g0(1808642905);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(bkdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        boolean z6 = false;
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            if ((i13 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i13 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z2 | z3;
            if ((57344 & i13) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((458752 & i13) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            if ((3670016 & i13) == 1048576) {
                z6 = true;
            }
            boolean z10 = z9 | z6;
            Object P = rv4Var.P();
            if (z10 || P == ax1.a) {
                p6 p6Var = new p6(list, xt4Var, xt4Var2, lu4Var, xt4Var3, 11);
                rv4Var.o0(p6Var);
                P = p6Var;
            }
            pc2.c(nq7Var, null, bkdVar, null, null, null, false, null, 0L, 0L, nae.e, (xt4) P, rv4Var, 6 | ((i13 << 3) & 896), 0, 4090);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bx(list, bkdVar, nq7Var, xt4Var, xt4Var2, lu4Var, xt4Var3, i, 3);
        }
    }

    public static final void j(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(39909897);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                e95 e95Var = (e95) ((fdd) voe.z(cm9.a(e95.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(e95Var.f, rv4Var);
                Object[] objArr = new Object[0];
                if ((i5 & 14) != 4) {
                    z2 = false;
                }
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (z2 || P == obj) {
                    P = new v85(str, 0);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new k85(3);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                String str2 = (String) aw7Var.getValue();
                boolean f = rv4Var.f(e95Var) | rv4Var.f(aw7Var);
                Object P3 = rv4Var.P();
                if (f || P3 == obj) {
                    P3 = new db(e95Var, aw7Var, null, 21);
                    rv4Var.o0(P3);
                }
                yte.g((lu4) P3, rv4Var, str2);
                cz7Var2 = cz7Var;
                fxe.h(yqe.B((y3b) b3b.R.getValue(), new Object[]{(String) aw7Var.getValue()}, rv4Var), null, false, jce.E(59586693, new h64(cz7Var, 9), rv4Var), jce.E(-914612050, new mr3(aw7Var2, 6), rv4Var), null, jce.E(617662676, new q7((fdd) e95Var, aw7Var, (Object) cz7Var, z3, 3), rv4Var), rv4Var, 1600512, 38);
                boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                String str3 = (String) aw7Var.getValue();
                String A = yqe.A((y3b) b3b.P.getValue(), rv4Var);
                boolean f2 = rv4Var.f(aw7Var2);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new qp4(aw7Var2, 7);
                    rv4Var.o0(P4);
                }
                xt4 xt4Var = (xt4) P4;
                boolean f3 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                Object P5 = rv4Var.P();
                if (f3 || P5 == obj) {
                    P5 = new pr0(aw7Var2, aw7Var, 12);
                    rv4Var.o0(P5);
                }
                wq9.f(booleanValue, str3, A, xt4Var, (xt4) P5, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var2, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.yya r28, defpackage.yt2 r29, defpackage.yya r30, defpackage.pu2 r31, defpackage.yya r32, defpackage.at9 r33, boolean r34, defpackage.vt4 r35, defpackage.vt4 r36, defpackage.nq7 r37, defpackage.rv4 r38, int r39) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ase.k(yya, yt2, yya, pu2, yya, at9, boolean, vt4, vt4, nq7, rv4, int):void");
    }

    public static final void l(boolean z, p71 p71Var, f81 f81Var, c81 c81Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        long j;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(1586874084);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(p71Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(f81Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(c81Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if (z) {
                j = p71Var.f;
            } else {
                j = p71Var.g;
            }
            long j2 = j;
            nq7 x = ote.x(0, vt4Var, rv4Var, tte.k(pna.r(kq7.a, 44.0f, 44.0f, nae.e, 12), uu9.a(6.0f)), z);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = new cl7(c81Var, 26);
                rv4Var.o0(P);
            }
            nq7 c = y7a.c(x, false, (xt4) P);
            b37 d = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, c);
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
            qye.b("/", null, oyb.a(f81Var.k, j2, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), null, 0, false, 0, 0, null, rv4Var, 6, 1018);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a83(z, p71Var, f81Var, c81Var, vt4Var, i);
        }
    }

    public static final void m(wk3 wk3Var, String str, boolean z, a6b a6bVar, p71 p71Var, vt4 vt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int ordinal;
        int i4;
        boolean z2;
        a6b a6bVar2;
        a6b a6bVar3;
        boolean z3;
        long j;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(319054904);
        if ((i & 6) == 0) {
            if (rv4Var.f(wk3Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(str)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i3 |= i7;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (a6bVar == null) {
                ordinal = -1;
            } else {
                ordinal = a6bVar.ordinal();
            }
            if (rv4Var.d(ordinal)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(p71Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i3 |= i5;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            if (i10 != 0) {
                a6bVar3 = a6b.c;
            } else {
                a6bVar3 = a6bVar;
            }
            long C = C(z, a6bVar3, p71Var);
            if (a6bVar3 == a6b.a) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z) {
                j = p71Var.g;
            } else if (z3) {
                j = p71Var.b;
            } else {
                j = p71Var.f;
            }
            su9 a2 = uu9.a(6.0f);
            kq7 kq7Var = kq7.a;
            int i11 = i3;
            nq7 x = ote.x(0, vt4Var, rv4Var, nmd.v(tte.k(pna.r(kq7Var, 44.0f, 44.0f, nae.e, 12), a2), C, lre.g), z);
            if ((i11 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new a23(str, 11);
                rv4Var.o0(P);
            }
            nq7 c = y7a.c(x, false, (xt4) P);
            b37 d = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, c);
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
            vk8 b2 = rp5.b(wk3Var, rv4Var, i11 & 14);
            wl0 wl0Var = new wl0(j, 5);
            dxe.h(b2, null, pna.n(kq7Var, 20.0f), null, null, nae.e, wl0Var, rv4Var, 440, 56);
            rv4Var.q(true);
            a6bVar2 = a6bVar3;
        } else {
            rv4Var.X();
            a6bVar2 = a6bVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qs1(wk3Var, str, z, a6bVar2, p71Var, vt4Var, i, i2);
        }
    }

    public static final void n(qfc qfcVar, a6b a6bVar, boolean z, p71 p71Var, f81 f81Var, c81 c81Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        tva tvaVar = qfcVar.a;
        rv4Var.g0(939746067);
        if (rv4Var.f(qfcVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.d(a6bVar.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.f(p71Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.f(f81Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.f(c81Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(vt4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            long C = C(z, a6bVar, p71Var);
            if (a6bVar == a6b.a) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z) {
                j = p71Var.g;
            } else if (z3) {
                j = p71Var.b;
            } else {
                j = p71Var.f;
            }
            long j2 = j;
            nq7 x = ote.x(0, vt4Var, rv4Var, nmd.v(tte.k(pna.r(kq7.a, 44.0f, 44.0f, nae.e, 12), uu9.a(6.0f)), C, lre.g), z);
            if ((i15 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i15 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z5 | z4;
            Object P = rv4Var.P();
            if (!z7 && P != ax1.a) {
                z6 = true;
            } else {
                z6 = true;
                P = new cn9(1, qfcVar, c81Var);
                rv4Var.o0(P);
            }
            nq7 c = y7a.c(x, false, (xt4) P);
            b37 d = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, c);
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
            hva hvaVar = hva.a;
            boolean equals = tvaVar.equals(hvaVar);
            lva lvaVar = lva.a;
            qva qvaVar = qva.a;
            rva rvaVar = rva.a;
            if (equals) {
                str = "B";
            } else if (tvaVar.equals(ova.a)) {
                str = "I";
            } else if (tvaVar.equals(rvaVar)) {
                str = "U";
            } else if (tvaVar.equals(qvaVar)) {
                str = "S";
            } else if (tvaVar.equals(lvaVar)) {
                str = "<>";
            } else if (tvaVar instanceof jva) {
                str = "H";
            } else if (tvaVar instanceof iva) {
                str = "A";
            } else if (!(tvaVar instanceof mva)) {
                if (!(tvaVar instanceof sva)) {
                    if (!(tvaVar instanceof nva)) {
                        if (!(tvaVar instanceof kva)) {
                            if (!(tvaVar instanceof pva)) {
                                xk5.o();
                                return;
                            } else {
                                vs.k("Links use RichTextToolbarConfig.showLink, not ToolbarButtonSpec.");
                                return;
                            }
                        }
                        vs.k("Inline audios are inserted programmatically, not via ToolbarButtonSpec.");
                        return;
                    }
                    vs.k("Inline videos are inserted programmatically, not via ToolbarButtonSpec.");
                    return;
                }
                vs.k("User mentions are inserted programmatically, not via ToolbarButtonSpec.");
                return;
            } else {
                vs.k("Inline images are inserted programmatically, not via ToolbarButtonSpec.");
                return;
            }
            oyb a2 = oyb.a(f81Var.k, j2, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214);
            if (tvaVar.equals(hvaVar)) {
                a2 = oyb.a(a2, 0L, 0L, dq4.D, null, null, 0L, null, 0, 0L, null, 16777211);
            } else if (tvaVar.equals(rvaVar)) {
                a2 = oyb.a(a2, 0L, 0L, null, null, null, 0L, gpb.c, 0, 0L, null, 16773119);
            } else if (tvaVar.equals(qvaVar)) {
                a2 = oyb.a(a2, 0L, 0L, null, null, null, 0L, gpb.d, 0, 0L, null, 16773119);
            } else if (tvaVar.equals(lvaVar)) {
                a2 = oyb.a(a2, 0L, 0L, null, null, eo4.d, 0L, null, 0, 0L, null, 16777183);
            }
            qye.b(str, null, a2, null, 0, false, 0, 0, null, rv4Var, 0, 1018);
            rv4Var.q(z6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xa4(qfcVar, a6bVar, z, p71Var, f81Var, c81Var, vt4Var, i);
        }
    }

    public static final void o(rbc rbcVar, vt4 vt4Var, s4b s4bVar, s4b s4bVar2, nq7 nq7Var, boolean z, pg1 pg1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        rbc rbcVar2;
        nq7 nq7Var2;
        nq7 nq7Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        boolean h2;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-406243761);
        if ((i & 6) == 0) {
            if (rv4Var.d(rbcVar.ordinal())) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h2 = rv4Var.f(s4bVar);
            } else {
                h2 = rv4Var.h(s4bVar);
            }
            if (h2) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h = rv4Var.f(s4bVar2);
            } else {
                h = rv4Var.h(s4bVar2);
            }
            if (h) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.g(z)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.f(pg1Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.f(null)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            long j = zl1.i;
            su9 su9Var = uu9.a;
            lt8 lt8Var = new lt8(25.0f);
            ut9 a2 = jt9.a(ug1.f / 2.0f, j, new v72(lt8Var, lt8Var, lt8Var, lt8Var), 240);
            kq7 kq7Var = kq7.a;
            if (vt4Var != null) {
                rbcVar2 = rbcVar;
                nq7Var2 = h9a.a0(rbcVar2, a2, z, new xt9(1), vt4Var);
            } else {
                rbcVar2 = rbcVar;
                nq7Var2 = kq7Var;
            }
            if (vt4Var != null) {
                n95 n95Var = jz5.a;
                nq7Var3 = pc7.b;
            } else {
                nq7Var3 = kq7Var;
            }
            int i11 = i2 << 6;
            c(z, rbcVar2, nq7Var.a0(nq7Var3).a0(nq7Var2).a0(zbe.y(kq7Var, 2.0f)), pg1Var, s4bVar, s4bVar2, rv4Var, ((i2 >> 15) & 14) | ((i2 << 3) & Token.ASSIGN_MOD) | ((i2 >> 9) & 7168) | 32768 | (57344 & i11) | 262144 | (i11 & 458752));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(rbcVar, vt4Var, s4bVar, s4bVar2, nq7Var, z, pg1Var, i);
        }
    }

    public static final Exception p(x xVar, String str, ox4 ox4Var) {
        return new ox4(xVar, str);
    }

    public static final lv7 q(lv7 lv7Var) {
        int i = lv7Var.g;
        if (i == 0) {
            lv7 lv7Var2 = df8.a;
            lv7Var2.getClass();
            return lv7Var2;
        }
        lv7 lv7Var3 = new lv7(i);
        Object[] objArr = lv7Var.b;
        long[] jArr = lv7Var.c;
        for (int i2 = lv7Var.e; i2 != Integer.MAX_VALUE; i2 = (int) ((jArr[i2] >> 31) & 2147483647L)) {
            lv7Var3.g(objArr[i2]);
        }
        return lv7Var3;
    }

    public static final long r(long j, long j2) {
        int i = az5.c;
        return mz9.a(((int) (j2 >> 32)) / ((int) (j >> 32)), ((int) (j2 & 4294967295L)) / ((int) (j & 4294967295L)));
    }

    public static final void s(wn5 wn5Var, im9 im9Var, long j) {
        wn5Var.getClass();
        String str = wn5Var.b;
        long j2 = wn5Var.a;
        if (!eh.q(j2)) {
            if (!eh.q(j)) {
                int i = az5.c;
                if (((int) (j >> 32)) < ((int) (j2 >> 32)) && ((int) (j & 4294967295L)) < ((int) (4294967295L & j2))) {
                    if (yz1.p(j2, j)) {
                        if (!c16.i(im9Var.b(str), Boolean.FALSE)) {
                            return;
                        }
                        throw new Exception("Image type not support subsampling. mimeType=".concat(str));
                    }
                    String C = eh.C(j);
                    String C2 = eh.C(j2);
                    throw new Exception("The aspect ratio of thumbnail and original image is different. contentSize=" + C + ", imageSize=" + C2);
                }
                String C3 = eh.C(j);
                String C4 = eh.C(j2);
                throw new Exception("the thumbnail size is greater than or equal to the original image. contentSize=" + C3 + ", imageSize=" + C4);
            }
            int i2 = az5.c;
            throw new Exception("content size invalid: " + ((int) (j >> 32)) + 'x' + ((int) (j & 4294967295L)));
        }
        int i3 = wn5Var.c;
        int i4 = wn5Var.d;
        throw new Exception("image size invalid: " + i3 + 'x' + i4);
    }

    public static final boolean t(rk9 rk9Var, float f, float f2) {
        float f3 = rk9Var.a;
        if (f <= rk9Var.c && f3 <= f) {
            float f4 = rk9Var.b;
            if (f2 <= rk9Var.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final int u(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int x = tl1.x(list);
        for (int i2 = 1; i2 < x; i2++) {
            if (zl1.d(((zl1) list.get(i2)).a) == nae.e) {
                i++;
            }
        }
        return i;
    }

    public static final void v(q25 q25Var, j4d j4dVar) {
        List list = j4dVar.F;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l4d l4dVar = (l4d) list.get(i);
            if (l4dVar instanceof n4d) {
                in8 in8Var = new in8();
                n4d n4dVar = (n4d) l4dVar;
                in8Var.d = n4dVar.b;
                in8Var.n = true;
                in8Var.c();
                in8Var.s.n(n4dVar.c);
                in8Var.c();
                in8Var.c();
                in8Var.b = n4dVar.d;
                in8Var.c();
                in8Var.c = n4dVar.e;
                in8Var.c();
                in8Var.g = n4dVar.f;
                in8Var.c();
                in8Var.e = n4dVar.C;
                in8Var.c();
                in8Var.f = n4dVar.D;
                in8Var.o = true;
                in8Var.c();
                in8Var.h = n4dVar.E;
                in8Var.o = true;
                in8Var.c();
                in8Var.i = n4dVar.F;
                in8Var.o = true;
                in8Var.c();
                in8Var.j = n4dVar.G;
                in8Var.o = true;
                in8Var.c();
                in8Var.k = n4dVar.H;
                in8Var.p = true;
                in8Var.c();
                in8Var.l = n4dVar.I;
                in8Var.p = true;
                in8Var.c();
                in8Var.m = n4dVar.J;
                in8Var.p = true;
                in8Var.c();
                q25Var.e(i, in8Var);
            } else if (l4dVar instanceof j4d) {
                q25 q25Var2 = new q25();
                j4d j4dVar2 = (j4d) l4dVar;
                q25Var2.k = j4dVar2.a;
                q25Var2.c();
                q25Var2.l = j4dVar2.b;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.o = j4dVar2.e;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.p = j4dVar2.f;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.q = j4dVar2.C;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.r = j4dVar2.D;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.m = j4dVar2.c;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.n = j4dVar2.d;
                q25Var2.s = true;
                q25Var2.c();
                q25Var2.f = j4dVar2.E;
                q25Var2.g = true;
                q25Var2.c();
                v(q25Var2, j4dVar2);
                q25Var.e(i, q25Var2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        if (r0 != r6) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:13:0x002b, B:40:0x00d0, B:42:0x00d9, B:44:0x00e8, B:45:0x00ef, B:18:0x0042, B:29:0x0090, B:34:0x00a8, B:36:0x00b2, B:37:0x00b5, B:23:0x0065, B:25:0x006b, B:22:0x004e), top: B:49:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:13:0x002b, B:40:0x00d0, B:42:0x00d9, B:44:0x00e8, B:45:0x00ef, B:18:0x0042, B:29:0x0090, B:34:0x00a8, B:36:0x00b2, B:37:0x00b5, B:23:0x0065, B:25:0x006b, B:22:0x004e), top: B:49:0x0023 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:20:0x0048). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.qw6 r16, defpackage.g7b r17, long r18, java.util.List r20, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ase.w(qw6, g7b, long, java.util.List, n42):java.lang.Object");
    }

    public static final int[] x(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = sve.x(((zl1) list.get(i3)).a);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((zl1) list.get(i3)).a;
            if (zl1.d(j) == nae.e) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = sve.x(zl1.b(nae.e, ((zl1) list.get(1)).a));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = sve.x(zl1.b(nae.e, ((zl1) list.get(i3 - 1)).a));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = sve.x(zl1.b(nae.e, ((zl1) list.get(i3 - 1)).a));
                    i4 += 2;
                    iArr2[i5] = sve.x(zl1.b(nae.e, ((zl1) list.get(i3 + 1)).a));
                }
                i4 = i2;
            } else {
                iArr2[i4] = sve.x(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] y(int i, List list, List list2) {
        float f;
        float f2;
        float size;
        if (i == 0) {
            if (list != null) {
                return sl1.z0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        if (list != null) {
            f = ((Number) list.get(0)).floatValue();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        int size2 = list2.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size2; i3++) {
            long j = ((zl1) list2.get(i3)).a;
            if (list != null) {
                size = ((Number) list.get(i3)).floatValue();
            } else {
                size = i3 / (list2.size() - 1);
            }
            int i4 = i2 + 1;
            fArr[i2] = size;
            if (zl1.d(j) == nae.e) {
                i2 += 2;
                fArr[i4] = size;
            } else {
                i2 = i4;
            }
        }
        if (list != null) {
            f2 = ((Number) list.get(list2.size() - 1)).floatValue();
        } else {
            f2 = 1.0f;
        }
        fArr[i2] = f2;
        return fArr;
    }

    public static final m4d z(ar5 ar5Var, rv4 rv4Var) {
        r13 r13Var;
        wl0 wl0Var;
        float f = ((r13) rv4Var.j(dy1.h)).f();
        boolean e = rv4Var.e((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(ar5Var.j) << 32));
        Object P = rv4Var.P();
        if (e || P == ax1.a) {
            q25 q25Var = new q25();
            v(q25Var, ar5Var.f);
            float f2 = ar5Var.b;
            float f3 = ar5Var.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(r13Var.L0(f2)) << 32) | (Float.floatToRawIntBits(r13Var.L0(f3)) & 4294967295L);
            float f4 = ar5Var.d;
            float f5 = ar5Var.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            m4d m4dVar = new m4d(q25Var);
            String str = ar5Var.a;
            long j = ar5Var.g;
            int i = ar5Var.h;
            if (j != 16) {
                wl0Var = new wl0(j, i);
            } else {
                wl0Var = null;
            }
            boolean z = ar5Var.i;
            m4dVar.f.setValue(new dna(floatToRawIntBits));
            m4dVar.C.setValue(Boolean.valueOf(z));
            g4d g4dVar = m4dVar.D;
            g4dVar.g.setValue(wl0Var);
            g4dVar.i.setValue(new dna(floatToRawIntBits2));
            g4dVar.c = str;
            rv4Var.o0(m4dVar);
            P = m4dVar;
        }
        return (m4d) P;
    }
}
