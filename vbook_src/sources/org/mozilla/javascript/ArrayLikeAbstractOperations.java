package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ArrayLikeAbstractOperations {
    private static final Comparator<Object> STRING_COMPARATOR = new StringLikeComparator();
    private static final Comparator<Object> DEFAULT_COMPARATOR = new ElementComparator();

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public enum IterativeOperation {
        EVERY,
        FILTER,
        FOR_EACH,
        MAP,
        SOME,
        FIND,
        FIND_INDEX,
        FIND_LAST,
        FIND_LAST_INDEX
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public enum ReduceOperation {
        REDUCE,
        REDUCE_RIGHT
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class StringLikeComparator implements Comparator<Object>, Serializable {
        private static final long serialVersionUID = 5299017659728190979L;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ScriptRuntime.toString(obj).compareTo(ScriptRuntime.toString(obj2));
        }
    }

    public static void defineElem(Context context, Scriptable scriptable, long j, Object obj) {
        if (j > 2147483647L) {
            scriptable.put(Long.toString(j), scriptable, obj);
        } else {
            scriptable.put((int) j, scriptable, obj);
        }
    }

    public static Function getCallbackArg(Context context, Object obj) {
        RegExpProxy regExpProxy;
        if (obj instanceof Function) {
            Function function = (Function) obj;
            if (context.getLanguageVersion() >= 200 && (regExpProxy = ScriptRuntime.getRegExpProxy(context)) != null && regExpProxy.isRegExp(function)) {
                throw ScriptRuntime.notFunctionError(obj);
            }
            return function;
        }
        throw ScriptRuntime.notFunctionError(obj);
    }

    public static Object getRawElem(Scriptable scriptable, long j) {
        if (j > 2147483647L) {
            return ScriptableObject.getProperty(scriptable, Long.toString(j));
        }
        return ScriptableObject.getProperty(scriptable, (int) j);
    }

    public static Comparator<Object> getSortComparator(Context context, Scriptable scriptable, Object[] objArr) {
        if (objArr.length > 0 && Undefined.instance != objArr[0]) {
            return getSortComparatorFromArguments(context, scriptable, objArr);
        }
        return DEFAULT_COMPARATOR;
    }

    public static ElementComparator getSortComparatorFromArguments(final Context context, final Scriptable scriptable, Object[] objArr) {
        final Callable valueFunctionAndThis = ScriptRuntime.getValueFunctionAndThis(objArr[0], context);
        final Scriptable lastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
        final Object[] objArr2 = new Object[2];
        return new ElementComparator(new Comparator<Object>() { // from class: org.mozilla.javascript.ArrayLikeAbstractOperations.1
            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Object[] objArr3 = objArr2;
                objArr3[0] = obj;
                objArr3[1] = obj2;
                int compare = Double.compare(ScriptRuntime.toNumber(valueFunctionAndThis.call(context, scriptable, lastStoredScriptable, objArr3)), 0.0d);
                if (compare < 0) {
                    return -1;
                }
                if (compare <= 0) {
                    return 0;
                }
                return 1;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x010e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object iterativeMethod(org.mozilla.javascript.Context r20, org.mozilla.javascript.IdFunctionObject r21, org.mozilla.javascript.ArrayLikeAbstractOperations.IterativeOperation r22, org.mozilla.javascript.Scriptable r23, org.mozilla.javascript.Scriptable r24, java.lang.Object[] r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ArrayLikeAbstractOperations.iterativeMethod(org.mozilla.javascript.Context, org.mozilla.javascript.IdFunctionObject, org.mozilla.javascript.ArrayLikeAbstractOperations$IterativeOperation, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[], boolean):java.lang.Object");
    }

    public static Object reduceMethod(Context context, ReduceOperation reduceOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        boolean z;
        Object obj2;
        long j;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = NativeArray.getLengthProperty(context, object);
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        if (obj != null && (obj instanceof Function)) {
            Function function = (Function) obj;
            Scriptable topLevelScope = ScriptableObject.getTopLevelScope(function);
            if (reduceOperation == ReduceOperation.REDUCE) {
                z = true;
            } else {
                z = false;
            }
            if (objArr.length > 1) {
                obj2 = objArr[1];
            } else {
                obj2 = Scriptable.NOT_FOUND;
            }
            for (long j2 = 0; j2 < lengthProperty; j2++) {
                if (z) {
                    j = j2;
                } else {
                    j = (lengthProperty - 1) - j2;
                }
                Object rawElem = getRawElem(object, j);
                Object obj3 = Scriptable.NOT_FOUND;
                if (rawElem != obj3) {
                    if (obj2 == obj3) {
                        obj2 = rawElem;
                    } else {
                        obj2 = function.call(context, topLevelScope, topLevelScope, new Object[]{obj2, rawElem, Long.valueOf(j), object});
                    }
                }
            }
            if (obj2 != Scriptable.NOT_FOUND) {
                return obj2;
            }
            throw ScriptRuntime.typeErrorById("msg.empty.array.reduce", new Object[0]);
        }
        throw ScriptRuntime.notFunctionError(obj);
    }

    public static long toSliceIndex(double d, long j) {
        if (d < 0.0d) {
            double d2 = d + j;
            if (d2 < 0.0d) {
                return 0L;
            }
            return (long) d2;
        } else if (d > j) {
            return j;
        } else {
            return (long) d;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class ElementComparator implements Comparator<Object>, Serializable {
        private static final long serialVersionUID = -1189948017688708858L;
        private final Comparator<Object> child;

        public ElementComparator() {
            this.child = ArrayLikeAbstractOperations.STRING_COMPARATOR;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Object obj3 = Undefined.instance;
            if (obj == obj3) {
                if (obj2 == obj3) {
                    return 0;
                }
                if (obj2 != Scriptable.NOT_FOUND) {
                    return 1;
                }
                return -1;
            }
            Object obj4 = Scriptable.NOT_FOUND;
            if (obj == obj4) {
                if (obj2 != obj4) {
                    return 1;
                }
                return 0;
            } else if (obj2 == obj4 || obj2 == obj3) {
                return -1;
            } else {
                return this.child.compare(obj, obj2);
            }
        }

        public ElementComparator(Comparator<Object> comparator) {
            this.child = comparator;
        }
    }

    public static Object iterativeMethod(Context context, IdFunctionObject idFunctionObject, IterativeOperation iterativeOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return iterativeMethod(context, idFunctionObject, iterativeOperation, scriptable, scriptable2, objArr, false);
    }

    public static Object iterativeMethod(Context context, IterativeOperation iterativeOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return iterativeMethod(context, null, iterativeOperation, scriptable, scriptable2, objArr, true);
    }
}
