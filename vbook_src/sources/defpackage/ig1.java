package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ig1  reason: default package */
/* loaded from: classes3.dex */
public final class ig1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ng1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig1(int i, ng1 ng1Var, m42 m42Var) {
        super(2, m42Var);
        this.a = i;
        this.d = ng1Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ng1 ng1Var = this.d;
        switch (i) {
            case 0:
                ig1 ig1Var = new ig1(0, ng1Var, m42Var);
                ig1Var.c = obj;
                return ig1Var;
            default:
                ig1 ig1Var2 = new ig1(1, ng1Var, m42Var);
                ig1Var2.c = obj;
                return ig1Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((ig1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ig1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object gs9Var;
        j62 j62Var;
        Long U;
        Object e;
        Object gs9Var2;
        Object value;
        boolean z;
        Object value2;
        boolean z2;
        Collection values;
        Serializable d;
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        ng1 ng1Var = this.d;
        switch (i) {
            case 0:
                String str = ng1Var.c;
                m82 m82Var = (m82) this.c;
                int i2 = this.b;
                try {
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        e = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    if (c16.i(str, "chat")) {
                        long b = by5.a.k().b();
                        j62Var = new j62(0L, "group", "", null, "public", null, 0, 0, true, null, b, b);
                        ng1Var.n(j62Var);
                        if (!j62Var.i && !c16.i(str, "chat") && (U = r4b.U(str)) != null) {
                            long longValue = U.longValue();
                            hk1 a = jdd.a(ng1Var);
                            sw2 sw2Var = ab3.a;
                            ng1Var.f(a, ru2.c, new o0(ng1Var, longValue, null));
                            return pvcVar;
                        }
                        return pvcVar;
                    }
                    Long U2 = r4b.U(str);
                    if (U2 != null) {
                        long longValue2 = U2.longValue();
                        gf1 gf1Var = ng1Var.e;
                        this.c = null;
                        this.b = 1;
                        e = ((yf1) gf1Var).e(longValue2, this);
                        if (e == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                gs9Var = (j62) e;
                if (gs9Var instanceof gs9) {
                    gs9Var = null;
                }
                j62Var = (j62) gs9Var;
                if (j62Var == null) {
                    return pvcVar;
                }
                ng1Var.n(j62Var);
                return !j62Var.i ? pvcVar : pvcVar;
            default:
                cza czaVar = ng1Var.C;
                m82 m82Var2 = (m82) this.c;
                int i3 = this.b;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            hre.r(obj);
                            d = obj;
                        } else {
                            vs.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        hre.r(obj);
                        ng1Var.N = true;
                        m0d m0dVar = ng1Var.d;
                        String str2 = ng1Var.K;
                        int i4 = ng1Var.L;
                        this.c = null;
                        this.b = 1;
                        d = ((x0d) m0dVar).d(i4, 24, this, str2);
                        if (d == n82Var) {
                            return n82Var;
                        }
                    }
                    gs9Var2 = (List) d;
                } catch (Throwable th2) {
                    gs9Var2 = new gs9(th2);
                }
                if (!(gs9Var2 instanceof gs9)) {
                    List list = (List) gs9Var2;
                    if (list.size() == 24) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ng1Var.M = z;
                    LinkedHashMap linkedHashMap = ng1Var.O;
                    ng1Var.L++;
                    Iterable<o62> iterable = (Iterable) ng1Var.J.getValue();
                    ArrayList arrayList = new ArrayList(tl1.s(iterable, 10));
                    for (o62 o62Var : iterable) {
                        arrayList.add(o62Var.a.a);
                    }
                    Set H0 = sl1.H0(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!H0.contains(((bzc) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        bzc bzcVar = (bzc) obj3;
                        linkedHashMap.put(bzcVar.a, bzcVar);
                    }
                    if (czaVar != null) {
                        do {
                            value2 = czaVar.getValue();
                            z2 = ng1Var.M;
                            values = linkedHashMap.values();
                            values.getClass();
                        } while (!czaVar.l(value2, cg1.a((cg1) value2, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, z2, sl1.C0(values), null, null, 0, null, null, 2088763391)));
                    }
                }
                Throwable a2 = hs9.a(gs9Var2);
                if (a2 != null) {
                    a2.printStackTrace();
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, cg1.a((cg1) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 2139095039)));
                    }
                }
                ng1Var.N = false;
                return pvcVar;
        }
    }
}
