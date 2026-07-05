package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p2  reason: default package */
/* loaded from: classes.dex */
public class p2 extends k2 implements SortedSet {
    public final /* synthetic */ gu7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(gu7 gu7Var, SortedMap sortedMap) {
        super(gu7Var, sortedMap);
        this.c = gu7Var;
    }

    public SortedMap a() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new p2(this.c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new p2(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new p2(this.c, a().tailMap(obj));
    }
}
