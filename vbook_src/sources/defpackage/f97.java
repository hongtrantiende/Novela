package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f97  reason: default package */
/* loaded from: classes.dex */
public abstract class f97 {
    public static volatile boolean a = true;

    public static final boolean a(Member member) {
        AccessibleObject accessibleObject;
        Object gs9Var;
        boolean booleanValue;
        if (member instanceof AccessibleObject) {
            accessibleObject = (AccessibleObject) member;
        } else {
            accessibleObject = null;
        }
        if (accessibleObject == null) {
            return false;
        }
        if (!a) {
            booleanValue = b(accessibleObject);
        } else {
            try {
                gs9Var = Boolean.valueOf(accessibleObject.trySetAccessible());
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            if (hs9.a(gs9Var) != null) {
                a = false;
                gs9Var = Boolean.valueOf(b(accessibleObject));
            }
            booleanValue = ((Boolean) gs9Var).booleanValue();
        }
        if (!booleanValue) {
            return false;
        }
        return true;
    }

    public static final boolean b(AccessibleObject accessibleObject) {
        Object gs9Var;
        try {
            if (!accessibleObject.isAccessible()) {
                accessibleObject.setAccessible(true);
            }
            gs9Var = Boolean.TRUE;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        if (gs9Var instanceof gs9) {
            gs9Var = obj;
        }
        return ((Boolean) gs9Var).booleanValue();
    }
}
