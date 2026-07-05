package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py4  reason: default package */
/* loaded from: classes.dex */
public final class py4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py4(Set set, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = set;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Set set = this.c;
        switch (i) {
            case 0:
                py4 py4Var = new py4(set, m42Var, 0);
                py4Var.b = obj;
                return py4Var;
            default:
                py4 py4Var2 = new py4(set, m42Var, 1);
                py4Var2.b = obj;
                return py4Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        pv7 pv7Var = (pv7) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((py4) create(pv7Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((py4) create(pv7Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Set set = this.c;
        int i2 = 0;
        r2 = false;
        boolean z = false;
        switch (i) {
            case 0:
                hre.r(obj);
                pv7 pv7Var = (pv7) this.b;
                Set set2 = (Set) pv7Var.c(sy4.g);
                if (set2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : set2) {
                        if (!set.contains((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        pv7 g = pv7Var.g();
                        g.e(sy4.g, fca.t(set2, arrayList));
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            g.d(ny4.a(sy4.d, (String) obj3));
                        }
                        return g.h();
                    }
                    return pv7Var;
                }
                return pv7Var;
            default:
                hre.r(obj);
                Set<e49> keySet = ((pv7) this.b).a().keySet();
                ArrayList arrayList2 = new ArrayList(tl1.s(keySet, 10));
                for (e49 e49Var : keySet) {
                    arrayList2.add(e49Var.a);
                }
                if (set == xga.a) {
                    z = true;
                } else {
                    Set<String> set3 = set;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (String str : set3) {
                            if (!arrayList2.contains(str)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
