package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mwe  reason: default package */
/* loaded from: classes.dex */
public abstract class mwe {
    public static final tu1 a = new tu1(new dv1(29), false, -909420696);
    public static final tu1 b = new tu1(new iv1(0), false, 826877739);
    public static final tu1 c = new tu1(new ev1(21), false, 1384851171);
    public static final tu1 d = new tu1(new ev1(22), false, -459485734);
    public static final Object e = new Object();

    public static final void a(vt4 vt4Var, nq7 nq7Var, boolean z, lk5 lk5Var, lu4 lu4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        lk5 lk5Var2;
        int i6;
        int i7;
        rv4Var.g0(-2096213317);
        if ((i & 6) == 0) {
            if (rv4Var.h(vt4Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i10 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i10 |= i6;
        }
        if ((74899 & i10) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                if (i8 != 0) {
                    nq7Var = kq7.a;
                }
                if (i9 != 0) {
                    z = true;
                }
                lk5Var = kwe.H(rv4Var);
            }
            int i11 = i10 & (-7169);
            nq7 nq7Var3 = nq7Var;
            boolean z4 = z;
            lk5 lk5Var3 = lk5Var;
            rv4Var.r();
            b(vt4Var, nq7Var3, z4, lk5Var3, pfa.a(kve.d, rv4Var), lu4Var, rv4Var, (65534 & i11) | ((i11 << 3) & 3670016), 0);
            lk5Var2 = lk5Var3;
            z3 = z4;
            nq7Var2 = nq7Var3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            z3 = z;
            lk5Var2 = lk5Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new eh1(vt4Var, nq7Var2, z3, lk5Var2, lu4Var, i, i2);
        }
    }

    public static final void b(vt4 vt4Var, nq7 nq7Var, boolean z, lk5 lk5Var, wea weaVar, lu4 lu4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        wea weaVar2;
        Object obj;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        lk5 lk5Var2;
        lk5 lk5Var3;
        nq7 nq7Var3;
        int i7;
        wea weaVar3;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4Var.g0(1413012038);
        if ((i & 6) == 0) {
            if (rv4Var.h(vt4Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && rv4Var.f(lk5Var)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (rv4Var.f(null)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                weaVar2 = weaVar;
                if (rv4Var.f(weaVar2)) {
                    i9 = 131072;
                    i3 |= i9;
                }
            } else {
                weaVar2 = weaVar;
            }
            i9 = Parser.ARGC_LIMIT;
            i3 |= i9;
        } else {
            weaVar2 = weaVar;
        }
        if ((1572864 & i) == 0) {
            obj = lu4Var;
            if (rv4Var.h(obj)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        } else {
            obj = lu4Var;
        }
        boolean z5 = true;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                int i14 = i3;
                nq7Var3 = nq7Var;
                i7 = i14;
                z4 = z;
                lk5Var2 = lk5Var;
                weaVar3 = weaVar2;
            } else {
                if (i12 != 0) {
                    nq7Var = kq7.a;
                }
                if (i13 == 0) {
                    z5 = z;
                }
                if ((i2 & 8) != 0) {
                    lk5Var3 = kwe.H(rv4Var);
                    i3 &= -7169;
                } else {
                    lk5Var3 = lk5Var;
                }
                if ((i2 & 32) != 0) {
                    int i15 = i3 & (-458753);
                    nq7Var3 = nq7Var;
                    i7 = i15;
                    lk5Var2 = lk5Var3;
                    weaVar3 = pfa.a(kve.d, rv4Var);
                } else {
                    int i16 = i3;
                    nq7Var3 = nq7Var;
                    i7 = i16;
                    lk5Var2 = lk5Var3;
                    weaVar3 = weaVar2;
                }
                z4 = z5;
            }
            rv4Var.r();
            int i17 = i7 << 3;
            c(nq7Var3, vt4Var, z4, weaVar3, lk5Var2, obj, rv4Var, (i7 & 3670016) | ((i7 >> 3) & 14) | (i17 & Token.ASSIGN_MOD) | (i7 & 896) | ((i7 >> 6) & 7168) | (57344 & i17) | (i17 & 458752));
            weaVar2 = weaVar3;
            z3 = z4;
            nq7Var2 = nq7Var3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            z3 = z;
            lk5Var2 = lk5Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qs1(vt4Var, nq7Var2, z3, lk5Var2, weaVar2, lu4Var, i, i2);
        }
    }

    public static final void c(nq7 nq7Var, vt4 vt4Var, boolean z, wea weaVar, lk5 lk5Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-1134296466);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(weaVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(lk5Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(null)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((599187 & i10) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rv4Var.e0(976976045);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = s21.g(rv4Var);
            }
            yu7 yu7Var = (yu7) P;
            rv4Var.q(false);
            n95 n95Var = jz5.a;
            nq7 a0 = nq7Var.a0(pc7.b);
            float f = kve.e;
            nq7 k = tte.k(pna.o(ote.a(kve.f + f + f, 40.0f), a0), weaVar);
            if (z) {
                j = lk5Var.a;
            } else {
                j = lk5Var.c;
            }
            nq7 a02 = lbe.e(nmd.v(k, j, weaVar), yu7Var, jt9.a(nae.e, 0L, weaVar, 247), z, new xt9(0), vt4Var, 8).a0(new ch1(new bo7(29)));
            b37 d2 = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, a02);
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
            if (z) {
                j2 = lk5Var.b;
            } else {
                j2 = lk5Var.d;
            }
            pye.a(r12.a.a(new zl1(j2)), lu4Var, rv4Var, ((i10 >> 15) & Token.ASSIGN_MOD) | 8);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sg1(nq7Var, vt4Var, z, weaVar, lk5Var, lu4Var, i, 3);
        }
    }

    public static final void d(final nq7 nq7Var, final tu1 tu1Var, lu4 lu4Var, lu4 lu4Var2, lu4 lu4Var3, int i, final long j, long j2, final qid qidVar, final tu1 tu1Var2, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        boolean z;
        final lu4 lu4Var4;
        final lu4 lu4Var5;
        final lu4 lu4Var6;
        final int i5;
        final long j3;
        long j4;
        long b2;
        int i6;
        int i7;
        tu1 tu1Var3;
        tu1 tu1Var4;
        tu1 tu1Var5;
        boolean z2;
        rv4Var.g0(-1211482744);
        if (rv4Var.f(nq7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3 | 4418944;
        if (rv4Var.f(qidVar)) {
            i4 = 67108864;
        } else {
            i4 = 33554432;
        }
        int i9 = i8 | i4;
        boolean z3 = false;
        if ((306783379 & i9) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i6 = i9 & (-29360129);
                tu1Var3 = lu4Var;
                tu1Var4 = lu4Var2;
                tu1Var5 = lu4Var3;
                i7 = i;
                j4 = j;
                b2 = j2;
            } else {
                tu1 tu1Var6 = sxd.g;
                tu1 tu1Var7 = sxd.h;
                tu1 tu1Var8 = sxd.i;
                j4 = j;
                b2 = rm1.b(j4, rv4Var);
                i6 = i9 & (-29360129);
                i7 = 2;
                tu1Var3 = tu1Var6;
                tu1Var4 = tu1Var7;
                tu1Var5 = tu1Var8;
            }
            rv4Var.r();
            int i10 = (234881024 & i6) ^ 100663296;
            if ((i10 > 67108864 && rv4Var.f(qidVar)) || (i6 & 100663296) == 67108864) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new iw7(qidVar);
                rv4Var.o0(P);
            }
            iw7 iw7Var = (iw7) P;
            boolean f = rv4Var.f(iw7Var);
            if ((i10 > 67108864 && rv4Var.f(qidVar)) || (i6 & 100663296) == 67108864) {
                z3 = true;
            }
            boolean z4 = f | z3;
            Object P2 = rv4Var.P();
            if (z4 || P2 == obj) {
                P2 = new cn9(5, iw7Var, qidVar);
                rv4Var.o0(P2);
            }
            lu4 lu4Var7 = tu1Var5;
            long j5 = b2;
            v9b.a(hc2.p(nq7Var, (xt4) P2), null, j4, j5, nae.e, nae.e, null, jce.E(848889571, new ru1(i7, tu1Var, tu1Var2, tu1Var4, tu1Var5, iw7Var, tu1Var3), rv4Var), rv4Var, 12583296, 114);
            i5 = i7;
            lu4Var4 = tu1Var3;
            lu4Var5 = tu1Var4;
            lu4Var6 = lu4Var7;
            j3 = j5;
        } else {
            rv4Var.X();
            lu4Var4 = lu4Var;
            lu4Var5 = lu4Var2;
            lu4Var6 = lu4Var3;
            i5 = i;
            j3 = j2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(tu1Var, lu4Var4, lu4Var5, lu4Var6, i5, j, j3, qidVar, tu1Var2, i2) { // from class: dz9
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;
                public final /* synthetic */ qid E;
                public final /* synthetic */ tu1 F;
                public final /* synthetic */ tu1 b;
                public final /* synthetic */ lu4 c;
                public final /* synthetic */ lu4 d;
                public final /* synthetic */ lu4 e;
                public final /* synthetic */ int f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(806879281);
                    mwe.d(nq7.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj2, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(int i, tu1 tu1Var, tu1 tu1Var2, lu4 lu4Var, lu4 lu4Var2, qid qidVar, lu4 lu4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i10;
        rv4Var.g0(-280287501);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (rv4Var.h(tu1Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (rv4Var.h(tu1Var2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i13 = i12 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i14 = i13 | i6;
        if (rv4Var.h(lu4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i15 = i14 | i7;
        if (rv4Var.f(qidVar)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i8;
        if (rv4Var.h(lu4Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i17 = i16 | i9;
        if ((599187 & i17) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i17 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new fz9();
                rv4Var.o0(P);
            }
            fz9 fz9Var = (fz9) P;
            if ((i17 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i17 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z2 | z3;
            if ((i17 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z9 | z4;
            if ((57344 & i17) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z10 | z5;
            if ((i17 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((3670016 & i17) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i17 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z8 | z13;
            Object P2 = rv4Var.P();
            if (!z14 && P2 != lh9Var) {
                i10 = 0;
            } else {
                i10 = 0;
                P2 = new i81(qidVar, tu1Var, lu4Var, lu4Var2, i, lu4Var3, fz9Var, tu1Var2);
                rv4Var.o0(P2);
            }
            k6b.a(null, (lu4) P2, rv4Var, i10, 1);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ru1(i, tu1Var, tu1Var2, lu4Var, lu4Var2, qidVar, lu4Var3, i2);
        }
    }

    public static final th8 f(int i, rv4 rv4Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        float f4 = nae.e;
        if (z2) {
            rv4Var.e0(-1553401373);
            f = w(rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1553400464);
            rv4Var.q(false);
            f = 0.0f;
        }
        if (z3) {
            rv4Var.e0(-1553399579);
            f2 = v(rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1553398608);
            rv4Var.q(false);
            f2 = 0.0f;
        }
        if (z4) {
            rv4Var.e0(-1553397853);
            f3 = t(rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1553396944);
            rv4Var.q(false);
            f3 = 0.0f;
        }
        if (z) {
            rv4Var.e0(-1553395994);
            f4 = s(rv4Var);
        } else {
            rv4Var.e0(-1553394992);
        }
        rv4Var.q(false);
        return new th8(f2, f, f3, f4);
    }

    public static final th8 g(int i, rv4 rv4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        float f3;
        boolean z4 = true;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 8) == 0) {
            z4 = false;
        }
        float f4 = nae.e;
        if (z) {
            rv4Var.e0(-1596174766);
            f = w(rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1596173857);
            rv4Var.q(false);
            f = 0.0f;
        }
        if (z2) {
            rv4Var.e0(-1596172972);
            f2 = v(rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1596172001);
            rv4Var.q(false);
            f2 = 0.0f;
        }
        if (z3) {
            rv4Var.e0(-1596171246);
            f3 = t(rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1596170337);
            rv4Var.q(false);
            f3 = 0.0f;
        }
        if (z4) {
            rv4Var.e0(2058362292);
            rg3 rg3Var = new rg3(s(rv4Var));
            WeakHashMap weakHashMap = yjd.w;
            rp rpVar = h88.n(rv4Var).c;
            tza tzaVar = dy1.h;
            r13 r13Var = (r13) rv4Var.j(tzaVar);
            f4 = ((rg3) hxe.s(rg3Var, new rg3(((r13) rv4Var.j(tzaVar)).y0(rpVar.e().d)))).a;
            rv4Var.q(false);
        } else {
            rv4Var.e0(2058569713);
            rv4Var.q(false);
        }
        return new th8(f2, f, f3, f4);
    }

    public static final rh8 h(rh8 rh8Var, float f, float f2, float f3, float f4, rv4 rv4Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        rh8Var.getClass();
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        boolean z5 = false;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(rh8Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.c(f)) || (i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if ((((i & 896) ^ 384) > 256 && rv4Var.c(f2)) || (i & 384) == 256) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 | z3;
        if ((((i & 7168) ^ 3072) > 2048 && rv4Var.c(f3)) || (i & 3072) == 2048) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = z7 | z4;
        if ((((57344 & i) ^ 24576) > 16384 && rv4Var.c(f4)) || (i & 24576) == 16384) {
            z5 = true;
        }
        boolean z9 = z8 | z5;
        Object P = rv4Var.P();
        if (z9 || P == ax1.a) {
            P = r(rh8Var, new th8(f, f2, f3, f4));
            rv4Var.o0(P);
        }
        return (rh8) P;
    }

    public static final void i(k61 k61Var, kwe kweVar, yj yjVar) {
        kweVar.getClass();
        if (kweVar instanceof tf8) {
            k61.r(k61Var, ((tf8) kweVar).c);
        } else if (kweVar instanceof uf8) {
            yjVar.getClass();
            yjVar.m();
            yj.d(yjVar, ((uf8) kweVar).c);
            k61Var.f(yjVar, 1);
        } else if (kweVar instanceof sf8) {
            k61Var.f(((sf8) kweVar).c, 1);
        } else {
            xk5.o();
        }
    }

    public static final nob j(f03 f03Var) {
        zob zobVar;
        lob lobVar = new lob();
        dae.E(f03Var, pob.a, new ux9(new ux9(lobVar, 24), new wob(1, lobVar, lob.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0)));
        kv7 kv7Var = new kv7();
        kv7 kv7Var2 = lobVar.a;
        Object[] objArr = kv7Var2.a;
        int i = kv7Var2.b;
        mob mobVar = null;
        int i2 = 0;
        boolean z = true;
        mob mobVar2 = null;
        while (true) {
            zobVar = zob.b;
            if (i2 >= i) {
                break;
            }
            mob mobVar3 = (mob) objArr[i2];
            if (!z || mobVar3 != zobVar) {
                if (mobVar3 != zobVar || mobVar2 != zobVar) {
                    if (mobVar3 != zobVar) {
                        kv7 kv7Var3 = lobVar.b;
                        Object[] objArr2 = kv7Var3.a;
                        int i3 = kv7Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((xt4) objArr2[i4]).invoke(mobVar3)).booleanValue()) {
                            }
                        }
                    }
                    kv7Var.a(mobVar3);
                    z = false;
                    mobVar2 = mobVar3;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (!kv7Var.h()) {
            mobVar = kv7Var.a[kv7Var.b - 1];
        }
        if (mobVar == zobVar) {
            kv7Var.k(kv7Var.b - 1);
        }
        iv7 iv7Var = kv7Var.c;
        if (iv7Var == null) {
            iv7Var = new iv7(kv7Var, 0);
            kv7Var.c = iv7Var;
        }
        return new nob(iv7Var);
    }

    public static final Object k(m42 m42Var, tj4 tj4Var, vt4 vt4Var, mu4 mu4Var, sj4[] sj4VarArr) {
        co1 co1Var = new co1((m42) null, tj4Var, vt4Var, mu4Var, sj4VarArr);
        r0a r0aVar = new r0a(m42Var, m42Var.getContext());
        Object J = zbe.J(r0aVar, true, r0aVar, co1Var);
        if (J == n82.a) {
            return J;
        }
        return pvc.a;
    }

    public static void l(Object obj, String str, String str2) {
        String p = p(str);
        if (Log.isLoggable(p, 3)) {
            Log.d(p, String.format(str2, obj));
        }
    }

    public static void m(Exception exc, String str, String str2) {
        String p = p(str);
        if (Log.isLoggable(p, 6)) {
            Log.e(p, str2, exc);
        }
    }

    public static final nq7 n(nq7 nq7Var, zm4 zm4Var) {
        return nq7Var.a0(new an4(zm4Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r9 == r5) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o(defpackage.v20 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.g20
            if (r0 == 0) goto L13
            r0 = r9
            g20 r0 = (defpackage.g20) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            g20 r0 = new g20
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            long r0 = r0.b
            defpackage.hre.r(r9)
            goto L5d
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L33:
            v20 r8 = r0.a
            defpackage.hre.r(r9)
            goto L49
        L39:
            defpackage.hre.r(r9)
            r0.a = r8
            r0.d = r4
            w20 r9 = r8.a
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r5) goto L49
            goto L5b
        L49:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            r0.a = r2
            r0.b = r6
            r0.d = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r5) goto L5c
        L5b:
            return r5
        L5c:
            r0 = r6
        L5d:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            long r0 = r0 - r8
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwe.o(v20, n42):java.lang.Object");
    }

    public static String p(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static final bkd q(rh8 rh8Var, th8 th8Var) {
        rh8Var.getClass();
        return new bkd(rh8Var, th8Var, 0);
    }

    public static final bkd r(rh8 rh8Var, rh8 rh8Var2) {
        rh8Var.getClass();
        rh8Var2.getClass();
        return new bkd(rh8Var, rh8Var2, 1);
    }

    public static final float s(rv4 rv4Var) {
        WeakHashMap weakHashMap = yjd.w;
        return w92.o(new ovc(new ovc(h88.n(rv4Var).o, h88.n(rv4Var).n), h88.n(rv4Var).b), rv4Var).a();
    }

    public static final float t(rv4 rv4Var) {
        WeakHashMap weakHashMap = yjd.w;
        return axe.d(w92.o(new ovc(new ovc(h88.n(rv4Var).o, h88.n(rv4Var).n), h88.n(rv4Var).b), rv4Var), rv4Var);
    }

    public static final nq7 u(nq7 nq7Var, final boolean z, int i) {
        final boolean z2;
        final boolean z3;
        nq7Var.getClass();
        final boolean z4 = false;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = true;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return lye.j(nq7Var, new mu4() { // from class: akd
            @Override // defpackage.mu4
            public final Object c(Object obj, Object obj2, Object obj3) {
                float f;
                float f2;
                float f3;
                nq7 nq7Var2 = (nq7) obj;
                rv4 rv4Var = (rv4) obj2;
                ((Integer) obj3).getClass();
                nq7Var2.getClass();
                rv4Var.e0(-818557205);
                boolean z5 = z2;
                float f4 = nae.e;
                if (z5) {
                    rv4Var.e0(-654457600);
                    f = mwe.w(rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-654456691);
                    rv4Var.q(false);
                    f = 0.0f;
                }
                if (z3) {
                    rv4Var.e0(-654455678);
                    f2 = mwe.v(rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-654454707);
                    rv4Var.q(false);
                    f2 = 0.0f;
                }
                if (z4) {
                    rv4Var.e0(-654453824);
                    f3 = mwe.t(rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-654452915);
                    rv4Var.q(false);
                    f3 = 0.0f;
                }
                if (z) {
                    rv4Var.e0(-654451837);
                    f4 = mwe.s(rv4Var);
                } else {
                    rv4Var.e0(-654450835);
                }
                rv4Var.q(false);
                nq7 B = zbe.B(nq7Var2, f2, f, f3, f4);
                rv4Var.q(false);
                return B;
            }
        });
    }

    public static final float v(rv4 rv4Var) {
        WeakHashMap weakHashMap = yjd.w;
        return axe.f(w92.o(new ovc(new ovc(h88.n(rv4Var).o, h88.n(rv4Var).n), h88.n(rv4Var).b), rv4Var), rv4Var);
    }

    public static final float w(rv4 rv4Var) {
        WeakHashMap weakHashMap = yjd.w;
        return w92.o(new ovc(new ovc(h88.n(rv4Var).o, h88.n(rv4Var).n), h88.n(rv4Var).b), rv4Var).d();
    }

    public static final nq7 x(nq7 nq7Var, int i) {
        final boolean z;
        final boolean z2;
        nq7Var.getClass();
        final boolean z3 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return lye.j(nq7Var, new mu4() { // from class: zjd
            @Override // defpackage.mu4
            public final Object c(Object obj, Object obj2, Object obj3) {
                float f;
                float f2;
                nq7 nq7Var2 = (nq7) obj;
                rv4 rv4Var = (rv4) obj2;
                ((Integer) obj3).getClass();
                nq7Var2.getClass();
                rv4Var.e0(-1598796170);
                boolean z4 = z;
                float f3 = nae.e;
                if (z4) {
                    rv4Var.e0(1155173835);
                    f = mwe.w(rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(1155174744);
                    rv4Var.q(false);
                    f = 0.0f;
                }
                if (z2) {
                    rv4Var.e0(1155175757);
                    f2 = mwe.v(rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(1155176728);
                    rv4Var.q(false);
                    f2 = 0.0f;
                }
                if (z3) {
                    rv4Var.e0(1155177611);
                    f3 = mwe.t(rv4Var);
                } else {
                    rv4Var.e0(1155178520);
                }
                rv4Var.q(false);
                rv4Var.e0(1450835775);
                rg3 rg3Var = new rg3(mwe.s(rv4Var));
                WeakHashMap weakHashMap = yjd.w;
                rp rpVar = h88.n(rv4Var).c;
                tza tzaVar = dy1.h;
                r13 r13Var = (r13) rv4Var.j(tzaVar);
                float f4 = ((rg3) hxe.s(rg3Var, new rg3(((r13) rv4Var.j(tzaVar)).y0(rpVar.e().d)))).a;
                rv4Var.q(false);
                nq7 B = zbe.B(nq7Var2, f2, f, f3, f4);
                rv4Var.q(false);
                return B;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(android.view.inputmethod.EditorInfo r16, java.lang.CharSequence r17, long r18, defpackage.as5 r20) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwe.y(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, as5):void");
    }
}
