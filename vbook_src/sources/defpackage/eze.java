package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import j$.time.Instant;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eze  reason: default package */
/* loaded from: classes.dex */
public abstract class eze {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final tu1 c = new tu1(new kv1(19), false, 124138812);
    public static final tu1 d = new tu1(new lv1(19), false, -2039922496);
    public static final tu1 e = new tu1(new wu1(20), false, -1962534942);
    public static final uk f = new uk(19);

    public static final void a(final int i, final sk8 sk8Var, final long j, final long j2, lu4 lu4Var, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        int i11;
        final vt4 vt4Var;
        Object obj2;
        boolean z7;
        boolean z8;
        boolean z9;
        lu4Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(346238495);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        if (rv4Var.f(sk8Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (rv4Var.e(j)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i14 = i13 | i5;
        if (rv4Var.e(j2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i15 = i14 | i6;
        if (rv4Var.f(lu4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i16 = i15 | i7;
        if (rv4Var.h(xt4Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i8;
        if (rv4Var.h(xt4Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i18 = i17 | i9;
        if (rv4Var.f(nq7Var)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i19 = i18 | i10;
        boolean z10 = true;
        if ((i19 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i19 & 1, z)) {
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            if (P == obj3) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            yya yyaVar = (yya) rv4Var.j(ki8.f);
            boolean f2 = rv4Var.f(yyaVar);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj3) {
                P2 = new xk6(yyaVar, 8);
                rv4Var.o0(P2);
            }
            vt4 vt4Var2 = (vt4) P2;
            Integer valueOf = Integer.valueOf(i);
            boolean f3 = rv4Var.f(vt4Var2);
            int i20 = i19 & Token.ASSIGN_MOD;
            if (i20 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z11 = f3 | z2;
            int i21 = i19 & 14;
            if (i21 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z12 = z11 | z3;
            if ((3670016 & i19) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z12 | z4;
            if ((458752 & i19) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean h = z13 | z5 | rv4Var.h(m82Var);
            if ((57344 & i19) != 16384) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z14 = h | z6;
            Object P3 = rv4Var.P();
            if (!z14 && P3 != obj3) {
                obj2 = P3;
                vt4Var = vt4Var2;
                i11 = 2048;
                obj = obj3;
            } else {
                obj = obj3;
                i11 = 2048;
                Object jr8Var = new jr8(vt4Var2, sk8Var, i, xt4Var2, xt4Var, m82Var, lu4Var);
                vt4Var = vt4Var2;
                rv4Var.o0(jr8Var);
                obj2 = jr8Var;
            }
            nq7 b2 = dab.b(nq7Var, valueOf, (PointerInputEventHandler) obj2);
            if (i20 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i21 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z15 = z7 | z8;
            if ((i19 & 896) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z16 = z15 | z9;
            if ((i19 & 7168) != i11) {
                z10 = false;
            }
            boolean f4 = z16 | z10 | rv4Var.f(vt4Var);
            Object P4 = rv4Var.P();
            if (f4 || P4 == obj) {
                P4 = new xt4() { // from class: er8
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj4) {
                        pr8 pr8Var;
                        float f5;
                        float f6;
                        ak3 ak3Var = (ak3) obj4;
                        ak3Var.getClass();
                        sk8 sk8Var2 = sk8.this;
                        if (sk8Var2.f() && sk8Var2.c() == i) {
                            for (pr8 pr8Var2 : sk8Var2.b()) {
                                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * pr8Var2.a;
                                float f7 = pr8Var2.b;
                                ak3.R0(ak3Var, j, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * f7) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * (pr8Var2.c - pr8Var2.a)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * (pr8Var2.d - f7)) & 4294967295L), nae.e, null, 0, 120);
                            }
                            float floatValue = ((Number) vt4Var.invoke()).floatValue();
                            if (floatValue < 0.01f) {
                                floatValue = 0.01f;
                            }
                            List b3 = sk8Var2.b();
                            pr8 pr8Var3 = (pr8) sl1.e0(b3);
                            if (pr8Var3 != null && (pr8Var = (pr8) sl1.k0(b3)) != null) {
                                float L0 = ak3Var.L0(2.0f) / floatValue;
                                float L02 = ak3Var.L0(6.0f) / floatValue;
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * pr8Var3.a) - L0;
                                if (intBitsToFloat2 < nae.e) {
                                    f5 = 0.0f;
                                } else {
                                    f5 = intBitsToFloat2;
                                }
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * pr8Var3.b;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * pr8Var3.d;
                                long j3 = j2;
                                ak3.R0(ak3Var, j3, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat4 - intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(L0) << 32), nae.e, null, 0, 120);
                                float f8 = L0 / 2.0f;
                                ak3.D0(ak3Var, j3, L02, (Float.floatToRawIntBits(f5 + f8) << 32) | (Float.floatToRawIntBits(intBitsToFloat3 - L02) & 4294967295L), nae.e, null, 120);
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * pr8Var.c;
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - L0;
                                if (intBitsToFloat5 > intBitsToFloat6) {
                                    f6 = intBitsToFloat6;
                                } else {
                                    f6 = intBitsToFloat5;
                                }
                                float intBitsToFloat7 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * pr8Var.b;
                                float intBitsToFloat8 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * pr8Var.d;
                                ak3.R0(ak3Var, j3, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat8 - intBitsToFloat7) & 4294967295L) | (Float.floatToRawIntBits(L0) << 32), nae.e, null, 0, 120);
                                ak3.D0(ak3Var, j3, L02, (Float.floatToRawIntBits(f6 + f8) << 32) | (Float.floatToRawIntBits(intBitsToFloat8 + L02) & 4294967295L), nae.e, null, 120);
                            }
                        }
                        return pvc.a;
                    }
                };
                rv4Var.o0(P4);
            }
            bce.a(b2, (xt4) P4, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new hj4(i, sk8Var, j, j2, lu4Var, xt4Var, xt4Var2, nq7Var, i2);
        }
    }

    public static final void b(rlc rlcVar, boolean z, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, xt4 xt4Var3, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
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
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        lk0 lk0Var = kh5.I;
        rv4Var2.g0(1761650853);
        if ((i & 6) == 0) {
            if (rv4Var2.f(rlcVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.g(z)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((i2 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            nq7 C = rte.C(c16.g(nq7Var.a0(pna.c), null, 3), rte.u(rv4Var2), 14);
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
            int i13 = i2;
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, zbe.x(kq7Var, rh8Var));
            nq7 k = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var2).d);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k);
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
            boolean z5 = rlcVar.a;
            float f2 = 1.0f;
            l0e.n(null, yqe.A((y3b) f3b.z0.getValue(), rv4Var2), yqe.A((y3b) f3b.A0.getValue(), rv4Var2), nk2.g(rv4Var2, 1.0f, tte.k(kq7Var, r0f.z(rv4Var2).a), ba5Var, 16.0f), false, z5, xt4Var, rv4Var2, (i13 << 6) & 3670016, 17);
            rv4Var2 = rv4Var2;
            if (z5) {
                s21.w(rv4Var2, -1784269791, kq7Var, 4.0f, rv4Var2);
                l0e.j(yqe.A((y3b) f3b.C0.getValue(), rv4Var2), cqe.m((q3b) nz.t.getValue(), rv4Var2), rlcVar.b, nk2.g(rv4Var2, 1.0f, tte.k(kq7Var, r0f.z(rv4Var2).a), ba5Var, 16.0f), xt4Var2, rv4Var2, (i13 >> 3) & 57344);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1783616311);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            if (z5) {
                s21.w(rv4Var2, 482282638, kq7Var, 12.0f, rv4Var2);
                cvb.c(yqe.A((y3b) f3b.B0.getValue(), rv4Var2), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 48, 0, 131064);
                rv4Var2 = rv4Var;
                nq7 k2 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var2).d);
                xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, k2);
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
                l0e.l(null, yqe.A((y3b) f3b.D0.getValue(), rv4Var2), yqe.A((y3b) f3b.E0.getValue(), rv4Var2), nk2.g(rv4Var2, 1.0f, tte.k(kq7Var, r0f.z(rv4Var2).a), ba5Var, 16.0f), vt4Var, rv4Var2, (i13 >> 6) & 57344, 1);
                rv4Var2.e0(791628423);
                List list = rlcVar.c;
                int size = list.size();
                int i14 = 0;
                while (i14 < size) {
                    tmc tmcVar = (tmc) list.get(i14);
                    xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
                    tza tzaVar = j27.a;
                    int i15 = i14;
                    nq7 v = nmd.v(tte.k(kq7Var, ((h27) rv4Var2.j(tzaVar)).c.a), rm1.g(((h27) rv4Var2.j(tzaVar)).a, f2), ba5Var);
                    if ((i13 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean h = z4 | rv4Var2.h(tmcVar);
                    Object P = rv4Var2.P();
                    if (h || P == ax1.a) {
                        P = new a0b(22, xt4Var3, tmcVar);
                        rv4Var2.o0(P);
                    }
                    nq7 y = zbe.y(lbe.f(15, (vt4) P, v, null, false), 16.0f);
                    gv9 a5 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                    int hashCode4 = Long.hashCode(rv4Var2.T);
                    xt8 l4 = rv4Var2.l();
                    nq7 p4 = lye.p(rv4Var2, y);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    np npVar5 = qw1.f;
                    jce.F(npVar5, rv4Var2, a5);
                    np npVar6 = qw1.e;
                    jce.F(npVar6, rv4Var2, l4);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    np npVar7 = qw1.g;
                    jce.F(npVar7, rv4Var2, valueOf2);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var2);
                    np npVar8 = qw1.d;
                    jce.F(npVar8, rv4Var2, p4);
                    List list2 = list;
                    String str = tmcVar.a;
                    String str2 = tmcVar.c;
                    int i16 = size;
                    ba5 ba5Var2 = ba5Var;
                    do5.a(new h54(0L, str, ""), null, false, null, null, null, tte.k(pna.n(kq7Var, 24.0f), uu9.a), null, rv4Var, 805306368, 382);
                    we6 d2 = rs8.d(kq7Var, 8.0f, rv4Var, 1.0f, true);
                    xn1 a6 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode5 = Long.hashCode(rv4Var.T);
                    xt8 l5 = rv4Var.l();
                    nq7 p5 = lye.p(rv4Var, d2);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var2);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar5, rv4Var, a6);
                    jce.F(npVar6, rv4Var, l5);
                    s21.t(hashCode5, rv4Var, npVar7, rv4Var, kgVar2);
                    jce.F(npVar8, rv4Var, p5);
                    cvb.c(tmcVar.b, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, 0, 24960, 110590);
                    rv4Var2 = rv4Var;
                    if (str2.length() > 0) {
                        rv4Var2.e0(-2075245203);
                        cvb.c(str2, null, zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, 0, 24576, 114682);
                        rv4Var2 = rv4Var;
                        i3 = 0;
                        rv4Var2.q(false);
                    } else {
                        i3 = 0;
                        rv4Var2.e0(-2074906001);
                        rv4Var2.q(false);
                    }
                    s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
                    nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var2, i3), null, pna.n(kq7Var, 24.0f), 0L, rv4Var2, 432, 8);
                    rv4Var2.q(true);
                    i14 = i15 + 1;
                    list = list2;
                    f2 = 1.0f;
                    size = i16;
                    ba5Var = ba5Var2;
                }
                xbe.i(rv4Var2, hl5.e(rv4Var2, false, true, kq7Var, 12.0f));
                if (z) {
                    rv4Var2.e0(485487790);
                    z1d.f(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), yqe.A((y3b) z1b.p.getValue(), rv4Var2), false, null, zbe.z(new l95(kh5.K), 24.0f, 12.0f), null, null, null, vt4Var2, rv4Var, i13 & 234881024, 236);
                    rv4Var2 = rv4Var;
                    z3 = false;
                    rv4Var2.q(false);
                } else {
                    z3 = false;
                    rv4Var2.e0(485875507);
                    rv4Var2.q(false);
                }
                rv4Var2.q(z3);
            } else {
                rv4Var2.e0(485885427);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new pja(rlcVar, z, rh8Var, nq7Var, xt4Var, xt4Var2, vt4Var, xt4Var3, vt4Var2, i);
        }
    }

    public static final void c(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        pb2 pb2Var2;
        cz7Var.getClass();
        rv4Var.g0(-1800641728);
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
                zlc zlcVar = (zlc) ((fdd) voe.z(cm9.a(zlc.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
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
                    q0a a3 = o96.a(rv4Var);
                    cz7Var2 = cz7Var;
                    fxe.h(yqe.A((y3b) o3b.W.getValue(), rv4Var), pna.c, false, jce.E(84703932, new ebc(cz7Var, 2), rv4Var), null, null, jce.E(-903858869, new q7(zlcVar, cz7Var, jsc.z(zlcVar.d, rv4Var), jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var3, a3, null))).f, rv4Var), 5), rv4Var), rv4Var, 1575984, 52);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
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
            u.d = new ebc(cz7Var2, i, 3);
        }
    }

    public static final yq8 d(sk8 sk8Var, float f2, float f3) {
        pr8 pr8Var;
        List b2 = sk8Var.b();
        pr8 pr8Var2 = (pr8) sl1.e0(b2);
        if (pr8Var2 == null || (pr8Var = (pr8) sl1.k0(b2)) == null) {
            return null;
        }
        return new yq8((Float.floatToRawIntBits(((pr8Var2.a + pr8Var2.c) / 2.0f) * f2) << 32) | (Float.floatToRawIntBits(pr8Var2.b * f3) & 4294967295L), (Float.floatToRawIntBits(((pr8Var.a + pr8Var.c) / 2.0f) * f2) << 32) | (Float.floatToRawIntBits(pr8Var.d * f3) & 4294967295L));
    }

    public static final long e(int i, int i2, mkc mkcVar) {
        boolean z;
        bu5 bu5Var;
        if (i == -1) {
            return (i2 << 32) | 4294967295L;
        }
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        long g = mkcVar.g(i);
        long i3 = mkcVar.i(g);
        if (fxb.d(g) && fxb.d(i3)) {
            bu5Var = bu5.a;
        } else if (!fxb.d(g) && !fxb.d(i3)) {
            bu5Var = bu5.c;
        } else if (fxb.d(g) && !fxb.d(i3)) {
            bu5Var = bu5.b;
        } else {
            bu5Var = bu5.d;
        }
        int ordinal = bu5Var.ordinal();
        eid eidVar = eid.b;
        eid eidVar2 = eid.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return (i << 32) | 4294967295L;
                    }
                    xk5.o();
                    return 0L;
                } else if (z) {
                    return cae.s((int) (i3 & 4294967295L), eidVar2);
                } else {
                    return cae.s((int) (i3 >> 32), eidVar);
                }
            } else if (z) {
                if (i == ((int) (i3 >> 32))) {
                    return cae.s(i, eidVar2);
                }
                return cae.s((int) (i3 & 4294967295L), eidVar);
            } else if (i == ((int) (i3 & 4294967295L))) {
                return cae.s(i, eidVar);
            } else {
                return cae.s((int) (i3 >> 32), eidVar2);
            }
        }
        if (z) {
            eidVar = eidVar2;
        }
        return cae.s(i, eidVar);
    }

    public static int f(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new z48(context).b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        xk5.k("permission must be non-null");
        return 0;
    }

    public static final float g(long j, long j2) {
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) + Math.abs(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static final s76 h(Collection collection, wf2 wf2Var) {
        Collection<Object> collection2 = collection;
        ArrayList a0 = sl1.a0(collection2);
        ArrayList arrayList = new ArrayList(tl1.s(a0, 10));
        int size = a0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = a0.get(i2);
            i2++;
            arrayList.add(n(obj, wf2Var));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (hashSet.add(((s76) obj2).e().a())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
            int size3 = arrayList2.size();
            while (i < size3) {
                Object obj3 = arrayList2.get(i);
                i++;
                arrayList3.add(((s76) obj3).e().a());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        s76 s76Var = (s76) sl1.s0(arrayList2);
        if (s76Var == null) {
            s76Var = c4b.a;
        }
        if (!s76Var.e().c() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            for (Object obj4 : collection2) {
                if (obj4 == null) {
                    return wq9.H(s76Var);
                }
            }
        }
        return s76Var;
    }

    public static final int i(int i, int i2, int i3) {
        return (i >>> i2) & ((1 << i3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.un2 j(defpackage.ha8 r38) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eze.j(ha8):un2");
    }

    public static final un2 k(mcb mcbVar) {
        mcbVar.getClass();
        return new un2(mcbVar.a, mcbVar.b, mcbVar.c, mcbVar.d, mcbVar.e, mcbVar.f, mcbVar.g, mcbVar.h, mcbVar.i, mcbVar.j, mcbVar.k, mcbVar.l, mcbVar.m, mcbVar.n, mcbVar.o, mcbVar.p, mcbVar.q, mcbVar.r, mcbVar.s, mcbVar.t, mcbVar.u, mcbVar.v, mcbVar.w, mcbVar.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList l(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            jr9 r1 = new jr9
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.kr9.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.kr9.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            ir9 r5 = (defpackage.ir9) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.kr9.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.nn1.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.kr9.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.kr9.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            ir9 r0 = new ir9     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eze.l(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final s76 n(Object obj, wf2 wf2Var) {
        wf2Var.getClass();
        if (obj == null) {
            return wq9.H(c4b.a);
        }
        if (obj instanceof List) {
            return new sz(h((Collection) obj, wf2Var), 0);
        }
        if (obj instanceof Object[]) {
            Object n0 = b00.n0((Object[]) obj);
            if (n0 != null) {
                return n(n0, wf2Var);
            }
            return new sz(c4b.a, 0);
        } else if (obj instanceof Set) {
            return new sz(h((Collection) obj, wf2Var), 2);
        } else {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new b45(h(map.keySet(), wf2Var), h(map.values(), wf2Var), 1);
            }
            s76 g = wf2.g(wf2Var, cm9.a(obj.getClass()));
            if (g == null) {
                gi1 a2 = cm9.a(obj.getClass());
                s76 j = sze.j(a2);
                if (j != null) {
                    return j;
                }
                q1d.s(a2);
                throw null;
            }
            return g;
        }
    }

    public static final int o(int i, int i2, int i3, int i4) {
        int i5 = (1 << i4) - 1;
        return (i & (~(i5 << i3))) | ((i2 & i5) << i3);
    }

    public static Intent p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return ay5.r(context, broadcastReceiver, intentFilter);
        }
        if (i >= 26) {
            return h50.u(context, broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.s76 r(defpackage.wf2 r11, defpackage.isc r12) {
        /*
            r11.getClass()
            r12.getClass()
            gi1 r0 = r12.a
            t76 r12 = r12.b
            r1 = 1
            r2 = 0
            if (r12 == 0) goto Lc1
            java.util.List r3 = r12.b()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1b
        L18:
            r4 = r2
            goto Lbe
        L1b:
            r3 = 0
            s76 r4 = defpackage.q0f.p(r11, r12, r3)
            if (r4 != 0) goto Lbe
            java.util.List r4 = r12.b()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r4.next()
            w76 r6 = (defpackage.w76) r6
            t76 r6 = r6.b     // Catch: java.lang.Exception -> L53
            if (r6 == 0) goto L46
            s76 r7 = defpackage.q0f.p(r11, r6, r3)     // Catch: java.lang.Exception -> L53
            if (r7 != 0) goto L46
            goto L47
        L46:
            r6 = r2
        L47:
            if (r6 == 0) goto L2f
            r5.add(r6)
            goto L2f
        L4d:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L54
        L53:
            goto L18
        L54:
            j9a r9 = new j9a
            r9.<init>(r1)
            r10 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r11 = defpackage.sl1.i0(r5, r6, r7, r8, r9, r10)
            int r12 = r5.size()
            if (r12 != r1) goto L72
            yk8 r12 = new yk8
            java.lang.String r1 = ""
            java.lang.String r2 = "is"
            r12.<init>(r1, r2)
            goto L7b
        L72:
            yk8 r12 = new yk8
            java.lang.String r1 = "s"
            java.lang.String r2 = "are"
            r12.<init>(r1, r2)
        L7b:
            java.lang.Object r1 = r12.a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r12 = r12.b
            java.lang.String r12 = (java.lang.String) r12
            v9a r2 = new v9a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Serializer for type argument"
            r3.<init>(r4)
            r3.append(r1)
            r4 = 32
            r3.append(r4)
            r3.append(r11)
            r3.append(r4)
            r3.append(r12)
            java.lang.String r11 = " not found for '"
            r3.append(r11)
            java.lang.String r11 = r0.g()
            r3.append(r11)
            java.lang.String r11 = "'. Ensure that the listed type"
            r3.append(r11)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r11 = " marked as '@Serializable'."
            java.lang.String r11 = defpackage.s21.q(r3, r12, r11)
            r2.<init>(r11)
            throw r2
        Lbe:
            if (r4 == 0) goto Lc1
            goto Le8
        Lc1:
            s76 r11 = defpackage.wf2.g(r11, r0)
            if (r11 == 0) goto Ld5
            if (r12 == 0) goto Ld3
            boolean r12 = r12.a()
            if (r12 != r1) goto Ld3
            s76 r11 = defpackage.wq9.H(r11)
        Ld3:
            r4 = r11
            goto Le8
        Ld5:
            s76 r11 = defpackage.sze.j(r0)
            if (r11 == 0) goto Le9
            if (r12 == 0) goto Ld3
            boolean r12 = r12.a()
            if (r12 != r1) goto Ld3
            s76 r11 = defpackage.wq9.H(r11)
            goto Ld3
        Le8:
            return r4
        Le9:
            defpackage.q1d.s(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eze.r(wf2, isc):s76");
    }

    public static void s(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            h50.D(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final zx5 t(Instant instant) {
        zx5 zx5Var = zx5.c;
        return bze.l(instant.getEpochSecond(), instant.getNano());
    }

    public static void u(int i, int i2) {
        String r;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                vs.m(a82.j(i2, "negative size: "));
                return;
            }
            r = sze.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            r = sze.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(r);
    }

    public static void v(int i, int i2, int i3) {
        String w;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                w = sze.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                w = w(i2, i3, "end index");
            }
        } else {
            w = w(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(w);
    }

    public static String w(int i, int i2, String str) {
        if (i < 0) {
            return sze.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return sze.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        vs.m(a82.j(i2, "negative size: "));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [qoc, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v8, types: [qoc, x1, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gca, x1, java.lang.Object] */
    public static x1 x(Context context, Callable callable, Executor executor) {
        g99 g99Var = new g99(callable, 22);
        if (y(context)) {
            ?? obj = new Object();
            obj.E = new poc((qoc) obj, g99Var);
            executor.execute(obj);
            return obj;
        }
        ?? obj2 = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        zye zyeVar = new zye(atomicBoolean, context, obj2, g99Var, executor);
        context.registerReceiver(zyeVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (y(context) && atomicBoolean.compareAndSet(false, true)) {
            try {
                context.unregisterReceiver(zyeVar);
            } catch (IllegalArgumentException e2) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
            }
            ?? obj3 = new Object();
            obj3.E = new poc((qoc) obj3, g99Var);
            executor.execute(obj3);
            obj2.n(obj3);
            return obj2;
        }
        obj2.a(new sid(obj2, atomicBoolean, context, zyeVar, 5), e73.a);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(android.content.Context r7) {
        /*
            boolean r0 = defpackage.eze.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<eze> r0 = defpackage.eze.class
            monitor-enter(r0)
            boolean r2 = defpackage.eze.b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L54
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L4a
            android.os.UserManager r3 = defpackage.eze.a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            defpackage.eze.a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = defpackage.eze.a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            r5 = r1
            goto L4e
        L2b:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r6 != 0) goto L3b
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r7 != 0) goto L4a
        L3b:
            r5 = r1
            goto L4a
        L3d:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            defpackage.eze.a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L4a:
            if (r5 == 0) goto L4e
            defpackage.eze.a = r4     // Catch: java.lang.Throwable -> Lf
        L4e:
            if (r5 == 0) goto L52
            defpackage.eze.b = r1     // Catch: java.lang.Throwable -> Lf
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eze.y(android.content.Context):boolean");
    }

    public abstract Member m();

    public /* synthetic */ void q() {
        if (f97.a(m())) {
            return;
        }
        hfd.h(this, "\" accessible. Please check if the member is accessible or if the security manager allows it.", "Failed to make the member \"");
    }
}
