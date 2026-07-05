package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss1  reason: default package */
/* loaded from: classes.dex */
public final class ss1 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ us1 b;

    public /* synthetic */ ss1(us1 us1Var, int i) {
        this.a = i;
        this.b = us1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        us1 us1Var = this.b;
        switch (i) {
            case 0:
                us1Var.clear();
                return;
            default:
                us1Var.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        us1 us1Var = this.b;
        switch (i) {
            case 0:
                Map b = us1Var.b();
                if (b != null) {
                    return b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = us1Var.d(entry.getKey());
                    if (d != -1 && bue.g(us1Var.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return us1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        us1 us1Var = this.b;
        switch (i) {
            case 0:
                Map b = us1Var.b();
                if (b != null) {
                    return b.entrySet().iterator();
                }
                return new rs1(us1Var, 1);
            default:
                Map b2 = us1Var.b();
                if (b2 != null) {
                    return b2.keySet().iterator();
                }
                return new rs1(us1Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        us1 us1Var = this.b;
        switch (i) {
            case 0:
                Map b = us1Var.b();
                if (b != null) {
                    return b.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (us1Var.f()) {
                    return false;
                }
                int c = us1Var.c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = us1Var.a;
                Objects.requireNonNull(obj2);
                int y = fxe.y(key, value, c, obj2, us1Var.h(), us1Var.i(), us1Var.j());
                if (y == -1) {
                    return false;
                }
                us1Var.e(y, c);
                us1Var.f--;
                us1Var.e += 32;
                return true;
            default:
                Map b2 = us1Var.b();
                if (b2 != null) {
                    return b2.keySet().remove(obj);
                }
                if (us1Var.g(obj) == us1.F) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        us1 us1Var = this.b;
        switch (i) {
            case 0:
                return us1Var.size();
            default:
                return us1Var.size();
        }
    }
}
