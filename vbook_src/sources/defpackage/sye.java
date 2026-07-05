package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.InputEvent;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sye  reason: default package */
/* loaded from: classes3.dex */
public abstract class sye {
    public static final tu1 a = new tu1(new kv1(9), false, 1314660729);
    public static final tu1 b = new tu1(new kv1(10), false, -64372752);
    public static ar5 c;

    public static final void a(final x04 x04Var, final nq7 nq7Var, final xt4 xt4Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
        ek9 u;
        lu4 lu4Var;
        cza czaVar;
        int i3;
        int i4;
        int i5;
        x04Var.getClass();
        rv4Var.g0(1964243990);
        if ((i & 6) == 0) {
            if (rv4Var.h(x04Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            a14 a14Var = (a14) ((nb4) ((Map) x04Var.L.b).get(tn3.L));
            aw7 aw7Var = null;
            if (a14Var != null) {
                czaVar = a14Var.a;
            } else {
                czaVar = null;
            }
            if (czaVar == null) {
                rv4Var.e0(-2136460357);
            } else {
                rv4Var.e0(-2147128058);
                aw7Var = yae.n(czaVar, rv4Var);
            }
            rv4Var.q(false);
            if (aw7Var == null) {
                u = rv4Var.u();
                if (u != null) {
                    lu4Var = new lu4() { // from class: z04
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = r5;
                            pvc pvcVar = pvc.a;
                            int i7 = i;
                            xt4 xt4Var2 = xt4Var;
                            nq7 nq7Var2 = nq7Var;
                            x04 x04Var2 = x04Var;
                            rv4 rv4Var2 = (rv4) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    sye.a(x04Var2, nq7Var2, xt4Var2, rv4Var2, xoe.p(i7 | 1));
                                    return pvcVar;
                                default:
                                    sye.a(x04Var2, nq7Var2, xt4Var2, rv4Var2, xoe.p(i7 | 1));
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                }
                return;
            }
            boolean h = rv4Var.h(x04Var);
            if ((i2 & 896) != 256) {
                z2 = false;
            }
            boolean z3 = h | z2;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                P = new qk2(26, x04Var, xt4Var);
                rv4Var.o0(P);
            }
            xt4 xt4Var2 = (xt4) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new dw3(10);
                rv4Var.o0(P2);
            }
            xt4 xt4Var3 = (xt4) P2;
            boolean h2 = rv4Var.h(x04Var) | rv4Var.f(aw7Var);
            Object P3 = rv4Var.P();
            if (h2 || P3 == lh9Var) {
                P3 = new qk2(27, x04Var, aw7Var);
                rv4Var.o0(P3);
            }
            nq2.a(xt4Var2, nq7Var, null, xt4Var3, (xt4) P3, rv4Var, (i2 & Token.ASSIGN_MOD) | 3072, 4);
        } else {
            rv4Var.X();
        }
        u = rv4Var.u();
        if (u != null) {
            lu4Var = new lu4() { // from class: z04
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = r5;
                    pvc pvcVar = pvc.a;
                    int i7 = i;
                    xt4 xt4Var22 = xt4Var;
                    nq7 nq7Var2 = nq7Var;
                    x04 x04Var2 = x04Var;
                    rv4 rv4Var2 = (rv4) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            sye.a(x04Var2, nq7Var2, xt4Var22, rv4Var2, xoe.p(i7 | 1));
                            return pvcVar;
                        default:
                            sye.a(x04Var2, nq7Var2, xt4Var22, rv4Var2, xoe.p(i7 | 1));
                            return pvcVar;
                    }
                }
            };
            u.d = lu4Var;
        }
    }

    public static final gn8 b(gn8 gn8Var, String... strArr) {
        gn8Var.getClass();
        return c(gn8Var.toString(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final gn8 c(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str2 : strArr) {
            if (sb.length() > 0) {
                char c2 = oo8.a;
                if (!k4b.Y(sb, c2)) {
                    sb.append(c2);
                }
            }
            sb.append(str2);
        }
        return oo8.a(sb.toString());
    }

    public static final b8a d(od6 od6Var, boolean z) {
        mq7 mq7Var = (mq7) od6Var.c0.C;
        z7a z7aVar = null;
        if ((mq7Var.d & 8) != 0) {
            loop0: while (true) {
                if (mq7Var == null) {
                    break;
                }
                if ((mq7Var.c & 8) != 0) {
                    mq7 mq7Var2 = mq7Var;
                    gw7 gw7Var = null;
                    while (mq7Var2 != null) {
                        if (mq7Var2 instanceof z7a) {
                            z7aVar = mq7Var2;
                            break loop0;
                        }
                        if ((mq7Var2.c & 8) != 0 && (mq7Var2 instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mq7Var2 = mq7Var3;
                                    } else {
                                        if (gw7Var == null) {
                                            gw7Var = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var2 != null) {
                                            gw7Var.b(mq7Var2);
                                            mq7Var2 = null;
                                        }
                                        gw7Var.b(mq7Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mq7Var2 = voe.h(gw7Var);
                    }
                }
                if ((mq7Var.d & 8) == 0) {
                    break;
                }
                mq7Var = mq7Var.f;
            }
        }
        z7aVar.getClass();
        mq7 mq7Var4 = ((mq7) z7aVar).a;
        u7a x = od6Var.x();
        if (x == null) {
            x = new u7a();
        }
        return new b8a(mq7Var4, z, od6Var, x);
    }

    public static final void e(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        rv4Var.g0(135635912);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 z2 = zbe.z(kq7Var2, 16.0f, 12.0f);
            tza tzaVar = j27.a;
            cvb.c(str, z2, ((h27) rv4Var.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.h, rv4Var, i3 & 14, 0, 131064);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, kq7Var, i, 14);
        }
    }

    public static final void f(pub pubVar, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj = vt4Var2;
        rv4 rv4Var2 = rv4Var;
        pubVar.getClass();
        List list = pubVar.a;
        vt4Var.getClass();
        obj.getClass();
        rv4Var2.g0(1435601388);
        if (rv4Var2.f(pubVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(obj)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            if (!list.isEmpty()) {
                rv4Var2.e0(-1283091545);
                ewb ewbVar = (ewb) sl1.j0(list);
                su9 su9Var = uu9.a;
                nq7 k = tte.k(nq7Var, su9Var);
                if ((i9 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (z2 || P == lh9Var) {
                    P = new umb(16, vt4Var);
                    rv4Var2.o0(P);
                }
                nq7 f = lbe.f(15, (vt4) P, k, null, false);
                tza tzaVar = j27.a;
                nq7 z4 = zbe.z(nmd.v(f, zl1.b(0.95f, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 4.0f)), lre.g), 12.0f, 4.0f);
                gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
                jce.F(qw1.f, rv4Var2, a2);
                jce.F(qw1.e, rv4Var2, l);
                jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var2);
                jce.F(qw1.d, rv4Var2, p);
                ar5 c2 = rp5.c((wk3) rk3.p.getValue(), rv4Var2, 0);
                kq7 kq7Var = kq7.a;
                nk5.a(c2, null, pna.n(kq7Var, 24.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 432, 0);
                xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
                rv4Var2.e0(-1298927080);
                String str = ewbVar.b;
                if (str.length() == 0) {
                    str = yqe.A((y3b) v1b.k0.getValue(), rv4Var2);
                }
                rv4Var2.q(false);
                cvb.c(str, null, ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 0, 24960, 110586);
                rv4Var2 = rv4Var;
                xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
                ar5 c3 = rp5.c((wk3) jk3.w.getValue(), rv4Var2, 0);
                long j = ((h27) rv4Var2.j(tzaVar)).a.q;
                nq7 k2 = tte.k(pna.n(kq7Var, 20.0f), su9Var);
                if ((i9 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P2 = rv4Var2.P();
                if (!z3 && P2 != lh9Var) {
                    obj = vt4Var2;
                } else {
                    obj = vt4Var2;
                    P2 = new umb(17, obj);
                    rv4Var2.o0(P2);
                }
                nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 2.0f), j, rv4Var2, 48, 0);
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1281570282);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7(pubVar, nq7Var, vt4Var, obj, i, 12);
        }
    }

    public static final void g(final p6c p6cVar, final nq7 nq7Var, final rh8 rh8Var, final xt4 xt4Var, final xt4 xt4Var2, xt4 xt4Var3, final xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, final vt4 vt4Var, xt4 xt4Var7, final xt4 xt4Var8, xt4 xt4Var9, final xt4 xt4Var10, final xt4 xt4Var11, xt4 xt4Var12, final xt4 xt4Var13, final xt4 xt4Var14, rv4 rv4Var, final int i) {
        int i2;
        xt4 xt4Var15;
        xt4 xt4Var16;
        xt4 xt4Var17;
        xt4 xt4Var18;
        xt4 xt4Var19;
        xt4 xt4Var20;
        nq7 f;
        aw7 aw7Var;
        mk0 mk0Var;
        nq7 f2;
        aw7 aw7Var2;
        mv mvVar;
        int i3;
        nq7 f3;
        nq7 f4;
        nq7 f5;
        int i4;
        nq7 f6;
        nq7 f7;
        nq7 f8;
        nq7 f9;
        List list;
        int i5;
        xt4 xt4Var21;
        nq7 f10;
        nq7 f11;
        nq7 f12;
        String E0;
        nq7 f13;
        nq7 f14;
        nq7 f15;
        nq7 f16;
        nq7 v;
        nq7 v2;
        rv4 rv4Var2 = rv4Var;
        mk0 mk0Var2 = kh5.G;
        rv4Var2.g0(-570222661);
        if ((i & 6) == 0) {
            i2 = i | (rv4Var2.f(p6cVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rv4Var2.f(nq7Var) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = Token.CASE;
        if (i6 == 0) {
            i2 |= rv4Var2.f(rh8Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rv4Var2.h(xt4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= rv4Var2.h(xt4Var2) ? 16384 : 8192;
        }
        int i8 = i & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i2 |= rv4Var2.h(xt4Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= rv4Var2.h(xt4Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= rv4Var2.h(xt4Var5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= rv4Var2.h(xt4Var6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= rv4Var2.h(vt4Var) ? 536870912 : 268435456;
        }
        int i10 = i2;
        int i11 = (rv4Var2.h(xt4Var7) ? 4 : 2) | (rv4Var2.h(xt4Var8) ? 32 : 16);
        if (rv4Var2.h(xt4Var9)) {
            i7 = 256;
        }
        int i12 = i11 | i7 | (rv4Var2.h(xt4Var10) ? 2048 : 1024) | (rv4Var2.h(xt4Var11) ? 16384 : 8192);
        if (rv4Var2.h(xt4Var12)) {
            i9 = 131072;
        }
        int i13 = i12 | i9 | (rv4Var2.h(xt4Var13) ? 1048576 : 524288) | (rv4Var2.h(xt4Var14) ? 8388608 : 4194304);
        if (rv4Var2.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i13 & 4793491) == 4793490) ? false : true)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yte.s(rv4Var2);
                rv4Var2.o0(P);
            }
            m82 m82Var = (m82) P;
            kb kbVar = (kb) rv4Var2.j(yb.a);
            int i14 = Build.VERSION.SDK_INT;
            boolean z = i14 >= 31 && p6cVar.i;
            boolean z2 = p6cVar.g;
            c6c c6cVar = p6cVar.a;
            Object[] objArr = new Object[0];
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new a1c(5);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P2, rv4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = new a1c(4);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P3, rv4Var2, 48);
            boolean f17 = rv4Var2.f(c6cVar);
            Object P4 = rv4Var2.P();
            if (f17 || P4 == lh9Var) {
                String str = c6cVar != null ? c6cVar.c : null;
                mv.b.getClass();
                P4 = hq7.j(str);
                rv4Var2.o0(P4);
            }
            mv mvVar2 = (mv) P4;
            boolean z3 = (i13 & 3670016) == 1048576;
            Object P5 = rv4Var2.P();
            if (z3 || P5 == lh9Var) {
                P5 = new u0c(5, xt4Var13);
                rv4Var2.o0(P5);
            }
            kd4 v3 = w92.v(av8.a, (xt4) P5, rv4Var2, 6);
            nq7 C = rte.C(mwe.u(pna.e(nq7Var), false, 6), rte.u(rv4Var2), 14);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(p17.f(rv4Var2));
            xt8 z4 = rv4Var2.z();
            nq7 p = lye.p(rv4Var2, C);
            rw1.k.getClass();
            zx1 b2 = qw1.b();
            rv4Var2.i0();
            if (rv4Var2.D()) {
                rv4Var2.k(b2);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.d(), rv4Var2, a2);
            jce.F(qw1.f(), rv4Var2, z4);
            rs8.t(rv4Var2, Integer.valueOf(hashCode), rv4Var2, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, zbe.x(kq7Var, rh8Var));
            e(yqe.A(f3b.a(), rv4Var2), null, rv4Var2, 0);
            f = pna.f(kq7Var, 1.0f);
            nq7 k = tte.k(zbe.A(f, 16.0f, nae.e, 2), r0f.z(rv4Var2).b());
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode2 = Long.hashCode(p17.f(rv4Var2));
            xt8 z5 = rv4Var2.z();
            nq7 p2 = lye.p(rv4Var2, k);
            zx1 b3 = qw1.b();
            rv4Var2.i0();
            if (rv4Var2.D()) {
                rv4Var2.k(b3);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.d(), rv4Var2, a3);
            jce.F(qw1.f(), rv4Var2, z5);
            rs8.t(rv4Var2, Integer.valueOf(hashCode2), rv4Var2, rv4Var2, p2);
            dz dzVar = lz.a;
            if (!z2) {
                rv4Var2.e0(271762586);
                f16 = pna.f(kq7Var, 1.0f);
                nq7 m = lpe.m(f16, z ? 0.5f : 1.0f);
                boolean g = rv4Var2.g(z) | rv4Var2.h(m82Var) | rv4Var2.f(kbVar) | rv4Var2.f(aw7Var3);
                Object P6 = rv4Var2.P();
                if (g || P6 == lh9Var) {
                    P6 = new v0c(z, m82Var, kbVar, aw7Var3);
                    rv4Var2.o0(P6);
                }
                nq7 q = q(1, (vt4) P6, rv4Var2, m);
                mk0Var = mk0Var2;
                gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
                int hashCode3 = Long.hashCode(p17.f(rv4Var2));
                xt8 z6 = rv4Var2.z();
                nq7 p3 = lye.p(rv4Var2, q);
                zx1 b4 = qw1.b();
                rv4Var2.i0();
                if (rv4Var2.D()) {
                    rv4Var2.k(b4);
                } else {
                    rv4Var2.r0();
                }
                jce.F(qw1.d(), rv4Var2, a4);
                jce.F(qw1.f(), rv4Var2, z6);
                jce.F(qw1.c(), rv4Var2, Integer.valueOf(hashCode3));
                jce.C(qw1.a(), rv4Var2);
                jce.F(qw1.e(), rv4Var2, p3);
                we6 we6Var = new we6(1.0f, true);
                xn1 a5 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
                int hashCode4 = Long.hashCode(p17.f(rv4Var2));
                xt8 z7 = rv4Var2.z();
                nq7 p4 = lye.p(rv4Var2, we6Var);
                zx1 b5 = qw1.b();
                rv4Var2.i0();
                if (rv4Var2.D()) {
                    rv4Var2.k(b5);
                } else {
                    rv4Var2.r0();
                }
                jce.F(qw1.d(), rv4Var2, a5);
                jce.F(qw1.f(), rv4Var2, z7);
                rs8.t(rv4Var2, Integer.valueOf(hashCode4), rv4Var2, rv4Var2, p4);
                cvb.c(yqe.A((y3b) f3b.c.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var2).a(), rv4Var2, 0, 24960, 110590);
                cvb.c((String) cqe.m((q3b) nz.k.getValue(), rv4Var2).get(p6cVar.j), null, zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).j()), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).b(), rv4Var, 0, 0, 131066);
                rv4Var2 = rv4Var;
                rv4Var2.s();
                xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
                if (c6cVar != null) {
                    rv4Var2.e0(-975370316);
                    nq7 n = pna.n(kq7Var, 48.0f);
                    abf abfVar = f27.a;
                    aw7Var = aw7Var3;
                    v = nmd.v(tte.k(n, aye.s(abf.r(), rv4Var2)), rm1.g(r0f.y(rv4Var2), 2.0f), lre.g);
                    nq7 k2 = tte.k(zbe.y(v, 6.0f), aye.s(abf.r(), rv4Var2));
                    boolean f18 = rv4Var2.f(c6cVar);
                    Object P7 = rv4Var2.P();
                    if (f18 || P7 == lh9Var) {
                        zl1 zl1Var = new zl1(kve.v(c6cVar.b));
                        rv4Var2.o0(zl1Var);
                        P7 = zl1Var;
                    }
                    v2 = nmd.v(k2, ((zl1) P7).j(), lre.g);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode5 = Long.hashCode(p17.f(rv4Var2));
                    xt8 z8 = rv4Var2.z();
                    nq7 p5 = lye.p(rv4Var2, v2);
                    zx1 b6 = qw1.b();
                    rv4Var2.i0();
                    if (rv4Var2.D()) {
                        rv4Var2.k(b6);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.d(), rv4Var2, d);
                    jce.F(qw1.f(), rv4Var2, z8);
                    rs8.t(rv4Var2, Integer.valueOf(hashCode5), rv4Var2, rv4Var2, p5);
                    ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var2, 0);
                    int i15 = zl1.j;
                    nk5.a(c2, null, pu0.a.a(pna.n(kq7Var, 18.0f), kh5.e), zl1.e, rv4Var2, 3120, 0);
                    rv4Var2.s();
                    rv4Var2.t();
                } else {
                    aw7Var = aw7Var3;
                    rv4Var2.e0(-974388174);
                    rv4Var2.t();
                }
                rv4Var2.s();
                xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
                rv4Var2.t();
            } else {
                aw7Var = aw7Var3;
                mk0Var = mk0Var2;
                rv4Var2.e0(274462035);
                rv4Var2.t();
            }
            f2 = pna.f(kq7Var, 1.0f);
            h(p6cVar.e, (i10 >> 6) & Token.ASSIGN_MOD, xt4Var, rv4Var2, q(3, null, rv4Var2, f2));
            if (!z2) {
                s21.w(rv4Var2, 274815869, kq7Var, 4.0f, rv4Var2);
                f10 = pna.f(kq7Var, 1.0f);
                nq7 q2 = q(3, null, rv4Var2, f10);
                String A = yqe.A((y3b) b3b.f0.getValue(), rv4Var2);
                mvVar = mvVar2;
                String j = c16.j(mvVar, rv4Var2);
                aw7Var2 = aw7Var4;
                boolean f19 = rv4Var2.f(aw7Var2);
                i3 = 57344;
                Object P8 = rv4Var2.P();
                if (f19 || P8 == lh9Var) {
                    P8 = new p0c(aw7Var2, 9);
                    rv4Var2.o0(P8);
                }
                l0e.l(null, A, j, q2, (vt4) P8, rv4Var2, 0, 1);
                if (mvVar == mv.d) {
                    s21.w(rv4Var2, 275278048, kq7Var, 4.0f, rv4Var2);
                    f12 = pna.f(kq7Var, 1.0f);
                    nq7 q3 = q(3, null, rv4Var2, f12);
                    String A2 = yqe.A(v1b.a(), rv4Var2);
                    rv4Var2.e0(1117267670);
                    String str2 = p6cVar.n;
                    if (k4b.j0(str2)) {
                        E0 = "";
                    } else {
                        String E02 = k4b.E0('/', str2, str2);
                        E0 = k4b.E0('\\', E02, E02);
                    }
                    if (k4b.j0(E0)) {
                        E0 = yqe.A(o2b.a(), rv4Var2);
                    }
                    String str3 = E0;
                    rv4Var2.t();
                    boolean f20 = rv4Var2.f(v3);
                    Object P9 = rv4Var2.P();
                    if (f20 || P9 == lh9Var) {
                        P9 = new fe1(v3, 19);
                        rv4Var2.o0(P9);
                    }
                    l0e.l(null, A2, str3, q3, (vt4) P9, rv4Var2, 0, 1);
                    xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
                    f13 = pna.f(kq7Var, 1.0f);
                    nq7 q4 = q(3, null, rv4Var2, f13);
                    xn1 a6 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
                    int hashCode6 = Long.hashCode(p17.f(rv4Var2));
                    xt8 z9 = rv4Var2.z();
                    nq7 p6 = lye.p(rv4Var2, q4);
                    zx1 b7 = qw1.b();
                    rv4Var2.i0();
                    if (rv4Var2.D()) {
                        rv4Var2.k(b7);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.d(), rv4Var2, a6);
                    jce.F(qw1.f(), rv4Var2, z9);
                    rs8.t(rv4Var2, Integer.valueOf(hashCode6), rv4Var2, rv4Var2, p6);
                    f14 = pna.f(kq7Var, 1.0f);
                    gv9 a7 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
                    int hashCode7 = Long.hashCode(p17.f(rv4Var2));
                    xt8 z10 = rv4Var2.z();
                    nq7 p7 = lye.p(rv4Var2, f14);
                    zx1 b8 = qw1.b();
                    rv4Var2.i0();
                    if (rv4Var2.D()) {
                        rv4Var2.k(b8);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.d(), rv4Var2, a7);
                    jce.F(qw1.f(), rv4Var2, z10);
                    jce.F(qw1.c(), rv4Var2, Integer.valueOf(hashCode7));
                    jce.C(qw1.a(), rv4Var2);
                    jce.F(qw1.e(), rv4Var2, p7);
                    rv4 rv4Var3 = rv4Var2;
                    cvb.c(yqe.A((y3b) b3b.i0.getValue(), rv4Var2), new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).a(), rv4Var3, 0, 0, 131068);
                    cvb.c(((int) (dce.m(p6cVar.o, nae.e, 1.0f) * 100.0f)) + "%", null, zl1.b(0.6f, ((zl1) rv4Var2.j(r12.a)).j()), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).b(), rv4Var3, 0, 0, 131066);
                    rv4Var2.s();
                    xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
                    float m2 = dce.m(p6cVar.o, nae.e, 1.0f);
                    jk1 jk1Var = new jk1(nae.e, 1.0f);
                    f15 = pna.f(kq7Var, 1.0f);
                    dae.d(m2, xt4Var14, f15, false, null, null, null, 0, null, null, jk1Var, rv4Var2, ((i13 >> 18) & Token.ASSIGN_MOD) | 384, 0, 1016);
                    rv4Var2.s();
                    rv4Var2.t();
                } else {
                    rv4Var2.e0(277356691);
                    rv4Var2.t();
                }
                if (i14 >= 31) {
                    s21.w(rv4Var2, 277429355, kq7Var, 4.0f, rv4Var2);
                    f11 = pna.f(kq7Var, 1.0f);
                    nq7 q5 = q(3, null, rv4Var2, f11);
                    String A3 = yqe.A((y3b) f3b.l.getValue(), rv4Var2);
                    String A4 = yqe.A((y3b) f3b.m.getValue(), rv4Var2);
                    boolean z11 = (i10 & 57344) == 16384;
                    Object P10 = rv4Var2.P();
                    if (z11 || P10 == lh9Var) {
                        P10 = new u0c(6, xt4Var2);
                        rv4Var2.o0(P10);
                    }
                    l0e.n(null, A3, A4, q5, false, z, (xt4) P10, rv4Var2, 0, 17);
                    rv4Var2.t();
                } else {
                    rv4Var2.e0(277990579);
                    rv4Var2.t();
                }
                rv4Var2.t();
            } else {
                aw7Var2 = aw7Var4;
                mvVar = mvVar2;
                i3 = 57344;
                rv4Var2.e0(278004467);
                rv4Var2.t();
            }
            rv4Var2.s();
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            e(yqe.A((y3b) f3b.u.getValue(), rv4Var2), null, rv4Var2, 0);
            f3 = pna.f(kq7Var, 1.0f);
            nq7 k3 = tte.k(zbe.A(f3, 16.0f, nae.e, 2), r0f.z(rv4Var2).b());
            xn1 a8 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode8 = Long.hashCode(p17.f(rv4Var2));
            xt8 z12 = rv4Var2.z();
            nq7 p8 = lye.p(rv4Var2, k3);
            zx1 b9 = qw1.b();
            rv4Var2.i0();
            if (rv4Var2.D()) {
                rv4Var2.k(b9);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.d(), rv4Var2, a8);
            jce.F(qw1.f(), rv4Var2, z12);
            rs8.t(rv4Var2, Integer.valueOf(hashCode8), rv4Var2, rv4Var2, p8);
            f4 = pna.f(kq7Var, 1.0f);
            nq7 q6 = q(3, null, rv4Var2, f4);
            String A5 = yqe.A((y3b) f3b.a.getValue(), rv4Var2);
            String A6 = yqe.A((y3b) f3b.b.getValue(), rv4Var2);
            boolean z13 = p6cVar.f;
            boolean z14 = (i10 & 458752) == 131072;
            Object P11 = rv4Var2.P();
            if (z14 || P11 == lh9Var) {
                xt4Var19 = xt4Var3;
                P11 = new u0c(7, xt4Var19);
                rv4Var2.o0(P11);
            } else {
                xt4Var19 = xt4Var3;
            }
            l0e.n(null, A5, A6, q6, false, z13, (xt4) P11, rv4Var2, 0, 17);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            f5 = pna.f(kq7Var, 1.0f);
            nq7 q7 = q(3, null, rv4Var2, f5);
            String A7 = yqe.A((y3b) f3b.n.getValue(), rv4Var2);
            String A8 = yqe.A((y3b) f3b.o.getValue(), rv4Var2);
            boolean z15 = p6cVar.g;
            boolean z16 = (i10 & 3670016) == 1048576;
            Object P12 = rv4Var2.P();
            if (z16 || P12 == lh9Var) {
                i4 = 458752;
                P12 = new u0c(8, xt4Var4);
                rv4Var2.o0(P12);
            } else {
                i4 = 458752;
            }
            l0e.n(null, A7, A8, q7, false, z15, (xt4) P12, rv4Var2, 0, 17);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            f6 = pna.f(kq7Var, 1.0f);
            nq7 q8 = q(3, null, rv4Var2, f6);
            String A9 = yqe.A((y3b) f3b.w.getValue(), rv4Var2);
            String A10 = yqe.A((y3b) f3b.x.getValue(), rv4Var2);
            boolean z17 = p6cVar.h;
            boolean z18 = (i10 & 29360128) == 8388608;
            Object P13 = rv4Var2.P();
            if (z18 || P13 == lh9Var) {
                xt4Var16 = xt4Var5;
                P13 = new u0c(9, xt4Var16);
                rv4Var2.o0(P13);
            } else {
                xt4Var16 = xt4Var5;
            }
            l0e.n(null, A9, A10, q8, false, z17, (xt4) P13, rv4Var2, 0, 17);
            rv4Var2.s();
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            e(yqe.A((y3b) f3b.v.getValue(), rv4Var2), null, rv4Var2, 0);
            f7 = pna.f(kq7Var, 1.0f);
            nq7 k4 = tte.k(zbe.A(f7, 16.0f, nae.e, 2), r0f.z(rv4Var2).b());
            xn1 a9 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode9 = Long.hashCode(p17.f(rv4Var2));
            xt8 z19 = rv4Var2.z();
            nq7 p9 = lye.p(rv4Var2, k4);
            zx1 b10 = qw1.b();
            rv4Var2.i0();
            if (rv4Var2.D()) {
                rv4Var2.k(b10);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.d(), rv4Var2, a9);
            jce.F(qw1.f(), rv4Var2, z19);
            rs8.t(rv4Var2, Integer.valueOf(hashCode9), rv4Var2, rv4Var2, p9);
            if (Settings.Secure.getInt(((Context) rv4Var2.j(gh.b)).getContentResolver(), "navigation_mode", 0) == 2) {
                rv4Var2.e0(-861085909);
                rv4Var2.t();
                xt4Var17 = xt4Var6;
            } else {
                rv4Var2.e0(-861593317);
                f8 = pna.f(kq7Var, 1.0f);
                nq7 q9 = q(3, null, rv4Var2, f8);
                String A11 = yqe.A(k3b.a(), rv4Var2);
                List m3 = cqe.m((q3b) nz.u.getValue(), rv4Var2);
                int i16 = p6cVar.m;
                boolean z20 = (i10 & 234881024) == 67108864;
                Object P14 = rv4Var2.P();
                if (z20 || P14 == lh9Var) {
                    xt4Var17 = xt4Var6;
                    P14 = new u0c(10, xt4Var17);
                    rv4Var2.o0(P14);
                } else {
                    xt4Var17 = xt4Var6;
                }
                l0e.j(A11, m3, i16, q9, (xt4) P14, rv4Var2, 0);
                xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
                rv4Var2.t();
            }
            f9 = pna.f(kq7Var, 1.0f);
            nq7 q10 = q(3, null, rv4Var2, f9);
            String A12 = yqe.A((y3b) f3b.p.getValue(), rv4Var2);
            boolean z21 = (i10 & 1879048192) == 536870912;
            Object P15 = rv4Var2.P();
            if (z21 || P15 == lh9Var) {
                P15 = new a3c(4, vt4Var);
                rv4Var2.o0(P15);
            }
            l0e.l(null, A12, null, q10, (vt4) P15, rv4Var2, 0, 5);
            rv4Var2.s();
            xbe.i(rv4Var2, mwe.u(zbe.C(kq7Var, nae.e, nae.e, nae.e, 12.0f, 7), false, 14));
            rv4Var2.s();
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            String str4 = p6cVar.b;
            List list2 = p6cVar.c;
            List list3 = p6cVar.d;
            int i17 = p6cVar.j;
            float f21 = p6cVar.k;
            boolean f22 = rv4Var2.f(aw7Var);
            Object P16 = rv4Var2.P();
            if (f22 || P16 == lh9Var) {
                P16 = new g0c(aw7Var, 12);
                rv4Var2.o0(P16);
            }
            xt4 xt4Var22 = (xt4) P16;
            int i18 = i13 & 14;
            boolean z22 = i18 == 4;
            Object P17 = rv4Var2.P();
            if (z22 || P17 == lh9Var) {
                xt4Var18 = xt4Var7;
                P17 = new u0c(11, xt4Var18);
                rv4Var2.o0(P17);
            } else {
                xt4Var18 = xt4Var7;
            }
            xt4 xt4Var23 = (xt4) P17;
            boolean z23 = (i13 & Token.ASSIGN_MOD) == 32;
            Object P18 = rv4Var2.P();
            if (z23 || P18 == lh9Var) {
                list = list3;
                P18 = new u0c(12, xt4Var8);
                rv4Var2.o0(P18);
            } else {
                list = list3;
            }
            xt4 xt4Var24 = (xt4) P18;
            boolean z24 = (i13 & 896) == 256;
            Object P19 = rv4Var2.P();
            if (z24 || P19 == lh9Var) {
                xt4Var20 = xt4Var9;
                P19 = new u0c(13, xt4Var20);
                rv4Var2.o0(P19);
            } else {
                xt4Var20 = xt4Var9;
            }
            xt4 xt4Var25 = (xt4) P19;
            boolean z25 = (i13 & 7168) == 2048;
            Object P20 = rv4Var2.P();
            if (z25 || P20 == lh9Var) {
                i5 = i13;
                P20 = new u0c(2, xt4Var10);
                rv4Var2.o0(P20);
            } else {
                i5 = i13;
            }
            xt4 xt4Var26 = (xt4) P20;
            boolean z26 = (i5 & i3) == 16384;
            Object P21 = rv4Var2.P();
            if (z26 || P21 == lh9Var) {
                xt4Var21 = xt4Var26;
                P21 = new u0c(3, xt4Var11);
                rv4Var2.o0(P21);
            } else {
                xt4Var21 = xt4Var26;
            }
            xt4 xt4Var27 = (xt4) P21;
            boolean z27 = (i5 & i4) == 131072;
            Object P22 = rv4Var2.P();
            if (z27 || P22 == lh9Var) {
                xt4Var15 = xt4Var12;
                P22 = new u0c(4, xt4Var15);
                rv4Var2.o0(P22);
            } else {
                xt4Var15 = xt4Var12;
            }
            lpe.i(booleanValue, str4, list2, list, i17, f21, xt4Var22, xt4Var23, xt4Var24, xt4Var25, xt4Var21, xt4Var27, (xt4) P22, rv4Var2, 0);
            boolean booleanValue2 = ((Boolean) aw7Var2.getValue()).booleanValue();
            String str5 = p6cVar.n;
            boolean f23 = rv4Var2.f(aw7Var2);
            Object P23 = rv4Var2.P();
            if (f23 || P23 == lh9Var) {
                P23 = new g0c(aw7Var2, 11);
                rv4Var2.o0(P23);
            }
            xt4 xt4Var28 = (xt4) P23;
            boolean z28 = (i18 == 4) | ((i10 & 14) == 4);
            Object P24 = rv4Var2.P();
            if (z28 || P24 == lh9Var) {
                P24 = new t3c(1, p6cVar, xt4Var18);
                rv4Var2.o0(P24);
            }
            c16.e(booleanValue2, mvVar, str5, xt4Var28, (xt4) P24, rv4Var2, 0);
        } else {
            xt4Var15 = xt4Var12;
            xt4Var16 = xt4Var5;
            xt4Var17 = xt4Var6;
            xt4Var18 = xt4Var7;
            xt4Var19 = xt4Var3;
            xt4Var20 = xt4Var9;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final xt4 xt4Var29 = xt4Var18;
            final xt4 xt4Var30 = xt4Var20;
            final xt4 xt4Var31 = xt4Var19;
            final xt4 xt4Var32 = xt4Var15;
            final xt4 xt4Var33 = xt4Var17;
            final xt4 xt4Var34 = xt4Var16;
            u.e(new lu4() { // from class: o6c
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p10 = xoe.p(i | 1);
                    sye.g(p6c.this, nq7Var, rh8Var, xt4Var, xt4Var2, xt4Var31, xt4Var4, xt4Var34, xt4Var33, vt4Var, xt4Var29, xt4Var8, xt4Var30, xt4Var10, xt4Var11, xt4Var32, xt4Var13, xt4Var14, (rv4) obj, p10);
                    return pvc.a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0362  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r48, int r49, defpackage.xt4 r50, defpackage.rv4 r51, defpackage.nq7 r52) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sye.h(int, int, xt4, rv4, nq7):void");
    }

    public static final void i(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(9123650);
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
                w6c w6cVar = (w6c) ((fdd) voe.z(cm9.a(w6c.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                rv4Var2 = rv4Var;
                fxe.h(yqe.A((y3b) b3b.K0.getValue(), rv4Var), pna.c, false, jce.E(702495046, new ri9(cz7Var, 27), rv4Var), null, null, jce.E(-1496259817, new cs1(w6cVar, cz7Var, jsc.z(w6cVar.d, rv4Var), 22), rv4Var), rv4Var2, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 28);
        }
    }

    public static final float j(float f) {
        float f2 = f * 10.0f;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        return i / 10.0f;
    }

    public static boolean k(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (k(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(java.util.ArrayList r10, defpackage.s11 r11, defpackage.isc r12, java.nio.charset.Charset r13, defpackage.n42 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.v12
            if (r0 == 0) goto L13
            r0 = r14
            v12 r0 = (defpackage.v12) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v12 r0 = new v12
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            isc r12 = r0.b
            s11 r11 = r0.a
            defpackage.hre.r(r14)
            goto L59
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r3
        L30:
            defpackage.hre.r(r14)
            s02 r5 = new s02
            r14 = 4
            r5.<init>(r10, r14)
            u12 r4 = new u12
            r9 = 0
            r8 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            w12 r10 = new w12
            r11 = 0
            r10.<init>(r8, r3, r11)
            r0.a = r8
            r0.b = r7
            r0.d = r2
            java.lang.Object r14 = defpackage.z1d.F(r4, r10, r0)
            n82 r10 = defpackage.n82.a
            if (r14 != r10) goto L57
            return r10
        L57:
            r12 = r7
            r11 = r8
        L59:
            if (r14 != 0) goto L84
            boolean r10 = r11.i()
            if (r10 != 0) goto L62
            return r11
        L62:
            t76 r10 = r12.b
            if (r10 == 0) goto L6f
            boolean r10 = r10.a()
            if (r10 != r2) goto L6f
            m68 r10 = defpackage.m68.a
            return r10
        L6f:
            e60 r10 = new e60
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "No suitable converter found for "
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 5
            r10.<init>(r12, r11, r3)
            throw r10
        L84:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sye.l(java.util.ArrayList, s11, isc, java.nio.charset.Charset, n42):java.lang.Object");
    }

    public static final nq7 n() {
        return c86.b;
    }

    public static final nq7 q(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        if ((i & 2) != 0) {
            vt4Var = null;
        }
        nq7 a0 = nq7Var.a0(kq7.a);
        tza tzaVar = j27.a;
        nq7 v = nmd.v(tte.k(a0, ((h27) rv4Var.j(tzaVar)).c.a), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g);
        if (vt4Var != null) {
            v = lbe.f(15, vt4Var, v, null, false);
        }
        return zbe.y(v, 16.0f);
    }

    public abstract Object m(m42 m42Var);

    public abstract Object o(Uri uri, InputEvent inputEvent, m42 m42Var);

    public abstract Object p(Uri uri, m42 m42Var);
}
