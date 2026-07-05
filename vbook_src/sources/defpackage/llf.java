package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: llf  reason: default package */
/* loaded from: classes.dex */
public final class llf extends lxd {
    public final Map b;

    public llf(hre hreVar, hre hreVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, hreVar);
        d(linkedHashMap, hreVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((sjf) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, hre hreVar) {
        for (int i = 0; i < hreVar.t(); i++) {
            sjf u = hreVar.u(i);
            Object obj = linkedHashMap.get(u);
            boolean z = u.c;
            Class cls = u.b;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(u, list);
                }
                list.add(cls.cast(hreVar.v(i)));
            } else {
                linkedHashMap.put(u, cls.cast(hreVar.v(i)));
            }
        }
    }

    @Override // defpackage.lxd
    public final void a(dlf dlfVar, vkf vkfVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            sjf sjfVar = (sjf) entry.getKey();
            Object value = entry.getValue();
            if (sjfVar.c) {
                dlfVar.b(sjfVar, ((List) value).iterator(), vkfVar);
            } else {
                dlfVar.a(sjfVar, value, vkfVar);
            }
        }
    }

    @Override // defpackage.lxd
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.lxd
    public final Set c() {
        return this.b.keySet();
    }
}
