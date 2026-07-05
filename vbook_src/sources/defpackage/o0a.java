package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o0a  reason: default package */
/* loaded from: classes.dex */
public abstract class o0a {
    public static final Class a;
    public static final ewc b;
    public static final ewc c;

    /* JADX WARN: Type inference failed for: r0v3, types: [ewc, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        z89 z89Var = z89.c;
        ewc ewcVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            z89 z89Var2 = z89.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                ewcVar = (ewc) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = ewcVar;
        c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += fl1.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fl1.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fl1.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += fl1.j(((Integer) list.get(i2)).intValue());
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
            i += fl1.j(((Long) list.get(i2)).longValue());
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
            i += fl1.i((intValue >> 31) ^ (intValue << 1));
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
            i += fl1.j((longValue >> 63) ^ (longValue << 1));
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
            i += fl1.i(((Integer) list.get(i2)).intValue());
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
            i += fl1.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(ewc ewcVar, Object obj, Object obj2) {
        ewcVar.getClass();
        qw4 qw4Var = (qw4) obj;
        bwc bwcVar = qw4Var.unknownFields;
        bwc bwcVar2 = ((qw4) obj2).unknownFields;
        bwc bwcVar3 = bwc.f;
        if (!bwcVar3.equals(bwcVar2)) {
            if (bwcVar3.equals(bwcVar)) {
                int i = bwcVar.a + bwcVar2.a;
                int[] copyOf = Arrays.copyOf(bwcVar.b, i);
                System.arraycopy(bwcVar2.b, 0, copyOf, bwcVar.a, bwcVar2.a);
                Object[] copyOf2 = Arrays.copyOf(bwcVar.c, i);
                System.arraycopy(bwcVar2.c, 0, copyOf2, bwcVar.a, bwcVar2.a);
                bwcVar = new bwc(i, copyOf, copyOf2, true);
            } else {
                bwcVar.getClass();
                if (!bwcVar2.equals(bwcVar3)) {
                    if (bwcVar.e) {
                        int i2 = bwcVar.a + bwcVar2.a;
                        bwcVar.a(i2);
                        System.arraycopy(bwcVar2.b, 0, bwcVar.b, bwcVar.a, bwcVar2.a);
                        System.arraycopy(bwcVar2.c, 0, bwcVar.c, bwcVar.a, bwcVar2.a);
                        bwcVar.a = i2;
                    } else {
                        cp8.q();
                        return;
                    }
                }
            }
        }
        qw4Var.unknownFields = bwcVar;
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

    public static void m(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3++;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3 += 8;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                fl1Var.getClass();
                fl1Var.t(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void o(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += fl1.j(((Integer) list.get(i4)).intValue());
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3 += 4;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3 += 8;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void r(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3 += 4;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                fl1Var.getClass();
                fl1Var.r(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void s(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += fl1.j(((Integer) list.get(i4)).intValue());
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += fl1.j(((Long) list.get(i4)).longValue());
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3 += 4;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = fl1.f;
                    i3 += 8;
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void w(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += fl1.i((intValue >> 31) ^ (intValue << 1));
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    fl1Var.D((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                fl1Var.C(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void x(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += fl1.j((longValue >> 63) ^ (longValue << 1));
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    fl1Var.F((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                fl1Var.E(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void y(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += fl1.i(((Integer) list.get(i4)).intValue());
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, n07 n07Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fl1 fl1Var = (fl1) n07Var.b;
            int i2 = 0;
            if (z) {
                fl1Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += fl1.j(((Long) list.get(i4)).longValue());
                }
                fl1Var.D(i3);
                while (i2 < list.size()) {
                    fl1Var.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fl1Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static Object j(Object obj, int i, tz5 tz5Var, Object obj2, ewc ewcVar) {
        return obj2;
    }
}
