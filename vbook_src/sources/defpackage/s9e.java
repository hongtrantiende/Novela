package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s9e  reason: default package */
/* loaded from: classes.dex */
public abstract class s9e {
    public static final tu1 a;
    public static final tu1 b;
    public static final tu1 c;
    public static final String[] d;
    public static final String[] e;

    static {
        new tu1(new ov1(12), false, 213348451);
        a = new tu1(new nv1(18), false, -1487162555);
        b = new tu1(new nv1(19), false, 77912045);
        new tu1(new ov1(13), false, 1910405200);
        c = new tu1(new nv1(20), false, -978120914);
        d = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
        e = new String[]{"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    }

    public static final void A(yma ymaVar, osa osaVar) {
        ymaVar.getClass();
        osaVar.getClass();
        lj9 lj9Var = new lj9(ymaVar);
        try {
            lj9Var.J(osaVar);
            lj9Var.flush();
            try {
                lj9Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                lj9Var.close();
            } catch (Throwable th3) {
                pye.e(th, th3);
            }
        }
        if (th == null) {
            return;
        }
        throw th;
    }

    public static final void a(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        aw7 aw7Var;
        kn6 kn6Var;
        boolean z3;
        int i4;
        boolean z4;
        aw7 aw7Var2;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(288042038);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(cz7Var)) {
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
        if (rv4Var.U(i6 & 1, z)) {
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str, 0);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                mq0 mq0Var = (mq0) ((fdd) voe.z(cm9.a(mq0.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var));
                aw7 z5 = jsc.z(mq0Var.F, rv4Var);
                Object[] objArr = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new mf0(8);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new mf0(5);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P3, rv4Var, 48);
                Object[] objArr3 = new Object[0];
                Object P4 = rv4Var.P();
                if (P4 == obj) {
                    P4 = new mf0(6);
                    rv4Var.o0(P4);
                }
                Object obj2 = (aw7) zpe.k(objArr3, (vt4) P4, rv4Var, 48);
                Object[] objArr4 = new Object[0];
                Object P5 = rv4Var.P();
                if (P5 == obj) {
                    P5 = new mf0(7);
                    rv4Var.o0(P5);
                }
                aw7 aw7Var5 = (aw7) zpe.k(objArr4, (vt4) P5, rv4Var, 48);
                Object P6 = rv4Var.P();
                if (P6 == obj) {
                    P6 = yae.z(null);
                    rv4Var.o0(P6);
                }
                aw7 aw7Var6 = (aw7) P6;
                Object obj3 = (kb) rv4Var.j(yb.a);
                Object obj4 = (sac) rv4Var.j(uac.a);
                s02 s02Var = mq0Var.H;
                boolean f = rv4Var.f(obj3) | rv4Var.f(obj4) | rv4Var.f(obj2);
                Object P7 = rv4Var.P();
                if (!f && P7 != obj) {
                    aw7Var = obj2;
                    kn6Var = null;
                } else {
                    P7 = new zp0(obj3, obj4, obj2, (m42) null, 0);
                    aw7Var = obj2;
                    kn6Var = null;
                    rv4Var.o0(P7);
                }
                jye.b(s02Var, kn6Var, (mu4) P7, rv4Var, 0);
                aw7 aw7Var7 = aw7Var;
                fxe.h(((fq0) z5.getValue()).a, null, false, jce.E(-1931047878, new p7(cz7Var, 3), rv4Var), jce.E(1103185777, new pp0(aw7Var3, aw7Var4, 0), rv4Var), null, jce.E(-2107841141, new q7((fdd) mq0Var, aw7Var, (Object) z5, aw7Var6, 1), rv4Var), rv4Var, 1600512, 38);
                aw7 z6 = jsc.z(mq0Var.G, rv4Var);
                boolean booleanValue = ((Boolean) aw7Var7.getValue()).booleanValue();
                gq0 gq0Var = (gq0) z6.getValue();
                boolean f2 = rv4Var.f(aw7Var7);
                Object P8 = rv4Var.P();
                if (f2 || P8 == obj) {
                    P8 = new s7(aw7Var7, 8);
                    rv4Var.o0(P8);
                }
                xt4 xt4Var = (xt4) P8;
                boolean f3 = rv4Var.f(mq0Var);
                Object P9 = rv4Var.P();
                if (f3 || P9 == obj) {
                    P9 = new qp0(mq0Var, 0);
                    rv4Var.o0(P9);
                }
                xt4 xt4Var2 = (xt4) P9;
                boolean f4 = rv4Var.f(aw7Var7);
                if ((i6 & Token.ASSIGN_MOD) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = f4 | z3;
                Object P10 = rv4Var.P();
                if (z7 || P10 == obj) {
                    P10 = new rp0(cz7Var, aw7Var7, 0);
                    rv4Var.o0(P10);
                }
                cbe.b(booleanValue, gq0Var, xt4Var, xt4Var2, (vt4) P10, rv4Var, 0);
                boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
                String str2 = ((fq0) z5.getValue()).a;
                String A = yqe.A((y3b) b3b.P.getValue(), rv4Var);
                boolean f5 = rv4Var.f(aw7Var3);
                Object P11 = rv4Var.P();
                if (f5 || P11 == obj) {
                    P11 = new s7(aw7Var3, 9);
                    rv4Var.o0(P11);
                }
                xt4 xt4Var3 = (xt4) P11;
                boolean f6 = rv4Var.f(aw7Var3) | rv4Var.f(mq0Var);
                Object P12 = rv4Var.P();
                if (f6 || P12 == obj) {
                    P12 = new k0(10, mq0Var, aw7Var3);
                    rv4Var.o0(P12);
                }
                wq9.f(booleanValue2, str2, A, xt4Var3, (xt4) P12, rv4Var, 0);
                boolean booleanValue3 = ((Boolean) aw7Var4.getValue()).booleanValue();
                boolean f7 = rv4Var.f(aw7Var4);
                Object P13 = rv4Var.P();
                if (f7 || P13 == obj) {
                    P13 = new s7(aw7Var4, 10);
                    rv4Var.o0(P13);
                }
                xt4 xt4Var4 = (xt4) P13;
                boolean f8 = rv4Var.f(mq0Var);
                Object P14 = rv4Var.P();
                if (!f8 && P14 != obj) {
                    i4 = 5;
                } else {
                    i4 = 5;
                    P14 = new qp0(mq0Var, 5);
                    rv4Var.o0(P14);
                }
                nc2.a(booleanValue3, xt4Var4, (xt4) P14, rv4Var, 0);
                if (((o59) aw7Var6.getValue()) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long b2 = zl1.b(0.4f, zl1.b);
                eu3 a3 = zt3.g(null, 3).a(zt3.k(null, 0.95f, 0L, i4));
                lz3 a4 = zt3.i(null, 3).a(zt3.m(0.95f, 0L, i4));
                nq7 a0 = tte.k(zbe.y(kq7.a, 24.0f), ((h27) rv4Var.j(j27.a)).c.b).a0(pna.c);
                Object P15 = rv4Var.P();
                if (P15 == obj) {
                    aw7Var2 = aw7Var6;
                    P15 = new s7(aw7Var2, 11);
                    rv4Var.o0(P15);
                } else {
                    aw7Var2 = aw7Var6;
                }
                z87.a(z4, (xt4) P15, a3, a4, null, b2, false, false, a0, jce.E(-1592143468, new xp0(aw7Var2, cz7Var), rv4Var), rv4Var, 805506480, 208);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 0);
        }
    }

    public static final void b(boolean z, u2c u2cVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long j;
        kg kgVar;
        np npVar;
        kq7 kq7Var;
        np npVar2;
        dq4 dq4Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1906047792);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(u2cVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.f(nq7Var)) {
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
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var2, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var2, p);
            if (z) {
                rv4Var2.e0(1246559029);
                j = ((h27) rv4Var2.j(j27.a)).a.a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1246621587);
                j = ((h27) rv4Var2.j(j27.a)).a.q;
                rv4Var2.q(false);
            }
            long j2 = j;
            kq7 kq7Var2 = kq7.a;
            if (z) {
                rv4Var2.e0(1246706217);
                npVar = npVar5;
                kgVar = kgVar2;
                kq7Var = kq7Var2;
                npVar2 = npVar6;
                tl1.l(0L, 2.0f, 0, pna.h(kq7Var2, 14.0f), rv4Var2, 3120, 5);
                rv4Var2.q(false);
            } else {
                kgVar = kgVar2;
                npVar = npVar5;
                kq7Var = kq7Var2;
                npVar2 = npVar6;
                rv4Var2.e0(1246848259);
                nk5.a(rp5.c((wk3) ok3.N.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 12.0f), ((h27) rv4Var2.j(j27.a)).a.q, rv4Var2, 432, 0);
                rv4Var2.q(false);
            }
            nq7 A = zbe.A(rs8.d(kq7Var, 8.0f, rv4Var2, 1.0f, true), nae.e, 6.0f, 1);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, A);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, a3);
            jce.F(npVar4, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar, rv4Var2, kgVar);
            jce.F(npVar2, rv4Var2, p2);
            String str = u2cVar.b;
            nq7 f = pna.f(kq7Var, 1.0f);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.j;
            if (z) {
                dq4Var = dq4.D;
            } else {
                dq4Var = dq4.e;
            }
            cvb.c(str, f, j2, null, 0L, new wp4(z ? 1 : 0), dq4Var, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 129944);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qd1(z, u2cVar, nq7Var, i, 4);
        }
    }

    public static final void c(boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
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
        boolean z10;
        boolean z11 = z;
        rv4 rv4Var2 = rv4Var;
        mk0 mk0Var = kh5.G;
        rv4Var2.g0(735388439);
        if (rv4Var2.g(z11)) {
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
            nq7 d2 = st0.d(tte.k(kq7Var, su9Var), 1.0f, rm1.g(((h27) rv4Var2.j(j27.a)).a, 4.0f), su9Var);
            gv9 a3 = ev9.a(dzVar, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d2);
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
            rv4Var2.e0(1709559795);
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
                if (z11 == z7) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                tza tzaVar = j27.a;
                nq7 m2 = r1d.m(nmd.v(kq7Var, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), z8, new wu1(28), rv4Var2, 0);
                if ((i11 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean d3 = z9 | rv4Var2.d(i12);
                Object P = rv4Var2.P();
                if (!d3 && P != lh9Var) {
                    z10 = false;
                } else {
                    z10 = false;
                    P = new tp0(xt4Var, i12, 0);
                    rv4Var2.o0(P);
                }
                nq7 f = lbe.f(15, (vt4) P, m2, null, z10);
                b37 d4 = fu0.d(kh5.a, z10);
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
                jce.F(qw1.f, rv4Var2, d4);
                jce.F(qw1.e, rv4Var2, l3);
                jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode3));
                jce.C(qw1.h, rv4Var2);
                jce.F(qw1.d, rv4Var2, p3);
                rv4 rv4Var3 = rv4Var2;
                cvb.c(str, zbe.z(pu0.a.a(kq7Var, kh5.e), 12.0f, 8.0f), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var3, 0, 24576, 114680);
                rv4Var3.q(true);
                z11 = z;
                rv4Var2 = rv4Var3;
                i12++;
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
            boolean z12 = z5 | z4;
            Object P2 = rv4Var4.P();
            if (!z12 && P2 != lh9Var) {
                z6 = z2;
                xt4Var3 = xt4Var2;
            } else {
                z6 = z2;
                xt4Var3 = xt4Var2;
                P2 = new up0(0, xt4Var3, z6);
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
            ase.b(z6, xt4Var3, null, false, null, rv4Var2, ((i11 >> 3) & 14) | ((i11 >> 9) & Token.ASSIGN_MOD));
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vp0(z, z2, nq7Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void d(h34 h34Var, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4 rv4Var2 = rv4Var;
        l54 l54Var = h34Var.e;
        lk0 lk0Var = kh5.J;
        rv4Var2.g0(-1753652822);
        if (rv4Var2.f(h34Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(vt4Var)) {
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
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
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
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
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
            h54 h54Var = new h54(l54Var.r, l54Var.a, l54Var.c);
            u22 u22Var = r0f.d;
            nq7 n = pna.n(kq7Var, 32.0f);
            tza tzaVar = j27.a;
            do5.a(h54Var, u22Var, false, null, null, fpe.a, tte.k(n, ((h27) rv4Var2.j(tzaVar)).c.b), null, rv4Var2, 1572912, 828);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            cvb.c(l54Var.b, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131068);
            rv4Var2 = rv4Var;
            rs8.u(rv4Var2, true, kq7Var, 9.0f, rv4Var2);
            boolean z5 = h34Var.a;
            lh9 lh9Var = ax1.a;
            if (z5) {
                rv4Var2.e0(-241738668);
                nq7 f2 = pna.f(kq7Var, 1.0f);
                hz hzVar = new hz(8.0f, true, new vs(2));
                Object P = rv4Var2.P();
                if (P == lh9Var) {
                    P = new nj0(9);
                    rv4Var2.o0(P);
                }
                kqe.b(f2, null, null, hzVar, null, null, false, (xt4) P, rv4Var2, 113270790, 110);
                rv4Var2.q(false);
            } else {
                boolean z6 = h34Var.c;
                lh9 lh9Var2 = lz.e;
                if (z6) {
                    rv4Var2.e0(-241236096);
                    nq7 h = pna.h(pna.f(kq7Var, 1.0f), 200.0f);
                    xn1 a4 = wn1.a(lh9Var2, lk0Var, rv4Var2, 54);
                    int hashCode3 = Long.hashCode(rv4Var2.T);
                    xt8 l3 = rv4Var2.l();
                    nq7 p3 = lye.p(rv4Var2, h);
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
                    rv4Var2.e0(-113079024);
                    String str = h34Var.d;
                    if (str.length() == 0) {
                        str = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
                    }
                    rv4Var2.q(false);
                    cvb.c(str, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 24576, 0, 130030);
                    xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
                    z1d.f(rp5.c((wk3) ok3.d0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.D.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, (i11 << 18) & 234881024, 252);
                    rv4Var2 = rv4Var;
                    rv4Var2.q(true);
                    rv4Var2.q(false);
                } else {
                    List list = h34Var.g;
                    if (list != null && !list.isEmpty()) {
                        rv4Var2.e0(-239371601);
                        nq7 f3 = pna.f(kq7Var, 1.0f);
                        hz hzVar2 = new hz(8.0f, true, new vs(2));
                        if ((i11 & 14) != 4) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if ((i11 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z7 = z3 | z2;
                        if ((i11 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z8 = z7 | z4;
                        Object P2 = rv4Var2.P();
                        if (z8 || P2 == lh9Var) {
                            P2 = new r7(4, h34Var, xt4Var, xt4Var2);
                            rv4Var2.o0(P2);
                        }
                        kqe.b(f3, null, null, hzVar2, null, null, false, (xt4) P2, rv4Var2, 24582, 238);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(-240270787);
                        nq7 h2 = pna.h(pna.f(kq7Var, 1.0f), 200.0f);
                        xn1 a5 = wn1.a(lh9Var2, lk0Var, rv4Var2, 54);
                        int hashCode4 = Long.hashCode(rv4Var2.T);
                        xt8 l4 = rv4Var2.l();
                        nq7 p4 = lye.p(rv4Var2, h2);
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
                        cvb.c(yqe.A((y3b) o2b.K0.getValue(), rv4Var2), null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 24576, 0, 130030);
                        xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
                        z1d.f(rp5.c((wk3) ok3.d0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.D.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, (i11 << 18) & 234881024, 252);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                    }
                }
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(h34Var, nq7Var, vt4Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void e(List list, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, lu4 lu4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4Var.g0(836230532);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(bkdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        boolean z5 = false;
        if ((599187 & i11) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            if ((i11 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i11 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            if ((57344 & i11) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((458752 & i11) == 131072) {
                z5 = true;
            }
            boolean z8 = z7 | z5;
            Object P = rv4Var.P();
            if (z8 || P == ax1.a) {
                p6 p6Var = new p6(list, xt4Var, xt4Var2, lu4Var, lu4Var2, 4);
                rv4Var.o0(p6Var);
                P = p6Var;
            }
            pc2.c(nq7Var, null, bkdVar, null, null, null, false, null, 0L, 0L, nae.e, (xt4) P, rv4Var, 6 | ((i11 << 3) & 896), 0, 4090);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bx(list, bkdVar, nq7Var, xt4Var, xt4Var2, lu4Var, lu4Var2, i, 1);
        }
    }

    public static final void f(nq7 nq7Var, fz fzVar, jz jzVar, mk0 mk0Var, int i, int i2, tu1 tu1Var, rv4 rv4Var, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-1303174015);
        if ((i3 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.f(fzVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.f(jzVar)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i4 |= i8;
        }
        int i11 = i4 | 224256;
        if ((i3 & 1572864) == 0) {
            if (rv4Var.h(tu1Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i11 |= i7;
        }
        if ((599187 & i11) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            mk0Var = kh5.F;
            g(nq7Var, fzVar, jzVar, tn3.f, tu1Var, rv4Var, (i11 & 14) | 1572864 | (i11 & Token.ASSIGN_MOD) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | ((i11 << 3) & 29360128));
            i5 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
        } else {
            rv4Var.X();
            i5 = i;
            i6 = i2;
        }
        mk0 mk0Var2 = mk0Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jl4(nq7Var, fzVar, jzVar, mk0Var2, i5, i6, tu1Var, i3);
        }
    }

    public static final void g(nq7 nq7Var, fz fzVar, jz jzVar, tn3 tn3Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object obj2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        mk0 mk0Var = kh5.F;
        rv4Var.g0(-1956591841);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(fzVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(jzVar)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(mk0Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.d(Integer.MAX_VALUE)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.d(Integer.MAX_VALUE)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            obj = tn3Var;
            if (rv4Var.f(obj)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            obj = tn3Var;
        }
        if ((i & 12582912) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((i11 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            int i12 = i11 & 3670016;
            if (i12 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            if (z2 || P == obj3) {
                obj.getClass();
                P = new Object();
                rv4Var.o0(P);
            }
            ml4 ml4Var = (ml4) P;
            int i13 = i11 >> 3;
            if ((((i13 & 14) ^ 6) > 4 && rv4Var.f(fzVar)) || (i13 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i13 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.f(jzVar)) || (i13 & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z12 = z3 | z4;
            if ((((i13 & 896) ^ 384) > 256 && rv4Var.f(mk0Var)) || (i13 & 384) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z13 = z12 | z5;
            if ((((i13 & 7168) ^ 3072) > 2048 && rv4Var.d(Integer.MAX_VALUE)) || (i13 & 3072) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z14 = z13 | z6;
            if ((((57344 & i13) ^ 24576) > 16384 && rv4Var.d(Integer.MAX_VALUE)) || (i13 & 24576) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f = z7 | z14 | rv4Var.f(ml4Var);
            Object P2 = rv4Var.P();
            if (f || P2 == obj3) {
                Object ol4Var = new ol4(fzVar, jzVar, fzVar.b(), new id2(mk0Var), jzVar.b(), ml4Var);
                rv4Var.o0(ol4Var);
                P2 = ol4Var;
            }
            ol4 ol4Var2 = (ol4) P2;
            if (i12 == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i11 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z8 | z9;
            if ((i11 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object P3 = rv4Var.P();
            if (!z16 && P3 != obj3) {
                z11 = true;
                obj2 = P3;
            } else {
                ArrayList arrayList = new ArrayList();
                z11 = true;
                arrayList.add(new tu1(new x0a(tu1Var, 6), true, -1192950673));
                tn3Var.getClass();
                rv4Var.o0(arrayList);
                obj2 = arrayList;
            }
            tu1 tu1Var2 = new tu1(new y0((List) obj2, 8), z11, 1271844412);
            boolean f2 = rv4Var.f(ol4Var2);
            Object P4 = rv4Var.P();
            if (f2 || P4 == obj3) {
                P4 = new dt7(ol4Var2);
                rv4Var.o0(P4);
            }
            b37 b37Var = (b37) P4;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, b37Var);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var2.invoke(rv4Var, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1(nq7Var, fzVar, jzVar, tn3Var, tu1Var, i);
        }
    }

    public static final void h(boolean z, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-87039252);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var2)) {
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
        if (rv4Var.U(i7 & 1, z2)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yae.z("");
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            xb.d(z, xt4Var, jce.E(1460656408, new or3(1, xt4Var2, aw7Var), rv4Var), null, null, jce.E(1063685173, new id1(xt4Var, 16, (byte) 0), rv4Var), qye.c, null, 0L, 0L, nae.e, false, false, jce.E(-868873792, new sp0(aw7Var, 12), rv4Var), rv4Var, (i7 & 14) | 1769856 | (i7 & Token.ASSIGN_MOD), 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kr3(z, xt4Var, xt4Var2, i, 3);
        }
    }

    public static final void i(boolean z, boolean z2, String str, List list, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        list.getClass();
        xt4Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(1647345783);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(str)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(list)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i11 & 1, z3)) {
            if (!z2) {
                rv4Var.e0(1782146313);
                int i12 = i11 & 14;
                int i13 = i11 >> 3;
                j(z, str, list, xt4Var, lu4Var, rv4Var, i12 | (i13 & Token.ASSIGN_MOD) | (i13 & 896) | 3072 | (i13 & 57344));
                rv4Var.q(false);
            } else {
                rv4Var.e0(1782394251);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fw0(z, z2, str, list, xt4Var, lu4Var, i);
        }
    }

    public static final void j(boolean z, String str, List list, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        String str2;
        List list2;
        xt4 xt4Var2;
        lu4 lu4Var2;
        rv4 rv4Var2;
        int i3;
        int i4;
        boolean h;
        int i5;
        int i6;
        rv4Var.g0(3260377);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if ((i & 48) == 0) {
            if (rv4Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            z3 = z;
            lu4Var2 = lu4Var;
            xt4Var2 = xt4Var;
            str2 = str;
            list2 = list;
            rv4Var2 = rv4Var;
            hc2.b(pna.c, null, jce.E(2074649135, new wd7(z3, xt4Var, str, list, lu4Var2), rv4Var), rv4Var2, 3078, 6);
        } else {
            z3 = z;
            str2 = str;
            list2 = list;
            xt4Var2 = xt4Var;
            lu4Var2 = lu4Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new a83(z3, str2, list2, xt4Var2, lu4Var2, i);
        }
    }

    public static final void k(String str, List list, rh8 rh8Var, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        rh8 rh8Var2;
        rh8 rh8Var3;
        boolean z2;
        int i9;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i10;
        rv4 rv4Var2 = rv4Var;
        list.getClass();
        lu4Var.getClass();
        rv4Var2.g0(-659204981);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i | i3;
        if (rv4Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        int i13 = i2 & 4;
        if (i13 != 0) {
            i6 = i12 | 384;
            obj = rh8Var;
        } else {
            obj = rh8Var;
            if (rv4Var2.f(obj)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i6 = i12 | i5;
        }
        if (rv4Var2.f(nq7Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i14 = i6 | i7;
        if (rv4Var2.h(lu4Var)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i15 = i14 | i8;
        if ((i15 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i15 & 1, z)) {
            if (i13 != 0) {
                rh8Var3 = new th8(nae.e, nae.e, nae.e, nae.e);
            } else {
                rh8Var3 = obj;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yte.s(rv4Var2);
                rv4Var2.o0(P);
            }
            m82 m82Var = (m82) P;
            int i16 = i15 & 14;
            if (i16 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var2.P();
            if (z2 || P2 == lh9Var) {
                Iterator it = list.iterator();
                int i17 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (c16.i(((u2c) it.next()).a, str)) {
                            break;
                        }
                        i17++;
                    } else {
                        i17 = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i17);
                if (i17 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i9 = valueOf.intValue();
                } else {
                    i9 = 0;
                }
                P2 = Integer.valueOf(i9);
                rv4Var2.o0(P2);
            }
            int intValue = ((Number) P2).intValue();
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                if (intValue <= list.size() - 3 && intValue > 3) {
                    i10 = intValue - 3;
                } else {
                    i10 = intValue;
                }
                P3 = Integer.valueOf(i10);
                rv4Var2.o0(P3);
            }
            kj6 a2 = mj6.a(((Number) P3).intValue(), rv4Var2, 6, 2);
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var) {
                P4 = yae.q(new ti6(a2, intValue, 1));
                rv4Var2.o0(P4);
            }
            yya yyaVar = (yya) P4;
            b37 d2 = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ze4 ze4Var = pna.c;
            bkd r = mwe.r(rh8Var3, zbe.j(nae.e, nae.e, 4.0f, 44.0f, 3));
            bkd r2 = mwe.r(rh8Var3, zbe.j(nae.e, nae.e, nae.e, 44.0f, 7));
            if ((i15 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i16 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z3 | z4;
            if ((i15 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object P5 = rv4Var2.P();
            if (z8 || P5 == lh9Var) {
                P5 = new nq3(17, list, str, lu4Var);
                rv4Var2.o0(P5);
            }
            rh8 rh8Var4 = rh8Var3;
            pc2.c(ze4Var, a2, r2, null, null, null, false, r, 0L, 0L, nae.e, (xt4) P5, rv4Var, 6, 0, 3832);
            rv4Var2 = rv4Var;
            if (((Number) yyaVar.getValue()).intValue() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            rte.c(z6, zbe.C(zbe.x(pu0.a.a(kq7.a, kh5.D), rh8Var4), nae.e, nae.e, nae.e, 8.0f, 7), zt3.k(null, nae.e, 0L, 7), zt3.m(nae.e, 0L, 7), null, jce.E(-1576625043, new tl7(m82Var, a2, intValue, yyaVar), rv4Var2), rv4Var2, 200064, 16);
            rv4Var2.q(true);
            rh8Var2 = rh8Var4;
        } else {
            rv4Var2.X();
            rh8Var2 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ud1(str, list, rh8Var2, nq7Var, lu4Var, i, i2);
        }
    }

    public static final e49 l(String str) {
        str.getClass();
        return new e49(str);
    }

    public static final void m(s11 s11Var) {
        s11Var.getClass();
        s11Var.a(new IOException("Channel was cancelled"));
    }

    public static final byte[] n(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, nh1 nh1Var, ph1 ph1Var) {
        String str;
        String str2;
        byte[] bArr4;
        byte[] bArr5;
        int ordinal = nh1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "ECB";
            } else {
                xk5.o();
                return null;
            }
        } else {
            str = "CBC";
        }
        int ordinal2 = ph1Var.ordinal();
        if (ordinal2 != 0) {
            str2 = "NoPadding";
            if (ordinal2 != 1 && ordinal2 != 2) {
                xk5.o();
                return null;
            }
        } else {
            str2 = "PKCS5Padding";
        }
        Cipher cipher = Cipher.getInstance("DESede/" + str + "/" + str2);
        if (bArr2.length == 24) {
            bArr4 = bArr2;
        } else {
            byte[] bArr6 = new byte[24];
            b00.c0(bArr2, 0, 0, bArr6, Math.min(bArr2.length, 24), 6);
            bArr4 = bArr6;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, "DESede");
        int ordinal3 = nh1Var.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 == 1) {
                cipher.init(i, secretKeySpec);
            } else {
                xk5.o();
                return null;
            }
        } else {
            if (bArr3.length == 8) {
                bArr5 = bArr3;
            } else {
                bArr5 = new byte[8];
                b00.c0(bArr3, 0, 0, bArr5, Math.min(bArr3.length, 8), 6);
            }
            cipher.init(i, secretKeySpec, new IvParameterSpec(bArr5));
        }
        byte[] doFinal = cipher.doFinal(bArr);
        doFinal.getClass();
        return doFinal;
    }

    public static final e49 o(String str) {
        str.getClass();
        return new e49(str);
    }

    public static final Object p(p19 p19Var, String str, n42 n42Var) {
        Object b2 = p19Var.b(str, new txb(17), n42Var);
        if (b2 == n82.a) {
            return b2;
        }
        return pvc.a;
    }

    public static final xy4 q(xy4 xy4Var) {
        return xy4Var.d(new u55(v63.a));
    }

    public static final xy4 r(xy4 xy4Var) {
        return q(s(xy4Var));
    }

    public static final xy4 s(xy4 xy4Var) {
        return xy4Var.d(new mid(v63.a));
    }

    public static final xy4 t(xy4 xy4Var, float f) {
        return xy4Var.d(new u55(new t63(f)));
    }

    public static final e49 u(String str) {
        str.getClass();
        return new e49(str);
    }

    public static final void v(w27 w27Var, ol4 ol4Var, long j, xt4 xt4Var) {
        if (gue.s(gue.r(w27Var)) == nae.e) {
            gue.r(w27Var);
            mw8 M = w27Var.M(j);
            xt4Var.invoke(M);
            ol4Var.getClass();
            M.v0();
            M.u0();
            return;
        }
        ol4Var.getClass();
        w27Var.n0(w27Var.F(Integer.MAX_VALUE));
    }

    public static final xy4 w(float f) {
        return t(z(f), f);
    }

    public static final e49 x(String str) {
        str.getClass();
        return new e49(str);
    }

    public static final e49 y(String str) {
        str.getClass();
        return new e49(str);
    }

    public static final xy4 z(float f) {
        return new mid(new t63(f));
    }

    public abstract bfe B();

    public abstract Integer C();
}
