package defpackage;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zbe  reason: default package */
/* loaded from: classes.dex */
public abstract class zbe {
    public static final tu1 a = new tu1(new sv1(6), false, -504722218);
    public static final tu1 b = new tu1(new sv1(7), false, -556742451);
    public static final tu1 c = new tu1(new xu1(21), false, -65925025);

    public static nq7 A(nq7 nq7Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return z(nq7Var, f, f2);
    }

    public static final nq7 B(nq7 nq7Var, final float f, final float f2, final float f3, final float f4) {
        return nq7Var.a0(new nh8(f, f2, f3, f4, new xt4() { // from class: oh8
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                c00 c00Var = nx5Var.b;
                c00Var.b(new rg3(f), "start");
                c00Var.b(new rg3(f2), "top");
                c00Var.b(new rg3(f3), "end");
                c00Var.b(new rg3(f4), "bottom");
                return pvc.a;
            }
        }));
    }

    public static nq7 C(nq7 nq7Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return B(nq7Var, f, f2, f3, f4);
    }

    public static a6b F(List list, int i, int i2, tva tvaVar) {
        boolean x;
        boolean x2;
        list.getClass();
        tvaVar.getClass();
        int i3 = 0;
        int max = Math.max(0, Math.min(i, i2));
        int max2 = Math.max(0, Math.max(i, i2));
        a6b a6bVar = a6b.a;
        a6b a6bVar2 = a6b.c;
        if (max == max2) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iyb iybVar = (iyb) it.next();
                    tva tvaVar2 = iybVar.c;
                    if (tvaVar instanceof pva) {
                        x2 = tvaVar2 instanceof pva;
                    } else {
                        x2 = abf.x(tvaVar2, tvaVar);
                    }
                    if (x2 && iybVar.a <= max && iybVar.b > max) {
                        return a6bVar;
                    }
                }
            }
            return a6bVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            tva tvaVar3 = ((iyb) obj).c;
            if (tvaVar instanceof pva) {
                x = tvaVar3 instanceof pva;
            } else {
                x = abf.x(tvaVar3, tvaVar);
            }
            if (x) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            iyb iybVar2 = (iyb) obj2;
            arrayList2.add(new yk8(Integer.valueOf(Math.max(iybVar2.a, max)), Integer.valueOf(Math.min(iybVar2.b, max2))));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            yk8 yk8Var = (yk8) obj3;
            if (((Number) yk8Var.a).intValue() < ((Number) yk8Var.b).intValue()) {
                arrayList3.add(obj3);
            }
        }
        List u0 = sl1.u0(arrayList3, new roa(4));
        if (u0.isEmpty()) {
            return a6bVar2;
        }
        int intValue = ((Number) ((yk8) u0.get(0)).a).intValue();
        int intValue2 = ((Number) ((yk8) u0.get(0)).b).intValue();
        int size3 = u0.size();
        for (int i6 = 1; i6 < size3; i6++) {
            yk8 yk8Var2 = (yk8) u0.get(i6);
            int intValue3 = ((Number) yk8Var2.a).intValue();
            int intValue4 = ((Number) yk8Var2.b).intValue();
            if (intValue3 <= intValue2) {
                intValue2 = Math.max(intValue2, intValue4);
            } else {
                i3 = (intValue2 - intValue) + i3;
                intValue2 = intValue4;
                intValue = intValue3;
            }
        }
        int i7 = (intValue2 - intValue) + i3;
        if (i7 >= max2 - max) {
            return a6bVar;
        }
        if (i7 > 0) {
            return a6b.b;
        }
        return a6bVar2;
    }

    public static List G(List list, int i, int i2, tva tvaVar) {
        boolean x;
        Iterable r;
        list.getClass();
        tvaVar.getClass();
        int max = Math.max(0, Math.min(i, i2));
        int max2 = Math.max(0, Math.max(i, i2));
        if (max >= max2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iyb iybVar = (iyb) it.next();
            tva tvaVar2 = iybVar.c;
            int i3 = iybVar.a;
            int i4 = iybVar.b;
            if (tvaVar instanceof pva) {
                x = tvaVar2 instanceof pva;
            } else {
                x = abf.x(tvaVar2, tvaVar);
            }
            if (!x) {
                r = tl1.A(iybVar);
            } else {
                jq6 t = tl1.t();
                if (i3 < max && i4 > max) {
                    t.add(new iyb(i3, Math.min(i4, max), tvaVar2));
                } else if (i4 <= max) {
                    t.add(iybVar);
                }
                if (i4 > max2 && i3 < max2) {
                    t.add(new iyb(Math.max(i3, max2), i4, tvaVar2));
                } else if (i3 >= max2) {
                    t.add(iybVar);
                }
                r = tl1.r(t);
            }
            xl1.P(arrayList, r);
        }
        return arrayList;
    }

    public static final void H(k61 k61Var, float f, float f2, float f3) {
        if (f == nae.e) {
            return;
        }
        k61Var.p(f2, f3);
        k61Var.d(f);
        k61Var.p(-f2, -f3);
    }

    public static yk8 I(int i, List list) {
        list.getClass();
        if (i >= 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iyb iybVar = (iyb) it.next();
                int i2 = iybVar.b;
                tva tvaVar = iybVar.c;
                if (i2 <= i) {
                    arrayList.add(iybVar);
                } else {
                    int i3 = iybVar.a;
                    if (i3 >= i) {
                        arrayList2.add(new iyb(i3 - i, i2 - i, tvaVar));
                    } else {
                        arrayList.add(new iyb(i3, i, tvaVar));
                        arrayList2.add(new iyb(0, iybVar.b - i, tvaVar));
                    }
                }
            }
            return new yk8(arrayList, arrayList2);
        }
        p1a.k(a82.j(i, "position must be non-negative, got "));
        return null;
    }

    public static final Object J(r0a r0aVar, boolean z, r0a r0aVar2, lu4 lu4Var) {
        ft1 ft1Var;
        Object R;
        try {
            if (!(lu4Var instanceof hh0)) {
                ft1Var = w92.z(lu4Var, r0aVar2, r0aVar);
            } else {
                jsc.u(2, lu4Var);
                ft1Var = lu4Var.invoke(r0aVar2, r0aVar);
            }
        } catch (sa3 e) {
            Throwable th = e.a;
            r0aVar.P(new ft1(th, false));
            throw th;
        } catch (Throwable th2) {
            ft1Var = new ft1(th2, false);
        }
        n82 n82Var = n82.a;
        if (ft1Var == n82Var || (R = r0aVar.R(ft1Var)) == m36.b) {
            return n82Var;
        }
        r0aVar.s0();
        if (R instanceof ft1) {
            if (!z) {
                Throwable th3 = ((ft1) R).a;
                if ((th3 instanceof eac) && ((eac) th3).a == r0aVar) {
                    if (ft1Var instanceof ft1) {
                        throw ((ft1) ft1Var).a;
                    }
                    return ft1Var;
                }
            }
            throw ((ft1) R).a;
        }
        return m36.a(R);
    }

    public static final int K(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static String L(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder o = a82.o("<", str2, " threw ");
                    o.append(e.getClass().getName());
                    o.append(">");
                    sb = o.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final sf a(jj jjVar) {
        Canvas canvas = tf.a;
        sf sfVar = new sf();
        sfVar.a = new Canvas(ay5.a(jjVar));
        return sfVar;
    }

    public static final void b(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-895135892);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            rv4Var2.e0(-1433947880);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, 24576, 0, 130030);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, 100663296, 252);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            z1d.f(rp5.c((wk3) ok3.F.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.e.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var2, rv4Var2, 100663296, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, vt4Var, vt4Var2, nq7Var, i);
        }
    }

    public static final void c(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(332055188);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
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
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.g;
            kq7 kq7Var = kq7.a;
            cvb.c(str, y(kq7Var, 24.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130044);
            eg0.f(pna.n(kq7Var, 48.0f), ((zl1) rv4Var.j(r12.a)).a, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new pp1(0, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 2);
        }
    }

    public static final void d(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-2057058970);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
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
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new op0(str, 5);
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
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(op1.class);
                op1 op1Var = (op1) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(op1Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new u0(op1Var, 14);
                    rv4Var.o0(P2);
                }
                tte.d(op1Var, null, (xt4) P2, rv4Var, 0);
                aw7 z3 = jsc.z(op1Var.i0, rv4Var);
                aw7 z4 = jsc.z(op1Var.X, rv4Var);
                dxe.l(((dm5) z4.getValue()).e, ((dm5) z4.getValue()).q, ((dm5) z4.getValue()).i, ((dm5) z4.getValue()).j, rv4Var, 0);
                rv4Var2 = rv4Var;
                p17.a((dm5) z4.getValue(), jce.E(-1959485406, new i31(nq7Var, cz7Var2, op1Var, z3, 1), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 1);
        }
    }

    public static final void e(xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        xt4Var.getClass();
        rv4Var.g0(-1074634397);
        if (rv4Var.h(xt4Var)) {
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
            aw7 D = yae.D(xt4Var, rv4Var);
            boolean f = rv4Var.f(D);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new as2(D, null, 0);
                rv4Var.o0(P);
            }
            yte.g((lu4) P, rv4Var, pvc.a);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new id1(i, xt4Var);
        }
    }

    public static final void f(boolean z, xeb xebVar, String str, xt4 xt4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        xebVar.getClass();
        str.getClass();
        xt4Var.getClass();
        nu4Var.getClass();
        rv4Var.g0(283547035);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(xebVar)) {
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
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(nu4Var)) {
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
            xb.a(z, xt4Var, null, null, null, null, jce.E(-1912623314, new jd1(str, 20), rv4Var), null, 0L, 0L, nae.e, null, null, null, true, true, jce.E(27435127, new zl7(xebVar, str, nu4Var, 0), rv4Var), rv4Var, (i11 & 14) | 1572864 | ((i11 >> 6) & Token.ASSIGN_MOD), 1794048, 16316);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am7(z, xebVar, str, xt4Var, nu4Var, i, 0);
        }
    }

    public static final void g(boolean z, xeb xebVar, String str, xt4 xt4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        xebVar.getClass();
        str.getClass();
        xt4Var.getClass();
        nu4Var.getClass();
        rv4Var.g0(-574761871);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(xebVar)) {
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
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(nu4Var)) {
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
            xb.a(z, xt4Var, null, null, null, null, jce.E(-129381634, new jd1(str, 21), rv4Var), null, 0L, 0L, nae.e, null, null, null, true, true, jce.E(-1805291499, new zl7(xebVar, str, nu4Var, 1), rv4Var), rv4Var, (i11 & 14) | 1572864 | ((i11 >> 6) & Token.ASSIGN_MOD), 1794048, 16316);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am7(z, xebVar, str, xt4Var, nu4Var, i, 1);
        }
    }

    public static th8 h(int i, float f) {
        int i2 = i & 1;
        float f2 = nae.e;
        if (i2 != 0) {
            f = 0.0f;
        }
        if ((i & 2) == 0) {
            f2 = 20.0f;
        }
        return new th8(f, f2, f, f2);
    }

    public static final th8 i(float f, float f2, float f3, float f4) {
        return new th8(f, f2, f3, f4);
    }

    public static th8 j(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new th8(f, f2, f3, f4);
    }

    public static final void k(boolean z, nq7 nq7Var, boolean z2, rg9 rg9Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        nq7 nq7Var2;
        boolean z4;
        rg9 rg9Var2;
        rg9 rg9Var3;
        boolean z5;
        rg9 rg9Var4;
        kq7 kq7Var;
        float f;
        long j;
        Object D;
        int i3;
        int i4;
        rv4Var.g0(408580840);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(null)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2 | 3456;
        if ((i & 24576) == 0) {
            i5 = i2 | 11648;
        }
        int i6 = 196608 | i5;
        if ((74899 & i6) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i6 & 1, z3)) {
            rv4Var.Z();
            int i7 = i & 1;
            kq7 kq7Var2 = kq7.a;
            if (i7 != 0 && !rv4Var.B()) {
                rv4Var.X();
                kq7Var = nq7Var;
                z5 = z2;
                rg9Var4 = rg9Var;
            } else {
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                rg9 rg9Var5 = pm1Var.g0;
                if (rg9Var5 == null) {
                    rg9Var3 = new rg9(rm1.d(pm1Var, fre.e), rm1.d(pm1Var, fre.f), zl1.b(0.38f, rm1.d(pm1Var, fre.b)), zl1.b(0.38f, rm1.d(pm1Var, fre.c)));
                    pm1Var.g0 = rg9Var3;
                } else {
                    rg9Var3 = rg9Var5;
                }
                z5 = true;
                rg9Var4 = rg9Var3;
                kq7Var = kq7Var2;
            }
            rv4Var.r();
            if (z) {
                f = 6.0f;
            } else {
                f = nae.e;
            }
            yya a2 = nq.a(f, kqe.y(ur7.b, rv4Var), null, rv4Var, 0, 12);
            rg9Var4.getClass();
            if (z5 && z) {
                j = rg9Var4.a;
            } else if (z5 && !z) {
                j = rg9Var4.b;
            } else if (!z5 && z) {
                j = rg9Var4.c;
            } else {
                j = rg9Var4.d;
            }
            if (z5) {
                rv4Var.e0(1194671677);
                D = wma.a(j, kqe.y(ur7.c, rv4Var), rv4Var, 0, 12);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1194849338);
                D = yae.D(new zl1(j), rv4Var);
                rv4Var.q(false);
            }
            nq7 k = pna.k(y(pna.w(kq7Var.a0(kq7Var2).a0(kq7Var2), kh5.e, false), 2.0f), fre.d);
            boolean f2 = rv4Var.f(D) | rv4Var.f(a2);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new fl7(25, D, a2);
                rv4Var.o0(P);
            }
            bce.a(k, (xt4) P, rv4Var, 0);
            nq7Var2 = kq7Var;
            z4 = z5;
            rg9Var2 = rg9Var4;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            z4 = z2;
            rg9Var2 = rg9Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oj4(z, nq7Var2, z4, rg9Var2, i);
        }
    }

    public static final void l(boolean z, String str, String str2, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(-284065494);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(str2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            int i10 = i9 >> 3;
            l0e.i(str, str2, z(pna.f(kq7.a, 1.0f), 16.0f, 8.0f), false, z, xt4Var, rv4Var, (i10 & Token.ASSIGN_MOD) | (i10 & 14) | 384 | ((i9 << 12) & 57344) | ((i9 << 6) & 458752));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, str, str2, xt4Var, i, 13);
        }
    }

    public static final lv4 m(lv4 lv4Var) {
        if (lv4Var == null) {
            lv4Var = null;
        }
        if (lv4Var != null) {
            return lv4Var;
        }
        ex1.b("Inconsistent composition");
        ls2.c();
        return null;
    }

    public static final float n(rh8 rh8Var, tc6 tc6Var) {
        if (tc6Var == tc6.a) {
            return rh8Var.c(tc6Var);
        }
        return rh8Var.b(tc6Var);
    }

    public static final float o(rh8 rh8Var, tc6 tc6Var) {
        if (tc6Var == tc6.a) {
            return rh8Var.b(tc6Var);
        }
        return rh8Var.c(tc6Var);
    }

    public static List p(ArrayList arrayList) {
        Integer num;
        boolean z;
        boolean isEmpty = arrayList.isEmpty();
        ks3 ks3Var = ks3.a;
        if (isEmpty) {
            return ks3Var;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((iyb) obj).c instanceof pva) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (!(((iyb) obj2).c instanceof pva)) {
                arrayList3.add(obj2);
            }
        }
        Collection collection = ks3Var;
        if (!arrayList2.isEmpty()) {
            jq6 t = tl1.t();
            int size3 = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                int i5 = i3 + 1;
                if (i3 >= 0) {
                    iyb iybVar = (iyb) obj3;
                    t.add(new ava(iybVar.a, i3, true));
                    t.add(new ava(iybVar.b, i3, false));
                    i3 = i5;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            List u0 = sl1.u0(tl1.r(t), new roa(3));
            boolean[] zArr = new boolean[arrayList2.size()];
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int i6 = ((ava) sl1.c0(u0)).a;
            int i7 = 0;
            while (i7 < u0.size()) {
                int i8 = ((ava) u0.get(i7)).a;
                while (true) {
                    if (!arrayList4.isEmpty()) {
                        int intValue = ((Number) arrayList4.get(z2 ? 1 : 0)).intValue();
                        if (zArr[intValue]) {
                            num = Integer.valueOf(intValue);
                            break;
                        }
                        int intValue2 = ((Number) a82.h(1, arrayList4)).intValue();
                        if (!arrayList4.isEmpty()) {
                            arrayList4.set(z2 ? 1 : 0, Integer.valueOf(intValue2));
                            int i9 = z2 ? 1 : 0;
                            while (true) {
                                int i10 = i9 * 2;
                                int i11 = i10 + 1;
                                if (i11 >= arrayList4.size()) {
                                    break;
                                }
                                int i12 = i10 + 2;
                                if (i12 < arrayList4.size()) {
                                    int intValue3 = ((Number) arrayList4.get(i12)).intValue();
                                    z = z2 ? 1 : 0;
                                    if (intValue3 > ((Number) arrayList4.get(i11)).intValue()) {
                                        i11 = i12;
                                    }
                                } else {
                                    z = z2 ? 1 : 0;
                                }
                                if (((Number) arrayList4.get(i9)).intValue() >= ((Number) arrayList4.get(i11)).intValue()) {
                                    break;
                                }
                                int intValue4 = ((Number) arrayList4.get(i9)).intValue();
                                arrayList4.set(i9, arrayList4.get(i11));
                                arrayList4.set(i11, Integer.valueOf(intValue4));
                                i9 = i11;
                                z2 = z;
                            }
                        }
                        z = z2;
                        z2 = z;
                    } else {
                        num = null;
                        break;
                    }
                }
                boolean z3 = z2 ? 1 : 0;
                if (i6 < i8 && num != null) {
                    arrayList5.add(new iyb(i6, i8, ((iyb) arrayList2.get(num.intValue())).c));
                }
                while (i7 < u0.size() && ((ava) u0.get(i7)).a == i8) {
                    ava avaVar = (ava) u0.get(i7);
                    boolean z4 = avaVar.c;
                    int i13 = avaVar.b;
                    if (z4) {
                        zArr[i13] = true;
                        arrayList4.add(Integer.valueOf(i13));
                        int size4 = arrayList4.size() - 1;
                        while (size4 > 0) {
                            int i14 = (size4 - 1) / 2;
                            if (((Number) arrayList4.get(i14)).intValue() >= ((Number) arrayList4.get(size4)).intValue()) {
                                break;
                            }
                            int intValue5 = ((Number) arrayList4.get(i14)).intValue();
                            arrayList4.set(i14, arrayList4.get(size4));
                            arrayList4.set(size4, Integer.valueOf(intValue5));
                            size4 = i14;
                        }
                    } else {
                        zArr[i13] = z3;
                    }
                    i7++;
                }
                i6 = i8;
                z2 = z3;
            }
            collection = u(arrayList5);
        }
        return u(sl1.n0(arrayList3, collection));
    }

    public static final Object t(w27 w27Var) {
        xc6 xc6Var;
        Object S = w27Var.S();
        if (S instanceof xc6) {
            xc6Var = (xc6) S;
        } else {
            xc6Var = null;
        }
        if (xc6Var == null) {
            return null;
        }
        return xc6Var.K;
    }

    public static List u(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return ks3.a;
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iyb iybVar = (iyb) obj;
            tva tvaVar = iybVar.c;
            if (tvaVar instanceof mva) {
                arrayList2.add(iybVar);
            } else {
                Object w = abf.w(tvaVar);
                Object obj2 = linkedHashMap.get(w);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(w, obj2);
                }
                ((List) obj2).add(iybVar);
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                List u0 = sl1.u0((List) ((Map.Entry) it.next()).getValue(), new roa(2));
                iyb iybVar2 = (iyb) u0.get(0);
                int size2 = u0.size();
                for (int i2 = 1; i2 < size2; i2++) {
                    iyb iybVar3 = (iyb) u0.get(i2);
                    int i3 = iybVar3.a;
                    int i4 = iybVar2.b;
                    if (i3 <= i4) {
                        int i5 = iybVar3.b;
                        if (i5 < i4) {
                            iybVar3 = iybVar2;
                        }
                        iybVar2 = new iyb(iybVar2.a, Math.max(i4, i5), iybVar3.c);
                    } else {
                        arrayList2.add(iybVar2);
                        iybVar2 = iybVar3;
                    }
                }
                arrayList2.add(iybVar2);
            } else {
                return sl1.u0(arrayList2, hxe.i(new eja(28), new eja(29)));
            }
        }
    }

    public static List v(int i, List list, List list2) {
        list.getClass();
        list2.getClass();
        if (i >= 0) {
            ArrayList arrayList = new ArrayList(tl1.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                iyb iybVar = (iyb) it.next();
                arrayList.add(new iyb(iybVar.a + i, iybVar.b + i, iybVar.c));
            }
            return p(sl1.n0(list, arrayList));
        }
        p1a.k(a82.j(i, "firstTextLength must be non-negative, got "));
        return null;
    }

    public static List w(int i, List list) {
        iyb iybVar;
        list.getClass();
        if (list.isEmpty()) {
            return ks3.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iyb iybVar2 = (iyb) it.next();
            int n = dce.n(iybVar2.a, 0, i);
            int n2 = dce.n(iybVar2.b, n, i);
            if (n < n2) {
                iybVar = new iyb(n, n2, iybVar2.c);
            } else {
                iybVar = null;
            }
            if (iybVar != null) {
                arrayList.add(iybVar);
            }
        }
        return p(arrayList);
    }

    public static final nq7 x(nq7 nq7Var, rh8 rh8Var) {
        return nq7Var.a0(new sh8(rh8Var, new cl7(rh8Var, 14)));
    }

    public static final nq7 y(nq7 nq7Var, float f) {
        return nq7Var.a0(new nh8(f, f, f, f, new hd(3, f)));
    }

    public static final nq7 z(nq7 nq7Var, float f, float f2) {
        return nq7Var.a0(new nh8(f, f2, f, f2, new id(f, f2, 1)));
    }

    public abstract void D(m3 m3Var, m3 m3Var2);

    public abstract void E(m3 m3Var, Thread thread);

    public abstract boolean q(n3 n3Var, j3 j3Var, j3 j3Var2);

    public abstract boolean r(n3 n3Var, Object obj, Object obj2);

    public abstract boolean s(n3 n3Var, m3 m3Var, m3 m3Var2);
}
