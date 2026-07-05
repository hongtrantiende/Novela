package org.mozilla.javascript.optimizer;

import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class DoubleLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object add(Object obj, Object obj2, Context context) {
        return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
    }

    private static Object addInt(Object obj, Object obj2, Context context) {
        return Double.valueOf(((Double) obj).doubleValue() + ((Integer) obj2).intValue());
    }

    private static boolean compareGE(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() >= ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareGEInt(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() >= ((Integer) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareGT(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() > ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareGTInt(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() > ((Integer) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLE(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() <= ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLEInt(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() <= ((Integer) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLT(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() < ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean compareLTInt(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() < ((Integer) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean eq(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() == ((Double) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean eqInt(Object obj, Object obj2) {
        if (((Double) obj).doubleValue() == ((Integer) obj2).doubleValue()) {
            return true;
        }
        return false;
    }

    private static boolean testAdd(Object obj, Object obj2, Context context) {
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return true;
        }
        return false;
    }

    private static boolean testAddInt(Object obj, Object obj2, Context context) {
        if ((obj instanceof Double) && (obj2 instanceof Integer)) {
            return true;
        }
        return false;
    }

    private static boolean testTwo(Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return true;
        }
        return false;
    }

    private static boolean testTwoInt(Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Integer)) {
            return true;
        }
        return false;
    }

    private static boolean toBoolean(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(doubleValue) || doubleValue == 0.0d) {
            return false;
        }
        return true;
    }

    private static int toInt32(Object obj) {
        return ScriptRuntime.toInt32(((Double) obj).doubleValue());
    }

    private static double toNumber(Object obj) {
        return ((Double) obj).doubleValue();
    }

    private static Number toNumeric(Object obj) {
        return (Double) obj;
    }

    private static long toUint32(Object obj) {
        return ScriptRuntime.toUint32(((Double) obj).doubleValue());
    }

    public boolean canLinkType(Class<?> cls) {
        return Double.class.equals(cls);
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
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.DoubleLinker.getGuardedInvocation(jdk.dynalink.linker.LinkRequest, jdk.dynalink.linker.LinkerServices):jdk.dynalink.linker.GuardedInvocation");
    }
}
