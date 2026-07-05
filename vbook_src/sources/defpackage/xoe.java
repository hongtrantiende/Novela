package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xoe  reason: default package */
/* loaded from: classes.dex */
public abstract class xoe {
    public static final tu1 a;
    public static final tu1 b;
    public static final tu1 c;
    public static final tu1 d;
    public static final us e;

    static {
        new tu1(new c8(14, (byte) 0), false, 657782987);
        new tu1(new tx0(4), false, -1270442071);
        new tu1(new c8(18, (byte) 0), false, 2094288676);
        a = new tu1(new tx0(5), false, -1342205566);
        new tu1(new c8(15, (byte) 0), false, -1230986050);
        new tu1(new tx0(3), false, 1921811868);
        b = new tu1(new c8(16, (byte) 0), false, -2101264077);
        c = new tu1(new c8(17, (byte) 0), false, 37575796);
        d = new tu1(new tv1(19), false, 1667430491);
        e = new us(1);
    }

    public static final void a(final boolean z, final boolean z2, final boolean z3, final float f, final List list, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        final kq7 kq7Var;
        list.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        vt4Var.getClass();
        rv4Var.g0(1134485005);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.g(z3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.c(f)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var.f(list)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6 | 196608;
        if (rv4Var.h(xt4Var2)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i15 = i14 | i7;
        if (rv4Var.h(xt4Var3)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i16 = i15 | i8;
        if (rv4Var.h(vt4Var)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        int i17 = i16 | i9;
        if ((306783379 & i17) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i17 & 1, z4)) {
            if (z2) {
                rv4Var.e0(345541863);
                int i18 = i17 & 14;
                int i19 = i17 >> 3;
                c(z, z3, f, list, xt4Var, xt4Var2, xt4Var3, vt4Var, rv4Var, (i19 & 896) | i18 | (i19 & Token.ASSIGN_MOD) | (i19 & 7168) | 221184 | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024));
                rv4Var.q(false);
            } else {
                rv4Var.e0(346038018);
                int i20 = i17 & 14;
                int i21 = i17 >> 3;
                b(z, z3, f, list, xt4Var, xt4Var2, xt4Var3, vt4Var, rv4Var, i20 | (i21 & Token.ASSIGN_MOD) | (i21 & 896) | (i21 & 7168) | 221184 | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024));
                rv4Var.q(false);
            }
            kq7Var = kq7.a;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, z2, z3, f, list, kq7Var, xt4Var, xt4Var2, xt4Var3, vt4Var, i) { // from class: eo7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ vt4 F;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ float d;
                public final /* synthetic */ List e;
                public final /* synthetic */ nq7 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1572865);
                    xoe.a(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(boolean z, boolean z2, float f, List list, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        float f2;
        Object obj;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4Var.g0(-274720791);
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
            z3 = z2;
            if (rv4Var.g(z3)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            f2 = f;
            if (rv4Var.c(f2)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        int i12 = i & 24576;
        kq7 kq7Var = kq7.a;
        if (i12 == 0) {
            if (rv4Var.f(kq7Var)) {
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
            if (rv4Var.h(xt4Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            obj = vt4Var;
            if (rv4Var.h(obj)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        } else {
            obj = vt4Var;
        }
        int i13 = i2;
        if ((38347923 & i13) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i13 & 1, z4)) {
            nmd.d(z, xt4Var, kq7Var, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(332343109, new s90(z3, f2, list, xt4Var2, xt4Var3, obj), rv4Var), rv4Var, (i13 & 14) | 3072 | ((i13 >> 12) & Token.ASSIGN_MOD) | ((i13 >> 6) & 896), 48, 2032);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new go7(z, z2, f, list, xt4Var, xt4Var2, xt4Var3, vt4Var, i, 1);
        }
    }

    public static final void c(boolean z, boolean z2, float f, List list, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        float f2;
        Object obj;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4Var.g0(-1037749607);
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
            z3 = z2;
            if (rv4Var.g(z3)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            f2 = f;
            if (rv4Var.c(f2)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        int i12 = i & 24576;
        kq7 kq7Var = kq7.a;
        if (i12 == 0) {
            if (rv4Var.f(kq7Var)) {
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
            if (rv4Var.h(xt4Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            obj = vt4Var;
            if (rv4Var.h(obj)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        } else {
            obj = vt4Var;
        }
        int i13 = i2;
        if ((38347923 & i13) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i13 & 1, z4)) {
            xb.d(z, xt4Var, null, kq7Var, null, jce.E(913558448, new id1(xt4Var, 23, (byte) 0), rv4Var), nc2.e, null, 0L, 0L, nae.e, false, false, jce.E(1983252293, new fo7(z3, f2, list, xt4Var2, xt4Var3, obj), rv4Var), rv4Var, (i13 & 14) | 1769472 | ((i13 >> 12) & Token.ASSIGN_MOD) | ((i13 >> 3) & 7168), 8084);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new go7(z, z2, f, list, xt4Var, xt4Var2, xt4Var3, vt4Var, i, 0);
        }
    }

    public static final void d(uxa uxaVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        uxaVar.getClass();
        rv4Var.g0(228519676);
        if ((i & 6) == 0) {
            if (rv4Var.f(uxaVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            aw7 n = yae.n(uxaVar.d, rv4Var);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            List a2 = uxaVar.a();
            int i5 = i2 & 14;
            if (i5 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var.P();
            if (z2 || P2 == lh9Var) {
                P2 = new o0(uxaVar, null);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, a2);
            if (!uxaVar.a().isEmpty()) {
                rv4Var.e0(307418988);
                int i6 = i2;
                List a3 = uxaVar.a();
                boolean booleanValue = ((Boolean) n.getValue()).booleanValue();
                rxa rxaVar = uxaVar.b;
                if (i5 != 4) {
                    z3 = false;
                }
                boolean h = rv4Var.h(m82Var) | z3;
                Object P3 = rv4Var.P();
                if (h || P3 == lh9Var) {
                    P3 = new mm7(28, uxaVar, m82Var);
                    rv4Var.o0(P3);
                }
                ape.k(a3, rxaVar, (vt4) P3, booleanValue, nq7Var, rv4Var, (i6 << 12) & 458752);
                rv4Var.q(false);
            } else {
                rv4Var.e0(308126470);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(uxaVar, nq7Var, i, 26);
        }
    }

    public static final void e(final boolean z, final float f, final List list, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        float f2;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-444469287);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i2 | i;
        if (rv4Var2.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var2.f(list)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i11 |= i8;
        }
        if (rv4Var2.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i12 = i11 | i5;
        if (rv4Var2.h(xt4Var2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i14 & 1, z2)) {
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
            nq7 A = zbe.A(pna.f(kq7Var, 1.0f), nae.e, 8.0f, 1);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, A);
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
            String A2 = yqe.A((y3b) z1b.y.getValue(), rv4Var2);
            tza tzaVar = j27.a;
            cvb.c(A2, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 24960, 110588);
            int i15 = i14 >> 3;
            tte.g(z, false, null, xt4Var, rv4Var, (i14 & 14) | (i15 & 7168), 6);
            rv4 rv4Var3 = rv4Var;
            rs8.u(rv4Var3, true, kq7Var, 32.0f, rv4Var3);
            if (list.isEmpty()) {
                rv4Var3.e0(-2118656065);
                cvb.c(yqe.A((y3b) z1b.A.getValue(), rv4Var3), zbe.A(kq7Var, 24.0f, nae.e, 2).a0(new l95(kh5.J)), ((h27) rv4Var3.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(tzaVar)).b.j, rv4Var3, 0, 0, 131064);
                rv4Var3 = rv4Var3;
                rv4Var3.q(false);
                f2 = 0.0f;
            } else {
                rv4Var3.e0(-2118287041);
                String A3 = yqe.A((y3b) z1b.C.getValue(), rv4Var3);
                if ((i14 & 458752) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P = rv4Var3.P();
                if (z3 || P == ax1.a) {
                    P = new in7(12, xt4Var2);
                    rv4Var3.o0(P);
                }
                f2 = 0.0f;
                dpe.i(f, nae.e, 1.0f, A3, z, null, xt4Var2, (vt4) P, rv4Var3, (i15 & 14) | 432 | ((i14 << 12) & 57344) | (3670016 & (i14 << 3)), 32);
                rv4Var3.q(false);
            }
            rv4 rv4Var4 = rv4Var3;
            z1d.f(rp5.c((wk3) ok3.D.getValue(), rv4Var3, 0), yqe.A((y3b) z1b.B.getValue(), rv4Var3), false, null, zbe.A(new l95(kh5.K), f2, 12.0f, 1), null, null, null, vt4Var, rv4Var4, (i14 << 6) & 234881024, 236);
            rv4Var2 = rv4Var4;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: ho7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xoe.e(z, f, list, nq7Var, xt4Var, xt4Var2, vt4Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void f(vl8 vl8Var, g4b g4bVar) {
        for (String str : g4bVar.names()) {
            List<String> e2 = g4bVar.e(str);
            if (e2 == null) {
                e2 = ks3.a;
            }
            String e3 = xk1.e(str, false);
            ArrayList arrayList = new ArrayList(tl1.s(e2, 10));
            for (String str2 : e2) {
                str2.getClass();
                arrayList.add(xk1.e(str2, true));
            }
            vl8Var.d(e3, arrayList);
        }
    }

    public static void g() {
        StringBuilder sb = new StringBuilder();
        kue.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i2 = i + 1;
            int e2 = hs5.e(objArr.length, i2);
            if (e2 > objArr.length) {
                objArr = Arrays.copyOf(objArr, e2);
            }
            objArr[i] = valueOf;
            z = true;
            i = i2;
        }
        if (!z) {
            return;
        }
        throw new jy4(sb.toString(), qs5.h(i, objArr));
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        ms5 ms5Var = qs5.b;
        throw new jy4(str, mm9.e);
    }

    public static FloatBuffer i(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vl8, c3e] */
    public static final tl8 j(vl8 vl8Var) {
        ?? c3eVar = new c3e(8);
        for (String str : ((Map) vl8Var.a).keySet()) {
            List<String> w = vl8Var.w(str);
            if (w == null) {
                w = ks3.a;
            }
            String d2 = xk1.d(0, str, 0, 15);
            ArrayList arrayList = new ArrayList(tl1.s(w, 10));
            for (String str2 : w) {
                arrayList.add(xk1.d(0, str2, 0, 11));
            }
            c3eVar.d(d2, arrayList);
        }
        return c3eVar.Y();
    }

    public static boolean k(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        h("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        h("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            if (eglQueryString == null || !eglQueryString.contains(str)) {
                return false;
            }
            return true;
        }
        throw new jy4("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), qs5.r(Integer.valueOf(eglGetError)));
    }

    public static final o71 l(rv4 rv4Var) {
        return new o71(o17.s(new yk8("paragraph", new qm0(yqe.A((y3b) f2b.A.getValue(), rv4Var), yqe.A((y3b) f2b.B.getValue(), rv4Var), tl1.B("text", "p"))), new yk8("heading_1", new qm0(yqe.A((y3b) f2b.k.getValue(), rv4Var), yqe.A((y3b) f2b.l.getValue(), rv4Var), tl1.B("h1", "heading", "title"))), new yk8("heading_2", new qm0(yqe.A((y3b) f2b.m.getValue(), rv4Var), yqe.A((y3b) f2b.n.getValue(), rv4Var), tl1.B("h2", "heading", "title"))), new yk8("heading_3", new qm0(yqe.A((y3b) f2b.o.getValue(), rv4Var), yqe.A((y3b) f2b.p.getValue(), rv4Var), tl1.B("h3", "heading", "title"))), new yk8("heading_4", new qm0(yqe.A((y3b) f2b.q.getValue(), rv4Var), yqe.A((y3b) f2b.r.getValue(), rv4Var), tl1.B("h4", "heading", "title"))), new yk8("heading_5", new qm0(yqe.A((y3b) f2b.s.getValue(), rv4Var), yqe.A((y3b) f2b.t.getValue(), rv4Var), tl1.B("h5", "heading", "title"))), new yk8("heading_6", new qm0(yqe.A((y3b) f2b.u.getValue(), rv4Var), yqe.A((y3b) f2b.v.getValue(), rv4Var), tl1.B("h6", "heading", "title"))), new yk8("todo", new qm0(yqe.A((y3b) f2b.E.getValue(), rv4Var), yqe.A((y3b) f2b.F.getValue(), rv4Var), tl1.B("checkbox", "task", "check", "todo"))), new yk8("bullet_list", new qm0(yqe.A((y3b) f2b.e.getValue(), rv4Var), yqe.A((y3b) f2b.f.getValue(), rv4Var), tl1.B("list", "bullet", "ul", "unordered"))), new yk8("numbered_list", new qm0(yqe.A((y3b) f2b.y.getValue(), rv4Var), yqe.A((y3b) f2b.z.getValue(), rv4Var), tl1.B("list", "number", "ol", "ordered"))), new yk8("quote", new qm0(yqe.A((y3b) f2b.C.getValue(), rv4Var), yqe.A((y3b) f2b.D.getValue(), rv4Var), tl1.B("blockquote", "citation"))), new yk8("code", new qm0(yqe.A((y3b) f2b.g.getValue(), rv4Var), yqe.A((y3b) f2b.h.getValue(), rv4Var), tl1.B("code", "snippet", "monospace"))), new yk8("divider", new qm0(yqe.A((y3b) f2b.i.getValue(), rv4Var), yqe.A((y3b) f2b.j.getValue(), rv4Var), tl1.B("hr", "line", "separator", "horizontal"))), new yk8("image", new qm0(yqe.A((y3b) f2b.w.getValue(), rv4Var), yqe.A((y3b) f2b.x.getValue(), rv4Var), tl1.B("picture", "photo", "img")))));
    }

    public static final c81 m(rv4 rv4Var) {
        v71 v71Var = yae.a;
        String A = yqe.A((y3b) f2b.d.getValue(), rv4Var);
        String A2 = yqe.A((y3b) f2b.G.getValue(), rv4Var);
        String A3 = yqe.A((y3b) f2b.M.getValue(), rv4Var);
        String A4 = yqe.A((y3b) f2b.V.getValue(), rv4Var);
        String A5 = yqe.A((y3b) f2b.U.getValue(), rv4Var);
        String A6 = yqe.A((y3b) f2b.L.getValue(), rv4Var);
        String A7 = yqe.A((y3b) f2b.I.getValue(), rv4Var);
        String A8 = yqe.A((y3b) f2b.T.getValue(), rv4Var);
        String A9 = yqe.A((y3b) f2b.H.getValue(), rv4Var);
        String A10 = yqe.A((y3b) f2b.K.getValue(), rv4Var);
        String A11 = yqe.A((y3b) f2b.J.getValue(), rv4Var);
        String A12 = yqe.A((y3b) f2b.N.getValue(), rv4Var);
        String A13 = yqe.A((y3b) f2b.O.getValue(), rv4Var);
        String A14 = yqe.A((y3b) f2b.P.getValue(), rv4Var);
        String A15 = yqe.A((y3b) f2b.Q.getValue(), rv4Var);
        String A16 = yqe.A((y3b) f2b.R.getValue(), rv4Var);
        String A17 = yqe.A((y3b) f2b.S.getValue(), rv4Var);
        A.getClass();
        A2.getClass();
        A3.getClass();
        s21.B(A4, A5, A6, A7, A8);
        s21.B(A9, A10, A11, A12, A13);
        A14.getClass();
        A15.getClass();
        A16.getClass();
        A17.getClass();
        return new c81(A, c81.t, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, v71Var);
    }

    public static final i07 n(voe voeVar, xt4 xt4Var, rv4 rv4Var) {
        voe voeVar2;
        Object obj;
        aw7 D = yae.D(voeVar, rv4Var);
        Object D2 = yae.D(xt4Var, rv4Var);
        Object[] objArr = new Object[0];
        Object P = rv4Var.P();
        Object obj2 = ax1.a;
        if (P == obj2) {
            P = new i(2);
            rv4Var.o0(P);
        }
        Object obj3 = (String) zpe.k(objArr, (vt4) P, rv4Var, 48);
        s6 a2 = bt6.a(rv4Var);
        if (a2 != null) {
            Object h = a2.h();
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = new Object();
                rv4Var.o0(P2);
            }
            i6 i6Var = (i6) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj2) {
                P3 = new i07(i6Var, D);
                rv4Var.o0(P3);
            }
            i07 i07Var = (i07) P3;
            boolean h2 = rv4Var.h(i6Var) | rv4Var.h(h) | rv4Var.f(obj3) | rv4Var.h(voeVar) | rv4Var.f(D2);
            Object P4 = rv4Var.P();
            if (!h2 && P4 != obj2) {
                obj = P4;
                voeVar2 = voeVar;
            } else {
                voeVar2 = voeVar;
                Object p6Var = new p6(i6Var, h, obj3, voeVar2, D2, 0);
                rv4Var.o0(p6Var);
                obj = p6Var;
            }
            yte.d(h, obj3, voeVar2, (xt4) obj, rv4Var);
            return i07Var;
        }
        vs.k("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }

    public static final View o(f03 f03Var) {
        if (!((mq7) f03Var).a.J) {
            lv5.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) rd6.a(voe.v(f03Var));
    }

    public static final int p(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final int q(eg6 eg6Var) {
        boolean z;
        int i;
        int i2;
        long j;
        ff8 ff8Var = eg6Var.q;
        List list = eg6Var.m;
        if (ff8Var == ff8.a) {
            z = true;
        } else {
            z = false;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < list.size()) {
            fg6 fg6Var = (fg6) list.get(i3);
            if (z) {
                i = fg6Var.y;
            } else {
                i = fg6Var.z;
            }
            if (i == -1) {
                i3++;
            } else {
                int i6 = 0;
                while (i3 < list.size()) {
                    fg6 fg6Var2 = (fg6) list.get(i3);
                    if (z) {
                        i2 = fg6Var2.y;
                    } else {
                        i2 = fg6Var2.z;
                    }
                    if (i2 != i) {
                        break;
                    }
                    if (z) {
                        j = ((fg6) list.get(i3)).w & 4294967295L;
                    } else {
                        j = ((fg6) list.get(i3)).w >> 32;
                    }
                    i6 = Math.max(i6, (int) j);
                    i3++;
                }
                i4 += i6;
                i5++;
            }
        }
        return (i4 / i5) + eg6Var.s;
    }

    public static String r(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(s(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(s(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String s(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String v = nk2.v(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(v), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(v.length() + 8 + name2.length() + 1);
            nk2.C(sb, "<", v, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
