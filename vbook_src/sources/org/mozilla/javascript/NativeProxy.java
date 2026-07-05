package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeProxy extends ScriptableObject implements Callable, Constructable {
    private static final String PROXY_TAG = "Proxy";
    private static final String TRAP_APPLY = "apply";
    private static final String TRAP_CONSTRUCT = "construct";
    private static final String TRAP_DEFINE_PROPERTY = "defineProperty";
    private static final String TRAP_DELETE_PROPERTY = "deleteProperty";
    private static final String TRAP_GET = "get";
    private static final String TRAP_GET_OWN_PROPERTY_DESCRIPTOR = "getOwnPropertyDescriptor";
    private static final String TRAP_GET_PROTOTYPE_OF = "getPrototypeOf";
    private static final String TRAP_HAS = "has";
    private static final String TRAP_IS_EXTENSIBLE = "isExtensible";
    private static final String TRAP_OWN_KEYS = "ownKeys";
    private static final String TRAP_PREVENT_EXTENSIONS = "preventExtensions";
    private static final String TRAP_SET = "set";
    private static final String TRAP_SET_PROTOTYPE_OF = "setPrototypeOf";
    private static final long serialVersionUID = 6676871870513494844L;
    private Scriptable handlerObj;
    private ScriptableObject targetObj;
    private final String typeOf;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Revoker implements Callable {
        private NativeProxy revocableProxy;

        public Revoker(NativeProxy nativeProxy) {
            this.revocableProxy = nativeProxy;
        }

        @Override // org.mozilla.javascript.Callable
        public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            NativeProxy nativeProxy = this.revocableProxy;
            if (nativeProxy != null) {
                nativeProxy.handlerObj = null;
                this.revocableProxy.targetObj = null;
                this.revocableProxy = null;
            }
            return Undefined.instance;
        }
    }

    private NativeProxy(ScriptableObject scriptableObject, Scriptable scriptable) {
        this.targetObj = scriptableObject;
        this.handlerObj = scriptable;
        if (scriptableObject != null && (scriptableObject instanceof Callable)) {
            this.typeOf = scriptableObject.getTypeOf();
        } else {
            this.typeOf = super.getTypeOf();
        }
    }

    private Object callTrap(Callable callable, Object[] objArr) {
        Context context = Context.getContext();
        Scriptable scriptable = this.handlerObj;
        return callable.call(context, scriptable, scriptable, objArr);
    }

    public static NativeProxy constructor(Context context, Scriptable scriptable, Object[] objArr) {
        if (objArr.length >= 2) {
            NativeProxy nativeProxy = new NativeProxy(ScriptableObject.ensureScriptableObjectButNotSymbol(objArr[0]), ScriptableObject.ensureScriptableObjectButNotSymbol(objArr[1]));
            nativeProxy.setPrototypeDirect(ScriptableObject.getClassPrototype(scriptable, PROXY_TAG));
            nativeProxy.setParentScope(scriptable);
            return nativeProxy;
        }
        throw ScriptRuntime.typeErrorById("msg.method.missing.parameter", "Proxy.ctor", "2", Integer.toString(objArr.length));
    }

    private Callable getTrap(String str) {
        Object property = ScriptableObject.getProperty(this.handlerObj, str);
        if (Scriptable.NOT_FOUND == property || property == null || Undefined.isUndefined(property)) {
            return null;
        }
        if (property instanceof Callable) {
            return (Callable) property;
        }
        throw ScriptRuntime.notFunctionError(property, str);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [org.mozilla.javascript.Constructable, java.lang.Object] */
    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, PROXY_TAG, 2, 2, new Object()) { // from class: org.mozilla.javascript.NativeProxy.1
            @Override // org.mozilla.javascript.LambdaConstructor, org.mozilla.javascript.LambdaFunction, org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
            public Scriptable construct(Context context2, Scriptable scriptable2, Object[] objArr) {
                NativeProxy nativeProxy = (NativeProxy) getTargetConstructor().construct(context2, scriptable2, objArr);
                nativeProxy.setPrototypeDirect(getClassPrototype());
                nativeProxy.setParentScope(scriptable2);
                return nativeProxy;
            }
        };
        lambdaConstructor.setPrototypeProperty(null);
        lambdaConstructor.defineConstructorMethod(scriptable, "revocable", 2, new j(5), 2, 3);
        ScriptableObject.defineProperty(scriptable, PROXY_TAG, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    public static /* synthetic */ boolean lambda$getIds$0(Object obj) {
        if (!(obj instanceof CharSequence) && !(obj instanceof NativeString) && !ScriptRuntime.isSymbol(obj)) {
            return false;
        }
        return true;
    }

    public static Object revocable(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (ScriptRuntime.isObject(scriptable2)) {
            NativeProxy constructor = constructor(context, scriptable, objArr);
            Scriptable scriptable3 = (NativeObject) context.newObject(scriptable);
            scriptable3.put("proxy", scriptable3, constructor);
            scriptable3.put("revoke", scriptable3, new LambdaFunction(scriptable, "", 0, new Revoker(constructor)));
            return scriptable3;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
    }

    public void setPrototypeDirect(Scriptable scriptable) {
        super.setPrototype(scriptable);
    }

    @Override // org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Scriptable newArray = context.newArray(scriptable, objArr);
        Callable trap = getTrap(TRAP_APPLY);
        if (trap != null) {
            return callTrap(trap, new Object[]{targetThrowIfRevoked, scriptable2, newArray});
        }
        return ScriptRuntime.applyOrCall(true, context, scriptable, targetThrowIfRevoked, new Object[]{scriptable2, newArray});
    }

    @Override // org.mozilla.javascript.Constructable
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_CONSTRUCT);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked, objArr, this});
            if ((callTrap instanceof Scriptable) && !ScriptRuntime.isSymbol(callTrap)) {
                return (ScriptableObject) callTrap;
            }
            throw ScriptRuntime.typeError("Constructor trap has to return a scriptable.");
        }
        return ((Constructable) targetThrowIfRevoked).construct(context, scriptable, objArr);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public boolean defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_DEFINE_PROPERTY);
        if (trap != null) {
            boolean z = ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, obj, scriptableObject}));
            boolean z2 = false;
            if (!z) {
                return false;
            }
            ScriptableObject ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), obj);
            boolean isExtensible = targetThrowIfRevoked.isExtensible();
            Boolean bool = Boolean.TRUE;
            if (bool.equals(Boolean.valueOf(ScriptableObject.hasProperty(scriptableObject, "configurable"))) && Boolean.FALSE.equals(scriptableObject.get("configurable"))) {
                z2 = true;
            }
            if (ownPropertyDescriptor == null) {
                if (!isExtensible || z2) {
                    throw ScriptRuntime.typeError("proxy can't define an incompatible property descriptor");
                }
            } else if (AbstractEcmaObjectOperations.isCompatiblePropertyDescriptor(context, isExtensible, scriptableObject, ownPropertyDescriptor)) {
                if (z2 && bool.equals(ownPropertyDescriptor.get("configurable"))) {
                    throw ScriptRuntime.typeError("proxy can't define an incompatible property descriptor");
                }
                if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor)) {
                    Boolean bool2 = Boolean.FALSE;
                    if (bool2.equals(ownPropertyDescriptor.get("configurable")) && bool.equals(ownPropertyDescriptor.get("writable")) && bool.equals(Boolean.valueOf(ScriptableObject.hasProperty(scriptableObject, "writable"))) && bool2.equals(scriptableObject.get("writable"))) {
                        throw ScriptRuntime.typeError("proxy can't define an incompatible property descriptor");
                    }
                }
            } else {
                throw ScriptRuntime.typeError("proxy can't define an incompatible property descriptor");
            }
            return true;
        }
        return targetThrowIfRevoked.defineOwnProperty(context, obj, scriptableObject);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_DELETE_PROPERTY);
        if (trap != null) {
            if (ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, ScriptRuntime.toString(i)})) && (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), Integer.valueOf(i))) != null) {
                if (!Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) && targetThrowIfRevoked.isExtensible()) {
                    return;
                }
                throw ScriptRuntime.typeError("proxy can't delete an existing own property ' + name + ' on an not configurable or not extensible object");
            }
            return;
        }
        targetThrowIfRevoked.delete(i);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_GET);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked, ScriptRuntime.toString(i), this});
            ScriptableObject ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), Integer.valueOf(i));
            if (ownPropertyDescriptor != null && !Undefined.isUndefined(ownPropertyDescriptor)) {
                Boolean bool = Boolean.FALSE;
                if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                    if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor) && bool.equals(ownPropertyDescriptor.get("writable")) && !Objects.equals(callTrap, ownPropertyDescriptor.get(ES6Iterator.VALUE_PROPERTY))) {
                        throw ScriptRuntime.typeError("proxy get has to return the same value as the plain call");
                    }
                    if (ScriptableObject.isAccessorDescriptor(ownPropertyDescriptor) && Undefined.isUndefined(ownPropertyDescriptor.get(TRAP_GET)) && !Undefined.isUndefined(callTrap)) {
                        throw ScriptRuntime.typeError("proxy get has to return the same value as the plain call");
                    }
                }
            }
            return callTrap;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        return targetThrowIfRevoked.get(i, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return getTargetThrowIfRevoked().getClassName();
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z, boolean z2) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_OWN_KEYS);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked});
            if (callTrap instanceof Scriptable) {
                Scriptable scriptable = (Scriptable) callTrap;
                if (ScriptRuntime.isArrayLike(scriptable)) {
                    Context context = Context.getContext();
                    List<Object> createListFromArrayLike = AbstractEcmaObjectOperations.createListFromArrayLike(context, scriptable, new a(1), "proxy [[OwnPropertyKeys]] must return an array with only string and symbol elements");
                    boolean isExtensible = targetThrowIfRevoked.isExtensible();
                    Object[] ids = targetThrowIfRevoked.getIds(true, true);
                    HashSet hashSet = new HashSet(createListFromArrayLike);
                    if (hashSet.size() == createListFromArrayLike.size()) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i = 0;
                        for (Object obj : ids) {
                            ScriptableObject ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(context, obj);
                            if (ownPropertyDescriptor != null && Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable"))) {
                                arrayList2.add(obj);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        if (isExtensible && arrayList2.size() == 0) {
                            return createListFromArrayLike.toArray();
                        }
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (hashSet.contains(obj2)) {
                                hashSet.remove(obj2);
                            } else {
                                throw ScriptRuntime.typeError("proxy can't skip a non-configurable property '" + String.valueOf(obj2) + "'");
                            }
                        }
                        if (isExtensible) {
                            return createListFromArrayLike.toArray();
                        }
                        int size2 = arrayList.size();
                        while (i < size2) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            if (hashSet.contains(obj3)) {
                                hashSet.remove(obj3);
                            } else {
                                throw ScriptRuntime.typeError("proxy can't skip a configurable property ".concat(String.valueOf(obj3)));
                            }
                        }
                        if (hashSet.size() > 0) {
                            throw ScriptRuntime.typeError("proxy can't skip properties");
                        }
                    } else {
                        throw ScriptRuntime.typeError("ownKeys trap result must not contain duplicates");
                    }
                } else {
                    throw ScriptRuntime.typeError("ownKeys trap must be an array like object");
                }
            } else {
                throw ScriptRuntime.typeError("ownKeys trap must be an object");
            }
        }
        return targetThrowIfRevoked.getIds(z, z2);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_GET_OWN_PROPERTY_DESCRIPTOR);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked, obj});
            if (!Undefined.isUndefined(callTrap) && (!(callTrap instanceof Scriptable) || ScriptRuntime.isSymbol(callTrap))) {
                throw ScriptRuntime.typeError("getOwnPropertyDescriptor trap has to return undefined or an object");
            }
            if (ScriptRuntime.isSymbol(obj)) {
                ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(context, obj);
            } else {
                ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(context, ScriptRuntime.toString(obj));
            }
            if (Undefined.isUndefined(callTrap)) {
                if (Undefined.isUndefined(ownPropertyDescriptor)) {
                    return null;
                }
                if (!Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) && targetThrowIfRevoked.isExtensible()) {
                    return null;
                }
                String valueOf = String.valueOf(obj);
                throw ScriptRuntime.typeError("proxy can't report an existing own property '" + valueOf + "' as non-existent on a non-extensible object");
            }
            Scriptable scriptable = (Scriptable) callTrap;
            if (callTrap == null) {
                return null;
            }
            return ScriptableObject.buildDataDescriptor(targetThrowIfRevoked, ScriptableObject.getProperty(scriptable, ES6Iterator.VALUE_PROPERTY), applyDescriptorToAttributeBitset(7, ScriptableObject.getProperty(scriptable, "enumerable"), ScriptableObject.getProperty(scriptable, "writable"), ScriptableObject.getProperty(scriptable, "configurable")));
        } else if (ScriptRuntime.isSymbol(obj)) {
            return targetThrowIfRevoked.getOwnPropertyDescriptor(context, obj);
        } else {
            return targetThrowIfRevoked.getOwnPropertyDescriptor(context, ScriptRuntime.toString(obj));
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_GET_PROTOTYPE_OF);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked});
            if (Undefined.SCRIPTABLE_UNDEFINED != null && !Undefined.isUndefined(callTrap) && !ScriptRuntime.isSymbol(callTrap)) {
                Scriptable ensureScriptable = ScriptableObject.ensureScriptable(callTrap);
                if (targetThrowIfRevoked.isExtensible() || callTrap == targetThrowIfRevoked.getPrototype()) {
                    return ensureScriptable;
                }
                throw ScriptRuntime.typeError("getPrototypeOf trap has to return the original prototype");
            }
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(callTrap));
        }
        return targetThrowIfRevoked.getPrototype();
    }

    public ScriptableObject getTargetThrowIfRevoked() {
        ScriptableObject scriptableObject = this.targetObj;
        if (scriptableObject != null) {
            return scriptableObject;
        }
        throw ScriptRuntime.typeError("Illegal operation attempted on a revoked proxy");
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        return this.typeOf;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_HAS);
        if (trap != null) {
            boolean z = ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, str}));
            if (!z && (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), str)) != null && (Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) || !targetThrowIfRevoked.isExtensible())) {
                throw ScriptRuntime.typeError("proxy can't report an existing own property '" + str + "' as non-existent on a non-extensible object");
            }
            return z;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        return targetThrowIfRevoked.has(str, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public boolean isExtensible() {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_IS_EXTENSIBLE);
        if (trap == null) {
            return targetThrowIfRevoked.isExtensible();
        }
        boolean z = ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked}));
        if (z == targetThrowIfRevoked.isExtensible()) {
            return z;
        }
        throw ScriptRuntime.typeError("IsExtensible trap has to return the same value as the target");
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public boolean preventExtensions() {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_PREVENT_EXTENSIONS);
        if (trap == null) {
            return targetThrowIfRevoked.preventExtensions();
        }
        boolean z = ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked}));
        if (z && targetThrowIfRevoked.isExtensible()) {
            throw ScriptRuntime.typeError("target is extensible but trap returned true");
        }
        return z;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_SET);
        if (trap != null) {
            if (ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, ScriptRuntime.toString(i), obj})) && (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), Integer.valueOf(i))) != null && !Undefined.isUndefined(ownPropertyDescriptor)) {
                Boolean bool = Boolean.FALSE;
                if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                    if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor) && bool.equals(ownPropertyDescriptor.get("writable")) && !Objects.equals(obj, ownPropertyDescriptor.get(ES6Iterator.VALUE_PROPERTY))) {
                        throw ScriptRuntime.typeError("proxy set has to use the same value as the plain call");
                    }
                    if (ScriptableObject.isAccessorDescriptor(ownPropertyDescriptor) && Undefined.isUndefined(ownPropertyDescriptor.get(TRAP_SET))) {
                        throw ScriptRuntime.typeError("proxy set has to be available");
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        targetThrowIfRevoked.put(i, scriptable, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void setPrototype(Scriptable scriptable) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_SET_PROTOTYPE_OF);
        if (trap != null) {
            if (!ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, scriptable}))) {
                return;
            }
            targetThrowIfRevoked.isExtensible();
            return;
        }
        targetThrowIfRevoked.setPrototype(scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_DELETE_PROPERTY);
        if (trap != null) {
            if (ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, str})) && (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), str)) != null) {
                if (Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) || !targetThrowIfRevoked.isExtensible()) {
                    throw ScriptRuntime.typeError("proxy can't delete an existing own property ' + name + ' on an not configurable or not extensible object");
                }
                return;
            }
            return;
        }
        targetThrowIfRevoked.delete(str);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void delete(Symbol symbol) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_DELETE_PROPERTY);
        if (trap != null) {
            if (ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, symbol})) && (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), symbol)) != null) {
                if (Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) || !targetThrowIfRevoked.isExtensible()) {
                    throw ScriptRuntime.typeError("proxy can't delete an existing own property ' + name + ' on an not configurable or not extensible object");
                }
                return;
            }
            return;
        }
        ScriptableObject.ensureSymbolScriptable(targetThrowIfRevoked).delete(symbol);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_HAS);
        if (trap != null) {
            boolean z = ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, ScriptRuntime.toString(i)}));
            if (z || (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), Integer.valueOf(i))) == null || (!Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) && targetThrowIfRevoked.isExtensible())) {
                return z;
            }
            throw ScriptRuntime.typeError("proxy can't check an existing property ' + name + ' existance on an not configurable or not extensible object");
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        return targetThrowIfRevoked.has(i, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public boolean has(Symbol symbol, Scriptable scriptable) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_HAS);
        if (trap != null) {
            boolean z = ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, symbol}));
            if (z || (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), symbol)) == null || (!Boolean.FALSE.equals(ownPropertyDescriptor.get("configurable")) && targetThrowIfRevoked.isExtensible())) {
                return z;
            }
            throw ScriptRuntime.typeError("proxy can't check an existing property ' + name + ' existance on an not configurable or not extensible object");
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        return ScriptableObject.ensureSymbolScriptable(targetThrowIfRevoked).has(symbol, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_GET);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked, str, this});
            ScriptableObject ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), str);
            if (ownPropertyDescriptor != null && !Undefined.isUndefined(ownPropertyDescriptor)) {
                Boolean bool = Boolean.FALSE;
                if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                    if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor) && bool.equals(ownPropertyDescriptor.get("writable")) && !Objects.equals(callTrap, ownPropertyDescriptor.get(ES6Iterator.VALUE_PROPERTY))) {
                        throw ScriptRuntime.typeError("proxy get has to return the same value as the plain call");
                    }
                    if (ScriptableObject.isAccessorDescriptor(ownPropertyDescriptor) && Undefined.isUndefined(ownPropertyDescriptor.get(TRAP_GET)) && !Undefined.isUndefined(callTrap)) {
                        throw ScriptRuntime.typeError("proxy get has to return the same value as the plain call");
                    }
                }
            }
            return callTrap;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        return targetThrowIfRevoked.get(str, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_SET);
        if (trap != null) {
            if (!ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, str, obj})) || (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), str)) == null || Undefined.isUndefined(ownPropertyDescriptor)) {
                return;
            }
            Boolean bool = Boolean.FALSE;
            if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor) && bool.equals(ownPropertyDescriptor.get("writable")) && !Objects.equals(obj, ownPropertyDescriptor.get(ES6Iterator.VALUE_PROPERTY))) {
                    throw ScriptRuntime.typeError("proxy set has to use the same value as the plain call");
                }
                if (ScriptableObject.isAccessorDescriptor(ownPropertyDescriptor) && Undefined.isUndefined(ownPropertyDescriptor.get(TRAP_SET))) {
                    throw ScriptRuntime.typeError("proxy set has to be available");
                }
                return;
            }
            return;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        targetThrowIfRevoked.put(str, scriptable, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public Object get(Symbol symbol, Scriptable scriptable) {
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_GET);
        if (trap != null) {
            Object callTrap = callTrap(trap, new Object[]{targetThrowIfRevoked, symbol, this});
            ScriptableObject ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), symbol);
            if (ownPropertyDescriptor != null && !Undefined.isUndefined(ownPropertyDescriptor)) {
                Boolean bool = Boolean.FALSE;
                if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                    if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor) && bool.equals(ownPropertyDescriptor.get("writable")) && !Objects.equals(callTrap, ownPropertyDescriptor.get(ES6Iterator.VALUE_PROPERTY))) {
                        throw ScriptRuntime.typeError("proxy get has to return the same value as the plain call");
                    }
                    if (ScriptableObject.isAccessorDescriptor(ownPropertyDescriptor) && Undefined.isUndefined(ownPropertyDescriptor.get(TRAP_GET)) && !Undefined.isUndefined(callTrap)) {
                        throw ScriptRuntime.typeError("proxy get has to return the same value as the plain call");
                    }
                }
            }
            return callTrap;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        return ScriptableObject.ensureSymbolScriptable(targetThrowIfRevoked).get(symbol, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        ScriptableObject ownPropertyDescriptor;
        ScriptableObject targetThrowIfRevoked = getTargetThrowIfRevoked();
        Callable trap = getTrap(TRAP_SET);
        if (trap != null) {
            if (!ScriptRuntime.toBoolean(callTrap(trap, new Object[]{targetThrowIfRevoked, symbol, obj})) || (ownPropertyDescriptor = targetThrowIfRevoked.getOwnPropertyDescriptor(Context.getContext(), symbol)) == null || Undefined.isUndefined(ownPropertyDescriptor)) {
                return;
            }
            Boolean bool = Boolean.FALSE;
            if (bool.equals(ownPropertyDescriptor.get("configurable"))) {
                if (ScriptableObject.isDataDescriptor(ownPropertyDescriptor) && bool.equals(ownPropertyDescriptor.get("writable")) && !Objects.equals(obj, ownPropertyDescriptor.get(ES6Iterator.VALUE_PROPERTY))) {
                    throw ScriptRuntime.typeError("proxy set has to use the same value as the plain call");
                }
                if (ScriptableObject.isAccessorDescriptor(ownPropertyDescriptor) && Undefined.isUndefined(ownPropertyDescriptor.get(TRAP_SET))) {
                    throw ScriptRuntime.typeError("proxy set has to be available");
                }
                return;
            }
            return;
        }
        if (scriptable == this) {
            scriptable = targetThrowIfRevoked;
        }
        ScriptableObject.ensureSymbolScriptable(targetThrowIfRevoked).put(symbol, scriptable, obj);
    }
}
