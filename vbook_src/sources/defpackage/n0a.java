package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n0a  reason: default package */
/* loaded from: classes.dex */
public abstract class n0a {
    public static final Class a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;

    /* JADX WARN: Type inference failed for: r0v6, types: [dwc, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = b(false);
        c = b(true);
        d = new Object();
    }

    public static dwc b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (dwc) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static void c(dwc dwcVar, Object obj, Object obj2) {
        dwcVar.getClass();
        pw4 pw4Var = (pw4) obj;
        awc awcVar = pw4Var.c;
        awc awcVar2 = ((pw4) obj2).c;
        awc awcVar3 = awc.e;
        if (!awcVar3.equals(awcVar2)) {
            if (awcVar3.equals(awcVar)) {
                int i = awcVar.a + awcVar2.a;
                int[] copyOf = Arrays.copyOf(awcVar.b, i);
                System.arraycopy(awcVar2.b, 0, copyOf, awcVar.a, awcVar2.a);
                Object[] copyOf2 = Arrays.copyOf(awcVar.c, i);
                System.arraycopy(awcVar2.c, 0, copyOf2, awcVar.a, awcVar2.a);
                awcVar = new awc(i, copyOf, copyOf2, true);
            } else {
                awcVar.getClass();
                if (!awcVar2.equals(awcVar3)) {
                    if (awcVar.d) {
                        int i2 = awcVar.a + awcVar2.a;
                        awcVar.a(i2);
                        System.arraycopy(awcVar2.b, 0, awcVar.b, awcVar.a, awcVar2.a);
                        System.arraycopy(awcVar2.c, 0, awcVar.c, awcVar.a, awcVar2.a);
                        awcVar.a = i2;
                    } else {
                        cp8.q();
                        return;
                    }
                }
            }
        }
        pw4Var.c = awcVar;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static Object a(Object obj, int i, List list, Object obj2, dwc dwcVar) {
        return obj2;
    }
}
