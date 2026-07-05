package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au8  reason: default package */
/* loaded from: classes.dex */
public class au8 extends AbstractMap implements Map, n76 {
    public yt8 a;
    public cne b = new cne(29);
    public znc c;
    public Object d;
    public int e;
    public int f;

    public au8(yt8 yt8Var) {
        this.a = yt8Var;
        this.c = yt8Var.a;
        this.f = yt8Var.b;
    }

    public yt8 a() {
        znc zncVar = this.c;
        yt8 yt8Var = this.a;
        if (zncVar != yt8Var.a) {
            this.b = new cne(29);
            yt8Var = new yt8(this.c, this.f);
        }
        this.a = yt8Var;
        return yt8Var;
    }

    public /* bridge */ yt8 b() {
        return a();
    }

    public final void c(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = znc.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        znc zncVar = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return zncVar.d(i, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new cu8(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        znc zncVar = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return zncVar.g(i, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new cu8(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.d = null;
        znc zncVar = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.c = zncVar.l(i, obj, obj2, 0, this);
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [q13, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        yt8 yt8Var;
        au8 au8Var;
        yt8 yt8Var2 = null;
        if (map instanceof yt8) {
            yt8Var = (yt8) map;
        } else {
            yt8Var = null;
        }
        if (yt8Var == null) {
            if (map instanceof au8) {
                au8Var = (au8) map;
            } else {
                au8Var = null;
            }
            if (au8Var != null) {
                yt8Var2 = au8Var.a();
            }
        } else {
            yt8Var2 = yt8Var;
        }
        if (yt8Var2 != null) {
            ?? obj = new Object();
            obj.a = 0;
            int i = this.f;
            znc zncVar = this.c;
            znc zncVar2 = yt8Var2.a;
            zncVar2.getClass();
            this.c = zncVar.m(zncVar2, 0, obj, this);
            int i2 = (yt8Var2.b + i) - obj.a;
            if (i != i2) {
                c(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int i2 = this.f;
        znc zncVar = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        znc o = zncVar.o(i, obj, obj2, 0, this);
        if (o == null) {
            o = znc.e;
        }
        this.c = o;
        if (i2 == this.f) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new o81(this, 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        znc n = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = znc.e;
        }
        this.c = n;
        return this.d;
    }
}
