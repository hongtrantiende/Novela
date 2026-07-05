package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m96  reason: default package */
/* loaded from: classes3.dex */
public final class m96 {
    public final zj1 a = new zj1(24);
    public final kw5 b = new kw5(this);
    public final oaa c = new oaa(this);
    public final zg4 d = new zg4(this);
    public final kn9 e;

    public m96() {
        new ConcurrentHashMap();
        new HashMap();
        this.e = new kn9();
    }

    public final void a() {
        this.a.getClass();
        ul6 ul6Var = ul6.e;
        ul6 ul6Var2 = ul6.a;
        ul6Var.compareTo(ul6Var2);
        long a = yq7.a();
        zg4 zg4Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zg4Var.d;
        int i = 0;
        ima[] imaVarArr = (ima[]) concurrentHashMap.values().toArray(new ima[0]);
        ArrayList m = tl1.m(Arrays.copyOf(imaVarArr, imaVarArr.length));
        concurrentHashMap.clear();
        m96 m96Var = (m96) zg4Var.b;
        bm1 bm1Var = new bm1(m96Var.a, (q0a) m96Var.c.e, cm9.a(o28.class));
        int size = m.size();
        while (i < size) {
            Object obj = m.get(i);
            i++;
            ((ima) obj).b(bm1Var);
        }
        long a2 = u9c.a(a);
        hq7 hq7Var = wl3.b;
        wl3.i(a2, am3.MICROSECONDS);
        ul6Var.compareTo(ul6Var2);
    }

    public final void b(List list, boolean z) {
        Object obj;
        LinkedHashSet<wq7> linkedHashSet = new LinkedHashSet();
        rz rzVar = new rz(new z17(list));
        while (!rzVar.isEmpty()) {
            wq7 wq7Var = (wq7) rzVar.removeLast();
            if (linkedHashSet.add(wq7Var)) {
                ArrayList arrayList = wq7Var.e;
                arrayList.getClass();
                Iterator it = new ts9(arrayList).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((ss9) it).b;
                    if (listIterator.hasPrevious()) {
                        wq7 wq7Var2 = (wq7) listIterator.previous();
                        if (!linkedHashSet.contains(wq7Var2)) {
                            rzVar.addLast(wq7Var2);
                        }
                    }
                }
            }
        }
        zg4 zg4Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zg4Var.d;
        for (wq7 wq7Var3 : linkedHashSet) {
            for (Map.Entry entry : wq7Var3.c.entrySet()) {
                String str = (String) entry.getKey();
                yx5 yx5Var = (yx5) entry.getValue();
                yj0 yj0Var = yx5Var.a;
                zj1 zj1Var = ((m96) zg4Var.b).a;
                str.getClass();
                yj0 yj0Var2 = yx5Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) zg4Var.c;
                yx5 yx5Var2 = (yx5) concurrentHashMap2.get(str);
                ul6 ul6Var = ul6.e;
                if (yx5Var2 != null) {
                    if (z) {
                        yj0Var2.toString();
                        zj1Var.getClass();
                        ul6Var.compareTo(ul6.c);
                        Iterator it2 = concurrentHashMap.values().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((ima) obj).a.equals(yj0Var2)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (((ima) obj) != null) {
                            concurrentHashMap.remove(Integer.valueOf(yj0Var2.hashCode()));
                        }
                    } else {
                        throw new e60(7, "Already existing definition for " + yj0Var2 + " at " + str, false);
                    }
                }
                yj0Var2.toString();
                zj1Var.getClass();
                ul6Var.compareTo(ul6.a);
                concurrentHashMap2.put(str, yx5Var);
            }
            for (ima imaVar : wq7Var3.b) {
                concurrentHashMap.put(Integer.valueOf(imaVar.a.hashCode()), imaVar);
            }
        }
        oaa oaaVar = this.c;
        oaaVar.getClass();
        for (wq7 wq7Var4 : linkedHashSet) {
            ((Set) oaaVar.c).addAll(wq7Var4.d);
        }
    }
}
