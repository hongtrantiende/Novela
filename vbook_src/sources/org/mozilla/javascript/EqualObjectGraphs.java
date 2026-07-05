package org.mozilla.javascript;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.mozilla.javascript.debug.DebuggableObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class EqualObjectGraphs {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ThreadLocal<EqualObjectGraphs> instance = new ThreadLocal<>();
    private static final Set<Class<?>> valueClasses = Collections.unmodifiableSet(new HashSet(Arrays.asList(Boolean.class, Byte.class, Character.class, Double.class, Float.class, Integer.class, Long.class, Short.class)));
    private final IdentityHashMap<Object, Object> knownEquals = new IdentityHashMap<>();
    private final IdentityHashMap<Object, Object> currentlyCompared = new IdentityHashMap<>();

    private boolean equalGraphsNoMemo(Object obj, Object obj2) {
        if (obj instanceof Wrapper) {
            if (!(obj2 instanceof Wrapper) || !equalGraphs(((Wrapper) obj).unwrap(), ((Wrapper) obj2).unwrap())) {
                return false;
            }
            return true;
        } else if (obj instanceof NativeJavaTopPackage) {
            return obj2 instanceof NativeJavaTopPackage;
        } else {
            if (obj instanceof Scriptable) {
                if (!(obj2 instanceof Scriptable) || !equalScriptables((Scriptable) obj, (Scriptable) obj2)) {
                    return false;
                }
                return true;
            } else if (obj instanceof SymbolKey) {
                if (!(obj2 instanceof SymbolKey) || !equalGraphs(((SymbolKey) obj).getName(), ((SymbolKey) obj2).getName())) {
                    return false;
                }
                return true;
            } else if (obj instanceof Object[]) {
                if (!(obj2 instanceof Object[]) || !equalObjectArrays((Object[]) obj, (Object[]) obj2)) {
                    return false;
                }
                return true;
            } else if (obj.getClass().isArray()) {
                return Objects.deepEquals(obj, obj2);
            } else {
                if (obj instanceof List) {
                    if (!(obj2 instanceof List) || !equalLists((List) obj, (List) obj2)) {
                        return false;
                    }
                    return true;
                } else if (obj instanceof Map) {
                    if (!(obj2 instanceof Map) || !equalMaps((Map) obj, (Map) obj2)) {
                        return false;
                    }
                    return true;
                } else if (obj instanceof Set) {
                    if (!(obj2 instanceof Set) || !equalSets((Set) obj, (Set) obj2)) {
                        return false;
                    }
                    return true;
                } else if (obj instanceof NativeGlobal) {
                    return obj2 instanceof NativeGlobal;
                } else {
                    if (obj instanceof JavaAdapter) {
                        return obj2 instanceof JavaAdapter;
                    }
                    return obj.equals(obj2);
                }
            }
        }
    }

    private static boolean equalInterpretedFunctions(InterpretedFunction interpretedFunction, InterpretedFunction interpretedFunction2) {
        return Objects.equals(interpretedFunction.getRawSource(), interpretedFunction2.getRawSource());
    }

    private boolean equalLists(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        Iterator<?> it = list.iterator();
        Iterator<?> it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!equalGraphs(it.next(), it2.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean equalMaps(Map<?, ?> map, Map<?, ?> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        Iterator<Map.Entry> sortedEntries = sortedEntries(map);
        Iterator<Map.Entry> sortedEntries2 = sortedEntries(map2);
        while (sortedEntries.hasNext() && sortedEntries2.hasNext()) {
            Map.Entry next = sortedEntries.next();
            Map.Entry next2 = sortedEntries2.next();
            if (equalGraphs(next.getKey(), next2.getKey()) || !equalGraphs(next.getValue(), next2.getValue())) {
                return false;
            }
            while (sortedEntries.hasNext()) {
                Map.Entry next3 = sortedEntries.next();
                Map.Entry next22 = sortedEntries2.next();
                if (equalGraphs(next3.getKey(), next22.getKey())) {
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean equalObjectArrays(Object[] objArr, Object[] objArr2) {
        if (objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!equalGraphs(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean equalScriptables(Scriptable scriptable, Scriptable scriptable2) {
        Object[] sortedIds = getSortedIds(scriptable);
        Object[] sortedIds2 = getSortedIds(scriptable2);
        if (!equalObjectArrays(sortedIds, sortedIds2)) {
            return false;
        }
        int length = sortedIds.length;
        for (int i = 0; i < length; i++) {
            if (!equalGraphs(getValue(scriptable, sortedIds[i]), getValue(scriptable2, sortedIds2[i]))) {
                return false;
            }
        }
        if (!equalGraphs(scriptable.getPrototype(), scriptable2.getPrototype()) || !equalGraphs(scriptable.getParentScope(), scriptable2.getParentScope())) {
            return false;
        }
        if (scriptable instanceof NativeContinuation) {
            if (!(scriptable2 instanceof NativeContinuation) || !NativeContinuation.equalImplementations((NativeContinuation) scriptable, (NativeContinuation) scriptable2)) {
                return false;
            }
            return true;
        } else if (scriptable instanceof NativeJavaPackage) {
            return scriptable.equals(scriptable2);
        } else {
            if (scriptable instanceof IdFunctionObject) {
                if (!(scriptable2 instanceof IdFunctionObject) || !IdFunctionObject.equalObjectGraphs((IdFunctionObject) scriptable, (IdFunctionObject) scriptable2, this)) {
                    return false;
                }
                return true;
            } else if (scriptable instanceof InterpretedFunction) {
                if (!(scriptable2 instanceof InterpretedFunction) || !equalInterpretedFunctions((InterpretedFunction) scriptable, (InterpretedFunction) scriptable2)) {
                    return false;
                }
                return true;
            } else if (scriptable instanceof ArrowFunction) {
                if (!(scriptable2 instanceof ArrowFunction) || !ArrowFunction.equalObjectGraphs((ArrowFunction) scriptable, (ArrowFunction) scriptable2, this)) {
                    return false;
                }
                return true;
            } else if (scriptable instanceof BoundFunction) {
                if (!(scriptable2 instanceof BoundFunction) || !BoundFunction.equalObjectGraphs((BoundFunction) scriptable, (BoundFunction) scriptable2, this)) {
                    return false;
                }
                return true;
            } else if (!(scriptable instanceof NativeSymbol)) {
                return true;
            } else {
                if (!(scriptable2 instanceof NativeSymbol) || !equalGraphs(((NativeSymbol) scriptable).getKey(), ((NativeSymbol) scriptable2).getKey())) {
                    return false;
                }
                return true;
            }
        }
    }

    private boolean equalSets(Set<?> set, Set<?> set2) {
        return equalObjectArrays(sortedSet(set), sortedSet(set2));
    }

    private static Object[] getIds(Scriptable scriptable) {
        if (scriptable instanceof ScriptableObject) {
            return ((ScriptableObject) scriptable).getIds(true, true);
        }
        if (scriptable instanceof DebuggableObject) {
            return ((DebuggableObject) scriptable).getAllIds();
        }
        return scriptable.getIds();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Comparator] */
    private static Object[] getSortedIds(Scriptable scriptable) {
        Object[] ids = getIds(scriptable);
        Arrays.sort(ids, new Object());
        return ids;
    }

    private static String getSymbolName(Symbol symbol) {
        if (symbol instanceof SymbolKey) {
            return ((SymbolKey) symbol).getName();
        }
        if (symbol instanceof NativeSymbol) {
            return ((NativeSymbol) symbol).getKey().getName();
        }
        vm1.h();
        return null;
    }

    private static Object getValue(Scriptable scriptable, Object obj) {
        if (obj instanceof Symbol) {
            return ScriptableObject.getProperty(scriptable, (Symbol) obj);
        }
        if (obj instanceof Integer) {
            return ScriptableObject.getProperty(scriptable, ((Integer) obj).intValue());
        }
        if (obj instanceof String) {
            return ScriptableObject.getProperty(scriptable, (String) obj);
        }
        vm1.h();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortedIds$0(Object obj, Object obj2) {
        if (obj instanceof Integer) {
            if (obj2 instanceof Integer) {
                return ((Integer) obj).compareTo((Integer) obj2);
            }
            if ((obj2 instanceof String) || (obj2 instanceof Symbol)) {
                return -1;
            }
        } else if (obj instanceof String) {
            if (obj2 instanceof String) {
                return ((String) obj).compareTo((String) obj2);
            }
            if (obj2 instanceof Integer) {
                return 1;
            }
            if (obj2 instanceof Symbol) {
                return -1;
            }
        } else if (obj instanceof Symbol) {
            if (obj2 instanceof Symbol) {
                return getSymbolName((Symbol) obj).compareTo(getSymbolName((Symbol) obj2));
            }
            if ((obj2 instanceof Integer) || (obj2 instanceof String)) {
                return 1;
            }
        }
        vm1.h();
        return 0;
    }

    private static Iterator<Map.Entry> sortedEntries(Map map) {
        if (!(map instanceof SortedMap)) {
            map = new TreeMap(map);
        }
        return map.entrySet().iterator();
    }

    private static Object[] sortedSet(Set<?> set) {
        Object[] array = set.toArray();
        Arrays.sort(array);
        return array;
    }

    public static <T> T withThreadLocal(java.util.function.Function<EqualObjectGraphs, T> function) {
        ThreadLocal<EqualObjectGraphs> threadLocal = instance;
        EqualObjectGraphs equalObjectGraphs = threadLocal.get();
        if (equalObjectGraphs == null) {
            EqualObjectGraphs equalObjectGraphs2 = new EqualObjectGraphs();
            threadLocal.set(equalObjectGraphs2);
            try {
                T apply = function.apply(equalObjectGraphs2);
                threadLocal.set(null);
                return apply;
            } catch (Throwable th) {
                instance.set(null);
                throw th;
            }
        }
        return function.apply(equalObjectGraphs);
    }

    public boolean equalGraphs(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj instanceof String) {
            if (obj2 instanceof ConsString) {
                return obj.equals(obj2.toString());
            }
            return obj.equals(obj2);
        } else if (obj instanceof ConsString) {
            if (!(obj2 instanceof String) && !(obj2 instanceof ConsString)) {
                return false;
            }
            return obj.toString().equals(obj2.toString());
        } else if (valueClasses.contains(obj.getClass())) {
            return obj.equals(obj2);
        } else {
            Object obj3 = this.currentlyCompared.get(obj);
            if (obj3 == obj2) {
                return true;
            }
            if (obj3 != null) {
                return false;
            }
            Object obj4 = this.knownEquals.get(obj);
            if (obj4 == obj2) {
                return true;
            }
            if (obj4 != null || this.knownEquals.get(obj2) != null) {
                return false;
            }
            this.currentlyCompared.put(obj, obj2);
            boolean equalGraphsNoMemo = equalGraphsNoMemo(obj, obj2);
            if (equalGraphsNoMemo) {
                this.knownEquals.put(obj, obj2);
                this.knownEquals.put(obj2, obj);
            }
            this.currentlyCompared.remove(obj);
            return equalGraphsNoMemo;
        }
    }
}
