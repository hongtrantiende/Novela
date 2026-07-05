package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n78  reason: default package */
/* loaded from: classes.dex */
public final class n78 extends mud implements yj5 {
    public final Object b;

    public n78(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [yj5, ftd] */
    public static yj5 T(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof yj5) {
            return (yj5) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object U(yj5 yj5Var) {
        if (yj5Var instanceof n78) {
            return ((n78) yj5Var).b;
        }
        IBinder asBinder = yj5Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            am8.s(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            vs.m("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        vs.m(nk2.s(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        return null;
    }
}
