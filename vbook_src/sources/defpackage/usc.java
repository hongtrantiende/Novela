package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: usc  reason: default package */
/* loaded from: classes.dex */
public final class usc extends tsc {
    @Override // defpackage.tsc
    public final Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.p.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            fb4.l(e);
            return null;
        }
    }

    @Override // defpackage.tsc
    public final Method Q(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
