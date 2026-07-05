package org.mozilla.javascript;

import java.util.Iterator;
import org.mozilla.javascript.Hashtable;
import org.mozilla.javascript.NativeCollectionIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeSet extends IdScriptableObject {
    static final String ITERATOR_TAG = "Set Iterator";
    private static final int Id_add = 2;
    private static final int Id_clear = 5;
    private static final int Id_constructor = 1;
    private static final int Id_delete = 3;
    private static final int Id_entries = 7;
    private static final int Id_forEach = 8;
    private static final int Id_has = 4;
    private static final int Id_keys = 6;
    private static final int Id_values = 6;
    private static final int MAX_PROTOTYPE_ID = 10;
    private static final int SymbolId_getSize = 9;
    private static final int SymbolId_toStringTag = 10;
    private static final long serialVersionUID = -8442212766987072986L;
    private final Hashtable entries = new Hashtable();
    private boolean instanceOfSet = false;
    private static final Object SET_TAG = "Set";
    static final SymbolKey GETSIZE = new SymbolKey("[Symbol.getSize]");

    public static void init(Context context, Scriptable scriptable, boolean z) {
        NativeSet nativeSet = new NativeSet();
        IdFunctionObject exportAsJSClass = nativeSet.exportAsJSClass(10, scriptable, false);
        ScriptableObject scriptableObject = (ScriptableObject) context.newObject(scriptable);
        scriptableObject.put("enumerable", scriptableObject, Boolean.FALSE);
        scriptableObject.put("configurable", scriptableObject, Boolean.TRUE);
        scriptableObject.put("get", scriptableObject, nativeSet.get(GETSIZE, nativeSet));
        nativeSet.defineOwnProperty(context, "size", scriptableObject);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, exportAsJSClass);
        if (z) {
            nativeSet.sealObject();
        }
    }

    private Object js_add(Object obj) {
        if ((obj instanceof Number) && ((Number) obj).doubleValue() == ScriptRuntime.negativeZero) {
            obj = ScriptRuntime.zeroObj;
        }
        this.entries.put(obj, obj);
        return this;
    }

    private Object js_clear() {
        this.entries.clear();
        return Undefined.instance;
    }

    private Object js_delete(Object obj) {
        return Boolean.valueOf(this.entries.deleteEntry(obj));
    }

    private Object js_forEach(Context context, Scriptable scriptable, Object obj, Object obj2) {
        if (obj instanceof Callable) {
            Callable callable = (Callable) obj;
            boolean isStrictMode = context.isStrictMode();
            Iterator<Hashtable.Entry> it = this.entries.iterator();
            while (it.hasNext()) {
                Hashtable.Entry next = it.next();
                Scriptable objectOrNull = ScriptRuntime.toObjectOrNull(context, obj2, scriptable);
                if (objectOrNull == null && !isStrictMode) {
                    objectOrNull = scriptable;
                }
                if (objectOrNull == null) {
                    objectOrNull = Undefined.SCRIPTABLE_UNDEFINED;
                }
                Object obj3 = next.value;
                callable.call(context, scriptable, objectOrNull, new Object[]{obj3, obj3, this});
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.notFunctionError(obj);
    }

    private Object js_getSize() {
        return Integer.valueOf(this.entries.size());
    }

    private Object js_has(Object obj) {
        return Boolean.valueOf(this.entries.has(obj));
    }

    private Object js_iterator(Scriptable scriptable, NativeCollectionIterator.Type type) {
        return new NativeCollectionIterator(scriptable, ITERATOR_TAG, type, this.entries.iterator());
    }

    public static void loadFromIterable(Context context, Scriptable scriptable, ScriptableObject scriptableObject, Object obj) {
        if (obj != null) {
            Object obj2 = Undefined.instance;
            if (!obj2.equals(obj)) {
                Object callIterator = ScriptRuntime.callIterator(obj, context, scriptable);
                if (!obj2.equals(callIterator)) {
                    Callable propFunctionAndThis = ScriptRuntime.getPropFunctionAndThis(ScriptableObject.ensureScriptableObject(context.newObject(scriptable, scriptableObject.getClassName())).getPrototype(), "add", context, scriptable);
                    ScriptRuntime.lastStoredScriptable(context);
                    IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable(context, scriptable, callIterator);
                    try {
                        Iterator<Object> it = iteratorLikeIterable.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next == Scriptable.NOT_FOUND) {
                                next = Undefined.instance;
                            }
                            propFunctionAndThis.call(context, scriptable, scriptableObject, new Object[]{next});
                        }
                        iteratorLikeIterable.close();
                    } catch (Throwable th) {
                        try {
                            iteratorLikeIterable.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        }
    }

    private static NativeSet realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        NativeSet nativeSet = (NativeSet) IdScriptableObject.ensureType(scriptable, NativeSet.class, idFunctionObject);
        if (nativeSet.instanceOfSet) {
            return nativeSet;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        if (!idFunctionObject.hasTag(SET_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        switch (idFunctionObject.methodId()) {
            case 1:
                if (scriptable2 == null) {
                    NativeSet nativeSet = new NativeSet();
                    nativeSet.instanceOfSet = true;
                    if (objArr.length > 0) {
                        loadFromIterable(context, scriptable, nativeSet, NativeMap.key(objArr));
                    }
                    return nativeSet;
                }
                throw ScriptRuntime.typeErrorById("msg.no.new", "Set");
            case 2:
                return realThis(scriptable2, idFunctionObject).js_add(NativeMap.key(objArr));
            case 3:
                return realThis(scriptable2, idFunctionObject).js_delete(NativeMap.key(objArr));
            case 4:
                return realThis(scriptable2, idFunctionObject).js_has(NativeMap.key(objArr));
            case 5:
                return realThis(scriptable2, idFunctionObject).js_clear();
            case 6:
                return realThis(scriptable2, idFunctionObject).js_iterator(scriptable, NativeCollectionIterator.Type.VALUES);
            case 7:
                return realThis(scriptable2, idFunctionObject).js_iterator(scriptable, NativeCollectionIterator.Type.BOTH);
            case 8:
                NativeSet realThis = realThis(scriptable2, idFunctionObject);
                Object key = NativeMap.key(objArr);
                if (objArr.length > 1) {
                    obj = objArr[1];
                } else {
                    obj = Undefined.instance;
                }
                return realThis.js_forEach(context, scriptable, key, obj);
            case 9:
                return realThis(scriptable2, idFunctionObject).js_getSize();
            default:
                vs.m(s21.m("Set.prototype has no method: ", idFunctionObject.getFunctionName()));
                return null;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1591573360:
                if (str.equals("entries")) {
                    c = 0;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 1;
                    break;
                }
                break;
            case -1335458389:
                if (str.equals("delete")) {
                    c = 2;
                    break;
                }
                break;
            case -823812830:
                if (str.equals("values")) {
                    c = 3;
                    break;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 4;
                    break;
                }
                break;
            case 96417:
                if (str.equals("add")) {
                    c = 5;
                    break;
                }
                break;
            case 103066:
                if (str.equals("has")) {
                    c = 6;
                    break;
                }
                break;
            case 3288564:
                if (str.equals("keys")) {
                    c = 7;
                    break;
                }
                break;
            case 94746189:
                if (str.equals("clear")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 6;
            case 4:
                return 8;
            case 5:
                return 2;
            case 6:
                return 4;
            case 7:
                return 6;
            case '\b':
                return 5;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Set";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        int i2;
        String str3;
        if (i != 9) {
            if (i != 10) {
                switch (i) {
                    case 1:
                        str = "constructor";
                        i2 = 0;
                        str3 = str;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 2:
                        str2 = "add";
                        str3 = str2;
                        i2 = 1;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 3:
                        str2 = "delete";
                        str3 = str2;
                        i2 = 1;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 4:
                        str2 = "has";
                        str3 = str2;
                        i2 = 1;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 5:
                        str = "clear";
                        i2 = 0;
                        str3 = str;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 6:
                        str = "values";
                        i2 = 0;
                        str3 = str;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 7:
                        str = "entries";
                        i2 = 0;
                        str3 = str;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    case 8:
                        str2 = "forEach";
                        str3 = str2;
                        i2 = 1;
                        initPrototypeMethod(SET_TAG, i, str3, (String) null, i2);
                        return;
                    default:
                        vs.m(String.valueOf(i));
                        return;
                }
            }
            initPrototypeValue(10, SymbolKey.TO_STRING_TAG, getClassName(), 3);
            return;
        }
        initPrototypeMethod(SET_TAG, i, GETSIZE, "get size", 0);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        if (GETSIZE.equals(symbol)) {
            return 9;
        }
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 6;
        }
        return SymbolKey.TO_STRING_TAG.equals(symbol) ? 10 : 0;
    }
}
