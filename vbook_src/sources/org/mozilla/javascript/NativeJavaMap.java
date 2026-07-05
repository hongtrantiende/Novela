package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeJavaMap extends NativeJavaObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -3786257752907047381L;
    private static Callable symbol_iterator = new ay7(19);
    private Map<Object, Object> map;

    public NativeJavaMap(Scriptable scriptable, Object obj) {
        super(scriptable, obj, obj.getClass());
        this.map = (Map) obj;
    }

    public static void init(ScriptableObject scriptableObject, boolean z) {
        NativeJavaMapIterator.init(scriptableObject, z);
    }

    public static /* synthetic */ Object lambda$static$0(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (scriptable2 instanceof NativeJavaMap) {
            return new NativeJavaMapIterator(scriptable, ((NativeJavaMap) scriptable2).map);
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", SymbolKey.ITERATOR);
    }

    @Override // org.mozilla.javascript.NativeJavaObject
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        Class<?> cls;
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(21) && this.map.containsKey(Integer.valueOf(i))) {
            Object obj = this.map.get(Integer.valueOf(i));
            WrapFactory wrapFactory = currentContext.getWrapFactory();
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            return wrapFactory.wrap(currentContext, this, obj, cls);
        }
        return super.get(i, scriptable);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "JavaMap";
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(21)) {
            ArrayList arrayList = new ArrayList(this.map.size());
            for (Object obj : this.map.keySet()) {
                if (obj instanceof Integer) {
                    arrayList.add(obj);
                } else {
                    arrayList.add(ScriptRuntime.toString(obj));
                }
            }
            return arrayList.toArray();
        }
        return super.getIds();
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(21) && this.map.containsKey(Integer.valueOf(i))) {
            return true;
        }
        return super.has(i, scriptable);
    }

    @Override // org.mozilla.javascript.NativeJavaObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        Context context = Context.getContext();
        if (context != null && context.hasFeature(21)) {
            this.map.put(Integer.valueOf(i), Context.jsToJava(obj, Object.class));
        } else {
            super.put(i, scriptable, obj);
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class NativeJavaMapIterator extends ES6Iterator {
        private static final String ITERATOR_TAG = "JavaMapIterator";
        private static final long serialVersionUID = 1;
        private Iterator<Map.Entry<Object, Object>> iterator;

        public NativeJavaMapIterator(Scriptable scriptable, Map<Object, Object> map) {
            super(scriptable, ITERATOR_TAG);
            this.iterator = map.entrySet().iterator();
        }

        public static void init(ScriptableObject scriptableObject, boolean z) {
            ES6Iterator.init(scriptableObject, z, new NativeJavaMapIterator(), ITERATOR_TAG);
        }

        @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
        public String getClassName() {
            return "Java Map Iterator";
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
                Object obj = Undefined.instance;
                return context.newArray(scriptable, new Object[]{obj, obj});
            }
            Map.Entry<Object, Object> next = this.iterator.next();
            Object key = next.getKey();
            Object value = next.getValue();
            WrapFactory wrapFactory = context.getWrapFactory();
            Class<?> cls2 = null;
            if (key == null) {
                cls = null;
            } else {
                cls = key.getClass();
            }
            Object wrap = wrapFactory.wrap(context, this, key, cls);
            if (value != null) {
                cls2 = value.getClass();
            }
            return context.newArray(scriptable, new Object[]{wrap, wrapFactory.wrap(context, this, value, cls2)});
        }

        private NativeJavaMapIterator() {
        }
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(21) && this.map.containsKey(str)) {
            return true;
        }
        return super.has(str, scriptable);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(21)) {
            this.map.put(str, Context.jsToJava(obj, Object.class));
        } else {
            super.put(str, scriptable, obj);
        }
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.SymbolScriptable
    public boolean has(Symbol symbol, Scriptable scriptable) {
        return SymbolKey.ITERATOR.equals(symbol);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null && currentContext.hasFeature(21) && this.map.containsKey(str)) {
            Object obj = this.map.get(str);
            return currentContext.getWrapFactory().wrap(currentContext, this, obj, obj == null ? null : obj.getClass());
        }
        return super.get(str, scriptable);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.SymbolScriptable
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return symbol_iterator;
        }
        return super.get(symbol, scriptable);
    }
}
