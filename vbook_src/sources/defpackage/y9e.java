package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.vbook.android.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y9e  reason: default package */
/* loaded from: classes.dex */
public abstract class y9e {
    public static final tu1 a = new tu1(new ov1(18), false, -2042479727);
    public static final tu1 b = new tu1(new nv1(21), false, -924802239);
    public static final tu1 c = new tu1(new nv1(22), false, -2071213052);
    public static final tu1 d = new tu1(new ov1(19), false, 1657354632);
    public static final String[] e = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f = {44100, 48000, 32000};
    public static final int[] g = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] i = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] j = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] k = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final Object l = new Object();
    public static boolean m = false;
    public static Method n;

    public static final void a(final String str, final long j2, final long j3, rv4 rv4Var, final int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        rv4Var.g0(1706611596);
        if ((i2 & 48) == 0) {
            if (rv4Var.e(j2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.e(j3)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            int i6 = i3 << 3;
            v9b.a(null, ((h27) rv4Var.j(j27.a)).c.a, j2, j3, 2.0f, nae.e, null, jce.E(-379733081, new jd1(str, 12), rv4Var), rv4Var, (i6 & 896) | 12607488 | (i6 & 7168), 97);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: ng7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y9e.a(str, j2, j3, (rv4) obj, xoe.p(i2 | 1));
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    public static final void b(boolean z, l54 l54Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        vt4 vt4Var4;
        boolean z3;
        lh9 lh9Var;
        np npVar;
        boolean z4;
        ?? r15;
        float f2;
        ?? r3;
        lh9 lh9Var2;
        float f3;
        float f4;
        wk3 wk3Var;
        boolean z5;
        boolean z6;
        l54 l54Var2 = l54Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-71411820);
        if (rv4Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var2.f(l54Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (rv4Var2.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i11 = i10 | i5;
        if (rv4Var2.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (rv4Var2.h(vt4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7;
        if (rv4Var2.h(vt4Var3)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i8;
        if ((74899 & i14) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i14 & 1, z2)) {
            rv4Var2.e0(92726946);
            if ((i14 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var3 = ax1.a;
            if (z3 || P == lh9Var3) {
                P = new ge5(27, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 f5 = lbe.f(15, (vt4) P, nq7Var, null, false);
            if (z) {
                rv4Var2.e0(-2139201863);
                lh9Var = lh9Var3;
                f5 = nmd.v(f5, rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f), lre.g);
                rv4Var2.q(false);
            } else {
                lh9Var = lh9Var3;
                rv4Var2.e0(-2139091720);
                rv4Var2.q(false);
            }
            rv4Var2.q(false);
            mk0 mk0Var = kh5.F;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f5);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar2 = qw1.f;
            jce.F(npVar2, rv4Var2, a2);
            np npVar3 = qw1.e;
            jce.F(npVar3, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar4 = qw1.g;
            jce.F(npVar4, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar5 = qw1.d;
            jce.F(npVar5, rv4Var2, p);
            float f6 = 1.0f;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f6 = Float.MAX_VALUE;
            }
            nq7 z7 = zbe.z(new we6(f6, true), 16.0f, 6.0f);
            mk0 mk0Var2 = kh5.G;
            gv9 a3 = ev9.a(dzVar, mk0Var2, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z7);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar2, rv4Var2, a3);
            jce.F(npVar3, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar4, rv4Var2, kgVar);
            jce.F(npVar5, rv4Var2, p2);
            kq7 kq7Var = kq7.a;
            nq7 n2 = pna.n(kq7Var, 42.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, n2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar2, rv4Var2, d2);
            jce.F(npVar3, rv4Var2, l4);
            s21.t(hashCode3, rv4Var2, npVar4, rv4Var2, kgVar);
            jce.F(npVar5, rv4Var2, p3);
            String str = l54Var.a;
            boolean z8 = l54Var.q;
            String str2 = l54Var.k;
            h54 h54Var = new h54(l54Var.r, str, l54Var.c);
            u22 u22Var = r0f.d;
            pu0 pu0Var = pu0.a;
            lh9 lh9Var4 = lh9Var;
            do5.a(h54Var, u22Var, false, null, null, null, tte.k(pu0Var.b(), r0f.z(rv4Var2).b), null, rv4Var, 48, 892);
            nq7 y = zbe.y(pu0Var.a(kq7Var, kh5.c), 3.0f);
            lk0 lk0Var = kh5.K;
            ez ezVar = lz.c;
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 48);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, y);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a4);
            jce.F(npVar3, rv4Var, l5);
            s21.t(hashCode4, rv4Var, npVar4, rv4Var, kgVar);
            jce.F(npVar5, rv4Var, p4);
            if (l54Var.n) {
                rv4Var.e0(280044397);
                npVar = npVar5;
                a("DEV", r0f.y(rv4Var).l, r0f.y(rv4Var).m, rv4Var, 6);
                z4 = false;
                hl5.w(kq7Var, 2.0f, rv4Var, false);
            } else {
                npVar = npVar5;
                z4 = false;
                rv4Var.e0(280410538);
                rv4Var.q(false);
            }
            if (l54Var.h) {
                rv4Var.e0(280461130);
                boolean z9 = z4;
                a("18+", sve.d(4289930782L), zl1.e, rv4Var, 438);
                rv4Var.q(z9);
                r15 = z9;
            } else {
                boolean z10 = z4;
                rv4Var.e0(280707146);
                rv4Var.q(z10);
                r15 = z10;
            }
            rv4Var.q(true);
            rv4Var.q(true);
            xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
            xn1 a5 = wn1.a(ezVar, kh5.I, rv4Var, r15);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l6 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, we6Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a5);
            jce.F(npVar3, rv4Var, l6);
            s21.t(hashCode5, rv4Var, npVar4, rv4Var, kgVar);
            jce.F(npVar, rv4Var, p5);
            cvb.c(l54Var.b, l0e.u(kq7Var), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, r0f.A(rv4Var).j, rv4Var, 48, 24576, 114684);
            nq7 f7 = hl5.f(kq7Var, 2.0f, rv4Var, kq7Var, 1.0f);
            gv9 a6 = ev9.a(dzVar, mk0Var2, rv4Var, 48);
            int hashCode6 = Long.hashCode(rv4Var.T);
            xt8 l7 = rv4Var.l();
            nq7 p6 = lye.p(rv4Var, f7);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar2, rv4Var, a6);
            jce.F(npVar3, rv4Var, l7);
            s21.t(hashCode6, rv4Var, npVar4, rv4Var, kgVar);
            jce.F(npVar, rv4Var, p6);
            if (str2.length() > 0) {
                rv4Var.e0(1793529346);
                do5.e(str2, pna.s(kq7Var, 20.0f), rv4Var, 48);
                r3 = 0;
                rs8.v(kq7Var, 6.0f, rv4Var, false);
            } else {
                r3 = 0;
                rv4Var.e0(1793784972);
                rv4Var.q(false);
            }
            l54Var2 = l54Var;
            cvb.c(l54Var2.d, null, zl1.b(0.5f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 24576, 114682);
            rv4Var.q(true);
            rv4Var.q(true);
            if (z) {
                rv4Var.e0(-1836353261);
                ar5 c2 = rp5.c((wk3) ok3.p0.getValue(), rv4Var, r3);
                long j2 = r0f.y(rv4Var).q;
                nq7 k2 = tte.k(pna.n(kq7Var, 34.0f), uu9.a);
                if ((i14 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = r3;
                }
                Object P2 = rv4Var.P();
                lh9Var2 = lh9Var4;
                if (!z6 && P2 != lh9Var2) {
                    vt4Var4 = vt4Var3;
                } else {
                    vt4Var4 = vt4Var3;
                    P2 = new ge5(28, vt4Var4);
                    rv4Var.o0(P2);
                }
                nq7 f8 = lbe.f(15, (vt4) P2, k2, null, r3);
                f3 = 6.0f;
                nk5.a(c2, null, zbe.y(f8, 6.0f), j2, rv4Var, 48, 0);
                rv4Var.q(r3);
            } else {
                vt4Var4 = vt4Var3;
                lh9Var2 = lh9Var4;
                f3 = 6.0f;
                rv4Var.e0(-1835952090);
                rv4Var.q(r3);
            }
            rv4Var.q(true);
            if (z8) {
                f4 = 0.0f;
            } else {
                f4 = 35.0f;
            }
            yya b2 = nq.b(f4, null, null, rv4Var, 0, 30);
            rv4Var2 = rv4Var;
            if (z8) {
                wk3Var = (wk3) ok3.s.getValue();
            } else {
                wk3Var = (wk3) ok3.r.getValue();
            }
            ar5 c3 = rp5.c(wk3Var, rv4Var2, r3);
            nq7 n3 = pna.n(zbe.C(new k5d(mk0Var2), nae.e, nae.e, f3, nae.e, 11), 32.0f);
            if ((i14 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = r3;
            }
            Object P3 = rv4Var2.P();
            if (z5 || P3 == lh9Var2) {
                P3 = new ge5(29, vt4Var2);
                rv4Var2.o0(P3);
            }
            nk5.a(c3, null, tte.t(zbe.y(q1d.b(n3, r3, nae.e, (vt4) P3, 3), 4.0f), ((Number) b2.getValue()).floatValue()), 0L, rv4Var2, 48, 8);
            rv4Var2.q(true);
        } else {
            vt4Var4 = vt4Var3;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ds1(z, (Object) l54Var2, nq7Var, (hu4) vt4Var, (hu4) vt4Var2, (hu4) vt4Var4, i2, 5);
        }
    }

    public static final void c(List list, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h2;
        int i8;
        rv4Var.g0(-491160957);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rv4Var.f(list);
            } else {
                h2 = rv4Var.h(list);
            }
            if (h2) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        } else {
            obj = xt4Var;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            obj2 = xt4Var3;
            if (rv4Var.h(obj2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        } else {
            obj2 = xt4Var3;
        }
        int i9 = i3;
        boolean z5 = false;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if ((i9 & 14) != 4 && ((i9 & 8) == 0 || !rv4Var.h(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            if ((i9 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((57344 & i9) == 16384) {
                z5 = true;
            }
            boolean z8 = z7 | z5;
            Object P = rv4Var.P();
            if (z8 || P == ax1.a) {
                hq hqVar = new hq((Object) list, obj, xt4Var2, (hu4) obj2, 17);
                rv4Var.o0(hqVar);
                P = hqVar;
            }
            jce.d(nq7Var, null, null, false, null, null, null, false, null, (xt4) P, rv4Var, (i9 >> 3) & 14, 510);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1(list, nq7Var, xt4Var, xt4Var2, xt4Var3, i2);
        }
    }

    public static final void d(m54 m54Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        Object obj;
        float f2;
        int i7;
        rv4Var.g0(-1893337666);
        if (rv4Var.f(m54Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var3)) {
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
        if (rv4Var.U(i11 & 1, z)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (P == obj2) {
                P = new qx6(28);
                rv4Var.o0(P);
            }
            aw7 j2 = zpe.j(objArr, (vt4) P, rv4Var, 384);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
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
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            boolean z3 = m54Var.a;
            List list = m54Var.b;
            if (z3) {
                rv4Var.e0(-416992505);
                rv4Var.q(false);
                i7 = 0;
                f2 = 1.0f;
            } else {
                rv4Var.e0(-416912587);
                boolean f3 = rv4Var.f((jub) j2.getValue()) | rv4Var.f(list);
                Object P2 = rv4Var.P();
                if (!f3 && P2 != obj2) {
                    z2 = true;
                    obj = P2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        l54 l54Var = (l54) obj3;
                        if (k4b.V(l54Var.b, ((jub) j2.getValue()).a.b, true) || k4b.V(l54Var.d, ((jub) j2.getValue()).a.b, true)) {
                            arrayList.add(obj3);
                        }
                    }
                    z2 = true;
                    rv4Var.o0(arrayList);
                    obj = arrayList;
                }
                f2 = 1.0f;
                c((List) obj, new we6(1.0f, z2), xt4Var, xt4Var2, xt4Var3, rv4Var, i11 & 65408);
                i7 = 0;
                rv4Var.q(false);
            }
            nq7 z4 = zbe.z(pna.f(kq7.a, f2), 16.0f, 6.0f);
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var, i7);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, z4);
            rw1.k.getClass();
            vt4 vt4Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a3);
            jce.F(qw1.e, rv4Var, l3);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p2);
            jub jubVar = (jub) j2.getValue();
            String A = yqe.A((y3b) b3b.O.getValue(), rv4Var);
            we6 we6Var = new we6(1.0f, true);
            boolean f4 = rv4Var.f(j2);
            Object P3 = rv4Var.P();
            if (f4 || P3 == obj2) {
                P3 = new ig7(j2, 3);
                rv4Var.o0(P3);
            }
            xxe.m(jubVar, A, 0L, 0L, null, null, we6Var, null, (xt4) P3, null, rv4Var, 0, 700);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0((Object) m54Var, nq7Var, xt4Var, xt4Var2, (hu4) xt4Var3, i2, 13);
        }
    }

    public static final void e(boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        xt4 xt4Var4;
        xt4 xt4Var5;
        xt4 xt4Var6;
        rv4 rv4Var2;
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(-208219599);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (rv4Var.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rv4Var2 = rv4Var;
            f(z, xt4Var, xt4Var2, xt4Var3, rv4Var2, i10 & 8190);
            z3 = z;
            xt4Var4 = xt4Var;
            xt4Var5 = xt4Var2;
            xt4Var6 = xt4Var3;
        } else {
            z3 = z;
            xt4Var4 = xt4Var;
            xt4Var5 = xt4Var2;
            xt4Var6 = xt4Var3;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new mg7(z3, xt4Var4, xt4Var5, xt4Var6, i2, 0);
        }
    }

    public static final void f(boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-1474518208);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, 380.0f, jce.E(1077897265, new ax(2, xt4Var2, xt4Var3, xt4Var), rv4Var), rv4Var, (i10 & 14) | 905972736 | (i10 & Token.ASSIGN_MOD), 244);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mg7(z, xt4Var, xt4Var2, xt4Var3, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final boolean r31, final boolean r32, final boolean r33, final defpackage.nq7 r34, final defpackage.vt4 r35, final defpackage.vt4 r36, final defpackage.vt4 r37, final defpackage.vt4 r38, final defpackage.vt4 r39, defpackage.rv4 r40, final int r41) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9e.g(boolean, boolean, boolean, nq7, vt4, vt4, vt4, vt4, vt4, rv4, int):void");
    }

    public static final void h(final boolean z, final boolean z2, boolean z3, final boolean z4, final String str, final String str2, final boolean z5, final boolean z6, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, vt4 vt4Var7, vt4 vt4Var8, final vt4 vt4Var9, rv4 rv4Var, final int i2) {
        boolean z7;
        vt4 vt4Var10;
        vt4 vt4Var11;
        int i3;
        wk3 wk3Var;
        wk3 wk3Var2;
        long j2;
        rv4 rv4Var2 = rv4Var;
        str2.getClass();
        rv4Var2.g0(-1359151571);
        int i4 = i2 | (rv4Var2.g(z) ? 4 : 2) | (rv4Var2.g(z2) ? 32 : 16);
        boolean g2 = rv4Var2.g(z3);
        int i5 = Token.CASE;
        int i6 = i4 | (g2 ? 256 : 128) | (rv4Var2.g(z4) ? 2048 : 1024) | (rv4Var2.f(str) ? 16384 : 8192);
        boolean f2 = rv4Var2.f(str2);
        int i7 = Parser.ARGC_LIMIT;
        int i8 = i6 | (f2 ? 131072 : 65536) | (rv4Var2.g(z5) ? 1048576 : 524288) | (rv4Var2.g(z6) ? 8388608 : 4194304) | (rv4Var2.f(nq7Var) ? 67108864 : 33554432) | (rv4Var2.h(vt4Var) ? 536870912 : 268435456);
        int i9 = (rv4Var2.h(vt4Var2) ? 4 : 2) | (rv4Var2.h(vt4Var3) ? 32 : 16);
        if (rv4Var2.h(vt4Var4)) {
            i5 = 256;
        }
        int i10 = i9 | i5 | (rv4Var2.h(vt4Var5) ? 2048 : 1024) | (rv4Var2.h(vt4Var6) ? 16384 : 8192);
        if (rv4Var2.h(vt4Var7)) {
            i7 = 131072;
        }
        int i11 = i10 | i7 | (rv4Var2.h(vt4Var8) ? 1048576 : 524288) | (rv4Var2.h(vt4Var9) ? 8388608 : 4194304);
        if (rv4Var2.U(i8 & 1, ((i8 & 306783379) == 306783378 && (4793491 & i11) == 4793490) ? false : true)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
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
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            long b2 = zl1.b(z2 ? 1.0f : 0.5f, r0f.y(rv4Var2).q);
            kq7 kq7Var = kq7.a;
            nq7 n2 = pna.n(kq7Var, 32.0f);
            su9 su9Var = uu9.a;
            nq7 k2 = tte.k(n2, su9Var);
            boolean z8 = (i11 & 7168) == 2048;
            Object P = rv4Var2.P();
            boolean z9 = z8;
            lh9 lh9Var = ax1.a;
            if (z9 || P == lh9Var) {
                P = new pa(8, vt4Var5);
                rv4Var2.o0(P);
            }
            nk5.a(c2, null, zbe.y(lbe.f(14, (vt4) P, k2, null, z2), 2.0f), b2, rv4Var, 48, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            ar5 c3 = rp5.c((wk3) jk3.f.getValue(), rv4Var, 0);
            long b3 = zl1.b(z ? 1.0f : 0.5f, r0f.y(rv4Var).q);
            nq7 k3 = tte.k(pna.n(kq7Var, 32.0f), su9Var);
            boolean z10 = (i11 & 896) == 256;
            Object P2 = rv4Var.P();
            if (z10 || P2 == lh9Var) {
                i3 = 14;
                P2 = new pa(14, vt4Var4);
                rv4Var.o0(P2);
            } else {
                i3 = 14;
            }
            nk5.a(c3, null, zbe.y(lbe.f(i3, (vt4) P2, k3, null, z), 2.0f), b3, rv4Var, 48, 0);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            int i12 = i8 >> 18;
            k((i12 & Token.ASSIGN_MOD) | (i12 & 14) | 384 | ((i11 >> 9) & 57344), 0, vt4Var9, rv4Var2, pna.n(kq7Var, 32.0f), z5, z6, str != null);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            if (z4) {
                wk3Var = jk3.a();
            } else {
                wk3Var = (wk3) ok3.d0.getValue();
            }
            ar5 c4 = rp5.c(wk3Var, rv4Var2, 0);
            long b4 = zl1.b(str != null ? 1.0f : 0.5f, r0f.y(rv4Var2).q);
            nq7 k4 = tte.k(pna.n(kq7Var, 32.0f), su9Var);
            boolean z11 = str != null;
            boolean z12 = ((i8 & 7168) == 2048) | ((i11 & 14) == 4) | ((1879048192 & i8) == 536870912);
            Object P3 = rv4Var2.P();
            if (z12 || P3 == lh9Var) {
                P3 = new u90(z4, vt4Var2, vt4Var, 1);
                rv4Var2.o0(P3);
            }
            nk5.a(c4, null, zbe.y(lbe.f(14, (vt4) P3, k4, null, z11), 2.0f), b4, rv4Var2, 48, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            oyb oybVar = r0f.A(rv4Var2).k;
            long j3 = r0f.y(rv4Var2).q;
            nq7 k5 = tte.k(new we6(1.0f, true), su9Var);
            boolean z13 = (i11 & Token.ASSIGN_MOD) == 32;
            Object P4 = rv4Var2.P();
            if (z13 || P4 == lh9Var) {
                P4 = new pa(15, vt4Var3);
                rv4Var2.o0(P4);
            }
            cvb.c(str2, zbe.z(nmd.v(lbe.f(15, (vt4) P4, k5, null, false), rm1.g(r0f.y(rv4Var2), 4.0f), lre.g), 24.0f, 8.0f), j3, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, oybVar, rv4Var2, (i8 >> 15) & 14, 24960, 109560);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            if (z3) {
                wk3Var2 = (wk3) jk3.L.getValue();
            } else {
                wk3Var2 = (wk3) jk3.a0.getValue();
            }
            ar5 c5 = rp5.c(wk3Var2, rv4Var2, 0);
            long b5 = zl1.b(z3 ? 1.0f : 0.5f, r0f.y(rv4Var2).q);
            nq7 k6 = tte.k(pna.n(kq7Var, 32.0f), su9Var);
            boolean z14 = (3670016 & i11) == 1048576;
            Object P5 = rv4Var2.P();
            if (z14 || P5 == lh9Var) {
                vt4Var11 = vt4Var8;
                P5 = new pa(16, vt4Var11);
                rv4Var2.o0(P5);
            } else {
                vt4Var11 = vt4Var8;
            }
            z7 = z3;
            nk5.a(c5, null, zbe.y(lbe.f(14, (vt4) P5, k6, null, z7), 2.0f), b5, rv4Var2, 48, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            ar5 c6 = rp5.c((wk3) ok3.j.getValue(), rv4Var2, 0);
            long j4 = r0f.y(rv4Var2).q;
            nq7 k7 = tte.k(pna.n(kq7Var, 32.0f), su9Var);
            boolean z15 = (i11 & 57344) == 16384;
            Object P6 = rv4Var2.P();
            if (z15 || P6 == lh9Var) {
                j2 = j4;
                P6 = new pa(17, vt4Var6);
                rv4Var2.o0(P6);
            } else {
                j2 = j4;
            }
            nk5.a(c6, null, zbe.y(lbe.f(15, (vt4) P6, k7, null, false), 2.0f), j2, rv4Var2, 48, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            ar5 c7 = rp5.c((wk3) ok3.L.getValue(), rv4Var2, 0);
            long j5 = r0f.y(rv4Var2).q;
            nq7 k8 = tte.k(pna.n(kq7Var, 32.0f), su9Var);
            boolean z16 = (458752 & i11) == 131072;
            Object P7 = rv4Var2.P();
            if (z16 || P7 == lh9Var) {
                vt4Var10 = vt4Var7;
                P7 = new pa(7, vt4Var10);
                rv4Var2.o0(P7);
            } else {
                vt4Var10 = vt4Var7;
            }
            nk5.a(c7, null, zbe.y(lbe.f(15, (vt4) P7, k8, null, false), 2.0f), j5, rv4Var2, 48, 0);
            rv4Var2.q(true);
        } else {
            z7 = z3;
            vt4Var10 = vt4Var7;
            vt4Var11 = vt4Var8;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            final vt4 vt4Var12 = vt4Var10;
            final vt4 vt4Var13 = vt4Var11;
            final boolean z17 = z7;
            u.d = new lu4(z, z2, z17, z4, str, str2, z5, z6, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var12, vt4Var13, vt4Var9, i2) { // from class: gw0
                public final /* synthetic */ boolean C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ nq7 E;
                public final /* synthetic */ vt4 F;
                public final /* synthetic */ vt4 G;
                public final /* synthetic */ vt4 H;
                public final /* synthetic */ vt4 I;
                public final /* synthetic */ vt4 J;
                public final /* synthetic */ vt4 K;
                public final /* synthetic */ vt4 L;
                public final /* synthetic */ vt4 M;
                public final /* synthetic */ vt4 N;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(1);
                    y9e.h(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(lhd lhdVar, boolean z, boolean z2, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        vt4 vt4Var5;
        boolean z4;
        float f2;
        wk3 wk3Var;
        boolean z5;
        boolean z6;
        boolean z7;
        vt4 vt4Var6 = vt4Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(96824725);
        if (rv4Var2.h(lhdVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (rv4Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (rv4Var2.g(z2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i13 = i12 | i5;
        if (rv4Var2.f(nq7Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i14 = i13 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i15 = i14 | i7;
        if (rv4Var2.h(vt4Var6)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i8;
        if (rv4Var2.h(vt4Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i17 = i16 | i9;
        if (rv4Var2.h(vt4Var4)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i18 = i17 | i10;
        if ((4793491 & i18) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i18 & 1, z3)) {
            su9 su9Var = uu9.a;
            nq7 k2 = tte.k(nq7Var, su9Var);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(k2, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 4.0f), lre.g);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, v);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            if ((i18 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var2.P();
            boolean z8 = z4;
            lh9 lh9Var = ax1.a;
            if (z8 || P == lh9Var) {
                P = new pa(6, vt4Var3);
                rv4Var2.o0(P);
            }
            kq7 kq7Var = kq7.a;
            nq7 z9 = zbe.z(lbe.f(15, (vt4) P, kq7Var, null, false), 12.0f, 6.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z9);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            rv4Var2.e0(-1558169642);
            String str = (String) lhdVar.e.getValue();
            if (str.length() == 0) {
                str = yqe.A((y3b) x2b.r.getValue(), rv4Var2);
            }
            rv4Var2.q(false);
            cvb.c(str, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var2, 0, 24960, 109560);
            rv4Var2 = rv4Var2;
            if (lhdVar.f() != null) {
                rv4Var2.e0(-1058191092);
                int i19 = i18 >> 3;
                k((i19 & Token.ASSIGN_MOD) | (i19 & 14) | 384 | ((i18 >> 9) & 57344), 8, vt4Var4, rv4Var2, pna.n(kq7Var, 24.0f), z, z2, false);
                xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
                if (lhdVar.j()) {
                    wk3Var = (wk3) jk3.w.getValue();
                } else {
                    wk3Var = (wk3) ok3.d0.getValue();
                }
                ar5 c2 = rp5.c(wk3Var, rv4Var2, 0);
                long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
                nq7 k3 = tte.k(pna.n(kq7Var, 24.0f), su9Var);
                if ((i18 & 14) != 4 && !rv4Var2.h(lhdVar)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if ((i18 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z10 = z5 | z6;
                if ((i18 & 57344) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z11 = z10 | z7;
                Object P2 = rv4Var2.P();
                if (!z11 && P2 != lh9Var) {
                    vt4Var5 = vt4Var;
                    vt4Var6 = vt4Var2;
                } else {
                    vt4Var5 = vt4Var;
                    vt4Var6 = vt4Var2;
                    P2 = new se0(4, lhdVar, vt4Var6, vt4Var5);
                    rv4Var2.o0(P2);
                }
                nq7 f3 = lbe.f(15, (vt4) P2, k3, null, false);
                f2 = 2.0f;
                nk5.a(c2, null, zbe.y(f3, 2.0f), j2, rv4Var, 48, 0);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                vt4Var5 = vt4Var;
                vt4Var6 = vt4Var2;
                f2 = 2.0f;
                rs8.s(rv4Var2, -1057361253, kq7Var, 24.0f, rv4Var2);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            if (lhdVar.j()) {
                rv4Var2.e0(-575236240);
                yya b2 = nq.b(lhdVar.h.h(), null, null, rv4Var2, 0, 30);
                nq7 h2 = pna.h(zbe.A(pu0.a.a(pna.f(kq7Var, 1.0f), kh5.D), 12.0f, nae.e, 2), f2);
                boolean f4 = rv4Var2.f(b2);
                Object P3 = rv4Var2.P();
                if (f4 || P3 == lh9Var) {
                    P3 = new jw0(b2, 0);
                    rv4Var2.o0(P3);
                }
                vt4 vt4Var7 = (vt4) P3;
                Object P4 = rv4Var2.P();
                if (P4 == lh9Var) {
                    P4 = new nj0(20);
                    rv4Var2.o0(P4);
                }
                r79.c(vt4Var7, h2, 0L, 0L, 0, nae.e, (xt4) P4, rv4Var, 1572864, 60);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-574722105);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            vt4Var5 = vt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new kw0(lhdVar, z, z2, nq7Var, vt4Var5, vt4Var6, vt4Var3, vt4Var4, i2);
        }
    }

    public static final long j(float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i2 = ckc.c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final int r18, final int r19, final defpackage.vt4 r20, defpackage.rv4 r21, defpackage.nq7 r22, final boolean r23, final boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9e.k(int, int, vt4, rv4, nq7, boolean, boolean, boolean):void");
    }

    public static final aw7 l(gz5 gz5Var, rv4 rv4Var, int i2) {
        boolean z;
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = yae.z(Boolean.FALSE);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) P;
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.f(gz5Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P2 = rv4Var.P();
        if (z || P2 == lh9Var) {
            P2 = new fh3(gz5Var, aw7Var, null, 1);
            rv4Var.o0(P2);
        }
        yte.g((lu4) P2, rv4Var, gz5Var);
        return aw7Var;
    }

    public static final boolean m(rk9 rk9Var, float f2, float f3) {
        float f4 = rk9Var.a;
        if (f2 <= rk9Var.c && f4 <= f2) {
            float f5 = rk9Var.b;
            if (f3 <= rk9Var.d && f5 <= f3) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [qcd, java.lang.Object] */
    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = rcd.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = qcd.d;
            qcd qcdVar = (qcd) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            qcd qcdVar2 = qcdVar;
            if (qcdVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                qcdVar2 = obj;
            }
            WeakReference weakReference2 = qcdVar2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                qcdVar2.c = new WeakReference(keyEvent);
                if (qcdVar2.b == null) {
                    qcdVar2.b = new SparseArray();
                }
                SparseArray sparseArray = qcdVar2.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    vm1.h();
                    return false;
                }
            }
        }
        return false;
    }

    public static final Object o(ng2 ng2Var, lu4 lu4Var, m42 m42Var) {
        return ng2Var.a(new x39(lu4Var, null, 1), m42Var);
    }

    public static int p(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            if (i3 == 3) {
                i8 = g[i5 - 1];
            } else {
                i8 = h[i5 - 1];
            }
            return (((i8 * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            if (i4 == 2) {
                i7 = i[i5 - 1];
            } else {
                i7 = j[i5 - 1];
            }
        } else {
            i7 = k[i5 - 1];
        }
        int i11 = Token.LABEL;
        if (i3 == 3) {
            return ((i7 * Token.LABEL) / i9) + i10;
        }
        if (i4 == 1) {
            i11 = 72;
        }
        return ((i11 * i7) / i9) + i10;
    }

    public static final void q(psa psaVar, xt4 xt4Var) {
        psaVar.getClass();
        xt4Var.getClass();
        ly0 b2 = psaVar.b();
        if (!b2.k()) {
            d5a d5aVar = b2.a;
            d5aVar.getClass();
            byte[] bArr = d5aVar.a;
            int i2 = d5aVar.b;
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, d5aVar.c - i2);
            wrap.getClass();
            xt4Var.invoke(wrap);
            int position = wrap.position() - i2;
            if (position != 0) {
                if (position >= 0) {
                    if (position <= d5aVar.b()) {
                        b2.skip(position);
                        return;
                    } else {
                        vs.k("Returned too many bytes");
                        return;
                    }
                }
                vs.k("Returned negative read bytes count");
                return;
            }
            return;
        }
        vs.m("Buffer is empty");
    }

    public static String r(int i2, String str, List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        if (str == null) {
            if (i2 > 0) {
                return ((ioa) sl1.c0(list)).a;
            }
            return ((ioa) sl1.j0(list)).a;
        }
        Iterator it = list.iterator();
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((ioa) it.next()).a.equals(str)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            return ((ioa) sl1.c0(list)).a;
        }
        return ((ioa) list.get(dce.n(i3 + i2, 0, list.size() - 1))).a;
    }

    public static bfe s(byte[] bArr) {
        try {
            ogf u = ogf.u(bArr, g7e.a);
            l5f l5fVar = l5f.b;
            hlf a2 = k7f.a(u.B());
            s6f s6fVar = new s6f(u, a2);
            c7f c7fVar = (c7f) l5fVar.a.get();
            c7fVar.getClass();
            if (!c7fVar.d.containsKey(new f7f(s6f.class, a2))) {
                return new j4f(s6fVar);
            }
            return l5fVar.b(s6fVar);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static n2f t(String str) {
        n2f n2fVar;
        try {
            synchronized (l) {
                n2fVar = new n2f(ase.E(str));
                byte[] a2 = u6f.a(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(a2, n2fVar.a(n2fVar.b(a2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return n2fVar;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static byte[] u(bfe bfeVar) {
        if (bfeVar instanceof j4f) {
            return ((ogf) ((j4f) bfeVar).a.b).c();
        }
        return ((ogf) ((s6f) l5f.b.d(bfeVar)).b).c();
    }

    public static boolean v(String str) {
        synchronized (l) {
            try {
                String E = ase.E(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (!keyStore.containsAlias(E)) {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(E, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(build);
                        keyGenerator.generateKey();
                        return true;
                    }
                    return false;
                } catch (IOException e2) {
                    throw new GeneralSecurityException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
