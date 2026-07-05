package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sxd  reason: default package */
/* loaded from: classes.dex */
public abstract class sxd {
    public static final qm1 a = qm1.a;
    public static final ftc b = ftc.d;
    public static final afa c;
    public static final float d;
    public static final afa e;
    public static final float f;
    public static final tu1 g;
    public static final tu1 h;
    public static final tu1 i;
    public static final mb4 j;
    public static final mb4 k;
    public static final mb4 l;
    public static final mb4[] m;
    public static long n;
    public static Method o;
    public static Method p;
    public static Method q;

    static {
        afa afaVar = afa.c;
        c = afaVar;
        d = 16.0f;
        e = afaVar;
        f = 6.0f;
        new tu1(new ov1(8), false, -39202156);
        g = new tu1(new ov1(9), false, 1582488484);
        h = new tu1(new ov1(10), false, 414328099);
        i = new tu1(new ov1(11), false, -1514016380);
        mb4 mb4Var = new mb4("commit_to_configuration_v2_api", -1, 1L, true);
        j = mb4Var;
        mb4 mb4Var2 = new mb4("get_serving_version_api", -1, 1L, true);
        mb4 mb4Var3 = new mb4("get_experiment_tokens_api", -1, 1L, true);
        mb4 mb4Var4 = new mb4("register_flag_update_listener_api", -1, 2L, true);
        k = mb4Var4;
        mb4 mb4Var5 = new mb4("sync_after_api", -1, 1L, true);
        mb4 mb4Var6 = new mb4("sync_after_for_application_api", -1, 1L, true);
        mb4 mb4Var7 = new mb4("set_app_wide_properties_api", -1, 1L, true);
        mb4 mb4Var8 = new mb4("set_runtime_properties_api", -1, 1L, true);
        mb4 mb4Var9 = new mb4("get_storage_info_api", -1, 1L, true);
        l = mb4Var9;
        m = new mb4[]{mb4Var, mb4Var2, mb4Var3, mb4Var4, mb4Var5, mb4Var6, mb4Var7, mb4Var8, mb4Var9};
    }

