package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: era  reason: default package */
/* loaded from: classes.dex */
public final class era implements Set, o76 {
    public final qra a;
    public final /* synthetic */ int b;

    public era(qra qraVar, int i) {
        this.b = i;
        this.a = qraVar;
    }

    private final boolean a(Collection collection) {
        yt8 yt8Var;
        int i;
        zqa j;
        boolean c;
        Set H0 = sl1.H0(collection);
        qra qraVar = this.a;
        boolean z = false;
        do {
            synchronized (vve.g) {
                pra praVar = qraVar.a;
                praVar.getClass();
                pra praVar2 = (pra) dra.h(praVar);
                yt8Var = praVar2.c;
                i = praVar2.d;
            }
            yt8Var.getClass();
            au8 b = yt8Var.b();
            Iterator it = qraVar.b.iterator();
            while (((z1) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((hza) it).next();
                if (!H0.contains(entry.getKey())) {
                    b.remove(entry.getKey());
                    z = true;
                }
            }
            yt8 b2 = b.b();
            if (c16.i(b2, yt8Var)) {
                break;
            }
            pra praVar3 = qraVar.a;
            praVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                c = qra.c(qraVar, (pra) dra.w(praVar3, qraVar, j), i, b2);
            }
            dra.n(j, qraVar);
        } while (!c);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                vve.o();
                throw null;
            case 1:
                vve.o();
                throw null;
            default:
                vve.o();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                vve.o();
                throw null;
            case 1:
                vve.o();
                throw null;
            default:
                vve.o();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        qra qraVar = this.a;
        switch (i) {
            case 0:
                if (!jsc.H(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return c16.i(qraVar.get(entry.getKey()), entry.getValue());
            case 1:
                return qraVar.containsKey(obj);
            default:
                return qraVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.b;
        qra qraVar = this.a;
        switch (i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!contains(entry)) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection<Object> collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    for (Object obj : collection3) {
                        if (!qraVar.containsKey(obj)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection<Object> collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    for (Object obj2 : collection4) {
                        if (!qraVar.containsValue(obj2)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        qra qraVar = this.a;
        switch (i) {
            case 0:
                return new hza(qraVar, ((us5) qraVar.d().c.entrySet()).iterator(), 0);
            case 1:
                return new hza(qraVar, ((us5) qraVar.d().c.entrySet()).iterator(), 1);
            default:
                return new hza(qraVar, ((us5) qraVar.d().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.b;
        qra qraVar = this.a;
        switch (i) {
            case 0:
                if (!jsc.H(obj) || qraVar.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (qraVar.remove(obj) == null) {
                    return false;
                }
                return true;
            default:
                Iterator it = qraVar.b.iterator();
                while (true) {
                    if (((z1) it).hasNext()) {
                        obj2 = ((hza) it).next();
                        if (c16.i(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                qraVar.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        yt8 yt8Var;
        int i;
        zqa j;
        boolean c;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
            case 1:
                while (true) {
                    boolean z3 = false;
                    for (Object obj : collection) {
                        if (this.a.remove(obj) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set H0 = sl1.H0(collection);
                qra qraVar = this.a;
                do {
                    synchronized (vve.g) {
                        pra praVar = qraVar.a;
                        praVar.getClass();
                        pra praVar2 = (pra) dra.h(praVar);
                        yt8Var = praVar2.c;
                        i = praVar2.d;
                    }
                    yt8Var.getClass();
                    au8 b = yt8Var.b();
                    Iterator it2 = qraVar.b.iterator();
                    while (((z1) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((hza) it2).next();
                        if (H0.contains(entry.getValue())) {
                            b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    yt8 b2 = b.b();
                    if (!c16.i(b2, yt8Var)) {
                        pra praVar3 = qraVar.a;
                        praVar3.getClass();
                        synchronized (dra.c) {
                            j = dra.j();
                            c = qra.c(qraVar, (pra) dra.w(praVar3, qraVar, j), i, b2);
                        }
                        dra.n(j, qraVar);
                    }
                    return z;
                } while (!c);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        yt8 yt8Var;
        int i;
        zqa j;
        boolean c;
        yt8 yt8Var2;
        int i2;
        zqa j2;
        boolean c2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int k = p17.k(tl1.s(collection2, 10));
                if (k < 16) {
                    k = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                qra qraVar = this.a;
                do {
                    synchronized (vve.g) {
                        pra praVar = qraVar.a;
                        praVar.getClass();
                        pra praVar2 = (pra) dra.h(praVar);
                        yt8Var = praVar2.c;
                        i = praVar2.d;
                    }
                    yt8Var.getClass();
                    au8 b = yt8Var.b();
                    Iterator it = qraVar.b.iterator();
                    while (((z1) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((hza) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !c16.i(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    yt8 b2 = b.b();
                    if (!c16.i(b2, yt8Var)) {
                        pra praVar3 = qraVar.a;
                        praVar3.getClass();
                        synchronized (dra.c) {
                            j = dra.j();
                            c = qra.c(qraVar, (pra) dra.w(praVar3, qraVar, j), i, b2);
                        }
                        dra.n(j, qraVar);
                    }
                    return z;
                } while (!c);
                return z;
            case 1:
                return a(collection);
            default:
                Set H0 = sl1.H0(collection);
                qra qraVar2 = this.a;
                do {
                    synchronized (vve.g) {
                        pra praVar4 = qraVar2.a;
                        praVar4.getClass();
                        pra praVar5 = (pra) dra.h(praVar4);
                        yt8Var2 = praVar5.c;
                        i2 = praVar5.d;
                    }
                    yt8Var2.getClass();
                    au8 b3 = yt8Var2.b();
                    Iterator it2 = qraVar2.b.iterator();
                    while (((z1) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((hza) it2).next();
                        if (!H0.contains(entry3.getValue())) {
                            b3.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    yt8 b4 = b3.b();
                    if (!c16.i(b4, yt8Var2)) {
                        pra praVar6 = qraVar2.a;
                        praVar6.getClass();
                        synchronized (dra.c) {
                            j2 = dra.j();
                            c2 = qra.c(qraVar2, (pra) dra.w(praVar6, qraVar2, j2), i2, b4);
                        }
                        dra.n(j2, qraVar2);
                    }
                    return z;
                } while (!c2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pbe.q(this, objArr);
    }
}
