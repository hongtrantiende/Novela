package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r18  reason: default package */
/* loaded from: classes.dex */
public final class r18 {
    public final LinkedHashMap a;

    public r18(s18 s18Var) {
        Map map = s18Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), sl1.E0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public void a(jc7 jc7Var) {
        jc7Var.getClass();
        int i = jc7Var.a;
        int i2 = jc7Var.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + jc7Var);
        }
        treeMap.put(Integer.valueOf(i2), jc7Var);
    }

    public qya b(hmd hmdVar) {
        hmdVar.getClass();
        return (qya) this.a.remove(hmdVar);
    }

    public List c(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (c16.i(((hmd) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (hmd hmdVar : linkedHashMap.keySet()) {
            linkedHashMap2.remove(hmdVar);
        }
        return sl1.C0(linkedHashMap.values());
    }

    public void d(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, tl1.C(str));
    }

    public qya e(hmd hmdVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(hmdVar);
        if (obj == null) {
            obj = new qya(hmdVar);
            linkedHashMap.put(hmdVar, obj);
        }
        return (qya) obj;
    }

    public r18(int i) {
        switch (i) {
            case 2:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }
}
