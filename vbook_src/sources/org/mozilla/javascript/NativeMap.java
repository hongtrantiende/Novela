package org.mozilla.javascript;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Hashtable;
import org.mozilla.javascript.NativeCollectionIterator;
import org.mozilla.javascript.NativeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeMap extends IdScriptableObject {
    private static final int ConstructorId_groupBy = -1;
    static final String ITERATOR_TAG = "Map Iterator";
    private static final int Id_clear = 6;
    private static final int Id_constructor = 1;
    private static final int Id_delete = 4;
    private static final int Id_entries = 9;
    private static final int Id_forEach = 10;
    private static final int Id_get = 3;
    private static final int Id_has = 5;
    private static final int Id_keys = 7;
    private static final int Id_set = 2;
    private static final int Id_values = 8;
    private static final Object MAP_TAG = "Map";
    private static final int MAX_PROTOTYPE_ID = 12;
    private static final int SymbolId_getSize = 11;
    private static final int SymbolId_toStringTag = 12;
    private static final long serialVersionUID = 1171922614280016891L;
    private final Hashtable entries = new Hashtable();
    private boolean instanceOfMap = false;

    public static void init(Context context, Scriptable scriptable, boolean z) {
        NativeMap nativeMap = new NativeMap();
        IdFunctionObject exportAsJSClass = nativeMap.exportAsJSClass(12, scriptable, false);
        ScriptableObject scriptableObject = (ScriptableObject) context.newObject(scriptable);
        scriptableObject.put("enumerable", scriptableObject, Boolean.FALSE);
        scriptableObject.put("configurable", scriptableObject, Boolean.TRUE);
        scriptableObject.put("get", scriptableObject, nativeMap.get(NativeSet.GETSIZE, nativeMap));
        nativeMap.defineOwnProperty(context, "size", scriptableObject);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, exportAsJSClass);
        if (z) {
            nativeMap.sealObject();
        }
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
                callable.call(context, scriptable, objectOrNull, new Object[]{next.value, next.key, this});
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.typeErrorById("msg.isnt.function", obj, ScriptRuntime.typeof(obj));
    }

    private Object js_get(Object obj) {
        Hashtable.Entry entry = this.entries.getEntry(obj);
        if (entry == null) {
            return Undefined.instance;
        }
        return entry.value;
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

    private Object js_set(Object obj, Object obj2) {
        if ((obj instanceof Number) && ((Number) obj).doubleValue() == ScriptRuntime.negativeZero) {
            obj = ScriptRuntime.zeroObj;
        }
        this.entries.put(obj, obj2);
        return this;
    }

    public static Object key(Object[] objArr) {
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof Delegator) {
                return ((Delegator) obj).getDelegee();
            }
            return obj;
        }
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadFromIterable$0(Callable callable, Context context, Scriptable scriptable, ScriptableObject scriptableObject, Object obj, Object obj2) {
        callable.call(context, scriptable, scriptableObject, new Object[]{obj, obj2});
    }

    public static void loadFromIterable(final Context context, final Scriptable scriptable, final ScriptableObject scriptableObject, Object obj) {
        if (obj != null) {
            Object obj2 = Undefined.instance;
            if (!obj2.equals(obj) && !obj2.equals(ScriptRuntime.callIterator(obj, context, scriptable))) {
                final Callable propFunctionAndThis = ScriptRuntime.getPropFunctionAndThis(ScriptableObject.getClassPrototype(scriptable, scriptableObject.getClassName()), "set", context, scriptable);
                ScriptRuntime.lastStoredScriptable(context);
                ScriptRuntime.loadFromIterable(context, scriptable, obj, new BiConsumer() { // from class: hy7
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj3, Object obj4) {
                        NativeMap.lambda$loadFromIterable$0(Callable.this, context, scriptable, scriptableObject, obj3, obj4);
                    }
                });
            }
        }
    }

    private static NativeMap realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        NativeMap nativeMap = (NativeMap) IdScriptableObject.ensureType(scriptable, NativeMap.class, idFunctionObject);
        if (nativeMap.instanceOfMap) {
            return nativeMap;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (!idFunctionObject.hasTag(MAP_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        switch (idFunctionObject.methodId()) {
            case -1:
                if (objArr.length < 1) {
                    obj = Undefined.instance;
                } else {
                    obj = objArr[0];
                }
                Object obj6 = obj;
                if (objArr.length < 2) {
                    obj2 = Undefined.instance;
                } else {
                    obj2 = objArr[1];
                }
                Map<Object, List<Object>> groupBy = AbstractEcmaObjectOperations.groupBy(context, scriptable, idFunctionObject, obj6, obj2, AbstractEcmaObjectOperations.KEY_COERCION.COLLECTION);
                NativeMap nativeMap = (NativeMap) context.newObject(scriptable, "Map");
                for (Map.Entry<Object, List<Object>> entry : groupBy.entrySet()) {
                    nativeMap.entries.put(entry.getKey(), context.newArray(scriptable, entry.getValue().toArray()));
                }
                return nativeMap;
            case 0:
            default:
                vs.m(s21.m("Map.prototype has no method: ", idFunctionObject.getFunctionName()));
                return null;
            case 1:
                if (scriptable2 == null) {
                    NativeMap nativeMap2 = new NativeMap();
                    nativeMap2.instanceOfMap = true;
                    if (objArr.length > 0) {
                        loadFromIterable(context, scriptable, nativeMap2, key(objArr));
                    }
                    return nativeMap2;
                }
                throw ScriptRuntime.typeErrorById("msg.no.new", "Map");
            case 2:
                NativeMap realThis = realThis(scriptable2, idFunctionObject);
                Object key = key(objArr);
                if (objArr.length > 1) {
                    obj3 = objArr[1];
                } else {
                    obj3 = Undefined.instance;
                }
                return realThis.js_set(key, obj3);
            case 3:
                return realThis(scriptable2, idFunctionObject).js_get(key(objArr));
            case 4:
                return realThis(scriptable2, idFunctionObject).js_delete(key(objArr));
            case 5:
                return realThis(scriptable2, idFunctionObject).js_has(key(objArr));
            case 6:
                return realThis(scriptable2, idFunctionObject).js_clear();
            case 7:
                return realThis(scriptable2, idFunctionObject).js_iterator(scriptable, NativeCollectionIterator.Type.KEYS);
            case 8:
                return realThis(scriptable2, idFunctionObject).js_iterator(scriptable, NativeCollectionIterator.Type.VALUES);
            case 9:
                return realThis(scriptable2, idFunctionObject).js_iterator(scriptable, NativeCollectionIterator.Type.BOTH);
            case 10:
                NativeMap realThis2 = realThis(scriptable2, idFunctionObject);
                if (objArr.length > 0) {
                    obj4 = objArr[0];
                } else {
                    obj4 = Undefined.instance;
                }
                if (objArr.length > 1) {
                    obj5 = objArr[1];
                } else {
                    obj5 = Undefined.instance;
                }
                return realThis2.js_forEach(context, scriptable, obj4, obj5);
            case 11:
                return realThis(scriptable2, idFunctionObject).js_getSize();
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        addIdFunctionProperty(idFunctionObject, MAP_TAG, -1, "groupBy", 2);
        super.fillConstructorProperties(idFunctionObject);
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
            case 102230:
                if (str.equals("get")) {
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
            case 113762:
                if (str.equals("set")) {
                    c = 7;
                    break;
                }
                break;
            case 3288564:
                if (str.equals("keys")) {
                    c = '\b';
                    break;
                }
                break;
            case 94746189:
                if (str.equals("clear")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 10;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 2;
            case '\b':
                return 7;
            case '\t':
                return 6;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Map";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        String str3;
        int i2;
        if (i != 11) {
            if (i != 12) {
                int i3 = 1;
                switch (i) {
                    case 1:
                        str = "constructor";
                        str3 = str;
                        i2 = 0;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 2:
                        i3 = 2;
                        str2 = "set";
                        i2 = i3;
                        str3 = str2;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 3:
                        str2 = "get";
                        i2 = i3;
                        str3 = str2;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 4:
                        str2 = "delete";
                        i2 = i3;
                        str3 = str2;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 5:
                        str2 = "has";
                        i2 = i3;
                        str3 = str2;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 6:
                        str = "clear";
                        str3 = str;
                        i2 = 0;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 7:
                        str = "keys";
                        str3 = str;
                        i2 = 0;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 8:
                        str = "values";
                        str3 = str;
                        i2 = 0;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 9:
                        str = "entries";
                        str3 = str;
                        i2 = 0;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    case 10:
                        str2 = "forEach";
                        i2 = i3;
                        str3 = str2;
                        initPrototypeMethod(MAP_TAG, i, str3, (String) null, i2);
                        return;
                    default:
                        vs.m(String.valueOf(i));
                        return;
                }
            }
            initPrototypeValue(12, SymbolKey.TO_STRING_TAG, getClassName(), 3);
            return;
        }
        initPrototypeMethod(MAP_TAG, i, NativeSet.GETSIZE, "get size", 0);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        if (NativeSet.GETSIZE.equals(symbol)) {
            return 11;
        }
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 9;
        }
        return SymbolKey.TO_STRING_TAG.equals(symbol) ? 12 : 0;
    }
}
