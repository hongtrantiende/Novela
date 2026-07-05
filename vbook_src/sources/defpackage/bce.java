package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bce  reason: default package */
/* loaded from: classes3.dex */
public abstract class bce {
    public static final tu1 a = new tu1(new sv1(8), false, -1575188201);
    public static final tu1 b = new tu1(new sv1(9), false, 366916411);
    public static final tu1 c = new tu1(new sv1(10), false, 2076254111);
    public static final tu1 d = new tu1(new tv1(3), false, 172976442);
    public static final tu1 e = new tu1(new tv1(4), false, -591639007);
    public static final tu1 f = new tu1(new tv1(5), false, 1833021911);
    public static final tu1 g = new tu1(new tv1(6), false, 1425998425);

    public static final void a(nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-932836462);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            xbe.i(rv4Var, ote.r(nq7Var, xt4Var));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p61(nq7Var, xt4Var, i);
        }
    }

    public static final void b(final int i, final int i2, cz7 cz7Var, nq7 nq7Var, final long j, final long j2, final String str, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i10;
        pb2 pb2Var;
        List list;
        char c2;
        Object obj;
        aw7 aw7Var;
        final wm0 wm0Var;
        boolean z7;
        boolean z8;
        boolean z9;
        y3b y3bVar;
        cz7Var.getClass();
        rv4Var.g0(-1453729566);
        if (rv4Var.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i11 = i3 | i4;
        if (rv4Var.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i12 = i11 | i5;
        if (rv4Var.f(cz7Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i13 = i12 | i6 | 3072;
        if (rv4Var.e(j)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (rv4Var.e(j2)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i8;
        if (rv4Var.f(str)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((i16 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i16 & 1, z)) {
            String str2 = "comment_editor_" + i + "_" + j;
            if ((i16 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i16 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z10 = z3 | z2;
            if ((57344 & i16) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z11 = z10 | z4;
            if ((458752 & i16) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z12 = z11 | z5;
            if ((3670016 & i16) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z13 = z12 | z6;
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (!z13 && P != obj2) {
                i10 = i16;
            } else {
                i10 = i16;
                Object obj3 = new vt4() { // from class: xp1
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        return jye.u(Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2), str);
                    }
                };
                rv4Var.o0(obj3);
                P = obj3;
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(fq1.class);
                fq1 fq1Var = (fq1) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str2), pb2Var2, a3, vt4Var));
                aw7 z14 = jsc.z(fq1Var.E, rv4Var);
                int i17 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i17 >= 0) {
                    rv4Var.e0(-1901730275);
                    rv4Var.q(false);
                    list = ((eq1) z14.getValue()).d;
                } else {
                    rv4Var.e0(-1901688735);
                    Object P2 = rv4Var.P();
                    if (P2 == obj2) {
                        P2 = tl1.A(new xl0(hre.q().toString(), en0.a, new cm0("", ks3.a)));
                        rv4Var.o0(P2);
                    }
                    list = (List) P2;
                    rv4Var.q(false);
                }
                kq7 kq7Var2 = kq7.a;
                if (list == null) {
                    rv4Var.e0(-1901588357);
                    fxe.h(yqe.A((y3b) k2b.e.getValue(), rv4Var), pna.c, false, jce.E(2024088505, new p7(cz7Var, 8), rv4Var), null, null, r1d.b, rv4Var, 1575936, 52);
                    rv4Var.q(false);
                    ek9 u = rv4Var.u();
                    if (u != null) {
                        u.d = new bq1(i, i2, cz7Var, kq7Var2, j, j2, str, i3, 0);
                        return;
                    }
                    return;
                }
                rv4Var.e0(-1901245280);
                rv4Var.q(false);
                final uo3 o = uwe.o(list, rv4Var);
                Object P3 = rv4Var.P();
                if (P3 == obj2) {
                    P3 = new ym0();
                    rv4Var.o0(P3);
                }
                final ym0 ym0Var = (ym0) P3;
                Object P4 = rv4Var.P();
                if (P4 == obj2) {
                    P4 = new wm0();
                    rv4Var.o0(P4);
                }
                wm0 wm0Var2 = (wm0) P4;
                boolean f2 = rv4Var.f(o);
                Object P5 = rv4Var.P();
                if (f2 || P5 == obj2) {
                    P5 = new zua(new m0(1, o, uo3.class, "dispatch", "dispatch(Lio/github/linreal/cascade/editor/action/EditorAction;)V", 0, 28), ym0Var, wm0Var2, o);
                    rv4Var.o0(P5);
                }
                final zua zuaVar = (zua) P5;
                Object P6 = rv4Var.P();
                if (P6 == obj2) {
                    rm0 m = qwe.m();
                    c2 = 4;
                    dxe.B(m, true, new ln1(7));
                    rv4Var.o0(m);
                    obj = m;
                } else {
                    c2 = 4;
                    obj = P6;
                }
                final rm0 rm0Var = (rm0) obj;
                mu4 k = fa3.k(rv4Var);
                boolean f3 = rv4Var.f(k);
                Object P7 = rv4Var.P();
                if (f3 || P7 == obj2) {
                    P7 = new q71(k, 31);
                    rv4Var.o0(P7);
                }
                final q71 q71Var = (q71) P7;
                Object P8 = rv4Var.P();
                if (P8 == obj2) {
                    P8 = yte.s(rv4Var);
                    rv4Var.o0(P8);
                }
                m82 m82Var = (m82) P8;
                bsa bsaVar = (bsa) rv4Var.j(dy1.q);
                f99 f99Var = dy1.h;
                int X0 = ((r13) rv4Var.j(f99Var)).X0(300.0f);
                boolean f4 = rv4Var.f(m82Var) | rv4Var.f(bsaVar);
                Object P9 = rv4Var.P();
                if (f4 || P9 == obj2) {
                    P9 = new z86(X0, m82Var, bsaVar);
                    rv4Var.o0(P9);
                }
                final z86 z86Var = (z86) P9;
                boolean f5 = rv4Var.f(o);
                Object P10 = rv4Var.P();
                if (f5 || P10 == obj2) {
                    P10 = new w71(o, 2);
                    rv4Var.o0(P10);
                }
                kd4 v = w92.v(av8.a, (xt4) P10, rv4Var, 6);
                boolean g2 = rv4Var.g(z86Var.e()) | rv4Var.f(v);
                Object P11 = rv4Var.P();
                if (!g2 && P11 != obj2) {
                    aw7Var = z14;
                    wm0Var = wm0Var2;
                } else {
                    tva[] tvaVarArr = new tva[7];
                    tvaVarArr[0] = hva.a;
                    tvaVarArr[1] = ova.a;
                    tvaVarArr[2] = rva.a;
                    tvaVarArr[3] = qva.a;
                    tvaVarArr[c2] = lva.a;
                    tvaVarArr[5] = fa3.a;
                    tvaVarArr[6] = fa3.b;
                    aw7Var = z14;
                    wm0Var = wm0Var2;
                    P11 = new tfc(tl1.B(tvaVarArr), new tu1(new cq1(o, z86Var, v, 0), true, 1346569973));
                    rv4Var.o0(P11);
                }
                final tfc tfcVar = (tfc) P11;
                WeakHashMap weakHashMap = yjd.w;
                rp rpVar = h88.n(rv4Var).c;
                r13 r13Var = (r13) rv4Var.j(f99Var);
                aw7 D = yae.D(Integer.valueOf(rpVar.e().d), rv4Var);
                boolean f6 = rv4Var.f(D) | rv4Var.f(z86Var);
                Object P12 = rv4Var.P();
                if (!f6 && P12 != obj2) {
                    z7 = true;
                } else {
                    z7 = true;
                    P12 = new ue1(D, z86Var, null, 1);
                    rv4Var.o0(P12);
                }
                yte.g((lu4) P12, rv4Var, pvc.a);
                if (!z86Var.d() && !z86Var.e()) {
                    z8 = false;
                } else {
                    z8 = z7;
                }
                boolean f7 = rv4Var.f(z86Var);
                Object P13 = rv4Var.P();
                if (f7 || P13 == obj2) {
                    P13 = new je1(z86Var, 3);
                    rv4Var.o0(P13);
                }
                sf0.a(z8, (vt4) P13, rv4Var, 0, 0);
                s02 s02Var = fq1Var.F;
                if ((i10 & 896) == 256) {
                    z9 = z7;
                } else {
                    z9 = false;
                }
                Object P14 = rv4Var.P();
                if (z9 || P14 == obj2) {
                    P14 = new u7(cz7Var, (m42) null, 2);
                    rv4Var.o0(P14);
                }
                jye.b(s02Var, null, (mu4) P14, rv4Var, 0);
                final boolean j3 = fa3.j(o, ym0Var, rv4Var);
                ze4 ze4Var = pna.c;
                if (i17 >= 0) {
                    y3bVar = (y3b) k2b.e.getValue();
                } else {
                    y3bVar = (y3b) k2b.d.getValue();
                }
                fxe.h(yqe.A(y3bVar, rv4Var), ze4Var, true, jce.E(31414878, new p7(cz7Var, 9), rv4Var), jce.E(-158868537, new xsa(1, fq1Var, o, aw7Var, j3), rv4Var), null, jce.E(-1421658259, new nu4() { // from class: dq1
                    @Override // defpackage.nu4
                    public final Object h(Object obj4, Object obj5, Object obj6, Object obj7) {
                        boolean z15;
                        nk0 nk0Var;
                        uo3 uo3Var;
                        kq7 kq7Var3;
                        float f8;
                        zx1 zx1Var;
                        boolean z16;
                        int i18;
                        rh8 rh8Var = (rh8) obj5;
                        rv4 rv4Var2 = (rv4) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        ((ou0) obj4).getClass();
                        rh8Var.getClass();
                        if ((intValue & 48) == 0) {
                            if (rv4Var2.f(rh8Var)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            intValue |= i18;
                        }
                        if ((intValue & Token.TARGET) != 144) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rv4Var2.U(intValue & 1, z15)) {
                            ze4 ze4Var2 = pna.c;
                            nq7 x = zbe.x(ze4Var2, rh8Var);
                            xn1 a5 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                            int hashCode = Long.hashCode(rv4Var2.T);
                            xt8 l = rv4Var2.l();
                            nq7 p = lye.p(rv4Var2, x);
                            rw1.k.getClass();
                            zx1 zx1Var2 = qw1.b;
                            rv4Var2.i0();
                            if (rv4Var2.S) {
                                rv4Var2.k(zx1Var2);
                            } else {
                                rv4Var2.r0();
                            }
                            np npVar = qw1.f;
                            jce.F(npVar, rv4Var2, a5);
                            np npVar2 = qw1.e;
                            jce.F(npVar2, rv4Var2, l);
                            Integer valueOf = Integer.valueOf(hashCode);
                            np npVar3 = qw1.g;
                            jce.F(npVar3, rv4Var2, valueOf);
                            kg kgVar = qw1.h;
                            jce.C(kgVar, rv4Var2);
                            np npVar4 = qw1.d;
                            jce.F(npVar4, rv4Var2, p);
                            e81 u2 = ape.u(rv4Var2);
                            nq7 f9 = pna.f(new we6(1.0f, true), 1.0f);
                            nk0 nk0Var2 = kh5.a;
                            b37 d2 = fu0.d(nk0Var2, false);
                            int hashCode2 = Long.hashCode(rv4Var2.T);
                            xt8 l2 = rv4Var2.l();
                            nq7 p2 = lye.p(rv4Var2, f9);
                            rv4Var2.i0();
                            if (rv4Var2.S) {
                                rv4Var2.k(zx1Var2);
                            } else {
                                rv4Var2.r0();
                            }
                            jce.F(npVar, rv4Var2, d2);
                            jce.F(npVar2, rv4Var2, l2);
                            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                            jce.F(npVar4, rv4Var2, p2);
                            c81 m2 = xoe.m(rv4Var2);
                            o71 l3 = xoe.l(rv4Var2);
                            nq7 z17 = zbe.z(ze4Var2, 8.0f, 8.0f);
                            uo3 uo3Var2 = uo3.this;
                            b81.a(uo3Var2, ym0Var, wm0Var, rm0Var, null, null, u2, m2, l3, z17, tfcVar, null, q71Var, null, rv4Var2, 805310896, 47152);
                            rv4 rv4Var3 = rv4Var2;
                            boolean z18 = j3;
                            kq7 kq7Var4 = kq7.a;
                            if (z18) {
                                rv4Var3.e0(-1600423959);
                                uo3Var = uo3Var2;
                                nk0Var = nk0Var2;
                                kq7Var3 = kq7Var4;
                                cvb.c(yqe.A((y3b) k2b.c.getValue(), rv4Var3), zbe.z(kq7Var4, 24.0f, 10.0f), ((h27) rv4Var3.j(j27.a)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u2.b.a, rv4Var3, 48, 0, 131064);
                                rv4Var3 = rv4Var3;
                                rv4Var3.q(false);
                            } else {
                                nk0Var = nk0Var2;
                                uo3Var = uo3Var2;
                                kq7Var3 = kq7Var4;
                                rv4Var3.e0(-1600083207);
                                rv4Var3.q(false);
                            }
                            rv4Var3.q(true);
                            float f10 = mwe.f(15, rv4Var3, false).d;
                            r13 r13Var2 = (r13) rv4Var3.j(dy1.h);
                            z86 z86Var2 = z86Var;
                            if (z86Var2.e()) {
                                f8 = r13Var2.y0(((Number) z86Var2.g.getValue()).intValue());
                            } else if (z86Var2.d()) {
                                f8 = r13Var2.y0(z86Var2.c());
                            } else {
                                f8 = f10;
                            }
                            nq7 h = pna.h(pna.f(kq7Var3, 1.0f), ((rg3) hxe.s(new rg3(f8), new rg3(f10))).a);
                            nk0 nk0Var3 = nk0Var;
                            b37 d3 = fu0.d(nk0Var3, false);
                            int hashCode3 = Long.hashCode(rv4Var3.T);
                            xt8 l4 = rv4Var3.l();
                            nq7 p3 = lye.p(rv4Var3, h);
                            rv4Var3.i0();
                            if (rv4Var3.S) {
                                zx1Var = zx1Var2;
                                rv4Var3.k(zx1Var);
                            } else {
                                zx1Var = zx1Var2;
                                rv4Var3.r0();
                            }
                            jce.F(npVar, rv4Var3, d3);
                            jce.F(npVar2, rv4Var3, l4);
                            s21.t(hashCode3, rv4Var3, npVar3, rv4Var3, kgVar);
                            jce.F(npVar4, rv4Var3, p3);
                            if (z86Var2.e()) {
                                rv4Var3.e0(-266382305);
                                nq7 z19 = zbe.z(ze4Var2, 8.0f, 8.0f);
                                tza tzaVar = j27.a;
                                nq7 v2 = nmd.v(tte.k(z19, ((h27) rv4Var3.j(tzaVar)).c.d), rm1.g(((h27) rv4Var3.j(tzaVar)).a, 4.0f), lre.g);
                                b37 d4 = fu0.d(nk0Var3, false);
                                int hashCode4 = Long.hashCode(rv4Var3.T);
                                xt8 l5 = rv4Var3.l();
                                nq7 p4 = lye.p(rv4Var3, v2);
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(npVar, rv4Var3, d4);
                                jce.F(npVar2, rv4Var3, l5);
                                s21.t(hashCode4, rv4Var3, npVar3, rv4Var3, kgVar);
                                jce.F(npVar4, rv4Var3, p4);
                                uo3 uo3Var3 = uo3Var;
                                boolean f11 = rv4Var3.f(uo3Var3);
                                zua zuaVar2 = zuaVar;
                                boolean f12 = f11 | rv4Var3.f(zuaVar2);
                                Object P15 = rv4Var3.P();
                                Object obj8 = ax1.a;
                                if (f12 || P15 == obj8) {
                                    P15 = new yp1(uo3Var3, zuaVar2, 0);
                                    rv4Var3.o0(P15);
                                }
                                xt4 xt4Var = (xt4) P15;
                                Object P16 = rv4Var3.P();
                                if (P16 == obj8) {
                                    P16 = new cd1(15);
                                    rv4Var3.o0(P16);
                                }
                                fxe.c(3120, (vt4) P16, xt4Var, rv4Var3, ze4Var2, null);
                                z16 = true;
                                rv4Var3.q(true);
                                rv4Var3.q(false);
                            } else {
                                z16 = true;
                                rv4Var3.e0(-265549118);
                                rv4Var3.q(false);
                            }
                            rv4Var3.q(z16);
                            rv4Var3.q(z16);
                        } else {
                            rv4Var2.X();
                        }
                        return pvc.a;
                    }
                }, rv4Var), rv4Var, 1600896, 32);
                kq7Var = kq7Var2;
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new bq1(i, i2, cz7Var, kq7Var, j, j2, str, i3, 1);
        }
    }

    public static final void c(List list, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        lu4Var.getClass();
        rv4Var.g0(2039854712);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(lu4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            tu1 E = jce.E(-1978558349, new yw4(list, lu4Var, 1), rv4Var);
            lh9 lh9Var = lz.e;
            s9e.f(nq7Var, lh9Var, lh9Var, null, 0, 0, E, rv4Var, 1573302);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(list, nq7Var, lu4Var, i, 19);
        }
    }

    public static final void d(boolean z, int i, int i2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(476098755);
        if (rv4Var.g(z)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i3 | i4;
        if (rv4Var.d(i)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i9 | i5;
        if (rv4Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(xt4Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i12 = i11 | i7;
        if (rv4Var.h(xt4Var2)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i13 = i12 | i8;
        boolean z3 = false;
        if ((i13 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i13 & 1, z2)) {
            int i14 = i13 & 14;
            if (i14 == 4) {
                z3 = true;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                int i15 = i + 1;
                String valueOf = String.valueOf(i15);
                int length = String.valueOf(i15).length();
                P = yae.z(new jub(valueOf, sze.a(length, length), 4));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            xb.d(z, xt4Var, jce.E(-841839081, new qu0(xt4Var, xt4Var2, aw7Var, i2, i, 5), rv4Var), null, mwe.x(kq7.a, 14), jce.E(1440735002, new gk7(i, xt4Var, aw7Var), rv4Var), zr1.c, null, 0L, 0L, nae.e, false, false, jce.E(-2027104657, new tm5(aw7Var, i2, 4), rv4Var), rv4Var, 1769856 | i14 | ((i13 >> 6) & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ak7(z, i, i2, xt4Var, xt4Var2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:356:0x089c, code lost:
        if (r44.h(r1) != false) goto L304;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08b5  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r44v0, types: [rv4] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(int r35, final long r36, final defpackage.jwb r38, final defpackage.cyb r39, final defpackage.j2c r40, final defpackage.sxb r41, final defpackage.ymb r42, final defpackage.nq7 r43, defpackage.rv4 r44, final int r45) {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bce.e(int, long, jwb, cyb, j2c, sxb, ymb, nq7, rv4, int):void");
    }

    public static final void f(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4 rv4Var2 = rv4Var;
        vt4Var.getClass();
        rv4Var2.g0(578525079);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 56.0f));
            ar5 c2 = rp5.c((wk3) jk3.K.getValue(), rv4Var2, 0);
            tza tzaVar = j27.a;
            nk5.a(c2, null, pna.n(kq7Var, 40.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            cvb.c(yqe.A((y3b) o2b.E0.getValue(), rv4Var2), zbe.A(kq7Var, 24.0f, nae.e, 2), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.g, rv4Var2, 48, 0, 130040);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) f2b.l0.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var, (i5 << 21) & 234881024, 252);
            rv4Var2 = rv4Var;
            hl5.w(kq7Var, 56.0f, rv4Var2, true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ai8(nq7Var, vt4Var, i, 0);
        }
    }

    public static final void g(final j0b j0bVar, nq7 nq7Var, final xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        final xt4 xt4Var3 = xt4Var2;
        rv4 rv4Var2 = rv4Var;
        j0bVar.getClass();
        xt4Var.getClass();
        xt4Var3.getClass();
        rv4Var2.g0(-173279987);
        if ((i & 6) == 0) {
            if (rv4Var2.f(j0bVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            int i7 = i2;
            String str = j0bVar.d;
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.g;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), j, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 130040);
            rv4Var2 = rv4Var;
            if (j0bVar.h) {
                rv4Var2.e0(-892206167);
                eg0.f(pna.n(kq7Var, 48.0f), ((h27) rv4Var2.j(tzaVar)).a.q, null, rv4Var2, 6, 4);
                rv4Var2.q(false);
                xt4Var3 = xt4Var2;
            } else if (j0bVar.i) {
                rv4Var2.e0(-891986067);
                rv4Var2.e0(1218154256);
                String str2 = j0bVar.j;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() == 0) {
                    str2 = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
                }
                rv4Var2.q(false);
                cvb.c(str2, zbe.y(kq7Var, 24.0f), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 48, 0, 130040);
                rv4Var2 = rv4Var;
                ar5 c2 = rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0);
                String A = yqe.A((y3b) b3b.B.getValue(), rv4Var2);
                if ((i7 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i8 = i7 & 14;
                if (i8 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z3 | z2;
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (z7 || P == lh9Var) {
                    P = new vt4() { // from class: bi8
                        @Override // defpackage.vt4
                        public final Object invoke() {
                            int i9 = r3;
                            pvc pvcVar = pvc.a;
                            j0b j0bVar2 = j0bVar;
                            xt4 xt4Var4 = xt4Var;
                            switch (i9) {
                                case 0:
                                    xt4Var4.invoke(Integer.valueOf(j0bVar2.e));
                                    return pvcVar;
                                default:
                                    xt4Var4.invoke(j0bVar2.f);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var2.o0(P);
                }
                z1d.f(c2, A, false, null, null, null, null, null, (vt4) P, rv4Var2, 0, 252);
                if (j0bVar.g) {
                    s21.w(rv4Var2, -891360766, kq7Var, 12.0f, rv4Var2);
                    ar5 c3 = rp5.c((wk3) ok3.F.getValue(), rv4Var2, 0);
                    String A2 = yqe.A((y3b) b3b.e.getValue(), rv4Var2);
                    if ((i7 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i8 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z8 = z6 | z5;
                    Object P2 = rv4Var2.P();
                    if (!z8 && P2 != lh9Var) {
                        xt4Var3 = xt4Var2;
                    } else {
                        xt4Var3 = xt4Var2;
                        P2 = new vt4() { // from class: bi8
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i9 = r3;
                                pvc pvcVar = pvc.a;
                                j0b j0bVar2 = j0bVar;
                                xt4 xt4Var4 = xt4Var3;
                                switch (i9) {
                                    case 0:
                                        xt4Var4.invoke(Integer.valueOf(j0bVar2.e));
                                        return pvcVar;
                                    default:
                                        xt4Var4.invoke(j0bVar2.f);
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var2.o0(P2);
                    }
                    z1d.f(c3, A2, false, null, null, null, null, null, (vt4) P2, rv4Var2, 0, 252);
                    z4 = false;
                    rv4Var2.q(false);
                } else {
                    xt4Var3 = xt4Var2;
                    z4 = false;
                    rv4Var2.e0(-891044597);
                    rv4Var2.q(false);
                }
                rv4Var2.q(z4);
            } else {
                xt4Var3 = xt4Var2;
                rv4Var2.e0(-891034677);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x90((Object) j0bVar, nq7Var, (hu4) xt4Var, (hu4) xt4Var3, i, 15);
        }
    }

    public static final void h(int i, mwb mwbVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean h;
        int i5;
        int i6;
        rv4Var.g0(977388203);
        if ((i2 & 6) == 0) {
            if (rv4Var.d(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h = rv4Var.f(mwbVar);
            } else {
                h = rv4Var.h(mwbVar);
            }
            if (h) {
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
        boolean z2 = true;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            String str = mwbVar.b;
            String str2 = mwbVar.c;
            int hashCode = str.hashCode();
            if (hashCode != 104387) {
                if (hashCode != 93166550) {
                    if (hashCode == 112202875 && str.equals("video")) {
                        rv4Var.e0(1790572876);
                        rv4Var.q(false);
                    }
                    rv4Var.e0(1790631063);
                    rv4Var.q(false);
                } else {
                    if (str.equals("audio")) {
                        rv4Var.e0(1790614540);
                        rv4Var.q(false);
                    }
                    rv4Var.e0(1790631063);
                    rv4Var.q(false);
                }
            } else {
                if (str.equals("img")) {
                    rv4Var.e0(1788910656);
                    if ((i3 & 14) != 4) {
                        z2 = false;
                    }
                    boolean f2 = rv4Var.f(str2) | z2;
                    Object P = rv4Var.P();
                    if (f2 || P == ax1.a) {
                        P = new qub(i, str2);
                        rv4Var.o0(P);
                    }
                    do5.b((qub) P, r0f.F, false, am8.a, am8.b, nq7Var, rv4Var, 224304 | ((i3 << 12) & 3670016), Token.FOR);
                    rv4Var.q(false);
                }
                rv4Var.e0(1790631063);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ns1(i, mwbVar, nq7Var, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fpd] */
    public static final fpd i() {
        int i = ~100;
        ?? obj = new Object();
        obj.c = 100;
        obj.d = 0;
        obj.e = 0;
        obj.f = 0;
        obj.C = i;
        obj.D = (100 << 10) ^ (0 >>> 4);
        if ((100 | 0 | i) != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                obj.d();
            }
            return obj;
        }
        vs.m("Initial state must have at least one non-zero element.");
        throw null;
    }

    public static final we0 j(Iterable iterable) {
        Object obj;
        List u0 = sl1.u0(iterable, new kn4(19));
        ListIterator listIterator = u0.listIterator(u0.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                u4 u4Var = ((we0) obj).c;
                we0.e[0].getClass();
                if (((Boolean) u4Var.b).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (we0) obj;
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final String l(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void m(ak3 ak3Var, int i, int i2, long j, float f2, long j2, mn mnVar) {
        int c2 = mnVar.c(i);
        ArrayList arrayList = mnVar.a;
        int c3 = mnVar.c(i2);
        if (c2 <= c3) {
            float f3 = nae.e;
            while (true) {
                int max = Math.max(i, ((jvb) arrayList.get(c2)).a);
                int min = Math.min(i2, ((jvb) arrayList.get(c2)).b - 1);
                float f4 = mnVar.a(max).a;
                rk9 a2 = mnVar.a(min);
                float max2 = Math.max(f3, ((jvb) arrayList.get(c2)).d);
                float b2 = mnVar.b(c2);
                float f5 = 2.0f * f2;
                ak3.R0(ak3Var, j2, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j >> 32)) + f4) - f5) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j & 4294967295L)) + max2) - f2) & 4294967295L), (Float.floatToRawIntBits((4.0f * f2) + (a2.c - f4)) << 32) | (Float.floatToRawIntBits((b2 - max2) + f5) & 4294967295L), nae.e, null, 0, 120);
                if (c2 != c3) {
                    c2++;
                    f3 = b2;
                } else {
                    return;
                }
            }
        }
    }

    public static final long n(long j, boolean z, int i, float f2) {
        int i2;
        if ((z || i == 2 || i == 4 || i == 5) && x02.e(j)) {
            i2 = x02.i(j);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (x02.k(j) != i2) {
            i2 = dce.n(qwe.l(f2), x02.k(j), i2);
        }
        return ak0.r(0, i2, 0, x02.h(j));
    }

    public static final void o(vf6 vf6Var, List list, lu4 lu4Var) {
        vf6Var.getClass();
        lu4Var.getClass();
        vf6.y(vf6Var, "genre", new tn4(3), new tu1(new yw4(list, lu4Var, 0), true, 224248405), 4);
    }

    public static Object p(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static String q(Context context, String str) {
        am8.s(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = fbe.J(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String r(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
