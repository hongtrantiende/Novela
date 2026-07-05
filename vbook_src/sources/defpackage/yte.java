package defpackage;

import android.content.ClipData;
import java.util.Arrays;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yte  reason: default package */
/* loaded from: classes3.dex */
public abstract class yte {
    public static final tu1 a = new tu1(new cv1(20), false, 589625519);
    public static final tu1 b = new tu1(new wu1(10), false, 2097121432);
    public static final ib3 c = new Object();
    public static final rk9 d = new rk9(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static void A(yeb yebVar, String str) {
        fuc fucVar = xc1.a;
        fucVar.getClass();
        byte[] a2 = xc1.a(str, fucVar);
        yebVar.write(a2, 0, a2.length);
    }

    public static es a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = nae.e;
        }
        return new es(fca.f, Float.valueOf(f), new fs(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(Object obj, xt4 xt4Var, rv4 rv4Var) {
        boolean f = rv4Var.f(obj);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new gb3(xt4Var);
            rv4Var.o0(P);
        }
        gb3 gb3Var = (gb3) P;
    }

    public static final void c(Object obj, Object obj2, xt4 xt4Var, rv4 rv4Var) {
        boolean f = rv4Var.f(obj) | rv4Var.f(obj2);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new gb3(xt4Var);
            rv4Var.o0(P);
        }
        gb3 gb3Var = (gb3) P;
    }

