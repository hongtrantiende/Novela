package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sw4  reason: default package */
/* loaded from: classes.dex */
public class sw4 implements Iterator, j76 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;

    public sw4(wv7 wv7Var) {
        this.a = 2;
        this.d = wv7Var;
        this.b = -1;
        this.c = h9a.O(new vv7(wv7Var, this, null));
    }

    public void a() {
        Object invoke;
        int i;
        int i2 = this.b;
        ki4 ki4Var = (ki4) this.d;
        if (i2 == -2) {
            invoke = ((vt4) ki4Var.c).invoke();
        } else {
            Object obj = this.c;
            obj.getClass();
            invoke = ((xt4) ki4Var.b).invoke(obj);
        }
        this.c = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 1) {
                    return true;
                }
                return false;
            case 1:
                return ((c9a) this.c).hasNext();
            case 2:
                return ((c9a) this.c).hasNext();
            default:
                if (this.b < ((Map) this.d).size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = null;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b != 0) {
                    Object obj2 = this.c;
                    obj2.getClass();
                    this.b = -1;
                    return obj2;
                }
                xk5.g();
                return null;
            case 1:
                return ((c9a) this.c).next();
            case 2:
                return ((c9a) this.c).next();
            default:
                if (hasNext()) {
                    obj = this.c;
                    this.b++;
                    Object obj3 = ((Map) this.d).get(obj);
                    if (obj3 != null) {
                        this.c = ((dq6) obj3).b;
                    } else {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                } else {
                    xk5.g();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.b;
                if (i2 != -1) {
                    ((nv7) obj).b.i(i2);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.b;
                if (i3 != -1) {
                    ((wv7) obj).b.m(i3);
                    this.b = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public sw4(ki4 ki4Var) {
        this.a = 0;
        this.d = ki4Var;
        this.b = -2;
    }

    public sw4(Object obj, Map map) {
        this.a = 3;
        this.c = obj;
        this.d = map;
    }

    public sw4(nv7 nv7Var) {
        this.a = 1;
        this.d = nv7Var;
        this.b = -1;
        this.c = h9a.O(new mv7(nv7Var, this, null));
    }
}
