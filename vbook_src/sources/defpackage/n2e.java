package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n2e  reason: default package */
/* loaded from: classes.dex */
public abstract class n2e {
    public static final zj1 a;

    static {
        int i = kzd.a;
        a = new zj1(14);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void b(Object obj, Object obj2) {
        o0e o0eVar = (o0e) obj;
        x2e x2eVar = o0eVar.zzc;
        x2e x2eVar2 = ((o0e) obj2).zzc;
        x2e x2eVar3 = x2e.f;
        if (!x2eVar3.equals(x2eVar2)) {
            if (x2eVar3.equals(x2eVar)) {
                int i = x2eVar.a + x2eVar2.a;
                int[] copyOf = Arrays.copyOf(x2eVar.b, i);
                System.arraycopy(x2eVar2.b, 0, copyOf, x2eVar.a, x2eVar2.a);
                Object[] copyOf2 = Arrays.copyOf(x2eVar.c, i);
                System.arraycopy(x2eVar2.c, 0, copyOf2, x2eVar.a, x2eVar2.a);
                x2eVar = new x2e(i, copyOf, copyOf2, true);
            } else {
                x2eVar.getClass();
                if (!x2eVar2.equals(x2eVar3)) {
                    if (x2eVar.e) {
                        int i2 = x2eVar.a + x2eVar2.a;
                        x2eVar.e(i2);
                        System.arraycopy(x2eVar2.b, 0, x2eVar.b, x2eVar.a, x2eVar2.a);
                        System.arraycopy(x2eVar2.c, 0, x2eVar.c, x2eVar.a, x2eVar2.a);
                        x2eVar.a = i2;
                    } else {
                        cp8.q();
                        return;
                    }
                }
            }
        }
        o0eVar.zzc = x2eVar;
    }

    public static Object c(Object obj, int i, f1e f1eVar, bzd bzdVar, Object obj2, zj1 zj1Var) {
        if (bzdVar == null) {
            return obj2;
        }
        if (f1eVar != null) {
            int size = f1eVar.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) f1eVar.get(i3);
                int intValue = num.intValue();
                if (bzdVar.a(intValue)) {
                    if (i3 != i2) {
                        f1eVar.set(i2, num);
                    }
                    i2++;
                } else {
                    if (obj2 == null) {
                        zj1Var.getClass();
                        obj2 = zj1.t(obj);
                    }
                    zj1Var.getClass();
                    ((x2e) obj2).d(i << 3, Long.valueOf(intValue));
                }
            }
            if (i2 != size) {
                f1eVar.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = f1eVar.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!bzdVar.a(intValue2)) {
                if (obj2 == null) {
                    zj1Var.getClass();
                    obj2 = zj1.t(obj);
                }
                zj1Var.getClass();
                ((x2e) obj2).d(i << 3, Long.valueOf(intValue2));
                it.remove();
            }
        }
        return obj2;
    }

    public static void d(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (z) {
                g0eVar.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                g0eVar.r(i3);
                while (i2 < list.size()) {
                    g0eVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                g0eVar.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void e(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (z) {
                g0eVar.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                g0eVar.r(i3);
                while (i2 < list.size()) {
                    g0eVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                g0eVar.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void f(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof o1e) {
                o1e o1eVar = (o1e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < o1eVar.c; i4++) {
                        i3 += g0e.b(o1eVar.b(i4));
                    }
                    g0eVar.r(i3);
                    while (i2 < o1eVar.c) {
                        g0eVar.t(o1eVar.b(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < o1eVar.c) {
                    g0eVar.h(i, o1eVar.b(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += g0e.b(((Long) list.get(i6)).longValue());
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.t(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
            }
        }
    }

    public static void g(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof o1e) {
                o1e o1eVar = (o1e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < o1eVar.c; i4++) {
                        i3 += g0e.b(o1eVar.b(i4));
                    }
                    g0eVar.r(i3);
                    while (i2 < o1eVar.c) {
                        g0eVar.t(o1eVar.b(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < o1eVar.c) {
                    g0eVar.h(i, o1eVar.b(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += g0e.b(((Long) list.get(i6)).longValue());
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.t(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
            }
        }
    }

    public static void h(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof o1e) {
                o1e o1eVar = (o1e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < o1eVar.c; i4++) {
                        long b = o1eVar.b(i4);
                        i3 += g0e.b((b >> 63) ^ (b + b));
                    }
                    g0eVar.r(i3);
                    while (i2 < o1eVar.c) {
                        long b2 = o1eVar.b(i2);
                        g0eVar.t((b2 >> 63) ^ (b2 + b2));
                        i2++;
                    }
                    return;
                }
                while (i2 < o1eVar.c) {
                    long b3 = o1eVar.b(i2);
                    g0eVar.h(i, (b3 >> 63) ^ (b3 + b3));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    i5 += g0e.b((longValue >> 63) ^ (longValue + longValue));
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    g0eVar.t((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    long longValue3 = ((Long) list.get(i2)).longValue();
                    g0eVar.h(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                    i2++;
                }
            }
        }
    }

    public static void i(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof o1e) {
                o1e o1eVar = (o1e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < o1eVar.c; i4++) {
                        o1eVar.b(i4);
                        i3 += 8;
                    }
                    g0eVar.r(i3);
                    while (i2 < o1eVar.c) {
                        g0eVar.u(o1eVar.b(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < o1eVar.c) {
                    g0eVar.i(i, o1eVar.b(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
            }
        }
    }

    public static void j(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof o1e) {
                o1e o1eVar = (o1e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < o1eVar.c; i4++) {
                        o1eVar.b(i4);
                        i3 += 8;
                    }
                    g0eVar.r(i3);
                    while (i2 < o1eVar.c) {
                        g0eVar.u(o1eVar.b(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < o1eVar.c) {
                    g0eVar.i(i, o1eVar.b(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
            }
        }
    }

    public static void k(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof q0e) {
                q0e q0eVar = (q0e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < q0eVar.c; i4++) {
                        i3 += g0e.b(q0eVar.c(i4));
                    }
                    g0eVar.r(i3);
                    while (i2 < q0eVar.c) {
                        g0eVar.q(q0eVar.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < q0eVar.c) {
                    g0eVar.e(i, q0eVar.c(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += g0e.b(((Integer) list.get(i6)).intValue());
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void l(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof q0e) {
                q0e q0eVar = (q0e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < q0eVar.c; i4++) {
                        i3 += g0e.a(q0eVar.c(i4));
                    }
                    g0eVar.r(i3);
                    while (i2 < q0eVar.c) {
                        g0eVar.r(q0eVar.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < q0eVar.c) {
                    g0eVar.f(i, q0eVar.c(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += g0e.a(((Integer) list.get(i6)).intValue());
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.r(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void m(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof q0e) {
                q0e q0eVar = (q0e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < q0eVar.c; i4++) {
                        int c = q0eVar.c(i4);
                        i3 += g0e.a((c >> 31) ^ (c + c));
                    }
                    g0eVar.r(i3);
                    while (i2 < q0eVar.c) {
                        int c2 = q0eVar.c(i2);
                        g0eVar.r((c2 >> 31) ^ (c2 + c2));
                        i2++;
                    }
                    return;
                }
                while (i2 < q0eVar.c) {
                    int c3 = q0eVar.c(i2);
                    g0eVar.f(i, (c3 >> 31) ^ (c3 + c3));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += g0e.a((intValue >> 31) ^ (intValue + intValue));
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    g0eVar.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    int intValue3 = ((Integer) list.get(i2)).intValue();
                    g0eVar.f(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                    i2++;
                }
            }
        }
    }

    public static void n(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof q0e) {
                q0e q0eVar = (q0e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < q0eVar.c; i4++) {
                        q0eVar.c(i4);
                        i3 += 4;
                    }
                    g0eVar.r(i3);
                    while (i2 < q0eVar.c) {
                        g0eVar.s(q0eVar.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < q0eVar.c) {
                    g0eVar.g(i, q0eVar.c(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void o(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof q0e) {
                q0e q0eVar = (q0e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < q0eVar.c; i4++) {
                        q0eVar.c(i4);
                        i3 += 4;
                    }
                    g0eVar.r(i3);
                    while (i2 < q0eVar.c) {
                        g0eVar.s(q0eVar.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < q0eVar.c) {
                    g0eVar.g(i, q0eVar.c(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void p(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (list instanceof q0e) {
                q0e q0eVar = (q0e) list;
                if (z) {
                    g0eVar.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < q0eVar.c; i4++) {
                        i3 += g0e.b(q0eVar.c(i4));
                    }
                    g0eVar.r(i3);
                    while (i2 < q0eVar.c) {
                        g0eVar.q(q0eVar.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < q0eVar.c) {
                    g0eVar.e(i, q0eVar.c(i2));
                    i2++;
                }
            } else if (z) {
                g0eVar.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += g0e.b(((Integer) list.get(i6)).intValue());
                }
                g0eVar.r(i5);
                while (i2 < list.size()) {
                    g0eVar.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    g0eVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void q(int i, List list, bp9 bp9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            g0e g0eVar = (g0e) bp9Var.b;
            int i2 = 0;
            if (z) {
                g0eVar.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                g0eVar.r(i3);
                while (i2 < list.size()) {
                    g0eVar.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                g0eVar.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1e) {
            o1e o1eVar = (o1e) list;
            int i2 = 0;
            while (i < size) {
                i2 += g0e.b(o1eVar.b(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += g0e.b(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1e) {
            o1e o1eVar = (o1e) list;
            int i2 = 0;
            while (i < size) {
                i2 += g0e.b(o1eVar.b(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += g0e.b(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1e) {
            o1e o1eVar = (o1e) list;
            int i2 = 0;
            while (i < size) {
                long b = o1eVar.b(i);
                i2 += g0e.b((b >> 63) ^ (b + b));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += g0e.b((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0e) {
            q0e q0eVar = (q0e) list;
            int i2 = 0;
            while (i < size) {
                i2 += g0e.b(q0eVar.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += g0e.b(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0e) {
            q0e q0eVar = (q0e) list;
            int i2 = 0;
            while (i < size) {
                i2 += g0e.b(q0eVar.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += g0e.b(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0e) {
            q0e q0eVar = (q0e) list;
            int i2 = 0;
            while (i < size) {
                i2 += g0e.a(q0eVar.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += g0e.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0e) {
            q0e q0eVar = (q0e) list;
            int i2 = 0;
            while (i < size) {
                int c = q0eVar.c(i);
                i2 += g0e.a((c >> 31) ^ (c + c));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += g0e.a((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g0e.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g0e.a(i << 3) + 8) * size;
    }
}
