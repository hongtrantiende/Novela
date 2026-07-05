package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ju2  reason: default package */
/* loaded from: classes.dex */
public final class ju2 extends jbe implements Map {
    public final Map C;

    public ju2(Map map) {
        super(7);
        this.C = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.C.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && this.C.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((cca) entrySet()).iterator();
        it.getClass();
        Iterator it2 = it;
        if (obj == null) {
            while (it2.hasNext()) {
                if (((Map.Entry) it2.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it2.hasNext()) {
            if (obj.equals(((Map.Entry) it2.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return hif.n(this.C.entrySet(), new iu2(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && nxe.u(obj, this)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.C.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return hif.p(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.C;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return hif.n(this.C.keySet(), new iu2(1));
    }

    @Override // defpackage.jbe
    public final Object m() {
        return this.C;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.C.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.C.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.C.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.C;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.C.values();
    }
}
