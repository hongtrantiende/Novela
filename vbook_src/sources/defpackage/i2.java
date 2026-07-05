package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i2  reason: default package */
/* loaded from: classes.dex */
public class i2 implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public i2(r2 r2Var) {
        Iterator it;
        this.d = r2Var;
        Collection collection = r2Var.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public void a() {
        r2 r2Var = (r2) this.d;
        r2Var.b();
        if (r2Var.b == ((Collection) this.c)) {
            return;
        }
        vs.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            default:
                a();
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((j2) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        boolean z = false;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                wq9.C("no calls to next() since the last call to remove()", z);
                it.remove();
                ((j2) obj).d.f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                if (((Map.Entry) this.c) != null) {
                    z = true;
                }
                wq9.C("no calls to next() since the last call to remove()", z);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((k2) obj).b.f -= collection.size();
                collection.clear();
                this.c = null;
                return;
            default:
                it.remove();
                r2 r2Var = (r2) obj;
                r2Var.e.f--;
                r2Var.c();
                return;
        }
    }

    public i2(r2 r2Var, ListIterator listIterator) {
        this.d = r2Var;
        this.c = r2Var.b;
        this.b = listIterator;
    }

    public i2(k2 k2Var, Iterator it) {
        this.b = it;
        this.d = k2Var;
    }

    public i2(j2 j2Var) {
        this.d = j2Var;
        this.b = j2Var.c.entrySet().iterator();
    }
}
