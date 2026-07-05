package defpackage;

import android.graphics.RectF;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lye  reason: default package */
/* loaded from: classes.dex */
public abstract class lye {
    public static final tu1 a = new tu1(new kv1(2), false, -1415327272);
    public static final tu1 b = new tu1(new jv1(28), false, -1793846060);
    public static final tu1 c = new tu1(new jv1(29), false, -1140526960);
    public static final tu1 d = new tu1(new lv1(0), false, 1906532231);
    public static final zg4[] e = {new zg4(13, new int[]{Token.CATCH, 80, 78, 71, 13, 10, 26, 10}, "png", "image/png"), new zg4(13, new int[]{255, 216, 255}, "jpg", "image/jpeg"), new zg4(13, new int[]{71, 73, 70, 56}, "gif", "image/gif"), new zg4(13, new int[]{66, 77}, "bmp", "image/bmp")};

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0167, code lost:
        if (r5.equals(r12) != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.vk8 r17, final defpackage.nq7 r18, final defpackage.dc r19, final defpackage.w22 r20, final float r21, final boolean r22, final boolean r23, defpackage.rv4 r24, final int r25) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lye.a(vk8, nq7, dc, w22, float, boolean, boolean, rv4, int):void");
    }

    public static final void b(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-435466793);
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
                pb2 pb2Var2 = pb2Var;
                f(yqe.A((y3b) b3b.m.getValue(), rv4Var), (wwb) ((fdd) voe.z(cm9.a(wwb.class), a2.i(), null, pb2Var2, o96.a(rv4Var), null)), cz7Var, rv4Var, (i3 << 6) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 21);
        }
    }

    public static final void c(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(759422694);
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
                pb2 pb2Var2 = pb2Var;
                f(yqe.A((y3b) b3b.o.getValue(), rv4Var), (xwb) ((fdd) voe.z(cm9.a(xwb.class), a2.i(), null, pb2Var2, o96.a(rv4Var), null)), cz7Var, rv4Var, (i3 << 6) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 20);
        }
    }

    public static final void d(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        pb2 pb2Var;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1327290791);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new v85(str, 17);
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
                pb2 pb2Var2 = pb2Var;
                f(yqe.A((y3b) b3b.n.getValue(), rv4Var), (bxb) ((fdd) voe.z(cm9.a(bxb.class), a2.i(), null, pb2Var2, o96.a(rv4Var), vt4Var)), cz7Var, rv4Var, (i5 << 3) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 12);
        }
    }

    public static final void e(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        pb2 pb2Var;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1789849208);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new v85(str, 18);
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
                pb2 pb2Var2 = pb2Var;
                f(yqe.A((y3b) b3b.p.getValue(), rv4Var), (dxb) ((fdd) voe.z(cm9.a(dxb.class), a2.i(), null, pb2Var2, o96.a(rv4Var), vt4Var)), cz7Var, rv4Var, (i5 << 3) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 13);
        }
    }

    public static final void f(String str, kf9 kf9Var, cz7 cz7Var, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        aw7 aw7Var;
        boolean z4;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(325513791);
        if ((i & 6) == 0) {
            obj = str;
            if (rv4Var.f(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            obj = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(kf9Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(cz7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            aw7 z5 = jsc.z((aza) kf9Var.c.getValue(), rv4Var);
            eo3 F = nmd.F(rv4Var);
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (P == obj2) {
                P = yae.z(null);
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            zu8 zu8Var = new zu8(tl1.A("txt"));
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = new wmb(aw7Var2, 18);
                rv4Var.o0(P2);
            }
            kd4 v = w92.v(zu8Var, (xt4) P2, rv4Var, 56);
            Object[] objArr = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == obj2) {
                P3 = new ekb(19);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P3, rv4Var, 48);
            kb kbVar = (kb) rv4Var.j(yb.a);
            s02 s02Var = kf9Var.d;
            boolean f = rv4Var.f(kbVar);
            Object P4 = rv4Var.P();
            if (f || P4 == obj2) {
                P4 = new wa(20, kbVar, (m42) null);
                rv4Var.o0(P4);
            }
            jye.b(s02Var, null, (mu4) P4, rv4Var, 0);
            int i6 = i2;
            fxe.h(obj, pna.c, false, jce.E(420913851, new ri9(cz7Var, 22), rv4Var), jce.E(1033005668, new ob9(aw7Var3, kf9Var, v, 2), rv4Var), jce.E(332432256, new t81(9, z5, F), rv4Var), jce.E(-1935902838, new cs1(18, F, kf9Var, z5), rv4Var), rv4Var, (i6 & 14) | 1797168, 4);
            int i7 = i6 & Token.ASSIGN_MOD;
            if (i7 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P5 = rv4Var.P();
            if (z2 || P5 == obj2) {
                P5 = new el7(kf9Var, 27);
                rv4Var.o0(P5);
            }
            nmd.e(F, (lu4) P5, rv4Var, 0);
            if (((f76) aw7Var2.getValue()) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            f76 f76Var = (f76) aw7Var2.getValue();
            if (f76Var != null) {
                str2 = f76Var.getName();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            Object P6 = rv4Var.P();
            if (P6 == obj2) {
                aw7Var = aw7Var2;
                P6 = new wmb(aw7Var, 16);
                rv4Var.o0(P6);
            } else {
                aw7Var = aw7Var2;
            }
            xt4 xt4Var = (xt4) P6;
            if (i7 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P7 = rv4Var.P();
            if (z4 || P7 == obj2) {
                P7 = new cn9(22, aw7Var, kf9Var);
                rv4Var.o0(P7);
            }
            rae.b(z3, str3, null, xt4Var, (xt4) P7, rv4Var, 3072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(str, kf9Var, cz7Var, i, 27);
        }
    }

    public static final void g(List list, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(-1202179352);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var3.f(list);
            } else {
                h = rv4Var3.h(list);
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
            if (rv4Var3.f(rh8Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var3.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var3.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var3.h(xt4Var2)) {
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
        if (rv4Var3.U(i2 & 1, z)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var3.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new ekb(18);
                rv4Var3.o0(P);
            }
            aw7 j = zpe.j(objArr, (vt4) P, rv4Var3, 384);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = p(rv4Var3, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(qw1.f, rv4Var3, d2);
            jce.F(qw1.e, rv4Var3, l);
            jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var3);
            jce.F(qw1.d, rv4Var3, p);
            bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var3)), zbe.j(nae.e, nae.e, nae.e, 80.0f, 7));
            boolean f = rv4Var3.f(((jub) j.getValue()).a.b);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var3.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z6 = z2 | f;
            Object P2 = rv4Var3.P();
            if (!z6 && P2 != lh9Var) {
                z3 = true;
                arrayList = P2;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    af9 af9Var = (af9) obj;
                    if (k4b.V(af9Var.c, ((jub) j.getValue()).a.b, true) || k4b.V(af9Var.d, ((jub) j.getValue()).a.b, true)) {
                        arrayList2.add(obj);
                    }
                }
                z3 = true;
                rv4Var3.o0(arrayList2);
                arrayList = arrayList2;
            }
            List list2 = (List) arrayList;
            f25 f25Var = new f25(320.0f);
            int i8 = i2;
            bkd r2 = mwe.r(mwe.h(r, nae.e, 68.0f, nae.e, nae.e, rv4Var3, 384, 13), zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            rh8 h2 = mwe.h(r, nae.e, 68.0f, 4.0f, nae.e, rv4Var, 3456, 9);
            hz hzVar = new hz(4.0f, z3, new vs(2));
            hz hzVar2 = new hz(8.0f, z3, new vs(2));
            boolean h3 = rv4Var.h(list2);
            if ((i8 & 7168) == 2048) {
                z4 = z3;
            } else {
                z4 = false;
            }
            boolean z7 = h3 | z4;
            if ((57344 & i8) == 16384) {
                z5 = z3;
            } else {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object P3 = rv4Var.P();
            if (z8 || P3 == lh9Var) {
                P3 = new sn4(list2, xt4Var, xt4Var2, 2);
                rv4Var.o0(P3);
            }
            pc2.d(f25Var, nq7Var, null, r2, hzVar, hzVar2, null, false, 0L, 0L, h2, nae.e, (xt4) P3, rv4Var, ((i8 >> 3) & Token.ASSIGN_MOD) | 1769472, 0, 6036);
            jub jubVar = (jub) j.getValue();
            String A = yqe.A((y3b) b3b.U.getValue(), rv4Var);
            long g = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
            nq7 u = mwe.u(zbe.z(zbe.x(kq7.a, rh8Var), 16.0f, 12.0f), false, 6);
            boolean f2 = rv4Var.f(j);
            Object P4 = rv4Var.P();
            if (f2 || P4 == lh9Var) {
                P4 = new wmb(j, 17);
                rv4Var.o0(P4);
            }
            xxe.m(jubVar, A, 0L, g, null, null, u, null, (xt4) P4, null, rv4Var, 0, 692);
            rv4 rv4Var4 = rv4Var;
            rv4Var4.q(true);
            rv4Var2 = rv4Var4;
        } else {
            rv4Var3.X();
            rv4Var2 = rv4Var3;
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new ghb(list, rh8Var, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void h(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(847416451);
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
            nq7 p = p(rv4Var2, y);
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
            u.d = new u81(nq7Var2, vt4Var, i, 13);
        }
    }

    public static final void i(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-881596963);
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
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var, jce.E(668639825, new y33(vt4Var3, vt4Var2, vt4Var4, 4), rv4Var), rv4Var, (i11 & 14) | 12779520 | ((i11 << 15) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z33(z, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, 2);
        }
    }

    public static nq7 j(nq7 nq7Var, mu4 mu4Var) {
        return nq7Var.a0(new zw1(mu4Var));
    }

    public static final float k(long j, rk9 rk9Var) {
        if (yte.q(j, rk9Var)) {
            return nae.e;
        }
        float f = y78.f(y78.i(rk9Var.j(), j));
        if (f >= Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        float f2 = rk9Var.c;
        float f3 = rk9Var.b;
        float f4 = y78.f(y78.i((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), j));
        if (f4 < f) {
            f = f4;
        }
        float f5 = y78.f(y78.i(rk9Var.d(), j));
        if (f5 < f) {
            f = f5;
        }
        float f6 = y78.f(y78.i(rk9Var.e(), j));
        if (f6 < f) {
            return f6;
        }
        return f;
    }

    public static final float l(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int m(dvb dvbVar, Layout layout, bm1 bm1Var, int i, RectF rectF, m5a m5aVar, sj sjVar, boolean z) {
        boolean z2;
        vc6[] vc6VarArr;
        ry5 r;
        float f;
        float l;
        vc6[] vc6VarArr2;
        int i2;
        int i3;
        int e2;
        float f2;
        float l2;
        int i4;
        int i5;
        int d2;
        float f3;
        float l3;
        Bidi createLineBidi;
        boolean z3;
        boolean z4;
        float a2;
        float a3;
        float f4;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = dvbVar.f;
        int lineStart2 = layout2.getLineStart(i);
        int f5 = dvbVar.f(i);
        if (i6 < (f5 - lineStart2) * 2) {
            mv5.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        s95 s95Var = new s95(dvbVar);
        boolean z5 = false;
        if (layout2.getParagraphDirection(i) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i7 = 0;
        while (lineStart2 < f5) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z2 && !isRtlCharAt) {
                a2 = s95Var.a(lineStart2, z5, z5, true);
                f4 = s95Var.a(lineStart2 + 1, true, true, true);
                z4 = z2;
            } else if (z2 && isRtlCharAt) {
                z4 = z2;
                f4 = s95Var.a(lineStart2, false, false, false);
                a2 = s95Var.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z2;
                if (isRtlCharAt) {
                    a3 = s95Var.a(lineStart2, false, false, true);
                    a2 = s95Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a2 = s95Var.a(lineStart2, false, false, false);
                    a3 = s95Var.a(lineStart2 + 1, true, true, false);
                }
                f4 = a3;
            }
            fArr[i7] = a2;
            fArr[i7 + 1] = f4;
            i7 += 2;
            lineStart2++;
            z2 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) bm1Var.b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int D = bm1Var.D(lineStart3, false);
        int E = bm1Var.E(D);
        int i8 = lineStart3 - E;
        int i9 = lineEnd2 - E;
        Bidi o = bm1Var.o(D);
        if (o != null && (createLineBidi = o.createLineBidi(i8, i9)) != null) {
            int runCount = createLineBidi.getRunCount();
            vc6VarArr = new vc6[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int runStart = createLineBidi.getRunStart(i10) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i10) + lineStart3;
                int i11 = runCount;
                if (createLineBidi.getRunLevel(i10) % 2 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                vc6VarArr[i10] = new vc6(runStart, runLimit, z3);
                i10++;
                runCount = i11;
            }
        } else {
            vc6VarArr = new vc6[]{new vc6(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        }
        if (z) {
            r = new ry5(0, vc6VarArr.length - 1, 1);
        } else {
            r = dce.r(vc6VarArr.length - 1, 0);
        }
        int i12 = r.a;
        int i13 = r.b;
        int i14 = r.c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            vc6 vc6Var = vc6VarArr[i12];
            boolean z6 = vc6Var.c;
            int i15 = vc6Var.a;
            int i16 = vc6Var.b;
            if (z6) {
                f = fArr[((i16 - 1) - lineStart) * 2];
            } else {
                f = fArr[(i15 - lineStart) * 2];
            }
            if (z6) {
                l = l(i15, lineStart, fArr);
            } else {
                l = l(i16 - 1, lineStart, fArr);
            }
            float f6 = rectF.left;
            int i17 = i14;
            if (z) {
                if (l >= f6) {
                    float f7 = rectF.right;
                    if (f <= f7) {
                        if ((!z6 && f6 <= f) || (z6 && f7 >= l)) {
                            i5 = i15;
                        } else {
                            int i18 = i16;
                            int i19 = i15;
                            while (true) {
                                i4 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i4 + i19) / 2;
                                float f8 = fArr[(i20 - lineStart) * 2];
                                if ((!z6 && f8 > rectF.left) || (z6 && f8 < rectF.right)) {
                                    i18 = i20;
                                } else {
                                    i18 = i4;
                                    i19 = i20;
                                }
                            }
                            if (z6) {
                                i5 = i4;
                            } else {
                                i5 = i19;
                            }
                        }
                        int e3 = m5aVar.e(i5);
                        if (e3 != -1 && (d2 = m5aVar.d(e3)) < i16) {
                            if (d2 >= i15) {
                                i15 = d2;
                            }
                            if (e3 > i16) {
                                e3 = i16;
                            }
                            vc6VarArr2 = vc6VarArr;
                            RectF rectF2 = new RectF(nae.e, lineTop, nae.e, lineBottom);
                            int i21 = e3;
                            while (true) {
                                if (z6) {
                                    f3 = fArr[((i21 - 1) - lineStart) * 2];
                                } else {
                                    f3 = fArr[(i15 - lineStart) * 2];
                                }
                                rectF2.left = f3;
                                if (z6) {
                                    l3 = l(i15, lineStart, fArr);
                                } else {
                                    l3 = l(i21 - 1, lineStart, fArr);
                                }
                                rectF2.right = l3;
                                if (!((Boolean) sjVar.invoke(rectF2, rectF)).booleanValue()) {
                                    i15 = m5aVar.a(i15);
                                    if (i15 == -1 || i15 >= i16) {
                                        break;
                                    }
                                    i21 = m5aVar.e(i15);
                                    if (i21 > i16) {
                                        i21 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i15 = -1;
                        }
                    }
                }
                vc6VarArr2 = vc6VarArr;
                i15 = -1;
            } else {
                vc6VarArr2 = vc6VarArr;
                if (l >= f6) {
                    float f9 = rectF.right;
                    if (f <= f9) {
                        if ((!z6 && f9 >= l) || (z6 && f6 <= f)) {
                            i3 = i16 - 1;
                        } else {
                            int i22 = i16;
                            int i23 = i15;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f10 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((!z6 && f10 > rectF.right) || (z6 && f10 < rectF.left)) {
                                    i22 = i24;
                                } else {
                                    i22 = i25;
                                    i23 = i24;
                                }
                            }
                            int i26 = i22;
                            if (z6) {
                                i3 = i26;
                            } else {
                                i3 = i23;
                            }
                        }
                        int d3 = m5aVar.d(i3 + 1);
                        if (d3 != -1 && (e2 = m5aVar.e(d3)) > i15) {
                            if (d3 < i15) {
                                d3 = i15;
                            }
                            if (e2 <= i16) {
                                i16 = e2;
                            }
                            RectF rectF3 = new RectF(nae.e, lineTop, nae.e, lineBottom);
                            int i27 = d3;
                            while (true) {
                                if (z6) {
                                    f2 = fArr[((i16 - 1) - lineStart) * 2];
                                } else {
                                    f2 = fArr[(i27 - lineStart) * 2];
                                }
                                rectF3.left = f2;
                                if (z6) {
                                    l2 = l(i27, lineStart, fArr);
                                } else {
                                    l2 = l(i16 - 1, lineStart, fArr);
                                }
                                rectF3.right = l2;
                                if (((Boolean) sjVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i2 = i16;
                                    break;
                                }
                                i16 = m5aVar.b(i16);
                                if (i16 == -1 || i16 <= i15) {
                                    break;
                                }
                                i27 = m5aVar.d(i16);
                                if (i27 < i15) {
                                    i27 = i15;
                                }
                            }
                        }
                    }
                }
                i2 = -1;
                i15 = i2;
            }
            if (i15 >= 0) {
                return i15;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i17;
            i14 = i17;
            vc6VarArr = vc6VarArr2;
        }
    }

    public static final oq9 n(fvb fvbVar, int i) {
        evb evbVar = fvbVar.a;
        it7 it7Var = fvbVar.b;
        if (evbVar.a.b.length() != 0) {
            int d2 = it7Var.d(i);
            if ((i != 0 && d2 == it7Var.d(i - 1)) || (i != evbVar.a.b.length() && d2 == it7Var.d(i + 1))) {
                return fvbVar.a(i);
            }
        }
        return it7Var.h(i);
    }

    public static final nq7 o(rv4 rv4Var, nq7 nq7Var) {
        if (nq7Var.m(kg.W)) {
            return nq7Var;
        }
        rv4Var.f0(1219399079);
        nq7 nq7Var2 = (nq7) nq7Var.a(kq7.a, new y0(rv4Var, 6));
        rv4Var.q(false);
        return nq7Var2;
    }

    public static final nq7 p(rv4 rv4Var, nq7 nq7Var) {
        rv4Var.e0(439770924);
        nq7 o = o(rv4Var, nq7Var);
        rv4Var.q(false);
        return o;
    }

    public static final sf2 q(byte[] bArr) {
        bArr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return new sf2(linkedHashMap);
                } else if (nextEntry.isDirectory()) {
                    zipInputStream.closeEntry();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int read = zipInputStream.read(bArr2);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    linkedHashMap.put(nextEntry.getName(), byteArrayOutputStream.toByteArray());
                    zipInputStream.closeEntry();
                }
            } finally {
            }
        }
    }

    public static Parcelable r(Parcel parcel, ClassLoader classLoader, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return r4.u(parcel, classLoader, cls);
        }
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable != null && !cls.isInstance(readParcelable)) {
            StringBuilder sb = new StringBuilder("Parcelable ");
            sb.append(readParcelable.getClass());
            String name = cls.getName();
            sb.append(" is not a subclass of required class ");
            sb.append(name);
            sb.append(" provided in the parameter");
            throw new BadParcelableException(sb.toString());
        }
        return readParcelable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable s(java.lang.Throwable r3) {
        /*
            r3.getClass()
            r0 = r3
        L4:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L1b
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            java.lang.Throwable r2 = r1.getCause()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            goto L1d
        L16:
            java.lang.Throwable r0 = r1.getCause()
            goto L4
        L1b:
            if (r0 != 0) goto L1e
        L1d:
            return r3
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lye.s(java.lang.Throwable):java.lang.Throwable");
    }
}
