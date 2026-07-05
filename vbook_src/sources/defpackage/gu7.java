package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gu7  reason: default package */
/* loaded from: classes.dex */
public final class gu7 extends z2 implements Serializable {
    public transient fu7 C;
    public final transient Map e;
    public transient int f;

    public gu7(Map map) {
        wq9.s(map.isEmpty());
        this.e = map;
    }

    @Override // defpackage.z2
    public final void b() {
        Map map = this.e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // defpackage.z2
    public final Map c() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new l2(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new o2(this, (SortedMap) map);
        }
        return new j2(this, map);
    }

    @Override // defpackage.z2
    public final Collection d() {
        return new y2(this, 0);
    }

    @Override // defpackage.z2
    public final Set e() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new m2(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new p2(this, (SortedMap) map);
        }
        return new k2(this, map);
    }

    @Override // defpackage.z2
    public final Iterator f() {
        return new g2(this, 1);
    }

    @Override // defpackage.z2
    public final int h() {
        return this.f;
    }

    public final Collection i() {
        return (List) this.C.get();
    }

    public final boolean j(Object obj, Object obj2) {
        Map map = this.e;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection i = i();
            if (i.add(obj2)) {
                this.f++;
                map.put(obj, i);
                return true;
            }
            vs.j("New Collection violated the Collection spec");
            return false;
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f++;
            return true;
        }
    }
}
