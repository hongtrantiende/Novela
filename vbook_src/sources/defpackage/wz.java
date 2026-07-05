package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wz  reason: default package */
/* loaded from: classes.dex */
public final class wz implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ yz d;

    public wz(yz yzVar) {
        this.d = yzVar;
        this.a = yzVar.c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.b;
                yz yzVar = this.d;
                if (c16.i(key, yzVar.e(i)) && c16.i(entry.getValue(), yzVar.h(this.b))) {
                    return true;
                }
            }
            return false;
        }
        vs.k("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.e(this.b);
        }
        vs.k("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.h(this.b);
        }
        vs.k("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.c) {
            int i2 = this.b;
            yz yzVar = this.d;
            Object e = yzVar.e(i2);
            Object h = yzVar.h(this.b);
            if (e == null) {
                hashCode = 0;
            } else {
                hashCode = e.hashCode();
            }
            if (h != null) {
                i = h.hashCode();
            }
            return hashCode ^ i;
        }
        vs.k("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.d.f(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        vm1.d();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.g(this.b, obj);
        }
        vs.k("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