    public static final void a(final ho3 ho3Var, nu4 nu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        ho3Var.getClass();
        nu4Var.getClass();
        rv4Var.g0(802164753);
        if (rv4Var.f(ho3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(nu4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            boolean booleanValue = ((Boolean) ho3Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new wf7(ho3Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(2079009597, new xf7(ho3Var, nu4Var), rv4Var), null, x, jce.E(-1453225190, new lu4() { // from class: yf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    int i7 = r2;
                    pvc pvcVar = pvc.a;
                    lh9 lh9Var = ax1.a;
                    ho3 ho3Var2 = ho3Var;
                    switch (i7) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f2 = rv4Var2.f(ho3Var2);
                                Object P2 = rv4Var2.P();
                                if (f2 || P2 == lh9Var) {
                                    P2 = new zf7(ho3Var2, 0);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, nye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                Object P3 = rv4Var3.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var3);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var3.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 11);
                                    rv4Var3.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var3, zm4Var);
                                kq7 kq7Var = kq7.a;
                                nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var3), 14);
                                xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                                int hashCode = Long.hashCode(rv4Var3.T);
                                xt8 l2 = rv4Var3.l();
                                nq7 p2 = lye.p(rv4Var3, C);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(qw1.f, rv4Var3, a2);
                                jce.F(qw1.e, rv4Var3, l2);
                                jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var3);
                                jce.F(qw1.d, rv4Var3, p2);
                                String str = (String) ho3Var2.c.getValue();
                                tza tzaVar = j27.a;
                                v72 v72Var = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 n2 = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f3 = rv4Var3.f(ho3Var2);
                                Object P5 = rv4Var3.P();
                                if (f3 || P5 == lh9Var) {
                                    P5 = new wf7(ho3Var2, 1);
                                    rv4Var3.o0(P5);
                                }
                                uwe.h(str, (xt4) P5, n2, false, false, null, nye.c, null, null, null, false, null, null, null, true, 0, 0, v72Var, null, rv4Var3, 1572864, 12582912, 6160312);
                                xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                                String str2 = (String) ho3Var2.d.getValue();
                                v72 v72Var2 = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                                boolean f4 = rv4Var3.f(ho3Var2);
                                Object P6 = rv4Var3.P();
                                if (f4 || P6 == lh9Var) {
                                    P6 = new wf7(ho3Var2, 2);
                                    rv4Var3.o0(P6);
                                }
                                uwe.h(str2, (xt4) P6, A, false, false, null, nye.d, null, null, null, false, null, null, null, false, 0, 2, v72Var2, null, rv4Var3, 1573248, 805306368, 5767096);
                                xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                                String str3 = (String) ho3Var2.e.getValue();
                                v72 v72Var3 = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                                boolean f5 = rv4Var3.f(ho3Var2);
                                Object P7 = rv4Var3.P();
                                if (f5 || P7 == lh9Var) {
                                    P7 = new wf7(ho3Var2, 3);
                                    rv4Var3.o0(P7);
                                }
                                uwe.h(str3, (xt4) P7, A2, false, false, null, nye.e, null, null, null, false, null, null, null, false, 0, 0, v72Var3, null, rv4Var3, 1573248, 0, 6291384);
                                rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), nye.b, null, 0L, 0L, nae.e, false, false, jce.E(1078448613, new lu4() { // from class: yf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    int i7 = r2;
                    pvc pvcVar = pvc.a;
                    lh9 lh9Var = ax1.a;
                    ho3 ho3Var2 = ho3Var;
                    switch (i7) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f2 = rv4Var2.f(ho3Var2);
                                Object P2 = rv4Var2.P();
                                if (f2 || P2 == lh9Var) {
                                    P2 = new zf7(ho3Var2, 0);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, nye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                Object P3 = rv4Var3.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var3);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var3.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 11);
                                    rv4Var3.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var3, zm4Var);
                                kq7 kq7Var = kq7.a;
                                nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var3), 14);
                                xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                                int hashCode = Long.hashCode(rv4Var3.T);
                                xt8 l2 = rv4Var3.l();
                                nq7 p2 = lye.p(rv4Var3, C);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(qw1.f, rv4Var3, a2);
                                jce.F(qw1.e, rv4Var3, l2);
                                jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var3);
                                jce.F(qw1.d, rv4Var3, p2);
                                String str = (String) ho3Var2.c.getValue();
                                tza tzaVar = j27.a;
                                v72 v72Var = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 n2 = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f3 = rv4Var3.f(ho3Var2);
                                Object P5 = rv4Var3.P();
                                if (f3 || P5 == lh9Var) {
                                    P5 = new wf7(ho3Var2, 1);
                                    rv4Var3.o0(P5);
                                }
                                uwe.h(str, (xt4) P5, n2, false, false, null, nye.c, null, null, null, false, null, null, null, true, 0, 0, v72Var, null, rv4Var3, 1572864, 12582912, 6160312);
                                xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                                String str2 = (String) ho3Var2.d.getValue();
                                v72 v72Var2 = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                                boolean f4 = rv4Var3.f(ho3Var2);
                                Object P6 = rv4Var3.P();
                                if (f4 || P6 == lh9Var) {
                                    P6 = new wf7(ho3Var2, 2);
                                    rv4Var3.o0(P6);
                                }
                                uwe.h(str2, (xt4) P6, A, false, false, null, nye.d, null, null, null, false, null, null, null, false, 0, 2, v72Var2, null, rv4Var3, 1573248, 805306368, 5767096);
                                xbe.i(rv4Var3, pna.h(kq7Var, 12.0f));
                                String str3 = (String) ho3Var2.e.getValue();
                                v72 v72Var3 = ((h27) rv4Var3.j(tzaVar)).c.b;
                                nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                                boolean f5 = rv4Var3.f(ho3Var2);
                                Object P7 = rv4Var3.P();
                                if (f5 || P7 == lh9Var) {
                                    P7 = new wf7(ho3Var2, 3);
                                    rv4Var3.o0(P7);
                                }
                                uwe.h(str3, (xt4) P7, A2, false, false, null, nye.e, null, null, null, false, null, null, null, false, 0, 0, v72Var3, null, rv4Var3, 1573248, 0, 6291384);
                                rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xf7(ho3Var, nu4Var, i2);
        }
    }

    public static final void b(boolean z, kub kubVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kubVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        vt4Var.getClass();
        rv4Var.g0(1875142916);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(kubVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(2038253034);
                d(z, kubVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var, rv4Var, i3 & 4194302);
                rv4Var.q(false);
            } else {
                rv4Var.e0(2038564553);
                c(z, kubVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var, rv4Var, i3 & 4194302);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new an7(z, kubVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var, i2, 0);
        }
    }

    public static final void c(boolean z, kub kubVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, vt4 vt4Var, rv4 rv4Var, int i2) {
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
        rv4Var.g0(-1476274029);
        if ((i2 & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            z2 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(kubVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i3 & 1, z3)) {
            nmd.f(z2, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(-2080049214, new bn7(kubVar, xt4Var2, xt4Var3, xt4Var4, vt4Var, xt4Var), rv4Var), rv4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new an7(z, kubVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var, i2, 1);
        }
    }

    public static final void d(boolean z, kub kubVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-1410106633);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(kubVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            hc2.b(pna.c, null, jce.E(-236633523, new fs1(z, xt4Var, kubVar, xt4Var2, xt4Var3, xt4Var4, vt4Var, 4), rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new an7(z, kubVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var, i2, 2);
        }
    }

    public static final void e(kub kubVar, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        kq7 kq7Var;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(185980396);
        if (rv4Var2.f(kubVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if ((i2 & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i9 |= i8;
        }
        int i10 = i9 | 384;
        if (rv4Var2.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i11 = i10 | i4;
        if (rv4Var2.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i12 = i11 | i5;
        if (rv4Var2.h(xt4Var3)) {
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
        boolean z2 = false;
        if ((599187 & i14) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i14 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p2 = lye.p(rv4Var2, kq7Var2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p2);
            int i15 = i14 << 3;
            twe.b(kubVar.a, kubVar.b, rh8Var, pna.f(kq7Var2, 1.0f), xt4Var, xt4Var2, xt4Var3, rv4Var2, (i15 & 896) | 3072 | (57344 & i15) | (458752 & i15) | (i15 & 3670016));
            ec6 ec6Var = ((dc6) rv4Var2.j(zf0.a)).a;
            nq7 y = zbe.y(mwe.u(pu0.a.a(kq7Var2, kh5.E), false, 12), 16.0f);
            long j2 = ((h27) rv4Var2.j(j27.a)).a.h;
            dj4 dj4Var = new dj4(2.0f, sve.m, sve.k, sve.l);
            if ((i14 & 3670016) == 1048576) {
                z2 = true;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new hi7(27, vt4Var);
                rv4Var2.o0(P);
            }
            wq9.c((vt4) P, y, null, ec6Var, j2, 0L, dj4Var, st0.c, rv4Var, 100663296, Token.TO_DOUBLE);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i81((Object) kubVar, (Object) rh8Var, (Object) kq7Var, xt4Var, xt4Var2, xt4Var3, vt4Var, i2, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.tj4 r4, java.lang.Object r5, java.lang.Object r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qk4
            if (r0 == 0) goto L13
            r0 = r7
            qk4 r0 = (defpackage.qk4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qk4 r0 = new qk4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            java.lang.Object r6 = r0.a
            defpackage.hre.r(r7)
            goto L3d
        L2d:
            defpackage.hre.r(r7)
            r0.a = r6
            r0.c = r2
            java.lang.Object r4 = r4.b(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3d
            return
        L3d:
            y r4 = new y
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxd.f(tj4, java.lang.Object, java.lang.Object, n42):void");
    }

    public static final void g(s11 s11Var, f31 f31Var, i11 i11Var) {
        s11Var.getClass();
        f31Var.getClass();
        z87.v(jz4.a, ab3.a, null, new o11(s11Var, f31Var, i11Var, null), 2).invokeOnCompletion(new k0(16, f31Var, i11Var));
    }

    public static gdd h(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    newInstance.getClass();
                    return (gdd) newInstance;
                } catch (IllegalAccessException e2) {
                    cp8.o("Cannot create an instance of ", cls, e2);
                    return null;
                } catch (InstantiationException e3) {
                    cp8.o("Cannot create an instance of ", cls, e3);
                    return null;
                }
            }
            throw new RuntimeException("Cannot create an instance of " + cls);
        } catch (NoSuchMethodException e4) {
            cp8.o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final String i(byte[] bArr) {
        return r4b.N(r4b.N(r4b.N(ah0.b(ah0.f, bArr), false, "=", ""), false, "+", "-"), false, "/", "_");
    }

    public static final long j(long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f) << 32);
    }

    public static void k(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                fb4.l(cause);
                return;
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 29) {
            return ric.c();
        }
        try {
            if (o == null) {
                n = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                o = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) o.invoke(null, Long.valueOf(n))).booleanValue();
        } catch (Exception e2) {
            k("isTagEnabled", e2);
            return false;
        }
    }

    public static final File m(Context context, String str) {
        context.getClass();
        str.getClass();
        return bbe.o(context, str.concat(".preferences_pb"));
    }

    public static final yk8 n(s11 s11Var, m82 m82Var) {
        s11Var.getClass();
        m82Var.getClass();
        i11 i11Var = new i11(true);
        i11 i11Var2 = new i11(true);
        z87.v(m82Var, null, null, new r9(s11Var, i11Var, i11Var2, (m42) null, 3), 3).invokeOnCompletion(new k0(17, i11Var, i11Var2));
        return new yk8(i11Var, i11Var2);
    }

    public static String o(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, Token.SWITCH);
    }

    public static String p(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String o2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                o2 = "null";
            } else {
                try {
                    o2 = obj.toString();
                } catch (Exception e2) {
                    String o3 = eub.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o3), (Throwable) e2);
                    o2 = hl5.o("<", o3, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i3] = o2;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = indexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
