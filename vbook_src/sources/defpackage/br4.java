package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class br4 implements vt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ yya c;
    public final /* synthetic */ yya d;
    public final /* synthetic */ yya e;
    public final /* synthetic */ Object f;

    public /* synthetic */ br4(Object obj, yya yyaVar, yya yyaVar2, yya yyaVar3, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = yyaVar;
        this.d = yyaVar2;
        this.e = yyaVar3;
        this.f = obj2;
        this.C = obj3;
        this.D = obj4;
        this.E = obj5;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        String str;
        dub dubVar;
        long a;
        List list;
        boolean z;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Collection collection;
        a6b a6bVar;
        a6b a6bVar2;
        String str2;
        int i = this.a;
        Map map = ls3.a;
        Object obj = this.E;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.f;
        yya yyaVar = this.e;
        yya yyaVar2 = this.d;
        yya yyaVar3 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                List list2 = (List) obj4;
                qo3 qo3Var = (qo3) obj3;
                ym0 ym0Var = (ym0) obj2;
                wm0 wm0Var = (wm0) obj;
                pm0 pm0Var = (pm0) ((yya) obj5).getValue();
                Set set = null;
                if (pm0Var != null) {
                    str = pm0Var.a;
                } else {
                    str = null;
                }
                hn0 hn0Var = (hn0) yyaVar3.getValue();
                boolean booleanValue = ((Boolean) yyaVar2.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) yyaVar.getValue()).booleanValue();
                if (str != null) {
                    dubVar = ym0Var.b(str);
                } else {
                    dubVar = null;
                }
                int i2 = 0;
                if (dubVar != null) {
                    a = b23.r(dubVar);
                } else {
                    a = sze.a(0, 0);
                }
                if (str != null) {
                    list = wm0Var.i(str);
                } else {
                    list = ks3.a;
                }
                if (str != null) {
                    set = wm0Var.h(str);
                }
                int i3 = fxb.c;
                int i4 = (int) (a >> 32);
                int i5 = (int) (a & 4294967295L);
                list2.getClass();
                qo3Var.getClass();
                boolean z2 = true;
                if (qo3Var.d && str != null && hn0Var != null && hn0Var.d() && hn0Var.b() && !booleanValue && !booleanValue2) {
                    int min = Math.min(i4, i5);
                    int max = Math.max(i4, i5);
                    if (min == max) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = 16;
                    if (z) {
                        a6b a6bVar3 = a6b.c;
                        a6b a6bVar4 = a6b.a;
                        if (set != null) {
                            int k = p17.k(tl1.s(list2, 10));
                            if (k >= 16) {
                                i6 = k;
                            }
                            linkedHashMap2 = new LinkedHashMap(i6);
                            for (Object obj6 : list2) {
                                tva tvaVar = (tva) obj6;
                                Set<tva> set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    for (tva tvaVar2 : set2) {
                                        if (abf.x(tvaVar2, tvaVar)) {
                                            a6bVar2 = a6bVar4;
                                            linkedHashMap2.put(obj6, a6bVar2);
                                        }
                                    }
                                }
                                a6bVar2 = a6bVar3;
                                linkedHashMap2.put(obj6, a6bVar2);
                            }
                            return new ar4(linkedHashMap2, true, str, z);
                        }
                        if (min > 0) {
                            int i7 = min - 1;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj7 : list) {
                                iyb iybVar = (iyb) obj7;
                                if (iybVar.a <= i7 && iybVar.b > i7) {
                                    arrayList.add(obj7);
                                }
                            }
                            collection = new LinkedHashSet();
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj8 = arrayList.get(i2);
                                i2++;
                                collection.add(((iyb) obj8).c);
                            }
                        } else {
                            collection = rs3.a;
                        }
                        int k2 = p17.k(tl1.s(list2, 10));
                        if (k2 >= 16) {
                            i6 = k2;
                        }
                        linkedHashMap = new LinkedHashMap(i6);
                        for (Object obj9 : list2) {
                            tva tvaVar3 = (tva) obj9;
                            Collection<tva> collection2 = collection;
                            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                                for (tva tvaVar4 : collection2) {
                                    if (abf.x(tvaVar4, tvaVar3)) {
                                        a6bVar = a6bVar4;
                                        linkedHashMap.put(obj9, a6bVar);
                                    }
                                }
                            }
                            a6bVar = a6bVar3;
                            linkedHashMap.put(obj9, a6bVar);
                        }
                    } else {
                        int k3 = p17.k(tl1.s(list2, 10));
                        if (k3 >= 16) {
                            i6 = k3;
                        }
                        linkedHashMap = new LinkedHashMap(i6);
                        for (Object obj10 : list2) {
                            linkedHashMap.put(obj10, zbe.F(list, min, max, (tva) obj10));
                        }
                    }
                    linkedHashMap2 = linkedHashMap;
                    return new ar4(linkedHashMap2, true, str, z);
                }
                if (i4 != i5) {
                    z2 = false;
                }
                return new ar4(map, false, str, z2);
            default:
                xt4 xt4Var = (xt4) obj5;
                aw7 aw7Var = (aw7) yyaVar3;
                aw7 aw7Var2 = (aw7) yyaVar;
                aw7 aw7Var3 = (aw7) obj4;
                aw7 aw7Var4 = (aw7) obj3;
                aw7 aw7Var5 = (aw7) obj2;
                aw7 aw7Var6 = (aw7) obj;
                Map s = o17.s(new yk8("detect_chapter_name", (String) aw7Var.getValue()), new yk8("charset", (String) ((aw7) yyaVar2).getValue()));
                String str3 = (String) aw7Var.getValue();
                switch (str3.hashCode()) {
                    case -1412728936:
                        if (str3.equals("detect_by_delimiters")) {
                            map = Collections.singletonMap("delimiters", (String) aw7Var2.getValue());
                            map.getClass();
                            break;
                        }
                        break;
                    case -991181130:
                        if (str3.equals("detect_by_characters")) {
                            map = o17.s(new yk8("characters", (String) aw7Var6.getValue()), new yk8("prefix", (String) aw7Var4.getValue()), new yk8("start", (String) aw7Var5.getValue()));
                            break;
                        }
                        break;
                    case -686754496:
                        if (str3.equals("detect_by_line")) {
                            map = o17.s(new yk8("line", (String) aw7Var3.getValue()), new yk8("prefix", (String) aw7Var4.getValue()), new yk8("start", (String) aw7Var5.getValue()));
                            break;
                        }
                        break;
                    case -175366709:
                        str2 = "detect_auto";
                        str3.equals(str2);
                        break;
                    case 190862459:
                        str2 = "detect_by_regex";
                        str3.equals(str2);
                        break;
                }
                xt4Var.invoke(o17.u(s, map));
                return pvc.a;
        }
    }
}
