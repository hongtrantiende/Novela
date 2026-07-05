package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.DragEvent;
import java.util.Arrays;
import java.util.Locale;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tte  reason: default package */
/* loaded from: classes.dex */
public abstract class tte {
    public static final tu1 a = new tu1(new dv1(3), false, -868693768);
    public static final tu1 b = new tu1(new dv1(4), false, 1301177531);
    public static final int[] c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] e = {64, Token.ASSIGN_MOD, Token.CASE, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] f = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] g = {5, 8, 10, 12};
    public static final int[] h = {6, 9, 12, 15};
    public static final int[] i = {2, 4, 6, 8};
    public static final int[] j = {9, 11, 13, 16};
    public static final int[] k = {5, 8, 10, 12};

    public static final void a(shc shcVar, un6 un6Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(1220373486);
        if (rv4Var.h(shcVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2 | 16;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                un6Var = (un6) rv4Var.j(nu6.a);
            }
            int i7 = i6 & (-113);
            rv4Var.r();
            boolean f2 = rv4Var.f(shcVar) | rv4Var.f(un6Var);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new zn6(un6Var.k());
                rv4Var.o0(P);
            }
            b(un6Var, (zn6) P, xt4Var, rv4Var, i7 & 896);
        } else {
            rv4Var.X();
        }
        un6 un6Var2 = un6Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(shcVar, un6Var2, xt4Var, i2, 22);
        }
    }

    public static final void b(un6 un6Var, zn6 zn6Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(912823238);
        if ((i2 & 6) == 0) {
            if (rv4Var.h(un6Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(zn6Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        boolean z2 = false;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            boolean h2 = rv4Var.h(zn6Var);
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            boolean h3 = h2 | z2 | rv4Var.h(un6Var);
            Object P = rv4Var.P();
            if (h3 || P == ax1.a) {
                P = new nq3(un6Var, zn6Var, xt4Var, 9);
                rv4Var.o0(P);
            }
            yte.c(un6Var, zn6Var, (xt4) P, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(un6Var, zn6Var, xt4Var, i2, 18);
        }
    }

    public static final void c(Boolean bool, Object obj, un6 un6Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(696924721);
        if ((i2 & 6) == 0) {
            if (rv4Var.h(bool)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            i3 |= Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                un6Var = (un6) rv4Var.j(nu6.a);
            }
            int i7 = i3 & (-897);
            rv4Var.r();
            boolean f2 = rv4Var.f(bool) | rv4Var.f(obj) | rv4Var.f(un6Var);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new do6(un6Var.k());
                rv4Var.o0(P);
            }
            e(un6Var, (do6) P, xt4Var, rv4Var, (i7 >> 3) & 896);
        } else {
            rv4Var.X();
        }
        un6 un6Var2 = un6Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(bool, obj, un6Var2, xt4Var, i2, 6);
        }
    }

    public static final void d(Object obj, un6 un6Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        rv4Var.g0(-1408314671);
        if ((i2 & 6) == 0) {
            if (rv4Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
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
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                un6Var = (un6) rv4Var.j(nu6.a);
            }
            int i6 = i3 & (-113);
            rv4Var.r();
            boolean f2 = rv4Var.f(obj) | rv4Var.f(un6Var);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new do6(un6Var.k());
                rv4Var.o0(P);
            }
            e(un6Var, (do6) P, xt4Var, rv4Var, i6 & 896);
        } else {
            rv4Var.X();
        }
        un6 un6Var2 = un6Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(obj, un6Var2, xt4Var, i2, 17);
        }
    }

    public static final void e(un6 un6Var, do6 do6Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(228371534);
        if ((i2 & 6) == 0) {
            if (rv4Var.h(un6Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(do6Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        boolean z2 = false;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            boolean h2 = rv4Var.h(do6Var);
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            boolean h3 = h2 | z2 | rv4Var.h(un6Var);
            Object P = rv4Var.P();
            if (h3 || P == ax1.a) {
                P = new nq3(un6Var, do6Var, xt4Var, 10);
                rv4Var.o0(P);
            }
            yte.c(un6Var, do6Var, (xt4) P, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(un6Var, do6Var, xt4Var, i2, 19);
        }
    }

    public static final void f(vt4 vt4Var, xt4 xt4Var, yf0 yf0Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        long j2;
        long j3;
        final boolean z2;
        int i7;
        boolean z3;
        final ef2 ef2Var;
        Object obj;
        xt4 xt4Var2;
        vt4 vt4Var2;
        boolean z4;
        long j4;
        long j5;
        Object obj2;
        final float f2;
        float f3;
        rv4Var.g0(824439506);
        if (rv4Var.h(vt4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(yf0Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.f(nq7Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            if (nm3.c(rv4Var).e()) {
                rv4Var.e0(-2040434039);
                j2 = rm1.g(r0f.y(rv4Var), 8.0f);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2040358058);
                j2 = r0f.y(rv4Var).c;
                rv4Var.q(false);
            }
            long g2 = rm1.g(r0f.y(rv4Var), 8.0f);
            if (nm3.c(rv4Var).e()) {
                rv4Var.e0(-2040159782);
                j3 = r0f.y(rv4Var).o;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2040101099);
                rv4Var.q(false);
                j3 = zl1.e;
            }
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            if (rv4Var.j(dy1.n) == tc6.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            final float L0 = r13Var.L0(20.0f);
            Object P = rv4Var.P();
            long j6 = j3;
            Object obj3 = ax1.a;
            if (P == obj3) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            m82 m82Var = (m82) P;
            aw7 D = yae.D(vt4Var.invoke(), rv4Var);
            Object P2 = rv4Var.P();
            if (P2 == obj3) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var.o0(P2);
            }
            final aw7 aw7Var = (aw7) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj3) {
                if (((Boolean) vt4Var.invoke()).booleanValue()) {
                    f3 = 1.0f;
                } else {
                    f3 = nae.e;
                }
                P3 = hl5.g(f3, rv4Var);
            }
            final dm8 dm8Var = (dm8) P3;
            boolean f4 = rv4Var.f(m82Var);
            Object P4 = rv4Var.P();
            if (!f4 && P4 != obj3) {
                i7 = i11;
            } else {
                i7 = i11;
                P4 = new ef2(m82Var, dm8Var.h(), new jk1(nae.e, 1.0f), 1.5f, new tsa(2, (byte) 0), new hq(xt4Var, aw7Var, dm8Var, D), new mu4() { // from class: lab
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
                        if (r1 > 1.0f) goto L16;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
                        r7 = r1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
                        if (r1 > 1.0f) goto L16;
                     */
                    @Override // defpackage.mu4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object c(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
                        /*
                            r4 = this;
                            ef2 r5 = (defpackage.ef2) r5
                            zy5 r6 = (defpackage.zy5) r6
                            y78 r7 = (defpackage.y78) r7
                            r5.getClass()
                            aw7 r5 = r3
                            java.lang.Object r6 = r5.getValue()
                            java.lang.Boolean r6 = (java.lang.Boolean) r6
                            boolean r6 = r6.booleanValue()
                            r0 = 32
                            r1 = 0
                            if (r6 != 0) goto L32
                            long r2 = r7.a
                            long r2 = r2 >> r0
                            int r6 = (int) r2
                            float r6 = java.lang.Float.intBitsToFloat(r6)
                            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                            r2 = 1
                            if (r6 != 0) goto L29
                            r6 = r2
                            goto L2a
                        L29:
                            r6 = 0
                        L2a:
                            r6 = r6 ^ r2
                            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                            r5.setValue(r6)
                        L32:
                            long r5 = r7.a
                            long r5 = r5 >> r0
                            int r5 = (int) r5
                            float r5 = java.lang.Float.intBitsToFloat(r5)
                            float r6 = r1
                            float r5 = r5 / r6
                            boolean r6 = r2
                            dm8 r4 = r4
                            r7 = 1065353216(0x3f800000, float:1.0)
                            if (r6 == 0) goto L57
                            float r6 = r4.h()
                            float r6 = r6 + r5
                            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                            if (r5 >= 0) goto L4f
                            goto L50
                        L4f:
                            r1 = r6
                        L50:
                            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                            if (r5 <= 0) goto L55
                            goto L66
                        L55:
                            r7 = r1
                            goto L66
                        L57:
                            float r6 = r4.h()
                            float r6 = r6 - r5
                            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                            if (r5 >= 0) goto L61
                            goto L62
                        L61:
                            r1 = r6
                        L62:
                            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                            if (r5 <= 0) goto L55
                        L66:
                            r4.i(r7)
                            pvc r4 = defpackage.pvc.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lab.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
                rv4Var.o0(P4);
            }
            Object obj4 = (ef2) P4;
            boolean h2 = rv4Var.h(obj4);
            Object P5 = rv4Var.P();
            if (h2 || P5 == obj3) {
                P5 = new koa(dm8Var, obj4, null, 7);
                rv4Var.o0(P5);
            }
            yte.g((lu4) P5, rv4Var, obj4);
            if ((i7 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h3 = z3 | rv4Var.h(obj4);
            Object P6 = rv4Var.P();
            if (!h3 && P6 != obj3) {
                obj2 = P6;
                z4 = z2;
                ef2Var = obj4;
                j4 = g2;
                j5 = j6;
                vt4Var2 = vt4Var;
                obj = obj3;
                xt4Var2 = null;
            } else {
                ef2Var = obj4;
                obj = obj3;
                xt4Var2 = null;
                vt4Var2 = vt4Var;
                z4 = z2;
                j4 = g2;
                j5 = j6;
                Object jk8Var = new jk8(vt4Var2, ef2Var, dm8Var, null, 27);
                rv4Var.o0(jk8Var);
                obj2 = jk8Var;
            }
            yte.g((lu4) obj2, rv4Var, vt4Var2);
            ec6 R = h9a.R(xt4Var2, rv4Var, 3);
            b37 d2 = fu0.d(kh5.d, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var3 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 k2 = k(aze.t(kq7Var, R), bue.a(100.0f));
            boolean h4 = rv4Var.h(ef2Var) | rv4Var.e(j4) | rv4Var.e(j2);
            Object P7 = rv4Var.P();
            if (h4 || P7 == obj) {
                f2 = L0;
                Object mabVar = new mab(ef2Var, j4, j2, 0);
                rv4Var.o0(mabVar);
                P7 = mabVar;
            } else {
                f2 = L0;
            }
            fu0.a(pna.p(ote.r(k2, (xt4) P7), 64.0f, 28.0f), rv4Var, 0);
            final boolean z5 = z4;
            boolean h5 = rv4Var.h(ef2Var) | rv4Var.g(z5) | rv4Var.c(f2);
            Object P8 = rv4Var.P();
            if (h5 || P8 == obj) {
                P8 = new xt4() { // from class: nab
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        float o;
                        t15 t15Var = (t15) obj5;
                        t15Var.getClass();
                        float c2 = ef2.this.c();
                        float f5 = t15Var.f() * 2.0f;
                        boolean z6 = z5;
                        float f6 = f2;
                        if (z6) {
                            o = b23.o(f5, f6 + f5, c2);
                        } else {
                            o = b23.o(-f5, -(f5 + f6), c2);
                        }
                        t15Var.x(o);
                        return pvc.a;
                    }
                };
                rv4Var.o0(P8);
            }
            nq7 k3 = axe.k(kq7Var, (xt4) P8);
            Object P9 = rv4Var.P();
            if (P9 == obj) {
                P9 = new dva(11);
                rv4Var.o0(P9);
            }
            nq7 a0 = y7a.c(k3, false, (xt4) P9).a0(ef2Var.s);
            boolean h6 = rv4Var.h(ef2Var);
            Object P10 = rv4Var.P();
            if (h6 || P10 == obj) {
                P10 = new el7(ef2Var, 22);
                rv4Var.o0(P10);
            }
            lu4 lu4Var = (lu4) P10;
            lu4Var.getClass();
            boolean f5 = rv4Var.f(R) | rv4Var.f(lu4Var);
            Object P11 = rv4Var.P();
            if (f5 || P11 == obj) {
                P11 = new xf0(R, lu4Var);
                rv4Var.o0(P11);
            }
            do1 M = owe.M(yf0Var, (xf0) P11, rv4Var, (i7 >> 6) & 14);
            Object P12 = rv4Var.P();
            if (P12 == obj) {
                P12 = new n3b(25);
                rv4Var.o0(P12);
            }
            vt4 vt4Var4 = (vt4) P12;
            boolean h7 = rv4Var.h(ef2Var);
            Object P13 = rv4Var.P();
            if (h7 || P13 == obj) {
                P13 = new ft0(ef2Var, 6);
                rv4Var.o0(P13);
            }
            xt4 xt4Var3 = (xt4) P13;
            boolean h8 = rv4Var.h(ef2Var);
            Object P14 = rv4Var.P();
            if (h8 || P14 == obj) {
                P14 = new ct0(ef2Var, 6);
                rv4Var.o0(P14);
            }
            vt4 vt4Var5 = (vt4) P14;
            Object P15 = rv4Var.P();
            if (P15 == obj) {
                P15 = new n3b(26);
                rv4Var.o0(P15);
            }
            vt4 vt4Var6 = (vt4) P15;
            boolean h9 = rv4Var.h(ef2Var);
            Object P16 = rv4Var.P();
            if (h9 || P16 == obj) {
                P16 = new ct0(ef2Var, 7);
                rv4Var.o0(P16);
            }
            vt4 vt4Var7 = (vt4) P16;
            boolean h10 = rv4Var.h(ef2Var);
            Object P17 = rv4Var.P();
            if (h10 || P17 == obj) {
                P17 = new ft0(ef2Var, 7);
                rv4Var.o0(P17);
            }
            xt4 xt4Var4 = (xt4) P17;
            long j7 = j5;
            boolean h11 = rv4Var.h(ef2Var) | rv4Var.e(j7);
            Object P18 = rv4Var.P();
            if (h11 || P18 == obj) {
                P18 = new lh6(ef2Var, j7, 6);
                rv4Var.o0(P18);
            }
            fu0.a(pna.p(rse.e(a0, M, vt4Var4, xt4Var3, vt4Var5, vt4Var6, vt4Var7, xt4Var4, (xt4) P18, 2944), 40.0f, 24.0f), rv4Var, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rj7(vt4Var, xt4Var, yf0Var, nq7Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(boolean r15, boolean r16, defpackage.nq7 r17, defpackage.xt4 r18, defpackage.rv4 r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tte.g(boolean, boolean, nq7, xt4, rv4, int, int):void");
    }

    public static final void h(q9d q9dVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        q9dVar.getClass();
        rv4Var.g0(-1691625831);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(q9dVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            x04 x04Var = q9dVar.a;
            x04Var.getClass();
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new x8d(1);
                rv4Var.o0(P);
            }
            sye.a(x04Var, nq7Var, (xt4) P, rv4Var, (i3 & Token.ASSIGN_MOD) | 384);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yy7(q9dVar, nq7Var, i2, 3);
        }
    }

    public static final String i(xl0 xl0Var) {
        hn0 hn0Var = xl0Var.b;
        if (hn0Var instanceof fe2) {
            return hn0Var.c();
        }
        dm0 dm0Var = xl0Var.c;
        if (dm0Var instanceof am0) {
            return ((am0) dm0Var).a;
        }
        return hn0Var.c();
    }

    public static final boolean j(q9d q9dVar, float f2) {
        Context context;
        Object obj;
        int n;
        q9dVar.getClass();
        Object obj2 = q9dVar.c;
        AudioManager audioManager = null;
        if (obj2 instanceof Context) {
            context = (Context) obj2;
        } else {
            context = null;
        }
        if (context != null) {
            obj = context.getSystemService("audio");
        } else {
            obj = null;
        }
        if (obj instanceof AudioManager) {
            audioManager = obj;
        }
        if (audioManager == null) {
            return false;
        }
        float m = dce.m(f2, nae.e, 1.0f);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0) {
            n = 0;
        } else {
            n = dce.n(k27.A(m * streamMaxVolume), 0, streamMaxVolume);
        }
        audioManager.setStreamVolume(3, n, 0);
        return true;
    }

    public static final nq7 k(nq7 nq7Var, wea weaVar) {
        return axe.l(nq7Var, nae.e, nae.e, nae.e, nae.e, nae.e, weaVar, true, null, 1042431);
    }

    public static final nq7 l(nq7 nq7Var) {
        return axe.l(nq7Var, nae.e, nae.e, nae.e, nae.e, nae.e, null, true, null, 1044479);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tte.m(byte[]):int");
    }

    public static int n(int i2) {
        if (i2 != 2147385345 && i2 != -25230976 && i2 != 536864768 && i2 != -14745368) {
            if (i2 != 1683496997 && i2 != 622876772) {
                if (i2 != 1078008818 && i2 != -233094848) {
                    if (i2 != 1908687592 && i2 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static ea1 o(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 != Byte.MAX_VALUE && b2 != 100 && b2 != 64 && b2 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b3 = copyOf[0];
            if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b4 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b4;
                }
            }
            ea1 ea1Var = new ea1(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                ea1 ea1Var2 = new ea1(copyOf, copyOf.length);
                while (ea1Var2.b() >= 16) {
                    ea1Var2.o(2);
                    int g2 = ea1Var2.g(14) & 16383;
                    int min = Math.min(8 - ea1Var.d, 14);
                    int i4 = ea1Var.d;
                    int i5 = (8 - i4) - min;
                    byte[] bArr3 = ea1Var.b;
                    int i6 = ea1Var.c;
                    byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                    bArr3[i6] = b5;
                    int i7 = 14 - min;
                    bArr3[i6] = (byte) (b5 | ((g2 >>> i7) << i5));
                    int i8 = i6 + 1;
                    while (true) {
                        bArr2 = ea1Var.b;
                        if (i7 > 8) {
                            bArr2[i8] = (byte) (g2 >>> (i7 - 8));
                            i7 -= 8;
                            i8++;
                        }
                    }
                    int i9 = 8 - i7;
                    byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                    bArr2[i8] = b6;
                    bArr2[i8] = (byte) (((g2 & ((1 << i7) - 1)) << i9) | b6);
                    ea1Var.o(14);
                    ea1Var.a();
                }
            }
            ea1Var.l(copyOf, copyOf.length);
            return ea1Var;
        }
        return new ea1(bArr, bArr.length);
    }

    public static final long p(bh3 bh3Var) {
        DragEvent dragEvent = bh3Var.a;
        return (Float.floatToRawIntBits(dragEvent.getX()) << 32) | (Float.floatToRawIntBits(dragEvent.getY()) & 4294967295L);
    }

    public static xu5 q(xl3 xl3Var, yo9 yo9Var, long j2, int i2) {
        if ((i2 & 2) != 0) {
            yo9Var = yo9.a;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new xu5(xl3Var, yo9Var, j2);
    }

    public static String r(String str) {
        String str2;
        int i2;
        boolean z;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = "";
        }
        int length = str2.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            if (!z2) {
                i2 = i3;
            } else {
                i2 = length;
            }
            if (c16.l(str2.charAt(i2), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i3++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        return str2.subSequence(i3, length + 1).toString();
    }

    public static int s(ea1 ea1Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && ea1Var.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return ea1Var.g(iArr[i2]) + i4;
    }

    public static final nq7 t(nq7 nq7Var, float f2) {
        if (f2 == nae.e) {
            return nq7Var;
        }
        return axe.l(nq7Var, nae.e, nae.e, nae.e, nae.e, f2, null, false, null, 1048319);
    }

    public static final nq7 u(nq7 nq7Var, x2a x2aVar, ff8 ff8Var, wi wiVar, boolean z, boolean z2, li4 li4Var, yu7 yu7Var, xi8 xi8Var) {
        nq7 k2;
        ff8 ff8Var2 = ff8.a;
        kq7 kq7Var = kq7.a;
        if (ff8Var == ff8Var2) {
            k2 = k(kq7Var, ba5.c);
        } else {
            k2 = k(kq7Var, ba5.b);
        }
        return nq7Var.a0(k2).a0(new m2a(wiVar, xi8Var, li4Var, yu7Var, ff8Var, x2aVar, z, z2, false));
    }

    public static gxa v(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new gxa(f2, f3, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String w(java.lang.String r3) {
        /*
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            int r0 = r3.hashCode()
            java.lang.String r1 = "audio/mp4"
            java.lang.String r2 = "audio/wav"
            switch(r0) {
                case -1662095187: goto L8a;
                case -979095690: goto L7e;
                case -622808459: goto L75;
                case -586683234: goto L6b;
                case 64194685: goto L61;
                case 187078282: goto L57;
                case 187090232: goto L50;
                case 187091926: goto L46;
                case 187099443: goto L3f;
                case 1331848029: goto L35;
                case 1504831518: goto L2b;
                case 1505115538: goto L21;
                case 1505118770: goto L16;
                default: goto L14;
            }
        L14:
            goto L92
        L16:
            java.lang.String r0 = "audio/webm"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L20
            goto L92
        L20:
            return r0
        L21:
            java.lang.String r0 = "audio/wave"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L74
            goto L92
        L2b:
            java.lang.String r0 = "audio/mpeg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L92
        L34:
            return r0
        L35:
            java.lang.String r0 = "video/mp4"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3e
            goto L92
        L3e:
            return r0
        L3f:
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L74
            goto L92
        L46:
            java.lang.String r0 = "audio/ogg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
            goto L92
        L4f:
            return r0
        L50:
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L60
            goto L92
        L57:
            java.lang.String r0 = "audio/aac"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L92
        L60:
            return r1
        L61:
            java.lang.String r0 = "application/dash+xml"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6a
            goto L92
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "audio/x-wav"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L74
            goto L92
        L74:
            return r2
        L75:
            java.lang.String r0 = "application/vnd.apple.mpegurl"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L87
            goto L92
        L7e:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L87
            goto L92
        L87:
            java.lang.String r3 = "application/x-mpegURL"
            return r3
        L8a:
            java.lang.String r0 = "video/webm"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L94
        L92:
            r3 = 0
            return r3
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tte.w(java.lang.String):java.lang.String");
    }

    public static arc x(int i2, int i3, mn3 mn3Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            mn3Var = on3.a;
        }
        return new arc(i2, i3, mn3Var);
    }
}
