package org.mozilla.javascript;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeIterator extends IdScriptableObject {
    public static final String ITERATOR_PROPERTY_NAME = "__iterator__";
    private static final Object ITERATOR_TAG = "Iterator";
    private static final int Id___iterator__ = 3;
    private static final int Id_constructor = 1;
    private static final int Id_next = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final String STOP_ITERATION = "StopIteration";
    private static final long serialVersionUID = -4136968203581667681L;
    private Object objectIterator;

    private NativeIterator(Object obj) {
        this.objectIterator = obj;
    }

    private static Iterator<?> getJavaIterator(Object obj) {
        Iterator<?> it = null;
        if (obj instanceof Wrapper) {
            Object unwrap = ((Wrapper) obj).unwrap();
            if (unwrap instanceof Iterator) {
                it = (Iterator) unwrap;
            }
            if (unwrap instanceof Iterable) {
                return ((Iterable) unwrap).iterator();
            }
        }
        return it;
    }

    public static Object getStopIterationObject(Scriptable scriptable) {
        return ScriptableObject.getTopScopeValue(ScriptableObject.getTopLevelScope(scriptable), ITERATOR_TAG);
    }

    public static void init(Context context, ScriptableObject scriptableObject, boolean z) {
        new NativeIterator().exportAsJSClass(3, scriptableObject, z);
        if (context.getLanguageVersion() >= 200) {
            ES6Generator.init(scriptableObject, z);
        } else {
            NativeGenerator.init(scriptableObject, z);
        }
        StopIteration stopIteration = new StopIteration();
        stopIteration.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        stopIteration.setParentScope(scriptableObject);
        if (z) {
            stopIteration.sealObject();
        }
        ScriptableObject.defineProperty(scriptableObject, STOP_ITERATION, stopIteration, 2);
        scriptableObject.associateValue(ITERATOR_TAG, stopIteration);
    }

    private static Object jsConstructor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object obj2;
        int i;
        boolean z = false;
        if (objArr.length != 0 && (obj2 = objArr[0]) != null && obj2 != Undefined.instance) {
            Scriptable object = ScriptRuntime.toObject(context, scriptable, obj2);
            if (objArr.length > 1 && ScriptRuntime.toBoolean(objArr[1])) {
                z = true;
            }
            if (scriptable2 != null) {
                Iterator<?> javaIterator = getJavaIterator(object);
                if (javaIterator != null) {
                    Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
                    return context.getWrapFactory().wrap(context, topLevelScope, new WrappedJavaIterator(javaIterator, topLevelScope), WrappedJavaIterator.class);
                }
                Scriptable iterator = ScriptRuntime.toIterator(context, scriptable, object, z);
                if (iterator != null) {
                    return iterator;
                }
            }
            if (z) {
                i = 3;
            } else {
                i = 5;
            }
            Object enumInit = ScriptRuntime.enumInit(object, context, scriptable, i);
            ScriptRuntime.setEnumNumbers(enumInit, true);
            NativeIterator nativeIterator = new NativeIterator(enumInit);
            nativeIterator.setPrototype(ScriptableObject.getClassPrototype(scriptable, nativeIterator.getClassName()));
            nativeIterator.setParentScope(scriptable);
            return nativeIterator;
        }
        if (objArr.length == 0) {
            obj = Undefined.instance;
        } else {
            obj = objArr[0];
        }
        throw ScriptRuntime.typeErrorById("msg.no.properties", ScriptRuntime.toString(obj));
    }

    private Object next(Context context, Scriptable scriptable) {
        if (ScriptRuntime.enumNext(this.objectIterator, context).booleanValue()) {
            return ScriptRuntime.enumId(this.objectIterator, context);
        }
        throw new JavaScriptException(getStopIterationObject(scriptable), null, 0);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(ITERATOR_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return jsConstructor(context, scriptable, scriptable2, objArr);
        }
        NativeIterator nativeIterator = (NativeIterator) IdScriptableObject.ensureType(scriptable2, NativeIterator.class, idFunctionObject);
        if (methodId != 2) {
            if (methodId == 3) {
                return scriptable2;
            }
            vs.m(String.valueOf(methodId));
            return null;
        }
        return nativeIterator.next(context, scriptable);
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
            case -1285135186:
                if (str.equals(ITERATOR_PROPERTY_NAME)) {
                    c = 1;
                    break;
                }
                break;
            case 3377907:
                if (str.equals(ES6Iterator.NEXT_METHOD)) {
                    c = 2;
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
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Iterator";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        int i2 = 2;
        int i3 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = ITERATOR_PROPERTY_NAME;
                    initPrototypeMethod(ITERATOR_TAG, i, str2, i3);
                }
                vs.m(String.valueOf(i));
                return;
            }
            i2 = 0;
            str = ES6Iterator.NEXT_METHOD;
        } else {
            str = "constructor";
        }
        String str3 = str;
        i3 = i2;
        str2 = str3;
        initPrototypeMethod(ITERATOR_TAG, i, str2, i3);
    }

    private NativeIterator() {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class StopIteration extends NativeObject {
        private static final long serialVersionUID = 2485151085722377663L;
        private Object value;

        public StopIteration() {
            this.value = Undefined.instance;
        }

        @Override // org.mozilla.javascript.NativeObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
        public String getClassName() {
            return NativeIterator.STOP_ITERATION;
        }

        public Object getValue() {
            return this.value;
        }

        @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
        public boolean hasInstance(Scriptable scriptable) {
            return scriptable instanceof StopIteration;
        }

        public StopIteration(Object obj) {
            Object obj2 = Undefined.instance;
            this.value = obj;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class WrappedJavaIterator {
        private Iterator<?> iterator;
        private Scriptable scope;

        public WrappedJavaIterator(Iterator<?> it, Scriptable scriptable) {
            this.iterator = it;
            this.scope = scriptable;
        }

        public Object next() {
            if (this.iterator.hasNext()) {
                return this.iterator.next();
            }
            throw new JavaScriptException(NativeIterator.getStopIterationObject(this.scope), null, 0);
        }

        public Object __iterator__(boolean z) {
            return this;
        }
    }
}
