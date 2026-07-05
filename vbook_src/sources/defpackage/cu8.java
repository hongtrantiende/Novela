package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cu8  reason: default package */
/* loaded from: classes.dex */
public final class cu8 extends b3 {
    public final /* synthetic */ int a;
    public final au8 b;

    public /* synthetic */ cu8(int i, au8 au8Var) {
        this.a = i;
        this.b = au8Var;
    }

    @Override // defpackage.b3
    public final int a() {
        switch (this.a) {
            case 0:
                return this.b.f;
            default:
                return this.b.f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                au8 au8Var = this.b;
                Object obj2 = au8Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !au8Var.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new st6(this.b);
            default:
                aoc[] aocVarArr = new aoc[8];
                for (int i = 0; i < 8; i++) {
                    aocVarArr[i] = new boc(1);
                }
                return new bu8(this.b, aocVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                au8 au8Var = this.b;
                if (!au8Var.containsKey(obj)) {
                    return false;
                }
                au8Var.remove(obj);
                return true;
        }
    }
}
