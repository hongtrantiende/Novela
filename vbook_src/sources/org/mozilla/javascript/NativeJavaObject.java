package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.mozilla.javascript.TopLevel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeJavaObject implements Scriptable, SymbolScriptable, Wrapper, Serializable {
    static final byte CONVERSION_NONE = 99;
    static final byte CONVERSION_NONTRIVIAL = 0;
    static final byte CONVERSION_TRIVIAL = 1;
    private static final int JSTYPE_BIGINT = 9;
    private static final int JSTYPE_BOOLEAN = 2;
    private static final int JSTYPE_JAVA_ARRAY = 7;
    private static final int JSTYPE_JAVA_CLASS = 5;
    private static final int JSTYPE_JAVA_OBJECT = 6;
    private static final int JSTYPE_NULL = 1;
    private static final int JSTYPE_NUMBER = 3;
    private static final int JSTYPE_OBJECT = 8;
    private static final int JSTYPE_STRING = 4;
    private static final int JSTYPE_UNDEFINED = 0;
    private static Method adapter_readAdapterObject = null;
    private static Method adapter_writeAdapterObject = null;
    private static final long serialVersionUID = -6948590651130498591L;
    private transient Map<String, FieldAndMethods> fieldAndMethods;
    protected transient boolean isAdapter;
    protected transient Object javaObject;
    protected transient JavaMembers members;
    protected Scriptable parent;
    protected Scriptable prototype;
    protected transient Class<?> staticType;
    private static Callable symbol_iterator = new ay7(20);
    private static final Object COERCED_INTERFACE_KEY = "Coerced Interface";

    static {
        Class<?>[] clsArr = new Class[2];
        Class<?> classOrNull = Kit.classOrNull("org.mozilla.javascript.JavaAdapter");
        if (classOrNull != null) {
            try {
                clsArr[0] = ScriptRuntime.ObjectClass;
                clsArr[1] = Kit.classOrNull("java.io.ObjectOutputStream");
                adapter_writeAdapterObject = classOrNull.getMethod("writeAdapterObject", clsArr);
                clsArr[0] = ScriptRuntime.ScriptableClass;
                clsArr[1] = Kit.classOrNull("java.io.ObjectInputStream");
                adapter_readAdapterObject = classOrNull.getMethod("readAdapterObject", clsArr);
            } catch (NoSuchMethodException unused) {
                adapter_writeAdapterObject = null;
                adapter_readAdapterObject = null;
            }
        }
    }

    public NativeJavaObject(Scriptable scriptable, Object obj, Class<?> cls, boolean z) {
        this.parent = scriptable;
        this.javaObject = obj;
        this.staticType = cls;
        this.isAdapter = z;
        initMembers();
    }

    public static boolean canConvert(Object obj, Class<?> cls) {
        if (getConversionWeight(obj, cls) < 99) {
            return true;
        }
        return false;
    }

    private static Object coerceToNumber(Class<?> cls, Object obj) {
        int i;
        float f;
        float f2;
        Class<?> cls2 = obj.getClass();
        if (cls != Character.TYPE && cls != ScriptRuntime.CharacterClass) {
            if (cls != ScriptRuntime.ObjectClass && cls != ScriptRuntime.DoubleClass && cls != Double.TYPE) {
                Class<?> cls3 = ScriptRuntime.BigIntegerClass;
                if (cls == cls3) {
                    if (cls2 != cls3) {
                        return ScriptRuntime.toBigInt(obj);
                    }
                } else {
                    Class<?> cls4 = ScriptRuntime.FloatClass;
                    if (cls != cls4 && cls != Float.TYPE) {
                        Class<?> cls5 = ScriptRuntime.IntegerClass;
                        if (cls != cls5 && cls != Integer.TYPE) {
                            Class<?> cls6 = ScriptRuntime.LongClass;
                            if (cls != cls6 && cls != Long.TYPE) {
                                Class<?> cls7 = ScriptRuntime.ShortClass;
                                if (cls != cls7 && cls != Short.TYPE) {
                                    Class<?> cls8 = ScriptRuntime.ByteClass;
                                    if (cls != cls8 && cls != Byte.TYPE) {
                                        return Double.valueOf(toDouble(obj));
                                    }
                                    if (cls2 != cls8) {
                                        return Byte.valueOf((byte) toInteger(obj, cls8, -128.0d, 127.0d));
                                    }
                                } else if (cls2 == cls7) {
                                    return obj;
                                } else {
                                    return Short.valueOf((short) toInteger(obj, cls7, -32768.0d, 32767.0d));
                                }
                            } else if (cls2 == cls6) {
                                return obj;
                            } else {
                                return Long.valueOf(toInteger(obj, cls6, Double.longBitsToDouble(-4332462841530417152L), Double.longBitsToDouble(4890909195324358655L)));
                            }
                        } else if (cls2 == cls5) {
                            return obj;
                        } else {
                            return Integer.valueOf((int) toInteger(obj, cls5, -2.147483648E9d, 2.147483647E9d));
                        }
                    } else if (cls2 == cls4) {
                        return obj;
                    } else {
                        double d = toDouble(obj);
                        if (!Double.isInfinite(d) && !Double.isNaN(d) && d != 0.0d) {
                            double abs = Math.abs(d);
                            if (abs < 1.401298464324817E-45d) {
                                if (i > 0) {
                                    f2 = nae.e;
                                } else {
                                    f2 = -0.0f;
                                }
                                return Float.valueOf(f2);
                            } else if (abs > 3.4028234663852886E38d) {
                                if (i > 0) {
                                    f = Float.POSITIVE_INFINITY;
                                } else {
                                    f = Float.NEGATIVE_INFINITY;
                                }
                                return Float.valueOf(f);
                            } else {
                                return Float.valueOf((float) d);
                            }
                        }
                        return Float.valueOf((float) d);
                    }
                }
                return obj;
            } else if (cls2 == ScriptRuntime.DoubleClass) {
                return obj;
            } else {
                return Double.valueOf(toDouble(obj));
            }
        }
        Class<?> cls9 = ScriptRuntime.CharacterClass;
        if (cls2 == cls9) {
            return obj;
        }
        return Character.valueOf((char) toInteger(obj, cls9, 0.0d, 65535.0d));
    }

    @Deprecated
    public static Object coerceType(Class<?> cls, Object obj) {
        return coerceTypeImpl(cls, obj);
    }

    public static Object coerceTypeImpl(Class<?> cls, Object obj) {
        Class<BigInteger> cls2;
        if (obj != null && obj.getClass() == cls) {
            return obj;
        }
        int jSTypeCode = getJSTypeCode(obj);
        Class<?> cls3 = Boolean.TYPE;
        switch (jSTypeCode) {
            case 0:
                if (cls == ScriptRuntime.StringClass || cls == ScriptRuntime.ObjectClass) {
                    return "undefined";
                }
                reportConversionError("undefined", cls);
                return obj;
            case 1:
                if (cls.isPrimitive()) {
                    reportConversionError(obj, cls);
                    return null;
                }
                return null;
            case 2:
                if (cls != cls3 && cls != ScriptRuntime.BooleanClass && cls != ScriptRuntime.ObjectClass) {
                    if (cls == ScriptRuntime.StringClass) {
                        return obj.toString();
                    }
                    reportConversionError(obj, cls);
                    break;
                }
                break;
            case 3:
            case 9:
                if (cls == ScriptRuntime.StringClass) {
                    return ScriptRuntime.toString(obj);
                }
                if (cls == ScriptRuntime.ObjectClass) {
                    Context currentContext = Context.getCurrentContext();
                    if (currentContext != null && currentContext.hasFeature(18) && Math.round(toDouble(obj)) == toDouble(obj)) {
                        return coerceToNumber(Long.TYPE, obj);
                    }
                    if (jSTypeCode == 9) {
                        cls2 = BigInteger.class;
                    } else {
                        cls2 = Double.TYPE;
                    }
                    return coerceToNumber(cls2, obj);
                } else if ((cls.isPrimitive() && cls != cls3) || ScriptRuntime.NumberClass.isAssignableFrom(cls)) {
                    return coerceToNumber(cls, obj);
                } else {
                    reportConversionError(obj, cls);
                    return obj;
                }
            case 4:
                if (cls != ScriptRuntime.StringClass && !cls.isInstance(obj)) {
                    if (cls != Character.TYPE && cls != ScriptRuntime.CharacterClass) {
                        if ((cls.isPrimitive() && cls != cls3) || ScriptRuntime.NumberClass.isAssignableFrom(cls)) {
                            return coerceToNumber(cls, obj);
                        }
                        reportConversionError(obj, cls);
                        return obj;
                    }
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() == 1) {
                        return Character.valueOf(charSequence.charAt(0));
                    }
                    return coerceToNumber(cls, obj);
                }
                return obj.toString();
            case 5:
                if (obj instanceof Wrapper) {
                    obj = ((Wrapper) obj).unwrap();
                }
                if (cls != ScriptRuntime.ClassClass && cls != ScriptRuntime.ObjectClass) {
                    if (cls == ScriptRuntime.StringClass) {
                        return obj.toString();
                    }
                    reportConversionError(obj, cls);
                }
                return obj;
            case 6:
            case 7:
                if (obj instanceof Wrapper) {
                    obj = ((Wrapper) obj).unwrap();
                }
                if (cls.isPrimitive()) {
                    if (cls == cls3) {
                        reportConversionError(obj, cls);
                    }
                    return coerceToNumber(cls, obj);
                } else if (cls == ScriptRuntime.StringClass) {
                    return obj.toString();
                } else {
                    if (cls.isInstance(obj)) {
                        return obj;
                    }
                    reportConversionError(obj, cls);
                    return obj;
                }
            case 8:
                if (cls == ScriptRuntime.StringClass) {
                    return ScriptRuntime.toString(obj);
                }
                if (cls.isPrimitive()) {
                    if (cls == cls3) {
                        reportConversionError(obj, cls);
                    }
                    return coerceToNumber(cls, obj);
                } else if (!cls.isInstance(obj)) {
                    if (cls == ScriptRuntime.DateClass && (obj instanceof NativeDate)) {
                        return new Date((long) ((NativeDate) obj).getJSTimeValue());
                    }
                    if (cls.isArray() && (obj instanceof NativeArray)) {
                        NativeArray nativeArray = (NativeArray) obj;
                        long length = nativeArray.getLength();
                        Class<?> componentType = cls.getComponentType();
                        Object newInstance = Array.newInstance(componentType, (int) length);
                        for (int i = 0; i < length; i++) {
                            try {
                                Array.set(newInstance, i, coerceTypeImpl(componentType, nativeArray.get(i, nativeArray)));
                            } catch (EvaluatorException unused) {
                                reportConversionError(obj, cls);
                            }
                        }
                        return newInstance;
                    } else if (obj instanceof Wrapper) {
                        Object unwrap = ((Wrapper) obj).unwrap();
                        if (cls.isInstance(unwrap)) {
                            return unwrap;
                        }
                        reportConversionError(unwrap, cls);
                        return unwrap;
                    } else if (cls.isInterface() && ((obj instanceof NativeObject) || ((obj instanceof Callable) && (obj instanceof ScriptableObject)))) {
                        return createInterfaceAdapter(cls, (ScriptableObject) obj);
                    } else {
                        reportConversionError(obj, cls);
                        return obj;
                    }
                }
                break;
        }
        return obj;
    }

    public static Object createInterfaceAdapter(Class<?> cls, ScriptableObject scriptableObject) {
        Object makeHashKeyFromPair = Kit.makeHashKeyFromPair(COERCED_INTERFACE_KEY, cls);
        Object associatedValue = scriptableObject.getAssociatedValue(makeHashKeyFromPair);
        if (associatedValue != null) {
            return associatedValue;
        }
        return scriptableObject.associateValue(makeHashKeyFromPair, InterfaceAdapter.create(Context.getContext(), cls, scriptableObject));
    }

    public static int getConversionWeight(Object obj, Class<?> cls) {
        int jSTypeCode = getJSTypeCode(obj);
        Class<?> cls2 = Boolean.TYPE;
        switch (jSTypeCode) {
            case 0:
                if (cls == ScriptRuntime.StringClass || cls == ScriptRuntime.ObjectClass) {
                    return 1;
                }
                break;
            case 1:
                if (!cls.isPrimitive()) {
                    return 1;
                }
                break;
            case 2:
                if (cls == cls2) {
                    return 1;
                }
                if (cls == ScriptRuntime.BooleanClass) {
                    return 2;
                }
                if (cls == ScriptRuntime.ObjectClass) {
                    return 3;
                }
                if (cls == ScriptRuntime.StringClass) {
                    return 4;
                }
                break;
            case 3:
            case 9:
                if (cls.isPrimitive()) {
                    if (cls == Double.TYPE) {
                        return 1;
                    }
                    if (cls != cls2) {
                        return getSizeRank(cls) + 1;
                    }
                } else if (cls == ScriptRuntime.StringClass) {
                    return 9;
                } else {
                    if (cls == ScriptRuntime.BigIntegerClass) {
                        return 10;
                    }
                    if (cls == ScriptRuntime.ObjectClass) {
                        return 11;
                    }
                    if (ScriptRuntime.NumberClass.isAssignableFrom(cls)) {
                        return 2;
                    }
                }
                break;
            case 4:
                if (cls == ScriptRuntime.StringClass) {
                    return 1;
                }
                if (cls.isInstance(obj)) {
                    return 2;
                }
                if (cls.isPrimitive()) {
                    if (cls == Character.TYPE) {
                        return 3;
                    }
                    if (cls != cls2) {
                        return 4;
                    }
                }
                break;
            case 5:
                if (cls == ScriptRuntime.ClassClass) {
                    return 1;
                }
                if (cls == ScriptRuntime.ObjectClass) {
                    return 3;
                }
                if (cls == ScriptRuntime.StringClass) {
                    return 4;
                }
                break;
            case 6:
            case 7:
                if (obj instanceof Wrapper) {
                    obj = ((Wrapper) obj).unwrap();
                }
                if (cls.isInstance(obj)) {
                    return 0;
                }
                if (cls == ScriptRuntime.StringClass) {
                    return 2;
                }
                if (!cls.isPrimitive() || cls == cls2 || jSTypeCode == 7) {
                    return 99;
                }
                return getSizeRank(cls) + 2;
            case 8:
                Class<?> cls3 = ScriptRuntime.ObjectClass;
                if (cls != cls3 && cls.isInstance(obj)) {
                    return 1;
                }
                if (cls.isArray()) {
                    if (obj instanceof NativeArray) {
                        return 2;
                    }
                } else if (cls == cls3) {
                    return 3;
                } else {
                    if (cls == ScriptRuntime.StringClass) {
                        return 4;
                    }
                    if (cls == ScriptRuntime.DateClass) {
                        if (obj instanceof NativeDate) {
                            return 1;
                        }
                    } else if (cls.isInterface()) {
                        if (obj instanceof NativeFunction) {
                            return 1;
                        }
                        if (obj instanceof NativeObject) {
                            return 2;
                        }
                        return 12;
                    } else if (cls.isPrimitive() && cls != cls2) {
                        return getSizeRank(cls) + 4;
                    }
                }
                break;
        }
        return 99;
    }

    private static int getJSTypeCode(Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj == Undefined.instance) {
            return 0;
        }
        if (obj instanceof CharSequence) {
            return 4;
        }
        if (obj instanceof BigInteger) {
            return 9;
        }
        if (obj instanceof Number) {
            return 3;
        }
        if (obj instanceof Boolean) {
            return 2;
        }
        if (obj instanceof Scriptable) {
            if (obj instanceof NativeJavaClass) {
                return 5;
            }
            if (obj instanceof NativeJavaArray) {
                return 7;
            }
            if (obj instanceof Wrapper) {
                return 6;
            }
            return 8;
        } else if (obj instanceof Class) {
            return 5;
        } else {
            if (!obj.getClass().isArray()) {
                return 6;
            }
            return 7;
        }
    }

    public static int getSizeRank(Class<?> cls) {
        if (cls == Double.TYPE) {
            return 1;
        }
        if (cls == Float.TYPE) {
            return 2;
        }
        if (cls == Long.TYPE) {
            return 3;
        }
        if (cls == Integer.TYPE) {
            return 4;
        }
        if (cls == Short.TYPE) {
            return 5;
        }
        if (cls == Character.TYPE) {
            return 6;
        }
        if (cls == Byte.TYPE) {
            return 7;
        }
        if (cls == Boolean.TYPE) {
            return 99;
        }
        return 8;
    }

    public static void init(ScriptableObject scriptableObject, boolean z) {
        JavaIterableIterator.init(scriptableObject, z);
    }

    public static /* synthetic */ Object lambda$static$0(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (scriptable2 instanceof NativeJavaObject) {
            Object obj = ((NativeJavaObject) scriptable2).javaObject;
            if (obj instanceof Iterable) {
                return new JavaIterableIterator(scriptable, (Iterable) obj);
            }
            throw ScriptRuntime.typeErrorById("msg.incompat.call", SymbolKey.ITERATOR);
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", SymbolKey.ITERATOR);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        boolean readBoolean = objectInputStream.readBoolean();
        this.isAdapter = readBoolean;
        if (readBoolean) {
            Method method = adapter_readAdapterObject;
            if (method != null) {
                try {
                    this.javaObject = method.invoke(null, this, objectInputStream);
                } catch (Exception unused) {
                    throw new IOException();
                }
            } else {
                throw new ClassNotFoundException();
            }
        } else {
            this.javaObject = objectInputStream.readObject();
        }
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.staticType = Class.forName(str);
        } else {
            this.staticType = null;
        }
        initMembers();
    }

    public static void reportConversionError(Object obj, Class<?> cls) {
        throw Context.reportRuntimeErrorById("msg.conversion.not.allowed", String.valueOf(obj), JavaMembers.javaSignature(cls));
    }

    private static double toDouble(Object obj) {
        Method method;
        Class cls = Double.TYPE;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            return ScriptRuntime.toNumber((String) obj);
        }
        if (obj instanceof Scriptable) {
            if (obj instanceof Wrapper) {
                return toDouble(((Wrapper) obj).unwrap());
            }
            return ScriptRuntime.toNumber(obj);
        }
        try {
            method = obj.getClass().getMethod("doubleValue", null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null) {
            try {
                return ((Number) method.invoke(obj, null)).doubleValue();
            } catch (IllegalAccessException unused2) {
                reportConversionError(obj, cls);
            } catch (InvocationTargetException unused3) {
                reportConversionError(obj, cls);
            }
        }
        return ScriptRuntime.toNumber(obj.toString());
    }

    private static long toInteger(Object obj, Class<?> cls, double d, double d2) {
        double ceil;
        double d3 = toDouble(obj);
        if (Double.isInfinite(d3) || Double.isNaN(d3)) {
            reportConversionError(ScriptRuntime.toString(obj), cls);
        }
        if (d3 > 0.0d) {
            ceil = Math.floor(d3);
        } else {
            ceil = Math.ceil(d3);
        }
        if (ceil < d || ceil > d2) {
            reportConversionError(ScriptRuntime.toString(obj), cls);
        }
        return (long) ceil;
    }

    @Deprecated
    public static Object wrap(Scriptable scriptable, Object obj, Class<?> cls) {
        Context context = Context.getContext();
        return context.getWrapFactory().wrap(context, scriptable, obj, cls);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeBoolean(this.isAdapter);
        if (this.isAdapter) {
            Method method = adapter_writeAdapterObject;
            if (method != null) {
                try {
                    method.invoke(null, this.javaObject, objectOutputStream);
                } catch (Exception unused) {
                    throw new IOException();
                }
            } else {
                throw new IOException();
            }
        } else {
            objectOutputStream.writeObject(this.javaObject);
        }
        Class<?> cls = this.staticType;
        if (cls != null) {
            objectOutputStream.writeObject(cls.getName());
        } else {
            objectOutputStream.writeObject(null);
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass()) && Objects.equals(((NativeJavaObject) obj).javaObject, this.javaObject)) {
            return true;
        }
        return false;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        FieldAndMethods fieldAndMethods;
        Map<String, FieldAndMethods> map = this.fieldAndMethods;
        if (map != null && (fieldAndMethods = map.get(str)) != null) {
            return fieldAndMethods;
        }
        return this.members.get(this, str, this.javaObject, false);
    }

    @Override // org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "JavaObject";
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        String str;
        if (cls == null) {
            Object obj = this.javaObject;
            if (obj instanceof Boolean) {
                cls = ScriptRuntime.BooleanClass;
            }
            if (obj instanceof Number) {
                cls = ScriptRuntime.NumberClass;
            }
        }
        if (cls != null && cls != ScriptRuntime.StringClass) {
            if (cls == ScriptRuntime.BooleanClass) {
                str = "booleanValue";
            } else if (cls == ScriptRuntime.NumberClass) {
                str = "doubleValue";
            } else {
                throw Context.reportRuntimeErrorById("msg.default.value", new Object[0]);
            }
            Object obj2 = get(str, this);
            if (obj2 instanceof Function) {
                Function function = (Function) obj2;
                return function.call(Context.getContext(), function.getParentScope(), this, ScriptRuntime.emptyArgs);
            }
            if (cls == ScriptRuntime.NumberClass) {
                Object obj3 = this.javaObject;
                if (obj3 instanceof Boolean) {
                    if (((Boolean) obj3).booleanValue()) {
                        return ScriptRuntime.wrapNumber(1.0d);
                    }
                    return ScriptRuntime.zeroObj;
                }
            }
            return this.javaObject.toString();
        }
        return this.javaObject.toString();
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return this.members.getIds(false);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getParentScope() {
        return this.parent;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        Scriptable scriptable = this.prototype;
        if (scriptable == null && (this.javaObject instanceof String)) {
            return TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(this.parent), TopLevel.Builtins.String);
        }
        return scriptable;
    }

    public boolean has(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol) && (this.javaObject instanceof Iterable)) {
            return true;
        }
        return false;
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        return false;
    }

    public int hashCode() {
        Object obj = this.javaObject;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void initMembers() {
        Class<?> cls;
        Object obj = this.javaObject;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = this.staticType;
        }
        JavaMembers lookupClass = JavaMembers.lookupClass(this.parent, cls, this.staticType, this.isAdapter);
        this.members = lookupClass;
        this.fieldAndMethods = lookupClass.getFieldAndMethodsObjects(this, this.javaObject, false);
    }

    @Override // org.mozilla.javascript.SymbolScriptable
    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        String obj2 = symbol.toString();
        if (this.prototype != null && !this.members.has(obj2, false)) {
            Scriptable scriptable2 = this.prototype;
            if (scriptable2 instanceof SymbolScriptable) {
                ((SymbolScriptable) scriptable2).put(symbol, scriptable2, obj);
                return;
            }
            return;
        }
        this.members.put(this, obj2, this.javaObject, obj, false);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setParentScope(Scriptable scriptable) {
        this.parent = scriptable;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setPrototype(Scriptable scriptable) {
        this.prototype = scriptable;
    }

    public Object unwrap() {
        return this.javaObject;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(String str) {
    }

    public void delete(Symbol symbol) {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class JavaIterableIterator extends ES6Iterator {
        private static final String ITERATOR_TAG = "JavaIterableIterator";
        private static final long serialVersionUID = 1;
        private Iterator iterator;

        public JavaIterableIterator(Scriptable scriptable, Iterable iterable) {
            super(scriptable, ITERATOR_TAG);
            this.iterator = iterable.iterator();
        }

        public static void init(ScriptableObject scriptableObject, boolean z) {
            ES6Iterator.init(scriptableObject, z, new JavaIterableIterator(), ITERATOR_TAG);
        }

        @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
        public String getClassName() {
            return "Java Iterable Iterator";
        }

        @Override // org.mozilla.javascript.ES6Iterator
        public String getTag() {
            return ITERATOR_TAG;
        }

        @Override // org.mozilla.javascript.ES6Iterator
        public boolean isDone(Context context, Scriptable scriptable) {
            return !this.iterator.hasNext();
        }

        @Override // org.mozilla.javascript.ES6Iterator
        public Object nextValue(Context context, Scriptable scriptable) {
            Class<?> cls;
            if (!this.iterator.hasNext()) {
                return Undefined.instance;
            }
            Object next = this.iterator.next();
            WrapFactory wrapFactory = context.getWrapFactory();
            if (next == null) {
                cls = null;
            } else {
                cls = next.getClass();
            }
            return wrapFactory.wrap(context, this, next, cls);
        }

        private JavaIterableIterator() {
        }
    }

    public NativeJavaObject(Scriptable scriptable, Object obj, Class<?> cls) {
        this(scriptable, obj, cls, false);
    }

    public NativeJavaObject() {
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return this.members.has(str, false);
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        return false;
    }

    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol) && (this.javaObject instanceof Iterable)) {
            return symbol_iterator;
        }
        return Scriptable.NOT_FOUND;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        throw this.members.reportMemberNotFound(Integer.toString(i));
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(int i) {
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        if (this.prototype != null && !this.members.has(str, false)) {
            Scriptable scriptable2 = this.prototype;
            scriptable2.put(str, scriptable2, obj);
            return;
        }
        this.members.put(this, str, this.javaObject, obj, false);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        throw this.members.reportMemberNotFound(Integer.toString(i));
    }
}
