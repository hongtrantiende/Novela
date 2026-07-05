package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om9  reason: default package */
/* loaded from: classes.dex */
public final class om9 extends ts5 {
    public final transient rm9 d;
    public final transient Object[] e;
    public final transient int f;

    public om9(rm9 rm9Var, Object[] objArr, int i) {
        this.d = rm9Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.is5
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return true;
    }

    @Override // defpackage.is5
    public final jwc g() {
        return a().listIterator(0);
    }

    @Override // defpackage.ts5
    public final qs5 k() {
        return new nm9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