    public static final void d(Object obj, Object obj2, Object obj3, xt4 xt4Var, rv4 rv4Var) {
        boolean f = rv4Var.f(obj) | rv4Var.f(obj2) | rv4Var.f(obj3);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new gb3(xt4Var);
            rv4Var.o0(P);
        }
        gb3 gb3Var = (gb3) P;
    }

    public static final void e(Object[] objArr, xt4 xt4Var, rv4 rv4Var) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= rv4Var.f(obj);
        }
        Object P = rv4Var.P();
        if (!z && P != ax1.a) {
            return;
        }
        rv4Var.o0(new gb3(xt4Var));
    }

    public static final void f(final xl0 xl0Var, final vt4 vt4Var, final float f, final int i, final int i2, final rm0 rm0Var, final zl0 zl0Var, nq7 nq7Var, rv4 rv4Var, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        xl0 xl0Var2;
        rv4 rv4Var2;
        final kq7 kq7Var;
        xl0 xl0Var3;
        int i10;
        boolean z2;
        int n;
        hn0 hn0Var = xl0Var.b;
        vt4Var.getClass();
        rm0Var.getClass();
        zl0Var.getClass();
        rv4Var.g0(1849719354);
        if (rv4Var.f(xl0Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i11 = i3 | i4;
        if (rv4Var.c(f)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i12 = i11 | i5;
        if (rv4Var.d(i)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (rv4Var.d(i2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(rm0Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i8;
        if (rv4Var.h(zl0Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = 12582912 | i15 | i9;
        if ((4793491 & i16) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i16 & 1, z)) {
            String c2 = hn0Var.c();
            c2.getClass();
            tm0 tm0Var = (tm0) rm0Var.b.get(c2);
            if (tm0Var == null) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new lu4(vt4Var, f, i, i2, rm0Var, zl0Var, i3) { // from class: aj3
                        public final /* synthetic */ zl0 C;
                        public final /* synthetic */ vt4 b;
                        public final /* synthetic */ float c;
                        public final /* synthetic */ int d;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ rm0 f;

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int p = xoe.p(2359345);
                            yte.f(xl0.this, this.b, this.c, this.d, this.e, this.f, this.C, kq7.a, (rv4) obj, p);
                            return pvc.a;
                        }
                    };
                    return;
                }
                return;
            }
            xl0Var2 = xl0Var;
            e81 e81Var = (e81) rv4Var.j(jt6.a);
            String str = null;
            if (!hn0Var.a() || xl0Var2.d.a == (n = dce.n(i, 0, 5))) {
                xl0Var3 = xl0Var2;
            } else {
                xl0Var3 = xl0.a(xl0Var2, null, null, new yl0(n), 7);
            }
            int i17 = i2 - 1;
            if (i17 > 0) {
                str = a82.j(i17, "+");
            }
            String str2 = str;
            if (xl0Var3.b.a()) {
                i10 = xl0Var3.d.a;
            } else {
                i10 = 0;
            }
            r71 r71Var = e81Var.c;
            p71 p71Var = e81Var.a;
            xl0 xl0Var4 = xl0Var3;
            yya a2 = nq.a((24.0f * i10) + 16.0f + 4.0f, tte.x(150, 0, qt5.a, 2), "DragPreviewBadgeIndentation", rv4Var, 384, 8);
            kq7 kq7Var2 = kq7.a;
            nq7 f2 = pna.f(kq7Var2, 1.0f);
            if ((i16 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new ni3(f, 1, vt4Var);
                rv4Var.o0(P);
            }
            nq7 k = axe.k(f2, (xt4) P);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, k);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tm0Var.a(xl0Var4, false, false, zbe.z(kq7Var2, 16.0f, 4.0f), zl0Var, rv4Var, (57344 & (i16 >> 6)) | 432);
            rv4Var2 = rv4Var;
            if (str2 != null) {
                rv4Var2.e0(-869953805);
                qye.b(str2, zbe.z(nmd.v(zbe.C(pu0.a.a(kq7Var2, nk0Var), ((rg3) a2.getValue()).a, nae.e, nae.e, nae.e, 14), p71Var.a, uu9.a), 6.0f, 2.0f), oyb.a(e81Var.b.a, p71Var.b, zr1.q(12), null, null, null, 0L, null, 0, 0L, null, 16777212), null, 0, false, 0, 0, null, rv4Var, 0, 1016);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-869241394);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            xl0Var2 = xl0Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            final xl0 xl0Var5 = xl0Var2;
            u2.d = new lu4(vt4Var, f, i, i2, rm0Var, zl0Var, kq7Var, i3) { // from class: bj3
                public final /* synthetic */ zl0 C;
                public final /* synthetic */ nq7 D;
                public final /* synthetic */ vt4 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ rm0 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(2359345);
                    yte.f(xl0.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void g(lu4 lu4Var, rv4 rv4Var, Object obj) {
        d82 d82Var = rv4Var.R;
        boolean f = rv4Var.f(obj);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new cc6(d82Var, lu4Var);
            rv4Var.o0(P);
        }
        cc6 cc6Var = (cc6) P;
    }

    public static final void h(Object obj, Object obj2, lu4 lu4Var, rv4 rv4Var) {
        d82 d82Var = rv4Var.R;
        boolean f = rv4Var.f(obj) | rv4Var.f(obj2);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new cc6(d82Var, lu4Var);
            rv4Var.o0(P);
        }
        cc6 cc6Var = (cc6) P;
    }

    public static final void i(Object obj, Object obj2, Object obj3, lu4 lu4Var, rv4 rv4Var) {
        d82 d82Var = rv4Var.R;
        boolean f = rv4Var.f(obj) | rv4Var.f(obj2) | rv4Var.f(obj3);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new cc6(d82Var, lu4Var);
            rv4Var.o0(P);
        }
        cc6 cc6Var = (cc6) P;
    }

    public static final void j(Object[] objArr, lu4 lu4Var, rv4 rv4Var) {
        d82 d82Var = rv4Var.R;
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= rv4Var.f(obj);
        }
        Object P = rv4Var.P();
        if (!z && P != ax1.a) {
            return;
        }
        rv4Var.o0(new cc6(d82Var, lu4Var));
    }

    public static final void k(vt4 vt4Var, rv4 rv4Var) {
        re8 re8Var = rv4Var.M.b.d;
        re8Var.p(fe8.c);
        vve.l(re8Var, 0, vt4Var);
    }

    public static e0 l(float f, float f2, float f3, float f4) {
        return new e0(f, 100, f2, 100, f3, 100, f4, 100);
    }

    public static final void m(j9d j9dVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        j9dVar.getClass();
        rv4Var.g0(219059943);
        if (rv4Var.f(j9dVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if (j9dVar instanceof xy7) {
                rv4Var.e0(1959587347);
                lre.b(((xy7) j9dVar).a, nq7Var, rv4Var, 48);
                rv4Var.q(false);
            } else if (j9dVar instanceof phd) {
                rv4Var.e0(1959763985);
                lhd lhdVar = ((phd) j9dVar).a;
                yy9 yy9Var = lhd.n;
                vve.a(lhdVar, nq7Var, rv4Var, 56);
                rv4Var.q(false);
            } else {
                throw rs8.b(63211007, rv4Var, false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kbd(j9dVar, nq7Var, i, 1);
        }
    }

    public static final double n(double d2) {
        return (d2 / 180.0d) * 3.141592653589793d;
    }

    public static void o(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                xk5.k(a82.j(i2, "at index "));
                return;
            }
        }
    }

    public static final void p(int i) {
        if (i >= 1) {
            return;
        }
        p1a.k(a82.j(i, "Expected positive parallelism level, but got "));
    }

    public static final boolean q(long j, rk9 rk9Var) {
        float f = rk9Var.a;
        float f2 = rk9Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f <= intBitsToFloat && intBitsToFloat <= f2) {
            float f3 = rk9Var.b;
            float f4 = rk9Var.d;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static es r(es esVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) esVar.b.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((fs) esVar.c).a;
        }
        return new es(esVar.a, Float.valueOf(f), new fs(f2), esVar.d, esVar.e, esVar.f);
    }

    public static final m82 s(rv4 rv4Var) {
        return new en9(rv4Var.R);
    }

    public static final long t(f7a f7aVar, long j, f6a f6aVar) {
        sc6 c2;
        int b2;
        long a2;
        long j2;
        float f;
        it7 it7Var;
        int d2;
        float h;
        float m;
        it7 it7Var2;
        int d3;
        it7 it7Var3;
        int d4;
        float b3;
        it7 it7Var4;
        int d5;
        cu7 f2 = f7aVar.f(f6aVar);
        if (f2 != null) {
            p6a p6aVar = f2.c;
            sc6 sc6Var = f7aVar.H;
            if (sc6Var != null && (c2 = f2.c()) != null) {
                int i = f6aVar.b;
                fvb fvbVar = (fvb) p6aVar.invoke();
                if (fvbVar == null) {
                    b2 = 0;
                } else {
                    b2 = f2.b(fvbVar);
                }
                if (i <= b2) {
                    y78 y78Var = (y78) f7aVar.M.getValue();
                    y78Var.getClass();
                    float intBitsToFloat = Float.intBitsToFloat((int) (c2.e0(sc6Var, y78Var.a) >> 32));
                    fvb fvbVar2 = (fvb) p6aVar.invoke();
                    if (fvbVar2 == null) {
                        a2 = fxb.b;
                    } else {
                        it7 it7Var5 = fvbVar2.b;
                        int b4 = f2.b(fvbVar2);
                        if (b4 < 1) {
                            a2 = fxb.b;
                        } else {
                            int d6 = it7Var5.d(dce.n(i, 0, b4 - 1));
                            a2 = sze.a(fvbVar2.i(d6), it7Var5.c(d6, true));
                        }
                    }
                    if (fxb.d(a2)) {
                        fvb fvbVar3 = (fvb) p6aVar.invoke();
                        if (fvbVar3 == null || (d5 = (it7Var4 = fvbVar3.b).d(i)) >= it7Var4.f) {
                            m = -1.0f;
                        } else {
                            m = fvbVar3.g(d5);
                        }
                        j2 = 4294967295L;
                    } else {
                        j2 = 4294967295L;
                        int i2 = (int) (a2 >> 32);
                        fvb fvbVar4 = (fvb) p6aVar.invoke();
                        if (fvbVar4 == null || (d3 = (it7Var2 = fvbVar4.b).d(i2)) >= it7Var2.f) {
                            f = -1.0f;
                        } else {
                            f = fvbVar4.g(d3);
                        }
                        int i3 = ((int) (a2 & 4294967295L)) - 1;
                        fvb fvbVar5 = (fvb) p6aVar.invoke();
                        if (fvbVar5 == null || (d2 = (it7Var = fvbVar5.b).d(i3)) >= it7Var.f) {
                            h = -1.0f;
                        } else {
                            h = fvbVar5.h(d2);
                        }
                        m = dce.m(intBitsToFloat, Math.min(f, h), Math.max(f, h));
                    }
                    if (m != -1.0f) {
                        if (zy5.b(j, 0L) || Math.abs(intBitsToFloat - m) <= ((int) (j >> 32)) / 2) {
                            fvb fvbVar6 = (fvb) p6aVar.invoke();
                            if (fvbVar6 == null || (d4 = (it7Var3 = fvbVar6.b).d(i)) >= it7Var3.f) {
                                b3 = -1.0f;
                            } else {
                                float f3 = it7Var3.f(d4);
                                b3 = ((it7Var3.b(d4) - f3) / 2.0f) + f3;
                            }
                            if (b3 == -1.0f) {
                                return 9205357640488583168L;
                            }
                            return sc6Var.e0(c2, (Float.floatToRawIntBits(m) << 32) | (Float.floatToRawIntBits(b3) & j2));
                        }
                        return 9205357640488583168L;
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x011d, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
        r14 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hc5 u(java.lang.String r20, defpackage.oc5 r21) {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yte.u(java.lang.String, oc5):hc5");
    }

    public static final void v(pj1 pj1Var, String str) {
        ClipData newPlainText = ClipData.newPlainText("plain text", str);
        newPlainText.getClass();
        ((wf) pj1Var).a.p().setPrimaryClip(newPlainText);
    }

    public static final rk9 w(sc6 sc6Var) {
        rk9 q = obe.q(sc6Var, true);
        return npe.l(sc6Var.O(q.j()), sc6Var.O(q.e()));
    }

    public static final void x(yeb yebVar, int i) {
        z(yebVar, i & 255);
        z(yebVar, (i >>> 8) & 255);
    }

    public static final void y(yeb yebVar, int i) {
        z(yebVar, i & 255);
        z(yebVar, (i >>> 8) & 255);
        z(yebVar, (i >>> 16) & 255);
        z(yebVar, (i >>> 24) & 255);
    }

    public static final void z(yeb yebVar, int i) {
        byte[] bArr = yebVar.b;
        bArr[0] = (byte) i;
        yebVar.write(bArr, 0, 1);
    }
}
