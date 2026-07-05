package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o2  reason: default package */
/* loaded from: classes.dex */
public class o2 extends j2 implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ gu7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(gu7 gu7Var, SortedMap sortedMap) {
        super(gu7Var, sortedMap);
        this.f = gu7Var;
    }

    public SortedSet b() {
        return new p2(this.f, d());
    }

    @Override // defpackage.j2, java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet == null) {
            SortedSet b = b();
            this.e = b;
            return b;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new o2(this.f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new o2(this.f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new o2(this.f, d().tailMap(obj));
    }
}
