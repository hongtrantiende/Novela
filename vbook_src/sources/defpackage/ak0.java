package defpackage;

import android.graphics.Path;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ak0  reason: default package */
/* loaded from: classes.dex */
public final class ak0 {
    public static final tu1 a = new tu1(new kv1(7), false, 1195734394);
    public static final tu1 b = new tu1(new kv1(8), false, -1450713961);
    public static final tu1 c = new tu1(new lv1(10), false, -994399853);
    public static final int[] d = {-1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] e = {-1, -1, -1, 0, 1, 2, 3, 4, -1, -1, 5, 6, 7, 8, 9, 10, -1, -1, 11, 12, 13, 14, 15, 16, -1, -1, 17, 18, 19, 20, -1, -1};
    public static final int[] f = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, -1, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, -1, -1};

    public static final void a(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-237840767);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var4)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var, jce.E(1705570189, new y33(vt4Var3, vt4Var2, vt4Var4, 6), rv4Var), rv4Var, (i11 & 14) | 12779520 | ((i11 << 15) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z33(z, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, 4);
        }
    }

    public static final void b(final boolean z, final boolean z2, final omb ombVar, final cnb cnbVar, final qxb qxbVar, final nnb nnbVar, final amc amcVar, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final xt4 xt4Var2, final xt4 xt4Var3, final boolean z3, final vt4 vt4Var9, final vt4 vt4Var10, final vt4 vt4Var11, final vt4 vt4Var12, final vt4 vt4Var13, final vt4 vt4Var14, final vt4 vt4Var15, final vt4 vt4Var16, final vt4 vt4Var17, rv4 rv4Var, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        Object obj;
        Object obj2;
        rv4 rv4Var2 = rv4Var;
        ombVar.getClass();
        cnbVar.getClass();
        qxbVar.getClass();
        nnbVar.getClass();
        amcVar.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        vt4Var7.getClass();
        vt4Var8.getClass();
        vt4Var10.getClass();
        vt4Var11.getClass();
        vt4Var12.getClass();
        vt4Var13.getClass();
        vt4Var14.getClass();
        vt4Var15.getClass();
        vt4Var16.getClass();
        vt4Var17.getClass();
        rv4Var2.g0(-43378173);
        if ((i & 6) == 0) {
            i2 = (rv4Var2.f(pu0.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= rv4Var2.g(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i2 |= rv4Var2.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            obj = ombVar;
            i2 |= rv4Var2.f(obj) ? 2048 : 1024;
        } else {
            obj = ombVar;
        }
        if ((i & 24576) == 0) {
            obj2 = cnbVar;
            i2 |= rv4Var2.f(obj2) ? 16384 : 8192;
        } else {
            obj2 = cnbVar;
        }
        int i3 = i & 196608;
        int i4 = Parser.ARGC_LIMIT;
        if (i3 == 0) {
            i2 |= rv4Var2.f(qxbVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= rv4Var2.f(nnbVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= rv4Var2.f(amcVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= rv4Var2.h(vt4Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= rv4Var2.h(vt4Var2) ? 536870912 : 268435456;
        }
        int i5 = (rv4Var2.h(xt4Var) ? 4 : 2) | (rv4Var2.h(vt4Var3) ? 32 : 16) | (rv4Var2.h(vt4Var4) ? 256 : Token.CASE) | (rv4Var2.h(vt4Var5) ? 2048 : 1024) | (rv4Var2.h(vt4Var6) ? 16384 : 8192) | (rv4Var2.h(vt4Var7) ? 131072 : 65536) | (rv4Var2.h(vt4Var8) ? 1048576 : 524288) | (rv4Var2.h(xt4Var2) ? 8388608 : 4194304) | (rv4Var2.h(xt4Var3) ? 67108864 : 33554432) | (rv4Var2.g(z3) ? 536870912 : 268435456);
        int i6 = (rv4Var2.h(vt4Var9) ? 4 : 2) | (rv4Var2.h(vt4Var10) ? 32 : 16) | (rv4Var2.h(vt4Var11) ? 256 : Token.CASE) | (rv4Var2.h(vt4Var12) ? 2048 : 1024) | (rv4Var2.h(vt4Var13) ? 16384 : 8192);
        if (rv4Var2.h(vt4Var14)) {
            i4 = 131072;
        }
        int i7 = i6 | i4 | (rv4Var2.h(vt4Var15) ? 1048576 : 524288) | (rv4Var2.h(vt4Var16) ? 8388608 : 4194304) | (rv4Var2.h(vt4Var17) ? 67108864 : 33554432);
        int i8 = i2;
        if (rv4Var2.U(i8 & 1, ((i2 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i7 & 38347923) == 38347922) ? false : true)) {
            if (ikd.a(rv4Var2)) {
                rv4Var2.e0(507035470);
                c(z4, z5, obj, obj2, qxbVar, nnbVar, amcVar, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var2, xt4Var3, z3, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, vt4Var15, vt4Var16, vt4Var17, rv4Var2, i8 & 2147483646, i5 & 2147483646, i7 & 268435454);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(508293047);
                int i9 = i7 << 21;
                d(z, z2, ombVar, cnbVar, qxbVar, nnbVar, amcVar, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var2, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, vt4Var15, vt4Var16, vt4Var17, rv4Var2, i8 & 2147483646, (i5 & 33554430) | (234881024 & i9) | (i9 & 1879048192), (i7 >> 9) & 524286);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: yvb
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p = xoe.p(i | 1);
                    ak0.b(z, z2, ombVar, cnbVar, qxbVar, nnbVar, amcVar, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var2, xt4Var3, z3, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, vt4Var15, vt4Var16, vt4Var17, (rv4) obj3, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final boolean z2, omb ombVar, final cnb cnbVar, final qxb qxbVar, final nnb nnbVar, final amc amcVar, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final xt4 xt4Var2, final xt4 xt4Var3, final boolean z3, final vt4 vt4Var9, final vt4 vt4Var10, final vt4 vt4Var11, final vt4 vt4Var12, final vt4 vt4Var13, final vt4 vt4Var14, final vt4 vt4Var15, final vt4 vt4Var16, vt4 vt4Var17, rv4 rv4Var, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        Object obj;
        int i6;
        int i7;
        vt4 vt4Var18;
        Object obj2;
        final omb ombVar2 = ombVar;
        rv4Var.g0(-1962818459);
        int i8 = i & 6;
        pu0 pu0Var = pu0.a;
        if (i8 == 0) {
            i4 = (rv4Var.f(pu0Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i4 |= rv4Var.g(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        int i9 = i & 384;
        int i10 = Token.CASE;
        if (i9 == 0) {
            i4 |= rv4Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= rv4Var.f(ombVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= rv4Var.f(cnbVar) ? 16384 : 8192;
        }
        int i11 = i & 196608;
        int i12 = Parser.ARGC_LIMIT;
        if (i11 == 0) {
            i4 |= rv4Var.f(qxbVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= rv4Var.f(nnbVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 = 196608;
            obj = amcVar;
            i4 |= rv4Var.f(obj) ? 8388608 : 4194304;
        } else {
            i5 = 196608;
            obj = amcVar;
        }
        if ((i & 100663296) == 0) {
            i4 |= rv4Var.h(vt4Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= rv4Var.h(vt4Var2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i6 = i2 | (rv4Var.h(xt4Var) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= rv4Var.h(vt4Var3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= rv4Var.h(vt4Var4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= rv4Var.h(vt4Var5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= rv4Var.h(vt4Var6) ? 16384 : 8192;
        }
        if ((i2 & i5) == 0) {
            i6 |= rv4Var.h(vt4Var7) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= rv4Var.h(vt4Var8) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= rv4Var.h(xt4Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= rv4Var.h(xt4Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= rv4Var.g(z3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (rv4Var.h(vt4Var9) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= rv4Var.h(vt4Var10) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.h(vt4Var11)) {
                i10 = 256;
            }
            i7 |= i10;
        }
        if ((i3 & 3072) == 0) {
            i7 |= rv4Var.h(vt4Var12) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= rv4Var.h(vt4Var13) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            if (rv4Var.h(vt4Var14)) {
                i12 = 131072;
            }
            i7 |= i12;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= rv4Var.h(vt4Var15) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= rv4Var.h(vt4Var16) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= rv4Var.h(vt4Var17) ? 67108864 : 33554432;
        }
        int i13 = i7;
        if (rv4Var.U(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (i13 & 38347923) == 38347922) ? false : true)) {
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            if (P == obj3) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            String str = ombVar2.b;
            int i14 = i4;
            String str2 = cnbVar.b;
            int i15 = qxbVar.b;
            int i16 = qxbVar.c;
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            Object P2 = rv4Var.P();
            if (P2 == obj3) {
                obj2 = obj3;
                P2 = new iia(aw7Var, 29);
                rv4Var.o0(P2);
            } else {
                obj2 = obj3;
            }
            int i17 = i14 >> 3;
            int i18 = i17 & 14;
            int i19 = i6 << 3;
            Object obj4 = obj2;
            eh.i(z4, str, str2, i15, i16, z2, obj, f2, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var13, vt4Var4, vt4Var5, vt4Var6, (vt4) P2, rv4Var, (i17 & 3670016) | i18 | 12582912 | ((i14 << 9) & 458752) | (i14 & 234881024) | (i14 & 1879048192), (i19 & 7168) | (i6 & 14) | 1572864 | (i6 & Token.ASSIGN_MOD) | ((i13 >> 6) & 896) | (i19 & 57344) | (i19 & 458752));
            boolean f3 = rv4Var.f(nnbVar.a);
            Object P3 = rv4Var.P();
            if (f3 || P3 == obj4) {
                P3 = Boolean.valueOf(nnbVar.a.length() == 0);
                rv4Var.o0(P3);
            }
            int i20 = i6 >> 9;
            int i21 = i13 << 18;
            gwe.c(z, ((Boolean) P3).booleanValue(), nnbVar.g, nnbVar.o, cnbVar.b, cnbVar.a, cnbVar.c, qxbVar.b, qxbVar.c, z3, pu0Var.a(kq7Var, kh5.D), xt4Var3, vt4Var7, vt4Var8, xt4Var2, vt4Var9, vt4Var5, vt4Var10, vt4Var11, vt4Var12, vt4Var14, vt4Var15, vt4Var16, rv4Var, i18 | (i6 & 1879048192), (i20 & 57344) | ((i6 >> 21) & Token.ASSIGN_MOD) | (i20 & 896) | (i20 & 7168) | ((i13 << 15) & 458752) | ((i6 << 9) & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), (i13 >> 15) & 1022);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            nk0 nk0Var = kh5.b;
            nq7 y = zbe.y(zbe.C(mwe.u(pna.f(kq7Var, 1.0f), false, 15), nae.e, 140.0f, nae.e, nae.e, 13), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P4 = rv4Var.P();
            if (P4 == obj4) {
                P4 = new clb(28);
                rv4Var.o0(P4);
            }
            eu3 a2 = g.a(zt3.t((xt4) P4));
            lz3 i22 = zt3.i(null, 3);
            Object P5 = rv4Var.P();
            if (P5 == obj4) {
                P5 = new clb(25);
                rv4Var.o0(P5);
            }
            lz3 a3 = i22.a(zt3.x((xt4) P5));
            Object P6 = rv4Var.P();
            if (P6 == obj4) {
                P6 = new wmb(aw7Var, 23);
                rv4Var.o0(P6);
            }
            ombVar2 = ombVar;
            vt4Var18 = vt4Var17;
            z87.a(booleanValue, (xt4) P6, a2, a3, nk0Var, b2, false, false, y, jce.E(967541191, new zvb(ombVar2, vt4Var18, aw7Var, 0), rv4Var), rv4Var, 805531056, 192);
        } else {
            vt4Var18 = vt4Var17;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final vt4 vt4Var19 = vt4Var18;
            u.d = new lu4() { // from class: awb
                @Override // defpackage.lu4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    int p3 = xoe.p(i3);
                    ak0.c(z, z2, ombVar2, cnbVar, qxbVar, nnbVar, amcVar, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var2, xt4Var3, z3, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, vt4Var15, vt4Var16, vt4Var19, (rv4) obj5, p, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(final boolean z, final boolean z2, final omb ombVar, final cnb cnbVar, final qxb qxbVar, final nnb nnbVar, final amc amcVar, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final xt4 xt4Var2, final vt4 vt4Var9, final vt4 vt4Var10, final vt4 vt4Var11, final vt4 vt4Var12, final vt4 vt4Var13, final vt4 vt4Var14, final vt4 vt4Var15, vt4 vt4Var16, rv4 rv4Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        vt4 vt4Var17;
        aw7 aw7Var;
        rv4Var.g0(1577730440);
        int i7 = i & 6;
        pu0 pu0Var = pu0.a;
        if (i7 == 0) {
            i4 = (rv4Var.f(pu0Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= rv4Var.g(z) ? 32 : 16;
        }
        int i8 = i & 384;
        int i9 = Token.CASE;
        if (i8 == 0) {
            i4 |= rv4Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= rv4Var.f(ombVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= rv4Var.f(cnbVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= rv4Var.f(qxbVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= rv4Var.f(nnbVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= rv4Var.f(amcVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= rv4Var.h(vt4Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= rv4Var.h(vt4Var2) ? 536870912 : 268435456;
        }
        int i10 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (rv4Var.h(xt4Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= rv4Var.h(vt4Var3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= rv4Var.h(vt4Var4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= rv4Var.h(vt4Var5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= rv4Var.h(vt4Var6) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= rv4Var.h(vt4Var7) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= rv4Var.h(vt4Var8) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= rv4Var.h(xt4Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= rv4Var.h(vt4Var9) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= rv4Var.h(vt4Var10) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (rv4Var.h(vt4Var11) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= rv4Var.h(vt4Var12) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.h(vt4Var13)) {
                i9 = 256;
            }
            i6 |= i9;
        }
        if ((i3 & 24576) == 0) {
            i6 |= rv4Var.h(vt4Var15) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= rv4Var.h(vt4Var16) ? 131072 : 65536;
        }
        int i11 = i6;
        if (rv4Var.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i11 & 73875) == 73874) ? false : true)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(0);
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            boolean f2 = rv4Var.f(nnbVar.a);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj) {
                P2 = Boolean.valueOf(nnbVar.a.length() == 0);
                rv4Var.o0(P2);
            }
            boolean booleanValue = ((Boolean) P2).booleanValue();
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yae.z(Boolean.FALSE);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) P3;
            boolean z3 = nnbVar.g;
            int i12 = nnbVar.o;
            int i13 = cnbVar.a;
            int i14 = cnbVar.c;
            int i15 = qxbVar.b;
            int i16 = qxbVar.c;
            kq7 kq7Var = kq7.a;
            int i17 = i10 >> 3;
            int i18 = i17 & 14;
            int i19 = i5 << 3;
            int i20 = i5 >> 9;
            sve.f(z, booleanValue, z3, i12, i13, i14, i15, i16, pu0Var.a(pna.f(kq7Var, 1.0f), kh5.D), vt4Var9, vt4Var5, vt4Var15, vt4Var7, vt4Var8, xt4Var2, rv4Var, i18 | (i19 & 1879048192), (i20 & 14) | ((i11 >> 9) & Token.ASSIGN_MOD) | (i20 & 896) | (i20 & 7168) | (i20 & 57344));
            String str = ombVar.b;
            String str2 = cnbVar.b;
            int i21 = qxbVar.b;
            int i22 = qxbVar.c;
            nq7 f3 = pna.f(kq7Var, 1.0f);
            Object P4 = rv4Var.P();
            if (P4 == obj) {
                P4 = new wmb(aw7Var2, 24);
                rv4Var.o0(P4);
            }
            nq7 a2 = pu0Var.a(pbe.l(f3, (xt4) P4), kh5.b);
            Object P5 = rv4Var.P();
            if (P5 == obj) {
                aw7Var = aw7Var3;
                P5 = new iia(aw7Var, 28);
                rv4Var.o0(P5);
            } else {
                aw7Var = aw7Var3;
            }
            int i23 = i11 << 9;
            aw7 aw7Var4 = aw7Var;
            zj0.b(z, str, str2, i21, i22, z2, amcVar, a2, vt4Var, vt4Var10, vt4Var11, xt4Var, vt4Var3, vt4Var2, vt4Var12, vt4Var13, vt4Var4, vt4Var6, (vt4) P5, rv4Var, i18 | ((i10 << 9) & 458752) | (i17 & 3670016) | (i10 & 234881024) | (i5 & 1879048192), (i11 & 14) | 100663296 | (i19 & Token.ASSIGN_MOD) | (i19 & 896) | ((i10 >> 18) & 7168) | (i23 & 57344) | (i23 & 458752) | ((i5 << 12) & 3670016) | (29360128 & (i5 << 9)));
            boolean booleanValue2 = ((Boolean) aw7Var4.getValue()).booleanValue();
            nk0 nk0Var = kh5.a;
            nq7 s = pna.s(zbe.y(zbe.C(mwe.u(kq7Var, false, 15), 90.0f, 64.0f, nae.e, nae.e, 12), 12.0f), 400.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P6 = rv4Var.P();
            if (P6 == obj) {
                P6 = new clb(26);
                rv4Var.o0(P6);
            }
            eu3 a3 = g.a(zt3.t((xt4) P6));
            lz3 i24 = zt3.i(null, 3);
            Object P7 = rv4Var.P();
            if (P7 == obj) {
                P7 = new clb(27);
                rv4Var.o0(P7);
            }
            lz3 a4 = i24.a(zt3.x((xt4) P7));
            Object P8 = rv4Var.P();
            if (P8 == obj) {
                P8 = new wmb(aw7Var4, 25);
                rv4Var.o0(P8);
            }
            vt4Var17 = vt4Var16;
            z87.a(booleanValue2, (xt4) P8, a3, a4, nk0Var, b2, false, false, s, jce.E(-1972599318, new zvb(ombVar, vt4Var17, aw7Var4, 1), rv4Var), rv4Var, 805531056, 192);
        } else {
            vt4Var17 = vt4Var16;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final vt4 vt4Var18 = vt4Var17;
            u.d = new lu4() { // from class: bwb
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    int p3 = xoe.p(i3);
                    ak0.d(z, z2, ombVar, cnbVar, qxbVar, nnbVar, amcVar, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var2, vt4Var9, vt4Var10, vt4Var11, vt4Var12, vt4Var13, vt4Var14, vt4Var15, vt4Var18, (rv4) obj2, p, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        boolean z2;
        String str;
        cz7Var.getClass();
        rv4Var.g0(2066769411);
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
                c4c c4cVar = (c4c) ((fdd) voe.z(cm9.a(c4c.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(c4cVar.d, rv4Var);
                m13 t = o28.t(rv4Var);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = yae.z(null);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) P;
                zu8 zu8Var = new zu8(tl1.A("json"));
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new g0c(aw7Var, 8);
                    rv4Var.o0(P2);
                }
                kd4 v = w92.v(zu8Var, (xt4) P2, rv4Var, 56);
                Object[] objArr = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new a1c(2);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P3, rv4Var, 48);
                Object obj2 = (sac) rv4Var.j(uac.a);
                s02 s02Var = c4cVar.e;
                boolean f2 = rv4Var.f(obj2);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new wa(obj2, (m42) null, 23);
                    rv4Var.o0(P4);
                }
                jye.b(s02Var, null, (mu4) P4, rv4Var, 0);
                fxe.h(yqe.A((y3b) z1b.q.getValue(), rv4Var), pna.c, false, jce.E(1919414399, new ri9(cz7Var, 25), rv4Var), jce.E(-1076154968, new ob9(aw7Var2, c4cVar, v, 4), rv4Var), jce.E(545329348, new t81(11, z3, t), rv4Var), jce.E(-1327283250, new cs1(21, t, c4cVar, z3), rv4Var), rv4Var, 1797168, 4);
                boolean f3 = rv4Var.f(c4cVar);
                Object P5 = rv4Var.P();
                if (!f3 && P5 != obj) {
                    z2 = true;
                } else {
                    z2 = true;
                    P5 = new m0c(c4cVar, 1);
                    rv4Var.o0(P5);
                }
                o28.i(t, (lu4) P5, rv4Var, 0);
                if (((f76) aw7Var.getValue()) == null) {
                    z2 = false;
                }
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var != null) {
                    str = f76Var.getName();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Object P6 = rv4Var.P();
                if (P6 == obj) {
                    P6 = new g0c(aw7Var, 10);
                    rv4Var.o0(P6);
                }
                xt4 xt4Var = (xt4) P6;
                boolean f4 = rv4Var.f(c4cVar);
                Object P7 = rv4Var.P();
                if (f4 || P7 == obj) {
                    P7 = new t3c(0, aw7Var, c4cVar);
                    rv4Var.o0(P7);
                }
                rae.b(z2, str2, null, xt4Var, (xt4) P7, rv4Var, 3072);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 26);
        }
    }

    public static final void f(List list, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1390984302);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new a1c(3);
                rv4Var2.o0(P);
            }
            aw7 j = zpe.j(objArr, (vt4) P, rv4Var2, 384);
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
            bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var2)), zbe.j(nae.e, 68.0f, nae.e, 64.0f, 5));
            boolean f2 = rv4Var2.f(((jub) j.getValue()).a.b);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var2.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z5 = f2 | z2;
            Object P2 = rv4Var2.P();
            ArrayList arrayList = P2;
            if (z5 || P2 == lh9Var) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (k4b.V(((mnc) obj).c, ((jub) j.getValue()).a.b, true)) {
                        arrayList2.add(obj);
                    }
                }
                rv4Var2.o0(arrayList2);
                arrayList = arrayList2;
            }
            List list2 = (List) arrayList;
            f25 f25Var = new f25(320.0f);
            bkd r2 = mwe.r(r, zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            bkd r3 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean h2 = rv4Var2.h(list2);
            if ((57344 & i2) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z3 | h2;
            if ((i2 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            Object P3 = rv4Var2.P();
            if (z7 || P3 == lh9Var) {
                P3 = new sn4(list2, xt4Var2, xt4Var, 4);
                rv4Var2.o0(P3);
            }
            pc2.d(f25Var, nq7Var, null, r2, hzVar, null, null, false, 0L, 0L, r3, nae.e, (xt4) P3, rv4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | 196608, 0, 6100);
            rv4Var2 = rv4Var;
            jub jubVar = (jub) j.getValue();
            String A = yqe.A((y3b) b3b.U.getValue(), rv4Var2);
            long g = rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f);
            nq7 u = mwe.u(zbe.z(zbe.x(pna.f(kq7.a, 1.0f), rh8Var), 16.0f, 12.0f), false, 6);
            boolean f3 = rv4Var2.f(j);
            Object P4 = rv4Var2.P();
            if (f3 || P4 == lh9Var) {
                P4 = new g0c(j, 9);
                rv4Var2.o0(P4);
            }
            xxe.m(jubVar, A, 0L, g, null, null, u, null, (xt4) P4, null, rv4Var2, 0, 692);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new ghb(list, rh8Var, nq7Var, xt4Var, xt4Var2, i, 2);
        }
    }

    public static final void g(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1748569259);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            nq7 y = zbe.y(nq7Var, 24.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
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
            cvb.c(yqe.A((y3b) z1b.g0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i5 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.xh8 r49, defpackage.qi8 r50, final defpackage.dm8 r51, final defpackage.sk8 r52, final boolean r53, boolean r54, final boolean r55, final defpackage.si8 r56, final defpackage.ri8 r57, final float r58, final float r59, final float r60, final long r61, final defpackage.nq7 r63, final defpackage.xt4 r64, final defpackage.xt4 r65, defpackage.tu1 r66, defpackage.rv4 r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak0.h(xh8, qi8, dm8, sk8, boolean, boolean, boolean, si8, ri8, float, float, float, long, nq7, xt4, xt4, tu1, rv4, int):void");
    }

    public static final float i(float f2, float f3, ri8 ri8Var) {
        float f4;
        int ordinal = ri8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (f2 > f3) {
                        f4 = -(f2 - f3);
                    } else {
                        return (f3 - f2) / 2.0f;
                    }
                } else {
                    xk5.o();
                }
            }
            return nae.e;
        } else if (f2 > f3) {
            f4 = f2 - f3;
        } else {
            f4 = -(f3 - f2);
        }
        return f4 / 2.0f;
    }

    public static final float j(float f2, float f3, si8 si8Var) {
        float f4;
        int ordinal = si8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (f2 > f3) {
                        f4 = -(f2 - f3);
                    } else {
                        return (f3 - f2) / 2.0f;
                    }
                } else {
                    xk5.o();
                    return nae.e;
                }
            } else {
                if (f2 <= f3) {
                    return nae.e;
                }
                f4 = f2 - f3;
            }
        } else {
            if (f2 <= f3) {
                f4 = -(f3 - f2);
            }
            f4 = f2 - f3;
        }
        return f4 / 2.0f;
    }

    public static final void k(int i, StringBuilder sb) {
        if (i <= 65535) {
            sb.append((char) i);
            return;
        }
        int i2 = i - Parser.ARGC_LIMIT;
        sb.append((char) ((i2 >>> 10) + 55296));
        sb.append((char) ((i2 & 1023) + 56320));
    }

    public static long[] l(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static final String m(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= bArr.length) {
                break;
            }
            int i3 = ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
            if (i3 == 0) {
                break;
            }
            int n = n(i3);
            if (n != -1) {
                k(n, sb);
            }
            i += 2;
        }
        return sb.toString();
    }

    public static final int n(int i) {
        Integer num;
        if (i < 128) {
            return i;
        }
        if (i >= 32768) {
            int i2 = d[(i >> 10) & 31];
            int i3 = e[(i >> 5) & 31];
            int i4 = f[i & 31];
            int i5 = 0;
            if (i2 != -1 && i3 != -1) {
                if (i4 == -1) {
                    i4 = 0;
                }
                return (i3 * 28) + (i2 * 588) + 44032 + i4;
            }
            int length = (n36.a.length / 2) - 1;
            while (true) {
                if (i5 <= length) {
                    int i6 = (i5 + length) >>> 1;
                    int[] iArr = n36.a;
                    int i7 = i6 * 2;
                    int i8 = iArr[i7];
                    if (i8 == i) {
                        num = Integer.valueOf(iArr[i7 + 1]);
                        break;
                    } else if (i8 < i) {
                        i5 = i6 + 1;
                    } else {
                        length = i6 - 1;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    public static final void o(yj yjVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        boolean z3;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double d13 = ((d3 * sin) + (d2 * cos)) / d11;
        double d14 = ((d3 * cos) + ((-d2) * sin)) / d7;
        double d15 = ((d5 * sin) + (d4 * cos)) / d11;
        double d16 = ((d5 * cos) + ((-d4) * sin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 != 0.0d) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
                o(yjVar, d2, d3, d4, d5, d11 * sqrt, d7 * sqrt, d8, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d17 * sqrt2;
            double d24 = sqrt2 * d18;
            if (z == z2) {
                d9 = d19 - d24;
                d10 = d20 + d23;
            } else {
                d9 = d19 + d24;
                d10 = d20 - d23;
            }
            double atan2 = Math.atan2(d14 - d10, d13 - d9);
            double atan22 = Math.atan2(d16 - d10, d15 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d25 = d9 * d11;
            double d26 = d10 * d7;
            double d27 = (d25 * cos) - (d26 * sin);
            double d28 = (d26 * cos) + (d25 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d29 = -d11;
            double d30 = d29 * cos2;
            double d31 = d7 * sin2;
            double d32 = (d30 * sin3) - (d31 * cos3);
            double d33 = d29 * sin2;
            double d34 = d7 * cos2;
            double d35 = (cos3 * d34) + (sin3 * d33);
            double d36 = atan22 / ceil;
            double d37 = atan2;
            double d38 = d32;
            int i2 = 0;
            double d39 = d35;
            double d40 = d3;
            while (i2 < ceil) {
                double d41 = d37 + d36;
                double sin4 = Math.sin(d41);
                double cos4 = Math.cos(d41);
                int i3 = ceil;
                double d42 = (((d11 * cos2) * cos4) + d27) - (d31 * sin4);
                double d43 = (d34 * sin4) + (d11 * sin2 * cos4) + d28;
                double d44 = (d30 * sin4) - (d31 * cos4);
                double d45 = (cos4 * d34) + (sin4 * d33);
                double d46 = d41 - d37;
                double tan = Math.tan(d46 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
                yjVar.f((float) ((d38 * sqrt3) + d2), (float) ((d39 * sqrt3) + d40), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
                d36 = d36;
                d2 = d42;
                i2++;
                d33 = d33;
                sin2 = sin2;
                d27 = d27;
                d37 = d41;
                d39 = d45;
                d38 = d44;
                ceil = i3;
                d40 = d43;
                d11 = d6;
            }
        }
    }

    public static final rk9 p(mq7 mq7Var, boolean z, boolean z2) {
        if (!mq7Var.a.J) {
            return rk9.e;
        }
        if (!z) {
            i38 s = voe.s(mq7Var, 8);
            return obe.t(s).g0(s, z2);
        }
        return voe.s(mq7Var, 8).a2();
    }

    public static long q(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i3, 262142);
        int i7 = Integer.MAX_VALUE;
        if (i4 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i4, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                y02.l(i5);
                ls2.c();
                return 0L;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i2);
        }
        return y02.a(Math.min(i6, i), i7, min2, min);
    }

    public static long r(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i, 262142);
        int i7 = Integer.MAX_VALUE;
        if (i2 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i2, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                y02.l(i5);
                ls2.c();
                return 0L;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i4);
        }
        return y02.a(min2, min, Math.min(i6, i3), i7);
    }

    public static final byte[] s(byte[] bArr, boolean z) {
        bArr.getClass();
        Inflater inflater = new Inflater(z);
        inflater.setInput(bArr);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(64, bArr.length * 3));
            byte[] bArr2 = new byte[8192];
            while (!inflater.finished()) {
                int inflate = inflater.inflate(bArr2);
                if (inflate == 0) {
                    if (inflater.finished() || inflater.needsDictionary()) {
                        break;
                    } else if (inflater.needsInput()) {
                        throw new Exception("압축 해제 실패: 잘린 스트림");
                    }
                }
                if (inflate > 0) {
                    byteArrayOutputStream.write(bArr2, 0, inflate);
                    if (byteArrayOutputStream.size() > 104857600) {
                        throw new Exception("압축 해제 크기 초과 (ZIP bomb 의심)");
                    }
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            inflater.end();
            return byteArray;
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static final void t(z7a z7aVar) {
        voe.v(z7aVar).H();
    }

    public static h37 u(r0f r0fVar, xu9 xu9Var) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = xu9Var.a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ob4 ob4Var = (ob4) list2.get(i);
            List list3 = ob4Var.a;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((ob4Var instanceof jb4) && i2 == list3.size() / 2) {
                    arrayList2.add(new yk8(ob4Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list3.get(i2));
            }
        }
        Float valueOf = Float.valueOf((float) nae.e);
        int s = tl1.s(arrayList, 9);
        if (s == 0) {
            list = tl1.A(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(s + 1);
            arrayList3.add(valueOf);
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                qd2 qd2Var = (qd2) obj;
                float floatValue = valueOf.floatValue();
                qd2Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (r0f.u(qd2Var, Float.POSITIVE_INFINITY) & 4294967295L));
                if (intBitsToFloat >= nae.e) {
                    valueOf = Float.valueOf(floatValue + intBitsToFloat);
                    arrayList3.add(valueOf);
                } else {
                    vs.m("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) sl1.j0(list)).floatValue();
        tu7 tu7Var = new tu7(list.size());
        int size4 = list.size();
        for (int i4 = 0; i4 < size4; i4++) {
            tu7Var.a(((Number) list.get(i4)).floatValue() / floatValue2);
        }
        jq6 t = tl1.t();
        int size5 = arrayList2.size();
        for (int i5 = 0; i5 < size5; i5++) {
            int intValue = ((Number) ((yk8) arrayList2.get(i5)).b).intValue();
            t.add(new t79(d2d.c((tu7Var.b(intValue + 1) + tu7Var.b(intValue)) / 2.0f), (ob4) ((yk8) arrayList2.get(i5)).a));
        }
        return new h37(r0fVar, tl1.r(t), arrayList, tu7Var);
    }

    public static boolean v(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void w(List list, yj yjVar) {
        int i;
        fo8 fo8Var;
        Path path;
        int i2;
        float f2;
        int i3;
        fo8 fo8Var2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        List list2 = list;
        yj yjVar2 = yjVar;
        Path path2 = yjVar2.a;
        Path path3 = yjVar2.a;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            i = 1;
        } else {
            i = 0;
        }
        yjVar2.m();
        yjVar2.n(i);
        if (list2.isEmpty()) {
            fo8Var = nn8.c;
        } else {
            fo8Var = (fo8) list2.get(0);
        }
        int size = list2.size();
        float f9 = nae.e;
        int i4 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i4 < size) {
            fo8 fo8Var3 = (fo8) list2.get(i4);
            if (fo8Var3 instanceof nn8) {
                yjVar2.e();
                path = path3;
                i2 = size;
                f2 = f9;
                i3 = i4;
                fo8Var2 = fo8Var3;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else {
                if (fo8Var3 instanceof zn8) {
                    zn8 zn8Var = (zn8) fo8Var3;
                    float f16 = zn8Var.c;
                    f12 += f16;
                    float f17 = zn8Var.d;
                    f13 += f17;
                    path3.rMoveTo(f16, f17);
                    path = path3;
                    i2 = size;
                    f2 = f9;
                    i3 = i4;
                    f14 = f12;
                    f15 = f13;
                } else {
                    if (fo8Var3 instanceof rn8) {
                        rn8 rn8Var = (rn8) fo8Var3;
                        float f18 = rn8Var.c;
                        float f19 = rn8Var.d;
                        yjVar2.i(f18, f19);
                        f13 = f19;
                        f15 = f13;
                        path = path3;
                        f12 = f18;
                        f14 = f12;
                    } else {
                        if (fo8Var3 instanceof yn8) {
                            yn8 yn8Var = (yn8) fo8Var3;
                            float f20 = yn8Var.d;
                            float f21 = yn8Var.c;
                            path3.rLineTo(f21, f20);
                            f12 += f21;
                            f13 += f20;
                        } else if (fo8Var3 instanceof qn8) {
                            qn8 qn8Var = (qn8) fo8Var3;
                            float f22 = qn8Var.d;
                            float f23 = qn8Var.c;
                            yjVar2.h(f23, f22);
                            f12 = f23;
                            path = path3;
                            f13 = f22;
                        } else if (fo8Var3 instanceof xn8) {
                            float f24 = ((xn8) fo8Var3).c;
                            path3.rLineTo(f24, f9);
                            f12 += f24;
                        } else if (fo8Var3 instanceof pn8) {
                            float f25 = ((pn8) fo8Var3).c;
                            yjVar2.h(f25, f13);
                            f12 = f25;
                        } else if (fo8Var3 instanceof do8) {
                            float f26 = ((do8) fo8Var3).c;
                            path3.rLineTo(f9, f26);
                            f13 += f26;
                        } else if (fo8Var3 instanceof eo8) {
                            float f27 = ((eo8) fo8Var3).c;
                            yjVar2.h(f12, f27);
                            f13 = f27;
                        } else if (fo8Var3 instanceof wn8) {
                            wn8 wn8Var = (wn8) fo8Var3;
                            path3.rCubicTo(wn8Var.c, wn8Var.d, wn8Var.e, wn8Var.f, wn8Var.g, wn8Var.h);
                            Path path4 = path3;
                            float f28 = wn8Var.e + f12;
                            float f29 = wn8Var.f + f13;
                            f12 += wn8Var.g;
                            f13 += wn8Var.h;
                            f11 = f29;
                            path = path4;
                            i2 = size;
                            f2 = f9;
                            i3 = i4;
                            fo8Var2 = fo8Var3;
                            f10 = f28;
                        } else {
                            Path path5 = path3;
                            if (fo8Var3 instanceof on8) {
                                on8 on8Var = (on8) fo8Var3;
                                yjVar2.f(on8Var.c, on8Var.d, on8Var.e, on8Var.f, on8Var.g, on8Var.h);
                                float f30 = on8Var.e;
                                f11 = on8Var.f;
                                f12 = on8Var.g;
                                f13 = on8Var.h;
                                path = path5;
                                i2 = size;
                                f2 = f9;
                                i3 = i4;
                                fo8Var2 = fo8Var3;
                                f10 = f30;
                            } else {
                                if (fo8Var3 instanceof bo8) {
                                    if (fo8Var.a) {
                                        f7 = f12 - f10;
                                        f8 = f13 - f11;
                                    } else {
                                        f7 = f9;
                                        f8 = f7;
                                    }
                                    bo8 bo8Var = (bo8) fo8Var3;
                                    path5.rCubicTo(f7, f8, bo8Var.c, bo8Var.d, bo8Var.e, bo8Var.f);
                                    path5 = path5;
                                    f5 = bo8Var.c + f12;
                                    f6 = bo8Var.d + f13;
                                    f12 += bo8Var.e;
                                    f13 += bo8Var.f;
                                } else if (fo8Var3 instanceof tn8) {
                                    if (fo8Var.a) {
                                        f12 = (f12 * 2.0f) - f10;
                                        f13 = (2.0f * f13) - f11;
                                    }
                                    tn8 tn8Var = (tn8) fo8Var3;
                                    yjVar.f(f12, f13, tn8Var.c, tn8Var.d, tn8Var.e, tn8Var.f);
                                    float f31 = tn8Var.c;
                                    float f32 = tn8Var.d;
                                    f12 = tn8Var.e;
                                    f13 = tn8Var.f;
                                    path = path5;
                                    i2 = size;
                                    f2 = f9;
                                    i3 = i4;
                                    fo8Var2 = fo8Var3;
                                    f10 = f31;
                                    f11 = f32;
                                } else if (fo8Var3 instanceof ao8) {
                                    ao8 ao8Var = (ao8) fo8Var3;
                                    float f33 = ao8Var.f;
                                    float f34 = ao8Var.e;
                                    float f35 = ao8Var.d;
                                    float f36 = ao8Var.c;
                                    path5.rQuadTo(f36, f35, f34, f33);
                                    float f37 = f36 + f12;
                                    f11 = f35 + f13;
                                    f12 += f34;
                                    f13 += f33;
                                    f10 = f37;
                                    path = path5;
                                } else if (fo8Var3 instanceof sn8) {
                                    sn8 sn8Var = (sn8) fo8Var3;
                                    float f38 = sn8Var.f;
                                    float f39 = sn8Var.e;
                                    f11 = sn8Var.d;
                                    float f40 = sn8Var.c;
                                    yjVar.k(f40, f11, f39, f38);
                                    f13 = f38;
                                    f12 = f39;
                                    path = path5;
                                    i2 = size;
                                    f2 = f9;
                                    i3 = i4;
                                    fo8Var2 = fo8Var3;
                                    f10 = f40;
                                } else if (fo8Var3 instanceof co8) {
                                    if (fo8Var.b) {
                                        f3 = f12 - f10;
                                        f4 = f13 - f11;
                                    } else {
                                        f3 = f9;
                                        f4 = f3;
                                    }
                                    co8 co8Var = (co8) fo8Var3;
                                    float f41 = co8Var.d;
                                    float f42 = co8Var.c;
                                    path5.rQuadTo(f3, f4, f42, f41);
                                    f5 = f3 + f12;
                                    f6 = f4 + f13;
                                    f12 += f42;
                                    f13 += f41;
                                } else if (fo8Var3 instanceof un8) {
                                    if (fo8Var.b) {
                                        f12 = (f12 * 2.0f) - f10;
                                        f13 = (2.0f * f13) - f11;
                                    }
                                    un8 un8Var = (un8) fo8Var3;
                                    float f43 = un8Var.d;
                                    float f44 = un8Var.c;
                                    yjVar.k(f12, f13, f44, f43);
                                    path = path5;
                                    i2 = size;
                                    f2 = f9;
                                    i3 = i4;
                                    f10 = f12;
                                    f11 = f13;
                                    fo8Var2 = fo8Var3;
                                    f12 = f44;
                                    f13 = f43;
                                } else if (fo8Var3 instanceof vn8) {
                                    vn8 vn8Var = (vn8) fo8Var3;
                                    float f45 = vn8Var.h + f12;
                                    float f46 = vn8Var.i + f13;
                                    double d2 = vn8Var.c;
                                    double d3 = vn8Var.d;
                                    double d4 = vn8Var.e;
                                    boolean z = vn8Var.f;
                                    boolean z2 = vn8Var.g;
                                    i2 = size;
                                    f2 = nae.e;
                                    path = path5;
                                    i3 = i4;
                                    o(yjVar, f12, f13, f45, f46, d2, d3, d4, z, z2);
                                    f10 = f45;
                                    f12 = f10;
                                    f11 = f46;
                                    f13 = f11;
                                    fo8Var2 = fo8Var3;
                                } else {
                                    path = path5;
                                    i2 = size;
                                    f2 = f9;
                                    i3 = i4;
                                    if (fo8Var3 instanceof mn8) {
                                        mn8 mn8Var = (mn8) fo8Var3;
                                        float f47 = mn8Var.i;
                                        float f48 = mn8Var.h;
                                        fo8Var2 = fo8Var3;
                                        o(yjVar, f12, f13, f48, f47, mn8Var.c, mn8Var.d, mn8Var.e, mn8Var.f, mn8Var.g);
                                        f11 = f47;
                                        f13 = f11;
                                        f10 = f48;
                                        f12 = f10;
                                    } else {
                                        xk5.o();
                                        return;
                                    }
                                }
                                f10 = f5;
                                f11 = f6;
                                path = path5;
                            }
                        }
                        path = path3;
                    }
                    i2 = size;
                    f2 = f9;
                    i3 = i4;
                }
                fo8Var2 = fo8Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            yjVar2 = yjVar;
            size = i2;
            path3 = path;
            fo8Var = fo8Var2;
            f9 = f2;
        }
    }
}
