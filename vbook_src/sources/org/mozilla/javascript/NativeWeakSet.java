package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeWeakSet extends IdScriptableObject {
    private static final int Id_add = 2;
    private static final int Id_constructor = 1;
    private static final int Id_delete = 3;
    private static final int Id_has = 4;
    private static final Object MAP_TAG = "WeakSet";
    private static final int MAX_PROTOTYPE_ID = 5;
    private static final int SymbolId_toStringTag = 5;
    private static final long serialVersionUID = 2065753364224029534L;
    private boolean instanceOfWeakSet = false;
    private transient WeakHashMap<Scriptable, Boolean> map = new WeakHashMap<>();

    public static void init(Scriptable scriptable, boolean z) {
        new NativeWeakSet().exportAsJSClass(5, scriptable, z);
    }

    private Object js_add(Object obj) {
        if (ScriptRuntime.isObject(obj)) {
            this.map.put((Scriptable) obj, Boolean.TRUE);
            return this;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
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

    private Object js_has(Object obj) {
        if (!ScriptRuntime.isObject(obj)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.map.containsKey(obj));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.map = new WeakHashMap<>();
    }

    private static NativeWeakSet realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        NativeWeakSet nativeWeakSet = (NativeWeakSet) IdScriptableObject.ensureType(scriptable, NativeWeakSet.class, idFunctionObject);
        if (nativeWeakSet.instanceOfWeakSet) {
            return nativeWeakSet;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(MAP_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId != 1) {
            if (methodId != 2) {
                if (methodId != 3) {
                    if (methodId == 4) {
                        return realThis(scriptable2, idFunctionObject).js_has(NativeMap.key(objArr));
                    }
                    vs.m(s21.m("WeakMap.prototype has no method: ", idFunctionObject.getFunctionName()));
                    return null;
                }
                return realThis(scriptable2, idFunctionObject).js_delete(NativeMap.key(objArr));
            }
            return realThis(scriptable2, idFunctionObject).js_add(NativeMap.key(objArr));
        } else if (scriptable2 == null) {
            NativeWeakSet nativeWeakSet = new NativeWeakSet();
            nativeWeakSet.instanceOfWeakSet = true;
            if (objArr.length > 0) {
                NativeSet.loadFromIterable(context, scriptable, nativeWeakSet, NativeMap.key(objArr));
            }
            return nativeWeakSet;
        } else {
            throw ScriptRuntime.typeErrorById("msg.no.new", "WeakSet");
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
            case 96417:
                if (str.equals("add")) {
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
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "WeakSet";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        if (i == 5) {
            initPrototypeValue(5, SymbolKey.TO_STRING_TAG, getClassName(), 3);
            return;
        }
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "has";
                    } else {
                        vs.m(String.valueOf(i));
                        return;
                    }
                } else {
                    str = "delete";
                }
            } else {
                str = "add";
            }
        } else {
            i2 = 0;
            str = "constructor";
        }
        initPrototypeMethod(MAP_TAG, i, str, (String) null, i2);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.TO_STRING_TAG.equals(symbol) ? 5 : 0;
    }
}
