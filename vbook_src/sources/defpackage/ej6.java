package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ej6  reason: default package */
/* loaded from: classes3.dex */
public abstract class ej6 {
    public static final /* synthetic */ int a = 0;

    static {
        new rd2(0.5f, 0.5f, 1.0f, 0.25f);
    }

    public static final void a(final nq7 nq7Var, final int i, kj6 kj6Var, rh8 rh8Var, fz fzVar, mk0 mk0Var, li4 li4Var, boolean z, final xt4 xt4Var, rv4 rv4Var, final int i2, final int i3) {
        nq7 nq7Var2;
        int i4;
        Object obj;
        boolean z2;
        final rh8 rh8Var2;
        final mk0 mk0Var2;
        final li4 li4Var2;
        final boolean z3;
        final fz fzVar2;
        final kj6 kj6Var2;
        fz fzVar3;
        li4 li4Var3;
        kj6 kj6Var3;
        mk0 mk0Var3;
        int i5;
        th8 th8Var;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        xt4Var.getClass();
        rv4Var.g0(1060543493);
        if ((i2 & 6) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            nq7Var2 = nq7Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.d(i)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i2 & 384) == 0) {
            i4 |= Token.CASE;
        }
        int i10 = i4 | 27648;
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                obj = fzVar;
                if (rv4Var.f(obj)) {
                    i7 = 131072;
                    i10 |= i7;
                }
            } else {
                obj = fzVar;
            }
            i7 = Parser.ARGC_LIMIT;
            i10 |= i7;
        } else {
            obj = fzVar;
        }
        int i11 = 1572864 | i10;
        if ((12582912 & i2) == 0) {
            i11 = 5767168 | i10;
        }
        int i12 = 100663296 | i11;
        if ((805306368 & i2) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i12 |= i6;
        }
        if ((306783379 & i12) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            rv4Var.Z();
            int i13 = i2 & 1;
            Object obj2 = ax1.a;
            if (i13 != 0 && !rv4Var.B()) {
                rv4Var.X();
                int i14 = i12 & (-897);
                if ((i3 & 32) != 0) {
                    i14 = i12 & (-459649);
                }
                int i15 = i14 & (-29360129);
                th8Var = rh8Var;
                mk0Var3 = mk0Var;
                li4Var3 = li4Var;
                z4 = z;
                i5 = i15;
                kj6Var3 = kj6Var;
            } else {
                kj6 a2 = mj6.a(0, rv4Var, 0, 3);
                int i16 = i12 & (-897);
                th8 th8Var2 = new th8(nae.e, nae.e, nae.e, nae.e);
                if ((i3 & 32) != 0) {
                    i16 = i12 & (-459649);
                    fzVar3 = lz.a;
                } else {
                    fzVar3 = obj;
                }
                mk0 mk0Var4 = kh5.F;
                pq2 a3 = axa.a(rv4Var);
                boolean f = rv4Var.f(a3);
                Object P = rv4Var.P();
                if (f || P == obj2) {
                    P = new wt2(a3);
                    rv4Var.o0(P);
                }
                li4Var3 = (wt2) P;
                obj = fzVar3;
                kj6Var3 = a2;
                mk0Var3 = mk0Var4;
                i5 = i16 & (-29360129);
                th8Var = th8Var2;
                z4 = true;
            }
            rv4Var.r();
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var.o0(P2);
            }
            aw7 aw7Var = (aw7) P2;
            if (i > 0) {
                rv4Var.e0(872420814);
                Integer valueOf = Integer.valueOf(i);
                boolean f2 = rv4Var.f(kj6Var3);
                if ((i5 & Token.ASSIGN_MOD) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z6 = f2 | z5;
                Object P3 = rv4Var.P();
                if (z6 || P3 == obj2) {
                    P3 = new pf(kj6Var3, i, aw7Var, (m42) null, 9);
                    rv4Var.o0(P3);
                }
                yte.g((lu4) P3, rv4Var, valueOf);
                rv4Var.q(false);
            } else {
                rv4Var.e0(872681245);
                rv4Var.q(false);
            }
            int i17 = i5 >> 3;
            int i18 = (i5 & 14) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 29360128) | (1879048192 & i5);
            fz fzVar4 = obj;
            boolean z7 = z4;
            jce.e(nq7Var2, kj6Var3, th8Var, false, fzVar4, mk0Var3, li4Var3, z7, null, xt4Var, rv4Var, i18, 256);
            kj6Var2 = kj6Var3;
            z3 = z7;
            li4Var2 = li4Var3;
            mk0Var2 = mk0Var3;
            fzVar2 = fzVar4;
            rh8Var2 = th8Var;
        } else {
            rv4Var.X();
            rh8Var2 = rh8Var;
            mk0Var2 = mk0Var;
            li4Var2 = li4Var;
            z3 = z;
            fzVar2 = obj;
            kj6Var2 = kj6Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: vi6
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    ej6.a(nq7.this, i, kj6Var2, rh8Var2, fzVar2, mk0Var2, li4Var2, z3, xt4Var, (rv4) obj3, xoe.p(i2 | 1), i3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(qg6 qg6Var, int i, vt4 vt4Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        qg6Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-1793805503);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(qg6Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (rv4Var.d(i)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i4 |= i6;
        }
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            if (i8 != 0) {
                i = 0;
            }
            if (i >= 0) {
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = yae.q(new t93(qg6Var, i, 1));
                    rv4Var.o0(P);
                }
                yya yyaVar = (yya) P;
                aw7 D = yae.D(vt4Var, rv4Var);
                boolean f = rv4Var.f(D);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new xi6(yyaVar, D, null, 1);
                    rv4Var.o0(P2);
                }
                yte.g((lu4) P2, rv4Var, yyaVar);
            } else {
                p1a.k(a82.j(i, "buffer cannot be negative, but was "));
                return;
            }
        } else {
            rv4Var.X();
        }
        int i9 = i;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new n43(qg6Var, i9, vt4Var, i2, i3, 2);
        }
    }

    public static final void c(kj6 kj6Var, int i, vt4 vt4Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        kj6Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-232140567);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(kj6Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (rv4Var.d(i)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i4 |= i6;
        }
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            if (i8 != 0) {
                i = 0;
            }
            if (i >= 0) {
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = yae.q(new ti6(kj6Var, i, 0));
                    rv4Var.o0(P);
                }
                yya yyaVar = (yya) P;
                aw7 D = yae.D(vt4Var, rv4Var);
                boolean f = rv4Var.f(D);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new xi6(yyaVar, D, null, 0);
                    rv4Var.o0(P2);
                }
                yte.g((lu4) P2, rv4Var, yyaVar);
            } else {
                p1a.k(a82.j(i, "buffer cannot be negative, but was "));
                return;
            }
        } else {
            rv4Var.X();
        }
        int i9 = i;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new n43(kj6Var, i9, vt4Var, i2, i3, 1);
        }
    }

    public static final void d(nk6 nk6Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        nk6Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-1501209385);
        if ((i & 6) == 0) {
            if (rv4Var.f(nk6Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i5 |= i3;
        }
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.q(new wi6(nk6Var, 0));
                rv4Var.o0(P);
            }
            yya yyaVar = (yya) P;
            aw7 D = yae.D(vt4Var, rv4Var);
            boolean f = rv4Var.f(D);
            Object P2 = rv4Var.P();
            if (f || P2 == obj) {
                P2 = new xi6(yyaVar, D, null, 2);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, yyaVar);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(nk6Var, vt4Var, i, 15);
        }
    }

    public static final kj6 e(int i, vt4 vt4Var, rv4 rv4Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        int i4 = i3 & 8;
        Object obj = ax1.a;
        if (i4 != 0) {
            Object P = rv4Var.P();
            if (P == obj) {
                P = new v16(20);
                rv4Var.o0(P);
            }
            vt4Var = (vt4) P;
        }
        aw7 D = yae.D(vt4Var, rv4Var);
        kj6 a2 = mj6.a(i, rv4Var, i2 & Token.ELSE, 0);
        Object P2 = rv4Var.P();
        if (P2 == obj) {
            P2 = yae.q(new ne1(a2, 6));
            rv4Var.o0(P2);
        }
        yya yyaVar = (yya) P2;
        boolean f = rv4Var.f(D);
        Object P3 = rv4Var.P();
        if (f || P3 == obj) {
            P3 = new xi6(yyaVar, D, null, 3);
            rv4Var.o0(P3);
        }
        yte.g((lu4) P3, rv4Var, yyaVar);
        return a2;
    }
}
