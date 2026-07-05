package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wy9  reason: default package */
/* loaded from: classes.dex */
public abstract class wy9 {
    public static final List a = tl1.B(Application.class, ky9.class);
    public static final List b = tl1.A(ky9.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List D0 = b00.D0(parameterTypes);
            if (list.equals(D0)) {
                return constructor;
            }
            if (list.size() == D0.size() && D0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final gdd b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (gdd) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            cp8.o("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            cp8.p("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
