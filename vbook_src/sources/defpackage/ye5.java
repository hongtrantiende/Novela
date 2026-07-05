package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ye5  reason: default package */
/* loaded from: classes3.dex */
public final class ye5 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public xt4 d = new tn4(24);
    public boolean e = true;
    public boolean f = true;

    public ye5() {
        int i = jy8.a;
    }

    public final void a(jf5 jf5Var, xt4 xt4Var) {
        jf5Var.getClass();
        h40 key = jf5Var.getKey();
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(jf5Var.getKey(), new xw1((xt4) linkedHashMap.get(key), xt4Var, 1));
        h40 key2 = jf5Var.getKey();
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(key2)) {
            return;
        }
        linkedHashMap2.put(jf5Var.getKey(), new fo4(jf5Var, 5));
    }
}
