package org.mozilla.javascript;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.mozilla.javascript.ArrayLikeAbstractOperations;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.xml.XMLObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeArray extends IdScriptableObject implements List {
    private static final int ConstructorId_concat = -13;
    private static final int ConstructorId_every = -17;
    private static final int ConstructorId_filter = -18;
    private static final int ConstructorId_find = -22;
    private static final int ConstructorId_findIndex = -23;
    private static final int ConstructorId_findLast = -24;
    private static final int ConstructorId_findLastIndex = -25;
    private static final int ConstructorId_forEach = -19;
    private static final int ConstructorId_from = -30;
    private static final int ConstructorId_indexOf = -15;
    private static final int ConstructorId_isArray = -28;
    private static final int ConstructorId_join = -5;
    private static final int ConstructorId_lastIndexOf = -16;
    private static final int ConstructorId_map = -20;
    private static final int ConstructorId_of = -29;
    private static final int ConstructorId_pop = -9;
    private static final int ConstructorId_push = -8;
    private static final int ConstructorId_reduce = -26;
    private static final int ConstructorId_reduceRight = -27;
    private static final int ConstructorId_reverse = -6;
    private static final int ConstructorId_shift = -10;
    private static final int ConstructorId_slice = -14;
    private static final int ConstructorId_some = -21;
    private static final int ConstructorId_sort = -7;
    private static final int ConstructorId_splice = -12;
    private static final int ConstructorId_unshift = -11;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final double GROW_FACTOR = 1.5d;
    private static final int Id_at = 34;
    private static final int Id_concat = 13;
    private static final int Id_constructor = 1;
    private static final int Id_copyWithin = 33;
    private static final int Id_entries = 31;
    private static final int Id_every = 17;
    private static final int Id_fill = 28;
    private static final int Id_filter = 18;
    private static final int Id_find = 22;
    private static final int Id_findIndex = 23;
    private static final int Id_findLast = 24;
    private static final int Id_findLastIndex = 25;
    private static final int Id_flat = 35;
    private static final int Id_flatMap = 36;
    private static final int Id_forEach = 19;
    private static final int Id_includes = 32;
    private static final int Id_indexOf = 15;
    private static final int Id_join = 5;
    private static final int Id_keys = 29;
    private static final int Id_lastIndexOf = 16;
    private static final int Id_length = 1;
    private static final int Id_map = 20;
    private static final int Id_pop = 9;
    private static final int Id_push = 8;
    private static final int Id_reduce = 26;
    private static final int Id_reduceRight = 27;
    private static final int Id_reverse = 6;
    private static final int Id_shift = 10;
    private static final int Id_slice = 14;
    private static final int Id_some = 21;
    private static final int Id_sort = 7;
    private static final int Id_splice = 12;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toReversed = 37;
    private static final int Id_toSorted = 38;
    private static final int Id_toSource = 4;
    private static final int Id_toSpliced = 39;
    private static final int Id_toString = 2;
    private static final int Id_unshift = 11;
    private static final int Id_values = 30;
    private static final int Id_with = 40;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PRE_GROW_SIZE = 1431655764;
    private static final int MAX_PROTOTYPE_ID = 41;
    private static final int SymbolId_unscopables = 41;
    private static final long serialVersionUID = 7331366857676127338L;
    private Object[] dense;
    private boolean denseOnly;
    private long length;
    private int lengthAttr;
    private transient int modCount;
    private static final Object ARRAY_TAG = "Array";
    private static final Long NEGATIVE_ONE = -1L;
    private static final String[] UNSCOPABLES = {"at", "copyWithin", "entries", "fill", "find", "findIndex", "findLast", "findLastIndex", "flat", "flatMap", "includes", "keys", "toReversed", "toSorted", "toSpliced", "values"};
    private static int maximumInitialCapacity = 10000;

    public NativeArray(long j) {
        boolean z;
        this.lengthAttr = 6;
        if (j <= maximumInitialCapacity) {
            z = true;
        } else {
            z = false;
        }
        this.denseOnly = z;
        if (z) {
            int i = (int) j;
            Object[] objArr = new Object[i < 10 ? 10 : i];
            this.dense = objArr;
            Arrays.fill(objArr, Scriptable.NOT_FOUND);
        }
        this.length = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.mozilla.javascript.Scriptable callConstructorOrCreateArray(org.mozilla.javascript.Context r2, org.mozilla.javascript.Scriptable r3, org.mozilla.javascript.Scriptable r4, long r5, boolean r7) {
        /*
            boolean r0 = r4 instanceof org.mozilla.javascript.Constructable
            if (r0 == 0) goto L2f
            if (r7 != 0) goto L12
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto Ld
            goto L12
        Ld:
            java.lang.Object[] r7 = org.mozilla.javascript.ScriptRuntime.emptyArgs     // Catch: org.mozilla.javascript.EcmaError -> L10
            goto L1a
        L10:
            r4 = move-exception
            goto L21
        L12:
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: org.mozilla.javascript.EcmaError -> L10
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: org.mozilla.javascript.EcmaError -> L10
        L1a:
            org.mozilla.javascript.Constructable r4 = (org.mozilla.javascript.Constructable) r4     // Catch: org.mozilla.javascript.EcmaError -> L10
            org.mozilla.javascript.Scriptable r4 = r4.construct(r2, r3, r7)     // Catch: org.mozilla.javascript.EcmaError -> L10
            goto L30
        L21:
            java.lang.String r7 = "TypeError"
            java.lang.String r0 = r4.getName()
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L2e
            goto L2f
        L2e:
            throw r4
        L2f:
            r4 = 0
        L30:
            if (r4 != 0) goto L40
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L3b
            r4 = 0
            goto L3c
        L3b:
            int r4 = (int) r5
        L3c:
            org.mozilla.javascript.Scriptable r4 = r2.newArray(r3, r4)
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.callConstructorOrCreateArray(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, long, boolean):org.mozilla.javascript.Scriptable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkModCount(int i) {
        if (this.modCount == i) {
            return;
        }
        vs.f();
    }

    private static long concatSpreadArg(Context context, Scriptable scriptable, Scriptable scriptable2, long j) {
        long lengthProperty = getLengthProperty(context, scriptable2);
        long j2 = lengthProperty + j;
        if (j2 <= 9.007199254740991E15d) {
            if (j2 <= 2147483647L && (scriptable instanceof NativeArray)) {
                NativeArray nativeArray = (NativeArray) scriptable;
                if (nativeArray.denseOnly && (scriptable2 instanceof NativeArray)) {
                    NativeArray nativeArray2 = (NativeArray) scriptable2;
                    if (nativeArray2.denseOnly) {
                        nativeArray.ensureCapacity((int) j2);
                        System.arraycopy(nativeArray2.dense, 0, nativeArray.dense, (int) j, (int) lengthProperty);
                        return j2;
                    }
                }
            }
            long j3 = 0;
            while (j3 < lengthProperty) {
                Object rawElem = ArrayLikeAbstractOperations.getRawElem(scriptable2, j3);
                if (rawElem != Scriptable.NOT_FOUND) {
                    ArrayLikeAbstractOperations.defineElem(context, scriptable, j, rawElem);
                }
                j3++;
                j++;
            }
            return j2;
        }
        throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", Long.valueOf(j2));
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object obj) {
        Scriptable parentScope = getParentScope();
        if (parentScope != null) {
            this = parentScope;
        }
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, this, TopLevel.Builtins.Object);
        nativeObject.defineProperty(ES6Iterator.VALUE_PROPERTY, obj, 0);
        Boolean bool = Boolean.TRUE;
        nativeObject.defineProperty("writable", bool, 0);
        nativeObject.defineProperty("enumerable", bool, 0);
        nativeObject.defineProperty("configurable", bool, 0);
        return nativeObject;
    }

    private static void defineElemOrThrow(Context context, Scriptable scriptable, long j, Object obj) {
        if (j <= 9.007199254740991E15d) {
            ArrayLikeAbstractOperations.defineElem(context, scriptable, j, obj);
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", String.valueOf(j));
    }

    private static void deleteElem(Scriptable scriptable, long j) {
        int i = (int) j;
        if (i == j) {
            scriptable.delete(i);
        } else {
            scriptable.delete(Long.toString(j));
        }
    }

    private static long doConcat(Context context, Scriptable scriptable, Scriptable scriptable2, Object obj, long j) {
        if (isConcatSpreadable(context, scriptable, obj)) {
            return concatSpreadArg(context, scriptable2, (Scriptable) obj, j);
        }
        ArrayLikeAbstractOperations.defineElem(context, scriptable2, j, obj);
        return j + 1;
    }

    private boolean ensureCapacity(int i) {
        Object[] objArr = this.dense;
        if (i > objArr.length) {
            if (i > MAX_PRE_GROW_SIZE) {
                this.denseOnly = false;
                return false;
            }
            int max = Math.max(i, (int) (objArr.length * GROW_FACTOR));
            Object[] objArr2 = new Object[max];
            Object[] objArr3 = this.dense;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            Arrays.fill(objArr2, this.dense.length, max, Scriptable.NOT_FOUND);
            this.dense = objArr2;
            return true;
        }
        return true;
    }

    private static Scriptable flat(Context context, Scriptable scriptable, Scriptable scriptable2, double d) {
        long j;
        long lengthProperty = getLengthProperty(context, scriptable2);
        Scriptable newArray = context.newArray(scriptable, 0);
        long j2 = 0;
        long j3 = 0;
        while (j2 < lengthProperty) {
            Object rawElem = ArrayLikeAbstractOperations.getRawElem(scriptable2, j2);
            if (rawElem == Scriptable.NOT_FOUND) {
                j = 1;
            } else if (d >= 1.0d && js_isArray(rawElem)) {
                Scriptable flat = flat(context, scriptable, (Scriptable) rawElem, d - 1.0d);
                long lengthProperty2 = getLengthProperty(context, flat);
                long j4 = 0;
                j = 1;
                while (j4 < lengthProperty2) {
                    defineElemOrThrow(context, newArray, j3, ArrayLikeAbstractOperations.getRawElem(flat, j4));
                    j4++;
                    j3++;
                }
            } else {
                j = 1;
                defineElemOrThrow(context, newArray, j3, rawElem);
                j3++;
            }
            j2 += j;
        }
        setLengthProperty(context, newArray, j3);
        return newArray;
    }

    private static Object getElem(Context context, Scriptable scriptable, long j) {
        Object rawElem = ArrayLikeAbstractOperations.getRawElem(scriptable, j);
        if (rawElem != Scriptable.NOT_FOUND) {
            return rawElem;
        }
        return Undefined.instance;
    }

    public static long getLengthProperty(Context context, Scriptable scriptable) {
        if (scriptable instanceof NativeString) {
            return ((NativeString) scriptable).getLength();
        }
        if (scriptable instanceof NativeArray) {
            return ((NativeArray) scriptable).getLength();
        }
        if (scriptable instanceof XMLObject) {
            return ((Number) ((Callable) scriptable.get("length", scriptable)).call(context, scriptable, scriptable, ScriptRuntime.emptyArgs)).longValue();
        }
        Object property = ScriptableObject.getProperty(scriptable, "length");
        if (property == Scriptable.NOT_FOUND) {
            return 0L;
        }
        double number = ScriptRuntime.toNumber(property);
        if (number > 9.007199254740991E15d) {
            return 9007199254740991L;
        }
        if (number < 0.0d) {
            return 0L;
        }
        return (long) number;
    }

    public static int getMaximumInitialCapacity() {
        return maximumInitialCapacity;
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        IdFunctionObject exportAsJSClass = new NativeArray(0L).exportAsJSClass(41, scriptable, z);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, exportAsJSClass);
        ScriptRuntimeES6.addSymbolUnscopables(context, scriptable, exportAsJSClass);
    }

    private static boolean isConcatSpreadable(Context context, Scriptable scriptable, Object obj) {
        Object property;
        if ((obj instanceof Scriptable) && (property = ScriptableObject.getProperty((Scriptable) obj, SymbolKey.IS_CONCAT_SPREADABLE)) != Scriptable.NOT_FOUND && !Undefined.isUndefined(property)) {
            return ScriptRuntime.toBoolean(property);
        }
        if (context.getLanguageVersion() < 200 && ScriptRuntime.instanceOf(obj, ScriptRuntime.getExistingCtor(context, scriptable, "Array"), context)) {
            return true;
        }
        return js_isArray(obj);
    }

    private static Object jsConstructor(Context context, Scriptable scriptable, Object[] objArr) {
        if (objArr.length == 0) {
            return new NativeArray(0L);
        }
        if (context.getLanguageVersion() == 120) {
            return new NativeArray(objArr);
        }
        Object obj = objArr[0];
        if (objArr.length <= 1 && (obj instanceof Number)) {
            long uint32 = ScriptRuntime.toUint32(obj);
            if (uint32 == ((Number) obj).doubleValue()) {
                return new NativeArray(uint32);
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        return new NativeArray(objArr);
    }

    private static Object js_at(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        long j;
        long lengthProperty = getLengthProperty(context, ScriptRuntime.toObject(context, scriptable, scriptable2));
        if (objArr.length >= 1) {
            j = (long) ScriptRuntime.toInteger(objArr[0]);
        } else {
            j = 0;
        }
        if (j < 0) {
            j += lengthProperty;
        }
        if (j >= 0 && j < lengthProperty) {
            return getElem(context, scriptable2, j);
        }
        return Undefined.instance;
    }

    private static Scriptable js_concat(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        Scriptable newArray = context.newArray(topLevelScope, 0);
        long doConcat = doConcat(context, topLevelScope, newArray, object, 0L);
        for (Object obj : objArr) {
            doConcat = doConcat(context, topLevelScope, newArray, obj, doConcat);
        }
        setLengthProperty(context, newArray, doConcat);
        return newArray;
    }

    private static Object js_copyWithin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        long min;
        Object obj2;
        long min2;
        long j;
        long min3;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        int i = 1;
        if (objArr.length >= 1) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        long integer = (long) ScriptRuntime.toInteger(obj);
        long j2 = 0;
        if (integer < 0) {
            min = Math.max(integer + lengthProperty, 0L);
        } else {
            min = Math.min(integer, lengthProperty);
        }
        if (objArr.length >= 2) {
            obj2 = objArr[1];
        } else {
            obj2 = Undefined.instance;
        }
        long integer2 = (long) ScriptRuntime.toInteger(obj2);
        if (integer2 < 0) {
            min2 = Math.max(integer2 + lengthProperty, 0L);
        } else {
            min2 = Math.min(integer2, lengthProperty);
        }
        if (objArr.length >= 3 && !Undefined.isUndefined(objArr[2])) {
            j = (long) ScriptRuntime.toInteger(objArr[2]);
        } else {
            j = lengthProperty;
        }
        if (j < 0) {
            min3 = Math.max(j + lengthProperty, 0L);
        } else {
            min3 = Math.min(j, lengthProperty);
        }
        long min4 = Math.min(min3 - min2, lengthProperty - min);
        if (min2 < min) {
            long j3 = min2 + min4;
            if (min < j3) {
                min2 = j3 - 1;
                min = (min + min4) - 1;
                i = -1;
            }
        }
        if ((object instanceof NativeArray) && min4 <= 2147483647L) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly) {
                while (min4 > j2) {
                    Object[] objArr2 = nativeArray.dense;
                    objArr2[(int) min] = objArr2[(int) min2];
                    long j4 = j2;
                    long j5 = i;
                    min2 += j5;
                    min += j5;
                    min4--;
                    j2 = j4;
                }
                return scriptable2;
            }
        }
        while (min4 > 0) {
            Object rawElem = ArrayLikeAbstractOperations.getRawElem(object, min2);
            if (rawElem != Scriptable.NOT_FOUND && !Undefined.isUndefined(rawElem)) {
                setElem(context, object, min, rawElem);
            } else {
                deleteElem(object, min);
            }
            long j6 = i;
            min2 += j6;
            min += j6;
            min4--;
        }
        return scriptable2;
    }

    private static Object js_fill(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        long j;
        long min;
        long j2;
        long min2;
        Object obj;
        long lengthProperty = getLengthProperty(context, ScriptRuntime.toObject(context, scriptable, scriptable2));
        if (objArr.length >= 2) {
            j = (long) ScriptRuntime.toInteger(objArr[1]);
        } else {
            j = 0;
        }
        if (j < 0) {
            min = Math.max(j + lengthProperty, 0L);
        } else {
            min = Math.min(j, lengthProperty);
        }
        if (objArr.length >= 3 && !Undefined.isUndefined(objArr[2])) {
            j2 = (long) ScriptRuntime.toInteger(objArr[2]);
        } else {
            j2 = lengthProperty;
        }
        if (j2 < 0) {
            min2 = Math.max(lengthProperty + j2, 0L);
        } else {
            min2 = Math.min(j2, lengthProperty);
        }
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        while (min < min2) {
            setRawElem(context, scriptable2, min, obj);
            min++;
        }
        return scriptable2;
    }

    private static Object js_flat(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (objArr.length >= 1 && !Undefined.isUndefined(objArr[0])) {
            d = ScriptRuntime.toInteger(objArr[0]);
        } else {
            d = 1.0d;
        }
        return flat(context, scriptable, object, d);
    }

    private static Object js_flatMap(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Scriptable scriptable3;
        Object obj2;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        Function callbackArg = ArrayLikeAbstractOperations.getCallbackArg(context, obj);
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(callbackArg);
        if (objArr.length >= 2 && (obj2 = objArr[1]) != null && obj2 != Undefined.instance) {
            scriptable3 = ScriptRuntime.toObject(context, scriptable, obj2);
        } else {
            scriptable3 = topLevelScope;
        }
        long lengthProperty = getLengthProperty(context, object);
        Scriptable newArray = context.newArray(scriptable, 0);
        long j = 0;
        for (long j2 = 0; j2 < lengthProperty; j2++) {
            Object rawElem = ArrayLikeAbstractOperations.getRawElem(object, j2);
            if (rawElem != Scriptable.NOT_FOUND) {
                Object call = callbackArg.call(context, topLevelScope, scriptable3, new Object[]{rawElem, Long.valueOf(j2), object});
                if (js_isArray(call)) {
                    Scriptable scriptable4 = (Scriptable) call;
                    long lengthProperty2 = getLengthProperty(context, scriptable4);
                    long j3 = 0;
                    while (j3 < lengthProperty2) {
                        defineElemOrThrow(context, newArray, j, ArrayLikeAbstractOperations.getRawElem(scriptable4, j3));
                        j3++;
                        j++;
                    }
                } else {
                    defineElemOrThrow(context, newArray, j, call);
                    j++;
                }
            }
        }
        setLengthProperty(context, newArray, j);
        return newArray;
    }

    private static Object js_from(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object obj2;
        Function function;
        if (objArr.length >= 1) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        Scriptable object = ScriptRuntime.toObject(scriptable, obj);
        if (objArr.length >= 2) {
            obj2 = objArr[1];
        } else {
            obj2 = Undefined.instance;
        }
        Scriptable scriptable3 = Undefined.SCRIPTABLE_UNDEFINED;
        boolean isUndefined = Undefined.isUndefined(obj2);
        if (!isUndefined) {
            if (obj2 instanceof Function) {
                function = (Function) obj2;
                if (objArr.length >= 3) {
                    scriptable3 = ScriptableObject.ensureScriptable(objArr[2]);
                }
            } else {
                throw ScriptRuntime.typeErrorById("msg.map.function.not", new Object[0]);
            }
        } else {
            function = null;
        }
        Function function2 = function;
        Scriptable scriptable4 = scriptable3;
        Object property = ScriptableObject.getProperty(object, SymbolKey.ITERATOR);
        long j = 0;
        if (!(object instanceof NativeArray) && property != Scriptable.NOT_FOUND && !Undefined.isUndefined(property)) {
            Object callIterator = ScriptRuntime.callIterator(object, context, scriptable);
            if (!Undefined.isUndefined(callIterator)) {
                Scriptable callConstructorOrCreateArray = callConstructorOrCreateArray(context, scriptable, scriptable2, 0L, false);
                IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable(context, scriptable, callIterator);
                try {
                    Iterator<Object> it = iteratorLikeIterable.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!isUndefined) {
                            next = function2.call(context, scriptable, scriptable4, new Object[]{next, Long.valueOf(j)});
                        }
                        ArrayLikeAbstractOperations.defineElem(context, callConstructorOrCreateArray, j, next);
                        j++;
                    }
                    iteratorLikeIterable.close();
                    setLengthProperty(context, callConstructorOrCreateArray, j);
                    return callConstructorOrCreateArray;
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
        long lengthProperty = getLengthProperty(context, object);
        Scriptable callConstructorOrCreateArray2 = callConstructorOrCreateArray(context, scriptable, scriptable2, lengthProperty, true);
        while (j < lengthProperty) {
            Object elem = getElem(context, object, j);
            if (!isUndefined) {
                elem = function2.call(context, scriptable, scriptable4, new Object[]{elem, Long.valueOf(j)});
            }
            ArrayLikeAbstractOperations.defineElem(context, callConstructorOrCreateArray2, j, elem);
            j++;
        }
        setLengthProperty(context, callConstructorOrCreateArray2, lengthProperty);
        return callConstructorOrCreateArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean js_includes(org.mozilla.javascript.Context r8, org.mozilla.javascript.Scriptable r9, org.mozilla.javascript.Scriptable r10, java.lang.Object[] r11) {
        /*
            org.mozilla.javascript.Scriptable r9 = org.mozilla.javascript.ScriptRuntime.toObject(r8, r9, r10)
            long r0 = getLengthProperty(r8, r9)
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L11
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L11:
            int r8 = r11.length
            r10 = 2
            r4 = 1
            if (r8 >= r10) goto L18
            goto L34
        L18:
            r8 = 1
            r8 = r11[r8]
            double r6 = org.mozilla.javascript.ScriptRuntime.toInteger(r8)
            long r6 = (long) r6
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2a
            long r6 = r6 + r0
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2a
            goto L2b
        L2a:
            r2 = r6
        L2b:
            long r6 = r0 - r4
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L34
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L34:
            int r8 = r11.length
            if (r8 <= 0) goto L3b
            r8 = 0
            r8 = r11[r8]
            goto L3d
        L3b:
            java.lang.Object r8 = org.mozilla.javascript.Undefined.instance
        L3d:
            boolean r10 = r9 instanceof org.mozilla.javascript.NativeArray
            if (r10 == 0) goto L73
            r10 = r9
            org.mozilla.javascript.NativeArray r10 = (org.mozilla.javascript.NativeArray) r10
            boolean r11 = r10.denseOnly
            if (r11 == 0) goto L73
            org.mozilla.javascript.Scriptable r9 = r10.getPrototype()
            int r11 = (int) r2
        L4d:
            long r2 = (long) r11
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L70
            java.lang.Object[] r2 = r10.dense
            r2 = r2[r11]
            java.lang.Object r3 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r2 != r3) goto L60
            if (r9 == 0) goto L60
            java.lang.Object r2 = org.mozilla.javascript.ScriptableObject.getProperty(r9, r11)
        L60:
            if (r2 != r3) goto L64
            java.lang.Object r2 = org.mozilla.javascript.Undefined.instance
        L64:
            boolean r2 = org.mozilla.javascript.ScriptRuntime.sameZero(r2, r8)
            if (r2 == 0) goto L6d
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L6d:
            int r11 = r11 + 1
            goto L4d
        L70:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L73:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L8c
            java.lang.Object r10 = org.mozilla.javascript.ArrayLikeAbstractOperations.getRawElem(r9, r2)
            java.lang.Object r11 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r10 != r11) goto L81
            java.lang.Object r10 = org.mozilla.javascript.Undefined.instance
        L81:
            boolean r10 = org.mozilla.javascript.ScriptRuntime.sameZero(r10, r8)
            if (r10 == 0) goto L8a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L8a:
            long r2 = r2 + r4
            goto L73
        L8c:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.js_includes(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r9 < 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object js_indexOf(org.mozilla.javascript.Context r7, org.mozilla.javascript.Scriptable r8, org.mozilla.javascript.Scriptable r9, java.lang.Object[] r10) {
        /*
            int r0 = r10.length
            if (r0 <= 0) goto L7
            r0 = 0
            r0 = r10[r0]
            goto L9
        L7:
            java.lang.Object r0 = org.mozilla.javascript.Undefined.instance
        L9:
            org.mozilla.javascript.Scriptable r8 = org.mozilla.javascript.ScriptRuntime.toObject(r7, r8, r9)
            long r1 = getLengthProperty(r7, r8)
            int r7 = r10.length
            r9 = 2
            r3 = 1
            r5 = 0
            if (r7 >= r9) goto L1a
            goto L36
        L1a:
            r7 = 1
            r7 = r10[r7]
            double r9 = org.mozilla.javascript.ScriptRuntime.toInteger(r7)
            long r9 = (long) r9
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            long r9 = r9 + r1
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            goto L2d
        L2c:
            r5 = r9
        L2d:
            long r9 = r1 - r3
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 <= 0) goto L36
            java.lang.Long r7 = org.mozilla.javascript.NativeArray.NEGATIVE_ONE
            return r7
        L36:
            boolean r7 = r8 instanceof org.mozilla.javascript.NativeArray
            if (r7 == 0) goto L6c
            r7 = r8
            org.mozilla.javascript.NativeArray r7 = (org.mozilla.javascript.NativeArray) r7
            boolean r9 = r7.denseOnly
            if (r9 == 0) goto L6c
            org.mozilla.javascript.Scriptable r8 = r7.getPrototype()
            int r9 = (int) r5
        L46:
            long r3 = (long) r9
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L69
            java.lang.Object[] r10 = r7.dense
            r10 = r10[r9]
            java.lang.Object r5 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r10 != r5) goto L59
            if (r8 == 0) goto L59
            java.lang.Object r10 = org.mozilla.javascript.ScriptableObject.getProperty(r8, r9)
        L59:
            if (r10 == r5) goto L66
            boolean r10 = org.mozilla.javascript.ScriptRuntime.shallowEq(r10, r0)
            if (r10 == 0) goto L66
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            return r7
        L66:
            int r9 = r9 + 1
            goto L46
        L69:
            java.lang.Long r7 = org.mozilla.javascript.NativeArray.NEGATIVE_ONE
            return r7
        L6c:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L85
            java.lang.Object r7 = org.mozilla.javascript.ArrayLikeAbstractOperations.getRawElem(r8, r5)
            java.lang.Object r9 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r7 == r9) goto L83
            boolean r7 = org.mozilla.javascript.ScriptRuntime.shallowEq(r7, r0)
            if (r7 == 0) goto L83
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            return r7
        L83:
            long r5 = r5 + r3
            goto L6c
        L85:
            java.lang.Long r7 = org.mozilla.javascript.NativeArray.NEGATIVE_ONE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.js_indexOf(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    private static boolean js_isArray(Object obj) {
        if (!(obj instanceof Scriptable)) {
            return false;
        }
        if (obj instanceof NativeProxy) {
            return js_isArray(((NativeProxy) obj).getTargetThrowIfRevoked());
        }
        return "Array".equals(((Scriptable) obj).getClassName());
    }

    private static String js_join(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        String str;
        Object obj;
        Object obj2;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        int i = (int) lengthProperty;
        if (lengthProperty == i) {
            int i2 = 0;
            if (objArr.length >= 1 && (obj2 = objArr[0]) != Undefined.instance) {
                str = ScriptRuntime.toString(obj2);
            } else {
                str = ",";
            }
            if (object instanceof NativeArray) {
                NativeArray nativeArray = (NativeArray) object;
                if (nativeArray.denseOnly) {
                    StringBuilder sb = new StringBuilder();
                    while (i2 < i) {
                        if (i2 != 0) {
                            sb.append(str);
                        }
                        Object[] objArr2 = nativeArray.dense;
                        if (i2 < objArr2.length && (obj = objArr2[i2]) != null && obj != Undefined.instance && obj != Scriptable.NOT_FOUND) {
                            sb.append(ScriptRuntime.toString(obj));
                        }
                        i2++;
                    }
                    return sb.toString();
                }
            }
            if (i == 0) {
                return "";
            }
            String[] strArr = new String[i];
            int i3 = 0;
            for (int i4 = 0; i4 != i; i4++) {
                Object elem = getElem(context, object, i4);
                if (elem != null && elem != Undefined.instance) {
                    String scriptRuntime = ScriptRuntime.toString(elem);
                    i3 += scriptRuntime.length();
                    strArr[i4] = scriptRuntime;
                }
            }
            StringBuilder sb2 = new StringBuilder((str.length() * (i - 1)) + i3);
            while (i2 != i) {
                if (i2 != 0) {
                    sb2.append(str);
                }
                String str2 = strArr[i2];
                if (str2 != null) {
                    sb2.append(str2);
                }
                i2++;
            }
            return sb2.toString();
        }
        throw Context.reportRuntimeErrorById("msg.arraylength.too.big", String.valueOf(lengthProperty));
    }

    private static Object js_lastIndexOf(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        long j;
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        if (objArr.length < 2) {
            j = lengthProperty - 1;
        } else {
            long integer = (long) ScriptRuntime.toInteger(objArr[1]);
            if (integer >= lengthProperty) {
                j = lengthProperty - 1;
            } else {
                if (integer < 0) {
                    integer += lengthProperty;
                }
                j = integer;
            }
            if (j < 0) {
                return NEGATIVE_ONE;
            }
        }
        if (object instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly) {
                Scriptable prototype = nativeArray.getPrototype();
                for (int i = (int) j; i >= 0; i--) {
                    Object obj2 = nativeArray.dense[i];
                    Object obj3 = Scriptable.NOT_FOUND;
                    if (obj2 == obj3 && prototype != null) {
                        obj2 = ScriptableObject.getProperty(prototype, i);
                    }
                    if (obj2 != obj3 && ScriptRuntime.shallowEq(obj2, obj)) {
                        return Long.valueOf(i);
                    }
                }
                return NEGATIVE_ONE;
            }
        }
        while (j >= 0) {
            Object rawElem = ArrayLikeAbstractOperations.getRawElem(object, j);
            if (rawElem != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(rawElem, obj)) {
                return Long.valueOf(j);
            }
            j--;
        }
        return NEGATIVE_ONE;
    }

    private static Object js_of(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable callConstructorOrCreateArray = callConstructorOrCreateArray(context, scriptable, scriptable2, objArr.length, true);
        int i = 0;
        if (context.getLanguageVersion() >= 200 && (callConstructorOrCreateArray instanceof ScriptableObject)) {
            ScriptableObject buildDataDescriptor = ScriptableObject.buildDataDescriptor(callConstructorOrCreateArray, null, 0);
            while (i < objArr.length) {
                buildDataDescriptor.put(ES6Iterator.VALUE_PROPERTY, buildDataDescriptor, objArr[i]);
                ((ScriptableObject) callConstructorOrCreateArray).defineOwnProperty(context, Integer.valueOf(i), buildDataDescriptor);
                i++;
            }
        } else {
            while (i < objArr.length) {
                ArrayLikeAbstractOperations.defineElem(context, callConstructorOrCreateArray, i, objArr[i]);
                i++;
            }
        }
        setLengthProperty(context, callConstructorOrCreateArray, objArr.length);
        return callConstructorOrCreateArray;
    }

    private static Object js_pop(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (object instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly) {
                long j = nativeArray.length;
                if (j > 0) {
                    long j2 = j - 1;
                    nativeArray.length = j2;
                    nativeArray.modCount++;
                    Object[] objArr2 = nativeArray.dense;
                    Object obj2 = objArr2[(int) j2];
                    objArr2[(int) j2] = Scriptable.NOT_FOUND;
                    return obj2;
                }
            }
        }
        long lengthProperty = getLengthProperty(context, object);
        if (lengthProperty > 0) {
            lengthProperty--;
            obj = getElem(context, object, lengthProperty);
            deleteElem(object, lengthProperty);
        } else {
            obj = Undefined.instance;
        }
        setLengthProperty(context, object, lengthProperty);
        return obj;
    }

    private static Object js_push(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        int i = 0;
        if (object instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly && nativeArray.ensureCapacity(((int) nativeArray.length) + objArr.length)) {
                int length = objArr.length;
                while (i < length) {
                    Object obj = objArr[i];
                    Object[] objArr2 = nativeArray.dense;
                    long j = nativeArray.length;
                    nativeArray.length = 1 + j;
                    objArr2[(int) j] = obj;
                    nativeArray.modCount++;
                    i++;
                }
                return ScriptRuntime.wrapNumber(nativeArray.length);
            }
        }
        long lengthProperty = getLengthProperty(context, object);
        while (i < objArr.length) {
            setElem(context, object, i + lengthProperty, objArr[i]);
            i++;
        }
        Object lengthProperty2 = setLengthProperty(context, object, lengthProperty + objArr.length);
        if (context.getLanguageVersion() == 120) {
            if (objArr.length == 0) {
                return Undefined.instance;
            }
            return objArr[objArr.length - 1];
        }
        return lengthProperty2;
    }

    private static Scriptable js_reverse(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (object instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly) {
                int i = 0;
                for (int i2 = ((int) nativeArray.length) - 1; i < i2; i2--) {
                    Object[] objArr2 = nativeArray.dense;
                    Object obj = objArr2[i];
                    objArr2[i] = objArr2[i2];
                    objArr2[i2] = obj;
                    i++;
                }
                return object;
            }
        }
        long lengthProperty = getLengthProperty(context, object);
        long j = lengthProperty / 2;
        for (long j2 = 0; j2 < j; j2++) {
            long j3 = (lengthProperty - j2) - 1;
            Object rawElem = ArrayLikeAbstractOperations.getRawElem(object, j2);
            setRawElem(context, object, j2, ArrayLikeAbstractOperations.getRawElem(object, j3));
            setRawElem(context, object, j3, rawElem);
        }
        return object;
    }

    private static Object js_shift(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (object instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly) {
                long j = nativeArray.length;
                if (j > 0) {
                    long j2 = j - 1;
                    nativeArray.length = j2;
                    nativeArray.modCount++;
                    Object[] objArr2 = nativeArray.dense;
                    Object obj2 = objArr2[0];
                    System.arraycopy(objArr2, 1, objArr2, 0, (int) j2);
                    Object obj3 = Scriptable.NOT_FOUND;
                    nativeArray.dense[(int) nativeArray.length] = obj3;
                    if (obj2 == obj3) {
                        return Undefined.instance;
                    }
                    return obj2;
                }
            }
        }
        long lengthProperty = getLengthProperty(context, object);
        if (lengthProperty > 0) {
            lengthProperty--;
            obj = getElem(context, object, 0L);
            if (lengthProperty > 0) {
                for (long j3 = 1; j3 <= lengthProperty; j3++) {
                    setRawElem(context, object, j3 - 1, ArrayLikeAbstractOperations.getRawElem(object, j3));
                }
            }
            deleteElem(object, lengthProperty);
        } else {
            obj = Undefined.instance;
        }
        setLengthProperty(context, object, lengthProperty);
        return obj;
    }

    private static Scriptable js_slice(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        long sliceIndex;
        Object obj;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        if (objArr.length == 0) {
            sliceIndex = 0;
        } else {
            sliceIndex = ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(objArr[0]), lengthProperty);
            if (objArr.length != 1 && (obj = objArr[1]) != Undefined.instance) {
                lengthProperty = ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(obj), lengthProperty);
            }
        }
        long j = lengthProperty - sliceIndex;
        if (j <= 2147483647L) {
            Scriptable newArray = context.newArray(scriptable, 0);
            for (long j2 = sliceIndex; j2 < lengthProperty; j2++) {
                Object rawElem = ArrayLikeAbstractOperations.getRawElem(object, j2);
                if (rawElem != Scriptable.NOT_FOUND) {
                    ArrayLikeAbstractOperations.defineElem(context, newArray, j2 - sliceIndex, rawElem);
                }
            }
            setLengthProperty(context, newArray, Math.max(0L, j));
            return newArray;
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
    }

    private static Scriptable js_sort(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return sort(context, ScriptRuntime.toObject(context, scriptable, scriptable2), ArrayLikeAbstractOperations.getSortComparator(context, scriptable, objArr));
    }

    private static Object js_splice(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        NativeArray nativeArray;
        boolean z;
        long j;
        boolean z2;
        long j2;
        Object obj;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (object instanceof NativeArray) {
            nativeArray = (NativeArray) object;
            z = nativeArray.denseOnly;
        } else {
            nativeArray = null;
            z = false;
        }
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        int length = objArr.length;
        if (length == 0) {
            return context.newArray(topLevelScope, 0);
        }
        long lengthProperty = getLengthProperty(context, object);
        long sliceIndex = ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(objArr[0]), lengthProperty);
        int i = length - 1;
        if (objArr.length == 1) {
            j = lengthProperty - sliceIndex;
            z2 = z;
        } else {
            double integer = ScriptRuntime.toInteger(objArr[1]);
            if (integer < 0.0d) {
                z2 = z;
                j = 0;
            } else {
                j = lengthProperty - sliceIndex;
                z2 = z;
                if (integer <= j) {
                    j = (long) integer;
                }
            }
            i = length - 2;
        }
        long j3 = sliceIndex + j;
        long j4 = j;
        long j5 = i;
        long j6 = j5 - j4;
        long j7 = lengthProperty + j6;
        if (j7 <= 9.007199254740991E15d) {
            if (j4 <= 2147483647L) {
                if (j4 != 0) {
                    if (j4 == 1 && context.getLanguageVersion() == 120) {
                        j2 = 2147483647L;
                        obj = getElem(context, object, sliceIndex);
                    } else if (z2) {
                        j2 = 2147483647L;
                        int i2 = (int) (j3 - sliceIndex);
                        Object[] objArr2 = new Object[i2];
                        System.arraycopy(nativeArray.dense, (int) sliceIndex, objArr2, 0, i2);
                        obj = context.newArray(topLevelScope, objArr2);
                    } else {
                        j2 = 2147483647L;
                        Scriptable newArray = context.newArray(topLevelScope, 0);
                        long j8 = sliceIndex;
                        while (j8 != j3) {
                            Object rawElem = ArrayLikeAbstractOperations.getRawElem(object, j8);
                            long j9 = j8;
                            if (rawElem != Scriptable.NOT_FOUND) {
                                setElem(context, newArray, j9 - sliceIndex, rawElem);
                            }
                            j8 = j9 + 1;
                        }
                        setLengthProperty(context, newArray, j3 - sliceIndex);
                        obj = newArray;
                    }
                } else {
                    j2 = 2147483647L;
                    if (context.getLanguageVersion() == 120) {
                        obj = Undefined.instance;
                    } else {
                        obj = context.newArray(topLevelScope, 0);
                    }
                }
                if (z2 && j7 < j2) {
                    int i3 = (int) j7;
                    if (nativeArray.ensureCapacity(i3)) {
                        Object[] objArr3 = nativeArray.dense;
                        System.arraycopy(objArr3, (int) j3, objArr3, (int) (sliceIndex + j5), (int) (lengthProperty - j3));
                        if (i > 0) {
                            System.arraycopy(objArr, 2, nativeArray.dense, (int) sliceIndex, i);
                        }
                        if (j6 < 0) {
                            Arrays.fill(nativeArray.dense, i3, (int) lengthProperty, Scriptable.NOT_FOUND);
                        }
                        nativeArray.length = j7;
                        nativeArray.modCount++;
                        return obj;
                    }
                }
                long j10 = lengthProperty;
                int i4 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                if (i4 > 0) {
                    long j11 = j10 - 1;
                    while (j11 >= j3) {
                        setRawElem(context, object, j11 + j6, ArrayLikeAbstractOperations.getRawElem(object, j11));
                        j11--;
                        j3 = j3;
                    }
                } else if (i4 < 0) {
                    long j12 = j3;
                    while (j12 < j10) {
                        long j13 = j12;
                        setRawElem(context, object, j13 + j6, ArrayLikeAbstractOperations.getRawElem(object, j12));
                        j12 = j13 + 1;
                    }
                    while (true) {
                        j10--;
                        if (j10 < j7) {
                            break;
                        }
                        deleteElem(object, j10);
                    }
                }
                int length2 = objArr.length - i;
                for (int i5 = 0; i5 < i; i5++) {
                    setElem(context, object, i5 + sliceIndex, objArr[i5 + length2]);
                }
                setLengthProperty(context, object, j7);
                return obj;
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", Long.valueOf(j7));
    }

    private static Object js_toReversed(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        int i2 = 0;
        if (lengthProperty <= 2147483647L) {
            Scriptable newArray = context.newArray(scriptable, (int) lengthProperty);
            while (true) {
                long j = i2;
                if (j < lengthProperty) {
                    setElem(context, newArray, j, getElem(context, object, (i - i2) - 1));
                    i2++;
                } else {
                    return newArray;
                }
            }
        } else {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
    }

    private static Object js_toSorted(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Comparator<Object> sortComparator = ArrayLikeAbstractOperations.getSortComparator(context, scriptable, objArr);
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        int i = 0;
        if (lengthProperty <= 2147483647L) {
            Scriptable newArray = context.newArray(scriptable, (int) lengthProperty);
            while (true) {
                long j = i;
                if (j < lengthProperty) {
                    setElem(context, newArray, j, getElem(context, object, j));
                    i++;
                } else {
                    sort(context, newArray, sortComparator);
                    return newArray;
                }
            }
        } else {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object js_toSpliced(org.mozilla.javascript.Context r18, org.mozilla.javascript.Scriptable r19, org.mozilla.javascript.Scriptable r20, java.lang.Object[] r21) {
        /*
            r0 = r18
            r1 = r21
            org.mozilla.javascript.Scriptable r2 = org.mozilla.javascript.ScriptRuntime.toObject(r18, r19, r20)
            long r3 = getLengthProperty(r0, r2)
            int r5 = r1.length
            r6 = 0
            r7 = 0
            if (r5 <= 0) goto L1d
            r5 = r1[r6]
            double r9 = org.mozilla.javascript.ScriptRuntime.toInteger(r5)
            long r9 = org.mozilla.javascript.ArrayLikeAbstractOperations.toSliceIndex(r9, r3)
            goto L1e
        L1d:
            r9 = r7
        L1e:
            int r5 = r1.length
            r11 = 2
            if (r5 <= r11) goto L26
            int r5 = r1.length
            int r5 = r5 - r11
            long r12 = (long) r5
            goto L27
        L26:
            r12 = r7
        L27:
            int r5 = r1.length
            if (r5 != 0) goto L2e
            r14 = r7
        L2b:
            r16 = r12
            goto L45
        L2e:
            int r5 = r1.length
            r14 = 1
            if (r5 != r14) goto L35
            long r14 = r3 - r9
            goto L2b
        L35:
            long r14 = org.mozilla.javascript.ScriptRuntime.toLength(r1, r14)
            r16 = r12
            long r11 = r3 - r9
            long r11 = java.lang.Math.min(r14, r11)
            long r14 = java.lang.Math.max(r7, r11)
        L45:
            long r3 = r3 + r16
            long r3 = r3 - r14
            double r11 = (double) r3
            r16 = 4845873199050653695(0x433fffffffffffff, double:9.007199254740991E15)
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 > 0) goto L99
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 > 0) goto L8c
            int r5 = (int) r3
            r6 = r19
            org.mozilla.javascript.Scriptable r5 = r0.newArray(r6, r5)
            long r14 = r14 + r9
        L61:
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r11 = 1
            if (r6 >= 0) goto L70
            java.lang.Object r6 = getElem(r0, r2, r7)
            setElem(r0, r5, r7, r6)
            long r7 = r7 + r11
            goto L61
        L70:
            r6 = 2
        L71:
            int r9 = r1.length
            if (r6 >= r9) goto L7d
            r9 = r1[r6]
            setElem(r0, r5, r7, r9)
            long r7 = r7 + r11
            int r6 = r6 + 1
            goto L71
        L7d:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L8b
            java.lang.Object r1 = getElem(r0, r2, r14)
            setElem(r0, r5, r7, r1)
            long r7 = r7 + r11
            long r14 = r14 + r11
            goto L7d
        L8b:
            return r5
        L8c:
            java.lang.String r0 = "msg.arraylength.bad"
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = org.mozilla.javascript.ScriptRuntime.getMessageById(r0, r1)
            org.mozilla.javascript.EcmaError r0 = org.mozilla.javascript.ScriptRuntime.rangeError(r0)
            throw r0
        L99:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "msg.arraylength.too.big"
            org.mozilla.javascript.EcmaError r0 = org.mozilla.javascript.ScriptRuntime.typeErrorById(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.js_toSpliced(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    private static Object js_unshift(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        long j;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (object instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) object;
            if (nativeArray.denseOnly && nativeArray.ensureCapacity(((int) nativeArray.length) + objArr.length)) {
                Object[] objArr2 = nativeArray.dense;
                System.arraycopy(objArr2, 0, objArr2, objArr.length, (int) nativeArray.length);
                System.arraycopy(objArr, 0, nativeArray.dense, 0, objArr.length);
                long length = nativeArray.length + objArr.length;
                nativeArray.length = length;
                nativeArray.modCount++;
                return ScriptRuntime.wrapNumber(length);
            }
        }
        long lengthProperty = getLengthProperty(context, object);
        int length2 = objArr.length;
        if (length2 > 0) {
            long j2 = length2;
            long j3 = lengthProperty + j2;
            if (j3 <= 9.007199254740991E15d) {
                if (lengthProperty > 0) {
                    long j4 = lengthProperty - 1;
                    while (j4 >= 0) {
                        setRawElem(context, object, j4 + j2, ArrayLikeAbstractOperations.getRawElem(object, j4));
                        j4--;
                        lengthProperty = lengthProperty;
                    }
                }
                j = lengthProperty;
                for (int i = 0; i < objArr.length; i++) {
                    setElem(context, object, i, objArr[i]);
                }
            } else {
                throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", Long.valueOf(j3));
            }
        } else {
            j = lengthProperty;
        }
        return setLengthProperty(context, object, j + length2);
    }

    private static Object js_with(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        long j;
        Object elem;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = getLengthProperty(context, object);
        if (objArr.length > 0) {
            j = (int) ScriptRuntime.toInteger(objArr[0]);
        } else {
            j = 0;
        }
        if (j < 0) {
            j += lengthProperty;
        }
        if (j >= 0 && j < lengthProperty) {
            if (lengthProperty <= 2147483647L) {
                Scriptable newArray = context.newArray(scriptable, (int) lengthProperty);
                for (long j2 = 0; j2 < lengthProperty; j2++) {
                    if (j2 == j) {
                        if (objArr.length > 1) {
                            elem = objArr[1];
                        } else {
                            elem = Undefined.instance;
                        }
                    } else {
                        elem = getElem(context, object, j2);
                    }
                    setElem(context, newArray, j2, elem);
                }
                return newArray;
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        throw ScriptRuntime.rangeError("index out of range");
    }

    private Object makeUnscopables() {
        NativeObject nativeObject;
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null) {
            nativeObject = (NativeObject) currentContext.newObject(getParentScope());
        } else {
            nativeObject = new NativeObject();
        }
        ScriptableObject buildDataDescriptor = ScriptableObject.buildDataDescriptor(nativeObject, Boolean.TRUE, 0);
        for (String str : UNSCOPABLES) {
            nativeObject.defineOwnProperty(currentContext, str, buildDataDescriptor);
        }
        nativeObject.setPrototype(null);
        return nativeObject;
    }

    private static void setElem(Context context, Scriptable scriptable, long j, Object obj) {
        if (j > 2147483647L) {
            ScriptableObject.putProperty(scriptable, Long.toString(j), obj);
        } else {
            ScriptableObject.putProperty(scriptable, (int) j, obj);
        }
    }

    private void setLength(Object obj) {
        Object[] ids;
        if ((this.lengthAttr & 1) != 0) {
            return;
        }
        double number = ScriptRuntime.toNumber(obj);
        long uint32 = ScriptRuntime.toUint32(number);
        double d = uint32;
        int i = (d > number ? 1 : (d == number ? 0 : -1));
        if (i == 0) {
            if (this.denseOnly) {
                long j = this.length;
                if (uint32 < j) {
                    Object[] objArr = this.dense;
                    Arrays.fill(objArr, (int) uint32, objArr.length, Scriptable.NOT_FOUND);
                    this.length = uint32;
                    this.modCount++;
                    return;
                } else if (uint32 < 1431655764 && d < j * GROW_FACTOR && ensureCapacity((int) uint32)) {
                    this.length = uint32;
                    this.modCount++;
                    return;
                } else {
                    this.denseOnly = false;
                }
            }
            long j2 = this.length;
            if (uint32 < j2) {
                if (j2 - uint32 > 4096) {
                    for (Object obj2 : getIds()) {
                        if (obj2 instanceof String) {
                            String str = (String) obj2;
                            if (toArrayIndex(str) >= uint32) {
                                delete(str);
                            }
                        } else {
                            int intValue = ((Integer) obj2).intValue();
                            if (intValue >= uint32) {
                                delete(intValue);
                            }
                        }
                    }
                } else {
                    for (long j3 = uint32; j3 < this.length; j3++) {
                        deleteElem(this, j3);
                    }
                }
            }
            this.length = uint32;
            this.modCount++;
            return;
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
    }

    private static Object setLengthProperty(Context context, Scriptable scriptable, long j) {
        Number wrapNumber = ScriptRuntime.wrapNumber(j);
        ScriptableObject.putProperty(scriptable, "length", wrapNumber);
        return wrapNumber;
    }

    public static void setMaximumInitialCapacity(int i) {
        maximumInitialCapacity = i;
    }

    private static void setRawElem(Context context, Scriptable scriptable, long j, Object obj) {
        if (obj == Scriptable.NOT_FOUND) {
            deleteElem(scriptable, j);
        } else {
            setElem(context, scriptable, j, obj);
        }
    }

    private static Scriptable sort(Context context, Scriptable scriptable, Comparator<Object> comparator) {
        long lengthProperty = getLengthProperty(context, scriptable);
        int i = (int) lengthProperty;
        if (lengthProperty == i) {
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 != i; i2++) {
                objArr[i2] = ArrayLikeAbstractOperations.getRawElem(scriptable, i2);
            }
            try {
                Arrays.sort(objArr, comparator);
                for (int i3 = 0; i3 < i; i3++) {
                    setRawElem(context, scriptable, i3, objArr[i3]);
                }
            } catch (IllegalArgumentException unused) {
            }
            return scriptable;
        }
        throw Context.reportRuntimeErrorById("msg.arraylength.too.big", String.valueOf(lengthProperty));
    }

    private static long toArrayIndex(Object obj) {
        if (obj instanceof String) {
            return toArrayIndex((String) obj);
        }
        if (obj instanceof Number) {
            return toArrayIndex(((Number) obj).doubleValue());
        }
        return -1L;
    }

    private static int toDenseIndex(Object obj) {
        long arrayIndex = toArrayIndex(obj);
        if (0 <= arrayIndex && arrayIndex < 2147483647L) {
            return (int) arrayIndex;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String toStringHelper(org.mozilla.javascript.Context r20, org.mozilla.javascript.Scriptable r21, org.mozilla.javascript.Scriptable r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.toStringHelper(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, boolean, boolean):java.lang.String");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) > -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public boolean defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject, boolean z) {
        Object[] objArr;
        long arrayIndex = toArrayIndex(obj);
        if (arrayIndex >= this.length) {
            this.length = 1 + arrayIndex;
            this.modCount++;
        }
        if (arrayIndex != -1 && (objArr = this.dense) != null) {
            this.dense = null;
            this.denseOnly = false;
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] != Scriptable.NOT_FOUND) {
                    if (!isExtensible()) {
                        setAttributes(i, 0);
                    }
                    put(i, this, objArr[i]);
                }
            }
        }
        super.defineOwnProperty(context, obj, scriptableObject, z);
        if ("length".equals(obj)) {
            this.lengthAttr = getAttributes("length");
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i) {
        Object[] objArr = this.dense;
        if (objArr != null && i >= 0 && i < objArr.length && !isSealed() && (this.denseOnly || !isGetterOrSetter(null, i, true))) {
            this.dense[i] = Scriptable.NOT_FOUND;
        } else {
            super.delete(i);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(ARRAY_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        Scriptable scriptable3 = scriptable2;
        Object[] objArr2 = objArr;
        while (true) {
            boolean z = true;
            switch (methodId) {
                case ConstructorId_from /* -30 */:
                    return js_from(context, scriptable, scriptable3, objArr2);
                case ConstructorId_of /* -29 */:
                    return js_of(context, scriptable, scriptable3, objArr2);
                case ConstructorId_isArray /* -28 */:
                    if (objArr2.length <= 0 || !js_isArray(objArr2[0])) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case ConstructorId_reduceRight /* -27 */:
                case ConstructorId_reduce /* -26 */:
                case ConstructorId_findLastIndex /* -25 */:
                case ConstructorId_findLast /* -24 */:
                case ConstructorId_findIndex /* -23 */:
                case ConstructorId_find /* -22 */:
                case ConstructorId_some /* -21 */:
                case ConstructorId_map /* -20 */:
                case -19:
                case -18:
                case -17:
                case -16:
                case -15:
                case -14:
                case -13:
                case -12:
                case -11:
                case -10:
                case -9:
                case -8:
                case -7:
                case -6:
                case -5:
                    if (objArr2.length > 0) {
                        Scriptable object = ScriptRuntime.toObject(context, scriptable, objArr2[0]);
                        int length = objArr2.length - 1;
                        Object[] objArr3 = new Object[length];
                        System.arraycopy(objArr2, 1, objArr3, 0, length);
                        scriptable3 = object;
                        objArr2 = objArr3;
                    }
                    methodId = -methodId;
                default:
                    switch (methodId) {
                        case 1:
                            if (scriptable3 == null) {
                                return jsConstructor(context, scriptable, objArr2);
                            }
                            return idFunctionObject.construct(context, scriptable, objArr2);
                        case 2:
                            return toStringHelper(context, scriptable, scriptable3, context.hasFeature(4), false);
                        case 3:
                            return toStringHelper(context, scriptable, scriptable3, false, true);
                        case 4:
                            return toStringHelper(context, scriptable, scriptable3, true, false);
                        case 5:
                            return js_join(context, scriptable, scriptable3, objArr2);
                        case 6:
                            return js_reverse(context, scriptable, scriptable3, objArr2);
                        case 7:
                            return js_sort(context, scriptable, scriptable3, objArr2);
                        case 8:
                            return js_push(context, scriptable, scriptable3, objArr2);
                        case 9:
                            return js_pop(context, scriptable, scriptable3, objArr2);
                        case 10:
                            return js_shift(context, scriptable, scriptable3, objArr2);
                        case 11:
                            return js_unshift(context, scriptable, scriptable3, objArr2);
                        case 12:
                            return js_splice(context, scriptable, scriptable3, objArr2);
                        case 13:
                            return js_concat(context, scriptable, scriptable3, objArr2);
                        case 14:
                            return js_slice(context, scriptable, scriptable3, objArr2);
                        case 15:
                            return js_indexOf(context, scriptable, scriptable3, objArr2);
                        case 16:
                            return js_lastIndexOf(context, scriptable, scriptable3, objArr2);
                        case 17:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.EVERY, scriptable, scriptable3, objArr2);
                        case 18:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.FILTER, scriptable, scriptable3, objArr2);
                        case 19:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.FOR_EACH, scriptable, scriptable3, objArr2);
                        case 20:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.MAP, scriptable, scriptable3, objArr2);
                        case 21:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.SOME, scriptable, scriptable3, objArr2);
                        case 22:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.FIND, scriptable, scriptable3, objArr2);
                        case 23:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.FIND_INDEX, scriptable, scriptable3, objArr2);
                        case 24:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.FIND_LAST, scriptable, scriptable3, objArr2);
                        case 25:
                            return ArrayLikeAbstractOperations.iterativeMethod(context, idFunctionObject, ArrayLikeAbstractOperations.IterativeOperation.FIND_LAST_INDEX, scriptable, scriptable3, objArr2);
                        case 26:
                            return ArrayLikeAbstractOperations.reduceMethod(context, ArrayLikeAbstractOperations.ReduceOperation.REDUCE, scriptable, scriptable3, objArr2);
                        case 27:
                            return ArrayLikeAbstractOperations.reduceMethod(context, ArrayLikeAbstractOperations.ReduceOperation.REDUCE_RIGHT, scriptable, scriptable3, objArr2);
                        case 28:
                            return js_fill(context, scriptable, scriptable3, objArr2);
                        case 29:
                            return new NativeArrayIterator(scriptable, ScriptRuntime.toObject(context, scriptable, scriptable3), NativeArrayIterator.ARRAY_ITERATOR_TYPE.KEYS);
                        case 30:
                            return new NativeArrayIterator(scriptable, ScriptRuntime.toObject(context, scriptable, scriptable3), NativeArrayIterator.ARRAY_ITERATOR_TYPE.VALUES);
                        case 31:
                            return new NativeArrayIterator(scriptable, ScriptRuntime.toObject(context, scriptable, scriptable3), NativeArrayIterator.ARRAY_ITERATOR_TYPE.ENTRIES);
                        case 32:
                            return js_includes(context, scriptable, scriptable3, objArr2);
                        case 33:
                            return js_copyWithin(context, scriptable, scriptable3, objArr2);
                        case 34:
                            return js_at(context, scriptable, scriptable3, objArr2);
                        case 35:
                            return js_flat(context, scriptable, scriptable3, objArr2);
                        case 36:
                            return js_flatMap(context, scriptable, scriptable3, objArr2);
                        case 37:
                            return js_toReversed(context, scriptable, scriptable3, objArr2);
                        case 38:
                            return js_toSorted(context, scriptable, scriptable3, objArr2);
                        case 39:
                            return js_toSpliced(context, scriptable, scriptable3, objArr2);
                        case 40:
                            return js_with(context, scriptable, scriptable3, objArr2);
                        default:
                            vs.m(s21.m("Array.prototype has no method: ", idFunctionObject.getFunctionName()));
                            return null;
                    }
            }
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = ARRAY_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -5, "join", 1);
        addIdFunctionProperty(idFunctionObject, obj, -6, "reverse", 0);
        addIdFunctionProperty(idFunctionObject, obj, -7, "sort", 1);
        addIdFunctionProperty(idFunctionObject, obj, -8, "push", 1);
        addIdFunctionProperty(idFunctionObject, obj, -9, "pop", 0);
        addIdFunctionProperty(idFunctionObject, obj, -10, "shift", 0);
        addIdFunctionProperty(idFunctionObject, obj, -11, "unshift", 1);
        addIdFunctionProperty(idFunctionObject, obj, -12, "splice", 2);
        addIdFunctionProperty(idFunctionObject, obj, -13, "concat", 1);
        addIdFunctionProperty(idFunctionObject, obj, -14, "slice", 2);
        addIdFunctionProperty(idFunctionObject, obj, -15, "indexOf", 1);
        addIdFunctionProperty(idFunctionObject, obj, -16, "lastIndexOf", 1);
        addIdFunctionProperty(idFunctionObject, obj, -17, "every", 1);
        addIdFunctionProperty(idFunctionObject, obj, -18, "filter", 1);
        addIdFunctionProperty(idFunctionObject, obj, -19, "forEach", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_map, "map", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_some, "some", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_find, "find", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_findIndex, "findIndex", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_findLast, "findLast", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_findLastIndex, "findLastIndex", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_reduce, "reduce", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_reduceRight, "reduceRight", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_isArray, "isArray", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_of, "of", 0);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_from, "from", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        if (str.equals("length")) {
            return IdScriptableObject.instanceIdInfo(this.lengthAttr, 1);
        }
        return super.findInstanceIdInfo(str);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2059379165:
                if (str.equals("findLastIndex")) {
                    c = 0;
                    break;
                }
                break;
            case -2020003546:
                if (str.equals("toLocaleString")) {
                    c = 1;
                    break;
                }
                break;
            case -1781529320:
                if (str.equals("toSorted")) {
                    c = 2;
                    break;
                }
                break;
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 3;
                    break;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    c = 4;
                    break;
                }
                break;
            case -1591573360:
                if (str.equals("entries")) {
                    c = 5;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 6;
                    break;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c = 7;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c = '\b';
                    break;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\t';
                    break;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = '\n';
                    break;
                }
                break;
            case -823812830:
                if (str.equals("values")) {
                    c = 11;
                    break;
                }
                break;
            case -807660480:
                if (str.equals("copyWithin")) {
                    c = '\f';
                    break;
                }
                break;
            case -778842333:
                if (str.equals("flatMap")) {
                    c = '\r';
                    break;
                }
                break;
            case -679446545:
                if (str.equals("findLast")) {
                    c = 14;
                    break;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 15;
                    break;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 16;
                    break;
                }
                break;
            case -284569251:
                if (str.equals("toReversed")) {
                    c = 17;
                    break;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 18;
                    break;
                }
                break;
            case 3123:
                if (str.equals("at")) {
                    c = 19;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 20;
                    break;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = 21;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c = 22;
                    break;
                }
                break;
            case 3143097:
                if (str.equals("find")) {
                    c = 23;
                    break;
                }
                break;
            case 3145593:
                if (str.equals("flat")) {
                    c = 24;
                    break;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 25;
                    break;
                }
                break;
            case 3288564:
                if (str.equals("keys")) {
                    c = 26;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 27;
                    break;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 28;
                    break;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 29;
                    break;
                }
                break;
            case 3649734:
                if (str.equals("with")) {
                    c = 30;
                    break;
                }
                break;
            case 90259659:
                if (str.equals("includes")) {
                    c = 31;
                    break;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    c = ' ';
                    break;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '!';
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\"';
                    break;
                }
                break;
            case 409595545:
                if (str.equals("findIndex")) {
                    c = '#';
                    break;
                }
                break;
            case 629924461:
                if (str.equals("toSpliced")) {
                    c = '$';
                    break;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = '%';
                    break;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '&';
                    break;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = '\'';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 25;
            case 1:
                return 3;
            case 2:
                return 38;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 31;
            case 6:
                return 1;
            case 7:
                return 13;
            case '\b':
                return 18;
            case '\t':
                return 26;
            case '\n':
                return 12;
            case 11:
                return 30;
            case '\f':
                return 33;
            case '\r':
                return 36;
            case 14:
                return 24;
            case 15:
                return 19;
            case 16:
                return 16;
            case 17:
                return 37;
            case 18:
                return 11;
            case 19:
                return 34;
            case 20:
                return 20;
            case 21:
                return 9;
            case 22:
                return 28;
            case 23:
                return 22;
            case 24:
                return 35;
            case 25:
                return 5;
            case 26:
                return 29;
            case 27:
                return 8;
            case 28:
                return 21;
            case 29:
                return 7;
            case 30:
                return 40;
            case 31:
                return 32;
            case ' ':
                return 17;
            case '!':
                return 10;
            case '\"':
                return 14;
            case '#':
                return 23;
            case '$':
                return 39;
            case '%':
                return 27;
            case '&':
                return 6;
            case '\'':
                return 15;
            default:
                return 0;
        }
    }

    public Object get(long j) {
        if (j >= 0 && j < this.length) {
            Object rawElem = ArrayLikeAbstractOperations.getRawElem(this, j);
            if (rawElem == Scriptable.NOT_FOUND || rawElem == Undefined.instance) {
                return null;
            }
            if (rawElem instanceof Wrapper) {
                return ((Wrapper) rawElem).unwrap();
            }
            return rawElem;
        }
        xk5.r();
        return null;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(int i) {
        Object[] objArr = this.dense;
        if (objArr != null && i >= 0 && i < objArr.length && objArr[i] != Scriptable.NOT_FOUND) {
            return 0;
        }
        return super.getAttributes(i);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Array";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls == ScriptRuntime.NumberClass && Context.getContext().getLanguageVersion() == 120) {
            return Long.valueOf(this.length);
        }
        return super.getDefaultValue(cls);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z, boolean z2) {
        Object[] ids = super.getIds(z, z2);
        Object[] objArr = this.dense;
        if (objArr != null) {
            int length = objArr.length;
            long j = this.length;
            if (length > j) {
                length = (int) j;
            }
            if (length != 0) {
                int length2 = ids.length;
                Object[] objArr2 = new Object[length + length2];
                int i = 0;
                for (int i2 = 0; i2 != length; i2++) {
                    if (this.dense[i2] != Scriptable.NOT_FOUND) {
                        objArr2[i] = Integer.valueOf(i2);
                        i++;
                    }
                }
                if (i != length) {
                    Object[] objArr3 = new Object[i + length2];
                    System.arraycopy(objArr2, 0, objArr3, 0, i);
                    objArr2 = objArr3;
                }
                System.arraycopy(ids, 0, objArr2, i, length2);
                return objArr2;
            }
        }
        return ids;
    }

    public List<Integer> getIndexIds() {
        Object[] ids = getIds();
        ArrayList arrayList = new ArrayList(ids.length);
        for (Object obj : ids) {
            int int32 = ScriptRuntime.toInt32(obj);
            if (int32 >= 0 && ScriptRuntime.toString(int32).equals(ScriptRuntime.toString(obj))) {
                arrayList.add(Integer.valueOf(int32));
            }
        }
        return arrayList;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i) {
        if (i == 1) {
            return "length";
        }
        return super.getInstanceIdName(i);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        if (i == 1) {
            return ScriptRuntime.wrapNumber(this.length);
        }
        return super.getInstanceIdValue(i);
    }

    public long getLength() {
        return this.length;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        int denseIndex;
        Object obj2;
        if (this.dense != null && (denseIndex = toDenseIndex(obj)) >= 0) {
            Object[] objArr = this.dense;
            if (denseIndex < objArr.length && (obj2 = objArr[denseIndex]) != Scriptable.NOT_FOUND) {
                return defaultIndexPropertyDescriptor(obj2);
            }
        }
        return super.getOwnPropertyDescriptor(context, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        if (!this.denseOnly && isGetterOrSetter(null, i, false)) {
            return super.has(i, scriptable);
        }
        Object[] objArr = this.dense;
        if (objArr != null && i >= 0 && i < objArr.length) {
            if (objArr[i] == Scriptable.NOT_FOUND) {
                return false;
            }
            return true;
        }
        return super.has(i, scriptable);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        if (i == 41) {
            initPrototypeValue(i, SymbolKey.UNSCOPABLES, makeUnscopables(), 3);
            return;
        }
        switch (i) {
            case 1:
                str = "constructor";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 2:
                str2 = "toString";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 3:
                str2 = "toLocaleString";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 4:
                str2 = "toSource";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 5:
                str = "join";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 6:
                str2 = "reverse";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 7:
                str = "sort";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 8:
                str = "push";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 9:
                str2 = "pop";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 10:
                str2 = "shift";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 11:
                str = "unshift";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 12:
                str3 = "splice";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 13:
                str = "concat";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 14:
                str3 = "slice";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 15:
                str = "indexOf";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 16:
                str = "lastIndexOf";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 17:
                str = "every";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 18:
                str = "filter";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 19:
                str = "forEach";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 20:
                str = "map";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 21:
                str = "some";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 22:
                str = "find";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 23:
                str = "findIndex";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 24:
                str = "findLast";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 25:
                str = "findLastIndex";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 26:
                str = "reduce";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 27:
                str = "reduceRight";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 28:
                str = "fill";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 29:
                str2 = "keys";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 30:
                str2 = "values";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 31:
                str2 = "entries";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 32:
                str = "includes";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 33:
                str3 = "copyWithin";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 34:
                str = "at";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 35:
                str2 = "flat";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 36:
                str = "flatMap";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 37:
                str2 = "toReversed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 38:
                str = "toSorted";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 39:
                str3 = "toSpliced";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            case 40:
                str3 = "with";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(ARRAY_TAG, i, str4, (String) null, i2);
                return;
            default:
                vs.m(String.valueOf(i));
                return;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Deprecated
    public long jsGet_length() {
        return getLength();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int size = size();
        if (obj == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (get(i) == null) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return new ListIterator(i, size) { // from class: org.mozilla.javascript.NativeArray.1
                int cursor;
                int modCount;
                final /* synthetic */ int val$len;
                final /* synthetic */ int val$start;

                {
                    this.val$start = i;
                    this.val$len = size;
                    this.cursor = i;
                    this.modCount = NativeArray.this.modCount;
                }

                @Override // java.util.ListIterator
                public void add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    if (this.cursor < this.val$len) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    if (this.cursor > 0) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public Object next() {
                    NativeArray.this.checkModCount(this.modCount);
                    int i2 = this.cursor;
                    if (i2 != this.val$len) {
                        NativeArray nativeArray = NativeArray.this;
                        this.cursor = i2 + 1;
                        return nativeArray.get(i2);
                    }
                    xk5.g();
                    return null;
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.cursor;
                }

                @Override // java.util.ListIterator
                public Object previous() {
                    NativeArray.this.checkModCount(this.modCount);
                    int i2 = this.cursor;
                    if (i2 != 0) {
                        NativeArray nativeArray = NativeArray.this;
                        int i3 = i2 - 1;
                        this.cursor = i3;
                        return nativeArray.get(i3);
                    }
                    xk5.g();
                    return null;
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return this.cursor - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator
                public void set(Object obj) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        cy7.k(a82.j(i, "Index: "));
        return null;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        if (scriptable == this && !isSealed() && this.dense != null && i >= 0 && (this.denseOnly || !isGetterOrSetter(null, i, true))) {
            if (isExtensible() || this.length > i) {
                Object[] objArr = this.dense;
                if (i < objArr.length) {
                    objArr[i] = obj;
                    long j = i;
                    if (this.length <= j) {
                        this.length = j + 1;
                        this.modCount++;
                        return;
                    }
                    return;
                } else if (this.denseOnly && i < objArr.length * GROW_FACTOR && ensureCapacity(i + 1)) {
                    this.dense[i] = obj;
                    this.length = i + 1;
                    this.modCount++;
                    return;
                } else {
                    this.denseOnly = false;
                }
            } else {
                return;
            }
        }
        super.put(i, scriptable, obj);
        if (scriptable == this && (this.lengthAttr & 1) == 0) {
            long j2 = i;
            if (this.length <= j2) {
                this.length = j2 + 1;
                this.modCount++;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void setDenseOnly(boolean z) {
        if (z && !this.denseOnly) {
            p1a.g();
        } else {
            this.denseOnly = z;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdAttributes(int i, int i2) {
        if (i == 1) {
            this.lengthAttr = i2;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i, Object obj) {
        if (i == 1) {
            setLength(obj);
        } else {
            super.setInstanceIdValue(i, obj);
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void setPrototype(Scriptable scriptable) {
        super.setPrototype(scriptable);
        if (!(scriptable instanceof NativeArray)) {
            setDenseOnly(false);
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public int size() {
        long j = this.length;
        if (j <= 2147483647L) {
            return (int) j;
        }
        vs.k(nk2.t(j, "list.length (", ") exceeds Integer.MAX_VALUE"));
        return 0;
    }

    @Override // java.util.List
    public List subList(final int i, final int i2) {
        if (i >= 0) {
            if (i2 <= size()) {
                if (i <= i2) {
                    return new AbstractList() { // from class: org.mozilla.javascript.NativeArray.2
                        private int mc;

                        {
                            this.mc = NativeArray.this.modCount;
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public Object get(int i3) {
                            NativeArray.this.checkModCount(this.mc);
                            return NativeArray.this.get(i3 + i);
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                            NativeArray.this.checkModCount(this.mc);
                            return i2 - i;
                        }
                    };
                }
                vs.m(hl5.i(i, i2, "fromIndex(", ") > toIndex(", ")"));
                return null;
            }
            cy7.k(a82.j(i2, "toIndex = "));
            return null;
        }
        cy7.k(a82.j(i, "fromIndex = "));
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return objArr;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    private static long toArrayIndex(String str) {
        long arrayIndex = toArrayIndex(ScriptRuntime.toNumber(str));
        if (Long.toString(arrayIndex).equals(str)) {
            return arrayIndex;
        }
        return -1L;
    }

    private static long toArrayIndex(double d) {
        if (Double.isNaN(d)) {
            return -1L;
        }
        long uint32 = ScriptRuntime.toUint32(d);
        if (uint32 != d || uint32 == 4294967295L) {
            return -1L;
        }
        return uint32;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return toArray(ScriptRuntime.emptyArgs);
    }

    public NativeArray(Object[] objArr) {
        this.lengthAttr = 6;
        this.denseOnly = true;
        this.dense = objArr;
        this.length = objArr.length;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void delete(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            super.delete("values");
        }
        super.delete(symbol);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public boolean has(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return super.has("values", scriptable);
        }
        return super.has(symbol, scriptable);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return super.get("values", scriptable);
        }
        return super.get(symbol, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        if (this.denseOnly || !isGetterOrSetter(null, i, false)) {
            Object[] objArr = this.dense;
            return (objArr == null || i < 0 || i >= objArr.length) ? super.get(i, scriptable) : objArr[i];
        }
        return super.get(i, scriptable);
    }

    @Override // java.util.List
    public Object get(int i) {
        return get(i);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        super.put(str, scriptable, obj);
        if (scriptable == this) {
            long arrayIndex = toArrayIndex(str);
            if (arrayIndex >= this.length) {
                this.length = arrayIndex + 1;
                this.modCount++;
                this.denseOnly = false;
            }
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            super.put("values", scriptable, obj);
        }
        super.put(symbol, scriptable, obj);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 30;
        }
        return SymbolKey.UNSCOPABLES.equals(symbol) ? 41 : 0;
    }
}
