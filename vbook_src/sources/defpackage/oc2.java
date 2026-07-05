package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oc2  reason: default package */
/* loaded from: classes3.dex */
public final class oc2 {
    public static final dz b = new dz(0);
    public static final dz c = new dz(1);
    public static final tu1 d = new tu1(new mv1(28), false, 1496094684);
    public static final tu1 e = new tu1(new mv1(29), false, 1775961219);
    public final /* synthetic */ int a;

    public /* synthetic */ oc2(int i) {
        this.a = i;
    }

    public static final t36 A(k46 k46Var) {
        k46Var.getClass();
        if (k46Var instanceof t36) {
            return (t36) k46Var;
        }
        return null;
    }

    public static final d56 B(k46 k46Var) {
        k46Var.getClass();
        if (k46Var instanceof d56) {
            return (d56) k46Var;
        }
        return null;
    }

    public static final i56 C(k46 k46Var) {
        k46Var.getClass();
        if (k46Var instanceof i56) {
            return (i56) k46Var;
        }
        return null;
    }

    public static Object D(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return r4.k(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final void G(cz7 cz7Var, int i) {
        cz7Var.getClass();
        cz7Var.a.c(new uca(i));
    }

    public static final void H(cz7 cz7Var) {
        cz7Var.getClass();
        cz7Var.b(tda.INSTANCE);
    }

    public static void I(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3++;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.g(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void J(Object obj, Object obj2) {
        m7e m7eVar = (m7e) obj;
        x8e x8eVar = m7eVar.zzb;
        x8e x8eVar2 = ((m7e) obj2).zzb;
        x8e x8eVar3 = x8e.f;
        if (!x8eVar3.equals(x8eVar2)) {
            if (x8eVar3.equals(x8eVar)) {
                int i = x8eVar.a + x8eVar2.a;
                int[] copyOf = Arrays.copyOf(x8eVar.b, i);
                System.arraycopy(x8eVar2.b, 0, copyOf, x8eVar.a, x8eVar2.a);
                Object[] copyOf2 = Arrays.copyOf(x8eVar.c, i);
                System.arraycopy(x8eVar2.c, 0, copyOf2, x8eVar.a, x8eVar2.a);
                x8eVar = new x8e(i, copyOf, copyOf2, true);
            } else {
                x8eVar.getClass();
                if (!x8eVar2.equals(x8eVar3)) {
                    if (x8eVar.e) {
                        int i2 = x8eVar.a + x8eVar2.a;
                        x8eVar.b(i2);
                        System.arraycopy(x8eVar2.b, 0, x8eVar.b, x8eVar.a, x8eVar2.a);
                        System.arraycopy(x8eVar2.c, 0, x8eVar.c, x8eVar.a, x8eVar2.a);
                        x8eVar.a = i2;
                    } else {
                        cp8.q();
                        return;
                    }
                }
            }
        }
        m7eVar.zzb = x8eVar;
    }

    public static boolean K(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int L(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e7e.r(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static e9e M(w0e w0eVar, odd oddVar, ArrayList arrayList, boolean z) {
        e9e e9eVar;
        int i;
        int i2;
        yae.L(1, "reduce", arrayList);
        yae.M(2, "reduce", arrayList);
        e9e J = ((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(0));
        if (J instanceof l5e) {
            if (arrayList.size() == 2) {
                e9eVar = ((hvc) oddVar.c).J(oddVar, (e9e) arrayList.get(1));
                if (e9eVar instanceof v2e) {
                    vs.m("Failed to parse initial value");
                    return null;
                }
            } else if (w0eVar.i() != 0) {
                e9eVar = null;
            } else {
                vs.k("Empty array with no initial value error");
                return null;
            }
            l5e l5eVar = (l5e) J;
            int i3 = w0eVar.i();
            if (z) {
                i = 0;
            } else {
                i = i3 - 1;
            }
            int i4 = -1;
            if (z) {
                i2 = i3 - 1;
            } else {
                i2 = 0;
            }
            if (true == z) {
                i4 = 1;
            }
            if (e9eVar == null) {
                e9eVar = w0eVar.j(i);
                i += i4;
            }
            while ((i2 - i) * i4 >= 0) {
                if (!w0eVar.l(i)) {
                    i += i4;
                } else {
                    e9eVar = l5eVar.g(oddVar, Arrays.asList(e9eVar, w0eVar.j(i), new g4e(Double.valueOf(i)), w0eVar));
                    if (!(e9eVar instanceof v2e)) {
                        i += i4;
                    } else {
                        vs.k("Reduce operation failed");
                        return null;
                    }
                }
            }
            return e9eVar;
        }
        vs.m("Callback should be a method");
        return null;
    }

    public static void N(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3 += 8;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.h(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                e7eVar.getClass();
                e7eVar.d(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static w0e O(w0e w0eVar, odd oddVar, q8e q8eVar, Boolean bool, Boolean bool2) {
        w0e w0eVar2 = new w0e();
        Iterator h = w0eVar.h();
        while (h.hasNext()) {
            int intValue = ((Integer) h.next()).intValue();
            if (w0eVar.l(intValue)) {
                e9e g = q8eVar.g(oddVar, Arrays.asList(w0eVar.j(intValue), new g4e(Double.valueOf(intValue)), w0eVar));
                if (g.zze().equals(bool)) {
                    break;
                } else if (bool2 == null || g.zze().equals(bool2)) {
                    w0eVar2.k(intValue, g);
                }
            }
        }
        return w0eVar2;
    }

    public static void P(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += e7e.r(((Integer) list.get(i4)).intValue());
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void Q(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3 += 4;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static int R(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e7e.r(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void S(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3 += 8;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.h(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int T(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e7e.r(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void U(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3 += 4;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.b(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                e7eVar.getClass();
                e7eVar.c(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static int V(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += e7e.t((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static void W(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += e7e.r(((Integer) list.get(i4)).intValue());
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static int X(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += e7e.r((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static void Y(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += e7e.r(((Long) list.get(i4)).longValue());
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.m(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int Z(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e7e.t(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static final void a(boolean z, int i, vt4 vt4Var, nq7 nq7Var, boolean z2, vt4 vt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        kq7 kq7Var;
        vt4 vt4Var3;
        wk3 wk3Var;
        vt4 vt4Var4;
        vt4Var.getClass();
        rv4Var.g0(-702399580);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5 | 1600512;
        if ((599187 & i8) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i8 & 1, z3)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new cd1(15);
                rv4Var.o0(P);
            }
            vt4 vt4Var5 = (vt4) P;
            kq7 kq7Var2 = kq7.a;
            nq7 f = pna.f(kq7Var2, 1.0f);
            gv9 a = ev9.a(new hz(8.0f, true, new vs(2)), kh5.G, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (z) {
                wk3Var = (wk3) rk3.l.getValue();
            } else {
                wk3Var = (wk3) rk3.k.getValue();
            }
            t(wk3Var, i, z, true, false, vt4Var, null, rv4Var, (i8 & Token.ASSIGN_MOD) | 3072 | ((i8 << 6) & 896) | ((i8 << 9) & 458752), 80);
            if (z2) {
                rv4Var.e0(301655450);
                vt4Var4 = vt4Var5;
                t((wk3) ok3.i0.getValue(), 0, false, false, true, vt4Var4, null, rv4Var, 221232, 76);
                rv4Var.q(false);
            } else {
                vt4Var4 = vt4Var5;
                rv4Var.e0(301839962);
                rv4Var.q(false);
            }
            rv4Var.e0(301975866);
            rv4Var.q(false);
            rv4Var.q(true);
            vt4Var3 = vt4Var4;
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
            vt4Var3 = vt4Var2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ra(z, i, vt4Var, kq7Var, z2, vt4Var3, i2);
        }
    }

    public static void a0(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3 += 4;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static final void b(float f, boolean z, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1488238701);
        if (rv4Var2.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i9 & 1, z2)) {
            tza tzaVar = j27.a;
            nq7 z5 = zbe.z(c16.g(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g), null, 3), 12.0f, 4.0f);
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z5);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a);
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
            nq7 f2 = pna.f(kq7Var, 1.0f);
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z3;
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            Object P = rv4Var2.P();
            if (z7 || P == ax1.a) {
                P = new up0(9, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, f2, false);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
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
            cvb.c(yqe.A((y3b) b3b.e0.getValue(), rv4Var2), new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 0, 131068);
            tte.g(z, false, null, xt4Var, rv4Var, ((i9 << 3) & 7168) | ((i9 >> 3) & 14), 6);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            if (!z) {
                rv4Var2.e0(-1071762257);
                jk1 jk1Var = new jk1(0.1f, 1.0f);
                kpa kpaVar = kpa.a;
                gpa d2 = kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), rv4Var2, 1015);
                rv4Var2 = rv4Var;
                dae.d(f, xt4Var2, pna.f(kq7Var, 1.0f), false, null, d2, null, 0, null, null, jk1Var, rv4Var2, (i9 & 14) | 384 | ((i9 >> 6) & Token.ASSIGN_MOD), 0, 984);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1071404455);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ch7(f, z, xt4Var, xt4Var2, nq7Var, i, 1);
        }
    }

    public static int b0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e7e.r(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static final void c(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(861017872);
        if (rv4Var2.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 k = tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c);
            long g = rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) f3b.T.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            r(i, ((i6 << 3) & 896) | (i6 & 14), xt4Var, rv4Var2, nmd.v(tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), ba5Var), cqe.m((q3b) nz.n.getValue(), rv4Var2));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p61(i, xt4Var, nq7Var, i2, 3);
        }
    }

    public static void c0(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    boolean z2 = e7e.b;
                    i3 += 8;
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.h(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static final void d(final boolean z, final int i, final vt4 vt4Var, nq7 nq7Var, final Long l, boolean z2, final boolean z3, final boolean z4, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z5;
        final kq7 kq7Var;
        final boolean z6;
        wk3 wk3Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        rv4 rv4Var2 = rv4Var;
        vt4Var.getClass();
        rv4Var2.g0(-1111479251);
        int i15 = 4;
        if ((i2 & 6) == 0) {
            if (rv4Var2.g(z)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i4 = i14 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i;
            if (rv4Var2.d(i5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i4 |= i13;
        } else {
            i5 = i;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i12 = 256;
            } else {
                i12 = Token.CASE;
            }
            i4 |= i12;
        }
        int i16 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            if (rv4Var2.f(l)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i16 |= i11;
        }
        int i17 = i16 | 196608;
        if ((1572864 & i2) == 0) {
            if (rv4Var2.g(z3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i17 |= i10;
        }
        if ((12582912 & i2) == 0) {
            if (rv4Var2.g(z4)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i17 |= i9;
        }
        if ((100663296 & i2) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i17 |= i8;
        }
        if ((805306368 & i2) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i17 |= i7;
        }
        int i18 = i17;
        if ((i3 & 6) == 0) {
            if (!rv4Var2.h(vt4Var4)) {
                i15 = 2;
            }
            i6 = i3 | i15;
        } else {
            i6 = i3;
        }
        if ((i18 & 306783379) == 306783378 && (i6 & 3) == 2) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (rv4Var2.U(i18 & 1, z5)) {
            kq7 kq7Var2 = kq7.a;
            nq7 f = pna.f(kq7Var2, 1.0f);
            gv9 a = ev9.a(new hz(8.0f, true, new vs(2)), kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (z) {
                wk3Var = (wk3) rk3.l.getValue();
            } else {
                wk3Var = (wk3) rk3.k.getValue();
            }
            t(wk3Var, i5, z, true, false, vt4Var, null, rv4Var, (i18 & Token.ASSIGN_MOD) | 3072 | ((i18 << 6) & 896) | ((i18 << 9) & 458752), 80);
            if (l != null) {
                rv4Var.e0(1638949603);
                g(l.longValue(), true, rv4Var, ((i18 >> 12) & 14) | 48, 0);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1639063001);
                rv4Var.q(false);
            }
            xbe.i(rv4Var, new we6(1.0f, true));
            rv4Var.e0(1639343210);
            o(z3, z4, vt4Var2, vt4Var3, vt4Var4, rv4Var, ((i18 >> 15) & 65534) | ((i6 << 15) & 458752));
            rv4Var2 = rv4Var;
            rv4Var2.q(false);
            rv4Var2.q(true);
            z6 = true;
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
            z6 = z2;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: dgc
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(i2 | 1);
                    int p3 = xoe.p(i3);
                    oc2.d(z, i, vt4Var, kq7Var, l, z6, z3, z4, vt4Var2, vt4Var3, vt4Var4, (rv4) obj, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static void d0(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += e7e.t((intValue >> 31) ^ (intValue << 1));
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    e7eVar.o((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                e7eVar.q(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static final void e(dm5 dm5Var, ss8 ss8Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
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
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-678824461);
        if (rv4Var2.f(dm5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(ss8Var)) {
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
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            nq7 A = zbe.A(nq7Var, 12.0f, nae.e, 2);
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            float f = dm5Var.j;
            boolean z11 = dm5Var.i;
            int i8 = i7 & Token.ASSIGN_MOD;
            if (i8 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new tj7(ss8Var, 6);
                rv4Var2.o0(P);
            }
            xt4 xt4Var = (xt4) P;
            if (i8 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new tj7(ss8Var, 7);
                rv4Var2.o0(P2);
            }
            kq7 kq7Var = kq7.a;
            b(f, z11, xt4Var, (xt4) P2, pna.f(kq7Var, 1.0f), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i9 = dm5Var.u;
            if (i8 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P3 = rv4Var2.P();
            if (z4 || P3 == lh9Var) {
                P3 = new tj7(ss8Var, 8);
                rv4Var2.o0(P3);
            }
            c(i9, 384, (xt4) P3, rv4Var2, pna.f(kq7Var, 1.0f));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i10 = dm5Var.a;
            int i11 = dm5Var.b;
            if (i8 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P4 = rv4Var2.P();
            if (!z5 && P4 != lh9Var) {
                z6 = false;
            } else {
                z6 = false;
                P4 = new tj7(ss8Var, 0);
                rv4Var2.o0(P4);
            }
            xt4 xt4Var2 = (xt4) P4;
            if (i8 == 32) {
                z7 = true;
            } else {
                z7 = z6;
            }
            Object P5 = rv4Var2.P();
            if (z7 || P5 == lh9Var) {
                P5 = new tj7(ss8Var, 1);
                rv4Var2.o0(P5);
            }
            boolean z12 = false;
            q(i10, i11, 24576, xt4Var2, (xt4) P5, rv4Var2, pna.f(kq7Var, 1.0f));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i12 = dm5Var.e;
            if (i8 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P6 = rv4Var2.P();
            if (z8 || P6 == lh9Var) {
                P6 = new tj7(ss8Var, 2);
                rv4Var2.o0(P6);
            }
            p(i12, 384, (xt4) P6, rv4Var2, pna.f(kq7Var, 1.0f));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            boolean z13 = dm5Var.q;
            boolean z14 = dm5Var.r;
            boolean z15 = dm5Var.f;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            if (i8 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object P7 = rv4Var2.P();
            if (z9 || P7 == lh9Var) {
                P7 = new tj7(ss8Var, 3);
                rv4Var2.o0(P7);
            }
            xt4 xt4Var3 = (xt4) P7;
            if (i8 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object P8 = rv4Var2.P();
            if (z10 || P8 == lh9Var) {
                P8 = new tj7(ss8Var, 4);
                rv4Var2.o0(P8);
            }
            xt4 xt4Var4 = (xt4) P8;
            if (i8 == 32) {
                z12 = true;
            }
            Object P9 = rv4Var2.P();
            if (z12 || P9 == lh9Var) {
                P9 = new tj7(ss8Var, 5);
                rv4Var2.o0(P9);
            }
            n(z13, z14, z15, f2, xt4Var3, xt4Var4, (xt4) P9, rv4Var, 3072);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, mwe.s(rv4Var2) + 8.0f));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(dm5Var, ss8Var, nq7Var, i, 4);
        }
    }

    public static void e0(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += e7e.r((longValue >> 63) ^ (longValue << 1));
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    e7eVar.m((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                e7eVar.l(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static final void f(int i, rv4 rv4Var) {
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1642836454);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i & 1, z)) {
            nq7 y = zbe.y(pna.f(kq7.a, 1.0f), 12.0f);
            gv9 a = ev9.a(lz.a, kh5.F, rv4Var2, 0);
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
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) b3b.b0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j35(i, 17);
        }
    }

    public static void f0(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += e7e.t(((Integer) list.get(i4)).intValue());
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.o(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final long r31, boolean r33, defpackage.rv4 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc2.g(long, boolean, rv4, int, int):void");
    }

    public static void g0(int i, List list, k57 k57Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e7e e7eVar = (e7e) k57Var.b;
            int i2 = 0;
            if (z) {
                e7eVar.p(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += e7e.r(((Long) list.get(i4)).longValue());
                }
                e7eVar.o(i3);
                while (i2 < list.size()) {
                    e7eVar.m(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e7eVar.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static final void h(vt4 vt4Var, nq7 nq7Var, wea weaVar, long j, long j2, dj4 dj4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        vt4 vt4Var2;
        int i2;
        Object obj;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(748201188);
        if ((i & 6) == 0) {
            vt4Var2 = vt4Var;
            if (rv4Var.h(vt4Var2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            vt4Var2 = vt4Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            obj = weaVar;
            if (rv4Var.f(obj)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        } else {
            obj = weaVar;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.e(j)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.e(j2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(dj4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.f(null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            int i11 = i2 << 9;
            i(vt4Var2, gtc.a(kue.c, rv4Var), kve.c, nq7Var, obj, j, j2, dj4Var, lu4Var, rv4Var, (i2 & 14) | 3456 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), (i2 >> 21) & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new hj4(vt4Var, nq7Var, weaVar, j, j2, dj4Var, lu4Var, i);
        }
    }

    public static final void i(final vt4 vt4Var, final oyb oybVar, final float f, final nq7 nq7Var, final wea weaVar, final long j, final long j2, final dj4 dj4Var, final lu4 lu4Var, rv4 rv4Var, final int i, final int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z;
        int i5;
        nq7 nq7Var2;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        rv4Var.g0(121669932);
        if ((i & 6) == 0) {
            if (rv4Var.h(vt4Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i3 = i16 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(oybVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i3 |= i15;
        }
        if ((i & 384) == 0) {
            if (rv4Var.c(f)) {
                i14 = 256;
            } else {
                i14 = Token.CASE;
            }
            i3 |= i14;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.c(56.0f)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i3 |= i13;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(weaVar)) {
                i11 = 131072;
            } else {
                i11 = Parser.ARGC_LIMIT;
            }
            i3 |= i11;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.e(j)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.e(j2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.f(dj4Var)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i3 |= i8;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var.f(null)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i3 |= i7;
        }
        if ((i2 & 6) == 0) {
            obj = lu4Var;
            if (rv4Var.h(obj)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            obj = lu4Var;
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            rv4Var.e0(-282853233);
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (P == obj2) {
                P = s21.g(rv4Var);
            }
            yu7 yu7Var = (yu7) P;
            rv4Var.q(false);
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = new dw3(29);
                rv4Var.o0(P2);
            }
            nq7 c2 = y7a.c(nq7Var, false, (xt4) P2);
            float f2 = dj4Var.a;
            int i17 = i3 >> 21;
            int i18 = i17 & Token.ASSIGN_MOD;
            boolean f3 = rv4Var.f(yu7Var);
            Object P3 = rv4Var.P();
            if (!f3 && P3 != obj2) {
                i5 = i3;
                nq7Var2 = c2;
            } else {
                i5 = i3;
                nq7Var2 = c2;
                P3 = new gj4(dj4Var.a, dj4Var.b, dj4Var.d, dj4Var.c);
                rv4Var.o0(P3);
            }
            gj4 gj4Var = (gj4) P3;
            boolean h = rv4Var.h(gj4Var);
            if (((i18 ^ 48) > 32 && rv4Var.f(dj4Var)) || (i17 & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = h | z2;
            Object P4 = rv4Var.P();
            if (z3 || P4 == obj2) {
                P4 = new d53(gj4Var, dj4Var, (m42) null, 19);
                rv4Var.o0(P4);
            }
            yte.g((lu4) P4, rv4Var, dj4Var);
            boolean f4 = rv4Var.f(yu7Var) | rv4Var.h(gj4Var);
            Object P5 = rv4Var.P();
            if (f4 || P5 == obj2) {
                P5 = new uw2(yu7Var, gj4Var, (m42) null, 25);
                rv4Var.o0(P5);
            }
            yte.g((lu4) P5, rv4Var, yu7Var);
            int i19 = i5 >> 6;
            v9b.b(vt4Var, nq7Var2, false, weaVar, j, j2, f2, ((rg3) gj4Var.e.c.b.getValue()).a, null, yu7Var, jce.E(-1779603465, new xb3(j2, oybVar, f, obj), rv4Var), rv4Var, (i5 & 14) | (i19 & 7168) | (57344 & i19) | (i19 & 458752), 260);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: ij4
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    oc2.i(vt4.this, oybVar, f, nq7Var, weaVar, j, j2, dj4Var, lu4Var, (rv4) obj3, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void j(int i, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        str.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(974316844);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        boolean z3 = true;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            if ((i9 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = yae.z(str);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            int i10 = i9 >> 3;
            xb.d(z, xt4Var, jce.E(2140441176, new h24(3, xt4Var2, xt4Var, aw7Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(1223537589, new id1(xt4Var, 15, (byte) 0), rv4Var), aye.c, null, 0L, 0L, nae.e, false, false, jce.E(-496132864, new sp0(aw7Var, 11), rv4Var), rv4Var, (i10 & 14) | 1769856 | (i10 & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i24(str, z, xt4Var, xt4Var2, i);
        }
    }

    public static final void k(boolean z, dm5 dm5Var, ss8 ss8Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        dm5Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(1004441371);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dm5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(ss8Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(275919533);
                m(z, dm5Var, ss8Var, xt4Var, rv4Var, i2 & 8190);
                rv4Var.q(false);
            } else {
                rv4Var.e0(276110028);
                l(z, dm5Var, ss8Var, xt4Var, rv4Var, i2 & 8190);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sj7(z, dm5Var, ss8Var, xt4Var, i, 0);
        }
    }

    public static final void l(boolean z, dm5 dm5Var, ss8 ss8Var, xt4 xt4Var, rv4 rv4Var, int i) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(56664044);
        if ((i & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dm5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(ss8Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            nmd.f(z2, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(-612750501, new ah7(1, dm5Var, ss8Var), rv4Var), rv4Var, (i2 & 14) | 805309440 | ((i2 >> 6) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sj7(z, dm5Var, ss8Var, xt4Var, i, 2);
        }
    }

    public static final void m(boolean z, dm5 dm5Var, ss8 ss8Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(994301264);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dm5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(ss8Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            hc2.b(pna.c, null, jce.E(1917712166, new xsa(3, xt4Var, dm5Var, ss8Var, z), rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sj7(z, dm5Var, ss8Var, xt4Var, i, 1);
        }
    }

    public static final void n(boolean z, boolean z2, boolean z3, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1741980521);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var2.g(z3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (rv4Var2.h(xt4Var2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i6;
        if (rv4Var2.h(xt4Var3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        if ((i13 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var2.U(i13 & 1, z4)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g), 12.0f);
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) b3b.d.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i14 = i13 >> 3;
            u((i13 & 14) | 384 | (i14 & 7168), xt4Var, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.V.getValue(), rv4Var2), z);
            WeakHashMap weakHashMap = yjd.w;
            rp rpVar = h88.n(rv4Var2).b;
            boolean f = rv4Var2.f((r13) rv4Var2.j(dy1.h)) | rv4Var2.f(rpVar) | rv4Var2.d(((tc6) rv4Var2.j(dy1.n)).ordinal());
            Object P = rv4Var2.P();
            if (f || P == ax1.a) {
                if (rpVar.e().b <= 0 && rpVar.e().d <= 0 && rpVar.e().a <= 0 && rpVar.e().c <= 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                P = Boolean.valueOf(z5);
                rv4Var2.o0(P);
            }
            if (((Boolean) P).booleanValue()) {
                rv4Var2.e0(398796698);
                u(((i13 >> 6) & 14) | 384 | ((i13 >> 9) & 7168), xt4Var3, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.u0.getValue(), rv4Var2), z3);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(399062895);
                rv4Var2.q(false);
            }
            u((i14 & 14) | 384 | ((i13 >> 6) & 7168), xt4Var2, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.v0.getValue(), rv4Var2), z2);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new uj7(z, z2, z3, nq7Var, xt4Var, xt4Var2, xt4Var3, i);
        }
    }

    public static final void o(boolean z, boolean z2, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1338224592);
        if ((i & 6) == 0) {
            if (rv4Var2.g(true)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i2 & 1, z3)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var2, kq7Var);
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
            ar5 c2 = rp5.c((wk3) ok3.M.getValue(), rv4Var2, 0);
            long j = ((h27) rv4Var2.j(j27.a)).a.s;
            nq7 k = tte.k(pna.n(kq7Var, 30.0f), uu9.a);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new p0c(aw7Var, 15);
                rv4Var2.o0(P2);
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P2, k, null, false), 5.0f), j, rv4Var2, 48, 0);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = new p0c(aw7Var, 16);
                rv4Var2.o0(P3);
            }
            tu1 E = jce.E(2086191126, new cw0(vt4Var, z, vt4Var2, z2, vt4Var3, aw7Var), rv4Var2);
            rv4Var2 = rv4Var;
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P3, E, rv4Var2, 14155776, 62);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ra(z, z2, vt4Var, vt4Var2, vt4Var3, i);
        }
    }

    public static final void p(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(585695922);
        if (rv4Var2.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 k = tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c);
            long g = rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) f3b.q0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            r(i, ((i6 << 3) & 896) | (i6 & 14), xt4Var, rv4Var2, nmd.v(tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), ba5Var), cqe.m((q3b) nz.p.getValue(), rv4Var2));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p61(i, xt4Var, nq7Var, i2, 4);
        }
    }

    public static final void q(int i, int i2, int i3, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, nq7 nq7Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1612072294);
        if (rv4Var2.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i3 | i4;
        if (rv4Var2.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i10 = i9 | i6;
        if (rv4Var2.h(xt4Var2)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i11 = i10 | i7;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).c);
            long g = rm1.g(r0f.y(rv4Var2), 3.0f);
            ba5 ba5Var = lre.g;
            nq7 g2 = c16.g(zbe.y(nmd.v(k, g, ba5Var), 12.0f), null, 3);
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, g2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) f3b.r0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            r(i, i11 & 910, xt4Var, rv4Var2, a82.g(rv4Var2, 6.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), ba5Var), cqe.m((q3b) nz.r.getValue(), rv4Var2));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            r(i2, (i11 >> 3) & 910, xt4Var2, rv4Var2, a82.g(rv4Var2, 6.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), ba5Var), cqe.m((q3b) nz.q.getValue(), rv4Var2));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bh7(i, i2, xt4Var, xt4Var2, nq7Var, i3);
        }
    }

    public static final void r(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, List list) {
        int i3;
        boolean z;
        rv4 rv4Var2;
        nq7 nq7Var2;
        int i4;
        int i5;
        boolean h;
        int i6;
        int i7;
        rv4Var.g0(1915254947);
        if ((i2 & 6) == 0) {
            if (rv4Var.d(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
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
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            hc2.b(nq7Var2, null, jce.E(1618882445, new fh7(i, 1, xt4Var, list), rv4Var), rv4Var2, ((i3 >> 9) & 14) | 3072, 6);
        } else {
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gh7(i, list, xt4Var, nq7Var2, i2, 1);
        }
    }

    public static final void s(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-1854833411);
        if (rv4Var.f(nq7Var)) {
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
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = ci.k;
                rv4Var.o0(P);
            }
            b37 b37Var = (b37) P;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, b37Var);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.invoke(rv4Var, 6);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final defpackage.wk3 r36, final int r37, boolean r38, boolean r39, boolean r40, final defpackage.vt4 r41, defpackage.nq7 r42, defpackage.rv4 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc2.t(wk3, int, boolean, boolean, boolean, vt4, nq7, rv4, int, int):void");
    }

    public static final void u(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, boolean z) {
        int i2;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1833494335);
        if ((i & 6) == 0) {
            if (rv4Var2.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new up0(10, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7Var2 = nq7Var;
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, nq7Var2, false);
            gv9 a = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, (i2 >> 3) & 14, 0, 131068);
            rv4Var2 = rv4Var;
            tte.g(z, false, null, xt4Var, rv4Var2, i2 & 7182, 6);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new eh7(z, str, nq7Var2, xt4Var, i, 2);
        }
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xk5.k(str);
    }

    public static final Boolean w(k46 k46Var) {
        i56 C = C(k46Var);
        if (C != null) {
            hv5 hv5Var = l46.a;
            return w3b.b(C.a());
        }
        return null;
    }

    public static final String x(k46 k46Var) {
        k46Var.getClass();
        i56 C = C(k46Var);
        if (C == null) {
            return null;
        }
        hv5 hv5Var = l46.a;
        if (C instanceof a56) {
            return null;
        }
        return C.a();
    }

    public static final Float y(k46 k46Var) {
        i56 C = C(k46Var);
        if (C != null) {
            hv5 hv5Var = l46.a;
            return q4b.C(C.a());
        }
        return null;
    }

    public static final Integer z(k46 k46Var) {
        i56 C = C(k46Var);
        if (C != null) {
            return l46.e(C);
        }
        return null;
    }

    public final void E(kc2 kc2Var) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                s0a.o("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
                try {
                    long j2 = kc2Var.a;
                    int C = a82.C(kc2Var.b);
                    int i5 = 2;
                    int i6 = 0;
                    if (C != 0) {
                        if (C != 1) {
                            j = j2;
                            i = 0;
                        } else {
                            j = j2;
                            i = 2;
                        }
                    } else {
                        j = j2;
                        i = 1;
                    }
                    int i7 = kc2Var.c;
                    int ordinal = kc2Var.d.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i6 = 4;
                                }
                            } else {
                                i6 = 3;
                            }
                        } else {
                            i6 = 2;
                        }
                    } else {
                        i6 = 1;
                    }
                    Boolean bool = kc2Var.e;
                    if (bool == null) {
                        i5 = 1;
                    } else if (!bool.booleanValue()) {
                        i5 = 3;
                    }
                    int C2 = a82.C(i5);
                    mc2 mc2Var = kc2Var.f;
                    long j3 = j;
                    int i8 = mc2Var.b;
                    int i9 = mc2Var.c;
                    int i10 = mc2Var.d;
                    int i11 = mc2Var.e;
                    mc2 mc2Var2 = kc2Var.g;
                    int i12 = -1;
                    if (mc2Var2 == null) {
                        i2 = -1;
                    } else {
                        i2 = mc2Var2.b;
                    }
                    if (mc2Var2 == null) {
                        i3 = -1;
                    } else {
                        i3 = mc2Var2.c;
                    }
                    if (mc2Var2 == null) {
                        i4 = -1;
                    } else {
                        i4 = mc2Var2.d;
                    }
                    if (mc2Var2 != null) {
                        i12 = mc2Var2.e;
                    }
                    int i13 = i2;
                    rc2.a(j3, i, i7, i6, C2, i8, i9, i10, i11, i13, i3, i4, i12, kc2Var.h);
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                return;
        }
    }

    private final void F(kc2 kc2Var) {
    }
}
