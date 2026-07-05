package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yde  reason: default package */
/* loaded from: classes.dex */
public abstract class yde implements Map, Serializable {
    public static final Map.Entry[] b = new Map.Entry[0];
    public transient dee a;

    @Override // java.util.Map
    /* renamed from: a */
    public final dee entrySet() {
        dee deeVar = this.a;
        if (deeVar == null) {
            mee meeVar = (mee) this;
            if (meeVar.isEmpty()) {
                deeVar = qfe.K;
            } else {
                deeVar = new jee(meeVar);
            }
            this.a = deeVar;
        }
        return deeVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((mee) this).d.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((mee) this).entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return cae.B(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((mee) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        mee meeVar = (mee) this;
        int size = meeVar.size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : meeVar.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        vs.m(a82.j(size, "size cannot be negative but was: "));
        return null;
    }
}
