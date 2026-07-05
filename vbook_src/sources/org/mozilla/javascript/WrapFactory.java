package org.mozilla.javascript;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class WrapFactory {
    private boolean javaPrimitiveWrap = true;

    public final boolean isJavaPrimitiveWrap() {
        return this.javaPrimitiveWrap;
    }

    public final void setJavaPrimitiveWrap(boolean z) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.isSealed()) {
            Context.onSealedMutation();
        }
        this.javaPrimitiveWrap = z;
    }

    public Object wrap(Context context, Scriptable scriptable, Object obj, Class<?> cls) {
        Object obj2;
        if (obj != null && obj != (obj2 = Undefined.instance)) {
            if (obj instanceof Scriptable) {
                return obj;
            }
            if (cls != null && cls.isPrimitive()) {
                if (cls == Void.TYPE) {
                    return obj2;
                }
                if (cls == Character.TYPE) {
                    return Integer.valueOf(((Character) obj).charValue());
                }
                return obj;
            }
            if (!isJavaPrimitiveWrap()) {
                if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
                    if (obj instanceof BigInteger) {
                        return obj;
                    }
                    if (obj instanceof Character) {
                        return String.valueOf(((Character) obj).charValue());
                    }
                } else {
                    return obj;
                }
            }
            if (obj.getClass().isArray()) {
                return NativeJavaArray.wrap(scriptable, obj);
            }
            return wrapAsJavaObject(context, scriptable, obj, cls);
        }
        return obj;
    }

    public Scriptable wrapAsJavaObject(Context context, Scriptable scriptable, Object obj, Class<?> cls) {
        if (List.class.isAssignableFrom(obj.getClass())) {
            return new NativeJavaList(scriptable, obj);
        }
        if (Map.class.isAssignableFrom(obj.getClass())) {
            return new NativeJavaMap(scriptable, obj);
        }
        return new NativeJavaObject(scriptable, obj, cls);
    }

    public Scriptable wrapJavaClass(Context context, Scriptable scriptable, Class<?> cls) {
        return new NativeJavaClass(scriptable, cls);
    }

    public Scriptable wrapNewObject(Context context, Scriptable scriptable, Object obj) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        if (obj.getClass().isArray()) {
            return NativeJavaArray.wrap(scriptable, obj);
        }
        return wrapAsJavaObject(context, scriptable, obj, null);
    }
}
