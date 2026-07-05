package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeWeakMap extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_delete = 2;
    private static final int Id_get = 3;
    private static final int Id_has = 4;
    private static final int Id_set = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    private static final int SymbolId_toStringTag = 6;
    private static final long serialVersionUID = 8670434366883930453L;
    private boolean instanceOfWeakMap = false;
    private transient WeakHashMap<Scriptable, Object> map = new WeakHashMap<>();
    private static final Object MAP_TAG = "WeakMap";
    private static final Object NULL_VALUE = new Object();

    public static void init(Scriptable scriptable, boolean z) {
        new NativeWeakMap().exportAsJSClass(6, scriptable, z);
    }

    private Object js_delete(Object obj) {
        boolean z;
        if (!ScriptRuntime.isObject(obj)) {
            return Boolean.FALSE;
        }
        if (this.map.remove(obj) != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private Object js_get(Object obj) {
        if (!ScriptRuntime.isObject(obj)) {
            return Undefined.instance;
        }
        Object obj2 = this.map.get(obj);
        if (obj2 == null) {
            return Undefined.instance;
        }
        if (obj2 == NULL_VALUE) {
            return null;
        }
        return obj2;
    }

    private Object js_has(Object obj) {
        if (!ScriptRuntime.isObject(obj)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.map.containsKey(obj));
    }

    private Object js_set(Object obj, Object obj2) {
        if (ScriptRuntime.isObject(obj)) {
            if (obj2 == null) {
                obj2 = NULL_VALUE;
            }
            this.map.put((Scriptable) obj, obj2);
            return this;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.map = new WeakHashMap<>();
    }

    private static NativeWeakMap realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        NativeWeakMap nativeWeakMap = (NativeWeakMap) IdScriptableObject.ensureType(scriptable, NativeWeakMap.class, idFunctionObject);
        if (nativeWeakMap.instanceOfWeakMap) {
            return nativeWeakMap;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        if (!idFunctionObject.hasTag(MAP_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId != 1) {
            if (methodId != 2) {
                if (methodId != 3) {
                    if (methodId != 4) {
                        if (methodId == 5) {
                            NativeWeakMap realThis = realThis(scriptable2, idFunctionObject);
                            Object key = NativeMap.key(objArr);
                            if (objArr.length > 1) {
                                obj = objArr[1];
                            } else {
                                obj = Undefined.instance;
                            }
                            return realThis.js_set(key, obj);
                        }
                        vs.m(s21.m("WeakMap.prototype has no method: ", idFunctionObject.getFunctionName()));
                        return null;
                    }
                    return realThis(scriptable2, idFunctionObject).js_has(NativeMap.key(objArr));
                }
                return realThis(scriptable2, idFunctionObject).js_get(NativeMap.key(objArr));
            }
            return realThis(scriptable2, idFunctionObject).js_delete(NativeMap.key(objArr));
        } else if (scriptable2 == null) {
            NativeWeakMap nativeWeakMap = new NativeWeakMap();
            nativeWeakMap.instanceOfWeakMap = true;
            if (objArr.length > 0) {
                NativeMap.loadFromIterable(context, scriptable, nativeWeakMap, NativeMap.key(objArr));
            }
            return nativeWeakMap;
        } else {
            throw ScriptRuntime.typeErrorById("msg.no.new", "WeakMap");
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 0;
                    break;
                }
                break;
            case -1335458389:
                if (str.equals("delete")) {
                    c = 1;
                    break;
                }
                break;
            case 102230:
                if (str.equals("get")) {
                    c = 2;
                    break;
                }
                break;
            case 103066:
                if (str.equals("has")) {
                    c = 3;
                    break;
                }
                break;
            case 113762:
                if (str.equals("set")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "WeakMap";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        int i2;
        if (i == 6) {
            initPrototypeValue(6, SymbolKey.TO_STRING_TAG, getClassName(), 3);
            return;
        }
        int i3 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str2 = "set";
                            i2 = 2;
                            initPrototypeMethod(MAP_TAG, i, str2, (String) null, i2);
                        }
                        vs.m(String.valueOf(i));
                        return;
                    }
                    str = "has";
                } else {
                    str = "get";
                }
            } else {
                str = "delete";
            }
        } else {
            i3 = 0;
            str = "constructor";
        }
        str2 = str;
        i2 = i3;
        initPrototypeMethod(MAP_TAG, i, str2, (String) null, i2);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.TO_STRING_TAG.equals(symbol) ? 6 : 0;
    }
}
