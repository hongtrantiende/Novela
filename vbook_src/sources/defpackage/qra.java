package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qra  reason: default package */
/* loaded from: classes.dex */
public final class qra implements iza, Map, n76 {
    public pra a;
    public final era b;
    public final era c;
    public final era d;

    public qra() {
        yt8 yt8Var = yt8.c;
        zqa j = dra.j();
        pra praVar = new pra(j.g(), yt8Var);
        if (!(j instanceof lz4)) {
            praVar.b = new pra(1L, yt8Var);
        }
        this.a = praVar;
        this.b = new era(this, 0);
        this.c = new era(this, 1);
        this.d = new era(this, 2);
    }

    public static final boolean c(qra qraVar, pra praVar, int i, yt8 yt8Var) {
        boolean z;
        synchronized (vve.g) {
            int i2 = praVar.d;
            if (i2 == i) {
                praVar.c = yt8Var;
                z = true;
                praVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.a;
    }

    @Override // java.util.Map
    public final void clear() {
        zqa j;
        pra praVar = this.a;
        praVar.getClass();
        yt8 yt8Var = yt8.c;
        if (yt8Var != ((pra) dra.h(praVar)).c) {
            pra praVar2 = this.a;
            praVar2.getClass();
            synchronized (dra.c) {
                j = dra.j();
                pra praVar3 = (pra) dra.w(praVar2, this, j);
                synchronized (vve.g) {
                    praVar3.c = yt8Var;
                    praVar3.d++;
                }
            }
            dra.n(j, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return d().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return d().c.containsValue(obj);
    }

    public final pra d() {
        pra praVar = this.a;
        praVar.getClass();
        return (pra) dra.t(praVar, this);
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.getClass();
        this.a = (pra) kzaVar;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return d().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        yt8 yt8Var;
        int i;
        Object put;
        zqa j;
        boolean c;
        do {
            synchronized (vve.g) {
                pra praVar = this.a;
                praVar.getClass();
                pra praVar2 = (pra) dra.h(praVar);
                yt8Var = praVar2.c;
                i = praVar2.d;
            }
            yt8Var.getClass();
            au8 b = yt8Var.b();
            put = b.put(obj, obj2);
            yt8 b2 = b.b();
            if (c16.i(b2, yt8Var)) {
                break;
            }
            pra praVar3 = this.a;
            praVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                c = c(this, (pra) dra.w(praVar3, this, j), i, b2);
            }
            dra.n(j, this);
        } while (!c);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        yt8 yt8Var;
        int i;
        zqa j;
        boolean c;
        do {
            synchronized (vve.g) {
                pra praVar = this.a;
                praVar.getClass();
                pra praVar2 = (pra) dra.h(praVar);
                yt8Var = praVar2.c;
                i = praVar2.d;
            }
            yt8Var.getClass();
            au8 b = yt8Var.b();
            b.putAll(map);
            yt8 b2 = b.b();
            if (!c16.i(b2, yt8Var)) {
                pra praVar3 = this.a;
                praVar3.getClass();
                synchronized (dra.c) {
                    j = dra.j();
                    c = c(this, (pra) dra.w(praVar3, this, j), i, b2);
                }
                dra.n(j, this);
            } else {
                return;
            }
        } while (!c);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        yt8 yt8Var;
        int i;
        V remove;
        zqa j;
        boolean c;
        do {
            synchronized (vve.g) {
                pra praVar = this.a;
                praVar.getClass();
                pra praVar2 = (pra) dra.h(praVar);
                yt8Var = praVar2.c;
                i = praVar2.d;
            }
            yt8Var.getClass();
            au8 b = yt8Var.b();
            remove = b.remove(obj);
            yt8 b2 = b.b();
            if (c16.i(b2, yt8Var)) {
                break;
            }
            pra praVar3 = this.a;
            praVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                c = c(this, (pra) dra.w(praVar3, this, j), i, b2);
            }
            dra.n(j, this);
        } while (!c);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return d().c.size();
    }

    public final String toString() {
        pra praVar = this.a;
        praVar.getClass();
        yt8 yt8Var = ((pra) dra.h(praVar)).c;
        int hashCode = hashCode();
        return "SnapshotStateMap(value=" + yt8Var + ")@" + hashCode;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
