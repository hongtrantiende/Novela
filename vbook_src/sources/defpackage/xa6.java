package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa6  reason: default package */
/* loaded from: classes3.dex */
public final class xa6 extends LinkedHashMap {
    public final mp6 a;
    public final bo7 b;
    public final int c;

    public xa6(mp6 mp6Var, bo7 bo7Var) {
        super(10, 0.75f, true);
        this.a = mp6Var;
        this.b = bo7Var;
        this.c = 10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.c == 0) {
            return this.a.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object invoke = this.a.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        boolean z;
        entry.getClass();
        if (super.size() > this.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b.invoke(entry.getValue());
        }
        return z;
    }
}
