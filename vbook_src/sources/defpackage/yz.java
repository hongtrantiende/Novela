package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz  reason: default package */
/* loaded from: classes.dex */
public final class yz extends jla implements Map {
    public tz d;
    public vz e;
    public xz f;

    public yz() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        tz tzVar = this.d;
        if (tzVar == null) {
            tz tzVar2 = new tz(this, 0);
            this.d = tzVar2;
            return tzVar2;
        }
        return tzVar;
    }

    public final boolean i(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.c;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i != this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        vz vzVar = this.e;
        if (vzVar == null) {
            vz vzVar2 = new vz(this);
            this.e = vzVar2;
            return vzVar2;
        }
        return vzVar;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        if (iArr.length < size) {
            this.a = Arrays.copyOf(iArr, size);
            this.b = Arrays.copyOf(this.b, size * 2);
        }
        if (this.c != i) {
            vs.f();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        xz xzVar = this.f;
        if (xzVar == null) {
            xz xzVar2 = new xz(this);
            this.f = xzVar2;
            return xzVar2;
        }
        return xzVar;
    }
}
