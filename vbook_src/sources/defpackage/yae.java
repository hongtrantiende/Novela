package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yae  reason: default package */
/* loaded from: classes.dex */
public abstract class yae {
    public static final v71 a = new v71(4);
    public static final tu1 b = new tu1(new rv1(3), false, -1558154942);
    public static final tu1 c = new tu1(new rv1(4), false, 584665899);
    public static final tu1 d = new tu1(new rv1(5), false, -1486677178);
    public static final tu1 e = new tu1(new pv1(25), false, -288961372);
    public static final tu1 f = new tu1(new pv1(26), false, -1205864959);
    public static final tu1 g = new tu1(new rv1(6), false, 2144151037);
    public static final tu1 h = new tu1(new rv1(7), false, 1955364537);
    public static final tu1 i = new tu1(new rv1(8), false, 562770672);

    public static final nq7 A(nq7 nq7Var, u08 u08Var, x08 x08Var) {
        return nq7Var.a0(new y08(u08Var, x08Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3 != 1918990112) goto L3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [g89] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList B(defpackage.km8 r30) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yae.B(km8):java.util.ArrayList");
    }

    public static final aw7 C(lu4 lu4Var, rv4 rv4Var, Object obj) {
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = z(obj);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) P;
        boolean h2 = rv4Var.h(lu4Var);
        Object P2 = rv4Var.P();
        if (h2 || P2 == lh9Var) {
            P2 = new mra(lu4Var, aw7Var, null, 0);
            rv4Var.o0(P2);
        }
        yte.g((lu4) P2, rv4Var, pvc.a);
        return aw7Var;
    }

