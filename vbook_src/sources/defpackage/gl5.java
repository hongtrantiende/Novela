package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gl5  reason: default package */
/* loaded from: classes.dex */
public final class gl5 implements Map, n76 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(new fl5(obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set<Map.Entry> entrySet = this.a.entrySet();
        ArrayList arrayList = new ArrayList(tl1.s(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new el5(entry));
        }
        return sl1.G0(arrayList);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.get(new fl5(obj));
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set<fl5> keySet = this.a.keySet();
        ArrayList arrayList = new ArrayList(tl1.s(keySet, 10));
        for (fl5 fl5Var : keySet) {
            arrayList.add(fl5Var.a);
        }
        return sl1.G0(arrayList);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.put(new fl5(obj), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.a.remove(new fl5(obj));
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.a.values();
    }
}
