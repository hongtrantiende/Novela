package org.mozilla.javascript.optimizer;

import java.util.Objects;
import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class IntegerLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object add(Object obj, Object obj2, Context context) {
        return ScriptRuntime.add((Integer) obj, (Integer) obj2);
    }

    private static Object addDouble(Object obj, Object obj2, Context context) {
        return Double.valueOf(((Double) obj2).doubleValue() + ((Integer) obj).doubleValue());
    }

    private static boolean compareGE(Object obj, Object obj2) {
        if (((Integer) obj).intValue() >= ((Integer) obj2).intValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareGEDouble(Object obj, Object obj2) {
        if (((Integer) obj).doubleValue() >= ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareGT(Object obj, Object obj2) {
        if (((Integer) obj).intValue() > ((Integer) obj2).intValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareGTDouble(Object obj, Object obj2) {
        if (((Integer) obj).doubleValue() > ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLE(Object obj, Object obj2) {
        if (((Integer) obj).intValue() <= ((Integer) obj2).intValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLEDouble(Object obj, Object obj2) {
        if (((Integer) obj).doubleValue() <= ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLT(Object obj, Object obj2) {
        if (((Integer) obj).intValue() < ((Integer) obj2).intValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLTDouble(Object obj, Object obj2) {
        if (((Integer) obj).doubleValue() < ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean eq(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private static boolean eqDouble(Object obj, Object obj2) {
        if (((Integer) obj).doubleValue() == ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean testAdd(Object obj, Object obj2, Context context) {
        if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
            return true;
        }
        return false;
    }

    private static boolean testAddDouble(Object obj, Object obj2, Context context) {
        if ((obj instanceof Integer) && (obj2 instanceof Double)) {
            return true;
        }
        return false;
    }

    private static boolean testTwo(Object obj, Object obj2) {
        if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
            return true;
        }
        return false;
    }

    private static boolean testTwoDouble(Object obj, Object obj2) {
        if ((obj instanceof Integer) && (obj2 instanceof Double)) {
            return true;
        }
        return false;
    }

    private static boolean toBoolean(Object obj) {
        if (((Integer) obj).intValue() != 0) {
            return true;
        }
        return false;
    }

    private static int toInt32(Object obj) {
        return ((Integer) obj).intValue();
    }

    private static double toNumber(Object obj) {
        return ((Integer) obj).doubleValue();
    }

    private static Number toNumeric(Object obj) {
        return (Number) obj;
    }

    private static long toUint32(Object obj) {
        return ((Integer) obj).intValue() & 4294967295L;
    }

    public boolean canLinkType(Class<?> cls) {
        return Integer.class.equals(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jdk.dynalink.linker.GuardedInvocation getGuardedInvocation(jdk.dynalink.linker.LinkRequest r10, jdk.dynalink.linker.LinkerServices r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.IntegerLinker.getGuardedInvocation(jdk.dynalink.linker.LinkRequest, jdk.dynalink.linker.LinkerServices):jdk.dynalink.linker.GuardedInvocation");
    }
}