    public static final aw7 D(Object obj, rv4 rv4Var) {
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = z(obj);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) P;
        aw7Var.setValue(obj);
        return aw7Var;
    }

    public static final boolean E(int i2, gp gpVar, hn4 hn4Var, rk9 rk9Var) {
        hn4 s;
        gw7 gw7Var = new gw7(new hn4[16], 0);
        if (!hn4Var.a.J) {
            lv5.c("visitChildren called on an unattached node");
        }
        gw7 gw7Var2 = new gw7(new mq7[16], 0);
        mq7 mq7Var = hn4Var.a;
        mq7 mq7Var2 = mq7Var.f;
        if (mq7Var2 == null) {
            voe.g(gw7Var2, mq7Var);
        } else {
            gw7Var2.b(mq7Var2);
        }
        while (true) {
            int i3 = gw7Var2.c;
            if (i3 == 0) {
                break;
            }
            mq7 mq7Var3 = (mq7) gw7Var2.k(i3 - 1);
            if ((mq7Var3.d & 1024) == 0) {
                voe.g(gw7Var2, mq7Var3);
            } else {
                while (true) {
                    if (mq7Var3 == null) {
                        break;
                    } else if ((mq7Var3.c & 1024) != 0) {
                        gw7 gw7Var3 = null;
                        while (mq7Var3 != null) {
                            if (mq7Var3 instanceof hn4) {
                                hn4 hn4Var2 = (hn4) mq7Var3;
                                if (hn4Var2.J) {
                                    gw7Var.b(hn4Var2);
                                }
                            } else if ((mq7Var3.c & 1024) != 0 && (mq7Var3 instanceof m03)) {
                                int i4 = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var3 == null) {
                                                gw7Var3 = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var3.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var3.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var3);
                        }
                    } else {
                        mq7Var3 = mq7Var3.f;
                    }
                }
            }
        }
        while (gw7Var.c != 0 && (s = s(gw7Var, rk9Var, i2)) != null) {
            if (s.J1().a) {
                return ((Boolean) gpVar.invoke(s)).booleanValue();
            }
            if (u(i2, gpVar, s, rk9Var)) {
                return true;
            }
            gw7Var.j(s);
        }
        return false;
    }

    public static final int F(p5a p5aVar, int i2) {
        int i3;
        int[] iArr = p5aVar.f;
        int i4 = i2 + 1;
        int length = p5aVar.e.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 < i4) {
                    i6 = i3 + 1;
                } else if (i7 <= i4) {
                    break;
                } else {
                    i5 = i3 - 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final s02 G(vt4 vt4Var) {
        return new s02(new lc9(vt4Var, (m42) null, 7), 6);
    }

    public static final Boolean H(int i2, gp gpVar, hn4 hn4Var, rk9 rk9Var) {
        int ordinal = hn4Var.M1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (hn4Var.J1().a) {
                            return (Boolean) gpVar.invoke(hn4Var);
                        }
                        if (rk9Var == null) {
                            return Boolean.valueOf(t(hn4Var, i2, gpVar));
                        }
                        return Boolean.valueOf(E(i2, gpVar, hn4Var, rk9Var));
                    }
                    xk5.o();
                    return null;
                }
            } else {
                hn4 n = dae.n(hn4Var);
                if (n != null) {
                    int ordinal2 = n.M1().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    xk5.o();
                                    return null;
                                }
                                vs.k("ActiveParent must have a focusedChild");
                                return null;
                            }
                        } else {
                            Boolean H = H(i2, gpVar, n, rk9Var);
                            if (!c16.i(H, Boolean.FALSE)) {
                                return H;
                            }
                            if (rk9Var == null) {
                                if (n.M1() == dn4.b) {
                                    hn4 j = dae.j(n);
                                    if (j != null) {
                                        rk9Var = dae.m(j);
                                    } else {
                                        vs.k("ActiveParent must have a focusedChild");
                                        return null;
                                    }
                                } else {
                                    vs.k("Searching for active node in inactive hierarchy");
                                    return null;
                                }
                            }
                            return Boolean.valueOf(u(i2, gpVar, hn4Var, rk9Var));
                        }
                    }
                    if (rk9Var == null) {
                        rk9Var = dae.m(n);
                    }
                    return Boolean.valueOf(u(i2, gpVar, hn4Var, rk9Var));
                }
                vs.k("ActiveParent must have a focusedChild");
                return null;
            }
        }
        return Boolean.valueOf(t(hn4Var, i2, gpVar));
    }

    public static final int I(byte[] bArr, int i2) {
        bArr.getClass();
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static final long J(byte[] bArr, int i2) {
        bArr.getClass();
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static void K(int i2, String str, List list) {
        if (list.size() == i2) {
            return;
        }
        hfd.g(i2, str, " operation requires ", list.size());
    }

    public static void L(int i2, String str, List list) {
        if (list.size() >= i2) {
            return;
        }
        hfd.g(i2, str, " operation requires at least ", list.size());
    }

    public static void M(int i2, String str, ArrayList arrayList) {
        if (arrayList.size() <= i2) {
            return;
        }
        hfd.g(i2, str, " operation requires at most ", arrayList.size());
    }

    public static boolean N(e9e e9eVar) {
        if (e9eVar == null) {
            return false;
        }
        Double zzd = e9eVar.zzd();
        if (zzd.isNaN() || zzd.doubleValue() < 0.0d || !zzd.equals(Double.valueOf(Math.floor(zzd.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static nbe O(String str) {
        nbe nbeVar;
        if (str != null && !str.isEmpty()) {
            nbeVar = (nbe) nbe.H0.get(Integer.valueOf(Integer.parseInt(str)));
        } else {
            nbeVar = null;
        }
        if (nbeVar != null) {
            return nbeVar;
        }
        vs.m(s21.m("Unsupported commandId ", str));
        return null;
    }

    public static boolean P(e9e e9eVar, e9e e9eVar2) {
        if (!e9eVar.getClass().equals(e9eVar2.getClass())) {
            return false;
        }
        if ((e9eVar instanceof r9e) || (e9eVar instanceof c8e)) {
            return true;
        }
        if (e9eVar instanceof g4e) {
            if (Double.isNaN(e9eVar.zzd().doubleValue()) || Double.isNaN(e9eVar2.zzd().doubleValue())) {
                return false;
            }
            return e9eVar.zzd().equals(e9eVar2.zzd());
        } else if (e9eVar instanceof p9e) {
            return e9eVar.zzc().equals(e9eVar2.zzc());
        } else {
            if (e9eVar instanceof v1e) {
                return e9eVar.zze().equals(e9eVar2.zze());
            }
            if (e9eVar != e9eVar2) {
                return false;
            }
            return true;
        }
    }

    public static int Q(double d2) {
        int i2;
        int i3;
        if (!Double.isNaN(d2) && !Double.isInfinite(d2) && d2 != 0.0d) {
            if (i2 > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            return (int) ((i3 * Math.floor(Math.abs(d2))) % 4.294967296E9d);
        }
        return 0;
    }

    public static double R(double d2) {
        int i2;
        int i3;
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d2) && d2 != 0.0d && i2 != 0) {
            if (i2 > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            return i3 * Math.floor(Math.abs(d2));
        }
        return d2;
    }

    public static Object S(e9e e9eVar) {
        if (e9e.v.equals(e9eVar)) {
            return null;
        }
        if (e9e.u.equals(e9eVar)) {
            return "";
        }
        if (e9eVar instanceof q7e) {
            return T((q7e) e9eVar);
        }
        if (e9eVar instanceof w0e) {
            ArrayList arrayList = new ArrayList();
            w0e w0eVar = (w0e) e9eVar;
            int i2 = 0;
            while (i2 < w0eVar.i()) {
                if (i2 < w0eVar.i()) {
                    int i3 = i2 + 1;
                    Object S = S(w0eVar.j(i2));
                    if (S != null) {
                        arrayList.add(S);
                    }
                    i2 = i3;
                } else {
                    p1a.l(nk2.s(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                    return null;
                }
            }
            return arrayList;
        } else if (!e9eVar.zzd().isNaN()) {
            return e9eVar.zzd();
        } else {
            return e9eVar.zzc();
        }
    }

    public static HashMap T(q7e q7eVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(q7eVar.a.keySet());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            Object S = S(q7eVar.b(str));
            if (S != null) {
                hashMap.put(str, S);
            }
        }
        return hashMap;
    }

    public static void U(odd oddVar) {
        int Q = Q(oddVar.B("runtime.counter").zzd().doubleValue() + 1.0d);
        if (Q <= 1000000) {
            oddVar.z("runtime.counter", new g4e(Double.valueOf(Q)));
        } else {
            vs.k("Instructions allowed exceeded");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.l54 r50, defpackage.rv4 r51, int r52) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yae.a(l54, rv4, int):void");
    }

    public static final void b(String str, String str2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        String str3;
        int i5;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        rv4Var2.g0(-970199339);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 y = zbe.y(nmd.v(tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), zl1.b(0.4f, r0f.y(rv4Var2).y), lre.g), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            cvb.c(str, null, r0f.y(rv4Var2).z, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).k, rv4Var, i7 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            if (!k4b.j0(str2)) {
                s21.w(rv4Var2, -907055337, kq7Var, 6.0f, rv4Var2);
                str3 = str2;
                cvb.c(str3, null, r0f.y(rv4Var2).z, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, r0f.A(rv4Var2).l, rv4Var, (i7 >> 3) & 14, 24960, 110586);
                rv4Var2 = rv4Var;
                i5 = 0;
                rv4Var2.q(false);
            } else {
                str3 = str2;
                i5 = 0;
                rv4Var2.e0(-906736285);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            str3 = str2;
            i5 = 0;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ui7(str, str3, i2, i5);
        }
    }

    public static final void c(String str, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        rv4Var2.g0(1645914240);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 j = pna.j(pna.f(kq7Var, 1.0f), 96.0f, nae.e, 2);
            b37 d2 = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, j);
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
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            gv9 a2 = ev9.a(new hz(12.0f, true, new vs(2)), kh5.G, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            r79.a(pna.n(kq7Var, 20.0f), 0L, 2.0f, 0L, 0, nae.e, rv4Var2, 390, 58);
            cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.k, rv4Var, i4 & 14, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new jd1(str, i2, 17);
        }
    }

    public static final void d(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        vt4 vt4Var4;
        vt4 vt4Var5;
        boolean z3;
        boolean z4;
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(963539222);
        if (rv4Var.g(z)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i11 = i10 | i6;
        int i12 = i3 & 8;
        if (i12 != 0) {
            i8 = i11 | 3072;
        } else {
            if (rv4Var.h(vt4Var3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i8 = i11 | i7;
        }
        boolean z5 = true;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            lh9 lh9Var = ax1.a;
            if (i12 != 0) {
                Object P = rv4Var.P();
                if (P == lh9Var) {
                    P = new cd1(15);
                    rv4Var.o0(P);
                }
                vt4Var5 = (vt4) P;
            } else {
                vt4Var5 = vt4Var3;
            }
            if ((i8 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i8 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z3 | z4;
            if ((i8 & 7168) != 2048) {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object P2 = rv4Var.P();
            if (z7 || P2 == lh9Var) {
                P2 = new s86(vt4Var, vt4Var2, vt4Var5, 0);
                rv4Var.o0(P2);
            }
            cae.d(z, (xt4) P2, rv4Var, i8 & 14, 0);
            vt4Var4 = vt4Var5;
        } else {
            rv4Var.X();
            vt4Var4 = vt4Var3;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ta(z, vt4Var, vt4Var2, vt4Var4, i2, i3);
        }
    }

    public static final void e(boolean z, String str, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        boolean z4;
        rx5 rx5Var;
        String str2;
        Object obj;
        boolean z5;
        boolean z6;
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(1144226645);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(vt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                rx5 rx5Var2 = (rx5) ((fdd) voe.z(cm9.a(rx5.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z7 = jsc.z(rx5Var2.d, rv4Var);
                Boolean valueOf = Boolean.valueOf(z);
                int i11 = i10 & 14;
                if (i11 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i10 & Token.ASSIGN_MOD) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean f2 = z4 | z3 | rv4Var.f(rx5Var2);
                Object P = rv4Var.P();
                Object obj2 = ax1.a;
                if (!f2 && P != obj2) {
                    str2 = str;
                    obj = P;
                    rx5Var = rx5Var2;
                } else {
                    rx5Var = rx5Var2;
                    Object er0Var = new er0(z, str, rx5Var, (m42) null, 3);
                    str2 = str;
                    rv4Var.o0(er0Var);
                    obj = er0Var;
                }
                yte.h(valueOf, str2, (lu4) obj, rv4Var);
                if (((ox5) z7.getValue()).b == ux5.b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (((ox5) z7.getValue()).b == ux5.d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean g2 = rv4Var.g(z6);
                Object P2 = rv4Var.P();
                if (g2 || P2 == obj2) {
                    P2 = new ti7(0, xt4Var, z6);
                    rv4Var.o0(P2);
                }
                xb.a(z, (xt4) P2, jce.E(-402037602, new fw0(z5, z6, rx5Var, vt4Var, xt4Var, vt4Var2, 3), rv4Var), null, null, jce.E(1880536481, new vi7(0, xt4Var, z6), rv4Var), bze.c, null, 0L, 0L, nae.e, null, null, null, false, false, jce.E(695270905, new wi7(str, z7, 0), rv4Var), rv4Var, i11 | 1769856, 1572864, 65432);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xi7(z, str, xt4Var, vt4Var, vt4Var2, i2, 0);
        }
    }

    public static final boolean f(gab gabVar) {
        List list = gabVar.f.P.a;
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (((z09) list.get(i2)).d) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (f(r6) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.gab r6, defpackage.s09 r7, defpackage.hh0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.hq4
            if (r0 == 0) goto L13
            r0 = r8
            hq4 r0 = (defpackage.hq4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hq4 r0 = new hq4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            s09 r6 = r0.b
            gab r7 = r0.a
            defpackage.hre.r(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L33:
            defpackage.hre.r(r8)
            boolean r8 = f(r6)
            if (r8 != 0) goto L64
        L3c:
            r0.a = r6
            r0.b = r7
            r0.d = r2
            java.lang.Object r8 = r6.j(r7, r0)
            n82 r1 = defpackage.n82.a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r09 r8 = (defpackage.r09) r8
            java.util.List r8 = r8.a
            int r1 = r8.size()
            r3 = 0
        L54:
            if (r3 >= r1) goto L64
            java.lang.Object r4 = r8.get(r3)
            z09 r4 = (defpackage.z09) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L61
            goto L3c
        L61:
            int r3 = r3 + 1
            goto L54
        L64:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yae.g(gab, s09, hh0):java.lang.Object");
    }

    public static final Object h(d19 d19Var, lu4 lu4Var, m42 m42Var) {
        Object H1 = ((hab) d19Var).H1(new d(m42Var.getContext(), lu4Var, null, 1), m42Var);
        if (H1 == n82.a) {
            return H1;
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r11 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r10 <= r7) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r9 >= r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r8 <= r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r21 != 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r21 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r21 != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r21 != 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r21 != 5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r21 != 6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r1 >= defpackage.nae.e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
        if (r21 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r21 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r21 != 6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (r11 >= 1.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (r1 >= r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
        defpackage.vs.k("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        defpackage.vs.k("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(defpackage.rk9 r18, defpackage.rk9 r19, defpackage.rk9 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = j(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = j(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.vs.k(r4)
            return r12
        L94:
            defpackage.vs.k(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.vs.k(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yae.i(rk9, rk9, rk9, int):boolean");
    }

    public static final boolean j(int i2, rk9 rk9Var, rk9 rk9Var2) {
        if (i2 == 3 || i2 == 4) {
            if (rk9Var.d <= rk9Var2.b || rk9Var.b >= rk9Var2.d) {
                return false;
            }
            return true;
        } else if (i2 == 5 || i2 == 6) {
            if (rk9Var.c <= rk9Var2.a || rk9Var.a >= rk9Var2.c) {
                return false;
            }
            return true;
        } else {
            vs.k("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static void k(jg2 jg2Var) {
        if (jg2Var != null) {
            try {
                jg2Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void l(hn4 hn4Var, gw7 gw7Var) {
        if (!hn4Var.a.J) {
            lv5.c("visitChildren called on an unattached node");
        }
        gw7 gw7Var2 = new gw7(new mq7[16], 0);
        mq7 mq7Var = hn4Var.a;
        mq7 mq7Var2 = mq7Var.f;
        if (mq7Var2 == null) {
            voe.g(gw7Var2, mq7Var);
        } else {
            gw7Var2.b(mq7Var2);
        }
        while (true) {
            int i2 = gw7Var2.c;
            if (i2 != 0) {
                mq7 mq7Var3 = (mq7) gw7Var2.k(i2 - 1);
                if ((mq7Var3.d & 1024) == 0) {
                    voe.g(gw7Var2, mq7Var3);
                } else {
                    while (true) {
                        if (mq7Var3 == null) {
                            break;
                        } else if ((mq7Var3.c & 1024) != 0) {
                            gw7 gw7Var3 = null;
                            while (mq7Var3 != null) {
                                if (mq7Var3 instanceof hn4) {
                                    hn4 hn4Var2 = (hn4) mq7Var3;
                                    if (hn4Var2.J && !voe.v(hn4Var2).n0) {
                                        if (hn4Var2.J1().a) {
                                            gw7Var.b(hn4Var2);
                                        } else {
                                            l(hn4Var2, gw7Var);
                                        }
                                    }
                                } else if ((mq7Var3.c & 1024) != 0 && (mq7Var3 instanceof m03)) {
                                    int i3 = 0;
                                    for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                        if ((mq7Var4.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                mq7Var3 = mq7Var4;
                                            } else {
                                                if (gw7Var3 == null) {
                                                    gw7Var3 = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var3 != null) {
                                                    gw7Var3.b(mq7Var3);
                                                    mq7Var3 = null;
                                                }
                                                gw7Var3.b(mq7Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                mq7Var3 = voe.h(gw7Var3);
                            }
                        } else {
                            mq7Var3 = mq7Var3.f;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final aw7 m(sj4 sj4Var, Object obj, d82 d82Var, rv4 rv4Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            d82Var = gs3.a;
        }
        boolean h2 = rv4Var.h(d82Var) | rv4Var.h(sj4Var);
        Object P = rv4Var.P();
        Object obj2 = ax1.a;
        if (h2 || P == obj2) {
            P = new jk8(d82Var, sj4Var, (m42) null, 24);
            rv4Var.o0(P);
        }
        lu4 lu4Var = (lu4) P;
        Object P2 = rv4Var.P();
        if (P2 == obj2) {
            P2 = z(obj);
            rv4Var.o0(P2);
        }
        aw7 aw7Var = (aw7) P2;
        boolean h3 = rv4Var.h(lu4Var);
        Object P3 = rv4Var.P();
        if (h3 || P3 == obj2) {
            P3 = new mra(lu4Var, aw7Var, null, 2);
            rv4Var.o0(P3);
        }
        yte.h(sj4Var, d82Var, (lu4) P3, rv4Var);
        return aw7Var;
    }

    public static final aw7 n(aza azaVar, rv4 rv4Var) {
        return m(azaVar, azaVar.getValue(), gs3.a, rv4Var, 0, 0);
    }

    public static final String o(byte[] bArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i3 / 2);
        int min = Math.min(i3 + i2, bArr.length - 1);
        while (true) {
            int i4 = i2 + 1;
            if (i4 <= min) {
                sb.append((char) (((bArr[i4] & 255) << 8) | (bArr[i2] & 255)));
                i2 += 2;
            } else {
                return sb.toString();
            }
        }
    }

    public static final gw7 p() {
        yx9 yx9Var = lra.b;
        gw7 gw7Var = (gw7) yx9Var.get();
        if (gw7Var == null) {
            gw7 gw7Var2 = new gw7(new qv4[0], 0);
            yx9Var.n(gw7Var2);
            return gw7Var2;
        }
        return gw7Var;
    }

    public static final h23 q(vt4 vt4Var) {
        yx9 yx9Var = lra.a;
        return new h23(vt4Var, null);
    }

    public static final h23 r(vt4 vt4Var, kra kraVar) {
        yx9 yx9Var = lra.a;
        return new h23(vt4Var, kraVar);
    }

    public static final hn4 s(gw7 gw7Var, rk9 rk9Var, int i2) {
        rk9 n;
        hn4 hn4Var = null;
        if (i2 == 3) {
            n = rk9Var.n((rk9Var.c - rk9Var.a) + 1.0f, nae.e);
        } else if (i2 == 4) {
            n = rk9Var.n(-((rk9Var.c - rk9Var.a) + 1.0f), nae.e);
        } else if (i2 == 5) {
            n = rk9Var.n(nae.e, (rk9Var.d - rk9Var.b) + 1.0f);
        } else if (i2 == 6) {
            n = rk9Var.n(nae.e, -((rk9Var.d - rk9Var.b) + 1.0f));
        } else {
            vs.k("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = gw7Var.a;
        int i3 = gw7Var.c;
        for (int i4 = 0; i4 < i3; i4++) {
            hn4 hn4Var2 = (hn4) objArr[i4];
            if (dae.t(hn4Var2)) {
                rk9 m = dae.m(hn4Var2);
                if (w(m, n, rk9Var, i2)) {
                    hn4Var = hn4Var2;
                    n = m;
                }
            }
        }
        return hn4Var;
    }

    public static final boolean t(hn4 hn4Var, int i2, xt4 xt4Var) {
        rk9 rk9Var;
        Object obj;
        gw7 gw7Var = new gw7(new hn4[16], 0);
        l(hn4Var, gw7Var);
        int i3 = gw7Var.c;
        if (i3 <= 1) {
            if (i3 == 0) {
                obj = null;
            } else {
                obj = gw7Var.a[0];
            }
            hn4 hn4Var2 = (hn4) obj;
            if (hn4Var2 != null) {
                return ((Boolean) xt4Var.invoke(hn4Var2)).booleanValue();
            }
        } else {
            if (i2 == 7) {
                i2 = 4;
            }
            if (i2 == 4 || i2 == 6) {
                rk9 m = dae.m(hn4Var);
                float f2 = m.a;
                float f3 = m.b;
                rk9Var = new rk9(f2, f3, f2, f3);
            } else if (i2 == 3 || i2 == 5) {
                rk9 m2 = dae.m(hn4Var);
                float f4 = m2.c;
                float f5 = m2.d;
                rk9Var = new rk9(f4, f5, f4, f5);
            } else {
                vs.k("This function should only be used for 2-D focus search");
                return false;
            }
            hn4 s = s(gw7Var, rk9Var, i2);
            if (s != null) {
                return ((Boolean) xt4Var.invoke(s)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean u(int i2, gp gpVar, hn4 hn4Var, rk9 rk9Var) {
        if (E(i2, gpVar, hn4Var, rk9Var)) {
            return true;
        }
        Boolean bool = (Boolean) tye.o(hn4Var, i2, new fc8(((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).f(), hn4Var, rk9Var, i2, gpVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int v(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static final boolean w(rk9 rk9Var, rk9 rk9Var2, rk9 rk9Var3, int i2) {
        if (x(i2, rk9Var, rk9Var3)) {
            if (x(i2, rk9Var2, rk9Var3) && !i(rk9Var3, rk9Var, rk9Var2, i2)) {
                if (!i(rk9Var3, rk9Var2, rk9Var, i2) && y(i2, rk9Var3, rk9Var) < y(i2, rk9Var3, rk9Var2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean x(int i2, rk9 rk9Var, rk9 rk9Var2) {
        if (i2 == 3) {
            float f2 = rk9Var2.c;
            float f3 = rk9Var2.a;
            float f4 = rk9Var.c;
            if ((f2 <= f4 && f3 < f4) || f3 <= rk9Var.a) {
                return false;
            }
            return true;
        } else if (i2 == 4) {
            float f5 = rk9Var2.a;
            float f6 = rk9Var2.c;
            float f7 = rk9Var.a;
            if ((f5 >= f7 && f6 > f7) || f6 >= rk9Var.c) {
                return false;
            }
            return true;
        } else if (i2 == 5) {
            float f8 = rk9Var2.d;
            float f9 = rk9Var2.b;
            float f10 = rk9Var.d;
            if ((f8 <= f10 && f9 < f10) || f9 <= rk9Var.b) {
                return false;
            }
            return true;
        } else if (i2 == 6) {
            float f11 = rk9Var2.b;
            float f12 = rk9Var2.d;
            float f13 = rk9Var.b;
            if ((f11 >= f13 && f12 > f13) || f12 >= rk9Var.d) {
                return false;
            }
            return true;
        } else {
            vs.k("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final long y(int i2, rk9 rk9Var, rk9 rk9Var2) {
        float f2;
        float f3;
        float z;
        float f4;
        float f5;
        if (i2 == 3) {
            f2 = rk9Var.a;
            f3 = rk9Var2.c;
        } else if (i2 == 4) {
            f2 = rk9Var2.a;
            f3 = rk9Var.c;
        } else if (i2 == 5) {
            f2 = rk9Var.b;
            f3 = rk9Var2.d;
        } else if (i2 == 6) {
            f2 = rk9Var2.b;
            f3 = rk9Var.d;
        } else {
            vs.k("This function should only be used for 2-D focus search");
            return 0L;
        }
        float f6 = f2 - f3;
        if (f6 < nae.e) {
            f6 = 0.0f;
        }
        long j = f6;
        if (i2 == 3 || i2 == 4) {
            float f7 = rk9Var.b;
            z = a82.z(rk9Var.d, f7, 2.0f, f7);
            f4 = rk9Var2.b;
            f5 = rk9Var2.d;
        } else if (i2 == 5 || i2 == 6) {
            float f8 = rk9Var.a;
            z = a82.z(rk9Var.c, f8, 2.0f, f8);
            f4 = rk9Var2.a;
            f5 = rk9Var2.c;
        } else {
            vs.k("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j2 = z - (((f5 - f4) / 2.0f) + f4);
        return (j2 * j2) + (13 * j * j);
    }

    public static hm8 z(Object obj) {
        return new hm8(obj, zj1.G);
    }
}
