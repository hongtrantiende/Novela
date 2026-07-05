package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c0e  reason: default package */
/* loaded from: classes.dex */
public final class c0e implements Map, Serializable {
    public transient ixd a;
    public transient gyd b;
    public transient gzd c;
    public final transient Object[] d;

    public c0e(Object[] objArr) {
        this.d = objArr;
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
        gzd gzdVar = this.c;
        if (gzdVar == null) {
            gzdVar = new gzd(this.d, 1);
            this.c = gzdVar;
        }
        return gzdVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ixd ixdVar = this.a;
        if (ixdVar == null) {
            ixd ixdVar2 = new ixd(this, this.d);
            this.a = ixdVar2;
            return ixdVar2;
        }
        return ixdVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
        L3:
            r2 = r0
            goto L19
        L5:
            r1 = 0
            java.lang.Object[] r2 = r2.d
            r1 = r2[r1]
            r1.getClass()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L3
            r3 = 1
            r2 = r2[r3]
            r2.getClass()
        L19:
            if (r2 != 0) goto L1c
            return r0
        L1c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0e.get(java.lang.Object):java.lang.Object");
    }

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
        int i;
        ixd ixdVar = this.a;
        if (ixdVar == null) {
            ixdVar = new ixd(this, this.d);
            this.a = ixdVar;
        }
        int i2 = 0;
        for (Object obj : ixdVar) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        gyd gydVar = this.b;
        if (gydVar == null) {
            gyd gydVar2 = new gyd(this, new gzd(this.d, 0));
            this.b = gydVar2;
            return gydVar2;
        }
        return gydVar;
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

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
        sb.append('{');
        Iterator it = ((ixd) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
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

    @Override // java.util.Map
    public final Collection values() {
        gzd gzdVar = this.c;
        if (gzdVar == null) {
            gzd gzdVar2 = new gzd(this.d, 1);
            this.c = gzdVar2;
            return gzdVar2;
        }
        return gzdVar;
    }
}
