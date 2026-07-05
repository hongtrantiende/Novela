package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hif  reason: default package */
/* loaded from: classes.dex */
public abstract class hif {
    public static final tu1 a = new tu1(new lv1(24), false, 1980858833);
    public static final uk b = new uk(21);

    public static final void a(cnb cnbVar, kob kobVar, qxb qxbVar, h2a h2aVar, e6c e6cVar, cyb cybVar, j2c j2cVar, sxb sxbVar, ymb ymbVar, rh8 rh8Var, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        boolean z;
        nq7 h;
        nq7 h2;
        nk0 nk0Var = kh5.D;
        nk0 nk0Var2 = kh5.b;
        nk0 nk0Var3 = kh5.e;
        cnbVar.getClass();
        kobVar.getClass();
        qxbVar.getClass();
        e6cVar.getClass();
        j2cVar.getClass();
        sxbVar.getClass();
        ymbVar.getClass();
        rh8Var.getClass();
        vt4Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-400844592);
        if ((i & 6) == 0) {
            i3 = (rv4Var.f(cnbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rv4Var.f(kobVar) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = Token.CASE;
        if (i5 == 0) {
            i3 |= rv4Var.f(qxbVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= rv4Var.f(h2aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rv4Var.f(e6cVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= rv4Var.f(cybVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i3 |= rv4Var.f(j2cVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rv4Var.f(sxbVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= rv4Var.f(ymbVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rv4Var.f(rh8Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rv4Var.f(nq7Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rv4Var.h(vt4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rv4Var.h(xt4Var2) ? 2048 : 1024;
        }
        int i7 = i4;
        int i8 = i3;
        if (rv4Var.U(i8 & 1, ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            WeakHashMap weakHashMap = yjd.w;
            ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            int i9 = i8 & 1879048192;
            boolean f = (i9 == 536870912) | rv4Var.f(o);
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (f || P == obj2) {
                obj = obj2;
                z = true;
                P = mwe.r(mwe.r(zbe.j(nae.e, rh8Var.d(), nae.e, rh8Var.a(), 5), o), zbe.h(1, nae.e));
                rv4Var.o0(P);
            } else {
                obj = obj2;
                z = true;
            }
            kq7 kq7Var = kq7.a;
            nk0 nk0Var4 = nk0Var3;
            Object obj3 = obj;
            hc2.b(zbe.x(kq7Var, (rh8) P), null, jce.E(1053794476, new d52(h2aVar, cybVar, kobVar, e6cVar, j2cVar, sxbVar, ymbVar, vt4Var, xt4Var, xt4Var2, 0), rv4Var), rv4Var, 3072, 6);
            tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            boolean d2 = (i9 == 536870912) | rv4Var.d(tc6Var.ordinal());
            Object P2 = rv4Var.P();
            if (d2 || P2 == obj3) {
                P2 = zbe.j(zbe.o(rh8Var, tc6Var), nae.e, zbe.n(rh8Var, tc6Var), nae.e, 10);
                rv4Var.o0(P2);
            }
            rh8 rh8Var2 = (rh8) P2;
            boolean z2 = i9 == 536870912;
            Object P3 = rv4Var.P();
            if (z2 || P3 == obj3) {
                Object rg3Var = new rg3(rh8Var.d());
                rv4Var.o0(rg3Var);
                P3 = rg3Var;
            }
            float f2 = ((rg3) P3).a;
            boolean z3 = i9 == 536870912;
            Object P4 = rv4Var.P();
            if (z3 || P4 == obj3) {
                Object rg3Var2 = new rg3(rh8Var.a());
                rv4Var.o0(rg3Var2);
                P4 = rg3Var2;
            }
            float f3 = ((rg3) P4).a;
            String str = cnbVar.b;
            nk0 nk0Var5 = rg3.a(f2, 20.0f) <= 0 ? nk0Var4 : nk0Var2;
            nq7 x = zbe.x(zbe.x(pna.f(kq7Var, 1.0f), o), rh8Var2);
            pu0 pu0Var = pu0.a;
            nq7 a2 = pu0Var.a(x, nk0Var2);
            if (rg3.a(f2, 20.0f) <= 0) {
                h = pna.h(kq7Var, 20.0f + f2);
            } else {
                h = pna.h(zbe.C(kq7Var, nae.e, 10.0f, nae.e, nae.e, 13), 10.0f + f2);
            }
            eg0.j(str, nk0Var5, a2.a0(h), rv4Var, 0);
            int i10 = cnbVar.a;
            int i11 = cnbVar.c;
            int i12 = qxbVar.b;
            int i13 = qxbVar.c;
            if (rg3.a(f2, 20.0f) > 0) {
                nk0Var4 = nk0Var;
            }
            nq7 a3 = pu0Var.a(zbe.x(zbe.x(pna.f(kq7Var, 1.0f), o), rh8Var2), nk0Var);
            if (rg3.a(f3, 20.0f) <= 0) {
                h2 = pna.h(kq7Var, f3 + 20.0f);
            } else {
                h2 = pna.h(zbe.C(kq7Var, nae.e, nae.e, nae.e, 10.0f, 7), 10.0f + f3);
            }
            iwe.a(i10, i11, i12, i13, nk0Var4, a3.a0(h2), rv4Var, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new y71(cnbVar, kobVar, qxbVar, h2aVar, e6cVar, cybVar, j2cVar, sxbVar, ymbVar, rh8Var, nq7Var, vt4Var, xt4Var, xt4Var2, i, i2);
        }
    }

    public static final long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final void c(final su0 su0Var, final wh8 wh8Var, final long j, final cyb cybVar, final j2c j2cVar, final sxb sxbVar, final ymb ymbVar, nq7 nq7Var, final vt4 vt4Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        final nq7 nq7Var2;
        rv4Var.g0(894077219);
        int i11 = 4;
        if (rv4Var.f(su0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (rv4Var.f(wh8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var.e(j)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var.f(cybVar)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (rv4Var.f(j2cVar)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (rv4Var.f(sxbVar)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i7;
        if (rv4Var.f(ymbVar)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (rv4Var.h(vt4Var)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(xt4Var)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i20 = i19 | i10;
        if (!rv4Var.h(xt4Var2)) {
            i11 = 2;
        }
        if ((306783379 & i20) == 306783378 && (i11 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i20 & 1, z)) {
            if (wh8Var instanceof gwb) {
                rv4Var.e0(-1932276785);
                gwb gwbVar = (gwb) wh8Var;
                bce.e(gwbVar.d, j, (jwb) sl1.c0(gwbVar.g.f), cybVar, j2cVar, sxbVar, ymbVar, pna.v(nq7Var), rv4Var, ((i20 >> 3) & Token.ASSIGN_MOD) | 512 | (i20 & 7168) | (57344 & i20) | (458752 & i20) | (i20 & 3670016));
                rv4Var.q(false);
                nq7Var2 = nq7Var;
            } else if (wh8Var instanceof j0b) {
                rv4Var.e0(-1931817334);
                nq7Var2 = nq7Var;
                bce.g((j0b) wh8Var, pna.h(nq7Var2, su0Var.c()), xt4Var, xt4Var2, rv4Var, ((i20 >> 21) & 896) | ((i20 >> 3) & 14) | ((i11 << 9) & 7168));
                rv4Var.q(false);
            } else {
                nq7Var2 = nq7Var;
                if (wh8Var instanceof dt3) {
                    rv4Var.e0(-1931553183);
                    bce.f((i20 >> 21) & Token.ASSIGN_MOD, vt4Var, rv4Var, pna.v(nq7Var2));
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1931395393);
                    rv4Var.q(false);
                }
            }
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(wh8Var, j, cybVar, j2cVar, sxbVar, ymbVar, nq7Var2, vt4Var, xt4Var, xt4Var2, i) { // from class: r52
                public final /* synthetic */ ymb C;
                public final /* synthetic */ nq7 D;
                public final /* synthetic */ vt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ wh8 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ cyb d;
                public final /* synthetic */ j2c e;
                public final /* synthetic */ sxb f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(12582913);
                    hif.c(su0.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a2, code lost:
        if (r5 == defpackage.ax1.a) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.rj8 r17, int r18, int r19, defpackage.nq7 r20, defpackage.xt4 r21, defpackage.rv4 r22, int r23) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hif.d(rj8, int, int, nq7, xt4, rv4, int):void");
    }

    public static final void e(int i, int i2, nq7 nq7Var, rj8 rj8Var, tu1 tu1Var, tu1 tu1Var2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        rv4Var.g0(1462030936);
        if (rv4Var.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i3 | i4;
        if (rv4Var.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i8 = i7 | i5;
        if (rv4Var.f(rj8Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i9 = i8 | i6;
        if ((74899 & i9) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            rv4Var.Z();
            if ((i3 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 z3 = zbe.z(pna.f(kq7Var, 1.0f), 18.0f, 8.0f);
            boolean h = rv4Var.h(m82Var);
            if ((((i9 & 7168) ^ 3072) > 2048 && rv4Var.f(rj8Var)) || (i9 & 3072) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h | z2;
            Object P2 = rv4Var.P();
            if (z4 || P2 == obj) {
                P2 = new bs1(9, m82Var, rj8Var);
                rv4Var.o0(P2);
            }
            int i10 = (i9 >> 9) & 14;
            int i11 = i9 << 3;
            d(rj8Var, i, i2, z3, (xt4) P2, rv4Var, i10 | 3072 | (i11 & Token.ASSIGN_MOD) | (i11 & 896));
            kxe.c(rj8Var, rs8.e(1.0f, pna.f(kq7Var, 1.0f), true), null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(-673461887, new oh7(tu1Var, tu1Var2, 1), rv4Var), rv4Var, i10, 24576, 16380);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ph7(i, i2, nq7Var, rj8Var, tu1Var, tu1Var2, i3, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
        if (r3 == defpackage.ax1.a) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.wzc r34, defpackage.nq7 r35, defpackage.rv4 r36, int r37) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hif.f(wzc, nq7, rv4, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
        if (r14 == r0) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.util.List r32, boolean r33, defpackage.rh8 r34, defpackage.nq7 r35, defpackage.vt4 r36, defpackage.xt4 r37, defpackage.xt4 r38, defpackage.rv4 r39, int r40) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hif.g(java.util.List, boolean, rh8, nq7, vt4, xt4, xt4, rv4, int):void");
    }

    public static final void h(int i, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        rh8 rh8Var2;
        int i3;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(81179630);
        if ((i & 6) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
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
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var2, d);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var2)), zbe.j(nae.e, 68.0f, nae.e, nae.e, 13));
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            ArrayList arrayList = P;
            if (P == lh9Var) {
                ArrayList arrayList2 = new ArrayList(10);
                for (int i5 = 0; i5 < 10; i5++) {
                    arrayList2.add(Integer.valueOf(i5));
                }
                rv4Var2.o0(arrayList2);
                arrayList = arrayList2;
            }
            List list = (List) arrayList;
            bkd r2 = mwe.r(r, zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            bkd r3 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            f25 f25Var = new f25(320.0f);
            hz hzVar = new hz(4.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            ze4 ze4Var = pna.c;
            boolean h = rv4Var2.h(list);
            Object P2 = rv4Var2.P();
            if (h || P2 == lh9Var) {
                P2 = new vd1(6, list);
                rv4Var2.o0(P2);
            }
            rh8Var2 = rh8Var;
            pc2.d(f25Var, ze4Var, null, r2, hzVar, hzVar2, null, false, 0L, 0L, r3, nae.e, (xt4) P2, rv4Var, 102432816, 0, 5780);
            rv4Var2 = rv4Var;
            dpe.g(pna.h(mwe.u(zbe.z(zbe.x(pna.f(kq7.a, 1.0f), rh8Var2), 16.0f, 12.0f), false, 6), 40.0f), uu9.a, rv4Var2, 0, 0);
            rv4Var2.q(true);
        } else {
            rh8Var2 = rh8Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new d33(rh8Var2, nq7Var, i, 5);
        }
    }

    public static final void i(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        rv4 rv4Var2 = rv4Var;
        cz7Var.getClass();
        rv4Var2.g0(-1865593122);
        if (rv4Var2.f(cz7Var)) {
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
        if (rv4Var2.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                g0d g0dVar = (g0d) ((fdd) voe.z(cm9.a(g0d.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                aw7 z2 = jsc.z(g0dVar.d, rv4Var2);
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = yae.z(null);
                    rv4Var2.o0(P);
                }
                aw7 aw7Var = (aw7) P;
                Object[] objArr = new Object[0];
                Object P2 = rv4Var2.P();
                if (P2 == lh9Var) {
                    P2 = new tvc(10);
                    rv4Var2.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P2, rv4Var2, 48);
                fxe.h(yqe.A((y3b) x2b.U.getValue(), rv4Var2), pna.c, false, jce.E(-439494430, new ebc(cz7Var, 8), rv4Var2), jce.b, null, jce.E(-1706605389, new q7(g0dVar, aw7Var2, z2, aw7Var), rv4Var2), rv4Var, 1600560, 36);
                rv4Var2 = rv4Var;
                wzc wzcVar = (wzc) aw7Var.getValue();
                if (wzcVar == null) {
                    rv4Var2.e0(-1006305889);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-1006305888);
                    boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                    boolean f = rv4Var2.f(aw7Var2);
                    Object P3 = rv4Var2.P();
                    if (f || P3 == lh9Var) {
                        P3 = new ozc(aw7Var2, 4);
                        rv4Var2.o0(P3);
                    }
                    xt4 xt4Var = (xt4) P3;
                    boolean f2 = rv4Var2.f(aw7Var2) | rv4Var2.f(g0dVar) | rv4Var2.h(wzcVar);
                    Object P4 = rv4Var2.P();
                    if (f2 || P4 == lh9Var) {
                        P4 = new r6a(23, g0dVar, wzcVar, aw7Var2);
                        rv4Var2.o0(P4);
                    }
                    xt4 xt4Var2 = (xt4) P4;
                    boolean f3 = rv4Var2.f(g0dVar) | rv4Var2.h(wzcVar);
                    Object P5 = rv4Var2.P();
                    if (f3 || P5 == lh9Var) {
                        P5 = new t3c(13, g0dVar, wzcVar);
                        rv4Var2.o0(P5);
                    }
                    p1d.c(wzcVar, booleanValue, xt4Var, xt4Var2, (xt4) P5, rv4Var2, 8);
                    rv4Var2.q(false);
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ebc(cz7Var, i, 9);
        }
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        throw xm8.a(null, str);
    }

    public static void k(ljc ljcVar, int i, BlurMaskFilter blurMaskFilter, int i2) {
        int i3;
        long j = zl1.b;
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            blurMaskFilter = null;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ljcVar.p(j);
        ljcVar.o(i);
        ljcVar.x(i3);
        ((Paint) ljcVar.b).setMaskFilter(blurMaskFilter);
    }

    public static boolean l() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            qf4.d();
            qf4 d = qf4.d();
            d.a();
            Context context = d.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Token.CASE)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean m(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static cca n(Set set, i39 i39Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof cca) {
                cca ccaVar = (cca) sortedSet;
                i39 i39Var2 = ccaVar.b;
                i39Var2.getClass();
                return new cca((SortedSet) ccaVar.a, new j39(Arrays.asList(i39Var2, i39Var)));
            }
            return new cca(sortedSet, i39Var);
        } else if (set instanceof cca) {
            cca ccaVar2 = (cca) set;
            i39 i39Var3 = ccaVar2.b;
            i39Var3.getClass();
            return new cca(ccaVar2.a, new j39(Arrays.asList(i39Var3, i39Var)));
        } else {
            set.getClass();
            return new cca(set, i39Var);
        }
    }

    public static int o(int i) {
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case 12:
                        return 7000;
                    default:
                        switch (i) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case 16:
                                return 256000;
                            case 17:
                                return 336000;
                            case 18:
                                return 768000;
                            default:
                                return -2147483647;
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }

    public static int p(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    public static bca q(Set set, ts5 ts5Var) {
        wq9.z(set, "set1");
        wq9.z(ts5Var, "set2");
        return new bca(set, ts5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149  */
    /* JADX WARN: Type inference failed for: r5v2, types: [nkc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hif.r(android.content.Intent):void");
    }

    public static void s(String str, Bundle bundle) {
        String str2;
        try {
            qf4.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            if (fz4.Y(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            wc wcVar = (wc) qf4.d().b(wc.class);
            if (wcVar != null) {
                ((xc) wcVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final int t(wh6 wh6Var, boolean z) {
        int i;
        int a2;
        if (z) {
            i = wh6Var.c();
            a2 = wh6Var.f();
        } else {
            i = wh6Var.i();
            a2 = wh6Var.a();
        }
        return a2 + i;
    }

    public static final long u(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long v(long j) {
        int round = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static boolean w(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final List x(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return ks3.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            wh6 wh6Var = (wh6) arrayList.get(i3);
            int index = wh6Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(wh6Var);
            }
        }
        wl1.O(b, arrayList2);
        return arrayList2;
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String o = eub.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o), (Throwable) e);
            return hl5.o("<", o, " threw ", e.getClass().getName(), ">");
        }
    }

    public static String z(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(y(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(y(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
