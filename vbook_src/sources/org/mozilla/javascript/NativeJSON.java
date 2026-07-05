package org.mozilla.javascript;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.json.JsonParser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeJSON extends ScriptableObject {
    private static final String JSON_TAG = "JSON";
    private static final int MAX_STRINGIFY_GAP_LENGTH = 10;
    private static final long serialVersionUID = -4567599697595654984L;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class StringifyState {
        Context cx;
        String gap;
        String indent;
        Object[] propertyList;
        Callable replacer;
        Scriptable scope;
        ArrayDeque<Object> stack = new ArrayDeque<>();

        public StringifyState(Context context, Scriptable scriptable, String str, String str2, Callable callable, Object[] objArr) {
            this.cx = context;
            this.scope = scriptable;
            this.indent = str;
            this.gap = str2;
            this.replacer = callable;
            this.propertyList = objArr;
        }
    }

    private NativeJSON() {
    }

    public static void init(Scriptable scriptable, boolean z) {
        NativeJSON nativeJSON = new NativeJSON();
        nativeJSON.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeJSON.setParentScope(scriptable);
        nativeJSON.defineProperty(scriptable, "parse", 2, new ay7(17), 2, 3);
        nativeJSON.defineProperty(scriptable, "stringify", 3, new ay7(18), 2, 3);
        nativeJSON.defineProperty("toSource", JSON_TAG, 7);
        nativeJSON.defineProperty(SymbolKey.TO_STRING_TAG, JSON_TAG, 3);
        ScriptableObject.defineProperty(scriptable, JSON_TAG, nativeJSON, 2);
        if (z) {
            nativeJSON.sealObject();
        }
    }

    public static boolean isLeadingSurrogate(char c) {
        if (c >= 55296 && c <= 56319) {
            return true;
        }
        return false;
    }

    private static boolean isObjectArrayLike(Object obj) {
        if (obj instanceof NativeArray) {
            return true;
        }
        if (!(obj instanceof NativeJavaObject)) {
            return false;
        }
        Object unwrap = ((NativeJavaObject) obj).unwrap();
        if ((unwrap instanceof Collection) || unwrap.getClass().isArray()) {
            return true;
        }
        return false;
    }

    public static boolean isTrailingSurrogate(char c) {
        if (c >= 56320 && c <= 57343) {
            return true;
        }
        return false;
    }

    private static String ja(Scriptable scriptable, StringifyState stringifyState) {
        Object obj;
        Collection collection;
        String sb;
        Object str;
        Object[] objArr = null;
        if (scriptable instanceof Wrapper) {
            obj = ((Wrapper) scriptable).unwrap();
            collection = obj;
        } else {
            obj = scriptable;
            collection = null;
        }
        if (!stringifyState.stack.contains(obj)) {
            stringifyState.stack.push(obj);
            String str2 = stringifyState.indent;
            stringifyState.indent = nk2.u(str2, stringifyState.gap);
            ArrayList arrayList = new ArrayList();
            if (collection != null) {
                int i = 0;
                if (collection.getClass().isArray()) {
                    int length = Array.getLength(collection);
                    Object[] objArr2 = new Object[length];
                    while (i < length) {
                        objArr2[i] = Context.javaToJS(Array.get(collection, i), stringifyState.scope, stringifyState.cx);
                        i++;
                    }
                    objArr = objArr2;
                } else if (collection instanceof Collection) {
                    Collection<Object> collection2 = collection;
                    objArr = new Object[collection2.size()];
                    for (Object obj2 : collection2) {
                        objArr[i] = Context.javaToJS(obj2, stringifyState.scope, stringifyState.cx);
                        i++;
                    }
                }
                if (objArr != null) {
                    scriptable = stringifyState.cx.newArray(stringifyState.scope, objArr);
                }
            }
            long length2 = ((NativeArray) scriptable).getLength();
            for (long j = 0; j < length2; j++) {
                if (j > 2147483647L) {
                    str = str(Long.toString(j), scriptable, stringifyState);
                } else {
                    str = str(Integer.valueOf((int) j), scriptable, stringifyState);
                }
                if (str == Undefined.instance) {
                    arrayList.add("null");
                } else {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                sb = "[]";
            } else if (stringifyState.gap.length() == 0) {
                sb = hl5.n("[", join(arrayList, ","), "]");
            } else {
                StringBuilder y = nk2.y("[\n", stringifyState.indent, join(arrayList, s21.m(",\n", stringifyState.indent)), "\n", str2);
                y.append("]");
                sb = y.toString();
            }
            stringifyState.stack.pop();
            stringifyState.indent = str2;
            return sb;
        }
        throw ScriptRuntime.typeErrorById("msg.cyclic.value", obj.getClass().getName());
    }

    private static Object javaToJSON(Object obj, StringifyState stringifyState) {
        Object javaToJS = Context.javaToJS(stringifyState.cx.getJavaToJSONConverter().apply(obj), stringifyState.scope, stringifyState.cx);
        NativeObject nativeObject = new NativeObject();
        nativeObject.setParentScope(stringifyState.scope);
        nativeObject.setPrototype(ScriptableObject.getObjectPrototype(stringifyState.scope));
        nativeObject.defineProperty("", javaToJS, 0);
        return str("", nativeObject, stringifyState);
    }

    private static String jo(Scriptable scriptable, StringifyState stringifyState) {
        Map map;
        Object obj;
        String sb;
        String obj2;
        int i;
        if (scriptable instanceof Wrapper) {
            obj = ((Wrapper) scriptable).unwrap();
            map = obj;
        } else {
            map = null;
            obj = scriptable;
        }
        if (!stringifyState.stack.contains(obj)) {
            stringifyState.stack.push(obj);
            if (map instanceof Map) {
                scriptable = stringifyState.cx.newObject(stringifyState.scope);
                for (Map.Entry entry : map.entrySet()) {
                    if (!(entry.getKey() instanceof Symbol)) {
                        Object javaToJS = Context.javaToJS(entry.getValue(), stringifyState.scope, stringifyState.cx);
                        if (entry.getKey() instanceof String) {
                            obj2 = (String) entry.getKey();
                            i = 5;
                        } else {
                            obj2 = entry.getKey().toString();
                            i = 0;
                        }
                        try {
                            ScriptableObject.defineProperty(scriptable, obj2, javaToJS, i);
                        } catch (EcmaError unused) {
                        }
                    }
                }
            }
            String str = stringifyState.indent;
            stringifyState.indent = nk2.u(str, stringifyState.gap);
            Object[] objArr = stringifyState.propertyList;
            if (objArr == null) {
                objArr = scriptable.getIds();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : objArr) {
                Object str2 = str(obj3, scriptable, stringifyState);
                if (str2 != Undefined.instance) {
                    String u = nk2.u(quote(obj3.toString()), ":");
                    if (stringifyState.gap.length() > 0) {
                        u = u.concat(" ");
                    }
                    arrayList.add(u.concat(String.valueOf(str2)));
                }
            }
            if (arrayList.isEmpty()) {
                sb = "{}";
            } else if (stringifyState.gap.length() == 0) {
                sb = hl5.n("{", join(arrayList, ","), "}");
            } else {
                StringBuilder y = nk2.y("{\n", stringifyState.indent, join(arrayList, s21.m(",\n", stringifyState.indent)), "\n", str);
                y.append("}");
                sb = y.toString();
            }
            stringifyState.stack.pop();
            stringifyState.indent = str;
            return sb;
        }
        throw ScriptRuntime.typeErrorById("msg.cyclic.value", obj.getClass().getName());
    }

    private static String join(Collection<Object> collection, String str) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        Iterator<Object> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(it.next().toString());
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }

    public static Object parse(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Callable callable;
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        if (objArr.length > 1) {
            callable = objArr[1];
        } else {
            callable = null;
        }
        if (callable instanceof Callable) {
            return parse(context, scriptable, scriptRuntime, callable);
        }
        return parse(context, scriptable, scriptRuntime);
    }

    private static String quote(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        int length = str.length();
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    sb.append("\\b");
                                    continue;
                                case '\t':
                                    sb.append("\\t");
                                    continue;
                                case '\n':
                                    sb.append("\\n");
                                    continue;
                                default:
                                    if (isLeadingSurrogate(charAt) && i < length - 1 && isTrailingSurrogate(str.charAt(i + 1))) {
                                        break;
                                    } else if (isTrailingSurrogate(charAt) && isLeadingSurrogate(c)) {
                                        sb.append(c);
                                        sb.append(charAt);
                                        continue;
                                    } else if (charAt >= ' ' && !isLeadingSurrogate(charAt) && !isTrailingSurrogate(charAt)) {
                                        sb.append(charAt);
                                        break;
                                    } else {
                                        sb.append("\\u");
                                        sb.append(String.format("%04x", Integer.valueOf(charAt)));
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            sb.append("\\\\");
                        }
                    } else {
                        sb.append("\\\"");
                    }
                } else {
                    sb.append("\\r");
                }
            } else {
                sb.append("\\f");
            }
            i++;
            c = charAt;
        }
        sb.append('\"');
        return sb.toString();
    }

    private static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object str(java.lang.Object r7, org.mozilla.javascript.Scriptable r8, org.mozilla.javascript.NativeJSON.StringifyState r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeJSON.str(java.lang.Object, org.mozilla.javascript.Scriptable, org.mozilla.javascript.NativeJSON$StringifyState):java.lang.Object");
    }

    public static Object stringify(Context context, Scriptable scriptable, Object obj, Object obj2, Object obj3) {
        Callable callable;
        Object[] objArr;
        Object obj4;
        String str;
        String str2;
        if (obj2 instanceof Callable) {
            callable = (Callable) obj2;
            objArr = null;
        } else if (obj2 instanceof NativeArray) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NativeArray nativeArray = (NativeArray) obj2;
            for (Integer num : nativeArray.getIndexIds()) {
                Object obj5 = nativeArray.get(num.intValue(), nativeArray);
                if (obj5 instanceof String) {
                    linkedHashSet.add(obj5);
                } else if ((obj5 instanceof Number) || (obj5 instanceof NativeString) || (obj5 instanceof NativeNumber)) {
                    linkedHashSet.add(ScriptRuntime.toString(obj5));
                }
            }
            Object[] objArr2 = new Object[linkedHashSet.size()];
            Iterator it = linkedHashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(it.next());
                int i2 = i + 1;
                Object obj6 = stringIdOrIndex.stringId;
                if (obj6 == null) {
                    obj6 = Integer.valueOf(stringIdOrIndex.index);
                }
                objArr2[i] = obj6;
                i = i2;
            }
            objArr = objArr2;
            callable = null;
        } else {
            callable = null;
            objArr = null;
        }
        if (obj3 instanceof NativeNumber) {
            obj4 = Double.valueOf(ScriptRuntime.toNumber(obj3));
        } else if (obj3 instanceof NativeString) {
            obj4 = ScriptRuntime.toString(obj3);
        } else {
            obj4 = obj3;
        }
        if (obj4 instanceof Number) {
            int min = Math.min(10, (int) ScriptRuntime.toInteger(obj4));
            if (min <= 0) {
                str2 = "";
            } else {
                str2 = repeat(' ', min);
            }
        } else if (!(obj4 instanceof String)) {
            str = "";
            StringifyState stringifyState = new StringifyState(context, scriptable, "", str, callable, objArr);
            NativeObject nativeObject = new NativeObject();
            nativeObject.setParentScope(scriptable);
            nativeObject.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
            nativeObject.defineProperty("", obj, 0);
            return str("", nativeObject, stringifyState);
        } else {
            str2 = (String) obj4;
            if (str2.length() > 10) {
                str2 = str2.substring(0, 10);
            }
        }
        str = str2;
        StringifyState stringifyState2 = new StringifyState(context, scriptable, "", str, callable, objArr);
        NativeObject nativeObject2 = new NativeObject();
        nativeObject2.setParentScope(scriptable);
        nativeObject2.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeObject2.defineProperty("", obj, 0);
        return str("", nativeObject2, stringifyState2);
    }

    private static Object walk(Context context, Scriptable scriptable, Callable callable, Scriptable scriptable2, Object obj) {
        Object obj2;
        Object[] ids;
        if (obj instanceof Number) {
            obj2 = scriptable2.get(((Number) obj).intValue(), scriptable2);
        } else {
            obj2 = scriptable2.get((String) obj, scriptable2);
        }
        if (obj2 instanceof Scriptable) {
            Scriptable scriptable3 = (Scriptable) obj2;
            if (scriptable3 instanceof NativeArray) {
                long length = ((NativeArray) scriptable3).getLength();
                for (long j = 0; j < length; j++) {
                    if (j > 2147483647L) {
                        String l = Long.toString(j);
                        Object walk = walk(context, scriptable, callable, scriptable3, l);
                        if (walk == Undefined.instance) {
                            scriptable3.delete(l);
                        } else {
                            scriptable3.put(l, scriptable3, walk);
                        }
                    } else {
                        int i = (int) j;
                        Object walk2 = walk(context, scriptable, callable, scriptable3, Integer.valueOf(i));
                        if (walk2 == Undefined.instance) {
                            scriptable3.delete(i);
                        } else {
                            scriptable3.put(i, scriptable3, walk2);
                        }
                    }
                }
            } else {
                for (Object obj3 : scriptable3.getIds()) {
                    Object walk3 = walk(context, scriptable, callable, scriptable3, obj3);
                    if (walk3 == Undefined.instance) {
                        if (obj3 instanceof Number) {
                            scriptable3.delete(((Number) obj3).intValue());
                        } else {
                            scriptable3.delete((String) obj3);
                        }
                    } else if (obj3 instanceof Number) {
                        scriptable3.put(((Number) obj3).intValue(), scriptable3, walk3);
                    } else {
                        scriptable3.put((String) obj3, scriptable3, walk3);
                    }
                }
            }
        }
        return callable.call(context, scriptable, scriptable2, new Object[]{obj, obj2});
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return JSON_TAG;
    }

    private static Object parse(Context context, Scriptable scriptable, String str) {
        try {
            return new JsonParser(context, scriptable).parseValue(str);
        } catch (JsonParser.ParseException e) {
            throw ScriptRuntime.constructError("SyntaxError", e.getMessage());
        }
    }

    public static Object parse(Context context, Scriptable scriptable, String str, Callable callable) {
        Object parse = parse(context, scriptable, str);
        Scriptable newObject = context.newObject(scriptable);
        newObject.put("", newObject, parse);
        return walk(context, scriptable, callable, newObject, "");
    }

    public static Object stringify(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object obj2 = Undefined.instance;
        if (objArr.length > 0) {
            obj2 = objArr[0];
            if (objArr.length > 1) {
                Object obj3 = objArr[1];
                obj = objArr.length > 2 ? objArr[2] : null;
                r1 = obj3;
                return stringify(context, scriptable, obj2, r1, obj);
            }
        }
        obj = null;
        return stringify(context, scriptable, obj2, r1, obj);
    }
}
