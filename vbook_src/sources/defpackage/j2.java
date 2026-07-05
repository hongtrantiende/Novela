package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j2  reason: default package */
/* loaded from: classes.dex */
public class j2 extends AbstractMap {
    public transient h2 a;
    public transient y2 b;
    public final transient Map c;
    public final /* synthetic */ gu7 d;

    public j2(gu7 gu7Var, Map map) {
        this.d = gu7Var;
        this.c = map;
    }

    public final js5 a(Map.Entry entry) {
        r2 r2Var;
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        gu7 gu7Var = this.d;
        if (z) {
            r2Var = new r2(gu7Var, key, list, null);
        } else {
            r2Var = new r2(gu7Var, key, list, null);
        }
        return new js5(key, r2Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        gu7 gu7Var = this.d;
        if (this.c == gu7Var.e) {
            gu7Var.b();
            return;
        }
        i2 i2Var = new i2(this);
        while (i2Var.hasNext()) {
            i2Var.next();
            i2Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h2 h2Var = this.a;
        if (h2Var == null) {
            h2 h2Var2 = new h2(this);
            this.a = h2Var2;
            return h2Var2;
        }
        return h2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        r2 r2Var;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        gu7 gu7Var = this.d;
        if (z) {
            r2Var = new r2(gu7Var, obj, list, null);
        } else {
            r2Var = new r2(gu7Var, obj, list, null);
        }
        return r2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        gu7 gu7Var = this.d;
        Set set = gu7Var.b;
        if (set == null) {
            Set e = gu7Var.e();
            gu7Var.b = e;
            return e;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        gu7 gu7Var = this.d;
        Collection i = gu7Var.i();
        i.addAll(collection);
        gu7Var.f -= collection.size();
        collection.clear();
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        y2 y2Var = this.b;
        if (y2Var == null) {
            y2 y2Var2 = new y2(this);
            this.b = y2Var2;
            return y2Var2;
        }
        return y2Var;
    }
}
