package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r8e  reason: default package */
/* loaded from: classes.dex */
public final class r8e extends n6e {
    public final transient m9e D;
    public final transient Object[] E;
    public final transient int F;

    public r8e(m9e m9eVar, Object[] objArr, int i) {
        super(1);
        this.D = m9eVar;
        this.E = objArr;
        this.F = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.D.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hwd
    public final int f(Object[] objArr) {
        w1e w1eVar = this.C;
        if (w1eVar == null) {
            w1eVar = new d8e(this);
            this.C = w1eVar;
        }
        return w1eVar.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        w1e w1eVar = this.C;
        if (w1eVar == null) {
            w1eVar = new d8e(this);
            this.C = w1eVar;
        }
        return w1eVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.F;
    }
}
