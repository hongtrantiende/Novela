package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m0a  reason: default package */
/* loaded from: classes.dex */
public abstract class m0a {
    public static final Class a;
    public static final cwc b;
    public static final cwc c;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, cwc] */
    static {
        Class<?> cls;
        Class<?> cls2;
        w89 w89Var = w89.c;
        cwc cwcVar = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            w89 w89Var2 = w89.c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                cwcVar = (cwc) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = cwcVar;
        c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += el1.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (el1.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (el1.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += el1.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += el1.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += el1.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += el1.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += el1.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += el1.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(cwc cwcVar, Object obj, Object obj2) {
        cwcVar.getClass();
        ow4 ow4Var = (ow4) obj;
        zvc zvcVar = ow4Var.unknownFields;
        zvc zvcVar2 = ((ow4) obj2).unknownFields;
        zvc zvcVar3 = zvc.f;
        if (!zvcVar3.equals(zvcVar2)) {
            if (zvcVar3.equals(zvcVar)) {
                int i = zvcVar.a + zvcVar2.a;
                int[] copyOf = Arrays.copyOf(zvcVar.b, i);
                System.arraycopy(zvcVar2.b, 0, copyOf, zvcVar.a, zvcVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zvcVar.c, i);
                System.arraycopy(zvcVar2.c, 0, copyOf2, zvcVar.a, zvcVar2.a);
                zvcVar = new zvc(i, copyOf, copyOf2, true);
            } else {
                zvcVar.getClass();
                if (!zvcVar2.equals(zvcVar3)) {
                    if (zvcVar.e) {
                        int i2 = zvcVar.a + zvcVar2.a;
                        zvcVar.a(i2);
                        System.arraycopy(zvcVar2.b, 0, zvcVar.b, zvcVar.a, zvcVar2.a);
                        System.arraycopy(zvcVar2.c, 0, zvcVar.c, zvcVar.a, zvcVar2.a);
                        zvcVar.a = i2;
                    } else {
                        cp8.q();
                        return;
                    }
                }
            }
        }
        ow4Var.unknownFields = zvcVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void m(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3++;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    byte b2 = ((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0;
                    if (el1Var.d == el1Var.c) {
                        el1Var.k();
                    }
                    byte[] bArr = el1Var.b;
                    int i5 = el1Var.d;
                    el1Var.d = i5 + 1;
                    bArr[i5] = b2;
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3 += 8;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                el1Var.getClass();
                el1Var.r(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void o(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += el1.j(((Integer) list.get(i4)).intValue());
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.u(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3 += 4;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3 += 8;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.s(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void r(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3 += 4;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                el1Var.getClass();
                el1Var.p(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void s(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += el1.j(((Integer) list.get(i4)).intValue());
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.u(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += el1.j(((Long) list.get(i4)).longValue());
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.C(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3 += 4;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = el1.f;
                    i3 += 8;
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.s(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void w(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += el1.i((intValue >> 31) ^ (intValue << 1));
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    el1Var.A((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                el1Var.z(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void x(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += el1.j((longValue >> 63) ^ (longValue << 1));
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    el1Var.C((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                el1Var.B(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void y(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += el1.i(((Integer) list.get(i4)).intValue());
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.A(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, fz4 fz4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            el1 el1Var = (el1) fz4Var.a;
            int i2 = 0;
            if (z) {
                el1Var.y(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += el1.j(((Long) list.get(i4)).longValue());
                }
                el1Var.A(i3);
                while (i2 < list.size()) {
                    el1Var.C(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                el1Var.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static Object j(Object obj, int i, sz5 sz5Var, Object obj2, cwc cwcVar) {
        return obj2;
    }
}
