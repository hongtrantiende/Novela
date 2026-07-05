package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.mozilla.javascript.AccessorSlot;
import org.mozilla.javascript.LambdaAccessorSlot;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import org.mozilla.javascript.annotations.JSStaticFunction;
import org.mozilla.javascript.debug.DebuggableObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class ScriptableObject implements Scriptable, SymbolScriptable, Serializable, DebuggableObject, ConstProperties {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONST = 13;
    public static final int DONTENUM = 2;
    public static final int EMPTY = 0;
    private static final Method GET_ARRAY_LENGTH;
    private static final Comparator<Object> KEY_COMPARATOR;
    public static final int PERMANENT = 4;
    public static final int READONLY = 1;
    public static final int UNINITIALIZED_CONST = 8;
    private static final long serialVersionUID = 2829861078851942586L;
    private volatile Map<Object, Object> associatedValues;
    private transient ExternalArrayData externalData;
    private boolean isExtensible;
    private boolean isSealed;
    private Scriptable parentScopeObject;
    private Scriptable prototypeObject;
    private transient SlotMapContainer slotMap;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class KeyComparator implements Comparator<Object>, Serializable {
        private static final long serialVersionUID = 6411335891523988149L;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj instanceof Integer) {
                if (obj2 instanceof Integer) {
                    return ((Integer) obj).compareTo((Integer) obj2);
                }
                return -1;
            } else if (obj2 instanceof Integer) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static {
        try {
            GET_ARRAY_LENGTH = ScriptableObject.class.getMethod("getExternalArrayLength", null);
            KEY_COMPARATOR = new KeyComparator();
        } catch (NoSuchMethodException e) {
            fb4.l(e);
        }
    }

    public ScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        this.isExtensible = true;
        this.isSealed = false;
        if (scriptable != null) {
            this.parentScopeObject = scriptable;
            this.prototypeObject = scriptable2;
            this.slotMap = createSlotMap(0);
            return;
        }
        p1a.g();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends org.mozilla.javascript.Scriptable> org.mozilla.javascript.BaseFunction buildClassCtor(org.mozilla.javascript.Scriptable r25, java.lang.Class<T> r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.buildClassCtor(org.mozilla.javascript.Scriptable, java.lang.Class, boolean, boolean):org.mozilla.javascript.BaseFunction");
    }

    public static ScriptableObject buildDataDescriptor(Scriptable scriptable, Object obj, int i) {
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel.Builtins.Object);
        nativeObject.defineProperty(ES6Iterator.VALUE_PROPERTY, obj, 0);
        nativeObject.setCommonDescriptorProperties(i, true);
        return nativeObject;
    }

    public static Object callMethod(Context context, Scriptable scriptable, String str, Object[] objArr) {
        Object property = getProperty(scriptable, str);
        if (property instanceof Function) {
            Function function = (Function) property;
            Scriptable topLevelScope = getTopLevelScope(scriptable);
            if (context != null) {
                return function.call(context, topLevelScope, scriptable, objArr);
            }
            return Context.call(null, function, topLevelScope, scriptable, objArr);
        }
        throw ScriptRuntime.notFunctionError(scriptable, str);
    }

    private void checkNotSealed(Object obj, int i) {
        String num;
        if (!isSealed()) {
            return;
        }
        if (obj != null) {
            num = obj.toString();
        } else {
            num = Integer.toString(i);
        }
        throw Context.reportRuntimeErrorById("msg.modify.sealed", num);
    }

    public static Slot checkSlotRemoval(Object obj, int i, Slot slot) {
        if (slot != null && (slot.getAttributes() & 4) != 0) {
            if (!Context.getContext().isStrictMode()) {
                return slot;
            }
            throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", obj);
        }
        return null;
    }

    public static void checkValidAttributes(int i) {
        if ((i & (-16)) == 0) {
            return;
        }
        vs.m(String.valueOf(i));
    }

    private LambdaAccessorSlot createLambdaAccessorSlot(Object obj, int i, java.util.function.Function<Scriptable, Object> function, BiConsumer<Scriptable, Object> biConsumer, int i2) {
        LambdaAccessorSlot lambdaAccessorSlot = new LambdaAccessorSlot(obj, i);
        lambdaAccessorSlot.setGetter(this, function);
        lambdaAccessorSlot.setSetter(this, biConsumer);
        lambdaAccessorSlot.setAttributes(i2);
        return lambdaAccessorSlot;
    }

    private static SlotMapContainer createSlotMap(int i) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(17)) {
            return new ThreadSafeSlotMapContainer(i);
        }
        return new SlotMapContainer(i);
    }

    public static <T extends Scriptable> String defineClass(Scriptable scriptable, Class<T> cls, boolean z, boolean z2) {
        BaseFunction buildClassCtor = buildClassCtor(scriptable, cls, z, z2);
        if (buildClassCtor == null) {
            return null;
        }
        String className = buildClassCtor.getClassPrototype().getClassName();
        defineProperty(scriptable, className, buildClassCtor, 2);
        return className;
    }

    public static void defineConstProperty(Scriptable scriptable, String str) {
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).defineConst(str, scriptable);
        } else {
            defineProperty(scriptable, str, Undefined.instance, 13);
        }
    }

    public static boolean deleteProperty(Scriptable scriptable, Symbol symbol) {
        Scriptable base = getBase(scriptable, symbol);
        if (base == null) {
            return true;
        }
        SymbolScriptable ensureSymbolScriptable = ensureSymbolScriptable(base);
        ensureSymbolScriptable.delete(symbol);
        return !ensureSymbolScriptable.has(symbol, scriptable);
    }

    public static AccessorSlot ensureAccessorSlot(Object obj, int i, Slot slot) {
        if (slot == null) {
            return new AccessorSlot(obj, i);
        }
        if (slot instanceof AccessorSlot) {
            return (AccessorSlot) slot;
        }
        return new AccessorSlot(slot);
    }

    public static LambdaSlot ensureLambdaSlot(Object obj, int i, Slot slot) {
        if (slot == null) {
            return new LambdaSlot(obj, i);
        }
        if (slot instanceof LambdaSlot) {
            return (LambdaSlot) slot;
        }
        return new LambdaSlot(slot);
    }

    public static LazyLoadSlot ensureLazySlot(Object obj, int i, Slot slot) {
        if (slot == null) {
            return new LazyLoadSlot(obj, i);
        }
        if (slot instanceof LazyLoadSlot) {
            return (LazyLoadSlot) slot;
        }
        return new LazyLoadSlot(slot);
    }

    public static Scriptable ensureScriptable(Object obj) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    public static ScriptableObject ensureScriptableObject(Object obj) {
        if (obj instanceof ScriptableObject) {
            return (ScriptableObject) obj;
        }
        if (obj instanceof Delegator) {
            return (ScriptableObject) ((Delegator) obj).getDelegee();
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    public static ScriptableObject ensureScriptableObjectButNotSymbol(Object obj) {
        if (!(obj instanceof Symbol)) {
            return ensureScriptableObject(obj);
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    public static SymbolScriptable ensureSymbolScriptable(Object obj) {
        if (obj instanceof SymbolScriptable) {
            return (SymbolScriptable) obj;
        }
        throw ScriptRuntime.typeErrorById("msg.object.not.symbolscriptable", ScriptRuntime.typeof(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends Scriptable> Class<T> extendsScriptable(Class<?> cls) {
        if (ScriptRuntime.ScriptableClass.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    private static Member findAnnotatedMember(AccessibleObject[] accessibleObjectArr, Class<? extends Annotation> cls) {
        for (AccessibleObject accessibleObject : accessibleObjectArr) {
            if (accessibleObject.isAnnotationPresent(cls)) {
                return (Member) accessibleObject;
            }
        }
        return null;
    }

    private static Method findSetterMethod(Method[] methodArr, String str, String str2) {
        String str3 = "set" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
        for (Method method : methodArr) {
            JSSetter jSSetter = (JSSetter) method.getAnnotation(JSSetter.class);
            if (jSSetter != null && (str.equals(jSSetter.value()) || ("".equals(jSSetter.value()) && str3.equals(method.getName())))) {
                return method;
            }
        }
        String u = nk2.u(str2, str);
        for (Method method2 : methodArr) {
            if (u.equals(method2.getName())) {
                return method2;
            }
        }
        return null;
    }

    public static Scriptable getArrayPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Array);
    }

    private Slot getAttributeSlot(String str, int i) {
        Slot query = this.slotMap.query(str, i);
        if (query == null) {
            if (str == null) {
                str = Integer.toString(i);
            }
            throw Context.reportRuntimeErrorById("msg.prop.not.found", str);
        }
        return query;
    }

    private static Scriptable getBase(Scriptable scriptable, Symbol symbol) {
        Scriptable scriptable2 = scriptable;
        while (!ensureSymbolScriptable(scriptable2).has(symbol, scriptable)) {
            scriptable2 = scriptable2.getPrototype();
            if (scriptable2 == null) {
                return scriptable2;
            }
        }
        return scriptable2;
    }

    public static Scriptable getClassPrototype(Scriptable scriptable, String str) {
        Object obj;
        Object property = getProperty(getTopLevelScope(scriptable), str);
        if (property instanceof BaseFunction) {
            obj = ((BaseFunction) property).getPrototypeProperty();
        } else {
            if (property instanceof Scriptable) {
                Scriptable scriptable2 = (Scriptable) property;
                obj = scriptable2.get("prototype", scriptable2);
            }
            return null;
        }
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        return null;
    }

    public static Object getDefaultValue(Scriptable scriptable, Class<?> cls) {
        String name;
        String str;
        Context context = null;
        for (int i = 0; i < 2; i++) {
            boolean z = true;
            if (cls != ScriptRuntime.StringClass ? i != 1 : i != 0) {
                z = false;
            }
            if (z) {
                str = "toString";
            } else {
                str = "valueOf";
            }
            Object property = getProperty(scriptable, str);
            if (property instanceof Function) {
                Function function = (Function) property;
                if (context == null) {
                    context = Context.getContext();
                }
                Object call = function.call(context, function.getParentScope(), scriptable, ScriptRuntime.emptyArgs);
                if (call != null) {
                    if ((call instanceof Scriptable) && cls != ScriptRuntime.ScriptableClass && cls != ScriptRuntime.FunctionClass) {
                        if (z && (call instanceof Wrapper)) {
                            call = ((Wrapper) call).unwrap();
                            if (call instanceof String) {
                            }
                        }
                    }
                    return call;
                }
                continue;
            }
        }
        if (cls == null) {
            name = "undefined";
        } else {
            name = cls.getName();
        }
        throw ScriptRuntime.typeErrorById("msg.default.value", name);
    }

    public static Scriptable getFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Function);
    }

    public static Scriptable getGeneratorFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.GeneratorFunction);
    }

    public static Scriptable getObjectPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Object);
    }

    private static Object getPropWalkingPrototypeChain(Scriptable scriptable, Scriptable scriptable2, Symbol symbol) {
        Object obj;
        do {
            obj = ensureSymbolScriptable(scriptable).get(symbol, scriptable2);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        return obj;
    }

    public static Object getProperty(Scriptable scriptable, String str) {
        return getPropWalkingPrototypeChain(scriptable, str, scriptable);
    }

    public static Object[] getPropertyIds(Scriptable scriptable) {
        if (scriptable == null) {
            return ScriptRuntime.emptyArgs;
        }
        Object[] ids = scriptable.getIds();
        HashSet hashSet = null;
        while (true) {
            scriptable = scriptable.getPrototype();
            if (scriptable == null) {
                break;
            }
            Object[] ids2 = scriptable.getIds();
            if (ids2.length != 0) {
                if (hashSet == null) {
                    if (ids.length == 0) {
                        ids = ids2;
                    } else {
                        hashSet = new HashSet();
                        for (int i = 0; i != ids.length; i++) {
                            hashSet.add(ids[i]);
                        }
                        ids = null;
                    }
                }
                for (int i2 = 0; i2 != ids2.length; i2++) {
                    hashSet.add(ids2[i2]);
                }
            }
        }
        if (hashSet != null) {
            return hashSet.toArray();
        }
        return ids;
    }

    private static String getPropertyName(String str, String str2, Annotation annotation) {
        String value;
        if (str2 != null) {
            return str.substring(str2.length());
        }
        if (annotation instanceof JSGetter) {
            value = ((JSGetter) annotation).value();
            if ((value == null || value.length() == 0) && str.length() > 3 && str.startsWith("get")) {
                value = str.substring(3);
                if (Character.isUpperCase(value.charAt(0))) {
                    if (value.length() == 1) {
                        value = value.toLowerCase(Locale.ROOT);
                    } else if (!Character.isUpperCase(value.charAt(1))) {
                        value = Character.toLowerCase(value.charAt(0)) + value.substring(1);
                    }
                }
            }
        } else {
            value = annotation instanceof JSFunction ? ((JSFunction) annotation).value() : annotation instanceof JSStaticFunction ? ((JSStaticFunction) annotation).value() : null;
        }
        if (value != null && value.length() != 0) {
            return value;
        }
        return str;
    }

    public static Object getSuperProperty(Scriptable scriptable, Scriptable scriptable2, String str) {
        return getPropWalkingPrototypeChain(scriptable, str, scriptable2);
    }

    public static Scriptable getTopLevelScope(Scriptable scriptable) {
        while (true) {
            Scriptable parentScope = scriptable.getParentScope();
            if (parentScope == null) {
                return scriptable;
            }
            scriptable = parentScope;
        }
    }

    public static Object getTopScopeValue(Scriptable scriptable, Object obj) {
        Object associatedValue;
        Scriptable topLevelScope = getTopLevelScope(scriptable);
        do {
            if ((topLevelScope instanceof ScriptableObject) && (associatedValue = ((ScriptableObject) topLevelScope).getAssociatedValue(obj)) != null) {
                return associatedValue;
            }
            topLevelScope = topLevelScope.getPrototype();
        } while (topLevelScope != null);
        return null;
    }

    public static <T> T getTypedProperty(Scriptable scriptable, int i, Class<T> cls) {
        Object property = getProperty(scriptable, i);
        if (property == Scriptable.NOT_FOUND) {
            property = null;
        }
        return cls.cast(Context.jsToJava(property, cls));
    }

    public static boolean hasProperty(Scriptable scriptable, String str) {
        if (getBase(scriptable, str) != null) {
            return true;
        }
        return false;
    }

    public static boolean isAccessorDescriptor(ScriptableObject scriptableObject) {
        if (!hasProperty(scriptableObject, "get") && !hasProperty(scriptableObject, "set")) {
            return false;
        }
        return true;
    }

    public static boolean isDataDescriptor(ScriptableObject scriptableObject) {
        if (!hasProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY) && !hasProperty(scriptableObject, "writable")) {
            return false;
        }
        return true;
    }

    public static boolean isFalse(Object obj) {
        return !isTrue(obj);
    }

    public static boolean isGenericDescriptor(ScriptableObject scriptableObject) {
        if (!isDataDescriptor(scriptableObject) && !isAccessorDescriptor(scriptableObject)) {
            return true;
        }
        return false;
    }

    public static boolean isTrue(Object obj) {
        if (obj != Scriptable.NOT_FOUND && ScriptRuntime.toBoolean(obj)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Slot lambda$defineOwnProperty$0(boolean z, Object obj, ScriptableObject scriptableObject, Object obj2, Object obj3, Object obj4, boolean z2, Object obj5, Object obj6, Object obj7, Object obj8, int i, Slot slot) {
        int applyDescriptorToAttributeBitset;
        AccessorSlot accessorSlot;
        AccessorSlot accessorSlot2;
        if (z) {
            checkPropertyChangeForSlot(obj, slot, scriptableObject);
        }
        if (slot == null) {
            accessorSlot = new Slot(obj8, i, 0);
            applyDescriptorToAttributeBitset = applyDescriptorToAttributeBitset(7, obj2, obj3, obj4);
        } else {
            applyDescriptorToAttributeBitset = applyDescriptorToAttributeBitset(slot.getAttributes(), obj2, obj3, obj4);
            accessorSlot = slot;
        }
        if (z2) {
            if (accessorSlot instanceof AccessorSlot) {
                accessorSlot2 = (AccessorSlot) accessorSlot;
            } else {
                accessorSlot2 = new AccessorSlot(accessorSlot);
                accessorSlot = accessorSlot2;
            }
            Object obj9 = Scriptable.NOT_FOUND;
            if (obj5 != obj9) {
                accessorSlot2.getter = new AccessorSlot.FunctionGetter(obj5);
            }
            if (obj6 != obj9) {
                accessorSlot2.setter = new AccessorSlot.FunctionSetter(obj6);
            }
            accessorSlot2.value = Undefined.instance;
        } else {
            if (!accessorSlot.isValueSlot() && isDataDescriptor(scriptableObject)) {
                accessorSlot = new Slot(accessorSlot);
            }
            if (obj7 != Scriptable.NOT_FOUND) {
                accessorSlot.value = obj7;
            } else if (slot == null) {
                accessorSlot.value = Undefined.instance;
            }
        }
        accessorSlot.setAttributes(applyDescriptorToAttributeBitset);
        return accessorSlot;
    }

    public /* synthetic */ LambdaAccessorSlot lambda$defineProperty$1(Context context, String str, LambdaAccessorSlot lambdaAccessorSlot, ScriptableObject scriptableObject, Object obj, int i, Slot slot) {
        if (slot != null) {
            return replaceExistingLambdaSlot(context, str, slot, lambdaAccessorSlot);
        }
        checkPropertyChangeForSlot(str, null, scriptableObject);
        return lambdaAccessorSlot;
    }

    private boolean putConstImpl(String str, int i, Scriptable scriptable, Object obj, int i2) {
        Slot query;
        if (!this.isExtensible && Context.getContext().isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
        }
        if (this != scriptable) {
            query = this.slotMap.query(str, i);
            if (query == null) {
                return false;
            }
        } else if (!isExtensible()) {
            query = this.slotMap.query(str, i);
            if (query == null) {
                return true;
            }
        } else {
            checkNotSealed(str, i);
            Slot modify = this.slotMap.modify(str, i, 13);
            int attributes = modify.getAttributes();
            if ((attributes & 1) != 0) {
                if ((attributes & 8) != 0) {
                    modify.value = obj;
                    if (i2 != 8) {
                        modify.setAttributes(attributes & (-9));
                    }
                }
                return true;
            }
            throw Context.reportRuntimeErrorById("msg.var.redecl", str);
        }
        return query.setValue(obj, this, scriptable);
    }

    public static void putConstProperty(Scriptable scriptable, String str, Object obj) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            base = scriptable;
        }
        if (base instanceof ConstProperties) {
            ((ConstProperties) base).putConst(str, scriptable, obj);
        }
    }

    private boolean putImpl(Object obj, int i, Scriptable scriptable, Object obj2, boolean z) {
        Slot modify;
        if (this != scriptable) {
            modify = this.slotMap.query(obj, i);
            if (!this.isExtensible && ((modify == null || (!(modify instanceof AccessorSlot) && (modify.getAttributes() & 1) != 0)) && z)) {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
            if (modify == null) {
                return false;
            }
        } else if (!this.isExtensible) {
            modify = this.slotMap.query(obj, i);
            if ((modify != null && ((modify instanceof AccessorSlot) || (modify.getAttributes() & 1) == 0)) || !z) {
                if (modify == null) {
                    return true;
                }
            } else {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
        } else {
            if (this.isSealed) {
                checkNotSealed(obj, i);
            }
            modify = this.slotMap.modify(obj, i, 0);
        }
        return modify.setValue(obj2, this, scriptable, z);
    }

    public static void putProperty(Scriptable scriptable, Symbol symbol, Object obj) {
        Scriptable base = getBase(scriptable, symbol);
        if (base == null) {
            base = scriptable;
        }
        ensureSymbolScriptable(base).put(symbol, scriptable, obj);
    }

    public static void putSuperProperty(Scriptable scriptable, Scriptable scriptable2, Symbol symbol, Object obj) {
        ensureSymbolScriptable(scriptable).put(symbol, scriptable2, obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.slotMap = createSlotMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.slotMap.add((Slot) objectInputStream.readObject());
        }
    }

    public static void redefineProperty(Scriptable scriptable, String str, boolean z) {
        Scriptable base = getBase(scriptable, str);
        if (base != null) {
            if ((base instanceof ConstProperties) && ((ConstProperties) base).isConst(str)) {
                throw ScriptRuntime.typeErrorById("msg.const.redecl", str);
            }
            if (!z) {
                return;
            }
            throw ScriptRuntime.typeErrorById("msg.var.redecl", str);
        }
    }

    private LambdaAccessorSlot replaceExistingLambdaSlot(Context context, String str, Slot slot, LambdaAccessorSlot lambdaAccessorSlot) {
        LambdaAccessorSlot lambdaAccessorSlot2;
        if (slot instanceof LambdaAccessorSlot) {
            lambdaAccessorSlot2 = (LambdaAccessorSlot) slot;
        } else {
            lambdaAccessorSlot2 = new LambdaAccessorSlot(slot);
        }
        lambdaAccessorSlot2.replaceWith(lambdaAccessorSlot);
        checkPropertyChangeForSlot(str, slot, lambdaAccessorSlot2.buildPropertyDescriptor(context));
        return lambdaAccessorSlot2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        long readLock = this.slotMap.readLock();
        try {
            int dirtySize = this.slotMap.dirtySize();
            if (dirtySize == 0) {
                objectOutputStream.writeInt(0);
            } else {
                objectOutputStream.writeInt(dirtySize);
                Iterator<Slot> it = this.slotMap.iterator();
                while (it.hasNext()) {
                    objectOutputStream.writeObject(it.next());
                }
            }
            this.slotMap.unlockRead(readLock);
        } catch (Throwable th) {
            this.slotMap.unlockRead(readLock);
            throw th;
        }
    }

    public void addLazilyInitializedValue(String str, int i, LazilyLoadedCtor lazilyLoadedCtor, int i2) {
        if (str != null && i != 0) {
            vs.m(str);
            return;
        }
        checkNotSealed(str, i);
        LazyLoadSlot lazyLoadSlot = (LazyLoadSlot) this.slotMap.compute(str, i, new p1a(0));
        lazyLoadSlot.setAttributes(i2);
        lazyLoadSlot.value = lazilyLoadedCtor;
    }

    public int applyDescriptorToAttributeBitset(int i, Object obj, Object obj2, Object obj3) {
        Object obj4 = Scriptable.NOT_FOUND;
        if (obj != obj4) {
            if (ScriptRuntime.toBoolean(obj)) {
                i &= -3;
            } else {
                i |= 2;
            }
        }
        if (obj2 != obj4) {
            if (ScriptRuntime.toBoolean(obj2)) {
                i &= -2;
            } else {
                i |= 1;
            }
        }
        if (obj3 != obj4) {
            if (ScriptRuntime.toBoolean(obj3)) {
                return i & (-5);
            }
            return i | 4;
        }
        return i;
    }

    public final synchronized Object associateValue(Object obj, Object obj2) {
        Map map;
        try {
            if (obj2 != null) {
                map = this.associatedValues;
                if (map == null) {
                    map = new HashMap();
                    this.associatedValues = map;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return Kit.initHash(map, obj, obj2);
    }

    public boolean avoidObjectDetection() {
        return false;
    }

    public void checkPropertyChangeForSlot(Object obj, Slot slot, ScriptableObject scriptableObject) {
        boolean z = false;
        if (slot == null) {
            if (!isExtensible()) {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
        } else if ((slot.getAttributes() & 4) != 0) {
            if (!isTrue(getProperty(scriptableObject, "configurable"))) {
                if ((slot.getAttributes() & 2) == 0) {
                    z = true;
                }
                if (z == isTrue(getProperty(scriptableObject, "enumerable"))) {
                    boolean isDataDescriptor = isDataDescriptor(scriptableObject);
                    boolean isAccessorDescriptor = isAccessorDescriptor(scriptableObject);
                    if (isDataDescriptor || isAccessorDescriptor) {
                        if (isDataDescriptor) {
                            if ((slot.getAttributes() & 1) != 0) {
                                if (!isTrue(getProperty(scriptableObject, "writable"))) {
                                    if (!sameValue(getProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY), slot.value)) {
                                        throw ScriptRuntime.typeErrorById("msg.change.value.with.writable.false", obj);
                                    }
                                    return;
                                }
                                throw ScriptRuntime.typeErrorById("msg.change.writable.false.to.true.with.configurable.false", obj);
                            }
                            return;
                        } else if (isAccessorDescriptor && (slot instanceof AccessorSlot)) {
                            AccessorSlot accessorSlot = (AccessorSlot) slot;
                            if (accessorSlot.isSameSetterFunction(getProperty(scriptableObject, "set"))) {
                                if (!accessorSlot.isSameGetterFunction(getProperty(scriptableObject, "get"))) {
                                    throw ScriptRuntime.typeErrorById("msg.change.getter.with.configurable.false", obj);
                                }
                                return;
                            }
                            throw ScriptRuntime.typeErrorById("msg.change.setter.with.configurable.false", obj);
                        } else {
                            throw ScriptRuntime.typeErrorById("msg.change.property.data.to.accessor.with.configurable.false", obj);
                        }
                    }
                    return;
                }
                throw ScriptRuntime.typeErrorById("msg.change.enumerable.with.configurable.false", obj);
            }
            throw ScriptRuntime.typeErrorById("msg.change.configurable.false.to.true", obj);
        }
    }

    public void checkPropertyDefinition(ScriptableObject scriptableObject) {
        Object property = getProperty(scriptableObject, "get");
        Object obj = Scriptable.NOT_FOUND;
        if (property != obj && property != Undefined.instance && !(property instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(property);
        }
        Object property2 = getProperty(scriptableObject, "set");
        if (property2 != obj && property2 != Undefined.instance && !(property2 instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(property2);
        }
        if (isDataDescriptor(scriptableObject) && isAccessorDescriptor(scriptableObject)) {
            throw ScriptRuntime.typeErrorById("msg.both.data.and.accessor.desc", new Object[0]);
        }
    }

    @Override // org.mozilla.javascript.ConstProperties
    public void defineConst(String str, Scriptable scriptable) {
        if (!putConstImpl(str, 0, scriptable, Undefined.instance, 8)) {
            if (scriptable != this) {
                if (scriptable instanceof ConstProperties) {
                    ((ConstProperties) scriptable).defineConst(str, scriptable);
                    return;
                }
                return;
            }
            throw Kit.codeBug();
        }
    }

    public void defineFunctionProperties(String[] strArr, Class<?> cls, int i) {
        Method[] methodList = FunctionObject.getMethodList(cls);
        for (String str : strArr) {
            Method findSingleMethod = FunctionObject.findSingleMethod(methodList, str);
            if (findSingleMethod != null) {
                defineProperty(str, new FunctionObject(str, findSingleMethod, this), i);
            } else {
                throw Context.reportRuntimeErrorById("msg.method.not.found", str, cls.getName());
            }
        }
    }

    public void defineOwnProperties(Context context, ScriptableObject scriptableObject) {
        Object[] ids = scriptableObject.getIds(false, true);
        ScriptableObject[] scriptableObjectArr = new ScriptableObject[ids.length];
        int length = ids.length;
        for (int i = 0; i < length; i++) {
            ScriptableObject ensureScriptableObject = ensureScriptableObject(ScriptRuntime.getObjectElem((Scriptable) scriptableObject, ids[i], context));
            checkPropertyDefinition(ensureScriptableObject);
            scriptableObjectArr[i] = ensureScriptableObject;
        }
        int length2 = ids.length;
        for (int i2 = 0; i2 < length2; i2++) {
            defineOwnProperty(context, ids[i2], scriptableObjectArr[i2]);
        }
    }

    public boolean defineOwnProperty(Context context, final Object obj, final ScriptableObject scriptableObject, final boolean z) {
        int i;
        String str;
        int i2 = 0;
        if (obj instanceof Symbol) {
            i = 0;
            str = obj;
        } else {
            ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(obj);
            String str2 = stringIdOrIndex.stringId;
            if (str2 == null) {
                i2 = stringIdOrIndex.index;
                str2 = null;
            }
            i = i2;
            str = str2;
        }
        final Object property = getProperty(scriptableObject, "enumerable");
        final Object property2 = getProperty(scriptableObject, "writable");
        final Object property3 = getProperty(scriptableObject, "configurable");
        final Object property4 = getProperty(scriptableObject, "get");
        final Object property5 = getProperty(scriptableObject, "set");
        final Object property6 = getProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY);
        final boolean isAccessorDescriptor = isAccessorDescriptor(scriptableObject);
        this.slotMap.compute(str, i, new SlotMap.SlotComputer() { // from class: o1a
            @Override // org.mozilla.javascript.SlotMap.SlotComputer
            public final Slot compute(Object obj2, int i3, Slot slot) {
                Slot lambda$defineOwnProperty$0;
                lambda$defineOwnProperty$0 = ScriptableObject.this.lambda$defineOwnProperty$0(z, obj, scriptableObject, property, property2, property3, isAccessorDescriptor, property4, property5, property6, obj2, i3, slot);
                return lambda$defineOwnProperty$0;
            }
        });
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void defineProperty(java.lang.String r10, java.lang.Object r11, java.lang.reflect.Method r12, java.lang.reflect.Method r13, int r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.defineProperty(java.lang.String, java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, int):void");
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(String str) {
        checkNotSealed(str, 0);
        this.slotMap.compute(str, 0, new Object());
    }

    public Object equivalentValues(Object obj) {
        if (this == obj) {
            return Boolean.TRUE;
        }
        return Scriptable.NOT_FOUND;
    }

    public Object get(Object obj) {
        Object obj2;
        if (obj instanceof String) {
            obj2 = get((String) obj, this);
        } else if (obj instanceof Symbol) {
            obj2 = get((Symbol) obj, this);
        } else if (obj instanceof Number) {
            obj2 = get(((Number) obj).intValue(), this);
        } else {
            obj2 = null;
        }
        if (obj2 == Scriptable.NOT_FOUND || obj2 == Undefined.instance) {
            return null;
        }
        if (obj2 instanceof Wrapper) {
            return ((Wrapper) obj2).unwrap();
        }
        return obj2;
    }

    @Override // org.mozilla.javascript.debug.DebuggableObject
    public Object[] getAllIds() {
        return getIds(true, false);
    }

    public final Object getAssociatedValue(Object obj) {
        Map<Object, Object> map = this.associatedValues;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public int getAttributes(String str) {
        return getAttributeSlot(str, 0).getAttributes();
    }

    @Override // org.mozilla.javascript.Scriptable
    public abstract String getClassName();

    public ExternalArrayData getExternalArrayData() {
        return this.externalData;
    }

    public Object getExternalArrayLength() {
        int arrayLength;
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData == null) {
            arrayLength = 0;
        } else {
            arrayLength = externalArrayData.getArrayLength();
        }
        return Integer.valueOf(arrayLength);
    }

    public Object getGetterOrSetter(String str, int i, Scriptable scriptable, boolean z) {
        Function getterFunction;
        if (str != null && i != 0) {
            vs.m(str);
            return null;
        }
        Slot query = this.slotMap.query(str, i);
        if (query == null) {
            return null;
        }
        if (z) {
            getterFunction = query.getSetterFunction(str, scriptable);
        } else {
            getterFunction = query.getGetterFunction(str, scriptable);
        }
        if (getterFunction == null) {
            return Undefined.instance;
        }
        return getterFunction;
    }

    public Object[] getIds(boolean z, boolean z2) {
        int arrayLength;
        Object[] objArr;
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData == null) {
            arrayLength = 0;
        } else {
            arrayLength = externalArrayData.getArrayLength();
        }
        if (arrayLength == 0) {
            objArr = ScriptRuntime.emptyArgs;
        } else {
            objArr = new Object[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                objArr[i] = Integer.valueOf(i);
            }
        }
        if (this.slotMap.isEmpty()) {
            return objArr;
        }
        long readLock = this.slotMap.readLock();
        try {
            Iterator<Slot> it = this.slotMap.iterator();
            int i2 = arrayLength;
            while (it.hasNext()) {
                Slot next = it.next();
                if (!z && (next.getAttributes() & 2) != 0) {
                }
                if (z2 || !(next.name instanceof Symbol)) {
                    if (i2 == arrayLength) {
                        Object[] objArr2 = new Object[this.slotMap.dirtySize() + arrayLength];
                        if (objArr != null) {
                            System.arraycopy(objArr, 0, objArr2, 0, arrayLength);
                        }
                        objArr = objArr2;
                    }
                    int i3 = i2 + 1;
                    Object obj = next.name;
                    if (obj == null) {
                        obj = Integer.valueOf(next.indexOrHash);
                    }
                    objArr[i2] = obj;
                    i2 = i3;
                }
            }
            this.slotMap.unlockRead(readLock);
            if (i2 != objArr.length + arrayLength) {
                Object[] objArr3 = new Object[i2];
                System.arraycopy(objArr, 0, objArr3, 0, i2);
                objArr = objArr3;
            }
            Context currentContext = Context.getCurrentContext();
            if (currentContext != null && currentContext.hasFeature(16)) {
                Arrays.sort(objArr, KEY_COMPARATOR);
            }
            return objArr;
        } catch (Throwable th) {
            this.slotMap.unlockRead(readLock);
            throw th;
        }
    }

    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        Slot querySlot = querySlot(context, obj);
        if (querySlot == null) {
            return null;
        }
        return querySlot.getPropertyDescriptor(context, this);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getParentScope() {
        return this.parentScopeObject;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        return this.prototypeObject;
    }

    public String getTypeOf() {
        if (avoidObjectDetection()) {
            return "undefined";
        }
        return "object";
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            if (i >= externalArrayData.getArrayLength()) {
                return false;
            }
            return true;
        } else if (this.slotMap.query(null, i) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        return ScriptRuntime.jsDelegatesTo(scriptable, this);
    }

    @Override // org.mozilla.javascript.ConstProperties
    public boolean isConst(String str) {
        Slot query = this.slotMap.query(str, 0);
        if (query == null || (query.getAttributes() & 5) != 5) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return this.slotMap.isEmpty();
    }

    public boolean isExtensible() {
        return this.isExtensible;
    }

    public boolean isGetterOrSetter(String str, int i, boolean z) {
        Slot query = this.slotMap.query(str, i);
        if (query != null && query.isSetterSlot()) {
            return true;
        }
        return false;
    }

    public final boolean isSealed() {
        return this.isSealed;
    }

    public boolean preventExtensions() {
        this.isExtensible = false;
        return true;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            if (i < externalArrayData.getArrayLength()) {
                this.externalData.setArrayElement(i, obj);
                return;
            }
            throw new JavaScriptException(ScriptRuntime.newNativeError(Context.getCurrentContext(), this, TopLevel.NativeErrors.RangeError, new Object[]{"External array index out of bounds "}), null, 0);
        } else if (putOwnProperty(i, scriptable, obj, Context.isCurrentContextStrict())) {
        } else {
            if (scriptable != this) {
                scriptable.put(i, scriptable, obj);
                return;
            }
            throw Kit.codeBug();
        }
    }

    @Override // org.mozilla.javascript.ConstProperties
    public void putConst(String str, Scriptable scriptable, Object obj) {
        if (putConstImpl(str, 0, scriptable, obj, 1)) {
            return;
        }
        if (scriptable != this) {
            if (scriptable instanceof ConstProperties) {
                ((ConstProperties) scriptable).putConst(str, scriptable, obj);
                return;
            } else {
                scriptable.put(str, scriptable, obj);
                return;
            }
        }
        throw Kit.codeBug();
    }

    public boolean putOwnProperty(String str, Scriptable scriptable, Object obj, boolean z) {
        return putImpl(str, 0, scriptable, obj, z);
    }

    public Slot querySlot(Context context, Object obj) {
        if (obj instanceof Symbol) {
            return this.slotMap.query(obj, 0);
        }
        ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(obj);
        String str = stringIdOrIndex.stringId;
        SlotMapContainer slotMapContainer = this.slotMap;
        if (str == null) {
            return slotMapContainer.query(null, stringIdOrIndex.index);
        }
        return slotMapContainer.query(str, 0);
    }

    public boolean sameValue(Object obj, Object obj2) {
        Object obj3 = Scriptable.NOT_FOUND;
        if (obj == obj3) {
            return true;
        }
        if (obj2 == obj3) {
            obj2 = Undefined.instance;
        }
        if ((obj2 instanceof Number) && (obj instanceof Number)) {
            double doubleValue = ((Number) obj2).doubleValue();
            double doubleValue2 = ((Number) obj).doubleValue();
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            if (doubleValue == 0.0d && Double.doubleToLongBits(doubleValue) != Double.doubleToLongBits(doubleValue2)) {
                return false;
            }
        }
        return ScriptRuntime.shallowEq(obj2, obj);
    }

    public void sealObject() {
        ArrayList arrayList = new ArrayList();
        while (!this.isSealed) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Slot slot = (Slot) obj;
                Object obj2 = slot.value;
                if (obj2 instanceof LazilyLoadedCtor) {
                    LazilyLoadedCtor lazilyLoadedCtor = (LazilyLoadedCtor) obj2;
                    try {
                        lazilyLoadedCtor.init();
                    } finally {
                        slot.value = lazilyLoadedCtor.getValue();
                    }
                }
            }
            arrayList.clear();
            long readLock = this.slotMap.readLock();
            try {
                Iterator<Slot> it = this.slotMap.iterator();
                while (it.hasNext()) {
                    Slot next = it.next();
                    if (next.value instanceof LazilyLoadedCtor) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.isSealed = true;
                }
                this.slotMap.unlockRead(readLock);
            } catch (Throwable th) {
                this.slotMap.unlockRead(readLock);
                throw th;
            }
        }
    }

    public void setAttributes(int i, int i2) {
        checkNotSealed(null, i);
        this.slotMap.modify(null, i, 0).setAttributes(i2);
    }

    public void setCommonDescriptorProperties(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (z) {
            if ((i & 1) == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            defineProperty("writable", Boolean.valueOf(z3), 0);
        }
        if ((i & 2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        defineProperty("enumerable", Boolean.valueOf(z2), 0);
        if ((i & 4) != 0) {
            z4 = false;
        }
        defineProperty("configurable", Boolean.valueOf(z4), 0);
    }

    public void setExternalArrayData(ExternalArrayData externalArrayData) {
        this.externalData = externalArrayData;
        if (externalArrayData == null) {
            delete("length");
        } else {
            defineProperty("length", (Object) null, GET_ARRAY_LENGTH, (Method) null, 3);
        }
    }

    public void setGetterOrSetter(Object obj, int i, Callable callable, boolean z) {
        AccessorSlot accessorSlot;
        if (obj != null && i != 0) {
            p1a.k(obj);
            return;
        }
        checkNotSealed(obj, i);
        boolean isExtensible = isExtensible();
        SlotMapContainer slotMapContainer = this.slotMap;
        if (isExtensible) {
            accessorSlot = (AccessorSlot) slotMapContainer.compute(obj, i, new p1a(1));
        } else {
            Slot query = slotMapContainer.query(obj, i);
            if (query instanceof AccessorSlot) {
                accessorSlot = (AccessorSlot) query;
            } else {
                return;
            }
        }
        if ((accessorSlot.getAttributes() & 1) == 0) {
            if (z) {
                if (callable instanceof Function) {
                    accessorSlot.setter = new AccessorSlot.FunctionSetter(callable);
                } else {
                    accessorSlot.setter = null;
                }
            } else if (callable instanceof Function) {
                accessorSlot.getter = new AccessorSlot.FunctionGetter(callable);
            } else {
                accessorSlot.getter = null;
            }
            accessorSlot.value = Undefined.instance;
            return;
        }
        throw Context.reportRuntimeErrorById("msg.modify.readonly", obj);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setParentScope(Scriptable scriptable) {
        this.parentScopeObject = scriptable;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setPrototype(Scriptable scriptable) {
        this.prototypeObject = scriptable;
    }

    public int size() {
        return this.slotMap.size();
    }

    public static Object getProperty(Scriptable scriptable, Symbol symbol) {
        return getPropWalkingPrototypeChain(scriptable, scriptable, symbol);
    }

    public static Object getSuperProperty(Scriptable scriptable, Scriptable scriptable2, Symbol symbol) {
        return getPropWalkingPrototypeChain(scriptable, scriptable2, symbol);
    }

    public static Object getProperty(Scriptable scriptable, int i) {
        return getPropWalkingPrototypeChain(scriptable, i, scriptable);
    }

    public static Object getSuperProperty(Scriptable scriptable, Scriptable scriptable2, int i) {
        return getPropWalkingPrototypeChain(scriptable, i, scriptable2);
    }

    public static void putSuperProperty(Scriptable scriptable, Scriptable scriptable2, String str, Object obj) {
        scriptable.put(str, scriptable2, obj);
    }

    public static void putSuperProperty(Scriptable scriptable, Scriptable scriptable2, int i, Object obj) {
        scriptable.put(i, scriptable2, obj);
    }

    public static boolean hasProperty(Scriptable scriptable, int i) {
        return getBase(scriptable, i) != null;
    }

    @Deprecated
    public final int getAttributes(int i, Scriptable scriptable) {
        return getAttributes(i);
    }

    public static boolean hasProperty(Scriptable scriptable, Symbol symbol) {
        return getBase(scriptable, symbol) != null;
    }

    @Deprecated
    public final int getAttributes(String str, Scriptable scriptable) {
        return getAttributes(str);
    }

    public boolean putOwnProperty(int i, Scriptable scriptable, Object obj, boolean z) {
        return putImpl(null, i, scriptable, obj, z);
    }

    public int getAttributes(int i) {
        return getAttributeSlot(null, i).getAttributes();
    }

    public boolean putOwnProperty(Symbol symbol, Scriptable scriptable, Object obj, boolean z) {
        return putImpl(symbol, 0, scriptable, obj, z);
    }

    public int getAttributes(Symbol symbol) {
        return getAttributeSlot(symbol).getAttributes();
    }

    public static void putProperty(Scriptable scriptable, String str, Object obj) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            base = scriptable;
        }
        base.put(str, scriptable, obj);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(int i) {
        checkNotSealed(null, i);
        this.slotMap.compute(null, i, new Object());
    }

    @Deprecated
    public void setAttributes(int i, Scriptable scriptable, int i2) {
        setAttributes(i, i2);
    }

    public void setAttributes(String str, int i) {
        checkNotSealed(str, 0);
        this.slotMap.modify(str, 0, 0).setAttributes(i);
    }

    public static void putProperty(Scriptable scriptable, int i, Object obj) {
        Scriptable base = getBase(scriptable, i);
        if (base == null) {
            base = scriptable;
        }
        base.put(i, scriptable, obj);
    }

    public void delete(Symbol symbol) {
        checkNotSealed(symbol, 0);
        this.slotMap.compute(symbol, 0, new Object());
    }

    public static <T> T getTypedProperty(Scriptable scriptable, String str, Class<T> cls) {
        Object property = getProperty(scriptable, str);
        if (property == Scriptable.NOT_FOUND) {
            property = null;
        }
        return cls.cast(Context.jsToJava(property, cls));
    }

    public static Scriptable getBase(Scriptable scriptable, int i) {
        Scriptable scriptable2 = scriptable;
        while (!scriptable2.has(i, scriptable)) {
            scriptable2 = scriptable2.getPrototype();
            if (scriptable2 == null) {
                return scriptable2;
            }
        }
        return scriptable2;
    }

    @Deprecated
    public final void setAttributes(String str, Scriptable scriptable, int i) {
        setAttributes(str, i);
    }

    private static Object getPropWalkingPrototypeChain(Scriptable scriptable, String str, Scriptable scriptable2) {
        Object obj;
        do {
            obj = scriptable.get(str, scriptable2);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        return obj;
    }

    public void setAttributes(Symbol symbol, int i) {
        checkNotSealed(symbol, 0);
        this.slotMap.modify(symbol, 0, 0).setAttributes(i);
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> cls, boolean z) {
        defineClass(scriptable, cls, z, false);
    }

    public static boolean deleteProperty(Scriptable scriptable, int i) {
        Scriptable base = getBase(scriptable, i);
        if (base == null) {
            return true;
        }
        base.delete(i);
        return !base.has(i, scriptable);
    }

    public static Scriptable getBase(Scriptable scriptable, String str) {
        Scriptable scriptable2 = scriptable;
        while (!scriptable2.has(str, scriptable)) {
            scriptable2 = scriptable2.getPrototype();
            if (scriptable2 == null) {
                return scriptable2;
            }
        }
        return scriptable2;
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> cls) {
        defineClass(scriptable, cls, false, false);
    }

    private static Object getPropWalkingPrototypeChain(Scriptable scriptable, int i, Scriptable scriptable2) {
        Object obj;
        do {
            obj = scriptable.get(i, scriptable2);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        return obj;
    }

    public static boolean deleteProperty(Scriptable scriptable, String str) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            return true;
        }
        base.delete(str);
        return !base.has(str, scriptable);
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return this.slotMap.query(str, 0) != null;
    }

    public boolean has(Symbol symbol, Scriptable scriptable) {
        return this.slotMap.query(symbol, 0) != null;
    }

    public ScriptableObject() {
        this.isExtensible = true;
        this.isSealed = false;
        this.slotMap = createSlotMap(0);
    }

    private Slot getAttributeSlot(Symbol symbol) {
        Slot query = this.slotMap.query(symbol, 0);
        if (query != null) {
            return query;
        }
        throw Context.reportRuntimeErrorById("msg.prop.not.found", symbol);
    }

    public static Object callMethod(Scriptable scriptable, String str, Object[] objArr) {
        return callMethod(null, scriptable, str, objArr);
    }

    @Deprecated
    public Object getGetterOrSetter(String str, int i, boolean z) {
        return getGetterOrSetter(str, i, this, z);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            if (i < externalArrayData.getArrayLength()) {
                return this.externalData.getArrayElement(i);
            }
            return Scriptable.NOT_FOUND;
        }
        Slot query = this.slotMap.query(null, i);
        if (query == null) {
            return Scriptable.NOT_FOUND;
        }
        return query.getValue(scriptable);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        if (putOwnProperty(str, scriptable, obj, Context.isCurrentContextStrict())) {
            return;
        }
        if (scriptable != this) {
            scriptable.put(str, scriptable, obj);
            return;
        }
        throw Kit.codeBug();
    }

    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        if (putOwnProperty(symbol, scriptable, obj, Context.isCurrentContextStrict())) {
            return;
        }
        if (scriptable != this) {
            ensureSymbolScriptable(scriptable).put(symbol, scriptable, obj);
            return;
        }
        throw Kit.codeBug();
    }

    public Object get(Symbol symbol, Scriptable scriptable) {
        Slot query = this.slotMap.query(symbol, 0);
        if (query == null) {
            return Scriptable.NOT_FOUND;
        }
        return query.getValue(scriptable);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        Slot query = this.slotMap.query(str, 0);
        if (query == null) {
            return Scriptable.NOT_FOUND;
        }
        return query.getValue(scriptable);
    }

    public boolean defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject) {
        checkPropertyDefinition(scriptableObject);
        return defineOwnProperty(context, obj, scriptableObject, true);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return getDefaultValue(this, cls);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return getIds(false, false);
    }

    public void defineProperty(Symbol symbol, Object obj, int i) {
        checkNotSealed(symbol, 0);
        put(symbol, this, obj);
        setAttributes(symbol, i);
    }

    public static void defineProperty(Scriptable scriptable, String str, Object obj, int i) {
        if (!(scriptable instanceof ScriptableObject)) {
            scriptable.put(str, scriptable, obj);
        } else {
            ((ScriptableObject) scriptable).defineProperty(str, obj, i);
        }
    }

    public void defineProperty(Scriptable scriptable, String str, int i, Callable callable, int i2, int i3) {
        LambdaFunction lambdaFunction = new LambdaFunction(scriptable, str, i, callable);
        lambdaFunction.setStandardPropertyAttributes(i3);
        defineProperty(str, lambdaFunction, i2);
    }

    public void defineProperty(String str, Class<?> cls, int i) {
        int length = str.length();
        if (length != 0) {
            char[] cArr = new char[length + 3];
            str.getChars(0, length, cArr, 3);
            cArr[3] = Character.toUpperCase(cArr[3]);
            cArr[0] = 'g';
            cArr[1] = 'e';
            cArr[2] = 't';
            String str2 = new String(cArr);
            cArr[0] = 's';
            String str3 = new String(cArr);
            Method[] methodList = FunctionObject.getMethodList(cls);
            Method findSingleMethod = FunctionObject.findSingleMethod(methodList, str2);
            Method findSingleMethod2 = FunctionObject.findSingleMethod(methodList, str3);
            if (findSingleMethod2 == null) {
                i |= 1;
            }
            int i2 = i;
            if (findSingleMethod2 == null) {
                findSingleMethod2 = null;
            }
            defineProperty(str, (Object) null, findSingleMethod, findSingleMethod2, i2);
            return;
        }
        p1a.g();
    }

    public void defineProperty(String str, Object obj, int i) {
        checkNotSealed(str, 0);
        put(str, this, obj);
        setAttributes(str, i);
    }

    public void defineProperty(String str, Supplier<Object> supplier, Consumer<Object> consumer, int i) {
        LambdaSlot lambdaSlot = (LambdaSlot) this.slotMap.compute(str, 0, new p1a(2));
        lambdaSlot.setAttributes(i);
        lambdaSlot.getter = supplier;
        lambdaSlot.setter = consumer;
    }

    public void defineProperty(final Context context, final String str, java.util.function.Function<Scriptable, Object> function, BiConsumer<Scriptable, Object> biConsumer, int i) {
        if (function == null && biConsumer == null) {
            throw ScriptRuntime.typeError("at least one of {getter, setter} is required");
        }
        final LambdaAccessorSlot createLambdaAccessorSlot = createLambdaAccessorSlot(str, 0, function, biConsumer, i);
        final ScriptableObject buildPropertyDescriptor = createLambdaAccessorSlot.buildPropertyDescriptor(context);
        checkPropertyDefinition(buildPropertyDescriptor);
        this.slotMap.compute(str, 0, new SlotMap.SlotComputer() { // from class: q1a
            @Override // org.mozilla.javascript.SlotMap.SlotComputer
            public final Slot compute(Object obj, int i2, Slot slot) {
                LambdaAccessorSlot lambda$defineProperty$1;
                lambda$defineProperty$1 = ScriptableObject.this.lambda$defineProperty$1(context, str, createLambdaAccessorSlot, buildPropertyDescriptor, obj, i2, slot);
                return lambda$defineProperty$1;
            }
        });
    }
}
