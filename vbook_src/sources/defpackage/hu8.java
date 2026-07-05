package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hu8  reason: default package */
/* loaded from: classes.dex */
public final class hu8 extends b3 implements Collection, k76 {
    public gu8 a;
    public Object b;
    public Object c;
    public final au8 d;

    public hu8(gu8 gu8Var) {
        this.a = gu8Var;
        this.b = gu8Var.a;
        this.c = gu8Var.b;
        this.d = gu8Var.c.a();
    }

    @Override // defpackage.b3
    public final int a() {
        return this.d.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        au8 au8Var = this.d;
        if (au8Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            au8Var.put(obj, new dq6());
            return true;
        }
        V v = au8Var.get(this.c);
        v.getClass();
        au8Var.put(this.c, new dq6(((dq6) v).a, obj));
        au8Var.put(obj, new dq6(this.c));
        this.c = obj;
        return true;
    }

    public final gu8 b() {
        yt8 a = this.d.a();
        gu8 gu8Var = this.a;
        if (a != gu8Var.c) {
            gu8Var = new gu8(this.b, this.c, a);
        }
        this.a = gu8Var;
        return gu8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
        hq7 hq7Var = hq7.H;
        this.b = hq7Var;
        this.c = hq7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new iu8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        au8 au8Var = this.d;
        dq6 dq6Var = (dq6) au8Var.remove(obj);
        if (dq6Var == null) {
            return false;
        }
        Object obj2 = dq6Var.b;
        Object obj3 = dq6Var.a;
        hq7 hq7Var = hq7.H;
        if (obj3 != hq7Var) {
            V v = au8Var.get(obj3);
            v.getClass();
            au8Var.put(obj3, new dq6(((dq6) v).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != hq7Var) {
            V v2 = au8Var.get(obj2);
            v2.getClass();
            au8Var.put(obj2, new dq6(obj3, ((dq6) v2).b));
            return true;
        }
        this.c = obj3;
        return true;
    }
}
