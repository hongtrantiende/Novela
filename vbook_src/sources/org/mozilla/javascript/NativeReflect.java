package org.mozilla.javascript;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeReflect extends ScriptableObject {
    private static final String REFLECT_TAG = "Reflect";
    private static final long serialVersionUID = 2920773905356325445L;

    private NativeReflect() {
    }

    public static Object apply(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr.length >= 3) {
            Scriptable ensureScriptable = ScriptableObject.ensureScriptable(objArr[0]);
            Object obj = objArr[1];
            if (obj instanceof Scriptable) {
                scriptable2 = (Scriptable) obj;
            } else if (ScriptRuntime.isPrimitive(obj)) {
                scriptable2 = context.newObject(scriptable, "Object", new Object[]{objArr[1]});
            }
            if (!ScriptRuntime.isSymbol(objArr[2])) {
                return ScriptRuntime.applyOrCall(true, context, scriptable, ensureScriptable, new Object[]{scriptable2, ScriptableObject.ensureScriptableObject(objArr[2])});
            }
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(objArr[2]));
        }
        throw ScriptRuntime.typeErrorById("msg.method.missing.parameter", "Reflect.apply", "3", Integer.toString(objArr.length));
    }

    private static ScriptableObject checkTarget(Object[] objArr) {
        Object obj;
        Object obj2;
        if (objArr.length != 0 && (obj2 = objArr[0]) != null && obj2 != Undefined.instance) {
            if (!ScriptRuntime.isSymbol(obj2)) {
                return ScriptableObject.ensureScriptableObject(objArr[0]);
            }
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(objArr[0]));
        }
        if (objArr.length == 0) {
            obj = Undefined.instance;
        } else {
            obj = objArr[0];
        }
        throw ScriptRuntime.typeErrorById("msg.no.properties", ScriptRuntime.toString(obj));
    }

    public static Scriptable construct(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        BaseFunction baseFunction;
        Scriptable createObject;
        Object obj;
        if (objArr.length >= 1) {
            if (AbstractEcmaObjectOperations.isConstructor(context, objArr[0])) {
                Constructable constructable = (Constructable) objArr[0];
                if (objArr.length < 2) {
                    return constructable.construct(context, scriptable, ScriptRuntime.emptyArgs);
                }
                if (objArr.length > 2 && !AbstractEcmaObjectOperations.isConstructor(context, objArr[2])) {
                    throw ScriptRuntime.typeErrorById("msg.not.ctor", ScriptRuntime.typeof(objArr[2]));
                }
                Object[] applyArguments = ScriptRuntime.getApplyArguments(context, objArr[1]);
                Scriptable scriptable3 = null;
                if (objArr.length > 2) {
                    Scriptable ensureScriptable = ScriptableObject.ensureScriptable(objArr[2]);
                    if (ensureScriptable instanceof BaseFunction) {
                        obj = ((BaseFunction) ensureScriptable).getPrototypeProperty();
                    } else {
                        obj = ensureScriptable.get("prototype", ensureScriptable);
                    }
                    if ((obj instanceof Scriptable) && !ScriptRuntime.isSymbol(obj) && !Undefined.isUndefined(obj)) {
                        scriptable3 = obj;
                    }
                }
                if ((constructable instanceof BaseFunction) && scriptable3 != null && (createObject = (baseFunction = (BaseFunction) constructable).createObject(context, scriptable)) != null) {
                    createObject.setPrototype(scriptable3);
                    Object call = baseFunction.call(context, scriptable, createObject, applyArguments);
                    if (call instanceof Scriptable) {
                        return (Scriptable) call;
                    }
                    return createObject;
                }
                Scriptable construct = constructable.construct(context, scriptable, applyArguments);
                if (scriptable3 != null) {
                    construct.setPrototype(scriptable3);
                }
                return construct;
            }
            throw ScriptRuntime.typeErrorById("msg.not.ctor", ScriptRuntime.typeof(objArr[0]));
        }
        throw ScriptRuntime.typeErrorById("msg.method.missing.parameter", "Reflect.construct", "3", Integer.toString(objArr.length));
    }

    public static Object defineProperty(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr.length >= 3) {
            try {
                return Boolean.valueOf(checkTarget(objArr).defineOwnProperty(context, objArr[1], ScriptableObject.ensureScriptableObject(objArr[2])));
            } catch (EcmaError unused) {
                return Boolean.FALSE;
            }
        }
        throw ScriptRuntime.typeErrorById("msg.method.missing.parameter", "Reflect.defineProperty", "3", Integer.toString(objArr.length));
    }

    public static Object deleteProperty(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptableObject checkTarget = checkTarget(objArr);
        if (objArr.length > 1) {
            if (ScriptRuntime.isSymbol(objArr[1])) {
                return Boolean.valueOf(ScriptableObject.deleteProperty(checkTarget, (Symbol) objArr[1]));
            }
            return Boolean.valueOf(ScriptableObject.deleteProperty(checkTarget, ScriptRuntime.toString(objArr[1])));
        }
        return Boolean.FALSE;
    }

    public static Object get(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptableObject checkTarget = checkTarget(objArr);
        if (objArr.length > 1) {
            if (ScriptRuntime.isSymbol(objArr[1])) {
                Object property = ScriptableObject.getProperty(checkTarget, (Symbol) objArr[1]);
                if (property == Scriptable.NOT_FOUND) {
                    return Undefined.SCRIPTABLE_UNDEFINED;
                }
                return property;
            }
            Object obj = objArr[1];
            if (obj instanceof Number) {
                Object property2 = ScriptableObject.getProperty(checkTarget, ScriptRuntime.toIndex(obj));
                if (property2 == Scriptable.NOT_FOUND) {
                    return Undefined.SCRIPTABLE_UNDEFINED;
                }
                return property2;
            }
            Object property3 = ScriptableObject.getProperty(checkTarget, ScriptRuntime.toString(obj));
            if (property3 == Scriptable.NOT_FOUND) {
                return Undefined.SCRIPTABLE_UNDEFINED;
            }
            return property3;
        }
        return Undefined.SCRIPTABLE_UNDEFINED;
    }

    public static Scriptable getOwnPropertyDescriptor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptableObject checkTarget = checkTarget(objArr);
        if (objArr.length > 1) {
            if (ScriptRuntime.isSymbol(objArr[1])) {
                ScriptableObject ownPropertyDescriptor = checkTarget.getOwnPropertyDescriptor(context, objArr[1]);
                if (ownPropertyDescriptor == null) {
                    return Undefined.SCRIPTABLE_UNDEFINED;
                }
                return ownPropertyDescriptor;
            }
            ScriptableObject ownPropertyDescriptor2 = checkTarget.getOwnPropertyDescriptor(context, ScriptRuntime.toString(objArr[1]));
            if (ownPropertyDescriptor2 == null) {
                return Undefined.SCRIPTABLE_UNDEFINED;
            }
            return ownPropertyDescriptor2;
        }
        return Undefined.SCRIPTABLE_UNDEFINED;
    }

    public static Scriptable getPrototypeOf(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return checkTarget(objArr).getPrototype();
    }

    public static Object has(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptableObject checkTarget = checkTarget(objArr);
        if (objArr.length > 1) {
            if (ScriptRuntime.isSymbol(objArr[1])) {
                return Boolean.valueOf(ScriptableObject.hasProperty(checkTarget, (Symbol) objArr[1]));
            }
            return Boolean.valueOf(ScriptableObject.hasProperty(checkTarget, ScriptRuntime.toString(objArr[1])));
        }
        return Boolean.FALSE;
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        NativeReflect nativeReflect = new NativeReflect();
        nativeReflect.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeReflect.setParentScope(scriptable);
        nativeReflect.defineProperty(scriptable, "apply", 3, new j(6), 2, 3);
        nativeReflect.defineProperty(scriptable, "construct", 2, new j(13), 2, 3);
        nativeReflect.defineProperty(scriptable, "defineProperty", 3, new j(14), 2, 3);
        nativeReflect.defineProperty(scriptable, "deleteProperty", 2, new j(15), 2, 3);
        nativeReflect.defineProperty(scriptable, "get", 2, new j(16), 2, 3);
        nativeReflect.defineProperty(scriptable, "getOwnPropertyDescriptor", 2, new j(17), 2, 3);
        nativeReflect.defineProperty(scriptable, "getPrototypeOf", 1, new j(18), 2, 3);
        nativeReflect.defineProperty(scriptable, "has", 2, new j(7), 2, 3);
        nativeReflect.defineProperty(scriptable, "isExtensible", 1, new j(8), 2, 3);
        nativeReflect.defineProperty(scriptable, "ownKeys", 1, new j(9), 2, 3);
        nativeReflect.defineProperty(scriptable, "preventExtensions", 1, new j(10), 2, 3);
        nativeReflect.defineProperty(scriptable, "set", 3, new j(11), 2, 3);
        nativeReflect.defineProperty(scriptable, "setPrototypeOf", 2, new j(12), 2, 3);
        nativeReflect.defineProperty(SymbolKey.TO_STRING_TAG, REFLECT_TAG, 3);
        ScriptableObject.defineProperty(scriptable, REFLECT_TAG, nativeReflect, 2);
        if (z) {
            nativeReflect.sealObject();
        }
    }

    public static Object isExtensible(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return Boolean.valueOf(checkTarget(objArr).isExtensible());
    }

    public static Scriptable ownKeys(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object[] ids;
        ScriptableObject checkTarget = checkTarget(objArr);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : checkTarget.getIds(true, true)) {
            if (obj instanceof Symbol) {
                arrayList2.add(obj);
            } else {
                arrayList.add(ScriptRuntime.toString(obj));
            }
        }
        Object[] objArr2 = new Object[arrayList2.size() + arrayList.size()];
        System.arraycopy(arrayList.toArray(), 0, objArr2, 0, arrayList.size());
        System.arraycopy(arrayList2.toArray(), 0, objArr2, arrayList.size(), arrayList2.size());
        return context.newArray(scriptable, objArr2);
    }

    public static Object preventExtensions(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return Boolean.valueOf(checkTarget(objArr).preventExtensions());
    }

    public static Object set(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptableObject scriptableObject;
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject checkTarget = checkTarget(objArr);
        if (objArr.length < 2) {
            return Boolean.TRUE;
        }
        if (objArr.length > 3) {
            scriptableObject = ScriptableObject.ensureScriptableObject(objArr[3]);
        } else {
            scriptableObject = checkTarget;
        }
        if (scriptableObject != checkTarget && (ownPropertyDescriptor = checkTarget.getOwnPropertyDescriptor(context, objArr[1])) != null) {
            Object obj = ownPropertyDescriptor.get("set");
            if (obj != null && obj != Scriptable.NOT_FOUND) {
                ((Function) obj).call(context, scriptable, scriptableObject, new Object[]{objArr[2]});
                return Boolean.TRUE;
            }
            Boolean bool = Boolean.FALSE;
            if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                return bool;
            }
        }
        if (ScriptRuntime.isSymbol(objArr[1])) {
            scriptableObject.put((Symbol) objArr[1], scriptableObject, objArr[2]);
        } else {
            Object obj2 = objArr[1];
            if (obj2 instanceof Double) {
                scriptableObject.put(ScriptRuntime.toIndex(obj2), scriptableObject, objArr[2]);
            } else {
                scriptableObject.put(ScriptRuntime.toString(obj2), scriptableObject, objArr[2]);
            }
        }
        return Boolean.TRUE;
    }

    public static Object setPrototypeOf(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr.length >= 2) {
            ScriptableObject checkTarget = checkTarget(objArr);
            if (checkTarget.getPrototype() == objArr[1]) {
                return Boolean.TRUE;
            }
            if (!checkTarget.isExtensible()) {
                return Boolean.FALSE;
            }
            Object obj = objArr[1];
            if (obj == null) {
                checkTarget.setPrototype(null);
                return Boolean.TRUE;
            } else if (!ScriptRuntime.isSymbol(obj)) {
                ScriptableObject ensureScriptableObject = ScriptableObject.ensureScriptableObject(objArr[1]);
                if (checkTarget.getPrototype() == ensureScriptableObject) {
                    return Boolean.TRUE;
                }
                for (Scriptable scriptable3 = ensureScriptableObject; scriptable3 != null; scriptable3 = scriptable3.getPrototype()) {
                    if (checkTarget == scriptable3) {
                        return Boolean.FALSE;
                    }
                }
                checkTarget.setPrototype(ensureScriptableObject);
                return Boolean.TRUE;
            } else {
                throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(objArr[0]));
            }
        }
        throw ScriptRuntime.typeErrorById("msg.method.missing.parameter", "Reflect.js_setPrototypeOf", "2", Integer.toString(objArr.length));
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return REFLECT_TAG;
    }
}
